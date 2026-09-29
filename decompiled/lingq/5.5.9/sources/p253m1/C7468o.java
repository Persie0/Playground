package p253m1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import dm.C5207g;
import p388t1.C9177c;

/* JADX INFO: renamed from: m1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7468o {

    /* JADX INFO: renamed from: a */
    public final CharSequence f41296a;

    /* JADX INFO: renamed from: b */
    public final int f41297b;

    /* JADX INFO: renamed from: c */
    public final int f41298c;

    /* JADX INFO: renamed from: d */
    public final TextPaint f41299d;

    /* JADX INFO: renamed from: e */
    public final int f41300e;

    /* JADX INFO: renamed from: f */
    public final TextDirectionHeuristic f41301f;

    /* JADX INFO: renamed from: g */
    public final Layout.Alignment f41302g;

    /* JADX INFO: renamed from: h */
    public final int f41303h;

    /* JADX INFO: renamed from: i */
    public final TextUtils.TruncateAt f41304i;

    /* JADX INFO: renamed from: j */
    public final int f41305j;

    /* JADX INFO: renamed from: k */
    public final float f41306k;

    /* JADX INFO: renamed from: l */
    public final float f41307l;

    /* JADX INFO: renamed from: m */
    public final int f41308m;

    /* JADX INFO: renamed from: n */
    public final boolean f41309n;

    /* JADX INFO: renamed from: o */
    public final boolean f41310o;

    /* JADX INFO: renamed from: p */
    public final int f41311p;

    /* JADX INFO: renamed from: q */
    public final int f41312q;

    /* JADX INFO: renamed from: r */
    public final int f41313r;

    /* JADX INFO: renamed from: s */
    public final int f41314s;

    /* JADX INFO: renamed from: t */
    public final int[] f41315t;

    /* JADX INFO: renamed from: u */
    public final int[] f41316u;

    public C7468o(CharSequence charSequence, int i10, int i11, C9177c c9177c, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f3, float f10, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(c9177c, "paint");
        C5207g.m11111f(textDirectionHeuristic, "textDir");
        C5207g.m11111f(alignment, "alignment");
        this.f41296a = charSequence;
        this.f41297b = i10;
        this.f41298c = i11;
        this.f41299d = c9177c;
        this.f41300e = i12;
        this.f41301f = textDirectionHeuristic;
        this.f41302g = alignment;
        this.f41303h = i13;
        this.f41304i = truncateAt;
        this.f41305j = i14;
        this.f41306k = f3;
        this.f41307l = f10;
        this.f41308m = i15;
        this.f41309n = z10;
        this.f41310o = z11;
        this.f41311p = i16;
        this.f41312q = i17;
        this.f41313r = i18;
        this.f41314s = i19;
        this.f41315t = iArr;
        this.f41316u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f3 >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
