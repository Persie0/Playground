package kotlin.jvm.internal;

import dm.InterfaceC5202b;
import km.InterfaceC6719b;
import km.InterfaceC6721d;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(Class cls, String str) {
        super(CallableReference.f38110g, cls, "binding", str, 0);
    }

    public PropertyReference1Impl(InterfaceC6721d interfaceC6721d, String str, String str2) {
        super(CallableReference.f38110g, ((InterfaceC5202b) interfaceC6721d).mo10973b(), str, str2, !(interfaceC6721d instanceof InterfaceC6719b) ? 1 : 0);
    }
}
