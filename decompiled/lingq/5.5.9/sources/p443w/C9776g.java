package p443w;

import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5660x;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: w.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9776g extends AbstractC0664t0 implements InterfaceC5660x {

    /* JADX INFO: renamed from: b */
    public final float f49861b;

    /* JADX INFO: renamed from: c */
    public final boolean f49862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9776g(boolean z10, InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        this.f49861b = 1.0f;
        this.f49862c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9776g c9776g = obj instanceof C9776g ? (C9776g) obj : null;
        if (c9776g == null) {
            return false;
        }
        return ((this.f49861b > c9776g.f49861b ? 1 : (this.f49861b == c9776g.f49861b ? 0 : -1)) == 0) && this.f49862c == c9776g.f49862c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49862c) + (Float.hashCode(this.f49861b) * 31);
    }

    public final String toString() {
        return "LayoutWeightImpl(weight=" + this.f49861b + ", fill=" + this.f49862c + ')';
    }

    @Override // p127g1.InterfaceC5660x
    /* JADX INFO: renamed from: y */
    public final Object mo12015y(InterfaceC10015c interfaceC10015c, Object obj) {
        C5207g.m11111f(interfaceC10015c, "<this>");
        C9785p c9785p = obj instanceof C9785p ? (C9785p) obj : null;
        if (c9785p == null) {
            c9785p = new C9785p(0);
        }
        c9785p.f49883a = this.f49861b;
        c9785p.f49884b = this.f49862c;
        return c9785p;
    }
}
