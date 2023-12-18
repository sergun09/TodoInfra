import React, {useState} from 'react';
import './Note.css';
import Template from "../../Template";

function Note({noteInfo = undefined, readOnly, ajouterNote = () => {}}) {
    //state

    const [input, setInput] = useState({
        auteur: "",
        description: ""
    })
    //behavior

    //render

    if (readOnly) {
        return (
            <div>
                {Template.note(
                    noteInfo.auteur,
                    noteInfo.description,
                    noteInfo.couleur
                )}
            </div>
        );
    } else {
        return (
            <div className={"Note"}>
                <textarea className={"description champ"}
                          minLength={10}
                          value={input.description}
                          placeholder={"Description"}
                          onChange={
                              event => {
                                  setInput({
                                      ...input,
                                      description: event.target.value
                                  });
                              }}
                />
                <input className={"auteur champ"}
                       placeholder={"Auteur"}
                       onChange={
                           event => {
                               setInput({
                                   ...input,
                                   auteur: event.target.value
                               });
                           }}
                       type={"text"}
                       value={input.auteur}
                       minLength={3}/>
                <button className={"ajouter"} onClick={() => {
                    const data = input
                    ajouterNote(data);
                    setInput({
                        auteur: "",
                        description: ""
                    })

                }}>Ajouter</button>
            </div>
        );
    }
}

export default Note;

