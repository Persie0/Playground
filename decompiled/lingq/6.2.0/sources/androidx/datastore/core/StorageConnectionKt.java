package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class StorageConnectionKt {

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m4291f = "StorageConnection.kt", m4292l = {66}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05222 extends SuspendLambda implements zi3 {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05222(T t, Continuation<? super C05222> continuation) {
            super(2, continuation);
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
            C05222 c05222 = new C05222(this.$value, continuation);
            c05222.L$0 = obj;
            return c05222;
        }

        @Override // p000.zi3
        public final Object invoke(WriteScope<T> writeScope, Continuation<? super xfa> continuation) {
            return ((C05222) create(writeScope, continuation)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t = this.$value;
                this.label = 1;
                if (writeScope.writeData(t, this) == coroutineSingletons) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object readData(StorageConnection<T> storageConnection, Continuation<? super T> continuation) {
        return storageConnection.readScope(new C05212(null), continuation);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, Continuation<? super xfa> continuation) {
        Object objWriteScope = storageConnection.writeScope(new C05222(t, null), continuation);
        return objWriteScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objWriteScope : xfa.f68157a;
    }

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    @c32(m4290c = "androidx.datastore.core.StorageConnectionKt$readData$2", m4291f = "StorageConnection.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 1)
    public static final class C05212 extends SuspendLambda implements aj3 {
        private /* synthetic */ Object L$0;
        int label;

        public C05212(Continuation<? super C05212> continuation) {
            super(3, continuation);
        }

        @Override // p000.aj3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (Continuation) obj3);
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
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == coroutineSingletons ? coroutineSingletons : data;
        }

        public final Object invoke(ReadScope<T> readScope, boolean z, Continuation<? super T> continuation) {
            C05212 c05212 = new C05212(continuation);
            c05212.L$0 = readScope;
            return c05212.invokeSuspend(xfa.f68157a);
        }
    }
}
