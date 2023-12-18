import React from "react";

function Template() {

    const note = (auteur, description, couleur) => {
        return (
            <div className={"Note"} style={{background: couleur}}>
                <p className={"description"}>{description}</p>
                <p className={"auteur"}>{auteur}</p>
            </div>
        );
    }


    return {note}

}

export default Template();