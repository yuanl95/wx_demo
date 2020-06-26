// pages/index/index.js
var common =require('../../utils/common.js')
var currentPages=1;
var isEndPages=false;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    imglist:[],
    loadMoreText:"加载更多",
    isLoad:false,
    showBtn:false
  },
  //获取指定页数的新闻类表
  getNewsByPages:function(pages){
    var that=this;
    wx.request({
      url: common.getNewsList,
      data:{
        pageNum:pages
      },
      success:function(res){
        //获取新闻总页数
        let totalPages=res.data.data.totalPages;
        //追加更多新闻
        let list = that.data.imglist.concat(res.data.data.pageInfo.list);
        // console.log(list)
        that.setData({
          imglist:list
        })
        if (res.data.data.isLastPage){
          isEndPages=false;
          that.setData({
            loadMoreText:'已无更多',
            showBtn:true
          })

        }else{
          currentPages++;
        }
      }
    })
  },
  loadMoreContent:function(){
    if (!isEndPages && !this.data.isLoad){
         this.setData({
           isLoad:true
         })
    }
    setTimeout(()=>{
      this.getNewsByPages(currentPages);
      this.setData({
        isLoad: false
      })
    },200)
  },
  showDetail:function(e){

    let newsId = e.currentTarget.dataset.id;
    common.goToDetail(newsId);
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getNewsByPages(1);
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