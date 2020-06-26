// pages/detail/detail.js
var common=require('../../utils/common.js')
Page({

  /**
   * 页面的初始数据
   */
  data: {
      artical:{},
    isAdd:false
  },
  showTimeError:function(){
    wx.showModal({
      title: '提示',
      content: '登录超时',
      success: function (res) {
        if (res.confirm) {
          wx.switchTab({
            url: '../my/my',
          })
        } else {
        }
      }
    })
  },
  showUserRightError:function(){
    wx.showModal({
      title: '提示',
      content: '没有得到用户授权',
      success: function (res) {
        if (res.confirm) {
          wx.switchTab({
            url: '../my/my',
          })
        } else {
        }
      }
    })
  },
  removeFavorate:function(){
    var that=this;
    wx.getSetting({
      success: function (res) {
        if (res.authSetting['scope.userInfo']) {
          wx.checkSession({
            success: function (res) {
              let art = that.data.artical;
              // console.log(art)
              wx.removeStorageSync(String(art.newsId));
              that.setData({
                isAdd: false
                })
              },
              fail:function(res){
                that.showTimeError();
              }
            })
        }else{
          that.showUserRightError();
        }
      }
    })
  },
  addFavorate:function(){
    var that = this;
    wx.getSetting({
      success:function(res){
        if (res.authSetting['scope.userInfo']) {
          wx.checkSession({
            success:function(res){
              let art = that.data.artical;
              wx.setStorageSync(String(art.newsId), art);
              // console.log(wx.getStorageInfoSync())
              that.setData({
                isAdd: true
                })
            },
            fail:function(res){
              that.showTimeError();
            }
          })
          }else{
            that.showUserRightError();
          }
        }
      })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let newsId = options.id;
    // console.log(newsId)
    // console.log(wx.getStorageInfoSync())
    let store = wx.getStorageSync(newsId);
    if (store!=''){
      this.setData({
        artical: store,
        isAdd:true
      })
    }else{
      this.setData({
        isAdd: false
      })
      var that=this;
      // console.log(id)
      // console.log(common.getNewsById)
      wx.request({
        url: common.getNewsById,
        data:{
          newsId: newsId
        },
        success:function(res){
          // console.log(res)
          that.setData({
            artical:res.data.data
          })
        }
      })
      // let data = common.getNewsById(id);
      // if (data.code == 200) {
      //   this.setData({
      //     artical: data.news
      //   })
      // }
    }
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