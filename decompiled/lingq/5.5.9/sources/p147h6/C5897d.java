package p147h6;

import java.util.ArrayList;
import p356r5.InterfaceC8737g;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5897d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35233a = new ArrayList();

    /* JADX INFO: renamed from: h6.d$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f35234a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8737g<T> f35235b;

        public a(Class<T> cls, InterfaceC8737g<T> interfaceC8737g) {
            this.f35234a = cls;
            this.f35235b = interfaceC8737g;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public final synchronized <Z> InterfaceC8737g<Z> m12319a(Class<Z> cls) {
        try {
            int size = this.f35233a.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f35233a.get(i10);
                if (aVar.f35234a.isAssignableFrom((Class<?>) cls)) {
                    return aVar.f35235b;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
