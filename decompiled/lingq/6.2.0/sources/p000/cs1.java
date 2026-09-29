package p000;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cs1 {

    /* JADX INFO: renamed from: A */
    public static final String f34444A;

    /* JADX INFO: renamed from: B */
    public static final String f34445B;

    /* JADX INFO: renamed from: C */
    public static final String f34446C;

    /* JADX INFO: renamed from: D */
    public static final String f34447D;

    /* JADX INFO: renamed from: E */
    public static final String f34448E;

    /* JADX INFO: renamed from: F */
    public static final String f34449F;

    /* JADX INFO: renamed from: G */
    public static final String f34450G;

    /* JADX INFO: renamed from: H */
    public static final String f34451H;

    /* JADX INFO: renamed from: I */
    public static final String f34452I;

    /* JADX INFO: renamed from: J */
    public static final String f34453J;

    /* JADX INFO: renamed from: K */
    public static final String f34454K;

    /* JADX INFO: renamed from: L */
    public static final String f34455L;

    /* JADX INFO: renamed from: s */
    public static final String f34456s;

    /* JADX INFO: renamed from: t */
    public static final String f34457t;

    /* JADX INFO: renamed from: u */
    public static final String f34458u;

    /* JADX INFO: renamed from: v */
    public static final String f34459v;

    /* JADX INFO: renamed from: w */
    public static final String f34460w;

    /* JADX INFO: renamed from: x */
    public static final String f34461x;

    /* JADX INFO: renamed from: y */
    public static final String f34462y;

    /* JADX INFO: renamed from: z */
    public static final String f34463z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f34464a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f34465b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f34466c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f34467d;

    /* JADX INFO: renamed from: e */
    public final float f34468e;

    /* JADX INFO: renamed from: f */
    public final int f34469f;

    /* JADX INFO: renamed from: g */
    public final int f34470g;

    /* JADX INFO: renamed from: h */
    public final float f34471h;

    /* JADX INFO: renamed from: i */
    public final int f34472i;

    /* JADX INFO: renamed from: j */
    public final float f34473j;

    /* JADX INFO: renamed from: k */
    public final float f34474k;

    /* JADX INFO: renamed from: l */
    public final boolean f34475l;

    /* JADX INFO: renamed from: m */
    public final int f34476m;

    /* JADX INFO: renamed from: n */
    public final int f34477n;

    /* JADX INFO: renamed from: o */
    public final float f34478o;

    /* JADX INFO: renamed from: p */
    public final int f34479p;

    /* JADX INFO: renamed from: q */
    public final float f34480q;

    /* JADX INFO: renamed from: r */
    public final int f34481r;

    static {
        new cs1("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = uma.f64080a;
        f34456s = Integer.toString(0, 36);
        f34457t = Integer.toString(17, 36);
        f34458u = Integer.toString(1, 36);
        f34459v = Integer.toString(2, 36);
        f34460w = Integer.toString(3, 36);
        f34461x = Integer.toString(18, 36);
        f34462y = Integer.toString(4, 36);
        f34463z = Integer.toString(5, 36);
        f34444A = Integer.toString(6, 36);
        f34445B = Integer.toString(7, 36);
        f34446C = Integer.toString(8, 36);
        f34447D = Integer.toString(9, 36);
        f34448E = Integer.toString(10, 36);
        f34449F = Integer.toString(11, 36);
        f34450G = Integer.toString(12, 36);
        f34451H = Integer.toString(13, 36);
        f34452I = Integer.toString(14, 36);
        f34453J = Integer.toString(15, 36);
        f34454K = Integer.toString(16, 36);
        f34455L = Integer.toString(19, 36);
    }

    public cs1(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            bna.m3969q(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f34464a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f34464a = charSequence.toString();
        } else {
            this.f34464a = null;
        }
        this.f34465b = alignment;
        this.f34466c = alignment2;
        this.f34467d = bitmap;
        this.f34468e = f;
        this.f34469f = i;
        this.f34470g = i2;
        this.f34471h = f2;
        this.f34472i = i3;
        this.f34473j = f4;
        this.f34474k = f5;
        this.f34475l = z;
        this.f34476m = i5;
        this.f34477n = i4;
        this.f34478o = f3;
        this.f34479p = i6;
        this.f34480q = f6;
        this.f34481r = i7;
    }

    /* JADX INFO: renamed from: a */
    public final bs1 m9869a() {
        bs1 bs1Var = new bs1();
        bs1Var.f8913a = this.f34464a;
        bs1Var.f8914b = this.f34467d;
        bs1Var.f8915c = this.f34465b;
        bs1Var.f8916d = this.f34466c;
        bs1Var.f8917e = this.f34468e;
        bs1Var.f8918f = this.f34469f;
        bs1Var.f8919g = this.f34470g;
        bs1Var.f8920h = this.f34471h;
        bs1Var.f8921i = this.f34472i;
        bs1Var.f8922j = this.f34477n;
        bs1Var.f8923k = this.f34478o;
        bs1Var.f8924l = this.f34473j;
        bs1Var.f8925m = this.f34474k;
        bs1Var.f8926n = this.f34475l;
        bs1Var.f8927o = this.f34476m;
        bs1Var.f8928p = this.f34479p;
        bs1Var.f8929q = this.f34480q;
        bs1Var.f8930r = this.f34481r;
        return bs1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cs1.class == obj.getClass()) {
            cs1 cs1Var = (cs1) obj;
            if (TextUtils.equals(this.f34464a, cs1Var.f34464a) && this.f34465b == cs1Var.f34465b && this.f34466c == cs1Var.f34466c) {
                Bitmap bitmap = cs1Var.f34467d;
                Bitmap bitmap2 = this.f34467d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f34468e == cs1Var.f34468e && this.f34469f == cs1Var.f34469f && this.f34470g == cs1Var.f34470g && this.f34471h == cs1Var.f34471h && this.f34472i == cs1Var.f34472i && this.f34473j == cs1Var.f34473j && this.f34474k == cs1Var.f34474k && this.f34475l == cs1Var.f34475l && this.f34476m == cs1Var.f34476m && this.f34477n == cs1Var.f34477n && this.f34478o == cs1Var.f34478o && this.f34479p == cs1Var.f34479p && this.f34480q == cs1Var.f34480q && this.f34481r == cs1Var.f34481r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f34464a, this.f34465b, this.f34466c, this.f34467d, Float.valueOf(this.f34468e), Integer.valueOf(this.f34469f), Integer.valueOf(this.f34470g), Float.valueOf(this.f34471h), Integer.valueOf(this.f34472i), Float.valueOf(this.f34473j), Float.valueOf(this.f34474k), Boolean.valueOf(this.f34475l), Integer.valueOf(this.f34476m), Integer.valueOf(this.f34477n), Float.valueOf(this.f34478o), Integer.valueOf(this.f34479p), Float.valueOf(this.f34480q), Integer.valueOf(this.f34481r));
    }
}
