SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `quanlythuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `tkAdmin` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitietsach`
--

CREATE TABLE `chitietsach` (
  `IDSach` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `tinhTrang` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKhachHang` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `hoTen` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngaySinh` date NOT NULL,
  `diaChi` varchar(65) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` int(11) NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `maThe` varchar(7) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khosach`
--

CREATE TABLE `khosach` (
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `soLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `muonsach`
--

CREATE TABLE `muonsach` (
  `maMuonSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `maThe` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `IDSach` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `thoiDiemMuon` date NOT NULL,
  `thoiGianMuon` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nguoiquanly`
--

CREATE TABLE `nguoiquanly` (
  `maQuanLy` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `hoTen` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngaySinh` date NOT NULL,
  `diaChi` varchar(65) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` int(11) NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `chucVu` varchar(45) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `maSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `tenSach` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenTacGia` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tenNXB` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `namXB` int(4) NOT NULL,
  `theLoai` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ngonNgu` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tomTatNoiDung` text COLLATE utf8_unicode_ci NOT NULL,
  `giaTien` int(11) NOT NULL,
  `soTrang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `the`
--

CREATE TABLE `the` (
  `maThe` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `maKhachhang` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `ngayCap` date NOT NULL,
  `ngayHetHan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `trasach`
--

CREATE TABLE `trasach` (
  `maMuonSach` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `thoiDiemTra` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`tkAdmin`);

INSERT INTO `admin` (`tkAdmin`, `password`) VALUES
('AD000001', '123456');

--
-- Indexes for table `chitietsach`
--
ALTER TABLE `chitietsach`
  ADD PRIMARY KEY (`IDSach`),
  ADD KEY `FK_maSach_2` (`maSach`);

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
('IDS000014', 'S000005', 'Tốt');

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKhachHang`),
  ADD KEY `FK_maThe` (`maThe`);

INSERT INTO `khachhang` (`maKhachHang`, `hoTen`, `ngaySinh`, `diaChi`, `sdt`, `email`, `maThe`) VALUES
('KH000001', 'Nguyễn Thùy Chi', '1999-01-29', 'Tỉnh Lộ 10, Quận Bình Tân, TP HCM', '0321589102', 'thuychi@gmail.com', 'T000001'),
('KH000002', 'Nguyễn Minh Khang', '2000-02-12', 'Phan Anh, Quận Tân Phú, TP HCM', '0951786905', 'khangnguyen@gmail.com', 'T000002'),
('KH000003', 'Lê Bảo Trân', '1997-11-22', 'Hồ Ngọc Cẩn, Huyện Hóc Môn, TP HCM', '0985327812', 'baotran@gmail.com', 'T000003'),
('KH000004', 'Lê Quốc Bình', '2001-09-22', 'Tỉnh Lộ 9, Huyện Củ Chi, TP HCM', '0904281742', 'binhle@gmail.com', 'T000004'),
('KH000005', 'Phạm Diệu Linh', '1998-09-09', 'Phạm Văn Sáng, Huyện Bình Chánh, TP HCM', '0762190538', 'dieulinh@gmail.com', 'T000005'),
('KH000006', 'Phạm Hùng Cường', '1996-08-27', 'Nguyễn Huy Tưởng, Quận Bình Thạnh, TP HCM', '0351298632', 'cuongpham@gmail.com', 'T000006'),
('KH000007', 'Đặng Trúc Lâm', '1997-06-14', 'Cây Trâm, Quận Gò Vấp, TP HCM', '0924582906', 'truclam@gmail.com', 'T000007');

--
-- Indexes for table `khosach`
--
ALTER TABLE `khosach`
  ADD KEY `FK_maSach` (`maSach`);

INSERT INTO `khosach` (`maSach`, `soLuong`) VALUES
('S000001', 5),
('S000002', 5),
('S000003', 5),
('S000003', 5),
('S000004', 5),
('S000005', 20),
('S000006', 20);

--
-- Indexes for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD PRIMARY KEY (`maMuonSach`),
  ADD KEY `FK_IDSach` (`IDSach`),
  ADD KEY `FK_maThe_2` (`maThe`);

INSERT INTO `muonsach` (`maMuonSach`, `maThe`, `IDSach`, `thoiDiemMuon`, `thoiGianMuon`) VALUES
('M000001', 'T000001', 'IDS000001', '2024-01-10', 4),
('M000002', 'T000002', 'IDS000004', '2024-01-25', 17),
('M000003', 'T000003', 'IDS000008', '2024-02-04', 7),
('M000004', 'T000003', 'IDS000012', '2024-02-12', 20),
('M000005', 'T000004', 'IDS000013', '2024-02-05', 15),
('M000006', 'T000004', 'IDS000019', '2024-02-05', 15),
('M000007', 'T000005', 'IDS000023', '2024-02-03', 12),
('M000008', 'T000006', 'IDS000030', '2024-02-08', 8);

--
-- Indexes for table `nguoiquanly`
--
ALTER TABLE `nguoiquanly`
  ADD PRIMARY KEY (`maQuanLy`);

INSERT INTO `nguoiquanly` (`maQuanLy`, `password`, `hoTen`, `ngaySinh`, `diaChi`, `sdt`, `email`, `chucVu`) VALUES
('QL000001', 'QL000001', 'Nguyễn Mai Ngọc Bích', '1988-11-02', 'Cao Thắng, Quận 3, TP HCM', '0358990124', 'ngocbich@gmail.com', 'Thủ Thư'),
('QL000002', 'QL000002', 'Nguyễn Đức Minh', '1985-02-13', 'Hồ Học Lãm, Quận Bình Tân, TP HCM', '0705145202', 'minhnguyen@gmail.com', 'Quản Lý Kho'),
('QL000003', 'QL000003', 'Lê Vân Nhi', '1992-07-17', '3 Tháng 2, Quận 10, TP HCM', '0903214760', 'vannhi@gmail.com', 'Thủ Thư');
--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`maSach`);

INSERT INTO `sach` (`maSach`, `tenSach`, `tenTacGia`, `tenNXB`, `namXB`, `theLoai`, `ngonNgu`, `tomTatNoiDung`, `giaTien`, `soTrang`) VALUES
('S000001', 'Tập Tục Đời Người', 'Phan Cẩm Thượng', 'Nhà Xuất Bản Hội Nhà Văn', 2017, 'Sách Văn Hóa', 'Tiếng Việt', '“Bạn đang cầm trên tay cuốn thứ hai trong một bộ sách của Phan Cẩm Thượng […] gồm bốn cuốn, sẽ hoàn thành trong 4 đến 5 năm nữa. Một bộ sử Việt Nam. Nhưng cần nói rõ: không phải lịch sử nước Việt với tư cách một quốc gia, mà là lịch sử người Việt Nam trong cuộc sống làm người hằng ngày của họ. Phan Cẩm Thượng không viết về các triều đại hưng suy, các cuộc chiến tranh thắng thua khốc liệt, các biến cố chính trị được coi là trọng đại … như ta thường gặp trong những bộ quốc sử nghiêm trang. Ở đây ta gặp một cái khác, nhỏ nhoi hơn, thường nhật và gần gũi hơn (nhưng kỳ vậy, lại ít được biết đến hơn): những con người. Con người Việt Nam. Phan Cẩm Thượng cho thấy còn có một lịch sử khác nữa như vậy của đất nước này mà ta chưa thật biết, song lại cũng quan trọng không kém, nếu không hơn. Vâng, có thể còn hơn, bởi vì con người phải sống như thế này, làm những cái này trước, rồi mới có thể làm những cái được coi là trọng đại kia. Mới có thể làm nên Lịch sử ‘lớn’. Hoặc nói cho cùng, những cái to lớn, trọng đại kia, theo cách nào đó rất có thể do chính những cái này chi phối, thậm chí đến quyết định. Vì nó có trước. Nó là cái nền. Nó bền bỉ và lâu dài hơn các triều đại và các chế độ.”', 189000, 611),
('S000002', 'Việt Nam Phong Tục', 'Phan Kế Bính', 'Nhà Xuất Bản Hồng Đức', 2019, 'Sách Văn Hóa', 'Tiếng Việt', 'Từ Phong tục trong gia tộc, Phong tục xóm làng (hương đảng) đến các phong tục ngoài xã hội, VIỆT NAM PHONG TỤC của học giả PHAN KẾ BÍNH là một bộ biên khảo tương đối đầy đủ về các phong tục tập quán cũ của nước Việt. Là một nhà nho uyên bác mang tư tưởng tân tiến, tác giả không chỉ mô tả từng tập tục, mà còn về gốc tích, nguyên ủy cái tục ấy, nhìn nhận, đánh giá để xem nó hay hay dở, từ đó \"xét điều gì quá tệ mà bỏ bớt đi, rồi lâu lâu mới đem cái tục hay mà bổ hết cho cái tục dở. Còn tục gì hay mà là quốc túy của ta thì cứ giữ lấy\". Đến nay, tập sách gần một trăm năm tuổi này vẫn là một trong những công trình khảo cứu có giá trị bậc nhất về các phong tục tập quán trên đất nước ta và nhiều vấn đề được PHAN KẾ BÍNH nhắc tới vẫn nóng hổi tính thời đại.', 90000, 306),
('S000003', ' Văn Hóa Tín Ngưỡng Việt Nam', 'Nguyễn Hạnh', 'Nhà Xuất Bản Trẻ', 2024, 'Sách Văn Hóa', 'Tiếng Việt', 'Tác phẩm Văn Hóa Tín Ngưỡng Việt Nam của tác giả Nguyễn Hạnh là tác phẩm biên khảo về tín ngưỡng của người Việt khởi từ thời dựng nước với khái niệm thờ: Trời, đất, tổ tiên. Những niềm tin dân gian của ông bà ta xưa vẫn còn lưu truyền đến ngày nay thông qua kho tàng ca dao.Tiếp đến là sự giao thoa văn hóa với 4 tôn giáo lớn ở Việt Nam là Nho, Phật, Lão, Công Giáo. Chính sự giao thoa giữa tín ngưỡng dân gian Việt Nam và 4 tôn giáo lớn này đã hình thành nên nhiều tôn giáo bản địa như Cao Đài, Hòa Hảo, Hòa Đồng Tôn Giáo. Sự giao thoa, tiếp thu và chọn lọc đó đã làm nên một đặc sắc trong chiều kích tâm linh đó là các tôn giáo du nhập phải được điều chỉnh và chứa đựng được yếu tố tín ngưỡng của người Việt. Chính những ảnh hưởng giao thoa này góp phần tạo nên bản sắc văn hóa, tín ngưỡng của người Việt xuyên suốt từ thuở dựng nước đến nay. Tác phẩm Văn Hóa Tín Ngưỡng Việt Nam sẽ góp phần làm phong phú thêm Tủ sách Triết học phương Đông của NXB Trẻ và là quyển sách cần thiết cho độc giả tìm hiểu về cội nguồn tín ngưỡng của người Việt.', 100000, 232);

--
-- Indexes for table `the`
--
ALTER TABLE `the`
  ADD PRIMARY KEY (`maThe`),
  ADD KEY `FK_maKhachHang` (`maKhachhang`);

INSERT INTO `the` (`maThe`, `maKhachhang`, `ngayCap`, `ngayHetHan`) VALUES
('T000001', 'KH000001', '2024-01-08', '2024-01-08'),
('T000002', 'KH000002', '2024-01-15', '2024-01-15'),
('T000003', 'KH000003', '2024-01-21', '2024-01-21'),
('T000004', 'KH000004', '2024-01-30', '2024-01-30'),
('T000005', 'KH000005', '2024-02-02', '2024-02-02'),
('T000006', 'KH000006', '2024-02-06', '2024-02-06'),
('T000007', 'KH000007', '2024-02-27', '2024-02-27'),
('T000008', 'KH000008', '2024-03-04', '2024-03-04'),
('T000009', 'KH000009', '2024-03-14', '2024-03-14'),
('T000010', 'KH000010', '2024-03-20', '2024-03-20'),
('T000011', 'KH000011', '2024-03-29', '2024-03-29'),
('T000012', 'KH000012', '2024-04-14', '2024-04-14');

--
-- Indexes for table `trasach`
--
ALTER TABLE `trasach`
  ADD KEY `FK_maMuonsach` (`maMuonSach`);

INSERT INTO `trasach` (`maMuonSach`, `thoiDiemTra`) VALUES
('M000001', '2024-01-14'),
('M000002', '2024-02-11'),
('M000003', '2024-02-11'),
('M000004', '2024-03-03'),
('M000005', '2024-02-20'),
('M000006', '2024-02-20'),
('M000007', '2024-02-15'),
('M000008', '2024-02-16'),
('M000009', '2024-02-16'),
('M000010', '2024-03-02');
--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietsach`
--
ALTER TABLE `chitietsach`
  ADD CONSTRAINT `FK_maSach_2` FOREIGN KEY (`maSach`) REFERENCES `sach` (`maSach`);

--
-- Constraints for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `FK_maThe` FOREIGN KEY (`maThe`) REFERENCES `the` (`maThe`);

--
-- Constraints for table `khosach`
--
ALTER TABLE `khosach`
  ADD CONSTRAINT `FK_maSach` FOREIGN KEY (`maSach`) REFERENCES `sach` (`maSach`);

--
-- Constraints for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD CONSTRAINT `FK_IDSach` FOREIGN KEY (`IDSach`) REFERENCES `chitietsach` (`IDSach`),
  ADD CONSTRAINT `FK_maThe_2` FOREIGN KEY (`maThe`) REFERENCES `the` (`maThe`);

--
-- Constraints for table `the`
--
ALTER TABLE `the`
  ADD CONSTRAINT `FK_maKhachHang` FOREIGN KEY (`maKhachhang`) REFERENCES `khachhang` (`maKhachHang`);

--
-- Constraints for table `trasach`
--
ALTER TABLE `trasach`
  ADD CONSTRAINT `FK_maMuonsach` FOREIGN KEY (`maMuonSach`) REFERENCES `muonsach` (`maMuonSach`);
COMMIT;