package androidx.room;

import androidx.room.util.AbstractC0758a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC3193b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.kn1;
import p000.np6;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", m4291f = "InvalidationTracker.kt", m4292l = {239, 239, 243}, m4293m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$createFlow$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6758a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0750h f6760c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int[] f6761d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String[] f6762e;

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1 */
    @c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", m4291f = "InvalidationTracker.kt", m4292l = {239}, m4293m = "invokeSuspend")
    final class C07341 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6763a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0750h f6764b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07341(C0750h c0750h, Continuation continuation) {
            super(2, continuation);
            this.f6764b = c0750h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C07341(this.f6764b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07341) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6763a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f6763a = 1;
                if (this.f6764b.m2857f(this) == coroutineSingletons) {
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
    public TriggerBasedInvalidationTracker$createFlow$1(C0750h c0750h, int[] iArr, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f6760c = c0750h;
        this.f6761d = iArr;
        this.f6762e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.f6760c, this.f6761d, this.f6762e, continuation);
        triggerBasedInvalidationTracker$createFlow$1.f6759b = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$createFlow$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x00ee, TryCatch #3 {all -> 0x00ee, blocks: (B:48:0x00d8, B:50:0x00dc, B:52:0x00ea, B:55:0x00f0, B:57:0x00f5, B:59:0x00f9), top: B:72:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea A[Catch: all -> 0x00ee, TryCatch #3 {all -> 0x00ee, blocks: (B:48:0x00d8, B:50:0x00dc, B:52:0x00ea, B:55:0x00f0, B:57:0x00f5, B:59:0x00f9), top: B:72:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ab A[EXC_TOP_SPLITTER, PHI: r4 r18
      0x00ab: PHI (r4v4 e83) = (r4v2 e83), (r4v3 e83), (r4v9 e83) binds: [B:34:0x008a, B:39:0x00a8, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r18v3 long) = (r18v0 long), (r18v2 long), (r18v8 long) binds: [B:34:0x008a, B:39:0x00a8, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6.m2810a(r10, r24) == r3) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var;
        long j;
        Object objM2858a;
        C07341 c07341;
        Throwable th;
        np6 np6Var;
        boolean z;
        long j2;
        int[] iArr = this.f6761d;
        C0750h c0750h = this.f6760c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6758a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83Var = (e83) this.f6759b;
            np6 np6Var2 = c0750h.f6980h;
            np6Var2.getClass();
            iArr.getClass();
            ReentrantLock reentrantLock = np6Var2.f53097a;
            reentrantLock.lock();
            try {
                boolean z2 = false;
                for (int i2 : iArr) {
                    long[] jArr = np6Var2.f53098b;
                    long j3 = jArr[i2];
                    jArr[i2] = j3 + 1;
                    if (j3 == 0) {
                        np6Var2.f53100d = true;
                        z2 = true;
                    }
                }
                j = 1;
                boolean z3 = z2 || np6Var2.f53100d || np6Var2.f53102f;
                reentrantLock.unlock();
                if (z3) {
                    AbstractC0746d abstractC0746d = c0750h.f6973a;
                    this.f6759b = e83Var;
                    this.f6758a = 1;
                    objM2858a = AbstractC0758a.m2858a(abstractC0746d, false, this);
                    if (objM2858a != coroutineSingletons) {
                        c07341 = new C07341(c0750h, null);
                        this.f6759b = e83Var;
                        this.f6758a = 2;
                        if (wfb.m23905G(c07341, (kn1) objM2858a, this) != coroutineSingletons) {
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            C0737b c0737b = c0750h.f6981i;
                            C0749g c0749g = new C0749g(ref$ObjectRef, e83Var, this.f6762e, iArr);
                            this.f6759b = null;
                            this.f6758a = 3;
                        }
                    }
                } else {
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    C0737b c0737b2 = c0750h.f6981i;
                    C0749g c0749g2 = new C0749g(ref$ObjectRef2, e83Var, this.f6762e, iArr);
                    this.f6759b = null;
                    this.f6758a = 3;
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (i == 1) {
            e83Var = (e83) this.f6759b;
            AbstractC3193b.m15359b(obj);
            objM2858a = obj;
            j = 1;
            c07341 = new C07341(c0750h, null);
            this.f6759b = e83Var;
            this.f6758a = 2;
            if (wfb.m23905G(c07341, (kn1) objM2858a, this) != coroutineSingletons) {
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                C0737b c0737b3 = c0750h.f6981i;
                C0749g c0749g3 = new C0749g(ref$ObjectRef3, e83Var, this.f6762e, iArr);
                this.f6759b = null;
                this.f6758a = 3;
            }
            return coroutineSingletons;
        }
        if (i == 2) {
            e83Var = (e83) this.f6759b;
            AbstractC3193b.m15359b(obj);
            j = 1;
            try {
                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                C0737b c0737b4 = c0750h.f6981i;
                C0749g c0749g4 = new C0749g(ref$ObjectRef4, e83Var, this.f6762e, iArr);
                this.f6759b = null;
                this.f6758a = 3;
            } catch (Throwable th3) {
                th = th3;
                np6Var = c0750h.f6980h;
                np6Var.getClass();
                iArr.getClass();
                ReentrantLock reentrantLock2 = np6Var.f53097a;
                reentrantLock2.lock();
                z = false;
                for (int i3 : iArr) {
                    long[] jArr2 = np6Var.f53098b;
                    j2 = jArr2[i3];
                    jArr2[i3] = j2 - j;
                    if (j2 == j) {
                        np6Var.f53100d = true;
                        z = true;
                    }
                }
                if (!z) {
                    boolean z4 = np6Var.f53102f;
                }
                throw th;
            }
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                AbstractC3193b.m15359b(obj);
                j = 1;
            } catch (Throwable th4) {
                th = th4;
                j = 1;
                np6Var = c0750h.f6980h;
                np6Var.getClass();
                iArr.getClass();
                ReentrantLock reentrantLock3 = np6Var.f53097a;
                reentrantLock3.lock();
                try {
                    z = false;
                    while (i < r4) {
                        long[] jArr3 = np6Var.f53098b;
                        j2 = jArr3[i3];
                        jArr3[i3] = j2 - j;
                        if (j2 == j) {
                            np6Var.f53100d = true;
                            z = true;
                        }
                    }
                    if (!z && !np6Var.f53100d) {
                        boolean z5 = np6Var.f53102f;
                    }
                    throw th;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        }
        throw new KotlinNothingValueException();
    }
}
