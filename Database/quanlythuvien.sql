SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlythuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `tkAdmin` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `password_hashed` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `RFID_code` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `salt` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`tkAdmin`, `password`, `password_hashed`, `salt`) VALUES
('AD000001', '123456', 'd133390bc5169d8505cafb0ab86a0813', 'e301252571e6b32f59e058bc42c81d6a');

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieumuon`
--

CREATE TABLE `chitietphieumuon` (
  `maPhieuMuon` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `IDSach` varchar(9) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitietphieumuon`
--

INSERT INTO `chitietphieumuon` (`maPhieuMuon`, `IDSach`) VALUES
('M000001', 'IDS000001'),
('M000001', 'IDS000002'),
('M000002', 'IDS000004'),
('M000002', 'IDS000005'),
('M000003', 'IDS000008'),
('M000003', 'IDS000009'),
('M000004', 'IDS000012'),
('M000004', 'IDS000013'),
('M000005', 'IDS000013'),
('M000005', 'IDS000014'),
('M000006', 'IDS000019'),
('M000006', 'IDS000020'),
('M000007', 'IDS000023'),
('M000007', 'IDS000024'),
('M000008', 'IDS000030'),
('M000008', 'IDS000031'),
('M000009', 'IDS000038'),
('M000009', 'IDS000039'),
('M000010', 'IDS000053'),
('M000010', 'IDS000054'),
('M000011', 'IDS000026'),
('M000011', 'IDS000027'),
('M000012', 'IDS000070'),
('M000012', 'IDS000071'),
('M000013', 'IDS000064'),
('M000013', 'IDS000065'),
('M000014', 'IDS000067'),
('M000014', 'IDS000068'),
('M000015', 'IDS000076'),
('M000015', 'IDS000077'),
('M000016', 'IDS000058'),
('M000016', 'IDS000059'),
('M000017', 'IDS000045'),
('M000017', 'IDS000046'),
('M000018', 'IDS000078'),
('M000018', 'IDS000077'),
('M000019', 'IDS000063'),
('M000019', 'IDS000064'),
('M000020', 'IDS000029'),
('M000020', 'IDS000030'),
('M000021', 'IDS000047'),
('M000021', 'IDS000048'),
('M000022', 'IDS000056'),
('M000022', 'IDS000057'),
('M000023', 'IDS000015'),
('M000023', 'IDS000016'),
('M000024', 'IDS000025'),
('M000024', 'IDS000026'),
('M000025', 'IDS000008'),
('M000025', 'IDS000009'),
('M000026', 'IDS000017'),
('M000026', 'IDS000018'),
('M000027', 'IDS000001'),
('M000027', 'IDS000002'),
('M000028', 'IDS000013'),
('M000028', 'IDS000014'),
('M000029', 'IDS000018'),
('M000029', 'IDS000019'),
('M000030', 'IDS000014'),
('M000030', 'IDS000015'),
('M000031', 'IDS000016'),
('M000031', 'IDS000017'),
('M000032', 'IDS000018'),
('M000032', 'IDS000019'),
('M000033', 'IDS000020'),
('M000033', 'IDS000021'),
('M000034', 'IDS000062'),
('M000034', 'IDS000063'),
('M000035', 'IDS000057'),
('M000035', 'IDS000058'),
('M000036', 'IDS000076'),
('M000036', 'IDS000077'),
('M000037', 'IDS000003'),
('M000037', 'IDS000004'),
('M000038', 'IDS000010'),
('M000038', 'IDS000011'),
('M000039', 'IDS000030'),
('M000039', 'IDS000031'),
('M000040', 'IDS000027'),
('M000040', 'IDS000028'),
('M000041', 'IDS000060'),
('M000041', 'IDS000061'),
('M000042', 'IDS000045'),
('M000042', 'IDS000046'),
('M000043', 'IDS000070'),
('M000043', 'IDS000071'),
('M000044', 'IDS000019'),
('M000044', 'IDS000020'),
('M000045', 'IDS000060'),
('M000045', 'IDS000061'),
('M000046', 'IDS000004'),
('M000046', 'IDS000005'),
('M000047', 'IDS000062'),
('M000047', 'IDS000063'),
('M000048', 'IDS000027'),
('M000048', 'IDS000028'),
('M000049', 'IDS000010'),
('M000049', 'IDS000011'),
('M000050', 'IDS000033'),
('M000050', 'IDS000034'),
('M000051', 'IDS000005'),
('M000051', 'IDS000006'),
('M000052', 'IDS000075'),
('M000052', 'IDS000076'),
('M000053', 'IDS000028'),
('M000053', 'IDS000029'),
('M000054', 'IDS000066'),
('M000054', 'IDS000067'),
('M000055', 'IDS000022'),
('M000055', 'IDS000023'),
('M000056', 'IDS000038'),
('M000056', 'IDS000039'),
('M000057', 'IDS000048'),
('M000057', 'IDS000049'),
('M000058', 'IDS000076'),
('M000058', 'IDS000077'),
('M000059', 'IDS000013'),
('M000059', 'IDS000014'),
('M000060', 'IDS000003'),
('M000060', 'IDS000004'),
('M000061', 'IDS000008'),
('M000061', 'IDS000009'),
('M000062', 'IDS000007'),
('M000062', 'IDS000010'),
('M000063', 'IDS000014'),
('M000063', 'IDS000015'),
('M000064', 'IDS000025'),
('M000064', 'IDS000026'),
('M000065', 'IDS000030'),
('M000065', 'IDS000031'),
('M000066', 'IDS000040'),
('M000066', 'IDS000041'),
('M000067', 'IDS000045'),
('M000067', 'IDS000046'),
('M000068', 'IDS000050'),
('M000068', 'IDS000051'),
('M000069', 'IDS000002'),
('M000069', 'IDS000003'),
('M000070', 'IDS000014'),
('M000070', 'IDS000015'),
('M000071', 'IDS000009'),
('M000071', 'IDS000010'),
('M000072', 'IDS000024'),
('M000072', 'IDS000025'),
('M000073', 'IDS000026'),
('M000073', 'IDS000027'),
('M000074', 'IDS000035'),
('M000074', 'IDS000036'),
('M000075', 'IDS000005'),
('M000075', 'IDS000006'),
('M000076', 'IDS000010'),
('M000076', 'IDS000011'),
('M000077', 'IDS000012'),
('M000077', 'IDS000013'),
('M000078', 'IDS000014'),
('M000078', 'IDS000015'),
('M000079', 'IDS000078'),
('M000079', 'IDS000077'),
('M000080', 'IDS000061'),
('M000080', 'IDS000062'),
('M000081', 'IDS000001'),
('M000081', 'IDS000002'),
('M000082', 'IDS000009'),
('M000082', 'IDS000010'),
('M000083', 'IDS000020'),
('M000083', 'IDS000021'),
('M000084', 'IDS000004'),
('M000084', 'IDS000005'),
('M000085', 'IDS000045'),
('M000085', 'IDS000046'),
('M000086', 'IDS000015'),
('M000086', 'IDS000016'),
('M000087', 'IDS000008'),
('M000087', 'IDS000009'),
('M000088', 'IDS000048'),
('M000088', 'IDS000049'),
('M000089', 'IDS000069'),
('M000089', 'IDS000068'),
('M000090', 'IDS000010'),
('M000090', 'IDS000011'),
('M000091', 'IDS000023'),
('M000091', 'IDS000024'),
('M000092', 'IDS000061'),
('M000092', 'IDS000062'),
('M000093', 'IDS000048'),
('M000093', 'IDS000049'),
('M000094', 'IDS000070'),
('M000094', 'IDS000071'),
('M000095', 'IDS000034'),
('M000095', 'IDS000035'),
('M000096', 'IDS000075'),
('M000096', 'IDS000076'),
('M000097', 'IDS000002'),
('M000097', 'IDS000003'),
('M000098', 'IDS000020'),
('M000098', 'IDS000021'),
('M000099', 'IDS000035'),
('M000099', 'IDS000036'),
('M000100', 'IDS000006'),
('M000100', 'IDS000007'),
('M000101', 'IDS000050'),
('M000101', 'IDS000051'),
('M000102', 'IDS000008'),
('M000102', 'IDS000009'),
('M000103', 'IDS000013'),
('M000103', 'IDS000014'),
('M000104', 'IDS000015'),
('M000104', 'IDS000016'),
('M000105', 'IDS000060'),
('M000105', 'IDS000061'),
('M000106', 'IDS000046'),
('M000106', 'IDS000047'),
('M000107', 'IDS000001'),
('M000107', 'IDS000002'),
('M000108', 'IDS000069'),
('M000108', 'IDS000068'),
('M000108', 'IDS000007'),
('M000108', 'IDS000008'),
('M000109', 'IDS000021'),
('M000109', 'IDS000022'),
('M000110', 'IDS000042'),
('M000110', 'IDS000043'),
('M000111', 'IDS000027'),
('M000111', 'IDS000028'),
('M000112', 'IDS000039'),
('M000112', 'IDS000038'),
('M000113', 'IDS000012'),
('M000113', 'IDS000013'),
('M000114', 'IDS000054'),
('M000114', 'IDS000055'),
('M000115', 'IDS000075'),
('M000115', 'IDS000076'),
('M000116', 'IDS000006'),
('M000116', 'IDS000007'),
('M000117', 'IDS000034'),
('M000117', 'IDS000035'),
('M000118', 'IDS000055'),
('M000118', 'IDS000056'),
('M000119', 'IDS000022'),
('M000119', 'IDS000023'),
('M000120', 'IDS000050'),
('M000120', 'IDS000051'),
('M000121', 'IDS000037'),
('M000121', 'IDS000038'),
('M000122', 'IDS000026'),
('M000122', 'IDS000027'),
('M000123', 'IDS000007'),
('M000123', 'IDS000008'),
('M000124', 'IDS000063'),
('M000124', 'IDS000064'),
('M000125', 'IDS000023'),
('M000125', 'IDS000024'),
('M000126', 'IDS000013'),
('M000126', 'IDS000014'),
('M000127', 'IDS000016'),
('M000127', 'IDS000017'),
('M000128', 'IDS000030'),
('M000128', 'IDS000031'),
('M000129', 'IDS000046'),
('M000129', 'IDS000047'),
('M000130', 'IDS000062'),
('M000130', 'IDS000063'),
('M000131', 'IDS000007'),
('M000131', 'IDS000008'),
('M000132', 'IDS000027'),
('M000132', 'IDS000028'),
('M000133', 'IDS000044'),
('M000133', 'IDS000045'),
('M000134', 'IDS000004'),
('M000134', 'IDS000005'),
('M000135', 'IDS000057'),
('M000135', 'IDS000058'),
('M000136', 'IDS000014'),
('M000136', 'IDS000015'),
('M000137', 'IDS000033'),
('M000137', 'IDS000034'),
('M000138', 'IDS000050'),
('M000138', 'IDS000051'),
('M000139', 'IDS000001'),
('M000139', 'IDS000002'),
('M000140', 'IDS000034'),
('M000140', 'IDS000035'),
('M000141', 'IDS000009'),
('M000141', 'IDS000002'),
('M000142', 'IDS000032'),
('M000142', 'IDS000033'),
('M000143', 'IDS000049'),
('M000143', 'IDS000042'),
('M000143', 'IDS000062'),
('M000143', 'IDS000063'),
('M000145', 'IDS000037'),
('M000145', 'IDS000038'),
('M000146', 'IDS000076'),
('M000146', 'IDS000077'),
('M000147', 'IDS000069'),
('M000147', 'IDS000065'),
('M000148', 'IDS000064'),
('M000148', 'IDS000066'),
('M000149', 'IDS000019'),
('M000149', 'IDS000012'),
('M000150', 'IDS000040'),
('M000150', 'IDS000041'),
('M000151', 'IDS000078'),
('M000151', 'IDS000077'),
('M000152', 'IDS000030'),
('M000152', 'IDS000031'),
('M000153', 'IDS000004'),
('M000153', 'IDS000005'),
('M000154', 'IDS000017'),
('M000154', 'IDS000018'),
('M000155', 'IDS000024'),
('M000155', 'IDS000025'),
('M000156', 'IDS000070'),
('M000156', 'IDS000071'),
('M000157', 'IDS000001'),
('M000157', 'IDS000002'),
('M000158', 'IDS000013'),
('M000158', 'IDS000014'),
('M000159', 'IDS000022'),
('M000159', 'IDS000023'),
('M000160', 'IDS000018'),
('M000160', 'IDS000019'),
('M000161', 'IDS000005'),
('M000161', 'IDS000006'),
('M000162', 'IDS000046'),
('M000162', 'IDS000047'),
('M000163', 'IDS000066'),
('M000163', 'IDS000067'),
('M000164', 'IDS000036'),
('M000164', 'IDS000037'),
('M000165', 'IDS000062'),
('M000165', 'IDS000063'),
('M000166', 'IDS000002'),
('M000166', 'IDS000004'),
('M000167', 'IDS000040'),
('M000167', 'IDS000041'),
('M000168', 'IDS000013'),
('M000168', 'IDS000017'),
('M000169', 'IDS000051'),
('M000169', 'IDS000052');

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `maNhap` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `donGia` int(11) DEFAULT NULL,
  `thanhTien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`maNhap`, `maSach`, `soLuong`, `donGia`, `thanhTien`) VALUES
('N0000001', 'S000001', 3, 189000, 567000),
('N0000001', 'S000003', 3, 100000, 300000),
('N0000001', 'S000005', 17, 135000, 2295000),
('N0000001', 'S000007', 3, 160000, 480000),
('N0000001', 'S000009', 3, 297000, 891000),
('N0000001', 'S000011', 3, 320000, 960000),
('N0000001', 'S000013', 3, 108000, 324000),
('N0000001', 'S000015', 3, 136000, 408000),
('N0000001', 'S000017', 3, 72000, 216000),
('N0000001', 'S000019', 3, 143000, 429000),
('N0000001', 'S000021', 3, 60000, 180000),
('N0000001', 'S000023', 3, 57000, 171000),
('N0000002', 'S000002', 7, 90000, 630000),
('N0000002', 'S000004', 7, 265000, 1855000),
('N0000002', 'S000006', 14, 125000, 1750000),
('N0000002', 'S000008', 13, 200000, 2600000),
('N0000002', 'S000010', 10, 330000, 3300000),
('N0000002', 'S000012', 7, 535000, 3745000),
('N0000002', 'S000014', 7, 265000, 1855000),
('N0000002', 'S000016', 7, 83000, 581000),
('N0000002', 'S000018', 7, 150000, 1050000),
('N0000002', 'S000020', 7, 44000, 308000),
('N0000002', 'S000022', 7, 43000, 301000),
('N0000002', 'S000024', 7, 39000, 273000),
('N0000003', 'S000001', 3, 189000, 567000),
('N0000003', 'S000002', 3, 90000, 270000),
('N0000003', 'S000003', 3, 100000, 300000),
('N0000003', 'S000004', 3, 265000, 795000),
('N0000003', 'S000005', 3, 135000, 405000),
('N0000003', 'S000006', 3, 125000, 375000),
('N0000003', 'S000007', 3, 160000, 480000),
('N0000003', 'S000008', 3, 200000, 600000),
('N0000003', 'S000009', 3, 297000, 891000),
('N0000003', 'S000010', 3, 330000, 990000),
('N0000003', 'S000011', 3, 320000, 960000),
('N0000003', 'S000012', 3, 535000, 1605000),
('N0000003', 'S000013', 3, 108000, 324000),
('N0000003', 'S000014', 3, 265000, 795000),
('N0000003', 'S000015', 3, 136000, 408000),
('N0000003', 'S000016', 3, 83000, 249000),
('N0000003', 'S000017', 3, 72000, 216000),
('N0000003', 'S000018', 3, 150000, 450000),
('N0000003', 'S000019', 3, 143000, 429000),
('N0000003', 'S000020', 3, 44000, 132000),
('N0000003', 'S000021', 3, 60000, 180000),
('N0000003', 'S000022', 3, 43000, 129000),
('N0000003', 'S000023', 3, 57000, 171000),
('N0000003', 'S000024', 3, 39000, 117000);

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieuxuat`
--

