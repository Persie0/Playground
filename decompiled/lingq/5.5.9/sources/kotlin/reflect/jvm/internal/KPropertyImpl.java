package kotlin.reflect.jvm.internal;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import km.InterfaceC6718a;
import km.InterfaceC6722e;
import km.InterfaceC6727j;
import kn.C6735e;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import mm.InterfaceC7639b;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import om.C8085b;
import p003a2.C0009a;
import p247lm.AbstractC7389b;
import p247lm.C7392e;
import p247lm.C7396i;
import p247lm.C7397j;
import p247lm.C7398k;
import p248ln.AbstractC7403d;
import p248ln.C7407h;
import p260m8.C7499b;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8856p;
import p420um.C9564e0;
import pn.C8412c;
import pn.C8413d;
import sl.C9072e;
import sm.InterfaceC9077e;
import zm.C10521f;
import zm.C10533r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements InterfaceC6727j<V> {

    /* JADX INFO: renamed from: h */
    public static final Object f38252h = new Object();

    /* JADX INFO: renamed from: b */
    public final KDeclarationContainerImpl f38253b;

    /* JADX INFO: renamed from: c */
    public final String f38254c;

    /* JADX INFO: renamed from: d */
    public final String f38255d;

    /* JADX INFO: renamed from: e */
    public final Object f38256e;

    /* JADX INFO: renamed from: f */
    public final C7396i.b<Field> f38257f;

    /* JADX INFO: renamed from: g */
    public final C7396i.a<InterfaceC8829b0> f38258g;

    public static abstract class Getter<V> extends AbstractC6780a<V, V> {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f38259d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: b */
        public final C7396i.a f38260b = C7396i.m14785c(new InterfaceC2041a<InterfaceC8831c0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl.Getter<V> f38263b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38263b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC8831c0 mo807E() {
                KPropertyImpl.AbstractC6780a abstractC6780a = this.f38263b;
                C9564e0 c9564e0Mo11888h = abstractC6780a.mo13509j().mo13488e().mo11888h();
                return c9564e0Mo11888h == null ? C8412c.m16434c(abstractC6780a.mo13509j().mo13488e(), InterfaceC9077e.a.f47365a) : c9564e0Mo11888h;
            }
        });

        /* JADX INFO: renamed from: c */
        public final C7396i.b f38261c = C7396i.m14784b(new InterfaceC2041a<InterfaceC7639b<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl.Getter<V> f38262b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38262b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7639b<?> mo807E() {
                return C7499b.m14934d(this.f38262b, true);
            }
        });

        @Override // km.InterfaceC6718a
        /* JADX INFO: renamed from: a */
        public final String mo13336a() {
            return C0009a.m22j(new StringBuilder("<get-"), mo13509j().f38254c, '>');
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: c */
        public final InterfaceC7639b<?> mo13486c() {
            InterfaceC6727j<Object> interfaceC6727j = f38259d[1];
            Object objM14786E = this.f38261c.m14786E();
            C5207g.m11110e(objM14786E, "<get-caller>(...)");
            return (InterfaceC7639b) objM14786E;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: e */
        public final CallableMemberDescriptor mo13488e() {
            InterfaceC6727j<Object> interfaceC6727j = f38259d[0];
            Object objMo807E = this.f38260b.mo807E();
            C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
            return (InterfaceC8831c0) objMo807E;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && C5207g.m11106a(mo13509j(), ((Getter) obj).mo13509j());
        }

        public final int hashCode() {
            return mo13509j().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: i */
        public final InterfaceC6823d mo13514i() {
            InterfaceC6727j<Object> interfaceC6727j = f38259d[0];
            Object objMo807E = this.f38260b.mo807E();
            C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
            return (InterfaceC8831c0) objMo807E;
        }

        public final String toString() {
            return "getter of " + mo13509j();
        }
    }

    public static abstract class Setter<V> extends AbstractC6780a<V, C9072e> {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC6727j<Object>[] f38264d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: b */
        public final C7396i.a f38265b = C7396i.m14785c(new InterfaceC2041a<InterfaceC8833d0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl.Setter<V> f38268b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38268b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC8833d0 mo807E() {
                KPropertyImpl.AbstractC6780a abstractC6780a = this.f38268b;
                InterfaceC8833d0 interfaceC8833d0Mo11887g0 = abstractC6780a.mo13509j().mo13488e().mo11887g0();
                if (interfaceC8833d0Mo11887g0 == null) {
                    interfaceC8833d0Mo11887g0 = C8412c.m16435d(abstractC6780a.mo13509j().mo13488e(), InterfaceC9077e.a.f47365a);
                }
                return interfaceC8833d0Mo11887g0;
            }
        });

        /* JADX INFO: renamed from: c */
        public final C7396i.b f38266c = C7396i.m14784b(new InterfaceC2041a<InterfaceC7639b<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl.Setter<V> f38267b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38267b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7639b<?> mo807E() {
                return C7499b.m14934d(this.f38267b, false);
            }
        });

        @Override // km.InterfaceC6718a
        /* JADX INFO: renamed from: a */
        public final String mo13336a() {
            return C0009a.m22j(new StringBuilder("<set-"), mo13509j().f38254c, '>');
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: c */
        public final InterfaceC7639b<?> mo13486c() {
            InterfaceC6727j<Object> interfaceC6727j = f38264d[1];
            Object objM14786E = this.f38266c.m14786E();
            C5207g.m11110e(objM14786E, "<get-caller>(...)");
            return (InterfaceC7639b) objM14786E;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: e */
        public final CallableMemberDescriptor mo13488e() {
            InterfaceC6727j<Object> interfaceC6727j = f38264d[0];
            Object objMo807E = this.f38265b.mo807E();
            C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
            return (InterfaceC8833d0) objMo807E;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && C5207g.m11106a(mo13509j(), ((Setter) obj).mo13509j());
        }

        public final int hashCode() {
            return mo13509j().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: i */
        public final InterfaceC6823d mo13514i() {
            InterfaceC6727j<Object> interfaceC6727j = f38264d[0];
            Object objMo807E = this.f38265b.mo807E();
            C5207g.m11110e(objMo807E, "<get-descriptor>(...)");
            return (InterfaceC8833d0) objMo807E;
        }

        public final String toString() {
            return "setter of " + mo13509j();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPropertyImpl$a */
    public static abstract class AbstractC6780a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements InterfaceC6722e<ReturnType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: d */
        public final KDeclarationContainerImpl mo13487d() {
            return mo13509j().f38253b;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: g */
        public final boolean mo13490g() {
            return mo13509j().mo13490g();
        }

        /* JADX INFO: renamed from: i */
        public abstract InterfaceC6823d mo13514i();

        /* JADX INFO: renamed from: j */
        public abstract KPropertyImpl<PropertyType> mo13509j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "signature");
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC8829b0 interfaceC8829b0, Object obj) {
        this.f38253b = kDeclarationContainerImpl;
        this.f38254c = str;
        this.f38255d = str2;
        this.f38256e = obj;
        this.f38257f = new C7396i.b<>(new InterfaceC2041a<Field>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl<V> f38270b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38270b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0077  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Field mo807E() {
                Class<?> enclosingClass;
                boolean z10;
                C7645b c7645b = C7397j.f41210a;
                KPropertyImpl<V> kPropertyImpl = this.f38270b;
                AbstractC7389b abstractC7389bM14788b = C7397j.m14788b(kPropertyImpl.mo13488e());
                if (!(abstractC7389bM14788b instanceof AbstractC7389b.c)) {
                    if (abstractC7389bM14788b instanceof AbstractC7389b.a) {
                        return ((AbstractC7389b.a) abstractC7389bM14788b).f41191a;
                    }
                    if ((abstractC7389bM14788b instanceof AbstractC7389b.b) || (abstractC7389bM14788b instanceof AbstractC7389b.d)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC7389b.c cVar = (AbstractC7389b.c) abstractC7389bM14788b;
                C6993d c6993d = C7407h.f41229a;
                InterfaceC6733c interfaceC6733c = cVar.f41197d;
                C6735e c6735e = cVar.f41198e;
                ProtoBuf$Property protoBuf$Property = cVar.f41195b;
                boolean z11 = true;
                AbstractC7403d.a aVarM14808b = C7407h.m14808b(protoBuf$Property, interfaceC6733c, c6735e, true);
                if (aVarM14808b == null) {
                    return null;
                }
                InterfaceC8829b0 interfaceC8829b1 = cVar.f41194a;
                if (interfaceC8829b1 == null) {
                    C10521f.m19495a(0);
                    throw null;
                }
                if (interfaceC8829b1.mo11897u() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    InterfaceC8838g interfaceC8838gMo11876g = interfaceC8829b1.mo11876g();
                    if (interfaceC8838gMo11876g == null) {
                        C10521f.m19495a(1);
                        throw null;
                    }
                    if (C8413d.m16453l(interfaceC8838gMo11876g)) {
                        InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC8838gMo11876g.mo11876g();
                        if (C8413d.m16455n(interfaceC8838gMo11876g2, ClassKind.CLASS) || C8413d.m16455n(interfaceC8838gMo11876g2, ClassKind.ENUM_CLASS)) {
                            LinkedHashSet linkedHashSet = C8085b.f43903a;
                            if (C7499b.m14927Y((InterfaceC8830c) interfaceC8838gMo11876g)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (C8413d.m16453l(interfaceC8829b1.mo11876g())) {
                            InterfaceC8856p interfaceC8856pMo11899x0 = interfaceC8829b1.mo11899x0();
                            if (!((interfaceC8856pMo11899x0 == null || !interfaceC8856pMo11899x0.mo11289w().mo5292x(C10533r.f52532a)) ? interfaceC8829b1.mo11289w().mo5292x(C10533r.f52532a) : true)) {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    }
                } else {
                    z11 = false;
                }
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.f38253b;
                if (z11 || C7407h.m14810d(protoBuf$Property)) {
                    enclosingClass = kDeclarationContainerImpl2.mo10973b().getEnclosingClass();
                } else {
                    InterfaceC8838g interfaceC8838gMo11876g3 = interfaceC8829b1.mo11876g();
                    enclosingClass = interfaceC8838gMo11876g3 instanceof InterfaceC8830c ? C7398k.m14797h((InterfaceC8830c) interfaceC8838gMo11876g3) : kDeclarationContainerImpl2.mo10973b();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(aVarM14808b.f41218a);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            }
        });
        this.f38258g = new C7396i.a<>(interfaceC8829b0, new InterfaceC2041a<InterfaceC8829b0>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KPropertyImpl<V> f38269b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38269b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC8829b0 mo807E() {
                KPropertyImpl<V> kPropertyImpl = this.f38269b;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.f38253b;
                kDeclarationContainerImpl2.getClass();
                String str3 = kPropertyImpl.f38254c;
                C5207g.m11111f(str3, "name");
                String str4 = kPropertyImpl.f38255d;
                C5207g.m11111f(str4, "signature");
                Regex regex = KDeclarationContainerImpl.f38196a;
                regex.getClass();
                Matcher matcher = regex.f39972a.matcher(str4);
                C5207g.m11110e(matcher, "nativePattern.matcher(input)");
                MatcherMatchResult matcherMatchResult = !matcher.matches() ? null : new MatcherMatchResult(matcher, str4);
                if (matcherMatchResult != null) {
                    String str5 = (String) ((MatcherMatchResult.C7074a) matcherMatchResult.m14269b()).get(1);
                    InterfaceC8829b0 interfaceC8829b0Mo13493f = kDeclarationContainerImpl2.mo13493f(Integer.parseInt(str5));
                    if (interfaceC8829b0Mo13493f != null) {
                        return interfaceC8829b0Mo13493f;
                    }
                    StringBuilder sbM854m = C0204c.m854m("Local property #", str5, " not found in ");
                    sbM854m.append(kDeclarationContainerImpl2.mo10973b());
                    throw new KotlinReflectionInternalError(sbM854m.toString());
                }
                Collection<InterfaceC8829b0> collectionMo13494i = kDeclarationContainerImpl2.mo13494i(C7648e.m15232l(str3));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionMo13494i) {
                    if (C5207g.m11106a(C7397j.m14788b((InterfaceC8829b0) obj2).mo14781a(), str4)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbM855o = C0204c.m855o("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                    sbM855o.append(kDeclarationContainerImpl2);
                    throw new KotlinReflectionInternalError(sbM855o.toString());
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC8829b0) C6752c.m13443k0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    AbstractC8852n abstractC8852nMo11886f = ((InterfaceC8829b0) obj3).mo11886f();
                    Object arrayList2 = linkedHashMap.get(abstractC8852nMo11886f);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(abstractC8852nMo11886f, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                TreeMap treeMap = new TreeMap(C7392e.f41203a);
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                C5207g.m11110e(collectionValues, "properties\n             …\n                }.values");
                List list = (List) C6752c.m13431Y(collectionValues);
                if (list.size() == 1) {
                    return (InterfaceC8829b0) C6752c.m13423Q(list);
                }
                String strM13430X = C6752c.m13430X(kDeclarationContainerImpl2.mo13494i(C7648e.m15232l(str3)), "\n", null, null, new InterfaceC2052l<InterfaceC8829b0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final CharSequence mo528n(InterfaceC8829b0 interfaceC8829b1) {
                        InterfaceC8829b0 interfaceC8829b2 = interfaceC8829b1;
                        C5207g.m11111f(interfaceC8829b2, "descriptor");
                        return DescriptorRenderer.f39547b.m14003G(interfaceC8829b2) + " | " + C7397j.m14788b(interfaceC8829b2).mo14781a();
                    }
                }, 30);
                StringBuilder sbM855o2 = C0204c.m855o("Property '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                sbM855o2.append(kDeclarationContainerImpl2);
                sbM855o2.append(':');
                sbM855o2.append(strM13430X.length() == 0 ? " no members found" : "\n".concat(strM13430X));
                throw new KotlinReflectionInternalError(sbM855o2.toString());
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        String strM15235f = interfaceC8829b0.mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, strM15235f, C7397j.m14788b(interfaceC8829b0).mo14781a(), interfaceC8829b0, CallableReference.f38110g);
    }

    @Override // km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return this.f38254c;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: c */
    public final InterfaceC7639b<?> mo13486c() {
        return mo13511k().mo13486c();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: d */
    public final KDeclarationContainerImpl mo13487d() {
        return this.f38253b;
    }

    public final boolean equals(Object obj) {
        C7646c c7646c = C7398k.f41211a;
        KPropertyImpl kPropertyImpl = null;
        KPropertyImpl kPropertyImpl2 = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl2 == null) {
            PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
            InterfaceC6718a interfaceC6718aM13481j = propertyReference != null ? propertyReference.m13481j() : null;
            if (interfaceC6718aM13481j instanceof KPropertyImpl) {
                kPropertyImpl = (KPropertyImpl) interfaceC6718aM13481j;
            }
            return kPropertyImpl == null && C5207g.m11106a(this.f38253b, kPropertyImpl.f38253b) && C5207g.m11106a(this.f38254c, kPropertyImpl.f38254c) && C5207g.m11106a(this.f38255d, kPropertyImpl.f38255d) && C5207g.m11106a(this.f38256e, kPropertyImpl.f38256e);
        }
        kPropertyImpl = kPropertyImpl2;
        if (kPropertyImpl == null) {
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: g */
    public final boolean mo13490g() {
        return !C5207g.m11106a(this.f38256e, CallableReference.f38110g);
    }

    public final int hashCode() {
        return this.f38255d.hashCode() + C0166e.m758d(this.f38254c, this.f38253b.hashCode() * 31, 31);
    }

    /* JADX INFO: renamed from: i */
    public final Member m13512i() {
        if (!mo13488e().mo11883V()) {
            return null;
        }
        C7645b c7645b = C7397j.f41210a;
        AbstractC7389b abstractC7389bM14788b = C7397j.m14788b(mo13488e());
        if (abstractC7389bM14788b instanceof AbstractC7389b.c) {
            AbstractC7389b.c cVar = (AbstractC7389b.c) abstractC7389bM14788b;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = cVar.f41196c;
            boolean z10 = true;
            if ((jvmPropertySignature.f39437b & 16) == 16) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f39442g;
                int i10 = jvmMethodSignature.f39426b;
                if ((i10 & 1) == 1) {
                    if ((i10 & 2) != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        int i11 = jvmMethodSignature.f39427c;
                        InterfaceC6733c interfaceC6733c = cVar.f41197d;
                        return this.f38253b.m13502c(interfaceC6733c.mo13351a(i11), interfaceC6733c.mo13351a(jvmMethodSignature.f39428d));
                    }
                }
                return null;
            }
        }
        return this.f38257f.m14786E();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8829b0 mo13488e() {
        InterfaceC8829b0 interfaceC8829b0Mo807E = this.f38258g.mo807E();
        C5207g.m11110e(interfaceC8829b0Mo807E, "_descriptor()");
        return interfaceC8829b0Mo807E;
    }

    /* JADX INFO: renamed from: k */
    public abstract Getter<V> mo13511k();

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
        return ReflectionObjectRenderer.m13519c(mo13488e());
    }
}
