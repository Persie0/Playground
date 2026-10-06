package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhj implements bhk, bhs, bhz, bix {

    /* JADX INFO: renamed from: a */
    private final Matrix f3286a;

    /* JADX INFO: renamed from: b */
    private final Path f3287b;

    /* JADX INFO: renamed from: c */
    private final RectF f3288c;

    /* JADX INFO: renamed from: d */
    private final String f3289d;

    /* JADX INFO: renamed from: e */
    private final boolean f3290e;

    /* JADX INFO: renamed from: f */
    private final List f3291f;

    /* JADX INFO: renamed from: g */
    private final bgv f3292g;

    /* JADX INFO: renamed from: h */
    private List f3293h;

    /* JADX INFO: renamed from: i */
    private bir f3294i;

    public bhj(bgv bgvVar, bkc bkcVar, bjx bjxVar) {
        bjk bjkVar;
        String str = bjxVar.f3542a;
        boolean z = bjxVar.f3544c;
        List list = bjxVar.f3543b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            bhi bhiVarMo2528a = ((bjo) list.get(i)).mo2528a(bgvVar, bkcVar);
            if (bhiVarMo2528a != null) {
                arrayList.add(bhiVarMo2528a);
            }
        }
        List list2 = bjxVar.f3543b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            bjo bjoVar = (bjo) list2.get(i2);
            if (bjoVar instanceof bjk) {
                bjkVar = (bjk) bjoVar;
                this(bgvVar, bkcVar, str, z, arrayList, bjkVar);
            }
        }
        bjkVar = null;
        this(bgvVar, bkcVar, str, z, arrayList, bjkVar);
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        if (this.f3290e) {
            return;
        }
        this.f3286a.set(matrix);
        bir birVar = this.f3294i;
        if (birVar != null) {
            this.f3286a.preConcat(birVar.m2507a());
            bie bieVar = this.f3294i.f3434e;
            i = (int) (((((bieVar == null ? 100 : ((Integer) bieVar.mo2492e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.f3291f.size() - 1; size >= 0; size--) {
            Object obj = this.f3291f.get(size);
            if (obj instanceof bhk) {
                ((bhk) obj).mo2463a(canvas, this.f3286a, i);
            }
        }
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3286a.set(matrix);
        bir birVar = this.f3294i;
        if (birVar != null) {
            this.f3286a.preConcat(birVar.m2507a());
        }
        this.f3288c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f3291f.size() - 1; size >= 0; size--) {
            bhi bhiVar = (bhi) this.f3291f.get(size);
            if (bhiVar instanceof bhk) {
                ((bhk) bhiVar).mo2464b(this.f3288c, this.f3286a, z);
                rectF.union(this.f3288c);
            }
        }
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3292g.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        if (biwVar.m2520e(this.f3289d, i) || "__container".equals(this.f3289d)) {
            if (!"__container".equals(this.f3289d)) {
                biwVar2 = biwVar2.m2517b(this.f3289d);
                if (biwVar.m2519d(this.f3289d, i)) {
                    list.add(biwVar2.m2518c(this));
                }
            }
            if (biwVar.m2521f(this.f3289d, i)) {
                int iM2516a = i + biwVar.m2516a(this.f3289d, i);
                for (int i2 = 0; i2 < this.f3291f.size(); i2++) {
                    bhi bhiVar = (bhi) this.f3291f.get(i2);
                    if (bhiVar instanceof bix) {
                        ((bix) bhiVar).mo2466d(biwVar, iM2516a, list, biwVar2);
                    }
                }
            }
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f3291f.size());
        arrayList.addAll(list);
        for (int size = this.f3291f.size() - 1; size >= 0; size--) {
            bhi bhiVar = (bhi) this.f3291f.get(size);
            bhiVar.mo2467e(arrayList, this.f3291f.subList(0, size));
            arrayList.add(bhiVar);
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bir birVar = this.f3294i;
        if (birVar != null) {
            birVar.m2511e(obj, bkoVar);
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    final Matrix m2470h() {
        bir birVar = this.f3294i;
        if (birVar != null) {
            return birVar.m2507a();
        }
        this.f3286a.reset();
        return this.f3286a;
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        this.f3286a.reset();
        bir birVar = this.f3294i;
        if (birVar != null) {
            this.f3286a.set(birVar.m2507a());
        }
        this.f3287b.reset();
        if (this.f3290e) {
            return this.f3287b;
        }
        for (int size = this.f3291f.size() - 1; size >= 0; size--) {
            bhi bhiVar = (bhi) this.f3291f.get(size);
            if (bhiVar instanceof bhs) {
                this.f3287b.addPath(((bhs) bhiVar).mo2471i(), this.f3286a);
            }
        }
        return this.f3287b;
    }

    /* JADX INFO: renamed from: j */
    final List m2472j() {
        if (this.f3293h == null) {
            this.f3293h = new ArrayList();
            for (int i = 0; i < this.f3291f.size(); i++) {
                bhi bhiVar = (bhi) this.f3291f.get(i);
                if (bhiVar instanceof bhs) {
                    this.f3293h.add((bhs) bhiVar);
                }
            }
        }
        return this.f3293h;
    }

    public bhj(bgv bgvVar, bkc bkcVar, String str, boolean z, List list, bjk bjkVar) {
        new bhg();
        new RectF();
        this.f3286a = new Matrix();
        this.f3287b = new Path();
        this.f3288c = new RectF();
        this.f3289d = str;
        this.f3292g = bgvVar;
        this.f3290e = z;
        this.f3291f = list;
        if (bjkVar != null) {
            bir birVarM2529b = bjkVar.m2529b();
            this.f3294i = birVarM2529b;
            birVarM2529b.m2509c(bkcVar);
            this.f3294i.m2510d(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            bhi bhiVar = (bhi) list.get(size);
            if (bhiVar instanceof bhp) {
                arrayList.add((bhp) bhiVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((bhp) arrayList.get(size2)).mo2477h(list.listIterator(list.size()));
        }
    }
}
