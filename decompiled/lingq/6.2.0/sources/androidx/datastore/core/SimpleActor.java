package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p000.C3386nv;
import p000.bb0;
import p000.c32;
import p000.cd4;
import p000.cu0;
import p000.do7;
import p000.hu0;
import p000.iu0;
import p000.ju0;
import p000.nj0;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {
    private final zi3 consumeMessage;
    private final cu0 messageQueue;
    private final AtomicInt remainingMessages;
    private final un1 scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2 */
    @c32(m4290c = "androidx.datastore.core.SimpleActor$offer$2", m4291f = "SimpleActor.kt", m4292l = {114, 114}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05182 extends SuspendLambda implements zi3 {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05182(SimpleActor<T> simpleActor, Continuation<? super C05182> continuation) {
            super(2, continuation);
            this.this$0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05182(this.this$0, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(un1 un1Var, Continuation<? super xfa> continuation) {
            return ((C05182) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004e A[PHI: r1 r6
          0x004e: PHI (r1v1 zi3) = (r1v2 zi3), (r1v4 zi3) binds: [B:13:0x004b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r6v4 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:18:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            zi3 zi3Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (((SimpleActor) this.this$0).remainingMessages.get() <= 0) {
                    C3386nv.m17633t("Check failed.");
                    return null;
                }
                vz1.m23597A(((SimpleActor) this.this$0).scope);
                zi3Var = ((SimpleActor) this.this$0).consumeMessage;
                cu0 cu0Var = ((SimpleActor) this.this$0).messageQueue;
                this.L$0 = zi3Var;
                this.label = 1;
                obj = cu0Var.mo9892o(this);
                if (obj != coroutineSingletons) {
                    this.L$0 = null;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                zi3Var = (zi3) this.L$0;
                AbstractC3193b.m15359b(obj);
                this.L$0 = null;
                this.label = 2;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            if (((SimpleActor) this.this$0).remainingMessages.decrementAndGet() == 0) {
                return xfa.f68157a;
            }
            vz1.m23597A(((SimpleActor) this.this$0).scope);
            zi3Var = ((SimpleActor) this.this$0).consumeMessage;
            cu0 cu0Var2 = ((SimpleActor) this.this$0).messageQueue;
            this.L$0 = zi3Var;
            this.label = 1;
            obj = cu0Var2.mo9892o(this);
            if (obj != coroutineSingletons) {
                this.L$0 = null;
                this.label = 2;
            }
            return coroutineSingletons;
        }
    }

    public SimpleActor(un1 un1Var, vi3 vi3Var, zi3 zi3Var, zi3 zi3Var2) {
        un1Var.getClass();
        vi3Var.getClass();
        zi3Var.getClass();
        zi3Var2.getClass();
        this.scope = un1Var;
        this.consumeMessage = zi3Var2;
        this.messageQueue = do7.m10525a(Integer.MAX_VALUE, 6, null);
        this.remainingMessages = new AtomicInt(0);
        cd4 cd4Var = (cd4) un1Var.mo1309x().get(nj0.f52795N);
        if (cd4Var != null) {
            cd4Var.mo4540r(new bb0(vi3Var, this, zi3Var, 14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa _init_$lambda$0(vi3 vi3Var, SimpleActor simpleActor, zi3 zi3Var, Throwable th) {
        vi3Var.invoke(th);
        simpleActor.messageQueue.mo15331i(th);
        while (true) {
            Object objM14648a = ju0.m14648a(simpleActor.messageQueue.mo9890g());
            if (objM14648a == null) {
                return xfa.f68157a;
            }
            zi3Var.invoke(objM14648a, th);
        }
    }

    public final void offer(T t) throws Throwable {
        Object objMo4677k = this.messageQueue.mo4677k(t);
        if (objMo4677k instanceof hu0) {
            Throwable th = ((hu0) objMo4677k).f42938a;
            if (th != null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objMo4677k instanceof iu0) {
            C3386nv.m17633t("Check failed.");
        } else if (this.remainingMessages.getAndIncrement() == 0) {
            wfb.m23926u(this.scope, null, null, new C05182(this, null), 3);
        }
    }
}
