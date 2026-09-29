package p000;

import com.lingq.core.p012ui.UpgradeReason;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class bx4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f9132a;

    static {
        int[] iArr = new int[UpgradeReason.values().length];
        try {
            iArr[UpgradeReason.CHALLENGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeReason.PLAYLISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeReason.GENERATE_TTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpgradeReason.EXPLAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UpgradeReason.VOICES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UpgradeReason.VOICES_PREMIUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f9132a = iArr;
    }
}
