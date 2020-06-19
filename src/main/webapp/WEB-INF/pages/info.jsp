<%-- 
    Document   : info
    Created on : 2019-10-20, 19:29:37
    Author     : V
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Info</title>
        <link href="/css/main2.css" rel="stylesheet" type="text/css">
        <style>
            .info-tb{ width:300px; color:#eeeeee; float:left; margin-left:25px;}
            .info-tb td{ padding-left:10px; height:44px;vertical-align:middle; border-bottom:1px solid #999999; border-top:1px solid #999999;}
            .info-tb-t{ width:130px; border-right:1px solid #999999;}
        </style>
    </head>
    <script type="text/javascript">
        var dealers;
        window.onload = function(){
            dealers = [
            ["Shanghai_dealer"],
            ["Suzhou_dealer","Nanjing_dealer"],
            ["Hangzhou_dealer","Jinhua_dealer","Wenzhou_dealer"],
            ["Jinan_dealer","Qingdao_dealer"],
            ["Jinjiang_dealer"],
            ["Hefei_dealer"],
            ["Foshan_dealer","Guangzhou_dealer"],
            ["Nanning_dealer"],
            ["Haikou_dealer"],
            ["Luoyang_dealer","Zhenzhou_dealer"],
            ["Changsha_dealer"],
            ["Wuhan_dealer"],
            ["Nanchang_dealer"],
            ["Beijing_dealer"],
            ["Taiyuan_dealer","Changzhi_dealer"],
            ["Lanzhou_dealer"],
            ["Wulumuqi_dealer"],
            ["Xi'an_dealer"],
            ["Baotou_dealer"],
            ["Chengdu_dealer"],
            ["Chongqi_dealer"],
            ["Kunming_dealer"],
            ["Guiyang_dealer"],
            ["Lasa_dealer"],
            ["Shenyang_dealer"],
            ];
        }
        function chg(){
            var sel1 = document.getElementById("province");
            var n = sel1.value;
            var p_dealers = dealers[n];
            var sel2 = document.getElementById("city");
            sel2.innerHTML = "<option>SELECT</option>"
            if (p_dealers) {
            for (var i = 0; i < p_dealers.length; i++) {
              var newopt = document.createElement("option");
              newopt.innerHTML = p_dealers[i]
              sel2.appendChild(newopt);
            }
            }
        }
        function checkSele(form){
            if(form.dealerName.value == "SELECT"||form.dealerName.value == ""){
                alert("Dealer is Empty! Please Select!");
                return false;
            }
        }
    </script>
    <body id="modelpage3" class="osWin" ondragstart="return false">
        <div class="container">
            <header id="header">
                <div id="khilogo"><img src="/img/kawasaki_logo.gif" alt="Kawasaki"></div>
                <div id="btn-home"><a href="/index.html"><img src="/img/home.gif" width="86" height="21" alt="HOME" class="Hover"></a></div>
            </header>
            <form action="findFromDealer" onsubmit="return checkSele(this);">
                <div class="content">
                    <article>
                        <h1 class="model-name" style="margin-top: 40px;">${motor.name}</h1>
                        <article class="concept" style="height:450px;">
                            <section>
                                <img id="model-image" src="${motor.photo}" width="1000" height="450">
                            </section>
                            <section class="conceptBlock2" style="margin-top: 40px;">
                                <h2 id="subtitle">${motor.subtitle}</h2>
                                <p id="content" style="font-size: 1em;">${motor.content}</p>
                            </section>
                        </article>
                        <div id="modelspec">
                            <table class="info-tb">
                                <tbody>
                                <tr>
                                    <td class="info-tb-t">Name</td>
                                    <td>${motor.name}</td>
                                </tr>
                                <tr>
                                    <td class="info-tb-t">Model</td>
                                    <td>${motor.model}</td>
                                </tr>
                                <tr>
                                    <td class="info-tb-t">Wet (kg)</td>
                                    <td>${motor.wet}</td>
                                </tr>
                            </tbody>
                            </table>
                        <table class="info-tb">
                            <tbody>
                                <tr>
                                    <td class="info-tb-t">Fuel Tank Capacity (L)</td>
                                    <td>${motor.capacity}</td>
                                </tr>
                                <tr>
                                    <td class="info-tb-t">Height of Seat (mm)</td>
                                    <td>${motor.seat}</td>
                                </tr>
                                <tr>
                                    <td class="info-tb-t">Suggested Retail Price (¥)</td>
                                    <td>${motor.price}</td>
                                </tr>
                              </tbody>
                            </table>
                        <table class="info-tb">
                            <tbody>
                                <tr>
                                    <td colspan="2"><span>PROVINCE <label style="color:#ffffff;">*</label></span>
                                        <select onchange="chg();" id="province" name="province">
                                            <option value="0">Shanghai</option>
                                            <option value="1">Jiangsu</option>
                                            <option value="2">Zhejiang</option>
                                            <option value="3">Shandong</option>
                                            <option value="4">Fujian</option>
                                            <option value="5">Anhui</option>
                                            <option value="6">Guangdong</option>
                                            <option value="7">Guangxi</option>
                                            <option value="8">Hainan</option>
                                            <option value="9">Henan</option>
                                            <option value="10">Hunan</option>
                                            <option value="11">Hubei</option>
                                            <option value="12">Jiangxi</option>
                                            <option value="13">Beijing</option>
                                            <option value="14">Shanxi</option>
                                            <option value="15">Gansu</option>
                                            <option value="16">Xinjiang</option>
                                            <option value="17">Shanxi</option>
                                            <option value="18">Neimenggu</option>
                                            <option value="19">Sichuan</option>
                                            <option value="20">Chongqing</option>
                                            <option value="21">Yunnan</option>
                                            <option value="22">Guizhou</option>
                                            <option value="23">Xizang</option>
                                            <option value="24">Liaoning</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <span>DEALER <label style="color:#ffffff;">*</label></span>
                                        <select name="dealerName" id="city">
                                            <option value="">SELECT</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <div class="but">
                                            <input id="but" type="submit" value="CHECK BALANCE">
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        </div>
                    </article>
                </form>
        </div>
    </body>
</html>
