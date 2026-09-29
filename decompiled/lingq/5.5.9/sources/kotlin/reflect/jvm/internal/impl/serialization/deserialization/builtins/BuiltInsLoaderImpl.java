package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.activity.result.C0204c;
import ao.C1269a;
import ao.C1270b;
import ao.C1271c;
import co.InterfaceC2076h;
import dm.C5207g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import mn.C7646c;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8866x;
import p541zn.C10538b;
import p541zn.C10544h;
import p541zn.C10546j;
import p541zn.InterfaceC10548l;
import p541zn.InterfaceC10549m;
import tl.C9325m;
import tm.InterfaceC9339a;
import tm.InterfaceC9340b;
import tm.InterfaceC9341c;
import vn.C9764b;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: b */
    public final C1271c f39749b = new C1271c();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    /* JADX INFO: renamed from: a */
    public InterfaceC8866x mo13527a(InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, Iterable<? extends InterfaceC9340b> iterable, InterfaceC9341c interfaceC9341c, InterfaceC9339a interfaceC9339a, boolean z10) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8863u, "builtInsModule");
        C5207g.m11111f(iterable, "classDescriptorFactories");
        C5207g.m11111f(interfaceC9341c, "platformDependentDeclarationFilter");
        C5207g.m11111f(interfaceC9339a, "additionalClassPartsProvider");
        Set<C7646c> set = C6797e.f38348n;
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f39749b);
        C5207g.m11111f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(set, 10));
        for (C7646c c7646c : set) {
            C1269a.f7952m.getClass();
            String strM4769a = C1269a.m4769a(c7646c);
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.mo528n(strM4769a);
            if (inputStream == null) {
                throw new IllegalStateException(C0204c.m852k("Resource not found in classpath: ", strM4769a));
            }
            arrayList.add(C1270b.a.m4770a(c7646c, interfaceC2076h, interfaceC8863u, inputStream, z10));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(interfaceC2076h, interfaceC8863u);
        C10546j c10546j = new C10546j(packageFragmentProviderImpl);
        C1269a c1269a = C1269a.f7952m;
        C10544h c10544h = new C10544h(interfaceC2076h, interfaceC8863u, c10546j, new C10538b(interfaceC8863u, notFoundClasses, c1269a), packageFragmentProviderImpl, InterfaceC10548l.f52601b, InterfaceC10549m.a.f52602a, iterable, notFoundClasses, interfaceC9339a, interfaceC9341c, c1269a.f52221a, null, new C9764b(interfaceC2076h, EmptyList.f38032a), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1270b) it.next()).m14123V0(c10544h);
        }
        return packageFragmentProviderImpl;
    }
}
