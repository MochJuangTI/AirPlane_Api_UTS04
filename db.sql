CREATE TABLE `customers` (
  `id` int PRIMARY KEY,
  `fullname` string,
  `email` string UNIQUE,
  `password` string,
  `hobby` string,
  `photos` string
);

CREATE TABLE `credits` (
  `id` int PRIMARY KEY,
  `customer_id` int UNIQUE,
  `balance` float
);

CREATE TABLE `credit_histories` (
  `id` int PRIMARY KEY,
  `credit_id` int,
  `total_price` float,
  `invoice_id` int
);

CREATE TABLE `countries` (
  `id` int PRIMARY KEY,
  `name` string
);

CREATE TABLE `destinations` (
  `id` int PRIMARY KEY,
  `name` string,
  `description` text,
  `price` float,
  `country_id` int,
  `photos` string,
  `insurance` bool,
  `refundable` bool,
  `vat` float
);

CREATE TABLE `bookings` (
  `id` int PRIMARY KEY,
  `customer_id` int,
  `destination_id` int,
  `date` date
);

CREATE TABLE `booking_items` (
  `id` int PRIMARY KEY,
  `booking_id` int,
  `seat` int,
  `total_price` float
);

CREATE TABLE `invoices` (
  `id` int PRIMARY KEY,
  `booking_id` int,
  `total_payments` float,
  `isPaid` bool,
  `total_vat` float
);

ALTER TABLE `credits` ADD FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`);

ALTER TABLE `credit_histories` ADD FOREIGN KEY (`credit_id`) REFERENCES `credits` (`id`);

ALTER TABLE `credit_histories` ADD FOREIGN KEY (`invoice_id`) REFERENCES `invoices` (`id`);

ALTER TABLE `destinations` ADD FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`);

ALTER TABLE `bookings` ADD FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`);

ALTER TABLE `bookings` ADD FOREIGN KEY (`destination_id`) REFERENCES `destinations` (`id`);

ALTER TABLE `booking_items` ADD FOREIGN KEY (`booking_id`) REFERENCES `bookings` (`id`);

ALTER TABLE `invoices` ADD FOREIGN KEY (`booking_id`) REFERENCES `bookings` (`id`);