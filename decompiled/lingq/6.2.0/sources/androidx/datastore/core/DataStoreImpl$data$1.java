package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.gm5;
import p000.l83;
import p000.m83;
import p000.n83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1", m4291f = "DataStoreImpl.kt", m4292l = {69, 71, 98}, m4293m = "invokeSuspend", m4294v = 1)
public final class DataStoreImpl$data$1 extends SuspendLambda implements zi3 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$1", m4291f = "DataStoreImpl.kt", m4292l = {100}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04861 extends SuspendLambda implements zi3 {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04861(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04861> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            return new C04861(this.this$0, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(e83 e83Var, Continuation<? super xfa> continuation) {
            return ((C04861) create(e83Var, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$2", m4291f = "DataStoreImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04872 extends SuspendLambda implements zi3 {
        /* synthetic */ Object L$0;
        int label;

        public C04872(Continuation<? super C04872> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C04872 c04872 = new C04872(continuation);
            c04872.L$0 = obj;
            return c04872;
        }

        @Override // p000.zi3
        public final Object invoke(State<T> state, Continuation<? super Boolean> continuation) {
            return ((C04872) create(state, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC3193b.m15359b(obj);
                return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$3", m4291f = "DataStoreImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04883 extends SuspendLambda implements zi3 {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04883(State<T> state, Continuation<? super C04883> continuation) {
            super(2, continuation);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C04883 c04883 = new C04883(this.$startState, continuation);
            c04883.L$0 = obj;
            return c04883;
        }

        @Override // p000.zi3
        public final Object invoke(State<T> state, Continuation<? super Boolean> continuation) {
            return ((C04883) create(state, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            State state = (State) this.L$0;
            return Boolean.valueOf((state instanceof Data) && ((Data) state).getVersion() <= ((Data) this.$startState).getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5 */
    @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$5", m4291f = "DataStoreImpl.kt", m4292l = {115}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C04895 extends SuspendLambda implements aj3 {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04895(DataStoreImpl<T> dataStoreImpl, Continuation<? super C04895> continuation) {
            super(3, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p000.aj3
        public final Object invoke(e83 e83Var, Throwable th, Continuation<? super xfa> continuation) {
            return new C04895(this.this$0, continuation).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, Continuation<? super DataStoreImpl$data$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, continuation);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // p000.zi3
    public final Object invoke(e83 e83Var, Continuation<? super xfa> continuation) {
        return ((DataStoreImpl$data$1) create(e83Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var;
        e83 e83Var2;
        State state;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83 e83Var3 = (e83) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = e83Var3;
            this.label = 1;
            Object state2 = dataStoreImpl.readState(false, this);
            if (state2 != coroutineSingletons) {
                e83Var = e83Var3;
                obj = state2;
            }
        }
        if (i == 1) {
            e83Var = (e83) this.L$0;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            state = (State) this.L$1;
            e83Var2 = (e83) this.L$0;
            AbstractC3193b.m15359b(obj);
        }
        final m83 m83Var = new m83(new n83(1, new m83(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new C04861(this.this$0, null)), new C04872(null)), new C04883(state, null), 1);
        l83 l83Var = new l83(new c83() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
            public static final class C04902<T> implements e83 {
                final /* synthetic */ e83 $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m4291f = "DataStoreImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 1)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C04902.this.emit(null, this);
                    }
                }

                public C04902(e83 e83Var) {
                    this.$this_unsafeFlow = e83Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p000.e83
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        AbstractC3193b.m15359b(obj2);
                        e83 e83Var = this.$this_unsafeFlow;
                        State state = (State) obj;
                        if (state instanceof ReadException) {
                            throw ((ReadException) state).getReadException();
                        }
                        if (!(state instanceof Data)) {
                            if ((state instanceof Final) || (state instanceof UnInitialized) || (state instanceof NoValueDataState)) {
                                C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
                                return null;
                            }
                            gm5.m12750e();
                            return null;
                        }
                        Object value = ((Data) state).getValue();
                        anonymousClass1.label = 1;
                        if (e83Var.emit(value, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj2);
                    }
                    return xfa.f68157a;
                }
            }

            @Override // p000.c83
            public Object collect(e83 e83Var4, Continuation continuation) {
                Object objCollect = m83Var.collect(new C04902(e83Var4), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
            }
        }, new C04895(this.this$0, null), 0);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        return AbstractC3224d.m15537p(e83Var2, l83Var, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
        State state3 = (State) obj;
        if (state3 instanceof Data) {
            Object value = ((Data) state3).getValue();
            this.L$0 = e83Var;
            this.L$1 = state3;
            this.label = 2;
            if (e83Var.emit(value, this) != coroutineSingletons) {
                e83Var2 = e83Var;
                state = state3;
                final c83 m83Var2 = new m83(new n83(1, new m83(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new C04861(this.this$0, null)), new C04872(null)), new C04883(state, null), 1);
                l83 l83Var2 = new l83(new c83() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C04902<T> implements e83 {
                        final /* synthetic */ e83 $this_unsafeFlow;

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @c32(m4290c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m4291f = "DataStoreImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 1)
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C04902.this.emit(null, this);
                            }
                        }

                        public C04902(e83 e83Var) {
                            this.$this_unsafeFlow = e83Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // p000.e83
                        public final Object emit(Object obj, Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                AbstractC3193b.m15359b(obj2);
                                e83 e83Var = this.$this_unsafeFlow;
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).getReadException();
                                }
                                if (!(state instanceof Data)) {
                                    if ((state instanceof Final) || (state instanceof UnInitialized) || (state instanceof NoValueDataState)) {
                                        C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
                                        return null;
                                    }
                                    gm5.m12750e();
                                    return null;
                                }
                                Object value = ((Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (e83Var.emit(value, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i2 != 1) {
                                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                AbstractC3193b.m15359b(obj2);
                            }
                            return xfa.f68157a;
                        }
                    }

                    @Override // p000.c83
                    public Object collect(e83 e83Var4, Continuation continuation) {
                        Object objCollect = m83Var2.collect(new C04902(e83Var4), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
                    }
                }, new C04895(this.this$0, null), 0);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (AbstractC3224d.m15537p(e83Var2, l83Var2, this) == coroutineSingletons) {
                }
            }
        }
        if (state3 instanceof UnInitialized) {
            C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
            return null;
        }
        if (state3 instanceof ReadException) {
            throw ((ReadException) state3).getReadException();
        }
        if (!(state3 instanceof Final)) {
            if (state3 instanceof NoValueDataState) {
                C3386nv.m17633t(DataStoreImpl.BUG_MESSAGE);
                return null;
            }
            gm5.m12750e();
            return null;
        }
    }
}
