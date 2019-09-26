// in src/App.js
import React from 'react';

import { Admin, Resource, ListGuesser,fetchUtils, EditGuesser } from 'react-admin';
import jsonServerProvider from 'ra-data-json-server';
import simpleRestProvider from 'ra-data-simple-rest';


import {RegistroList,RegistroEdit,RgistroCreate} from './Components/registros'



const dataProvider = simpleRestProvider('http://localhost:8080');
const dataProvider2 = jsonServerProvider('http://localhost:8080');

const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="registros" list={RegistroList} edit={RegistroEdit} create={RgistroCreate} />
    </Admin>
);

export default App;