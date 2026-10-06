package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdk implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24318a;

    /* JADX INFO: renamed from: b */
    private final oju f24319b;

    /* JADX INFO: renamed from: c */
    private final oju f24320c;

    /* JADX INFO: renamed from: d */
    private final oju f24321d;

    /* JADX INFO: renamed from: e */
    private final oju f24322e;

    /* JADX INFO: renamed from: f */
    private final oju f24323f;

    public gdk(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        this.f24318a = ojuVar;
        this.f24319b = ojuVar2;
        this.f24320c = ojuVar3;
        this.f24321d = ojuVar4;
        this.f24322e = ojuVar5;
        this.f24323f = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static gdk m9077a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gdk(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final msi get() {
        boolean z;
        dhv dhvVar = (dhv) this.f24318a.get();
        hnw hnwVar = (hnw) this.f24319b.get();
        ikw ikwVarM11415a = ((ikv) this.f24320c).m11415a();
        hnv hnvVarM10532a = ((hog) this.f24321d).m10532a();
        jvb jvbVar = (jvb) this.f24322e.get();
        final eby ebyVar = (eby) this.f24323f.get();
        final int iIntValue = ((Integer) dhvVar.mo6173a(dil.f11620f).get()).intValue();
        ikw ikwVar = ikw.LONG_EXPOSURE;
        if (ikwVarM11415a == ikw.PHOTO && dhvVar.mo6184l(did.f11424ac)) {
            z = true;
        } else {
            z = ikwVarM11415a == ikw.PORTRAIT && dhvVar.mo6184l(did.f11425ad);
        }
        final boolean z2 = ikwVarM11415a == ikwVar;
        if (!z2 && !z) {
            return lku.m15664r(Integer.valueOf(iIntValue));
        }
        int iIntValue2 = ((Integer) dhvVar.mo6173a(dil.f11621g).get()).intValue();
        int iIntValue3 = ((Integer) dhvVar.mo6173a(dil.f11622h).get()).intValue();
        final jwf jwfVar = new jwf(Integer.valueOf(iIntValue2));
        fvi fviVar = new fvi(jwfVar, 3);
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10525d("SmartMeteringExtendedPeriod");
        hnyVarM10529a.m10524c(not.INSTANCE);
        hnyVarM10529a.m10528g(hnvVarM10532a);
        hnyVarM10529a.m10527f(new gdi(fviVar, iIntValue2, 1));
        hnyVarM10529a.m10526e(new gdi(fviVar, iIntValue3, 0));
        jvbVar.m13537d(hnwVar.mo10519f(hnyVarM10529a.m10522a()));
        return new msi() { // from class: gdj
            @Override // p000.msi
            /* JADX INFO: renamed from: a */
            public final Object mo6051a() {
                boolean z3 = z2;
                eby ebyVar2 = ebyVar;
                jwf jwfVar2 = jwfVar;
                int iIntValue4 = iIntValue;
                if (z3 || ((Boolean) ebyVar2.f13316b.mo3831be()).booleanValue()) {
                    iIntValue4 = ((Integer) jwfVar2.f34942d).intValue();
                }
                return Integer.valueOf(iIntValue4);
            }
        };
    }
}
