import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios'

const row = {
  display: "flex",
  flexFlow: "row wrap",
  alignItems: "center",
  justifyContent: "center",
}

const column = {
  display: "flex",
  flexFlow: "column nowrap",
  alignItems: "center",
  justifyContent: "center",
}

const cell = {
  marginLeft: "10px",
  width: "300px",
}

class App extends Component {
  constructor() {
    super()
    this.state = {
      employees: []
    }
  }

  componentDidMount() {
    // need env var for url in dev vs production?
    const url = '/api/employees'
    const self = this
    axios.get(url, {
      // params: {
      //   id: id
      // }
    }).then(res => {
      console.log('get employees action res.data');
      console.log(res.data);
      self.setState({
        employees: res.data
      })

    }).catch(function (error) {
      console.log('error get employees : ');
      console.log(error);
    });
  }
  render() {
    const employees = this.state.employees.map((employee, i) =>
      <div style={row} key={i.toString()}>
        <div style={cell}>{employee.firstName}</div>
        <div style={cell}>{employee.lastName}</div>
        <div style={cell}>{employee.email}</div>
      </div>
    )

    return (
      <div className="App">
        <header className="App-header">
          <div style={column}>
            <div style={row}>
              <div style={cell}>First name</div>
              <div style={cell}>Last name</div>
              <div style={cell}>Email</div>
            </div>
            {employees}
          </div>
        </header>
      </div>
    );
  }
}

export default App;
