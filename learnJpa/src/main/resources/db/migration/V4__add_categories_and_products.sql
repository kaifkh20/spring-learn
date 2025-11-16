/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kaifsaif
 * Created: 16 Nov 2025
 */

create table categories(
    id SERIAL not null primary key,
    name varchar(255) not null
);

create table products(
    id SERIAL not null primary key,
    name varchar(255) not null,
    price decimal(10,2) not null,
    category_id SERIAL not null references categories(id)
);