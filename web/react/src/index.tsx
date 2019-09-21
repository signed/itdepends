import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

const webSocket = new WebSocket('ws://localhost:8999', []);
console.log(`webSocket.readyState: ${webSocket.readyState}`);
webSocket.onopen = (event) => {
    console.log(`open: ${JSON.stringify(event, null, 2)}`);
    webSocket.send('hello backend');
};
webSocket.onerror = (event: Event) => {
    console.log(`onerror: ${JSON.stringify(event, null, 2)}`);
};
webSocket.onmessage = (event: MessageEvent) => {
    console.log(`onmessage: ${JSON.stringify(event, null, 2)}`);
    console.log(event.data);
};
webSocket.onclose = (event) => {
    console.log(`onclose: ${JSON.stringify(event, null, 2)}`);
};

ReactDOM.render(<App/>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
