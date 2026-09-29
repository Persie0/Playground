package pn;

import android.support.v4.media.AbstractC0140a;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;
import p466wn.C9981d;
import p466wn.InterfaceC9985h;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: pn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8411b extends AbstractC0140a {
    /* JADX INFO: renamed from: k0 */
    public static final void m16431k0(DeserializedClassDescriptor deserializedClassDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z10) {
        boolean z11;
        for (InterfaceC8838g interfaceC8838g : InterfaceC9985h.a.m18558a(memberScope, C9981d.f50723o, 2)) {
            if (interfaceC8838g instanceof InterfaceC8830c) {
                InterfaceC8830c interfaceC8830cMo5315s = (InterfaceC8830c) interfaceC8838g;
                if (interfaceC8830cMo5315s.mo11882T()) {
                    C7648e c7648eMo11874a = interfaceC8830cMo5315s.mo11874a();
                    C5207g.m11110e(c7648eMo11874a, "descriptor.name");
                    InterfaceC8834e interfaceC8834eMo5304g = memberScope.mo5304g(c7648eMo11874a, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC8830cMo5315s = interfaceC8834eMo5304g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g : interfaceC8834eMo5304g instanceof InterfaceC8845j0 ? ((InterfaceC8845j0) interfaceC8834eMo5304g).mo5315s() : null;
                }
                if (interfaceC8830cMo5315s != null) {
                    int i10 = C8413d.f45539a;
                    Iterator<AbstractC5257t> it = interfaceC8830cMo5315s.mo13600k().mo11278p().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C8413d.m16457p(it.next(), deserializedClassDescriptor)) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        linkedHashSet.add(interfaceC8830cMo5315s);
                    }
                    if (z10) {
                        MemberScope memberScopeMo13687H0 = interfaceC8830cMo5315s.mo13687H0();
                        C5207g.m11110e(memberScopeMo13687H0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m16431k0(deserializedClassDescriptor, linkedHashSet, memberScopeMo13687H0, z10);
                    }
                }
            }
        }
    }
}
