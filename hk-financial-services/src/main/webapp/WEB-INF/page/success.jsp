<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="keywords" content="互联网金融,鸿坤金服-一站式资产配置平台,网络借贷,投资理财,企业融资,个人理财,固定收益,高收益理财,鸿坤金服">
    <meta name="description" content="鸿坤金服，投资您熟悉的人和事，信用等级AA级的互联网金融平台，中国互联网协会互联网金融专委会成员单位，获得2015年度中国互联网金融创新奖。">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=1200,user-scalable=yes">
    <link href="../logo.ico" rel="shortcut icon" type="image/x-icon">
    <title>鸿坤金服——鸿坤控股成员企业，一站式资产配置平台</title>
    <!-- bootstrap css -->
    <link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.min.css">
    <!-- invest css -->
    <link rel="stylesheet" type="text/css" href="../src/css/register.css" />
    <!-- iconfont css -->
    <link rel="stylesheet" type="text/css" href="../src/fonts/iconfont.css">
</head>

<body>
    <!-- 头部开始 -->
    <div class="include" file="../common/header.html"></div>
    <!-- 头部结束 -->
    <!-- 操作成功页面 -->
    <div style="background: #fff;box-shadow: inset 0px 3px 10px #ddd;">
        <div class="container">
            <div class="reg_con">
                <div class="q_suc">
                    <span id="resSuc" style="display: none"><img src="../src/img/account/dh_img.png" width="43" height="46" /></span>
                    <span id="resErr" style="display: none"><img src="../src/img/account/error_img.gif" width="43" height="46" /></span>
                    <span class="pl-10" id="resMsg">${message}</span>
                </div>
                <div class="suc_p">倒数<span class="colr-org" id="countDown">3</span>秒后自动跳转至我的账户首页</div>
                <div class="reg_btn"><a id="btn_sub" class="btn_sub" style="margin:0 auto;margin-top:40px;" href="../account/actIndex.html">返回至我的账户首页</a></div>
            </div>
        </div>
    </div>
    <!-- 底部开始 -->
    <div class="include" file="../common/footer.html"></div>
    <!-- 底部结束 -->
</body>
<!-- 公共js -->
<script type="text/javascript" src="../lib/collectionJs.js"></script>

<script>
    $(function(){
    	var state = '${state}';
        if(state == CONSTANTS.SUCCESS){
            $("#resSuc").show();
        }else{
            $("#resErr").show();
        }
        $("#resMsg").text('${message}');
        var target = commonUtil.getRequestUrl("account/actIndex.html");
        var btnText = "返回至我的账户首页";
        $("#btn_sub").attr("href", target);
        $("#btn_sub").text(btnText);
        commonUtil.countDown(target);
    });
</script>
</html>