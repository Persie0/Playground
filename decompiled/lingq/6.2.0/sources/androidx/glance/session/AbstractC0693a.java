package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.C0281i;
import androidx.glance.appwidget.C0656d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3472pt;
import p000.cd4;
import p000.cg7;
import p000.cn2;
import p000.e1a;
import p000.fg2;
import p000.jf1;
import p000.ks8;
import p000.nj0;
import p000.pf1;
import p000.pg9;
import p000.sd4;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.w58;
import p000.w84;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.session.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0693a {
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.glance.session.g] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [jf1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.glance.session.d] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.i] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.glance.session.d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [cd4] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [w84] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: a */
    public static final Object m2489a(C0701i c0701i, Context context, AbstractC0696d abstractC0696d, e1a e1aVar, ks8 ks8Var, ContinuationImpl continuationImpl) throws Throwable {
        SessionWorkerKt$runSession$1 sessionWorkerKt$runSession$1;
        ?? r4;
        pg9 pg9Var;
        final w84 w84Var;
        Context context2;
        C0281i c0281i;
        final e1a e1aVar2;
        final ?? r2;
        final C0701i c0701i2;
        C0281i c0281i2;
        cd4 cd4Var;
        w84 w84Var2;
        jf1 jf1Var;
        pf1 pf1Var;
        pf1 pf1Var2;
        int i;
        ?? r3 = context;
        ?? r5 = abstractC0696d;
        if (continuationImpl instanceof SessionWorkerKt$runSession$1) {
            sessionWorkerKt$runSession$1 = (SessionWorkerKt$runSession$1) continuationImpl;
            i = sessionWorkerKt$runSession$1.f6198j;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                sessionWorkerKt$runSession$1.f6198j = i2;
                r4 = i2;
            } else {
                sessionWorkerKt$runSession$1 = new SessionWorkerKt$runSession$1(continuationImpl);
                r4 = i;
            }
        } else {
            sessionWorkerKt$runSession$1 = new SessionWorkerKt$runSession$1(continuationImpl);
            r4 = i;
        }
        SessionWorkerKt$runSession$1 sessionWorkerKt$runSession$2 = sessionWorkerKt$runSession$1;
        Object obj = sessionWorkerKt$runSession$2.f6197i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = sessionWorkerKt$runSession$2.f6198j;
        try {
            if (r1 != 0) {
                try {
                    if (r1 == 1) {
                        pf1 pf1Var3 = sessionWorkerKt$runSession$2.f6196h;
                        C0281i c0281i3 = sessionWorkerKt$runSession$2.f6195g;
                        pg9 pg9Var2 = sessionWorkerKt$runSession$2.f6194f;
                        w84 w84Var3 = sessionWorkerKt$runSession$2.f6193e;
                        e1a e1aVar3 = (e1a) sessionWorkerKt$runSession$2.f6192d;
                        AbstractC0696d abstractC0696d2 = (AbstractC0696d) sessionWorkerKt$runSession$2.f6191c;
                        Context context3 = (Context) sessionWorkerKt$runSession$2.f6190b;
                        C0701i c0701i3 = (C0701i) sessionWorkerKt$runSession$2.f6189a;
                        AbstractC3193b.m15359b(obj);
                        pg9Var = pg9Var2;
                        w84Var = w84Var3;
                        context2 = context3;
                        c0281i = c0281i3;
                        e1aVar2 = e1aVar3;
                        r2 = abstractC0696d2;
                        c0701i2 = c0701i3;
                        pf1Var = pf1Var3;
                    } else {
                        if (r1 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jf1 jf1Var2 = (jf1) sessionWorkerKt$runSession$2.f6192d;
                        c0281i2 = (C0281i) sessionWorkerKt$runSession$2.f6191c;
                        cd4Var = (cd4) sessionWorkerKt$runSession$2.f6190b;
                        w84Var2 = (w84) sessionWorkerKt$runSession$2.f6189a;
                        AbstractC3193b.m15359b(obj);
                        jf1Var = jf1Var2;
                    }
                    jf1Var.mo1823a();
                    w84Var2.m23812d();
                    cd4Var.mo4537a(null);
                    c0281i2.m1283x();
                    return xfa.f68157a;
                } catch (Throwable th) {
                    th = th;
                    r1.mo1823a();
                    r4.m23812d();
                    r3.mo4537a(null);
                    r5.m1283x();
                    throw th;
                }
            }
            AbstractC3193b.m15359b(obj);
            w84Var = new w84(c0701i);
            pg9 pg9VarM23926u = wfb.m23926u(c0701i, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(2, null), 3);
            un1 un1Var = c0701i.f6278a;
            ((C0656d) r5).getClass();
            w58 w58Var = new w58(50);
            C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.FALSE);
            C0700h c0700h = new C0700h(c0701i, r5, r3);
            ks8Var.getClass();
            sd4 sd4VarM15434a = AbstractC3208a.m15434a();
            cd4 cd4Var2 = (cd4) un1Var.mo1309x().get(nj0.f52795N);
            if (cd4Var2 != null) {
                cd4Var2.mo4540r(new cg7(sd4VarM15434a, 18));
            }
            C0281i c0281i4 = new C0281i(un1Var.mo1309x().plus(sd4VarM15434a).plus(c0700h));
            pf1 pf1Var4 = new pf1(c0281i4, new C3472pt(w58Var));
            try {
                try {
                    SessionWorkerKt$runSession$3 sessionWorkerKt$runSession$3 = new SessionWorkerKt$runSession$3(pf1Var4, r5, r3, c0281i4, c0701i, null);
                    pf1Var2 = pf1Var4;
                    c0281i4 = c0281i4;
                    try {
                        wfb.m23926u(c0701i, w84Var, null, sessionWorkerKt$runSession$3, 2);
                        AbstractC0696d abstractC0696d3 = abstractC0696d;
                        pg9Var = pg9VarM23926u;
                        try {
                            context2 = context;
                            c0701i2 = c0701i;
                            wfb.m23926u(c0701i2, null, null, new SessionWorkerKt$runSession$4(c0281i4, abstractC0696d3, c3244lM17114d, context, w58Var, c0701i, e1aVar, null), 3);
                            SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, null);
                            sessionWorkerKt$runSession$2.f6189a = c0701i2;
                            sessionWorkerKt$runSession$2.f6190b = context2;
                            sessionWorkerKt$runSession$2.f6191c = abstractC0696d3;
                            e1aVar2 = e1aVar;
                            sessionWorkerKt$runSession$2.f6192d = e1aVar2;
                            sessionWorkerKt$runSession$2.f6193e = w84Var;
                            sessionWorkerKt$runSession$2.f6194f = pg9Var;
                            sessionWorkerKt$runSession$2.f6195g = c0281i4;
                            sessionWorkerKt$runSession$2.f6196h = pf1Var2;
                            sessionWorkerKt$runSession$2.f6198j = 1;
                            if (AbstractC3224d.m15540s(c3244lM17114d, sessionWorkerKt$runSession$5, sessionWorkerKt$runSession$2) != coroutineSingletons) {
                                c0281i = c0281i4;
                                pf1Var = pf1Var2;
                                r2 = abstractC0696d3;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            r5 = c0281i4;
                            r1 = pf1Var2;
                            r4 = w84Var;
                            r3 = pg9Var;
                            r1.mo1823a();
                            r4.m23812d();
                            r3.mo4537a(null);
                            r5.m1283x();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        pg9Var = pg9VarM23926u;
                        r5 = c0281i4;
                        r1 = pf1Var2;
                        r4 = w84Var;
                        r3 = pg9Var;
                        r1.mo1823a();
                        r4.m23812d();
                        r3.mo4537a(null);
                        r5.m1283x();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    pf1Var2 = pf1Var4;
                    c0281i4 = c0281i4;
                }
            } catch (Throwable th5) {
                th = th5;
                pf1Var2 = pf1Var4;
            }
            ?? r0 = new vi3(e1aVar2, r2, w84Var) { // from class: androidx.glance.session.g

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e1a f6273b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ w84 f6274c;

                {
                    this.f6274c = w84Var;
                }

                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    C0701i c0701i4 = this.f6272a;
                    long jM2499a = c0701i4.m2499a();
                    e1a e1aVar4 = this.f6273b;
                    if (cn2.m4885c(jM2499a, e1aVar4.f36579b) < 0) {
                        long j = e1aVar4.f36579b;
                        AtomicReference atomicReference = c0701i4.f6279b;
                        while (true) {
                            Object obj3 = atomicReference.get();
                            Long l = (Long) obj3;
                            if (l == null) {
                                C3386nv.m17633t("Start the timer with startTimer before calling addTime");
                                return null;
                            }
                            if (j <= 0) {
                                C3386nv.m17626m("Cannot call addTime with a negative duration");
                                return null;
                            }
                            Long lValueOf = Long.valueOf(cn2.m4886d(j) + l.longValue());
                            do {
                                if (atomicReference.compareAndSet(obj3, lValueOf)) {
                                }
                            } while (atomicReference.get() == obj3);
                        }
                    }
                    wfb.m23926u(c0701i4, null, null, new SessionWorkerKt$runSession$6$1(this.f6274c, null), 3);
                    return xfa.f68157a;
                }
            };
            sessionWorkerKt$runSession$2.f6189a = w84Var;
            sessionWorkerKt$runSession$2.f6190b = pg9Var;
            sessionWorkerKt$runSession$2.f6191c = c0281i;
            sessionWorkerKt$runSession$2.f6192d = pf1Var;
            sessionWorkerKt$runSession$2.f6193e = null;
            sessionWorkerKt$runSession$2.f6194f = null;
            sessionWorkerKt$runSession$2.f6195g = null;
            sessionWorkerKt$runSession$2.f6196h = null;
            sessionWorkerKt$runSession$2.f6198j = 2;
            if (r2.m2492a(context2, r0, sessionWorkerKt$runSession$2) != coroutineSingletons) {
                c0281i2 = c0281i;
                w84Var2 = w84Var;
                cd4Var = pg9Var;
                jf1Var = pf1Var;
                jf1Var.mo1823a();
                w84Var2.m23812d();
                cd4Var.mo4537a(null);
                c0281i2.m1283x();
                return xfa.f68157a;
            }
            return coroutineSingletons;
        } catch (Throwable th6) {
            th = th6;
            r5 = c0281i;
            r1 = pf1Var;
            r4 = w84Var;
            r3 = pg9Var;
            r1.mo1823a();
            r4.m23812d();
            r3.mo4537a(null);
            r5.m1283x();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008f, B:37:0x009f, B:24:0x006b, B:39:0x00a2, B:41:0x00a7, B:42:0x00a8, B:23:0x0065, B:31:0x0090, B:33:0x0096), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {, blocks: (B:31:0x0090, B:33:0x0096), top: B:61:0x0090, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007c, B:29:0x0084, B:30:0x008f, B:37:0x009f, B:24:0x006b, B:39:0x00a2, B:41:0x00a7, B:42:0x00a8, B:23:0x0065, B:31:0x0090, B:33:0x0096), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x0096, B:36:0x009e], limit reached: 61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m2490b(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = (androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1) r0
            int r1 = r0.f6120f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6120f = r1
            goto L18
        L13:
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = new androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6119e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f6120f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            ej0 r2 = r0.f6118d
            cu0 r6 = r0.f6117c
            pp6 r7 = r0.f6116b
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f6115a
            kotlin.AbstractC3193b.m15359b(r10)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L31:
            r10 = move-exception
            goto Lb4
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r10)
            return r4
        L3a:
            kotlin.AbstractC3193b.m15359b(r10)
            r10 = 6
            kotlinx.coroutines.channels.a r6 = p000.do7.m10525a(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            ke2 r2 = new ke2
            r7 = 4
            r2.<init>(r7, r10, r6)
            java.lang.Object r7 = p000.nc9.f52602c
            monitor-enter(r7)
            java.util.List r8 = p000.nc9.f52608i     // Catch: java.lang.Throwable -> Lbe
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r8 = p000.u91.m22604V0(r8, r2)     // Catch: java.lang.Throwable -> Lbe
            p000.nc9.f52608i = r8     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r7)
            p000.nc9.m17349a()
            q7 r7 = new q7
            r8 = 20
            r7.<init>(r2, r8)
            ej0 r2 = new ej0     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L6b:
            r0.f6115a = r8     // Catch: java.lang.Throwable -> L31
            r0.f6116b = r7     // Catch: java.lang.Throwable -> L31
            r0.f6117c = r6     // Catch: java.lang.Throwable -> L31
            r0.f6118d = r2     // Catch: java.lang.Throwable -> L31
            r0.f6120f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.m11164b(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7c
            return r1
        L7c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La9
            java.lang.Object r10 = r2.m11165c()     // Catch: java.lang.Throwable -> L31
            xfa r10 = (p000.xfa) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = p000.nc9.f52602c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            yn3 r9 = p000.nc9.f52609j     // Catch: java.lang.Throwable -> La6
            o66 r9 = r9.f60422h     // Catch: java.lang.Throwable -> La6
            if (r9 == 0) goto L9e
            boolean r9 = r9.m725c()     // Catch: java.lang.Throwable -> La6
            if (r9 != r5) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r3
        L9f:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6b
            p000.nc9.m17349a()     // Catch: java.lang.Throwable -> L31
            goto L6b
        La6:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La9:
            r6.mo4537a(r4)     // Catch: java.lang.Throwable -> Lb2
            r7.mo19438a()
            xfa r10 = p000.xfa.f68157a
            return r10
        Lb2:
            r10 = move-exception
            goto Lba
        Lb4:
            throw r10     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            kotlinx.coroutines.channels.AbstractC3212b.m15485b(r6, r10)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lba:
            r7.mo19438a()
            throw r10
        Lbe:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.AbstractC0693a.m2490b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m2491c(fg2 fg2Var, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        TimerScopeKt$withTimerOrNull$1 timerScopeKt$withTimerOrNull$1;
        if (continuationImpl instanceof TimerScopeKt$withTimerOrNull$1) {
            timerScopeKt$withTimerOrNull$1 = (TimerScopeKt$withTimerOrNull$1) continuationImpl;
            int i = timerScopeKt$withTimerOrNull$1.f6254c;
            if ((i & Integer.MIN_VALUE) != 0) {
                timerScopeKt$withTimerOrNull$1.f6254c = i - Integer.MIN_VALUE;
            } else {
                timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(continuationImpl);
            }
        } else {
            timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(continuationImpl);
        }
        Object obj = timerScopeKt$withTimerOrNull$1.f6253b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timerScopeKt$withTimerOrNull$1.f6254c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                timerScopeKt$withTimerOrNull$1.f6252a = zi3Var;
                timerScopeKt$withTimerOrNull$1.f6254c = 1;
                Object objM23649s = vz1.m23649s(new TimerScopeKt$withTimer$2(zi3Var, fg2Var, null), timerScopeKt$withTimerOrNull$1);
                return objM23649s == coroutineSingletons ? coroutineSingletons : objM23649s;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            return obj;
        } catch (TimeoutCancellationException e) {
            if (e.f6236b == zi3Var.hashCode()) {
                return null;
            }
            throw e;
        }
    }
}
