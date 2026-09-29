package p386t;

import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p127g1.InterfaceC5661y;

/* JADX INFO: renamed from: t.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9121m implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0 f47625a;

    public C9121m(InterfaceC5312g0 interfaceC5312g0) {
        this.f47625a = interfaceC5312g0;
    }

    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5312g0 interfaceC5312g0 = this.f47625a;
        InterfaceC5661y.a aVar = (InterfaceC5661y.a) interfaceC5312g0.getValue();
        if (aVar != null) {
            aVar.release();
        }
        interfaceC5312g0.setValue(null);
    }
}
