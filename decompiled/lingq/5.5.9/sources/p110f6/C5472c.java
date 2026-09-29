package p110f6;

import java.util.ArrayList;

/* JADX INFO: renamed from: f6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5472c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34059a = new ArrayList();

    /* JADX INFO: renamed from: f6.c$a */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a */
        public final Class<Z> f34060a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f34061b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5471b<Z, R> f34062c;

        public a(Class<Z> cls, Class<R> cls2, InterfaceC5471b<Z, R> interfaceC5471b) {
            this.f34060a = cls;
            this.f34061b = cls2;
            this.f34062c = interfaceC5471b;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m11712a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f34059a) {
            if ((aVar.f34060a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f34061b)) && !arrayList.contains(aVar.f34061b)) {
                arrayList.add(aVar.f34061b);
            }
        }
        return arrayList;
    }
}
