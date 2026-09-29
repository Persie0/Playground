package p000;

import com.lingq.core.achievements.LevelBand;
import com.lingq.core.domain.model.milestones.MilestoneType;

/* JADX INFO: renamed from: f5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2989f5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38420a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f38421b;

    static {
        int[] iArr = new int[MilestoneType.values().length];
        try {
            iArr[MilestoneType.KnownWords.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MilestoneType.Level.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MilestoneType.DailyGoal.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MilestoneType.DailyDoubleGoal.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f38420a = iArr;
        int[] iArr2 = new int[LevelBand.values().length];
        try {
            iArr2[LevelBand.Beginner.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LevelBand.Intermediate.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LevelBand.Advanced.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f38421b = iArr2;
    }
}
