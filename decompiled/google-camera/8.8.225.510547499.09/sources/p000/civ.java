package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class civ {

    /* JADX INFO: renamed from: a */
    public final Executor f5900a;

    /* JADX INFO: renamed from: b */
    public kbz f5901b = new kbx();

    /* JADX INFO: renamed from: c */
    public kbo f5902c = new kbr();

    /* JADX INFO: renamed from: d */
    public khb f5903d;

    /* JADX INFO: renamed from: e */
    private final nqf f5904e;

    /* JADX INFO: renamed from: f */
    private nps f5905f;

    private civ(Executor executor) {
        this.f5900a = executor;
        nqf nqfVarM17621g = nqf.m17621g();
        this.f5904e = nqfVarM17621g;
        this.f5905f = nqfVarM17621g;
    }

    /* JADX INFO: renamed from: a */
    public static civ m3812a(Executor executor) {
        return new civ(executor);
    }

    /* JADX INFO: renamed from: b */
    public final nps m3813b() {
        boolean z = false;
        if (!this.f5904e.isDone() && !this.f5904e.isCancelled()) {
            z = true;
        }
        lku.m15613H(z);
        if (this.f5903d != null || this.f5902c != null) {
            kxk.m14975U(this.f5905f, new ciu(this), not.INSTANCE);
        }
        this.f5904e.mo14894e(true);
        return this.f5905f;
    }

    /* JADX INFO: renamed from: c */
    public final void m3814c(oju ojuVar, String str) {
        this.f5902c.mo13940b(WIxTIdUIdfb.DMyIR.concat(str));
        nps npsVarM17554j = nod.m17554j(this.f5905f, new lqs(this, str, ojuVar, 1), this.f5900a);
        this.f5905f = npsVarM17554j;
        kbo kboVar = this.f5902c;
        if (kboVar != null) {
            dkm.m6315a(kboVar, npsVarM17554j, str.concat(" complete."), str.concat(" failed!"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3815d(oju ojuVar, String str) {
        kxk.m14975U(this.f5905f, new eud(this, str, ojuVar, 1), this.f5900a);
    }
}
