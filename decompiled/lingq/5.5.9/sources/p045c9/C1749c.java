package p045c9;

import p090e9.InterfaceC5385a;
import p174i9.InterfaceC6208b;
import p452w8.AbstractC9838s;
import p479xa.C10144m;

/* JADX INFO: renamed from: c9.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1749c implements InterfaceC5385a.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9619c;

    public /* synthetic */ C1749c(Object obj, int i10, Object obj2) {
        this.f9618b = obj;
        this.f9619c = obj2;
        this.f9617a = i10;
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        C1753g c1753g = (C1753g) this.f9618b;
        c1753g.f9633d.mo5483a((AbstractC9838s) this.f9619c, this.f9617a + 1);
        return null;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC6208b) obj).mo12796j((InterfaceC6208b.a) this.f9618b, this.f9617a);
    }
}
