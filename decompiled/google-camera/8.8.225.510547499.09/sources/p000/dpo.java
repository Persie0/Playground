package p000;

import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dpo extends dpk {

    /* JADX INFO: renamed from: a */
    public final EvCompView f12218a;

    /* JADX INFO: renamed from: b */
    public final oju f12219b;

    /* JADX INFO: renamed from: c */
    public final jww f12220c;

    /* JADX INFO: renamed from: d */
    public final jww f12221d;

    /* JADX INFO: renamed from: e */
    public final jww f12222e;

    /* JADX INFO: renamed from: f */
    public int f12223f;

    /* JADX INFO: renamed from: g */
    public int f12224g;

    /* JADX INFO: renamed from: h */
    public float f12225h;

    /* JADX INFO: renamed from: i */
    public final mrm f12226i;

    /* JADX INFO: renamed from: j */
    public final jww f12227j;

    /* JADX INFO: renamed from: k */
    public final Runnable f12228k = new dgt(this, 14);

    /* JADX INFO: renamed from: l */
    public float f12229l;

    /* JADX INFO: renamed from: m */
    public float f12230m;

    /* JADX INFO: renamed from: n */
    private final jww f12231n;

    /* JADX INFO: renamed from: o */
    private final jww f12232o;

    /* JADX INFO: renamed from: p */
    private final jww f12233p;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jww] */
    public dpo(oju ojuVar, EvCompView evCompView, jww jwwVar, jww jwwVar2, jww jwwVar3, jww jwwVar4, djm djmVar, jww jwwVar5, mrm mrmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12219b = ojuVar;
        this.f12218a = evCompView;
        this.f12222e = jwwVar4;
        this.f12231n = jwwVar;
        this.f12232o = jwwVar2;
        this.f12233p = jwwVar3;
        this.f12220c = djmVar.f11788b;
        this.f12221d = djmVar.f11789c;
        this.f12227j = jwwVar5;
        this.f12226i = mrmVar;
        jwwVar5.mo3415bf(true);
        this.f12229l = -1.0f;
        this.f12230m = -1.0f;
    }

    /* JADX INFO: renamed from: i */
    final void m6551i() {
        this.f12218a.removeCallbacks(this.f12228k);
    }

    /* JADX INFO: renamed from: j */
    public final void m6552j() {
        if (((dot) this.f12222e.mo3831be()).equals(dot.SINGLE)) {
            m6553k();
        } else {
            lku.m15613H(true);
            jww jwwVar = this.f12232o;
            Float fValueOf = Float.valueOf(-1.0f);
            jwwVar.mo3415bf(fValueOf);
            this.f12233p.mo3415bf(fValueOf);
            this.f12229l = -1.0f;
            this.f12230m = -1.0f;
            kxk.m14975U(((glz) ((mrq) this.f12226i).f41482a).mo9462f(), new cmo(this, 9), jvd.f34877a);
        }
        this.f12227j.mo3415bf(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m6553k() {
        this.f12218a.m4109g(0.5f);
        m6555m(0.5f, dow.BRIGHTNESS);
    }

    /* JADX INFO: renamed from: l */
    public final void m6554l() {
        if (((dot) this.f12222e.mo3831be()).equals(dot.SINGLE)) {
            m6553k();
        } else {
            ((glz) ((mrq) this.f12226i).f41482a).mo9463g();
        }
        this.f12227j.mo3415bf(true);
    }

    /* JADX INFO: renamed from: m */
    public final void m6555m(float f, dow dowVar) {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        if (((dot) this.f12222e.mo3831be()) != dot.SINGLE) {
            dow dowVar2 = dow.BRIGHTNESS;
            switch (dowVar) {
                case BRIGHTNESS:
                    this.f12218a.m4110h(f);
                    if (f != ((Float) ((jwf) this.f12232o).f34942d).floatValue()) {
                        this.f12232o.mo3415bf(Float.valueOf(f));
                        if (((Float) ((jwf) this.f12233p).f34942d).floatValue() == -1.0f) {
                            this.f12233p.mo3415bf(Float.valueOf(this.f12230m));
                        }
                        break;
                    }
                    break;
                case SHADOW:
                    this.f12218a.m4112j(f);
                    if (f != ((Float) ((jwf) this.f12233p).f34942d).floatValue()) {
                        this.f12233p.mo3415bf(Float.valueOf(f));
                        if (((Float) ((jwf) this.f12232o).f34942d).floatValue() == -1.0f) {
                            this.f12232o.mo3415bf(Float.valueOf(this.f12229l));
                        }
                        break;
                    }
                    break;
            }
            return;
        }
        lku.m15670x(dowVar.equals(dow.BRIGHTNESS), "Single knob ev slider should have only one control(for brightness).");
        if (((glz) ((mrq) this.f12226i).f41482a).mo9467k()) {
            this.f12218a.m4110h(f);
            if (f != ((Float) ((jwf) this.f12232o).f34942d).floatValue()) {
                this.f12232o.mo3415bf(Float.valueOf(f));
                return;
            }
            return;
        }
        int iRound = Math.round(this.f12224g * f);
        int i = this.f12223f;
        int i2 = iRound + i;
        this.f12218a.m4110h(((this.f12224g * f) + i) * this.f12225h);
        if (i2 != ((Integer) ((jwf) this.f12231n).f34942d).intValue()) {
            this.f12231n.mo3415bf(Integer.valueOf(i2));
        }
    }
}
