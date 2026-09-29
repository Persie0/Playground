package p000;

import com.lingq.core.p012ui.UpgradeReason;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class yha {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f69857a;

    static {
        int[] iArr = new int[UpgradeReason.values().length];
        try {
            iArr[UpgradeReason.LIMIT_IMPORTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeReason.LIMIT_IMPORTS_WORDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeReason.SENTENCES_TRANSLATIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpgradeReason.LIMIT_WORDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UpgradeReason.CHALLENGES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UpgradeReason.PLAYLISTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[UpgradeReason.GENERATE_TTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[UpgradeReason.TRANSCRIBE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[UpgradeReason.LYNX.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[UpgradeReason.LYNX_OUT_OF_CREDITS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[UpgradeReason.GATED_TOOL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[UpgradeReason.GATED_TOOL_PLUS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[UpgradeReason.VOICES.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[UpgradeReason.SIMPLIFY.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[UpgradeReason.TRANSCRIBE_PLUS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[UpgradeReason.VOICES_PREMIUM.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[UpgradeReason.EXPLAIN.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        f69857a = iArr;
    }
}
