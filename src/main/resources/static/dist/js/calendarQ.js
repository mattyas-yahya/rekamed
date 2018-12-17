/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



	$(document).ready(function() 
        {
        $('#calendar').fullCalendar({
            header: {
        left: 'prev,next today',
        center: 'title',
        right: 'month,basicWeek,basicDay'
      },
           navLinks: true, // can click day/week names to navigate views
      editable: true,
      eventLimit: true,
            events: "../jadwal_All"
        });
 
    });

