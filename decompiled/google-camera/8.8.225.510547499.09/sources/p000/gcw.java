package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24244a;

    /* JADX INFO: renamed from: b */
    private final oju f24245b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24246c;

    public gcw(oju ojuVar, oju ojuVar2, int i) {
        this.f24246c = i;
        this.f24244a = ojuVar;
        this.f24245b = ojuVar2;
    }

    public gcw(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f24246c = i;
        this.f24245b = ojuVar;
        this.f24244a = ojuVar2;
    }

    public gcw(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f24246c = i;
        this.f24245b = ojuVar;
        this.f24244a = ojuVar2;
    }

    public gcw(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f24246c = i;
        this.f24245b = ojuVar;
        this.f24244a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public final jwn m9065a() {
        switch (this.f24246c) {
            case 0:
                return ((dhv) this.f24245b.get()).mo6184l(dil.f11623i) ? jwr.m13637g(kmp.EXTENDED) : jwr.m13637g(((fxj) this.f24244a).m8922a().mo14557j());
            case 1:
                dhv dhvVar = (dhv) this.f24244a.get();
                hah hahVar = (hah) this.f24245b.get();
                gdb gdbVar = gcv.f24243a;
                return dhvVar.mo6184l(did.f11438aq) ? hahVar.mo10029a(gzy.f27067z) : jwr.m13637g(false);
            case 2:
                hai haiVar = (hai) this.f24245b.get();
                return new gda(haiVar.mo10030b(gzy.f27060s), haiVar.mo10030b(gzy.f27061t), ((fxj) this.f24244a).m8922a(), gcy.OFF);
            case 3:
                jwn jwnVarM13640j = jwr.m13640j(jwr.m13632b((jwn) this.f24245b.get(), (jwn) this.f24244a.get()), hnk.f28488a);
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            default:
                jwn jwnVarM13640j2 = jwr.m13640j(jwr.m13632b((jwn) this.f24245b.get(), (jwn) this.f24244a.get()), hnk.f28489b);
                jwnVarM13640j2.getClass();
                return jwnVarM13640j2;
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f24246c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return m9065a();
    }
}
