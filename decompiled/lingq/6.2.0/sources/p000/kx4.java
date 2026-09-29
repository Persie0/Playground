package p000;

import com.lingq.core.domain.model.milestones.LessonAchievementType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class kx4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48541a;

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
        f48541a = iArr;
    }
}
