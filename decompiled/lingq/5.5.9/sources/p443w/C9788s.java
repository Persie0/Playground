package p443w;

import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5660x;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: w.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9788s extends AbstractC0664t0 implements InterfaceC5660x {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7885a.c f49887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9788s(InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        C7886b.b bVar = InterfaceC7885a.a.f42994f;
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        this.f49887b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9788s c9788s = obj instanceof C9788s ? (C9788s) obj : null;
        if (c9788s == null) {
            return false;
        }
        return C5207g.m11106a(this.f49887b, c9788s.f49887b);
    }

    public final int hashCode() {
        return this.f49887b.hashCode();
    }

    public final String toString() {
        return "VerticalAlignModifier(vertical=" + this.f49887b + ')';
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
        InterfaceC7885a.c cVar = this.f49887b;
        C5207g.m11111f(cVar, "vertical");
        c9785p.f49885c = new AbstractC9773d.e(cVar);
        return c9785p;
    }
}
