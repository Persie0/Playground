package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhx extends bhh {

    /* JADX INFO: renamed from: c */
    private final bkc f3387c;

    /* JADX INFO: renamed from: d */
    private final String f3388d;

    /* JADX INFO: renamed from: e */
    private final boolean f3389e;

    /* JADX INFO: renamed from: f */
    private final bie f3390f;

    /* JADX INFO: renamed from: g */
    private bie f3391g;

    public bhx(bgv bgvVar, bkc bkcVar, bjz bjzVar) {
        super(bgvVar, bkcVar, bzq.m3249V(bjzVar.f3557i), bzq.m3247T(bjzVar.f3558j), bjzVar.f3555g, bjzVar.f3553e, bjzVar.f3554f, bjzVar.f3551c, bjzVar.f3550b);
        this.f3387c = bkcVar;
        this.f3388d = bjzVar.f3549a;
        this.f3389e = bjzVar.f3556h;
        bie bieVarMo2524a = bjzVar.f3552d.mo2524a();
        this.f3390f = bieVarMo2524a;
        bieVarMo2524a.m2494g(this);
        bkcVar.m2534h(bieVarMo2524a);
    }

    @Override // p000.bhh, p000.bhk
    /* JADX INFO: renamed from: a */
    public final void mo2463a(Canvas canvas, Matrix matrix, int i) {
        if (this.f3389e) {
            return;
        }
        this.f3273b.setColor(((bif) this.f3390f).m2498k());
        bie bieVar = this.f3391g;
        if (bieVar != null) {
            this.f3273b.setColorFilter((ColorFilter) bieVar.mo2492e());
        }
        super.mo2463a(canvas, matrix, i);
    }

    @Override // p000.bhh, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3238b) {
            this.f3390f.f3408d = bkoVar;
            return;
        }
        if (obj == bha.f3233E) {
            bie bieVar = this.f3391g;
            if (bieVar != null) {
                this.f3387c.m2536j(bieVar);
            }
            bis bisVar = new bis(bkoVar, null);
            this.f3391g = bisVar;
            bisVar.m2494g(this);
            this.f3387c.m2534h(this.f3390f);
        }
    }

    @Override // p000.bhi
    /* JADX INFO: renamed from: g */
    public final String mo2469g() {
        return this.f3388d;
    }
}
