package kotlin.reflect.jvm.internal.impl.types;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import fo.C5602h;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p372rm.InterfaceC8843i0;
import p385sf.C9000b;
import p543do.AbstractC5231g;
import p543do.AbstractC5257t;
import p543do.InterfaceC5240k0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeConstructor extends AbstractC5231g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2073e<C7051a> f39855b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a */
    public static final class C7051a {

        /* JADX INFO: renamed from: a */
        public final Collection<AbstractC5257t> f39856a;

        /* JADX INFO: renamed from: b */
        public List<? extends AbstractC5257t> f39857b;

        /* JADX WARN: Multi-variable type inference failed */
        public C7051a(Collection<? extends AbstractC5257t> collection) {
            C5207g.m11111f(collection, "allSupertypes");
            this.f39856a = collection;
            this.f39857b = C9000b.m17251q(C5602h.f34421d);
        }
    }

    public AbstractTypeConstructor(InterfaceC2076h interfaceC2076h) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f39855b = interfaceC2076h.mo6220e(new InterfaceC2041a<C7051a>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractTypeConstructor.C7051a mo807E() {
                return new AbstractTypeConstructor.C7051a(this.f39858b.mo11258d());
            }
        }, new InterfaceC2052l<Boolean, C7051a>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractTypeConstructor.C7051a mo528n(Boolean bool) {
                bool.booleanValue();
                return new AbstractTypeConstructor.C7051a(C9000b.m17251q(C5602h.f34421d));
            }
        }, new InterfaceC2052l<C7051a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractTypeConstructor.C7051a c7051a) {
                AbstractTypeConstructor.C7051a c7051a2 = c7051a;
                C5207g.m11111f(c7051a2, "supertypes");
                final AbstractTypeConstructor abstractTypeConstructor = this.f39860b;
                Collection collectionMo17093a = abstractTypeConstructor.mo11259g().mo17093a(abstractTypeConstructor, c7051a2.f39856a, new InterfaceC2052l<InterfaceC5240k0, Iterable<? extends AbstractC5257t>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Iterable<? extends AbstractC5257t> mo528n(InterfaceC5240k0 interfaceC5240k0) {
                        InterfaceC5240k0 interfaceC5240k1 = interfaceC5240k0;
                        C5207g.m11111f(interfaceC5240k1, "it");
                        abstractTypeConstructor.getClass();
                        AbstractTypeConstructor abstractTypeConstructor2 = interfaceC5240k1 instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) interfaceC5240k1 : null;
                        if (abstractTypeConstructor2 != null) {
                            return C6752c.m13438f0(abstractTypeConstructor2.mo11232f(), abstractTypeConstructor2.f39855b.mo807E().f39856a);
                        }
                        Collection<AbstractC5257t> collectionMo11278p = interfaceC5240k1.mo11278p();
                        C5207g.m11110e(collectionMo11278p, "supertypes");
                        return collectionMo11278p;
                    }
                }, new InterfaceC2052l<AbstractC5257t, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(AbstractC5257t abstractC5257t) {
                        AbstractC5257t abstractC5257t2 = abstractC5257t;
                        C5207g.m11111f(abstractC5257t2, "it");
                        abstractTypeConstructor.mo14178j(abstractC5257t2);
                        return C9072e.f47360a;
                    }
                });
                if (collectionMo17093a.isEmpty()) {
                    AbstractC5257t abstractC5257tMo11231e = abstractTypeConstructor.mo11231e();
                    collectionMo17093a = abstractC5257tMo11231e != null ? C9000b.m17251q(abstractC5257tMo11231e) : null;
                    if (collectionMo17093a == null) {
                        collectionMo17093a = EmptyList.f38032a;
                    }
                }
                List<AbstractC5257t> listM13453u0 = collectionMo17093a instanceof List ? (List) collectionMo17093a : null;
                if (listM13453u0 == null) {
                    listM13453u0 = C6752c.m13453u0(collectionMo17093a);
                }
                List<AbstractC5257t> listMo14177i = abstractTypeConstructor.mo14177i(listM13453u0);
                C5207g.m11111f(listMo14177i, "<set-?>");
                c7051a2.f39857b = listMo14177i;
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public abstract Collection<AbstractC5257t> mo11258d();

    /* JADX INFO: renamed from: e */
    public AbstractC5257t mo11231e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Collection mo11232f() {
        return EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC8843i0 mo11259g();

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List<AbstractC5257t> mo11278p() {
        return this.f39855b.mo807E().f39857b;
    }

    /* JADX INFO: renamed from: i */
    public List<AbstractC5257t> mo14177i(List<AbstractC5257t> list) {
        C5207g.m11111f(list, "supertypes");
        return list;
    }

    /* JADX INFO: renamed from: j */
    public void mo14178j(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "type");
    }
}
