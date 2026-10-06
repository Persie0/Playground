package p000;

import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eer implements Supplier {

    /* JADX INFO: renamed from: a */
    public boolean f13726a = false;

    /* JADX INFO: renamed from: b */
    private final edk f13727b;

    /* JADX INFO: renamed from: c */
    private final boolean f13728c;

    /* JADX INFO: renamed from: d */
    private final jwn f13729d;

    /* JADX INFO: renamed from: e */
    private final dhv f13730e;

    /* JADX INFO: renamed from: f */
    private final ebv f13731f;

    /* JADX INFO: renamed from: g */
    private final jwn f13732g;

    public eer(hnw hnwVar, hnv hnvVar, jwn jwnVar, edk edkVar, dhv dhvVar, ebv ebvVar, jwn jwnVar2, jvb jvbVar) {
        this.f13727b = edkVar;
        this.f13729d = jwnVar;
        this.f13730e = dhvVar;
        this.f13731f = ebvVar;
        this.f13732g = jwnVar2;
        this.f13728c = (dhvVar.mo6184l(did.f11424ac) && edkVar == edk.REGULAR) ? true : dhvVar.mo6184l(did.f11425ad) && edkVar == edk.PORTRAIT;
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10524c(not.INSTANCE);
        hnyVarM10529a.m10525d("TemporalBinning");
        hnyVarM10529a.m10528g(hnvVar);
        hnyVarM10529a.m10527f(new eeq(this, false));
        hnyVarM10529a.m10526e(new eeq(this, true));
        jvbVar.m13537d(hnwVar.mo10519f(hnyVarM10529a.m10522a()));
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        edk edkVar;
        synchronized (this) {
            boolean z = false;
            if (this.f13726a) {
                return false;
            }
            boolean z2 = this.f13731f.m7086e((cle) this.f13732g.mo3831be()) && this.f13730e.mo6184l(did.f11471y);
            if (this.f13728c && ((Boolean) this.f13729d.mo3831be()).booleanValue()) {
                return Boolean.valueOf(z2);
            }
            if (this.f13727b == edk.REGULAR || (edkVar = this.f13727b) == edk.PORTRAIT || (edkVar == edk.LONG_EXPOSURE && z2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
