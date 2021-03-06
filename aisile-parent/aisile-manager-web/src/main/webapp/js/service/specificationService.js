//封装所有连接后端代码    需要$http
app.service('specificationService',function($http){
	//查询全部的数据
	this.findAll = function(){
		return $http.get('../specification/findAll.do');
	}
	//分页
	this.findPage = function(page,rows){
		return $http.get('../specification/findPage.do?page='+page+"&rows="+rows);
	}
	//分页带数据查询
	this.findSearch = function(page,rows,searchEntity){
		return $http.post('../specification/findSearch.do?page='+page+"&rows="+rows,searchEntity);
	}
	//修改
	this.update = function(entity){
		return $http.post('../specification/update.do',entity);
	}
	//添加
	this.add = function(entity){
		return $http.post('../specification/add.do',entity);
	}
	//根据id查询对象
	this.findOne = function(id){
		return $http.post('../specification/findOne.do?id='+id);
	}
	//删除
	this.dele = function(selectIds){
		return $http.get('../specification/dele.do?ids='+selectIds);
	}
	//规格名称的下拉框
	this.selectOptionList = function(){
		return $http.get('../specification/selectOptionList.do');

	}
})