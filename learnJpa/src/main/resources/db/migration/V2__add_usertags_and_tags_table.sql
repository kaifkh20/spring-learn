/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kaifsaif
 * Created: 2 Nov 2025
 */

create table tags(
    id serial primary key not null,
    name varchar(255) not null

);

create table user_tags(
    user_id serial not null references users(id),
    tag_id serial not null references tags(id)
);