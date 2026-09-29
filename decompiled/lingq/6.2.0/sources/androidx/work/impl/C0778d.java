package androidx.work.impl;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3393o1;
import p000.C2967ek;
import p000.C3386nv;
import p000.a64;
import p000.bna;
import p000.c9b;
import p000.cd4;
import p000.d9b;
import p000.e8b;
import p000.e9b;
import p000.f9b;
import p000.gr7;
import p000.h9b;
import p000.hh1;
import p000.hi8;
import p000.hz4;
import p000.il7;
import p000.in1;
import p000.iy5;
import p000.lg5;
import p000.nj0;
import p000.nn1;
import p000.og5;
import p000.oj5;
import p000.p8b;
import p000.pg5;
import p000.qn2;
import p000.r3a;
import p000.rb2;
import p000.rk8;
import p000.sd4;
import p000.sz1;
import p000.u8b;
import p000.u91;
import p000.ux5;
import p000.vz1;
import p000.wfb;
import p000.xca;
import p000.z7b;

/* JADX INFO: renamed from: androidx.work.impl.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0778d {

    /* JADX INFO: renamed from: a */
    public final p8b f7240a;

    /* JADX INFO: renamed from: b */
    public final Context f7241b;

    /* JADX INFO: renamed from: c */
    public final String f7242c;

    /* JADX INFO: renamed from: d */
    public final e8b f7243d;

    /* JADX INFO: renamed from: e */
    public final hh1 f7244e;

    /* JADX INFO: renamed from: f */
    public final gr7 f7245f;

    /* JADX INFO: renamed from: g */
    public final il7 f7246g;

    /* JADX INFO: renamed from: h */
    public final WorkDatabase f7247h;

    /* JADX INFO: renamed from: i */
    public final u8b f7248i;

    /* JADX INFO: renamed from: j */
    public final rb2 f7249j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f7250k;

    /* JADX INFO: renamed from: l */
    public final String f7251l;

    /* JADX INFO: renamed from: m */
    public final sd4 f7252m;

    public C0778d(qn2 qn2Var) {
        p8b p8bVar = (p8b) qn2Var.f57966e;
        this.f7240a = p8bVar;
        this.f7241b = (Context) qn2Var.f57968g;
        String str = p8bVar.f55772a;
        this.f7242c = str;
        this.f7243d = (e8b) qn2Var.f57963b;
        hh1 hh1Var = (hh1) qn2Var.f57962a;
        this.f7244e = hh1Var;
        this.f7245f = hh1Var.f42350d;
        this.f7246g = (il7) qn2Var.f57964c;
        WorkDatabase workDatabase = (WorkDatabase) qn2Var.f57965d;
        this.f7247h = workDatabase;
        this.f7248i = workDatabase.mo2909z();
        this.f7249j = workDatabase.mo2904u();
        ArrayList arrayList = (ArrayList) qn2Var.f57967f;
        this.f7250k = arrayList;
        this.f7251l = AbstractC3393o1.m17738m(AbstractC3393o1.m17742q("Work [ id=", str, ", tags={ "), u91.m22596N0(arrayList, ",", null, null, null, 62), " } ]");
        this.f7252m = AbstractC3208a.m15434a();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0224  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: a */
    public static final Object m2925a(C0778d c0778d, ContinuationImpl continuationImpl) throws Throwable {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        int i;
        OverwritingInputMerger overwritingInputMerger;
        sz1 sz1VarM13282k;
        String str;
        Throwable th;
        String str2;
        CancellationException e;
        String str3;
        oj5 oj5VarM18040f;
        String strM22990m;
        String str4 = c0778d.f7251l;
        e8b e8bVar = c0778d.f7243d;
        String str5 = c0778d.f7242c;
        WorkDatabase workDatabase = c0778d.f7247h;
        hh1 hh1Var = c0778d.f7244e;
        iy5 iy5Var = hh1Var.f42359m;
        p8b p8bVar = c0778d.f7240a;
        if (continuationImpl instanceof WorkerWrapper$runWorker$1) {
            workerWrapper$runWorker$1 = (WorkerWrapper$runWorker$1) continuationImpl;
            int i2 = workerWrapper$runWorker$1.f7193c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                workerWrapper$runWorker$1.f7193c = i2 - Integer.MIN_VALUE;
            } else {
                workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(c0778d, continuationImpl);
            }
        } else {
            workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(c0778d, continuationImpl);
        }
        Object objM23905G = workerWrapper$runWorker$1.f7191a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = workerWrapper$runWorker$1.f7193c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM23905G);
            iy5Var.getClass();
            boolean zIsEnabled = Trace.isEnabled();
            String str6 = p8bVar.f55795x;
            String str7 = p8bVar.f55774c;
            String str8 = p8bVar.f55775d;
            if (!zIsEnabled || str6 == null) {
                i = 0;
            } else {
                int iHashCode = p8bVar.hashCode();
                String strSubstring = str6.length() <= 127 ? str6 : null;
                i = 0;
                if (strSubstring == null) {
                    strSubstring = str6.substring(0, 127);
                }
                Trace.beginAsyncSection(strSubstring, iHashCode);
            }
            if (((Boolean) workDatabase.m2845r(new hz4(new c9b(c0778d, i), 28))).booleanValue()) {
                return new f9b();
            }
            if (p8bVar.m18988k()) {
                sz1VarM13282k = p8bVar.f55776e;
            } else {
                hh1Var.f42352f.getClass();
                str8.getClass();
                String str9 = a64.f281a;
                try {
                    Object objNewInstance = Class.forName(str8).getDeclaredConstructor(null).newInstance(null);
                    objNewInstance.getClass();
                    overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                } catch (Exception e2) {
                    oj5.m18040f().m18044e(a64.f281a, "Trouble instantiating ".concat(str8), e2);
                    overwritingInputMerger = null;
                }
                if (overwritingInputMerger == null) {
                    oj5.m18040f().m18043c(h9b.f42060a, "Could not create Input Merger ".concat(str8));
                    return new d9b();
                }
                List listM23604J = vz1.m23604J(p8bVar.f55776e);
                u8b u8bVar = c0778d.f7248i;
                u8bVar.getClass();
                str5.getClass();
                ArrayList arrayListM22603U0 = u91.m22603U0((List) AbstractC0758a.m2859b(u8bVar.f63598a, true, false, new xca(str5, 14)), listM23604J);
                hi8 hi8Var = new hi8(10);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayListM22603U0.iterator();
                while (it.hasNext()) {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(((sz1) it.next()).f61646a);
                    mapUnmodifiableMap.getClass();
                    linkedHashMap.putAll(mapUnmodifiableMap);
                }
                hi8Var.m13288y(linkedHashMap);
                sz1VarM13282k = hi8Var.m13282k();
            }
            UUID uuidFromString = UUID.fromString(str5);
            ArrayList arrayList = c0778d.f7250k;
            int i4 = p8bVar.f55782k;
            Executor executor = hh1Var.f42347a;
            nn1 nn1Var = hh1Var.f42348b;
            str = str4;
            z7b z7bVar = new z7b(workDatabase, c0778d.f7246g, e8bVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f7165a = uuidFromString;
            workerParameters.f7166b = sz1VarM13282k;
            new HashSet(arrayList);
            workerParameters.f7167c = i4;
            workerParameters.f7168d = executor;
            workerParameters.f7169e = nn1Var;
            try {
                pg5 pg5VarM16163b = hh1Var.f42351e.m16163b(c0778d.f7241b, str7, workerParameters);
                pg5VarM16163b.f56134d = true;
                in1 in1Var = workerWrapper$runWorker$1.getContext().get(nj0.f52795N);
                in1Var.getClass();
                cd4 cd4Var = (cd4) in1Var;
                cd4Var.mo4540r(new C2967ek(2, pg5VarM16163b, str6, c0778d, zIsEnabled));
                Object objM2845r = workDatabase.m2845r(new hz4(new c9b(c0778d, 1), 28));
                objM2845r.getClass();
                if (((Boolean) objM2845r).booleanValue() && !cd4Var.isCancelled()) {
                    rk8 rk8Var = e8bVar.f36850d;
                    rk8Var.getClass();
                    nn1 nn1VarM3926O = bna.m3926O(rk8Var);
                    try {
                        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(c0778d, pg5VarM16163b, z7bVar, null);
                        workerWrapper$runWorker$1.f7193c = 1;
                        objM23905G = wfb.m23905G(workerWrapper$runWorker$result$1, nn1VarM3926O, workerWrapper$runWorker$1);
                        if (objM23905G == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        str2 = str;
                        str3 = h9b.f42060a;
                        oj5VarM18040f = oj5.m18040f();
                        strM22990m = ux5.m22990m(str2, " was cancelled");
                        if (oj5VarM18040f.f54464a <= 4) {
                            Log.i(str3, strM22990m, e);
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        String str10 = h9b.f42060a;
                        oj5.m18040f().m18044e(str10, str + " failed because it threw an exception/error", th);
                        return new d9b();
                    }
                }
                return new f9b();
            } catch (Throwable unused) {
                String str11 = h9b.f42060a;
                oj5.m18040f().m18043c(str11, "Could not create Worker " + str7);
                return new d9b();
            }
        }
        if (i3 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            AbstractC3193b.m15359b(objM23905G);
            str = str4;
        } catch (CancellationException e4) {
            e = e4;
            str2 = str4;
            str3 = h9b.f42060a;
            oj5VarM18040f = oj5.m18040f();
            strM22990m = ux5.m22990m(str2, " was cancelled");
            if (oj5VarM18040f.f54464a <= 4) {
                Log.i(str3, strM22990m, e);
            }
            throw e;
        } catch (Throwable th3) {
            th = th3;
            str = str4;
            String str12 = h9b.f42060a;
            oj5.m18040f().m18044e(str12, str + " failed because it threw an exception/error", th);
            return new d9b();
        }
        og5 og5Var = (og5) objM23905G;
        og5Var.getClass();
        return new e9b(og5Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m2926b(int i) {
        this.f7252m.m15518y(new WorkerStoppedException(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m2927c(int i) {
        WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
        u8b u8bVar = this.f7248i;
        String str = this.f7242c;
        u8bVar.m22574j(workInfo$State, str);
        this.f7245f.getClass();
        u8bVar.m22573i(str, System.currentTimeMillis());
        u8bVar.m22572h(this.f7240a.f55793v, str);
        u8bVar.m22571g(str, -1L);
        u8bVar.m22575k(i, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m2928d() {
        this.f7245f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        u8b u8bVar = this.f7248i;
        String str = this.f7242c;
        u8bVar.m22573i(str, jCurrentTimeMillis);
        u8bVar.m22574j(WorkInfo$State.ENQUEUED, str);
        AbstractC0746d abstractC0746d = u8bVar.f63598a;
        ((Number) AbstractC0758a.m2859b(abstractC0746d, false, true, new xca(str, 12))).intValue();
        u8bVar.m22572h(this.f7240a.f55793v, str);
        AbstractC0758a.m2859b(abstractC0746d, false, true, new xca(str, 13));
        u8bVar.m22571g(str, -1L);
    }

    /* JADX INFO: renamed from: e */
    public final void m2929e(og5 og5Var) {
        og5Var.getClass();
        String str = this.f7242c;
        ArrayList arrayListM23608N = vz1.m23608N(str);
        while (true) {
            boolean zIsEmpty = arrayListM23608N.isEmpty();
            u8b u8bVar = this.f7248i;
            if (zIsEmpty) {
                sz1 sz1Var = ((lg5) og5Var).f49631a;
                sz1Var.getClass();
                u8bVar.m22572h(this.f7240a.f55793v, str);
                AbstractC0758a.m2859b(u8bVar.f63598a, false, true, new r3a(20, sz1Var, str));
                return;
            }
            String str2 = (String) u91.m22608Z0(arrayListM23608N);
            if (u8bVar.m22568d(str2) != WorkInfo$State.CANCELLED) {
                u8bVar.m22574j(WorkInfo$State.FAILED, str2);
            }
            arrayListM23608N.addAll(this.f7249j.m20569a(str2));
        }
    }
}
