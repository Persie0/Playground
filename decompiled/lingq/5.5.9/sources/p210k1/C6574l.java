package p210k1;

import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: k1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6574l extends AbstractC0664t0 implements InterfaceC6573k {

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f37394c = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final C6572j f37395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6574l(boolean z10, InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        super(interfaceC2052l2);
        C5207g.m11111f(interfaceC2052l, "properties");
        C5207g.m11111f(interfaceC2052l2, "inspectorInfo");
        C6572j c6572j = new C6572j();
        c6572j.f37392b = z10;
        c6572j.f37393c = false;
        interfaceC2052l.mo528n(c6572j);
        this.f37395b = c6572j;
    }

    @Override // p210k1.InterfaceC6573k
    /* JADX INFO: renamed from: C */
    public final C6572j mo13165C() {
        return this.f37395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6574l) {
            return C5207g.m11106a(this.f37395b, ((C6574l) obj).f37395b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37395b.hashCode();
    }
}
