package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ao */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0042ao extends C0046as {

    /* JADX INFO: renamed from: ag */
    int f1861ag;

    /* JADX INFO: renamed from: ah */
    int f1862ah;

    /* JADX INFO: renamed from: am */
    private C0045ar f1866am;

    /* JADX INFO: renamed from: af */
    protected final C0011ak f1860af = new C0011ak();

    /* JADX INFO: renamed from: an */
    private int f1867an = 0;

    /* JADX INFO: renamed from: ao */
    private int f1868ao = 0;

    /* JADX INFO: renamed from: ap */
    private C0014an[] f1869ap = new C0014an[4];

    /* JADX INFO: renamed from: aq */
    private C0014an[] f1870aq = new C0014an[4];

    /* JADX INFO: renamed from: ar */
    private C0014an[] f1871ar = new C0014an[4];

    /* JADX INFO: renamed from: ai */
    public int f1863ai = 2;

    /* JADX INFO: renamed from: as */
    private final boolean[] f1872as = new boolean[3];

    /* JADX INFO: renamed from: at */
    private final C0014an[] f1873at = new C0014an[4];

    /* JADX INFO: renamed from: aj */
    public boolean f1864aj = false;

    /* JADX INFO: renamed from: ak */
    public boolean f1865ak = false;

    /* JADX INFO: renamed from: G */
    private final int m1740G(C0011ak c0011ak, C0014an[] c0014anArr, C0014an c0014an, int i, boolean[] zArr) {
        int i2;
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        C0014an c0014an2 = null;
        c0014anArr[0] = null;
        c0014anArr[2] = null;
        c0014anArr[1] = null;
        c0014anArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            C0013am c0013am = c0014an.f819i.f672b;
            boolean z = c0013am == null || c0013am.f671a == this;
            c0014an.f806ab = null;
            C0014an c0014an3 = c0014an.f788K != 8 ? c0014an : null;
            C0014an c0014an4 = c0014an;
            C0014an c0014an5 = null;
            C0014an c0014an6 = c0014an3;
            i2 = 0;
            while (c0014an4.f821k.f672b != null) {
                c0014an4.f806ab = c0014an2;
                if (c0014an4.f788K != 8) {
                    if (c0014an3 == null) {
                        c0014an3 = c0014an4;
                    }
                    if (c0014an6 != null && c0014an6 != c0014an4) {
                        c0014an6.f806ab = c0014an4;
                    }
                    c0014an6 = c0014an4;
                } else {
                    C0013am c0013am2 = c0014an4.f819i;
                    c0011ak.m861n(c0013am2.f676f, c0013am2.f672b.f676f, 0, 5);
                    c0011ak.m861n(c0014an4.f821k.f676f, c0014an4.f819i.f676f, 0, 5);
                }
                if (c0014an4.f788K != 8 && c0014an4.f808ad == 3) {
                    if (c0014an4.f809ae == 3) {
                        zArr[0] = false;
                    }
                    if (c0014an4.f831u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        C0014an[] c0014anArr2 = this.f1869ap;
                        int length = c0014anArr2.length;
                        if (i4 >= length) {
                            this.f1869ap = (C0014an[]) Arrays.copyOf(c0014anArr2, length + length);
                        }
                        this.f1869ap[i2] = c0014an4;
                        i2 = i4;
                    }
                }
                C0014an c0014an7 = c0014an4.f821k.f672b.f671a;
                C0013am c0013am3 = c0014an7.f819i.f672b;
                if (c0013am3 == null || c0013am3.f671a != c0014an4 || c0014an7 == c0014an4) {
                    break;
                }
                c0014an5 = c0014an7;
                c0014an4 = c0014an5;
                c0014an2 = null;
                f = 0.0f;
            }
            C0013am c0013am4 = c0014an4.f821k.f672b;
            if (c0013am4 != null && c0013am4.f671a != this) {
                z = false;
            }
            if (c0014an.f819i.f672b == null || c0014an5.f821k.f672b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            c0014an.f801X = z;
            c0014an5.f806ab = null;
            c0014anArr[0] = c0014an;
            c0014anArr[2] = c0014an3;
            c0014anArr[c2] = c0014an5;
            c0014anArr[3] = c0014an6;
        } else {
            C0013am c0013am5 = c0014an.f820j.f672b;
            boolean z2 = c0013am5 == null || c0013am5.f671a == this;
            c0014an.f807ac = null;
            C0014an c0014an8 = c0014an;
            C0014an c0014an9 = c0014an.f788K != 8 ? c0014an : null;
            C0014an c0014an10 = c0014an9;
            C0014an c0014an11 = null;
            int i5 = 0;
            while (true) {
                if (c0014an8.f822l.f672b == null) {
                    i2 = i5;
                    break;
                }
                c0014an8.f807ac = null;
                if (c0014an8.f788K != 8) {
                    if (c0014an9 == null) {
                        c0014an9 = c0014an8;
                    }
                    if (c0014an10 != null && c0014an10 != c0014an8) {
                        c0014an10.f807ac = c0014an8;
                    }
                    c0014an10 = c0014an8;
                } else {
                    C0013am c0013am6 = c0014an8.f820j;
                    c0011ak.m861n(c0013am6.f676f, c0013am6.f672b.f676f, 0, i3);
                    c0011ak.m861n(c0014an8.f822l.f676f, c0014an8.f820j.f676f, 0, i3);
                }
                if (c0014an8.f788K != 8 && c0014an8.f809ae == 3) {
                    if (c0014an8.f808ad == 3) {
                        zArr[0] = false;
                    }
                    if (c0014an8.f831u <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        C0014an[] c0014anArr3 = this.f1869ap;
                        int length2 = c0014anArr3.length;
                        if (i6 >= length2) {
                            this.f1869ap = (C0014an[]) Arrays.copyOf(c0014anArr3, length2 + length2);
                        }
                        this.f1869ap[i5] = c0014an8;
                        i5 = i6;
                    }
                }
                C0014an c0014an12 = c0014an8.f822l.f672b.f671a;
                C0013am c0013am7 = c0014an12.f820j.f672b;
                if (c0013am7 == null || c0013am7.f671a != c0014an8 || c0014an12 == c0014an8) {
                    i2 = i5;
                    break;
                }
                c0014an11 = c0014an12;
                c0014an8 = c0014an11;
                i3 = 5;
            }
            C0013am c0013am8 = c0014an8.f822l.f672b;
            if (c0013am8 != null && c0013am8.f671a != this) {
                z2 = false;
            }
            if (c0014an.f820j.f672b == null || c0014an11.f822l.f672b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            c0014an.f802Y = z2;
            c0014an11.f807ac = null;
            c0014anArr[0] = c0014an;
            c0014anArr[2] = c0014an9;
            c0014anArr[c] = c0014an11;
            c0014anArr[3] = c0014an10;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:271:0x051f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0525  */
    /* JADX WARN: Code duplicated, block: B:304:0x0527 A[SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    private final void m1741H(C0011ak c0011ak) {
        int iM993g;
        float f;
        float f2;
        int i;
        C0013am c0013am;
        float fM994h;
        C0013am c0013am2;
        C0014an c0014an;
        C0014an c0014an2;
        int i2;
        C0014an c0014an3;
        C0012al c0012al;
        int i3;
        C0013am c0013am3;
        C0013am c0013am4;
        C0013am c0013am5;
        C0013am c0013am6;
        C0014an c0014an4;
        C0013am c0013am7;
        C0013am c0013am8;
        int iM927a;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f1867an) {
            C0014an c0014an5 = this.f1871ar[i5];
            int iM1740G = m1740G(c0011ak, this.f1873at, c0014an5, 0, this.f1872as);
            C0014an c0014an6 = this.f1873at[2];
            if (c0014an6 == null) {
                i = i5;
            } else {
                boolean[] zArr = this.f1872as;
                if (zArr[1]) {
                    int iM988b = c0014an5.m988b();
                    while (c0014an6 != null) {
                        c0011ak.m855h(c0014an6.f819i.f676f, iM988b);
                        C0014an c0014an7 = c0014an6.f806ab;
                        iM988b += c0014an6.f819i.m927a() + c0014an6.m994h() + c0014an6.f821k.m927a();
                        c0014an6 = c0014an7;
                    }
                    i = i5;
                } else {
                    int i6 = c0014an5.f799V;
                    boolean z = i6 == 0;
                    boolean z2 = i6 == 2;
                    int i7 = this.f808ad;
                    int i8 = this.f1863ai;
                    int i9 = 8;
                    float f3 = 0.0f;
                    char c = 3;
                    if ((i8 == 2 || i8 == 8) && zArr[i4] && c0014an5.f801X && !z2 && i7 != 2 && i6 == 0) {
                        C0014an c0014an8 = c0014an5;
                        C0014an c0014an9 = null;
                        int i10 = 0;
                        float f4 = 0.0f;
                        int iM927a2 = 0;
                        while (c0014an8 != null) {
                            if (c0014an8.f788K != 8) {
                                i10++;
                                if (c0014an8.f808ad != 3) {
                                    int iM994h = iM927a2 + c0014an8.m994h();
                                    C0013am c0013am9 = c0014an8.f819i;
                                    int iM927a3 = iM994h + (c0013am9.f672b != null ? c0013am9.m927a() : 0);
                                    C0013am c0013am10 = c0014an8.f821k;
                                    iM927a2 = iM927a3 + (c0013am10.f672b != null ? c0013am10.m927a() : 0);
                                } else {
                                    f4 += c0014an8.f803Z;
                                }
                            }
                            C0013am c0013am11 = c0014an8.f821k.f672b;
                            C0014an c0014an10 = c0013am11 != null ? c0013am11.f671a : null;
                            if (c0014an10 != null && ((c0013am2 = c0014an10.f819i.f672b) == null || c0013am2.f671a != c0014an8)) {
                                c0014an10 = null;
                            }
                            C0014an c0014an11 = c0014an10;
                            c0014an9 = c0014an8;
                            c0014an8 = c0014an11;
                        }
                        if (c0014an9 != null) {
                            C0013am c0013am12 = c0014an9.f821k.f672b;
                            iM993g = c0013am12 != null ? c0013am12.f671a.f833w : 0;
                            if (c0013am12 != null && c0013am12.f671a == this) {
                                iM993g = m993g();
                            }
                        } else {
                            iM993g = 0;
                        }
                        int i11 = i10 + 1;
                        float f5 = iM993g - iM927a2;
                        if (iM1740G == 0) {
                            f2 = f5 / i11;
                            f = f2;
                        } else {
                            f = f5 / iM1740G;
                            f2 = 0.0f;
                        }
                        while (c0014an5 != null) {
                            C0013am c0013am13 = c0014an5.f819i;
                            int iM927a4 = c0013am13.f672b != null ? c0013am13.m927a() : 0;
                            C0013am c0013am14 = c0014an5.f821k;
                            int iM927a5 = c0013am14.f672b != null ? c0013am14.m927a() : 0;
                            if (c0014an5.f788K != i9) {
                                float f6 = iM927a4;
                                float f7 = f2 + f6;
                                c0011ak.m855h(c0014an5.f819i.f676f, (int) (f7 + 0.5f));
                                if (c0014an5.f808ad == 3) {
                                    fM994h = f4 == 0.0f ? f7 + ((f - f6) - iM927a5) : f7 + ((((c0014an5.f803Z * f5) / f4) - f6) - iM927a5);
                                } else {
                                    fM994h = f7 + c0014an5.m994h();
                                }
                                c0011ak.m855h(c0014an5.f821k.f676f, (int) (fM994h + 0.5f));
                                if (iM1740G == 0) {
                                    fM994h += f;
                                }
                                f2 = fM994h + iM927a5;
                            } else {
                                int i12 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                                c0011ak.m855h(c0014an5.f819i.f676f, i12);
                                c0011ak.m855h(c0014an5.f821k.f676f, i12);
                            }
                            C0013am c0013am15 = c0014an5.f821k.f672b;
                            C0014an c0014an12 = c0013am15 != null ? c0013am15.f671a : null;
                            c0014an5 = (c0014an12 == null || (c0013am = c0014an12.f819i.f672b) == null || c0013am.f671a == c0014an5) ? c0014an12 : null;
                            if (c0014an5 == this) {
                                c0014an5 = null;
                            }
                            i9 = 8;
                        }
                        i = i5;
                    } else {
                        if (iM1740G == 0) {
                            c0014an = null;
                            c0014an2 = null;
                            i4 = 0;
                        } else if (z2) {
                            c0014an = null;
                            c0014an2 = null;
                        } else {
                            C0014an c0014an13 = null;
                            while (c0014an6 != null) {
                                if (c0014an6.f808ad != 3) {
                                    int iM927a6 = c0014an6.f819i.m927a();
                                    if (c0014an13 != null) {
                                        iM927a6 += c0014an13.f821k.m927a();
                                    }
                                    C0013am c0013am16 = c0014an6.f819i;
                                    C0013am c0013am17 = c0013am16.f672b;
                                    c0011ak.m856i(c0013am16.f676f, c0013am17.f676f, iM927a6, c0013am17.f671a.f808ad == 3 ? 2 : 3);
                                    int iM927a7 = c0014an6.f821k.m927a();
                                    C0013am c0013am18 = c0014an6.f821k.f672b.f671a.f819i;
                                    C0013am c0013am19 = c0013am18.f672b;
                                    if (c0013am19 != null && c0013am19.f671a == c0014an6) {
                                        iM927a7 += c0013am18.m927a();
                                    }
                                    C0013am c0013am20 = c0014an6.f821k;
                                    C0013am c0013am21 = c0013am20.f672b;
                                    c0011ak.m857j(c0013am20.f676f, c0013am21.f676f, -iM927a7, c0013am21.f671a.f808ad == 3 ? 2 : 3);
                                } else {
                                    f3 += c0014an6.f803Z;
                                    C0013am c0013am22 = c0014an6.f821k;
                                    if (c0013am22.f672b != null) {
                                        iM927a = c0013am22.m927a();
                                        if (c0014an6 != this.f1873at[3]) {
                                            iM927a += c0014an6.f821k.f672b.f671a.f819i.m927a();
                                        }
                                    } else {
                                        iM927a = 0;
                                    }
                                    c0011ak.m856i(c0014an6.f821k.f676f, c0014an6.f819i.f676f, i4, 1);
                                    C0013am c0013am23 = c0014an6.f821k;
                                    c0011ak.m857j(c0013am23.f676f, c0013am23.f672b.f676f, -iM927a, 1);
                                }
                                c0014an13 = c0014an6;
                                c0014an6 = c0014an6.f806ab;
                            }
                            if (iM1740G != 1) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = iM1740G - 1;
                                    if (i13 >= i14) {
                                        break;
                                    }
                                    C0014an[] c0014anArr = this.f1869ap;
                                    C0014an c0014an14 = c0014anArr[i13];
                                    i13++;
                                    C0014an c0014an15 = c0014anArr[i13];
                                    C0013am c0013am24 = c0014an14.f819i;
                                    C0012al c0012al2 = c0013am24.f676f;
                                    C0012al c0012al3 = c0014an14.f821k.f676f;
                                    C0012al c0012al4 = c0014an15.f819i.f676f;
                                    C0012al c0012al5 = c0014an15.f821k.f676f;
                                    int i15 = iM1740G;
                                    C0014an[] c0014anArr2 = this.f1873at;
                                    C0012al c0012al6 = c0014an15 == c0014anArr2[c] ? c0014anArr2[1].f821k.f676f : c0012al5;
                                    int iM927a8 = c0013am24.m927a();
                                    C0013am c0013am25 = c0014an14.f819i.f672b;
                                    if (c0013am25 != null && (c0013am8 = (c0013am7 = c0013am25.f671a.f821k).f672b) != null && c0013am8.f671a == c0014an14) {
                                        iM927a8 += c0013am7.m927a();
                                    }
                                    c0011ak.m856i(c0012al2, c0014an14.f819i.f672b.f676f, iM927a8, 2);
                                    int iM927a9 = c0014an14.f821k.m927a();
                                    if (c0014an14.f821k.f672b != null && (c0014an4 = c0014an14.f806ab) != null) {
                                        C0013am c0013am26 = c0014an4.f819i;
                                        iM927a9 += c0013am26.f672b != null ? c0013am26.m927a() : 0;
                                    }
                                    c0011ak.m857j(c0012al3, c0014an14.f821k.f672b.f676f, -iM927a9, 2);
                                    if (i13 == i14) {
                                        int iM927a10 = c0014an15.f819i.m927a();
                                        C0013am c0013am27 = c0014an15.f819i.f672b;
                                        if (c0013am27 != null && (c0013am6 = (c0013am5 = c0013am27.f671a.f821k).f672b) != null && c0013am6.f671a == c0014an15) {
                                            iM927a10 += c0013am5.m927a();
                                        }
                                        c0011ak.m856i(c0012al4, c0014an15.f819i.f672b.f676f, iM927a10, 2);
                                        C0013am c0013am28 = c0014an15.f821k;
                                        C0014an[] c0014anArr3 = this.f1873at;
                                        if (c0014an15 == c0014anArr3[3]) {
                                            c0013am28 = c0014anArr3[1].f821k;
                                        }
                                        int iM927a11 = c0013am28.m927a();
                                        C0013am c0013am29 = c0013am28.f672b;
                                        if (c0013am29 != null && (c0013am4 = (c0013am3 = c0013am29.f671a.f819i).f672b) != null && c0013am4.f671a == c0014an15) {
                                            iM927a11 += c0013am3.m927a();
                                        }
                                        i3 = 2;
                                        c0011ak.m857j(c0012al6, c0013am28.f672b.f676f, -iM927a11, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i16 = c0014an5.f816f;
                                    if (i16 > 0) {
                                        c0011ak.m857j(c0012al3, c0012al2, i16, i3);
                                    }
                                    C0009ai c0009aiM850a = c0011ak.m850a();
                                    c0009aiM850a.m722f(c0014an14.f803Z, f3, c0014an15.f803Z, c0012al2, c0014an14.f819i.m927a(), c0012al3, c0014an14.f821k.m927a(), c0012al4, c0014an15.f819i.m927a(), c0012al6, c0014an15.f821k.m927a());
                                    c0011ak.m854g(c0009aiM850a);
                                    iM1740G = i15;
                                    c = 3;
                                }
                            } else {
                                C0014an c0014an16 = this.f1869ap[i4];
                                int iM927a12 = c0014an16.f819i.m927a();
                                C0013am c0013am30 = c0014an16.f819i.f672b;
                                if (c0013am30 != null) {
                                    iM927a12 += c0013am30.m927a();
                                }
                                int iM927a13 = c0014an16.f821k.m927a();
                                C0013am c0013am31 = c0014an16.f821k.f672b;
                                if (c0013am31 != null) {
                                    iM927a13 += c0013am31.m927a();
                                }
                                C0012al c0012al7 = c0014an5.f821k.f672b.f676f;
                                C0014an[] c0014anArr4 = this.f1873at;
                                if (c0014an16 == c0014anArr4[3]) {
                                    c0012al7 = c0014anArr4[1].f821k.f672b.f676f;
                                }
                                if (c0014an16.f813c == 1) {
                                    C0013am c0013am32 = c0014an5.f819i;
                                    c0011ak.m856i(c0013am32.f676f, c0013am32.f672b.f676f, iM927a12, 1);
                                    c0011ak.m857j(c0014an5.f821k.f676f, c0012al7, -iM927a13, 1);
                                    c0011ak.m861n(c0014an5.f821k.f676f, c0014an5.f819i.f676f, c0014an5.m994h(), 2);
                                    i = i5;
                                } else {
                                    C0013am c0013am33 = c0014an16.f819i;
                                    c0011ak.m861n(c0013am33.f676f, c0013am33.f672b.f676f, iM927a12, 1);
                                    c0011ak.m861n(c0014an16.f821k.f676f, c0012al7, -iM927a13, 1);
                                }
                            }
                            i = i5;
                        }
                        while (c0014an6 != null) {
                            C0014an c0014an17 = c0014an6.f806ab;
                            if (c0014an17 == null) {
                                c0014an = this.f1873at[1];
                                i2 = 1;
                            } else {
                                i2 = i4;
                            }
                            if (z2) {
                                C0013am c0013am34 = c0014an6.f819i;
                                int iM927a14 = c0013am34.m927a();
                                if (c0014an2 != null) {
                                    iM927a14 += c0014an2.f821k.m927a();
                                }
                                c0011ak.m856i(c0013am34.f676f, c0013am34.f672b.f676f, iM927a14, c0014an6 != c0014an6 ? 3 : 1);
                                if (c0014an6.f808ad == 3) {
                                    C0013am c0013am35 = c0014an6.f821k;
                                    if (c0014an6.f813c == 1) {
                                        c0011ak.m861n(c0013am35.f676f, c0013am34.f676f, Math.max(c0014an6.f815e, c0014an6.m994h()), 3);
                                    } else {
                                        c0011ak.m856i(c0013am34.f676f, c0013am34.f672b.f676f, c0013am34.f673c, 3);
                                        c0011ak.m857j(c0013am35.f676f, c0013am34.f676f, c0014an6.f815e, 3);
                                    }
                                }
                            } else if (z || i2 == 0 || c0014an2 == null) {
                                if (!z && i2 == 0 && c0014an2 == null) {
                                    C0013am c0013am36 = c0014an6.f819i;
                                    if (c0013am36.f672b == null) {
                                        c0011ak.m855h(c0013am36.f676f, c0014an6.m988b());
                                    } else {
                                        c0011ak.m861n(c0014an6.f819i.f676f, c0014an5.f819i.f672b.f676f, c0013am36.m927a(), 5);
                                    }
                                } else {
                                    C0013am c0013am37 = c0014an6.f819i;
                                    C0013am c0013am38 = c0014an6.f821k;
                                    int iM927a15 = c0013am37.m927a();
                                    int iM927a16 = c0013am38.m927a();
                                    c0014an3 = c0014an6;
                                    c0011ak.m856i(c0013am37.f676f, c0013am37.f672b.f676f, iM927a15, 1);
                                    c0011ak.m857j(c0013am38.f676f, c0013am38.f672b.f676f, -iM927a16, 1);
                                    C0013am c0013am39 = c0013am37.f672b;
                                    C0012al c0012al8 = c0013am39 != null ? c0013am39.f676f : null;
                                    if (c0014an2 == null) {
                                        C0013am c0013am40 = c0014an5.f819i.f672b;
                                        c0012al = c0013am40 != null ? c0013am40.f676f : null;
                                    } else {
                                        c0012al = c0012al8;
                                    }
                                    if (c0014an17 == null) {
                                        C0013am c0013am41 = c0014an.f821k.f672b;
                                        c0014an17 = c0013am41 != null ? c0013am41.f671a : null;
                                    }
                                    if (c0014an17 != null) {
                                        C0012al c0012al9 = c0014an17.f819i.f676f;
                                        if (i2 != 0) {
                                            C0013am c0013am42 = c0014an.f821k.f672b;
                                            c0012al9 = c0013am42 != null ? c0013am42.f676f : null;
                                        }
                                        if (c0012al != null && c0012al9 != null) {
                                            c0011ak.m860m(c0013am37.f676f, c0012al, iM927a15, 0.5f, c0012al9, c0013am38.f676f, iM927a16);
                                        }
                                    }
                                }
                                if (1 == i2) {
                                    c0014an17 = null;
                                }
                                this = this;
                                i5 = i5;
                                c0014an5 = c0014an5;
                                c0014an6 = c0014an17;
                                i4 = i2;
                                c0014an2 = c0014an3;
                            } else {
                                C0013am c0013am43 = c0014an6.f821k;
                                if (c0013am43.f672b == null) {
                                    c0011ak.m855h(c0013am43.f676f, c0014an6.m988b() + c0014an6.f835y);
                                } else {
                                    c0011ak.m861n(c0014an6.f821k.f676f, c0014an.f821k.f672b.f676f, -c0013am43.m927a(), 5);
                                }
                            }
                            c0014an3 = c0014an6;
                            if (1 == i2) {
                                c0014an17 = null;
                            }
                            this = this;
                            i5 = i5;
                            c0014an5 = c0014an5;
                            c0014an6 = c0014an17;
                            i4 = i2;
                            c0014an2 = c0014an3;
                        }
                        C0014an c0014an18 = c0014an5;
                        i = i5;
                        if (z2) {
                            C0013am c0013am44 = c0014an6.f819i;
                            C0013am c0013am45 = c0014an.f821k;
                            int iM927a17 = c0013am44.m927a();
                            int iM927a18 = c0013am45.m927a();
                            C0013am c0013am46 = c0014an18.f819i.f672b;
                            C0012al c0012al10 = c0013am46 != null ? c0013am46.f676f : null;
                            C0013am c0013am47 = c0014an.f821k.f672b;
                            C0012al c0012al11 = c0013am47 != null ? c0013am47.f676f : null;
                            if (c0012al10 != null && c0012al11 != null) {
                                c0011ak.m857j(c0013am45.f676f, c0012al11, -iM927a18, 1);
                                c0011ak.m860m(c0013am44.f676f, c0012al10, iM927a17, c0014an18.f785H, c0012al11, c0013am45.f676f, iM927a18);
                            }
                        }
                    }
                }
            }
            i5 = i + 1;
            i4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:281:0x053e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0544  */
    /* JADX WARN: Code duplicated, block: B:314:0x0546 A[SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    private final void m1742I(C0011ak c0011ak) {
        int iM987a;
        float f;
        float f2;
        int i;
        C0013am c0013am;
        float fM990d;
        C0013am c0013am2;
        C0014an c0014an;
        C0014an c0014an2;
        int i2;
        C0014an c0014an3;
        C0012al c0012al;
        C0012al c0012al2;
        C0012al c0012al3;
        int i3;
        C0013am c0013am3;
        C0013am c0013am4;
        C0013am c0013am5;
        C0013am c0013am6;
        C0014an c0014an4;
        C0013am c0013am7;
        C0013am c0013am8;
        int iM927a;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f1868ao) {
            C0014an c0014an5 = this.f1870aq[i5];
            int iM1740G = m1740G(c0011ak, this.f1873at, c0014an5, 1, this.f1872as);
            C0014an c0014an6 = this.f1873at[2];
            if (c0014an6 == null) {
                i = i5;
            } else {
                boolean[] zArr = this.f1872as;
                if (zArr[1]) {
                    int iM989c = c0014an5.m989c();
                    while (c0014an6 != null) {
                        c0011ak.m855h(c0014an6.f820j.f676f, iM989c);
                        C0014an c0014an7 = c0014an6.f807ac;
                        iM989c += c0014an6.f820j.m927a() + c0014an6.m990d() + c0014an6.f822l.m927a();
                        c0014an6 = c0014an7;
                    }
                    i = i5;
                } else {
                    int i6 = c0014an5.f800W;
                    boolean z = i6 == 0;
                    boolean z2 = i6 == 2;
                    int i7 = this.f809ae;
                    int i8 = this.f1863ai;
                    int i9 = 8;
                    float f3 = 0.0f;
                    char c = 3;
                    if ((i8 == 2 || i8 == 8) && zArr[i4] && c0014an5.f802Y && !z2 && i7 != 2 && i6 == 0) {
                        C0014an c0014an8 = c0014an5;
                        C0014an c0014an9 = null;
                        int i10 = 0;
                        float f4 = 0.0f;
                        int iM927a2 = 0;
                        while (c0014an8 != null) {
                            if (c0014an8.f788K != 8) {
                                i10++;
                                if (c0014an8.f809ae != 3) {
                                    int iM990d = iM927a2 + c0014an8.m990d();
                                    C0013am c0013am9 = c0014an8.f820j;
                                    int iM927a3 = iM990d + (c0013am9.f672b != null ? c0013am9.m927a() : 0);
                                    C0013am c0013am10 = c0014an8.f822l;
                                    iM927a2 = iM927a3 + (c0013am10.f672b != null ? c0013am10.m927a() : 0);
                                } else {
                                    f4 += c0014an8.f805aa;
                                }
                            }
                            C0013am c0013am11 = c0014an8.f822l.f672b;
                            C0014an c0014an10 = c0013am11 != null ? c0013am11.f671a : null;
                            if (c0014an10 != null && ((c0013am2 = c0014an10.f820j.f672b) == null || c0013am2.f671a != c0014an8)) {
                                c0014an10 = null;
                            }
                            C0014an c0014an11 = c0014an10;
                            c0014an9 = c0014an8;
                            c0014an8 = c0014an11;
                        }
                        if (c0014an9 != null) {
                            C0013am c0013am12 = c0014an9.f822l.f672b;
                            iM987a = c0013am12 != null ? c0013am12.f671a.f833w : 0;
                            if (c0013am12 != null && c0013am12.f671a == this) {
                                iM987a = m987a();
                            }
                        } else {
                            iM987a = 0;
                        }
                        int i11 = i10 + 1;
                        float f5 = iM987a - iM927a2;
                        if (iM1740G == 0) {
                            f2 = f5 / i11;
                            f = f2;
                        } else {
                            f = f5 / iM1740G;
                            f2 = 0.0f;
                        }
                        while (c0014an5 != null) {
                            C0013am c0013am13 = c0014an5.f820j;
                            int iM927a4 = c0013am13.f672b != null ? c0013am13.m927a() : 0;
                            C0013am c0013am14 = c0014an5.f822l;
                            int iM927a5 = c0013am14.f672b != null ? c0013am14.m927a() : 0;
                            if (c0014an5.f788K != i9) {
                                float f6 = iM927a4;
                                float f7 = f2 + f6;
                                c0011ak.m855h(c0014an5.f820j.f676f, (int) (f7 + 0.5f));
                                if (c0014an5.f809ae == 3) {
                                    fM990d = f4 == 0.0f ? f7 + ((f - f6) - iM927a5) : f7 + ((((c0014an5.f805aa * f5) / f4) - f6) - iM927a5);
                                } else {
                                    fM990d = f7 + c0014an5.m990d();
                                }
                                c0011ak.m855h(c0014an5.f822l.f676f, (int) (fM990d + 0.5f));
                                if (iM1740G == 0) {
                                    fM990d += f;
                                }
                                f2 = fM990d + iM927a5;
                            } else {
                                int i12 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                                c0011ak.m855h(c0014an5.f820j.f676f, i12);
                                c0011ak.m855h(c0014an5.f822l.f676f, i12);
                            }
                            C0013am c0013am15 = c0014an5.f822l.f672b;
                            C0014an c0014an12 = c0013am15 != null ? c0013am15.f671a : null;
                            c0014an5 = (c0014an12 == null || (c0013am = c0014an12.f820j.f672b) == null || c0013am.f671a == c0014an5) ? c0014an12 : null;
                            if (c0014an5 == this) {
                                c0014an5 = null;
                            }
                            i9 = 8;
                        }
                        i = i5;
                    } else {
                        if (iM1740G == 0) {
                            c0014an = null;
                            c0014an2 = null;
                            i4 = 0;
                        } else if (z2) {
                            c0014an = null;
                            c0014an2 = null;
                        } else {
                            C0014an c0014an13 = null;
                            while (c0014an6 != null) {
                                if (c0014an6.f809ae != 3) {
                                    int iM927a6 = c0014an6.f820j.m927a();
                                    if (c0014an13 != null) {
                                        iM927a6 += c0014an13.f822l.m927a();
                                    }
                                    C0013am c0013am16 = c0014an6.f820j;
                                    C0013am c0013am17 = c0013am16.f672b;
                                    c0011ak.m856i(c0013am16.f676f, c0013am17.f676f, iM927a6, c0013am17.f671a.f809ae == 3 ? 2 : 3);
                                    int iM927a7 = c0014an6.f822l.m927a();
                                    C0013am c0013am18 = c0014an6.f822l.f672b.f671a.f820j;
                                    C0013am c0013am19 = c0013am18.f672b;
                                    if (c0013am19 != null && c0013am19.f671a == c0014an6) {
                                        iM927a7 += c0013am18.m927a();
                                    }
                                    C0013am c0013am20 = c0014an6.f822l;
                                    C0013am c0013am21 = c0013am20.f672b;
                                    c0011ak.m857j(c0013am20.f676f, c0013am21.f676f, -iM927a7, c0013am21.f671a.f809ae == 3 ? 2 : 3);
                                } else {
                                    f3 += c0014an6.f805aa;
                                    C0013am c0013am22 = c0014an6.f822l;
                                    if (c0013am22.f672b != null) {
                                        iM927a = c0013am22.m927a();
                                        if (c0014an6 != this.f1873at[3]) {
                                            iM927a += c0014an6.f822l.f672b.f671a.f820j.m927a();
                                        }
                                    } else {
                                        iM927a = 0;
                                    }
                                    c0011ak.m856i(c0014an6.f822l.f676f, c0014an6.f820j.f676f, i4, 1);
                                    C0013am c0013am23 = c0014an6.f822l;
                                    c0011ak.m857j(c0013am23.f676f, c0013am23.f672b.f676f, -iM927a, 1);
                                }
                                c0014an13 = c0014an6;
                                c0014an6 = c0014an6.f807ac;
                            }
                            if (iM1740G != 1) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = iM1740G - 1;
                                    if (i13 >= i14) {
                                        break;
                                    }
                                    C0014an[] c0014anArr = this.f1869ap;
                                    C0014an c0014an14 = c0014anArr[i13];
                                    i13++;
                                    C0014an c0014an15 = c0014anArr[i13];
                                    C0013am c0013am24 = c0014an14.f820j;
                                    C0012al c0012al4 = c0013am24.f676f;
                                    C0012al c0012al5 = c0014an14.f822l.f676f;
                                    C0012al c0012al6 = c0014an15.f820j.f676f;
                                    C0012al c0012al7 = c0014an15.f822l.f676f;
                                    int i15 = iM1740G;
                                    C0014an[] c0014anArr2 = this.f1873at;
                                    C0012al c0012al8 = c0014an15 == c0014anArr2[c] ? c0014anArr2[1].f822l.f676f : c0012al7;
                                    int iM927a8 = c0013am24.m927a();
                                    C0013am c0013am25 = c0014an14.f820j.f672b;
                                    if (c0013am25 != null && (c0013am8 = (c0013am7 = c0013am25.f671a.f822l).f672b) != null && c0013am8.f671a == c0014an14) {
                                        iM927a8 += c0013am7.m927a();
                                    }
                                    c0011ak.m856i(c0012al4, c0014an14.f820j.f672b.f676f, iM927a8, 2);
                                    int iM927a9 = c0014an14.f822l.m927a();
                                    if (c0014an14.f822l.f672b != null && (c0014an4 = c0014an14.f807ac) != null) {
                                        C0013am c0013am26 = c0014an4.f820j;
                                        iM927a9 += c0013am26.f672b != null ? c0013am26.m927a() : 0;
                                    }
                                    c0011ak.m857j(c0012al5, c0014an14.f822l.f672b.f676f, -iM927a9, 2);
                                    if (i13 == i14) {
                                        int iM927a10 = c0014an15.f820j.m927a();
                                        C0013am c0013am27 = c0014an15.f820j.f672b;
                                        if (c0013am27 != null && (c0013am6 = (c0013am5 = c0013am27.f671a.f822l).f672b) != null && c0013am6.f671a == c0014an15) {
                                            iM927a10 += c0013am5.m927a();
                                        }
                                        c0011ak.m856i(c0012al6, c0014an15.f820j.f672b.f676f, iM927a10, 2);
                                        C0013am c0013am28 = c0014an15.f822l;
                                        C0014an[] c0014anArr3 = this.f1873at;
                                        if (c0014an15 == c0014anArr3[3]) {
                                            c0013am28 = c0014anArr3[1].f822l;
                                        }
                                        int iM927a11 = c0013am28.m927a();
                                        C0013am c0013am29 = c0013am28.f672b;
                                        if (c0013am29 != null && (c0013am4 = (c0013am3 = c0013am29.f671a.f820j).f672b) != null && c0013am4.f671a == c0014an15) {
                                            iM927a11 += c0013am3.m927a();
                                        }
                                        i3 = 2;
                                        c0011ak.m857j(c0012al8, c0013am28.f672b.f676f, -iM927a11, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i16 = c0014an5.f818h;
                                    if (i16 > 0) {
                                        c0011ak.m857j(c0012al5, c0012al4, i16, i3);
                                    }
                                    C0009ai c0009aiM850a = c0011ak.m850a();
                                    c0009aiM850a.m722f(c0014an14.f805aa, f3, c0014an15.f805aa, c0012al4, c0014an14.f820j.m927a(), c0012al5, c0014an14.f822l.m927a(), c0012al6, c0014an15.f820j.m927a(), c0012al8, c0014an15.f822l.m927a());
                                    c0011ak.m854g(c0009aiM850a);
                                    iM1740G = i15;
                                    c = 3;
                                }
                            } else {
                                C0014an c0014an16 = this.f1869ap[i4];
                                int iM927a12 = c0014an16.f820j.m927a();
                                C0013am c0013am30 = c0014an16.f820j.f672b;
                                if (c0013am30 != null) {
                                    iM927a12 += c0013am30.m927a();
                                }
                                int iM927a13 = c0014an16.f822l.m927a();
                                C0013am c0013am31 = c0014an16.f822l.f672b;
                                if (c0013am31 != null) {
                                    iM927a13 += c0013am31.m927a();
                                }
                                C0012al c0012al9 = c0014an5.f822l.f672b.f676f;
                                C0014an[] c0014anArr4 = this.f1873at;
                                if (c0014an16 == c0014anArr4[3]) {
                                    c0012al9 = c0014anArr4[1].f822l.f672b.f676f;
                                }
                                if (c0014an16.f814d == 1) {
                                    C0013am c0013am32 = c0014an5.f820j;
                                    c0011ak.m856i(c0013am32.f676f, c0013am32.f672b.f676f, iM927a12, 1);
                                    c0011ak.m857j(c0014an5.f822l.f676f, c0012al9, -iM927a13, 1);
                                    c0011ak.m861n(c0014an5.f822l.f676f, c0014an5.f820j.f676f, c0014an5.m990d(), 2);
                                    i = i5;
                                } else {
                                    C0013am c0013am33 = c0014an16.f820j;
                                    c0011ak.m861n(c0013am33.f676f, c0013am33.f672b.f676f, iM927a12, 1);
                                    c0011ak.m861n(c0014an16.f822l.f676f, c0012al9, -iM927a13, 1);
                                }
                            }
                            i = i5;
                        }
                        while (c0014an6 != null) {
                            C0014an c0014an17 = c0014an6.f807ac;
                            if (c0014an17 == null) {
                                c0014an = this.f1873at[1];
                                i2 = 1;
                            } else {
                                i2 = i4;
                            }
                            if (z2) {
                                C0013am c0013am34 = c0014an6.f820j;
                                int iM927a14 = c0013am34.m927a();
                                if (c0014an2 != null) {
                                    iM927a14 += c0014an2.f822l.m927a();
                                }
                                int i17 = c0014an6 != c0014an6 ? 3 : 1;
                                C0013am c0013am35 = c0013am34.f672b;
                                if (c0013am35 != null) {
                                    c0012al3 = c0013am34.f676f;
                                    c0012al2 = c0013am35.f676f;
                                } else {
                                    C0013am c0013am36 = c0014an6.f823m;
                                    C0013am c0013am37 = c0013am36.f672b;
                                    if (c0013am37 != null) {
                                        C0012al c0012al10 = c0013am36.f676f;
                                        C0012al c0012al11 = c0013am37.f676f;
                                        iM927a14 -= c0013am34.m927a();
                                        c0012al3 = c0012al10;
                                        c0012al2 = c0012al11;
                                    } else {
                                        c0012al2 = null;
                                        c0012al3 = null;
                                    }
                                }
                                if (c0012al3 != null && c0012al2 != null) {
                                    c0011ak.m856i(c0012al3, c0012al2, iM927a14, i17);
                                }
                                if (c0014an6.f809ae == 3) {
                                    C0013am c0013am38 = c0014an6.f822l;
                                    if (c0014an6.f814d == 1) {
                                        c0011ak.m861n(c0013am38.f676f, c0013am34.f676f, Math.max(c0014an6.f817g, c0014an6.m990d()), 3);
                                    } else {
                                        c0011ak.m856i(c0013am34.f676f, c0013am34.f672b.f676f, c0013am34.f673c, 3);
                                        c0011ak.m857j(c0013am38.f676f, c0013am34.f676f, c0014an6.f817g, 3);
                                    }
                                }
                            } else if (z || i2 == 0 || c0014an2 == null) {
                                if (!z && i2 == 0 && c0014an2 == null) {
                                    C0013am c0013am39 = c0014an6.f820j;
                                    if (c0013am39.f672b == null) {
                                        c0011ak.m855h(c0013am39.f676f, c0014an6.m989c());
                                    } else {
                                        c0011ak.m861n(c0014an6.f820j.f676f, c0014an5.f820j.f672b.f676f, c0013am39.m927a(), 5);
                                    }
                                } else {
                                    C0013am c0013am40 = c0014an6.f820j;
                                    C0013am c0013am41 = c0014an6.f822l;
                                    int iM927a15 = c0013am40.m927a();
                                    int iM927a16 = c0013am41.m927a();
                                    c0014an3 = c0014an6;
                                    c0011ak.m856i(c0013am40.f676f, c0013am40.f672b.f676f, iM927a15, 1);
                                    c0011ak.m857j(c0013am41.f676f, c0013am41.f672b.f676f, -iM927a16, 1);
                                    C0013am c0013am42 = c0013am40.f672b;
                                    C0012al c0012al12 = c0013am42 != null ? c0013am42.f676f : null;
                                    if (c0014an2 == null) {
                                        C0013am c0013am43 = c0014an5.f820j.f672b;
                                        c0012al = c0013am43 != null ? c0013am43.f676f : null;
                                    } else {
                                        c0012al = c0012al12;
                                    }
                                    if (c0014an17 == null) {
                                        C0013am c0013am44 = c0014an.f822l.f672b;
                                        c0014an17 = c0013am44 != null ? c0013am44.f671a : null;
                                    }
                                    if (c0014an17 != null) {
                                        C0012al c0012al13 = c0014an17.f820j.f676f;
                                        if (i2 != 0) {
                                            C0013am c0013am45 = c0014an.f822l.f672b;
                                            c0012al13 = c0013am45 != null ? c0013am45.f676f : null;
                                        }
                                        if (c0012al != null && c0012al13 != null) {
                                            c0011ak.m860m(c0013am40.f676f, c0012al, iM927a15, 0.5f, c0012al13, c0013am41.f676f, iM927a16);
                                        }
                                    }
                                }
                                if (1 == i2) {
                                    c0014an17 = null;
                                }
                                this = this;
                                i5 = i5;
                                c0014an5 = c0014an5;
                                c0014an6 = c0014an17;
                                i4 = i2;
                                c0014an2 = c0014an3;
                            } else {
                                C0013am c0013am46 = c0014an6.f822l;
                                if (c0013am46.f672b == null) {
                                    c0011ak.m855h(c0013am46.f676f, c0014an6.m989c() + c0014an6.f836z);
                                } else {
                                    c0011ak.m861n(c0014an6.f822l.f676f, c0014an.f822l.f672b.f676f, -c0013am46.m927a(), 5);
                                }
                            }
                            c0014an3 = c0014an6;
                            if (1 == i2) {
                                c0014an17 = null;
                            }
                            this = this;
                            i5 = i5;
                            c0014an5 = c0014an5;
                            c0014an6 = c0014an17;
                            i4 = i2;
                            c0014an2 = c0014an3;
                        }
                        C0014an c0014an18 = c0014an5;
                        i = i5;
                        if (z2) {
                            C0013am c0013am47 = c0014an6.f820j;
                            C0013am c0013am48 = c0014an.f822l;
                            int iM927a17 = c0013am47.m927a();
                            int iM927a18 = c0013am48.m927a();
                            C0013am c0013am49 = c0014an18.f820j.f672b;
                            C0012al c0012al14 = c0013am49 != null ? c0013am49.f676f : null;
                            C0013am c0013am50 = c0014an.f822l.f672b;
                            C0012al c0012al15 = c0013am50 != null ? c0013am50.f676f : null;
                            if (c0012al14 != null && c0012al15 != null) {
                                c0011ak.m857j(c0013am48.f676f, c0012al15, -iM927a18, 1);
                                c0011ak.m860m(c0013am47.f676f, c0012al14, iM927a17, c0014an18.f786I, c0012al15, c0013am48.f676f, iM927a18);
                            }
                        }
                    }
                }
            }
            i5 = i + 1;
            i4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0161 A[PHI: r0
      0x0161: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v5 int), (r0v5 int) binds: [B:94:0x0112, B:96:0x0118, B:114:0x014a, B:119:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public final void m1744B(C0014an c0014an, boolean[] zArr) {
        int iM992f;
        C0014an c0014an2;
        C0013am c0013am;
        boolean z;
        C0013am c0013am2;
        C0013am c0013am3;
        C0014an c0014an3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        if (c0014an.f808ad == 3 && c0014an.f809ae == 3 && c0014an.f831u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iM992f2 = c0014an.m992f();
        if (c0014an.f808ad == 3 && c0014an.f809ae != 3 && c0014an.f831u > 0.0f) {
            zArr[0] = false;
            return;
        }
        c0014an.f797T = true;
        if (c0014an instanceof C0043ap) {
            C0043ap c0043ap = (C0043ap) c0014an;
            if (c0043ap.f1971ai == 1) {
                int i2 = c0043ap.f1969ag;
                if (i2 != -1) {
                    i = i2;
                    iM992f = 0;
                } else {
                    int i3 = c0043ap.f1970ah;
                    iM992f = i3 != -1 ? i3 : 0;
                }
            } else {
                i = iM992f2;
                iM992f = i;
            }
        } else if (c0014an.f821k.m929c() || c0014an.f819i.m929c()) {
            C0013am c0013am4 = c0014an.f821k;
            C0013am c0013am5 = c0013am4.f672b;
            if (c0013am5 != null && (c0013am3 = c0014an.f819i.f672b) != null && (c0013am5 == c0013am3 || ((c0014an3 = c0013am5.f671a) == c0013am3.f671a && c0014an3 != c0014an.f828r))) {
                zArr[0] = false;
                return;
            }
            C0014an c0014an4 = null;
            if (c0013am5 != null) {
                c0014an2 = c0013am5.f671a;
                iM992f = c0013am4.m927a() + iM992f2;
                if (!c0014an2.m1005s() && !c0014an2.f797T) {
                    m1744B(c0014an2, zArr);
                }
            } else {
                iM992f = iM992f2;
                c0014an2 = null;
            }
            C0013am c0013am6 = c0014an.f819i;
            C0013am c0013am7 = c0013am6.f672b;
            if (c0013am7 != null) {
                c0014an4 = c0013am7.f671a;
                iM992f2 += c0013am6.m927a();
                if (!c0014an4.m1005s() && !c0014an4.f797T) {
                    m1744B(c0014an4, zArr);
                }
            }
            if (c0014an.f821k.f672b != null && !c0014an2.m1005s()) {
                int i4 = c0014an.f821k.f672b.f677g;
                if (i4 == 4) {
                    iM992f += c0014an2.f791N - c0014an2.m992f();
                } else if (i4 == 2) {
                    iM992f += c0014an2.f791N;
                }
                if (c0014an2.f794Q) {
                    z = true;
                } else {
                    z = (c0014an2.f819i.f672b == null || c0014an2.f821k.f672b == null || c0014an2.f808ad == 3) ? false : true;
                }
                c0014an.f794Q = z;
                if (z && ((c0013am2 = c0014an2.f819i.f672b) == null || c0013am2.f671a != c0014an)) {
                    iM992f += iM992f - c0014an2.f791N;
                }
            }
            if (c0014an.f819i.f672b == null || c0014an4.m1005s()) {
                i = iM992f2;
            } else {
                int i5 = c0014an.f819i.f672b.f677g;
                if (i5 == 2) {
                    iM992f2 += c0014an4.f790M - c0014an4.m992f();
                } else if (i5 == 4) {
                    iM992f2 += c0014an4.f790M;
                }
                if (c0014an4.f793P) {
                    z2 = true;
                } else if (c0014an4.f819i.f672b != null && c0014an4.f821k.f672b != null && c0014an4.f808ad != 3) {
                    z2 = true;
                }
                c0014an.f793P = z2;
                if (!z2 || ((c0013am = c0014an4.f821k.f672b) != null && c0013am.f671a == c0014an)) {
                    i = iM992f2;
                } else {
                    i = iM992f2 + (iM992f2 - c0014an4.f790M);
                }
            }
        } else {
            i = iM992f2 + c0014an.f833w;
            iM992f = iM992f2;
        }
        if (c0014an.f788K == 8) {
            int i6 = c0014an.f829s;
            i -= i6;
            iM992f -= i6;
        }
        c0014an.f790M = i;
        c0014an.f791N = iM992f;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01a5 A[PHI: r0
      0x01a5: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v5 int), (r0v5 int) binds: [B:103:0x014e, B:105:0x0154, B:127:0x018e, B:132:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: C */
    public final void m1745C(C0014an c0014an, boolean[] zArr) {
        int iM991e;
        C0014an c0014an2;
        C0013am c0013am;
        C0013am c0013am2;
        boolean z;
        C0013am c0013am3;
        C0013am c0013am4;
        C0013am c0013am5;
        C0014an c0014an3;
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (c0014an.f809ae == 3 && c0014an.f808ad != 3 && c0014an.f831u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iM991e2 = c0014an.m991e();
        c0014an.f798U = true;
        if (c0014an instanceof C0043ap) {
            C0043ap c0043ap = (C0043ap) c0014an;
            if (c0043ap.f1971ai == 0) {
                int i2 = c0043ap.f1969ag;
                if (i2 != -1) {
                    iM991e = i2;
                } else {
                    int i3 = c0043ap.f1970ah;
                    i = i3 != -1 ? i3 : 0;
                    iM991e = 0;
                }
            } else {
                i = iM991e2;
                iM991e = i;
            }
        } else {
            C0013am c0013am6 = c0014an.f823m;
            if (c0013am6.f672b == null && c0014an.f820j.f672b == null && c0014an.f822l.f672b == null) {
                iM991e = iM991e2 + c0014an.f834x;
                i = iM991e2;
            } else {
                C0013am c0013am7 = c0014an.f822l.f672b;
                if (c0013am7 != null && (c0013am5 = c0014an.f820j.f672b) != null && (c0013am7 == c0013am5 || ((c0014an3 = c0013am7.f671a) == c0013am5.f671a && c0014an3 != c0014an.f828r))) {
                    zArr[0] = false;
                    return;
                }
                if (c0013am6.m929c()) {
                    C0014an c0014an4 = c0014an.f823m.f672b.f671a;
                    if (!c0014an4.f798U) {
                        m1745C(c0014an4, zArr);
                    }
                    int iMax = Math.max((c0014an4.f789L - c0014an4.f830t) + iM991e2, iM991e2);
                    int iMax2 = Math.max((c0014an4.f792O - c0014an4.f830t) + iM991e2, iM991e2);
                    if (c0014an.f788K == 8) {
                        int i4 = c0014an.f830t;
                        iMax -= i4;
                        iMax2 -= i4;
                    }
                    c0014an.f789L = iMax;
                    c0014an.f792O = iMax2;
                    return;
                }
                C0014an c0014an5 = null;
                if (c0014an.f820j.m929c()) {
                    C0013am c0013am8 = c0014an.f820j;
                    c0014an2 = c0013am8.f672b.f671a;
                    iM991e = c0013am8.m927a() + iM991e2;
                    if (!c0014an2.m1005s() && !c0014an2.f798U) {
                        m1745C(c0014an2, zArr);
                    }
                } else {
                    iM991e = iM991e2;
                    c0014an2 = null;
                }
                if (c0014an.f822l.m929c()) {
                    C0013am c0013am9 = c0014an.f822l;
                    C0014an c0014an6 = c0013am9.f672b.f671a;
                    iM991e2 += c0013am9.m927a();
                    if (!c0014an6.m1005s() && !c0014an6.f798U) {
                        m1745C(c0014an6, zArr);
                    }
                    c0014an5 = c0014an6;
                }
                if (c0014an.f820j.f672b != null && !c0014an2.m1005s()) {
                    int i5 = c0014an.f820j.f672b.f677g;
                    if (i5 == 3) {
                        iM991e += c0014an2.f789L - c0014an2.m991e();
                    } else if (i5 == 5) {
                        iM991e += c0014an2.f789L;
                    }
                    if (c0014an2.f795R) {
                        z = true;
                    } else {
                        C0013am c0013am10 = c0014an2.f820j.f672b;
                        z = (c0013am10 == null || c0013am10.f671a == c0014an || (c0013am4 = c0014an2.f822l.f672b) == null || c0013am4.f671a == c0014an || c0014an2.f809ae == 3) ? false : true;
                    }
                    c0014an.f795R = z;
                    if (z && ((c0013am3 = c0014an2.f822l.f672b) == null || c0013am3.f671a != c0014an)) {
                        iM991e += iM991e - c0014an2.f789L;
                    }
                }
                if (c0014an.f822l.f672b == null || c0014an5.m1005s()) {
                    i = iM991e2;
                } else {
                    int i6 = c0014an.f822l.f672b.f677g;
                    if (i6 == 5) {
                        iM991e2 += c0014an5.f792O - c0014an5.m991e();
                    } else if (i6 == 3) {
                        iM991e2 += c0014an5.f792O;
                    }
                    if (c0014an5.f796S) {
                        z2 = true;
                    } else {
                        C0013am c0013am11 = c0014an5.f820j.f672b;
                        if (c0013am11 != null && c0013am11.f671a != c0014an && (c0013am2 = c0014an5.f822l.f672b) != null && c0013am2.f671a != c0014an && c0014an5.f809ae != 3) {
                            z2 = true;
                        }
                    }
                    c0014an.f796S = z2;
                    if (!z2 || ((c0013am = c0014an5.f820j.f672b) != null && c0013am.f671a == c0014an)) {
                        i = iM991e2;
                    } else {
                        i = iM991e2 + (iM991e2 - c0014an5.f792O);
                    }
                }
            }
        }
        if (c0014an.f788K == 8) {
            int i7 = c0014an.f830t;
            iM991e -= i7;
            i -= i7;
        }
        c0014an.f789L = iM991e;
        c0014an.f792O = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026e A[Catch: Exception -> 0x03ec, LOOP:7: B:100:0x026a->B:102:0x026e, LOOP_END, TryCatch #1 {Exception -> 0x03ec, blocks: (B:99:0x025f, B:100:0x026a, B:102:0x026e, B:105:0x027a), top: B:290:0x025f }] */
    /* JADX WARN: Code duplicated, block: B:105:0x027a A[Catch: Exception -> 0x03ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ec, blocks: (B:99:0x025f, B:100:0x026a, B:102:0x026e, B:105:0x027a), top: B:290:0x025f }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0289  */
    /* JADX WARN: Code duplicated, block: B:113:0x029a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d1 A[Catch: Exception -> 0x02ea, TryCatch #5 {Exception -> 0x02ea, blocks: (B:114:0x029c, B:124:0x02b2, B:125:0x02b7, B:131:0x02d1, B:142:0x02f8, B:144:0x02fc, B:146:0x030b, B:134:0x02dd), top: B:298:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02dd A[Catch: Exception -> 0x02ea, TryCatch #5 {Exception -> 0x02ea, blocks: (B:114:0x029c, B:124:0x02b2, B:125:0x02b7, B:131:0x02d1, B:142:0x02f8, B:144:0x02fc, B:146:0x030b, B:134:0x02dd), top: B:298:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ec A[PHI: r0
      0x02ec: PHI (r0v54 int) = (r0v50 int), (r0v71 int) binds: [B:130:0x02cf, B:135:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02fc A[Catch: Exception -> 0x02ea, TryCatch #5 {Exception -> 0x02ea, blocks: (B:114:0x029c, B:124:0x02b2, B:125:0x02b7, B:131:0x02d1, B:142:0x02f8, B:144:0x02fc, B:146:0x030b, B:134:0x02dd), top: B:298:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:146:0x030b A[Catch: Exception -> 0x02ea, TRY_LEAVE, TryCatch #5 {Exception -> 0x02ea, blocks: (B:114:0x029c, B:124:0x02b2, B:125:0x02b7, B:131:0x02d1, B:142:0x02f8, B:144:0x02fc, B:146:0x030b, B:134:0x02dd), top: B:298:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0316  */
    /* JADX WARN: Code duplicated, block: B:150:0x0319  */
    /* JADX WARN: Code duplicated, block: B:154:0x0321 A[Catch: Exception -> 0x034a, TRY_LEAVE, TryCatch #3 {Exception -> 0x034a, blocks: (B:152:0x031d, B:154:0x0321), top: B:294:0x031d }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0335 A[Catch: Exception -> 0x03ea, TryCatch #4 {Exception -> 0x03ea, blocks: (B:168:0x0353, B:156:0x0327, B:158:0x032b, B:160:0x0335, B:163:0x0340, B:171:0x036c, B:172:0x037d, B:174:0x0381, B:175:0x038b, B:180:0x0394, B:186:0x03d8, B:188:0x03dc, B:176:0x038e), top: B:296:0x0353, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x033d A[EDGE_INSN: B:162:0x033d->B:296:0x0353 BREAK  A[LOOP:12: B:151:0x031b->B:163:0x0340]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0340 A[Catch: Exception -> 0x03ea, LOOP:12: B:151:0x031b->B:163:0x0340, LOOP_END, TryCatch #4 {Exception -> 0x03ea, blocks: (B:168:0x0353, B:156:0x0327, B:158:0x032b, B:160:0x0335, B:163:0x0340, B:171:0x036c, B:172:0x037d, B:174:0x0381, B:175:0x038b, B:180:0x0394, B:186:0x03d8, B:188:0x03dc, B:176:0x038e), top: B:296:0x0353, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x034d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0381 A[Catch: Exception -> 0x03ea, LOOP:13: B:172:0x037d->B:174:0x0381, LOOP_END, TryCatch #4 {Exception -> 0x03ea, blocks: (B:168:0x0353, B:156:0x0327, B:158:0x032b, B:160:0x0335, B:163:0x0340, B:171:0x036c, B:172:0x037d, B:174:0x0381, B:175:0x038b, B:180:0x0394, B:186:0x03d8, B:188:0x03dc, B:176:0x038e), top: B:296:0x0353, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x03dc A[Catch: Exception -> 0x03ea, TRY_LEAVE, TryCatch #4 {Exception -> 0x03ea, blocks: (B:168:0x0353, B:156:0x0327, B:158:0x032b, B:160:0x0335, B:163:0x0340, B:171:0x036c, B:172:0x037d, B:174:0x0381, B:175:0x038b, B:180:0x0394, B:186:0x03d8, B:188:0x03dc, B:176:0x038e), top: B:296:0x0353, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:204:0x041c  */
    /* JADX WARN: Code duplicated, block: B:206:0x042e  */
    /* JADX WARN: Code duplicated, block: B:208:0x043d  */
    /* JADX WARN: Code duplicated, block: B:213:0x044d  */
    /* JADX WARN: Code duplicated, block: B:217:0x045c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0463  */
    /* JADX WARN: Code duplicated, block: B:221:0x046f  */
    /* JADX WARN: Code duplicated, block: B:224:0x047e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0482  */
    /* JADX WARN: Code duplicated, block: B:232:0x0498  */
    /* JADX WARN: Code duplicated, block: B:248:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:251:0x050a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0523  */
    /* JADX WARN: Code duplicated, block: B:256:0x052e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x0549  */
    /* JADX WARN: Code duplicated, block: B:265:0x0550 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0566  */
    /* JADX WARN: Code duplicated, block: B:271:0x056a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0585  */
    /* JADX WARN: Code duplicated, block: B:277:0x05b5 A[LOOP:15: B:276:0x05b3->B:277:0x05b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:281:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:284:0x05f7 A[LOOP:16: B:283:0x05f5->B:284:0x05f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x0601  */
    /* JADX WARN: Code duplicated, block: B:290:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0459 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0491 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0236  */
    /* JADX WARN: Code duplicated, block: B:92:0x0242  */
    /* JADX WARN: Code duplicated, block: B:96:0x024f  */
    @Override // p000.C0046as
    /* JADX INFO: renamed from: D */
    public final void mo1746D() {
        int i;
        boolean z;
        int size;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        C0014an c0014an;
        C0014an c0014an2;
        C0045ar c0045ar;
        int size2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0014an c0014an3;
        int i12;
        boolean z5;
        int iMax;
        int iMax2;
        int i13;
        int i14;
        boolean[] zArr;
        int size3;
        int i15;
        C0014an c0014an4;
        boolean zM1747E;
        C0011ak c0011ak;
        C0010aj c0010aj;
        int i16;
        int i17;
        boolean z6;
        boolean z7;
        int i18;
        int size4;
        C0012al c0012al;
        int i19;
        int i20;
        int i21;
        boolean z8;
        int i22;
        float f;
        int i23;
        int i24;
        boolean z9;
        C0009ai c0009ai;
        int i25;
        C0009ai c0009ai2;
        C0008ah c0008ah;
        int i26;
        int i27;
        int i28;
        int i29;
        float fM647a;
        float f2;
        boolean[] zArr2;
        int i30;
        C0012al c0012al2;
        int i31;
        float f3;
        C0014an c0014an5;
        char c;
        int i32 = this.f833w;
        int i33 = this.f834x;
        int iMax3 = Math.max(0, m994h());
        int iMax4 = Math.max(0, m990d());
        this.f1864aj = false;
        this.f1865ak = false;
        if (this.f828r != null) {
            if (this.f1866am == null) {
                this.f1866am = new C0045ar(this);
            }
            C0045ar c0045ar2 = this.f1866am;
            c0045ar2.f2163a = this.f833w;
            c0045ar2.f2164b = this.f834x;
            c0045ar2.f2165c = m994h();
            c0045ar2.f2166d = m990d();
            int size5 = c0045ar2.f2167e.size();
            for (int i34 = 0; i34 < size5; i34++) {
                C0044aq c0044aq = (C0044aq) c0045ar2.f2167e.get(i34);
                c0044aq.f2098a = mo1006t(c0044aq.f2098a.f677g);
                C0013am c0013am = c0044aq.f2098a;
                if (c0013am != null) {
                    c0044aq.f2099b = c0013am.f672b;
                    c0044aq.f2100c = c0013am.m927a();
                    c0044aq.f2102e = c0013am.f678h;
                    c0044aq.f2101d = c0013am.f675e;
                } else {
                    c0044aq.f2099b = null;
                    c0044aq.f2100c = 0;
                    c0044aq.f2102e = 2;
                    c0044aq.f2101d = 0;
                }
            }
            this.f833w = 0;
            this.f834x = 0;
            int size6 = this.f827q.size();
            for (int i35 = 0; i35 < size6; i35++) {
                ((C0013am) this.f827q.get(i35)).m928b();
            }
            mo1012z(this.f1860af.f574g);
        } else {
            this.f833w = 0;
            this.f834x = 0;
        }
        int i36 = this.f809ae;
        int i37 = this.f808ad;
        if (this.f1863ai == 2) {
            if (i36 != 2) {
                if (i37 == 2) {
                    i37 = 2;
                }
            }
            ArrayList arrayList = this.f2221al;
            boolean[] zArr3 = this.f1872as;
            int size7 = arrayList.size();
            zArr3[0] = true;
            int iMax5 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int i38 = 0;
            int iMax8 = 0;
            int iMax9 = 0;
            int iMax10 = 0;
            while (true) {
                if (i38 >= size7) {
                    this.f1861ag = Math.max(this.f781D, Math.max(Math.max(iMax5, iMax7), iMax6));
                    this.f1862ah = Math.max(this.f782E, Math.max(Math.max(iMax8, iMax9), iMax10));
                    for (int i39 = 0; i39 < size7; i39++) {
                        C0014an c0014an6 = (C0014an) arrayList.get(i39);
                        c0014an6.f797T = false;
                        c0014an6.f798U = false;
                        c0014an6.f793P = false;
                        c0014an6.f794Q = false;
                        c0014an6.f795R = false;
                        c0014an6.f796S = false;
                    }
                    c = 0;
                    break;
                }
                C0014an c0014an7 = (C0014an) arrayList.get(i38);
                if (!c0014an7.m1005s()) {
                    if (!c0014an7.f797T) {
                        m1744B(c0014an7, zArr3);
                    }
                    if (!c0014an7.f798U) {
                        m1745C(c0014an7, zArr3);
                    }
                    if (!zArr3[0]) {
                        c = 0;
                        break;
                    }
                    int iM994h = (c0014an7.f790M + c0014an7.f791N) - c0014an7.m994h();
                    int iM990d = (c0014an7.f789L + c0014an7.f792O) - c0014an7.m990d();
                    int iM994h2 = c0014an7.f808ad == 4 ? c0014an7.m994h() + c0014an7.f819i.f673c + c0014an7.f821k.f673c : iM994h;
                    int iM990d2 = c0014an7.f809ae == 4 ? c0014an7.m990d() + c0014an7.f820j.f673c + c0014an7.f822l.f673c : iM990d;
                    int i40 = c0014an7.f788K;
                    if (i40 == 8) {
                        iM990d2 = 0;
                    }
                    int i41 = i40 == 8 ? 0 : iM994h2;
                    iMax5 = Math.max(iMax5, c0014an7.f790M);
                    iMax7 = Math.max(iMax7, c0014an7.f791N);
                    iMax9 = Math.max(iMax9, c0014an7.f792O);
                    iMax8 = Math.max(iMax8, c0014an7.f789L);
                    iMax6 = Math.max(iMax6, i41);
                    iMax10 = Math.max(iMax10, iM990d2);
                }
                i38++;
                i37 = i37;
                i33 = i33;
                zArr3 = zArr3;
            }
            z = this.f1872as[c];
            if (iMax3 > 0 && iMax4 > 0 && (this.f1861ag > iMax3 || this.f1862ah > iMax4)) {
                z = false;
            }
            if (z) {
                if (this.f808ad == 2) {
                    this.f808ad = 1;
                    if (iMax3 <= 0 || iMax3 >= this.f1861ag) {
                        m1002p(Math.max(this.f781D, this.f1861ag));
                    } else {
                        this.f1864aj = true;
                        m1002p(iMax3);
                    }
                }
                if (this.f809ae == 2) {
                    this.f809ae = 1;
                    if (iMax4 <= 0 || iMax4 >= this.f1862ah) {
                        m996j(Math.max(this.f782E, this.f1862ah));
                    } else {
                        this.f1865ak = true;
                        m996j(iMax4);
                    }
                }
            }
            i = i37;
            this.f1867an = 0;
            this.f1868ao = 0;
            size = this.f2221al.size();
            for (i2 = 0; i2 < size; i2++) {
                c0014an5 = (C0014an) this.f2221al.get(i2);
                if (c0014an5 instanceof C0046as) {
                    ((C0046as) c0014an5).mo1746D();
                }
            }
            z2 = z;
            i3 = 0;
            z3 = true;
            while (z3) {
                i7 = i3 + 1;
                try {
                    this.f1860af.m859l();
                    zM1747E = m1747E(this.f1860af);
                    if (zM1747E) {
                        try {
                            c0011ak = this.f1860af;
                            c0010aj = c0011ak.f569b;
                            c0010aj.m795a(c0011ak);
                            c0011ak.m862o(c0010aj);
                            for (i16 = 0; i16 < c0011ak.f572e; i16++) {
                                c0011ak.f571d[i16] = false;
                            }
                            i17 = 0;
                            z6 = false;
                            while (!z6) {
                                size4 = c0010aj.f478a.size();
                                zM1747E = zM1747E;
                                c0012al = null;
                                i19 = 0;
                                i20 = 0;
                                while (i19 < size4) {
                                    int i42 = size4;
                                    try {
                                        c0012al2 = (C0012al) c0010aj.f478a.get(i19);
                                        z2 = z2;
                                        i31 = 5;
                                        while (i31 >= 0) {
                                            i32 = i32;
                                            try {
                                                f3 = c0012al2.f615e[i31];
                                                if (c0012al == null && f3 < 0.0f && i31 >= i20) {
                                                    i20 = i31;
                                                    c0012al = c0012al2;
                                                }
                                                if (f3 <= 0.0f && i31 > i20) {
                                                    i20 = i31;
                                                    c0012al = null;
                                                }
                                                i31--;
                                                i32 = i32;
                                            } catch (Exception e) {
                                                e = e;
                                                i8 = iMax3;
                                                i9 = iMax4;
                                                i10 = i36;
                                                z3 = zM1747E;
                                                e.printStackTrace();
                                                if (!z3) {
                                                    zArr = this.f1872as;
                                                    zArr[2] = false;
                                                    mo1011y();
                                                    size3 = this.f2221al.size();
                                                    for (i15 = 0; i15 < size3; i15++) {
                                                        c0014an4 = (C0014an) this.f2221al.get(i15);
                                                        c0014an4.mo1011y();
                                                        if (c0014an4.f808ad == 3) {
                                                            zArr[2] = true;
                                                        }
                                                        if (c0014an4.f809ae != 3) {
                                                        }
                                                    }
                                                } else {
                                                    mo1011y();
                                                    for (i11 = 0; i11 < size; i11++) {
                                                        c0014an3 = (C0014an) this.f2221al.get(i11);
                                                        if (c0014an3.f808ad != 3) {
                                                            if (c0014an3.f809ae != 3) {
                                                            }
                                                        } else {
                                                            if (c0014an3.f809ae != 3) {
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i7 < 8) {
                                                    i12 = i10;
                                                    z5 = false;
                                                } else {
                                                    i12 = i10;
                                                    z5 = false;
                                                }
                                                iMax = Math.max(this.f781D, m994h());
                                                if (iMax > m994h()) {
                                                    m1002p(iMax);
                                                    this.f808ad = 1;
                                                    z5 = true;
                                                    z2 = true;
                                                }
                                                iMax2 = Math.max(this.f782E, m990d());
                                                if (iMax2 > m990d()) {
                                                    m996j(iMax2);
                                                    this.f809ae = 1;
                                                    z5 = true;
                                                    z2 = true;
                                                }
                                                if (z2) {
                                                    i13 = i9;
                                                    i14 = i8;
                                                } else {
                                                    if (this.f808ad == 2) {
                                                        i14 = i8;
                                                    } else {
                                                        i14 = i8;
                                                    }
                                                    if (this.f809ae == 2) {
                                                        i13 = i9;
                                                    } else {
                                                        i13 = i9;
                                                    }
                                                }
                                                iMax3 = i14;
                                                i36 = i12;
                                                iMax4 = i13;
                                                z2 = z2;
                                                i32 = i32;
                                                z3 = z5;
                                                i3 = i7;
                                            }
                                        }
                                        i19++;
                                        size4 = i42;
                                        z2 = z2;
                                    } catch (Exception e2) {
                                        e = e2;
                                        i32 = i32;
                                        z2 = z2;
                                    }
                                }
                                i32 = i32;
                                z2 = z2;
                                if (c0012al != null) {
                                    zArr2 = c0011ak.f571d;
                                    i30 = c0012al.f611a;
                                    if (zArr2[i30]) {
                                        i21 = i17;
                                        c0012al = null;
                                        z8 = false;
                                    } else {
                                        zArr2[i30] = true;
                                        i17++;
                                        if (i17 >= c0011ak.f572e) {
                                            i21 = i17;
                                            z8 = true;
                                        } else {
                                            i21 = i17;
                                            z8 = false;
                                        }
                                    }
                                } else {
                                    i21 = i17;
                                    z8 = false;
                                }
                                if (c0012al != null) {
                                    i22 = 0;
                                    f = Float.MAX_VALUE;
                                    i23 = -1;
                                    while (i22 < c0011ak.f573f) {
                                        c0009ai2 = c0011ak.f570c[i22];
                                        int i43 = i21;
                                        boolean z10 = z8;
                                        try {
                                            if (c0009ai2.f396a.f618h != 1) {
                                                c0008ah = c0009ai2.f399d;
                                                i26 = c0008ah.f360e;
                                                i9 = iMax4;
                                                i27 = -1;
                                                i8 = iMax3;
                                                if (i26 == -1) {
                                                    i10 = i36;
                                                } else {
                                                    i28 = i26;
                                                    i29 = 0;
                                                    while (true) {
                                                        if (i28 != i27) {
                                                            try {
                                                                if (i29 < c0008ah.f356a) {
                                                                    i10 = i36;
                                                                    if (c0008ah.f357b[i28] == c0012al.f611a) {
                                                                        fM647a = c0009ai2.f399d.m647a(c0012al);
                                                                        if (fM647a < 0.0f) {
                                                                            break;
                                                                        }
                                                                        f2 = (-c0009ai2.f397b) / fM647a;
                                                                        if (f2 < f) {
                                                                            break;
                                                                        }
                                                                        f = f2;
                                                                        i23 = i22;
                                                                        break;
                                                                    }
                                                                    i28 = c0008ah.f358c[i28];
                                                                    i29++;
                                                                    i36 = i10;
                                                                    i27 = -1;
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                i10 = i36;
                                                                z3 = zM1747E;
                                                                e.printStackTrace();
                                                                if (!z3) {
                                                                    zArr = this.f1872as;
                                                                    zArr[2] = false;
                                                                    mo1011y();
                                                                    size3 = this.f2221al.size();
                                                                    while (i15 < size3) {
                                                                        c0014an4 = (C0014an) this.f2221al.get(i15);
                                                                        c0014an4.mo1011y();
                                                                        if (c0014an4.f808ad == 3) {
                                                                            zArr[2] = true;
                                                                        }
                                                                        if (c0014an4.f809ae != 3) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    mo1011y();
                                                                    while (i11 < size) {
                                                                        c0014an3 = (C0014an) this.f2221al.get(i11);
                                                                        if (c0014an3.f808ad != 3) {
                                                                            if (c0014an3.f809ae != 3) {
                                                                            }
                                                                        } else {
                                                                            if (c0014an3.f809ae != 3) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (i7 < 8) {
                                                                    i12 = i10;
                                                                    z5 = false;
                                                                } else {
                                                                    i12 = i10;
                                                                    z5 = false;
                                                                }
                                                                iMax = Math.max(this.f781D, m994h());
                                                                if (iMax > m994h()) {
                                                                    m1002p(iMax);
                                                                    this.f808ad = 1;
                                                                    z5 = true;
                                                                    z2 = true;
                                                                }
                                                                iMax2 = Math.max(this.f782E, m990d());
                                                                if (iMax2 > m990d()) {
                                                                    m996j(iMax2);
                                                                    this.f809ae = 1;
                                                                    z5 = true;
                                                                    z2 = true;
                                                                }
                                                                if (z2) {
                                                                    if (this.f808ad == 2) {
                                                                        i14 = i8;
                                                                    } else {
                                                                        i14 = i8;
                                                                    }
                                                                    if (this.f809ae == 2) {
                                                                        i13 = i9;
                                                                    } else {
                                                                        i13 = i9;
                                                                    }
                                                                } else {
                                                                    i13 = i9;
                                                                    i14 = i8;
                                                                }
                                                                iMax3 = i14;
                                                                i36 = i12;
                                                                iMax4 = i13;
                                                                z2 = z2;
                                                                i32 = i32;
                                                                z3 = z5;
                                                                i3 = i7;
                                                            }
                                                        }
                                                    }
                                                }
                                                i22++;
                                                i21 = i43;
                                                z8 = z10;
                                                iMax4 = i9;
                                                iMax3 = i8;
                                                i36 = i10;
                                            } else {
                                                i8 = iMax3;
                                                i9 = iMax4;
                                            }
                                            i22++;
                                            i21 = i43;
                                            z8 = z10;
                                            iMax4 = i9;
                                            iMax3 = i8;
                                            i36 = i10;
                                        } catch (Exception e4) {
                                            e = e4;
                                            z3 = zM1747E;
                                            e.printStackTrace();
                                            if (!z3) {
                                                zArr = this.f1872as;
                                                zArr[2] = false;
                                                mo1011y();
                                                size3 = this.f2221al.size();
                                                while (i15 < size3) {
                                                    c0014an4 = (C0014an) this.f2221al.get(i15);
                                                    c0014an4.mo1011y();
                                                    if (c0014an4.f808ad == 3) {
                                                        zArr[2] = true;
                                                    }
                                                    if (c0014an4.f809ae != 3) {
                                                    }
                                                }
                                            } else {
                                                mo1011y();
                                                while (i11 < size) {
                                                    c0014an3 = (C0014an) this.f2221al.get(i11);
                                                    if (c0014an3.f808ad != 3) {
                                                        if (c0014an3.f809ae != 3) {
                                                        }
                                                    } else {
                                                        if (c0014an3.f809ae != 3) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (i7 < 8) {
                                                i12 = i10;
                                                z5 = false;
                                            } else {
                                                i12 = i10;
                                                z5 = false;
                                            }
                                            iMax = Math.max(this.f781D, m994h());
                                            if (iMax > m994h()) {
                                                m1002p(iMax);
                                                this.f808ad = 1;
                                                z5 = true;
                                                z2 = true;
                                            }
                                            iMax2 = Math.max(this.f782E, m990d());
                                            if (iMax2 > m990d()) {
                                                m996j(iMax2);
                                                this.f809ae = 1;
                                                z5 = true;
                                                z2 = true;
                                            }
                                            if (z2) {
                                                if (this.f808ad == 2) {
                                                    i14 = i8;
                                                } else {
                                                    i14 = i8;
                                                }
                                                if (this.f809ae == 2) {
                                                    i13 = i9;
                                                } else {
                                                    i13 = i9;
                                                }
                                            } else {
                                                i13 = i9;
                                                i14 = i8;
                                            }
                                            iMax3 = i14;
                                            i36 = i12;
                                            iMax4 = i13;
                                            z2 = z2;
                                            i32 = i32;
                                            z3 = z5;
                                            i3 = i7;
                                        }
                                        i10 = i36;
                                    }
                                    i24 = i21;
                                    i8 = iMax3;
                                    i9 = iMax4;
                                    i10 = i36;
                                    z9 = z8;
                                    if (i23 >= 0) {
                                        c0009ai = c0011ak.f570c[i23];
                                        c0009ai.f396a.f612b = -1;
                                        c0009ai.m717a(c0012al);
                                        c0009ai.f396a.f612b = i23;
                                        for (i25 = 0; i25 < c0011ak.f573f; i25++) {
                                            c0011ak.f570c[i25].m727k(c0009ai);
                                        }
                                        c0010aj.m795a(c0011ak);
                                        try {
                                            c0011ak.m862o(c0010aj);
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                        zM1747E = zM1747E;
                                        z2 = z2;
                                        i32 = i32;
                                        i17 = i24;
                                        z6 = z9;
                                        iMax4 = i9;
                                        iMax3 = i8;
                                        i36 = i10;
                                    } else {
                                        i17 = i24;
                                        iMax4 = i9;
                                        iMax3 = i8;
                                        i36 = i10;
                                    }
                                } else {
                                    i17 = i21;
                                }
                                z6 = true;
                            }
                            i32 = i32;
                            i8 = iMax3;
                            i9 = iMax4;
                            z2 = z2;
                            z7 = zM1747E;
                            i10 = i36;
                            for (i18 = 0; i18 < c0011ak.f573f; i18++) {
                                C0009ai c0009ai3 = c0011ak.f570c[i18];
                                c0009ai3.f396a.f614d = c0009ai3.f397b;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i32 = i32;
                            i8 = iMax3;
                            i9 = iMax4;
                            z2 = z2;
                            zM1747E = zM1747E;
                        }
                    } else {
                        i32 = i32;
                        i8 = iMax3;
                        i9 = iMax4;
                        z2 = z2;
                        z7 = zM1747E;
                        i10 = i36;
                    }
                    z3 = z7;
                } catch (Exception e7) {
                    e = e7;
                    i32 = i32;
                    i8 = iMax3;
                    i9 = iMax4;
                    z2 = z2;
                    i10 = i36;
                }
                if (!z3) {
                    mo1011y();
                    while (i11 < size) {
                        c0014an3 = (C0014an) this.f2221al.get(i11);
                        if (c0014an3.f808ad != 3 && c0014an3.m994h() < c0014an3.f783F) {
                            this.f1872as[2] = true;
                            break;
                        } else {
                            if (c0014an3.f809ae != 3 && c0014an3.m990d() < c0014an3.f784G) {
                                this.f1872as[2] = true;
                                break;
                            }
                        }
                    }
                } else {
                    zArr = this.f1872as;
                    zArr[2] = false;
                    mo1011y();
                    size3 = this.f2221al.size();
                    while (i15 < size3) {
                        c0014an4 = (C0014an) this.f2221al.get(i15);
                        c0014an4.mo1011y();
                        if (c0014an4.f808ad == 3 && c0014an4.m994h() < c0014an4.f783F) {
                            zArr[2] = true;
                        }
                        if (c0014an4.f809ae != 3 && c0014an4.m990d() < c0014an4.f784G) {
                            zArr[2] = true;
                        }
                    }
                }
                if (i7 < 8 || !this.f1872as[2]) {
                    i12 = i10;
                    z5 = false;
                } else {
                    int iMax11 = 0;
                    int iMax12 = 0;
                    for (int i44 = 0; i44 < size; i44++) {
                        C0014an c0014an8 = (C0014an) this.f2221al.get(i44);
                        iMax11 = Math.max(iMax11, c0014an8.f833w + c0014an8.m994h());
                        iMax12 = Math.max(iMax12, c0014an8.f834x + c0014an8.m990d());
                    }
                    int iMax13 = Math.max(this.f781D, iMax11);
                    int iMax14 = Math.max(this.f782E, iMax12);
                    if (i != 2 || m994h() >= iMax13) {
                        z5 = false;
                    } else {
                        m1002p(iMax13);
                        this.f808ad = 2;
                        z5 = true;
                        z2 = true;
                    }
                    i12 = i10;
                    if (i12 == 2 && m990d() < iMax14) {
                        m996j(iMax14);
                        this.f809ae = 2;
                        z5 = true;
                        z2 = true;
                    }
                }
                iMax = Math.max(this.f781D, m994h());
                if (iMax > m994h()) {
                    m1002p(iMax);
                    this.f808ad = 1;
                    z5 = true;
                    z2 = true;
                }
                iMax2 = Math.max(this.f782E, m990d());
                if (iMax2 > m990d()) {
                    m996j(iMax2);
                    this.f809ae = 1;
                    z5 = true;
                    z2 = true;
                }
                if (z2) {
                    if (this.f808ad == 2 || i8 <= 0) {
                        i14 = i8;
                    } else {
                        i14 = i8;
                        if (m994h() > i14) {
                            this.f1864aj = true;
                            this.f808ad = 1;
                            m1002p(i14);
                            z5 = true;
                            z2 = true;
                        }
                    }
                    if (this.f809ae == 2 || i9 <= 0) {
                        i13 = i9;
                    } else {
                        i13 = i9;
                        if (m990d() > i13) {
                            this.f1865ak = true;
                            this.f809ae = 1;
                            m996j(i13);
                            z5 = true;
                            z2 = true;
                        }
                    }
                } else {
                    i13 = i9;
                    i14 = i8;
                }
                iMax3 = i14;
                i36 = i12;
                iMax4 = i13;
                z2 = z2;
                i32 = i32;
                z3 = z5;
                i3 = i7;
            }
            i4 = i32;
            z4 = z2;
            i5 = i36;
            if (this.f828r != null) {
                int iMax15 = Math.max(this.f781D, m994h());
                int iMax16 = Math.max(this.f782E, m990d());
                c0045ar = this.f1866am;
                this.f833w = c0045ar.f2163a;
                this.f834x = c0045ar.f2164b;
                m1002p(c0045ar.f2165c);
                m996j(c0045ar.f2166d);
                size2 = c0045ar.f2167e.size();
                for (i6 = 0; i6 < size2; i6++) {
                    C0044aq c0044aq2 = (C0044aq) c0045ar.f2167e.get(i6);
                    mo1006t(c0044aq2.f2098a.f677g).m930d(c0044aq2.f2099b, c0044aq2.f2100c, -1, c0044aq2.f2102e, c0044aq2.f2101d, false);
                }
                m1002p(iMax15);
                m996j(iMax16);
            } else {
                this.f833w = i4;
                this.f834x = i33;
            }
            if (z4) {
                this.f808ad = i;
                this.f809ae = i5;
            }
            mo1012z(this.f1860af.f574g);
            c0014an2 = this;
            for (c0014an = this.f828r; c0014an != null; c0014an = c0014an.f828r) {
                c0014an2 = c0014an;
            }
            if (this == c0014an2) {
                mo1003q();
            }
        }
        i = i37;
        z = false;
        this.f1867an = 0;
        this.f1868ao = 0;
        size = this.f2221al.size();
        while (i2 < size) {
            c0014an5 = (C0014an) this.f2221al.get(i2);
            if (c0014an5 instanceof C0046as) {
                ((C0046as) c0014an5).mo1746D();
            }
        }
        z2 = z;
        i3 = 0;
        z3 = true;
        while (z3) {
            i7 = i3 + 1;
            this.f1860af.m859l();
            zM1747E = m1747E(this.f1860af);
            if (zM1747E) {
                c0011ak = this.f1860af;
                c0010aj = c0011ak.f569b;
                c0010aj.m795a(c0011ak);
                c0011ak.m862o(c0010aj);
                while (i16 < c0011ak.f572e) {
                    c0011ak.f571d[i16] = false;
                }
                i17 = 0;
                z6 = false;
                while (!z6) {
                    size4 = c0010aj.f478a.size();
                    zM1747E = zM1747E;
                    c0012al = null;
                    i19 = 0;
                    i20 = 0;
                    while (i19 < size4) {
                        int i45 = size4;
                        c0012al2 = (C0012al) c0010aj.f478a.get(i19);
                        z2 = z2;
                        i31 = 5;
                        while (i31 >= 0) {
                            i32 = i32;
                            f3 = c0012al2.f615e[i31];
                            if (c0012al == null) {
                                i20 = i31;
                                c0012al = c0012al2;
                            }
                            if (f3 <= 0.0f) {
                            }
                            i31--;
                            i32 = i32;
                        }
                        i19++;
                        size4 = i45;
                        z2 = z2;
                    }
                    i32 = i32;
                    z2 = z2;
                    if (c0012al != null) {
                        zArr2 = c0011ak.f571d;
                        i30 = c0012al.f611a;
                        if (zArr2[i30]) {
                            i21 = i17;
                            c0012al = null;
                            z8 = false;
                        } else {
                            zArr2[i30] = true;
                            i17++;
                            if (i17 >= c0011ak.f572e) {
                                i21 = i17;
                                z8 = true;
                            } else {
                                i21 = i17;
                                z8 = false;
                            }
                        }
                    } else {
                        i21 = i17;
                        z8 = false;
                    }
                    if (c0012al != null) {
                        i22 = 0;
                        f = Float.MAX_VALUE;
                        i23 = -1;
                        while (i22 < c0011ak.f573f) {
                            c0009ai2 = c0011ak.f570c[i22];
                            int i46 = i21;
                            boolean z11 = z8;
                            if (c0009ai2.f396a.f618h != 1) {
                                c0008ah = c0009ai2.f399d;
                                i26 = c0008ah.f360e;
                                i9 = iMax4;
                                i27 = -1;
                                i8 = iMax3;
                                if (i26 == -1) {
                                    i10 = i36;
                                } else {
                                    i28 = i26;
                                    i29 = 0;
                                    while (true) {
                                        if (i28 != i27) {
                                            if (i29 < c0008ah.f356a) {
                                                i10 = i36;
                                                if (c0008ah.f357b[i28] == c0012al.f611a) {
                                                    fM647a = c0009ai2.f399d.m647a(c0012al);
                                                    if (fM647a < 0.0f) {
                                                        break;
                                                    }
                                                    f2 = (-c0009ai2.f397b) / fM647a;
                                                    if (f2 < f) {
                                                        break;
                                                    }
                                                    f = f2;
                                                    i23 = i22;
                                                    break;
                                                }
                                                i28 = c0008ah.f358c[i28];
                                                i29++;
                                                i36 = i10;
                                                i27 = -1;
                                            }
                                        }
                                    }
                                }
                                i22++;
                                i21 = i46;
                                z8 = z11;
                                iMax4 = i9;
                                iMax3 = i8;
                                i36 = i10;
                            } else {
                                i8 = iMax3;
                                i9 = iMax4;
                            }
                            i10 = i36;
                            i22++;
                            i21 = i46;
                            z8 = z11;
                            iMax4 = i9;
                            iMax3 = i8;
                            i36 = i10;
                        }
                        i24 = i21;
                        i8 = iMax3;
                        i9 = iMax4;
                        i10 = i36;
                        z9 = z8;
                        if (i23 >= 0) {
                            c0009ai = c0011ak.f570c[i23];
                            c0009ai.f396a.f612b = -1;
                            c0009ai.m717a(c0012al);
                            c0009ai.f396a.f612b = i23;
                            while (i25 < c0011ak.f573f) {
                                c0011ak.f570c[i25].m727k(c0009ai);
                            }
                            c0010aj.m795a(c0011ak);
                            c0011ak.m862o(c0010aj);
                            zM1747E = zM1747E;
                            z2 = z2;
                            i32 = i32;
                            i17 = i24;
                            z6 = z9;
                            iMax4 = i9;
                            iMax3 = i8;
                            i36 = i10;
                        } else {
                            i17 = i24;
                            iMax4 = i9;
                            iMax3 = i8;
                            i36 = i10;
                        }
                    } else {
                        i17 = i21;
                    }
                    z6 = true;
                }
                i32 = i32;
                i8 = iMax3;
                i9 = iMax4;
                z2 = z2;
                z7 = zM1747E;
                i10 = i36;
                while (i18 < c0011ak.f573f) {
                    C0009ai c0009ai4 = c0011ak.f570c[i18];
                    c0009ai4.f396a.f614d = c0009ai4.f397b;
                }
            } else {
                i32 = i32;
                i8 = iMax3;
                i9 = iMax4;
                z2 = z2;
                z7 = zM1747E;
                i10 = i36;
            }
            z3 = z7;
            if (!z3) {
                zArr = this.f1872as;
                zArr[2] = false;
                mo1011y();
                size3 = this.f2221al.size();
                while (i15 < size3) {
                    c0014an4 = (C0014an) this.f2221al.get(i15);
                    c0014an4.mo1011y();
                    if (c0014an4.f808ad == 3) {
                        zArr[2] = true;
                    }
                    if (c0014an4.f809ae != 3) {
                    }
                }
            } else {
                mo1011y();
                while (i11 < size) {
                    c0014an3 = (C0014an) this.f2221al.get(i11);
                    if (c0014an3.f808ad != 3) {
                        if (c0014an3.f809ae != 3) {
                        }
                    } else {
                        if (c0014an3.f809ae != 3) {
                        }
                    }
                }
            }
            if (i7 < 8) {
                i12 = i10;
                z5 = false;
            } else {
                i12 = i10;
                z5 = false;
            }
            iMax = Math.max(this.f781D, m994h());
            if (iMax > m994h()) {
                m1002p(iMax);
                this.f808ad = 1;
                z5 = true;
                z2 = true;
            }
            iMax2 = Math.max(this.f782E, m990d());
            if (iMax2 > m990d()) {
                m996j(iMax2);
                this.f809ae = 1;
                z5 = true;
                z2 = true;
            }
            if (z2) {
                if (this.f808ad == 2) {
                    i14 = i8;
                } else {
                    i14 = i8;
                }
                if (this.f809ae == 2) {
                    i13 = i9;
                } else {
                    i13 = i9;
                }
            } else {
                i13 = i9;
                i14 = i8;
            }
            iMax3 = i14;
            i36 = i12;
            iMax4 = i13;
            z2 = z2;
            i32 = i32;
            z3 = z5;
            i3 = i7;
        }
        i4 = i32;
        z4 = z2;
        i5 = i36;
        if (this.f828r != null) {
            int iMax17 = Math.max(this.f781D, m994h());
            int iMax18 = Math.max(this.f782E, m990d());
            c0045ar = this.f1866am;
            this.f833w = c0045ar.f2163a;
            this.f834x = c0045ar.f2164b;
            m1002p(c0045ar.f2165c);
            m996j(c0045ar.f2166d);
            size2 = c0045ar.f2167e.size();
            while (i6 < size2) {
                C0044aq c0044aq3 = (C0044aq) c0045ar.f2167e.get(i6);
                mo1006t(c0044aq3.f2098a.f677g).m930d(c0044aq3.f2099b, c0044aq3.f2100c, -1, c0044aq3.f2102e, c0044aq3.f2101d, false);
            }
            m1002p(iMax17);
            m996j(iMax18);
        } else {
            this.f833w = i4;
            this.f834x = i33;
        }
        if (z4) {
            this.f808ad = i;
            this.f809ae = i5;
        }
        mo1012z(this.f1860af.f574g);
        c0014an2 = this;
        while (c0014an != null) {
            c0014an2 = c0014an;
        }
        if (this == c0014an2) {
            mo1003q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x05dd  */
    /* JADX INFO: renamed from: E */
    public final boolean m1747E(C0011ak c0011ak) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        float fM990d;
        C0013am c0013am;
        int iM990d;
        int i6;
        float fM994h;
        C0013am c0013am2;
        int iM994h;
        int i7;
        mo1010x(c0011ak);
        int size = this.f2221al.size();
        int i8 = this.f1863ai;
        int i9 = 4;
        int i10 = 1;
        if (i8 == 2 || i8 == 4) {
            int size2 = this.f2221al.size();
            int i11 = 0;
            while (true) {
                i = 3;
                i2 = -1;
                if (i11 >= size2) {
                    break;
                }
                C0014an c0014an = (C0014an) this.f2221al.get(i11);
                c0014an.f804a = -1;
                c0014an.f812b = -1;
                if (c0014an.f808ad == 3 || c0014an.f809ae == 3) {
                    c0014an.f804a = 1;
                    c0014an.f812b = 1;
                }
                i11++;
            }
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (!z2) {
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < size2) {
                    C0014an c0014an2 = (C0014an) this.f2221al.get(i14);
                    if (c0014an2.f804a == i2) {
                        int i17 = this.f808ad;
                        if (i17 == 2 || (i6 = c0014an2.f808ad) == i) {
                            c0014an2.f804a = i10;
                        } else if (i17 == 2 || i6 != i9) {
                            C0013am c0013am3 = c0014an2.f819i;
                            C0013am c0013am4 = c0013am3.f672b;
                            if (c0013am4 == null || (c0013am2 = c0014an2.f821k.f672b) == null) {
                                if (c0013am4 == null || c0013am4.f671a != this) {
                                    C0013am c0013am5 = c0014an2.f821k.f672b;
                                    if (c0013am5 != null && c0013am5.f671a == this) {
                                        c0013am3.f676f = c0011ak.m852e(c0013am3);
                                        C0013am c0013am6 = c0014an2.f821k;
                                        c0013am6.f676f = c0011ak.m852e(c0013am6);
                                        int iM994h2 = m994h() - c0014an2.f821k.m927a();
                                        int iM994h3 = iM994h2 - c0014an2.m994h();
                                        c0011ak.m855h(c0014an2.f819i.f676f, iM994h3);
                                        c0011ak.m855h(c0014an2.f821k.f676f, iM994h2);
                                        c0014an2.f804a = 2;
                                        c0014an2.m997k(iM994h3, iM994h2);
                                    } else if (c0013am4 != null && c0013am4.f671a.f804a == 2) {
                                        C0012al c0012al = c0013am4.f676f;
                                        c0013am3.f676f = c0011ak.m852e(c0013am3);
                                        C0013am c0013am7 = c0014an2.f821k;
                                        c0013am7.f676f = c0011ak.m852e(c0013am7);
                                        int iM927a = (int) (c0012al.f614d + c0014an2.f819i.m927a() + 0.5f);
                                        int iM994h4 = c0014an2.m994h() + iM927a;
                                        c0011ak.m855h(c0014an2.f819i.f676f, iM927a);
                                        c0011ak.m855h(c0014an2.f821k.f676f, iM994h4);
                                        c0014an2.f804a = 2;
                                        c0014an2.m997k(iM927a, iM994h4);
                                    } else if (c0013am5 != null && c0013am5.f671a.f804a == 2) {
                                        C0012al c0012al2 = c0013am5.f676f;
                                        c0013am3.f676f = c0011ak.m852e(c0013am3);
                                        C0013am c0013am8 = c0014an2.f821k;
                                        c0013am8.f676f = c0011ak.m852e(c0013am8);
                                        int iM927a2 = (int) ((c0012al2.f614d - c0014an2.f821k.m927a()) + 0.5f);
                                        int iM994h5 = iM927a2 - c0014an2.m994h();
                                        c0011ak.m855h(c0014an2.f819i.f676f, iM994h5);
                                        c0011ak.m855h(c0014an2.f821k.f676f, iM927a2);
                                        c0014an2.f804a = 2;
                                        c0014an2.m997k(iM994h5, iM927a2);
                                    } else if (c0013am4 == null && c0013am5 == null) {
                                        if (c0014an2 instanceof C0043ap) {
                                            C0043ap c0043ap = (C0043ap) c0014an2;
                                            if (c0043ap.f1971ai == i10) {
                                                c0013am3.f676f = c0011ak.m852e(c0013am3);
                                                C0013am c0013am9 = c0014an2.f821k;
                                                c0013am9.f676f = c0011ak.m852e(c0013am9);
                                                int i18 = c0043ap.f1969ag;
                                                if (i18 != -1) {
                                                    fM994h = i18;
                                                } else {
                                                    int i19 = c0043ap.f1970ah;
                                                    fM994h = i19 != -1 ? m994h() - i19 : m994h() * c0043ap.f1968af;
                                                }
                                                int i20 = (int) (fM994h + 0.5f);
                                                c0011ak.m855h(c0014an2.f819i.f676f, i20);
                                                c0011ak.m855h(c0014an2.f821k.f676f, i20);
                                                c0014an2.f804a = 2;
                                                c0014an2.f812b = 2;
                                                c0014an2.m997k(i20, i20);
                                                c0014an2.m1001o(0, m990d());
                                            }
                                        } else {
                                            c0013am3.f676f = c0011ak.m852e(c0013am3);
                                            C0013am c0013am10 = c0014an2.f821k;
                                            c0013am10.f676f = c0011ak.m852e(c0013am10);
                                            int i21 = c0014an2.f833w;
                                            int iM994h6 = c0014an2.m994h() + i21;
                                            c0011ak.m855h(c0014an2.f819i.f676f, i21);
                                            c0011ak.m855h(c0014an2.f821k.f676f, iM994h6);
                                            c0014an2.f804a = 2;
                                        }
                                    }
                                } else {
                                    int iM927a3 = c0013am3.m927a();
                                    int iM994h7 = c0014an2.m994h() + iM927a3;
                                    C0013am c0013am11 = c0014an2.f819i;
                                    c0013am11.f676f = c0011ak.m852e(c0013am11);
                                    C0013am c0013am12 = c0014an2.f821k;
                                    c0013am12.f676f = c0011ak.m852e(c0013am12);
                                    c0011ak.m855h(c0014an2.f819i.f676f, iM927a3);
                                    c0011ak.m855h(c0014an2.f821k.f676f, iM994h7);
                                    c0014an2.f804a = 2;
                                    c0014an2.m997k(iM927a3, iM994h7);
                                }
                            } else if (c0013am4.f671a == this && c0013am2.f671a == this) {
                                int iM927a4 = c0013am3.m927a();
                                int iM927a5 = c0014an2.f821k.m927a();
                                if (this.f808ad == i) {
                                    iM994h = m994h() - iM927a5;
                                } else {
                                    iM927a4 += (int) (((((m994h() - iM927a4) - iM927a5) - c0014an2.m994h()) * c0014an2.f785H) + 0.5f);
                                    iM994h = iM927a4 + c0014an2.m994h();
                                }
                                C0013am c0013am13 = c0014an2.f819i;
                                c0013am13.f676f = c0011ak.m852e(c0013am13);
                                C0013am c0013am14 = c0014an2.f821k;
                                c0013am14.f676f = c0011ak.m852e(c0013am14);
                                c0011ak.m855h(c0014an2.f819i.f676f, iM927a4);
                                c0011ak.m855h(c0014an2.f821k.f676f, iM994h);
                                c0014an2.f804a = 2;
                                c0014an2.m997k(iM927a4, iM994h);
                            } else {
                                c0014an2.f804a = i10;
                            }
                        } else {
                            C0013am c0013am15 = c0014an2.f819i;
                            c0013am15.f676f = c0011ak.m852e(c0013am15);
                            C0013am c0013am16 = c0014an2.f821k;
                            c0013am16.f676f = c0011ak.m852e(c0013am16);
                            C0013am c0013am17 = c0014an2.f819i;
                            int i22 = c0013am17.f673c;
                            int iM994h8 = m994h() - c0014an2.f821k.f673c;
                            c0011ak.m855h(c0013am17.f676f, i22);
                            c0011ak.m855h(c0014an2.f821k.f676f, iM994h8);
                            c0014an2.m997k(i22, iM994h8);
                            c0014an2.f804a = 2;
                        }
                    }
                    if (c0014an2.f812b == -1) {
                        int i23 = this.f809ae;
                        if (i23 == 2 || (i5 = c0014an2.f809ae) == 3) {
                            c0014an2.f812b = i10;
                        } else if (i23 == 2 || i5 != 4) {
                            C0013am c0013am18 = c0014an2.f820j;
                            C0013am c0013am19 = c0013am18.f672b;
                            if (c0013am19 == null || (c0013am = c0014an2.f822l.f672b) == null) {
                                if (c0013am19 == null || c0013am19.f671a != this) {
                                    C0013am c0013am20 = c0014an2.f822l.f672b;
                                    if (c0013am20 != null && c0013am20.f671a == this) {
                                        c0013am18.f676f = c0011ak.m852e(c0013am18);
                                        C0013am c0013am21 = c0014an2.f822l;
                                        c0013am21.f676f = c0011ak.m852e(c0013am21);
                                        int iM990d2 = m990d() - c0014an2.f822l.m927a();
                                        int iM990d3 = iM990d2 - c0014an2.m990d();
                                        c0011ak.m855h(c0014an2.f820j.f676f, iM990d3);
                                        c0011ak.m855h(c0014an2.f822l.f676f, iM990d2);
                                        if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                            C0013am c0013am22 = c0014an2.f823m;
                                            c0013am22.f676f = c0011ak.m852e(c0013am22);
                                            c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + iM990d3);
                                        }
                                        c0014an2.f812b = 2;
                                        c0014an2.m1001o(iM990d3, iM990d2);
                                    } else if (c0013am19 != null && c0013am19.f671a.f812b == 2) {
                                        C0012al c0012al3 = c0013am19.f676f;
                                        c0013am18.f676f = c0011ak.m852e(c0013am18);
                                        C0013am c0013am23 = c0014an2.f822l;
                                        c0013am23.f676f = c0011ak.m852e(c0013am23);
                                        int iM927a6 = (int) (c0012al3.f614d + c0014an2.f820j.m927a() + 0.5f);
                                        int iM990d4 = c0014an2.m990d() + iM927a6;
                                        c0011ak.m855h(c0014an2.f820j.f676f, iM927a6);
                                        c0011ak.m855h(c0014an2.f822l.f676f, iM990d4);
                                        if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                            C0013am c0013am24 = c0014an2.f823m;
                                            c0013am24.f676f = c0011ak.m852e(c0013am24);
                                            c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + iM927a6);
                                        }
                                        c0014an2.f812b = 2;
                                        c0014an2.m1001o(iM927a6, iM990d4);
                                    } else if (c0013am20 == null || c0013am20.f671a.f812b != 2) {
                                        C0013am c0013am25 = c0014an2.f823m.f672b;
                                        if (c0013am25 != null && c0013am25.f671a.f812b == 2) {
                                            C0012al c0012al4 = c0013am25.f676f;
                                            c0013am18.f676f = c0011ak.m852e(c0013am18);
                                            C0013am c0013am26 = c0014an2.f822l;
                                            c0013am26.f676f = c0011ak.m852e(c0013am26);
                                            int i24 = (int) ((c0012al4.f614d - c0014an2.f780C) + 0.5f);
                                            int iM990d5 = c0014an2.m990d() + i24;
                                            c0011ak.m855h(c0014an2.f820j.f676f, i24);
                                            c0011ak.m855h(c0014an2.f822l.f676f, iM990d5);
                                            C0013am c0013am27 = c0014an2.f823m;
                                            c0013am27.f676f = c0011ak.m852e(c0013am27);
                                            c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + i24);
                                            c0014an2.f812b = 2;
                                            c0014an2.m1001o(i24, iM990d5);
                                        } else if (c0013am25 == null && c0013am19 == null && c0013am20 == null) {
                                            if (c0014an2 instanceof C0043ap) {
                                                C0043ap c0043ap2 = (C0043ap) c0014an2;
                                                if (c0043ap2.f1971ai == 0) {
                                                    c0013am18.f676f = c0011ak.m852e(c0013am18);
                                                    C0013am c0013am28 = c0014an2.f822l;
                                                    c0013am28.f676f = c0011ak.m852e(c0013am28);
                                                    int i25 = c0043ap2.f1969ag;
                                                    if (i25 != -1) {
                                                        fM990d = i25;
                                                    } else {
                                                        int i26 = c0043ap2.f1970ah;
                                                        fM990d = i26 != -1 ? m990d() - i26 : m990d() * c0043ap2.f1968af;
                                                    }
                                                    int i27 = (int) (fM990d + 0.5f);
                                                    c0011ak.m855h(c0014an2.f820j.f676f, i27);
                                                    c0011ak.m855h(c0014an2.f822l.f676f, i27);
                                                    c0014an2.f812b = 2;
                                                    c0014an2.f804a = 2;
                                                    c0014an2.m1001o(i27, i27);
                                                    c0014an2.m997k(0, m994h());
                                                }
                                            } else {
                                                c0013am18.f676f = c0011ak.m852e(c0013am18);
                                                C0013am c0013am29 = c0014an2.f822l;
                                                c0013am29.f676f = c0011ak.m852e(c0013am29);
                                                int i28 = c0014an2.f834x;
                                                int iM990d6 = c0014an2.m990d() + i28;
                                                c0011ak.m855h(c0014an2.f820j.f676f, i28);
                                                c0011ak.m855h(c0014an2.f822l.f676f, iM990d6);
                                                if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                                    C0013am c0013am30 = c0014an2.f823m;
                                                    c0013am30.f676f = c0011ak.m852e(c0013am30);
                                                    c0011ak.m855h(c0014an2.f823m.f676f, i28 + c0014an2.f780C);
                                                }
                                                c0014an2.f812b = 2;
                                            }
                                        }
                                    } else {
                                        C0012al c0012al5 = c0013am20.f676f;
                                        c0013am18.f676f = c0011ak.m852e(c0013am18);
                                        C0013am c0013am31 = c0014an2.f822l;
                                        c0013am31.f676f = c0011ak.m852e(c0013am31);
                                        int iM927a7 = (int) ((c0012al5.f614d - c0014an2.f822l.m927a()) + 0.5f);
                                        int iM990d7 = iM927a7 - c0014an2.m990d();
                                        c0011ak.m855h(c0014an2.f820j.f676f, iM990d7);
                                        c0011ak.m855h(c0014an2.f822l.f676f, iM927a7);
                                        if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                            C0013am c0013am32 = c0014an2.f823m;
                                            c0013am32.f676f = c0011ak.m852e(c0013am32);
                                            c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + iM990d7);
                                        }
                                        c0014an2.f812b = 2;
                                        c0014an2.m1001o(iM990d7, iM927a7);
                                    }
                                } else {
                                    int iM927a8 = c0013am18.m927a();
                                    int iM990d8 = c0014an2.m990d() + iM927a8;
                                    C0013am c0013am33 = c0014an2.f820j;
                                    c0013am33.f676f = c0011ak.m852e(c0013am33);
                                    C0013am c0013am34 = c0014an2.f822l;
                                    c0013am34.f676f = c0011ak.m852e(c0013am34);
                                    c0011ak.m855h(c0014an2.f820j.f676f, iM927a8);
                                    c0011ak.m855h(c0014an2.f822l.f676f, iM990d8);
                                    if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                        C0013am c0013am35 = c0014an2.f823m;
                                        c0013am35.f676f = c0011ak.m852e(c0013am35);
                                        c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + iM927a8);
                                    }
                                    c0014an2.f812b = 2;
                                    c0014an2.m1001o(iM927a8, iM990d8);
                                }
                            } else if (c0013am19.f671a == this && c0013am.f671a == this) {
                                int iM927a9 = c0013am18.m927a();
                                int iM927a10 = c0014an2.f822l.m927a();
                                if (this.f809ae == 3) {
                                    iM990d = c0014an2.m990d() + iM927a9;
                                } else {
                                    iM927a9 = (int) (iM927a9 + ((((m990d() - iM927a9) - iM927a10) - c0014an2.m990d()) * c0014an2.f786I) + 0.5f);
                                    iM990d = c0014an2.m990d() + iM927a9;
                                }
                                C0013am c0013am36 = c0014an2.f820j;
                                c0013am36.f676f = c0011ak.m852e(c0013am36);
                                C0013am c0013am37 = c0014an2.f822l;
                                c0013am37.f676f = c0011ak.m852e(c0013am37);
                                c0011ak.m855h(c0014an2.f820j.f676f, iM927a9);
                                c0011ak.m855h(c0014an2.f822l.f676f, iM990d);
                                if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                    C0013am c0013am38 = c0014an2.f823m;
                                    c0013am38.f676f = c0011ak.m852e(c0013am38);
                                    c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + iM927a9);
                                }
                                c0014an2.f812b = 2;
                                c0014an2.m1001o(iM927a9, iM990d);
                            } else {
                                c0014an2.f812b = i10;
                            }
                        } else {
                            C0013am c0013am39 = c0014an2.f820j;
                            c0013am39.f676f = c0011ak.m852e(c0013am39);
                            C0013am c0013am40 = c0014an2.f822l;
                            c0013am40.f676f = c0011ak.m852e(c0013am40);
                            C0013am c0013am41 = c0014an2.f820j;
                            int i29 = c0013am41.f673c;
                            int iM990d9 = m990d() - c0014an2.f822l.f673c;
                            c0011ak.m855h(c0013am41.f676f, i29);
                            c0011ak.m855h(c0014an2.f822l.f676f, iM990d9);
                            if (c0014an2.f780C > 0 || c0014an2.f788K == 8) {
                                C0013am c0013am42 = c0014an2.f823m;
                                c0013am42.f676f = c0011ak.m852e(c0013am42);
                                c0011ak.m855h(c0014an2.f823m.f676f, c0014an2.f780C + i29);
                            }
                            c0014an2.m1001o(i29, iM990d9);
                            c0014an2.f812b = 2;
                        }
                    }
                    if (c0014an2.f812b == -1) {
                        i15++;
                    }
                    if (c0014an2.f804a == -1) {
                        i16++;
                    }
                    i14++;
                    i9 = 4;
                    i10 = 1;
                    i = 3;
                    i2 = -1;
                }
                if (i15 == 0) {
                    if (i16 == 0) {
                        z2 = true;
                    } else {
                        i4 = 0;
                    }
                    i12 = i15;
                    i13 = i16;
                    i9 = 4;
                    i10 = 1;
                    i = 3;
                    i2 = -1;
                } else {
                    i4 = i15;
                }
                if (i12 == i4 && i13 == i16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = i15;
                i13 = i16;
                i9 = 4;
                i10 = 1;
                i = 3;
                i2 = -1;
            }
            int i30 = 0;
            int i31 = 0;
            for (int i32 = 0; i32 < size2; i32++) {
                C0014an c0014an3 = (C0014an) this.f2221al.get(i32);
                int i33 = c0014an3.f804a;
                if (i33 == 1 || i33 == -1) {
                    i30++;
                }
                int i34 = c0014an3.f812b;
                if (i34 == 1 || i34 == -1) {
                    i31++;
                }
            }
            if (i30 == 0 && i31 == 0) {
                return false;
            }
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        while (i3 < size) {
            C0014an c0014an4 = (C0014an) this.f2221al.get(i3);
            if (c0014an4 instanceof C0042ao) {
                int i35 = c0014an4.f808ad;
                int i36 = c0014an4.f809ae;
                if (i35 == 2) {
                    i7 = 1;
                    c0014an4.m1008v(1);
                    i35 = 2;
                } else {
                    i7 = 1;
                }
                if (i36 == 2) {
                    c0014an4.m1009w(i7);
                    i36 = 2;
                }
                c0014an4.mo1010x(c0011ak);
                if (i35 == 2) {
                    c0014an4.m1008v(2);
                }
                if (i36 == 2) {
                    c0014an4.m1009w(2);
                }
            } else {
                if (z) {
                    if (this.f808ad != 2 && c0014an4.f808ad == 4) {
                        C0013am c0013am43 = c0014an4.f819i;
                        c0013am43.f676f = c0011ak.m852e(c0013am43);
                        C0013am c0013am44 = c0014an4.f821k;
                        c0013am44.f676f = c0011ak.m852e(c0013am44);
                        C0013am c0013am45 = c0014an4.f819i;
                        int i37 = c0013am45.f673c;
                        int iM994h9 = m994h() - c0014an4.f821k.f673c;
                        c0011ak.m855h(c0013am45.f676f, i37);
                        c0011ak.m855h(c0014an4.f821k.f676f, iM994h9);
                        c0014an4.m997k(i37, iM994h9);
                        c0014an4.f804a = 2;
                    }
                    if (this.f809ae != 2 && c0014an4.f809ae == 4) {
                        C0013am c0013am46 = c0014an4.f820j;
                        c0013am46.f676f = c0011ak.m852e(c0013am46);
                        C0013am c0013am47 = c0014an4.f822l;
                        c0013am47.f676f = c0011ak.m852e(c0013am47);
                        C0013am c0013am48 = c0014an4.f820j;
                        int i38 = c0013am48.f673c;
                        int iM990d10 = m990d() - c0014an4.f822l.f673c;
                        c0011ak.m855h(c0013am48.f676f, i38);
                        c0011ak.m855h(c0014an4.f822l.f676f, iM990d10);
                        if (c0014an4.f780C > 0 || c0014an4.f788K == 8) {
                            C0013am c0013am49 = c0014an4.f823m;
                            c0013am49.f676f = c0011ak.m852e(c0013am49);
                            c0011ak.m855h(c0014an4.f823m.f676f, c0014an4.f780C + i38);
                        }
                        c0014an4.m1001o(i38, iM990d10);
                        c0014an4.f812b = 2;
                    }
                }
                c0014an4.mo1010x(c0011ak);
            }
            i3++;
        }
        if (this.f1867an > 0) {
            m1741H(c0011ak);
        }
        if (this.f1868ao <= 0) {
            return true;
        }
        m1742I(c0011ak);
        return true;
    }

    @Override // p000.C0046as, p000.C0014an
    /* JADX INFO: renamed from: i */
    public final void mo995i() {
        this.f1860af.m859l();
        super.mo995i();
    }

    /* JADX INFO: renamed from: A */
    final void m1743A(C0014an c0014an, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                C0013am c0013am = c0014an.f819i;
                C0013am c0013am2 = c0013am.f672b;
                if (c0013am2 == null) {
                    break;
                }
                C0014an c0014an2 = c0013am2.f671a;
                C0013am c0013am3 = c0014an2.f821k.f672b;
                if (c0013am3 == null || c0013am3 != c0013am || c0014an2 == c0014an) {
                    break;
                } else {
                    c0014an = c0014an2;
                }
            }
            while (true) {
                int i3 = this.f1867an;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    C0014an[] c0014anArr = this.f1871ar;
                    int length = c0014anArr.length;
                    if (i4 >= length) {
                        this.f1871ar = (C0014an[]) Arrays.copyOf(c0014anArr, length + length);
                    }
                    C0014an[] c0014anArr2 = this.f1871ar;
                    int i5 = this.f1867an;
                    c0014anArr2[i5] = c0014an;
                    this.f1867an = i5 + 1;
                    return;
                }
                if (this.f1871ar[i2] == c0014an) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                C0013am c0013am4 = c0014an.f820j;
                C0013am c0013am5 = c0013am4.f672b;
                if (c0013am5 == null) {
                    break;
                }
                C0014an c0014an3 = c0013am5.f671a;
                C0013am c0013am6 = c0014an3.f822l.f672b;
                if (c0013am6 == null || c0013am6 != c0013am4 || c0014an3 == c0014an) {
                    break;
                } else {
                    c0014an = c0014an3;
                }
            }
            while (true) {
                int i6 = this.f1868ao;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    C0014an[] c0014anArr3 = this.f1870aq;
                    int length2 = c0014anArr3.length;
                    if (i7 >= length2) {
                        this.f1870aq = (C0014an[]) Arrays.copyOf(c0014anArr3, length2 + length2);
                    }
                    C0014an[] c0014anArr4 = this.f1870aq;
                    int i8 = this.f1868ao;
                    c0014anArr4[i8] = c0014an;
                    this.f1868ao = i8 + 1;
                    return;
                }
                if (this.f1870aq[i2] == c0014an) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }
}
