import React from 'react';

function Register() {
  return (
    <div className="p-8 max-w-md mx-auto">
      <h2 className="text-2xl font-bold mb-4">Register</h2>
      <input className="w-full p-2 border mb-4" type="text" placeholder="Username" />
      <input className="w-full p-2 border mb-4" type="email" placeholder="Email" />
      <input className="w-full p-2 border mb-4" type="password" placeholder="Password" />
      <button className="w-full bg-green-600 text-white p-2">Register</button>
    </div>
  );
}

export default Register;
