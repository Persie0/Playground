package jp;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C8778b;
import retrofit2.HttpException;

/* JADX INFO: renamed from: jp.e */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class C6537e extends InterfaceC6535c.a {

    /* JADX INFO: renamed from: a */
    public static final C6537e f37206a = new C6537e();

    /* JADX INFO: renamed from: jp.e$a */
    @IgnoreJRERequirement
    public static final class a<R> implements InterfaceC6535c<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a */
        public final Type f37207a;

        /* JADX INFO: renamed from: jp.e$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C10642a implements InterfaceC6536d<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<R> f37208a;

            public C10642a(b bVar) {
                this.f37208a = bVar;
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: a */
            public final void mo13129a(InterfaceC6534b<R> interfaceC6534b, Throwable th2) {
                this.f37208a.completeExceptionally(th2);
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: b */
            public final void mo13130b(InterfaceC6534b<R> interfaceC6534b, C6553u<R> c6553u) {
                boolean zM17350l = c6553u.f37338a.m17350l();
                CompletableFuture<R> completableFuture = this.f37208a;
                if (zM17350l) {
                    completableFuture.complete(c6553u.f37339b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(c6553u));
                }
            }
        }

        public a(Type type) {
            this.f37207a = type;
        }

        @Override // jp.InterfaceC6535c
        /* JADX INFO: renamed from: a */
        public final Type mo13126a() {
            return this.f37207a;
        }

        @Override // jp.InterfaceC6535c
        /* JADX INFO: renamed from: b */
        public final Object mo13127b(C6545m c6545m) {
            b bVar = new b(c6545m);
            c6545m.mo13123C(new C10642a(bVar));
            return bVar;
        }
    }

    /* JADX INFO: renamed from: jp.e$b */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6534b<?> f37209a;

        public b(C6545m c6545m) {
            this.f37209a = c6545m;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f37209a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* JADX INFO: renamed from: jp.e$c */
    @IgnoreJRERequirement
    public static final class c<R> implements InterfaceC6535c<R, CompletableFuture<C6553u<R>>> {

        /* JADX INFO: renamed from: a */
        public final Type f37210a;

        /* JADX INFO: renamed from: jp.e$c$a */
        @IgnoreJRERequirement
        public class a implements InterfaceC6536d<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<C6553u<R>> f37211a;

            public a(b bVar) {
                this.f37211a = bVar;
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: a */
            public final void mo13129a(InterfaceC6534b<R> interfaceC6534b, Throwable th2) {
                this.f37211a.completeExceptionally(th2);
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: b */
            public final void mo13130b(InterfaceC6534b<R> interfaceC6534b, C6553u<R> c6553u) {
                this.f37211a.complete(c6553u);
            }
        }

        public c(Type type) {
            this.f37210a = type;
        }

        @Override // jp.InterfaceC6535c
        /* JADX INFO: renamed from: a */
        public final Type mo13126a() {
            return this.f37210a;
        }

        @Override // jp.InterfaceC6535c
        /* JADX INFO: renamed from: b */
        public final Object mo13127b(C6545m c6545m) {
            b bVar = new b(c6545m);
            c6545m.mo13123C(new a(bVar));
            return bVar;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // jp.InterfaceC6535c.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC6535c mo13128a(Type type, Annotation[] annotationArr) {
        if (C8778b.m17027e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM17026d = C8778b.m17026d(0, (ParameterizedType) type);
        if (C8778b.m17027e(typeM17026d) != C6553u.class) {
            return new a(typeM17026d);
        }
        if (typeM17026d instanceof ParameterizedType) {
            return new c(C8778b.m17026d(0, (ParameterizedType) typeM17026d));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
