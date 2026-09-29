package p000;

import com.lingq.core.domain.stats.ActivityScore;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0010a8 {
    /* JADX INFO: renamed from: a */
    public static ActivityScore m168a(double d, double d2) {
        if (d2 == 0.0d) {
            return ActivityScore.Great;
        }
        double d3 = d / d2;
        if (d3 < 0.35d) {
            return ActivityScore.Attention;
        }
        if (d3 < 0.35d || d3 >= 0.75d) {
            return (d3 < 0.75d || d3 >= 1.0d) ? ActivityScore.Great : ActivityScore.Almost;
        }
        return ActivityScore.Ok;
    }
}
