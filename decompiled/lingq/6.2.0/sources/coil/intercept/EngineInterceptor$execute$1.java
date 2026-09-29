package coil.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.e04;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor", m4291f = "EngineInterceptor.kt", m4292l = {126, 130, 148}, m4293m = "execute")
final class EngineInterceptor$execute$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0862a f10494a;

    /* JADX INFO: renamed from: b */
    public e04 f10495b;

    /* JADX INFO: renamed from: c */
    public Object f10496c;

    /* JADX INFO: renamed from: d */
    public Object f10497d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f10498e;

    /* JADX INFO: renamed from: f */
    public Ref$ObjectRef f10499f;

    /* JADX INFO: renamed from: g */
    public Ref$ObjectRef f10500g;

    /* JADX INFO: renamed from: h */
    public Ref$ObjectRef f10501h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f10502i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0862a f10503j;

    /* JADX INFO: renamed from: k */
    public int f10504k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(C0862a c0862a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10503j = c0862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10502i = obj;
        this.f10504k |= Integer.MIN_VALUE;
        return C0862a.m4976c(this.f10503j, null, null, null, null, this);
    }
}
