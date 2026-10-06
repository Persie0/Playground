package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nhn implements nxt {
    UNKNOWN_TYPE(0),
    NAVIGATION_CHANGE(1),
    CAPTURE_DONE(3),
    DEPRECATED_TAP_TO_FOCUS(4),
    PHOTO_INTERACTION(5),
    FOREGROUND_EVENT(6),
    CAMERA_FAILURE(7),
    CONTROL_USED(12),
    CAPTURE_COMPUTE(13),
    BACKGROUND_EVENT(14),
    MEMORY_REPORT(15),
    MEMORY_WINDOW_STATS(16),
    STORAGE_WARNING(17),
    CAPTURE_PROFILE_START(18),
    CAPTURE_PROFILE(19),
    CAPTURE_PROFILE_ABORTED(20),
    CAMERA_PREWARM(21),
    OPEN_DEVICE_RETRY(22),
    CHANGE_CAMERA(23),
    BLOCK_SHOT(24),
    CAPTURE_PROFILE_FAILED(25),
    CAPTURE_PROFILE_START_COMMITTED(26),
    CAPTURE_PROFILE_DELETED(27),
    PREFERENCES_EVENT(28),
    CAMERA_CONTENT_PROVIDER(29),
    LAUNCH_PHOTOS_REVIEW_EVENT(30),
    PHOTO_VIDEO_MODE_CHANGE(31),
    ADVICE_SHOWN(32),
    PREFERENCE_CHANGE_EVENT(33),
    IRIS_EVENT(34),
    WEAR_LAUNCH_EVENT(35),
    WEAR_INSTALL_EVENT(36),
    THERMAL_EVENT(37),
    PHOTOBOOTH_SESSION_EVENT(38),
    MODE_SWITCH_EVENT(39),
    SLOW_PROCESSING_EVENT(40),
    CAMERA_SMARTS_EVENT(41),
    WEAR_SESSION_EVENT(42),
    f42358M(43),
    INFLIGHT_FALLBACK_RESTORED_EVENT(44),
    OPTIONBAR_OPTION_CHANGE_EVENT(45),
    LENSLITE_INITIALIZATION_EVENT(46),
    LENSLITE_EVENT(47),
    PORTRAIT_SEGMENTER_INIT_FAILURE(48),
    FREQUENT_FACE_PREFERENCE_CHANGE_EVENT(49),
    DND_ACCESS_NEEDED_EVENT(50),
    ADVICE_HEEDED(51),
    VIDEO_SESSION_EVENT(52),
    EDUCATION_TOAST_EVENT(53),
    CAMERA_FATAL_ERROR_COUNTS_EVENT(54),
    SYSTEM_SERVICE_EVENT(55),
    CAMERA_FATAL_ERROR_DIALOG(56),
    f42373aa(57),
    FRAMING_HINT_SHOWN(58),
    CATSHARK_TOGGLE_CHANGE_EVENT(59),
    ENTER_STORAGE_PREFERENCE_EVENT(60),
    STATS_3A_EVENT(61),
    SHOTLOSS_EVENT(62),
    IN_APP_UPDATE_EVENT(63),
    ZOOM_LOCK_EVENT(64),
    BOTTOM_SHEET_EVENT(65),
    HAL_UPDATE_EVENT(66),
    PROCESS_GC_EVENT(67),
    DUAL_FUSION_EVENT(68),
    LENS_SUGGESTION_CHIP_EVENT(69),
    CUTTLEFISH_BONE_OPTION_CHANGE_EVENT(70),
    TAXI_STATE_CHANGE_EVENTS(71),
    ACTIVE_CAMERA_EVENT(72),
    OPTIONS_MENU_OPEN_CLOSE_EVENT(73);


    /* JADX INFO: renamed from: ar */
    public final int f42416ar;

    nhn(int i) {
        this.f42416ar = i;
    }

    /* JADX INFO: renamed from: b */
    public static nhn m17474b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return NAVIGATION_CHANGE;
            case 2:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                return null;
            case 3:
                return CAPTURE_DONE;
            case 4:
                return DEPRECATED_TAP_TO_FOCUS;
            case 5:
                return PHOTO_INTERACTION;
            case 6:
                return FOREGROUND_EVENT;
            case 7:
                return CAMERA_FAILURE;
            case 12:
                return CONTROL_USED;
            case 13:
                return CAPTURE_COMPUTE;
            case 14:
                return BACKGROUND_EVENT;
            case 15:
                return MEMORY_REPORT;
            case 16:
                return MEMORY_WINDOW_STATS;
            case 17:
                return STORAGE_WARNING;
            case 18:
                return CAPTURE_PROFILE_START;
            case 19:
                return CAPTURE_PROFILE;
            case 20:
                return CAPTURE_PROFILE_ABORTED;
            case 21:
                return CAMERA_PREWARM;
            case 22:
                return OPEN_DEVICE_RETRY;
            case 23:
                return CHANGE_CAMERA;
            case 24:
                return BLOCK_SHOT;
            case 25:
                return CAPTURE_PROFILE_FAILED;
            case 26:
                return CAPTURE_PROFILE_START_COMMITTED;
            case 27:
                return CAPTURE_PROFILE_DELETED;
            case 28:
                return PREFERENCES_EVENT;
            case 29:
                return CAMERA_CONTENT_PROVIDER;
            case 30:
                return LAUNCH_PHOTOS_REVIEW_EVENT;
            case 31:
                return PHOTO_VIDEO_MODE_CHANGE;
            case 32:
                return ADVICE_SHOWN;
            case 33:
                return PREFERENCE_CHANGE_EVENT;
            case 34:
                return IRIS_EVENT;
            case 35:
                return WEAR_LAUNCH_EVENT;
            case 36:
                return WEAR_INSTALL_EVENT;
            case 37:
                return THERMAL_EVENT;
            case 38:
                return PHOTOBOOTH_SESSION_EVENT;
            case 39:
                return MODE_SWITCH_EVENT;
            case 40:
                return SLOW_PROCESSING_EVENT;
            case 41:
                return CAMERA_SMARTS_EVENT;
            case 42:
                return WEAR_SESSION_EVENT;
            case 43:
                return f42358M;
            case 44:
                return INFLIGHT_FALLBACK_RESTORED_EVENT;
            case 45:
                return OPTIONBAR_OPTION_CHANGE_EVENT;
            case 46:
                return LENSLITE_INITIALIZATION_EVENT;
            case 47:
                return LENSLITE_EVENT;
            case 48:
                return PORTRAIT_SEGMENTER_INIT_FAILURE;
            case 49:
                return FREQUENT_FACE_PREFERENCE_CHANGE_EVENT;
            case 50:
                return DND_ACCESS_NEEDED_EVENT;
            case 51:
                return ADVICE_HEEDED;
            case 52:
                return VIDEO_SESSION_EVENT;
            case 53:
                return EDUCATION_TOAST_EVENT;
            case 54:
                return CAMERA_FATAL_ERROR_COUNTS_EVENT;
            case 55:
                return SYSTEM_SERVICE_EVENT;
            case 56:
                return CAMERA_FATAL_ERROR_DIALOG;
            case 57:
                return f42373aa;
            case 58:
                return FRAMING_HINT_SHOWN;
            case 59:
                return CATSHARK_TOGGLE_CHANGE_EVENT;
            case 60:
                return ENTER_STORAGE_PREFERENCE_EVENT;
            case 61:
                return STATS_3A_EVENT;
            case 62:
                return SHOTLOSS_EVENT;
            case 63:
                return IN_APP_UPDATE_EVENT;
            case 64:
                return ZOOM_LOCK_EVENT;
            case 65:
                return BOTTOM_SHEET_EVENT;
            case 66:
                return HAL_UPDATE_EVENT;
            case 67:
                return PROCESS_GC_EVENT;
            case 68:
                return DUAL_FUSION_EVENT;
            case 69:
                return LENS_SUGGESTION_CHIP_EVENT;
            case 70:
                return CUTTLEFISH_BONE_OPTION_CHANGE_EVENT;
            case 71:
                return TAXI_STATE_CHANGE_EVENTS;
            case 72:
                return ACTIVE_CAMERA_EVENT;
            case 73:
                return OPTIONS_MENU_OPEN_CLOSE_EVENT;
        }
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f42416ar;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f42416ar);
    }
}
