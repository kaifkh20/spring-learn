/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kaifsaif
 * Created: 2 Nov 2025
 */

create table users
(
    id serial primary key,
    name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null
);

create table addresses(
    id serial primary key,
    street varchar(255) not null,
    country varchar(50) not null,
    user_id serial not null references users(id)

);