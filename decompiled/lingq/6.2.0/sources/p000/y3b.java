package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class y3b {

    /* JADX INFO: renamed from: c */
    public CharSequence f69251c;

    /* JADX INFO: renamed from: a */
    public long f69249a = 0;

    /* JADX INFO: renamed from: b */
    public long f69250b = 0;

    /* JADX INFO: renamed from: d */
    public int f69252d = 2;

    /* JADX INFO: renamed from: e */
    public float f69253e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f69254f = 1;

    /* JADX INFO: renamed from: g */
    public int f69255g = 0;

    /* JADX INFO: renamed from: h */
    public float f69256h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f69257i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f69258j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f69259k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX INFO: renamed from: a */
    public final bs1 m24934a() {
        Layout.Alignment alignment;
        float f = this.f69256h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f69252d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f69257i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f69252d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        bs1 bs1Var = new bs1();
        int i4 = this.f69252d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            hn1.m13364n("Unknown textAlignment: ", i4, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        bs1Var.f8915c = alignment;
        float f3 = this.f69253e;
        int i5 = this.f69254f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        bs1Var.f8917e = f2;
        bs1Var.f8918f = i5;
        bs1Var.f8919g = this.f69255g;
        bs1Var.f8920h = f;
        bs1Var.f8921i = i2;
        float f4 = this.f69258j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            C3386nv.m17633t(String.valueOf(i2));
            return null;
        }
        bs1Var.f8924l = Math.min(f4, f);
        bs1Var.f8928p = this.f69259k;
        CharSequence charSequence = this.f69251c;
        if (charSequence != null) {
            bs1Var.f8913a = charSequence;
            bs1Var.f8914b = null;
        }
        return bs1Var;
    }
}
