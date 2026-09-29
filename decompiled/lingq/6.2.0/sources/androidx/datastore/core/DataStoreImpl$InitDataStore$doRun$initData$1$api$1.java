package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c76;
import p000.fa4;
import p000.zi3;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref$ObjectRef<T> $currentData;
    final /* synthetic */ Ref$BooleanRef $initializationComplete;
    final /* synthetic */ c76 $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(c76 c76Var, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = c76Var;
        this.$initializationComplete = ref$BooleanRef;
        this.$currentData = ref$ObjectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00ac, B:37:0x00b4), top: B:53:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public Object updateData(zi3 zi3Var, Continuation<? super T> continuation) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        c76 c76Var;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef<T> ref$ObjectRef;
        DataStoreImpl dataStoreImpl;
        DataStoreImpl dataStoreImpl2;
        c76 c76Var2;
        c76 c76Var3;
        Ref$ObjectRef<T> ref$ObjectRef2;
        DataStoreImpl dataStoreImpl3;
        Object obj;
        if (continuation instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            int i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        }
        Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj2);
                c76Var = this.$updateLock;
                ref$BooleanRef = this.$initializationComplete;
                ref$ObjectRef = this.$currentData;
                dataStoreImpl = (DataStoreImpl<T>) this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = zi3Var;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = c76Var;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = ref$BooleanRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = ref$ObjectRef;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (c76Var.mo4388c(dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                }
                dataStoreImpl2 = dataStoreImpl;
                return obj3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    c76Var2 = (c76) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        AbstractC3193b.m15359b(obj2);
                        ref$ObjectRef2.f47718a = obj;
                        Object obj4 = ref$ObjectRef2.f47718a;
                        c76Var2.mo4387b(null);
                        return obj4;
                    } catch (Throwable th) {
                        th = th;
                        c76Var2.mo4387b(null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                c76Var3 = (c76) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    AbstractC3193b.m15359b(obj2);
                    dataStoreImpl3 = dataStoreImpl4;
                    if (!fa4.m11650l(obj2, ref$ObjectRef2.f47718a)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = c76Var3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl3.writeData$datastore_core(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                            obj = obj2;
                            c76Var2 = c76Var3;
                            ref$ObjectRef2.f47718a = obj;
                        }
                        dataStoreImpl2 = dataStoreImpl;
                        return obj3;
                    }
                    c76Var2 = c76Var3;
                    Object obj5 = ref$ObjectRef2.f47718a;
                    c76Var2.mo4387b(null);
                    return obj5;
                } catch (Throwable th2) {
                    th = th2;
                    c76Var2 = c76Var3;
                    c76Var2.mo4387b(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl5 = (DataStoreImpl<T>) ((DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4);
            Ref$ObjectRef<T> ref$ObjectRef3 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            ref$BooleanRef = (Ref$BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            c76 c76Var4 = (c76) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            zi3 zi3Var2 = (zi3) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            AbstractC3193b.m15359b(obj2);
            ref$ObjectRef = ref$ObjectRef3;
            zi3Var = zi3Var2;
            c76Var = c76Var4;
            dataStoreImpl2 = dataStoreImpl5;
            dataStoreImpl2 = dataStoreImpl;
            if (ref$BooleanRef.f47713a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj6 = ref$ObjectRef.f47718a;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = c76Var;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = zi3Var.invoke(obj6, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != obj3) {
                c76Var3 = c76Var;
                obj2 = objInvoke;
                ref$ObjectRef2 = ref$ObjectRef;
                dataStoreImpl3 = dataStoreImpl2;
                if (!fa4.m11650l(obj2, ref$ObjectRef2.f47718a)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = c76Var3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl3.writeData$datastore_core(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                        obj = obj2;
                        c76Var2 = c76Var3;
                        ref$ObjectRef2.f47718a = obj;
                    }
                } else {
                    c76Var2 = c76Var3;
                }
                Object obj7 = ref$ObjectRef2.f47718a;
                c76Var2.mo4387b(null);
                return obj7;
            }
            dataStoreImpl2 = dataStoreImpl;
            return obj3;
        } catch (Throwable th3) {
            th = th3;
            c76Var2 = c76Var;
            c76Var2.mo4387b(null);
            throw th;
        }
    }
}
