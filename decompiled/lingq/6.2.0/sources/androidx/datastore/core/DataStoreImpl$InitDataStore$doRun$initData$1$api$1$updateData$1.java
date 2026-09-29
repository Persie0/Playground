package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", m4291f = "DataStoreImpl.kt", m4292l = {566, 467, 469}, m4293m = "updateData", m4294v = 1)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl$InitDataStore$doRun$initData$1$api$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, Continuation<? super DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1> continuation) {
        super(continuation);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
