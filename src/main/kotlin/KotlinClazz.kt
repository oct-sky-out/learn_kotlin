package com.oct_sky_out

// NOTE: 코틀린에서 클래스 필드를 선언하고, 게터와 세터에 대해 확인합시다.

// NOTE: 클래스의 필드를 선언하는 방법은 크게 2가지입니다.
// 1. KotlinClazz는 기본 생성자가 없으며, var1과 var2의 필드가 존재합니다.
//    이 때 코틀린에서는 클래스 내부에 필드 선언시 반드시 초기값을 선언해야합니다.
class KotlinClazz {
    val var1 = 0; // 읽기만 가능한 필드
    var var2 = 0; // 읽기와 쓰기 모두 가능한 필드
}

// 2. KotlinClazz2는 기본 생성자있습니다. var1과 var2의 필드가 존재합니다.
//    이 때 코틀린에서는 var1과 var2는 인스턴스 생성 선언 시 초기화가 필요하므로 기본값은 선택입니다.
//    단, 타입에 대해서는 명시를 해줘야합니다. 기본값이 있는경우에도 반드시 해줘야합니다.
class KotlinClazz2(val var1: Int, val var2: Int = 0)