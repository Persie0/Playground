package p285o1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import dm.C5207g;
import p253m1.C7471r;

/* JADX INFO: renamed from: o1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7890c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i15);
            boolean z11 = true;
            if (lineForOffset == layout.getLineCount() - 1 && C7471r.m14840b(layout, lineForOffset)) {
                float fM15659b = C7891d.m15659b(layout, lineForOffset, paint) + C7891d.m15658a(layout, lineForOffset, paint);
                if (fM15659b != 0.0f) {
                    z11 = false;
                }
                if (!z11) {
                    C5207g.m11108c(canvas);
                    canvas.translate(fM15659b, 0.0f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
