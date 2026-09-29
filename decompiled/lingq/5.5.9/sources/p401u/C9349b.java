package p401u;

import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p423v.C9603a;
import p423v.C9604b;
import p423v.InterfaceC9612j;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9349b implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0 f48089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9612j f48090b;

    public C9349b(InterfaceC5312g0 interfaceC5312g0, InterfaceC9612j interfaceC9612j) {
        this.f48089a = interfaceC5312g0;
        this.f48090b = interfaceC9612j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5312g0 interfaceC5312g0 = this.f48089a;
        C9604b c9604b = (C9604b) interfaceC5312g0.getValue();
        if (c9604b != null) {
            InterfaceC9612j interfaceC9612j = this.f48090b;
            if (interfaceC9612j != null) {
                interfaceC9612j.mo18073a(new C9603a(c9604b));
            }
            interfaceC5312g0.setValue(null);
        }
    }
}
