package coil.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bd1;
import p000.c32;
import p000.e04;
import p000.ee9;
import p000.sz6;
import p000.wt2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor", m4291f = "EngineInterceptor.kt", m4292l = {203}, m4293m = "decode")
final class EngineInterceptor$decode$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0862a f10483a;

    /* JADX INFO: renamed from: b */
    public ee9 f10484b;

    /* JADX INFO: renamed from: c */
    public bd1 f10485c;

    /* JADX INFO: renamed from: d */
    public e04 f10486d;

    /* JADX INFO: renamed from: e */
    public Object f10487e;

    /* JADX INFO: renamed from: f */
    public sz6 f10488f;

    /* JADX INFO: renamed from: g */
    public wt2 f10489g;

    /* JADX INFO: renamed from: h */
    public int f10490h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f10491i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0862a f10492j;

    /* JADX INFO: renamed from: k */
    public int f10493k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(C0862a c0862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10492j = c0862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10491i = obj;
        this.f10493k |= Integer.MIN_VALUE;
        return C0862a.m4975b(this.f10492j, null, null, null, null, null, null, this);
    }
}
