package p000;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bir {

    /* JADX INFO: renamed from: a */
    public bie f3430a;

    /* JADX INFO: renamed from: b */
    public bie f3431b;

    /* JADX INFO: renamed from: c */
    public bie f3432c;

    /* JADX INFO: renamed from: d */
    public bie f3433d;

    /* JADX INFO: renamed from: e */
    public bie f3434e;

    /* JADX INFO: renamed from: f */
    public final big f3435f;

    /* JADX INFO: renamed from: g */
    public final big f3436g;

    /* JADX INFO: renamed from: h */
    public final bie f3437h;

    /* JADX INFO: renamed from: i */
    public final bie f3438i;

    /* JADX INFO: renamed from: j */
    private final Matrix f3439j = new Matrix();

    /* JADX INFO: renamed from: k */
    private final Matrix f3440k;

    /* JADX INFO: renamed from: l */
    private final Matrix f3441l;

    /* JADX INFO: renamed from: m */
    private final Matrix f3442m;

    /* JADX INFO: renamed from: n */
    private final float[] f3443n;

    public bir(bjk bjkVar) {
        bje bjeVar = bjkVar.f3475a;
        this.f3430a = bjeVar == null ? null : bjeVar.mo2524a();
        bjl bjlVar = bjkVar.f3476b;
        this.f3431b = bjlVar == null ? null : bjlVar.mo2524a();
        bjg bjgVar = bjkVar.f3477c;
        this.f3432c = bjgVar == null ? null : bjgVar.mo2524a();
        bjb bjbVar = bjkVar.f3478d;
        this.f3433d = bjbVar == null ? null : bjbVar.mo2524a();
        bjb bjbVar2 = bjkVar.f3480f;
        big bigVar = (big) (bjbVar2 == null ? null : bjbVar2.mo2524a());
        this.f3435f = bigVar;
        if (bigVar != null) {
            this.f3440k = new Matrix();
            this.f3441l = new Matrix();
            this.f3442m = new Matrix();
            this.f3443n = new float[9];
        } else {
            this.f3440k = null;
            this.f3441l = null;
            this.f3442m = null;
            this.f3443n = null;
        }
        bjb bjbVar3 = bjkVar.f3481g;
        this.f3436g = (big) (bjbVar3 == null ? null : bjbVar3.mo2524a());
        bjd bjdVar = bjkVar.f3479e;
        if (bjdVar != null) {
            this.f3434e = bjdVar.mo2524a();
        }
        bjb bjbVar4 = bjkVar.f3482h;
        if (bjbVar4 != null) {
            this.f3437h = bjbVar4.mo2524a();
        } else {
            this.f3437h = null;
        }
        bjb bjbVar5 = bjkVar.f3483i;
        if (bjbVar5 != null) {
            this.f3438i = bjbVar5.mo2524a();
        } else {
            this.f3438i = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m2506f() {
        for (int i = 0; i < 9; i++) {
            this.f3443n[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Matrix m2507a() {
        this.f3439j.reset();
        bie bieVar = this.f3431b;
        if (bieVar != null) {
            PointF pointF = (PointF) bieVar.mo2492e();
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                this.f3439j.preTranslate(pointF.x, pointF.y);
            }
        }
        bie bieVar2 = this.f3433d;
        if (bieVar2 != null) {
            float fFloatValue = bieVar2 instanceof bis ? ((Float) bieVar2.mo2492e()).floatValue() : ((big) bieVar2).m2500k();
            if (fFloatValue != 0.0f) {
                this.f3439j.preRotate(fFloatValue);
            }
        }
        if (this.f3435f != null) {
            big bigVar = this.f3436g;
            float fCos = bigVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-bigVar.m2500k()) + 90.0f));
            big bigVar2 = this.f3436g;
            float fSin = bigVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-bigVar2.m2500k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f3435f.m2500k()));
            m2506f();
            float[] fArr = this.f3443n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f3440k.setValues(fArr);
            m2506f();
            float[] fArr2 = this.f3443n;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f3441l.setValues(fArr2);
            m2506f();
            float[] fArr3 = this.f3443n;
            fArr3[0] = fCos;
            fArr3[1] = f;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f3442m.setValues(fArr3);
            this.f3441l.preConcat(this.f3440k);
            this.f3442m.preConcat(this.f3441l);
            this.f3439j.preConcat(this.f3442m);
        }
        bie bieVar3 = this.f3432c;
        if (bieVar3 != null) {
            bmg bmgVar = (bmg) bieVar3.mo2492e();
            float f2 = bmgVar.f3774a;
            if (f2 != 1.0f || bmgVar.f3775b != 1.0f) {
                this.f3439j.preScale(f2, bmgVar.f3775b);
            }
        }
        bie bieVar4 = this.f3430a;
        if (bieVar4 != null) {
            PointF pointF2 = (PointF) bieVar4.mo2492e();
            if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
                this.f3439j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.f3439j;
    }

    /* JADX INFO: renamed from: c */
    public final void m2509c(bkc bkcVar) {
        bkcVar.m2534h(this.f3434e);
        bkcVar.m2534h(this.f3437h);
        bkcVar.m2534h(this.f3438i);
        bkcVar.m2534h(this.f3430a);
        bkcVar.m2534h(this.f3431b);
        bkcVar.m2534h(this.f3432c);
        bkcVar.m2534h(this.f3433d);
        bkcVar.m2534h(this.f3435f);
        bkcVar.m2534h(this.f3436g);
    }

    /* JADX INFO: renamed from: d */
    public final void m2510d(bhz bhzVar) {
        bie bieVar = this.f3434e;
        if (bieVar != null) {
            bieVar.m2494g(bhzVar);
        }
        bie bieVar2 = this.f3437h;
        if (bieVar2 != null) {
            bieVar2.m2494g(bhzVar);
        }
        bie bieVar3 = this.f3438i;
        if (bieVar3 != null) {
            bieVar3.m2494g(bhzVar);
        }
        bie bieVar4 = this.f3430a;
        if (bieVar4 != null) {
            bieVar4.m2494g(bhzVar);
        }
        bie bieVar5 = this.f3431b;
        if (bieVar5 != null) {
            bieVar5.m2494g(bhzVar);
        }
        bie bieVar6 = this.f3432c;
        if (bieVar6 != null) {
            bieVar6.m2494g(bhzVar);
        }
        bie bieVar7 = this.f3433d;
        if (bieVar7 != null) {
            bieVar7.m2494g(bhzVar);
        }
        big bigVar = this.f3435f;
        if (bigVar != null) {
            bigVar.m2494g(bhzVar);
        }
        big bigVar2 = this.f3436g;
        if (bigVar2 != null) {
            bigVar2.m2494g(bhzVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2511e(Object obj, bko bkoVar) {
        bie bieVar;
        bie bieVar2;
        if (obj == bha.f3241e) {
            bie bieVar3 = this.f3430a;
            if (bieVar3 != null) {
                bieVar3.f3408d = bkoVar;
                return true;
            }
            new PointF();
            this.f3430a = new bis(bkoVar, null, null);
            return true;
        }
        if (obj == bha.f3242f) {
            bie bieVar4 = this.f3431b;
            if (bieVar4 != null) {
                bieVar4.f3408d = bkoVar;
                return true;
            }
            new PointF();
            this.f3431b = new bis(bkoVar, null, null);
            return true;
        }
        if (obj == bha.f3243g) {
            bie bieVar5 = this.f3431b;
            if (bieVar5 instanceof bip) {
                bip bipVar = (bip) bieVar5;
                bko bkoVar2 = bipVar.f3424e;
                bipVar.f3424e = bkoVar;
                return true;
            }
        }
        if (obj == bha.f3244h) {
            bie bieVar6 = this.f3431b;
            if (bieVar6 instanceof bip) {
                bip bipVar2 = (bip) bieVar6;
                bko bkoVar3 = bipVar2.f3425f;
                bipVar2.f3425f = bkoVar;
                return true;
            }
        }
        if (obj == bha.f3249m) {
            bie bieVar7 = this.f3432c;
            if (bieVar7 == null) {
                this.f3432c = new bis(bkoVar, null, null);
                return true;
            }
            bieVar7.f3408d = bkoVar;
            return true;
        }
        if (obj == bha.f3250n) {
            bie bieVar8 = this.f3433d;
            if (bieVar8 == null) {
                this.f3433d = new bis(bkoVar, null, null);
                return true;
            }
            bieVar8.f3408d = bkoVar;
            return true;
        }
        if (obj == bha.f3239c) {
            bieVar = this.f3434e;
            if (bieVar == null) {
                this.f3434e = new bis(bkoVar, null, null);
                return true;
            }
        } else {
            if ((obj == bha.f3229A && (bieVar2 = this.f3437h) != null) || ((obj == bha.f3230B && (bieVar2 = this.f3438i) != null) || (obj == bha.f3251o && (bieVar2 = this.f3435f) != null))) {
                bieVar2.f3408d = bkoVar;
                return true;
            }
            if (obj != bha.f3252p || (bieVar = this.f3436g) == null) {
                return false;
            }
        }
        bieVar.f3408d = bkoVar;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Matrix m2508b(float f) {
        bie bieVar = this.f3431b;
        PointF pointF = bieVar == null ? null : (PointF) bieVar.mo2492e();
        bie bieVar2 = this.f3432c;
        bmg bmgVar = bieVar2 == null ? null : (bmg) bieVar2.mo2492e();
        this.f3439j.reset();
        if (pointF != null) {
            this.f3439j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (bmgVar != null) {
            double d = f;
            this.f3439j.preScale((float) Math.pow(bmgVar.f3774a, d), (float) Math.pow(bmgVar.f3775b, d));
        }
        bie bieVar3 = this.f3433d;
        if (bieVar3 != null) {
            float fFloatValue = ((Float) bieVar3.mo2492e()).floatValue();
            bie bieVar4 = this.f3430a;
            PointF pointF2 = bieVar4 != null ? (PointF) bieVar4.mo2492e() : null;
            this.f3439j.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f3439j;
    }
}
