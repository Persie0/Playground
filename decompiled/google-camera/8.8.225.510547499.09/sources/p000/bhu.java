package p000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhu implements bhz, bhq, bhs {

    /* JADX INFO: renamed from: c */
    private final String f3363c;

    /* JADX INFO: renamed from: d */
    private final boolean f3364d;

    /* JADX INFO: renamed from: e */
    private final bgv f3365e;

    /* JADX INFO: renamed from: f */
    private final bie f3366f;

    /* JADX INFO: renamed from: g */
    private final bie f3367g;

    /* JADX INFO: renamed from: h */
    private final bie f3368h;

    /* JADX INFO: renamed from: i */
    private boolean f3369i;

    /* JADX INFO: renamed from: a */
    private final Path f3361a = new Path();

    /* JADX INFO: renamed from: b */
    private final RectF f3362b = new RectF();

    /* JADX INFO: renamed from: j */
    private final bkn f3370j = new bkn();

    public bhu(bgv bgvVar, bkc bkcVar, bjt bjtVar) {
        this.f3363c = bjtVar.f3523a;
        this.f3364d = bjtVar.f3527e;
        this.f3365e = bgvVar;
        bie bieVarMo2524a = bjtVar.f3524b.mo2524a();
        this.f3366f = bieVarMo2524a;
        bie bieVarMo2524a2 = bjtVar.f3525c.mo2524a();
        this.f3367g = bieVarMo2524a2;
        bie bieVarMo2524a3 = bjtVar.f3526d.mo2524a();
        this.f3368h = bieVarMo2524a3;
        bkcVar.m2534h(bieVarMo2524a);
        bkcVar.m2534h(bieVarMo2524a2);
        bkcVar.m2534h(bieVarMo2524a3);
        bieVarMo2524a.m2494g(this);
        bieVarMo2524a2.m2494g(this);
        bieVarMo2524a3.m2494g(this);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3369i = false;
        this.f3365e.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bhi bhiVar = (bhi) list.get(i);
            if (bhiVar instanceof bhy) {
                bhy bhyVar = (bhy) bhiVar;
                if (bhyVar.f3396e == 1) {
                    this.f3370j.m2583d(bhyVar);
                    bhyVar.m2479a(this);
                }
            }
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        if (obj == bha.f3246j) {
            bieVar = this.f3367g;
        } else if (obj == bha.f3248l) {
            bieVar = this.f3366f;
        } else if (obj != bha.f3247k) {
            return;
        } else {
            bieVar = this.f3368h;
        }
        bieVar.f3408d = bkoVar;
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3363c;
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        if (this.f3369i) {
            return this.f3361a;
        }
        this.f3361a.reset();
        if (this.f3364d) {
            this.f3369i = true;
            return this.f3361a;
        }
        PointF pointF = (PointF) this.f3367g.mo2492e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float fM2500k = ((big) this.f3368h).m2500k();
        float fMin = Math.min(f, f2);
        if (fM2500k > fMin) {
            fM2500k = fMin;
        }
        PointF pointF2 = (PointF) this.f3366f.mo2492e();
        this.f3361a.moveTo(pointF2.x + f, (pointF2.y - f2) + fM2500k);
        this.f3361a.lineTo(pointF2.x + f, (pointF2.y + f2) - fM2500k);
        if (fM2500k > 0.0f) {
            RectF rectF = this.f3362b;
            float f3 = pointF2.x + f;
            float f4 = fM2500k + fM2500k;
            rectF.set(f3 - f4, (pointF2.y + f2) - f4, pointF2.x + f, pointF2.y + f2);
            this.f3361a.arcTo(this.f3362b, 0.0f, 90.0f, false);
        }
        this.f3361a.lineTo((pointF2.x - f) + fM2500k, pointF2.y + f2);
        if (fM2500k > 0.0f) {
            RectF rectF2 = this.f3362b;
            float f5 = pointF2.x - f;
            float f6 = pointF2.y + f2;
            float f7 = fM2500k + fM2500k;
            rectF2.set(f5, f6 - f7, (pointF2.x - f) + f7, pointF2.y + f2);
            this.f3361a.arcTo(this.f3362b, 90.0f, 90.0f, false);
        }
        this.f3361a.lineTo(pointF2.x - f, (pointF2.y - f2) + fM2500k);
        if (fM2500k > 0.0f) {
            float f8 = fM2500k + fM2500k;
            this.f3362b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f8, (pointF2.y - f2) + f8);
            this.f3361a.arcTo(this.f3362b, 180.0f, 90.0f, false);
        }
        this.f3361a.lineTo((pointF2.x + f) - fM2500k, pointF2.y - f2);
        if (fM2500k > 0.0f) {
            float f9 = fM2500k + fM2500k;
            this.f3362b.set((pointF2.x + f) - f9, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f9);
            this.f3361a.arcTo(this.f3362b, 270.0f, 90.0f, false);
        }
        this.f3361a.close();
        this.f3370j.m2584e(this.f3361a);
        this.f3369i = true;
        return this.f3361a;
    }
}
