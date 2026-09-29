package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import co.InterfaceC2072d;
import co.InterfaceC2074f;
import dm.C5207g;
import gn.InterfaceC5827g;
import gn.InterfaceC5840t;
import in.InterfaceC6366j;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6898a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import mn.C7650g;
import p078dn.AbstractC5217c;
import p078dn.InterfaceC5215a;
import p266n.C7669f;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p466wn.C9981d;
import p541zn.C10541e;
import zm.InterfaceC10524i;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageScope extends AbstractC5217c {

    /* JADX INFO: renamed from: n */
    public final InterfaceC5840t f38757n;

    /* JADX INFO: renamed from: o */
    public final LazyJavaPackageFragment f38758o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2074f<Set<String>> f38759p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2072d<C6849a, InterfaceC8830c> f38760q;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$a */
    public static final class C6849a {

        /* JADX INFO: renamed from: a */
        public final C7648e f38761a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5827g f38762b;

        public C6849a(C7648e c7648e, InterfaceC5827g interfaceC5827g) {
            C5207g.m11111f(c7648e, "name");
            this.f38761a = c7648e;
            this.f38762b = interfaceC5827g;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C6849a) {
                if (C5207g.m11106a(this.f38761a, ((C6849a) obj).f38761a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f38761a.hashCode();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b */
    public static abstract class AbstractC6850b {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a */
        public static final class a extends AbstractC6850b {

            /* JADX INFO: renamed from: a */
            public final InterfaceC8830c f38763a;

            public a(InterfaceC8830c interfaceC8830c) {
                this.f38763a = interfaceC8830c;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b */
        public static final class b extends AbstractC6850b {

            /* JADX INFO: renamed from: a */
            public static final b f38764a = new b();
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$c */
        public static final class c extends AbstractC6850b {

            /* JADX INFO: renamed from: a */
            public static final c f38765a = new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final C7669f c7669f, InterfaceC5840t interfaceC5840t, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(c7669f);
        C5207g.m11111f(interfaceC5840t, "jPackage");
        C5207g.m11111f(lazyJavaPackageFragment, "ownerDescriptor");
        this.f38757n = interfaceC5840t;
        this.f38758o = lazyJavaPackageFragment;
        this.f38759p = c7669f.m15268b().mo6219d(new InterfaceC2041a<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Set<? extends String> mo807E() {
                ((C2064a) c7669f.f42146a).f10496b.mo18549a(this.f38758o.f49131e);
                return null;
            }
        });
        this.f38760q = c7669f.m15268b().mo6222g(new InterfaceC2052l<C6849a, InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0064  */
            /* JADX WARN: Code duplicated, block: B:22:0x0069  */
            /* JADX WARN: Code duplicated, block: B:24:0x0074  */
            /* JADX WARN: Code duplicated, block: B:26:0x0089  */
            /* JADX WARN: Code duplicated, block: B:27:0x008c  */
            /* JADX WARN: Code duplicated, block: B:29:0x009d  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:38:0x00be  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
            /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
            /* JADX WARN: Code duplicated, block: B:55:0x012a  */
            /* JADX WARN: Code duplicated, block: B:58:0x0156  */
            /* JADX WARN: Code duplicated, block: B:60:0x0159  */
            /* JADX WARN: Code duplicated, block: B:61:0x0160  */
            /* JADX WARN: Code duplicated, block: B:68:0x017d  */
            /* JADX WARN: Code duplicated, block: B:71:0x018f  */
            /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8830c mo528n(LazyJavaPackageScope.C6849a c6849a) {
                LazyJavaPackageScope.AbstractC6850b aVar;
                C6898a c6898a;
                C10541e c10541eM13772f;
                InterfaceC8830c interfaceC8830cM14121a;
                C7646c c7646cMo12252e;
                C7646c c7646cM15217e;
                LazyJavaPackageFragment lazyJavaPackageFragment2;
                InterfaceC6366j.a.b bVarMo12998c;
                Object obj;
                Object obj2;
                LazyJavaPackageScope.C6849a c6849a2 = c6849a;
                C5207g.m11111f(c6849a2, "request");
                LazyJavaPackageScope lazyJavaPackageScope = this;
                C7645b c7645b = new C7645b(lazyJavaPackageScope.f38758o.f49131e, c6849a2.f38761a);
                C7669f c7669f2 = c7669f;
                InterfaceC5827g interfaceC5827gMo18551c = c6849a2.f38762b;
                InterfaceC6366j.a.b bVarMo12998c2 = interfaceC5827gMo18551c != null ? ((C2064a) c7669f2.f42146a).f10497c.mo12998c(interfaceC5827gMo18551c) : ((C2064a) c7669f2.f42146a).f10497c.mo12997a(c7645b);
                LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
                InterfaceC6367k interfaceC6367k = bVarMo12998c2 != null ? bVarMo12998c2.f36756a : null;
                C7645b c7645bMo13002j = interfaceC6367k != null ? interfaceC6367k.mo13002j() : null;
                if (c7645bMo13002j == null) {
                    if (interfaceC6367k == null) {
                        aVar = LazyJavaPackageScope.AbstractC6850b.b.f38764a;
                    } else if (interfaceC6367k.mo12999a().f38908a == KotlinClassHeader.Kind.CLASS) {
                        c6898a = ((C2064a) lazyJavaPackageScope.f38771b.f42146a).f10498d;
                        c6898a.getClass();
                        c10541eM13772f = c6898a.m13772f(interfaceC6367k);
                        if (c10541eM13772f == null) {
                            interfaceC8830cM14121a = null;
                        } else {
                            interfaceC8830cM14121a = c6898a.m13769c().f52598t.m14121a(interfaceC6367k.mo13002j(), c10541eM13772f);
                        }
                        if (interfaceC8830cM14121a != null) {
                            aVar = new LazyJavaPackageScope.AbstractC6850b.a(interfaceC8830cM14121a);
                        } else {
                            aVar = LazyJavaPackageScope.AbstractC6850b.b.f38764a;
                        }
                    } else {
                        aVar = LazyJavaPackageScope.AbstractC6850b.c.f38765a;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.a) {
                        return ((LazyJavaPackageScope.AbstractC6850b.a) aVar).f38763a;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.c) {
                        return null;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (interfaceC5827gMo18551c == null) {
                        InterfaceC10524i interfaceC10524i = ((C2064a) c7669f2.f42146a).f10496b;
                        if (bVarMo12998c2 != null) {
                            if (!(bVarMo12998c2 instanceof InterfaceC6366j.a.C10639a)) {
                                obj2 = bVarMo12998c2;
                                obj2 = null;
                            }
                            obj2 = bVarMo12998c2;
                        }
                        interfaceC5827gMo18551c = interfaceC10524i.mo18551c(new InterfaceC10524i.a(c7645b, null, 4));
                    }
                    if (interfaceC5827gMo18551c != null) {
                        interfaceC5827gMo18551c.mo12249Q();
                    }
                    if (LightClassOriginKind.BINARY == null) {
                        StringBuilder sb2 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                        sb2.append(interfaceC5827gMo18551c);
                        sb2.append("\nClassId: ");
                        sb2.append(c7645b);
                        sb2.append("\nfindKotlinClass(JavaClass) = ");
                        InterfaceC6366j interfaceC6366j = ((C2064a) c7669f2.f42146a).f10497c;
                        C5207g.m11111f(interfaceC6366j, "<this>");
                        C5207g.m11111f(interfaceC5827gMo18551c, "javaClass");
                        bVarMo12998c = interfaceC6366j.mo12998c(interfaceC5827gMo18551c);
                        if (bVarMo12998c != null) {
                            obj = lazyJavaClassDescriptor;
                            obj = bVarMo12998c.f36756a;
                        }
                        obj = lazyJavaClassDescriptor;
                        sb2.append(obj);
                        sb2.append("\nfindKotlinClass(ClassId) = ");
                        sb2.append(C0062b.m301Q0(((C2064a) c7669f2.f42146a).f10497c, c7645b));
                        sb2.append('\n');
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (interfaceC5827gMo18551c != null) {
                        c7646cMo12252e = interfaceC5827gMo18551c.mo12252e();
                    } else {
                        c7646cMo12252e = null;
                    }
                    if (c7646cMo12252e != null && !c7646cMo12252e.m15216d()) {
                        c7646cM15217e = c7646cMo12252e.m15217e();
                        lazyJavaPackageFragment2 = lazyJavaPackageScope.f38758o;
                        if (!C5207g.m11106a(c7646cM15217e, lazyJavaPackageFragment2.f49131e)) {
                            return null;
                        }
                        LazyJavaClassDescriptor lazyJavaClassDescriptor2 = new LazyJavaClassDescriptor(c7669f2, lazyJavaPackageFragment2, interfaceC5827gMo18551c, null);
                        ((C2064a) c7669f2.f42146a).f10513s.mo19498a(lazyJavaClassDescriptor2);
                        lazyJavaClassDescriptor = lazyJavaClassDescriptor2;
                    }
                } else if (!c7645bMo13002j.m15211k()) {
                    if (c7645bMo13002j.f42075c) {
                        return null;
                    }
                    if (interfaceC6367k == null) {
                        aVar = LazyJavaPackageScope.AbstractC6850b.b.f38764a;
                    } else if (interfaceC6367k.mo12999a().f38908a == KotlinClassHeader.Kind.CLASS) {
                        c6898a = ((C2064a) lazyJavaPackageScope.f38771b.f42146a).f10498d;
                        c6898a.getClass();
                        c10541eM13772f = c6898a.m13772f(interfaceC6367k);
                        if (c10541eM13772f == null) {
                            interfaceC8830cM14121a = null;
                        } else {
                            interfaceC8830cM14121a = c6898a.m13769c().f52598t.m14121a(interfaceC6367k.mo13002j(), c10541eM13772f);
                        }
                        if (interfaceC8830cM14121a != null) {
                            aVar = new LazyJavaPackageScope.AbstractC6850b.a(interfaceC8830cM14121a);
                        } else {
                            aVar = LazyJavaPackageScope.AbstractC6850b.b.f38764a;
                        }
                    } else {
                        aVar = LazyJavaPackageScope.AbstractC6850b.c.f38765a;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.a) {
                        return ((LazyJavaPackageScope.AbstractC6850b.a) aVar).f38763a;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.c) {
                        return null;
                    }
                    if (aVar instanceof LazyJavaPackageScope.AbstractC6850b.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (interfaceC5827gMo18551c == null) {
                        InterfaceC10524i interfaceC10524i2 = ((C2064a) c7669f2.f42146a).f10496b;
                        if (bVarMo12998c2 != null) {
                            if (!(bVarMo12998c2 instanceof InterfaceC6366j.a.C10639a)) {
                                obj2 = bVarMo12998c2;
                                obj2 = null;
                            }
                            obj2 = bVarMo12998c2;
                        }
                        interfaceC5827gMo18551c = interfaceC10524i2.mo18551c(new InterfaceC10524i.a(c7645b, null, 4));
                    }
                    if (interfaceC5827gMo18551c != null) {
                        interfaceC5827gMo18551c.mo12249Q();
                    }
                    if (LightClassOriginKind.BINARY == null) {
                        StringBuilder sb3 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                        sb3.append(interfaceC5827gMo18551c);
                        sb3.append("\nClassId: ");
                        sb3.append(c7645b);
                        sb3.append("\nfindKotlinClass(JavaClass) = ");
                        InterfaceC6366j interfaceC6366j2 = ((C2064a) c7669f2.f42146a).f10497c;
                        C5207g.m11111f(interfaceC6366j2, "<this>");
                        C5207g.m11111f(interfaceC5827gMo18551c, "javaClass");
                        bVarMo12998c = interfaceC6366j2.mo12998c(interfaceC5827gMo18551c);
                        if (bVarMo12998c != null) {
                            obj = lazyJavaClassDescriptor;
                            obj = bVarMo12998c.f36756a;
                        }
                        obj = lazyJavaClassDescriptor;
                        sb3.append(obj);
                        sb3.append("\nfindKotlinClass(ClassId) = ");
                        sb3.append(C0062b.m301Q0(((C2064a) c7669f2.f42146a).f10497c, c7645b));
                        sb3.append('\n');
                        throw new IllegalStateException(sb3.toString());
                    }
                    if (interfaceC5827gMo18551c != null) {
                        c7646cMo12252e = interfaceC5827gMo18551c.mo12252e();
                    } else {
                        c7646cMo12252e = null;
                    }
                    if (c7646cMo12252e != null) {
                        c7646cM15217e = c7646cMo12252e.m15217e();
                        lazyJavaPackageFragment2 = lazyJavaPackageScope.f38758o;
                        if (!C5207g.m11106a(c7646cM15217e, lazyJavaPackageFragment2.f49131e)) {
                            return null;
                        }
                        LazyJavaClassDescriptor lazyJavaClassDescriptor3 = new LazyJavaClassDescriptor(c7669f2, lazyJavaPackageFragment2, interfaceC5827gMo18551c, null);
                        ((C2064a) c7669f2.f42146a).f10513s.mo19498a(lazyJavaClassDescriptor3);
                        lazyJavaClassDescriptor = lazyJavaClassDescriptor3;
                    }
                }
                return lazyJavaClassDescriptor;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return EmptyList.f38032a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: e */
    public final Collection<InterfaceC8838g> mo5303e(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        boolean z10;
        C5207g.m11111f(c9981d, "kindFilter");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        C9981d.a aVar = C9981d.f50711c;
        if (!c9981d.m18557a(C9981d.f50720l | C9981d.f50713e)) {
            return EmptyList.f38032a;
        }
        Collection<InterfaceC8838g> collectionMo807E = this.f38773d.mo807E();
        ArrayList arrayList = new ArrayList();
        while (true) {
            for (Object obj : collectionMo807E) {
                InterfaceC8838g interfaceC8838g = (InterfaceC8838g) obj;
                if (interfaceC8838g instanceof InterfaceC8830c) {
                    C7648e c7648eMo11874a = ((InterfaceC8830c) interfaceC8838g).mo11874a();
                    C5207g.m11110e(c7648eMo11874a, "it.name");
                    if (interfaceC2052l.mo528n(c7648eMo11874a).booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // p466wn.AbstractC9984g, p466wn.InterfaceC9985h
    /* JADX INFO: renamed from: g */
    public final InterfaceC8834e mo5304g(C7648e c7648e, NoLookupLocation noLookupLocation) {
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(noLookupLocation, "location");
        return m13719v(c7648e, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: h */
    public final Set<C7648e> mo13707h(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        if (!c9981d.m18557a(C9981d.f50713e)) {
            return EmptySet.f38034a;
        }
        Set<String> setMo807E = this.f38759p.mo807E();
        if (setMo807E != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setMo807E.iterator();
            while (it.hasNext()) {
                hashSet.add(C7648e.m15232l((String) it.next()));
            }
            return hashSet;
        }
        if (interfaceC2052l == null) {
            interfaceC2052l = FunctionsKt.f39944a;
        }
        EmptyList emptyListMo12282N = this.f38757n.mo12282N(interfaceC2052l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        emptyListMo12282N.getClass();
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i */
    public final Set<C7648e> mo13708i(C9981d c9981d, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c9981d, "kindFilter");
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: k */
    public final InterfaceC5215a mo13710k() {
        return InterfaceC5215a.a.f33295a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: m */
    public final void mo13711m(LinkedHashSet linkedHashSet, C7648e c7648e) {
        C5207g.m11111f(c7648e, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: o */
    public final Set mo13712o(C9981d c9981d) {
        C5207g.m11111f(c9981d, "kindFilter");
        return EmptySet.f38034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: q */
    public final InterfaceC8838g mo13713q() {
        return this.f38758o;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC8830c m13719v(C7648e c7648e, InterfaceC5827g interfaceC5827g) {
        C7648e c7648e2 = C7650g.f42089a;
        C5207g.m11111f(c7648e, "name");
        String strM15235f = c7648e.m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        boolean z10 = true;
        if (!(strM15235f.length() > 0) || c7648e.f42087b) {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        Set<String> setMo807E = this.f38759p.mo807E();
        if (interfaceC5827g != null || setMo807E == null || setMo807E.contains(c7648e.m15235f())) {
            return this.f38760q.mo528n(new C6849a(c7648e, interfaceC5827g));
        }
        return null;
    }
}
