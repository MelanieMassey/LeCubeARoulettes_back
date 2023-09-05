INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Customer', 1, 'melanie.m@gmail.com', 'Melanie', 'Massey', 'MADAME');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Customer', 2, 'arthur.d@gmail.com', 'Arthur', 'Dupont', 'MONSIEUR');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Admin', 3, 'alicia.j@gmail.com', 'Alicia', 'Jonquille', 'MADEMOISELLE');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Admin', 4, 'romeo.p@gmail.com', 'Romeo', 'Philippot', 'MONSIEUR');

INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `phone`, `role`, `id`) VALUES ('Toulouse', 'du Soleil', 10, 'rue', '31000', '1984-03-31', '0631313131', 'CUSTOMER', 1);
INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `phone`, `role`, `id`) VALUES ('Blagnac', 'du Paradis', 9, 'avenue', '31720', '2008-07-14', '0632323232', 'CUSTOMER', 2);

INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 3);
INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 4);
