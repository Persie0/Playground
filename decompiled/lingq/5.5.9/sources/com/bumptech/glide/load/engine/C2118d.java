package com.bumptech.glide.load.engine;

import ae.C0062b;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p081e0.C5298b1;
import p110f6.C5472c;
import p110f6.InterfaceC5471b;
import p147h6.C5894a;
import p147h6.C5895b;
import p147h6.C5896c;
import p258m6.C7491k;
import p326q.C8446b;
import p356r5.C8735e;
import p356r5.InterfaceC8731a;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8738h;
import p392t5.AbstractC9200f;
import p392t5.C9199e;
import p392t5.C9205k;
import p474x5.C10092q;
import p474x5.InterfaceC10090o;
import p525z5.C10444c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2118d<Transcode> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f10697a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f10698b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C2085g f10699c;

    /* JADX INFO: renamed from: d */
    public Object f10700d;

    /* JADX INFO: renamed from: e */
    public int f10701e;

    /* JADX INFO: renamed from: f */
    public int f10702f;

    /* JADX INFO: renamed from: g */
    public Class<?> f10703g;

    /* JADX INFO: renamed from: h */
    public DecodeJob.InterfaceC2112e f10704h;

    /* JADX INFO: renamed from: i */
    public C8735e f10705i;

    /* JADX INFO: renamed from: j */
    public Map<Class<?>, InterfaceC8738h<?>> f10706j;

    /* JADX INFO: renamed from: k */
    public Class<Transcode> f10707k;

    /* JADX INFO: renamed from: l */
    public boolean f10708l;

    /* JADX INFO: renamed from: m */
    public boolean f10709m;

    /* JADX INFO: renamed from: n */
    public InterfaceC8732b f10710n;

    /* JADX INFO: renamed from: o */
    public Priority f10711o;

    /* JADX INFO: renamed from: p */
    public AbstractC9200f f10712p;

    /* JADX INFO: renamed from: q */
    public boolean f10713q;

    /* JADX INFO: renamed from: r */
    public boolean f10714r;

    /* JADX INFO: renamed from: a */
    public final ArrayList m6308a() {
        boolean z10 = this.f10709m;
        ArrayList arrayList = this.f10698b;
        if (!z10) {
            this.f10709m = true;
            arrayList.clear();
            ArrayList arrayListM6309b = m6309b();
            int size = arrayListM6309b.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC10090o.a aVar = (InterfaceC10090o.a) arrayListM6309b.get(i10);
                if (!arrayList.contains(aVar.f51179a)) {
                    arrayList.add(aVar.f51179a);
                }
                int i11 = 0;
                while (true) {
                    List<InterfaceC8732b> list = aVar.f51180b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m6309b() {
        boolean z10 = this.f10708l;
        ArrayList arrayList = this.f10697a;
        if (!z10) {
            this.f10708l = true;
            arrayList.clear();
            List listM6231e = this.f10699c.m6240a().m6231e(this.f10700d);
            int size = listM6231e.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC10090o.a aVarMo18920b = ((InterfaceC10090o) listM6231e.get(i10)).mo18920b(this.f10700d, this.f10701e, this.f10702f, this.f10705i);
                if (aVarMo18920b != null) {
                    arrayList.add(aVarMo18920b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final <Data> C9205k<Data, ?, Transcode> m6310c(Class<Data> cls) {
        C9205k<Data, ?, Transcode> c9205k;
        ArrayList arrayList;
        C5472c.a aVar;
        InterfaceC5471b interfaceC5471b;
        Registry registryM6240a = this.f10699c.m6240a();
        Class<?> cls2 = this.f10703g;
        Class cls3 = (Class<Transcode>) this.f10707k;
        C5895b c5895b = registryM6240a.f10546i;
        C7491k andSet = c5895b.f35227b.getAndSet(null);
        if (andSet == null) {
            andSet = new C7491k();
        }
        andSet.f41380a = cls;
        andSet.f41381b = cls2;
        andSet.f41382c = cls3;
        synchronized (c5895b.f35226a) {
            c9205k = (C9205k) c5895b.f35226a.getOrDefault(andSet, null);
        }
        c5895b.f35227b.set(andSet);
        registryM6240a.f10546i.getClass();
        if (C5895b.f35225c.equals(c9205k)) {
            return null;
        }
        if (c9205k != null) {
            return c9205k;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : registryM6240a.f10540c.m12318b(cls, cls2)) {
            for (Class cls5 : registryM6240a.f10543f.m11712a(cls4, cls3)) {
                C5896c c5896c = registryM6240a.f10540c;
                synchronized (c5896c) {
                    arrayList = new ArrayList();
                    Iterator it = c5896c.f35228a.iterator();
                    while (it.hasNext()) {
                        List<C5896c.a> list = (List) c5896c.f35229b.get((String) it.next());
                        if (list != null) {
                            for (C5896c.a aVar2 : list) {
                                if (aVar2.f35230a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar2.f35231b)) {
                                    arrayList.add(aVar2.f35232c);
                                }
                            }
                        }
                    }
                }
                C5472c c5472c = registryM6240a.f10543f;
                synchronized (c5472c) {
                    if (cls5.isAssignableFrom(cls4)) {
                        interfaceC5471b = C0062b.f161h;
                    } else {
                        Iterator it2 = c5472c.f34059a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            aVar = (C5472c.a) it2.next();
                        } while (!(aVar.f34060a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar.f34061b)));
                        interfaceC5471b = aVar.f34062c;
                    }
                }
                arrayList2.add(new C9199e(cls, cls4, cls5, arrayList, interfaceC5471b, registryM6240a.f10547j));
            }
        }
        C9205k<Data, ?, Transcode> c9205k2 = arrayList2.isEmpty() ? null : new C9205k<>(cls, cls2, cls3, arrayList2, registryM6240a.f10547j);
        C5895b c5895b2 = registryM6240a.f10546i;
        synchronized (c5895b2.f35226a) {
            c5895b2.f35226a.put(new C7491k(cls, cls2, cls3), (C9205k<?, ?, ?>) (c9205k2 != null ? c9205k2 : C5895b.f35225c));
        }
        return c9205k2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final List<Class<?>> m6311d() {
        List<Class<?>> list;
        ArrayList arrayListM18943d;
        Registry registryM6240a = this.f10699c.m6240a();
        Class<?> cls = this.f10700d.getClass();
        Class<?> cls2 = this.f10703g;
        Class cls3 = this.f10707k;
        C5298b1 c5298b1 = registryM6240a.f10545h;
        C7491k c7491k = (C7491k) ((AtomicReference) c5298b1.f33572a).getAndSet(null);
        if (c7491k == null) {
            c7491k = new C7491k(cls, cls2, cls3);
        } else {
            c7491k.f41380a = cls;
            c7491k.f41381b = cls2;
            c7491k.f41382c = cls3;
        }
        synchronized (((C8446b) c5298b1.f33573b)) {
            try {
                list = (List) ((C8446b) c5298b1.f33573b).getOrDefault(c7491k, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((AtomicReference) c5298b1.f33572a).set(c7491k);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C10092q c10092q = registryM6240a.f10538a;
            synchronized (c10092q) {
                try {
                    arrayListM18943d = c10092q.f51182a.m18943d(cls);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Iterator it = arrayListM18943d.iterator();
            while (it.hasNext()) {
                for (Class cls4 : registryM6240a.f10540c.m12318b((Class) it.next(), cls2)) {
                    if (!registryM6240a.f10543f.m11712a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C5298b1 c5298b2 = registryM6240a.f10545h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C8446b) c5298b2.f33573b)) {
                ((C8446b) c5298b2.f33573b).put(new C7491k(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final <X> InterfaceC8731a<X> m6312e(X x10) throws Registry.NoSourceEncoderAvailableException {
        InterfaceC8731a<X> interfaceC8731a;
        C5894a c5894a = this.f10699c.m6240a().f10539b;
        Class<?> cls = x10.getClass();
        synchronized (c5894a) {
            try {
                for (C5894a.a aVar : c5894a.f35222a) {
                    if (aVar.f35223a.isAssignableFrom(cls)) {
                        interfaceC8731a = (InterfaceC8731a<X>) aVar.f35224b;
                    }
                }
                interfaceC8731a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC8731a != null) {
            return interfaceC8731a;
        }
        throw new Registry.NoSourceEncoderAvailableException(x10.getClass());
    }

    /* JADX INFO: renamed from: f */
    public final <Z> InterfaceC8738h<Z> m6313f(Class<Z> cls) {
        InterfaceC8738h<Z> interfaceC8738h = (InterfaceC8738h) this.f10706j.get(cls);
        if (interfaceC8738h == null) {
            for (Map.Entry<Class<?>, InterfaceC8738h<?>> entry : this.f10706j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    interfaceC8738h = (InterfaceC8738h) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC8738h != null) {
            return interfaceC8738h;
        }
        if (this.f10706j.isEmpty() && this.f10713q) {
            throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        }
        return C10444c.f52291b;
    }
}
