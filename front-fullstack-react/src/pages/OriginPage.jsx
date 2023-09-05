import React, { useState, useEffect } from 'react';
import "../css/CharacterPage.css";
import { useParams } from 'react-router-dom';

const OriginPage = () => {
  const { id } = useParams(); // Obtiene la ID del parámetro de la URL

  const [locationData, setLocationData] = useState(null);

  useEffect(() => {
    // Realizar una solicitud GET a la URL de la ubicación
    fetch(`https://rickandmortyapi.com/api/location/${id}`)
      .then((response) => response.json())
      .then((data) => {
        setLocationData(data); // Actualizar el estado con los datos de la ubicación
      })
      .catch((error) => {
        console.error('Error al obtener los datos de la ubicación', error);
      });
  }, [id]); // La dependencia ahora es la ID de la ubicación

  return (
    <div className='CharacterContainer'>
      {locationData ? (
        <>
          <h2>{locationData.name}</h2>
          <p>Type: {locationData.type}</p>
          <p>Dimension: {locationData.dimension}</p>
          <h3>Residents:</h3>
          <ul>
            {locationData.residents.map((resident, index) => (
              <li key={index}>
                {resident}
              </li>
            ))}
          </ul>
        </>
      ) : (
        <p>Cargando datos de la ubicación...</p>
      )}
    </div>
  );
};

export default OriginPage;
