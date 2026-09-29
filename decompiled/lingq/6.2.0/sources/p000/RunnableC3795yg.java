package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.MotionEvent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0035b;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.iterable.iterableapi.C1210f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yg */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3795yg implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69802a;

    /* JADX INFO: renamed from: b */
    public final Object f69803b;

    public RunnableC3795yg(j0d j0dVar) {
        this.f69802a = 10;
        Objects.requireNonNull(j0dVar);
        this.f69803b = j0dVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m25122a() {
        sr9 sr9VarM3021b;
        long jNanoTime;
        sr9 sr9VarM3021b2;
        as9 as9Var = (as9) this.f69803b;
        synchronized (as9Var) {
            as9Var.f7439g++;
            sr9VarM3021b = as9Var.m3021b();
        }
        if (sr9VarM3021b == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(sr9VarM3021b.f61320a);
                Logger logger = ((as9) this.f69803b).f7434b;
                zr9 zr9Var = sr9VarM3021b.f61322c;
                zr9Var.getClass();
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    bna.m3948f(logger, sr9VarM3021b, zr9Var, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jMo10391a = sr9VarM3021b.mo10391a();
                    if (zIsLoggable) {
                        bna.m3948f(logger, sr9VarM3021b, zr9Var, "finished run in " + bna.m3925N(System.nanoTime() - jNanoTime));
                    }
                    as9 as9Var2 = (as9) this.f69803b;
                    synchronized (as9Var2) {
                        as9.m3020a(as9Var2, sr9VarM3021b, jMo10391a, true);
                        sr9VarM3021b2 = as9Var2.m3021b();
                    }
                    if (sr9VarM3021b2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    sr9VarM3021b = sr9VarM3021b2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        bna.m3948f(logger, sr9VarM3021b, zr9Var, "failed a run in " + bna.m3925N(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    as9 as9Var3 = (as9) this.f69803b;
                    synchronized (as9Var3) {
                        as9.m3020a(as9Var3, sr9VarM3021b, -1L, false);
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        threadCurrentThread.setName(name);
                        return;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x027f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        Object obj;
        C0035b c0035b;
        C3555s c3555sM9998b;
        boolean z = false;
        Object[] objArr = 0;
        int i2 = 1;
        switch (this.f69802a) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) this.f69803b;
                viewTreeObserverOnGlobalLayoutListenerC0391c.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i3 = 7;
                if (actionMasked == 7) {
                    i = i3;
                } else if (actionMasked != 8) {
                    if (actionMasked != 9) {
                        i3 = 2;
                    }
                    i = i3;
                } else {
                    i = 9;
                }
                viewTreeObserverOnGlobalLayoutListenerC0391c.m1740P(motionEvent, i, viewTreeObserverOnGlobalLayoutListenerC0391c.f4649H0, false);
                return;
            case 1:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) this.f69803b;
                if ((layoutInflaterFactory2C3804yp.f70226t0 & 1) != 0) {
                    layoutInflaterFactory2C3804yp.m25235u(0);
                }
                if ((layoutInflaterFactory2C3804yp.f70226t0 & 4096) != 0) {
                    layoutInflaterFactory2C3804yp.m25235u(108);
                }
                layoutInflaterFactory2C3804yp.f70225s0 = false;
                layoutInflaterFactory2C3804yp.f70226t0 = 0;
                return;
            case 2:
                AppStartTrace appStartTrace = (AppStartTrace) this.f69803b;
                if (appStartTrace.f13765i == null) {
                    appStartTrace.f13766j = new Timer();
                    return;
                }
                return;
            case 3:
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) this.f69803b;
                if (abstractComponentCallbacksC0635c.f5698g0 != null) {
                    abstractComponentCallbacksC0635c.m2104f().getClass();
                    return;
                }
                return;
            case 4:
                ((AbstractC0638f) this.f69803b).m2191z(true);
                return;
            case 5:
                bb4 bb4Var = (bb4) this.f69803b;
                bb4Var.f8273d = false;
                for (WeakReference weakReference : bb4Var.f8274e) {
                    if (weakReference.get() != null) {
                        ((ab4) weakReference.get()).mo231a();
                    }
                }
                return;
            case 6:
                synchronized (((C1210f) this.f69803b).f14021h) {
                    try {
                        Iterator it = ((C1210f) this.f69803b).f14021h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 7:
                synchronized (((w56) this.f69803b).f66417a) {
                    obj = ((w56) this.f69803b).f66422f;
                    ((w56) this.f69803b).f66422f = w56.f66416k;
                    break;
                }
                ((w56) this.f69803b).m23765i(obj);
                return;
            case 8:
                m25122a();
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.f69803b).f1168a;
                if (actionMenuView == null || (c0035b = actionMenuView.f1112O) == null) {
                    return;
                }
                c0035b.m714n();
                return;
            case 10:
                ((j0d) this.f69803b).f44868j = null;
                return;
            case 11:
                c6d c6dVar = (c6d) this.f69803b;
                s6d s6dVar = (s6d) c6dVar.f9649c.f57706b;
                s6dVar.mo12359D();
                kjc kjcVar = (kjc) s6dVar.f60774a;
                xcc xccVar = kjcVar.f47438f;
                Context context = kjcVar.f47433a;
                kjc.m15280l(xccVar);
                xccVar.f68075H.m17923a("Application going to the background");
                qfc qfcVar = kjcVar.f47437e;
                kjc.m15278j(qfcVar);
                qfcVar.f57718N.m22720b(true);
                s6dVar.mo12359D();
                s6dVar.f60440d = true;
                cmb cmbVar = kjcVar.f47436d;
                if (!cmbVar.m4873S()) {
                    long j = c6dVar.f9648b;
                    zoa zoaVar = s6dVar.f60442f;
                    zoaVar.m25732e(j, false, false);
                    ((dsc) zoaVar.f71910c).m25216c();
                }
                long j2 = c6dVar.f9647a;
                kjc.m15280l(xccVar);
                xccVar.f68086l.m17924b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                C1043b c1043b = kjcVar.f47414H;
                kjc.m15279k(c1043b);
                c1043b.mo12359D();
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                c1043b.m13744E();
                v4d v4dVarM15287o = kjcVar2.m15287o();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                if (v4dVarM15287o.m23110K()) {
                    rad radVar = ((kjc) v4dVarM15287o.f60774a).f47441i;
                    kjc.m15278j(radVar);
                    if (radVar.m20549n0() >= 242600) {
                        v4d v4dVarM15287o2 = kjcVar2.m15287o();
                        v4dVarM15287o2.mo12359D();
                        v4dVarM15287o2.m13744E();
                        v4dVarM15287o2.m23117R(new t1d(v4dVarM15287o2, v4dVarM15287o2.m23119T(true), i2));
                    }
                } else {
                    v4d v4dVarM15287o3 = kjcVar2.m15287o();
                    v4dVarM15287o3.mo12359D();
                    v4dVarM15287o3.m13744E();
                    v4dVarM15287o3.m23117R(new t1d(v4dVarM15287o3, v4dVarM15287o3.m23119T(true), i2));
                }
                if (cmbVar.m4869O(null, z8c.f71128N0)) {
                    rad radVar2 = kjcVar.f47441i;
                    kjc.m15278j(radVar2);
                    long jM4866L = radVar2.m20544h0(context.getPackageName(), cmbVar.f10288c) ? 1000L : cmbVar.m4866L(context.getPackageName(), z8c.f71109E);
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17924b(Long.valueOf(jM4866L), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    kjc.m15277i(kjcVar.f47422P);
                    kjcVar.f47422P.m18840H(jM4866L);
                    return;
                }
                return;
            case 12:
                C1045d c1045d = (C1045d) this.f69803b;
                c1045d.mo5913d().mo12359D();
                c1045d.f12371k = new ggc(c1045d);
                nnb nnbVar = new nnb(c1045d);
                nnbVar.m13145F();
                c1045d.f12360c = nnbVar;
                shc shcVar = c1045d.f12356a;
                cmb cmbVarM5916e0 = c1045d.m5916e0();
                lda.m16130p(shcVar);
                cmbVarM5916e0.f10289d = shcVar;
                c5d c5dVar = new c5d(c1045d);
                c5dVar.m13145F();
                c1045d.f12369i = c5dVar;
                mhb mhbVar = new mhb(c1045d);
                mhbVar.m13145F();
                c1045d.f12366f = mhbVar;
                ydc ydcVar = new ydc(c1045d, i2);
                ydcVar.m13145F();
                c1045d.f12368h = ydcVar;
                k7d k7dVar = new k7d(c1045d);
                k7dVar.m13145F();
                c1045d.f12364e = k7dVar;
                c1045d.f12362d = new qfb(c1045d);
                if (c1045d.f12342M != c1045d.f12343N) {
                    c1045d.mo5909b().f68080f.m17925c("Not all upload components initialized", Integer.valueOf(c1045d.f12342M), Integer.valueOf(c1045d.f12343N));
                }
                c1045d.f12337H.set(true);
                c1045d.mo5909b().f68076I.m17923a("UploadController is now fully initialized");
                c1045d.mo5913d().mo12359D();
                nnb nnbVar2 = c1045d.f12360c;
                C1045d.m5885T(nnbVar2);
                nnbVar2.m17528N();
                nnb nnbVar3 = c1045d.f12360c;
                C1045d.m5885T(nnbVar3);
                nnbVar3.mo12359D();
                nnbVar3.m13144E();
                if (nnbVar3.m17554o0()) {
                    t8c t8cVar = z8c.f71204u0;
                    if (((Long) t8cVar.m21901a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM17559u0 = nnbVar3.m17559u0();
                        kjc kjcVar3 = (kjc) nnbVar3.f60774a;
                        kjcVar3.f47443k.getClass();
                        int iDelete = sQLiteDatabaseM17559u0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(t8cVar.m21901a(null))});
                        if (iDelete > 0) {
                            xcc xccVar2 = kjcVar3.f47438f;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68076I.m17924b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (c1045d.f12369i.f9600h.m19952g() == 0) {
                    qg9 qg9Var = c1045d.f12369i.f9600h;
                    c1045d.mo5911c().getClass();
                    qg9Var.m19953h(System.currentTimeMillis());
                }
                c1045d.m5897N();
                return;
            case 13:
                t9d t9dVar = (t9d) this.f69803b;
                pc0 pc0VarM21918a = t9dVar.m21918a();
                String str = (String) pc0VarM21918a.f55938b;
                C0962f c0962f = t9dVar.f62029b;
                on9 on9Var = c0962f.f11847d;
                cdd cddVarM23257b = c0962f.f11850g.m23257b();
                boolean z2 = cddVarM23257b.f9955i;
                if (cddVarM23257b.f9956j) {
                    if (AbstractC3352my.m17115d0(str) && !z2) {
                        y04 y04Var = y04.f69048b;
                        return;
                    }
                    k0d k0dVarM24230t = x0d.m24230t();
                    xp7 xp7Var = (xp7) pc0VarM21918a.f55941e;
                    int i4 = xp7Var.f68498b;
                    q0d q0dVarM21812s = t0d.m21812s();
                    q0dVarM21812s.m19595g(i4);
                    q0dVarM21812s.m19596h(xp7Var.f68499c);
                    k0dVarM24230t.m14761h((t0d) q0dVarM21812s.m22741d());
                    if (!AbstractC3352my.m17115d0(str)) {
                        k0dVarM24230t.m14760g(str);
                    }
                    if (z2) {
                        k0dVarM24230t.m14762i(t9dVar.f62030c);
                    }
                    d2d d2dVar = (d2d) on9Var.get();
                    x0d x0dVar = (x0d) k0dVarM24230t.m22741d();
                    ltc ltcVar = d2dVar.f34881a;
                    i44 i44VarM13651b = i44.m13651b();
                    i44VarM13651b.f43482c = new sua(x0dVar, 4);
                    i44VarM13651b.f43483d = new Feature[]{AbstractC3423or.f54770h};
                    i44VarM13651b.f43480a = false;
                    c3555sM9998b = d2d.m9998b(ltcVar.m17569c(0, i44VarM13651b.m13652a()).mo5965g(AbstractC1120j.m6404a(), new cdb(ltcVar, x0dVar, z, 14)));
                } else {
                    if (AbstractC3352my.m17115d0(str)) {
                        y04 y04Var2 = y04.f69048b;
                        return;
                    }
                    d2d d2dVar2 = (d2d) on9Var.get();
                    d2dVar2.getClass();
                    str.getClass();
                    c3555sM9998b = d2d.m9998b(d2dVar2.f34881a.m16543d(str));
                }
                AbstractC1118h.m6397a(c3555sM9998b, zzmk.class, new i8d(t9dVar, objArr == true ? 1 : 0), c0962f.m5409a());
                return;
            default:
                try {
                    AbstractC1118h.m6398b((k93) this.f69803b);
                    return;
                } catch (Exception e) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                        return;
                    }
                    return;
                }
        }
    }

    public RunnableC3795yg(C1045d c1045d, C3002fi c3002fi) {
        this.f69802a = 12;
        this.f69803b = c1045d;
    }

    public /* synthetic */ RunnableC3795yg(Object obj, int i) {
        this.f69802a = i;
        this.f69803b = obj;
    }
}
