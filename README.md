# Retrofit_moshi

### **Moshi란?**

Moshi는 Square에서 개발한 JSON 파서 라이브러리입니다. Gson과 유사하지만, 성능이 더 빠르고 코틀린과의 호환성이 더 높은 특징을 가지고 있습니다. Moshi는 자바 및 안드로이드 앱과 함께 사용할 수 있습니다.

### **장점 목록**

- Moshi는 Gson보다 더 빠릅니다.
- Moshi는 코틀린과의 호환성이 더 높습니다.
- Moshi는 직렬화 및 역직렬화를 보다 쉽게 할 수 있습니다.
- Moshi는 유연성이 높아 사용자 정의 형식을 처리하기 쉽습니다.

### **Gson과의 차이**

- Moshi는 성능이 더 빠릅니다.
- Moshi는 코틀린과의 호환성이 더 높습니다.
- Moshi는 JSON으로 직렬화하기 전에 검증 단계를 수행합니다. 이로 인해 오류가 적어집니다.
- Moshi는 오류가 발생하면 예외를 throw합니다.


1. Permission 추가
   <uses-permission android:name="android.permission.INTERNET"/>
   
2. 의존성 추가
   implementation*("com.squareup.retrofit2:retrofit:2.9.0")
   implementation*("com.squareup.retrofit2:converter-moshi:2.9.0")
   implementation*("com.squareup.moshi:moshi-kotlin:1.14.0")
