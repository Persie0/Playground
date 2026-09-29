package androidx.datastore.core;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.c83;
import p000.kk8;
import p000.vi3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final c76 mutex;
    private final c83 updateNotifications;
    private final AtomicInt version;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1 */
    @c32(m4290c = "androidx.datastore.core.SingleProcessCoordinator", m4291f = "SingleProcessCoordinator.kt", m4292l = {62, DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "lock", m4294v = 1)
    public static final class C05191<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C05191(Continuation<? super C05191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1 */
    @c32(m4290c = "androidx.datastore.core.SingleProcessCoordinator", m4291f = "SingleProcessCoordinator.kt", m4292l = {47}, m4293m = "tryLock", m4294v = 1)
    public static final class C05201<T> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C05201(Continuation<? super C05201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String str) {
        str.getClass();
        this.filePath = str;
        this.mutex = new C3248a();
        this.version = new AtomicInt(0);
        this.updateNotifications = new kk8(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public c83 getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        return new Integer(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        return new Integer(this.version.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.datastore.core.SingleProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r6v1, types: [c76] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [c76] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object lock(vi3 vi3Var, Continuation<? super T> continuation) throws Throwable {
        C05191 c05191;
        c76 c76Var;
        c76 c76Var2;
        if (continuation instanceof C05191) {
            c05191 = (C05191) continuation;
            int i = c05191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05191.label = i - Integer.MIN_VALUE;
            } else {
                c05191 = new C05191(continuation);
            }
        } else {
            c05191 = new C05191(continuation);
        }
        Object objInvoke = c05191.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05191.label;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objInvoke);
                c76Var = this.mutex;
                c05191.L$0 = vi3Var;
                c05191.L$1 = c76Var;
                c05191.label = 1;
                if (c76Var.mo4388c(c05191) != coroutineSingletons) {
                }
                c76Var2 = c76Var;
                return coroutineSingletons;
            }
            if (i2 == 1) {
                c76 c76Var3 = (c76) c05191.L$1;
                vi3Var = (vi3) c05191.L$0;
                AbstractC3193b.m15359b(objInvoke);
                c76Var2 = c76Var3;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76 c76Var4 = (c76) c05191.L$0;
                AbstractC3193b.m15359b(objInvoke);
                this = c76Var4;
            }
            this.mo4387b(null);
            return objInvoke;
            c76Var2 = c76Var;
            c05191.L$0 = c76Var2;
            c05191.L$1 = null;
            c05191.label = 2;
            objInvoke = vi3Var.invoke(c05191);
            this = c76Var2;
        } catch (Throwable th) {
            this.mo4387b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object tryLock(zi3 zi3Var, Continuation<? super T> continuation) throws Throwable {
        C05201 c05201;
        c76 c76Var;
        boolean z;
        Throwable th;
        if (continuation instanceof C05201) {
            c05201 = (C05201) continuation;
            int i = c05201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05201.label = i - Integer.MIN_VALUE;
            } else {
                c05201 = new C05201(continuation);
            }
        } else {
            c05201 = new C05201(continuation);
        }
        Object obj = c05201.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05201.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c05201.Z$0;
            c76Var = (c76) c05201.L$0;
            try {
                AbstractC3193b.m15359b(obj);
                if (z) {
                    c76Var.mo4387b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    c76Var.mo4387b(null);
                }
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        c76 c76Var2 = this.mutex;
        boolean zMo4386a = c76Var2.mo4386a(null);
        try {
            Object objValueOf = Boolean.valueOf(zMo4386a);
            c05201.L$0 = c76Var2;
            c05201.Z$0 = zMo4386a;
            c05201.label = 1;
            Object objInvoke = zi3Var.invoke(objValueOf, c05201);
            if (objInvoke == obj2) {
                return obj2;
            }
            c76Var = c76Var2;
            z = zMo4386a;
            obj = objInvoke;
            if (z) {
                c76Var.mo4387b(null);
            }
            return obj;
        } catch (Throwable th3) {
            c76Var = c76Var2;
            z = zMo4386a;
            th = th3;
            if (z) {
                c76Var.mo4387b(null);
            }
            throw th;
        }
    }
}
