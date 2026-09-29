package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2069a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7646c;
import p266n.C7669f;
import p372rm.InterfaceC8867y;
import p385sf.C9000b;
import p491xm.C10245t;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragmentProvider implements InterfaceC8867y {

    /* JADX INFO: renamed from: a */
    public final C7669f f38669a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2069a<C7646c, LazyJavaPackageFragment> f38670b;

    public LazyJavaPackageFragmentProvider(C2064a c2064a) {
        C7669f c7669f = new C7669f(c2064a, InterfaceC2068e.a.f10521a, new InitializedLazyImpl(null));
        this.f38669a = c7669f;
        this.f38670b = c7669f.m15268b().mo6218c();
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: a */
    public final boolean mo13605a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return ((C2064a) this.f38669a.f42146a).f10496b.mo18550b(c7646c) == null;
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: b */
    public final List<LazyJavaPackageFragment> mo13606b(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return C9000b.m17253s(m13683d(c7646c));
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: c */
    public final void mo13607c(C7646c c7646c, ArrayList arrayList) {
        C5207g.m11111f(c7646c, "fqName");
        C0062b.m282K(m13683d(c7646c), arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final LazyJavaPackageFragment m13683d(C7646c c7646c) {
        final C10245t c10245tMo18550b = ((C2064a) this.f38669a.f42146a).f10496b.mo18550b(c7646c);
        if (c10245tMo18550b == null) {
            return null;
        }
        return (LazyJavaPackageFragment) ((LockBasedStorageManager.C7036b) this.f38670b).m14162d(c7646c, new InterfaceC2041a<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final LazyJavaPackageFragment mo807E() {
                return new LazyJavaPackageFragment(this.f38671b.f38669a, c10245tMo18550b);
            }
        });
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: t */
    public final Collection mo13608t(C7646c c7646c, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentM13683d = m13683d(c7646c);
        List<C7646c> listMo807E = lazyJavaPackageFragmentM13683d != null ? lazyJavaPackageFragmentM13683d.f38751k.mo807E() : null;
        return listMo807E == null ? EmptyList.f38032a : listMo807E;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C2064a) this.f38669a.f42146a).f10509o;
    }
}
