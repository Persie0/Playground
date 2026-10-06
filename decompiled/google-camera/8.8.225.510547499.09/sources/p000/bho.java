package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bho extends bhh {

    /* JADX INFO: renamed from: c */
    private final String f3331c;

    /* JADX INFO: renamed from: d */
    private final boolean f3332d;

    /* JADX INFO: renamed from: e */
    private final C1114xc f3333e;

    /* JADX INFO: renamed from: f */
    private final C1114xc f3334f;

    /* JADX INFO: renamed from: g */
    private final RectF f3335g;

    /* JADX INFO: renamed from: h */
    private final int f3336h;

    /* JADX INFO: renamed from: i */
    private final bie f3337i;

    /* JADX INFO: renamed from: j */
    private final bie f3338j;

    /* JADX INFO: renamed from: k */
    private final bie f3339k;

    /* JADX INFO: renamed from: l */
    private bis f3340l;

    /* JADX INFO: renamed from: m */
    private final int f3341m;

    public bho(bgv bgvVar, bkc bkcVar, bjq bjqVar) {
        super(bgvVar, bkcVar, bzq.m3249V(bjqVar.f3509l), bzq.m3247T(bjqVar.f3510m), bjqVar.f3504g, bjqVar.f3500c, bjqVar.f3503f, bjqVar.f3505h, bjqVar.f3506i);
        this.f3333e = new C1114xc();
        this.f3334f = new C1114xc();
        this.f3335g = new RectF();
        this.f3331c = bjqVar.f3498a;
        this.f3341m = bjqVar.f3508k;
        this.f3332d = bjqVar.f3507j;
        this.f3336h = (int) (bgvVar.f3205a.m2415a() / 32.0f);
        bie bieVarMo2524a = bjqVar.f3499b.mo2524a();
        this.f3337i = bieVarMo2524a;
        bieVarMo2524a.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a);
        bie bieVarMo2524a2 = bjqVar.f3501d.mo2524a();
        this.f3338j = bieVarMo2524a2;
        bieVarMo2524a2.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a2);
        bie bieVarMo2524a3 = bjqVar.f3502e.mo2524a();
        this.f3339k = bieVarMo2524a3;
        bieVarMo2524a3.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a3);
    }

    /* JADX INFO: renamed from: h */
    private final int m2475h() {
        int iRound = Math.round(this.f3338j.f3407c * this.f3336h);
        int iRound2 = Math.round(this.f3339k.f3407c * this.f3336h);
        int iRound3 = Math.round(this.f3337i.f3407c * this.f3336h);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX INFO: renamed from: i */
    private final int[] m2476i(int[] iArr) {
        bis bisVar = this.f3340l;
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
    @Override // p000.bhh, p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        Shader radialGradient;
        if (this.f3332d) {
            return;
        }
        mo2464b(this.f3335g, matrix, false);
        if (this.f3341m == 1) {
            long jM2475h = m2475h();
            radialGradient = (LinearGradient) this.f3333e.m19546d(jM2475h);
            if (radialGradient == null) {
                PointF pointF = (PointF) this.f3338j.mo2492e();
                PointF pointF2 = (PointF) this.f3339k.mo2492e();
                dsx dsxVar = (dsx) this.f3337i.mo2492e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m2476i((int[]) dsxVar.f12522b), (float[]) dsxVar.f12521a, Shader.TileMode.CLAMP);
                this.f3333e.m19549g(jM2475h, radialGradient);
            }
        } else {
            long jM2475h2 = m2475h();
            radialGradient = (RadialGradient) this.f3334f.m19546d(jM2475h2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) this.f3338j.mo2492e();
                PointF pointF4 = (PointF) this.f3339k.mo2492e();
                dsx dsxVar2 = (dsx) this.f3337i.mo2492e();
                int[] iArrM2476i = m2476i((int[]) dsxVar2.f12522b);
                Object obj = dsxVar2.f12521a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrM2476i, (float[]) obj, Shader.TileMode.CLAMP);
                this.f3334f.m19549g(jM2475h2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.f3273b.setShader(radialGradient);
        super.mo2463a(canvas, matrix, i);
    }

    @Override // p000.bhh, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3234F) {
            bis bisVar = this.f3340l;
            if (bisVar != null) {
                this.f3272a.m2536j(bisVar);
            }
            bis bisVar2 = new bis(bkoVar, null);
            this.f3340l = bisVar2;
            bisVar2.m2494g(this);
            this.f3272a.m2534h(this.f3340l);
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3331c;
    }
}
