package p000;

import com.lingq.core.domain.model.milestones.LessonAchievementType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class mp6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51702a;

    static {
        int[] iArr = new int[LessonAchievementType.values().length];
        try {
            iArr[LessonAchievementType.DailyGoal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonAchievementType.StreakMilestone.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonAchievementType.KnownWords.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LessonAchievementType.Level.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f51702a = iArr;
    }
}
