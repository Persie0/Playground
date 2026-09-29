package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import mn.C7650g;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.j */
/* JADX INFO: loaded from: classes2.dex */
public class C9573j extends AbstractC6828b implements InterfaceC8828b {

    /* JADX INFO: renamed from: Z */
    public final boolean f49205Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9573j(InterfaceC8830c interfaceC8830c, InterfaceC6821b interfaceC6821b, InterfaceC9077e interfaceC9077e, boolean z10, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        super(kind, interfaceC8830c, interfaceC6821b, interfaceC8837f0, interfaceC9077e, C7650g.f42093e);
        if (interfaceC8830c == null) {
            m18027N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18027N(1);
            throw null;
        }
        if (kind == null) {
            m18027N(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18027N(3);
            throw null;
        }
        this.f49205Z = z10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18027N(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 == 21 && i10 != 27) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i10 == 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i10 != 27) {
                    switch (i10) {
                        case 15:
                        case 16:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case 17:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i10) {
                    case 4:
                    case 5:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "create";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String str2 = String.format(str, objArr);
                if (i10 == 21 && i10 != 27) {
                    switch (i10) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            throw new IllegalArgumentException(str2);
                    }
                }
                throw new IllegalStateException(str2);
            }
            objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 5:
                case 8:
                case 25:
                    objArr[0] = "annotations";
                    break;
                case 2:
                case 24:
                    objArr[0] = "kind";
                    break;
                case 3:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case 9:
                case 26:
                    objArr[0] = "source";
                    break;
                case 4:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                default:
                    objArr[0] = "containingDeclaration";
                    break;
                case 10:
                case 13:
                    objArr[0] = "unsubstitutedValueParameters";
                    break;
                case 11:
                case 14:
                    objArr[0] = "visibility";
                    break;
                case 12:
                    objArr[0] = "typeParameterDescriptors";
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 27:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
                case 20:
                    objArr[0] = "originalSubstitutor";
                    break;
                case 22:
                    objArr[0] = "overriddenDescriptors";
                    break;
                case 23:
                    objArr[0] = "newOwner";
                    break;
            }
            if (i10 == 21) {
                objArr[1] = "getOverriddenDescriptors";
            } else if (i10 != 27) {
                switch (i10) {
                    case 15:
                    case 16:
                        objArr[1] = "calculateContextReceiverParameters";
                        break;
                    case 17:
                        objArr[1] = "getContainingDeclaration";
                        break;
                    case 18:
                        objArr[1] = "getConstructedClass";
                        break;
                    case 19:
                        objArr[1] = "getOriginal";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                }
            } else {
                objArr[1] = "copy";
            }
            switch (i10) {
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "create";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                    objArr[2] = "createSynthesized";
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    objArr[2] = "initialize";
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 27:
                    break;
                case 20:
                    objArr[2] = "substitute";
                    break;
                case 22:
                    objArr[2] = "setOverriddenDescriptors";
                    break;
                case 23:
                case 24:
                case 25:
                case 26:
                    objArr[2] = "createSubstitutedCopy";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str3 = String.format(str, objArr);
            if (i10 == 21) {
            }
            throw new IllegalStateException(str3);
        }
        str = "@NotNull method %s.%s must not return null";
        i11 = i10 == 21 ? 2 : 2;
        objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "create";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str4 = String.format(str, objArr);
        if (i10 == 21) {
        }
        throw new IllegalStateException(str4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: B */
    public final CallableMemberDescriptor mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        return (InterfaceC8828b) super.mo11846B(interfaceC8838g, modality, abstractC8848l, kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14063l(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: G0 */
    public final void mo11847G0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        m18027N(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b
    /* JADX INFO: renamed from: H */
    public final boolean mo13614H() {
        return this.f49205Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b
    /* JADX INFO: renamed from: I */
    public final InterfaceC8830c mo13615I() {
        InterfaceC8830c interfaceC8830cMo11876g = mo11876g();
        if (interfaceC8830cMo11876g != null) {
            return interfaceC8830cMo11876g;
        }
        m18027N(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: P0 */
    public final InterfaceC6822c mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        return (InterfaceC8828b) super.mo11846B(interfaceC8838g, modality, abstractC8848l, kind);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8828b mo18004P0() {
        InterfaceC8828b interfaceC8828b = (InterfaceC8828b) super.mo18004P0();
        if (interfaceC8828b != null) {
            return interfaceC8828b;
        }
        m18027N(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8828b mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (InterfaceC8828b) super.mo5312d(typeSubstitutor);
        }
        m18027N(20);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C9573j mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        if (interfaceC8838g == null) {
            m18027N(23);
            throw null;
        }
        if (kind == null) {
            m18027N(24);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18027N(25);
            throw null;
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2 && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC8838g + "\nkind: " + kind);
        }
        return new C9573j((InterfaceC8830c) interfaceC8838g, this, interfaceC9077e, this.f49205Z, kind2, interfaceC8837f0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p420um.AbstractC9582o, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8830c mo11876g() {
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) super.mo11876g();
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        m18027N(17);
        throw null;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m18029g1(List list, AbstractC8852n abstractC8852n) {
        if (list == null) {
            m18027N(13);
            throw null;
        }
        if (abstractC8852n != null) {
            m18030h1(list, abstractC8852n, mo11876g().mo13604z());
        } else {
            m18027N(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: h1 */
    public final void m18030h1(List list, AbstractC8852n abstractC8852n, List list2) {
        InterfaceC8835e0 interfaceC8835e0Mo17092U0;
        List<InterfaceC8835e0> listEmptyList;
        if (list == null) {
            m18027N(10);
            throw null;
        }
        if (abstractC8852n == null) {
            m18027N(11);
            throw null;
        }
        if (list2 == null) {
            m18027N(12);
            throw null;
        }
        InterfaceC8830c interfaceC8830cMo11876g = mo11876g();
        if (interfaceC8830cMo11876g.mo13596U()) {
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8830cMo11876g.mo11876g();
            if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                interfaceC8835e0Mo17092U0 = ((InterfaceC8830c) interfaceC8838gMo11876g).mo17092U0();
            } else {
                interfaceC8835e0Mo17092U0 = null;
            }
        } else {
            interfaceC8835e0Mo17092U0 = null;
        }
        InterfaceC8830c interfaceC8830cMo11876g2 = mo11876g();
        if (interfaceC8830cMo11876g2.mo14140Q0().isEmpty()) {
            listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                m18027N(16);
                throw null;
            }
        } else {
            listEmptyList = interfaceC8830cMo11876g2.mo14140Q0();
            if (listEmptyList == null) {
                m18027N(15);
                throw null;
            }
        }
        mo13636Y0(null, interfaceC8835e0Mo17092U0, listEmptyList, list2, list, null, Modality.FINAL, abstractC8852n);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC6822c> mo11893p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m18027N(21);
        throw null;
    }
}
