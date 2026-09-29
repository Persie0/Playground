package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m4291f = "DataStoreImpl.kt", m4292l = {145, 146}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements zi3 {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl<T> dataStoreImpl, Continuation<? super DataStoreImpl$incrementCollector$2$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        return new DataStoreImpl$incrementCollector$2$1(this.this$0, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(un1 un1Var, Continuation<? super xfa> continuation) {
        return ((DataStoreImpl$incrementCollector$2$1) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            DataStoreImpl.InitDataStore initDataStore = ((DataStoreImpl) this.this$0).readAndInit;
            this.label = 1;
            if (initDataStore.awaitComplete(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        c83 c83VarM15525d = AbstractC3224d.m15525d(this.this$0.getCoordinator().getUpdateNotifications(), -1);
        final DataStoreImpl<T> dataStoreImpl = this.this$0;
        e83 e83Var = new e83() { // from class: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.1
            public final Object emit(xfa xfaVar, Continuation<? super xfa> continuation) {
                Object dataAndUpdateCache;
                return ((((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState() instanceof Final) || (dataAndUpdateCache = dataStoreImpl.readDataAndUpdateCache(true, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? xfa.f68157a : dataAndUpdateCache;
            }

            @Override // p000.e83
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((xfa) obj2, (Continuation<? super xfa>) continuation);
            }
        };
        this.label = 2;
    }
}