CREATE TABLE `chitietphieuxuat` (
  `maXuat` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chitietphieuxuat`
--

INSERT INTO `chitietphieuxuat` (`maXuat`, `maSach`, `soLuong`) VALUES
('X0000001', 'S000001', 2),
('X0000001', 'S000002', 2),
('X0000001', 'S000003', 2),
('X0000001', 'S000004', 2),
('X0000001', 'S000005', 2),
('X0000001', 'S000006', 2),
('X0000001', 'S000007', 2),
('X0000001', 'S000008', 2),
('X0000001', 'S000009', 2),
('X0000001', 'S000010', 2),
('X0000001', 'S000011', 2),
('X0000001', 'S000012', 2),
('X0000001', 'S000013', 2),
('X0000001', 'S000014', 2),
('X0000001', 'S000015', 2),
('X0000001', 'S000016', 2),
('X0000001', 'S000017', 2),
('X0000001', 'S000018', 2),
('X0000001', 'S000019', 2),
('X0000001', 'S000020', 2),
('X0000001', 'S000021', 2),
('X0000001', 'S000022', 2),
('X0000001', 'S000023', 2),
('X0000001', 'S000024', 2),
('X0000002', 'S000001', 1),
('X0000002', 'S000002', 1),
('X0000002', 'S000003', 1),
('X0000002', 'S000004', 1),
('X0000002', 'S000005', 1),
('X0000002', 'S000006', 1),
('X0000002', 'S000007', 1),
('X0000002', 'S000008', 1),
('X0000002', 'S000009', 1),
('X0000002', 'S000010', 1),
('X0000002', 'S000011', 1),
('X0000002', 'S000012', 1),
('X0000002', 'S000013', 1),
('X0000002', 'S000014', 1),
('X0000002', 'S000015', 1),
('X0000002', 'S000016', 1),
('X0000002', 'S000017', 1),
('X0000002', 'S000018', 1),
('X0000002', 'S000019', 1),
('X0000002', 'S000020', 1),
('X0000002', 'S000021', 1),
('X0000002', 'S000022', 1),
('X0000002', 'S000023', 1),
('X0000002', 'S000024', 1),
('X0000003', 'S000005', 2),
('X0000003', 'S000006', 1),
('X0000003', 'S000007', 1),
('X0000003', 'S000008', 1),
('X0000003', 'S000010', 1);

-- --------------------------------------------------------

--
-- Table structure for table `chitietsach`
--

CREATE TABLE `chitietsach` (
  `IDSach` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `tinhTrang` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chitietsach`
--

INSERT INTO `chitietsach` (`IDSach`, `maSach`, `tinhTrang`) VALUES
('IDS000001', 'S000001', 'Tốt'),
('IDS000002', 'S000001', 'Bình Thường'),
('IDS000003', 'S000001', 'Cũ'),
('IDS000004', 'S000002', 'Tốt'),
('IDS000005', 'S000002', 'Bình Thường'),
('IDS000006', 'S000002', 'Cũ'),
('IDS000007', 'S000003', 'Tốt'),
('IDS000008', 'S000003', 'Bình Thường'),
('IDS000009', 'S000003', 'Cũ'),
('IDS000010', 'S000004', 'Tốt'),
('IDS000011', 'S000004', 'Bình Thường'),
('IDS000012', 'S000004', 'Cũ'),
('IDS000013', 'S000005', 'Tốt'),
('IDS000014', 'S000005', 'Tốt'),
('IDS000015', 'S000005', 'Bình Thường'),
('IDS000016', 'S000005', 'Bình Thường'),
('IDS000017', 'S000005', 'Cũ'),
('IDS000018', 'S000006', 'Tốt'),
('IDS000019', 'S000006', 'Tốt'),
('IDS000020', 'S000006', 'Bình Thường'),
('IDS000021', 'S000006', 'Cũ'),
('IDS000022', 'S000007', 'Tốt'),
('IDS000023', 'S000007', 'Tốt'),
('IDS000024', 'S000007', 'Bình Thường'),
('IDS000025', 'S000007', 'Cũ'),
('IDS000026', 'S000008', 'Tốt'),
('IDS000027', 'S000008', 'Tốt'),
('IDS000028', 'S000008', 'Bình Thường'),
('IDS000029', 'S000008', 'Cũ'),
('IDS000030', 'S000009', 'Tốt'),
('IDS000031', 'S000009', 'Bình Thường'),
('IDS000032', 'S000009', 'Cũ'),
('IDS000033', 'S000010', 'Tốt'),
('IDS000034', 'S000010', 'Tốt'),
('IDS000035', 'S000010', 'Bình Thường'),
('IDS000036', 'S000010', 'Cũ'),
('IDS000037', 'S000011', 'Tốt'),
('IDS000038', 'S000011', 'Bình Thường'),
('IDS000039', 'S000011', 'Cũ'),
('IDS000040', 'S000012', 'Tốt'),
('IDS000041', 'S000012', 'Bình Thường'),
('IDS000042', 'S000012', 'Cũ'),
('IDS000043', 'S000013', 'Tốt'),
('IDS000044', 'S000013', 'Bình Thường'),
('IDS000045', 'S000013', 'Cũ'),
('IDS000046', 'S000014', 'Tốt'),
('IDS000047', 'S000014', 'Bình Thường'),
('IDS000048', 'S000014', 'Cũ'),
('IDS000049', 'S000015', 'Tốt'),
('IDS000050', 'S000015', 'Bình Thường'),
('IDS000051', 'S000015', 'Cũ'),
('IDS000052', 'S000016', 'Tốt'),
('IDS000053', 'S000016', 'Bình Thường'),
('IDS000054', 'S000016', 'Cũ'),
('IDS000055', 'S000017', 'Tốt'),
('IDS000056', 'S000017', 'Bình Thường'),
('IDS000057', 'S000017', 'Cũ'),
('IDS000058', 'S000018', 'Tốt'),
('IDS000059', 'S000018', 'Bình Thường'),
('IDS000060', 'S000018', 'Cũ'),
('IDS000061', 'S000019', 'Tốt'),
('IDS000062', 'S000019', 'Bình Thường'),
('IDS000063', 'S000019', 'Cũ'),
('IDS000064', 'S000020', 'Tốt'),
('IDS000065', 'S000020', 'Bình Thường'),
('IDS000066', 'S000020', 'Cũ'),
('IDS000067', 'S000021', 'Tốt'),
('IDS000068', 'S000021', 'Bình Thường'),
('IDS000069', 'S000021', 'Cũ'),
('IDS000070', 'S000022', 'Tốt'),
('IDS000071', 'S000022', 'Bình Thường'),
('IDS000072', 'S000022', 'Cũ'),
('IDS000073', 'S000023', 'Tốt'),
('IDS000074', 'S000023', 'Bình Thường'),
('IDS000075', 'S000023', 'Cũ'),
('IDS000076', 'S000024', 'Tốt'),
('IDS000077', 'S000024', 'Bình Thường'),
('IDS000078', 'S000024', 'Cũ');

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKhachHang` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `hoTen` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngaySinh` date NOT NULL,
  `diaChi` varchar(65) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`maKhachHang`, `hoTen`, `ngaySinh`, `diaChi`, `sdt`, `email`) VALUES
