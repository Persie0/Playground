package p000;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cp2 implements h57, i90, oi4 {

    /* JADX INFO: renamed from: b */
    public final String f34334b;

    /* JADX INFO: renamed from: c */
    public final C0868b f34335c;

    /* JADX INFO: renamed from: d */
    public final bp3 f34336d;

    /* JADX INFO: renamed from: e */
    public final m90 f34337e;

    /* JADX INFO: renamed from: f */
    public final f21 f34338f;

    /* JADX INFO: renamed from: h */
    public boolean f34340h;

    /* JADX INFO: renamed from: a */
    public final Path f34333a = new Path();

    /* JADX INFO: renamed from: g */
    public final ck6 f34339g = new ck6(7);

    public cp2(C0868b c0868b, o90 o90Var, f21 f21Var) {
        this.f34334b = f21Var.f38297a;
        this.f34335c = c0868b;
        m90 m90VarMo550a = f21Var.f38299c.mo550a();
        this.f34336d = (bp3) m90VarMo550a;
        m90 m90VarMo550a2 = f21Var.f38298b.mo550a();
        this.f34337e = m90VarMo550a2;
        this.f34338f = f21Var;
        o90Var.m17863e(m90VarMo550a);
        o90Var.m17863e(m90VarMo550a2);
        m90VarMo550a.m16687a(this);
        m90VarMo550a2.m16687a(this);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f34340h = false;
        this.f34335c.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            qk1 qk1Var = (qk1) arrayList.get(i);
            if (qk1Var instanceof eca) {
                eca ecaVar = (eca) qk1Var;
                if (ecaVar.f37016c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    ((ArrayList) this.f34339g.f10194b).add(ecaVar);
                    ecaVar.m11028c(this);
                }
            }
            i++;
        }
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        f06.m11426g(mi4Var, i, arrayList, mi4Var2, this);
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        if (obj == yl5.f70010f) {
            this.f34336d.m16695k(p33Var);
        } else if (obj == yl5.f70013i) {
            this.f34337e.m16695k(p33Var);
        }
    }

    @Override // p000.h57
    /* JADX INFO: renamed from: g */
    public final Path mo9831g() {
        boolean z = this.f34340h;
        Path path = this.f34333a;
        if (z) {
            return path;
        }
        path.reset();
        f21 f21Var = this.f34338f;
        if (f21Var.f38301e) {
            this.f34340h = true;
            return path;
        }
        PointF pointF = (PointF) this.f34336d.mo16692f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (f21Var.f38300d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f34337e.mo16692f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f34339g.m4802h(path);
        this.f34340h = true;
        return path;
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f34334b;
    }
}
