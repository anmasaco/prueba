import React, { useState, useEffect } from 'react';
import Character from '../components/Character'; // Ajusta la ruta según la ubicación de tu archivo Character.jsx

const CharacterPage = () => {
  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    // Realizar la solicitud a la API aquí
    fetch('https://rickandmortyapi.com/api/character')
      .then((response) => response.json())
      .then((data) => setCharacters(data.results))
      .catch((error) => console.error('Error fetching data:', error));
  }, []); // El segundo argumento vacío [] asegura que se ejecute solo una vez al cargar la página

  return (
    <>
      <h1>Character Page</h1>
      {characters.map((character) => (
        <Character
          key={character.id}
          image={character.image}
          name={character.name}
          status={character.status}
          species={character.species}
          gender={character.gender}
          originUrl={character.origin.url} // Ajusta la propiedad adecuadamente
        />
      ))}
    </>
  );
};

export default CharacterPage;
