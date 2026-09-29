package coil.fetch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.k18;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.fetch.HttpUriFetcher", m4291f = "HttpUriFetcher.kt", m4292l = {77, 106}, m4293m = "fetch")
final class HttpUriFetcher$fetch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0861a f10470a;

    /* JADX INFO: renamed from: b */
    public k18 f10471b;

    /* JADX INFO: renamed from: c */
    public Object f10472c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f10473d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0861a f10474e;

    /* JADX INFO: renamed from: f */
    public int f10475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$fetch$1(C0861a c0861a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10474e = c0861a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10473d = obj;
        this.f10475f |= Integer.MIN_VALUE;
        return this.f10474e.mo57a(this);
    }
}
