package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bo.C1623a;
import cm.InterfaceC2041a;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import p385sf.C9000b;
import p420um.AbstractC9559c;
import p541zn.C10544h;
import p541zn.C10555s;
import p543do.AbstractC5257t;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractC9559c {

    /* JADX INFO: renamed from: H */
    public final C1623a f39822H;

    /* JADX INFO: renamed from: k */
    public final C8578t f39823k;

    /* JADX INFO: renamed from: l */
    public final ProtoBuf$TypeParameter f39824l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public DeserializedTypeParameterDescriptor(C8578t c8578t, ProtoBuf$TypeParameter protoBuf$TypeParameter, int i10) {
        Variance variance;
        C5207g.m11111f(c8578t, "c");
        InterfaceC2076h interfaceC2076hM16778c = c8578t.m16778c();
        InterfaceC8838g interfaceC8838g = (InterfaceC8838g) c8578t.f46001c;
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        C7648e c7648eM14910J = C7499b.m14910J((InterfaceC6733c) c8578t.f46000b, protoBuf$TypeParameter.f39325e);
        ProtoBuf$TypeParameter.Variance variance2 = protoBuf$TypeParameter.f39327g;
        C5207g.m11110e(variance2, "proto.variance");
        int i11 = C10555s.a.f52623c[variance2.ordinal()];
        if (i11 == 1) {
            variance = Variance.IN_VARIANCE;
        } else if (i11 == 2) {
            variance = Variance.OUT_VARIANCE;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            variance = Variance.INVARIANT;
        }
        super(interfaceC2076hM16778c, interfaceC8838g, c10670a, c7648eM14910J, variance, protoBuf$TypeParameter.f39326f, i10, InterfaceC8843i0.a.f46732a);
        this.f39823k = c8578t;
        this.f39824l = protoBuf$TypeParameter;
        this.f39822H = new C1623a(c8578t.m16778c(), new InterfaceC2041a<List<? extends InterfaceC9075c>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC9075c> mo807E() {
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.f39825b;
                C8578t c8578t2 = deserializedTypeParameterDescriptor.f39823k;
                return C6752c.m13453u0(((C10544h) c8578t2.f45999a).f52583e.mo13756d(deserializedTypeParameterDescriptor.f39824l, (InterfaceC6733c) c8578t2.f46000b));
            }
        });
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: V0 */
    public final void mo11214V0(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: W0 */
    public final List<AbstractC5257t> mo11215W0() {
        C8578t c8578t = this.f39823k;
        C6735e c6735e = (C6735e) c8578t.f46002d;
        ProtoBuf$TypeParameter protoBuf$TypeParameter = this.f39824l;
        C5207g.m11111f(protoBuf$TypeParameter, "<this>");
        C5207g.m11111f(c6735e, "typeTable");
        List list = protoBuf$TypeParameter.f39328h;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = protoBuf$TypeParameter.f39329i;
            C5207g.m11110e(list2, "upperBoundIdList");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
            for (Integer num : list2) {
                C5207g.m11110e(num, "it");
                arrayList.add(c6735e.m13355a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return C9000b.m17251q(DescriptorUtilsKt.m14108e(this).m13557n());
        }
        TypeDeserializer typeDeserializer = (TypeDeserializer) c8578t.f46006h;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.m14139g((ProtoBuf$Type) it.next()));
        }
        return arrayList2;
    }

    @Override // sm.C9074b, sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return this.f39822H;
    }
}
