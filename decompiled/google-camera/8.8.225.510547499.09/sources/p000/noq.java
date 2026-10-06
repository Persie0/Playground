package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class noq extends nor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nos f43988a;

    /* JADX INFO: renamed from: c */
    private final Callable f43989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noq(nos nosVar, Callable callable, Executor executor) {
        super(nosVar, executor);
        this.f43988a = nosVar;
        callable.getClass();
        this.f43989c = callable;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: a */
    public final Object mo17569a() {
        return this.f43989c.call();
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: b */
    public final String mo17570b() {
        return this.f43989c.toString();
    }

    @Override // p000.nor
    /* JADX INFO: renamed from: c */
    public final void mo17571c(Object obj) {
        this.f43988a.mo14894e(obj);
    }
}
