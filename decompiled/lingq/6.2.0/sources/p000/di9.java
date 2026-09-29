package p000;

import com.lingq.feature.statistics.StreakCalendarType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class di9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35691a;

    static {
        int[] iArr = new int[StreakCalendarType.values().length];
        try {
            iArr[StreakCalendarType.Future.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StreakCalendarType.Lost.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StreakCalendarType.Streak.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StreakCalendarType.StreakProgress.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f35691a = iArr;
    }
}
