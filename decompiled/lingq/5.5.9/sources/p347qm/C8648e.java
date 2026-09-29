package p347qm;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jo.C6530b;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: qm.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8648e<N> implements C6530b.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JvmBuiltInsCustomizer f46218a;

    public C8648e(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f46218a = jvmBuiltInsCustomizer;
    }

    @Override // jo.C6530b.b
    /* JADX INFO: renamed from: c */
    public final Iterable mo13114c(Object obj) {
        Collection<AbstractC5257t> collectionMo11278p = ((InterfaceC8830c) obj).mo13600k().mo11278p();
        C5207g.m11110e(collectionMo11278p, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo11278p.iterator();
        while (it.hasNext()) {
            InterfaceC8834e interfaceC8834eMo11235q = ((AbstractC5257t) it.next()).mo11250X0().mo11235q();
            InterfaceC8834e interfaceC8834eMo18004P0 = interfaceC8834eMo11235q != null ? interfaceC8834eMo11235q.mo18004P0() : null;
            InterfaceC8830c interfaceC8830c = interfaceC8834eMo18004P0 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo18004P0 : null;
            LazyJavaClassDescriptor lazyJavaClassDescriptorM13579f = interfaceC8830c != null ? this.f46218a.m13579f(interfaceC8830c) : null;
            if (lazyJavaClassDescriptorM13579f != null) {
                arrayList.add(lazyJavaClassDescriptorM13579f);
            }
        }
        return arrayList;
    }
}
