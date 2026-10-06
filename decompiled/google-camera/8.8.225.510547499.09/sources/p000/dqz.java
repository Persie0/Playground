package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12376a;

    /* JADX INFO: renamed from: b */
    private final oju f12377b;

    /* JADX INFO: renamed from: c */
    private final oju f12378c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f12379d;

    public dqz(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f12379d = i;
        this.f12376a = ojuVar;
        this.f12377b = ojuVar2;
        this.f12378c = ojuVar3;
    }

    public dqz(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f12379d = i;
        this.f12376a = ojuVar;
        this.f12378c = ojuVar2;
        this.f12377b = ojuVar3;
    }

    public dqz(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f12379d = i;
        this.f12378c = ojuVar;
        this.f12377b = ojuVar2;
        this.f12376a = ojuVar3;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12379d) {
            case 0:
                break;
            case 1:
                break;
        }
        return m6611a();
    }

    /* JADX INFO: renamed from: a */
    public final jwn m6611a() {
        switch (this.f12379d) {
            case 0:
                jwn jwnVarM13640j = jwr.m13640j(((efm) this.f12376a).m7271b(), new dqx(((Boolean) this.f12377b.get()).booleanValue(), ((Boolean) this.f12378c.get()).booleanValue(), 0));
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 1:
                jwn jwnVarM13637g = !((dhv) this.f12376a.get()).mo6184l(dhg.f11046a) ? jwr.m13637g(false) : jwr.m13640j(jwr.m13632b((jwn) this.f12378c.get(), ((emf) this.f12377b).m7519a()), cgh.f5595k);
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            default:
                fvu fvuVarM8922a = ((fxj) this.f12378c).m8922a();
                jww jwwVar = (jww) this.f12377b.get();
                jww jwwVar2 = (jww) this.f12376a.get();
                if (fvuVarM8922a.mo14558k() == kmq.f36557a) {
                    jwwVar = jwwVar2;
                }
                jwn jwnVarM13640j2 = jwr.m13640j(jwwVar, fod.f22906k);
                jwnVarM13640j2.getClass();
                return jwnVarM13640j2;
        }
    }
}
