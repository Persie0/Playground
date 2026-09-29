package kotlin.reflect.jvm.internal;

import androidx.activity.result.C0204c;
import cm.InterfaceC2041a;
import cm.InterfaceC2042b;
import cm.InterfaceC2043c;
import cm.InterfaceC2044d;
import cm.InterfaceC2045e;
import cm.InterfaceC2046f;
import cm.InterfaceC2047g;
import cm.InterfaceC2048h;
import cm.InterfaceC2049i;
import cm.InterfaceC2050j;
import cm.InterfaceC2051k;
import cm.InterfaceC2052l;
import cm.InterfaceC2053m;
import cm.InterfaceC2054n;
import cm.InterfaceC2055o;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import cm.InterfaceC2059s;
import cm.InterfaceC2060t;
import cm.InterfaceC2061u;
import cm.InterfaceC2062v;
import cm.InterfaceC2063w;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import dm.InterfaceC5205e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6722e;
import km.InterfaceC6727j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import mm.AbstractC7640c;
import mm.InterfaceC7639b;
import mn.C7645b;
import mn.C7648e;
import p247lm.C7396i;
import p247lm.C7397j;
import p247lm.C7398k;
import p248ln.AbstractC7403d;
import p260m8.C7499b;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;
import pn.C8413d;
import pn.C8414e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements InterfaceC5205e<Object>, InterfaceC6722e<Object>, InterfaceC2041a, InterfaceC2052l, InterfaceC2042b, InterfaceC2043c, InterfaceC2044d, InterfaceC2045e, InterfaceC2046f, InterfaceC2047g, InterfaceC2048h, InterfaceC2049i, InterfaceC2050j, InterfaceC2051k, InterfaceC2056p, InterfaceC2053m, InterfaceC2054n, InterfaceC2055o, InterfaceC2057q, InterfaceC2058r, InterfaceC2059s, InterfaceC2060t, InterfaceC2061u, InterfaceC2062v, InterfaceC2063w {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38202g = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* JADX INFO: renamed from: b */
    public final KDeclarationContainerImpl f38203b;

    /* JADX INFO: renamed from: c */
    public final String f38204c;

    /* JADX INFO: renamed from: d */
    public final Object f38205d;

    /* JADX INFO: renamed from: e */
    public final C7396i.a f38206e;

    /* JADX INFO: renamed from: f */
    public final C7396i.b f38207f;

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, InterfaceC6822c interfaceC6822c, Object obj) {
        this.f38203b = kDeclarationContainerImpl;
        this.f38204c = str2;
        this.f38205d = obj;
        this.f38206e = new C7396i.a(interfaceC6822c, new InterfaceC2041a<InterfaceC6822c>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC6822c mo807E() {
                KFunctionImpl kFunctionImpl = this.f38209b;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.f38203b;
                kDeclarationContainerImpl2.getClass();
                String str3 = str;
                C5207g.m11111f(str3, "name");
                String str4 = kFunctionImpl.f38204c;
                C5207g.m11111f(str4, "signature");
                Collection<InterfaceC6822c> collectionM13453u0 = C5207g.m11106a(str3, "<init>") ? C6752c.m13453u0(kDeclarationContainerImpl2.mo13491d()) : kDeclarationContainerImpl2.mo13492e(C7648e.m15232l(str3));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionM13453u0) {
                    if (C5207g.m11106a(C7397j.m14789c((InterfaceC6822c) obj2).mo13485a(), str4)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC6822c) C6752c.m13443k0(arrayList);
                }
                String strM13430X = C6752c.m13430X(collectionM13453u0, "\n", null, null, new InterfaceC2052l<InterfaceC6822c, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final CharSequence mo528n(InterfaceC6822c interfaceC6822c2) {
                        InterfaceC6822c interfaceC6822c3 = interfaceC6822c2;
                        C5207g.m11111f(interfaceC6822c3, "descriptor");
                        return DescriptorRenderer.f39547b.m14003G(interfaceC6822c3) + " | " + C7397j.m14789c(interfaceC6822c3).mo13485a();
                    }
                }, 30);
                StringBuilder sbM855o = C0204c.m855o("Function '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                sbM855o.append(kDeclarationContainerImpl2);
                sbM855o.append(':');
                sbM855o.append(strM13430X.length() == 0 ? " no members found" : "\n".concat(strM13430X));
                throw new KotlinReflectionInternalError(sbM855o.toString());
            }
        });
        this.f38207f = new C7396i.b(new InterfaceC2041a<InterfaceC7639b<? extends Member>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7639b<? extends Member> mo807E() {
                Object objM13502c;
                AbstractC7640c cVar;
                AbstractC7640c abstractC7640cM13507i;
                C7645b c7645b = C7397j.f41210a;
                KFunctionImpl kFunctionImpl = this.f38208b;
                JvmFunctionSignature jvmFunctionSignatureM14789c = C7397j.m14789c(kFunctionImpl.mo13488e());
                boolean z10 = jvmFunctionSignatureM14789c instanceof JvmFunctionSignature.C6767b;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.f38203b;
                if (z10) {
                    if (kFunctionImpl.m13489f()) {
                        Class<?> clsMo10973b = kDeclarationContainerImpl2.mo10973b();
                        ArrayList<KParameter> arrayListMo807E = kFunctionImpl.f38142a.mo807E();
                        C5207g.m11110e(arrayListMo807E, "_parameters()");
                        ArrayList<KParameter> arrayList = arrayListMo807E;
                        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String strMo13483a = ((KParameter) it.next()).mo13483a();
                            C5207g.m11108c(strMo13483a);
                            arrayList2.add(strMo13483a);
                        }
                        return new AnnotationConstructorCaller(clsMo10973b, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN);
                    }
                    String str3 = ((JvmFunctionSignature.C6767b) jvmFunctionSignatureM14789c).f38138a.f41221b;
                    kDeclarationContainerImpl2.getClass();
                    C5207g.m11111f(str3, "desc");
                    Class<?> clsMo10973b2 = kDeclarationContainerImpl2.mo10973b();
                    try {
                        Object[] array = kDeclarationContainerImpl2.m13505j(str3).toArray(new Class[0]);
                        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        Class[] clsArr = (Class[]) array;
                        objM13502c = clsMo10973b2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        objM13502c = null;
                    }
                } else if (jvmFunctionSignatureM14789c instanceof JvmFunctionSignature.C6768c) {
                    AbstractC7403d.b bVar = ((JvmFunctionSignature.C6768c) jvmFunctionSignatureM14789c).f38140a;
                    objM13502c = kDeclarationContainerImpl2.m13502c(bVar.f41220a, bVar.f41221b);
                } else if (jvmFunctionSignatureM14789c instanceof JvmFunctionSignature.C6766a) {
                    objM13502c = ((JvmFunctionSignature.C6766a) jvmFunctionSignatureM14789c).f38137a;
                } else {
                    if (!(jvmFunctionSignatureM14789c instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureM14789c instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Class<?> clsMo10973b3 = kDeclarationContainerImpl2.mo10973b();
                        List<Method> list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureM14789c).f38133a;
                        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(clsMo10973b3, arrayList3, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, list);
                    }
                    objM13502c = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureM14789c).f38135a;
                }
                if (objM13502c instanceof Constructor) {
                    abstractC7640cM13507i = KFunctionImpl.m13507i(kFunctionImpl, (Constructor) objM13502c, kFunctionImpl.mo13488e(), false);
                } else {
                    if (!(objM13502c instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.mo13488e() + " (member = " + objM13502c + ')');
                    }
                    Method method = (Method) objM13502c;
                    boolean zIsStatic = Modifier.isStatic(method.getModifiers());
                    Object obj2 = kFunctionImpl.f38205d;
                    if (!zIsStatic) {
                        cVar = kFunctionImpl.mo13490g() ? new AbstractC7640c.g.a(C7499b.m14947k(obj2, kFunctionImpl.mo13488e()), method) : new AbstractC7640c.g.d(method);
                    } else if (kFunctionImpl.mo13488e().mo11289w().mo5291h(C7398k.f41211a) != null) {
                        cVar = kFunctionImpl.mo13490g() ? new AbstractC7640c.g.b(method) : new AbstractC7640c.g.e(method);
                    } else {
                        cVar = kFunctionImpl.mo13490g() ? new AbstractC7640c.g.c(C7499b.m14947k(obj2, kFunctionImpl.mo13488e()), method) : new AbstractC7640c.g.f(method);
                    }
                    abstractC7640cM13507i = cVar;
                }
                return C7499b.m14969v(abstractC7640cM13507i, kFunctionImpl.mo13488e(), false);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC6822c interfaceC6822c) {
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC6822c, "descriptor");
        String strM15235f = interfaceC6822c.mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, strM15235f, C7397j.m14789c(interfaceC6822c).mo13485a(), interfaceC6822c, CallableReference.f38110g);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:29:0x007a BREAK  A[LOOP:0: B:22:0x0056->B:41:?]] */
    /* JADX INFO: renamed from: i */
    public static final AbstractC7640c m13507i(KFunctionImpl kFunctionImpl, Constructor constructor, InterfaceC6822c interfaceC6822c, boolean z10) {
        boolean z11;
        if (!z10) {
            kFunctionImpl.getClass();
            InterfaceC8828b interfaceC8828b = interfaceC6822c instanceof InterfaceC8828b ? (InterfaceC8828b) interfaceC6822c : null;
            if (interfaceC8828b != null && !C8850m.m17102e(interfaceC8828b.mo11886f())) {
                InterfaceC8830c interfaceC8830cMo13615I = interfaceC8828b.mo13615I();
                C5207g.m11110e(interfaceC8830cMo13615I, "constructorDescriptor.constructedClass");
                if (!C8414e.m16465b(interfaceC8830cMo13615I) && !C8413d.m16458q(interfaceC8828b.mo13615I())) {
                    List<InterfaceC8853n0> listMo11889i = interfaceC8828b.mo11889i();
                    C5207g.m11110e(listMo11889i, "constructorDescriptor.valueParameters");
                    if (!listMo11889i.isEmpty()) {
                        Iterator<T> it = listMo11889i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                                break;
                            }
                            AbstractC5257t abstractC5257tMo11884c = ((InterfaceC8853n0) it.next()).mo11884c();
                            C5207g.m11110e(abstractC5257tMo11884c, "it.type");
                            if (C7499b.m14964s0(abstractC5257tMo11884c)) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
            if (z11) {
                if (kFunctionImpl.mo13490g()) {
                    return new AbstractC7640c.a(constructor, C7499b.m14947k(kFunctionImpl.f38205d, kFunctionImpl.mo13488e()));
                }
                return new AbstractC7640c.b(constructor);
            }
        }
        if (kFunctionImpl.mo13490g()) {
            return new AbstractC7640c.c(constructor, C7499b.m14947k(kFunctionImpl.f38205d, kFunctionImpl.mo13488e()));
        }
        return new AbstractC7640c.d(constructor);
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Object mo807E() {
        return mo13337b(new Object[0]);
    }

    @Override // dm.InterfaceC5205e
    /* JADX INFO: renamed from: J */
    public final int mo10978J() {
        return C5206f.m10996Q0(mo13486c());
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Object obj, Object obj2, Object obj3) {
        return mo13337b(obj, obj2, obj3);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(Object obj, Object obj2, Object obj3, Object obj4) {
        return mo13337b(obj, obj2, obj3, obj4);
    }

    @Override // km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        String strM15235f = mo13488e().mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "descriptor.name.asString()");
        return strM15235f;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: c */
    public final InterfaceC7639b<?> mo13486c() {
        InterfaceC6727j<Object> interfaceC6727j = f38202g[1];
        Object objM14786E = this.f38207f.m14786E();
        C5207g.m11110e(objM14786E, "<get-caller>(...)");
        return (InterfaceC7639b) objM14786E;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: d */
    public final KDeclarationContainerImpl mo13487d() {
        return this.f38203b;
    }

    public final boolean equals(Object obj) {
        KFunctionImpl kFunctionImplM14790a = C7398k.m14790a(obj);
        boolean z10 = false;
        if (kFunctionImplM14790a == null) {
            return false;
        }
        if (C5207g.m11106a(this.f38203b, kFunctionImplM14790a.f38203b) && C5207g.m11106a(mo13336a(), kFunctionImplM14790a.mo13336a()) && C5207g.m11106a(this.f38204c, kFunctionImplM14790a.f38204c) && C5207g.m11106a(this.f38205d, kFunctionImplM14790a.f38205d)) {
            z10 = true;
        }
        return z10;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: g */
    public final boolean mo13490g() {
        return !C5207g.m11106a(this.f38205d, CallableReference.f38110g);
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return mo13337b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final int hashCode() {
        return this.f38204c.hashCode() + ((mo13336a().hashCode() + (this.f38203b.hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6822c mo13488e() {
        InterfaceC6727j<Object> interfaceC6727j = f38202g[0];
        Object objMo807E = this.f38206e.mo807E();
        C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
        return (InterfaceC6822c) objMo807E;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Object obj, Object obj2) {
        return mo13337b(obj, obj2);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(Object obj) {
        return mo13337b(obj);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return mo13337b(obj, obj2, obj3, obj4, obj5);
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
        return ReflectionObjectRenderer.m13518b(mo13488e());
    }
}
