package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lot implements lou {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f38849a;

    public lot(int i) {
        this.f38849a = i;
    }

    @Override // p000.lou
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String mo15785a(nyv nyvVar) {
        switch (this.f38849a) {
            case 0:
                return ((oza) ((nxl) nyvVar).f44974b).f46907e;
            case 1:
                return ((pat) ((nxl) nyvVar).f44974b).f47279d;
            default:
                return ((ozu) ((nxl) nyvVar).f44974b).f47086b;
        }
    }

    @Override // p000.lou
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String mo15786b(nyv nyvVar) {
        switch (this.f38849a) {
            case 0:
                return ((oza) ((nxl) nyvVar).f44974b).f46906d;
            case 1:
                return ((pat) ((nxl) nyvVar).f44974b).f47278c;
            default:
                return ((ozu) ((nxl) nyvVar).f44974b).f47088d;
        }
    }

    @Override // p000.lou
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo15788d(nyv nyvVar) {
        switch (this.f38849a) {
            case 0:
                nxl nxlVar = (nxl) nyvVar;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                oza ozaVar = (oza) nxlVar.f44974b;
                oza ozaVar2 = oza.f46901k;
                ozaVar.f46903a &= -5;
                ozaVar.f46906d = oza.f46901k.f46906d;
                break;
            case 1:
                nxl nxlVar2 = (nxl) nyvVar;
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                pat patVar = (pat) nxlVar2.f44974b;
                pat patVar2 = pat.f47274u;
                patVar.f47276a &= -3;
                patVar.f47278c = pat.f47274u.f47278c;
                break;
            default:
                nxl nxlVar3 = (nxl) nyvVar;
                if (!nxlVar3.f44974b.m18142ac()) {
                    nxlVar3.mo18106p();
                }
                ozu ozuVar = (ozu) nxlVar3.f44974b;
                ozu ozuVar2 = ozu.f47083e;
                ozuVar.f47085a &= -5;
                ozuVar.f47088d = ozu.f47083e.f47088d;
                break;
        }
    }

    @Override // p000.lou
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo15787c(nyv nyvVar, Long l) {
        switch (this.f38849a) {
            case 0:
                if (l == null) {
                    nxl nxlVar = (nxl) nyvVar;
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    oza ozaVar = (oza) nxlVar.f44974b;
                    oza ozaVar2 = oza.f46901k;
                    ozaVar.f46903a &= -3;
                    ozaVar.f46905c = 0L;
                } else {
                    long jLongValue = l.longValue();
                    nxl nxlVar2 = (nxl) nyvVar;
                    if (!nxlVar2.f44974b.m18142ac()) {
                        nxlVar2.mo18106p();
                    }
                    oza ozaVar3 = (oza) nxlVar2.f44974b;
                    oza ozaVar4 = oza.f46901k;
                    ozaVar3.f46903a |= 2;
                    ozaVar3.f46905c = jLongValue;
                }
                break;
            case 1:
                if (l == null) {
                    nxl nxlVar3 = (nxl) nyvVar;
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pat patVar = (pat) nxlVar3.f44974b;
                    pat patVar2 = pat.f47274u;
                    patVar.f47276a &= -2;
                    patVar.f47277b = 0L;
                } else {
                    long jLongValue2 = l.longValue();
                    nxl nxlVar4 = (nxl) nyvVar;
                    if (!nxlVar4.f44974b.m18142ac()) {
                        nxlVar4.mo18106p();
                    }
                    pat patVar3 = (pat) nxlVar4.f44974b;
                    pat patVar4 = pat.f47274u;
                    patVar3.f47276a |= 1;
                    patVar3.f47277b = jLongValue2;
                }
                break;
            default:
                if (l != null) {
                    long jLongValue3 = l.longValue();
                    nxl nxlVar5 = (nxl) nyvVar;
                    if (!nxlVar5.f44974b.m18142ac()) {
                        nxlVar5.mo18106p();
                    }
                    ozu ozuVar = (ozu) nxlVar5.f44974b;
                    ozu ozuVar2 = ozu.f47083e;
                    ozuVar.f47085a |= 2;
                    ozuVar.f47087c = jLongValue3;
                } else {
                    nxl nxlVar6 = (nxl) nyvVar;
                    if (!nxlVar6.f44974b.m18142ac()) {
                        nxlVar6.mo18106p();
                    }
                    ozu ozuVar3 = (ozu) nxlVar6.f44974b;
                    ozu ozuVar4 = ozu.f47083e;
                    ozuVar3.f47085a &= -3;
                    ozuVar3.f47087c = 0L;
                }
                break;
        }
    }
}
