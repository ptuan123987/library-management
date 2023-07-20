-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2023 at 09:53 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE `authors` (
                           `au_id` int(11) NOT NULL,
                           `au_name` varchar(100) DEFAULT NULL,
                           `au_introduce` text DEFAULT NULL,
                           `au_image` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
                         `bo_id` int(11) NOT NULL,
                         `bo_title` varchar(200) DEFAULT NULL,
                         `bo_publish_year` int(11) DEFAULT NULL,
                         `bo_quantity` int(11) DEFAULT NULL,
                         `bo_description` text DEFAULT NULL,
                         `bo_image` varchar(200) DEFAULT NULL,
                         `bo_create_date` date DEFAULT NULL,
                         `ca_id` int(11) DEFAULT NULL,
                         `pu_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `book_authors`
--

CREATE TABLE `book_authors` (
                                `ba_id` int(11) NOT NULL,
                                `bo_id` int(11) DEFAULT NULL,
                                `au_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
                              `ca_id` int(11) NOT NULL,
                              `ca_name` varchar(100) DEFAULT NULL,
                              `ca_description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loans`
--

CREATE TABLE `loans` (
                         `lo_id` int(11) NOT NULL,
                         `lo_no_of_date` int(11) DEFAULT NULL,
                         `lo_create_date` date DEFAULT NULL,
                         `us_id` int(10) UNSIGNED DEFAULT NULL,
                         `bo_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `publishers`
--

CREATE TABLE `publishers` (
                              `pu_id` int(11) NOT NULL,
                              `pu_name` varchar(100) DEFAULT NULL,
                              `pu_image` varchar(200) DEFAULT NULL,
                              `pu_website` varchar(200) DEFAULT NULL,
                              `pu_introduce` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
                         `us_id` int(10) UNSIGNED NOT NULL,
                         `us_name` varchar(50) DEFAULT NULL,
                         `us_password` varchar(50) DEFAULT NULL,
                         `us_fullname` varchar(100) DEFAULT NULL,
                         `us_address` varchar(200) DEFAULT NULL,
                         `us_create_date` date DEFAULT NULL,
                         `us_update_password` tinyint(4) DEFAULT NULL,
                         `us_mobile` varchar(20) DEFAULT NULL,
                         `us_status` tinyint(4) DEFAULT NULL,
                         `us_group` tinyint(4) DEFAULT NULL,
                         `us_email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`us_id`, `us_name`, `us_password`, `us_fullname`, `us_address`, `us_create_date`, `us_update_password`, `us_mobile`, `us_status`, `us_group`, `us_email`) VALUES
                                                                                                                                                                                   (1, 'john_doe', 'password1', 'John Doe', '123 Main St', '2022-01-01', 0, '555-1234', 1, 1, 'john.doe@example.com'),
                                                                                                                                                                                   (2, 'jane_smith', 'password2', 'Jane Smith', '456 Oak Ave', '2022-02-01', 0, '555-5678', 1, 1, 'jane.smith@example.com'),
                                                                                                                                                                                   (3, 'bob_jones', 'password3', 'Bob Jones', '789 Pine Rd', '2022-03-01', 0, '555-9012', 1, 2, 'bob.jones@example.com'),
                                                                                                                                                                                   (4, 'mary_adams', 'password4', 'Mary Adams', '321 Elm St', '2022-04-01', 0, '555-3456', 1, 2, 'mary.adams@example.com'),
                                                                                                                                                                                   (5, 'jim_brown', 'password5', 'Jim Brown', '654 Cedar Ln', '2022-05-01', 0, '555-7890', 1, 3, 'jim.brown@example.com'),
                                                                                                                                                                                   (6, 'susan_smith', 'password6', 'Susan Smith', '987 Maple Dr', '2022-06-01', 0, '555-2345', 1, 3, 'susan.smith@example.com'),
                                                                                                                                                                                   (7, 'dave_johnson', 'password7', 'Dave Johnson', '246 Birch Rd', '2022-07-01', 0, '555-6789', 1, 4, 'dave.johnson@example.com'),
                                                                                                                                                                                   (8, 'jenny_lee', 'password8', 'Jenny Lee', '369 Oak Ave', '2022-08-01', 0, '555-0123', 1, 4, 'jenny.lee@example.com'),
                                                                                                                                                                                   (9, 'ted_wilson', 'password9', 'Ted Wilson', '582 Pine Rd', '2022-09-01', 0, '555-4567', 1, 5, 'ted.wilson@example.com'),
                                                                                                                                                                                   (10, 'beth_hall', 'password10', 'Beth Hall', '795 Elm St', '2022-10-01', 0, '555-8901', 1, 5, 'beth.hall@example.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `authors`
--
ALTER TABLE `authors`
    ADD PRIMARY KEY (`au_id`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
    ADD PRIMARY KEY (`bo_id`),
  ADD KEY `fk_books_categories` (`ca_id`),
  ADD KEY `fk_books_publishers` (`pu_id`);

--
-- Indexes for table `book_authors`
--
ALTER TABLE `book_authors`
    ADD PRIMARY KEY (`ba_id`),
  ADD KEY `fk_book_authors_books` (`bo_id`),
  ADD KEY `fk_book_authors_authors` (`au_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
    ADD PRIMARY KEY (`ca_id`);

--
-- Indexes for table `loans`
--
ALTER TABLE `loans`
    ADD PRIMARY KEY (`lo_id`),
  ADD KEY `fk_loans_books` (`bo_id`),
  ADD KEY `fk_loans_users` (`us_id`);

--
-- Indexes for table `publishers`
--
ALTER TABLE `publishers`
    ADD PRIMARY KEY (`pu_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
    ADD PRIMARY KEY (`us_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
    MODIFY `us_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
    ADD CONSTRAINT `fk_books_categories` FOREIGN KEY (`ca_id`) REFERENCES `categories` (`ca_id`),
  ADD CONSTRAINT `fk_books_publishers` FOREIGN KEY (`pu_id`) REFERENCES `publishers` (`pu_id`);

--
-- Constraints for table `book_authors`
--
ALTER TABLE `book_authors`
    ADD CONSTRAINT `fk_book_authors_authors` FOREIGN KEY (`au_id`) REFERENCES `authors` (`au_id`),
  ADD CONSTRAINT `fk_book_authors_books` FOREIGN KEY (`bo_id`) REFERENCES `books` (`bo_id`);

--
-- Constraints for table `loans`
--
ALTER TABLE `loans`
    ADD CONSTRAINT `fk_loans_books` FOREIGN KEY (`bo_id`) REFERENCES `books` (`bo_id`),
  ADD CONSTRAINT `fk_loans_users` FOREIGN KEY (`us_id`) REFERENCES `users` (`us_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
