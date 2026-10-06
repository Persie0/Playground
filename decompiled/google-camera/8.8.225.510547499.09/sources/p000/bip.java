package p000;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bip extends bie {

    /* JADX INFO: renamed from: e */
    protected bko f3424e;

    /* JADX INFO: renamed from: f */
    protected bko f3425f;

    /* JADX INFO: renamed from: g */
    private final PointF f3426g;

    /* JADX INFO: renamed from: h */
    private final PointF f3427h;

    /* JADX INFO: renamed from: i */
    private final bie f3428i;

    /* JADX INFO: renamed from: j */
    private final bie f3429j;

    public bip(bie bieVar, bie bieVar2) {
        super(Collections.emptyList());
        this.f3426g = new PointF();
        this.f3427h = new PointF();
        this.f3428i = bieVar;
        this.f3429j = bieVar2;
        mo2496i(this.f3407c);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        return mo2492e();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: i */
    public final void mo2496i(float f) {
        this.f3428i.mo2496i(f);
        this.f3429j.mo2496i(f);
        this.f3426g.set(((Float) this.f3428i.mo2492e()).floatValue(), ((Float) this.f3429j.mo2492e()).floatValue());
        for (int i = 0; i < this.f3405a.size(); i++) {
            ((bhz) this.f3405a.get(i)).mo2465c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.bie
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF mo2492e() {
        Float f;
        bmf bmfVarM2491d;
        bmf bmfVarM2491d2;
        Float f2 = null;
        if (this.f3424e == null || (bmfVarM2491d2 = this.f3428i.m2491d()) == null) {
            f = null;
        } else {
            this.f3428i.m2489b();
            Float f3 = bmfVarM2491d2.f3765h;
            bko bkoVar = this.f3424e;
            if (f3 != null) {
                f3.floatValue();
            }
            f = (Float) bkoVar.f3652a;
        }
        if (this.f3425f != null && (bmfVarM2491d = this.f3429j.m2491d()) != null) {
            this.f3429j.m2489b();
            Float f4 = bmfVarM2491d.f3765h;
            bko bkoVar2 = this.f3425f;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) bkoVar2.f3652a;
        }
        if (f == null) {
            this.f3427h.set(this.f3426g.x, 0.0f);
        } else {
            this.f3427h.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            PointF pointF = this.f3427h;
            pointF.set(pointF.x, this.f3426g.y);
        } else {
            PointF pointF2 = this.f3427h;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.f3427h;
    }
}
