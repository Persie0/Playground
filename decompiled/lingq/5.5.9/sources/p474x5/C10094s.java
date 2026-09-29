package p474x5;

import ae.C0062b;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p272n6.C7709a;
import p356r5.C8735e;
import p446w2.InterfaceC9806d;

/* JADX INFO: renamed from: x5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C10094s {

    /* JADX INFO: renamed from: e */
    public static final c f51195e = new c();

    /* JADX INFO: renamed from: f */
    public static final a f51196f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList f51197a;

    /* JADX INFO: renamed from: b */
    public final c f51198b;

    /* JADX INFO: renamed from: c */
    public final HashSet f51199c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9806d<List<Throwable>> f51200d;

    /* JADX INFO: renamed from: x5.s$a */
    public static class a implements InterfaceC10090o<Object, Object> {
        @Override // p474x5.InterfaceC10090o
        /* JADX INFO: renamed from: a */
        public final boolean mo18919a(Object obj) {
            return false;
        }

        @Override // p474x5.InterfaceC10090o
        /* JADX INFO: renamed from: b */
        public final InterfaceC10090o.a<Object> mo18920b(Object obj, int i10, int i11, C8735e c8735e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x5.s$b */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a */
        public final Class<Model> f51201a;

        /* JADX INFO: renamed from: b */
        public final Class<Data> f51202b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC10091p<? extends Model, ? extends Data> f51203c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC10091p<? extends Model, ? extends Data> interfaceC10091p) {
            this.f51201a = cls;
            this.f51202b = cls2;
            this.f51203c = interfaceC10091p;
        }
    }

    /* JADX INFO: renamed from: x5.s$c */
    public static class c {
    }

    public C10094s(C7709a.c cVar) {
        c cVar2 = f51195e;
        this.f51197a = new ArrayList();
        this.f51199c = new HashSet();
        this.f51200d = cVar;
        this.f51198b = cVar2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m18940a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f51197a) {
                if (!this.f51199c.contains(bVar) && bVar.f51201a.isAssignableFrom((Class<?>) cls)) {
                    this.f51199c.add(bVar);
                    InterfaceC10090o interfaceC10090oMo18922c = bVar.f51203c.mo18922c(this);
                    C0062b.m345f0(interfaceC10090oMo18922c);
                    arrayList.add(interfaceC10090oMo18922c);
                    this.f51199c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f51199c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized <Model, Data> InterfaceC10090o<Model, Data> m18941b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f51197a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.f51199c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f51201a.isAssignableFrom(cls) || !bVar.f51202b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f51199c.add(bVar);
                        arrayList.add(m18942c(bVar));
                        this.f51199c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f51198b;
                InterfaceC9806d<List<Throwable>> interfaceC9806d = this.f51200d;
                cVar.getClass();
                return new C10093r(arrayList, interfaceC9806d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC10090o) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f51196f;
        } catch (Throwable th2) {
            this.f51199c.clear();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final <Model, Data> InterfaceC10090o<Model, Data> m18942c(b<?, ?> bVar) {
        InterfaceC10090o<Model, Data> interfaceC10090o = (InterfaceC10090o<Model, Data>) bVar.f51203c.mo18922c(this);
        C0062b.m345f0(interfaceC10090o);
        return interfaceC10090o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized ArrayList m18943d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            while (true) {
                for (b bVar : this.f51197a) {
                    if (!arrayList.contains(bVar.f51202b) && bVar.f51201a.isAssignableFrom((Class<?>) cls)) {
                        arrayList.add(bVar.f51202b);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }
}
