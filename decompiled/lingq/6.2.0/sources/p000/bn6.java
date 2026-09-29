package p000;

import com.lingq.core.domain.model.notification.InAppNotificationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bn6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8716a;

    static {
        int[] iArr = new int[InAppNotificationType.values().length];
        try {
            iArr[InAppNotificationType.Timezone.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppNotificationType.ReSplitInProgress.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppNotificationType.ReSplitFailed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppNotificationType.ReSplitInCompleted.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InAppNotificationType.StreakChallenge.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InAppNotificationType.WordsKnown.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InAppNotificationType.DailyGoal.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[InAppNotificationType.DailyGoalDouble.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[InAppNotificationType.Milestone.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[InAppNotificationType.ProfileMessage.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f8716a = iArr;
    }
}
