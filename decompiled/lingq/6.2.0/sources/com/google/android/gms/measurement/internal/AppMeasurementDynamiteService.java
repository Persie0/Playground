package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.C3275kv;
import p000.C3386nv;
import p000.C3600t6;
import p000.RunnableC3736wv;
import p000.asc;
import p000.aub;
import p000.by3;
import p000.bzc;
import p000.cdb;
import p000.cvb;
import p000.cyc;
import p000.duc;
import p000.eqc;
import p000.fyc;
import p000.gvb;
import p000.htc;
import p000.j0d;
import p000.jo0;
import p000.jwb;
import p000.kj3;
import p000.kjc;
import p000.kwb;
import p000.lda;
import p000.lp6;
import p000.mq7;
import p000.nvb;
import p000.occ;
import p000.osc;
import p000.oub;
import p000.qbd;
import p000.rad;
import p000.s46;
import p000.tac;
import p000.tic;
import p000.u62;
import p000.wrc;
import p000.xcc;
import p000.xic;
import p000.z8c;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends aub {

    /* JADX INFO: renamed from: f */
    public kjc f12312f;

    /* JADX INFO: renamed from: g */
    public final C3275kv f12313g;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f12312f = null;
        this.f12313g = new C3275kv(0);
    }

    /* JADX INFO: renamed from: G */
    public final void m5846G() {
        if (this.f12312f != null) {
            return;
        }
        C3386nv.m17633t("Attempting to perform action before initialize.");
    }

    /* JADX INFO: renamed from: H */
    public final void m5847H(String str, oub oubVar) {
        m5846G();
        rad radVar = this.f12312f.f47441i;
        kjc.m15278j(radVar);
        radVar.m20551p0(str, oubVar);
    }

    @Override // p000.eub
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m5846G();
        jwb jwbVar = this.f12312f.f47415I;
        kjc.m15277i(jwbVar);
        jwbVar.m14729E(str, j);
    }

    @Override // p000.eub
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5861R(str, str2, bundle);
    }

    @Override // p000.eub
    public void clearMeasurementEnabled(long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m13744E();
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new kj3(c1043b, null, false, 18));
    }

    @Override // p000.eub
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m5846G();
        jwb jwbVar = this.f12312f.f47415I;
        kjc.m15277i(jwbVar);
        jwbVar.m14730F(str, j);
    }

    @Override // p000.eub
    public void generateEventId(oub oubVar) throws RemoteException {
        m5846G();
        rad radVar = this.f12312f.f47441i;
        kjc.m15278j(radVar);
        long jM20515A0 = radVar.m20515A0();
        m5846G();
        rad radVar2 = this.f12312f.f47441i;
        kjc.m15278j(radVar2);
        radVar2.m20552q0(oubVar, jM20515A0);
    }

    @Override // p000.eub
    public void getAppInstanceId(oub oubVar) throws RemoteException {
        m5846G();
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new xic(this, oubVar, 0));
    }

    @Override // p000.eub
    public void getCachedAppInstanceId(oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        m5847H((String) c1043b.f12329g.get(), oubVar);
    }

    @Override // p000.eub
    public void getConditionalUserProperties(String str, String str2, oub oubVar) throws RemoteException {
        m5846G();
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new jo0(this, oubVar, str, str2, 6));
    }

    @Override // p000.eub
    public void getCurrentScreenClass(oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        j0d j0dVar = ((kjc) c1043b.f60774a).f47444l;
        kjc.m15279k(j0dVar);
        bzc bzcVar = j0dVar.f44861c;
        m5847H(bzcVar != null ? bzcVar.f9209b : null, oubVar);
    }

    @Override // p000.eub
    public void getCurrentScreenName(oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        j0d j0dVar = ((kjc) c1043b.f60774a).f47444l;
        kjc.m15279k(j0dVar);
        bzc bzcVar = j0dVar.f44861c;
        m5847H(bzcVar != null ? bzcVar.f9208a : null, oubVar);
    }

    @Override // p000.eub
    public void getGmpAppId(oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        m5847H(c1043b.m5862S(), oubVar);
    }

    @Override // p000.eub
    public void getMaxUserProperties(String str, oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        lda.m16127m(str);
        ((kjc) c1043b.f60774a).getClass();
        m5846G();
        rad radVar = this.f12312f.f47441i;
        kjc.m15278j(radVar);
        radVar.m20553r0(oubVar, 25);
    }

    @Override // p000.eub
    public void getSessionId(oub oubVar) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new gvb(c1043b, oubVar));
    }

    @Override // p000.eub
    public void getTestFlag(oub oubVar, int i) throws RemoteException {
        m5846G();
        if (i == 0) {
            rad radVar = this.f12312f.f47441i;
            kjc.m15278j(radVar);
            C1043b c1043b = this.f12312f.f47414H;
            kjc.m15279k(c1043b);
            AtomicReference atomicReference = new AtomicReference();
            tic ticVar = ((kjc) c1043b.f60774a).f47439g;
            kjc.m15280l(ticVar);
            radVar.m20551p0((String) ticVar.m22077N(atomicReference, 15000L, "String test flag value", new osc(c1043b, atomicReference, 1)), oubVar);
            return;
        }
        if (i == 1) {
            rad radVar2 = this.f12312f.f47441i;
            kjc.m15278j(radVar2);
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            AtomicReference atomicReference2 = new AtomicReference();
            tic ticVar2 = ((kjc) c1043b2.f60774a).f47439g;
            kjc.m15280l(ticVar2);
            radVar2.m20552q0(oubVar, ((Long) ticVar2.m22077N(atomicReference2, 15000L, "long test flag value", new duc(c1043b2, atomicReference2, 0))).longValue());
            return;
        }
        if (i == 2) {
            rad radVar3 = this.f12312f.f47441i;
            kjc.m15278j(radVar3);
            C1043b c1043b3 = this.f12312f.f47414H;
            kjc.m15279k(c1043b3);
            AtomicReference atomicReference3 = new AtomicReference();
            tic ticVar3 = ((kjc) c1043b3.f60774a).f47439g;
            kjc.m15280l(ticVar3);
            double dDoubleValue = ((Double) ticVar3.m22077N(atomicReference3, 15000L, "double test flag value", new duc(c1043b3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                oubVar.mo16549u(bundle);
                return;
            } catch (RemoteException e) {
                xcc xccVar = ((kjc) radVar3.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            rad radVar4 = this.f12312f.f47441i;
            kjc.m15278j(radVar4);
            C1043b c1043b4 = this.f12312f.f47414H;
            kjc.m15279k(c1043b4);
            AtomicReference atomicReference4 = new AtomicReference();
            tic ticVar4 = ((kjc) c1043b4.f60774a).f47439g;
            kjc.m15280l(ticVar4);
            radVar4.m20553r0(oubVar, ((Integer) ticVar4.m22077N(atomicReference4, 15000L, "int test flag value", new osc(c1043b4, atomicReference4, 2))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        rad radVar5 = this.f12312f.f47441i;
        kjc.m15278j(radVar5);
        C1043b c1043b5 = this.f12312f.f47414H;
        kjc.m15279k(c1043b5);
        AtomicReference atomicReference5 = new AtomicReference();
        tic ticVar5 = ((kjc) c1043b5.f60774a).f47439g;
        kjc.m15280l(ticVar5);
        radVar5.m20555t0(oubVar, ((Boolean) ticVar5.m22077N(atomicReference5, 15000L, "boolean test flag value", new osc(c1043b5, atomicReference5, 0))).booleanValue());
    }

    @Override // p000.eub
    public void getUserProperties(String str, String str2, boolean z, oub oubVar) throws RemoteException {
        m5846G();
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new wrc(this, oubVar, str, str2, z));
    }

    @Override // p000.eub
    public void initForTests(Map map) throws RemoteException {
        m5846G();
    }

    @Override // p000.eub
    public void initialize(by3 by3Var, zzdb zzdbVar, long j) throws RemoteException {
        kjc kjcVar = this.f12312f;
        if (kjcVar == null) {
            Context context = (Context) lp6.m16422I(by3Var);
            lda.m16130p(context);
            this.f12312f = kjc.m15281r(context, zzdbVar, Long.valueOf(j), null);
        } else {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17923a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.eub
    public void initializeWithElapsedTime(by3 by3Var, zzdb zzdbVar, long j, long j2) {
        kjc kjcVar = this.f12312f;
        if (kjcVar == null) {
            Context context = (Context) lp6.m16422I(by3Var);
            lda.m16130p(context);
            this.f12312f = kjc.m15281r(context, zzdbVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17923a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.eub
    public void isDataCollectionEnabled(oub oubVar) throws RemoteException {
        m5846G();
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new xic(this, oubVar, 1));
    }

    @Override // p000.eub
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5852I(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // p000.eub
    public void logEventAndBundle(String str, String str2, Bundle bundle, oub oubVar, long j) throws RemoteException {
        m5846G();
        lda.m16127m(str2);
        String str3 = true != this.f12312f.f47436d.m4869O(null, z8c.f71170f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        zzbh zzbhVar = new zzbh(str2, new zzbf(bundle), str3, j, 0L);
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new jo0(this, oubVar, zzbhVar, str, 3));
    }

    @Override // p000.eub
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5852I(str, str2, bundle, z, z2, j, j2);
    }

    @Override // p000.eub
    public void logHealthData(int i, String str, by3 by3Var, by3 by3Var2, by3 by3Var3) throws RemoteException {
        m5846G();
        Object objM16422I = by3Var == null ? null : lp6.m16422I(by3Var);
        Object objM16422I2 = by3Var2 == null ? null : lp6.m16422I(by3Var2);
        Object objM16422I3 = by3Var3 != null ? lp6.m16422I(by3Var3) : null;
        xcc xccVar = this.f12312f.f47438f;
        kjc.m15280l(xccVar);
        xccVar.m24456M(i, true, false, str, objM16422I, objM16422I2, objM16422I3);
    }

    @Override // p000.eub
    public void onActivityCreated(by3 by3Var, Bundle bundle, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityCreatedByScionActivityInfo(zzdd.m5439r(activity), bundle, j);
    }

    @Override // p000.eub
    public void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        C3600t6 c3600t6 = c1043b.f12325c;
        if (c3600t6 != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
            c3600t6.m21865l(zzddVar, bundle);
        }
    }

    @Override // p000.eub
    public void onActivityDestroyed(by3 by3Var, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityDestroyedByScionActivityInfo(zzdd.m5439r(activity), j);
    }

    @Override // p000.eub
    public void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        C3600t6 c3600t6 = c1043b.f12325c;
        if (c3600t6 != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
            c3600t6.m21866m(zzddVar);
        }
    }

    @Override // p000.eub
    public void onActivityPaused(by3 by3Var, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityPausedByScionActivityInfo(zzdd.m5439r(activity), j);
    }

    @Override // p000.eub
    public void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        C3600t6 c3600t6 = c1043b.f12325c;
        if (c3600t6 != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
            c3600t6.m21867n(zzddVar);
        }
    }

    @Override // p000.eub
    public void onActivityResumed(by3 by3Var, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityResumedByScionActivityInfo(zzdd.m5439r(activity), j);
    }

    @Override // p000.eub
    public void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        C3600t6 c3600t6 = c1043b.f12325c;
        if (c3600t6 != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
            c3600t6.m21868o(zzddVar);
        }
    }

    @Override // p000.eub
    public void onActivitySaveInstanceState(by3 by3Var, oub oubVar, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdd.m5439r(activity), oubVar, j);
    }

    @Override // p000.eub
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, oub oubVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        C3600t6 c3600t6 = c1043b.f12325c;
        Bundle bundle = new Bundle();
        if (c3600t6 != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
            c3600t6.m21869p(zzddVar, bundle);
        }
        try {
            oubVar.mo16549u(bundle);
        } catch (RemoteException e) {
            xcc xccVar = this.f12312f.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // p000.eub
    public void onActivityStarted(by3 by3Var, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityStartedByScionActivityInfo(zzdd.m5439r(activity), j);
    }

    @Override // p000.eub
    public void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        if (c1043b.f12325c != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
        }
    }

    @Override // p000.eub
    public void onActivityStopped(by3 by3Var, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        onActivityStoppedByScionActivityInfo(zzdd.m5439r(activity), j);
    }

    @Override // p000.eub
    public void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        if (c1043b.f12325c != null) {
            C1043b c1043b2 = this.f12312f.f47414H;
            kjc.m15279k(c1043b2);
            c1043b2.m5866W();
        }
    }

    @Override // p000.eub
    public void performAction(Bundle bundle, oub oubVar, long j) throws RemoteException {
        m5846G();
        oubVar.mo16549u(null);
    }

    @Override // p000.eub
    public void registerOnMeasurementEventListener(nvb nvbVar) throws RemoteException {
        Object qbdVar;
        m5846G();
        C3275kv c3275kv = this.f12313g;
        synchronized (c3275kv) {
            try {
                qbdVar = (eqc) c3275kv.get(Integer.valueOf(nvbVar.mo10689d()));
                if (qbdVar == null) {
                    qbdVar = new qbd(this, nvbVar);
                    c3275kv.put(Integer.valueOf(nvbVar.mo10689d()), qbdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m13744E();
        if (c1043b.f12327e.add(qbdVar)) {
            return;
        }
        xcc xccVar = ((kjc) c1043b.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68083i.m17923a("OnEventListener already registered");
    }

    @Override // p000.eub
    @Deprecated
    public void resetAnalyticsData(long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.f12329g.set(null);
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new asc(c1043b, j, 1));
    }

    @Override // p000.eub
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.f12329g.set(null);
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new asc(c1043b, j, 1));
    }

    @Override // p000.eub
    public void retrieveAndUploadBatches(cvb cvbVar) {
        zzlr zzlrVar;
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        gvb gvbVar = new gvb(27, this, cvbVar);
        c1043b.m13744E();
        kjc kjcVar = (kjc) c1043b.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        if (ticVar.m22073J()) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        tic ticVar2 = kjcVar.f47439g;
        kjc.m15280l(ticVar2);
        if (Thread.currentThread() == ticVar2.f62355d) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17923a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zM21077y = s46.m21077y();
        xcc xccVar3 = kjcVar.f47438f;
        if (zM21077y) {
            kjc.m15280l(xccVar3);
            xccVar3.f68080f.m17923a("Cannot retrieve and upload batches from main thread");
            return;
        }
        kjc.m15280l(xccVar3);
        xccVar3.f68076I.m17923a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            xcc xccVar4 = kjcVar.f47438f;
            kjc.m15280l(xccVar4);
            xccVar4.f68076I.m17923a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            tic ticVar3 = kjcVar.f47439g;
            kjc.m15280l(ticVar3);
            ticVar3.m22077N(atomicReference, 10000L, "[sgtm] Getting upload batches", new duc(c1043b, atomicReference, 2));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f12405a;
            if (list.isEmpty()) {
                break;
            }
            xcc xccVar5 = kjcVar.f47438f;
            kjc.m15280l(xccVar5);
            xccVar5.f68076I.m17924b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.f12399c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    tac tacVarM15289q = ((kjc) c1043b.f60774a).m15289q();
                    tacVarM15289q.m13744E();
                    lda.m16130p(tacVarM15289q.f62079g);
                    String str = tacVarM15289q.f62079g;
                    kjc kjcVar2 = (kjc) c1043b.f60774a;
                    xcc xccVar6 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar6);
                    occ occVar = xccVar6.f68076I;
                    Long lValueOf = Long.valueOf(zzomVar.f12397a);
                    occVar.m17926d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f12399c, Integer.valueOf(zzomVar.f12398b.length));
                    if (!TextUtils.isEmpty(zzomVar.f12403g)) {
                        xcc xccVar7 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar7);
                        xccVar7.f68076I.m17925c("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.f12403g);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.f12400d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    fyc fycVar = kjcVar2.f47416J;
                    kjc.m15280l(fycVar);
                    byte[] bArr = zzomVar.f12398b;
                    mq7 mq7Var = new mq7(c1043b, atomicReference2, zzomVar, 17);
                    fycVar.m18192F();
                    lda.m16130p(url);
                    lda.m16130p(bArr);
                    tic ticVar4 = ((kjc) fycVar.f60774a).f47439g;
                    kjc.m15280l(ticVar4);
                    ticVar4.m22079P(new cyc(fycVar, str, url, bArr, map, mq7Var));
                    try {
                        rad radVar = kjcVar2.f47441i;
                        kjc.m15278j(radVar);
                        kjc kjcVar3 = (kjc) radVar.f60774a;
                        kjcVar3.f47443k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    kjcVar3.f47443k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        xcc xccVar8 = ((kjc) c1043b.f60774a).f47438f;
                        kjc.m15280l(xccVar8);
                        xccVar8.f68083i.m17923a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    zzlrVar = atomicReference2.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    xcc xccVar9 = ((kjc) c1043b.f60774a).f47438f;
                    kjc.m15280l(xccVar9);
                    xccVar9.f68080f.m17926d("[sgtm] Bad upload url for row_id", zzomVar.f12399c, Long.valueOf(zzomVar.f12397a), e);
                    zzlrVar = zzlr.FAILURE;
                }
                if (zzlrVar != zzlr.SUCCESS) {
                    if (zzlrVar == zzlr.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        xcc xccVar10 = kjcVar.f47438f;
        kjc.m15280l(xccVar10);
        xccVar10.f68076I.m17925c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
        gvbVar.run();
    }

    @Override // p000.eub
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m5846G();
        kjc kjcVar = this.f12312f;
        if (bundle == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Conditional user property must not be null");
        } else {
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5860Q(bundle, j);
        }
    }

    @Override // p000.eub
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // p000.eub
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5867X(bundle, -20, j);
    }

    @Override // p000.eub
    public void setCurrentScreen(by3 by3Var, String str, String str2, long j) throws RemoteException {
        m5846G();
        Activity activity = (Activity) lp6.m16422I(by3Var);
        lda.m16130p(activity);
        setCurrentScreenByScionActivityInfo(zzdd.m5439r(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // p000.eub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) throws RemoteException {
        m5846G();
        j0d j0dVar = this.f12312f.f47444l;
        kjc.m15279k(j0dVar);
        kjc kjcVar = (kjc) j0dVar.f60774a;
        if (!kjcVar.f47436d.m4873S()) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68085k.m17923a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        bzc bzcVar = j0dVar.f44861c;
        if (bzcVar == null) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68085k.m17923a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = j0dVar.f44864f;
        Integer numValueOf = Integer.valueOf(zzddVar.f11879a);
        if (concurrentHashMap.get(numValueOf) == null) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68085k.m17923a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = j0dVar.m14238I(zzddVar.f11880b);
        }
        String str3 = bzcVar.f9209b;
        String str4 = bzcVar.f9208a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            xcc xccVar4 = kjcVar.f47438f;
            kjc.m15280l(xccVar4);
            xccVar4.f68085k.m17923a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                kjcVar.f47436d.getClass();
            }
            xcc xccVar5 = kjcVar.f47438f;
            kjc.m15280l(xccVar5);
            xccVar5.f68085k.m17924b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            kjcVar.f47436d.getClass();
            if (length2 <= 500) {
                xcc xccVar6 = kjcVar.f47438f;
                kjc.m15280l(xccVar6);
                xccVar6.f68076I.m17925c("Setting current screen to name, class", str == null ? "null" : str, str2);
                rad radVar = kjcVar.f47441i;
                kjc.m15278j(radVar);
                bzc bzcVar2 = new bzc(radVar.m20515A0(), str, str2);
                concurrentHashMap.put(numValueOf, bzcVar2);
                j0dVar.m14241L(zzddVar.f11880b, bzcVar2, true);
                return;
            }
        }
        xcc xccVar7 = kjcVar.f47438f;
        kjc.m15280l(xccVar7);
        xccVar7.f68085k.m17924b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // p000.eub
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m13744E();
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new RunnableC3736wv(c1043b, z));
    }

    @Override // p000.eub
    public void setDefaultEventParameters(Bundle bundle) {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new htc(c1043b, bundle2, 1));
    }

    @Override // p000.eub
    public void setEventInterceptor(nvb nvbVar) throws RemoteException {
        m5846G();
        cdb cdbVar = new cdb(18, this, nvbVar);
        tic ticVar = this.f12312f.f47439g;
        kjc.m15280l(ticVar);
        boolean zM22073J = ticVar.m22073J();
        kjc kjcVar = this.f12312f;
        if (!zM22073J) {
            tic ticVar2 = kjcVar.f47439g;
            kjc.m15280l(ticVar2);
            ticVar2.m22076M(new kj3(this, cdbVar, false, 19));
            return;
        }
        C1043b c1043b = kjcVar.f47414H;
        kjc.m15279k(c1043b);
        c1043b.mo12359D();
        c1043b.m13744E();
        cdb cdbVar2 = c1043b.f12326d;
        if (cdbVar != cdbVar2) {
            lda.m16132r("EventInterceptor already set.", cdbVar2 == null);
        }
        c1043b.f12326d = cdbVar;
    }

    @Override // p000.eub
    public void setInstanceIdProvider(kwb kwbVar) throws RemoteException {
        m5846G();
    }

    @Override // p000.eub
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        Boolean boolValueOf = Boolean.valueOf(z);
        c1043b.m13744E();
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new kj3(c1043b, boolValueOf, false, 18));
    }

    @Override // p000.eub
    public void setMinimumSessionDuration(long j) throws RemoteException {
        m5846G();
    }

    @Override // p000.eub
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        tic ticVar = ((kjc) c1043b.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new asc(c1043b, j, 0));
    }

    @Override // p000.eub
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        kjc kjcVar = (kjc) c1043b.f60774a;
        Uri data = intent.getData();
        if (data == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68086l.m17923a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68086l.m17923a("[sgtm] Preview Mode was not enabled.");
            kjcVar.f47436d.f10288c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        xcc xccVar3 = kjcVar.f47438f;
        kjc.m15280l(xccVar3);
        xccVar3.f68086l.m17924b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        kjcVar.f47436d.f10288c = queryParameter2;
    }

    @Override // p000.eub
    public void setUserId(String str, long j) throws RemoteException {
        m5846G();
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        kjc kjcVar = (kjc) c1043b.f60774a;
        if (str != null && TextUtils.isEmpty(str)) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17923a("User ID must be non-empty or null");
        } else {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new u62(c1043b, str, false, 9));
            c1043b.m5857N(null, "_id", str, true, j);
        }
    }

    @Override // p000.eub
    public void setUserProperty(String str, String str2, by3 by3Var, boolean z, long j) throws RemoteException {
        m5846G();
        Object objM16422I = lp6.m16422I(by3Var);
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5857N(str, str2, objM16422I, z, j);
    }

    @Override // p000.eub
    public void unregisterOnMeasurementEventListener(nvb nvbVar) throws RemoteException {
        Object qbdVar;
        m5846G();
        C3275kv c3275kv = this.f12313g;
        synchronized (c3275kv) {
            qbdVar = (eqc) c3275kv.remove(Integer.valueOf(nvbVar.mo10689d()));
        }
        if (qbdVar == null) {
            qbdVar = new qbd(this, nvbVar);
        }
        C1043b c1043b = this.f12312f.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m13744E();
        if (c1043b.f12327e.remove(qbdVar)) {
            return;
        }
        xcc xccVar = ((kjc) c1043b.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68083i.m17923a("OnEventListener had not been registered");
    }
}
