# Spring-Contact-Book

A simple contact book application.

## Learn Target

How to create a ReST-API application using Spring-Boot Framework.
    
    Spring-Boot
    Spring-Web
    Spring-Data

## Configuration

#### Database

    MySQL
    Username: tutorial
    Password: password
    Database: contact
    
Hibernate generates database tables automatically by run this application and deletes table by terminate this application.
    
#### Server

    Port: 8300
    
#### Edit Default Configuration

Find application.yml in resources folder and edit configuration in this file.

## API

    contacts:       {host:port}/contacts
    contact by id:  {host:port}/contacts/{id}
    save contact:   {host:port}/contacts/save
    delete contact: {host:port}/contacts/{id}/delete
    
## JSON

Data folder contains a sample JSON-file to save contact.
    