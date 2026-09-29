package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.C3248a;
import p000.C0011a9;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.c83;
import p000.cd4;
import p000.cs4;
import p000.dc1;
import p000.eh0;
import p000.gm5;
import p000.kk8;
import p000.kn1;
import p000.lda;
import p000.ln1;
import p000.nn1;
import p000.nn9;
import p000.r46;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.wb1;
import p000.wfb;
import p000.xb1;
import p000.xfa;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl<T> implements CurrentDataProviderStore<T> {
    public static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private cd4 collectorJob;
    private final c76 collectorMutex;
    private final cs4 coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final c83 data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final un1 scope;
    private final Storage<T> storage;
    private final cs4 storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public final class InitDataStore extends RunOnce {
        private List<? extends zi3> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends zi3> list) {
            list.getClass();
            this.this$0 = dataStoreImpl;
            this.initTasks = u91.m22622n1(list);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doRun(Continuation<? super xfa> continuation) throws Throwable {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            Data data;
            if (continuation instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuation;
                int i = dataStoreImpl$InitDataStore$doRun$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label = i - Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
                }
            } else {
                dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            }
            Object dataOrHandleCorruption = dataStoreImpl$InitDataStore$doRun$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i2 == 0) {
                AbstractC3193b.m15359b(dataOrHandleCorruption);
                List<? extends zi3> list = this.initTasks;
                if (list != null) {
                    list.getClass();
                    if (list.isEmpty()) {
                        DataStoreImpl<T> dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        dataOrHandleCorruption = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                    } else {
                        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        dataOrHandleCorruption = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                    }
                } else {
                    DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                    dataStoreImpl$InitDataStore$doRun$1.label = 1;
                    dataOrHandleCorruption = dataStoreImpl2.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            }
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(data);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$currentData$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {120}, m4293m = "currentData", m4294v = 1)
    public static final class C04851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04851(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04851> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.currentData(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {566}, m4293m = "decrementCollector", m4294v = 1)
    public static final class C04911 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04911(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04911> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2", m4291f = "DataStoreImpl.kt", m4292l = {434}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04922 extends SuspendLambda implements vi3 {
        final /* synthetic */ vi3 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04922(vi3 vi3Var, Continuation<? super C04922> continuation) {
            super(1, continuation);
            this.$block = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C04922(this.$block, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super R> continuation) {
            return ((C04922) create(continuation)).invokeSuspend(xfa.f68157a);
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
            vi3 vi3Var = this.$block;
            this.label = 1;
            Object objInvoke = vi3Var.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {251}, m4293m = "handleUpdate", m4294v = 1)
    public static final class C04931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04931(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04931> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {566}, m4293m = "incrementCollector", m4294v = 1)
    public static final class C04941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04941(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04941> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {284, 286}, m4293m = "readAndInitOrPropagateAndThrowFailure", m4294v = 1)
    public static final class C04961 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04961(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04961> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {305, 314, 322}, m4293m = "readDataAndUpdateCache", m4294v = 1)
    public static final class C04971 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04971(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04971> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m4291f = "DataStoreImpl.kt", m4292l = {316, 318}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04983 extends SuspendLambda implements vi3 {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04983(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04983> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C04983(this.this$0, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super Pair<? extends State<T>, Boolean>> continuation) {
            return ((C04983) create(continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            State readException;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.L$0;
                        AbstractC3193b.m15359b(obj);
                        readException = new ReadException(th, ((Number) obj).intValue());
                        return new Pair(readException, Boolean.TRUE);
                    }
                    AbstractC3193b.m15359b(obj);
                }
                readException = (State) obj;
            } catch (Throwable th2) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th2;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != coroutineSingletons) {
                    obj = version;
                    th = th2;
                }
                return coroutineSingletons;
            }
            return new Pair(readException, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl", m4291f = "DataStoreImpl.kt", m4292l = {385, 386, 388, 389, 396, 400}, m4293m = "readDataOrHandleCorruption", m4294v = 1)
    public static final class C05001 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05001(DataStoreImpl<T> dataStoreImpl, Continuation<? super C05001> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m4291f = "DataStoreImpl.kt", m4292l = {403, 404, 406}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05023 extends SuspendLambda implements vi3 {
        final /* synthetic */ Ref$ObjectRef<T> $newData;
        final /* synthetic */ Ref$IntRef $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05023(Ref$ObjectRef<T> ref$ObjectRef, DataStoreImpl<T> dataStoreImpl, Ref$IntRef ref$IntRef, Continuation<? super C05023> continuation) {
            super(1, continuation);
            this.$newData = ref$ObjectRef;
            this.this$0 = dataStoreImpl;
            this.$version = ref$IntRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C05023(this.$newData, this.this$0, this.$version, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super xfa> continuation) {
            return ((C05023) create(continuation)).invokeSuspend(xfa.f68157a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 for r6v9 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L17
                java.lang.Object r6 = r6.L$0
                kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref$IntRef) r6
                kotlin.AbstractC3193b.m15359b(r7)
                goto L74
            L17:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r6)
                r6 = 0
                return r6
            L1e:
                java.lang.Object r1 = r6.L$0
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref$IntRef) r1
                kotlin.AbstractC3193b.m15359b(r7)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L55
            L26:
                java.lang.Object r1 = r6.L$0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                kotlin.AbstractC3193b.m15359b(r7)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L40
            L2e:
                kotlin.AbstractC3193b.m15359b(r7)
                kotlin.jvm.internal.Ref$ObjectRef<T> r1 = r6.$newData     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r6.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r6.label = r4     // Catch: androidx.datastore.core.CorruptionException -> L5e
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r7, r6)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                if (r7 != r0) goto L40
                goto L70
            L40:
                r1.f47718a = r7     // Catch: androidx.datastore.core.CorruptionException -> L5e
                kotlin.jvm.internal.Ref$IntRef r1 = r6.$version     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5e
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r6.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r6.label = r3     // Catch: androidx.datastore.core.CorruptionException -> L5e
                java.lang.Object r7 = r7.getVersion(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5e
                if (r7 != r0) goto L55
                goto L70
            L55:
                java.lang.Number r7 = (java.lang.Number) r7     // Catch: androidx.datastore.core.CorruptionException -> L5e
                int r7 = r7.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L5e
                r1.f47716a = r7     // Catch: androidx.datastore.core.CorruptionException -> L5e
                goto L7c
            L5e:
                kotlin.jvm.internal.Ref$IntRef r7 = r6.$version
                androidx.datastore.core.DataStoreImpl<T> r1 = r6.this$0
                kotlin.jvm.internal.Ref$ObjectRef<T> r3 = r6.$newData
                java.lang.Object r3 = r3.f47718a
                r6.L$0 = r7
                r6.label = r2
                java.lang.Object r6 = r1.writeData$datastore_core(r3, r4, r6)
                if (r6 != r0) goto L71
            L70:
                return r0
            L71:
                r5 = r7
                r7 = r6
                r6 = r5
            L74:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r6.f47716a = r7
            L7c:
                xfa r6 = p000.xfa.f68157a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C05023.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$readState$2", m4291f = "DataStoreImpl.kt", m4292l = {232, 240}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05032 extends SuspendLambda implements zi3 {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05032(DataStoreImpl<T> dataStoreImpl, boolean z, Continuation<? super C05032> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C05032(this.this$0, this.$requireLock, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(un1 un1Var, Continuation<? super State<T>> continuation) {
            return ((C05032) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r5 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3193b.m15359b(obj);
                    } else {
                        if (i != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return (State) obj;
                }
                AbstractC3193b.m15359b(obj);
                boolean z = ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState() instanceof Final;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                if (z) {
                    return ((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState();
                }
                this.label = 1;
                if (dataStoreImpl.readAndInitOrPropagateAndThrowFailure(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                boolean z2 = this.$requireLock;
                this.label = 2;
                obj = dataStoreImpl2.readDataAndUpdateCache(z2, this);
            } catch (Throwable th) {
                return new ReadException(th, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m4291f = "DataStoreImpl.kt", m4292l = {350, 351, 357}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05042 extends SuspendLambda implements vi3 {
        final /* synthetic */ kn1 $callerContext;
        final /* synthetic */ zi3 $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05042(DataStoreImpl<T> dataStoreImpl, kn1 kn1Var, zi3 zi3Var, Continuation<? super C05042> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
            this.$callerContext = kn1Var;
            this.$transform = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Continuation<?> continuation) {
            return new C05042(this.this$0, this.$callerContext, this.$transform, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C05042) create(continuation)).invokeSuspend(xfa.f68157a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.datastore.core.DataStoreImpl$transformAndWrite$2 for r8v4 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L16
                java.lang.Object r8 = r8.L$0
                kotlin.AbstractC3193b.m15359b(r9)
                return r8
            L16:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r8)
                return r2
            L1c:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.AbstractC3193b.m15359b(r9)
                goto L4d
            L24:
                kotlin.AbstractC3193b.m15359b(r9)
                goto L36
            L28:
                kotlin.AbstractC3193b.m15359b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r5
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r5, r8)
                if (r9 != r0) goto L36
                goto L66
            L36:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kn1 r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r6 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                zi3 r7 = r8.$transform
                r6.<init>(r7, r1, r2)
                r8.L$0 = r1
                r8.label = r4
                java.lang.Object r9 = p000.wfb.m23905G(r6, r9, r8)
                if (r9 != r0) goto L4d
                goto L66
            L4d:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = p000.fa4.m11650l(r1, r9)
                if (r1 != 0) goto L67
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r3
                java.lang.Object r8 = r1.writeData$datastore_core(r9, r5, r8)
                if (r8 != r0) goto L67
            L66:
                return r0
            L67:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C05042.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$updateData$2", m4291f = "DataStoreImpl.kt", m4292l = {ModuleDescriptor.MODULE_VERSION}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05052 extends SuspendLambda implements zi3 {
        final /* synthetic */ zi3 $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05052(DataStoreImpl<T> dataStoreImpl, zi3 zi3Var, Continuation<? super C05052> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$transform = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05052 c05052 = new C05052(this.this$0, this.$transform, continuation);
            c05052.L$0 = obj;
            return c05052;
        }

        @Override // p000.zi3
        public final Object invoke(un1 un1Var, Continuation<? super T> continuation) {
            return ((C05052) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
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
            un1 un1Var = (un1) this.L$0;
            xb1 xb1VarM20377b = r46.m20377b();
            State<T> currentState = ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState();
            if (currentState instanceof Data) {
                currentState = new NoValueDataState(((Data) currentState).getVersion());
            }
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, xb1VarM20377b, currentState, un1Var.mo1309x()));
            this.label = 1;
            Object objM15517w = xb1VarM20377b.m15517w(this);
            return objM15517w == coroutineSingletons ? coroutineSingletons : objM15517w;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends zi3> list, CorruptionHandler<T> corruptionHandler, un1 un1Var) {
        storage.getClass();
        list.getClass();
        corruptionHandler.getClass();
        un1Var.getClass();
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = un1Var;
        this.data = new kk8(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = new C3248a();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, list);
        final int i = 0;
        this.storageConnectionDelegate = AbstractC3192a.m15356a(new ui3(this) { // from class: m02

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DataStoreImpl f50376b;

            {
                this.f50376b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                DataStoreImpl dataStoreImpl = this.f50376b;
                switch (i2) {
                    case 0:
                        return DataStoreImpl.storageConnectionDelegate$lambda$0(dataStoreImpl);
                    default:
                        return DataStoreImpl.coordinator_delegate$lambda$0(dataStoreImpl);
                }
            }
        });
        final int i2 = 1;
        this.coordinator$delegate = AbstractC3192a.m15356a(new ui3(this) { // from class: m02

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DataStoreImpl f50376b;

            {
                this.f50376b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                DataStoreImpl dataStoreImpl = this.f50376b;
                switch (i3) {
                    case 0:
                        return DataStoreImpl.storageConnectionDelegate$lambda$0(dataStoreImpl);
                    default:
                        return DataStoreImpl.coordinator_delegate$lambda$0(dataStoreImpl);
                }
            }
        });
        this.writeActor = new SimpleActor<>(un1Var, new C0011a9(this, 8), new ln1(i2), new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xfa m2026b(DataStoreImpl dataStoreImpl, Throwable th) {
        return writeActor$lambda$0(dataStoreImpl, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterProcessCoordinator coordinator_delegate$lambda$0(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.getStorageConnection$datastore_core().getCoordinator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object decrementCollector(Continuation<? super xfa> continuation) throws Throwable {
        C04911 c04911;
        c76 c76Var;
        if (continuation instanceof C04911) {
            c04911 = (C04911) continuation;
            int i = c04911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04911.label = i - Integer.MIN_VALUE;
            } else {
                c04911 = new C04911(this, continuation);
            }
        } else {
            c04911 = new C04911(this, continuation);
        }
        Object obj = c04911.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c04911.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76 c76Var2 = this.collectorMutex;
            c04911.L$0 = c76Var2;
            c04911.label = 1;
            if (c76Var2.mo4388c(c04911) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c76Var = c76Var2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76Var = (c76) c04911.L$0;
            AbstractC3193b.m15359b(obj);
        }
        try {
            int i3 = this.collectorCounter - 1;
            this.collectorCounter = i3;
            if (i3 == 0) {
                cd4 cd4Var = this.collectorJob;
                if (cd4Var != null) {
                    cd4Var.mo4537a(null);
                }
                this.collectorJob = null;
            }
            return xfa.f68157a;
        } finally {
            c76Var.mo4387b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z, vi3 vi3Var, Continuation<? super R> continuation) {
        return z ? vi3Var.invoke(continuation) : getCoordinator().lock(new C04922(vi3Var, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super xfa> continuation) throws Throwable {
        C04931 c04931;
        wb1 wb1Var;
        if (continuation instanceof C04931) {
            c04931 = (C04931) continuation;
            int i = c04931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04931.label = i - Integer.MIN_VALUE;
            } else {
                c04931 = new C04931(this, continuation);
            }
        } else {
            c04931 = new C04931(this, continuation);
        }
        Object failure = c04931.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c04931.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(failure);
            wb1 ack = update.getAck();
            try {
                kn1 kn1VarPlus = update.getCallerContext().plus(c04931.getContext());
                DataStoreImpl$handleUpdate$2$1 dataStoreImpl$handleUpdate$2$1 = new DataStoreImpl$handleUpdate$2$1(this, update, null);
                c04931.L$0 = ack;
                c04931.label = 1;
                Object objM23905G = wfb.m23905G(dataStoreImpl$handleUpdate$2$1, kn1VarPlus, c04931);
                if (objM23905G == coroutineSingletons) {
                    return coroutineSingletons;
                }
                failure = objM23905G;
                wb1Var = ack;
            } catch (Throwable th) {
                th = th;
                wb1Var = ack;
                failure = new Result.Failure(th);
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wb1Var = (wb1) c04931.L$0;
            try {
                AbstractC3193b.m15359b(failure);
            } catch (Throwable th2) {
                th = th2;
                failure = new Result.Failure(th);
            }
        }
        Throwable thM15355a = Result.m15355a(failure);
        xb1 xb1Var = (xb1) wb1Var;
        if (thM15355a == null) {
            xb1Var.m15505Y(failure);
        } else {
            xb1Var.getClass();
            xb1Var.m15505Y(new dc1(thM15355a, false));
        }
        return xfa.f68157a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object incrementCollector(Continuation<? super xfa> continuation) throws Throwable {
        C04941 c04941;
        c76 c76Var;
        if (continuation instanceof C04941) {
            c04941 = (C04941) continuation;
            int i = c04941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04941.label = i - Integer.MIN_VALUE;
            } else {
                c04941 = new C04941(this, continuation);
            }
        } else {
            c04941 = new C04941(this, continuation);
        }
        Object obj = c04941.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c04941.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c76 c76Var2 = this.collectorMutex;
            c04941.L$0 = c76Var2;
            c04941.label = 1;
            if (c76Var2.mo4388c(c04941) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c76Var = c76Var2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c76Var = (c76) c04941.L$0;
            AbstractC3193b.m15359b(obj);
        }
        try {
            int i3 = this.collectorCounter + 1;
            this.collectorCounter = i3;
            if (i3 == 1) {
                this.collectorJob = wfb.m23926u(this.scope, null, null, new DataStoreImpl$incrementCollector$2$1(this, null), 3);
            }
            return xfa.f68157a;
        } finally {
            c76Var.mo4387b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2.runIfNeeded(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super xfa> continuation) throws Throwable {
        C04961 c04961;
        int iIntValue;
        int i;
        Throwable th;
        if (continuation instanceof C04961) {
            c04961 = (C04961) continuation;
            int i2 = c04961.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c04961.label = i2 - Integer.MIN_VALUE;
            } else {
                c04961 = new C04961(this, continuation);
            }
        } else {
            c04961 = new C04961(this, continuation);
        }
        Object version = c04961.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c04961.label;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(version);
                InterProcessCoordinator coordinator = getCoordinator();
                c04961.label = 1;
                version = coordinator.getVersion(c04961);
                if (version != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = c04961.I$0;
                try {
                    AbstractC3193b.m15359b(version);
                    return xfa.f68157a;
                } catch (Throwable th2) {
                    th = th2;
                    this.inMemoryCache.tryUpdate(new ReadException(th, i));
                    throw th;
                }
            }
            AbstractC3193b.m15359b(version);
            DataStoreImpl<T>.InitDataStore initDataStore = this.readAndInit;
            c04961.I$0 = iIntValue;
            c04961.label = 2;
        } catch (Throwable th3) {
            i = iIntValue;
            th = th3;
            this.inMemoryCache.tryUpdate(new ReadException(th, i));
            throw th;
        }
        iIntValue = ((Number) version).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r10 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataAndUpdateCache(boolean z, Continuation<? super State<T>> continuation) throws Throwable {
        C04971 c04971;
        State<T> currentState;
        Pair pair;
        State<T> state;
        if (continuation instanceof C04971) {
            c04971 = (C04971) continuation;
            int i = c04971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04971.label = i - Integer.MIN_VALUE;
            } else {
                c04971 = new C04971(this, continuation);
            }
        } else {
            c04971 = new C04971(this, continuation);
        }
        Object version = c04971.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c04971.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(version);
            currentState = this.inMemoryCache.getCurrentState();
            if (currentState instanceof UnInitialized) {
                C3386nv.m17633t(BUG_MESSAGE);
                return null;
            }
            InterProcessCoordinator coordinator = getCoordinator();
            c04971.L$0 = currentState;
            c04971.Z$0 = z;
            c04971.label = 1;
            version = coordinator.getVersion(c04971);
            if (version != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(version);
                pair = (Pair) version;
                state = (State) pair.f47623a;
                if (((Boolean) pair.f47624b).booleanValue()) {
                    this.inMemoryCache.tryUpdate(state);
                }
                return state;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(version);
            pair = (Pair) version;
            state = (State) pair.f47623a;
            if (((Boolean) pair.f47624b).booleanValue()) {
                this.inMemoryCache.tryUpdate(state);
            }
            return state;
        }
        z = c04971.Z$0;
        currentState = (State) c04971.L$0;
        AbstractC3193b.m15359b(version);
        int iIntValue = ((Number) version).intValue();
        boolean z2 = currentState instanceof Data;
        int version2 = z2 ? ((Data) currentState).getVersion() : -1;
        if (z2 && iIntValue == version2) {
            return currentState;
        }
        if (z) {
            InterProcessCoordinator coordinator2 = getCoordinator();
            C04983 c04983 = new C04983(this, null);
            c04971.L$0 = null;
            c04971.label = 2;
            version = coordinator2.lock(c04983, c04971);
        } else {
            InterProcessCoordinator coordinator3 = getCoordinator();
            C04994 c04994 = new C04994(this, version2, null);
            c04971.L$0 = null;
            c04971.label = 3;
            version = coordinator3.tryLock(c04994, c04971);
        }
        return coroutineSingletons;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(Continuation<? super T> continuation) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x008c A[Catch: CorruptionException -> 0x005a, TryCatch #2 {CorruptionException -> 0x005a, blocks: (B:19:0x0055, B:54:0x00e4, B:24:0x005f, B:51:0x00c9, B:32:0x0074, B:40:0x008c, B:42:0x0092, B:36:0x007d, B:48:0x00b9), top: B:78:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readDataOrHandleCorruption(boolean z, Continuation<? super Data<T>> continuation) throws Throwable {
        C05001 c05001;
        Ref$ObjectRef ref$ObjectRef;
        CorruptionException corruptionException;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$IntRef ref$IntRef;
        CorruptionException corruptionException2;
        C05023 c05023;
        Ref$IntRef ref$IntRef2;
        Ref$ObjectRef ref$ObjectRef3;
        int iHashCode;
        Object version;
        boolean z2;
        int i;
        Object obj;
        if (continuation instanceof C05001) {
            c05001 = (C05001) continuation;
            int i2 = c05001.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c05001.label = i2 - Integer.MIN_VALUE;
            } else {
                c05001 = new C05001(this, continuation);
            }
        } else {
            c05001 = new C05001(this, continuation);
        }
        Object version2 = c05001.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (c05001.label) {
                case 0:
                    AbstractC3193b.m15359b(version2);
                    if (z) {
                        c05001.Z$0 = z;
                        c05001.label = 1;
                        version2 = readDataFromFileOrDefault(c05001);
                        if (version2 != coroutineSingletons) {
                            if (version2 != null) {
                                iHashCode = version2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            InterProcessCoordinator coordinator = getCoordinator();
                            c05001.L$0 = version2;
                            c05001.Z$0 = z;
                            c05001.I$0 = iHashCode;
                            c05001.label = 2;
                            version = coordinator.getVersion(c05001);
                            if (version != coroutineSingletons) {
                                int i3 = iHashCode;
                                z2 = z;
                                i = i3;
                                obj = version2;
                                version2 = version;
                                return new Data(obj, i, ((Number) version2).intValue());
                            }
                        }
                    } else {
                        InterProcessCoordinator coordinator2 = getCoordinator();
                        c05001.Z$0 = z;
                        c05001.label = 3;
                        version2 = coordinator2.getVersion(c05001);
                        if (version2 != coroutineSingletons) {
                            int iIntValue = ((Number) version2).intValue();
                            InterProcessCoordinator coordinator3 = getCoordinator();
                            C05012 c05012 = new C05012(this, iIntValue, null);
                            c05001.Z$0 = z;
                            c05001.label = 4;
                            version2 = coordinator3.tryLock(c05012, c05001);
                            if (version2 == coroutineSingletons) {
                            }
                            return (Data) version2;
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    z = c05001.Z$0;
                    AbstractC3193b.m15359b(version2);
                    if (version2 != null) {
                        iHashCode = version2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator4 = getCoordinator();
                    c05001.L$0 = version2;
                    c05001.Z$0 = z;
                    c05001.I$0 = iHashCode;
                    c05001.label = 2;
                    version = coordinator4.getVersion(c05001);
                    if (version != coroutineSingletons) {
                        int i4 = iHashCode;
                        z2 = z;
                        i = i4;
                        obj = version2;
                        version2 = version;
                        return new Data(obj, i, ((Number) version2).intValue());
                    }
                    return coroutineSingletons;
                case 2:
                    i = c05001.I$0;
                    z2 = c05001.Z$0;
                    obj = c05001.L$0;
                    try {
                        AbstractC3193b.m15359b(version2);
                        return new Data(obj, i, ((Number) version2).intValue());
                    } catch (CorruptionException e) {
                        e = e;
                        z = z2;
                        ref$ObjectRef = new Ref$ObjectRef();
                        CorruptionHandler<T> corruptionHandler = this.corruptionHandler;
                        c05001.L$0 = e;
                        c05001.L$1 = ref$ObjectRef;
                        c05001.L$2 = ref$ObjectRef;
                        c05001.Z$0 = z;
                        c05001.label = 5;
                        Object objHandleCorruption = corruptionHandler.handleCorruption(e, c05001);
                        if (objHandleCorruption != coroutineSingletons) {
                            corruptionException = e;
                            version2 = objHandleCorruption;
                            ref$ObjectRef2 = ref$ObjectRef;
                            ref$ObjectRef2.f47718a = version2;
                            ref$IntRef = new Ref$IntRef();
                            try {
                                c05023 = new C05023(ref$ObjectRef, this, ref$IntRef, null);
                                c05001.L$0 = corruptionException;
                                c05001.L$1 = ref$ObjectRef;
                                c05001.L$2 = ref$IntRef;
                                c05001.label = 6;
                                if (doWithWriteFileLock(z, c05023, c05001) != coroutineSingletons) {
                                    ref$IntRef2 = ref$IntRef;
                                    ref$ObjectRef3 = ref$ObjectRef;
                                    Object obj2 = ref$ObjectRef3.f47718a;
                                    return new Data(obj2, obj2 != null ? obj2.hashCode() : 0, ref$IntRef2.f47716a);
                                }
                            } catch (Throwable th) {
                                th = th;
                                corruptionException2 = corruptionException;
                                lda.m16117c(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        return coroutineSingletons;
                    }
                case 3:
                    z = c05001.Z$0;
                    AbstractC3193b.m15359b(version2);
                    int iIntValue2 = ((Number) version2).intValue();
                    InterProcessCoordinator coordinator5 = getCoordinator();
                    C05012 c05013 = new C05012(this, iIntValue2, null);
                    c05001.Z$0 = z;
                    c05001.label = 4;
                    version2 = coordinator5.tryLock(c05013, c05001);
                    if (version2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return (Data) version2;
                case 4:
                    boolean z3 = c05001.Z$0;
                    AbstractC3193b.m15359b(version2);
                    return (Data) version2;
                case 5:
                    z = c05001.Z$0;
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) c05001.L$2;
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) c05001.L$1;
                    corruptionException = (CorruptionException) c05001.L$0;
                    AbstractC3193b.m15359b(version2);
                    ref$ObjectRef2 = ref$ObjectRef4;
                    ref$ObjectRef = ref$ObjectRef5;
                    ref$ObjectRef2.f47718a = version2;
                    ref$IntRef = new Ref$IntRef();
                    c05023 = new C05023(ref$ObjectRef, this, ref$IntRef, null);
                    c05001.L$0 = corruptionException;
                    c05001.L$1 = ref$ObjectRef;
                    c05001.L$2 = ref$IntRef;
                    c05001.label = 6;
                    if (doWithWriteFileLock(z, c05023, c05001) != coroutineSingletons) {
                        ref$IntRef2 = ref$IntRef;
                        ref$ObjectRef3 = ref$ObjectRef;
                        Object obj3 = ref$ObjectRef3.f47718a;
                        return new Data(obj3, obj3 != null ? obj3.hashCode() : 0, ref$IntRef2.f47716a);
                    }
                    return coroutineSingletons;
                case 6:
                    ref$IntRef2 = (Ref$IntRef) c05001.L$2;
                    ref$ObjectRef3 = (Ref$ObjectRef) c05001.L$1;
                    corruptionException2 = (CorruptionException) c05001.L$0;
                    try {
                        AbstractC3193b.m15359b(version2);
                        Object obj4 = ref$ObjectRef3.f47718a;
                        return new Data(obj4, obj4 != null ? obj4.hashCode() : 0, ref$IntRef2.f47716a);
                    } catch (Throwable th2) {
                        th = th2;
                        lda.m16117c(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CorruptionException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z, Continuation<? super State<T>> continuation) {
        return wfb.m23905G(new C05032(this, z, null), this.scope.mo1309x(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorageConnection storageConnectionDelegate$lambda$0(DataStoreImpl dataStoreImpl) {
        return dataStoreImpl.storage.createConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(zi3 zi3Var, kn1 kn1Var, Continuation<? super T> continuation) {
        return getCoordinator().lock(new C05042(this, kn1Var, zi3Var, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa writeActor$lambda$0(DataStoreImpl dataStoreImpl, Throwable th) {
        if (th != null) {
            dataStoreImpl.inMemoryCache.tryUpdate(new Final(th));
        }
        if (dataStoreImpl.storageConnectionDelegate.isInitialized()) {
            dataStoreImpl.getStorageConnection$datastore_core().close();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa writeActor$lambda$1(Message.Update update, Throwable th) {
        update.getClass();
        wb1 ack = update.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        xb1 xb1Var = (xb1) ack;
        xb1Var.getClass();
        xb1Var.m15505Y(new dc1(th, false));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.CurrentDataProviderStore
    public Object currentData(Continuation<? super T> continuation) throws Throwable {
        C04851 c04851;
        if (continuation instanceof C04851) {
            c04851 = (C04851) continuation;
            int i = c04851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04851.label = i - Integer.MIN_VALUE;
            } else {
                c04851 = new C04851(this, continuation);
            }
        } else {
            c04851 = new C04851(this, continuation);
        }
        Object state = c04851.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c04851.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(state);
            c04851.label = 1;
            state = readState(false, c04851);
            if (state == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(state);
        }
        State state2 = (State) state;
        if (state2 instanceof Data) {
            return ((Data) state2).getValue();
        }
        if (state2 instanceof UnInitialized) {
            C3386nv.m17633t(BUG_MESSAGE);
            return null;
        }
        if (state2 instanceof ReadException) {
            throw ((ReadException) state2).getReadException();
        }
        if (state2 instanceof Final) {
            throw ((Final) state2).getFinalException();
        }
        if (state2 instanceof NoValueDataState) {
            C3386nv.m17633t(BUG_MESSAGE);
            return null;
        }
        gm5.m12750e();
        return null;
    }

    @Override // androidx.datastore.core.DataStore
    public c83 getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(zi3 zi3Var, Continuation<? super T> continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return wfb.m23905G(new C05052(this, zi3Var, null), new UpdatingDataContextElement(updatingDataContextElement, this), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object writeData$datastore_core(T t, boolean z, Continuation<? super Integer> continuation) throws Throwable {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        Ref$IntRef ref$IntRef;
        if (continuation instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuation;
            int i = dataStoreImpl$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
        }
        Object obj = dataStoreImpl$writeData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dataStoreImpl$writeData$1.label;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            StorageConnection<T> storageConnection$datastore_core = getStorageConnection$datastore_core();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(ref$IntRef2, this, t, z, null);
            dataStoreImpl$writeData$1.L$0 = ref$IntRef2;
            dataStoreImpl$writeData$1.label = 1;
            if (storageConnection$datastore_core.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) dataStoreImpl$writeData$1.L$0;
            AbstractC3193b.m15359b(obj);
        }
        return new Integer(ref$IntRef.f47716a);
    }

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m4291f = "DataStoreImpl.kt", m4292l = {324, 328}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04994 extends SuspendLambda implements zi3 {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04994(DataStoreImpl<T> dataStoreImpl, int i, Continuation<? super C04994> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C04994 c04994 = new C04994(this.this$0, this.$cachedVersion, continuation);
            c04994.Z$0 = ((Boolean) obj).booleanValue();
            return c04994;
        }

        public final Object invoke(boolean z, Continuation<? super Pair<? extends State<T>, Boolean>> continuation) {
            return ((C04994) create(Boolean.valueOf(z), continuation)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int iIntValue;
            Throwable th;
            boolean z;
            State readException;
            ?? r1;
            ?? r2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r3 = this.label;
            try {
                if (r3 == 0) {
                    AbstractC3193b.m15359b(obj);
                    boolean z2 = this.Z$0;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.Z$0 = z2;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(z2, this);
                    r3 = z2;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.Z$0;
                        th = (Throwable) this.L$0;
                        AbstractC3193b.m15359b(obj);
                        iIntValue = ((Number) obj).intValue();
                        r2 = z;
                        readException = new ReadException(th, iIntValue);
                        r1 = r2;
                        return new Pair(readException, Boolean.valueOf((boolean) r1));
                    }
                    boolean z3 = this.Z$0;
                    AbstractC3193b.m15359b(obj);
                    r3 = z3;
                }
                readException = (State) obj;
                r1 = r3;
            } catch (Throwable th2) {
                if (r3 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th2;
                    this.Z$0 = r3;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != coroutineSingletons) {
                        obj = version;
                        th = th2;
                        z = r3 == true ? 1 : 0;
                    }
                    return coroutineSingletons;
                }
                iIntValue = this.$cachedVersion;
                th = th2;
                r2 = r3;
            }
            return new Pair(readException, Boolean.valueOf((boolean) r1));
        }

        @Override // p000.zi3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m4291f = "DataStoreImpl.kt", m4292l = {390, 391}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05012 extends SuspendLambda implements zi3 {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05012(DataStoreImpl<T> dataStoreImpl, int i, Continuation<? super C05012> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05012 c05012 = new C05012(this.this$0, this.$preLockVersion, continuation);
            c05012.Z$0 = ((Boolean) obj).booleanValue();
            return c05012;
        }

        public final Object invoke(boolean z, Continuation<? super Data<T>> continuation) {
            return ((C05012) create(Boolean.valueOf(z), continuation)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0057  */
        /* JADX WARN: Code duplicated, block: B:23:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            int iIntValue;
            Object obj2;
            int iHashCode;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                z = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z;
                this.label = 1;
                obj = dataStoreImpl.readDataFromFileOrDefault(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                z = this.Z$0;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                AbstractC3193b.m15359b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
            if (z) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = obj;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != coroutineSingletons) {
                    Object obj3 = obj;
                    obj = version;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                }
                return coroutineSingletons;
            }
            Object obj4 = obj;
            iIntValue = this.$preLockVersion;
            obj2 = obj4;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
        }

        @Override // p000.zi3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, un1 un1Var, int i, y52 y52Var) {
        list = (i & 2) != 0 ? EmptyList.f47638a : list;
        corruptionHandler = (i & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler;
        if ((i & 8) != 0) {
            nn1 nn1VarIoDispatcher = Actual_jvmKt.ioDispatcher();
            nn9 nn9VarM20384i = r46.m20384i();
            nn1VarIoDispatcher.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(nn1VarIoDispatcher, nn9VarM20384i));
        }
        this(storage, list, corruptionHandler, un1Var);
    }
}
