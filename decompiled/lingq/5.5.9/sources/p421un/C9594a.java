package p421un;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import tl.C9327o;

/* JADX INFO: renamed from: un.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9594a implements InterfaceC9596c {

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC9596c> f49261b;

    public C9594a(EmptyList emptyList) {
        C5207g.m11111f(emptyList, "inner");
        this.f49261b = emptyList;
    }

    @Override // p421un.InterfaceC9596c
    /* JADX INFO: renamed from: a */
    public final void mo18058a(LazyJavaClassDescriptor lazyJavaClassDescriptor, C7648e c7648e, ArrayList arrayList) {
        C5207g.m11111f(lazyJavaClassDescriptor, "thisDescriptor");
        C5207g.m11111f(c7648e, "name");
        Iterator<T> it = this.f49261b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9596c) it.next()).mo18058a(lazyJavaClassDescriptor, c7648e, arrayList);
        }
    }

    @Override // p421un.InterfaceC9596c
    /* JADX INFO: renamed from: b */
    public final ArrayList mo18059b(InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC8830c, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f49261b.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((InterfaceC9596c) it.next()).mo18059b(interfaceC8830c), arrayList);
        }
        return arrayList;
    }

    @Override // p421un.InterfaceC9596c
    /* JADX INFO: renamed from: c */
    public final void mo18060c(InterfaceC8830c interfaceC8830c, C7648e c7648e, ArrayList arrayList) {
        C5207g.m11111f(interfaceC8830c, "thisDescriptor");
        C5207g.m11111f(c7648e, "name");
        Iterator<T> it = this.f49261b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9596c) it.next()).mo18060c(interfaceC8830c, c7648e, arrayList);
        }
    }

    @Override // p421un.InterfaceC9596c
    /* JADX INFO: renamed from: d */
    public final ArrayList mo18061d(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        C5207g.m11111f(lazyJavaClassDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f49261b.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((InterfaceC9596c) it.next()).mo18061d(lazyJavaClassDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // p421un.InterfaceC9596c
    /* JADX INFO: renamed from: e */
    public final void mo18062e(InterfaceC8830c interfaceC8830c, ArrayList arrayList) {
        C5207g.m11111f(interfaceC8830c, "thisDescriptor");
        Iterator<T> it = this.f49261b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9596c) it.next()).mo18062e(interfaceC8830c, arrayList);
        }
    }
}
