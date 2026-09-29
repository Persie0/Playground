package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x33 implements am2, i90, oi4 {

    /* JADX INFO: renamed from: a */
    public final Path f67700a;

    /* JADX INFO: renamed from: b */
    public final yk4 f67701b;

    /* JADX INFO: renamed from: c */
    public final o90 f67702c;

    /* JADX INFO: renamed from: d */
    public final String f67703d;

    /* JADX INFO: renamed from: e */
    public final boolean f67704e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f67705f;

    /* JADX INFO: renamed from: g */
    public final ha1 f67706g;

    /* JADX INFO: renamed from: h */
    public final ha1 f67707h;

    /* JADX INFO: renamed from: i */
    public wna f67708i;

    /* JADX INFO: renamed from: j */
    public final C0868b f67709j;

    /* JADX INFO: renamed from: k */
    public m90 f67710k;

    /* JADX INFO: renamed from: l */
    public float f67711l;

    public x33(C0868b c0868b, o90 o90Var, x39 x39Var) {
        Path path = new Path();
        this.f67700a = path;
        this.f67701b = new yk4(1, 0);
        this.f67705f = new ArrayList();
        this.f67702c = o90Var;
        String str = x39Var.f67729c;
        C3726wl c3726wl = x39Var.f67731e;
        C3726wl c3726wl2 = x39Var.f67730d;
        this.f67703d = str;
        this.f67704e = x39Var.f67732f;
        this.f67709j = c0868b;
        if (o90Var.mo10092k() != null) {
            j73 j73VarMo550a = ((C3763xl) o90Var.mo10092k().f42410b).mo550a();
            this.f67710k = j73VarMo550a;
            j73VarMo550a.m16687a(this);
            o90Var.m17863e(this.f67710k);
        }
        if (c3726wl2 == null) {
            this.f67706g = null;
            this.f67707h = null;
            return;
        }
        path.setFillType(x39Var.f67728b);
        m90 m90VarMo550a = c3726wl2.mo550a();
        this.f67706g = (ha1) m90VarMo550a;
        m90VarMo550a.m16687a(this);
        o90Var.m17863e(m90VarMo550a);
        m90 m90VarMo550a2 = c3726wl.mo550a();
        this.f67707h = (ha1) m90VarMo550a2;
        m90VarMo550a2.m16687a(this);
        o90Var.m17863e(m90VarMo550a2);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f67709j.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qk1 qk1Var = (qk1) list2.get(i);
            if (qk1Var instanceof h57) {
                this.f67705f.add((h57) qk1Var);
            }
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
        Path path = this.f67700a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f67705f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((h57) arrayList.get(i)).mo9831g(), matrix);
                i++;
            }
        }
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        PointF pointF = yl5.f70005a;
        if (obj == 1) {
            this.f67706g.m16695k(p33Var);
            return;
        }
        if (obj == 4) {
            this.f67707h.m16695k(p33Var);
            return;
        }
        ColorFilter colorFilter = yl5.f69999I;
        o90 o90Var = this.f67702c;
        if (obj == colorFilter) {
            wna wnaVar = this.f67708i;
            if (wnaVar != null) {
                o90Var.m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f67708i = wnaVar2;
            wnaVar2.m16687a(this);
            o90Var.m17863e(this.f67708i);
            return;
        }
        if (obj == yl5.f70009e) {
            m90 m90Var = this.f67710k;
            if (m90Var != null) {
                m90Var.m16695k(p33Var);
                return;
            }
            wna wnaVar3 = new wna(p33Var, null);
            this.f67710k = wnaVar3;
            wnaVar3.m16687a(this);
            o90Var.m17863e(this.f67710k);
        }
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f67703d;
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
    @Override // p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        MaskFilter maskFilter;
        if (this.f67704e) {
            return;
        }
        AsyncUpdates asyncUpdates = wk4.f66962a;
        ha1 ha1Var = this.f67706g;
        int iM13153m = ha1Var.m13153m(ha1Var.m16688b(), ha1Var.m16690d());
        float fIntValue = ((Integer) this.f67707h.mo16692f()).intValue() / 100.0f;
        int iM11422c = (f06.m11422c((int) (i * fIntValue)) << 24) | (iM13153m & 16777215);
        yk4 yk4Var = this.f67701b;
        yk4Var.setColor(iM11422c);
        wna wnaVar = this.f67708i;
        if (wnaVar != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar.mo16692f());
        }
        m90 m90Var = this.f67710k;
        if (m90Var != null) {
            float fFloatValue = ((Float) m90Var.mo16692f()).floatValue();
            if (fFloatValue == 0.0f) {
                yk4Var.setMaskFilter(null);
            } else if (fFloatValue != this.f67711l) {
                o90 o90Var = this.f67702c;
                if (o90Var.f54043A == fFloatValue) {
                    maskFilter = o90Var.f54044B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    o90Var.f54044B = blurMaskFilter;
                    o90Var.f54043A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                yk4Var.setMaskFilter(maskFilter);
            }
            this.f67711l = fFloatValue;
        }
        if (qm2Var != null) {
            qm2Var.m20023a((int) (fIntValue * 255.0f), yk4Var);
        } else {
            yk4Var.clearShadowLayer();
        }
        Path path = this.f67700a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f67705f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, yk4Var);
                AsyncUpdates asyncUpdates2 = wk4.f66962a;
                return;
            } else {
                path.addPath(((h57) arrayList.get(i2)).mo9831g(), matrix);
                i2++;
            }
        }
    }
}
