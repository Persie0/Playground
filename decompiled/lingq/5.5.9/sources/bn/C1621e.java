package bn;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import co.InterfaceC2074f;
import dm.C5207g;
import hn.C6082b;
import hn.C6090j;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import mn.C7646c;
import mn.C7648e;
import om.C8091h;
import p102eo.InterfaceC5436a;
import p123fn.InterfaceC5593a;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p373rn.AbstractC8875g;
import p420um.C9562d0;
import p420um.C9564e0;
import p420um.C9566f0;
import p420um.C9568g0;
import p543do.AbstractC5257t;
import p543do.C5258t0;
import pn.C8412c;
import sm.InterfaceC9077e;
import zm.C10534s;

/* JADX INFO: renamed from: bn.e */
/* JADX INFO: loaded from: classes2.dex */
public class C1621e extends C9562d0 implements InterfaceC1617a {

    /* JADX INFO: renamed from: W */
    public final boolean f9143W;

    /* JADX INFO: renamed from: X */
    public final Pair<InterfaceC6816a.a<?>, ?> f9144X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1621e(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, Modality modality, AbstractC8852n abstractC8852n, boolean z10, C7648e c7648e, InterfaceC8837f0 interfaceC8837f0, InterfaceC8829b0 interfaceC8829b0, CallableMemberDescriptor.Kind kind, boolean z11, Pair<InterfaceC6816a.a<?>, ?> pair) {
        super(interfaceC8838g, interfaceC8829b0, interfaceC9077e, modality, abstractC8852n, z10, c7648e, kind, interfaceC8837f0, false, false, false, false, false, false);
        if (interfaceC8838g == null) {
            m5284N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m5284N(1);
            throw null;
        }
        if (modality == null) {
            m5284N(2);
            throw null;
        }
        if (abstractC8852n == null) {
            m5284N(3);
            throw null;
        }
        if (c7648e == null) {
            m5284N(4);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m5284N(5);
            throw null;
        }
        if (kind == null) {
            m5284N(6);
            throw null;
        }
        this.f9143W = z11;
        this.f9144X = pair;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m5284N(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public static C1621e m5285b1(InterfaceC8838g interfaceC8838g, LazyJavaAnnotations lazyJavaAnnotations, Modality modality, AbstractC8852n abstractC8852n, boolean z10, C7648e c7648e, InterfaceC5593a interfaceC5593a, boolean z11) {
        if (interfaceC8838g == null) {
            m5284N(7);
            throw null;
        }
        if (modality == null) {
            m5284N(9);
            throw null;
        }
        if (c7648e == null) {
            m5284N(11);
            throw null;
        }
        if (interfaceC5593a != null) {
            return new C1621e(interfaceC8838g, lazyJavaAnnotations, modality, abstractC8852n, z10, c7648e, interfaceC5593a, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
        }
        m5284N(12);
        throw null;
    }

    @Override // bn.InterfaceC1617a
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC1617a mo5275D0(AbstractC5257t abstractC5257t, ArrayList arrayList, AbstractC5257t abstractC5257t2, Pair pair) {
        C9564e0 c9564e0;
        C9568g0 c9568g0;
        C9566f0 c9566f0;
        InterfaceC8829b0 interfaceC8829b0Mo18004P0 = mo18004P0() == this ? null : mo18004P0();
        C1621e c1621e = new C1621e(mo11876g(), mo11289w(), mo11891l(), mo11886f(), this.f49221f, mo11874a(), mo11890j(), interfaceC8829b0Mo18004P0, mo11897u(), this.f9143W, pair);
        C9564e0 c9564e1 = this.f49163S;
        if (c9564e1 != null) {
            c9564e0 = c9564e0;
            C9564e0 c9564e2 = new C9564e0(c1621e, c9564e1.mo11289w(), c9564e1.mo11891l(), c9564e1.mo11886f(), c9564e1.f49144e, c9564e1.f49145f, c9564e1.f49148i, mo11897u(), interfaceC8829b0Mo18004P0 == null ? null : interfaceC8829b0Mo18004P0.mo11888h(), c9564e1.mo11890j());
            c9564e0.f49151l = c9564e1.f49151l;
            c9564e0.m18016X0(abstractC5257t2);
        } else {
            c9564e0 = null;
        }
        InterfaceC8833d0 interfaceC8833d0 = this.f49164T;
        if (interfaceC8833d0 != null) {
            c9566f0 = c9566f0;
            C9566f0 c9566f1 = new C9566f0(c1621e, interfaceC8833d0.mo11289w(), interfaceC8833d0.mo11891l(), interfaceC8833d0.mo11886f(), interfaceC8833d0.mo13622c0(), interfaceC8833d0.mo5293D(), interfaceC8833d0.mo5301x(), mo11897u(), interfaceC8829b0Mo18004P0 == null ? null : interfaceC8829b0Mo18004P0.mo11887g0(), interfaceC8833d0.mo11890j());
            c9566f0.f49151l = c9566f0.f49151l;
            InterfaceC8853n0 interfaceC8853n0 = interfaceC8833d0.mo11889i().get(0);
            if (interfaceC8853n0 == null) {
                C9566f0.m18017N(6);
                throw null;
            }
            c9566f0.f49188H = interfaceC8853n0;
            c9568g0 = null;
        } else {
            c9568g0 = null;
            c9566f0 = null;
        }
        c1621e.m18010Y0(c9564e0, c9566f0, this.f49165U, this.f49166V);
        InterfaceC2041a<InterfaceC2074f<AbstractC8875g<?>>> interfaceC2041a = this.f49223h;
        if (interfaceC2041a != null) {
            c1621e.m18041P0(this.f49222g, interfaceC2041a);
        }
        c1621e.mo11847G0(mo11893p());
        c1621e.m18011a1(abstractC5257t2, mo11895r(), this.f49160P, abstractC5257t == null ? c9568g0 : C8412c.m16438g(this, abstractC5257t, InterfaceC9077e.a.f47365a), EmptyList.f38032a);
        return c1621e;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // p420um.C9562d0, p372rm.InterfaceC8855o0
    /* JADX INFO: renamed from: F */
    public final boolean mo5286F() {
        boolean z10;
        AbstractC5257t abstractC5257tMo11884c = mo11884c();
        boolean z11 = false;
        if (this.f9143W) {
            C5207g.m11111f(abstractC5257tMo11884c, "type");
            if (AbstractC6795c.m13535H(abstractC5257tMo11884c) || C8091h.m16005a(abstractC5257tMo11884c)) {
                if (C5258t0.m11296g(abstractC5257tMo11884c)) {
                    if (AbstractC6795c.m13537J(abstractC5257tMo11884c)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else if (AbstractC6795c.m13537J(abstractC5257tMo11884c)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                C6082b c6082b = C6090j.f35841a;
                C7646c c7646c = C10534s.f52549p;
                C5207g.m11110e(c7646c, "ENHANCED_NULLABILITY_ANNOTATION");
                if (!InterfaceC5436a.a.m11590D(abstractC5257tMo11884c, c7646c) || AbstractC6795c.m13537J(abstractC5257tMo11884c)) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    @Override // p420um.AbstractC9578l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return false;
    }

    @Override // p420um.C9562d0
    /* JADX INFO: renamed from: W0 */
    public final C9562d0 mo5287W0(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8852n abstractC8852n, InterfaceC8829b0 interfaceC8829b0, CallableMemberDescriptor.Kind kind, C7648e c7648e) {
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        if (interfaceC8838g == null) {
            m5284N(13);
            throw null;
        }
        if (modality == null) {
            m5284N(14);
            throw null;
        }
        if (abstractC8852n == null) {
            m5284N(15);
            throw null;
        }
        if (kind == null) {
            m5284N(16);
            throw null;
        }
        if (c7648e != null) {
            return new C1621e(interfaceC8838g, mo11289w(), modality, abstractC8852n, this.f49221f, c7648e, aVar, interfaceC8829b0, kind, this.f9143W, this.f9144X);
        }
        m5284N(17);
        throw null;
    }

    @Override // p420um.C9562d0
    /* JADX INFO: renamed from: Z0 */
    public final void mo5288Z0(AbstractC5257t abstractC5257t) {
    }

    @Override // p420um.C9562d0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p0 */
    public final <V> V mo5289p0(InterfaceC6816a.a<V> aVar) {
        Pair<InterfaceC6816a.a<?>, ?> pair = this.f9144X;
        if (pair == null || !pair.f38012a.equals(aVar)) {
            return null;
        }
        return (V) pair.f38013b;
    }
}
