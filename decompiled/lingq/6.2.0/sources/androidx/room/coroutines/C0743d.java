package androidx.room.coroutines;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC3193b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3249b;
import p000.AbstractC3695vr;
import p000.C0825bv;
import p000.C3386nv;
import p000.bk8;
import p000.ni1;
import p000.u91;
import p000.ui3;
import p000.vv8;
import p000.vz1;
import p000.wv8;

/* JADX INFO: renamed from: androidx.room.coroutines.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0743d {

    /* JADX INFO: renamed from: a */
    public final int f6941a;

    /* JADX INFO: renamed from: b */
    public final ui3 f6942b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f6943c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public int f6944d;

    /* JADX INFO: renamed from: e */
    public boolean f6945e;

    /* JADX INFO: renamed from: f */
    public final ni1[] f6946f;

    /* JADX INFO: renamed from: g */
    public final vv8 f6947g;

    /* JADX INFO: renamed from: h */
    public final C0825bv f6948h;

    public C0743d(int i, ui3 ui3Var) {
        this.f6941a = i;
        this.f6942b = ui3Var;
        this.f6946f = new ni1[i];
        int i2 = wv8.f67389a;
        this.f6947g = new vv8(i);
        this.f6948h = new C0825bv(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m2819a(ContinuationImpl continuationImpl) {
        Pool$acquire$1 pool$acquire$1;
        C0825bv c0825bv = this.f6948h;
        if (continuationImpl instanceof Pool$acquire$1) {
            pool$acquire$1 = (Pool$acquire$1) continuationImpl;
            int i = pool$acquire$1.f6885c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pool$acquire$1.f6885c = i - Integer.MIN_VALUE;
            } else {
                pool$acquire$1 = new Pool$acquire$1(this, continuationImpl);
            }
        } else {
            pool$acquire$1 = new Pool$acquire$1(this, continuationImpl);
        }
        Object obj = pool$acquire$1.f6883a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pool$acquire$1.f6885c;
        vv8 vv8Var = this.f6947g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            pool$acquire$1.f6885c = 1;
            if (vv8Var.m15598d(pool$acquire$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f6943c;
            reentrantLock.lock();
            try {
                if (this.f6945e) {
                    AbstractC3695vr.m23485C(21, "Connection pool is closed");
                    throw null;
                }
                if (c0825bv.isEmpty() && this.f6944d < this.f6941a) {
                    ni1 ni1Var = new ni1((bk8) this.f6942b.mo0a());
                    ni1[] ni1VarArr = this.f6946f;
                    int i3 = this.f6944d;
                    this.f6944d = i3 + 1;
                    ni1VarArr[i3] = ni1Var;
                    c0825bv.addLast(ni1Var);
                }
                ni1 ni1Var2 = (ni1) c0825bv.removeLast();
                reentrantLock.unlock();
                return ni1Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            vv8Var.m15600f();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003e, B:22:0x0055, B:27:0x006a, B:28:0x0071), top: B:50:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003e, B:22:0x0055, B:27:0x006a, B:28:0x0071), top: B:50:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:33:0x007e, B:35:0x0082, B:39:0x008a, B:43:0x0091), top: B:48:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:33:0x007e, B:35:0x0082, B:39:0x008a, B:43:0x0091), top: B:48:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:33:0x007e, B:35:0x0082, B:39:0x008a, B:43:0x0091), top: B:48:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x008e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m2820b(long r11, p000.ji1 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) r0
            int r1 = r0.f6891f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6891f = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f6889d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f6891f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r11 = r0.f6886a
            kotlin.jvm.internal.Ref$ObjectRef r13 = r0.f6888c
            ui3 r2 = r0.f6887b
            kotlin.AbstractC3193b.m15359b(r14)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r14 = move-exception
            goto L79
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r10)
            return r4
        L36:
            kotlin.AbstractC3193b.m15359b(r14)
        L39:
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L77
            r2.<init>(r14, r10, r4)     // Catch: java.lang.Throwable -> L77
            r0.f6887b = r13     // Catch: java.lang.Throwable -> L77
            r0.f6888c = r14     // Catch: java.lang.Throwable -> L77
            r0.f6886a = r11     // Catch: java.lang.Throwable -> L77
            r0.f6891f = r3     // Catch: java.lang.Throwable -> L77
            long r5 = kotlinx.coroutines.AbstractC3208a.m15446m(r11)     // Catch: java.lang.Throwable -> L77
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L6a
            d1a r7 = new d1a     // Catch: java.lang.Throwable -> L77
            r7.<init>(r5, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r2 = kotlinx.coroutines.AbstractC3208a.m15445l(r7, r2)     // Catch: java.lang.Throwable -> L77
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L77
            if (r2 != r1) goto L63
            return r1
        L63:
            r2 = r13
            r13 = r14
        L65:
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r4
            goto L7e
        L6a:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "Timed out immediately"
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L77
            throw r2     // Catch: java.lang.Throwable -> L77
        L72:
            r9 = r2
            r2 = r13
            r13 = r14
            r14 = r9
            goto L79
        L77:
            r2 = move-exception
            goto L72
        L79:
            r9 = r14
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r9
        L7e:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L88
            r13.mo0a()     // Catch: java.lang.Throwable -> L86
            goto L8f
        L86:
            r11 = move-exception
            goto L92
        L88:
            if (r0 != 0) goto L91
            java.lang.Object r14 = r14.f47718a     // Catch: java.lang.Throwable -> L86
            if (r14 == 0) goto L8f
            return r14
        L8f:
            r0 = r2
            goto L39
        L91:
            throw r0     // Catch: java.lang.Throwable -> L86
        L92:
            java.lang.Object r12 = r14.f47718a
            ni1 r12 = (p000.ni1) r12
            if (r12 == 0) goto L9b
            r10.m2823e(r12)
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.C0743d.m2820b(long, ji1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m2821c() {
        ReentrantLock reentrantLock = this.f6943c;
        reentrantLock.lock();
        try {
            this.f6945e = true;
            for (ni1 ni1Var : this.f6946f) {
                if (ni1Var != null) {
                    ni1Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2822d(StringBuilder sb) {
        C0825bv c0825bv = this.f6948h;
        ReentrantLock reentrantLock = this.f6943c;
        reentrantLock.lock();
        try {
            ListBuilder listBuilderM23650t = vz1.m23650t();
            int i = c0825bv.f9041c;
            for (int i2 = 0; i2 < i; i2++) {
                listBuilderM23650t.add(c0825bv.get(i2));
            }
            ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f6941a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            vv8 vv8Var = this.f6947g;
            vv8Var.getClass();
            sb2.append(Math.max(C3249b.f48183g.get(vv8Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + listBuilderM23635i.mo4182d() + ")[" + u91.m22596N0(listBuilderM23635i, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            ni1[] ni1VarArr = this.f6946f;
            int length = ni1VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                ni1 ni1Var = ni1VarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(ni1Var != null ? ni1Var.f52749a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (ni1Var != null) {
                    ni1Var.m17438e(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2823e(ni1 ni1Var) {
        ni1Var.getClass();
        ReentrantLock reentrantLock = this.f6943c;
        reentrantLock.lock();
        try {
            this.f6948h.addLast(ni1Var);
            reentrantLock.unlock();
            this.f6947g.m15600f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
