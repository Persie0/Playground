package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkp extends gku {

    /* JADX INFO: renamed from: a */
    private final gks f25334a;

    /* JADX INFO: renamed from: b */
    private final kbz f25335b;

    /* JADX INFO: renamed from: c */
    private final mrm f25336c;

    public gkp(gof gofVar, gks gksVar, kbz kbzVar, gir girVar, mrm mrmVar, Set set, gbi gbiVar) {
        super(gofVar, gbiVar, set, kbzVar, girVar);
        this.f25334a = gksVar;
        this.f25335b = kbzVar;
        this.f25336c = mrmVar;
    }

    @Override // p000.gku, p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        this.f25335b.mo13961e("pckHdrZsl#captureImage");
        super.mo7628c(gbhVar, glkVar);
        this.f25335b.mo13962f();
    }

    @Override // p000.gku
    /* JADX INFO: renamed from: d */
    protected final boolean mo9370d(List list, gbh gbhVar, glk glkVar) throws dom, dod {
        this.f25335b.mo13961e("pckHdrZsl#process");
        this.f25334a.m9382h(list, gbhVar, glkVar, ((Integer) this.f25336c.mo16808b(new dvz(list, glkVar, 4, null, null)).mo16811e(-1)).intValue());
        this.f25335b.mo13962f();
        return true;
    }
}
