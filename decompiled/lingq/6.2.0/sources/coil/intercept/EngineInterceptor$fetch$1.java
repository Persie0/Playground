package coil.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bd1;
import p000.c32;
import p000.e04;
import p000.sz6;
import p000.wt2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor", m4291f = "EngineInterceptor.kt", m4292l = {169}, m4293m = "fetch")
final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0862a f10513a;

    /* JADX INFO: renamed from: b */
    public bd1 f10514b;

    /* JADX INFO: renamed from: c */
    public e04 f10515c;

    /* JADX INFO: renamed from: d */
    public Object f10516d;

    /* JADX INFO: renamed from: e */
    public sz6 f10517e;

    /* JADX INFO: renamed from: f */
    public wt2 f10518f;

    /* JADX INFO: renamed from: g */
    public int f10519g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f10520h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0862a f10521i;

    /* JADX INFO: renamed from: j */
    public int f10522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(C0862a c0862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10521i = c0862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10520h = obj;
        this.f10522j |= Integer.MIN_VALUE;
        return this.f10521i.m4978d(null, null, null, null, null, this);
    }
}
