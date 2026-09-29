package p247lm;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import bo.InterfaceC1626d;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import dm.InterfaceC5211k;
import in.C6369m;
import in.InterfaceC6367k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import km.InterfaceC6718a;
import kn.AbstractC6731a;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C7024b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mo.C7661i;
import p338qd.C8578t;
import p347qm.C8646c;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8863u;
import p373rn.AbstractC8875g;
import p373rn.AbstractC8878j;
import p373rn.C8869a;
import p373rn.C8870b;
import p373rn.C8874f;
import p373rn.C8877i;
import p373rn.C8883o;
import p373rn.C8885q;
import p385sf.C9000b;
import p465wm.C9971a;
import p465wm.C9973c;
import p465wm.C9976f;
import p465wm.C9977g;
import p491xm.AbstractC10238m;
import p491xm.C10229d;
import p541zn.C10544h;
import p543do.AbstractC5257t;
import p543do.InterfaceC5246n0;
import sm.InterfaceC9073a;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9322j;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: renamed from: lm.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C7398k {

    /* JADX INFO: renamed from: a */
    public static final C7646c f41211a = new C7646c("kotlin.jvm.JvmStatic");

    /* JADX INFO: renamed from: lm.k$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41212a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f41212a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX INFO: renamed from: a */
    public static final KFunctionImpl m14790a(Object obj) {
        InterfaceC6718a interfaceC6718aMo13478c;
        KFunctionImpl kFunctionImpl = null;
        KFunctionImpl kFunctionImpl2 = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl2 == null) {
            FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
            if (functionReference != null) {
                interfaceC6718aMo13478c = functionReference.f38111a;
                if (interfaceC6718aMo13478c == null) {
                    interfaceC6718aMo13478c = functionReference.mo13478c();
                    functionReference.f38111a = interfaceC6718aMo13478c;
                }
                if (interfaceC6718aMo13478c instanceof KFunctionImpl) {
                    return (KFunctionImpl) interfaceC6718aMo13478c;
                }
            } else {
                interfaceC6718aMo13478c = null;
            }
            if (interfaceC6718aMo13478c instanceof KFunctionImpl) {
                return (KFunctionImpl) interfaceC6718aMo13478c;
            }
        } else {
            kFunctionImpl = kFunctionImpl2;
        }
        return kFunctionImpl;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m14791b(InterfaceC9073a interfaceC9073a) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        List listM17251q;
        Annotation annotationM14796g;
        C5207g.m11111f(interfaceC9073a, "<this>");
        InterfaceC9077e interfaceC9077eMo11289w = interfaceC9073a.mo11289w();
        ArrayList<Annotation> arrayList = new ArrayList();
        for (InterfaceC9075c interfaceC9075c : interfaceC9077eMo11289w) {
            InterfaceC8837f0 interfaceC8837f0Mo12516j = interfaceC9075c.mo12516j();
            if (interfaceC8837f0Mo12516j instanceof C9971a) {
                annotationM14796g = ((C9971a) interfaceC8837f0Mo12516j).f50695b;
            } else if (interfaceC8837f0Mo12516j instanceof C9977g.a) {
                AbstractC10238m abstractC10238m = ((C9977g.a) interfaceC8837f0Mo12516j).f50705b;
                C10229d c10229d = abstractC10238m instanceof C10229d ? (C10229d) abstractC10238m : null;
                annotationM14796g = c10229d != null ? c10229d.f51659a : null;
            } else {
                annotationM14796g = m14796g(interfaceC9075c);
            }
            if (annotationM14796g != null) {
                arrayList.add(annotationM14796g);
            }
        }
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (C5207g.m11106a(C5206f.m10998T0(C5206f.m10995P0((Annotation) it.next())).getSimpleName(), "Container")) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : arrayList) {
                Class clsM10998T0 = C5206f.m10998T0(C5206f.m10995P0(annotation));
                if (!C5207g.m11106a(clsM10998T0.getSimpleName(), "Container") || clsM10998T0.getAnnotation(InterfaceC5211k.class) == null) {
                    listM17251q = C9000b.m17251q(annotation);
                } else {
                    Object objInvoke = clsM10998T0.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    listM17251q = C9322j.m17670X((Annotation[]) objInvoke);
                }
                C9327o.m17684D(listM17251q, arrayList2);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static final Object m14792c(Class cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        if (C5207g.m11106a(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C5207g.m11106a(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (C5207g.m11106a(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C5207g.m11106a(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (C5207g.m11106a(cls, Integer.TYPE)) {
            return 0;
        }
        if (C5207g.m11106a(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C5207g.m11106a(cls, Long.TYPE)) {
            return 0L;
        }
        if (C5207g.m11106a(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C5207g.m11106a(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + cls);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6816a m14793d(Class cls, GeneratedMessageLite.ExtendableMessage extendableMessage, InterfaceC6733c interfaceC6733c, C6735e c6735e, AbstractC6731a abstractC6731a, InterfaceC2056p interfaceC2056p) {
        List<ProtoBuf$TypeParameter> list;
        C5207g.m11111f(cls, "moduleAnchor");
        C5207g.m11111f(extendableMessage, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6735e, "typeTable");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        C5207g.m11111f(interfaceC2056p, "createDescriptor");
        C9976f c9976fM14782a = C7395h.m14782a(cls);
        if (extendableMessage instanceof ProtoBuf$Function) {
            list = ((ProtoBuf$Function) extendableMessage).f39130i;
        } else {
            if (!(extendableMessage instanceof ProtoBuf$Property)) {
                throw new IllegalStateException(("Unsupported message: " + extendableMessage).toString());
            }
            list = ((ProtoBuf$Property) extendableMessage).f39198i;
        }
        List<ProtoBuf$TypeParameter> list2 = list;
        C10544h c10544h = c9976fM14782a.f50702a;
        InterfaceC8863u interfaceC8863u = c10544h.f52580b;
        C6736f c6736f = C6736f.f37996b;
        C5207g.m11110e(list2, "typeParameters");
        return (InterfaceC6816a) interfaceC2056p.mo1337m0(new MemberDeserializer(new C8578t(c10544h, interfaceC6733c, interfaceC8863u, c6735e, c6736f, abstractC6731a, (InterfaceC1626d) null, (TypeDeserializer) null, list2)), extendableMessage);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8835e0 m14794e(InterfaceC6816a interfaceC6816a) {
        C5207g.m11111f(interfaceC6816a, "<this>");
        if (interfaceC6816a.mo11892m0() == null) {
            return null;
        }
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC6816a.mo11876g();
        C5207g.m11109d(interfaceC8838gMo11876g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC8830c) interfaceC8838gMo11876g).mo17092U0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static final Class<?> m14795f(ClassLoader classLoader, C7645b c7645b, int i10) {
        String str = C8646c.f46201a;
        C7647d c7647dM15221i = c7645b.m15204b().m15221i();
        C5207g.m11110e(c7647dM15221i, "kotlinClassId.asSingleFqName().toUnsafe()");
        C7645b c7645bM16869g = C8646c.m16869g(c7647dM15221i);
        if (c7645bM16869g != null) {
            c7645b = c7645bM16869g;
        }
        String strM15214b = c7645b.m15208h().m15214b();
        String strM15214b2 = c7645b.m15209i().m15214b();
        if (C5207g.m11106a(strM15214b, "kotlin")) {
            switch (strM15214b2.hashCode()) {
                case -901856463:
                    if (strM15214b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strM15214b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strM15214b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strM15214b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strM15214b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strM15214b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strM15214b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strM15214b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strM15214b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str2 = strM15214b + '.' + C7661i.m15253S2(strM15214b2, '.', '$');
        if (i10 > 0) {
            str2 = C7661i.m15252R2(i10, "[") + 'L' + str2 + ';';
        }
        return C0062b.m403u2(classLoader, str2);
    }

    /* JADX INFO: renamed from: g */
    public static final Annotation m14796g(InterfaceC9075c interfaceC9075c) {
        InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(interfaceC9075c);
        Class<?> clsM14797h = interfaceC8830cM14107d != null ? m14797h(interfaceC8830cM14107d) : null;
        if (!(clsM14797h instanceof Class)) {
            clsM14797h = null;
        }
        if (clsM14797h == null) {
            return null;
        }
        Set<Map.Entry<C7648e, AbstractC8875g<?>>> setEntrySet = interfaceC9075c.mo12513a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Map.Entry entry = (Map.Entry) it.next();
                C7648e c7648e = (C7648e) entry.getKey();
                AbstractC8875g abstractC8875g = (AbstractC8875g) entry.getValue();
                ClassLoader classLoader = clsM14797h.getClassLoader();
                C5207g.m11110e(classLoader, "annotationClass.classLoader");
                Object objM14798i = m14798i(abstractC8875g, classLoader);
                Pair pair = objM14798i != null ? new Pair(c7648e.m15235f(), objM14798i) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
        }
        Map mapM13464Q0 = C6753d.m13464Q0(arrayList);
        Set setKeySet = mapM13464Q0.keySet();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM14797h.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return (Annotation) AnnotationConstructorCallerKt.m13525a(clsM14797h, mapM13464Q0, arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public static final Class<?> m14797h(InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC8830c, "<this>");
        InterfaceC8837f0 interfaceC8837f0Mo11890j = interfaceC8830c.mo11890j();
        C5207g.m11110e(interfaceC8837f0Mo11890j, "source");
        if (interfaceC8837f0Mo11890j instanceof C6369m) {
            InterfaceC6367k interfaceC6367k = ((C6369m) interfaceC8837f0Mo11890j).f36758b;
            C5207g.m11109d(interfaceC6367k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C9973c) interfaceC6367k).f50697a;
        }
        if (interfaceC8837f0Mo11890j instanceof C9977g.a) {
            AbstractC10238m abstractC10238m = ((C9977g.a) interfaceC8837f0Mo11890j).f50705b;
            C5207g.m11109d(abstractC10238m, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C6831a) abstractC10238m).f38594a;
        }
        C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c);
        if (c7645bM14109f == null) {
            return null;
        }
        return m14795f(ReflectClassUtilKt.m13651d(interfaceC8830c.getClass()), c7645bM14109f, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r11v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r11v20, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r11v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r11v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [double[]] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m14798i(AbstractC8875g<?> abstractC8875g, ClassLoader classLoader) {
        AbstractC5257t abstractC5257t;
        Class<?> clsM14795f;
        short[] sArr;
        if (abstractC8875g instanceof C8869a) {
            return m14796g((InterfaceC9075c) ((C8869a) abstractC8875g).f46772a);
        }
        int i10 = 0;
        if (abstractC8875g instanceof C8870b) {
            C8870b c8870b = (C8870b) abstractC8875g;
            C7024b c7024b = c8870b instanceof C7024b ? (C7024b) c8870b : null;
            if (c7024b != null && (abstractC5257t = c7024b.f39748c) != null) {
                Iterable iterable = (Iterable) c8870b.f46772a;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(m14798i((AbstractC8875g) it.next(), classLoader));
                }
                C7648e c7648e = AbstractC6795c.f38322e;
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
                PrimitiveType primitiveTypeM13543s = interfaceC8834eMo11235q == null ? null : AbstractC6795c.m13543s(interfaceC8834eMo11235q);
                int i11 = primitiveTypeM13543s == null ? -1 : a.f41212a[primitiveTypeM13543s.ordinal()];
                Object obj = c8870b.f46772a;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        if (!AbstractC6795c.m13546z(abstractC5257t)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC5257t).toString());
                        }
                        AbstractC5257t abstractC5257tMo11236c = ((InterfaceC5246n0) C6752c.m13443k0(abstractC5257t.mo11240V0())).mo11236c();
                        C5207g.m11110e(abstractC5257tMo11236c, "type.arguments.single().type");
                        InterfaceC8834e interfaceC8834eMo11235q2 = abstractC5257tMo11236c.mo11250X0().mo11235q();
                        InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q2 : null;
                        if (interfaceC8830c == null) {
                            throw new IllegalStateException(("Not a class type: " + abstractC5257tMo11236c).toString());
                        }
                        if (!AbstractC6795c.m13537J(abstractC5257tMo11236c)) {
                            if (AbstractC6795c.m13542c(interfaceC8830c, C6797e.a.f38364P)) {
                                int size = ((List) obj).size();
                                sArr = new Class[size];
                                while (i10 < size) {
                                    Object obj2 = arrayList.get(i10);
                                    C5207g.m11109d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    sArr[i10] = (Class) obj2;
                                    i10++;
                                }
                            } else {
                                C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c);
                                if (c7645bM14109f != null && (clsM14795f = m14795f(classLoader, c7645bM14109f, 0)) != null) {
                                    Object objNewInstance = Array.newInstance(clsM14795f, ((List) obj).size());
                                    C5207g.m11109d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                    Object[] objArr = (Object[]) objNewInstance;
                                    int size2 = arrayList.size();
                                    while (i10 < size2) {
                                        objArr[i10] = arrayList.get(i10);
                                        i10++;
                                    }
                                    return objArr;
                                }
                            }
                            break;
                        } else {
                            int size3 = ((List) obj).size();
                            sArr = new String[size3];
                            while (i10 < size3) {
                                Object obj3 = arrayList.get(i10);
                                C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.String");
                                sArr[i10] = (String) obj3;
                                i10++;
                            }
                        }
                        return sArr;
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        sArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            sArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        return sArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        sArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            C5207g.m11109d(obj5, "null cannot be cast to non-null type kotlin.Char");
                            sArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        return sArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        sArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            C5207g.m11109d(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            sArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        return sArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            C5207g.m11109d(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        sArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            C5207g.m11109d(obj8, "null cannot be cast to non-null type kotlin.Int");
                            sArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        return sArr;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        int size9 = ((List) obj).size();
                        sArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            C5207g.m11109d(obj9, "null cannot be cast to non-null type kotlin.Float");
                            sArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        return sArr;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        int size10 = ((List) obj).size();
                        sArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            C5207g.m11109d(obj10, "null cannot be cast to non-null type kotlin.Long");
                            sArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        return sArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        sArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            C5207g.m11109d(obj11, "null cannot be cast to non-null type kotlin.Double");
                            sArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        return sArr;
                }
            }
            return null;
        }
        if (abstractC8875g instanceof C8877i) {
            Pair pair = (Pair) ((C8877i) abstractC8875g).f46772a;
            C7645b c7645b = (C7645b) pair.f38012a;
            C7648e c7648e2 = (C7648e) pair.f38013b;
            Class<?> clsM14795f2 = m14795f(classLoader, c7645b, 0);
            if (clsM14795f2 != null) {
                return Enum.valueOf(clsM14795f2, c7648e2.m15235f());
            }
        } else if (abstractC8875g instanceof C8883o) {
            C8883o.a aVar = (C8883o.a) ((C8883o) abstractC8875g).f46772a;
            if (aVar instanceof C8883o.a.b) {
                C8874f c8874f = ((C8883o.a.b) aVar).f46777a;
                return m14795f(classLoader, c8874f.f46770a, c8874f.f46771b);
            }
            if (!(aVar instanceof C8883o.a.C10669a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC8834e interfaceC8834eMo11235q3 = ((C8883o.a.C10669a) aVar).f46776a.mo11250X0().mo11235q();
            InterfaceC8830c interfaceC8830c2 = interfaceC8834eMo11235q3 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q3 : null;
            if (interfaceC8830c2 != null) {
                return m14797h(interfaceC8830c2);
            }
        } else if (!(abstractC8875g instanceof AbstractC8878j ? true : abstractC8875g instanceof C8885q)) {
            return abstractC8875g.mo17122b();
        }
        return null;
    }
}
