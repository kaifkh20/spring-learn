/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kaifsaif
 * Created: 16 Nov 2025
 */

create table wishlists(
    user_id serial not null references users(id),
    product_id serial not null references products(id)
);

