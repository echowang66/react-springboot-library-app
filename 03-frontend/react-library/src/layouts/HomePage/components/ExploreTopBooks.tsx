import { Link } from "react-router-dom";

export const ExploreTopBooks = () =>{
    return (
        <div className = 'p-5 mb-4 bg-dark header'>
            <div className = 'container-fluid y-5 text-white d-flex justify-content-center align-center'>
                <div>
                    <h1 className="display-5 fw-bold"> Find your next adventure</h1>
                    <h1 className="col-md-8 fs-4 "> Where would you like to go next?</h1>
                    <Link className="btn main-color btn-lg text-white" type="button" to="/search"> Explore Top Books </Link>
                </div>
            </div>
        </div>
    );
}