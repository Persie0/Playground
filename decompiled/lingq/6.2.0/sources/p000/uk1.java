package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0868b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uk1 implements am2, h57, i90, ni4 {

    /* JADX INFO: renamed from: a */
    public final ztb f64003a;

    /* JADX INFO: renamed from: b */
    public final RectF f64004b;

    /* JADX INFO: renamed from: c */
    public final fq6 f64005c;

    /* JADX INFO: renamed from: d */
    public final Matrix f64006d;

    /* JADX INFO: renamed from: e */
    public final Path f64007e;

    /* JADX INFO: renamed from: f */
    public final RectF f64008f;

    /* JADX INFO: renamed from: g */
    public final String f64009g;

    /* JADX INFO: renamed from: h */
    public final boolean f64010h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f64011i;

    /* JADX INFO: renamed from: j */
    public final C0868b f64012j;

    /* JADX INFO: renamed from: k */
    public ArrayList f64013k;

    /* JADX INFO: renamed from: l */
    public final j9a f64014l;

    public uk1(C0868b c0868b, o90 o90Var, String str, boolean z, ArrayList arrayList, C0852cm c0852cm) {
        this.f64003a = new ztb(7, (byte) 0);
        this.f64004b = new RectF();
        this.f64005c = new fq6();
        this.f64006d = new Matrix();
        this.f64007e = new Path();
        this.f64008f = new RectF();
        this.f64009g = str;
        this.f64012j = c0868b;
        this.f64010h = z;
        this.f64011i = arrayList;
        if (c0852cm != null) {
            j9a j9aVar = new j9a(c0852cm);
            this.f64014l = j9aVar;
            j9aVar.m14354a(o90Var);
            j9aVar.m14355b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qk1 qk1Var = (qk1) arrayList.get(size);
            if (qk1Var instanceof tp3) {
                arrayList2.add((tp3) qk1Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((tp3) arrayList2.get(size2)).mo14919e(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f64012j.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f64011i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            qk1 qk1Var = (qk1) arrayList.get(size2);
            qk1Var.mo9828b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(qk1Var);
        }
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        String str = this.f64009g;
        if (!mi4Var.m16843c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            mi4 mi4Var3 = new mi4(mi4Var2);
            mi4Var3.f51357a.add(str);
            if (mi4Var.m16841a(i, str)) {
                mi4 mi4Var4 = new mi4(mi4Var3);
                mi4Var4.f51358b = this;
                arrayList.add(mi4Var4);
            }
            mi4Var2 = mi4Var3;
        }
        if (!mi4Var.m16844d(i, str)) {
            return;
        }
        int iM16842b = mi4Var.m16842b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f64011i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            qk1 qk1Var = (qk1) arrayList2.get(i2);
            if (qk1Var instanceof ni4) {
                ((ni4) qk1Var).mo9829c(mi4Var, iM16842b, arrayList, mi4Var2);
            }
            i2++;
        }
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f64006d;
        matrix2.set(matrix);
        j9a j9aVar = this.f64014l;
        if (j9aVar != null) {
            matrix2.preConcat(j9aVar.m14358e());
        }
        RectF rectF2 = this.f64008f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f64011i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qk1 qk1Var = (qk1) arrayList.get(size);
            if (qk1Var instanceof am2) {
                ((am2) qk1Var).mo555d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m22764e() {
        if (this.f64013k == null) {
            this.f64013k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f64011i;
                if (i >= arrayList.size()) {
                    break;
                }
                qk1 qk1Var = (qk1) arrayList.get(i);
                if (qk1Var instanceof h57) {
                    this.f64013k.add((h57) qk1Var);
                }
                i++;
            }
        }
        return this.f64013k;
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        j9a j9aVar = this.f64014l;
        if (j9aVar != null) {
            j9aVar.m14356c(p33Var, obj);
        }
    }

    @Override // p000.h57
    /* JADX INFO: renamed from: g */
    public final Path mo9831g() {
        Matrix matrix = this.f64006d;
        matrix.reset();
        j9a j9aVar = this.f64014l;
        if (j9aVar != null) {
            matrix.set(j9aVar.m14358e());
        }
        Path path = this.f64007e;
        path.reset();
        if (!this.f64010h) {
            ArrayList arrayList = this.f64011i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                qk1 qk1Var = (qk1) arrayList.get(size);
                if (qk1Var instanceof h57) {
                    path.addPath(((h57) qk1Var).mo9831g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // p000.qk1
    public final String getName() {
        throw null;
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        if (this.f64010h) {
            return;
        }
        Matrix matrix2 = this.f64006d;
        matrix2.set(matrix);
        j9a j9aVar = this.f64014l;
        if (j9aVar != null) {
            matrix2.preConcat(j9aVar.m14358e());
            m90 m90Var = j9aVar.f45257p;
            i = (int) (((((m90Var == null ? 100 : ((Integer) m90Var.mo16692f()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        C0868b c0868b = this.f64012j;
        boolean z = (c0868b.f10608O && m22765i() && i != 255) || (qm2Var != null && c0868b.f10609P && m22765i());
        int i2 = z ? 255 : i;
        fq6 fq6Var = this.f64005c;
        if (z) {
            RectF rectF = this.f64004b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo555d(rectF, matrix, true);
            ztb ztbVar = this.f64003a;
            ztbVar.f72161b = i;
            if (qm2Var != null) {
                if (Color.alpha(qm2Var.f57941d) > 0) {
                    ztbVar.f72162c = qm2Var;
                } else {
                    ztbVar.f72162c = null;
                }
                qm2Var = null;
            } else {
                ztbVar.f72162c = null;
            }
            canvas = fq6Var.m11998e(canvas, rectF, ztbVar);
        } else if (qm2Var != null) {
            qm2 qm2Var2 = new qm2(qm2Var);
            qm2Var2.m20024b(i2);
            qm2Var = qm2Var2;
        }
        ArrayList arrayList = this.f64011i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof am2) {
                ((am2) obj).mo556h(canvas, matrix2, i2, qm2Var);
            }
        }
        if (z) {
            fq6Var.m11997c();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22765i() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f64011i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof am2) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public uk1(C0868b c0868b, o90 o90Var, z39 z39Var, gl5 gl5Var) {
        C0852cm c0852cm;
        String str = z39Var.f70836a;
        boolean z = z39Var.f70838c;
        List list = z39Var.f70837b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            qk1 qk1VarMo403a = ((cl1) list.get(i2)).mo403a(c0868b, gl5Var, o90Var);
            if (qk1VarMo403a != null) {
                arrayList.add(qk1VarMo403a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c0852cm = null;
                break;
            }
            cl1 cl1Var = (cl1) list.get(i);
            if (cl1Var instanceof C0852cm) {
                c0852cm = (C0852cm) cl1Var;
                break;
            }
            i++;
        }
        this(c0868b, o90Var, str, z, arrayList, c0852cm);
    }
}
