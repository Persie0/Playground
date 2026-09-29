package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo.C1628f;
import bo.InterfaceC1626d;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kn.AbstractC6731a;
import kn.C6734d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8863u;
import p541zn.AbstractC10547k;
import p541zn.C10544h;
import p541zn.C10553q;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragmentImpl extends AbstractC10547k {

    /* JADX INFO: renamed from: g */
    public final AbstractC6731a f39692g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1626d f39693h;

    /* JADX INFO: renamed from: i */
    public final C6734d f39694i;

    /* JADX INFO: renamed from: j */
    public final C10553q f39695j;

    /* JADX INFO: renamed from: k */
    public ProtoBuf$PackageFragment f39696k;

    /* JADX INFO: renamed from: l */
    public C1628f f39697l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(C7646c c7646c, InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, ProtoBuf$PackageFragment protoBuf$PackageFragment, AbstractC6731a abstractC6731a) {
        super(c7646c, interfaceC2076h, interfaceC8863u);
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8863u, "module");
        this.f39692g = abstractC6731a;
        this.f39693h = null;
        ProtoBuf$StringTable protoBuf$StringTable = protoBuf$PackageFragment.f39170d;
        C5207g.m11110e(protoBuf$StringTable, "proto.strings");
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = protoBuf$PackageFragment.f39171e;
        C5207g.m11110e(protoBuf$QualifiedNameTable, "proto.qualifiedNames");
        C6734d c6734d = new C6734d(protoBuf$StringTable, protoBuf$QualifiedNameTable);
        this.f39694i = c6734d;
        this.f39695j = new C10553q(protoBuf$PackageFragment, c6734d, abstractC6731a, new InterfaceC2052l<C7645b, InterfaceC8837f0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$classDataFinder$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8837f0 mo528n(C7645b c7645b) {
                C5207g.m11111f(c7645b, "it");
                InterfaceC1626d interfaceC1626d = this.f39698b.f39693h;
                return interfaceC1626d != null ? interfaceC1626d : InterfaceC8837f0.f46730a;
            }
        });
        this.f39696k = protoBuf$PackageFragment;
    }

    @Override // p541zn.AbstractC10547k
    /* JADX INFO: renamed from: P0 */
    public final C10553q mo14122P0() {
        return this.f39695j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V0 */
    public final void m14123V0(C10544h c10544h) {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f39696k;
        if (protoBuf$PackageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f39696k = null;
        ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.f39172f;
        C5207g.m11110e(protoBuf$Package, "proto.`package`");
        this.f39697l = new C1628f(this, protoBuf$Package, this.f39694i, this.f39692g, this.f39693h, c10544h, "scope of " + this, new InterfaceC2041a<Collection<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends C7648e> mo807E() {
                Set setKeySet = this.f39699b.f39695j.f52611d.keySet();
                ArrayList arrayList = new ArrayList();
                Iterator it = setKeySet.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        C7645b c7645b = (C7645b) next;
                        if ((c7645b.m15211k() || ClassDeserializer.f39685c.contains(c7645b)) ? false : true) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C7645b) it2.next()).m15210j());
                }
                return arrayList2;
            }
        });
    }

    @Override // p372rm.InterfaceC8865w
    /* JADX INFO: renamed from: q */
    public final MemberScope mo13718q() {
        C1628f c1628f = this.f39697l;
        if (c1628f != null) {
            return c1628f;
        }
        C5207g.m11117l("_memberScope");
        throw null;
    }
}
