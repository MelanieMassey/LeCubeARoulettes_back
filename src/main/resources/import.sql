--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('Customer', 1, 'melanie.m@gmail.com', 'Melanie', 'Massey', 'MADAME', '0611223344');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('Customer', 2, 'arthur.d@gmail.com', 'Arthur', 'Dupont', 'MONSIEUR', '0644332211');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('Admin', 3, 'alicia.j@gmail.com', 'Alicia', 'Jonquille', 'MADEMOISELLE', '0600000000');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('Admin', 4, 'romeo.p@gmail.com', 'Romeo', 'Philippot', 'MONSIEUR', '0600000001');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('EventLeader', 8, 'laura.m@gmail.com', 'Laura', 'Michelet', 'MADEMOISELLE', '0600000002');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('EventLeader', 9, 'lorene.l@gmail.com', 'Lorene', 'Lebonnec', 'MADEMOISELLE', '0600000003');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('EventLeader', 10, 'xavier.c@gmail.com', 'Xavier', 'Caroulle', 'MONSIEUR', '0600000004');
--INSERT INTO `lecar_db`.`person` (`person_type`, `id`, `email`, `first_name`, `last_name`, `title`, `phone`) VALUES ('EventLeader', 11, 'celine.m@gmail.com', 'Céline', 'Mangeant', 'MADAME', '0600000005');
--
--INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `role`, `id`) VALUES ('Toulouse', 'du Soleil', 10, 'rue', '31000', '1984-03-31', 'CUSTOMER', 1);
--INSERT INTO `lecar_db`.`customer` (`address_city`, `address_street_name`, `address_street_number`, `address_street_type`, `address_zip_code`, `birthdate`, `role`, `id`) VALUES ('Blagnac', 'du Paradis', 9, 'avenue', '31720', '2008-07-14', 'CUSTOMER', 2);
--
--INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 3);
--INSERT INTO `lecar_db`.`admin` (`role`, `id`) VALUES ('ADMIN', 4);
--
--INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `id`) VALUES ('Sodexo', 'Communication Group SVP', 8);
--INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `id`) VALUES ('Sodexo', 'Audit Group SVP', 9);
--INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `id`) VALUES ('Sodexo', 'CIO Group SVP', 10);
--INSERT INTO `lecar_db`.`event_leader` (`company_name`, `job_title`, `id`) VALUES ('David Jones', 'CEO Senior Executive Assistant', 11);
--
--INSERT INTO `lecar_db`.`attendee` (`id`, `first_name`, `last_name`, `gender`,`birthdate`) VALUES (12, 'Rafael', 'Mousse', 'male', '2012-06-05');
--INSERT INTO `lecar_db`.`attendee` (`id`, `first_name`, `last_name`, `gender`,`birthdate`) VALUES (13, 'Lily', 'Depp', 'female', '2015-03-05');
--INSERT INTO `lecar_db`.`attendee` (`id`, `first_name`, `last_name`, `gender`,`birthdate`) VALUES (14, 'Agathe', 'Lavigne', 'female', '2018-09-05');
--
--INSERT INTO `lecar_db`.`roles` (`id`, `rolename`) VALUES ('1', 'ADMIN'), ('2', 'USER');



INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (1, '2023-12-20', 'Elisabeth', 12, 6, 'Atelier Lego de Noël', 6, 0, 'events/lego_xmas.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (2, '2023-12-21', 'Elisabeth', 3, 0, 'Atelier Sensoriel bébés', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (3, '2023-12-22', 'Elisabeth', 12, 6, 'Atelier Origami', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (4, '2023-12-23', 'Elisabeth', 12, 6, 'Atelier Paillettes Party', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (5, '2023-12-24', 'Elisabeth', 12, 6, 'Customise ton sac', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (6, '2024-01-05', 'Elisabeth', 6, 3, 'Atelier blouguiboulga', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (7, '2024-01-10', 'Association portage', 99, 16, 'Atelier de portage', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (8, '2024-01-15', 'Elisabeth', 12, 6, 'Atelier Color Party', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (9, '2024-01-18', 'Elisabeth', 12, 6, 'Atelier Cadre Lego', 6, 0, 'events/template.jpg');
INSERT INTO `events` (`id`, `event_date`, `event_leader`, `max_age`,`min_age`, `name`, `nb_max_attendees`, `nb_registered_attendees`, `picture`) VALUES (10, '2024-01-20', 'Association sophro', 12, 6, 'Atelier Sophro', 6, 0, 'events/template.jpg');

INSERT INTO `users` (`id`, `last_name`, `first_name`, `title`, `birthdate`, `phone`, `email`, `password`, `street_number`, `street_name`, `zip_code`, `city`) VALUES (1, 'Massey', 'Melanie', 'MADAME', '1984-03-31', '0600000001', 'user01@gmail.com', '$2a$10$5Xc0zvRRPtWcSwO4HEXZpeMpb6krHRr.lEHmhbYpCytKaq/8gukLO', 69, 'route de Léguevin', '31820', 'Pibrac');
INSERT INTO `users` (`id`, `last_name`, `first_name`, `title`, `birthdate`, `phone`, `email`, `password`, `street_number`, `street_name`, `zip_code`, `city`) VALUES (2, 'Weil', 'Elisabeth', 'MADAME', '1981-08-21', '0600000002', 'user02@gmail.com', '$2a$12$5tfeOK8cogcfFWkrnLkuw.ZxDCUqIA.rCdV8HrR/LSD2mG7Agcziu', 9, 'route des Couleurs', '93000', 'Saint Ouen');

INSERT INTO `attendees` (`id`, `last_name`, `first_name`, `birthdate`) VALUES (1, 'Bourbon', 'Eliott', '2020-08-21');
INSERT INTO `attendees` (`id`, `last_name`, `first_name`, `birthdate`) VALUES (2, 'Dubois', 'Juliette', '2015-08-21');
INSERT INTO `attendees` (`id`, `last_name`, `first_name`, `birthdate`) VALUES (3, 'Alfonso', 'Eleanor', '2012-08-21');

INSERT INTO `roles` (`id`, `rolename`) VALUES (1, 'ADMIN'), (2, 'USER');

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (1, 2);

INSERT INTO `users_events` (`user_id`, `event_id`) VALUES (1, 1), (1, 2), (1, 3);

INSERT INTO `users_attendees` (`user_id`, `attendee_id`) VALUES (1, 1), (1, 2);

INSERT INTO `attendees_events` (`attendee_id`, `event_id`) VALUES (1, 1), (1, 2), (2, 3);