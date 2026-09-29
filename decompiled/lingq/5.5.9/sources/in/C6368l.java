package in;

import ae.C0062b;
import dm.C5207g;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p372rm.InterfaceC8837f0;

/* JADX INFO: renamed from: in.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C6368l implements InterfaceC8837f0 {

    /* JADX INFO: renamed from: b */
    public final LazyJavaPackageFragment f36757b;

    public C6368l(LazyJavaPackageFragment lazyJavaPackageFragment) {
        C5207g.m11111f(lazyJavaPackageFragment, "packageFragment");
        this.f36757b = lazyJavaPackageFragment;
    }

    @Override // p372rm.InterfaceC8837f0
    /* JADX INFO: renamed from: a */
    public final void mo12989a() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f36757b;
        sb2.append(lazyJavaPackageFragment);
        sb2.append(": ");
        lazyJavaPackageFragment.getClass();
        sb2.append(((Map) C0062b.m366l1(lazyJavaPackageFragment.f38749i, LazyJavaPackageFragment.f38746H[0])).keySet());
        return sb2.toString();
    }
}
