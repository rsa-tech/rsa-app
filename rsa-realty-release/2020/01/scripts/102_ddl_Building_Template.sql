
-- ============================   BUILDING_TEMPLATE ===========================
CREATE TABLE BUILDING_TEMPLATE(
	TEMPLATE_ID	BIGINT NOT NULL AUTO_INCREMENT,
	PROJECT_NAME	VARCHAR (255),
	PROPERTY_TYPE_ID	INT NOT NULL,
	PROPERTY_TYPE_TITLE	VARCHAR (255) NOT NULL,
	PROPERTY_TYPE_GROUP_ID	INT NOT NULL,
	PROPERTY_TYPE_GROUP_TITLE	VARCHAR (255) NOT NULL,
	BUILDING_NAME	VARCHAR (255) NOT NULL,
	BUILDER_NAME	VARCHAR (255),
	BUILDER_WEB_URL	VARCHAR (255),
	AVAILABILITY_ID	INT NOT NULL,
	AVAILABILITY_TITLE	VARCHAR (255),
	AVAILABILITY_TS	TIMESTAMP,
	PROPERTY_AGE_ID	INT NOT NULL DEFAULT -1,
	PROPERTY_AGE_TITLE	VARCHAR (255),
	ADDRESS_LINE_1	VARCHAR (255),
	ADDRESS_LINE_2	VARCHAR (255),
	LOCALITY_IDS	VARCHAR (255),
	LOCALITY_TITLES	VARCHAR (255),
	CITY_NAME	VARCHAR (255),
	STATE_NAME	VARCHAR (255),
	LANDMARK_NAME	VARCHAR (255),
	PIN_CODE	VARCHAR (255),
	COUNTRY_NAME	VARCHAR (255),
	TOTAL_FLOORS	INT NOT NULL DEFAULT -1,
	TOTAL_FLATS_FLOOR	INT NOT NULL DEFAULT -1,
	TOTAL_BUILDING_COVERED_PARKING	INT NOT NULL DEFAULT -1,
	TOTAL_BUILDING_OPEN_PARKING	INT NOT NULL DEFAULT -1,
	TOTAL_BUILDING_VISITOR_PARKING	INT NOT NULL DEFAULT -1,
	TOTAL_SERVICE_LIFT	INT NOT NULL DEFAULT -1,
	TOTAL_LIFT	INT NOT NULL DEFAULT -1,
	OC_TS	TIMESTAMP,
	RERA_ID	VARCHAR (255),
	PROPERTY_DESCRIPTION	VARCHAR (2000),
	EARTHQUAKE_RESISTANT	INT NOT NULL DEFAULT -1,
	GAS_PIPELINE	INT NOT NULL DEFAULT -1,
	CLUB_HOUSE	INT NOT NULL DEFAULT -1,
	GYM	INT NOT NULL DEFAULT -1,
	KIDS_PLAY_AREA	INT NOT NULL DEFAULT -1,
	WATER_HARVESTING	INT NOT NULL DEFAULT -1,
	SWIMMING_POOL	INT NOT NULL DEFAULT -1,
	COMMON_AREA_POWER_BACKUP	INT NOT NULL DEFAULT -1,
	FLAT_POWER_BACKUP	INT NOT NULL DEFAULT -1,
	SENIOR_CITIZEN_AREA	INT NOT NULL DEFAULT -1,
	GATED_SOCIETY	INT NOT NULL DEFAULT -1,
	WATER_SUPPLAY	INT NOT NULL DEFAULT -1,
	LANDSCAPE_LAWN	INT NOT NULL DEFAULT -1,
	BANQUET_HALL	INT NOT NULL DEFAULT -1,
	JOGGERS_TRACK	INT NOT NULL DEFAULT -1,
	CCTV	INT NOT NULL DEFAULT -1,
	FIRE_ALARM	INT NOT NULL DEFAULT -1,
	PET_FRIENDLY	INT NOT NULL DEFAULT -1,
	STATUS_ID	INT NOT NULL DEFAULT 1,
	STATUS_TITLE	VARCHAR (255),
	CREATED_BY	VARCHAR (255) NOT NULL, 
	CREATED_TS	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	UPDATED_BY	VARCHAR (255) NOT NULL,
	UPDATED_TS	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT BUILDING_TEMPLATE_PK_TEMPLATE_ID PRIMARY KEY(TEMPLATE_ID)
)	