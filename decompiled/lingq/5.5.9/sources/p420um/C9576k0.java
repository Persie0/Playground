package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import co.InterfaceC2076h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8413d;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9576k0 extends AbstractC9571i {

    /* JADX INFO: renamed from: H */
    public boolean f49209H;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2052l<AbstractC5257t, Void> f49210k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f49211l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9576k0(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, boolean z10, Variance variance, C7648e c7648e, int i10, InterfaceC2076h interfaceC2076h) {
        InterfaceC8843i0.a aVar = InterfaceC8843i0.a.f46732a;
        if (interfaceC8838g == null) {
            m18032N(19);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18032N(20);
            throw null;
        }
        if (variance == null) {
            m18032N(21);
            throw null;
        }
        if (c7648e == null) {
            m18032N(22);
            throw null;
        }
        if (interfaceC2076h == null) {
            m18032N(25);
            throw null;
        }
        super(interfaceC2076h, interfaceC8838g, interfaceC9077e, c7648e, variance, z10, i10, aVar);
        this.f49211l = new ArrayList(1);
        this.f49209H = false;
        this.f49210k = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18032N(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: Y0 */
    public static C9576k0 m18033Y0(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, boolean z10, Variance variance, C7648e c7648e, int i10, InterfaceC2076h interfaceC2076h) {
        if (interfaceC8838g == null) {
            m18032N(6);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18032N(7);
            throw null;
        }
        if (variance == null) {
            m18032N(8);
            throw null;
        }
        if (c7648e == null) {
            m18032N(9);
            throw null;
        }
        if (interfaceC2076h != null) {
            return new C9576k0(interfaceC8838g, interfaceC9077e, z10, variance, c7648e, i10, interfaceC2076h);
        }
        m18032N(11);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: Z0 */
    public static C9576k0 m18034Z0(InterfaceC8838g interfaceC8838g, Variance variance, C7648e c7648e, int i10, InterfaceC2076h interfaceC2076h) {
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        if (interfaceC8838g == null) {
            m18032N(0);
            throw null;
        }
        if (variance == null) {
            m18032N(2);
            throw null;
        }
        if (interfaceC2076h == null) {
            m18032N(4);
            throw null;
        }
        C9576k0 c9576k0M18033Y0 = m18033Y0(interfaceC8838g, c10670a, false, variance, c7648e, i10, interfaceC2076h);
        AbstractC5265x abstractC5265xM13559p = DescriptorUtilsKt.m14108e(interfaceC8838g).m13559p();
        c9576k0M18033Y0.m18035X0();
        if (!C7499b.m14926X(abstractC5265xM13559p)) {
            c9576k0M18033Y0.f49211l.add(abstractC5265xM13559p);
        }
        c9576k0M18033Y0.m18035X0();
        c9576k0M18033Y0.f49209H = true;
        return c9576k0M18033Y0;
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: V0 */
    public final void mo11214V0(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m18032N(27);
            throw null;
        }
        InterfaceC2052l<AbstractC5257t, Void> interfaceC2052l = this.f49210k;
        if (interfaceC2052l == null) {
            return;
        }
        interfaceC2052l.mo528n(abstractC5257t);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: W0 */
    public final List<AbstractC5257t> mo11215W0() {
        if (!this.f49209H) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m18036a1());
        }
        ArrayList arrayList = this.f49211l;
        if (arrayList != null) {
            return arrayList;
        }
        m18032N(28);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X0 */
    public final void m18035X0() {
        if (this.f49209H) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m18036a1());
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final String m18036a1() {
        return mo11874a() + " declared in " + C8413d.m16448g(mo11876g());
    }
}
