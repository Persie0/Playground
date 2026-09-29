package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7646c;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8868z;
import p420um.AbstractC9581n;
import p420um.C9572i0;
import p420um.C9579m;
import p466wn.C9979b;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyPackageViewDescriptorImpl extends AbstractC9581n implements InterfaceC8868z {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38492h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: c */
    public final C6829c f38493c;

    /* JADX INFO: renamed from: d */
    public final C7646c f38494d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2073e f38495e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2073e f38496f;

    /* JADX INFO: renamed from: g */
    public final LazyScopeAdapter f38497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(C6829c c6829c, C7646c c7646c, InterfaceC2076h interfaceC2076h) {
        super(InterfaceC9077e.a.f47365a, c7646c.m15219g());
        C5207g.m11111f(c6829c, "module");
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f38493c = c6829c;
        this.f38494d = c7646c;
        this.f38495e = interfaceC2076h.mo6217b(new InterfaceC2041a<List<? extends InterfaceC8865w>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends InterfaceC8865w> mo807E() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f38499b;
                C6829c c6829c2 = lazyPackageViewDescriptorImpl.f38493c;
                c6829c2.m13641J0();
                return C0062b.m281J1((C9579m) c6829c2.f38572k.getValue(), lazyPackageViewDescriptorImpl.f38494d);
            }
        });
        this.f38496f = interfaceC2076h.mo6217b(new InterfaceC2041a<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$empty$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Boolean mo807E() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f38498b;
                C6829c c6829c2 = lazyPackageViewDescriptorImpl.f38493c;
                c6829c2.m13641J0();
                return Boolean.valueOf(C0062b.m406v1((C9579m) c6829c2.f38572k.getValue(), lazyPackageViewDescriptorImpl.f38494d));
            }
        });
        this.f38497g = new LazyScopeAdapter(interfaceC2076h, new InterfaceC2041a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final MemberScope mo807E() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f38500b;
                if (lazyPackageViewDescriptorImpl.isEmpty()) {
                    return MemberScope.C7015a.f39670b;
                }
                List<InterfaceC8865w> listMo13626Q = lazyPackageViewDescriptorImpl.mo13626Q();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo13626Q, 10));
                Iterator<T> it = listMo13626Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC8865w) it.next()).mo13718q());
                }
                C6829c c6829c2 = lazyPackageViewDescriptorImpl.f38493c;
                C7646c c7646c2 = lazyPackageViewDescriptorImpl.f38494d;
                return C9979b.a.m18555a("package view scope for " + c7646c2 + " in " + c6829c2.mo11874a(), C6752c.m13439g0(new C9572i0(c6829c2, c7646c2), arrayList));
            }
        });
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14060i(this, d10);
    }

    @Override // p372rm.InterfaceC8868z
    /* JADX INFO: renamed from: C0 */
    public final C6829c mo13625C0() {
        return this.f38493c;
    }

    @Override // p372rm.InterfaceC8868z
    /* JADX INFO: renamed from: Q */
    public final List<InterfaceC8865w> mo13626Q() {
        return (List) C0062b.m366l1(this.f38495e, f38492h[0]);
    }

    @Override // p372rm.InterfaceC8868z
    /* JADX INFO: renamed from: e */
    public final C7646c mo13627e() {
        return this.f38494d;
    }

    public final boolean equals(Object obj) {
        InterfaceC8868z interfaceC8868z = obj instanceof InterfaceC8868z ? (InterfaceC8868z) obj : null;
        if (interfaceC8868z == null) {
            return false;
        }
        if (C5207g.m11106a(this.f38494d, interfaceC8868z.mo13627e())) {
            return C5207g.m11106a(this.f38493c, interfaceC8868z.mo13625C0());
        }
        return false;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        C7646c c7646c = this.f38494d;
        if (c7646c.m15216d()) {
            return null;
        }
        C7646c c7646cM15217e = c7646c.m15217e();
        C5207g.m11110e(c7646cM15217e, "fqName.parent()");
        return this.f38493c.mo11873R(c7646cM15217e);
    }

    public final int hashCode() {
        return this.f38494d.hashCode() + (this.f38493c.hashCode() * 31);
    }

    @Override // p372rm.InterfaceC8868z
    public final boolean isEmpty() {
        return ((Boolean) C0062b.m366l1(this.f38496f, f38492h[1])).booleanValue();
    }

    @Override // p372rm.InterfaceC8868z
    /* JADX INFO: renamed from: q */
    public final MemberScope mo13628q() {
        return this.f38497g;
    }
}
