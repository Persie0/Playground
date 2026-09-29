package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import jo.C6530b;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import p249lo.C7420m;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6855a<N> implements C6530b.b {

    /* JADX INFO: renamed from: a */
    public static final C6855a<N> f38810a = new C6855a<>();

    @Override // jo.C6530b.b
    /* JADX INFO: renamed from: c */
    public final Iterable mo13114c(Object obj) {
        Collection<AbstractC5257t> collectionMo11278p = ((InterfaceC8830c) obj).mo13600k().mo11278p();
        C5207g.m11110e(collectionMo11278p, "it.typeConstructor.supertypes");
        return new C7420m(C7073a.m14262W2(C6752c.m13413G(collectionMo11278p), new InterfaceC2052l<AbstractC5257t, InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8830c mo528n(AbstractC5257t abstractC5257t) {
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
                if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
                    return (InterfaceC8830c) interfaceC8834eMo11235q;
                }
                return null;
            }
        }));
    }
}
