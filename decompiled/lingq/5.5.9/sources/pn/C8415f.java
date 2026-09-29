package pn;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;

/* JADX INFO: renamed from: pn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8415f implements Comparator<InterfaceC8838g> {

    /* JADX INFO: renamed from: a */
    public static final C8415f f45540a = new C8415f();

    /* JADX INFO: renamed from: a */
    public static int m16469a(InterfaceC8838g interfaceC8838g) {
        if (C8413d.m16454m(interfaceC8838g)) {
            return 8;
        }
        if (interfaceC8838g instanceof InterfaceC6821b) {
            return 7;
        }
        if (interfaceC8838g instanceof InterfaceC8829b0) {
            return ((InterfaceC8829b0) interfaceC8838g).mo11896s0() == null ? 6 : 5;
        }
        if (interfaceC8838g instanceof InterfaceC6822c) {
            return ((InterfaceC6822c) interfaceC8838g).mo11896s0() == null ? 4 : 3;
        }
        if (interfaceC8838g instanceof InterfaceC8830c) {
            return 2;
        }
        return interfaceC8838g instanceof InterfaceC8845j0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC8838g interfaceC8838g, InterfaceC8838g interfaceC8838g2) {
        Integer numValueOf;
        InterfaceC8838g interfaceC8838g3 = interfaceC8838g;
        InterfaceC8838g interfaceC8838g4 = interfaceC8838g2;
        int iM16469a = m16469a(interfaceC8838g4) - m16469a(interfaceC8838g3);
        if (iM16469a != 0) {
            numValueOf = Integer.valueOf(iM16469a);
        } else if (C8413d.m16454m(interfaceC8838g3) && C8413d.m16454m(interfaceC8838g4)) {
            numValueOf = 0;
        } else {
            int iCompareTo = interfaceC8838g3.mo11874a().f42086a.compareTo(interfaceC8838g4.mo11874a().f42086a);
            numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
