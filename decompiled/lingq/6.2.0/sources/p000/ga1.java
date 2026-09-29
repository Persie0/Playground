package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ga1 {

    /* JADX INFO: renamed from: h */
    public static final ga1 f40443h = new ga1(1, 2, 3, null, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f40444a;

    /* JADX INFO: renamed from: b */
    public final int f40445b;

    /* JADX INFO: renamed from: c */
    public final int f40446c;

    /* JADX INFO: renamed from: d */
    public final byte[] f40447d;

    /* JADX INFO: renamed from: e */
    public final int f40448e;

    /* JADX INFO: renamed from: f */
    public final int f40449f;

    /* JADX INFO: renamed from: g */
    public int f40450g;

    static {
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        uma.m22828w(5);
    }

    public ga1(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f40444a = i;
        this.f40445b = i2;
        this.f40446c = i3;
        this.f40447d = bArr;
        this.f40448e = i4;
        this.f40449f = i5;
    }

    /* JADX INFO: renamed from: a */
    public static String m12446a(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? ux5.m22988k(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: b */
    public static String m12447b(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? ux5.m22988k(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: c */
    public static String m12448c(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? ux5.m22988k(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12449e(ga1 ga1Var) {
        if (ga1Var == null) {
            return true;
        }
        int i = ga1Var.f40444a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = ga1Var.f40445b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = ga1Var.f40446c;
        if ((i3 != -1 && i3 != 3) || ga1Var.f40447d != null) {
            return false;
        }
        int i4 = ga1Var.f40449f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = ga1Var.f40448e;
        return i5 == -1 || i5 == 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m12450f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m12451g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12452d() {
        return (this.f40444a == -1 || this.f40445b == -1 || this.f40446c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ga1.class == obj.getClass()) {
            ga1 ga1Var = (ga1) obj;
            if (this.f40444a == ga1Var.f40444a && this.f40445b == ga1Var.f40445b && this.f40446c == ga1Var.f40446c && Arrays.equals(this.f40447d, ga1Var.f40447d) && this.f40448e == ga1Var.f40448e && this.f40449f == ga1Var.f40449f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40450g == 0) {
            this.f40450g = ((((Arrays.hashCode(this.f40447d) + ((((((527 + this.f40444a) * 31) + this.f40445b) * 31) + this.f40446c) * 31)) * 31) + this.f40448e) * 31) + this.f40449f;
        }
        return this.f40450g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m12447b(this.f40444a));
        sb.append(", ");
        sb.append(m12446a(this.f40445b));
        sb.append(", ");
        sb.append(m12448c(this.f40446c));
        sb.append(", ");
        sb.append(this.f40447d != null);
        sb.append(", ");
        int i = this.f40448e;
        sb.append(i != -1 ? AbstractC3393o1.m17732g(i, "bit Luma") : "NA");
        sb.append(", ");
        int i2 = this.f40449f;
        return AbstractC3393o1.m17738m(sb, i2 != -1 ? AbstractC3393o1.m17732g(i2, "bit Chroma") : "NA", ")");
    }
}
