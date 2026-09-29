package jp;

import androidx.emoji2.text.RunnableC0893g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p274n8.RunnableC7716a;
import retrofit2.C8778b;
import so.C9101s;

/* JADX INFO: renamed from: jp.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6540h extends InterfaceC6535c.a {

    /* JADX INFO: renamed from: a */
    public final Executor f37214a;

    /* JADX INFO: renamed from: jp.h$a */
    public static final class a<T> implements InterfaceC6534b<T> {

        /* JADX INFO: renamed from: a */
        public final Executor f37215a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6534b<T> f37216b;

        /* JADX INFO: renamed from: jp.h$a$a, reason: collision with other inner class name */
        public class C10643a implements InterfaceC6536d<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC6536d f37217a;

            public C10643a(InterfaceC6536d interfaceC6536d) {
                this.f37217a = interfaceC6536d;
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: a */
            public final void mo13129a(InterfaceC6534b<T> interfaceC6534b, Throwable th2) {
                a.this.f37215a.execute(new RunnableC7716a(6, this, this.f37217a, th2));
            }

            @Override // jp.InterfaceC6536d
            /* JADX INFO: renamed from: b */
            public final void mo13130b(InterfaceC6534b<T> interfaceC6534b, C6553u<T> c6553u) {
                a.this.f37215a.execute(new RunnableC0893g(6, this, this.f37217a, c6553u));
            }
        }

        public a(Executor executor, InterfaceC6534b<T> interfaceC6534b) {
            this.f37215a = executor;
            this.f37216b = interfaceC6534b;
        }

        @Override // jp.InterfaceC6534b
        /* JADX INFO: renamed from: C */
        public final void mo13123C(InterfaceC6536d<T> interfaceC6536d) {
            this.f37216b.mo13123C(new C10643a(interfaceC6536d));
        }

        @Override // jp.InterfaceC6534b
        public final void cancel() {
            this.f37216b.cancel();
        }

        @Override // jp.InterfaceC6534b
        public final InterfaceC6534b<T> clone() {
            return new a(this.f37215a, this.f37216b.clone());
        }

        @Override // jp.InterfaceC6534b
        /* JADX INFO: renamed from: l */
        public final boolean mo13124l() {
            return this.f37216b.mo13124l();
        }

        @Override // jp.InterfaceC6534b
        /* JADX INFO: renamed from: q */
        public final C9101s mo13125q() {
            return this.f37216b.mo13125q();
        }
    }

    public C6540h(Executor executor) {
        this.f37214a = executor;
    }

    @Override // jp.InterfaceC6535c.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC6535c mo13128a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (C8778b.m17027e(type) != InterfaceC6534b.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        Type typeM17026d = C8778b.m17026d(0, (ParameterizedType) type);
        if (!C8778b.m17030h(annotationArr, InterfaceC6556x.class)) {
            executor = this.f37214a;
        }
        return new C6539g(typeM17026d, executor);
    }
}
