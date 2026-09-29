package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6740a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8855o0;
import p373rn.AbstractC8875g;
import p420um.AbstractC9578l0;
import p543do.AbstractC5257t;
import pm.C8409d;
import sl.InterfaceC9070c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d */
/* JADX INFO: loaded from: classes2.dex */
public class C6830d extends AbstractC9578l0 implements InterfaceC8853n0 {

    /* JADX INFO: renamed from: f */
    public final int f38573f;

    /* JADX INFO: renamed from: g */
    public final boolean f38574g;

    /* JADX INFO: renamed from: h */
    public final boolean f38575h;

    /* JADX INFO: renamed from: i */
    public final boolean f38576i;

    /* JADX INFO: renamed from: j */
    public final AbstractC5257t f38577j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC8853n0 f38578k;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a */
    public static final class a extends C6830d {

        /* JADX INFO: renamed from: l */
        public final InterfaceC9070c f38579l;

        public a(InterfaceC6816a interfaceC6816a, InterfaceC8853n0 interfaceC8853n0, int i10, InterfaceC9077e interfaceC9077e, C7648e c7648e, AbstractC5257t abstractC5257t, boolean z10, boolean z11, boolean z12, AbstractC5257t abstractC5257t2, InterfaceC8837f0 interfaceC8837f0, InterfaceC2041a<? extends List<? extends InterfaceC8855o0>> interfaceC2041a) {
            super(interfaceC6816a, interfaceC8853n0, i10, interfaceC9077e, c7648e, abstractC5257t, z10, z11, z12, abstractC5257t2, interfaceC8837f0);
            this.f38579l = C6740a.m13372a(interfaceC2041a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d, p372rm.InterfaceC8853n0
        /* JADX INFO: renamed from: l0 */
        public final InterfaceC8853n0 mo13646l0(C8409d c8409d, C7648e c7648e, int i10) {
            InterfaceC9077e interfaceC9077eMo11289w = mo11289w();
            C5207g.m11110e(interfaceC9077eMo11289w, "annotations");
            AbstractC5257t abstractC5257tMo11884c = mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c, "type");
            return new a(c8409d, null, i10, interfaceC9077eMo11289w, c7648e, abstractC5257tMo11884c, mo13643B0(), this.f38575h, this.f38576i, this.f38577j, InterfaceC8837f0.f46730a, new InterfaceC2041a<List<? extends InterfaceC8855o0>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends InterfaceC8855o0> mo807E() {
                    return (List) this.f38511b.f38579l.getValue();
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6830d(InterfaceC6816a interfaceC6816a, InterfaceC8853n0 interfaceC8853n0, int i10, InterfaceC9077e interfaceC9077e, C7648e c7648e, AbstractC5257t abstractC5257t, boolean z10, boolean z11, boolean z12, AbstractC5257t abstractC5257t2, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC6816a, interfaceC9077e, c7648e, abstractC5257t, interfaceC8837f0);
        C5207g.m11111f(interfaceC6816a, "containingDeclaration");
        C5207g.m11111f(interfaceC9077e, "annotations");
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(abstractC5257t, "outType");
        C5207g.m11111f(interfaceC8837f0, "source");
        this.f38573f = i10;
        this.f38574g = z10;
        this.f38575h = z11;
        this.f38576i = z12;
        this.f38577j = abstractC5257t2;
        this.f38578k = interfaceC8853n0 == null ? this : interfaceC8853n0;
    }

    @Override // p372rm.InterfaceC8853n0
    /* JADX INFO: renamed from: B0 */
    public final boolean mo13643B0() {
        return this.f38574g && ((CallableMemberDescriptor) mo11876g()).mo11897u().isReal();
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14064m(this, d10);
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8853n0 mo18004P0() {
        InterfaceC8853n0 interfaceC8853n0 = this.f38578k;
        return interfaceC8853n0 == this ? this : interfaceC8853n0.mo18004P0();
    }

    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8840h mo5312d(TypeSubstitutor typeSubstitutor) {
        C5207g.m11111f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.m14203h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: e0 */
    public final /* bridge */ /* synthetic */ AbstractC8875g mo11885e0() {
        return null;
    }

    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.i iVar = C8850m.f46739f;
        C5207g.m11110e(iVar, "LOCAL");
        return iVar;
    }

    @Override // p372rm.InterfaceC8853n0
    /* JADX INFO: renamed from: f0 */
    public final boolean mo13644f0() {
        return this.f38576i;
    }

    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC6816a mo11876g() {
        InterfaceC8838g interfaceC8838gMo11876g = super.mo11876g();
        C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC6816a) interfaceC8838gMo11876g;
    }

    @Override // p372rm.InterfaceC8853n0
    public final int getIndex() {
        return this.f38573f;
    }

    @Override // p372rm.InterfaceC8853n0
    /* JADX INFO: renamed from: i0 */
    public final boolean mo13645i0() {
        return this.f38575h;
    }

    @Override // p372rm.InterfaceC8853n0
    /* JADX INFO: renamed from: l0 */
    public InterfaceC8853n0 mo13646l0(C8409d c8409d, C7648e c7648e, int i10) {
        InterfaceC9077e interfaceC9077eMo11289w = mo11289w();
        C5207g.m11110e(interfaceC9077eMo11289w, "annotations");
        AbstractC5257t abstractC5257tMo11884c = mo11884c();
        C5207g.m11110e(abstractC5257tMo11884c, "type");
        return new C6830d(c8409d, null, i10, interfaceC9077eMo11289w, c7648e, abstractC5257tMo11884c, mo13643B0(), this.f38575h, this.f38576i, this.f38577j, InterfaceC8837f0.f46730a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<InterfaceC8853n0> mo11893p() {
        Collection<? extends InterfaceC6816a> collectionMo11893p = mo11876g().mo11893p();
        C5207g.m11110e(collectionMo11893p, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo11893p, 10));
        Iterator<T> it = collectionMo11893p.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6816a) it.next()).mo11889i().get(this.f38573f));
        }
        return arrayList;
    }

    @Override // p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: q0 */
    public final boolean mo11894q0() {
        return false;
    }

    @Override // p372rm.InterfaceC8853n0
    /* JADX INFO: renamed from: r0 */
    public final AbstractC5257t mo13647r0() {
        return this.f38577j;
    }
}
