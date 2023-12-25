
function Service() {
    const apiURI = "http://localhost:8080/api"
    const retrieveData = () => {
        return fetch(apiURI + "/posts", {method: "GET"})
            .then(res => res.json());

    }

    const commitData = (data) =>{
        return fetch(apiURI + "/posts", {
            method: "POST",
            body: JSON.stringify(data),
            headers : {
                "Content-Type": "application/json",
                "Accept": "application/json"
            }
        }).then(res => res.json())
    }
    const updateData = (id, data) =>{
        return fetch(apiURI + "/posts/"+id, {
            method: "PUT",
            body: JSON.stringify(data),
            headers : {
                "Content-Type": "application/json",
                "Accept": "application/json"
            }
        }).then(res => res.json())
    }

    const deleteData = (id) =>{
        return fetch(apiURI + "/posts/"+id, {
            method: "DELETE",
            headers : {
                "Content-Type": "application/json",
            }
        })
    }

    return {
        retrieveData,commitData,updateData, deleteData
    }
}

export default Service();