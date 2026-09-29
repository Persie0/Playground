package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.kn1;
import p000.to2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.ConnectionPoolImpl", m4291f = "ConnectionPoolImpl.kt", m4292l = {131, 135, 154, 159}, m4293m = "useConnection")
final class ConnectionPoolImpl$useConnection$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f6844a;

    /* JADX INFO: renamed from: b */
    public Object f6845b;

    /* JADX INFO: renamed from: c */
    public Object f6846c;

    /* JADX INFO: renamed from: d */
    public Ref$ObjectRef f6847d;

    /* JADX INFO: renamed from: e */
    public kn1 f6848e;

    /* JADX INFO: renamed from: f */
    public Ref$ObjectRef f6849f;

    /* JADX INFO: renamed from: g */
    public to2 f6850g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f6851h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0740a f6852i;

    /* JADX INFO: renamed from: j */
    public int f6853j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$1(C0740a c0740a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6852i = c0740a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6851h = obj;
        this.f6853j |= Integer.MIN_VALUE;
        return this.f6852i.mo2813v(false, null, this);
    }
}
