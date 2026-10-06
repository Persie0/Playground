package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkd extends bkc {

    /* JADX INFO: renamed from: h */
    private bie f3588h;

    /* JADX INFO: renamed from: i */
    private final List f3589i;

    /* JADX INFO: renamed from: j */
    private final RectF f3590j;

    /* JADX INFO: renamed from: k */
    private final RectF f3591k;

    public bkd(bgv bgvVar, bkf bkfVar, List list, bgm bgmVar) {
        bkc bkcVar;
        bkc bkdVar;
        String str;
        super(bgvVar, bkfVar);
        this.f3589i = new ArrayList();
        this.f3590j = new RectF();
        this.f3591k = new RectF();
        new Paint();
        bjb bjbVar = bkfVar.f3613q;
        if (bjbVar != null) {
            bie bieVarMo2524a = bjbVar.mo2524a();
            this.f3588h = bieVarMo2524a;
            m2534h(bieVarMo2524a);
            this.f3588h.m2494g(this);
        } else {
            this.f3588h = null;
        }
        C1114xc c1114xc = new C1114xc(bgmVar.f3177f.size());
        int size = list.size() - 1;
        bkc bkcVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < c1114xc.m19544b(); i++) {
                    bkc bkcVar3 = (bkc) c1114xc.m19546d(c1114xc.m19545c(i));
                    if (bkcVar3 != null && (bkcVar = (bkc) c1114xc.m19546d(bkcVar3.f3568c.f3601e)) != null) {
                        bkcVar3.f3571f = bkcVar;
                    }
                }
                return;
            }
            bkf bkfVar2 = (bkf) list.get(size);
            int i2 = bkfVar2.f3616t;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                    bkdVar = new bkd(bgvVar, bkfVar2, (List) bgmVar.f3172a.get(bkfVar2.f3602f), bgmVar);
                    break;
                case 1:
                    bkdVar = new bki(bgvVar, bkfVar2);
                    break;
                case 2:
                    bkdVar = new bke(bgvVar, bkfVar2);
                    break;
                case 3:
                    bkdVar = new bkg(bgvVar, bkfVar2);
                    break;
                case 4:
                    bkdVar = new bkh(bgvVar, bkfVar2);
                    break;
                case 5:
                    bkdVar = new bkk(bgvVar, bkfVar2);
                    break;
                default:
                    switch (i2) {
                        case 1:
                            str = "PRE_COMP";
                            break;
                        case 2:
                            str = "SOLID";
                            break;
                        case 3:
                            str = "IMAGE";
                            break;
                        case 4:
                            str = "NULL";
                            break;
                        case 5:
                            str = "SHAPE";
                            break;
                        case 6:
                            str = BcwGDRhrTsnlj.NCYzoinhrLCzJwa;
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    blx.m2680a("Unknown layer type ".concat(str));
                    bkdVar = null;
                    break;
            }
            if (bkdVar != null) {
                c1114xc.m19549g(bkdVar.f3568c.f3600d, bkdVar);
                if (bkcVar2 == null) {
                    this.f3589i.add(0, bkdVar);
                    int i4 = bkfVar2.f3617u;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    switch (i5) {
                        case 1:
                        case 2:
                            bkcVar2 = bkdVar;
                            break;
                    }
                } else {
                    bkcVar2.f3570e = bkdVar;
                    bkcVar2 = null;
                }
            }
            size--;
        }
    }

    @Override // p000.bkc, p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        super.mo2464b(rectF, matrix, z);
        for (int size = this.f3589i.size() - 1; size >= 0; size--) {
            this.f3590j.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((bkc) this.f3589i.get(size)).mo2464b(this.f3590j, this.f3566a, true);
            rectF.union(this.f3590j);
        }
    }

    @Override // p000.bkc, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3231C) {
            bis bisVar = new bis(bkoVar, null);
            this.f3588h = bisVar;
            bisVar.m2494g(this);
            m2534h(this.f3588h);
        }
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: i */
    public final void mo2535i(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f3591k;
        bkf bkfVar = this.f3568c;
        rectF.set(0.0f, 0.0f, bkfVar.f3610n, bkfVar.f3611o);
        matrix.mapRect(this.f3591k);
        canvas.save();
        for (int size = this.f3589i.size() - 1; size >= 0; size--) {
            if (this.f3591k.isEmpty() || canvas.clipRect(this.f3591k)) {
                ((bkc) this.f3589i.get(size)).mo2463a(canvas, matrix, i);
            }
        }
        canvas.restore();
        bgh.m2413a();
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: k */
    public final void mo2537k(biw biwVar, int i, List list, biw biwVar2) {
        for (int i2 = 0; i2 < this.f3589i.size(); i2++) {
            ((bkc) this.f3589i.get(i2)).mo2466d(biwVar, i, list, biwVar2);
        }
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: l */
    public final void mo2538l(float f) {
        super.mo2538l(f);
        if (this.f3588h != null) {
            f = ((((Float) this.f3588h.mo2492e()).floatValue() * this.f3568c.f3598b.f3181j) - this.f3568c.f3598b.f3179h) / (this.f3567b.f3205a.m2416b() + 0.01f);
        }
        if (this.f3588h == null) {
            bkf bkfVar = this.f3568c;
            f -= bkfVar.f3609m / bkfVar.f3598b.m2416b();
        }
        bkf bkfVar2 = this.f3568c;
        if (bkfVar2.f3608l != 0.0f && !"__container".equals(bkfVar2.f3599c)) {
            f /= this.f3568c.f3608l;
        }
        for (int size = this.f3589i.size() - 1; size >= 0; size--) {
            ((bkc) this.f3589i.get(size)).mo2538l(f);
        }
    }
}
