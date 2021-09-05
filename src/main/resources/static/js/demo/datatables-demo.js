// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#dataTable').DataTable();
});

async function cargarUsuarios(){
    const rawResponse = await fetch('http://localhost:8080/current_user/11', {
      method: "GET",
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
     // body: JSON.stringify({
     //   name: myName,
     //   password: myPassword
     // })
    });
    const user = await rawResponse.json();


    const usersResponse = await fetch('http://localhost:8080/list_users', {
      method: "GET",
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
     // body: JSON.stringify({
     //   name: myName,
     //   password: myPassword
     // })
    });
    const users = await usersResponse.json();

    let result = '';
    for(let userOnly of users){
        let userData = '<tr><td>' + userOnly.id + '</td><td>' + userOnly.name +'</td><td>' + userOnly.email +'</td><td>' + userOnly.password + '</td> <td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
        result += userData
    }

    document.querySelector('#dataTable tbody').innerHTML = result;

}