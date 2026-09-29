package om;

import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import mn.C7645b;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8865w;
import p543do.AbstractC5257t;
import p543do.C5258t0;

/* JADX INFO: renamed from: om.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C8091h {

    /* JADX INFO: renamed from: a */
    public static final Set<C7648e> f43909a;

    /* JADX INFO: renamed from: b */
    public static final Set<C7648e> f43910b;

    /* JADX INFO: renamed from: c */
    public static final HashMap<C7645b, C7645b> f43911c;

    /* JADX INFO: renamed from: d */
    public static final HashMap<C7645b, C7645b> f43912d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet f43913e;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f43909a = C6752c.m13457y0(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f43910b = C6752c.m13457y0(arrayList2);
        f43911c = new HashMap<>();
        f43912d = new HashMap<>();
        C6753d.m13461N0(new Pair(UnsignedArrayType.UBYTEARRAY, C7648e.m15232l("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, C7648e.m15232l("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, C7648e.m15232l("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, C7648e.m15232l("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().m15210j());
        }
        f43913e = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f43911c.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f43912d.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16005a(AbstractC5257t abstractC5257t) {
        InterfaceC8834e interfaceC8834eMo11235q;
        if (!C5258t0.m11305p(abstractC5257t) && (interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q()) != null) {
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8834eMo11235q.mo11876g();
            return (interfaceC8838gMo11876g instanceof InterfaceC8865w) && C5207g.m11106a(((InterfaceC8865w) interfaceC8838gMo11876g).mo17120e(), C6797e.f38344j) && f43909a.contains(interfaceC8834eMo11235q.mo11874a());
        }
        return false;
    }
}
