import React from 'react';

function Login() {
  return (
    <div className="p-8 max-w-md mx-auto">
      <h2 className="text-2xl font-bold mb-4">Login</h2>
      <input className="w-full p-2 border mb-4" type="email" placeholder="Email" />
      <input className="w-full p-2 border mb-4" type="password" placeholder="Password" />
      <button className="w-full bg-blue-600 text-white p-2">Login</button>
    </div>
  );
}

export default Login;
