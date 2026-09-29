package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.PassthroughConnection", m4291f = "PassthroughConnectionPool.kt", m4292l = {89, 91}, m4293m = "usePrepared")
final class PassthroughConnection$usePrepared$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f6868a;

    /* JADX INFO: renamed from: b */
    public vi3 f6869b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0741b f6871d;

    /* JADX INFO: renamed from: e */
    public int f6872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$1(C0741b c0741b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6871d = c0741b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6870c = obj;
        this.f6872e |= Integer.MIN_VALUE;
        return this.f6871d.mo2817d(null, null, this);
    }
}
