/* =========================================================
   SI-CORE-V1 : ORACLE DML
========================================================= */

-- 그룹코드
INSERT INTO TB_CODE_GROUP
(GROUP_CODE, GROUP_NAME, DESCRIPTION, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('CO_USER_STATUS', '사용자 상태', '사용자 상태', 'Y' , SYSDATE , SYSDATE );

INSERT INTO TB_CODE_GROUP
(GROUP_CODE, GROUP_NAME, DESCRIPTION, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('CO_ROLE', '역할', '역할', 'Y' , SYSDATE , SYSDATE );

INSERT INTO TB_CODE_GROUP
(GROUP_CODE, GROUP_NAME, DESCRIPTION, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('CO_PERMISSION', '행위 권한', '행위 권한', 'Y' , SYSDATE , SYSDATE );

INSERT INTO TB_CODE_GROUP
(GROUP_CODE, GROUP_NAME, DESCRIPTION, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('CO_MENU_TYPE', '메뉴 타입', '메뉴 타입', 'Y' , SYSDATE , SYSDATE );

INSERT INTO TB_CODE_GROUP
(GROUP_CODE, GROUP_NAME, DESCRIPTION, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('CO_JOB_TYPE', '이벤트 타입', '이벤트 타입', 'Y' , SYSDATE , SYSDATE );

--------------------------------------------------------------------------------------------------------------------------------------------------

-- 공통코드
INSERT INTO TB_CODE
(CODE_ID, CODE_GROUP_ID, CODE, CODE_NAME, SORT_ORDER, USE_YN, CREATED_AT, UPDATED_AT)
VALUES('NORMAL', 'CO_USER_STATUS', '', '', 0 , 'Y' , SYSDATE , SYSDATE );

