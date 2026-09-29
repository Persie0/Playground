package p443w;

import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5660x;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: w.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9774e extends AbstractC0664t0 implements InterfaceC5660x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7885a.b f49859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9774e(InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        C7886b.a aVar = InterfaceC7885a.a.f42996h;
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        this.f49859b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9774e c9774e = obj instanceof C9774e ? (C9774e) obj : null;
        if (c9774e == null) {
            return false;
        }
        return C5207g.m11106a(this.f49859b, c9774e.f49859b);
    }

    public final int hashCode() {
        return this.f49859b.hashCode();
    }

    public final String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f49859b + ')';
    }

    @Override // p127g1.InterfaceC5660x
    /* JADX INFO: renamed from: y */
    public final Object mo12015y(InterfaceC10015c interfaceC10015c, Object obj) {
        C5207g.m11111f(interfaceC10015c, "<this>");
        C9785p c9785p = obj instanceof C9785p ? (C9785p) obj : null;
        if (c9785p == null) {
            c9785p = new C9785p(0);
        }
        int i10 = AbstractC9773d.f49853a;
        InterfaceC7885a.b bVar = this.f49859b;
        C5207g.m11111f(bVar, "horizontal");
        c9785p.f49885c = new AbstractC9773d.c(bVar);
        return c9785p;
    }
}
