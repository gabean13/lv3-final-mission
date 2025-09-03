# Infra 설명

## 요구사항
1. **필수 요구사항**
- [x] 애플리케이션을 AWS에 배포 가능한 상태로 구축해야 한다.
- [x] 애플리케이션 서버와 데이터베이스 서버를 물리·네트워크 계층에서 분리해야 한다.
- [x] 개발(dev)과 운영(prod)의 설정을 서로 독립적으로 관리·배포해야 한다.
2. **추가 요구사항(선택)**
- [x] 소스 변경 시 자동 빌드·배포가 수행되도록 파이프라인을 구성해야 한다.
- [x] 개인 도메인을 애플리케이션에 연결하고 HTTPS를 적용해야 한다.
- [ ] 애플리케이션 로그를 파일 또는 수집기로 영속화하고 조회 절차를 제공해야 한다.
- [ ] 서버 자원(CPU·메모리·네트워크 등)을 지표·대시보드로 시각화해야 한다.
- [ ] 운영 중 스키마 변경 시 데이터 보존 상태로 마이그레이션 및 재배포를 완료해야 한다.
- [ ] 제공 API의 문서 명세를 작성·공개해야 한다.
- [ ] 전체 인프라를 다이어그램으로 작성하고 각 구성요소 역할을 설명해야 한다.

## 관련 URL
### 개발 서버
https://gakong-dev.o-r.kr/cakes

### 운영 서버
https://gakong.woowacourse.com/cakes

### workflow script
[dev-workflow](https://github.com/gabean13/lv3-final-mission/blob/my-feature/.github/workflows/dev-cicd-workflow.yml)
[prod-workflow](https://github.com/gabean13/lv3-final-mission/blob/my-feature/.github/workflows/prod-cicd-workflow.yml)


## 설명
