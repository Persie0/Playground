package p147h6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p356r5.InterfaceC8736f;

/* JADX INFO: renamed from: h6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5896c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35228a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f35229b = new HashMap();

    /* JADX INFO: renamed from: h6.c$a */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f35230a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f35231b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC8736f<T, R> f35232c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC8736f<T, R> interfaceC8736f) {
            this.f35230a = cls;
            this.f35231b = cls2;
            this.f35232c = interfaceC8736f;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized List<a<?, ?>> m12317a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f35228a.contains(str)) {
                this.f35228a.add(str);
            }
            arrayList = (List) this.f35229b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f35229b.put(str, arrayList);
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final synchronized ArrayList m12318b(Class cls, Class cls2) {
        ArrayList arrayList;
        List<a> list;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f35228a.iterator();
            while (true) {
                do {
                    if (it.hasNext()) {
                        list = (List) this.f35229b.get((String) it.next());
                    }
                } while (list == null);
                for (a aVar : list) {
                    if ((aVar.f35230a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f35231b)) && !arrayList.contains(aVar.f35231b)) {
                        arrayList.add(aVar.f35231b);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }
}
