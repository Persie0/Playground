package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f39 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38368a;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.InterfaceLanguage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.Theme.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.TimezoneAlert.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.UserLogOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.RestartTutorial.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ViewKeys.DeleteLanguage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ViewKeys.DeleteAccount.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ViewKeys.Topics.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ViewKeys.DailyStreakTarget.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f38368a = iArr;
    }
}
