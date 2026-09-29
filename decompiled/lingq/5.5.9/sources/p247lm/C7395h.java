package p247lm;

import cn.C2064a;
import cn.C2067d;
import cn.InterfaceC2065b;
import dm.C5207g;
import dm.C5212l;
import in.C6360d;
import in.C6362f;
import in.InterfaceC6371o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6796d;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C6891b;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C6892c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6898a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7648e;
import om.C8089f;
import p006a5.C0020c;
import p016an.InterfaceC0129c;
import p016an.InterfaceC0131e;
import p102eo.C5443h;
import p102eo.InterfaceC5442g;
import p248ln.C7407h;
import p289o5.C7940t;
import p338qd.C8573r0;
import p347qm.C8649f;
import p349qo.C8656b;
import p372rm.InterfaceC8843i0;
import p385sf.C9000b;
import p387t0.C9166r;
import p420um.C9579m;
import p465wm.C9972b;
import p465wm.C9974d;
import p465wm.C9976f;
import p465wm.C9977g;
import p516ym.InterfaceC10418c;
import p541zn.C10544h;
import p543do.C5235i;
import sl.C9072e;
import tm.InterfaceC9339a;
import tm.InterfaceC9341c;
import vn.C9764b;
import zm.C10517b;
import zm.InterfaceC10525j;

/* JADX INFO: renamed from: lm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7395h {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f41204a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final C9976f m14782a(Class<?> cls) {
        InterfaceC9339a interfaceC9339aM13572M;
        InterfaceC9341c interfaceC9341cM13572M;
        C5207g.m11111f(cls, "<this>");
        ClassLoader classLoaderM13651d = ReflectClassUtilKt.m13651d(cls);
        C7399l c7399l = new C7399l(classLoaderM13651d);
        ConcurrentHashMap concurrentHashMap = f41204a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c7399l);
        if (weakReference != null) {
            C9976f c9976f = (C9976f) weakReference.get();
            if (c9976f != null) {
                return c9976f;
            }
            concurrentHashMap.remove(c7399l, weakReference);
        }
        C9974d c9974d = new C9974d(classLoaderM13651d);
        ClassLoader classLoader = C9072e.class.getClassLoader();
        C5207g.m11110e(classLoader, "Unit::class.java.classLoader");
        C9974d c9974d2 = new C9974d(classLoader);
        C9972b c9972b = new C9972b(classLoaderM13651d);
        String str = "runtime module for " + classLoaderM13651d;
        C8656b c8656b = C8656b.f46237e;
        C9977g c9977g = C9977g.f50704a;
        C5207g.m11111f(str, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
        C6829c c6829c = new C6829c(C7648e.m15234o("<" + str + '>'), lockBasedStorageManager, jvmBuiltIns, 56);
        lockBasedStorageManager.m14159j(new C8089f(jvmBuiltIns, c6829c));
        jvmBuiltIns.m13573N(c6829c);
        C6898a c6898a = new C6898a();
        C2067d c2067d = new C2067d();
        C7399l c7399l2 = c7399l;
        NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, c6829c);
        InterfaceC6371o.a aVar = InterfaceC6371o.a.f36760a;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        InterfaceC0131e.a aVar2 = InterfaceC0131e.f338a;
        InterfaceC0129c.a aVar3 = InterfaceC0129c.a.f336a;
        EmptyList emptyList = EmptyList.f38032a;
        C9764b c9764b = new C9764b(lockBasedStorageManager, emptyList);
        InterfaceC8843i0.a aVar4 = InterfaceC8843i0.a.f46732a;
        InterfaceC10418c.a aVar5 = InterfaceC10418c.a.f52220a;
        C6796d c6796d = new C6796d(c6829c, notFoundClasses);
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.f38603d;
        C10517b c10517b = new C10517b(javaTypeEnhancementState);
        InterfaceC2065b.a aVar6 = InterfaceC2065b.a.f10519a;
        C6892c c6892c = new C6892c(new C6891b());
        InterfaceC10525j.a aVar7 = InterfaceC10525j.a.f52516a;
        InterfaceC5442g.f33991b.getClass();
        C5443h c5443h = InterfaceC5442g.a.f33993b;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new C2064a(lockBasedStorageManager, c9972b, c9974d, c6898a, aVar2, c8656b, aVar3, c9764b, c9977g, c2067d, aVar, aVar4, aVar5, c6829c, c6796d, c10517b, c6892c, aVar7, aVar6, c5443h, javaTypeEnhancementState, new C5212l()));
        C6362f c6362f = new C6362f(c9974d, c6898a);
        C6360d c6360d = new C6360d(c6829c, notFoundClasses, lockBasedStorageManager, c9974d);
        C9166r c9166r = new C9166r(C9000b.m17251q(C5235i.f33326a));
        AbstractC6795c abstractC6795c = c6829c.f38565d;
        JvmBuiltIns jvmBuiltIns2 = abstractC6795c instanceof JvmBuiltIns ? (JvmBuiltIns) abstractC6795c : null;
        C8573r0 c8573r0 = C8573r0.f45970g;
        if (jvmBuiltIns2 == null || (interfaceC9339aM13572M = jvmBuiltIns2.m13572M()) == null) {
            interfaceC9339aM13572M = InterfaceC9339a.a.f48072a;
        }
        InterfaceC9339a interfaceC9339a = interfaceC9339aM13572M;
        if (jvmBuiltIns2 == null || (interfaceC9341cM13572M = jvmBuiltIns2.m13572M()) == null) {
            interfaceC9341cM13572M = InterfaceC9341c.b.f48074a;
        }
        C10544h c10544h = new C10544h(lockBasedStorageManager, c6829c, c6362f, c6360d, lazyJavaPackageFragmentProvider, c8656b, c8573r0, emptyList, notFoundClasses, interfaceC9339a, interfaceC9341cM13572M, C7407h.f41229a, c5443h, new C9764b(lockBasedStorageManager, emptyList), (List) c9166r.f47694a, 262144);
        c6898a.f38907a = c10544h;
        C7940t c7940t = new C7940t(lazyJavaPackageFragmentProvider);
        c2067d.f10520a = c7940t;
        C8649f c8649f = new C8649f(lockBasedStorageManager, c9974d2, c6829c, notFoundClasses, jvmBuiltIns.m13572M(), jvmBuiltIns.m13572M(), c5443h, new C9764b(lockBasedStorageManager, emptyList));
        c6829c.m13642P0(c6829c);
        c6829c.f38569h = new C9579m(C9000b.m17252r((LazyJavaPackageFragmentProvider) c7940t.f43256a, c8649f), "CompositeProvider@RuntimeModuleData for " + c6829c);
        C9976f c9976f2 = new C9976f(c10544h, new C0020c(c6898a, c9974d));
        while (true) {
            C7399l c7399l3 = c7399l2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(c7399l3, new WeakReference(c9976f2));
            if (weakReference2 == null) {
                return c9976f2;
            }
            C9976f c9976f3 = (C9976f) weakReference2.get();
            if (c9976f3 != null) {
                return c9976f3;
            }
            concurrentHashMap3.remove(c7399l3, weakReference2);
            c7399l2 = c7399l3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
