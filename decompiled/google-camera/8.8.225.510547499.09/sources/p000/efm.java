package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class efm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13834a;

    /* JADX INFO: renamed from: b */
    private final oju f13835b;

    /* JADX INFO: renamed from: c */
    private final oju f13836c;

    /* JADX INFO: renamed from: d */
    private final oju f13837d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f13838e;

    public efm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f13838e = i;
        this.f13834a = ojuVar;
        this.f13835b = ojuVar2;
        this.f13836c = ojuVar3;
        this.f13837d = ojuVar4;
    }

    public efm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f13838e = i;
        this.f13836c = ojuVar;
        this.f13834a = ojuVar2;
        this.f13837d = ojuVar3;
        this.f13835b = ojuVar4;
    }

    public efm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f13838e = i;
        this.f13837d = ojuVar;
        this.f13834a = ojuVar2;
        this.f13836c = ojuVar3;
        this.f13835b = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static efm m7270a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new efm(ojuVar, ojuVar2, ojuVar3, ojuVar4, 0);
    }

    /* JADX INFO: renamed from: b */
    public final jwn m7271b() {
        jwn jwnVarM13637g;
        switch (this.f13838e) {
            case 0:
                boolean zBooleanValue = ((egx) this.f13834a).m7318b().booleanValue();
                oju ojuVar = this.f13835b;
                oju ojuVar2 = this.f13836c;
                dhv dhvVar = (dhv) this.f13837d.get();
                if (!zBooleanValue || ivw.f32429o == null) {
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                } else {
                    String str = dht.f11173a;
                    dhvVar.mo6177e();
                    jwnVarM13637g = fxo.m8932f(ivw.f32429o, jwr.m13640j(jwr.m13632b((jwn) ojuVar.get(), (jwn) ojuVar2.get()), new ddu(9)));
                }
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            case 1:
                dhv dhvVar2 = (dhv) this.f13836c.get();
                jww jwwVar = (jww) this.f13834a.get();
                boolean zBooleanValue2 = ((Boolean) this.f13837d.get()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) this.f13835b.get()).booleanValue();
                dhx dhxVar = dhp.f11144a;
                dhvVar2.mo6177e();
                jwn jwnVarM13640j = jwr.m13640j(jwwVar, new dqx(zBooleanValue2, zBooleanValue3, 3));
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            default:
                jwn jwnVarM13639i = jwr.m13639i((jwn) this.f13837d.get(), jwr.m13640j((jwn) this.f13834a.get(), new dvz(((emc) this.f13836c).get(), ((dws) this.f13835b).m6830a(), 6)));
                jwnVarM13639i.getClass();
                return jwnVarM13639i;
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f13838e) {
            case 0:
                break;
            case 1:
                break;
        }
        return m7271b();
    }
}
