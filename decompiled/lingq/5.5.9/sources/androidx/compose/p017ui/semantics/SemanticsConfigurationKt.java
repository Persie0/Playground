package androidx.compose.p017ui.semantics;

import cm.InterfaceC2041a;
import dm.C5207g;
import p210k1.C6572j;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    /* JADX INFO: renamed from: a */
    public static final <T> T m2529a(C6572j c6572j, C0685a<T> c0685a) {
        C5207g.m11111f(c6572j, "<this>");
        C5207g.m11111f(c0685a, "key");
        C5207g.m11111f(new InterfaceC2041a<T>() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final T mo807E() {
                return null;
            }
        }, "defaultValue");
        T t10 = (T) c6572j.f37391a.get(c0685a);
        if (t10 == null) {
            return null;
        }
        return t10;
    }
}
