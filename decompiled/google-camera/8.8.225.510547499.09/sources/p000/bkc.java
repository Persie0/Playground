package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bkc implements bhk, bhz, bix {

    /* JADX INFO: renamed from: a */
    final Matrix f3566a;

    /* JADX INFO: renamed from: b */
    final bgv f3567b;

    /* JADX INFO: renamed from: c */
    final bkf f3568c;

    /* JADX INFO: renamed from: d */
    public big f3569d;

    /* JADX INFO: renamed from: e */
    public bkc f3570e;

    /* JADX INFO: renamed from: f */
    public bkc f3571f;

    /* JADX INFO: renamed from: g */
    final bir f3572g;

    /* JADX INFO: renamed from: h */
    private final Path f3573h = new Path();

    /* JADX INFO: renamed from: i */
    private final Matrix f3574i = new Matrix();

    /* JADX INFO: renamed from: j */
    private final Paint f3575j = new bhg(1);

    /* JADX INFO: renamed from: k */
    private final Paint f3576k = new bhg(PorterDuff.Mode.DST_IN, null);

    /* JADX INFO: renamed from: l */
    private final Paint f3577l = new bhg(PorterDuff.Mode.DST_OUT, null);

    /* JADX INFO: renamed from: m */
    private final Paint f3578m;

    /* JADX INFO: renamed from: n */
    private final Paint f3579n;

    /* JADX INFO: renamed from: o */
    private final RectF f3580o;

    /* JADX INFO: renamed from: p */
    private final RectF f3581p;

    /* JADX INFO: renamed from: q */
    private final RectF f3582q;

    /* JADX INFO: renamed from: r */
    private final RectF f3583r;

    /* JADX INFO: renamed from: s */
    private List f3584s;

    /* JADX INFO: renamed from: t */
    private final List f3585t;

    /* JADX INFO: renamed from: u */
    private boolean f3586u;

    /* JADX INFO: renamed from: v */
    private C1058va f3587v;

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.List] */
    public bkc(bgv bgvVar, bkf bkfVar) {
        bhg bhgVar = new bhg(1);
        this.f3578m = bhgVar;
        this.f3579n = new bhg(PorterDuff.Mode.CLEAR);
        this.f3580o = new RectF();
        this.f3581p = new RectF();
        this.f3582q = new RectF();
        this.f3583r = new RectF();
        this.f3566a = new Matrix();
        this.f3585t = new ArrayList();
        this.f3586u = true;
        this.f3567b = bgvVar;
        this.f3568c = bkfVar;
        String str = bkfVar.f3599c;
        if (bkfVar.f3617u == 3) {
            bhgVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            bhgVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        bir birVarM2529b = bkfVar.f3604h.m2529b();
        this.f3572g = birVarM2529b;
        birVarM2529b.m2510d(this);
        List list = bkfVar.f3603g;
        if (list != null && !list.isEmpty()) {
            C1058va c1058va = new C1058va(bkfVar.f3603g);
            this.f3587v = c1058va;
            Iterator it = c1058va.f47802a.iterator();
            while (it.hasNext()) {
                ((bie) it.next()).m2494g(this);
            }
            for (bie bieVar : this.f3587v.f47804c) {
                m2534h(bieVar);
                bieVar.m2494g(this);
            }
        }
        if (this.f3568c.f3614r.isEmpty()) {
            m2539m(true);
            return;
        }
        big bigVar = new big(this.f3568c.f3614r);
        this.f3569d = bigVar;
        bigVar.f3406b = true;
        bigVar.m2494g(new bkb(this));
        m2539m(((Float) this.f3569d.mo2492e()).floatValue() == 1.0f);
        m2534h(this.f3569d);
    }

    /* JADX INFO: renamed from: p */
    private final void m2530p() {
        if (this.f3584s != null) {
            return;
        }
        if (this.f3571f == null) {
            this.f3584s = Collections.emptyList();
            return;
        }
        this.f3584s = new ArrayList();
        for (bkc bkcVar = this.f3571f; bkcVar != null; bkcVar = bkcVar.f3571f) {
            this.f3584s.add(bkcVar);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m2531q(Canvas canvas) {
        canvas.drawRect(this.f3580o.left - 1.0f, this.f3580o.top - 1.0f, this.f3580o.right + 1.0f, this.f3580o.bottom + 1.0f, this.f3579n);
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: r */
    private final void m2532r() {
        this.f3567b.invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    private final void m2533s() {
        bzq bzqVar = this.f3567b.f3205a.f3183l;
        String str = this.f3568c.f3599c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f3586u || this.f3568c.f3615s) {
            bgh.m2413a();
            return;
        }
        m2530p();
        this.f3574i.reset();
        this.f3574i.set(matrix);
        for (int size = this.f3584s.size() - 1; size >= 0; size--) {
            this.f3574i.preConcat(((bkc) this.f3584s.get(size)).f3572g.m2507a());
        }
        bgh.m2413a();
        bie bieVar = this.f3572g.f3434e;
        int iIntValue = (int) ((((i / 255.0f) * (bieVar == null ? 100 : ((Integer) bieVar.mo2492e()).intValue())) / 100.0f) * 255.0f);
        if (!m2541o() && !m2540n()) {
            this.f3574i.preConcat(this.f3572g.m2507a());
            mo2535i(canvas, this.f3574i, iIntValue);
            bgh.m2413a();
            bgh.m2413a();
            m2533s();
            return;
        }
        boolean z = false;
        mo2464b(this.f3580o, this.f3574i, false);
        RectF rectF = this.f3580o;
        if (m2541o() && this.f3568c.f3617u != 3) {
            this.f3582q.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f3570e.mo2464b(this.f3582q, matrix, true);
            if (!rectF.intersect(this.f3582q)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.f3574i.preConcat(this.f3572g.m2507a());
        RectF rectF2 = this.f3580o;
        Matrix matrix2 = this.f3574i;
        this.f3581p.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m2540n()) {
            int size2 = this.f3587v.f47803b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    jho jhoVar = (jho) this.f3587v.f47803b.get(i2);
                    this.f3573h.set((Path) ((bie) this.f3587v.f47802a.get(i2)).mo2492e());
                    this.f3573h.transform(matrix2);
                    int i3 = jhoVar.f34085a;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    switch (i4) {
                        case 0:
                        case 2:
                            if (jhoVar.f34086b) {
                            }
                            this.f3573h.computeBounds(this.f3583r, z);
                            if (i2 == 0) {
                                this.f3581p.set(this.f3583r);
                            } else {
                                RectF rectF3 = this.f3581p;
                                rectF3.set(Math.min(rectF3.left, this.f3583r.left), Math.min(this.f3581p.top, this.f3583r.top), Math.max(this.f3581p.right, this.f3583r.right), Math.max(this.f3581p.bottom, this.f3583r.bottom));
                            }
                            i2++;
                            z = false;
                            break;
                        case 1:
                        case 3:
                            break;
                        default:
                            this.f3573h.computeBounds(this.f3583r, z);
                            if (i2 == 0) {
                                this.f3581p.set(this.f3583r);
                            } else {
                                RectF rectF4 = this.f3581p;
                                rectF4.set(Math.min(rectF4.left, this.f3583r.left), Math.min(this.f3581p.top, this.f3583r.top), Math.max(this.f3581p.right, this.f3583r.right), Math.max(this.f3581p.bottom, this.f3583r.bottom));
                            }
                            i2++;
                            z = false;
                            break;
                    }
                } else if (!rectF2.intersect(this.f3581p)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        if (!this.f3580o.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.f3580o.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        bgh.m2413a();
        if (this.f3580o.width() >= 1.0f && this.f3580o.height() >= 1.0f) {
            this.f3575j.setAlpha(255);
            bme.m2706f(canvas, this.f3580o, this.f3575j);
            bgh.m2413a();
            m2531q(canvas);
            mo2535i(canvas, this.f3574i, iIntValue);
            bgh.m2413a();
            if (m2540n()) {
                Matrix matrix3 = this.f3574i;
                bme.m2706f(canvas, this.f3580o, this.f3576k);
                bgh.m2413a();
                int i5 = 0;
                while (i5 < this.f3587v.f47803b.size()) {
                    jho jhoVar2 = (jho) this.f3587v.f47803b.get(i5);
                    bie bieVar2 = (bie) this.f3587v.f47802a.get(i5);
                    bie bieVar3 = (bie) this.f3587v.f47804c.get(i5);
                    int i6 = jhoVar2.f34085a;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    switch (i7) {
                        case 0:
                            if (jhoVar2.f34086b) {
                                bme.m2706f(canvas, this.f3580o, this.f3575j);
                                canvas.drawRect(this.f3580o, this.f3575j);
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                this.f3575j.setAlpha((int) (((Integer) bieVar3.mo2492e()).intValue() * 2.55f));
                                canvas.drawPath(this.f3573h, this.f3577l);
                                canvas.restore();
                            } else {
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                this.f3575j.setAlpha((int) (((Integer) bieVar3.mo2492e()).intValue() * 2.55f));
                                canvas.drawPath(this.f3573h, this.f3575j);
                            }
                            break;
                        case 1:
                            if (i5 == 0) {
                                this.f3575j.setColor(-16777216);
                                this.f3575j.setAlpha(255);
                                canvas.drawRect(this.f3580o, this.f3575j);
                                i5 = 0;
                            }
                            if (jhoVar2.f34086b) {
                                bme.m2706f(canvas, this.f3580o, this.f3577l);
                                canvas.drawRect(this.f3580o, this.f3575j);
                                this.f3577l.setAlpha((int) (((Integer) bieVar3.mo2492e()).intValue() * 2.55f));
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                canvas.drawPath(this.f3573h, this.f3577l);
                                canvas.restore();
                            } else {
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                canvas.drawPath(this.f3573h, this.f3577l);
                            }
                            break;
                        case 2:
                            if (jhoVar2.f34086b) {
                                bme.m2706f(canvas, this.f3580o, this.f3576k);
                                canvas.drawRect(this.f3580o, this.f3575j);
                                this.f3577l.setAlpha((int) (((Integer) bieVar3.mo2492e()).intValue() * 2.55f));
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                canvas.drawPath(this.f3573h, this.f3577l);
                                canvas.restore();
                            } else {
                                bme.m2706f(canvas, this.f3580o, this.f3576k);
                                this.f3573h.set((Path) bieVar2.mo2492e());
                                this.f3573h.transform(matrix3);
                                this.f3575j.setAlpha((int) (((Integer) bieVar3.mo2492e()).intValue() * 2.55f));
                                canvas.drawPath(this.f3573h, this.f3575j);
                                canvas.restore();
                            }
                            break;
                        case 3:
                            if (!this.f3587v.f47802a.isEmpty()) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= this.f3587v.f47803b.size()) {
                                        this.f3575j.setAlpha(255);
                                        canvas.drawRect(this.f3580o, this.f3575j);
                                    } else if (((jho) this.f3587v.f47803b.get(i8)).f34085a == 4) {
                                        i8++;
                                    }
                                }
                            }
                            break;
                    }
                    i5++;
                }
                canvas.restore();
                bgh.m2413a();
            }
            if (m2541o()) {
                bme.m2706f(canvas, this.f3580o, this.f3578m);
                bgh.m2413a();
                m2531q(canvas);
                this.f3570e.mo2463a(canvas, matrix, iIntValue);
                canvas.restore();
                bgh.m2413a();
                bgh.m2413a();
            }
            canvas.restore();
            bgh.m2413a();
        }
        bgh.m2413a();
        m2533s();
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3580o.set(0.0f, 0.0f, 0.0f, 0.0f);
        m2530p();
        this.f3566a.set(matrix);
        if (z) {
            List list = this.f3584s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3566a.preConcat(((bkc) this.f3584s.get(size)).f3572g.m2507a());
                }
            } else {
                bkc bkcVar = this.f3571f;
                if (bkcVar != null) {
                    this.f3566a.preConcat(bkcVar.f3572g.m2507a());
                }
            }
        }
        this.f3566a.preConcat(this.f3572g.m2507a());
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        m2532r();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        bkc bkcVar = this.f3570e;
        if (bkcVar != null) {
            biw biwVarM2517b = biwVar2.m2517b(bkcVar.mo2469g());
            if (biwVar.m2519d(this.f3570e.mo2469g(), i)) {
                list.add(biwVarM2517b.m2518c(this.f3570e));
            }
            if (biwVar.m2521f(mo2469g(), i)) {
                this.f3570e.mo2537k(biwVar, biwVar.m2516a(this.f3570e.mo2469g(), i) + i, list, biwVarM2517b);
            }
        }
        if (biwVar.m2520e(mo2469g(), i)) {
            if (!"__container".equals(mo2469g())) {
                biwVar2 = biwVar2.m2517b(mo2469g());
                if (biwVar.m2519d(mo2469g(), i)) {
                    list.add(biwVar2.m2518c(this));
                }
            }
            if (biwVar.m2521f(mo2469g(), i)) {
                mo2537k(biwVar, i + biwVar.m2516a(mo2469g(), i), list, biwVar2);
            }
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public void mo2468f(Object obj, bko bkoVar) {
        this.f3572g.m2511e(obj, bkoVar);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3568c.f3599c;
    }

    /* JADX INFO: renamed from: h */
    public final void m2534h(bie bieVar) {
        if (bieVar == null) {
            return;
        }
        this.f3585t.add(bieVar);
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo2535i(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: renamed from: j */
    public final void m2536j(bie bieVar) {
        this.f3585t.remove(bieVar);
    }

    /* JADX INFO: renamed from: k */
    public void mo2537k(biw biwVar, int i, List list, biw biwVar2) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public void mo2538l(float f) {
        bir birVar = this.f3572g;
        bie bieVar = birVar.f3434e;
        if (bieVar != null) {
            bieVar.mo2496i(f);
        }
        bie bieVar2 = birVar.f3437h;
        if (bieVar2 != null) {
            bieVar2.mo2496i(f);
        }
        bie bieVar3 = birVar.f3438i;
        if (bieVar3 != null) {
            bieVar3.mo2496i(f);
        }
        bie bieVar4 = birVar.f3430a;
        if (bieVar4 != null) {
            bieVar4.mo2496i(f);
        }
        bie bieVar5 = birVar.f3431b;
        if (bieVar5 != null) {
            bieVar5.mo2496i(f);
        }
        bie bieVar6 = birVar.f3432c;
        if (bieVar6 != null) {
            bieVar6.mo2496i(f);
        }
        bie bieVar7 = birVar.f3433d;
        if (bieVar7 != null) {
            bieVar7.mo2496i(f);
        }
        big bigVar = birVar.f3435f;
        if (bigVar != null) {
            bigVar.mo2496i(f);
        }
        big bigVar2 = birVar.f3436g;
        if (bigVar2 != null) {
            bigVar2.mo2496i(f);
        }
        if (this.f3587v != null) {
            for (int i = 0; i < this.f3587v.f47802a.size(); i++) {
                ((bie) this.f3587v.f47802a.get(i)).mo2496i(f);
            }
        }
        big bigVar3 = this.f3569d;
        if (bigVar3 != null) {
            bigVar3.mo2496i(f);
        }
        bkc bkcVar = this.f3570e;
        if (bkcVar != null) {
            bkcVar.mo2538l(f);
        }
        for (int i2 = 0; i2 < this.f3585t.size(); i2++) {
            ((bie) this.f3585t.get(i2)).mo2496i(f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2539m(boolean z) {
        if (z != this.f3586u) {
            this.f3586u = z;
            m2532r();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: n */
    final boolean m2540n() {
        C1058va c1058va = this.f3587v;
        return (c1058va == null || c1058va.f47802a.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    final boolean m2541o() {
        return this.f3570e != null;
    }
}
