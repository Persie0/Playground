package p000;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ro0 {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f59617A;

    /* JADX INFO: renamed from: B */
    public static final int[] f59618B;

    /* JADX INFO: renamed from: C */
    public static final int[] f59619C;

    /* JADX INFO: renamed from: D */
    public static final int[] f59620D;

    /* JADX INFO: renamed from: E */
    public static final int[] f59621E;

    /* JADX INFO: renamed from: v */
    public static final int f59622v = m20729c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f59623w;

    /* JADX INFO: renamed from: x */
    public static final int[] f59624x;

    /* JADX INFO: renamed from: y */
    public static final int[] f59625y;

    /* JADX INFO: renamed from: z */
    public static final int[] f59626z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f59627a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f59628b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f59629c;

    /* JADX INFO: renamed from: d */
    public boolean f59630d;

    /* JADX INFO: renamed from: e */
    public int f59631e;

    /* JADX INFO: renamed from: f */
    public boolean f59632f;

    /* JADX INFO: renamed from: g */
    public int f59633g;

    /* JADX INFO: renamed from: h */
    public int f59634h;

    /* JADX INFO: renamed from: i */
    public int f59635i;

    /* JADX INFO: renamed from: j */
    public int f59636j;

    /* JADX INFO: renamed from: k */
    public int f59637k;

    /* JADX INFO: renamed from: l */
    public int f59638l;

    /* JADX INFO: renamed from: m */
    public int f59639m;

    /* JADX INFO: renamed from: n */
    public int f59640n;

    /* JADX INFO: renamed from: o */
    public int f59641o;

    /* JADX INFO: renamed from: p */
    public int f59642p;

    /* JADX INFO: renamed from: q */
    public int f59643q;

    /* JADX INFO: renamed from: r */
    public int f59644r;

    /* JADX INFO: renamed from: s */
    public int f59645s;

    /* JADX INFO: renamed from: t */
    public int f59646t;

    /* JADX INFO: renamed from: u */
    public int f59647u;

    static {
        int iM20729c = m20729c(0, 0, 0, 0);
        f59623w = iM20729c;
        int iM20729c2 = m20729c(0, 0, 0, 3);
        f59624x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f59625y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f59626z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f59617A = new boolean[]{false, false, false, true, true, true, false};
        f59618B = new int[]{iM20729c, iM20729c2, iM20729c, iM20729c, iM20729c2, iM20729c, iM20729c};
        f59619C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f59620D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f59621E = new int[]{iM20729c, iM20729c, iM20729c, iM20729c, iM20729c, iM20729c2, iM20729c2};
    }

    public ro0() {
        m20732d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m20729c(int i, int i2, int i3, int i4) {
        int i5;
        bna.m3973s(i, 4);
        bna.m3973s(i2, 4);
        bna.m3973s(i3, 4);
        bna.m3973s(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m20730a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f59628b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        SpannableString spannableStringM20731b = m20731b();
        ArrayList arrayList = this.f59627a;
        arrayList.add(spannableStringM20731b);
        spannableStringBuilder.clear();
        if (this.f59641o != -1) {
            this.f59641o = 0;
        }
        if (this.f59642p != -1) {
            this.f59642p = 0;
        }
        if (this.f59643q != -1) {
            this.f59643q = 0;
        }
        if (this.f59645s != -1) {
            this.f59645s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f59636j && arrayList.size() < 15) {
                this.f59647u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m20731b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f59628b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f59641o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f59641o, length, 33);
            }
            if (this.f59642p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f59642p, length, 33);
            }
            if (this.f59643q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f59644r), this.f59643q, length, 33);
            }
            if (this.f59645s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f59646t), this.f59645s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m20732d() {
        this.f59627a.clear();
        this.f59628b.clear();
        this.f59641o = -1;
        this.f59642p = -1;
        this.f59643q = -1;
        this.f59645s = -1;
        this.f59647u = 0;
        this.f59629c = false;
        this.f59630d = false;
        this.f59631e = 4;
        this.f59632f = false;
        this.f59633g = 0;
        this.f59634h = 0;
        this.f59635i = 0;
        this.f59636j = 15;
        this.f59637k = 0;
        this.f59638l = 0;
        this.f59639m = 0;
        int i = f59623w;
        this.f59640n = i;
        this.f59644r = f59622v;
        this.f59646t = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m20733e(boolean z, boolean z2) {
        int i = this.f59641o;
        SpannableStringBuilder spannableStringBuilder = this.f59628b;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f59641o, spannableStringBuilder.length(), 33);
                this.f59641o = -1;
            }
        } else if (z) {
            this.f59641o = spannableStringBuilder.length();
        }
        if (this.f59642p == -1) {
            if (z2) {
                this.f59642p = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f59642p, spannableStringBuilder.length(), 33);
            this.f59642p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m20734f(int i, int i2) {
        int i3 = this.f59643q;
        SpannableStringBuilder spannableStringBuilder = this.f59628b;
        if (i3 != -1 && this.f59644r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f59644r), this.f59643q, spannableStringBuilder.length(), 33);
        }
        if (i != f59622v) {
            this.f59643q = spannableStringBuilder.length();
            this.f59644r = i;
        }
        if (this.f59645s != -1 && this.f59646t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f59646t), this.f59645s, spannableStringBuilder.length(), 33);
        }
        if (i2 != f59623w) {
            this.f59645s = spannableStringBuilder.length();
            this.f59646t = i2;
        }
    }
}
