package p272n6;

import android.util.Log;
import p446w2.C9807e;
import p446w2.InterfaceC9806d;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7709a {

    /* JADX INFO: renamed from: a */
    public static final a f42236a = new a();

    /* JADX INFO: renamed from: n6.a$a */
    public class a implements e<Object> {
        @Override // p272n6.C7709a.e
        /* JADX INFO: renamed from: a */
        public final void mo15303a(Object obj) {
        }
    }

    /* JADX INFO: renamed from: n6.a$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        T mo6320a();
    }

    /* JADX INFO: renamed from: n6.a$c */
    public static final class c<T> implements InterfaceC9806d<T> {

        /* JADX INFO: renamed from: a */
        public final b<T> f42237a;

        /* JADX INFO: renamed from: b */
        public final e<T> f42238b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC9806d<T> f42239c;

        public c(C9807e c9807e, b bVar, e eVar) {
            this.f42239c = c9807e;
            this.f42237a = bVar;
            this.f42238b = eVar;
        }

        @Override // p446w2.InterfaceC9806d
        /* JADX INFO: renamed from: a */
        public final boolean mo11464a(T t10) {
            if (t10 instanceof d) {
                ((d) t10).mo6281a().f42240a = true;
            }
            this.f42238b.mo15303a(t10);
            return this.f42239c.mo11464a(t10);
        }

        @Override // p446w2.InterfaceC9806d
        /* JADX INFO: renamed from: b */
        public final T mo11465b() {
            T tMo11465b = this.f42239c.mo11465b();
            if (tMo11465b == null) {
                tMo11465b = this.f42237a.mo6320a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tMo11465b.getClass());
                }
            }
            if (tMo11465b instanceof d) {
                ((d) tMo11465b).mo6281a().f42240a = false;
            }
            return tMo11465b;
        }
    }

    /* JADX INFO: renamed from: n6.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        AbstractC7712d.a mo6281a();
    }

    /* JADX INFO: renamed from: n6.a$e */
    public interface e<T> {
        /* JADX INFO: renamed from: a */
        void mo15303a(T t10);
    }

    /* JADX INFO: renamed from: a */
    public static c m15302a(int i10, b bVar) {
        return new c(new C9807e(i10), bVar, f42236a);
    }
}
