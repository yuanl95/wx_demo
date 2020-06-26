
var getNewsList ="http://192.168.3.1:8080/news/getNewsList";
var getNewsByNewsId ="http://192.168.3.1:8080/news/getNewsByNewsId"
//跳转到id页面
function goToDetail(id){
  wx.navigateTo({
    url: '../detail/detail?id='+id,
  })
}

module.exports={
  getNewsList: getNewsList,
  getNewsById: getNewsByNewsId,
  goToDetail: goToDetail
}