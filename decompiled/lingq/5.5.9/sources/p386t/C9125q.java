package p386t;

import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p423v.C9608f;
import p423v.C9609g;
import p423v.InterfaceC9612j;

/* JADX INFO: renamed from: t.q */
/* JADX INFO: loaded from: classes.dex */
public final class C9125q implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0 f47633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9612j f47634b;

    public C9125q(InterfaceC5312g0 interfaceC5312g0, InterfaceC9612j interfaceC9612j) {
        this.f47633a = interfaceC5312g0;
        this.f47634b = interfaceC9612j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5312g0 interfaceC5312g0 = this.f47633a;
        C9608f c9608f = (C9608f) interfaceC5312g0.getValue();
        if (c9608f != null) {
            this.f47634b.mo18073a(new C9609g(c9608f));
            interfaceC5312g0.setValue(null);
        }
    }
}
