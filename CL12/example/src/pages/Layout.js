import { Outlet, Link } from 'react-router-dom';
import '../App.css';

function MyLayout() {
    return (
        <>
        <nav>
            <ul>
                <li><Link className='link' to="/">Home</Link></li>
                <li><Link className='link' to="/blogs">Blogs</Link></li>
                <li><Link className='link' to="/contact">Contact</Link></li>
                <li><Link className='link' to="/other">Other</Link></li>
            </ul>
        </nav>
        <Outlet/>
        </>
    );
}

export default MyLayout;