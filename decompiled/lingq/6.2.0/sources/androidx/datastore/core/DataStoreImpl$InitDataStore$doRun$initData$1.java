package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m4291f = "DataStoreImpl.kt", m4292l = {456, 478, 568, 486}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements vi3 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, Continuation<? super DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Continuation<?> continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Continuation<? super Data<T>> continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a7->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c76 c3248a;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef2;
        c76 c76Var;
        Iterator it;
        c76 c76Var2;
        Ref$BooleanRef ref$BooleanRef3;
        Ref$ObjectRef ref$ObjectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref$ObjectRef ref$ObjectRef4;
        zi3 zi3Var;
        Object obj2;
        int iHashCode;
        Object version;
        Object obj3;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c3248a = new C3248a();
            ref$BooleanRef = new Ref$BooleanRef();
            ref$ObjectRef = new Ref$ObjectRef();
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = c3248a;
            this.L$1 = ref$BooleanRef;
            this.L$2 = ref$ObjectRef;
            this.L$3 = ref$ObjectRef;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ref$ObjectRef = (Ref$ObjectRef) this.L$3;
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
            ref$BooleanRef = (Ref$BooleanRef) this.L$1;
            c3248a = (c76) this.L$0;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                it = (Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
                ref$BooleanRef3 = (Ref$BooleanRef) this.L$1;
                c76Var2 = (c76) this.L$0;
                AbstractC3193b.m15359b(obj);
                while (it.hasNext()) {
                    zi3Var = (zi3) it.next();
                    this.L$0 = c76Var2;
                    this.L$1 = ref$BooleanRef3;
                    this.L$2 = ref$ObjectRef3;
                    this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.L$4 = it;
                    this.label = 2;
                    if (zi3Var.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                ref$ObjectRef2 = ref$ObjectRef3;
                ref$BooleanRef2 = ref$BooleanRef3;
                c76Var = c76Var2;
                ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                this.L$0 = ref$BooleanRef2;
                this.L$1 = ref$ObjectRef2;
                this.L$2 = c76Var;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (c76Var.mo4388c(this) != coroutineSingletons) {
                    ref$ObjectRef4 = ref$ObjectRef2;
                    ref$BooleanRef2.f47713a = true;
                    c76Var.mo4387b(null);
                    obj2 = ref$ObjectRef4.f47718a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator.getVersion(this);
                    if (version != coroutineSingletons) {
                        obj = version;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                c76Var = (c76) this.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$0;
                AbstractC3193b.m15359b(obj);
                try {
                    ref$BooleanRef2.f47713a = true;
                    c76Var.mo4387b(null);
                    obj2 = ref$ObjectRef4.f47718a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator2 = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator2.getVersion(this);
                    if (version != coroutineSingletons) {
                        obj = version;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    c76Var.mo4387b(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            obj3 = this.L$0;
            AbstractC3193b.m15359b(obj);
        }
        return new Data(obj3, i, ((Number) obj).intValue());
        ref$ObjectRef.f47718a = ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(c3248a, ref$BooleanRef, ref$ObjectRef2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            c76Var2 = c3248a;
            ref$BooleanRef3 = ref$BooleanRef;
            ref$ObjectRef3 = ref$ObjectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                zi3Var = (zi3) it.next();
                this.L$0 = c76Var2;
                this.L$1 = ref$BooleanRef3;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (zi3Var.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            ref$BooleanRef2 = ref$BooleanRef3;
            c76Var = c76Var2;
        } else {
            ref$BooleanRef2 = ref$BooleanRef;
            c76Var = c3248a;
        }
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = ref$BooleanRef2;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = c76Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (c76Var.mo4388c(this) != coroutineSingletons) {
            ref$ObjectRef4 = ref$ObjectRef2;
            ref$BooleanRef2.f47713a = true;
            c76Var.mo4387b(null);
            obj2 = ref$ObjectRef4.f47718a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            InterProcessCoordinator coordinator3 = this.this$0.getCoordinator();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            version = coordinator3.getVersion(this);
            if (version != coroutineSingletons) {
                obj = version;
                obj3 = obj2;
                i = iHashCode;
                return new Data(obj3, i, ((Number) obj).intValue());
            }
        }
        return coroutineSingletons;
    }
}
