/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kaifsaif
 * Created: 2 Nov 2025
 */

CREATE TABLE profiles (
    id SERIAL NOT NULL PRIMARY KEY,
    bio VARCHAR(255),
    phone_number INTEGER NOT NULL UNIQUE,
    date_of_birth DATE NOT NULL,
    loyalty_points INTEGER NOT NULL CHECK(loyalty_points >= 0) DEFAULT 0
);
