package kotlin.reflect.jvm.internal;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5209i;
import dm.InterfaceC5202b;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import km.InterfaceC6719b;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import p247lm.C7393f;
import p247lm.C7395h;
import p247lm.C7396i;
import p247lm.C7398k;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8838g;
import p465wm.C9976f;
import p466wn.InterfaceC9985h;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KDeclarationContainerImpl implements InterfaceC5202b {

    /* JADX INFO: renamed from: a */
    public static final Regex f38196a = new Regex("<v#(\\d+)>");

    public abstract class Data {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f38197b = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a */
        public final C7396i.a f38198a;

        public Data(final KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f38198a = C7396i.m14785c(new InterfaceC2041a<C9976f>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9976f mo807E() {
                    return C7395h.m14782a(kDeclarationContainerImpl.mo10973b());
                }
            });
        }
    }

    @Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13365d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor member) {
            C5207g.m11111f(member, "member");
            return member.mo11897u().isReal() == (this == DECLARED);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Method m13500k(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class clsM403u2;
        Method methodM13500k;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodM13501r = m13501r(cls, str, clsArr, cls2);
        if (methodM13501r != null) {
            return methodM13501r;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM13500k = m13500k(superclass, str, clsArr, cls2, z10)) != null) {
            return methodM13500k;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C5207g.m11110e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            C5207g.m11110e(cls3, "superInterface");
            Method methodM13500k2 = m13500k(cls3, str, clsArr, cls2, z10);
            if (methodM13500k2 != null) {
                return methodM13500k2;
            }
            if (z10 && (clsM403u2 = C0062b.m403u2(ReflectClassUtilKt.m13651d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM13501r2 = m13501r(clsM403u2, str, clsArr, cls2);
                if (methodM13501r2 != null) {
                    return methodM13501r2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Method m13501r(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C5207g.m11106a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C5207g.m11110e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (C5207g.m11106a(method.getName(), str) && C5207g.m11106a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Method m13502c(String str, String str2) {
        Method methodM13500k;
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "desc");
        if (C5207g.m11106a(str, "<init>")) {
            return null;
        }
        Object[] array = m13505j(str2).toArray(new Class[0]);
        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class[] clsArr = (Class[]) array;
        Class<?> clsM13506l = m13506l(str2, C7076b.m14284d3(str2, ')', 0, false, 6) + 1, str2.length());
        Method methodM13500k2 = m13500k(mo13504h(), str, clsArr, clsM13506l, false);
        if (methodM13500k2 != null) {
            return methodM13500k2;
        }
        if (!mo13504h().isInterface() || (methodM13500k = m13500k(Object.class, str, clsArr, clsM13506l, false)) == null) {
            return null;
        }
        return methodM13500k;
    }

    /* JADX INFO: renamed from: d */
    public abstract Collection<InterfaceC6821b> mo13491d();

    /* JADX INFO: renamed from: e */
    public abstract Collection<InterfaceC6822c> mo13492e(C7648e c7648e);

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC8829b0 mo13493f(int i10);

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX INFO: renamed from: g */
    public final List m13503g(MemberScope memberScope, MemberBelonginess memberBelonginess) {
        KCallableImpl kCallableImpl;
        C5207g.m11111f(memberScope, "scope");
        C5207g.m11111f(memberBelonginess, "belonginess");
        C7393f c7393f = new C7393f(this);
        Collection<InterfaceC8838g> collectionM18558a = InterfaceC9985h.a.m18558a(memberScope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8838g interfaceC8838g : collectionM18558a) {
            if (interfaceC8838g instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) interfaceC8838g;
                if (C5207g.m11106a(callableMemberDescriptor.mo11886f(), C8850m.f46741h) || !memberBelonginess.accept(callableMemberDescriptor)) {
                    kCallableImpl = null;
                } else {
                    kCallableImpl = (KCallableImpl) interfaceC8838g.mo11871C(c7393f, C9072e.f47360a);
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return C6752c.m13453u0(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public Class<?> mo13504h() {
        Class<?> clsMo10973b = mo10973b();
        List<InterfaceC6719b<? extends Object>> list = ReflectClassUtilKt.f38580a;
        C5207g.m11111f(clsMo10973b, "<this>");
        Class<? extends Object> cls = ReflectClassUtilKt.f38582c.get(clsMo10973b);
        return cls == null ? mo10973b() : cls;
    }

    /* JADX INFO: renamed from: i */
    public abstract Collection<InterfaceC8829b0> mo13494i(C7648e c7648e);

    /* JADX INFO: renamed from: j */
    public final ArrayList m13505j(String str) {
        int iM14284d3;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (C7076b.m14279Y2("VZCBSIFJD", cCharAt)) {
                iM14284d3 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iM14284d3 = C7076b.m14284d3(str, ';', i10, false, 4) + 1;
            }
            arrayList.add(m13506l(str, i10, iM14284d3));
            i10 = iM14284d3;
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final Class<?> m13506l(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderM13651d = ReflectClassUtilKt.m13651d(mo10973b());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderM13651d.loadClass(C7661i.m15253S2(strSubstring, '/', '.'));
            C5207g.m11110e(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class<?> clsM13506l = m13506l(str, i10 + 1, i11);
            C7646c c7646c = C7398k.f41211a;
            C5207g.m11111f(clsM13506l, "<this>");
            return Array.newInstance(clsM13506l, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class<?> cls = Void.TYPE;
            C5207g.m11110e(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
    }
}
