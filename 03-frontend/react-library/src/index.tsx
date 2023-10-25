import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import { App } from "./App";
import { BrowserRouter } from "react-router-dom";
import { loadStripe } from "@stripe/stripe-js";
import { Elements } from "@stripe/react-stripe-js";

const stripePromise = loadStripe(
  'pk_test_51O4shRAZE8EuCYrBcbjsT7Ne7LHRDl0Xh5n3GwrOQTRBxeOny5knxnyICibh3t6vPMPwAfKlHkiDiZk8TZuVyHw200TzPv3ETt'
);

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <BrowserRouter>
    <Elements stripe={stripePromise}>
      <App />
    </Elements>
  </BrowserRouter>
);
