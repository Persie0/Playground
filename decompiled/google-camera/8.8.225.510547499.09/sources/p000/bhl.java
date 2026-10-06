package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhl implements bhs, bhz, bhq {

    /* JADX INFO: renamed from: b */
    private final String f3296b;

    /* JADX INFO: renamed from: c */
    private final bgv f3297c;

    /* JADX INFO: renamed from: d */
    private final bie f3298d;

    /* JADX INFO: renamed from: e */
    private final bie f3299e;

    /* JADX INFO: renamed from: f */
    private final bjn f3300f;

    /* JADX INFO: renamed from: g */
    private boolean f3301g;

    /* JADX INFO: renamed from: a */
    private final Path f3295a = new Path();

    /* JADX INFO: renamed from: h */
    private final bkn f3302h = new bkn();

    public bhl(bgv bgvVar, bkc bkcVar, bjn bjnVar) {
        this.f3296b = bjnVar.f3485a;
        this.f3297c = bgvVar;
        bie bieVarMo2524a = bjnVar.f3487c.mo2524a();
        this.f3298d = bieVarMo2524a;
        bie bieVarMo2524a2 = bjnVar.f3486b.mo2524a();
        this.f3299e = bieVarMo2524a2;
        this.f3300f = bjnVar;
        bkcVar.m2534h(bieVarMo2524a);
        bkcVar.m2534h(bieVarMo2524a2);
        bieVarMo2524a.m2494g(this);
        bieVarMo2524a2.m2494g(this);
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3301g = false;
        this.f3297c.invalidateSelf();
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
                    this.f3302h.m2583d(bhyVar);
                    bhyVar.m2479a(this);
                }
            }
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        if (obj == bha.f3245i) {
            bieVar = this.f3298d;
        } else if (obj != bha.f3248l) {
            return;
        } else {
            bieVar = this.f3299e;
        }
        bieVar.f3408d = bkoVar;
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3296b;
    }

    @Override // p000.bhs
    /* JADX INFO: renamed from: i */
    public final Path mo2471i() {
        if (this.f3301g) {
            return this.f3295a;
        }
        this.f3295a.reset();
        if (this.f3300f.f3489e) {
            this.f3301g = true;
            return this.f3295a;
        }
        PointF pointF = (PointF) this.f3298d.mo2492e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        this.f3295a.reset();
        float f3 = f2 * 0.55228f;
        float f4 = f * 0.55228f;
        if (this.f3300f.f3488d) {
            float f5 = -f2;
            this.f3295a.moveTo(0.0f, f5);
            float f6 = -f4;
            float f7 = -f;
            float f8 = -f3;
            this.f3295a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f3 + 0.0f;
            this.f3295a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f4 + 0.0f;
            this.f3295a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f3295a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f3295a.moveTo(0.0f, f11);
            float f12 = f4 + 0.0f;
            float f13 = -f3;
            this.f3295a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f3 + 0.0f;
            this.f3295a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = -f4;
            float f16 = -f;
            this.f3295a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f3295a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f3299e.mo2492e();
        this.f3295a.offset(pointF2.x, pointF2.y);
        this.f3295a.close();
        this.f3302h.m2584e(this.f3295a);
        this.f3301g = true;
        return this.f3295a;
    }
}
