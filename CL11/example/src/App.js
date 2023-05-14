import './App.css';

const items = [
  {id: 1, name: "Item 1"},
  {id: 2, name: "Item 2"},
  {id: 3, name: "Item 3"}
];

function MyList() {
  const listItems = items.map(item => 
    <li>
      <a className="link" href={item.id}>{item.name}</a>
    </li>
  );

  return(
    <ul>{listItems}</ul>
  );
}

function MyButton() {

  function handleClick() {
    alert("You clicked on the button");
  }

  return (
    <button className="button" onClick={handleClick}>Click me</button>
  );
}

export default function App() {
  return(
    <div className="main">
      <h1>This is my first App</h1>
      <MyButton/>
      <MyList/>
    </div>
  );
}