('KH000001', 'Nguyễn Thùy Chi', '1999-01-29', 'phường Đại Kim, quận Hoàng Mai, thành phố Hà Nội', '0321589102', 'thuychi@gmail.com'),
('KH000002', 'Nguyễn Minh Khang', '2000-02-12', 'NGUYEN TUAN,THANH XUAN,HA NOI', '0951786905', 'khangnguyen@gmail.com'),
('KH000003', 'Lê Bảo Trân', '1997-11-22', ' TAY SON,DONG DA,HA NOI', '0985327812', 'baotran@gmail.com'),
('KH000004', 'Lê Quốc Bình', '2001-09-22', ' CAU GIAY,Q.CAU GIAY,HA NOI', '0904281742', 'binhle@gmail.com'),
('KH000005', 'Phạm Diệu Linh', '1998-09-09', 'LE DUAN,HAI BA TRUNG,HA NOI', '0762190538', 'dieulinh@gmail.com'),
('KH000006', 'Phạm Hùng Cường', '1996-08-27', 'PHO HUE,NGO THI NHAM,H.B.T,HA NOI', '0351298632', 'cuongpham@gmail.com'),
('KH000007', 'Đặng Trúc Lâm', '1997-06-14', 'THANH CONG,BA DINH,HA NOI', '0924582906', 'truclam@gmail.com'),
('KH000008', 'Đặng Minh Quân', '2000-11-23', ' NGO THI NHAM,HAI BA TRUNG,HA NOI', '0705643219', 'quandang@gmail.com'),
('KH000009', 'Đỗ Đan Hạ', '1997-09-07', ' LA THANH,P.O CHO DUA,DONG DA,HA NOI ', '0399641785', 'danha@gmail.com'),
('KH000010', 'Đỗ Thái Dương', '1998-10-10', 'HAI BA TRUNG, HOAN KIEM, HA NOI', '0761297518', 'duongdo@gmail.com'),
('KH000011', 'Hoàng Vân Khánh', '1999-08-19', 'NHA CHUNG, HANG TRONG, HOAN KIEM, HA NOI', '0388127529', 'vankhanh@gmail.com'),
('KH000012', 'Hoàng Vân Phong', '1997-04-02', 'HAI BA TRUNG,CUA NAM,HOAN KIEM,HNOI', '0982437581', 'phonghoang@gmail.com'),
('KH000013', 'Đinh Nhã Uyên', '1998-10-24', 'NGUYEN KHAC HIEU,BA DINH,HANOI', '0937841679', 'nhauyen@gmail.com'),
('KH000014', 'Đinh Gia Khánh', '1996-06-11', 'BACH THAI BUOI,VAN QUAN,HA DONG', '0318951479', 'khanhdinh@gmail.com'),
('KH000015', 'Phan Mẫn Nhi', '1999-05-07', ' MAI HAC DE,HAI BA TRUNG,HANOI', '0985241788', 'nhiphan@gmail.com'),
('KH000016', 'Phan Tấn Gia Hưng', '1967-12-26', 'MY DINH,NAMTULIEM,HNOI', '0921686578', 'hungphan@gmail.com'),
('KH000017', 'Vũ Hà My', '2000-08-06', ' P.O CHO DUA, DONG DA, HA NOI ', '0367189002', 'hamy@gmail.com'),
('KH000018', 'Vũ Trung Nghĩa', '1999-11-20', 'TUE TINH, BUI THI XUAN, HAI BA TRUNG, HA NOI', '0915738940', 'nghiavu@gmail.com'),
('KH000019', 'Huỳnh Ngọc Bích', '1998-10-28', 'LO DUC, PHAM DINH HO, HAI BA TRUNG, HA NOI', '0974135863', 'ngocbich@gmail.com'),
('KH000020', 'Huỳnh Anh Việt', '1999-03-08', 'TRANG THI, HOAN KIEM, HN ', '0357189582', 'viethuynh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `khosach`
--

CREATE TABLE `khosach` (
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khosach`
--

INSERT INTO `khosach` (`maSach`, `soLuong`) VALUES
('S000001', 3),
('S000002', 7),
('S000003', 3),
('S000004', 7),
('S000005', 15),
('S000006', 13),
('S000007', 2),
('S000008', 12),
('S000009', 3),
('S000010', 9),
('S000011', 3),
('S000012', 7),
('S000013', 3),
('S000014', 7),
('S000015', 3),
('S000016', 7),
('S000017', 3),
('S000018', 7),
('S000019', 3),
('S000020', 7),
('S000021', 3),
('S000022', 7),
('S000023', 3),
('S000024', 7);

-- --------------------------------------------------------

--
-- Table structure for table `loaisach`
--

CREATE TABLE `loaisach` (
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `tenSach` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `tenTacGia` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenNXB` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `namXB` int(4) NOT NULL,
  `theLoai` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngonNgu` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tomTatNoiDung` text COLLATE utf8_unicode_ci NOT NULL,
  `giaTien` int(11) NOT NULL,
  `soTrang` int(11) NOT NULL,
  `hinhSach` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soLuongTong` int(11) DEFAULT NULL,
  `soLuongMuon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `loaisach`
--

INSERT INTO `loaisach` (`maSach`, `tenSach`, `tenTacGia`, `tenNXB`, `namXB`, `theLoai`, `ngonNgu`, `tomTatNoiDung`, `giaTien`, `soTrang`, `hinhSach`, `soLuongTong`, `soLuongMuon`) VALUES
('S000001', 'Tập Tục Đời Người', 'Phan Cẩm Thượng', 'Nhà Xuất Bản Hội Nhà Văn', 2017, 'Sách Văn Hóa', 'Tiếng Việt', '“Bạn đang cầm trên tay cuốn thứ hai trong một bộ sách của Phan Cẩm Thượng […] gồm bốn cuốn, sẽ hoàn thành trong 4 đến 5 năm nữa. Một bộ sử Việt Nam. Nhưng cần nói rõ: không phải lịch sử nước Việt với tư cách một quốc gia, mà là lịch sử người Việt Nam trong cuộc sống làm người hằng ngày của họ. Phan Cẩm Thượng không viết về các triều đại hưng suy, các cuộc chiến tranh thắng thua khốc liệt, các biến cố chính trị được coi là trọng đại … như ta thường gặp trong những bộ quốc sử nghiêm trang. Ở đây ta gặp một cái khác, nhỏ nhoi hơn, thường nhật và gần gũi hơn (nhưng kỳ vậy, lại ít được biết đến hơn): những con người. Con người Việt Nam. Phan Cẩm Thượng cho thấy còn có một lịch sử khác nữa như vậy của đất nước này mà ta chưa thật biết, song lại cũng quan trọng không kém, nếu không hơn. Vâng, có thể còn hơn, bởi vì con người phải sống như thế này, làm những cái này trước, rồi mới có thể làm những cái được coi là trọng đại kia. Mới có thể làm nên Lịch sử ‘lớn’. Hoặc nói cho cùng, những cái to lớn, trọng đại kia, theo cách nào đó rất có thể do chính những cái này chi phối, thậm chí đến quyết định. Vì nó có trước. Nó là cái nền. Nó bền bỉ và lâu dài hơn các triều đại và các chế độ.”', 189000, 611, '../images/Hinhsach/S000001.png', 3, 1),
('S000002', 'Việt Nam Phong Tục', 'Phan Kế Bính', 'Nhà Xuất Bản Hồng Đức', 2019, 'Sách Văn Hóa', 'Tiếng Việt', 'Từ Phong tục trong gia tộc, Phong tục xóm làng (hương đảng) đến các phong tục ngoài xã hội, VIỆT NAM PHONG TỤC của học giả PHAN KẾ BÍNH là một bộ biên khảo tương đối đầy đủ về các phong tục tập quán cũ của nước Việt. Là một nhà nho uyên bác mang tư tưởng tân tiến, tác giả không chỉ mô tả từng tập tục, mà còn về gốc tích, nguyên ủy cái tục ấy, nhìn nhận, đánh giá để xem nó hay hay dở, từ đó \"xét điều gì quá tệ mà bỏ bớt đi, rồi lâu lâu mới đem cái tục hay mà bổ hết cho cái tục dở. Còn tục gì hay mà là quốc túy của ta thì cứ giữ lấy\". Đến nay, tập sách gần một trăm năm tuổi này vẫn là một trong những công trình khảo cứu có giá trị bậc nhất về các phong tục tập quán trên đất nước ta và nhiều vấn đề được PHAN KẾ BÍNH nhắc tới vẫn nóng hổi tính thời đại.', 90000, 306, '../images/Hinhsach/S000002.png', 3, 1),
('S000003', ' Văn Hóa Tín Ngưỡng Việt Nam', 'Nguyễn Hạnh', 'Nhà Xuất Bản Trẻ', 2022, 'Sách Văn Hóa', 'Tiếng Việt', 'Tác phẩm Văn Hóa Tín Ngưỡng Việt Nam của tác giả Nguyễn Hạnh là tác phẩm biên khảo về tín ngưỡng của người Việt khởi từ thời dựng nước với khái niệm thờ: Trời, đất, tổ tiên. Những niềm tin dân gian của ông bà ta xưa vẫn còn lưu truyền đến ngày nay thông qua kho tàng ca dao.Tiếp đến là sự giao thoa văn hóa với 4 tôn giáo lớn ở Việt Nam là Nho, Phật, Lão, Công Giáo. Chính sự giao thoa giữa tín ngưỡng dân gian Việt Nam và 4 tôn giáo lớn này đã hình thành nên nhiều tôn giáo bản địa như Cao Đài, Hòa Hảo, Hòa Đồng Tôn Giáo. Sự giao thoa, tiếp thu và chọn lọc đó đã làm nên một đặc sắc trong chiều kích tâm linh đó là các tôn giáo du nhập phải được điều chỉnh và chứa đựng được yếu tố tín ngưỡng của người Việt. Chính những ảnh hưởng giao thoa này góp phần tạo nên bản sắc văn hóa, tín ngưỡng của người Việt xuyên suốt từ thuở dựng nước đến nay. Tác phẩm Văn Hóa Tín Ngưỡng Việt Nam sẽ góp phần làm phong phú thêm Tủ sách Triết học phương Đông của NXB Trẻ và là quyển sách cần thiết cho độc giả tìm hiểu về cội nguồn tín ngưỡng của người Việt.', 100000, 232, '../images/Hinhsach/S000003.png', 3, 1),
('S000004', 'Nghề Cổ Nước Việt Từ Truyền Thống Đến Hiện Đại', 'Vũ Từ Trang', 'Nhà Xuất Bản Phụ Nữ', 2022, 'Sách Văn Hóa', 'Tiếng Việt', '“Trong suốt hai trăm năm công nghiệp hóa và đô thị hóa, nhân loại mất đi nhiều nghề thủ công truyền thống không bao giờ phục hồi lại được nữa. Cho đến xã hội thông tin và công nghệ toàn cầu hiện nay, với sự phát triển toàn diện của ngành design, các nghề thủ công cổ được nhìn nhận lại, trước tiên phục vụ cho công việc bảo tồn di sản vật thể và phi vật thể, sau đó là những ngành design thủ công và độc bản cũng có cơ hội kinh doanh. Việt Nam không nằm ngoài vấn đề này, mặc dù công nghiệp của nước ta chậm phát triển, chỉ trong thế kỷ 20, nhưng do chiến tranh, những chính sách kinh tế không thích hợp, nhiều làng nghề thủ công và nghệ thủ công truyền thống cũng suy thoái và biến mất.\r\n\r\nCho đến nay, không có một thống kê chính xác Việt Nam từng có bao nhiêu làng nghề, phường nghề và nghề thủ công truyền thống, cái nào mất, cái nào còn, cái nào biến đổi trong cơ giới hóa và dây chuyền, gần đây còn là áp dụng công nghệ, ví dụ tiện chạm công nghệ theo mẫu mã, hoặc in 3D. Sách về làng nghề và thủ công truyền thống không nhiều và cũng chưa thật đi sâu vào chuyên môn mang tính kỹ thuật, lý do là ngành nghiên cứu Việt Nam không có truyền thống và rất hạn chế về đầu tư, những người biết nghề thì có xu hướng giữ kín nghề nghiệp, nên không bao giờ công bố các công thức và kỹ nghệ, những người viết về làng nghề và nghề thủ công chủ yếu là các nhà văn hóa có hạn chế nhất định về tay nghề và cũng chẳng có ai có thể nắm được mọi kỹ thuật nghề nghiệp mà viết từng nghề cho rành rọt. Đây là công việc của nhiều thế hệ và nhiều người. Việc những nhà văn hóa viết về làng nghề và nghề thủ công đã là quý lắm, bởi họ có ý thức giữ gìn truyền thống trong khả năng có thể.\r\n\r\nCuốn Nghề cổ nước Việt – từ truyền thống đến hiện đại” của Vũ Từ Trang, ra mắt trong năm nay, do Nhà xuất bản Phụ nữ ấn hành, là một công trình đáng kể, sau nhiều năm hoạt động văn chương và nghiên cứu văn hóa của tác giả. Ông xuất thân là một trí thức làng Sặt (Trang Liệt) ở Từ Sơn, Bắc Ninh, quê hương của nhiều di sản văn hóa và làng nghề, nguyên việc khảo cứu làng nghề Kinh Bắc xưa đối với ông là hoàn toàn thuận lợi và các làng nghề Kinh Bắc cũng cởi mở hơn rất nhiều nơi khác trong việc cung cấp thông tin cho người nghiên cứu. Vũ Từ Trang từng 20 năm làm phóng viên chuyên theo dõi và viết về đề tài tiểu thủ công nghiệp. Từng được đi hầu hết các làng nghề thủ công truyền thống.\r\n\r\nTập sách với 25 nghề cổ...', 265000, 700, '../images/Hinhsach/S000004.png', 3, 1),
('S000005', 'Giáo Trình Kỹ Thuật Lập Trình C Căn Bản Và Nâng Cao', 'GS. Phạm Văn Ất', 'Nhà Xuất Bản Bách Khoa Hà Nội', 2018, 'Sách Công Nghệ Thông Tin', 'Tiếng Việt', 'Giáo trình kỹ thuật lập trình C căn bản và nâng cao được hình thành qua nhiều năm giảng dạy của các tác giả. Ngôn ngữ lập trình C là một môn học cơ sở trong chương trình đào tạo kỹ sư, cử nhân tin học của nhiều trường đại học. Ở đây sinh viên được trang bị những kiến thức cơ bản nhất về lập trình, các kỹ thuật  tổ chức dữ liệu và lập trình căn bản với ngôn ngữ C.\r\n\r\nĐể đáp ứng nhu cầu học tập ngôn ngữ lập trình C của sinh viên cũng như nhu cầu về tài liệu cho mọi người trong nhiều ngành khoa học và kỹ thuật cần nghiên cứu C để giải quyết các bài toán của mình, tác giả biên soạn cuốn sách này. Nội dung cuốn sách là tập hợp một cách có chọn lọc các bài giảng của các tác giả.', 135000, 440, '../images/Hinhsach/S000005.png', 5, 2),
('S000006', 'Lập Trình Với C#', 'Phạm Quang Huy', 'Nhà Xuất Bản Thanh Niên', 2019, 'Sách Công Nghệ Thông Tin', 'Tiếng Việt', 'Hướng dẫn người học từng bước lập trình với C#. Xây dựng ứng dụng trên Window Form.\r\nXây dựng ứng dụng, tạo hai trang web quản lý bán hàng và quản lý tuyển sinh với các hướng dẫn từng bước làm cơ sở cho việc thiết kế các trang web phức tạp hơn.\r\nGiá sản phẩm trên Tiki đã bao gồm thuế theo luật hiện hành. Tuy nhiên tuỳ vào từng loại sản phẩm hoặc phương thức, địa chỉ giao hàng mà có thể phát sinh thêm chi phí khác như phí vận chuyển, phụ phí hàng cồng kềnh, ...', 125000, 392, '../images/Hinhsach/S000006.png', 4, 1),
('S000007', 'Lập Trình Hệ Thống Thương Mại Điện Tử', 'Phạm Quang Hiển', 'Nhà Xuất Bản Thanh Niên', 2019, 'Sách Công Nghệ Thông Tin', 'Tiếng Việt', 'Thương mại điện tử là gì? Là quá trình tiến hành một phần hay toàn bộ hoạt động thương mại thông qua những phương tiện điện tử hiện đại. Về bản chất, thương mại điện tử không thay đổi so với các hoạt động thương mại truyền thống. Tuy nhiên, bằng các phương tiện điện tử mới, các hoạt động giao dịch, mua bán, quảng bá được thực hiện nhanh chóng, hiệu quả hơn, giúp tiết kiệm chi phí và mở rộng phạm vi kinh doanh.\r\nVới những kiến thức và thế mạnh về xây dựng chiến lược kinh doanh, kỹ năng nghiệp vụ liên quan trong lĩnh vực công nghệ, tin học, ngoại ngữ, sinh viên tốt nghiệp ngành Thương mại điện tử có rất nhiều cơ hội việc làm hấp dẫn từ Phòng marketing; Phòng nghiệp vụ kinh doanh; Phòng kế hoạch; Phòng tin họở các công ty, tập đoàn trong và ngoài nước.', 160000, 582, '../images/Hinhsach/S000007.png', 4, 2),
('S000008', 'Sách Lập Trình Với Scratch 3.0', 'Nguyễn Hữu Hưng', 'Nhà Xuất Bản Đại Học Quốc Gia Hà Nội', 2017, 'Sách Công Nghệ Thông Tin', 'Tiếng Việt', 'Mục đích cuốn sách\r\nGiới thiệu về ngôn ngữ lập trình kéo thả phổ biến nhất thế giới cho học sinh phổ thông, Scratch 3.0 (phiên bản mới, phát hành năm 2019). Cuốn sách kế thừa hoàn toàn những quan điểm về nội dung, cách trình bày của cuốn sách “Lập trình với Scratch” xuất bản năm 2016 tại NXBGD (viết cho phiên bản Scratch 2.0), đồng thời bổ sung những thông tin mới về giao diện, cách lập trình cũng như các khối lệnh của phiên bản Scratch 3.0. Giúp người học nhanh chóng làm chủ hoàn toàn cách sử dụng Scratch 3.0 thông qua từng bước hướng dẫn thiết kế và lập trình ra 05 chương trình mẫu theo cấp độ từ dễ đến khó. Trên cơ sở đó người học có thể tự tạo ra các ứng dụng trò chơi, ứng dụng hỗ trợ học tập nghiên cứu hoặc đơn giản như làm tấm thiệp hay bộ phim hoạt hình, tùy theo trình độ cũng như  ý tưởng của riêng mình.\r\nTầm quan trọng của bộ môn lập trình kéo thả\r\nCuốn sách được xuất bản điện tử và chia sẻ công khai bản PDF nhằm mục đích đồng hành và dẫn dắt các em tiến tới kỷ nguyên mới, kỷ nguyên 4.0 - thời đại của robot và trí tuệ nhân tạo phát triển. Trong thời đại này, lập trình không chỉ là môn học thiết yếu mà còn là kỹ năng cơ bản và cũng được đánh giá quan trọng không khác gì kỹ năng đọc và viết. Lập Trình đang trở thành một môn học mới và được phổ cập tại nhiều quốc gia trên thế giới trong đó có Việt Nam.\r\nMô tả\r\nCuốn sách viết về ngôn ngữ lập trình Scratch với phiên bản Scratch 3.0 (phiên bản mới)  theo quan điểm: Thực hành - Trải nghiệm - Trực quan với những ví dụ được sử dụng trong cuốn sách đều rất gần gũi với học sinh. Việc lập trình những sản phẩm gắn với thực tế sẽ kích thích các em nhỏ tìm tòi, khám phá những sự vật xung quanh mình. Ngoài các sản phẩm gắn với thực tế và một số trò chơi thú vị học sinh hoàn toàn có thể tạo ra những sản phẩm hỗ trợ trong việc học tập các môn học như: Toán, Lý, Hóa, Ngữ Văn,.. Đồng thời thông qua việc thực hành tạo ra các sản phẩm trong cuốn sách các em có thể hiểu được những kiến thức cơ bản về bộ môn lập trình như những kiến thức về vòng lặp, biến, hàm,… một cách dễ dàng, gần gũi nhất.\r\nSau mỗi bài học nội dung kiến thức sẽ được tóm tắt, minh họa bằng những hình ảnh sinh động đi kèm với phần bài tập nhằm củng cố và nâng cao kiến thức học sinh đã được tìm hiểu trong bài học.', 200000, 190, '../images/Hinhsach/S000008.png', 4, 2),
('S000009', 'All About Biology', 'Robert Wintons', 'DK Publishing', 2016, 'Sách Khoa Học Công Nghệ', 'Tiếng Anh', 'What makes Earth an ideal place for life to survive? Professor Robert Winston will take kids back to Earth\'s beginnings showing how organisms live and survive in All About Biology. From the very big to the microscopic, meet the animals, plants, fungi and bacteria that play an important role in sustaining life on Earth.\r\n\r\nPacked with colourful images, facts and stats, All About Biology introduces the features and characteristics of the six main kingdoms of life. Help your child discover how life began and just what it means to be alive today.', 297000, 96, '../images/Hinhsach/S000009.png', 3, 1),
('S000010', 'Big Data', 'Timandra Harkness', 'Bloomsbury', 2018, 'Sách Công Nghệ Thông Tin', 'Tiếng Anh', 'What is Big Data, and why should you care?\r\n\r\nBig data knows where you\'ve been and who your friends are. It knows what you like and what makes you angry. It can predict what you\'ll buy, where you\'ll be the victim of crime and when you\'ll have a heart attack. Big data knows you better than you know yourself, or so it claims.\r\n\r\nBut how well do you know big data?\r\n\r\nYou\'ve probably seen the phrase in newspaper headlines, at work in a marketing meeting, or on a fitness-tracking gadget. But can you understand it without being a Silicon Valley nerd who writes computer programs for fun?\r\n\r\nYes. Yes, you can.\r\n\r\nTimandra Harkness writes comedy, not computer code. The only programmes she makes are on the radio. If you can read a newspaper you can read this book.\r\n\r\nStarting with the basics - what IS data? And what makes it big? - Timandra takes you on a whirlwind tour of how people are using big data today: from science to smart cities, business to politics, self-quantification to the Internet of Things.\r\n\r\nFinally, she asks the big questions about where it\'s taking us; is it too big for its boots, or does it think too small? Are you a data point or a human being? Will this book be full of rhetorical questions?\r\n\r\nNo. It also contains puns, asides, unlikely stories and engaging people, inspiring feats and thought-provoking dilemmas. Leaving you armed and ready to decide what you think about one of the decade\'s big ideas: big data.\r\n\r\nGiá sản phẩm trên Tiki đã bao gồm thuế theo luật hiện hành. Tuy nhiên tuỳ vào từng loại sản phẩm hoặc phương thức, địa chỉ giao hàng mà có thể phát sinh thêm chi phí khác như phí vận chuyển, phụ phí hàng cồng kềnh, ...', 330000, 320, '../images/Hinhsach/S000010.png', 4, 0),
('S000011', 'How Not To Be Wrong: The Hidden Maths Of Everyday Life', 'Jordan Ellenberg', 'Penguin Random House UK', 2015, 'Sách Khoa Học Công Nghệ', 'Tiếng Anh', 'THE SUNDAY TIMES BESTSELLER\r\n\r\nThe maths we learn in school can seem like an abstract set of rules, laid down by the ancients and not to be questioned. In fact, Jordan Ellenberg shows us, maths touches on everything we do, and a little mathematical knowledge reveals the hidden structures that lie beneath the world\'s messy and chaotic surface. In How Not to be Wrong, Ellenberg explores the mathematician\'s method of analyzing life, from the everyday to the cosmic, showing us which numbers to defend, which ones to ignore, and when to change the equation entirely. Along the way, he explains calculus in a single page, describes Gödel\'s theorem using only one-syllable words, and reveals how early you actually need to get to the airport.', 320000, 468, '../images/Hinhsach/S000011.png', 3, 0),
('S000012', 'The Wonderful Wizard Of Oz: A Commemorative Pop-Up', 'Robert Sabuda', 'Simon And Schuster', 2001, 'Sách Thiếu Nhi', 'Tiếng Anh', 'Robert Sabuda has created a resplendent pop-up version of The Wonderful Wizard of Oz to celebrate the 100th anniversary of the original publication. This glorious edition is told in a shorter version of L. Frank Baum\'s original text, with artwork in the style of W. W. Denslow. With sparkling touches of colored foil and Emerald City eyeglasses, this classic tale is certain to find an honored place on the family bookshelf.', 535000, 16, '../images/Hinhsach/S000012.png', 3, 0),
('S000013', 'I-Learn Smart Start 2 Student Book', 'Paperback', 'Nhà Xuất Bản Đại Trường Phát', 2016, 'Sách Học Ngoại Ngữ', 'Tiếng Anh', 'Smart Start is a 5-level course for young learners of English. It has been developed by an experienced team of International and Vietnamese writers and teachers to be a perfect fit for the Vietnamese classroom.\r\n\r\n- Solid curriculum\r\n\r\nBased on  the Cambridge Young Learner\'s syllabus and the Vietnamese Ministry of Education and Training (MOET) guidelines.\r\n\r\n- User-friendly lesson format\r\n\r\nClear, consistent, and logical format makes lessons easy to prepare, teach, and understand.\r\n\r\n- Proven, mmotivational materials\r\n\r\nCatchy songs, colorful comic strips, and fun games catch students\' interest.\r\n\r\n- Effective balance of skills\r\n\r\nA level appropriate mix of Listening, Speaking, Reading and Writing tasks to systematically develop student abilities.\r\n\r\n- Knowledge and culture focus\r\n\r\nCore subjects (math, science, geoography, etc.) and moral lessons (be helpful, respect elders, be neat and tidy, etc.) are covered within a Vietnamese cutural setting.\r\n\r\n- Test taking skills\r\n\r\nEach theme includes excercises that familiarize students with the common tasks they will find on exams like the Cambridge Young Learners exams.', 108000, 128, '../images/Hinhsach/S000013.png', 3, 1),
('S000014', 'Everybody Up 3 Student\'s Book', 'Susan Banman Sileci', 'Oxford University Press', 2017, 'Sách Học Ngoại Ngữ', 'Tiếng Anh', 'Everybody Up encourages children to use language in a natural and meaningful way by connecting English to their own lives. Colorful cross-curricular lessons link English to other school subjects. Fun stories teach life lessons such as being kind and polite. Great songs, and the special Everybody Up Friends, motivate children to practice English - even at home! ', 265000, 80, '../images/Hinhsach/S000014.png', 3, 1),
('S000015', 'Diary Of A Wimpy Kid 01: A Novel In Cartoons', 'Jeff Kinney', 'Penguin Random House', 2008, 'Sách Thiếu Nhi', 'Tiếng Anh', 'The hilarious and original global bestseller Diary of a Wimpy Kid - perfect for readers of 8+ and also reluctant readers, everyone loves the adventures of Greg Heffley. Now a major film series, Diary of a Wimpy Kid: The Long Haul is in cinemas now!\r\n\r\nLet me get something straight: this is a JOURNAL, not a diary. This was Mom\'s idea, not mine. But if she thinks I\'m going to write down my \"feelings\" in here or whatever, she\'s crazy.\r\n\r\nThe only reason I agreed to do this at all is because I figure later on when I\'m rich and famous, this book is gonna come in handy.\r\n\r\nBut for now I\'m stuck with a bunch of morons.\r\n\r\nToday is the first day of school, so I figured I might as well write in this book to pass the time.\r\n\r\nJust don\'t expect me to be all \"Dear Diary\" this and \"Dear Diary\" that.\r\n\r\nPraise for Jeff Kinney:\r\n\r\n\'The world has gone crazy for Jeff Kinney\'s Diary of a Wimpy Kid\' - Sun\r\n\r\n\'Kinney is right up there with J K Rowling as one of the bestselling children\'s authors on the planet\' - Independent\r\n\r\n\'The most hotly anticipated children\'s book of the year is here - Diary of a Wimpy Kid\' - Big Issue\r\n\r\n\'Hilarious\' - Telegraph', 136000, 224, '../images/Hinhsach/S000015.png', 3, 0),
('S000016', 'Các Thế Giới Song Song (Tái Bản 2018)', 'Michio Kaku ', 'Nhà Xuất Bản Thế Giới', 2018, 'Sách Khoa Học Công Nghệ', 'Tiếng Việt', 'Một chuyến du hành đầy trí tuệ qua các vũ trụ, được dẫn dắt tài tình bởi \"thuyền trưởng\" Michio Kaku và độc giả có dịp chiêm ngưỡng vẻ đẹp kỳ vĩ của vũ trụ kể từ vụ nổ lớn, vượt qua những hố đen, lỗ sâu, bước vào các thế giới lượng tử từ muôn màu kỳ lạ nằm ngay trước mũi chúng ta, vốn dĩ tồn tại song song trên một màng bên ngoài không - thời gian bốn chiều, ngắm nhìn thực tại vật chất quen thuộc hoà quyện với thế giới của những điều kỳ diệu như năng lượng và vật chất tối, sự nảy chồi của các vũ trụ, những chiều không gian bí ẩn và sự biến ảo của các dây rung siêu nhỏ...\r\n\r\nDẫn chuyện lôi cuốn, kết hợp tường minh, sống động một lượng thông tin đồ sộ để khai mở những giới hạn tột cùng của trí  tưởng tượng, Kaku thực sự xứng đáng là \" nhà truyền giáo\" vĩ đại đã mang thế giới vật lý lý thuyết tới quảng đại quần chúng.', 83000, 480, '../images/Hinhsach/S000016.png', 3, 1),
('S000017', 'Toán Học, Một Thiên Tiểu Thuyết', 'Mickael Launay ', 'Nhà Xuất Bản Thế Giới', 2019, 'Sách Khoa Học Công Nghệ', 'Tiếng Việt', 'Hầu hết mọi người đều thích toán, tiếc là họ không biết điều này!\r\n\r\nBởi ai mà chẳng thấy hấp dẫn với những mẩu chuyện kỳ thú về toán: như “giáo phái” toán học kỳ lạ của Pythagoras thời cổ đại hay những cuộc thăm dò hệ mặt trời bằng công cụ toán học đầy kịch tính thời cận đại, hoặc gần đây hơn là sự kiện máy tính AlphaGo giành chiến thắng trước kỳ thủ cờ vây số một thế giới Lee Sedol bằng những nước đi “thần thánh” sử dụng lý thuyết xác suất.\r\n\r\nToán học khai sinh vì lý do hữu dụng, hẳn nhiên. Vào thời tiền sử, người ta nghĩ ra những con số để đếm đàn gia súc, dùng hình học để đo ruộng đất, làm đường sá. Loài home sapiens chúng ta không ngừng tò mò muốn khám phá thế giới tự nhiên xung quanh, nên suốt mấy ngàn năm qua toán học đã tiến lên phía trước với những bước khổng lồ và ngày càng trừu tượng.\r\n\r\nMickael Launay không chỉ cho người đọc thấy cái đẹp, chất thơ của toán học mà còn xác quyết một điều khác, rằng mọi người đều có thể yêu thích toán học và đều có thể cảm nhận được vẻ đẹp tự nhiên của nó. Cuốn sách này là một minh chứng cho điều đó.', 72000, 332, '../images/Hinhsach/S000017.png', 3, 1),
('S000018', 'Luyện Nói Tiếng Anh Như Người Bản Ngữ ', 'A.J.Hoge', 'Nhà Xuất Bản Đại Học Quốc Gia Hà Nội', 2015, 'Sách Học Ngoại Ngữ', 'Tiếng Việt', 'Effortless English – Luyện nói tiếng Anh như người bản ngữ – Phương pháp học tiếng Anh nổi tiếng thế giới, kết quả đã được kiểm chứng\r\n\r\nNhững vấn đề sau có đang làm khó các bạn?\r\n\r\nMất cảm hứng, chán nản khi học Tiếng Anh\r\nBạn đã bao lần từ bỏ việc học tiếng Anh vì ngày này qua tháng nọ dường như cứ mãi dậm chân tại chỗ dù đã thử nhiều phương pháp. Học tiếng Anh từ lớp 3 nhưng đến lúc tốt nghiệp đại học trình độ nhiều bạn vẫn chỉ dừng lại ở những câu đơn giản như “hello”, “hi”,…\r\n\r\nCuốn sách gồm 23 chương trong đó có tới 8 chương cung cấp cho người học những quy tắc và bí quyết giúp các bạn có thể nói tiếng Anh thành thạo. Những quy tắc được trình bày dễ hiểu, dễ ghi nhớ và phù hợp với người Việt chúng ta.\r\n\r\n– Quy tắc đầu tiên: Học theo cụm từ – không học đơn lẻ\r\n\r\n– Quy tắc thứ hai: Hoc ngữ pháp sẽ hạn chế khả năng nói của bạn\r\n\r\n– Quy tắc thứ ba: Học bằng tai không phải học bằng mắt\r\n\r\n– Quy tắc thứ tư: Lặp lại là chìa khóa để nắm vững kỹ năng nói tiếng Anh\r\n\r\n– Quy tắc thứ năm: Học ngữ pháp một cách trực quan và tự nhiên\r\n\r\n– Quy tắc thứ sáu: Hãy học tiếng Anh thực tế và tạm bỏ những cuốn giáo trình\r\n\r\n– Quy tắc thứ bảy: Học tiếng Anh với các câu chuyện hấp dẫn\r\n\r\n– Bí quyết để có kỹ năng viết tiếng Anh tốt\r\n\r\nChắc chắn thông qua hệ thống quy tắc và bí quyết này các bạn có thể thay đổi được tư duy nói tiếng Anh một cách khoa học.', 150000, 303, '../images/Hinhsach/S000018.png', 3, 1),
('S000019', 'Ngữ Pháp Tiếng Hàn Thông Dụng - Sơ Cấp ', 'Ahn Jean-myung', 'Nhà Xuất Bản Hồng Đức', 2015, 'Sách Học Ngoại Ngữ', 'Tiếng Việt', 'Cuốn sách này được thiết kế hoàn toàn phù hợp với những người mới bắt đầu học tiếng Hàn. Sách gồm có 3 phần chính tổng hợp các kiến thức chính về ngữ pháp tiếng Hàn sơ cấp và thêm nhiều phần kiến thức liên quan:\r\n\r\n– Phần 1: Giới thiệu tiếng Hàn Quốc (Phần này sẽ giúp các bạn bước đầu có những hình dung về tiếng Hàn, là tiền đề để bạn học tốt môn ngoại ngữ này)\r\n\r\n– Phần 2: 24 bài học hệ thống các cấu trúc ngữ pháp phù hợp với trình độ của các bạn\r\n\r\n– Phần 3: Phụ lục (Cung cấp thêm nhiều kiến thức bổ trợ và đáp án cho các bài luyện tập ở phía trước)\r\n...', 143000, 379, '../images/Hinhsach/S000019.png', 3, 1),
('S000020', '301 Câu Đàm Thoại Tiếng Hoa (Tái Bản)', 'Trần Thanh Liêm', 'Nhà Xuất Bản Hồng Đức', 2018, 'Sách Học Ngoại Ngữ', 'Tiếng Việt', 'Giáo trình \"\"301 câu đàm thoại tiếng Hoa\"\" được biên dịch và bổ sung dựa trên cơ sở cuốn sách giáo khoa \"\" Hán ngữ hội thoại 301\"\" do các chuyên gia Hán ngữ của học viện ngôn ngữ Bắc kinh biên soạn.\r\n\r\nGiáo trình gồm 48 bài trong đó có 8 bài ôn tập, bao quát trên 800 từ thường dùng. Nội dung các bài tập gồm các phần \"\"Mẫu câu\"\", \"\"Đàm thoại\"\", \"\"Từ mới\"\", \"\"Chú ý từ ngữ\"\", \"\"Ngữ pháp\"\", \"\"bài tập\"\"... \r\n\r\nGiáo trình biên soạn theo hướng \"\"mẫu câu\"\" để đi vào thực hành giao tiếp, nhưng cũng giới thiếu khái quát cấu trúc ngữ pháp của tiếng Hán hiện đại.', 44000, 416, '../images/Hinhsach/S000020.png', 3, 1),
('S000021', '365 Truyện Kể Hằng Đêm - Mùa Thu', 'Lưu Hồng Hà', 'Nhà Xuất Bản Đại Học Sư Phạm', 2015, 'Sách Thiếu Nhi', 'Tiếng Việt', 'Trẻ nhỏ thường nhận thức thế giới qua những điều đơn giản. Chính vì thế, những quan điểm chuẩn mực về đạo đức của mỗi người thường bắt nguồn từ những câu chuyện nghe kể từ thuở ấu thơ.\r\n\r\nCuốn sách tập hợp những truyện ngụ ngôn, đồng thoại, cổ tích đặc sắc từ xưa đến nay của nhiều quốc gia trên thế giới. Mỗi câu chuyện là một bài học nhỏ với các tình tiết sống động, hấp dẫn. Hy vọng rằng, cuốn sách sẽ trở thành một người bạn gần gũi, thân thiết của các em trong quá trình hình thành những phẩm chất tốt đẹp, tạo nền tảng vững chắc cho sự hình thành nhân cách trong tương lai.', 60000, 190, '../images/Hinhsach/S000021.png', 3, 1),
('S000022', '365 Thí Nghiệm Khoa Học Dành Cho Trẻ Em', 'Om Books', 'Nhà Xuất Bản Thế Giới', 2019, 'Sách Thiếu Nhi', 'Tiếng Việt', 'Cũng là những tri thức, nhưng chúng không cứng nhắc và khô khan như chúng ta vẫn thường thấy.\r\n\r\nNgười đọc sẽ nhanh chóng bị lôi cuốn vào một thế giới đầy bí ẩn, nơi đó, chúng ta như được đối thoại cùng những người nổi tiếng. Chúng ta sẽ được tìm hiểu về họ, đối thoại cùng họ, và từ lúc nào, chúng ta đã thu nhận được những tri thức vô cùng thú vị.\r\n\r\nBạn sẽ được tìm hiểu về cuộc sống, sở thích và các thí nghiệm khoa học từ những vật dụng xung quanh chúng ta thông qua những câu chuyện thú vị và những bức tranh sinh động. Những điều được thể hiện qua mỗi thí nghiệm đều là nghiêm túc. Sau mỗi thí nghiệm sẽ là một kiến thức hữu ích . Tiếp thu những kiến thức của cuốn sách này, trong tương lai không xa, chắc chắn bạn sẽ thành công.\r\n\r\nBộ sách thích hợp cho mọi lứa tuổi, mọi đối tượng độc giả, đặc biệt là các em học sinh. Chắc chắn các em học sinh sẽ thích bộ sách sinh động và bổ ích này.', 43000, 236, '../images/Hinhsach/S000022.png', 3, 1),
('S000023', 'Sách kỹ năng - Cẩm nang an toàn cho bé', 'Vũ Tuấn Anh', 'Nhà Xuất Bản Thế Giới', 2013, 'Sách Thiếu Nhi', 'Tiếng Việt', 'Cẩm Nang An Toàn Cho Bé\r\n\r\nCác bạn nhỏ liệu đã biết cách giữ an toàn cho bản thân mình chưa nhỉ? Nếu bếp ga trong nhà bốc cháy, có người lạ đến gõ cửa nhà, đi qua bãi rác có nhiều mảnh sành vỡ, đi giữa đường gặp cơn mưa giông, đang đi siêu thị đột nhiên lạc bố mẹ... thì bạn làm thế nào?\r\n\r\nHãy cùng bốn người bạn dễ thương CÚN ĐỐM, CHUỘT LANG, LẠC ĐÀ, QUẠ CẬN trong cuốn cẩm nang này học giữ an toàn mọi nơi mọi lúc, khi ở nhà cũng như lúc ra đường!Cẳm Nang An Toàn Cho Bé, cuốn sách không thể thiếu cho các bạn nhỏ ham học hỏi về mọi thứ xung quanh; cho các bậc phụ huynh muốn dạy con tự bảo vệ mình', 57000, 108, '../images/Hinhsach/S000023.png', 3, 0),
('S000024', 'Tủ Sách Ehon - Bốn Mùa Ở Nhà Trẻ', 'Fujita Hioko - Aka Shozo ', 'Nhà Xuất Bản Lao Động', 2015, 'Sách Thiếu Nhi', 'Tiếng Việt', 'Cuốn sách được viết bởi một ông bố, qua những cuộc đối thoại với con để làm bạn với con, để dạy con cũng như dạy chính mình.\r\n\r\n\"Con chúng ta có thể không phải là thiên tài nhưng chúng hoàn toàn có thể là những người tốt” chỉ cần chúng ta biết trò chuyện với chúng.\r\n\r\n\"Với trẻ con, thì khái niệm sở hữu được làm quen dần dần, \"Nhi Bá có cái gì đó\" cũng như “Nhi Bá không có cái gì đó\", đều quan trọng như nhau. Con trai ạ, rồi con sẽ còn phải hiểu cái gì không có thì sẽ làm như thế nào để có được, lại còn phải hiểu, mong cầu ít thôi, biết thế nào là đủ với mình; mong cầu mà không đạt được, là khổ lắm đấy con à…\" – Phúc Lai', 39000, 40, '../images/Hinhsach/S000024.png', 3, 2),
('S000026', 'Sách Thử', '12312312', '321321', 2002, '321312', 'sadasd', '213123', 321312, 3213, 'C:UsersNTHPictures123123123213213213adsad.png', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lydophat`
--

CREATE TABLE `lydophat` (
  `maLDPhat` varchar(9) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenLDPhat` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mucDo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lydophat`
--

INSERT INTO `lydophat` (`maLDPhat`, `tenLDPhat`, `mucDo`) VALUES
('LDP000001', 'Mất sách', 70),
('LDP000002', 'Hư sách', 50),
('LDP000003', 'Trả sách trễ hạn', 20);

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `maNCC` varchar(9) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenNCC` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(11) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `diaChi` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhacungcap`
--

INSERT INTO `nhacungcap` (`maNCC`, `tenNCC`, `sdt`, `email`, `diaChi`) VALUES
('NCC000001', 'Nhà sách Fahasa', '1900636467', 'info@fahasa.com', 'Cầu Giấy, Hà Nội'),
('NCC000002', 'Nhà sách Cá Chép', '0862905695', 'nhasachcachep@gmail.com', 'Nhân Chính, Thanh Xuân, Hà Nội'),
('NCC000003', 'Nhà sách Hà Nội', '0834729034', 'nhasachhanoi@gmail.com', 'Hà Nội');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNhanVien` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `password_hashed` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `salt` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `RFID_code` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hoTen` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngaySinh` date NOT NULL,
  `diaChi` varchar(65) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `chucVu` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`maNhanVien`, `password`, `password_hashed`, `salt`, `hoTen`, `ngaySinh`, `diaChi`, `sdt`, `email`, `chucVu`) VALUES
('QL000001', 'QL000001', '261f3be78d4c3ff12e00380e0bdfd72f', '41baa34f66cffd82ffc788a4cd70bf9d', 'Nguyễn Mai Ngọc Bích', '1988-11-02', '360 Kim Mã Q. Ba Đình, Hà Nội', '0358990124', 'ngocbich@gmail.com', 'Thủ Thư'),
('QL000002', 'QL000002', '644694fb9c214c9f5b8aa23b2048cc25', '1a10f8e2a08c1816208daf3393c98fe8', 'Nguyễn Đức Minh', '1985-02-13', '110 Thái Thịnh, Q. Đống Đa', '0705145202', 'minhnguyen@gmail.com', 'Quản Lý Kho'),
('QL000003', 'QL000003', 'bba1f6527b49b8df760d0ea3f476e9c2', '074484fe51ca878e492e6898f38cdec8', 'Lê Vân Nhi', '1992-07-17', '1C Tôn Đản, Q. Ba Đình', '0903214760', 'vannhi@gmail.com', 'Thủ Thư'),
('QL000004', 'QL000004', 'a42f93001586d44e00c07dcd46e716fe', '891e9f4d62ab25189cf57339d3e33ad1', 'Lê Gia An', '1987-10-20', '146 Giảng Võ, Q. Ba Đình', '0345905191', 'anle@gmail.com', 'Quản Lý Kho'),
('QL000005', 'QL000005', 'ed5deec89a88cb076472f0b136d0a030', 'ff9209aa59464468825a1f0913091b42', 'Phạm Ánh Dương', '1994-03-15', '43B Ngô Quyền, Q. Hoàn Kiếm', '0935120275', 'anhduong@gmail.com', 'Thủ Thư'),
('QL000006', 'QL000006', '843fe76766b5c0d0ffc7c3583246b2b9', 'a80c2affb865c229f56a649f2164e595', 'Phạm Thiên Ân', '1990-01-31', '16 Nguyễn Văn Cừ, Q. Long Biên, Hà Nội', '0950123589', 'anhpham@gmail.com', 'Quản Lý Kho'),
('QL000007', 'QL000007', '9d6310310461250cdb0bb18b0ef16b43', 'd999be8f5ecb928d724d9d75c40b6d4f', 'Đặng Gia Hân', '1993-05-29', 'Thị trấn Đông Anh, H. Đông Anh, Hà Nội', '0795342467', 'giahan@gmail.com', 'Thủ Thư'),
('QL000008', 'QL000008', '9da165e83f191c30a12f7967fe26efbe', '58b8fec34661f027c73c8e0f8570eee1', 'Đặng Ngọc Gia Nguyên', '1986-08-20', 'đường Nguyễn Trãi, Q. Thanh Xuân', '0940567316', 'nguyendang@gmail.com', 'Quản Lý Kho'),
('QL000009', 'QL000009', '47eb5e5512db203625dafa28206a9b47', 'd46cc4babf75a7e4c628b1da9f0c7c28', 'Đỗ Phương Thảo', '1995-10-10', '297D Kim Mã, Q. Ba Đình, Hà Nội', '0775428796', 'phuongthao@gmail.com', 'Thủ Thư'),
('QL000010', 'QL000010', '399f364e690c3244387ab088176d06db', 'e303f79fc666c869495c005830d4e632', 'Đỗ Quang Khải', '1986-12-24', '13 Bùi Thị Xuân, Q. Hai Bà Trưng, Hà Nội', '0902464703', 'khaido@gmail.com', 'Quản Lý Kho');

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

CREATE TABLE `phieumuon` (
  `maPhieuMuon` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `maThe` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `ngayMuon` date NOT NULL,
  `thoiGianMuon` int(11) NOT NULL,
  `ngayTra` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieumuon`
--

INSERT INTO `phieumuon` (`maPhieuMuon`, `maThe`, `ngayMuon`, `thoiGianMuon`, `ngayTra`) VALUES
('M000001', 'T000001', '2023-01-10', 14, '2023-01-20'),
('M000002', 'T000002', '2023-01-25', 14, '2023-01-29'),
('M000003', 'T000003', '2023-02-04', 14, '2023-02-20'),
('M000004', 'T000003', '2023-02-12', 14, '2023-02-23'),
('M000005', 'T000004', '2023-02-12', 28, '2023-03-12'),
('M000006', 'T000005', '2023-02-12', 28, '2023-03-13'),
('M000007', 'T000007', '2023-02-15', 14, '2023-02-21'),
('M000008', 'T000006', '2023-02-20', 14, '2023-02-25'),
('M000009', 'T000006', '2023-02-20', 14, '2023-02-25'),
('M000010', 'T000007', '2023-02-28', 56, '2023-04-28'),
('M000011', 'T000008', '2023-03-14', 28, '2023-04-08'),
('M000012', 'T000009', '2023-03-20', 56, '2023-04-28'),
('M000013', 'T000010', '2023-04-03', 28, '2023-04-26'),
('M000014', 'T000011', '2023-04-08', 14, '2023-04-25'),
('M000015', 'T000012', '2023-04-16', 28, '2023-05-12'),
('M000016', 'T000013', '2023-04-18', 28, '2023-05-06'),
('M000017', 'T000014', '2023-04-21', 14, '2023-04-25'),
('M000018', 'T000014', '2023-05-02', 14, '2023-05-06'),
('M000019', 'T000015', '2023-05-02', 14, '2023-05-19'),
('M000020', 'T000016', '2023-05-09', 14, '2023-05-21'),
('M000021', 'T000017', '2023-05-11', 28, '2023-06-12'),
('M000022', 'T000018', '2023-05-21', 56, '2023-06-25'),
('M000023', 'T000019', '2023-06-02', 14, '2023-06-06'),
('M000024', 'T000020', '2023-06-07', 14, '2023-06-15'),
('M000025', 'T000001', '2022-01-15', 14, '2022-01-18'),
('M000026', 'T000002', '2022-01-23', 14, '2022-01-25'),
('M000027', 'T000002', '2022-01-29', 14, '2022-01-31'),
('M000028', 'T000003', '2022-02-06', 14, '2022-02-13'),
('M000029', 'T000004', '2022-02-21', 14, '2022-02-28'),
('M000030', 'T000005', '2022-03-18', 14, '2022-03-23'),
('M000031', 'T000006', '2022-03-28', 14, '2022-03-30'),
('M000032', 'T000007', '2022-04-03', 14, '2022-04-10'),
('M000033', 'T000008', '2022-04-14', 14, '2022-04-20'),
('M000034', 'T000009', '2022-05-11', 14, '2022-05-18'),
('M000035', 'T000009', '2022-05-11', 14, '2022-05-18'),
('M000036', 'T000010', '2022-05-23', 14, '2022-05-30'),
('M000037', 'T000010', '2022-05-23', 14, '2022-05-30'),
('M000038', 'T000011', '2022-06-20', 14, '2022-06-26'),
('M000039', 'T000011', '2022-06-20', 14, '2022-06-26'),
('M000040', 'T000012', '2022-07-09', 14, '2022-07-13'),
('M000041', 'T000012', '2022-07-09', 14, '2022-07-13'),
('M000042', 'T000013', '2022-07-15', 14, '2022-07-22'),
('M000043', 'T000013', '2022-07-15', 14, '2022-07-22'),
('M000044', 'T000014', '2022-08-14', 14, '2022-08-20'),
('M000045', 'T000014', '2022-08-14', 14, '2022-08-20'),
('M000046', 'T000015', '2022-08-22', 14, '2022-08-29'),
('M000047', 'T000015', '2022-08-22', 14, '2022-08-29'),
('M000048', 'T000016', '2022-09-09', 14, '2022-09-14'),
('M000049', 'T000016', '2022-09-09', 14, '2022-09-14'),
('M000050', 'T000017', '2022-09-18', 14, '2022-09-30'),
('M000051', 'T000017', '2022-09-18', 14, '2022-09-30'),
('M000052', 'T000018', '2022-10-08', 14, '2022-10-15'),
('M000053', 'T000018', '2022-10-08', 14, '2022-10-15'),
('M000054', 'T000019', '2022-11-14', 28, '2022-11-29'),
('M000055', 'T000019', '2022-11-30', 14, '2022-12-03'),
('M000056', 'T000020', '2022-12-12', 14, '2022-12-16'),
('M000057', 'T000020', '2022-12-12', 14, '2023-12-16'),
('M000058', 'T000020', '2022-12-23', 14, '2022-12-28'),
('M000059', 'T000020', '2022-12-23', 14, '2022-12-28'),
('M000060', 'T000003', '2023-01-03', 14, '2023-01-10'),
('M000061', 'T000004', '2023-01-04', 14, '2023-01-11'),
('M000062', 'T000005', '2023-01-07', 14, '2023-01-21'),
('M000063', 'T000006', '2023-01-11', 14, '2023-01-18'),
('M000064', 'T000007', '2023-01-13', 14, '2023-01-18'),
('M000065', 'T000008', '2023-01-15', 14, '2023-01-22'),
('M000066', 'T000009', '2023-01-18', 14, '2023-01-25'),
('M000067', 'T000010', '2023-01-20', 14, '2023-01-25'),
('M000068', 'T000011', '2023-01-23', 14, '2022-11-28'),
('M000069', 'T000001', '2023-03-02', 14, '2023-03-09'),
('M000070', 'T000002', '2023-03-05', 14, '2023-03-12'),
('M000071', 'T000012', '2023-03-06', 14, '2023-03-13'),
('M000072', 'T000006', '2023-03-08', 14, '2023-03-15'),
('M000073', 'T000010', '2023-03-13', 14, '2023-03-20'),
('M000074', 'T000011', '2023-03-24', 14, '2023-03-29'),
('M000075', 'T000001', '2023-04-06', 14, '2023-04-14'),
('M000076', 'T000002', '2023-04-10', 14, '2023-04-24'),
('M000077', 'T000002', '2023-05-23', 14, '2023-05-31'),
('M000078', 'T000002', '2023-06-04', 14, '2023-06-11'),
('M000079', 'T000005', '2023-06-06', 14, '2023-06-20'),
('M000080', 'T000013', '2023-06-13', 14, '2023-06-16'),
('M000081', 'T000003', '2023-01-02', 14, '2023-01-08'),
('M000082', 'T000012', '2023-01-05', 14, '2023-01-11'),
('M000083', 'T000013', '2023-01-12', 14, '2023-01-18'),
('M000084', 'T000014', '2023-01-14', 14, '2023-01-21'),
('M000085', 'T000008', '2023-02-05', 14, '2023-02-12'),
('M000086', 'T000009', '2023-02-10', 14, '2023-02-24'),
('M000087', 'T000010', '2023-02-24', 14, '2023-02-29'),
('M000088', 'T000014', '2023-03-03', 14, '2023-03-07'),
('M000089', 'T000013', '2023-03-04', 14, '2023-03-10'),
('M000090', 'T000015', '2023-03-07', 14, '2023-03-14'),
('M000091', 'T000016', '2023-03-09', 14, '2023-03-17'),
('M000092', 'T000017', '2023-03-10', 14, '2023-03-14'),
('M000093', 'T000018', '2023-03-11', 14, '2023-03-18'),
('M000094', 'T000019', '2023-03-12', 14, '2023-03-19'),
('M000095', 'T000003', '2023-04-04', 14, '2023-04-10'),
('M000096', 'T000004', '2023-04-05', 14, '2023-04-19'),
('M000097', 'T000005', '2023-04-07', 14, '2023-04-21'),
('M000098', 'T000006', '2023-04-09', 14, '2023-04-23'),
('M000099', 'T000012', '2023-04-11', 14, '2023-04-25'),
('M000100', 'T000013', '2023-04-12', 14, '2023-04-26'),
('M000101', 'T000015', '2023-04-13', 14, '2023-04-27'),
('M000102', 'T000016', '2023-04-14', 14, '2023-04-28'),
('M000103', 'T000017', '2023-04-15', 14, '2023-04-29'),
('M000104', 'T000018', '2023-04-16', 14, '2023-04-24'),
('M000105', 'T000019', '2023-04-17', 14, '2023-04-24'),
('M000106', 'T000003', '2023-05-04', 14, '2023-05-18'),
('M000107', 'T000004', '2023-05-06', 14, '2023-05-13'),
('M000108', 'T000005', '2023-05-06', 14, '2023-05-20'),
('M000109', 'T000006', '2023-05-07', 14, '2023-05-14'),
('M000110', 'T000007', '2023-05-08', 14, '2023-05-15'),
('M000111', 'T000008', '2023-05-10', 14, '2023-05-16'),
('M000112', 'T000010', '2023-05-12', 14, '2023-05-26'),
('M000113', 'T000011', '2023-05-20', 14, '2023-05-30'),
('M000114', 'T000017', '2023-05-22', 14, '2023-05-29'),
('M000115', 'T000001', '2023-06-01', 14, '2023-06-06'),
('M000116', 'T000003', '2023-06-03', 14, '2023-06-10'),
('M000117', 'T000004', '2023-06-05', 14, '2023-06-18'),
('M000118', 'T000006', '2023-06-08', 14, '2023-06-13'),
('M000119', 'T000007', '2023-06-09', 14, '2023-06-13'),
('M000120', 'T000008', '2023-06-10', 14, '2023-06-13'),
('M000121', 'T000009', '2023-06-11', 14, '2023-06-18'),
('M000122', 'T000010', '2023-06-12', 14, '2023-06-19'),
('M000123', 'T000011', '2023-06-14', 14, '2023-06-20'),
('M000124', 'T000012', '2023-06-15', 14, '2023-06-20'),
('M000125', 'T000014', '2023-06-16', 14, '2023-06-23'),
('M000126', 'T000015', '2023-06-17', 14, '2023-06-24'),
('M000127', 'T000016', '2023-06-18', 14, '2023-06-25'),
('M000128', 'T000003', '2022-01-05', 14, '2022-01-19'),
('M000129', 'T000004', '2022-01-06', 14, '2022-01-20'),
('M000130', 'T000005', '2022-01-07', 14, '2022-01-21'),
('M000131', 'T000007', '2022-01-08', 14, '2022-01-22'),
('M000132', 'T000001', '2022-02-02', 14, '2022-02-09'),
('M000133', 'T000002', '2022-02-04', 14, '2022-02-18'),
('M000134', 'T000007', '2022-02-09', 14, '2022-02-28'),
('M000135', 'T000005', '2022-02-12', 14, '2022-02-26'),
('M000136', 'T000006', '2022-02-15', 14, '2022-02-22'),
('M000137', 'T000001', '2022-03-03', 14, '2022-03-17'),
('M000138', 'T000002', '2022-03-06', 14, '2022-03-20'),
('M000139', 'T000003', '2022-03-09', 14, '2022-03-23'),
('M000140', 'T000004', '2022-03-23', 14, '2022-03-31'),
('M000141', 'T000001', '2022-04-05', 14, '2022-04-19'),
('M000142', 'T000002', '2022-04-12', 14, '2022-04-26'),
('M000143', 'T000003', '2022-04-23', 14, '2022-04-30'),
('M000144', 'T000001', '2022-05-09', 14, '2022-05-23'),
('M000145', 'T000002', '2022-05-15', 14, '2022-05-22'),
('M000146', 'T000003', '2022-05-20', 14, '2022-05-30'),
('M000147', 'T000001', '2022-06-10', 14, '2022-06-24'),
('M000148', 'T000002', '2022-06-15', 14, '2022-06-29'),
('M000149', 'T000004', '2022-06-21', 14, '2022-06-28'),
('M000150', 'T000003', '2022-06-23', 14, '2022-06-29'),
('M000151', 'T000001', '2022-07-10', 14, '2022-07-24'),
('M000152', 'T000002', '2022-07-24', 14, '2022-07-31'),
('M000153', 'T000007', '2022-08-06', 14, '2022-08-20'),
('M000154', 'T000008', '2022-08-10', 14, '2022-08-24'),
('M000155', 'T000009', '2022-08-16', 14, '2022-08-30'),
('M000156', 'T000010', '2022-08-24', 14, '2022-08-31'),
('M000157', 'T000001', '2022-09-10', 14, '2022-09-24'),
('M000158', 'T000002', '2022-09-12', 14, '2022-09-26'),
('M000159', 'T000003', '2022-09-24', 14, '2022-09-30'),
('M000160', 'T000001', '2022-10-15', 14, '2022-10-29'),
('M000161', 'T000002', '2022-10-18', 14, '2022-10-22'),
('M000162', 'T000003', '2022-10-23', 14, '2022-10-31'),
('M000163', 'T000002', '2022-11-15', 14, '2022-11-29'),
('M000164', 'T000003', '2022-11-18', 14, '2022-11-25'),
('M000165', 'T000004', '2022-11-25', 14, '2022-11-30'),
('M000166', 'T000001', '2022-12-02', 14, '2022-12-16'),
('M000167', 'T000002', '2022-12-06', 14, '2022-12-13'),
('M000168', 'T000003', '2022-12-17', 14, '2022-12-24'),
('M000169', 'T000004', '2022-12-26', 14, '2022-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `maNhap` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `ngayNhap` date NOT NULL,
  `maNhanVien` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `maNCC` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `tongSoLuong` int(11) DEFAULT NULL,
  `tongTien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`maNhap`, `ngayNhap`, `maNhanVien`, `maNCC`, `tongSoLuong`, `tongTien`) VALUES
('N0000001', '2022-01-03', 'QL000002', 'NCC000001', 50, 7221000),
('N0000002', '2023-03-08', 'QL000010', 'NCC000002', 100, 18248000),
('N0000003', '2023-06-16', 'QL000004', 'NCC000003', 72, 11838000);

-- --------------------------------------------------------

--
-- Table structure for table `phieuphat`
--

CREATE TABLE `phieuphat` (
  `maPhieuPhat` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maPhieuMuon` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tienPhat` int(11) DEFAULT NULL,
  `maLDPhat` varchar(9) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieuphat`
--

INSERT INTO `phieuphat` (`maPhieuPhat`, `maPhieuMuon`, `tienPhat`, `maLDPhat`) VALUES
('P000001', 'M000003', 0, 'LDP000003'),
('P000002', 'M000005', 0, 'LDP000003'),
('P000003', 'M000006', 0, 'LDP000003'),
('P000004', 'M000010', 0, 'LDP000003'),
('P000005', 'M000014', 0, 'LDP000003'),
('P000006', 'M000019', 0, 'LDP000003'),
('P000007', 'M000018', 0, 'LDP000003'),
('P000008', 'M000021', 0, 'LDP000003'),
('P000009', 'M000001', 0, 'LDP000002'),
('P000010', 'M000013', 0, 'LDP000002'),
('P000011', 'M000015', 0, 'LDP000002'),
('P000012', 'M000020', 0, 'LDP000002'),
('P000013', 'M000022', 0, 'LDP000002'),
('P000014', 'M000002', 0, 'LDP000001'),
('P000015', 'M000011', 0, 'LDP000001'),
('P000016', 'M000016', 0, 'LDP000001');

-- --------------------------------------------------------

--
-- Table structure for table `phieuxuat`
--

CREATE TABLE `phieuxuat` (
  `maXuat` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `ngayXuat` date NOT NULL,
  `maNhanVien` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `tongSoLuong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieuxuat`
--

INSERT INTO `phieuxuat` (`maXuat`, `ngayXuat`, `maNhanVien`, `tongSoLuong`) VALUES
('X0000001', '2023-01-10', 'QL000002', 48),
('X0000002', '2023-03-09', 'QL000008', 24),
('X0000003', '2023-04-14', 'QL000010', 6);

-- --------------------------------------------------------

--
-- Table structure for table `quyen`
--

CREATE TABLE `quyen` (
  `maQuyen` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `tenQuyen` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `chitietQuyen` varchar(15) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `quyen`
--

INSERT INTO `quyen` (`maQuyen`, `tenQuyen`, `chitietQuyen`) VALUES
('Q000001', 'Thủ Thư', '1111110000000'),
('Q000002', 'Nhập Kho', '0000000001111');

-- --------------------------------------------------------

--
-- Table structure for table `the`
--

CREATE TABLE `the` (
  `maThe` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `maKhachhang` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayCap` date NOT NULL,
  `ngayHetHan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `the`
--

INSERT INTO `the` (`maThe`, `maKhachhang`, `ngayCap`, `ngayHetHan`) VALUES
('T000001', 'KH000001', '2022-01-08', '2024-01-08'),
('T000002', 'KH000002', '2022-01-15', '2024-01-15'),
('T000003', 'KH000003', '2022-01-21', '2024-01-21'),
('T000004', 'KH000004', '2022-01-30', '2024-01-30'),
('T000005', 'KH000005', '2022-02-02', '2024-02-02'),
('T000006', 'KH000006', '2022-02-06', '2024-02-06'),
('T000007', 'KH000007', '2022-02-27', '2024-02-27'),
('T000008', 'KH000008', '2022-03-04', '2024-03-04'),
('T000009', 'KH000009', '2022-03-14', '2024-03-14'),
('T000010', 'KH000010', '2022-03-20', '2024-03-20'),
('T000011', 'KH000011', '2022-03-29', '2024-03-29'),
('T000012', 'KH000012', '2022-04-14', '2024-04-14'),
('T000013', 'KH000013', '2022-04-16', '2024-04-16'),
('T000014', 'KH000014', '2022-04-18', '2024-04-18'),
('T000015', 'KH000015', '2022-04-28', '2024-04-28'),
('T000016', 'KH000016', '2022-05-03', '2024-05-03'),
('T000017', 'KH000017', '2022-05-09', '2024-05-09'),
('T000018', 'KH000018', '2022-05-19', '2024-05-19'),
('T000019', 'KH000019', '2022-05-31', '2024-05-31'),
('T000020', 'KH000020', '2022-06-06', '2024-06-06');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`tkAdmin`);

--
-- Indexes for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD KEY `FK_MaPhieuMuon_ChiTietPhieuMuon` (`maPhieuMuon`),
  ADD KEY `FK_IDSach_ChiTietPhieuMuon` (`IDSach`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD KEY `FK_MaSach_NK` (`maSach`),
  ADD KEY `FK_MaNhap` (`maNhap`);

--
-- Indexes for table `chitietphieuxuat`
--
ALTER TABLE `chitietphieuxuat`
  ADD KEY `FK_MaSach_XuatKho` (`maSach`) USING BTREE,
  ADD KEY `FK_MaXuat` (`maXuat`);

--
-- Indexes for table `chitietsach`
--
ALTER TABLE `chitietsach`
  ADD PRIMARY KEY (`IDSach`),
  ADD KEY `FK_maSach_2` (`maSach`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKhachHang`);

--
-- Indexes for table `khosach`
--
ALTER TABLE `khosach`
  ADD KEY `FK_maSach` (`maSach`);

--
-- Indexes for table `loaisach`
--
ALTER TABLE `loaisach`
  ADD PRIMARY KEY (`maSach`);

--
-- Indexes for table `lydophat`
--
ALTER TABLE `lydophat`
  ADD PRIMARY KEY (`maLDPhat`);

--
-- Indexes for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`maNCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNhanVien`);

--
-- Indexes for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`maPhieuMuon`),
  ADD KEY `FK_maThe_2` (`maThe`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`maNhap`),
  ADD KEY `FK_MaQuanLy-NhapKho` (`maNhanVien`),
  ADD KEY `FK_NCC-NhapKho` (`maNCC`);

