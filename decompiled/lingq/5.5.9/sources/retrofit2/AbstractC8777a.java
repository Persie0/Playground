package retrofit2;

import cm.InterfaceC2052l;
import jp.AbstractC6555w;
import jp.C6542j;
import jp.C6543k;
import jp.C6544l;
import jp.C6545m;
import jp.C6552t;
import jp.InterfaceC6534b;
import jp.InterfaceC6535c;
import jp.InterfaceC6538f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7843k;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import so.AbstractC9107y;
import so.InterfaceC9086d;

/* JADX INFO: renamed from: retrofit2.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8777a<ResponseT, ReturnT> extends AbstractC6555w<ReturnT> {

    /* JADX INFO: renamed from: a */
    public final C6552t f46521a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9086d.a f46522b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6538f<AbstractC9107y, ResponseT> f46523c;

    /* JADX INFO: renamed from: retrofit2.a$a */
    public static final class a<ResponseT, ReturnT> extends AbstractC8777a<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC6535c<ResponseT, ReturnT> f46524d;

        public a(C6552t c6552t, InterfaceC9086d.a aVar, InterfaceC6538f<AbstractC9107y, ResponseT> interfaceC6538f, InterfaceC6535c<ResponseT, ReturnT> interfaceC6535c) {
            super(c6552t, aVar, interfaceC6538f);
            this.f46524d = interfaceC6535c;
        }

        @Override // retrofit2.AbstractC8777a
        /* JADX INFO: renamed from: c */
        public final Object mo17022c(C6545m c6545m, Object[] objArr) {
            return this.f46524d.mo13127b(c6545m);
        }
    }

    /* JADX INFO: renamed from: retrofit2.a$b */
    public static final class b<ResponseT> extends AbstractC8777a<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC6535c<ResponseT, InterfaceC6534b<ResponseT>> f46525d;

        /* JADX INFO: renamed from: e */
        public final boolean f46526e;

        public b(C6552t c6552t, InterfaceC9086d.a aVar, InterfaceC6538f interfaceC6538f, InterfaceC6535c interfaceC6535c) {
            super(c6552t, aVar, interfaceC6538f);
            this.f46525d = interfaceC6535c;
            this.f46526e = false;
        }

        @Override // retrofit2.AbstractC8777a
        /* JADX INFO: renamed from: c */
        public final Object mo17022c(C6545m c6545m, Object[] objArr) {
            final InterfaceC6534b interfaceC6534b = (InterfaceC6534b) this.f46525d.mo13127b(c6545m);
            InterfaceC9968c interfaceC9968c = (InterfaceC9968c) objArr[objArr.length - 1];
            try {
                if (this.f46526e) {
                    C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
                    c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(Throwable th2) {
                            interfaceC6534b.cancel();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC6534b.mo13123C(new C6543k(c7843k));
                    Object objM15593p = c7843k.m15593p();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM15593p;
                }
                C7843k c7843k2 = new C7843k(1, C8656b.m16874A(interfaceC9968c));
                c7843k2.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Throwable th2) {
                        interfaceC6534b.cancel();
                        return C9072e.f47360a;
                    }
                });
                interfaceC6534b.mo13123C(new C6542j(c7843k2));
                Object objM15593p2 = c7843k2.m15593p();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return objM15593p2;
            } catch (Exception e10) {
                return KotlinExtensions.m17021a(e10, interfaceC9968c);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.a$c */
    public static final class c<ResponseT> extends AbstractC8777a<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC6535c<ResponseT, InterfaceC6534b<ResponseT>> f46527d;

        public c(C6552t c6552t, InterfaceC9086d.a aVar, InterfaceC6538f<AbstractC9107y, ResponseT> interfaceC6538f, InterfaceC6535c<ResponseT, InterfaceC6534b<ResponseT>> interfaceC6535c) {
            super(c6552t, aVar, interfaceC6538f);
            this.f46527d = interfaceC6535c;
        }

        @Override // retrofit2.AbstractC8777a
        /* JADX INFO: renamed from: c */
        public final Object mo17022c(C6545m c6545m, Object[] objArr) {
            final InterfaceC6534b interfaceC6534b = (InterfaceC6534b) this.f46527d.mo13127b(c6545m);
            InterfaceC9968c interfaceC9968c = (InterfaceC9968c) objArr[objArr.length - 1];
            try {
                C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
                c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Throwable th2) {
                        interfaceC6534b.cancel();
                        return C9072e.f47360a;
                    }
                });
                interfaceC6534b.mo13123C(new C6544l(c7843k));
                Object objM15593p = c7843k.m15593p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return objM15593p;
            } catch (Exception e10) {
                return KotlinExtensions.m17021a(e10, interfaceC9968c);
            }
        }
    }

    public AbstractC8777a(C6552t c6552t, InterfaceC9086d.a aVar, InterfaceC6538f<AbstractC9107y, ResponseT> interfaceC6538f) {
        this.f46521a = c6552t;
        this.f46522b = aVar;
        this.f46523c = interfaceC6538f;
    }

    @Override // jp.AbstractC6555w
    /* JADX INFO: renamed from: a */
    public final ReturnT mo13158a(Object[] objArr) {
        return (ReturnT) mo17022c(new C6545m(this.f46521a, objArr, this.f46522b, this.f46523c), objArr);
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo17022c(C6545m c6545m, Object[] objArr);
}
