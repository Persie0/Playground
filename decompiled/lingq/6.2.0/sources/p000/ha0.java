package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ha0 implements i90, oi4, am2 {

    /* JADX INFO: renamed from: e */
    public final C0868b f42069e;

    /* JADX INFO: renamed from: f */
    public final o90 f42070f;

    /* JADX INFO: renamed from: h */
    public final float[] f42072h;

    /* JADX INFO: renamed from: i */
    public final yk4 f42073i;

    /* JADX INFO: renamed from: j */
    public final j73 f42074j;

    /* JADX INFO: renamed from: k */
    public final ha1 f42075k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f42076l;

    /* JADX INFO: renamed from: m */
    public final j73 f42077m;

    /* JADX INFO: renamed from: n */
    public wna f42078n;

    /* JADX INFO: renamed from: o */
    public m90 f42079o;

    /* JADX INFO: renamed from: p */
    public float f42080p;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f42065a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f42066b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f42067c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f42068d = new RectF();

    /* JADX INFO: renamed from: g */
    public final ArrayList f42071g = new ArrayList();

    public ha0(C0868b c0868b, o90 o90Var, Paint.Cap cap, Paint.Join join, float f, C3726wl c3726wl, C3763xl c3763xl, ArrayList arrayList, C3763xl c3763xl2) {
        yk4 yk4Var = new yk4(1, 0);
        this.f42073i = yk4Var;
        this.f42080p = 0.0f;
        this.f42069e = c0868b;
        this.f42070f = o90Var;
        yk4Var.setStyle(Paint.Style.STROKE);
        yk4Var.setStrokeCap(cap);
        yk4Var.setStrokeJoin(join);
        yk4Var.setStrokeMiter(f);
        this.f42075k = (ha1) c3726wl.mo550a();
        this.f42074j = c3763xl.mo550a();
        if (c3763xl2 == null) {
            this.f42077m = null;
        } else {
            this.f42077m = c3763xl2.mo550a();
        }
        this.f42076l = new ArrayList(arrayList.size());
        this.f42072h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f42076l.add(((C3763xl) arrayList.get(i)).mo550a());
        }
        o90Var.m17863e(this.f42075k);
        o90Var.m17863e(this.f42074j);
        for (int i2 = 0; i2 < this.f42076l.size(); i2++) {
            o90Var.m17863e((m90) this.f42076l.get(i2));
        }
        j73 j73Var = this.f42077m;
        if (j73Var != null) {
            o90Var.m17863e(j73Var);
        }
        this.f42075k.m16687a(this);
        this.f42074j.m16687a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((m90) this.f42076l.get(i3)).m16687a(this);
        }
        j73 j73Var2 = this.f42077m;
        if (j73Var2 != null) {
            j73Var2.m16687a(this);
        }
        if (o90Var.mo10092k() != null) {
            j73 j73VarMo550a = ((C3763xl) o90Var.mo10092k().f42410b).mo550a();
            this.f42079o = j73VarMo550a;
            j73VarMo550a.m16687a(this);
            o90Var.m17863e(this.f42079o);
        }
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f42069e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[SYNTHETIC] */
    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        ga0 ga0Var = null;
        eca ecaVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            qk1 qk1Var = (qk1) arrayList2.get(size);
            if (qk1Var instanceof eca) {
                eca ecaVar2 = (eca) qk1Var;
                if (ecaVar2.f37016c == ShapeTrimPath$Type.INDIVIDUALLY) {
                    ecaVar = ecaVar2;
                }
            }
        }
        if (ecaVar != null) {
            ecaVar.m11028c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f42071g;
            if (size2 < 0) {
                break;
            }
            qk1 qk1Var2 = (qk1) list2.get(size2);
            if (qk1Var2 instanceof eca) {
                eca ecaVar3 = (eca) qk1Var2;
                if (ecaVar3.f37016c == ShapeTrimPath$Type.INDIVIDUALLY) {
                    if (ga0Var != null) {
                        arrayList.add(ga0Var);
                    }
                    ga0 ga0Var2 = new ga0(ecaVar3);
                    ecaVar3.m11028c(this);
                    ga0Var = ga0Var2;
                } else if (!(qk1Var2 instanceof h57)) {
                    if (ga0Var == null) {
                        ga0Var = new ga0(ecaVar);
                    }
                    ga0Var.f40441a.add((h57) qk1Var2);
                }
            } else if (!(qk1Var2 instanceof h57)) {
                if (ga0Var == null) {
                    ga0Var = new ga0(ecaVar);
                }
                ga0Var.f40441a.add((h57) qk1Var2);
            }
        }
        if (ga0Var != null) {
            arrayList.add(ga0Var);
        }
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        f06.m11426g(mi4Var, i, arrayList, mi4Var2, this);
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        Path path = this.f42066b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f42071g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f42068d;
                path.computeBounds(rectF2, false);
                float fM14316m = this.f42074j.m14316m() / 2.0f;
                rectF2.set(rectF2.left - fM14316m, rectF2.top - fM14316m, rectF2.right + fM14316m, rectF2.bottom + fM14316m);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                AsyncUpdates asyncUpdates2 = wk4.f66962a;
                return;
            }
            ga0 ga0Var = (ga0) arrayList.get(i);
            for (int i2 = 0; i2 < ga0Var.f40441a.size(); i2++) {
                path.addPath(((h57) ga0Var.f40441a.get(i2)).mo9831g(), matrix);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo9830f(p33 p33Var, Object obj) {
        PointF pointF = yl5.f70005a;
        if (obj == 4) {
            this.f42075k.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f70021q) {
            this.f42074j.m16695k(p33Var);
            return;
        }
        ColorFilter colorFilter = yl5.f69999I;
        o90 o90Var = this.f42070f;
        if (obj == colorFilter) {
            wna wnaVar = this.f42078n;
            if (wnaVar != null) {
                o90Var.m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f42078n = wnaVar2;
            wnaVar2.m16687a(this);
            o90Var.m17863e(this.f42078n);
            return;
        }
        if (obj == yl5.f70009e) {
            m90 m90Var = this.f42079o;
            if (m90Var != null) {
                m90Var.m16695k(p33Var);
                return;
            }
            wna wnaVar3 = new wna(p33Var, null);
            this.f42079o = wnaVar3;
            wnaVar3.m16687a(this);
            o90Var.m17863e(this.f42079o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
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
    /* JADX INFO: renamed from: h */
    public void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        ha0 ha0Var = this;
        AsyncUpdates asyncUpdates = wk4.f66962a;
        float[] fArr2 = (float[]) fna.f39351e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) ha0Var.f42075k.mo16692f()).intValue() / 100.0f;
        int iM11422c = f06.m11422c((int) (i * fIntValue));
        yk4 yk4Var = ha0Var.f42073i;
        yk4Var.setAlpha(iM11422c);
        yk4Var.setStrokeWidth(ha0Var.f42074j.m14316m());
        if (yk4Var.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = ha0Var.f42076l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = ha0Var.f42072h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((m90) arrayList.get(i4)).mo16692f()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            j73 j73Var = ha0Var.f42077m;
            yk4Var.setPathEffect(new DashPathEffect(fArr, j73Var == null ? 0.0f : ((Float) j73Var.mo16692f()).floatValue()));
            AsyncUpdates asyncUpdates2 = wk4.f66962a;
        }
        wna wnaVar = ha0Var.f42078n;
        if (wnaVar != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar.mo16692f());
        }
        m90 m90Var = ha0Var.f42079o;
        if (m90Var != null) {
            float fFloatValue2 = ((Float) m90Var.mo16692f()).floatValue();
            if (fFloatValue2 == 0.0f) {
                yk4Var.setMaskFilter(null);
            } else if (fFloatValue2 != ha0Var.f42080p) {
                o90 o90Var = ha0Var.f42070f;
                if (o90Var.f54043A == fFloatValue2) {
                    maskFilter = o90Var.f54044B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    o90Var.f54044B = blurMaskFilter;
                    o90Var.f54043A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                yk4Var.setMaskFilter(maskFilter);
            }
            ha0Var.f42080p = fFloatValue2;
        }
        if (qm2Var != null) {
            qm2Var.m20023a((int) (fIntValue * 255.0f), yk4Var);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = ha0Var.f42071g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                AsyncUpdates asyncUpdates3 = wk4.f66962a;
                return;
            }
            ga0 ga0Var = (ga0) arrayList2.get(i5);
            eca ecaVar = ga0Var.f40442b;
            ArrayList arrayList3 = ga0Var.f40441a;
            Path path = ha0Var.f42066b;
            if (ecaVar != null) {
                AsyncUpdates asyncUpdates4 = wk4.f66962a;
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((h57) arrayList3.get(size2)).mo9831g());
                }
                float fFloatValue3 = ((Float) ecaVar.f37017d.mo16692f()).floatValue() / f2;
                float fFloatValue4 = ((Float) ecaVar.f37018e.mo16692f()).floatValue() / f2;
                float fFloatValue5 = ((Float) ecaVar.f37019f.mo16692f()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = ha0Var.f42065a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path pathMo9831g = ((h57) arrayList3.get(size3)).mo9831g();
                        Path path2 = ha0Var.f42067c;
                        path2.set(pathMo9831g);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        fna.m11955a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, yk4Var);
                                    } else {
                                        canvas.drawPath(path2, yk4Var);
                                    }
                                }
                            } else {
                                fna.m11955a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, yk4Var);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        ha0Var = this;
                        i3 = i6;
                        z = false;
                    }
                    i2 = i3;
                    AsyncUpdates asyncUpdates5 = wk4.f66962a;
                } else {
                    canvas.drawPath(path, yk4Var);
                    AsyncUpdates asyncUpdates6 = wk4.f66962a;
                    i2 = i3;
                }
            } else {
                i2 = i3;
                AsyncUpdates asyncUpdates7 = wk4.f66962a;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((h57) arrayList3.get(size4)).mo9831g());
                }
                AsyncUpdates asyncUpdates8 = wk4.f66962a;
                canvas.drawPath(path, yk4Var);
            }
            i5++;
            ha0Var = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
