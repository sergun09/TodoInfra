import './App.css';
import React, {useEffect, useState} from "react";
import Note from "./components/Note/Note";
import Service from "./Service";
import Tableau from "./components/Tableau/Tableau";

function App() {

    //state
    const [notes, setNotes] = useState([]);
    const [isMounted, setIsMounted] = useState(false);
    //behavior
    useEffect(() => {
        if (!isMounted) {
            updateData();
        }
    }, [isMounted]);
    const updateData = () => {

        Service.retrieveData().then(response => {
            setNotes(response);
            setIsMounted(true)
        })

    }

    const insertData = (data) =>{
        Service.commitData(data).then(
            ()=> updateData()
        )
    }

    //render
    return (
        <div className={"App"}>
            <h1 className={"nomApp"}>APP NOTE</h1>

            <div className={"container"}>
                {notes.map((note) => (
                    <Note key={note.id} noteInfo={note} readOnly={true}/>
                ))}
            </div>
            <Tableau
                name={"+"}
                component={
                    <Note readOnly={false} ajouterNote = {insertData}/>
                }
                className={"createNote"}
            />
        </div>
    );
}

export default App;