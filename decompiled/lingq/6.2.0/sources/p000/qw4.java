package p000;

import com.lingq.core.domain.model.LearningLevel;

/* JADX INFO: loaded from: classes.dex */
public final class qw4 {
    /* JADX INFO: renamed from: a */
    public static void m20188a(String str) {
        str.getClass();
        if (str.equals(LearningLevel.Beginner1.getServerName()) || str.equals(LearningLevel.Beginner2.getServerName()) || str.equals(LearningLevel.Intermediate1.getServerName()) || str.equals(LearningLevel.Intermediate2.getServerName()) || str.equals(LearningLevel.Advanced1.getServerName())) {
            return;
        }
        str.equals(LearningLevel.Advanced2.getServerName());
    }

    /* JADX INFO: renamed from: b */
    public static int m20189b(String str) {
        str.getClass();
        if (str.equals(LearningLevel.Beginner1.getDisplayName())) {
            return 0;
        }
        if (str.equals(LearningLevel.Beginner2.getDisplayName())) {
            return 1;
        }
        if (str.equals(LearningLevel.Intermediate1.getDisplayName())) {
            return 2;
        }
        if (str.equals(LearningLevel.Intermediate2.getDisplayName())) {
            return 3;
        }
        if (str.equals(LearningLevel.Advanced1.getDisplayName())) {
            return 4;
        }
        return str.equals(LearningLevel.Advanced2.getDisplayName()) ? 5 : 0;
    }
}
