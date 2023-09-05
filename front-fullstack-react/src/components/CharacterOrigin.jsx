import React from 'react';
import "../css/CharacterPage.css"

const CharacterOrigin = ({
    image, 
    name, 
    nameDimension,
    type,
    dimension,
}) => {

    return ( 
        <div className="card" style={{width: '18rem', margin: '20px'}}>
            <img src={image} className="card-img-top" alt="..."/>
            <div className="card-body">
                <h5 className="card-title">{name}</h5>
                <p className="card-text">Dimension: {nameDimension}  </p>
                <p className="card-text">Type: {type}  </p>
                <p className="card-text">Dimension: {dimension}  </p>
            </div>
        </div>
     );
}
 
export default CharacterOrigin;
