package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bht implements bhs, bhz, bhq {

    /* JADX INFO: renamed from: b */
    private final String f3348b;

    /* JADX INFO: renamed from: c */
    private final bgv f3349c;

    /* JADX INFO: renamed from: d */
    private final boolean f3350d;

    /* JADX INFO: renamed from: e */
    private final bie f3351e;

    /* JADX INFO: renamed from: f */
    private final bie f3352f;

    /* JADX INFO: renamed from: g */
    private final bie f3353g;

    /* JADX INFO: renamed from: h */
    private final bie f3354h;

    /* JADX INFO: renamed from: i */
    private final bie f3355i;

    /* JADX INFO: renamed from: j */
    private final bie f3356j;

    /* JADX INFO: renamed from: k */
    private final bie f3357k;

    /* JADX INFO: renamed from: l */
    private boolean f3358l;

    /* JADX INFO: renamed from: m */
    private final int f3359m;

    /* JADX INFO: renamed from: a */
    private final Path f3347a = new Path();

    /* JADX INFO: renamed from: n */
    private final bkn f3360n = new bkn();

    public bht(bgv bgvVar, bkc bkcVar, bjs bjsVar) {
        this.f3349c = bgvVar;
        this.f3348b = bjsVar.f3513a;
        int i = bjsVar.f3522j;
        this.f3359m = i;
        this.f3350d = bjsVar.f3521i;
        bie bieVarMo2524a = bjsVar.f3514b.mo2524a();
        this.f3351e = bieVarMo2524a;
        bie bieVarMo2524a2 = bjsVar.f3515c.mo2524a();
        this.f3352f = bieVarMo2524a2;
        bie bieVarMo2524a3 = bjsVar.f3516d.mo2524a();
        this.f3353g = bieVarMo2524a3;
        bie bieVarMo2524a4 = bjsVar.f3518f.mo2524a();
        this.f3355i = bieVarMo2524a4;
        bie bieVarMo2524a5 = bjsVar.f3520h.mo2524a();
        this.f3357k = bieVarMo2524a5;
        if (i == 1) {
            this.f3354h = bjsVar.f3517e.mo2524a();
            this.f3356j = bjsVar.f3519g.mo2524a();
        } else {
            this.f3354h = null;
            this.f3356j = null;
        }
        bkcVar.m2534h(bieVarMo2524a);
        bkcVar.m2534h(bieVarMo2524a2);
        bkcVar.m2534h(bieVarMo2524a3);
        bkcVar.m2534h(bieVarMo2524a4);
        bkcVar.m2534h(bieVarMo2524a5);
        if (i == 1) {
            bkcVar.m2534h(this.f3354h);
            bkcVar.m2534h(this.f3356j);
        }
        bieVarMo2524a.m2494g(this);
        bieVarMo2524a2.m2494g(this);
        bieVarMo2524a3.m2494g(this);
        bieVarMo2524a4.m2494g(this);
        bieVarMo2524a5.m2494g(this);
        if (i == 1) {
            this.f3354h.m2494g(this);
            this.f3356j.m2494g(this);
        }
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3358l = false;
        this.f3349c.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bhi bhiVar = (bhi) list.get(i);
            if (bhiVar instanceof bhy) {
                bhy bhyVar = (bhy) bhiVar;
                if (bhyVar.f3396e == 1) {
                    this.f3360n.m2583d(bhyVar);
                    bhyVar.m2479a(this);
                }
            }
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        bie bieVar2;
        if (obj == bha.f3257u) {
            this.f3351e.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3258v) {
            this.f3353g.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3248l) {
            this.f3352f.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3259w && (bieVar2 = this.f3354h) != null) {
            bieVar2.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3260x) {
            this.f3355i.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3261y && (bieVar = this.f3356j) != null) {
            bieVar.f3408d = bkoVar;
        } else if (obj == bha.f3262z) {
            this.f3357k.f3408d = bkoVar;
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3348b;
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        if (this.f3358l) {
            return this.f3347a;
        }
        this.f3347a.reset();
        if (this.f3350d) {
            this.f3358l = true;
            return this.f3347a;
        }
        int i2 = this.f3359m;
        if (i2 == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                float fFloatValue = ((Float) this.f3351e.mo2492e()).floatValue();
                double dFloatValue = ((Float) this.f3353g.mo2492e()).floatValue();
                double d2 = fFloatValue;
                float f7 = fFloatValue - ((int) fFloatValue);
                Double.isNaN(d2);
                float f8 = (float) (6.283185307179586d / d2);
                float f9 = f8 / 2.0f;
                Double.isNaN(dFloatValue);
                double radians = Math.toRadians(dFloatValue - 90.0d);
                if (f7 != 0.0f) {
                    double d3 = (1.0f - f7) * f9;
                    Double.isNaN(d3);
                    radians += d3;
                }
                float fFloatValue2 = ((Float) this.f3355i.mo2492e()).floatValue();
                float fFloatValue3 = ((Float) this.f3354h.mo2492e()).floatValue();
                bie bieVar = this.f3356j;
                float fFloatValue4 = bieVar != null ? ((Float) bieVar.mo2492e()).floatValue() / 100.0f : 0.0f;
                float fFloatValue5 = ((Float) this.f3357k.mo2492e()).floatValue() / 100.0f;
                if (f7 != 0.0f) {
                    f4 = ((fFloatValue2 - fFloatValue3) * f7) + fFloatValue3;
                    double dCos = Math.cos(radians);
                    double d4 = f4;
                    Double.isNaN(d4);
                    double d5 = d4 * dCos;
                    double dSin = Math.sin(radians);
                    Double.isNaN(d4);
                    f3 = (float) d5;
                    f2 = (float) (d4 * dSin);
                    this.f3347a.moveTo(f3, f2);
                    double d6 = (f8 * f7) / 2.0f;
                    Double.isNaN(d6);
                    d = radians + d6;
                    f = fFloatValue2;
                } else {
                    f = fFloatValue2;
                    double d7 = f;
                    double dCos2 = Math.cos(radians);
                    Double.isNaN(d7);
                    double dSin2 = Math.sin(radians);
                    Double.isNaN(d7);
                    float f10 = (float) (dCos2 * d7);
                    float f11 = (float) (d7 * dSin2);
                    this.f3347a.moveTo(f10, f11);
                    double d8 = f9;
                    Double.isNaN(d8);
                    d = radians + d8;
                    f2 = f11;
                    f3 = f10;
                    f4 = 0.0f;
                }
                double dCeil = Math.ceil(d2);
                double d9 = dCeil + dCeil;
                float f12 = f2;
                int i3 = 0;
                boolean z = false;
                while (true) {
                    float f13 = f9;
                    float f14 = fFloatValue3;
                    double d10 = i3;
                    if (d10 >= d9) {
                        PointF pointF = (PointF) this.f3352f.mo2492e();
                        this.f3347a.offset(pointF.x, pointF.y);
                        this.f3347a.close();
                    } else {
                        float f15 = f;
                        float f16 = true != z ? f14 : f15;
                        float f17 = (f4 == 0.0f || d10 != d9 + (-2.0d)) ? f13 : (f8 * f7) / 2.0f;
                        if (f4 == 0.0f || d10 != d9 - 1.0d) {
                            f4 = f16;
                        }
                        double dCos3 = Math.cos(d);
                        double d11 = f4;
                        Double.isNaN(d11);
                        double d12 = d9;
                        double d13 = d11 * dCos3;
                        double dSin3 = Math.sin(d);
                        Double.isNaN(d11);
                        float f18 = (float) d13;
                        float f19 = (float) (d11 * dSin3);
                        if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                            this.f3347a.lineTo(f18, f19);
                        } else {
                            double dAtan2 = (float) (Math.atan2(f12, f3) - 1.5707963267948966d);
                            float fCos = (float) Math.cos(dAtan2);
                            float fSin = (float) Math.sin(dAtan2);
                            double dAtan3 = (float) (Math.atan2(f19, f18) - 1.5707963267948966d);
                            float fCos2 = (float) Math.cos(dAtan3);
                            float fSin2 = (float) Math.sin(dAtan3);
                            if (true != z) {
                                f5 = fFloatValue5;
                            }
                            if (true != z) {
                                f5 = fFloatValue4;
                                f6 = fFloatValue4;
                            } else {
                                f5 = fFloatValue4;
                                f6 = fFloatValue5;
                            }
                            float f20 = (true != z ? f15 : f14) * f5 * 0.47829f;
                            float f21 = fCos * f20;
                            float f22 = f20 * fSin;
                            float f23 = f16 * f6 * 0.47829f;
                            float f24 = fCos2 * f23;
                            float f25 = f23 * fSin2;
                            if (f7 != 0.0f) {
                                if (i3 == 0) {
                                    f21 *= f7;
                                    f22 *= f7;
                                } else if (d10 == d12 - 1.0d) {
                                    f24 *= f7;
                                    f25 *= f7;
                                }
                            }
                            this.f3347a.cubicTo(f3 - f21, f12 - f22, f18 + f24, f19 + f25, f18, f19);
                        }
                        double d14 = f17;
                        Double.isNaN(d14);
                        d += d14;
                        z = !z;
                        i3++;
                        f12 = f19;
                        f3 = f18;
                        f9 = f13;
                        fFloatValue3 = f14;
                        f = f15;
                        f8 = f8;
                        f4 = f4;
                        d9 = d12;
                    }
                    break;
                }
                break;
            default:
                int iFloor = (int) Math.floor(((Float) this.f3351e.mo2492e()).floatValue());
                double dFloatValue2 = ((Float) this.f3353g.mo2492e()).floatValue();
                Double.isNaN(dFloatValue2);
                double radians2 = Math.toRadians(dFloatValue2 - 90.0d);
                float fFloatValue6 = ((Float) this.f3357k.mo2492e()).floatValue() / 100.0f;
                float fFloatValue7 = ((Float) this.f3355i.mo2492e()).floatValue();
                double d15 = fFloatValue7;
                double dCos4 = Math.cos(radians2);
                Double.isNaN(d15);
                double dSin4 = Math.sin(radians2);
                Double.isNaN(d15);
                float f26 = (float) (dCos4 * d15);
                float f27 = (float) (dSin4 * d15);
                this.f3347a.moveTo(f26, f27);
                double d16 = iFloor;
                Double.isNaN(d16);
                double d17 = (float) (6.283185307179586d / d16);
                Double.isNaN(d17);
                double d18 = radians2 + d17;
                double dCeil2 = Math.ceil(d16);
                int i4 = 0;
                while (i4 < dCeil2) {
                    double dCos5 = Math.cos(d18);
                    Double.isNaN(d15);
                    double dSin5 = Math.sin(d18);
                    Double.isNaN(d15);
                    double d19 = dCeil2;
                    float f28 = (float) (dCos5 * d15);
                    float f29 = (float) (d15 * dSin5);
                    if (fFloatValue6 != 0.0f) {
                        int i5 = i4;
                        double dAtan4 = (float) (Math.atan2(f27, f26) - 1.5707963267948966d);
                        float fCos3 = (float) Math.cos(dAtan4);
                        float fSin3 = (float) Math.sin(dAtan4);
                        i = i5;
                        double dAtan5 = (float) (Math.atan2(f29, f28) - 1.5707963267948966d);
                        float f30 = fFloatValue7 * fFloatValue6 * 0.25f;
                        this.f3347a.cubicTo(f26 - (fCos3 * f30), f27 - (fSin3 * f30), f28 + (((float) Math.cos(dAtan5)) * f30), f29 + (f30 * ((float) Math.sin(dAtan5))), f28, f29);
                    } else {
                        i = i4;
                        this.f3347a.lineTo(f28, f29);
                    }
                    Double.isNaN(d17);
                    d18 += d17;
                    i4 = i + 1;
                    f27 = f29;
                    f26 = f28;
                    d15 = d15;
                    dCeil2 = d19;
                    d17 = d17;
                }
                PointF pointF2 = (PointF) this.f3352f.mo2492e();
                this.f3347a.offset(pointF2.x, pointF2.y);
                this.f3347a.close();
                break;
        }
        this.f3347a.close();
        this.f3360n.m2584e(this.f3347a);
        this.f3358l = true;
        return this.f3347a;
    }
}
