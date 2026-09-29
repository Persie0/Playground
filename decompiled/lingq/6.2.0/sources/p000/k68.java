package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0868b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k68 implements am2, h57, tp3, i90, oi4 {

    /* JADX INFO: renamed from: a */
    public final Matrix f46770a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f46771b = new Path();

    /* JADX INFO: renamed from: c */
    public final C0868b f46772c;

    /* JADX INFO: renamed from: d */
    public final o90 f46773d;

    /* JADX INFO: renamed from: e */
    public final String f46774e;

    /* JADX INFO: renamed from: f */
    public final boolean f46775f;

    /* JADX INFO: renamed from: g */
    public final j73 f46776g;

    /* JADX INFO: renamed from: h */
    public final j73 f46777h;

    /* JADX INFO: renamed from: i */
    public final j9a f46778i;

    /* JADX INFO: renamed from: j */
    public uk1 f46779j;

    public k68(C0868b c0868b, o90 o90Var, k28 k28Var) {
        this.f46772c = c0868b;
        this.f46773d = o90Var;
        this.f46774e = (String) k28Var.f46588b;
        this.f46775f = k28Var.f46590d;
        j73 j73VarMo550a = k28Var.f46589c.mo550a();
        this.f46776g = j73VarMo550a;
        o90Var.m17863e(j73VarMo550a);
        j73VarMo550a.m16687a(this);
        j73 j73VarMo550a2 = ((C3763xl) k28Var.f46591e).mo550a();
        this.f46777h = j73VarMo550a2;
        o90Var.m17863e(j73VarMo550a2);
        j73VarMo550a2.m16687a(this);
        C0852cm c0852cm = (C0852cm) k28Var.f46592f;
        c0852cm.getClass();
        j9a j9aVar = new j9a(c0852cm);
        this.f46778i = j9aVar;
        j9aVar.m14354a(o90Var);
        j9aVar.m14355b(this);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f46772c.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        this.f46779j.mo9828b(list, list2);
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        f06.m11426g(mi4Var, i, arrayList, mi4Var2, this);
        for (int i2 = 0; i2 < this.f46779j.f64011i.size(); i2++) {
            qk1 qk1Var = (qk1) this.f46779j.f64011i.get(i2);
            if (qk1Var instanceof oi4) {
                f06.m11426g(mi4Var, i, arrayList, mi4Var2, (oi4) qk1Var);
            }
        }
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        this.f46779j.mo555d(rectF, matrix, z);
    }

    @Override // p000.tp3
    /* JADX INFO: renamed from: e */
    public final void mo14919e(ListIterator listIterator) {
        if (this.f46779j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((qk1) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f46779j = new uk1(this.f46772c, this.f46773d, "Repeater", this.f46775f, arrayList, null);
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        if (this.f46778i.m14356c(p33Var, obj)) {
            return;
        }
        if (obj == yl5.f70023s) {
            this.f46776g.m16695k(p33Var);
        } else if (obj == yl5.f70024t) {
            this.f46777h.m16695k(p33Var);
        }
    }

    @Override // p000.h57
    /* JADX INFO: renamed from: g */
    public final Path mo9831g() {
        Path pathMo9831g = this.f46779j.mo9831g();
        Path path = this.f46771b;
        path.reset();
        float fFloatValue = ((Float) this.f46776g.mo16692f()).floatValue();
        float fFloatValue2 = ((Float) this.f46777h.mo16692f()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixM14359f = this.f46778i.m14359f(i + fFloatValue2);
            Matrix matrix = this.f46770a;
            matrix.set(matrixM14359f);
            path.addPath(pathMo9831g, matrix);
        }
        return path;
    }

    @Override // p000.qk1
    public final String getName() {
        return this.f46774e;
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        float fFloatValue = ((Float) this.f46776g.mo16692f()).floatValue();
        float fFloatValue2 = ((Float) this.f46777h.mo16692f()).floatValue();
        j9a j9aVar = this.f46778i;
        float fFloatValue3 = ((Float) j9aVar.f45263v.mo16692f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) j9aVar.f45264w.mo16692f()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f46770a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(j9aVar.m14359f(f + fFloatValue2));
            this.f46779j.mo556h(canvas, matrix2, (int) (f06.m11425f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), qm2Var);
        }
    }
}
