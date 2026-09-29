package p386t;

import androidx.compose.foundation.FocusedBoundsKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5647k;
import p142h1.C5877h;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5875f;
import p142h1.InterfaceC5876g;
import sl.C9072e;

/* JADX INFO: renamed from: t.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9123o implements InterfaceC5873d, InterfaceC5875f<InterfaceC2052l<? super InterfaceC5647k, ? extends C9072e>>, InterfaceC2052l<InterfaceC5647k, C9072e> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC5647k, C9072e> f47628a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2052l<? super InterfaceC5647k, C9072e> f47629b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5647k f47630c;

    /* JADX WARN: Multi-variable type inference failed */
    public C9123o(InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "handler");
        this.f47628a = interfaceC2052l;
    }

    @Override // p142h1.InterfaceC5873d
    /* JADX INFO: renamed from: X */
    public final void mo1428X(InterfaceC5876g interfaceC5876g) {
        C5207g.m11111f(interfaceC5876g, "scope");
        InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l = (InterfaceC2052l) interfaceC5876g.mo2083c(FocusedBoundsKt.f1840a);
        if (!C5207g.m11106a(interfaceC2052l, this.f47629b)) {
            this.f47629b = interfaceC2052l;
        }
    }

    @Override // p142h1.InterfaceC5875f
    public final C5877h<InterfaceC2052l<? super InterfaceC5647k, ? extends C9072e>> getKey() {
        return FocusedBoundsKt.f1840a;
    }

    @Override // p142h1.InterfaceC5875f
    public final InterfaceC2052l<? super InterfaceC5647k, ? extends C9072e> getValue() {
        return this;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
        InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
        this.f47630c = interfaceC5647k2;
        this.f47628a.mo528n(interfaceC5647k2);
        InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l = this.f47629b;
        if (interfaceC2052l != null) {
            interfaceC2052l.mo528n(interfaceC5647k2);
        }
        return C9072e.f47360a;
    }
}
