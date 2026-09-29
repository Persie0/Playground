package io;

import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p372rm.InterfaceC8853n0;

/* JADX INFO: renamed from: io.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6384k implements InterfaceC6378e {

    /* JADX INFO: renamed from: a */
    public static final C6384k f36789a = new C6384k();

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: a */
    public final String mo13009a(InterfaceC6822c interfaceC6822c) {
        return InterfaceC6378e.a.m13012a(this, interfaceC6822c);
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: b */
    public final String mo13010b() {
        return "should not have varargs or parameters with default values";
    }

    @Override // io.InterfaceC6378e
    /* JADX INFO: renamed from: c */
    public final boolean mo13011c(InterfaceC6822c interfaceC6822c) {
        C5207g.m11111f(interfaceC6822c, "functionDescriptor");
        List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo11889i();
        C5207g.m11110e(listMo11889i, "functionDescriptor.valueParameters");
        boolean z10 = true;
        if (!listMo11889i.isEmpty()) {
            for (InterfaceC8853n0 interfaceC8853n0 : listMo11889i) {
                C5207g.m11110e(interfaceC8853n0, "it");
                if (!(!DescriptorUtilsKt.m14104a(interfaceC8853n0) && interfaceC8853n0.mo13647r0() == null)) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }
}
