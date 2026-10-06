package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkj implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f36366a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f36367b;

    /* JADX INFO: renamed from: c */
    private boolean f36368c = true;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f36369d;

    public kkj(cdh cdhVar, drj drjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f36369d = i;
        this.f36367b = cdhVar;
        this.f36366a = drjVar;
    }

    public kkj(kkk kkkVar, kkr kkrVar, int i) {
        this.f36369d = i;
        this.f36367b = kkkVar;
        this.f36366a = kkrVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f36369d) {
            case 0:
                mrm mrmVar = (mrm) obj;
                if (this.f36368c) {
                    this.f36368c = false;
                } else {
                    ((kkk) this.f36367b).f36372c.mo13944f("Surface for " + String.valueOf(this.f36366a) + " was " + (mrmVar.mo16813g() ? "set to ".concat(mrmVar.mo16809c().toString()) : "destroyed."));
                }
                ((kkk) this.f36367b).m14436e();
                break;
            default:
                Boolean bool = (Boolean) obj;
                if (!this.f36368c) {
                    if (!bool.booleanValue() && !((Boolean) ((jwf) ((drj) this.f36366a).f12398d).f34942d).booleanValue()) {
                        ((cdh) this.f36367b).close();
                        break;
                    }
                } else {
                    this.f36368c = false;
                    break;
                }
                break;
        }
    }
}