--
-- Indexes for table `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD PRIMARY KEY (`maPhieuPhat`),
  ADD KEY `FK_MaMuonSach` (`maPhieuMuon`),
  ADD KEY `FK_maLDPhat_PhieuPhat` (`maLDPhat`);

--
-- Indexes for table `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD PRIMARY KEY (`maXuat`),
  ADD KEY `FK_MaQuanLy-XuatKho` (`maNhanVien`);

--
-- Indexes for table `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`maQuyen`);

--
-- Indexes for table `the`
--
ALTER TABLE `the`
  ADD PRIMARY KEY (`maThe`),
  ADD KEY `FK_maKhachHang` (`maKhachhang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD CONSTRAINT `FK_IDSach_ChiTietPhieuMuon` FOREIGN KEY (`IDSach`) REFERENCES `chitietsach` (`IDSach`),
  ADD CONSTRAINT `FK_MaPhieuMuon_ChiTietPhieuMuon` FOREIGN KEY (`maPhieuMuon`) REFERENCES `phieumuon` (`maPhieuMuon`);

--
-- Constraints for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `FK_MaNhap` FOREIGN KEY (`maNhap`) REFERENCES `phieunhap` (`maNhap`),
  ADD CONSTRAINT `FK_MaSach_NK` FOREIGN KEY (`maSach`) REFERENCES `loaisach` (`maSach`);

