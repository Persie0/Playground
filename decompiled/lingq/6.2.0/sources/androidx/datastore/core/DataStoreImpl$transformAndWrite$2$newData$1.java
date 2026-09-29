package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m4291f = "DataStoreImpl.kt", m4292l = {351}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$transformAndWrite$2$newData$1 extends SuspendLambda implements zi3 {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ zi3 $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2$newData$1(zi3 zi3Var, Data<T> data, Continuation<? super DataStoreImpl$transformAndWrite$2$newData$1> continuation) {
        super(2, continuation);
        this.$transform = zi3Var;
        this.$curData = data;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(un1 un1Var, Continuation<? super T> continuation) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        zi3 zi3Var = this.$transform;
        Object value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = zi3Var.invoke(value, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
