package p469x0;

import ae.C0062b;
import android.support.v4.media.C0141b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import jm.C6524g;
import jm.C6525h;
import jm.C6526i;
import p385sf.C9000b;
import p387t0.InterfaceC9138c0;
import tl.C9322j;
import tl.C9325m;

/* JADX INFO: renamed from: x0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10004e {

    /* JADX INFO: renamed from: a */
    public final ArrayList f50925a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final a f50926b = new a(0);

    /* JADX INFO: renamed from: c */
    public final a f50927c = new a(0);

    /* JADX INFO: renamed from: d */
    public final a f50928d = new a(0);

    /* JADX INFO: renamed from: e */
    public final a f50929e = new a(0);

    /* JADX INFO: renamed from: x0.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public float f50930a;

        /* JADX INFO: renamed from: b */
        public float f50931b;

        public a() {
            this(0);
        }

        public a(int i10) {
            this.f50930a = 0.0f;
            this.f50931b = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public final void m18592a() {
            this.f50930a = 0.0f;
            this.f50931b = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f50930a, aVar.f50930a) == 0 && Float.compare(this.f50931b, aVar.f50931b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50931b) + (Float.hashCode(this.f50930a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PathPoint(x=");
            sb2.append(this.f50930a);
            sb2.append(", y=");
            return C0141b.m612h(sb2, this.f50931b, ')');
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18589b(InterfaceC9138c0 interfaceC9138c0, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d11 * dSin) + (d10 * dCos)) / d14;
        double d21 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d22 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d23 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d25 * d25) + (d24 * d24);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            m18589b(interfaceC9138c0, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan3 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d33 = d14;
        double d34 = d17 * d33;
        double d35 = d18 * d15;
        double d36 = (d34 * dCos) - (d35 * dSin);
        double d37 = (d35 * dCos) + (d34 * dSin);
        double d38 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d38) / 3.141592653589793d));
        double dCos2 = Math.cos(d19);
        double dSin2 = Math.sin(d19);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d39 = -d33;
        double d40 = d39 * dCos2;
        double d41 = d15 * dSin2;
        double d42 = d39 * dSin2;
        double d43 = d15 * dCos2;
        double d44 = dAtan3 / ((double) iCeil);
        double d45 = d10;
        double d46 = d11;
        double d47 = (dCos3 * d43) + (dSin3 * d42);
        double d48 = (d40 * dSin3) - (d41 * dCos3);
        int i10 = 0;
        double d49 = dAtan2;
        while (i10 < iCeil) {
            double d50 = d49 + d44;
            double dSin4 = Math.sin(d50);
            double dCos4 = Math.cos(d50);
            double d51 = d44;
            double d52 = (((d33 * dCos2) * dCos4) + d36) - (d41 * dSin4);
            double d53 = dSin2;
            double d54 = (d43 * dSin4) + (d33 * dSin2 * dCos4) + d37;
            double d55 = (d40 * dSin4) - (d41 * dCos4);
            double d56 = (dCos4 * d43) + (dSin4 * d42);
            double d57 = d50 - d49;
            double dTan = Math.tan(d57 / d26);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d38) - ((double) 1)) * Math.sin(d57)) / ((double) 3);
            interfaceC9138c0.mo17413i((float) ((d48 * dSqrt3) + d45), (float) ((d47 * dSqrt3) + d46), (float) (d52 - (dSqrt3 * d55)), (float) (d54 - (dSqrt3 * d56)), (float) d52, (float) d54);
            i10++;
            iCeil = iCeil;
            d33 = d14;
            d42 = d42;
            d45 = d52;
            d46 = d54;
            d49 = d50;
            d47 = d56;
            d48 = d55;
            d26 = d26;
            d44 = d51;
            dSin2 = d53;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18590a(char c10, float[] fArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listM17251q;
        AbstractC10003d mVar;
        ArrayList arrayList3 = this.f50925a;
        if (c10 == 'z' || c10 == 'Z') {
            listM17251q = C9000b.m17251q(AbstractC10003d.b.f50873c);
        } else {
            char c11 = 2;
            if (c10 == 'm') {
                C6524g c6524gM356i2 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i2, 10));
                C6525h it = c6524gM356i2.iterator();
                while (it.f37168c) {
                    int iMo13105a = it.mo13105a();
                    float[] fArrM17676d0 = C9322j.m17676d0(fArr, iMo13105a, iMo13105a + 2);
                    float f3 = fArrM17676d0[0];
                    float f10 = fArrM17676d0[1];
                    AbstractC10003d nVar = new AbstractC10003d.n(f3, f10);
                    if ((nVar instanceof AbstractC10003d.f) && iMo13105a > 0) {
                        nVar = new AbstractC10003d.e(f3, f10);
                    } else if (iMo13105a > 0) {
                        nVar = new AbstractC10003d.m(f3, f10);
                    }
                    arrayList2.add(nVar);
                }
            } else if (c10 == 'M') {
                C6524g c6524gM356i3 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i3, 10));
                C6525h it2 = c6524gM356i3.iterator();
                while (it2.f37168c) {
                    int iMo13105a2 = it2.mo13105a();
                    float[] fArrM17676d1 = C9322j.m17676d0(fArr, iMo13105a2, iMo13105a2 + 2);
                    float f11 = fArrM17676d1[0];
                    float f12 = fArrM17676d1[1];
                    AbstractC10003d fVar = new AbstractC10003d.f(f11, f12);
                    if (iMo13105a2 > 0) {
                        fVar = new AbstractC10003d.e(f11, f12);
                    } else if ((fVar instanceof AbstractC10003d.n) && iMo13105a2 > 0) {
                        fVar = new AbstractC10003d.m(f11, f12);
                    }
                    arrayList2.add(fVar);
                }
            } else if (c10 == 'l') {
                C6524g c6524gM356i4 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i4, 10));
                C6525h it3 = c6524gM356i4.iterator();
                while (it3.f37168c) {
                    int iMo13105a3 = it3.mo13105a();
                    float[] fArrM17676d2 = C9322j.m17676d0(fArr, iMo13105a3, iMo13105a3 + 2);
                    float f13 = fArrM17676d2[0];
                    float f14 = fArrM17676d2[1];
                    AbstractC10003d mVar2 = new AbstractC10003d.m(f13, f14);
                    if ((mVar2 instanceof AbstractC10003d.f) && iMo13105a3 > 0) {
                        mVar2 = new AbstractC10003d.e(f13, f14);
                    } else if ((mVar2 instanceof AbstractC10003d.n) && iMo13105a3 > 0) {
                        mVar2 = new AbstractC10003d.m(f13, f14);
                    }
                    arrayList2.add(mVar2);
                }
            } else if (c10 == 'L') {
                C6524g c6524gM356i5 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i5, 10));
                C6525h it4 = c6524gM356i5.iterator();
                while (it4.f37168c) {
                    int iMo13105a4 = it4.mo13105a();
                    float[] fArrM17676d3 = C9322j.m17676d0(fArr, iMo13105a4, iMo13105a4 + 2);
                    float f15 = fArrM17676d3[0];
                    float f16 = fArrM17676d3[1];
                    AbstractC10003d eVar = new AbstractC10003d.e(f15, f16);
                    if ((eVar instanceof AbstractC10003d.f) && iMo13105a4 > 0) {
                        eVar = new AbstractC10003d.e(f15, f16);
                    } else if ((eVar instanceof AbstractC10003d.n) && iMo13105a4 > 0) {
                        eVar = new AbstractC10003d.m(f15, f16);
                    }
                    arrayList2.add(eVar);
                }
            } else if (c10 == 'h') {
                C6524g c6524gM356i6 = C0062b.m356i2(new C6526i(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i6, 10));
                C6525h it5 = c6524gM356i6.iterator();
                while (it5.f37168c) {
                    int iMo13105a5 = it5.mo13105a();
                    float[] fArrM17676d4 = C9322j.m17676d0(fArr, iMo13105a5, iMo13105a5 + 1);
                    float f17 = fArrM17676d4[0];
                    AbstractC10003d lVar = new AbstractC10003d.l(f17);
                    if ((lVar instanceof AbstractC10003d.f) && iMo13105a5 > 0) {
                        lVar = new AbstractC10003d.e(f17, fArrM17676d4[1]);
                    } else if ((lVar instanceof AbstractC10003d.n) && iMo13105a5 > 0) {
                        lVar = new AbstractC10003d.m(f17, fArrM17676d4[1]);
                    }
                    arrayList2.add(lVar);
                }
            } else if (c10 == 'H') {
                C6524g c6524gM356i7 = C0062b.m356i2(new C6526i(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i7, 10));
                C6525h it6 = c6524gM356i7.iterator();
                while (it6.f37168c) {
                    int iMo13105a6 = it6.mo13105a();
                    float[] fArrM17676d5 = C9322j.m17676d0(fArr, iMo13105a6, iMo13105a6 + 1);
                    float f18 = fArrM17676d5[0];
                    AbstractC10003d dVar = new AbstractC10003d.d(f18);
                    if ((dVar instanceof AbstractC10003d.f) && iMo13105a6 > 0) {
                        dVar = new AbstractC10003d.e(f18, fArrM17676d5[1]);
                    } else if ((dVar instanceof AbstractC10003d.n) && iMo13105a6 > 0) {
                        dVar = new AbstractC10003d.m(f18, fArrM17676d5[1]);
                    }
                    arrayList2.add(dVar);
                }
            } else if (c10 == 'v') {
                C6524g c6524gM356i8 = C0062b.m356i2(new C6526i(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i8, 10));
                C6525h it7 = c6524gM356i8.iterator();
                while (it7.f37168c) {
                    int iMo13105a7 = it7.mo13105a();
                    float[] fArrM17676d6 = C9322j.m17676d0(fArr, iMo13105a7, iMo13105a7 + 1);
                    float f19 = fArrM17676d6[0];
                    AbstractC10003d rVar = new AbstractC10003d.r(f19);
                    if ((rVar instanceof AbstractC10003d.f) && iMo13105a7 > 0) {
                        rVar = new AbstractC10003d.e(f19, fArrM17676d6[1]);
                    } else if ((rVar instanceof AbstractC10003d.n) && iMo13105a7 > 0) {
                        rVar = new AbstractC10003d.m(f19, fArrM17676d6[1]);
                    }
                    arrayList2.add(rVar);
                }
            } else if (c10 == 'V') {
                C6524g c6524gM356i9 = C0062b.m356i2(new C6526i(0, fArr.length - 1), 1);
                arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i9, 10));
                C6525h it8 = c6524gM356i9.iterator();
                while (it8.f37168c) {
                    int iMo13105a8 = it8.mo13105a();
                    float[] fArrM17676d7 = C9322j.m17676d0(fArr, iMo13105a8, iMo13105a8 + 1);
                    float f20 = fArrM17676d7[0];
                    AbstractC10003d sVar = new AbstractC10003d.s(f20);
                    if ((sVar instanceof AbstractC10003d.f) && iMo13105a8 > 0) {
                        sVar = new AbstractC10003d.e(f20, fArrM17676d7[1]);
                    } else if ((sVar instanceof AbstractC10003d.n) && iMo13105a8 > 0) {
                        sVar = new AbstractC10003d.m(f20, fArrM17676d7[1]);
                    }
                    arrayList2.add(sVar);
                }
            } else {
                char c12 = 5;
                char c13 = 3;
                if (c10 == 'c') {
                    C6524g c6524gM356i10 = C0062b.m356i2(new C6526i(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i10, 10));
                    C6525h it9 = c6524gM356i10.iterator();
                    while (it9.f37168c) {
                        int iMo13105a9 = it9.mo13105a();
                        float[] fArrM17676d8 = C9322j.m17676d0(fArr, iMo13105a9, iMo13105a9 + 6);
                        float f21 = fArrM17676d8[0];
                        float f22 = fArrM17676d8[1];
                        AbstractC10003d kVar = new AbstractC10003d.k(f21, f22, fArrM17676d8[2], fArrM17676d8[3], fArrM17676d8[4], fArrM17676d8[c12]);
                        if (!(kVar instanceof AbstractC10003d.f) || iMo13105a9 <= 0) {
                            mVar = (!(kVar instanceof AbstractC10003d.n) || iMo13105a9 <= 0) ? kVar : new AbstractC10003d.m(f21, f22);
                        } else {
                            mVar = new AbstractC10003d.e(f21, f22);
                        }
                        arrayList.add(mVar);
                        c12 = 5;
                    }
                } else if (c10 == 'C') {
                    C6524g c6524gM356i11 = C0062b.m356i2(new C6526i(0, fArr.length - 6), 6);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i11, 10));
                    C6525h it10 = c6524gM356i11.iterator();
                    while (it10.f37168c) {
                        int iMo13105a10 = it10.mo13105a();
                        float[] fArrM17676d9 = C9322j.m17676d0(fArr, iMo13105a10, iMo13105a10 + 6);
                        float f23 = fArrM17676d9[0];
                        float f24 = fArrM17676d9[1];
                        AbstractC10003d cVar = new AbstractC10003d.c(f23, f24, fArrM17676d9[2], fArrM17676d9[c13], fArrM17676d9[4], fArrM17676d9[5]);
                        if ((cVar instanceof AbstractC10003d.f) && iMo13105a10 > 0) {
                            cVar = new AbstractC10003d.e(f23, f24);
                        } else if ((cVar instanceof AbstractC10003d.n) && iMo13105a10 > 0) {
                            cVar = new AbstractC10003d.m(f23, f24);
                        }
                        arrayList.add(cVar);
                        c13 = 3;
                    }
                } else if (c10 == 's') {
                    C6524g c6524gM356i12 = C0062b.m356i2(new C6526i(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i12, 10));
                    C6525h it11 = c6524gM356i12.iterator();
                    while (it11.f37168c) {
                        int iMo13105a11 = it11.mo13105a();
                        float[] fArrM17676d10 = C9322j.m17676d0(fArr, iMo13105a11, iMo13105a11 + 4);
                        float f25 = fArrM17676d10[0];
                        float f26 = fArrM17676d10[1];
                        AbstractC10003d pVar = new AbstractC10003d.p(f25, f26, fArrM17676d10[2], fArrM17676d10[3]);
                        if ((pVar instanceof AbstractC10003d.f) && iMo13105a11 > 0) {
                            pVar = new AbstractC10003d.e(f25, f26);
                        } else if ((pVar instanceof AbstractC10003d.n) && iMo13105a11 > 0) {
                            pVar = new AbstractC10003d.m(f25, f26);
                        }
                        arrayList.add(pVar);
                    }
                } else if (c10 == 'S') {
                    C6524g c6524gM356i13 = C0062b.m356i2(new C6526i(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i13, 10));
                    C6525h it12 = c6524gM356i13.iterator();
                    while (it12.f37168c) {
                        int iMo13105a12 = it12.mo13105a();
                        float[] fArrM17676d11 = C9322j.m17676d0(fArr, iMo13105a12, iMo13105a12 + 4);
                        float f27 = fArrM17676d11[0];
                        float f28 = fArrM17676d11[1];
                        AbstractC10003d hVar = new AbstractC10003d.h(f27, f28, fArrM17676d11[2], fArrM17676d11[3]);
                        if ((hVar instanceof AbstractC10003d.f) && iMo13105a12 > 0) {
                            hVar = new AbstractC10003d.e(f27, f28);
                        } else if ((hVar instanceof AbstractC10003d.n) && iMo13105a12 > 0) {
                            hVar = new AbstractC10003d.m(f27, f28);
                        }
                        arrayList.add(hVar);
                    }
                } else if (c10 == 'q') {
                    C6524g c6524gM356i14 = C0062b.m356i2(new C6526i(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i14, 10));
                    C6525h it13 = c6524gM356i14.iterator();
                    while (it13.f37168c) {
                        int iMo13105a13 = it13.mo13105a();
                        float[] fArrM17676d12 = C9322j.m17676d0(fArr, iMo13105a13, iMo13105a13 + 4);
                        float f29 = fArrM17676d12[0];
                        float f30 = fArrM17676d12[1];
                        AbstractC10003d oVar = new AbstractC10003d.o(f29, f30, fArrM17676d12[2], fArrM17676d12[3]);
                        if ((oVar instanceof AbstractC10003d.f) && iMo13105a13 > 0) {
                            oVar = new AbstractC10003d.e(f29, f30);
                        } else if ((oVar instanceof AbstractC10003d.n) && iMo13105a13 > 0) {
                            oVar = new AbstractC10003d.m(f29, f30);
                        }
                        arrayList.add(oVar);
                    }
                } else if (c10 == 'Q') {
                    C6524g c6524gM356i15 = C0062b.m356i2(new C6526i(0, fArr.length - 4), 4);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i15, 10));
                    C6525h it14 = c6524gM356i15.iterator();
                    while (it14.f37168c) {
                        int iMo13105a14 = it14.mo13105a();
                        float[] fArrM17676d13 = C9322j.m17676d0(fArr, iMo13105a14, iMo13105a14 + 4);
                        float f31 = fArrM17676d13[0];
                        float f32 = fArrM17676d13[1];
                        AbstractC10003d gVar = new AbstractC10003d.g(f31, f32, fArrM17676d13[2], fArrM17676d13[3]);
                        if ((gVar instanceof AbstractC10003d.f) && iMo13105a14 > 0) {
                            gVar = new AbstractC10003d.e(f31, f32);
                        } else if ((gVar instanceof AbstractC10003d.n) && iMo13105a14 > 0) {
                            gVar = new AbstractC10003d.m(f31, f32);
                        }
                        arrayList.add(gVar);
                    }
                } else if (c10 == 't') {
                    C6524g c6524gM356i16 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i16, 10));
                    C6525h it15 = c6524gM356i16.iterator();
                    while (it15.f37168c) {
                        int iMo13105a15 = it15.mo13105a();
                        float[] fArrM17676d14 = C9322j.m17676d0(fArr, iMo13105a15, iMo13105a15 + 2);
                        float f33 = fArrM17676d14[0];
                        float f34 = fArrM17676d14[1];
                        AbstractC10003d qVar = new AbstractC10003d.q(f33, f34);
                        if ((qVar instanceof AbstractC10003d.f) && iMo13105a15 > 0) {
                            qVar = new AbstractC10003d.e(f33, f34);
                        } else if ((qVar instanceof AbstractC10003d.n) && iMo13105a15 > 0) {
                            qVar = new AbstractC10003d.m(f33, f34);
                        }
                        arrayList2.add(qVar);
                    }
                } else if (c10 == 'T') {
                    C6524g c6524gM356i17 = C0062b.m356i2(new C6526i(0, fArr.length - 2), 2);
                    arrayList2 = new ArrayList(C9325m.m17681z(c6524gM356i17, 10));
                    C6525h it16 = c6524gM356i17.iterator();
                    while (it16.f37168c) {
                        int iMo13105a16 = it16.mo13105a();
                        float[] fArrM17676d15 = C9322j.m17676d0(fArr, iMo13105a16, iMo13105a16 + 2);
                        float f35 = fArrM17676d15[0];
                        float f36 = fArrM17676d15[1];
                        AbstractC10003d iVar = new AbstractC10003d.i(f35, f36);
                        if ((iVar instanceof AbstractC10003d.f) && iMo13105a16 > 0) {
                            iVar = new AbstractC10003d.e(f35, f36);
                        } else if ((iVar instanceof AbstractC10003d.n) && iMo13105a16 > 0) {
                            iVar = new AbstractC10003d.m(f35, f36);
                        }
                        arrayList2.add(iVar);
                    }
                } else if (c10 == 'a') {
                    C6524g c6524gM356i18 = C0062b.m356i2(new C6526i(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i18, 10));
                    C6525h it17 = c6524gM356i18.iterator();
                    while (it17.f37168c) {
                        int iMo13105a17 = it17.mo13105a();
                        float[] fArrM17676d16 = C9322j.m17676d0(fArr, iMo13105a17, iMo13105a17 + 7);
                        AbstractC10003d jVar = new AbstractC10003d.j(fArrM17676d16[0], fArrM17676d16[1], fArrM17676d16[2], Float.compare(fArrM17676d16[3], 0.0f) != 0, Float.compare(fArrM17676d16[4], 0.0f) != 0, fArrM17676d16[5], fArrM17676d16[6]);
                        if ((jVar instanceof AbstractC10003d.f) && iMo13105a17 > 0) {
                            jVar = new AbstractC10003d.e(fArrM17676d16[0], fArrM17676d16[1]);
                        } else if ((jVar instanceof AbstractC10003d.n) && iMo13105a17 > 0) {
                            jVar = new AbstractC10003d.m(fArrM17676d16[0], fArrM17676d16[1]);
                        }
                        arrayList.add(jVar);
                    }
                } else {
                    if (c10 != 'A') {
                        throw new IllegalArgumentException("Unknown command for: " + c10);
                    }
                    C6524g c6524gM356i19 = C0062b.m356i2(new C6526i(0, fArr.length - 7), 7);
                    arrayList = new ArrayList(C9325m.m17681z(c6524gM356i19, 10));
                    C6525h it18 = c6524gM356i19.iterator();
                    while (it18.f37168c) {
                        int iMo13105a18 = it18.mo13105a();
                        float[] fArrM17676d17 = C9322j.m17676d0(fArr, iMo13105a18, iMo13105a18 + 7);
                        AbstractC10003d aVar = new AbstractC10003d.a(fArrM17676d17[0], fArrM17676d17[1], fArrM17676d17[c11], Float.compare(fArrM17676d17[3], 0.0f) != 0, Float.compare(fArrM17676d17[4], 0.0f) != 0, fArrM17676d17[5], fArrM17676d17[6]);
                        if ((aVar instanceof AbstractC10003d.f) && iMo13105a18 > 0) {
                            aVar = new AbstractC10003d.e(fArrM17676d17[0], fArrM17676d17[1]);
                        } else if ((aVar instanceof AbstractC10003d.n) && iMo13105a18 > 0) {
                            aVar = new AbstractC10003d.m(fArrM17676d17[0], fArrM17676d17[1]);
                        }
                        arrayList.add(aVar);
                        c11 = 2;
                    }
                }
                listM17251q = arrayList;
            }
            listM17251q = arrayList2;
        }
        arrayList3.addAll(listM17251q);
    }

    /* JADX INFO: renamed from: c */
    public final void m18591c(InterfaceC9138c0 interfaceC9138c0) {
        int i10;
        a aVar;
        AbstractC10003d abstractC10003d;
        int i11;
        a aVar2;
        ArrayList arrayList;
        a aVar3;
        a aVar4;
        a aVar5;
        int i12;
        AbstractC10003d abstractC10003d2;
        a aVar6;
        InterfaceC9138c0 interfaceC9138c1 = interfaceC9138c0;
        C5207g.m11111f(interfaceC9138c1, "target");
        interfaceC9138c0.mo17407c();
        a aVar7 = this.f50926b;
        aVar7.m18592a();
        a aVar8 = this.f50927c;
        aVar8.m18592a();
        a aVar9 = this.f50928d;
        aVar9.m18592a();
        a aVar10 = this.f50929e;
        aVar10.m18592a();
        ArrayList arrayList2 = this.f50925a;
        int size = arrayList2.size();
        AbstractC10003d abstractC10003d3 = null;
        int i13 = 0;
        while (i13 < size) {
            AbstractC10003d abstractC10003d4 = (AbstractC10003d) arrayList2.get(i13);
            if (abstractC10003d3 == null) {
                abstractC10003d3 = abstractC10003d4;
            }
            if (abstractC10003d4 instanceof AbstractC10003d.b) {
                aVar7.f50930a = aVar9.f50930a;
                aVar7.f50931b = aVar9.f50931b;
                aVar8.f50930a = aVar9.f50930a;
                aVar8.f50931b = aVar9.f50931b;
                interfaceC9138c0.close();
                interfaceC9138c1.mo17412h(aVar7.f50930a, aVar7.f50931b);
            } else if (abstractC10003d4 instanceof AbstractC10003d.n) {
                AbstractC10003d.n nVar = (AbstractC10003d.n) abstractC10003d4;
                float f3 = aVar7.f50930a;
                float f10 = nVar.f50911c;
                aVar7.f50930a = f3 + f10;
                float f11 = aVar7.f50931b;
                float f12 = nVar.f50912d;
                aVar7.f50931b = f11 + f12;
                interfaceC9138c1.mo17406b(f10, f12);
                aVar9.f50930a = aVar7.f50930a;
                aVar9.f50931b = aVar7.f50931b;
            } else if (abstractC10003d4 instanceof AbstractC10003d.f) {
                AbstractC10003d.f fVar = (AbstractC10003d.f) abstractC10003d4;
                float f13 = fVar.f50883c;
                aVar7.f50930a = f13;
                float f14 = fVar.f50884d;
                aVar7.f50931b = f14;
                interfaceC9138c1.mo17412h(f13, f14);
                aVar9.f50930a = aVar7.f50930a;
                aVar9.f50931b = aVar7.f50931b;
            } else if (abstractC10003d4 instanceof AbstractC10003d.m) {
                AbstractC10003d.m mVar = (AbstractC10003d.m) abstractC10003d4;
                float f15 = mVar.f50909c;
                float f16 = mVar.f50910d;
                interfaceC9138c1.mo17415k(f15, f16);
                aVar7.f50930a += mVar.f50909c;
                aVar7.f50931b += f16;
            } else if (abstractC10003d4 instanceof AbstractC10003d.e) {
                AbstractC10003d.e eVar = (AbstractC10003d.e) abstractC10003d4;
                float f17 = eVar.f50881c;
                float f18 = eVar.f50882d;
                interfaceC9138c1.mo17416l(f17, f18);
                aVar7.f50930a = eVar.f50881c;
                aVar7.f50931b = f18;
            } else if (abstractC10003d4 instanceof AbstractC10003d.l) {
                AbstractC10003d.l lVar = (AbstractC10003d.l) abstractC10003d4;
                interfaceC9138c1.mo17415k(lVar.f50908c, 0.0f);
                aVar7.f50930a += lVar.f50908c;
            } else if (abstractC10003d4 instanceof AbstractC10003d.d) {
                AbstractC10003d.d dVar = (AbstractC10003d.d) abstractC10003d4;
                interfaceC9138c1.mo17416l(dVar.f50880c, aVar7.f50931b);
                aVar7.f50930a = dVar.f50880c;
            } else if (abstractC10003d4 instanceof AbstractC10003d.r) {
                AbstractC10003d.r rVar = (AbstractC10003d.r) abstractC10003d4;
                interfaceC9138c1.mo17415k(0.0f, rVar.f50923c);
                aVar7.f50931b += rVar.f50923c;
            } else {
                if (abstractC10003d4 instanceof AbstractC10003d.s) {
                    AbstractC10003d.s sVar = (AbstractC10003d.s) abstractC10003d4;
                    interfaceC9138c1.mo17416l(aVar7.f50930a, sVar.f50924c);
                    aVar7.f50931b = sVar.f50924c;
                } else {
                    if (abstractC10003d4 instanceof AbstractC10003d.k) {
                        AbstractC10003d.k kVar = (AbstractC10003d.k) abstractC10003d4;
                        i10 = size;
                        aVar = aVar9;
                        abstractC10003d = abstractC10003d4;
                        interfaceC9138c0.mo17408d(kVar.f50902c, kVar.f50903d, kVar.f50904e, kVar.f50905f, kVar.f50906g, kVar.f50907h);
                        aVar8.f50930a = aVar7.f50930a + kVar.f50904e;
                        aVar8.f50931b = aVar7.f50931b + kVar.f50905f;
                        aVar7.f50930a += kVar.f50906g;
                        aVar7.f50931b += kVar.f50907h;
                    } else {
                        i10 = size;
                        aVar = aVar9;
                        abstractC10003d = abstractC10003d4;
                        if (abstractC10003d instanceof AbstractC10003d.c) {
                            AbstractC10003d.c cVar = (AbstractC10003d.c) abstractC10003d;
                            interfaceC9138c0.mo17413i(cVar.f50874c, cVar.f50875d, cVar.f50876e, cVar.f50877f, cVar.f50878g, cVar.f50879h);
                            aVar8.f50930a = cVar.f50876e;
                            aVar8.f50931b = cVar.f50877f;
                            aVar7.f50930a = cVar.f50878g;
                            aVar7.f50931b = cVar.f50879h;
                        } else if (abstractC10003d instanceof AbstractC10003d.p) {
                            AbstractC10003d.p pVar = (AbstractC10003d.p) abstractC10003d;
                            C5207g.m11108c(abstractC10003d3);
                            if (abstractC10003d3.f50864a) {
                                aVar10.f50930a = aVar7.f50930a - aVar8.f50930a;
                                aVar10.f50931b = aVar7.f50931b - aVar8.f50931b;
                            } else {
                                aVar10.m18592a();
                            }
                            interfaceC9138c0.mo17408d(aVar10.f50930a, aVar10.f50931b, pVar.f50917c, pVar.f50918d, pVar.f50919e, pVar.f50920f);
                            aVar8.f50930a = aVar7.f50930a + pVar.f50917c;
                            aVar8.f50931b = aVar7.f50931b + pVar.f50918d;
                            aVar7.f50930a += pVar.f50919e;
                            aVar7.f50931b += pVar.f50920f;
                        } else if (abstractC10003d instanceof AbstractC10003d.h) {
                            AbstractC10003d.h hVar = (AbstractC10003d.h) abstractC10003d;
                            C5207g.m11108c(abstractC10003d3);
                            if (abstractC10003d3.f50864a) {
                                float f19 = 2;
                                aVar10.f50930a = (aVar7.f50930a * f19) - aVar8.f50930a;
                                aVar10.f50931b = (f19 * aVar7.f50931b) - aVar8.f50931b;
                            } else {
                                aVar10.f50930a = aVar7.f50930a;
                                aVar10.f50931b = aVar7.f50931b;
                            }
                            interfaceC9138c0.mo17413i(aVar10.f50930a, aVar10.f50931b, hVar.f50889c, hVar.f50890d, hVar.f50891e, hVar.f50892f);
                            aVar8.f50930a = hVar.f50889c;
                            aVar8.f50931b = hVar.f50890d;
                            aVar7.f50930a = hVar.f50891e;
                            aVar7.f50931b = hVar.f50892f;
                        } else if (abstractC10003d instanceof AbstractC10003d.o) {
                            AbstractC10003d.o oVar = (AbstractC10003d.o) abstractC10003d;
                            float f20 = oVar.f50913c;
                            float f21 = oVar.f50914d;
                            float f22 = oVar.f50915e;
                            float f23 = oVar.f50916f;
                            interfaceC9138c1.mo17410f(f20, f21, f22, f23);
                            aVar8.f50930a = aVar7.f50930a + oVar.f50913c;
                            aVar8.f50931b = aVar7.f50931b + f21;
                            aVar7.f50930a += f22;
                            aVar7.f50931b += f23;
                        } else if (abstractC10003d instanceof AbstractC10003d.g) {
                            AbstractC10003d.g gVar = (AbstractC10003d.g) abstractC10003d;
                            float f24 = gVar.f50885c;
                            float f25 = gVar.f50886d;
                            float f26 = gVar.f50887e;
                            float f27 = gVar.f50888f;
                            interfaceC9138c1.mo17409e(f24, f25, f26, f27);
                            aVar8.f50930a = gVar.f50885c;
                            aVar8.f50931b = f25;
                            aVar7.f50930a = f26;
                            aVar7.f50931b = f27;
                        } else if (abstractC10003d instanceof AbstractC10003d.q) {
                            AbstractC10003d.q qVar = (AbstractC10003d.q) abstractC10003d;
                            C5207g.m11108c(abstractC10003d3);
                            if (abstractC10003d3.f50865b) {
                                aVar10.f50930a = aVar7.f50930a - aVar8.f50930a;
                                aVar10.f50931b = aVar7.f50931b - aVar8.f50931b;
                            } else {
                                aVar10.m18592a();
                            }
                            float f28 = aVar10.f50930a;
                            float f29 = aVar10.f50931b;
                            float f30 = qVar.f50921c;
                            float f31 = qVar.f50922d;
                            interfaceC9138c1.mo17410f(f28, f29, f30, f31);
                            aVar8.f50930a = aVar7.f50930a + aVar10.f50930a;
                            aVar8.f50931b = aVar7.f50931b + aVar10.f50931b;
                            aVar7.f50930a += qVar.f50921c;
                            aVar7.f50931b += f31;
                        } else if (abstractC10003d instanceof AbstractC10003d.i) {
                            AbstractC10003d.i iVar = (AbstractC10003d.i) abstractC10003d;
                            C5207g.m11108c(abstractC10003d3);
                            if (abstractC10003d3.f50865b) {
                                float f32 = 2;
                                aVar10.f50930a = (aVar7.f50930a * f32) - aVar8.f50930a;
                                aVar10.f50931b = (f32 * aVar7.f50931b) - aVar8.f50931b;
                            } else {
                                aVar10.f50930a = aVar7.f50930a;
                                aVar10.f50931b = aVar7.f50931b;
                            }
                            float f33 = aVar10.f50930a;
                            float f34 = aVar10.f50931b;
                            float f35 = iVar.f50893c;
                            float f36 = iVar.f50894d;
                            interfaceC9138c1.mo17409e(f33, f34, f35, f36);
                            aVar8.f50930a = aVar10.f50930a;
                            aVar8.f50931b = aVar10.f50931b;
                            aVar7.f50930a = iVar.f50893c;
                            aVar7.f50931b = f36;
                        } else {
                            if (abstractC10003d instanceof AbstractC10003d.j) {
                                AbstractC10003d.j jVar = (AbstractC10003d.j) abstractC10003d;
                                float f37 = jVar.f50900h;
                                float f38 = aVar7.f50930a;
                                float f39 = f37 + f38;
                                float f40 = aVar7.f50931b;
                                float f41 = jVar.f50901i + f40;
                                i11 = i13;
                                i12 = i10;
                                aVar2 = aVar10;
                                arrayList = arrayList2;
                                aVar5 = aVar;
                                abstractC10003d2 = abstractC10003d;
                                m18589b(interfaceC9138c0, f38, f40, f39, f41, jVar.f50895c, jVar.f50896d, jVar.f50897e, jVar.f50898f, jVar.f50899g);
                                aVar4 = aVar7;
                                aVar4.f50930a = f39;
                                aVar4.f50931b = f41;
                                aVar3 = aVar8;
                                aVar3.f50930a = f39;
                                aVar3.f50931b = f41;
                            } else {
                                i11 = i13;
                                aVar2 = aVar10;
                                arrayList = arrayList2;
                                aVar3 = aVar8;
                                aVar4 = aVar7;
                                aVar5 = aVar;
                                i12 = i10;
                                if (abstractC10003d instanceof AbstractC10003d.a) {
                                    AbstractC10003d.a aVar11 = (AbstractC10003d.a) abstractC10003d;
                                    double d10 = aVar4.f50930a;
                                    double d11 = aVar4.f50931b;
                                    double d12 = aVar11.f50871h;
                                    float f42 = aVar11.f50872i;
                                    abstractC10003d2 = abstractC10003d;
                                    m18589b(interfaceC9138c0, d10, d11, d12, f42, aVar11.f50866c, aVar11.f50867d, aVar11.f50868e, aVar11.f50869f, aVar11.f50870g);
                                    float f43 = aVar11.f50871h;
                                    aVar4 = aVar4;
                                    aVar4.f50930a = f43;
                                    aVar4.f50931b = f42;
                                    aVar6 = aVar3;
                                    aVar6.f50930a = f43;
                                    aVar6.f50931b = f42;
                                } else {
                                    abstractC10003d2 = abstractC10003d;
                                }
                            }
                            aVar6 = aVar3;
                        }
                    }
                    i11 = i13;
                    aVar2 = aVar10;
                    arrayList = arrayList2;
                    aVar6 = aVar8;
                    abstractC10003d2 = abstractC10003d;
                    aVar4 = aVar7;
                    aVar5 = aVar;
                    i12 = i10;
                }
                i13 = i11 + 1;
                interfaceC9138c1 = interfaceC9138c0;
                aVar7 = aVar4;
                aVar8 = aVar6;
                arrayList2 = arrayList;
                size = i12;
                aVar10 = aVar2;
                aVar9 = aVar5;
                abstractC10003d3 = abstractC10003d2;
            }
            abstractC10003d2 = abstractC10003d4;
            i12 = size;
            i11 = i13;
            aVar2 = aVar10;
            arrayList = arrayList2;
            aVar6 = aVar8;
            aVar5 = aVar9;
            aVar4 = aVar7;
            i13 = i11 + 1;
            interfaceC9138c1 = interfaceC9138c0;
            aVar7 = aVar4;
            aVar8 = aVar6;
            arrayList2 = arrayList;
            size = i12;
            aVar10 = aVar2;
            aVar9 = aVar5;
            abstractC10003d3 = abstractC10003d2;
        }
    }
}
