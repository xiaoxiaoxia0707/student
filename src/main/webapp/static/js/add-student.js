/**
 * @decription:添加案例
 *  @param：#submit 提交
 */

$("#saveBtn").click(function() {
    addStudent();
});

function addStudent(){
   $.ajax({
        type: "POST",
        dataType: "json",
        url: "rest/student/add",
        data: {
            StudentName: $("#name").val(),
            StudentAddress: $("#address").val(),
            StudentSex: $("#sex").val()
        },
        success: function(data) {
          window.location.href="rest/student/student";  //跳转到列表页面
        }

    }); 
}
