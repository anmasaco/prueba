import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';

import {
  createBrowserRouter,
  RouterProvider,
  Route
} from 'react-router-dom'; // Importa Route

import CharacterPage from './pages/CharacterPage';
import OriginPage from './pages/OriginPage';

const router = createBrowserRouter([
  {
    path: '/',
    element: <CharacterPage />
  },
  {
    path: '/origin/:id', // Agrega una ruta dinámica para Origin que captura la ID del personaje
    element: <OriginPage />
  }
]);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);

reportWebVitals();
