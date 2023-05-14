import { useState } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { ReactDOM } from 'react-dom/client';
import Layout from './pages/Layout';
import Home from './pages/Home';
import Blogs from './pages/Blogs';
import Contact from './pages/Contact';
import NoPage from './pages/NoPage';
import './App.css';

function MyForm() {

  const [name, setName] = useState("");

  function showName() {
    alert("Hello, " + name + ". Welcome!");
  }

  return (
    <form onSubmit={showName}>
      <label>
        Name <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
      </label>
      <input type="submit" value="Show" />
    </form>
  );
}

export default function App() {
  return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Layout/>}>
            <Route index element={<Home/>} />
            <Route path="blogs" element={<Blogs/>} />
            <Route path="contact" element={<Contact/>} />
            <Route path="*" element={<NoPage/>} />
          </Route>
        </Routes>
      </BrowserRouter>
  );
}
