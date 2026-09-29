package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ae.C0062b;
import ao.C1270b;
import cm.InterfaceC2052l;
import co.InterfaceC2072d;
import co.InterfaceC2076h;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import mn.C7646c;
import mn.C7648e;
import p347qm.C8649f;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8867y;
import p385sf.C9000b;
import p465wm.C9974d;
import p541zn.C10544h;
import p541zn.InterfaceC10551o;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7023a implements InterfaceC8867y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2076h f39743a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10551o f39744b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8863u f39745c;

    /* JADX INFO: renamed from: d */
    public C10544h f39746d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072d<C7646c, InterfaceC8865w> f39747e;

    public AbstractC7023a(LockBasedStorageManager lockBasedStorageManager, C9974d c9974d, C6829c c6829c) {
        this.f39743a = lockBasedStorageManager;
        this.f39744b = c9974d;
        this.f39745c = c6829c;
        this.f39747e = lockBasedStorageManager.mo6222g(new InterfaceC2052l<C7646c, InterfaceC8865w>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$fragments$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8865w mo528n(C7646c c7646c) {
                C7646c c7646c2 = c7646c;
                C5207g.m11111f(c7646c2, "fqName");
                AbstractC7023a abstractC7023a = this.f39684b;
                C8649f c8649f = (C8649f) abstractC7023a;
                c8649f.getClass();
                InputStream inputStreamMo18553b = c8649f.f39744b.mo18553b(c7646c2);
                C1270b c1270bM4770a = inputStreamMo18553b != null ? C1270b.a.m4770a(c7646c2, c8649f.f39743a, c8649f.f39745c, inputStreamMo18553b, false) : null;
                if (c1270bM4770a == null) {
                    return null;
                }
                C10544h c10544h = abstractC7023a.f39746d;
                if (c10544h != null) {
                    c1270bM4770a.m14123V0(c10544h);
                    return c1270bM4770a;
                }
                C5207g.m11117l("components");
                throw null;
            }
        });
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: a */
    public final boolean mo13605a(C7646c c7646c) throws IOException {
        InterfaceC8840h interfaceC8840hM4770a;
        C5207g.m11111f(c7646c, "fqName");
        InterfaceC2072d<C7646c, InterfaceC8865w> interfaceC2072d = this.f39747e;
        if (((LockBasedStorageManager.C7044j) interfaceC2072d).m14172b(c7646c)) {
            interfaceC8840hM4770a = (InterfaceC8865w) interfaceC2072d.mo528n(c7646c);
        } else {
            C8649f c8649f = (C8649f) this;
            InputStream inputStreamMo18553b = c8649f.f39744b.mo18553b(c7646c);
            if (inputStreamMo18553b != null) {
                interfaceC8840hM4770a = C1270b.a.m4770a(c7646c, c8649f.f39743a, c8649f.f39745c, inputStreamMo18553b, false);
            } else {
                interfaceC8840hM4770a = null;
            }
        }
        return interfaceC8840hM4770a == null;
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC8865w> mo13606b(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return C9000b.m17253s(this.f39747e.mo528n(c7646c));
    }

    @Override // p372rm.InterfaceC8867y
    /* JADX INFO: renamed from: c */
    public final void mo13607c(C7646c c7646c, ArrayList arrayList) {
        C5207g.m11111f(c7646c, "fqName");
        C0062b.m282K(this.f39747e.mo528n(c7646c), arrayList);
    }

    @Override // p372rm.InterfaceC8866x
    /* JADX INFO: renamed from: t */
    public final Collection<C7646c> mo13608t(C7646c c7646c, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return EmptySet.f38034a;
    }
}
