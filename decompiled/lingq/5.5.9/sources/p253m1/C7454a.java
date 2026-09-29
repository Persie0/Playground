package p253m1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.activity.C0189h;
import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7454a {
    /* JADX INFO: renamed from: a */
    public static final BoringLayout m14824a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f3, float f10, BoringLayout.Metrics metrics, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(textPaint, "paint");
        C5207g.m11111f(alignment, "alignment");
        C5207g.m11111f(metrics, "metrics");
        C0204c.m858r();
        return C0189h.m816d(charSequence, textPaint, i10, alignment, f3, f10, metrics, z10, truncateAt, i11, z11);
    }

    /* JADX INFO: renamed from: b */
    public static final BoringLayout.Metrics m14825b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(textPaint, "paint");
        C5207g.m11111f(textDirectionHeuristic, "textDir");
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }
}
