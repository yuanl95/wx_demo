// pages/my/my.js
var common = require('../../utils/common.js')
Page({

  /**
   * 页面的初始数据
   */
  data: {
    picture:'/images/index1.png',
    nickname:'未登录',
    isLogin:false,
    num:0,
    imglist: []
  },
  showDetail: function (e) {

    let newsId = e.currentTarget.dataset.id;
    common.goToDetail(newsId);
  },
  getlogin:function(e){
    var that=this;
    wx.login({
      success: function (res) {
        let userInf = e.detail.userInfo;
        that.setData({
          picture: userInf.avatarUrl,
          nickname: userInf.nickName,
          isLogin: true
        })
        that.getMyFavorate();
       },
       fail:function(res){
         wx.showModal({
           title: '提示',
           content: '登录失败'
           })
       }
      })
  },
  getMyFavorate:function(){
    var key = wx.getStorageInfoSync().keys;
    var list=[]
    for(var i=0;i<key.length;i++){
      list.push(wx.getStorageSync(key[i]))
    }
    this.setData({
      num:key.length,
      imglist:list
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
      // wx.clearStorage();
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    if(this.data.isLogin){
      this.getMyFavorate();
    }
      
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})