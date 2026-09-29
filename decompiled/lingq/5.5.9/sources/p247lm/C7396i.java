package p247lm;

import cm.InterfaceC2041a;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: lm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7396i {

    /* JADX INFO: renamed from: lm.i$a */
    public static class a<T> extends c<T> implements InterfaceC2041a<T> {

        /* JADX INFO: renamed from: b */
        public final InterfaceC2041a<T> f41205b;

        /* JADX INFO: renamed from: c */
        public volatile SoftReference<Object> f41206c;

        public a(T t10, InterfaceC2041a<T> interfaceC2041a) {
            if (interfaceC2041a == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
            }
            this.f41206c = null;
            this.f41205b = interfaceC2041a;
            if (t10 != null) {
                this.f41206c = new SoftReference<>(t10);
            }
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final T mo807E() {
            T t10;
            SoftReference<Object> softReference = this.f41206c;
            Object obj = c.f41209a;
            if (softReference != null && (t10 = (T) softReference.get()) != null) {
                if (t10 == obj) {
                    t10 = null;
                }
                return t10;
            }
            T tMo807E = this.f41205b.mo807E();
            if (tMo807E != null) {
                obj = tMo807E;
            }
            this.f41206c = new SoftReference<>(obj);
            return tMo807E;
        }
    }

    /* JADX INFO: renamed from: lm.i$b */
    public static class b<T> extends c<T> {

        /* JADX INFO: renamed from: b */
        public final InterfaceC2041a<T> f41207b;

        /* JADX INFO: renamed from: c */
        public volatile Object f41208c = null;

        public b(InterfaceC2041a<T> interfaceC2041a) {
            this.f41207b = interfaceC2041a;
        }

        /* JADX INFO: renamed from: E */
        public final T m14786E() {
            T t10 = (T) this.f41208c;
            Object obj = c.f41209a;
            if (t10 != null) {
                if (t10 == obj) {
                    t10 = null;
                }
                return t10;
            }
            T tMo807E = this.f41207b.mo807E();
            if (tMo807E != null) {
                obj = tMo807E;
            }
            this.f41208c = obj;
            return tMo807E;
        }
    }

    /* JADX INFO: renamed from: lm.i$c */
    public static abstract class c<T> {

        /* JADX INFO: renamed from: a */
        public static final a f41209a = new a();

        /* JADX INFO: renamed from: lm.i$c$a */
        public static class a {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14783a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static <T> b<T> m14784b(InterfaceC2041a<T> interfaceC2041a) {
        return new b<>(interfaceC2041a);
    }

    /* JADX INFO: renamed from: c */
    public static <T> a<T> m14785c(InterfaceC2041a<T> interfaceC2041a) {
        if (interfaceC2041a != null) {
            return new a<>(null, interfaceC2041a);
        }
        m14783a(2);
        throw null;
    }
}
