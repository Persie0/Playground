package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t39 implements h57, i90, oi4 {

    /* JADX INFO: renamed from: b */
    public final String f61806b;

    /* JADX INFO: renamed from: c */
    public final boolean f61807c;

    /* JADX INFO: renamed from: d */
    public final C0868b f61808d;

    /* JADX INFO: renamed from: e */
    public final b49 f61809e;

    /* JADX INFO: renamed from: f */
    public boolean f61810f;

    /* JADX INFO: renamed from: a */
    public final Path f61805a = new Path();

    /* JADX INFO: renamed from: g */
    public final ck6 f61811g = new ck6(7);

    public t39(C0868b c0868b, o90 o90Var, m49 m49Var) {
        this.f61806b = m49Var.f50583a;
        this.f61807c = m49Var.f50586d;
        this.f61808d = c0868b;
        b49 b49Var = new b49((List) m49Var.f50585c.f57375b);
        this.f61809e = b49Var;
        o90Var.m17863e(b49Var);
        b49Var.m16687a(this);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f61810f = false;
        this.f61808d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.f61809e.f7938m = arrayList;
                return;
            }
            qk1 qk1Var = (qk1) arrayList2.get(i);
            if (qk1Var instanceof eca) {
                eca ecaVar = (eca) qk1Var;
                if (ecaVar.f37016c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    ((ArrayList) this.f61811g.f10194b).add(ecaVar);
                    ecaVar.m11028c(this);
                } else if (!(qk1Var instanceof xi8)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    xi8 xi8Var = (xi8) qk1Var;
                    xi8Var.f68260b.m16687a(this);
                    arrayList.add(xi8Var);
                }
            } else if (!(qk1Var instanceof xi8)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                xi8 xi8Var2 = (xi8) qk1Var;
                xi8Var2.f68260b.m16687a(this);
                arrayList.add(xi8Var2);
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
        if (obj == yl5.f70004N) {
            this.f61809e.m16695k(p33Var);
        }
    }

    @Override // p000.h57
    /* JADX INFO: renamed from: g */
    public final Path mo9831g() {
        boolean z = this.f61810f;
        b49 b49Var = this.f61809e;
        Path path = this.f61805a;
        if (z && b49Var.f50800e == null) {
            return path;
        }
        path.reset();
        if (this.f61807c) {
            this.f61810f = true;
            return path;
        }
        Path path2 = (Path) b49Var.mo16692f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f61811g.m4802h(path);
        this.f61810f = true;
        return path;
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f61806b;
    }
}
