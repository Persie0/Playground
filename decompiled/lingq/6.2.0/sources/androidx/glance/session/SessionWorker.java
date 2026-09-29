package androidx.glance.session;

import android.content.Context;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.dp5;
import p000.e1a;
import p000.fg2;
import p000.iz8;
import p000.jad;
import p000.jz8;
import p000.ng5;
import p000.nn1;
import p000.og5;
import p000.ph2;
import p000.sz1;
import p000.v72;
import p000.wfb;
import p000.wl6;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final WorkerParameters f6158g;

    /* JADX INFO: renamed from: h */
    public final iz8 f6159h;

    /* JADX INFO: renamed from: i */
    public final e1a f6160i;

    /* JADX INFO: renamed from: j */
    public final nn1 f6161j;

    /* JADX INFO: renamed from: k */
    public final String f6162k;

    public SessionWorker(Context context, WorkerParameters workerParameters, iz8 iz8Var, e1a e1aVar, nn1 nn1Var) {
        super(context, workerParameters);
        this.f6158g = workerParameters;
        this.f6159h = iz8Var;
        this.f6160i = e1aVar;
        this.f6161j = nn1Var;
        sz1 sz1Var = this.f56132b.f7166b;
        iz8Var.getClass();
        String strM21787e = sz1Var.m21787e("KEY");
        if (strM21787e != null) {
            this.f6162k = strM21787e;
        } else {
            C3386nv.m17633t("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #0 {all -> 0x004b, blocks: (B:41:0x00af, B:44:0x00c7, B:52:0x00e6, B:55:0x00ff, B:15:0x0046, B:22:0x005c), top: B:71:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[Catch: all -> 0x004b, PHI: r2 r6 r10
      0x00ff: PHI (r2v11 int) = (r2v9 int), (r2v12 int) binds: [B:15:0x0046, B:53:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r6v6 androidx.glance.session.d) = (r6v4 androidx.glance.session.d), (r6v9 androidx.glance.session.d) binds: [B:15:0x0046, B:53:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r10v15 java.lang.Object) = (r10v2 java.lang.Object), (r10v20 java.lang.Object) binds: [B:15:0x0046, B:53:0x00fc] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:41:0x00af, B:44:0x00c7, B:52:0x00e6, B:55:0x00ff, B:15:0x0046, B:22:0x005c), top: B:71:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r10 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (p000.wfb.m23905G(r8, r7, r0) == r1) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a8 -> B:38:0x00a9). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        SessionWorker$doWork$1 sessionWorker$doWork$1;
        Throwable th;
        AbstractC0696d abstractC0696d;
        int i;
        AbstractC0696d abstractC0696d2;
        og5 og5Var;
        wl6 wl6Var;
        SessionWorker$doWork$3 sessionWorker$doWork$3;
        if (continuation instanceof SessionWorker$doWork$1) {
            sessionWorker$doWork$1 = (SessionWorker$doWork$1) continuation;
            int i2 = sessionWorker$doWork$1.f6167e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionWorker$doWork$1.f6167e = i2 - Integer.MIN_VALUE;
            } else {
                sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object objM2497b = sessionWorker$doWork$1.f6165c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = sessionWorker$doWork$1.f6167e;
        iz8 iz8Var = this.f6159h;
        try {
            switch (i3) {
                case 0:
                    AbstractC3193b.m15359b(objM2497b);
                    SessionWorker$doWork$session$1 sessionWorker$doWork$session$1 = new SessionWorker$doWork$session$1(this, null);
                    sessionWorker$doWork$1.f6167e = 1;
                    C0698f c0698f = (C0698f) iz8Var;
                    c0698f.getClass();
                    objM2497b = C0698f.m2497b(c0698f, sessionWorker$doWork$session$1, sessionWorker$doWork$1);
                    break;
                case 1:
                    AbstractC3193b.m15359b(objM2497b);
                    abstractC0696d = (AbstractC0696d) objM2497b;
                    if (abstractC0696d == null) {
                        int i4 = this.f6158g.f7167c;
                        String str = this.f6162k;
                        if (i4 == 0) {
                            C3386nv.m17632s(str, "No session available for key ");
                            return null;
                        }
                        Log.w("GlanceSessionWorker", "SessionWorker attempted restart but Session is not available for " + str);
                        return og5.m17981a();
                    }
                    i = 0;
                    abstractC0696d2 = abstractC0696d;
                    if (abstractC0696d2 != null || i >= 3) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                        sz1 sz1Var = new sz1(linkedHashMap);
                        jad.m14369d(sz1Var);
                        return new ng5(sz1Var);
                    }
                    i++;
                    fg2 fg2Var = this.f6160i.f36581d;
                    SessionWorker$doWork$result$1 sessionWorker$doWork$result$1 = new SessionWorker$doWork$result$1(this, abstractC0696d2, null);
                    sessionWorker$doWork$1.f6164b = abstractC0696d2;
                    sessionWorker$doWork$1.f6163a = i;
                    sessionWorker$doWork$1.f6167e = 2;
                    objM2497b = AbstractC0693a.m2491c(fg2Var, sessionWorker$doWork$result$1, sessionWorker$doWork$1);
                    if (objM2497b != coroutineSingletons) {
                        og5Var = (og5) objM2497b;
                        if (og5Var != null) {
                            if (abstractC0696d2.f6263c.get()) {
                                wl6Var = wl6.f67013b;
                                sessionWorker$doWork$3 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
                                sessionWorker$doWork$1.f6164b = og5Var;
                                sessionWorker$doWork$1.f6167e = 3;
                                if (wfb.m23905G(sessionWorker$doWork$3, wl6Var, sessionWorker$doWork$1) == coroutineSingletons) {
                                }
                            }
                            return og5Var;
                        }
                        SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(abstractC0696d2, null);
                        sessionWorker$doWork$1.f6164b = abstractC0696d2;
                        sessionWorker$doWork$1.f6163a = i;
                        sessionWorker$doWork$1.f6167e = 4;
                        C0698f c0698f2 = (C0698f) iz8Var;
                        c0698f2.getClass();
                        objM2497b = C0698f.m2497b(c0698f2, sessionWorker$doWork$2, sessionWorker$doWork$1);
                        if (objM2497b == coroutineSingletons) {
                            abstractC0696d = (AbstractC0696d) objM2497b;
                            if (abstractC0696d2.f6263c.get()) {
                                wl6 wl6Var2 = wl6.f67013b;
                                SessionWorker$doWork$3 sessionWorker$doWork$4 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
                                sessionWorker$doWork$1.f6164b = abstractC0696d;
                                sessionWorker$doWork$1.f6163a = i;
                                sessionWorker$doWork$1.f6167e = 5;
                                break;
                            }
                            abstractC0696d2 = abstractC0696d;
                            if (abstractC0696d2 != null) {
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                            sz1 sz1Var2 = new sz1(linkedHashMap2);
                            jad.m14369d(sz1Var2);
                            return new ng5(sz1Var2);
                        }
                    }
                    return coroutineSingletons;
                    throw th;
                case 2:
                    i = sessionWorker$doWork$1.f6163a;
                    abstractC0696d2 = (AbstractC0696d) sessionWorker$doWork$1.f6164b;
                    AbstractC3193b.m15359b(objM2497b);
                    og5Var = (og5) objM2497b;
                    if (og5Var != null) {
                        if (abstractC0696d2.f6263c.get()) {
                            wl6Var = wl6.f67013b;
                            sessionWorker$doWork$3 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
                            sessionWorker$doWork$1.f6164b = og5Var;
                            sessionWorker$doWork$1.f6167e = 3;
                            if (wfb.m23905G(sessionWorker$doWork$3, wl6Var, sessionWorker$doWork$1) == coroutineSingletons) {
                            }
                        }
                        return og5Var;
                    }
                    SessionWorker$doWork$2 sessionWorker$doWork$5 = new SessionWorker$doWork$2(abstractC0696d2, null);
                    sessionWorker$doWork$1.f6164b = abstractC0696d2;
                    sessionWorker$doWork$1.f6163a = i;
                    sessionWorker$doWork$1.f6167e = 4;
                    C0698f c0698f3 = (C0698f) iz8Var;
                    c0698f3.getClass();
                    objM2497b = C0698f.m2497b(c0698f3, sessionWorker$doWork$5, sessionWorker$doWork$1);
                    if (objM2497b == coroutineSingletons) {
                        abstractC0696d = (AbstractC0696d) objM2497b;
                        if (abstractC0696d2.f6263c.get()) {
                            wl6 wl6Var3 = wl6.f67013b;
                            SessionWorker$doWork$3 sessionWorker$doWork$6 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
                            sessionWorker$doWork$1.f6164b = abstractC0696d;
                            sessionWorker$doWork$1.f6163a = i;
                            sessionWorker$doWork$1.f6167e = 5;
                            break;
                        }
                        abstractC0696d2 = abstractC0696d;
                        if (abstractC0696d2 != null) {
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                        sz1 sz1Var3 = new sz1(linkedHashMap3);
                        jad.m14369d(sz1Var3);
                        return new ng5(sz1Var3);
                    }
                    return coroutineSingletons;
                case 3:
                    og5 og5Var2 = (og5) sessionWorker$doWork$1.f6164b;
                    AbstractC3193b.m15359b(objM2497b);
                    return og5Var2;
                case 4:
                    i = sessionWorker$doWork$1.f6163a;
                    abstractC0696d2 = (AbstractC0696d) sessionWorker$doWork$1.f6164b;
                    AbstractC3193b.m15359b(objM2497b);
                    abstractC0696d = (AbstractC0696d) objM2497b;
                    if (abstractC0696d2.f6263c.get()) {
                        wl6 wl6Var4 = wl6.f67013b;
                        SessionWorker$doWork$3 sessionWorker$doWork$7 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
                        sessionWorker$doWork$1.f6164b = abstractC0696d;
                        sessionWorker$doWork$1.f6163a = i;
                        sessionWorker$doWork$1.f6167e = 5;
                        break;
                    }
                    abstractC0696d2 = abstractC0696d;
                    if (abstractC0696d2 != null) {
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                    sz1 sz1Var4 = new sz1(linkedHashMap4);
                    jad.m14369d(sz1Var4);
                    return new ng5(sz1Var4);
                case 5:
                    i = sessionWorker$doWork$1.f6163a;
                    abstractC0696d2 = (AbstractC0696d) sessionWorker$doWork$1.f6164b;
                    AbstractC3193b.m15359b(objM2497b);
                    if (abstractC0696d2 != null) {
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap5.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
                    sz1 sz1Var5 = new sz1(linkedHashMap5);
                    jad.m14369d(sz1Var5);
                    return new ng5(sz1Var5);
                case 6:
                    th = (Throwable) sessionWorker$doWork$1.f6164b;
                    AbstractC3193b.m15359b(objM2497b);
                    throw th;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th2) {
            if (!abstractC0696d2.f6263c.get()) {
                throw th2;
            }
            wl6 wl6Var5 = wl6.f67013b;
            SessionWorker$doWork$3 sessionWorker$doWork$8 = new SessionWorker$doWork$3(this, abstractC0696d2, null);
            sessionWorker$doWork$1.f6164b = th2;
            sessionWorker$doWork$1.f6167e = 6;
            if (wfb.m23905G(sessionWorker$doWork$8, wl6Var5, sessionWorker$doWork$1) != coroutineSingletons) {
                th = th2;
            }
            return coroutineSingletons;
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: e */
    public final nn1 mo2214e() {
        return this.f6161j;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, jz8.f46434a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, iz8 iz8Var, e1a e1aVar, nn1 nn1Var, int i, y52 y52Var) {
        iz8 iz8Var2 = (i & 4) != 0 ? jz8.f46434a : iz8Var;
        e1a e1aVar2 = (i & 8) != 0 ? new e1a() : e1aVar;
        if ((i & 16) != 0) {
            v72 v72Var = ph2.f56212a;
            nn1Var = dp5.f36000a;
        }
        this(context, workerParameters, iz8Var2, e1aVar2, nn1Var);
    }
}
