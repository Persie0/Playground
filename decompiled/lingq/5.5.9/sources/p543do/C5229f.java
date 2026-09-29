package p543do;

import androidx.datastore.preferences.PreferencesProto$Value;
import co.InterfaceC2076h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import mn.C7647d;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8843i0;
import p372rm.InterfaceC8847k0;
import pn.C8413d;

/* JADX INFO: renamed from: do.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5229f extends AbstractC5221b {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8830c f33317c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC8847k0> f33318d;

    /* JADX INFO: renamed from: e */
    public final Collection<AbstractC5257t> f33319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5229f(InterfaceC8830c interfaceC8830c, List<? extends InterfaceC8847k0> list, Collection<AbstractC5257t> collection, InterfaceC2076h interfaceC2076h) {
        super(interfaceC2076h);
        if (interfaceC8830c == null) {
            m11257k(0);
            throw null;
        }
        if (list == null) {
            m11257k(1);
            throw null;
        }
        if (collection == null) {
            m11257k(2);
            throw null;
        }
        if (interfaceC2076h == null) {
            m11257k(3);
            throw null;
        }
        this.f33317c = interfaceC8830c;
        this.f33318d = Collections.unmodifiableList(new ArrayList(list));
        this.f33319e = Collections.unmodifiableCollection(collection);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m11257k(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: d */
    public final Collection<AbstractC5257t> mo11258d() {
        Collection<AbstractC5257t> collection = this.f33319e;
        if (collection != null) {
            return collection;
        }
        m11257k(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: g */
    public final InterfaceC8843i0 mo11259g() {
        return InterfaceC8843i0.a.f46732a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.AbstractC5221b
    /* JADX INFO: renamed from: l */
    public final InterfaceC8830c mo11235q() {
        InterfaceC8830c interfaceC8830c = this.f33317c;
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        m11257k(5);
        throw null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        List<InterfaceC8847k0> list = this.f33318d;
        if (list != null) {
            return list;
        }
        m11257k(4);
        throw null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String str = C8413d.m16448g(this.f33317c).f42082a;
        if (str != null) {
            return str;
        }
        C7647d.m15222a(4);
        throw null;
    }
}
