# 2023-2nd-Urban-Heat-Island-Project-JeongMin
2023 2nd Urban Heat Island Project 🏝

2023-2학기 모바일프로그래밍 팀 프로젝트 과제 **도시 열섬 바로 알기 All-in One Application의 메인 화면 레이아웃** 입니다.

## 메인 화면 레이아웃 구현 개요

👩‍💻 개발자 : 임정민

🗓 개발 기간 : 2023년 10월 30일 ~ 2023년 12월 14일

## 메인 화면 레이아웃 구현 설명

**1. StartPage**

에뮬레이터를 이용하여 애플리케이션을 실행하면 2초간 대기 화면(start_page.xml)이 지속된 후에 메인 화면(activity_main.xml)으로 넘어갑니다.

![스크린샷 2024-01-11 160545](https://github.com/JeongMinIsBest/2023-2nd-Urban-Heat-Island-Project-JeongMin/assets/105098123/6e896fdb-eda3-452f-859d-054b3fb6988e)

**2. MainActivity**

메인 화면에서 오른쪽 상단의 버튼을 누르면 애플리케이션 가이드 페이지 화면(guide_page1 ~ 3.xml)이 나타납니다. 왼쪽 상단의 버튼을 누르면 열섬 현상 관련 지식 퀴즈 화면(quiz_page.xml)으로 넘어갑니다.

![스크린샷 2024-01-11 160656](https://github.com/JeongMinIsBest/2023-2nd-Urban-Heat-Island-Project-JeongMin/assets/105098123/df5eb14f-910d-4811-bafe-523fd51ebd94)

**3. GuideButton**

가이드 화면으로 페이지 전환 후 오른쪽 상단의 버튼을 누르면 메인 화면으로 돌아갈 수 있습니다. ViewPager를 불러와 가이드 화면을 나타냅니다.

**4. QuizButton**

퀴즈 화면으로 전환 후 오른쪽 상단의 버튼을 누르면 메인 화면으로 돌아갈 수 있습니다.

**5. ViewPagerAdapter**

가이드 화면을 ViewPager(guide_viewpager.xml)를 통해 처리합니다. 오른쪽에서 왼쪽으로 스와이프하여 가이드 화면을 확인할 수 있고 오른쪽 상단의 버튼을 누르면 메인 화면으로 돌아갑니다.

**6. WebCrawling**

[무신사 상품 랭킹]("https://www.musinsa.com/ranking/best?period=now&age=ALL&mainCategory=001&subCategory=&leafCategory=&price=&golf=false&kids=false&newProduct=false&exclusive=false&discount=false&soldOut=false&page=1&viewType=small&priceMin=&priceMax=")에서 상품명, 브랜드, 가격, 링크, 상품 사진, 상품 사진 URL을 크롤링합니다.

**7. ProcessData**

WebCrawling을 통해 수집해온 데이터를 저장합니다.

**8. ShowClothes**

수집하고 저장한 데이터를 옷 추천 화면(ShowClothes.xml)에 상품명, 상품 사진, 가격을 나타냅니다.

![스크린샷 2024-01-11 163843](https://github.com/JeongMinIsBest/2023-2nd-Urban-Heat-Island-Project-JeongMin/assets/105098123/1ed933d4-3811-48c9-9e19-841beee5f1f1)

## 프로젝트 전체 개요

👩‍💻 개발자 : 강지현, 김세현, 임정민, 차재현

🗓 개발 기간 : 2023년 10월 30일 ~ 2023년 12월 14일

## 도시 열섬 바로 알기 All-in One Application

도시 열섬 바로 알기 올인원 애플리케이션은 사용자의 현재 위치를 기반으로 열섬 현상을 피할 수 있는 녹지 공간을 추천하고 안내할 수 있으며, 열섬 현상 관련 지식 퀴즈를 풀면서 열섬 현상에 대한 인식을 높일 수 있습니다.  




