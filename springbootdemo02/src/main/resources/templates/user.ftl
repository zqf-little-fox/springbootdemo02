<html>
<head>
    <title>显示用户信息</title>
</head>
<body>
    <table border="1px">
        <thead>
            <tr>
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
            </tr>
        </thead>
        <tbody>
        <#list userList as user>
            <tr>
                <td>${user.uid}</td>
                <td>${user.uname}</td>
                <td>${user.pwd}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</body>
</html>