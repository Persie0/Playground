package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhn implements bhk, bhz, bhq {

    /* JADX INFO: renamed from: a */
    private final String f3313a;

    /* JADX INFO: renamed from: b */
    private final boolean f3314b;

    /* JADX INFO: renamed from: c */
    private final bkc f3315c;

    /* JADX INFO: renamed from: d */
    private final C1114xc f3316d = new C1114xc();

    /* JADX INFO: renamed from: e */
    private final C1114xc f3317e = new C1114xc();

    /* JADX INFO: renamed from: f */
    private final Path f3318f;

    /* JADX INFO: renamed from: g */
    private final Paint f3319g;

    /* JADX INFO: renamed from: h */
    private final RectF f3320h;

    /* JADX INFO: renamed from: i */
    private final List f3321i;

    /* JADX INFO: renamed from: j */
    private final bie f3322j;

    /* JADX INFO: renamed from: k */
    private final bie f3323k;

    /* JADX INFO: renamed from: l */
    private final bie f3324l;

    /* JADX INFO: renamed from: m */
    private final bie f3325m;

    /* JADX INFO: renamed from: n */
    private bie f3326n;

    /* JADX INFO: renamed from: o */
    private bis f3327o;

    /* JADX INFO: renamed from: p */
    private final bgv f3328p;

    /* JADX INFO: renamed from: q */
    private final int f3329q;

    /* JADX INFO: renamed from: r */
    private final int f3330r;

    public bhn(bgv bgvVar, bkc bkcVar, bjp bjpVar) {
        Path path = new Path();
        this.f3318f = path;
        this.f3319g = new bhg(1);
        this.f3320h = new RectF();
        this.f3321i = new ArrayList();
        this.f3315c = bkcVar;
        this.f3313a = bjpVar.f3495f;
        this.f3314b = bjpVar.f3496g;
        this.f3328p = bgvVar;
        this.f3330r = bjpVar.f3497h;
        path.setFillType(bjpVar.f3490a);
        this.f3329q = (int) (bgvVar.f3205a.m2415a() / 32.0f);
        bie bieVarMo2524a = bjpVar.f3491b.mo2524a();
        this.f3322j = bieVarMo2524a;
        bieVarMo2524a.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a);
        bie bieVarMo2524a2 = bjpVar.f3492c.mo2524a();
        this.f3323k = bieVarMo2524a2;
        bieVarMo2524a2.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a2);
        bie bieVarMo2524a3 = bjpVar.f3493d.mo2524a();
        this.f3324l = bieVarMo2524a3;
        bieVarMo2524a3.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a3);
        bie bieVarMo2524a4 = bjpVar.f3494e.mo2524a();
        this.f3325m = bieVarMo2524a4;
        bieVarMo2524a4.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a4);
    }

    /* JADX INFO: renamed from: h */
    private final int m2473h() {
        int iRound = Math.round(this.f3324l.f3407c * this.f3329q);
        int iRound2 = Math.round(this.f3325m.f3407c * this.f3329q);
        int iRound3 = Math.round(this.f3322j.f3407c * this.f3329q);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX INFO: renamed from: i */
    private final int[] m2474i(int[] iArr) {
        bis bisVar = this.f3327o;
        if (bisVar != null) {
            Integer[] numArr = (Integer[]) bisVar.mo2492e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        Shader radialGradient;
        if (this.f3314b) {
            return;
        }
        this.f3318f.reset();
        for (int i2 = 0; i2 < this.f3321i.size(); i2++) {
            this.f3318f.addPath(((bhs) this.f3321i.get(i2)).mo2471i(), matrix);
        }
        this.f3318f.computeBounds(this.f3320h, false);
        if (this.f3330r == 1) {
            long jM2473h = m2473h();
            radialGradient = (LinearGradient) this.f3316d.m19546d(jM2473h);
            if (radialGradient == null) {
                PointF pointF = (PointF) this.f3324l.mo2492e();
                PointF pointF2 = (PointF) this.f3325m.mo2492e();
                dsx dsxVar = (dsx) this.f3322j.mo2492e();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m2474i((int[]) dsxVar.f12522b), (float[]) dsxVar.f12521a, Shader.TileMode.CLAMP);
                this.f3316d.m19549g(jM2473h, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long jM2473h2 = m2473h();
            radialGradient = (RadialGradient) this.f3317e.m19546d(jM2473h2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) this.f3324l.mo2492e();
                PointF pointF4 = (PointF) this.f3325m.mo2492e();
                dsx dsxVar2 = (dsx) this.f3322j.mo2492e();
                int[] iArrM2474i = m2474i((int[]) dsxVar2.f12522b);
                Object obj = dsxVar2.f12521a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                radialGradient = new RadialGradient(f, f2, fHypot <= 0.0f ? 0.001f : fHypot, iArrM2474i, (float[]) obj, Shader.TileMode.CLAMP);
                this.f3317e.m19549g(jM2473h2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.f3319g.setShader(radialGradient);
        bie bieVar = this.f3326n;
        if (bieVar != null) {
            this.f3319g.setColorFilter((ColorFilter) bieVar.mo2492e());
        }
        this.f3319g.setAlpha(blz.m2697e((int) ((((i / 255.0f) * ((Integer) this.f3323k.mo2492e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f3318f, this.f3319g);
        bgh.m2413a();
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3318f.reset();
        for (int i = 0; i < this.f3321i.size(); i++) {
            this.f3318f.addPath(((bhs) this.f3321i.get(i)).mo2471i(), matrix);
        }
        this.f3318f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3328p.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            bhi bhiVar = (bhi) list2.get(i);
            if (bhiVar instanceof bhs) {
                this.f3321i.add((bhs) bhiVar);
            }
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        if (obj == bha.f3240d) {
            this.f3323k.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3233E) {
            bie bieVar = this.f3326n;
            if (bieVar != null) {
                this.f3315c.m2536j(bieVar);
            }
            bis bisVar = new bis(bkoVar, null);
            this.f3326n = bisVar;
            bisVar.m2494g(this);
            this.f3315c.m2534h(this.f3326n);
            return;
        }
        if (obj == bha.f3234F) {
            bis bisVar2 = this.f3327o;
            if (bisVar2 != null) {
                this.f3315c.m2536j(bisVar2);
            }
            this.f3316d.m19548f();
            this.f3317e.m19548f();
            bis bisVar3 = new bis(bkoVar, null);
            this.f3327o = bisVar3;
            bisVar3.m2494g(this);
            this.f3315c.m2534h(this.f3327o);
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3313a;
    }
}
