package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhv implements bhk, bhs, bhp, bhz, bhq {

    /* JADX INFO: renamed from: a */
    private final Matrix f3371a = new Matrix();

    /* JADX INFO: renamed from: b */
    private final Path f3372b = new Path();

    /* JADX INFO: renamed from: c */
    private final bgv f3373c;

    /* JADX INFO: renamed from: d */
    private final bkc f3374d;

    /* JADX INFO: renamed from: e */
    private final String f3375e;

    /* JADX INFO: renamed from: f */
    private final boolean f3376f;

    /* JADX INFO: renamed from: g */
    private final bie f3377g;

    /* JADX INFO: renamed from: h */
    private final bie f3378h;

    /* JADX INFO: renamed from: i */
    private final bir f3379i;

    /* JADX INFO: renamed from: j */
    private bhj f3380j;

    public bhv(bgv bgvVar, bkc bkcVar, bju bjuVar) {
        this.f3373c = bgvVar;
        this.f3374d = bkcVar;
        this.f3375e = bjuVar.f3528a;
        this.f3376f = bjuVar.f3532e;
        bie bieVarMo2524a = bjuVar.f3529b.mo2524a();
        this.f3377g = bieVarMo2524a;
        bkcVar.m2534h(bieVarMo2524a);
        bieVarMo2524a.m2494g(this);
        bie bieVarMo2524a2 = bjuVar.f3530c.mo2524a();
        this.f3378h = bieVarMo2524a2;
        bkcVar.m2534h(bieVarMo2524a2);
        bieVarMo2524a2.m2494g(this);
        bir birVarM2529b = bjuVar.f3531d.m2529b();
        this.f3379i = birVarM2529b;
        birVarM2529b.m2509c(bkcVar);
        birVarM2529b.m2510d(this);
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.f3377g.mo2492e()).floatValue();
        float fFloatValue2 = ((Float) this.f3378h.mo2492e()).floatValue();
        float fFloatValue3 = ((Float) this.f3379i.f3437h.mo2492e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f3379i.f3438i.mo2492e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f3371a.set(matrix);
            float f = i2;
            this.f3371a.preConcat(this.f3379i.m2508b(f + fFloatValue2));
            PointF pointF = blz.f3737a;
            this.f3380j.mo2463a(canvas, this.f3371a, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3380j.mo2464b(rectF, matrix, z);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3373c.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        this.f3380j.mo2467e(list, list2);
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        if (this.f3379i.m2511e(obj, bkoVar)) {
            return;
        }
        if (obj == bha.f3255s) {
            bieVar = this.f3377g;
        } else if (obj != bha.f3256t) {
            return;
        } else {
            bieVar = this.f3378h;
        }
        bieVar.f3408d = bkoVar;
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3375e;
    }

    @Override // p000.bhp
    /* JADX INFO: renamed from: h */
    public final void mo2477h(ListIterator listIterator) {
        if (this.f3380j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((bhi) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f3380j = new bhj(this.f3373c, this.f3374d, "Repeater", this.f3376f, arrayList, null);
        }
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        Path pathMo2471i = this.f3380j.mo2471i();
        this.f3372b.reset();
        float fFloatValue = ((Float) this.f3377g.mo2492e()).floatValue();
        float fFloatValue2 = ((Float) this.f3378h.mo2492e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f3371a.set(this.f3379i.m2508b(i + fFloatValue2));
            this.f3372b.addPath(pathMo2471i, this.f3371a);
        }
        return this.f3372b;
    }
}
