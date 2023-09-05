import React, { useState, useEffect } from 'react';
import Character from '../components/Character';
import "../css/CharacterPage.css"

const CharacterPage = () => {
  const [characters, setCharacters] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const charactersPerPage = 4; // Cantidad de personajes por página

  useEffect(() => {
    // Realizar la solicitud a la API aquí
    fetch(`https://rickandmortyapi.com/api/character?page=${currentPage}&count=${charactersPerPage}`)
      .then((response) => response.json())
      .then((data) => setCharacters(data.results))
      .catch((error) => console.error('Error fetching data:', error));
  }, [currentPage]);

  const handleClickNext = () => {
    setCurrentPage(currentPage + 1);
  };

  const handleClickPrev = () => {
    if (currentPage > 1) {
      setCurrentPage(currentPage - 1);
    }
  };

  return (
    <>
      <h1>Character Page</h1>
      <div className="CharacterGrid">
        {characters.map((character) => (
          <Character
            key={character.id}
            image={character.image}
            name={character.name}
            status={character.status}
            species={character.species}
            gender={character.gender}
            originUrl={character.origin.url}
          />
        ))}
      </div>
      
      <div>
        <button onClick={handleClickPrev} disabled={currentPage === 1}>
          Anterior
        </button>
        <button onClick={handleClickNext}>Siguiente</button>
      </div>
    </>
  );
};

export default CharacterPage;
