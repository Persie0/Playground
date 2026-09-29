package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class sb7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60622a;

    static {
        int[] iArr = new int[PlayerConstants$PlaybackRate.values().length];
        try {
            iArr[PlayerConstants$PlaybackRate.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_0_25.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_0_5.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_0_75.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_1.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_1_25.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_1_5.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_1_75.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_2.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f60622a = iArr;
    }
}
