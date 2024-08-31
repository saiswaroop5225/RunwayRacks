import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser, faHeart, faShoppingBag } from '@fortawesome/free-solid-svg-icons';
import './NavBar.css';

function NavBar() {
  return (
    <div className="navbar-container">
      <nav className="navbar navbar-expand-lg bg-body-tertiary">
        <div className="container-fluid">
          <a className="navbar-brand roboto-bold" href="#">RunWay Racks</a>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link active" aria-current="page" href="#">MEN</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">WOMEN</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">KIDS</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">STYLES</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">TRENDING</a>
              </li>
            </ul>
            <form className="d-flex" role="search">
                <input className="form-control " type="search" placeholder="Search for products,brands and more" aria-label="Search"/>
            </form>
            <div className="navbar-icons">
            <a className="nav-link" href="#">
              <div className="icon-text">
                <FontAwesomeIcon icon={faUser} />
                <span>Profile</span>
              </div>
            </a>
            <a className="nav-link" href="#">
              <div className="icon-text">
                <FontAwesomeIcon icon={faHeart} />
                <span>Wishlist</span>
              </div>
            </a>
            <a className="nav-link" href="#">
              <div className="icon-text">
                <FontAwesomeIcon icon={faShoppingBag} />
                <span>Bag</span>
              </div>
            </a>
          </div>
          </div>
        </div>
      </nav>
    </div>
  );
}

export default NavBar;
