package p000;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyb implements fzt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fyc f23859a;

    /* JADX INFO: renamed from: b */
    private final cem f23860b;

    /* JADX INFO: renamed from: c */
    private final gyh f23861c;

    /* JADX INFO: renamed from: d */
    private final grn f23862d;

    /* JADX INFO: renamed from: e */
    private int f23863e = 0;

    /* JADX INFO: renamed from: f */
    private kay f23864f;

    /* JADX INFO: renamed from: g */
    private final fya f23865g;

    /* JADX INFO: renamed from: h */
    private final gro f23866h;

    /* JADX WARN: Type inference failed for: r8v1, types: [gyh, java.lang.Object] */
    public fyb(fyc fycVar, glk glkVar, fzt fztVar, cem cemVar, gro groVar, byte[] bArr, byte[] bArr2) {
        nqf nqfVar;
        this.f23859a = fycVar;
        this.f23860b = cemVar;
        ?? r8 = glkVar.f25502c;
        this.f23861c = r8;
        this.f23866h = groVar;
        fya fyaVar = new fya(this, fztVar);
        this.f23865g = fyaVar;
        grc grcVar = fycVar.f23869c;
        Executor executor = fycVar.f23870d;
        mrm mrmVarM16829i = mrm.m16829i(fyaVar);
        kbz kbzVar = fycVar.f23868b;
        Long.toString(SystemClock.elapsedRealtime());
        fct fctVar = new fct();
        hrl hrlVar = new hrl(grcVar, executor, groVar, fctVar, kbzVar);
        grn grnVar = new grn(grcVar, hrlVar, mrmVarM16829i, fctVar, null);
        hrlVar.f29320f = grnVar;
        this.f23862d = grnVar;
        grnVar.f26165f.f21285d = SystemClock.elapsedRealtimeNanos();
        synchronized (grnVar.f26131c) {
            lku.m15613H(grnVar.f26132d == 1);
            grnVar.f26129a.set(1);
            grnVar.f26132d = 2;
            nqfVar = grnVar.f26130b;
        }
        kxk.m14975U(nqfVar, new eog(grnVar, (gyh) r8, 8), not.INSTANCE);
        hjy hjyVarMo9905k = r8.mo9905k();
        hjyVarMo9905k.getClass();
        ((hjz) hjyVarMo9905k).f28075a = SystemClock.elapsedRealtime();
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        this.f23863e++;
        this.f23864f = kay.m13889b(((Integer) this.f23860b.m3565c().mo3831be()).intValue());
        grl grlVarM9671a = grm.m9671a(kpwVar);
        grlVarM9671a.f26146d = npsVar;
        kay kayVar = this.f23864f;
        if (kayVar == null) {
            kayVar = kay.CLOCKWISE_0;
        }
        grlVarM9671a.f26145c = kayVar;
        grlVarM9671a.f26147e = this.f23859a.f23871e;
        this.f23862d.m9667b(grlVarM9671a.m9669a(), this.f23861c);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23862d.close();
        if (this.f23863e == 0) {
            this.f23861c.mo9917w(new dos("LuckyShotReprocessingImageSaver closed without processing any Images."));
        }
    }
}
