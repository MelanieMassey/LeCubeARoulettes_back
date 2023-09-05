INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Customer', 1, 'melanie.m@gmail.com', 'Melanie', 'Massey', 'MADAME');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Customer', 2, 'arthur.d@gmail.com', 'Arthur', 'Dupont', 'MONSIEUR');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Admin', 3, 'alicia.j@gmail.com', 'Alicia', 'Jonquille', 'MADEMOISELLE');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Admin', 4, 'romeo.p@gmail.com', 'Romeo', 'Philippot', 'MONSIEUR');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('EventLeader', 8, 'laura.m@gmail.com', 'Laura', 'Michelet', 'MADEMOISELLE');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('EventLeader', 9, 'lorene.l@gmail.com', 'Lorene', 'Lebonnec', 'MADEMOISELLE');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('EventLeader', 10, 'xavier.c@gmail.com', 'Xavier', 'Caroulle', 'MONSIEUR');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('EventLeader', 11, 'celine.m@gmail.com', 'Céline', 'Mangeant', 'MADAME');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Attendee', 12, 'elisabeth.w@gmail.com', 'Marius', 'Weil', 'MONSIEUR');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Attendee', 13, 'elisabeth.w@gmail.com', 'Aria', 'Weil', 'MADEMOISELLE');
INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`) VALUES ('Attendee', 14, 'elisabeth.w@gmail.com', 'Lysandre', 'Weil', 'MONSIEUR');

INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `phone`, `role`, `id`) VALUES ('Toulouse', 'du Soleil', 10, 'rue', '31000', '1984-03-31', '0631313131', 'CUSTOMER', 1);
INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `phone`, `role`, `id`) VALUES ('Blagnac', 'du Paradis', 9, 'avenue', '31720', '2008-07-14', '0632323232', 'CUSTOMER', 2);

INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 3);
INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 4);

INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `phone`, `id`) VALUES ('Sodexo', 'Communication Group SVP', '0692929292', 8);
INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `phone`, `id`) VALUES ('Sodexo', 'Audit Group SVP', '0678787878', 9);
INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `phone`, `id`) VALUES ('Sodexo', 'CIO Group SVP', '0678780000', 10);
INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `phone`, `id`) VALUES ('David Jones', 'CEO Senior Executive Assistant', '0678787878', 11);

INSERT INTO `lecar_db`.`attendee` (`birthdate`, `id`) VALUES ('2012-06-05', 12);
INSERT INTO `lecar_db`.`attendee` (`birthdate`, `id`) VALUES ('2015-03-05', 13);
INSERT INTO `lecar_db`.`attendee` (`birthdate`, `id`) VALUES ('2018-09-05', 14);