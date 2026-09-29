package kotlin.reflect.jvm.internal;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import km.InterfaceC6719b;
import km.InterfaceC6722e;
import km.InterfaceC6727j;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.C7076b;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;
import om.C8085b;
import p247lm.C7396i;
import p247lm.C7397j;
import p247lm.C7398k;
import p247lm.InterfaceC7394g;
import p260m8.C7499b;
import p338qd.C8578t;
import p347qm.C8646c;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p465wm.C9973c;
import p465wm.C9976f;
import p466wn.InterfaceC9985h;
import p541zn.C10544h;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pn.C8413d;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements InterfaceC6719b<T>, InterfaceC7394g {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f38152d = 0;

    /* JADX INFO: renamed from: b */
    public final Class<T> f38153b;

    /* JADX INFO: renamed from: c */
    public final C7396i.b<KClassImpl<T>.Data> f38154c;

    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f38155n = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: c */
        public final C7396i.a f38156c;

        /* JADX INFO: renamed from: d */
        public final C7396i.a f38157d;

        /* JADX INFO: renamed from: e */
        public final C7396i.a f38158e;

        /* JADX INFO: renamed from: f */
        public final C7396i.b f38159f;

        /* JADX INFO: renamed from: g */
        public final C7396i.a f38160g;

        /* JADX INFO: renamed from: h */
        public final C7396i.a f38161h;

        /* JADX INFO: renamed from: i */
        public final C7396i.a f38162i;

        /* JADX INFO: renamed from: j */
        public final C7396i.a f38163j;

        /* JADX INFO: renamed from: k */
        public final C7396i.a f38164k;

        /* JADX INFO: renamed from: l */
        public final C7396i.a f38165l;

        /* JADX INFO: renamed from: m */
        public final C7396i.a f38166m;

        public Data(final KClassImpl kClassImpl) {
            super(kClassImpl);
            this.f38156c = C7396i.m14785c(new InterfaceC2041a<InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final InterfaceC8830c mo807E() throws InvocationTargetException {
                    KotlinClassHeader kotlinClassHeader;
                    int i10 = KClassImpl.f38152d;
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    C7645b c7645bM13495s = kClassImpl2.m13495s();
                    KClassImpl<T>.Data dataM14786E = kClassImpl2.f38154c.m14786E();
                    dataM14786E.getClass();
                    InterfaceC6727j<Object> interfaceC6727j = KDeclarationContainerImpl.Data.f38197b[0];
                    Object objMo807E = dataM14786E.f38198a.mo807E();
                    C5207g.m11110e(objMo807E, "<get-moduleData>(...)");
                    boolean z10 = c7645bM13495s.f42075c;
                    C10544h c10544h = ((C9976f) objMo807E).f50702a;
                    InterfaceC8830c interfaceC8830cM19515b = z10 ? c10544h.m19515b(c7645bM13495s) : FindClassInModuleKt.m13584a(c10544h.f52580b, c7645bM13495s);
                    if (interfaceC8830cM19515b != null) {
                        return interfaceC8830cM19515b;
                    }
                    Class<T> cls = kClassImpl2.f38153b;
                    C9973c c9973cM18552a = C9973c.a.m18552a(cls);
                    KotlinClassHeader.Kind kind = (c9973cM18552a == null || (kotlinClassHeader = c9973cM18552a.f50698b) == null) ? null : kotlinClassHeader.f38908a;
                    switch (kind == null ? -1 : KClassImpl.C6774a.f38193a[kind.ordinal()]) {
                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            throw new KotlinReflectionInternalError("Unresolved class: " + cls);
                        case 1:
                        case 2:
                        case 3:
                            throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + cls);
                        case 4:
                            throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + cls);
                        case 5:
                            throw new KotlinReflectionInternalError("Unknown class: " + cls + " (kind = " + kind + ')');
                    }
                    throw new NoWhenBranchMatchedException();
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38170b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38170b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends Annotation> mo807E() {
                    return C7398k.m14791b(this.f38170b.m13499a());
                }
            });
            this.f38157d = C7396i.m14785c(new InterfaceC2041a<String>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KClassImpl<T>.Data f38184c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38184c = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final String mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    if (kClassImpl2.f38153b.isAnonymousClass()) {
                        return null;
                    }
                    C7645b c7645bM13495s = kClassImpl2.m13495s();
                    if (!c7645bM13495s.f42075c) {
                        String strM15235f = c7645bM13495s.m15210j().m15235f();
                        C5207g.m11110e(strM15235f, "classId.shortClassName.asString()");
                        return strM15235f;
                    }
                    this.f38184c.getClass();
                    Class<T> cls = kClassImpl2.f38153b;
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return C7076b.m14302v3(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        return C7076b.m14303w3(simpleName, '$');
                    }
                    return C7076b.m14302v3(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }
            });
            this.f38158e = C7396i.m14785c(new InterfaceC2041a<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final String mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    if (kClassImpl2.f38153b.isAnonymousClass()) {
                        return null;
                    }
                    C7645b c7645bM13495s = kClassImpl2.m13495s();
                    if (c7645bM13495s.f42075c) {
                        return null;
                    }
                    return c7645bM13495s.m15204b().m15214b();
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends InterfaceC6722e<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    Collection<InterfaceC6821b> collectionMo13491d = kClassImpl2.mo13491d();
                    ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo13491d, 10));
                    Iterator<T> it = collectionMo13491d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(kClassImpl2, (InterfaceC6821b) it.next()));
                    }
                    return arrayList;
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends KClassImpl<? extends Object>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38178b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38178b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KClassImpl<? extends Object>> mo807E() {
                    MemberScope memberScopeMo13687H0 = this.f38178b.m13499a().mo13687H0();
                    C5207g.m11110e(memberScopeMo13687H0, "descriptor.unsubstitutedInnerClassesScope");
                    Collection collectionM18558a = InterfaceC9985h.a.m18558a(memberScopeMo13687H0, null, 3);
                    ArrayList<InterfaceC8838g> arrayList = new ArrayList();
                    for (Object obj : collectionM18558a) {
                        if (!C8413d.m16454m((InterfaceC8838g) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC8838g interfaceC8838g : arrayList) {
                        InterfaceC8830c interfaceC8830c = interfaceC8838g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838g : null;
                        Class<?> clsM14797h = interfaceC8830c != null ? C7398k.m14797h(interfaceC8830c) : null;
                        KClassImpl kClassImpl2 = clsM14797h != null ? new KClassImpl(clsM14797h) : null;
                        if (kClassImpl2 != null) {
                            arrayList2.add(kClassImpl2);
                        }
                    }
                    return arrayList2;
                }
            });
            this.f38159f = new C7396i.b(new InterfaceC2041a<T>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38179b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38179b = this;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x003e  */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final T mo807E() throws NoSuchFieldException {
                    Field declaredField;
                    InterfaceC8830c interfaceC8830cM13499a = this.f38179b.m13499a();
                    if (interfaceC8830cM13499a.mo13602u() != ClassKind.OBJECT) {
                        return null;
                    }
                    boolean zMo13589E = interfaceC8830cM13499a.mo13589E();
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    if (zMo13589E) {
                        LinkedHashSet linkedHashSet = C8085b.f43903a;
                        if (C7499b.m14927Y(interfaceC8830cM13499a)) {
                            declaredField = kClassImpl2.f38153b.getDeclaredField("INSTANCE");
                        } else {
                            declaredField = kClassImpl2.f38153b.getEnclosingClass().getDeclaredField(interfaceC8830cM13499a.mo11874a().m15235f());
                        }
                    } else {
                        declaredField = kClassImpl2.f38153b.getDeclaredField("INSTANCE");
                    }
                    T t10 = (T) declaredField.get(null);
                    C5207g.m11109d(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                    return t10;
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38191b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38191b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KTypeParameterImpl> mo807E() {
                    List<InterfaceC8847k0> listMo13604z = this.f38191b.m13499a().mo13604z();
                    C5207g.m11110e(listMo13604z, "descriptor.declaredTypeParameters");
                    ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo13604z, 10));
                    for (InterfaceC8847k0 interfaceC8847k0 : listMo13604z) {
                        C5207g.m11110e(interfaceC8847k0, "descriptor");
                        arrayList.add(new KTypeParameterImpl(kClassImpl, interfaceC8847k0));
                    }
                    return arrayList;
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends KTypeImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38185b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38185b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KTypeImpl> mo807E() {
                    final KClassImpl<T>.Data data = this.f38185b;
                    Collection<AbstractC5257t> collectionMo11278p = data.m13499a().mo13600k().mo11278p();
                    C5207g.m11110e(collectionMo11278p, "descriptor.typeConstructor.supertypes");
                    ArrayList arrayList = new ArrayList(collectionMo11278p.size());
                    for (final AbstractC5257t abstractC5257t : collectionMo11278p) {
                        C5207g.m11110e(abstractC5257t, "kotlinType");
                        final KClassImpl<T> kClassImpl2 = kClassImpl;
                        arrayList.add(new KTypeImpl(abstractC5257t, new InterfaceC2041a<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Type mo807E() {
                                InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
                                if (!(interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
                                    throw new KotlinReflectionInternalError("Supertype not a class: " + interfaceC8834eMo11235q);
                                }
                                Class<?> clsM14797h = C7398k.m14797h((InterfaceC8830c) interfaceC8834eMo11235q);
                                KClassImpl<Object>.Data data2 = data;
                                if (clsM14797h == null) {
                                    throw new KotlinReflectionInternalError("Unsupported superclass of " + data2 + ": " + interfaceC8834eMo11235q);
                                }
                                KClassImpl<Object> kClassImpl3 = kClassImpl2;
                                boolean zM11106a = C5207g.m11106a(kClassImpl3.f38153b.getSuperclass(), clsM14797h);
                                Class<Object> cls = kClassImpl3.f38153b;
                                if (zM11106a) {
                                    Type genericSuperclass = cls.getGenericSuperclass();
                                    C5207g.m11110e(genericSuperclass, "{\n                      …ass\n                    }");
                                    return genericSuperclass;
                                }
                                Class<?>[] interfaces = cls.getInterfaces();
                                C5207g.m11110e(interfaces, "jClass.interfaces");
                                int iM13384p0 = C6744b.m13384p0(clsM14797h, interfaces);
                                if (iM13384p0 >= 0) {
                                    Type type = cls.getGenericInterfaces()[iM13384p0];
                                    C5207g.m11110e(type, "{\n                      …ex]\n                    }");
                                    return type;
                                }
                                throw new KotlinReflectionInternalError("No superclass of " + data2 + " in Java reflection for " + interfaceC8834eMo11235q);
                            }
                        }));
                    }
                    if (!AbstractC6795c.m13536I(data.m13499a())) {
                        boolean z10 = true;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ClassKind classKindMo13602u = C8413d.m16444c(((KTypeImpl) it.next()).f38272a).mo13602u();
                                C5207g.m11110e(classKindMo13602u, "getClassDescriptorForType(it.type).kind");
                                if (!(classKindMo13602u == ClassKind.INTERFACE || classKindMo13602u == ClassKind.ANNOTATION_CLASS)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        if (z10) {
                            AbstractC5265x abstractC5265xM13549f = DescriptorUtilsKt.m14108e(data.m13499a()).m13549f();
                            C5207g.m11110e(abstractC5265xM13549f, "descriptor.builtIns.anyType");
                            arrayList.add(new KTypeImpl(abstractC5265xM13549f, new InterfaceC2041a<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ Type mo807E() {
                                    return Object.class;
                                }
                            }));
                        }
                    }
                    return C0062b.m397t0(arrayList);
                }
            });
            this.f38160g = C7396i.m14785c(new InterfaceC2041a<List<? extends KClassImpl<? extends T>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38182b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38182b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object mo807E() {
                    Collection<InterfaceC8830c> collectionMo13601m = this.f38182b.m13499a().mo13601m();
                    C5207g.m11110e(collectionMo13601m, "descriptor.sealedSubclasses");
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC8830c interfaceC8830c : collectionMo13601m) {
                        C5207g.m11109d(interfaceC8830c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class<?> clsM14797h = C7398k.m14797h(interfaceC8830c);
                        KClassImpl kClassImpl2 = clsM14797h != null ? new KClassImpl(clsM14797h) : null;
                        if (kClassImpl2 != null) {
                            arrayList.add(kClassImpl2);
                        }
                    }
                    return arrayList;
                }
            });
            this.f38161h = C7396i.m14785c(new InterfaceC2041a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    return kClassImpl2.m13503g(kClassImpl2.m13497u(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f38162i = C7396i.m14785c(new InterfaceC2041a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    return kClassImpl2.m13503g(kClassImpl2.m13498v(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f38163j = C7396i.m14785c(new InterfaceC2041a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    return kClassImpl2.m13503g(kClassImpl2.m13497u(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f38164k = C7396i.m14785c(new InterfaceC2041a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Collection<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T> kClassImpl2 = kClassImpl;
                    return kClassImpl2.m13503g(kClassImpl2.m13498v(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f38165l = C7396i.m14785c(new InterfaceC2041a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38168b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38168b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T>.Data data = this.f38168b;
                    data.getClass();
                    InterfaceC6727j<Object>[] interfaceC6727jArr = KClassImpl.Data.f38155n;
                    InterfaceC6727j<Object> interfaceC6727j = interfaceC6727jArr[10];
                    Object objMo807E = data.f38161h.mo807E();
                    C5207g.m11110e(objMo807E, "<get-declaredNonStaticMembers>(...)");
                    InterfaceC6727j<Object> interfaceC6727j2 = interfaceC6727jArr[12];
                    Object objMo807E2 = data.f38163j.mo807E();
                    C5207g.m11110e(objMo807E2, "<get-inheritedNonStaticMembers>(...)");
                    return C6752c.m13438f0((Collection) objMo807E2, (Collection) objMo807E);
                }
            });
            this.f38166m = C7396i.m14785c(new InterfaceC2041a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38169b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38169b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T>.Data data = this.f38169b;
                    data.getClass();
                    InterfaceC6727j<Object>[] interfaceC6727jArr = KClassImpl.Data.f38155n;
                    InterfaceC6727j<Object> interfaceC6727j = interfaceC6727jArr[11];
                    Object objMo807E = data.f38162i.mo807E();
                    C5207g.m11110e(objMo807E, "<get-declaredStaticMembers>(...)");
                    InterfaceC6727j<Object> interfaceC6727j2 = interfaceC6727jArr[13];
                    Object objMo807E2 = data.f38164k.mo807E();
                    C5207g.m11110e(objMo807E2, "<get-inheritedStaticMembers>(...)");
                    return C6752c.m13438f0((Collection) objMo807E2, (Collection) objMo807E);
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38172b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38172b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T>.Data data = this.f38172b;
                    data.getClass();
                    InterfaceC6727j<Object>[] interfaceC6727jArr = KClassImpl.Data.f38155n;
                    InterfaceC6727j<Object> interfaceC6727j = interfaceC6727jArr[10];
                    Object objMo807E = data.f38161h.mo807E();
                    C5207g.m11110e(objMo807E, "<get-declaredNonStaticMembers>(...)");
                    Collection collection = (Collection) objMo807E;
                    InterfaceC6727j<Object> interfaceC6727j2 = interfaceC6727jArr[11];
                    Object objMo807E2 = data.f38162i.mo807E();
                    C5207g.m11110e(objMo807E2, "<get-declaredStaticMembers>(...)");
                    return C6752c.m13438f0((Collection) objMo807E2, collection);
                }
            });
            C7396i.m14785c(new InterfaceC2041a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ KClassImpl<T>.Data f38167b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f38167b = this;
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends KCallableImpl<?>> mo807E() {
                    KClassImpl<T>.Data data = this.f38167b;
                    data.getClass();
                    InterfaceC6727j<Object>[] interfaceC6727jArr = KClassImpl.Data.f38155n;
                    InterfaceC6727j<Object> interfaceC6727j = interfaceC6727jArr[14];
                    Object objMo807E = data.f38165l.mo807E();
                    C5207g.m11110e(objMo807E, "<get-allNonStaticMembers>(...)");
                    InterfaceC6727j<Object> interfaceC6727j2 = interfaceC6727jArr[15];
                    Object objMo807E2 = data.f38166m.mo807E();
                    C5207g.m11110e(objMo807E2, "<get-allStaticMembers>(...)");
                    return C6752c.m13438f0((Collection) objMo807E2, (Collection) objMo807E);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC8830c m13499a() {
            InterfaceC6727j<Object> interfaceC6727j = f38155n[0];
            Object objMo807E = this.f38156c.mo807E();
            C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
            return (InterfaceC8830c) objMo807E;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KClassImpl$a */
    public /* synthetic */ class C6774a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38193a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            f38193a = iArr;
        }
    }

    public KClassImpl(Class<T> cls) {
        C5207g.m11111f(cls, "jClass");
        this.f38153b = cls;
        this.f38154c = C7396i.m14784b(new InterfaceC2041a<KClassImpl<T>.Data>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KClassImpl<T> f38194b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38194b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KClassImpl.Data(this.f38194b);
            }
        });
    }

    @Override // dm.InterfaceC5202b
    /* JADX INFO: renamed from: b */
    public final Class<T> mo10973b() {
        return this.f38153b;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: d */
    public final Collection<InterfaceC6821b> mo13491d() {
        InterfaceC8830c interfaceC8830cM13496t = m13496t();
        if (interfaceC8830cM13496t.mo13602u() == ClassKind.INTERFACE || interfaceC8830cM13496t.mo13602u() == ClassKind.OBJECT) {
            return EmptyList.f38032a;
        }
        Collection<InterfaceC8828b> collectionMo13590G = interfaceC8830cM13496t.mo13590G();
        C5207g.m11110e(collectionMo13590G, "descriptor.constructors");
        return collectionMo13590G;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC6822c> mo13492e(C7648e c7648e) {
        MemberScope memberScopeM13497u = m13497u();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return C6752c.m13438f0(m13498v().mo11904b(c7648e, noLookupLocation), memberScopeM13497u.mo11904b(c7648e, noLookupLocation));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && C5207g.m11106a(C5206f.m10999U0(this), C5206f.m10999U0((InterfaceC6719b) obj));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: f */
    public final InterfaceC8829b0 mo13493f(int i10) {
        Class<?> declaringClass;
        Class<T> cls = this.f38153b;
        if (C5207g.m11106a(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(declaringClass);
            C5207g.m11109d(interfaceC6719bM11118a, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) interfaceC6719bM11118a).mo13493f(i10);
        }
        InterfaceC8830c interfaceC8830cM13496t = m13496t();
        DeserializedClassDescriptor deserializedClassDescriptor = interfaceC8830cM13496t instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) interfaceC8830cM13496t : null;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        GeneratedMessageLite.C6985e<ProtoBuf$Class, List<ProtoBuf$Property>> c6985e = JvmProtoBuf.f39407j;
        C5207g.m11110e(c6985e, "classLocalVariable");
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) C7499b.m14904G(deserializedClassDescriptor.f39762e, c6985e, i10);
        if (protoBuf$Property == null) {
            return null;
        }
        Class<T> cls2 = this.f38153b;
        C8578t c8578t = deserializedClassDescriptor.f39769l;
        return (InterfaceC8829b0) C7398k.m14793d(cls2, protoBuf$Property, (InterfaceC6733c) c8578t.f46000b, (C6735e) c8578t.f46002d, deserializedClassDescriptor.f39763f, KClassImpl$getLocalProperty$2$1$1.f38195j);
    }

    public final int hashCode() {
        return C5206f.m10999U0(this).hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    /* JADX INFO: renamed from: i */
    public final Collection<InterfaceC8829b0> mo13494i(C7648e c7648e) {
        MemberScope memberScopeM13497u = m13497u();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return C6752c.m13438f0(m13498v().mo11905c(c7648e, noLookupLocation), memberScopeM13497u.mo11905c(c7648e, noLookupLocation));
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: m */
    public final List<InterfaceC6719b<? extends T>> mo10974m() {
        KClassImpl<T>.Data dataM14786E = this.f38154c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38155n[9];
        Object objMo807E = dataM14786E.f38160g.mo807E();
        C5207g.m11110e(objMo807E, "<get-sealedSubclasses>(...)");
        return (List) objMo807E;
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: o */
    public final String mo10975o() {
        KClassImpl<T>.Data dataM14786E = this.f38154c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38155n[3];
        return (String) dataM14786E.f38158e.mo807E();
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: p */
    public final String mo10976p() {
        KClassImpl<T>.Data dataM14786E = this.f38154c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38155n[2];
        return (String) dataM14786E.f38157d.mo807E();
    }

    @Override // km.InterfaceC6719b
    /* JADX INFO: renamed from: q */
    public final T mo10977q() {
        KClassImpl<T>.Data dataM14786E = this.f38154c.m14786E();
        dataM14786E.getClass();
        InterfaceC6727j<Object> interfaceC6727j = Data.f38155n[6];
        return (T) dataM14786E.f38159f.m14786E();
    }

    /* JADX INFO: renamed from: s */
    public final C7645b m13495s() {
        PrimitiveType primitiveType;
        C7645b c7645b = C7397j.f41210a;
        Class<T> cls = this.f38153b;
        C5207g.m11111f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C5207g.m11110e(componentType, "klass.componentType");
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            return primitiveType != null ? new C7645b(C6797e.f38344j, primitiveType.getArrayTypeName()) : C7645b.m15203l(C6797e.a.f38384g.m15229h());
        }
        if (C5207g.m11106a(cls, Void.TYPE)) {
            return C7397j.f41210a;
        }
        primitiveType = cls.isPrimitive() ? JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new C7645b(C6797e.f38344j, primitiveType.getTypeName());
        }
        C7645b c7645bM13648a = ReflectClassUtilKt.m13648a(cls);
        if (!c7645bM13648a.f42075c) {
            String str = C8646c.f46201a;
            C7646c c7646cM15204b = c7645bM13648a.m15204b();
            C5207g.m11110e(c7646cM15204b, "classId.asSingleFqName()");
            C7645b c7645bM16868f = C8646c.m16868f(c7646cM15204b);
            if (c7645bM16868f != null) {
                c7645bM13648a = c7645bM16868f;
            }
        }
        return c7645bM13648a;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC8830c m13496t() {
        return this.f38154c.m14786E().m13499a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        C7645b c7645bM13495s = m13495s();
        C7646c c7646cM15208h = c7645bM13495s.m15208h();
        C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
        String strConcat = c7646cM15208h.m15216d() ? "" : c7646cM15208h.m15214b().concat(".");
        sb2.append(strConcat + C7661i.m15253S2(c7645bM13495s.m15209i().m15214b(), '.', '$'));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final MemberScope m13497u() {
        return m13496t().mo5316v().mo11245q();
    }

    /* JADX INFO: renamed from: v */
    public final MemberScope m13498v() {
        MemberScope memberScopeMo13598Z = m13496t().mo13598Z();
        C5207g.m11110e(memberScopeMo13598Z, "descriptor.staticScope");
        return memberScopeMo13598Z;
    }
}
