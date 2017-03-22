/**查询全部用户**/
function queryUser() {
    $.ajax({
        type: "POST",
        url: "",
        dataType: "json",
        success: function(data) {
            var userList = data.userList;
            if (userList.lenght == 0) {
                $("#show_list").html("暂时查不到您要的数据！");
            } else {
                var userListHtml = "<tr><th><input id='checked-all' type='checkbox'><label>全选</label></th><th>姓&nbsp;&nbsp;名</th><th>地&nbsp;&nbsp;址</th><th>性&nbsp;&nbsp;别</th></tr>";
                $.each(userList, function(i, n) {
                    i += 1;
                    userListHtml = userListHtml + "<tr><td class='list-id'><input type='checkbox'><label>" 
                    + i + "</label></td><td><span>" 
                    + n.name + "</span><input type='text' class='e_name'></td><td><span>"
                    + n.address + "</span><input type='text'  class='e_address'></td><td><span>"
                    + n.sex + "</span><input type='text'  class='e_sex' ></td><td class='user-edit'><a  class='editBtn' href="">编辑</a><a class='deleteBtn'  data-id='"
                    + n.id+"'>删除</a></td></tr>";
                });
                $("#show_list").html(user.html);
                $(".deleteBtn").click(function() {
                    delUser($(this).attr("data-id"));
                });
                $(".editBtn").click(function() {
                    update($(this).attr("data-id"));
                }

            }
        }
    });
}

/**
 * @decription:添加案例
 *  @param：#submit 提交
 */

$("#saveBtn").click(function() {
    add();
});

function add(){
   $.ajax({
        type: "POST",
        dataType: "json",
        url: "",
        data: {
            name: $("#name").val(),
            address: $("#address").val(),
            sex: $("#sex").val()
        },
        success: function(data) {
            queryUser();
        }

    }); 
}

/**
 * @decription:删除案例
 */
function delUser(id) {
    var param = "id=" + id;
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "",
        data: param,
        success: function() {
            queryUser();
        }
    });
}

/** 
 * @decription:更新案例
 */
function update(id) {
    window.location.href=""+"?id="+id;
}
