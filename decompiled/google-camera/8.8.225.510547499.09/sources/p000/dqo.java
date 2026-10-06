package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dqo implements drb {

    /* JADX INFO: renamed from: a */
    private final kpw f12344a;

    /* JADX INFO: renamed from: b */
    private final byte[] f12345b;

    /* JADX INFO: renamed from: c */
    private final gzl f12346c;

    public dqo(kpw kpwVar, byte[] bArr, gzl gzlVar) {
        this.f12344a = kpwVar;
        this.f12345b = bArr;
        this.f12346c = gzlVar;
    }

    @Override // p000.drb
    /* JADX INFO: renamed from: a */
    public final kpw mo6597a() {
        return this.f12344a;
    }

    @Override // p000.drb
    /* JADX INFO: renamed from: b */
    public final void mo6598b(hjy hjyVar) {
        if (hjyVar == null || this.f12345b == null) {
            return;
        }
        try {
            nxl nxlVarM18137O = niw.f42814c.m18137O();
            byte[] bArr = this.f12345b;
            nxlVarM18137O.m18109t(bArr, bArr.length, nxf.m18011a());
            int i = this.f12346c.f26939f;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            niw niwVar = (niw) nxlVarM18137O.f44974b;
            niwVar.f42816a |= 4;
            niwVar.f42817b = i;
            ((hjz) hjyVar).f28087m = (niw) nxlVarM18137O.mo18103l();
        } catch (nyb e) {
            ((nbe) ((nbe) ((nbe) dqq.f12348a.m17252c()).mo17283h(e)).mo17276G((char) 1084)).mo17290o("Invalid log buffer");
        }
    }

    @Override // p000.drb
    /* JADX INFO: renamed from: c */
    public final boolean mo6599c() {
        return true;
    }
}
