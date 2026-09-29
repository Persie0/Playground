package p022b1;

import android.view.KeyEvent;
import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import dm.C5207g;

/* JADX INFO: renamed from: b1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1290c extends InterfaceC0500b.c implements InterfaceC1291d {

    /* JADX INFO: renamed from: k */
    public InterfaceC2052l<? super C1289b, Boolean> f8001k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2052l<? super C1289b, Boolean> f8002l = null;

    public C1290c(InterfaceC2052l interfaceC2052l) {
        this.f8001k = interfaceC2052l;
    }

    @Override // p022b1.InterfaceC1291d
    /* JADX INFO: renamed from: h */
    public final boolean mo4792h(KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        InterfaceC2052l<? super C1289b, Boolean> interfaceC2052l = this.f8002l;
        if (interfaceC2052l != null) {
            return interfaceC2052l.mo528n(new C1289b(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // p022b1.InterfaceC1291d
    /* JADX INFO: renamed from: l */
    public final boolean mo4793l(KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        InterfaceC2052l<? super C1289b, Boolean> interfaceC2052l = this.f8001k;
        if (interfaceC2052l != null) {
            return interfaceC2052l.mo528n(new C1289b(keyEvent)).booleanValue();
        }
        return false;
    }
}
