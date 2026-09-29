package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.kn1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", m4291f = "DataStoreImpl.kt", m4292l = {256, 262, 265}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$handleUpdate$2$1 extends SuspendLambda implements zi3 {
    final /* synthetic */ DataStoreImpl<T> $this_runCatching;
    final /* synthetic */ Message.Update<T> $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$2$1(DataStoreImpl<T> dataStoreImpl, Message.Update<T> update, Continuation<? super DataStoreImpl$handleUpdate$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = dataStoreImpl;
        this.$update = update;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        return new DataStoreImpl$handleUpdate$2$1(this.$this_runCatching, this.$update, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(un1 un1Var, Continuation<? super T> continuation) {
        return ((DataStoreImpl$handleUpdate$2$1) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            State currentState = ((DataStoreImpl) this.$this_runCatching).inMemoryCache.getCurrentState();
            if (currentState instanceof Data) {
                DataStoreImpl<T> dataStoreImpl = this.$this_runCatching;
                zi3 transform = this.$update.getTransform();
                kn1 callerContext = this.$update.getCallerContext();
                this.label = 1;
                Object objTransformAndWrite = dataStoreImpl.transformAndWrite(transform, callerContext, this);
                if (objTransformAndWrite != coroutineSingletons) {
                    return objTransformAndWrite;
                }
            } else {
                if (!(currentState instanceof ReadException) && !(currentState instanceof UnInitialized)) {
                    if (currentState instanceof Final) {
                        throw ((Final) currentState).getFinalException();
                    }
                    if (currentState instanceof NoValueDataState) {
                        C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
                        return null;
                    }
                    gm5.m12750e();
                    return null;
                }
                if (currentState != this.$update.getLastState()) {
                    throw ((ReadException) currentState).getReadException();
                }
                DataStoreImpl<T> dataStoreImpl2 = this.$this_runCatching;
                this.label = 2;
                if (dataStoreImpl2.readAndInitOrPropagateAndThrowFailure(this) != coroutineSingletons) {
                }
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        if (i != 2) {
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        DataStoreImpl<T> dataStoreImpl3 = this.$this_runCatching;
        zi3 transform2 = this.$update.getTransform();
        kn1 callerContext2 = this.$update.getCallerContext();
        this.label = 3;
        Object objTransformAndWrite2 = dataStoreImpl3.transformAndWrite(transform2, callerContext2, this);
        return objTransformAndWrite2 == coroutineSingletons ? coroutineSingletons : objTransformAndWrite2;
    }
}
