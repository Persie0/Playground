package p000;

import com.lingq.core.achievements.DailyGoal;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m0a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f50405a;

    static {
        int[] iArr = new int[DailyGoal.values().length];
        try {
            iArr[DailyGoal.Casual.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DailyGoal.Steady.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DailyGoal.Intense.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DailyGoal.Insane.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f50405a = iArr;
    }
}
