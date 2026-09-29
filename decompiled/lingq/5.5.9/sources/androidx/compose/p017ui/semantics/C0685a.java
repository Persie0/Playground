package androidx.compose.p017ui.semantics;

import cm.InterfaceC2056p;
import dm.C5207g;
import km.InterfaceC6727j;
import p210k1.InterfaceC6577o;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0685a<T> {

    /* JADX INFO: renamed from: a */
    public final String f4445a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2056p<T, T, T> f4446b;

    public /* synthetic */ C0685a(String str) {
        this(str, SemanticsPropertyKey$1.f4444b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0685a(String str, InterfaceC2056p<? super T, ? super T, ? extends T> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "mergePolicy");
        this.f4445a = str;
        this.f4446b = interfaceC2056p;
    }

    /* JADX INFO: renamed from: a */
    public final void m2543a(InterfaceC6577o interfaceC6577o, InterfaceC6727j<?> interfaceC6727j, T t10) {
        C5207g.m11111f(interfaceC6577o, "thisRef");
        C5207g.m11111f(interfaceC6727j, "property");
        interfaceC6577o.mo13162a(this, t10);
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.f4445a;
    }
}