--
-- Constraints for table `chitietphieuxuat`
--
ALTER TABLE `chitietphieuxuat`
  ADD CONSTRAINT `FK_MaSach_NhapKho` FOREIGN KEY (`maSach`) REFERENCES `loaisach` (`maSach`),
  ADD CONSTRAINT `FK_MaXuat` FOREIGN KEY (`maXuat`) REFERENCES `phieuxuat` (`maXuat`);

--
-- Constraints for table `chitietsach`
--
ALTER TABLE `chitietsach`
  ADD CONSTRAINT `FK_maSach_2` FOREIGN KEY (`maSach`) REFERENCES `loaisach` (`maSach`);

--
-- Constraints for table `khosach`
--
ALTER TABLE `khosach`
  ADD CONSTRAINT `FK_maSach` FOREIGN KEY (`maSach`) REFERENCES `loaisach` (`maSach`);

--
-- Constraints for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `FK_maThe_2` FOREIGN KEY (`maThe`) REFERENCES `the` (`maThe`);

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `FK_MaQuanLy-NhapKho` FOREIGN KEY (`maNhanVien`) REFERENCES `nhanvien` (`maNhanVien`),
  ADD CONSTRAINT `FK_NCC-NhapKho` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`);

--
-- Constraints for table `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD CONSTRAINT `FK_MaMuonSach` FOREIGN KEY (`maPhieuMuon`) REFERENCES `phieumuon` (`maPhieuMuon`),
  ADD CONSTRAINT `FK_maLDPhat_PhieuPhat` FOREIGN KEY (`maLDPhat`) REFERENCES `lydophat` (`maLDPhat`);

--
-- Constraints for table `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD CONSTRAINT `FK_MaQuanLy-XuatKho` FOREIGN KEY (`maNhanVien`) REFERENCES `nhanvien` (`maNhanVien`);

--
-- Constraints for table `the`
--
ALTER TABLE `the`
  ADD CONSTRAINT `FK_maKhachHang` FOREIGN KEY (`maKhachhang`) REFERENCES `khachhang` (`maKhachHang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
admin