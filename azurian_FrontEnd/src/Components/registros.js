import React from 'react';
import {List, 
        Filter, 
        Datagrid, 
        Create, 
        TextField, 
        SimpleForm, 
        Edit, 
        TextInput,
        Show,
        SimpleShowLayout,
        ReferenceField,
        NumberField,
        SelectInput,
        ReferenceInput,
        DateField,
        NumberInput,
        DateTimeInput,
        DateInput
        } from 'react-admin';



export const RegistroList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <NumberField source="valor" />
            <TextField source="nombre" />
        </Datagrid>
    </List>
);


export const RegistroEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <NumberInput source="valor" />
            <TextInput source="nombre" />
        </SimpleForm>
    </Edit>
);

export const RgistroCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="nombre" />
            <NumberInput source="valor" />
        </SimpleForm>
    </Create>
);