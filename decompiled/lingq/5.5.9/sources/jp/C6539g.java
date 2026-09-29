package jp;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: jp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6539g implements InterfaceC6535c<Object, InterfaceC6534b<?>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Type f37212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Executor f37213b;

    public C6539g(Type type, Executor executor) {
        this.f37212a = type;
        this.f37213b = executor;
    }

    @Override // jp.InterfaceC6535c
    /* JADX INFO: renamed from: a */
    public final Type mo13126a() {
        return this.f37212a;
    }

    @Override // jp.InterfaceC6535c
    /* JADX INFO: renamed from: b */
    public final Object mo13127b(C6545m c6545m) {
        Executor executor = this.f37213b;
        return executor == null ? c6545m : new C6540h.a(executor, c6545m);
    }
}
