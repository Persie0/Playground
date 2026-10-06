package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: ya */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1139ya {

    /* JADX INFO: renamed from: f */
    protected final AmbientDelegate f48051f;

    /* JADX INFO: renamed from: g */
    private final C1140yb f48052g;

    /* JADX INFO: renamed from: a */
    int f48046a = 0;

    /* JADX INFO: renamed from: h */
    private int f48053h = 8;

    /* JADX INFO: renamed from: b */
    public int[] f48047b = new int[8];

    /* JADX INFO: renamed from: c */
    public int[] f48048c = new int[8];

    /* JADX INFO: renamed from: d */
    public float[] f48049d = new float[8];

    /* JADX INFO: renamed from: e */
    public int f48050e = -1;

    /* JADX INFO: renamed from: i */
    private int f48054i = -1;

    /* JADX INFO: renamed from: j */
    private boolean f48055j = false;

    public C1139ya(C1140yb c1140yb, AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2) {
        this.f48052g = c1140yb;
        this.f48051f = ambientDelegate;
    }

    /* JADX INFO: renamed from: a */
    public final float m19596a(C1146yh c1146yh) {
        int i = this.f48050e;
        for (int i2 = 0; i != -1 && i2 < this.f48046a; i2++) {
            if (this.f48047b[i] == c1146yh.f48129c) {
                return this.f48049d[i];
            }
            i = this.f48048c[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m19598c(C1146yh c1146yh, boolean z) {
        int i = this.f48050e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f48046a) {
                if (this.f48047b[i] == c1146yh.f48129c) {
                    if (i == this.f48050e) {
                        this.f48050e = this.f48048c[i];
                    } else {
                        int[] iArr = this.f48048c;
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        c1146yh.m19640b(this.f48052g);
                    }
                    c1146yh.f48138l--;
                    this.f48046a--;
                    this.f48047b[i] = -1;
                    if (this.f48055j) {
                        this.f48054i = i;
                    }
                    return this.f48049d[i];
                }
                i2++;
                i3 = i;
                i = this.f48048c[i];
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m19601f() {
        int i = this.f48050e;
        for (int i2 = 0; i != -1 && i2 < this.f48046a; i2++) {
            C1146yh c1146yh = ((C1146yh[]) this.f48051f.f1685a)[this.f48047b[i]];
            if (c1146yh != null) {
                c1146yh.m19640b(this.f48052g);
            }
            i = this.f48048c[i];
        }
        this.f48050e = -1;
        this.f48054i = -1;
        this.f48055j = false;
        this.f48046a = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m19602g(C1146yh c1146yh, float f) {
        if (f == 0.0f) {
            m19598c(c1146yh, true);
            return;
        }
        int i = this.f48050e;
        if (i == -1) {
            this.f48050e = 0;
            this.f48049d[0] = f;
            this.f48047b[0] = c1146yh.f48129c;
            this.f48048c[0] = -1;
            c1146yh.f48138l++;
            c1146yh.m19639a(this.f48052g);
            this.f48046a++;
            if (this.f48055j) {
                return;
            }
            int i2 = this.f48054i + 1;
            this.f48054i = i2;
            int length = this.f48047b.length;
            if (i2 >= length) {
                this.f48055j = true;
                this.f48054i = length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f48046a; i4++) {
            int i5 = this.f48047b[i];
            int i6 = c1146yh.f48129c;
            if (i5 == i6) {
                this.f48049d[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f48048c[i];
        }
        int length2 = this.f48054i;
        int i7 = length2 + 1;
        if (this.f48055j) {
            int[] iArr = this.f48047b;
            if (iArr[length2] != -1) {
                length2 = iArr.length;
            }
        } else {
            length2 = i7;
        }
        int length3 = this.f48047b.length;
        if (length2 >= length3 && this.f48046a < length3) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f48047b;
                if (i8 >= iArr2.length) {
                    break;
                }
                if (iArr2[i8] == -1) {
                    length2 = i8;
                    break;
                }
                i8++;
            }
        }
        int length4 = this.f48047b.length;
        if (length2 >= length4) {
            int i9 = this.f48053h;
            int i10 = i9 + i9;
            this.f48053h = i10;
            this.f48055j = false;
            this.f48054i = length4 - 1;
            this.f48049d = Arrays.copyOf(this.f48049d, i10);
            this.f48047b = Arrays.copyOf(this.f48047b, this.f48053h);
            this.f48048c = Arrays.copyOf(this.f48048c, this.f48053h);
            length2 = length4;
        }
        this.f48047b[length2] = c1146yh.f48129c;
        this.f48049d[length2] = f;
        if (i3 != -1) {
            int[] iArr3 = this.f48048c;
            iArr3[length2] = iArr3[i3];
            iArr3[i3] = length2;
        } else {
            this.f48048c[length2] = this.f48050e;
            this.f48050e = length2;
        }
        c1146yh.f48138l++;
        c1146yh.m19639a(this.f48052g);
        int i11 = this.f48046a + 1;
        this.f48046a = i11;
        if (!this.f48055j) {
            this.f48054i++;
        }
        int length5 = this.f48047b.length;
        if (i11 >= length5) {
            this.f48055j = true;
        }
        if (this.f48054i >= length5) {
            this.f48055j = true;
            this.f48054i = length5 - 1;
        }
    }

    public final String toString() {
        int i = this.f48050e;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.f48046a; i2++) {
            String str = strConcat.concat(" -> ") + this.f48049d[i] + " : ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            C1146yh c1146yh = ((C1146yh[]) this.f48051f.f1685a)[this.f48047b[i]];
            sb.append(c1146yh);
            strConcat = str.concat(String.valueOf(c1146yh));
            i = this.f48048c[i];
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: b */
    public final float m19597b(int i) {
        int i2 = this.f48050e;
        for (int i3 = 0; i2 != -1 && i3 < this.f48046a; i3++) {
            if (i3 == i) {
                return this.f48049d[i2];
            }
            i2 = this.f48048c[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final C1146yh m19599d(int i) {
        int i2 = this.f48050e;
        for (int i3 = 0; i2 != -1 && i3 < this.f48046a; i3++) {
            if (i3 == i) {
                return ((C1146yh[]) this.f48051f.f1685a)[this.f48047b[i2]];
            }
            i2 = this.f48048c[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m19600e(C1146yh c1146yh, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f48050e;
            if (i == -1) {
                this.f48050e = 0;
                this.f48049d[0] = f;
                this.f48047b[0] = c1146yh.f48129c;
                this.f48048c[0] = -1;
                c1146yh.f48138l++;
                c1146yh.m19639a(this.f48052g);
                this.f48046a++;
                if (this.f48055j) {
                    return;
                }
                int i2 = this.f48054i + 1;
                this.f48054i = i2;
                int length = this.f48047b.length;
                if (i2 >= length) {
                    this.f48055j = true;
                    this.f48054i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f48046a; i4++) {
                int i5 = this.f48047b[i];
                int i6 = c1146yh.f48129c;
                if (i5 == i6) {
                    float[] fArr = this.f48049d;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f48050e) {
                            this.f48050e = this.f48048c[i];
                        } else {
                            int[] iArr = this.f48048c;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            c1146yh.m19640b(this.f48052g);
                        }
                        if (this.f48055j) {
                            this.f48054i = i;
                        }
                        c1146yh.f48138l--;
                        this.f48046a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f48048c[i];
            }
            int length2 = this.f48054i;
            int i7 = length2 + 1;
            if (this.f48055j) {
                int[] iArr2 = this.f48047b;
                if (iArr2[length2] != -1) {
                    length2 = iArr2.length;
                }
            } else {
                length2 = i7;
            }
            int length3 = this.f48047b.length;
            if (length2 >= length3 && this.f48046a < length3) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.f48047b;
                    if (i8 >= iArr3.length) {
                        break;
                    }
                    if (iArr3[i8] == -1) {
                        length2 = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length4 = this.f48047b.length;
            if (length2 >= length4) {
                int i9 = this.f48053h;
                int i10 = i9 + i9;
                this.f48053h = i10;
                this.f48055j = false;
                this.f48054i = length4 - 1;
                this.f48049d = Arrays.copyOf(this.f48049d, i10);
                this.f48047b = Arrays.copyOf(this.f48047b, this.f48053h);
                this.f48048c = Arrays.copyOf(this.f48048c, this.f48053h);
                length2 = length4;
            }
            this.f48047b[length2] = c1146yh.f48129c;
            this.f48049d[length2] = f;
            if (i3 != -1) {
                int[] iArr4 = this.f48048c;
                iArr4[length2] = iArr4[i3];
                iArr4[i3] = length2;
            } else {
                this.f48048c[length2] = this.f48050e;
                this.f48050e = length2;
            }
            c1146yh.f48138l++;
            c1146yh.m19639a(this.f48052g);
            this.f48046a++;
            if (!this.f48055j) {
                this.f48054i++;
            }
            int i11 = this.f48054i;
            int length5 = this.f48047b.length;
            if (i11 >= length5) {
                this.f48055j = true;
                this.f48054i = length5 - 1;
            }
        }
    }
}
