package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2071c;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C6740a;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7646c;
import mn.C7648e;
import p080e.C5288t;
import p372rm.C8860r;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8861s;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8866x;
import p372rm.InterfaceC8868z;
import p420um.AbstractC9581n;
import p420um.C9579m;
import p420um.C9592y;
import p420um.InterfaceC9558b0;
import p420um.InterfaceC9591x;
import sl.C9072e;
import sl.InterfaceC9070c;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6829c extends AbstractC9581n implements InterfaceC8863u {

    /* JADX INFO: renamed from: c */
    public final InterfaceC2076h f38564c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6795c f38565d;

    /* JADX INFO: renamed from: e */
    public final Map<C5288t, Object> f38566e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9558b0 f38567f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9591x f38568g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8866x f38569h;

    /* JADX INFO: renamed from: i */
    public final boolean f38570i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2071c<C7646c, InterfaceC8868z> f38571j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC9070c f38572k;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6829c() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6829c(C7648e c7648e, InterfaceC2076h interfaceC2076h, AbstractC6795c abstractC6795c, int i10) {
        super(InterfaceC9077e.a.f47365a, c7648e);
        Map<C5288t, Object> mapM13459L0 = (i10 & 16) != 0 ? C6753d.m13459L0() : null;
        C5207g.m11111f(mapM13459L0, "capabilities");
        this.f38564c = interfaceC2076h;
        this.f38565d = abstractC6795c;
        if (!c7648e.f42087b) {
            throw new IllegalArgumentException("Module name must be special: " + c7648e);
        }
        this.f38566e = mapM13459L0;
        InterfaceC9558b0.f49140a.getClass();
        InterfaceC9558b0 interfaceC9558b0 = (InterfaceC9558b0) mo11872O(InterfaceC9558b0.a.f49142b);
        this.f38567f = interfaceC9558b0 == null ? InterfaceC9558b0.b.f49143b : interfaceC9558b0;
        this.f38570i = true;
        this.f38571j = interfaceC2076h.mo6221f(new InterfaceC2052l<C7646c, InterfaceC8868z>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8868z mo528n(C7646c c7646c) {
                C7646c c7646c2 = c7646c;
                C5207g.m11111f(c7646c2, "fqName");
                C6829c c6829c = this.f38502b;
                return c6829c.f38567f.mo18001a(c6829c, c7646c2, c6829c.f38564c);
            }
        });
        this.f38572k = C6740a.m13372a(new InterfaceC2041a<C9579m>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9579m mo807E() {
                C6829c c6829c = this.f38501b;
                InterfaceC9591x interfaceC9591x = c6829c.f38568g;
                if (interfaceC9591x == null) {
                    StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                    String str = c6829c.mo11874a().f42086a;
                    C5207g.m11110e(str, "name.toString()");
                    sb2.append(str);
                    sb2.append(" were not set before querying module content");
                    throw new AssertionError(sb2.toString());
                }
                List<C6829c> listMo18054a = interfaceC9591x.mo18054a();
                c6829c.m13641J0();
                listMo18054a.contains(c6829c);
                Iterator<T> it = listMo18054a.iterator();
                while (it.hasNext()) {
                    ((C6829c) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo18054a, 10));
                Iterator<T> it2 = listMo18054a.iterator();
                while (it2.hasNext()) {
                    InterfaceC8866x interfaceC8866x = ((C6829c) it2.next()).f38569h;
                    C5207g.m11108c(interfaceC8866x);
                    arrayList.add(interfaceC8866x);
                }
                return new C9579m(arrayList, "CompositeProvider@ModuleDescriptor for " + c6829c.mo11874a());
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: A0 */
    public final List<InterfaceC8863u> mo11870A0() {
        InterfaceC9591x interfaceC9591x = this.f38568g;
        if (interfaceC9591x != null) {
            return interfaceC9591x.mo18056c();
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = mo11874a().f42086a;
        C5207g.m11110e(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14054c(this, d10);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m13641J0() {
        C9072e c9072e;
        if (this.f38570i) {
            return;
        }
        InterfaceC8861s interfaceC8861s = (InterfaceC8861s) mo11872O(C8860r.f46766a);
        if (interfaceC8861s != null) {
            interfaceC8861s.m17119a();
            c9072e = C9072e.f47360a;
        } else {
            c9072e = null;
        }
        if (c9072e != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + this);
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: O */
    public final <T> T mo11872O(C5288t c5288t) {
        C5207g.m11111f(c5288t, "capability");
        T t10 = (T) this.f38566e.get(c5288t);
        if (t10 == null) {
            t10 = null;
        }
        return t10;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m13642P0(C6829c... c6829cArr) {
        List listM13391w0 = C6744b.m13391w0(c6829cArr);
        C5207g.m11111f(listM13391w0, "descriptors");
        EmptySet emptySet = EmptySet.f38034a;
        C5207g.m11111f(emptySet, "friends");
        this.f38568g = new C9592y(listM13391w0, emptySet, EmptyList.f38032a, emptySet);
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: R */
    public final InterfaceC8868z mo11873R(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        m13641J0();
        return (InterfaceC8868z) ((LockBasedStorageManager.C7045k) this.f38571j).mo528n(c7646c);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return null;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11877o() {
        return this.f38565d;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: t */
    public final Collection<C7646c> mo11878t(C7646c c7646c, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        m13641J0();
        m13641J0();
        return ((C9579m) this.f38572k.getValue()).mo13608t(c7646c, interfaceC2052l);
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: t0 */
    public final boolean mo11879t0(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "targetModule");
        if (C5207g.m11106a(this, interfaceC8863u)) {
            return true;
        }
        InterfaceC9591x interfaceC9591x = this.f38568g;
        C5207g.m11108c(interfaceC9591x);
        if (!C6752c.m13415I(interfaceC9591x.mo18055b(), interfaceC8863u) && !mo11870A0().contains(interfaceC8863u) && !interfaceC8863u.mo11870A0().contains(this)) {
            return false;
        }
        return true;
    }
}
