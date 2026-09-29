package p304ok;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;

/* JADX INFO: renamed from: ok.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8065a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43764a;

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
            iArr[PlayerConstants$PlaybackRate.RATE_1.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_1_5.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlayerConstants$PlaybackRate.RATE_2.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f43764a = iArr;
    }
}
