package p386t;

import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p423v.C9606d;
import p423v.C9607e;
import p423v.InterfaceC9612j;

/* JADX INFO: renamed from: t.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9119k implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0 f47623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9612j f47624b;

    public C9119k(InterfaceC5312g0 interfaceC5312g0, InterfaceC9612j interfaceC9612j) {
        this.f47623a = interfaceC5312g0;
        this.f47624b = interfaceC9612j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5312g0 interfaceC5312g0 = this.f47623a;
        C9606d c9606d = (C9606d) interfaceC5312g0.getValue();
        if (c9606d != null) {
            C9607e c9607e = new C9607e(c9606d);
            InterfaceC9612j interfaceC9612j = this.f47624b;
            if (interfaceC9612j != null) {
                interfaceC9612j.mo18073a(c9607e);
            }
            interfaceC5312g0.setValue(null);
        }
    }
}
