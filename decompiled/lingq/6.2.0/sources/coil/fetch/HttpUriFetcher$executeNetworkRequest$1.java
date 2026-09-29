package coil.fetch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.fetch.HttpUriFetcher", m4291f = "HttpUriFetcher.kt", m4292l = {224}, m4293m = "executeNetworkRequest")
final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f10467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0861a f10468b;

    /* JADX INFO: renamed from: c */
    public int f10469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$executeNetworkRequest$1(C0861a c0861a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10468b = c0861a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10467a = obj;
        this.f10469c |= Integer.MIN_VALUE;
        return this.f10468b.m4969b(null, this);
    }
}
