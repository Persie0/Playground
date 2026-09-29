package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import androidx.datastore.preferences.PreferencesProto$Value;
import bn.InterfaceC1617a;
import dm.C5206f;
import dm.C5207g;
import io.AbstractC6379f;
import io.InterfaceC6378e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.util.C7068a;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.text.Regex;
import mn.C7648e;
import p123fn.InterfaceC5593a;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8853n0;
import p420um.C9568g0;
import p420um.C9570h0;
import p543do.AbstractC5257t;
import pn.C8412c;
import sm.InterfaceC9077e;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaMethodDescriptor extends C9570h0 implements InterfaceC1617a {

    /* JADX INFO: renamed from: b0 */
    public static final C6844a f38656b0 = new C6844a();

    /* JADX INFO: renamed from: c0 */
    public static final C6845b f38657c0 = new C6845b();

    /* JADX INFO: renamed from: Z */
    public ParameterNamesStatus f38658Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f38659a0;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        ParameterNamesStatus(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        public static ParameterNamesStatus get(boolean z10, boolean z11) {
            ParameterNamesStatus parameterNamesStatus;
            if (z10) {
                parameterNamesStatus = z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                parameterNamesStatus = z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$a */
    public static class C6844a implements InterfaceC6816a.a<InterfaceC8853n0> {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$b */
    public static class C6845b implements InterfaceC6816a.a<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public JavaMethodDescriptor(InterfaceC8838g interfaceC8838g, InterfaceC6824e interfaceC6824e, InterfaceC9077e interfaceC9077e, C7648e c7648e, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0, boolean z10) {
        super(interfaceC8838g, interfaceC6824e, interfaceC9077e, c7648e, kind, interfaceC8837f0);
        if (interfaceC8838g == null) {
            m13677N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m13677N(1);
            throw null;
        }
        if (c7648e == null) {
            m13677N(2);
            throw null;
        }
        if (kind == null) {
            m13677N(3);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m13677N(4);
            throw null;
        }
        this.f38658Z = null;
        this.f38659a0 = z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13677N(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j1 */
    public static JavaMethodDescriptor m13678j1(InterfaceC8838g interfaceC8838g, LazyJavaAnnotations lazyJavaAnnotations, C7648e c7648e, InterfaceC5593a interfaceC5593a, boolean z10) {
        if (interfaceC8838g == null) {
            m13677N(5);
            throw null;
        }
        if (c7648e == null) {
            m13677N(7);
            throw null;
        }
        if (interfaceC5593a != null) {
            return new JavaMethodDescriptor(interfaceC8838g, null, lazyJavaAnnotations, c7648e, CallableMemberDescriptor.Kind.DECLARATION, interfaceC5593a, z10);
        }
        m13677N(8);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // bn.InterfaceC1617a
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC1617a mo5275D0(AbstractC5257t abstractC5257t, ArrayList arrayList, AbstractC5257t abstractC5257t2, Pair pair) {
        ArrayList arrayListM10982C0 = C5206f.m10982C0(arrayList, mo11889i(), this);
        C9568g0 c9568g0M16438g = abstractC5257t == null ? null : C8412c.m16438g(this, abstractC5257t, InterfaceC9077e.a.f47365a);
        AbstractC6828b.a aVar = (AbstractC6828b.a) mo11848M0();
        aVar.f38546g = arrayListM10982C0;
        aVar.mo11855e(abstractC5257t2);
        aVar.f38548i = c9568g0M16438g;
        aVar.f38555p = true;
        aVar.f38554o = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar.mo11851a();
        if (pair != null) {
            javaMethodDescriptor.m13638a1((InterfaceC6816a.a) pair.f38012a, pair.f38013b);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        m13677N(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return this.f38658Z.isSynthesized;
    }

    @Override // p420um.C9570h0, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        if (interfaceC8838g == null) {
            m13677N(14);
            throw null;
        }
        if (kind == null) {
            m13677N(15);
            throw null;
        }
        if (interfaceC9077e == null) {
            m13677N(16);
            throw null;
        }
        InterfaceC6824e interfaceC6824e = (InterfaceC6824e) interfaceC6822c;
        if (c7648e == null) {
            c7648e = mo11874a();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(interfaceC8838g, interfaceC6824e, interfaceC9077e, c7648e, kind, interfaceC8837f0, this.f38659a0);
        ParameterNamesStatus parameterNamesStatus = this.f38658Z;
        javaMethodDescriptor.m13680k1(parameterNamesStatus.isStable, parameterNamesStatus.isSynthesized);
        return javaMethodDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[LOOP:1: B:31:0x0078->B:35:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:11:0x001f->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p420um.C9570h0
    /* JADX INFO: renamed from: i1 */
    public final C9570h0 mo13679i1(C9568g0 c9568g0, InterfaceC8835e0 interfaceC8835e0, List list, List list2, List list3, AbstractC5257t abstractC5257t, Modality modality, AbstractC8852n abstractC8852n, Map map) {
        AbstractC6379f bVar;
        boolean z10;
        String strMo528n;
        String strMo13009a;
        if (list == null) {
            m13677N(9);
            throw null;
        }
        if (list2 == null) {
            m13677N(10);
            throw null;
        }
        if (list3 == null) {
            m13677N(11);
            throw null;
        }
        if (abstractC8852n == null) {
            m13677N(12);
            throw null;
        }
        super.mo13679i1(c9568g0, interfaceC8835e0, list, list2, list3, abstractC5257t, modality, abstractC8852n, map);
        OperatorChecks.f39923a.getClass();
        for (C7068a c7068a : OperatorChecks.f39924b) {
            c7068a.getClass();
            C7648e c7648e = c7068a.f39939a;
            if (c7648e == null || C5207g.m11106a(mo11874a(), c7648e)) {
                Regex regex = c7068a.f39940b;
                if (regex != null) {
                    String strM15235f = mo11874a().m15235f();
                    C5207g.m11110e(strM15235f, "functionDescriptor.name.asString()");
                    if (regex.m14271b(strM15235f)) {
                        Collection<C7648e> collection = c7068a.f39941c;
                        z10 = collection != null || collection.contains(mo11874a());
                    }
                } else {
                    Collection<C7648e> collection2 = c7068a.f39941c;
                    if (collection2 != null) {
                    }
                }
                if (z10) {
                    for (InterfaceC6378e interfaceC6378e : c7068a.f39943e) {
                        strMo13009a = interfaceC6378e.mo13009a(this);
                        if (strMo13009a != null) {
                            bVar = new AbstractC6379f.b(strMo13009a);
                            this.f38514H = bVar.f36780a;
                            return this;
                        }
                    }
                    strMo528n = c7068a.f39942d.mo528n(this);
                    if (strMo528n != null) {
                        bVar = new AbstractC6379f.b(strMo528n);
                    } else {
                        bVar = AbstractC6379f.c.f36782b;
                    }
                    this.f38514H = bVar.f36780a;
                    return this;
                }
            }
            if (z10) {
                while (i < r7) {
                    strMo13009a = interfaceC6378e.mo13009a(this);
                    if (strMo13009a != null) {
                        bVar = new AbstractC6379f.b(strMo13009a);
                        this.f38514H = bVar.f36780a;
                        return this;
                    }
                }
                strMo528n = c7068a.f39942d.mo528n(this);
                if (strMo528n != null) {
                    bVar = new AbstractC6379f.b(strMo528n);
                } else {
                    bVar = AbstractC6379f.c.f36782b;
                }
                this.f38514H = bVar.f36780a;
                return this;
            }
        }
        bVar = AbstractC6379f.a.f36781b;
        this.f38514H = bVar.f36780a;
        return this;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m13680k1(boolean z10, boolean z11) {
        this.f38658Z = ParameterNamesStatus.get(z10, z11);
    }
}
