package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$writeData$2", m4291f = "DataStoreImpl.kt", m4292l = {372, 373}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$writeData$2 extends SuspendLambda implements zi3 {
    final /* synthetic */ T $newData;
    final /* synthetic */ Ref$IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref$IntRef ref$IntRef, DataStoreImpl<T> dataStoreImpl, T t, boolean z, Continuation<? super DataStoreImpl$writeData$2> continuation) {
        super(2, continuation);
        this.$newVersion = ref$IntRef;
        this.this$0 = dataStoreImpl;
        this.$newData = t;
        this.$updateCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, continuation);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // p000.zi3
    public final Object invoke(WriteScope<T> writeScope, Continuation<? super xfa> continuation) {
        return ((DataStoreImpl$writeData$2) create(writeScope, continuation)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r4.writeData(r8, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$IntRef ref$IntRef;
        WriteScope writeScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            WriteScope writeScope2 = (WriteScope) this.L$0;
            ref$IntRef = this.$newVersion;
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = writeScope2;
            this.L$1 = ref$IntRef;
            this.label = 1;
            Object objIncrementAndGetVersion = coordinator.incrementAndGetVersion(this);
            if (objIncrementAndGetVersion != coroutineSingletons) {
                writeScope = writeScope2;
                obj = objIncrementAndGetVersion;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ref$IntRef = (Ref$IntRef) this.L$1;
            writeScope = (WriteScope) this.L$0;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (this.$updateCache) {
            DataStoreInMemoryCache dataStoreInMemoryCache = ((DataStoreImpl) this.this$0).inMemoryCache;
            T t = this.$newData;
            dataStoreInMemoryCache.tryUpdate(new Data(t, t != 0 ? t.hashCode() : 0, this.$newVersion.f47716a));
        }
        return xfa.f68157a;
        ref$IntRef.f47716a = ((Number) obj).intValue();
        T t2 = this.$newData;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
