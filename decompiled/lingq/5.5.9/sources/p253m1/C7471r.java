package p253m1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import dm.C5207g;
import kotlin.Pair;

/* JADX INFO: renamed from: m1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7471r {

    /* JADX INFO: renamed from: a */
    public static final C7470q f41320a = new C7470q();

    /* JADX INFO: renamed from: b */
    public static final Pair<Integer, Integer> f41321b = new Pair<>(0, 0);

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristic m14839a(int i10) {
        if (i10 == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            C5207g.m11110e(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        }
        if (i10 == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            C5207g.m11110e(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        }
        if (i10 == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C5207g.m11110e(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        }
        if (i10 == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            C5207g.m11110e(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        }
        if (i10 == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            C5207g.m11110e(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        }
        if (i10 != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C5207g.m11110e(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
        C5207g.m11110e(textDirectionHeuristic7, "LOCALE");
        return textDirectionHeuristic7;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m14840b(Layout layout, int i10) {
        C5207g.m11111f(layout, "<this>");
        return layout.getEllipsisCount(i10) > 0;
    }
}
