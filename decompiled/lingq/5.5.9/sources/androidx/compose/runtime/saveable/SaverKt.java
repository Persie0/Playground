package androidx.compose.runtime.saveable;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import p252m0.C7452c;
import p252m0.InterfaceC7453d;

/* JADX INFO: loaded from: classes.dex */
public final class SaverKt {

    /* JADX INFO: renamed from: a */
    public static final C7452c f3232a = m1859a(new InterfaceC2056p<InterfaceC7453d, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7453d interfaceC7453d, Object obj) {
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            return obj;
        }
    }, new InterfaceC2052l<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Object mo528n(Object obj) {
            C5207g.m11111f(obj, "it");
            return obj;
        }
    });

    /* JADX INFO: renamed from: a */
    public static final C7452c m1859a(InterfaceC2056p interfaceC2056p, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2056p, "save");
        C5207g.m11111f(interfaceC2052l, "restore");
        return new C7452c(interfaceC2056p, interfaceC2052l);
    }
}
