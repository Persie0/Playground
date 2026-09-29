package p000;

import com.lingq.core.domain.model.milestones.GoalMetType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mw7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51971a;

    static {
        int[] iArr = new int[GoalMetType.values().length];
        try {
            iArr[GoalMetType.DailyGoal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GoalMetType.StreakMilestone.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GoalMetType.Milestone.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GoalMetType.StreakChallenge.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f51971a = iArr;
    }
}
