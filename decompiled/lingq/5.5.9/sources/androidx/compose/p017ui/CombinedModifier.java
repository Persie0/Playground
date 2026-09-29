package androidx.compose.p017ui;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedModifier implements InterfaceC0500b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0500b f3318a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0500b f3319b;

    public CombinedModifier(InterfaceC0500b interfaceC0500b, InterfaceC0500b interfaceC0500b2) {
        C5207g.m11111f(interfaceC0500b, "outer");
        C5207g.m11111f(interfaceC0500b2, "inner");
        this.f3318a = interfaceC0500b;
        this.f3319b = interfaceC0500b2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (C5207g.m11106a(this.f3318a, combinedModifier.f3318a) && C5207g.m11106a(this.f3319b, combinedModifier.f3319b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3319b.hashCode() * 31) + this.f3318a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p017ui.InterfaceC0500b
    /* JADX INFO: renamed from: o */
    public final <R> R mo1925o(R r10, InterfaceC2056p<? super R, ? super InterfaceC0500b.b, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return (R) this.f3319b.mo1925o(this.f3318a.mo1925o(r10, interfaceC2056p), interfaceC2056p);
    }

    @Override // androidx.compose.p017ui.InterfaceC0500b
    /* JADX INFO: renamed from: t */
    public final boolean mo1926t(InterfaceC2052l<? super InterfaceC0500b.b, Boolean> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "predicate");
        return this.f3318a.mo1926t(interfaceC2052l) && this.f3319b.mo1926t(interfaceC2052l);
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("["), (String) mo1925o("", new InterfaceC2056p<String, InterfaceC0500b.b, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final String mo1337m0(String str, InterfaceC0500b.b bVar) {
                String str2 = str;
                InterfaceC0500b.b bVar2 = bVar;
                C5207g.m11111f(str2, "acc");
                C5207g.m11111f(bVar2, "element");
                if (str2.length() == 0) {
                    return bVar2.toString();
                }
                return str2 + ", " + bVar2;
            }
        }), ']');
    }
}
