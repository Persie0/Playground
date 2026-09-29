package p000;

import com.lingq.core.domain.model.notification.InAppNotificationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i24 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43381a;

    static {
        int[] iArr = new int[InAppNotificationType.values().length];
        try {
            iArr[InAppNotificationType.DailyGoalDouble.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppNotificationType.DailyGoal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppNotificationType.WordsKnown.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppNotificationType.Milestone.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InAppNotificationType.ProfileMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f43381a = iArr;
    }
}
