package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhw implements bhs, bhz {

    /* JADX INFO: renamed from: b */
    private final boolean f3382b;

    /* JADX INFO: renamed from: c */
    private final bgv f3383c;

    /* JADX INFO: renamed from: d */
    private final bie f3384d;

    /* JADX INFO: renamed from: e */
    private boolean f3385e;

    /* JADX INFO: renamed from: a */
    private final Path f3381a = new Path();

    /* JADX INFO: renamed from: f */
    private final bkn f3386f = new bkn();

    public bhw(bgv bgvVar, bkc bkcVar, bjy bjyVar) {
        this.f3382b = bjyVar.f3546b;
        this.f3383c = bgvVar;
        bie bieVarMo2524a = bjyVar.f3545a.mo2524a();
        this.f3384d = bieVarMo2524a;
        bkcVar.m2534h(bieVarMo2524a);
        bieVarMo2524a.m2494g(this);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3385e = false;
        this.f3383c.invalidateSelf();
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bhi bhiVar = (bhi) list.get(i);
            if (bhiVar instanceof bhy) {
                bhy bhyVar = (bhy) bhiVar;
                if (bhyVar.f3396e == 1) {
                    this.f3386f.m2583d(bhyVar);
                    bhyVar.m2479a(this);
                }
            }
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        throw null;
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        if (this.f3385e) {
            return this.f3381a;
        }
        this.f3381a.reset();
        if (this.f3382b) {
            this.f3385e = true;
            return this.f3381a;
        }
        this.f3381a.set((Path) this.f3384d.mo2492e());
        this.f3381a.setFillType(Path.FillType.EVEN_ODD);
        this.f3386f.m2584e(this.f3381a);
        this.f3385e = true;
        return this.f3381a;
    }
}
