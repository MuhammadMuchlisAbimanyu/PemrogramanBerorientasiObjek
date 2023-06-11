-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 08:17 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbshirt`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbitems`
--

CREATE TABLE `tbitems` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `merk` varchar(255) NOT NULL,
  `color` varchar(255) NOT NULL,
  `size` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbitems`
--

INSERT INTO `tbitems` (`id`, `name`, `type`, `merk`, `color`, `size`, `price`) VALUES
(35, 'Dreve', 'Jacket', 'Hammerinc', 'Black', 'XL', '439000'),
(36, 'Slaze', 'Shirt', 'Maternal', 'Gray', 'M', '199000'),
(37, 'Ovy', 'T-Shirt', 'Cotton Go', 'White', 'XL', '75000'),
(38, 'Quinn', 'Hoodie', 'Flustern', 'Black', 'L', '249000'),
(39, 'Wizz', 'Suits', 'Skymo', 'Beige', 'M', '239000'),
(40, 'Spinny', 'Polo Shirt', 'Pappersmooth', 'Navy', 'XXL', '275000'),
(41, 'Oppose', 'T-Shirt', 'Crowdhouse', 'Black', 'M', '87000'),
(42, 'Flies', 'Shirt', 'Bupperrock', 'Gray', 'XL', '89000'),
(43, 'Frigus', 'Jacket', 'Losinggrip', 'White', 'XXL', '320000'),
(44, 'Warps', 'Jacket', 'Murphy', 'Army', 'S', '200000'),
(45, 'Premuto', 'Sweater', 'Wdzg', 'Black', 'L', '349000'),
(46, 'Bogton', 'Shirt', 'Helipad', 'Navy', 'S', '80000'),
(47, 'Calz', 'Sweater', 'SchMerch', 'Gray', 'XL', '189000'),
(48, 'Amaro', 'T-Shirt', 'Beholder', 'Army', 'XXL', '120000'),
(49, 'Shreen', 'Polo Shirt', 'Abigail', 'Black', 'M', '149000');

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE `tbuser` (
  `id` int(11) NOT NULL,
  `fullName` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`id`, `fullName`, `username`, `password`) VALUES
(1, '22', '22', '22'),
(2, '22', '222', '2'),
(3, 'Muhammad Muchlis Abimanyu', 'muchlis', '069');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbitems`
--
ALTER TABLE `tbitems`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbuser`
--
ALTER TABLE `tbuser`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbitems`
--
ALTER TABLE `tbitems`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `tbuser`
--
ALTER TABLE `tbuser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
