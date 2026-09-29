package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import dm.C5207g;
import p081e0.InterfaceC5312g0;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5876g;

/* JADX INFO: renamed from: androidx.compose.foundation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0390b implements InterfaceC5873d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5312g0<Boolean> f1944a;

    public C0390b(InterfaceC5312g0<Boolean> interfaceC5312g0) {
        this.f1944a = interfaceC5312g0;
    }

    @Override // p142h1.InterfaceC5873d
    /* JADX INFO: renamed from: X */
    public final void mo1428X(InterfaceC5876g interfaceC5876g) {
        C5207g.m11111f(interfaceC5876g, "scope");
        this.f1944a.setValue((Boolean) interfaceC5876g.mo2083c(ScrollableKt.f2167b));
    }
}
