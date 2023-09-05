import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import "../css/CharacterPage.css"

const Character = ({ key, image, name, status, species, gender, originUrl }) => {
  const [characterData, setCharacterData] = useState(null);

  useEffect(() => {
    // Realizar una solicitud GET a la API aquí
    fetch('https://rickandmortyapi.com/api/character?page=2')
      .then((response) => response.json())
      .then((data) => {
        setCharacterData(data); // Actualizar el estado con los datos de la API
      })
      .catch((error) => {
        console.error('Error al obtener los datos de la API', error);
      });
  }, []);

  // Manejador de eventos para el enlace "Origin"
  const handleOriginClick = () => {
    // Redirigir a "OriginPage" y pasar los datos JSON como estado
    history.push({
      pathname: '/origin',
      state: { characterData },
    });
  };

  return (
    <div className='CharacterContainer'>
      {characterData ? (
        <>
          <img src={image} alt={name} />
          <h2>{name}</h2>
          <p>Status: {status}</p>
          <p>Species: {species}</p>
          <p>Gender: {gender}</p>
          <Link to={originUrl} onClick={handleOriginClick}>Origin</Link>
        </>
      ) : (
        <p>Cargando datos del personaje...</p>
      )}
    </div>
  );
};

export default Character;
