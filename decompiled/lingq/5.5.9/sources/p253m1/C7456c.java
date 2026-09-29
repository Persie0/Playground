package p253m1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import dm.C5207g;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7456c {
    /* JADX INFO: renamed from: a */
    public static final BoringLayout m14827a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f3, float f10, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(textPaint, "paint");
        C5207g.m11111f(alignment, "alignment");
        C5207g.m11111f(metrics, "metrics");
        return new BoringLayout(charSequence, textPaint, i10, alignment, f3, f10, metrics, z10, truncateAt, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final BoringLayout.Metrics m14828b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(textPaint, "paint");
        C5207g.m11111f(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
