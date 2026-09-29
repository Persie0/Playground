package p000;

import com.lingq.core.domain.model.milestones.GoalMetType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class dl8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35795a;

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
        f35795a = iArr;
    }
}
