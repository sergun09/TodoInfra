
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
    return {
        retrieveData,commitData
    }
}



export default Service();