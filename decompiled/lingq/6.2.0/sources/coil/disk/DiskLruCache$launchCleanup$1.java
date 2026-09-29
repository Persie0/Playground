package coil.disk;

import java.io.IOException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.d18;
import p000.id0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "coil.disk.DiskLruCache$launchCleanup$1", m4291f = "DiskLruCache.kt", m4292l = {}, m4293m = "invokeSuspend")
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0860a f10449a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(C0860a c0860a, Continuation continuation) {
        super(2, continuation);
        this.f10449a = c0860a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiskLruCache$launchCleanup$1(this.f10449a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DiskLruCache$launchCleanup$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0860a c0860a = this.f10449a;
        synchronized (c0860a) {
            try {
                if (!c0860a.f10466l || c0860a.f10451H) {
                    return xfa.f68157a;
                }
                try {
                    c0860a.m4967x();
                } catch (IOException unused) {
                    c0860a.f10452I = true;
                }
                try {
                    if (c0860a.f10463i >= 2000) {
                        c0860a.m4958A();
                    }
                } catch (IOException unused2) {
                    c0860a.f10453J = true;
                    c0860a.f10464j = new d18(new id0());
                }
                return xfa.f68157a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
