package p000;

import com.lingq.core.domain.model.notification.InAppNotificationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fqa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f39496a;

    static {
        int[] iArr = new int[InAppNotificationType.values().length];
        try {
            iArr[InAppNotificationType.DailyGoal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppNotificationType.DailyGoalDouble.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppNotificationType.Milestone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f39496a = iArr;
    }
}
