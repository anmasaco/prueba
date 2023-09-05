import React, { useState, useEffect } from 'react';

const Character = ({ image, name, status, species, gender, originUrl }) => {
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
  }, []); // La dependencia vacía asegura que esto solo se ejecute una vez al montar el componente

  return (
    <div>
      {characterData ? (
        <>
          <img src={image} alt={name} />
          <h2>{name}</h2>
          <p>Status: {status}</p>
          <p>Species: {species}</p>
          <p>Gender: {gender}</p>
          <a href={originUrl}>Origin</a>
        </>
      ) : (
        <p>Cargando datos del personaje...</p>
      )}
    </div>
  );
};

export default Character;
