package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhm implements bhk, bhz, bhq {

    /* JADX INFO: renamed from: a */
    private final Path f3303a;

    /* JADX INFO: renamed from: b */
    private final Paint f3304b;

    /* JADX INFO: renamed from: c */
    private final bkc f3305c;

    /* JADX INFO: renamed from: d */
    private final String f3306d;

    /* JADX INFO: renamed from: e */
    private final boolean f3307e;

    /* JADX INFO: renamed from: f */
    private final List f3308f;

    /* JADX INFO: renamed from: g */
    private final bie f3309g;

    /* JADX INFO: renamed from: h */
    private final bie f3310h;

    /* JADX INFO: renamed from: i */
    private bie f3311i;

    /* JADX INFO: renamed from: j */
    private final bgv f3312j;

    public bhm(bgv bgvVar, bkc bkcVar, bjw bjwVar) {
        Path path = new Path();
        this.f3303a = path;
        this.f3304b = new bhg(1);
        this.f3308f = new ArrayList();
        this.f3305c = bkcVar;
        this.f3306d = bjwVar.f3537b;
        this.f3307e = bjwVar.f3540e;
        this.f3312j = bgvVar;
        if (bjwVar.f3538c == null) {
            this.f3309g = null;
            this.f3310h = null;
            return;
        }
        path.setFillType(bjwVar.f3536a);
        bie bieVarMo2524a = bjwVar.f3538c.mo2524a();
        this.f3309g = bieVarMo2524a;
        bieVarMo2524a.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a);
        bie bieVarMo2524a2 = bjwVar.f3539d.mo2524a();
        this.f3310h = bieVarMo2524a2;
        bieVarMo2524a2.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a2);
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        if (this.f3307e) {
            return;
        }
        this.f3304b.setColor(((bif) this.f3309g).m2498k());
        this.f3304b.setAlpha(blz.m2697e((int) ((((i / 255.0f) * ((Integer) this.f3310h.mo2492e()).intValue()) / 100.0f) * 255.0f)));
        bie bieVar = this.f3311i;
        if (bieVar != null) {
            this.f3304b.setColorFilter((ColorFilter) bieVar.mo2492e());
        }
        this.f3303a.reset();
        for (int i2 = 0; i2 < this.f3308f.size(); i2++) {
            this.f3303a.addPath(((bhs) this.f3308f.get(i2)).mo2471i(), matrix);
        }
        canvas.drawPath(this.f3303a, this.f3304b);
        bgh.m2413a();
    }

    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3303a.reset();
        for (int i = 0; i < this.f3308f.size(); i++) {
            this.f3303a.addPath(((bhs) this.f3308f.get(i)).mo2471i(), matrix);
        }
        this.f3303a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3312j.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            bhi bhiVar = (bhi) list2.get(i);
            if (bhiVar instanceof bhs) {
                this.f3308f.add((bhs) bhiVar);
            }
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        if (obj == bha.f3237a) {
            bieVar = this.f3309g;
        } else {
            if (obj != bha.f3240d) {
                if (obj == bha.f3233E) {
                    bie bieVar2 = this.f3311i;
                    if (bieVar2 != null) {
                        this.f3305c.m2536j(bieVar2);
                    }
                    bis bisVar = new bis(bkoVar, null);
                    this.f3311i = bisVar;
                    bisVar.m2494g(this);
                    this.f3305c.m2534h(this.f3311i);
                    return;
                }
                return;
            }
            bieVar = this.f3310h;
        }
        bieVar.f3408d = bkoVar;
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3306d;
    }
}
