package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.io.IOException;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eok {

    /* JADX INFO: renamed from: d */
    private static final nbh f14874d = nbh.m17259h(hiCTUJiAxf.zdCUudg);

    /* JADX INFO: renamed from: a */
    public final gyj f14875a;

    /* JADX INFO: renamed from: b */
    public final gyn f14876b;

    /* JADX INFO: renamed from: c */
    public final hjy f14877c;

    /* JADX INFO: renamed from: e */
    private final dzr f14878e;

    /* JADX INFO: renamed from: f */
    private boolean f14879f = false;

    public eok(kqj kqjVar, dzr dzrVar, hjy hjyVar, byte[] bArr, byte[] bArr2) {
        nnf nnfVar = nnf.INSTANCE;
        gyn gynVarM14706h = kqjVar.m14706h(Instant.now().toEpochMilli());
        this.f14876b = gynVarM14706h;
        this.f14875a = gynVarM14706h.m9981a(krd.MPEG4.f37022j);
        this.f14878e = dzrVar;
        this.f14877c = hjyVar;
        nbz nbzVar = nch.f41987a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7595a(kqc kqcVar) {
        if (!this.f14879f) {
            try {
                this.f14878e.mo6974c(kqcVar, dzk.NIGHT);
                ((hjz) this.f14877c).f28094t = true;
                this.f14879f = true;
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) f14874d.m17251b().mo17282g(nch.f41987a, "VideoKeplerSession")).mo17283h(e)).mo17276G((char) 1683)).mo17290o("Error adding badge to output file.");
            }
        }
    }
}
