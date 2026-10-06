package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nkw implements nxu {

    /* JADX INFO: renamed from: a */
    static final nxu f43339a = new nkw();

    private nkw() {
    }

    @Override // p000.nxu
    /* JADX INFO: renamed from: a */
    public final boolean mo11803a(int i) {
        nkx nkxVar;
        nkx nkxVar2 = nkx.UNKNOWN;
        switch (i) {
            case 0:
                nkxVar = nkx.UNKNOWN;
                break;
            case 1:
                nkxVar = nkx.TIMER_ZERO_SECONDS;
                break;
            case 2:
                nkxVar = nkx.TIMER_THREE_SECONDS;
                break;
            case 3:
                nkxVar = nkx.TIMER_TEN_SECONDS;
                break;
            case 4:
                nkxVar = nkx.TIMER_AUTO;
                break;
            case 5:
                nkxVar = nkx.HDR_AUTO;
                break;
            case 6:
                nkxVar = nkx.HDR_ON;
                break;
            case 7:
                nkxVar = nkx.HDR_OFF;
                break;
            case 8:
                nkxVar = nkx.HDR_READY;
                break;
            case 9:
                nkxVar = nkx.PHOTO_FLASH_ON;
                break;
            case 10:
                nkxVar = nkx.PHOTO_FLASH_OFF;
                break;
            case 11:
                nkxVar = nkx.PHOTO_FLASH_AUTO;
                break;
            case 12:
                nkxVar = nkx.f43408m;
                break;
            case 13:
                nkxVar = nkx.PHOTO_FLASH_UNGRAYED;
                break;
            case 14:
                nkxVar = nkx.VIDEO_FLASH_ON;
                break;
            case 15:
                nkxVar = nkx.VIDEO_FLASH_OFF;
                break;
            case 16:
                nkxVar = nkx.MICROVIDEO_ON;
                break;
            case 17:
                nkxVar = nkx.MICROVIDEO_AUTO;
                break;
            case 18:
                nkxVar = nkx.MICROVIDEO_OFF;
                break;
            case 19:
                nkxVar = nkx.EXT_MICROPHONE_ON;
                break;
            case 20:
                nkxVar = nkx.EXT_MICROPHONE_OFF;
                break;
            case 21:
                nkxVar = nkx.FPS_AUTO;
                break;
            case 22:
                nkxVar = nkx.FPS_30;
                break;
            case 23:
                nkxVar = nkx.FPS_60;
                break;
            case 24:
                nkxVar = nkx.WHITE_BALANCE_AUTO;
                break;
            case 25:
                nkxVar = nkx.WHITE_BALANCE_CLOUDY;
                break;
            case 26:
                nkxVar = nkx.WHITE_BALANCE_SUNNY;
                break;
            case 27:
                nkxVar = nkx.f43343D;
                break;
            case 28:
                nkxVar = nkx.WHITE_BALANCE_FLUORESCENT;
                break;
            case 29:
                nkxVar = nkx.BEAUTIFICATION_ON_LIGHT;
                break;
            case 30:
                nkxVar = nkx.BEAUTIFICATION_ON_STRONG;
                break;
            case 31:
                nkxVar = nkx.BEAUTIFICATION_OFF;
                break;
            case 32:
                nkxVar = nkx.AF_ON;
                break;
            case 33:
                nkxVar = nkx.AF_ON_LOCKED;
                break;
            case 34:
                nkxVar = nkx.AF_OFF_NEAR;
                break;
            case 35:
                nkxVar = nkx.AF_OFF_FAR;
                break;
            case 36:
                nkxVar = nkx.IMAX_AUDIO_ON;
                break;
            case 37:
                nkxVar = nkx.IMAX_AUDIO_OFF;
                break;
            case 38:
                nkxVar = nkx.SELECTED;
                break;
            case 39:
                nkxVar = nkx.UNSELECTED;
                break;
            case 40:
                nkxVar = nkx.HORIZONTAL_PHOTO_SPHERE;
                break;
            case 41:
                nkxVar = nkx.VERTICAL_PHOTO_SPHERE;
                break;
            case 42:
                nkxVar = nkx.WIDE_ANGLE_PHOTO_SPHERE;
                break;
            case 43:
                nkxVar = nkx.FISH_EYE_PHOTO_SPHERE;
                break;
            case 44:
                nkxVar = nkx.PHOTO_SPHERE;
                break;
            case 45:
                nkxVar = nkx.AF_OFF_INFINITY;
                break;
            case 46:
                nkxVar = nkx.SIXTEEN_BY_NINE;
                break;
            case 47:
                nkxVar = nkx.FOUR_BY_THREE;
                break;
            case 48:
                nkxVar = nkx.FPS_24;
                break;
            case 49:
                nkxVar = nkx.RES_1080P;
                break;
            case 50:
                nkxVar = nkx.RES_2160P;
                break;
            case 51:
                nkxVar = nkx.PR_ON;
                break;
            case 52:
                nkxVar = nkx.PR_OFF;
                break;
            case 53:
                nkxVar = nkx.ASTRO_OFF;
                break;
            case 54:
                nkxVar = nkx.ASTRO_AUTO;
                break;
            case 55:
                nkxVar = nkx.PHOTO_FLASH_NS;
                break;
            case 56:
                nkxVar = nkx.MIC_INPUT_PHONE;
                break;
            case 57:
                nkxVar = nkx.MIC_INPUT_EXT_WIRED;
                break;
            case 58:
                nkxVar = nkx.MIC_INPUT_EXT_BLUETOOTH;
                break;
            case 59:
                nkxVar = nkx.SWISS_OFF;
                break;
            case 60:
                nkxVar = nkx.SWISS_ON;
                break;
            case 61:
                nkxVar = nkx.LASAGNA_TR_SMALL;
                break;
            case 62:
                nkxVar = nkx.LASAGNA_TR_MEDIUM;
                break;
            case 63:
                nkxVar = nkx.LASAGNA_TR_LARGE;
                break;
            case 64:
                nkxVar = nkx.FLOUNDER_OFF;
                break;
            case 65:
                nkxVar = nkx.FLOUNDER_ON;
                break;
            case 66:
                nkxVar = nkx.ASPECT_RATIO_SIXTEEN_BY_NINE;
                break;
            case 67:
                nkxVar = nkx.ASPECT_RATIO_FOUR_BY_THREE;
                break;
            case 68:
                nkxVar = nkx.ASPECT_RATIO_THREE_BY_FOUR;
                break;
            case 69:
                nkxVar = nkx.ASPECT_RATIO_NINE_BY_SIXTEEN;
                break;
            case 70:
                nkxVar = nkx.COCKTAIL_PARTY_OFF;
                break;
            case 71:
                nkxVar = nkx.COCKTAIL_PARTY_ON;
                break;
            case 72:
                nkxVar = nkx.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE;
                break;
            case 73:
                nkxVar = nkx.VIDEO_ASPECT_RATIO_FOUR_BY_THREE;
                break;
            case 74:
                nkxVar = nkx.VIDEO_ASPECT_RATIO_THREE_BY_FOUR;
                break;
            case 75:
                nkxVar = nkx.VIDEO_ASPECT_RATIO_NINE_BY_SIXTEEN;
                break;
            case 76:
                nkxVar = nkx.AMETHYST_OFF;
                break;
            case 77:
                nkxVar = nkx.AMETHYST_ON;
                break;
            case 78:
                nkxVar = nkx.TAXI_OFF;
                break;
            case 79:
                nkxVar = nkx.TAXI_AUTO;
                break;
            case 80:
                nkxVar = nkx.TAXI_ON;
                break;
            default:
                nkxVar = null;
                break;
        }
        return nkxVar != null;
    }
}
