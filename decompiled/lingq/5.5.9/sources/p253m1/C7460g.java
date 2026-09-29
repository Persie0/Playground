package p253m1;

import ae.C0062b;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import dm.C5207g;
import p285o1.C7892e;
import p285o1.C7893f;
import p388t1.C9177c;
import p389t2.C9182a;

/* JADX INFO: renamed from: m1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7460g {

    /* JADX INFO: renamed from: a */
    public final CharSequence f41287a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f41288b;

    /* JADX INFO: renamed from: c */
    public final int f41289c;

    /* JADX INFO: renamed from: d */
    public float f41290d;

    /* JADX INFO: renamed from: e */
    public float f41291e;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f41292f;

    /* JADX INFO: renamed from: g */
    public boolean f41293g;

    public C7460g(CharSequence charSequence, C9177c c9177c, int i10) {
        C5207g.m11111f(charSequence, "charSequence");
        C5207g.m11111f(c9177c, "textPaint");
        this.f41287a = charSequence;
        this.f41288b = c9177c;
        this.f41289c = i10;
        this.f41290d = Float.NaN;
        this.f41291e = Float.NaN;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m14831a() {
        if (!this.f41293g) {
            TextDirectionHeuristic textDirectionHeuristicM14839a = C7471r.m14839a(this.f41289c);
            CharSequence charSequence = this.f41287a;
            C5207g.m11111f(charSequence, "text");
            TextPaint textPaint = this.f41288b;
            C5207g.m11111f(textPaint, "paint");
            this.f41292f = C9182a.m17515a() ? C7454a.m14825b(charSequence, textPaint, textDirectionHeuristicM14839a) : C7456c.m14828b(charSequence, textPaint, textDirectionHeuristicM14839a);
            this.f41293g = true;
        }
        return this.f41292f;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX INFO: renamed from: b */
    public final float m14832b() {
        boolean z10;
        if (!Float.isNaN(this.f41290d)) {
            return this.f41290d;
        }
        BoringLayout.Metrics metricsM14831a = m14831a();
        Float fValueOf = metricsM14831a != null ? Float.valueOf(metricsM14831a.width) : null;
        boolean z11 = false;
        TextPaint textPaint = this.f41288b;
        CharSequence charSequence = this.f41287a;
        if (fValueOf == null) {
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (!(fValueOf.floatValue() == 0.0f)) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (C0062b.m374n1(spanned, C7893f.class) || C0062b.m374n1(spanned, C7892e.class)) {
                    z11 = true;
                } else {
                    if (textPaint.getLetterSpacing() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = true;
                    }
                }
            } else {
                if (textPaint.getLetterSpacing() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
        }
        float fFloatValue = fValueOf.floatValue();
        this.f41290d = fFloatValue;
        return fFloatValue;
    }
}
