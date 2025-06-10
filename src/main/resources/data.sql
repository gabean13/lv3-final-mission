insert into cake (cake_id, name, description, price)
values (1L, '하트케이크', '하트 모양 케이크 입니다.', 15000);

insert into flavor (flavor_id, name, description, additional_price)
values (1, '기본 생크림', '기본 쉬폰 시트에 생크림 크림입니다.', 0);

insert into size (size_id, dimension, description, additional_price)
values (1, 10, '도시락 사이즈', 0),
       (2, 12, '미니 사이즈', 3000),
       (3, 15, '1호 사이즈', 10000),
       (4, 18, '2호 사이즈', 15000)
       ;
