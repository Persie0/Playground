package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6822c extends CallableMemberDescriptor {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c$a */
    public interface a<D extends InterfaceC6822c> {
        /* JADX INFO: renamed from: a */
        D mo11851a();

        /* JADX INFO: renamed from: b */
        a mo11852b(EmptyList emptyList);

        /* JADX INFO: renamed from: c */
        a<D> mo11853c(List<InterfaceC8853n0> list);

        /* JADX INFO: renamed from: d */
        a mo11854d(Boolean bool);

        /* JADX INFO: renamed from: e */
        a<D> mo11855e(AbstractC5257t abstractC5257t);

        /* JADX INFO: renamed from: f */
        a<D> mo11856f(InterfaceC8838g interfaceC8838g);

        /* JADX INFO: renamed from: g */
        a<D> mo11857g(Modality modality);

        /* JADX INFO: renamed from: h */
        a<D> mo11858h();

        /* JADX INFO: renamed from: i */
        a<D> mo11859i();

        /* JADX INFO: renamed from: j */
        a<D> mo11860j(C7648e c7648e);

        /* JADX INFO: renamed from: k */
        a mo11861k(InterfaceC8828b interfaceC8828b);

        /* JADX INFO: renamed from: l */
        a mo11862l();

        /* JADX INFO: renamed from: m */
        a<D> mo11863m(AbstractC8852n abstractC8852n);

        /* JADX INFO: renamed from: n */
        a<D> mo11864n();

        /* JADX INFO: renamed from: o */
        a<D> mo11865o(CallableMemberDescriptor.Kind kind);

        /* JADX INFO: renamed from: p */
        a<D> mo11866p(AbstractC5252q0 abstractC5252q0);

        /* JADX INFO: renamed from: q */
        a<D> mo11867q(InterfaceC9077e interfaceC9077e);

        /* JADX INFO: renamed from: r */
        a<D> mo11868r(InterfaceC8835e0 interfaceC8835e0);

        /* JADX INFO: renamed from: s */
        a<D> mo11869s();
    }

    /* JADX INFO: renamed from: E0 */
    boolean mo13616E0();

    /* JADX INFO: renamed from: F0 */
    boolean mo5294F0();

    /* JADX INFO: renamed from: L0 */
    boolean mo13617L0();

    /* JADX INFO: renamed from: M0 */
    a<? extends InterfaceC6822c> mo11848M0();

    /* JADX INFO: renamed from: R0 */
    boolean mo13618R0();

    /* JADX INFO: renamed from: W */
    boolean mo5296W();

    /* JADX INFO: renamed from: X */
    boolean mo13619X();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    InterfaceC6822c mo11875b();

    /* JADX INFO: renamed from: d */
    InterfaceC6822c mo5312d(TypeSubstitutor typeSubstitutor);

    /* JADX INFO: renamed from: k0 */
    InterfaceC6822c mo13620k0();

    /* JADX INFO: renamed from: x */
    boolean mo5301x();
}
