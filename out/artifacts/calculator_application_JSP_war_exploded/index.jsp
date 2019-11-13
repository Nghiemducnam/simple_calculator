
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="get" action="/calculate">
  <h1> Simple Calculator</h1>
  <table>
    <tr>
      <td>
        <p>First Operand: </p>
      </td>
      <td>
          <input type ="text" name="firstOperand"/>
      </td>
    </tr>

    <tr>
        <td><p>Operator</p></td>
        <td>
          <select name ="Operator">
          <option value = "+">Addition</option>
          <option value="-">Subtraction</option>
          <option value = "*">Multiplication</option>
          <option value ="/">Division</option>
        </select>
        </td>
     <tr>
      <td>
        <p>Second Operand:</p>
      </td>
      <td>
        <input type = "text" name ="secondOperand"/>
      </td>

     </tr>

     <tr>
       <td><input type = "submit" value="calculate"></td>
     </tr>
  </table>
  </form>
  </body>
</html>
