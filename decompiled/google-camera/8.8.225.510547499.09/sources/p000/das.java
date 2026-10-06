package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class das implements kos {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f10309a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10310b;

    public das(cso csoVar, int i) {
        this.f10310b = i;
        this.f10309a = csoVar;
    }

    public das(dav davVar, int i) {
        this.f10310b = i;
        this.f10309a = davVar;
    }

    public /* synthetic */ das(elv elvVar, int i) {
        this.f10310b = i;
        this.f10309a = elvVar;
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        switch (this.f10310b) {
            case 0:
                if (dav.m5843r(kayVar) && ((dav) this.f10309a).f10320a.mo5872c()) {
                    ((dav) this.f10309a).m5848c();
                    return;
                } else {
                    ((dav) this.f10309a).m5853h();
                    return;
                }
            case 1:
                Integer numM5466b = ((cso) this.f10309a).m5466b(kayVar);
                synchronized (((cso) this.f10309a).f9365d) {
                    Object obj = this.f10309a;
                    if (!((cso) obj).f9366e) {
                        ((cso) obj).f9363b.mo3415bf(numM5466b);
                    }
                    ((cso) this.f10309a).f9364c.mo3415bf(kay.m13889b(numM5466b.intValue()));
                    break;
                }
                return;
            default:
                Object obj2 = this.f10309a;
                synchronized (elv.f14672a) {
                    for (elw elwVar : (elw[]) ((elv) obj2).f14675d.toArray(new elw[0])) {
                        if (!elwVar.mo7506o() && !elwVar.equals(((elv) obj2).f14683l)) {
                            ((elv) obj2).mo7485g(elwVar);
                        }
                    }
                    elw elwVar2 = ((elv) obj2).f14683l;
                    if (elwVar2 != null && !elwVar2.mo7506o()) {
                        ((elv) obj2).mo7485g(elwVar2);
                    }
                    break;
                }
                return;
        }
    }
}
