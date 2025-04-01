-- Insertar datos en la tabla autores
INSERT INTO autores (codigo, nombre, nacionalidad) VALUES
('A001', 'Gabriel García Márquez', 'Colombiana'),
('A002', 'Isabel Allende', 'Chilena'),
('A003', 'Mario Vargas Llosa', 'Peruana');
-- Insertar datos en la tabla categorias
INSERT INTO categorias (nombre, descripcion) VALUES
('Novela', 'Libros de ficción que narran una historia imaginaria.'),
('Poesía', 'Colección de poemas y versos.'),
('Ensayo', 'Escritos que analizan y reflexionan sobre diversos temas.');
-- Insertar datos en la tabla libros
INSERT INTO libros (isbn, nombre, numero_de_paginas, annio, codigo_autor, id_categoria) VALUES
('978-3-16-148410-0', 'Cien Años de Soledad', 417, 1967, 'A001', 1),
('978-0-06-088328-7', 'El Amor en los Tiempos del Cólera', 348, 1985, 'A001', 1),
('978-0-553-21311-3', 'La Casa de los Espíritus', 481, 1982, 'A002', 1),
('978-0-06-092721-9', 'Paula', 330, 1994, 'A002', 1),
('978-0-14-026956-3', 'La Ciudad y los Perros', 409, 1963, 'A003', 1),
('978-0-312-42215-1', 'La Fiesta del Chivo', 404, 2000, 'A003', 1);
