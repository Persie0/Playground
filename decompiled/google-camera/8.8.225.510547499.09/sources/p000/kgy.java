package p000;

import android.util.Printer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgy implements kfl, kaq {

    /* JADX INFO: renamed from: a */
    public final khg f35996a;

    /* JADX INFO: renamed from: b */
    public final kfn f35997b;

    /* JADX INFO: renamed from: c */
    public final knx f35998c;

    /* JADX INFO: renamed from: d */
    public final kkz f35999d;

    /* JADX INFO: renamed from: e */
    private final kme f36000e;

    public kgy(khg khgVar, kfn kfnVar, kme kmeVar, kkz kkzVar, knx knxVar) {
        this.f35996a = khgVar;
        this.f35997b = kfnVar;
        this.f36000e = kmeVar;
        this.f35999d = kkzVar;
        this.f35998c = knxVar;
    }

    /* JADX INFO: renamed from: f */
    public static final void m14228f(Printer printer, String str, String str2) {
        printer.println(kfv.m14168E("%-20s %s", str, str2));
    }

    @Override // p000.kaq
    /* JADX INFO: renamed from: a */
    public final void mo13885a(Printer printer) {
        throw null;
    }

    @Override // p000.kfl
    /* JADX INFO: renamed from: b */
    public final kgg mo14137b(kgi kgiVar) {
        kgg kggVarMo14138c = mo14138c(kgiVar);
        kggVarMo14138c.getClass();
        return kggVarMo14138c;
    }

    @Override // p000.kfl
    /* JADX INFO: renamed from: c */
    public final kgg mo14138c(kgi kgiVar) {
        naz nazVarListIterator = this.f35999d.f36448a.listIterator();
        while (nazVarListIterator.hasNext()) {
            kky kkyVar = (kky) nazVarListIterator.next();
            if (kkyVar.f36447h == kgiVar) {
                return kkyVar;
            }
        }
        return null;
    }

    @Override // p000.kfl
    /* JADX INFO: renamed from: d */
    public final kmd mo14139d() {
        return this.f36000e.mo13854a(m14229e());
    }

    /* JADX INFO: renamed from: e */
    public final kmg m14229e() {
        return this.f35997b.f35837a;
    }
}
