package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import cc.C1782b6;
import cc.C1860k3;
import cc.C1879m4;
import cc.C1897o4;
import cc.C1900o7;
import cc.C1918q7;
import cc.C1925r5;
import cc.C1934s5;
import cc.C1988y5;
import cc.InterfaceC1781b5;
import cc.InterfaceC1799d5;
import cc.RunnableC1826g5;
import cc.RunnableC1844i5;
import cc.RunnableC1871l5;
import cc.RunnableC1880m5;
import cc.RunnableC1888n4;
import cc.RunnableC1889n5;
import cc.RunnableC1898o5;
import cc.RunnableC1908p6;
import cc.RunnableC1909p7;
import cc.RunnableC1923r3;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC2791p0;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.internal.measurement.InterfaceC2882w0;
import com.google.android.gms.internal.measurement.InterfaceC2908y0;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p115fb.RunnableC5494j;
import p176ib.C6272i;
import p260m8.C7499b;
import p289o5.C7940t;
import p289o5.RunnableC7933m;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;
import p326q.C8446b;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC2791p0 {

    /* JADX INFO: renamed from: a */
    public C1897o4 f14599a = null;

    /* JADX INFO: renamed from: b */
    public final C8446b f14600b = new C8446b();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        m8533j();
        this.f14599a.m5782m().m5857h(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5868l(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5851h();
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1888n4(c1934s5, 2, null));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        m8533j();
        this.f14599a.m5782m().m5858j(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void generateEventId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1900o7 c1900o7 = this.f14599a.f10089l;
        C1897o4.m5774i(c1900o7);
        long jM5834l0 = c1900o7.m5834l0();
        m8533j();
        C1900o7 c1900o8 = this.f14599a.f10089l;
        C1897o4.m5774i(c1900o8);
        c1900o8.m5810F(interfaceC2843t0, jM5834l0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getAppInstanceId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1898o5(this, interfaceC2843t0, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getCachedAppInstanceId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        m8532h0(c1934s5.m5866A(), interfaceC2843t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getConditionalUserProperties(String str, String str2, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1909p7(this, interfaceC2843t0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getCurrentScreenClass(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1782b6 c1782b6 = ((C1897o4) c1934s5.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        C1988y5 c1988y5 = c1782b6.f9685c;
        m8532h0(c1988y5 != null ? c1988y5.f10415b : null, interfaceC2843t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getCurrentScreenName(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1782b6 c1782b6 = ((C1897o4) c1934s5.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        C1988y5 c1988y5 = c1782b6.f9685c;
        m8532h0(c1988y5 != null ? c1988y5.f10414a : null, interfaceC2843t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getGmpAppId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
        String strM16757s1 = ((C1897o4) interfaceC1781b5).f10078b;
        if (strM16757s1 == null) {
            try {
                strM16757s1 = C8573r0.m16757s1(((C1897o4) interfaceC1781b5).f10076a, ((C1897o4) interfaceC1781b5).f10063N);
            } catch (IllegalStateException e10) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5624b(e10, "getGoogleAppId failed with exception");
                strM16757s1 = null;
            }
        }
        m8532h0(strM16757s1, interfaceC2843t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getMaxUserProperties(String str, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C6272i.m12912f(str);
        ((C1897o4) c1934s5.f10430a).getClass();
        m8533j();
        C1900o7 c1900o7 = this.f14599a.f10089l;
        C1897o4.m5774i(c1900o7);
        c1900o7.m5809E(interfaceC2843t0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getSessionId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC5494j(c1934s5, interfaceC2843t0, 4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getTestFlag(InterfaceC2843t0 interfaceC2843t0, int i10) throws RemoteException {
        m8533j();
        int i11 = 1;
        if (i10 == 0) {
            C1900o7 c1900o7 = this.f14599a.f10089l;
            C1897o4.m5774i(c1900o7);
            C1934s5 c1934s5 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s5);
            AtomicReference atomicReference = new AtomicReference();
            C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
            C1897o4.m5776k(c1879m4);
            c1900o7.m5811G((String) c1879m4.m5750m(atomicReference, 15000L, "String test flag value", new RunnableC1889n5(c1934s5, atomicReference, i11)), interfaceC2843t0);
            return;
        }
        if (i10 == 1) {
            C1900o7 c1900o8 = this.f14599a.f10089l;
            C1897o4.m5774i(c1900o8);
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            AtomicReference atomicReference2 = new AtomicReference();
            C1879m4 c1879m5 = ((C1897o4) c1934s6.f10430a).f10087j;
            C1897o4.m5776k(c1879m5);
            c1900o8.m5810F(interfaceC2843t0, ((Long) c1879m5.m5750m(atomicReference2, 15000L, "long test flag value", new RunnableC1888n4(c1934s6, i11, atomicReference2))).longValue());
            return;
        }
        int i12 = 2;
        if (i10 == 2) {
            C1900o7 c1900o9 = this.f14599a.f10089l;
            C1897o4.m5774i(c1900o9);
            C1934s5 c1934s7 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s7);
            AtomicReference atomicReference3 = new AtomicReference();
            C1879m4 c1879m6 = ((C1897o4) c1934s7.f10430a).f10087j;
            C1897o4.m5776k(c1879m6);
            double dDoubleValue = ((Double) c1879m6.m5750m(atomicReference3, 15000L, "double test flag value", new RunnableC1889n5(c1934s7, atomicReference3, i12))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC2843t0.mo8058U(bundle);
                return;
            } catch (RemoteException e10) {
                C1860k3 c1860k3 = ((C1897o4) c1900o9.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5624b(e10, "Error returning double value to wrapper");
                return;
            }
        }
        int i13 = 4;
        if (i10 == 3) {
            C1900o7 c1900o10 = this.f14599a.f10089l;
            C1897o4.m5774i(c1900o10);
            C1934s5 c1934s8 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s8);
            AtomicReference atomicReference4 = new AtomicReference();
            C1879m4 c1879m7 = ((C1897o4) c1934s8.f10430a).f10087j;
            C1897o4.m5776k(c1879m7);
            c1900o10.m5809E(interfaceC2843t0, ((Integer) c1879m7.m5750m(atomicReference4, 15000L, "int test flag value", new RunnableC7933m(c1934s8, atomicReference4, i13))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        C1900o7 c1900o11 = this.f14599a.f10089l;
        C1897o4.m5774i(c1900o11);
        C1934s5 c1934s9 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s9);
        AtomicReference atomicReference5 = new AtomicReference();
        C1879m4 c1879m8 = ((C1897o4) c1934s9.f10430a).f10087j;
        C1897o4.m5776k(c1879m8);
        c1900o11.m5805A(interfaceC2843t0, ((Boolean) c1879m8.m5750m(atomicReference5, 15000L, "boolean test flag value", new RunnableC1889n5(c1934s9, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1908p6(this, interfaceC2843t0, str, str2, z10));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8532h0(String str, InterfaceC2843t0 interfaceC2843t0) {
        m8533j();
        C1900o7 c1900o7 = this.f14599a.f10089l;
        C1897o4.m5774i(c1900o7);
        c1900o7.m5811G(str, interfaceC2843t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void initForTests(Map map) throws RemoteException {
        m8533j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void initialize(InterfaceC8214a interfaceC8214a, zzcl zzclVar, long j10) throws RemoteException {
        C1897o4 c1897o4 = this.f14599a;
        if (c1897o4 == null) {
            Context context = (Context) BinderC8215b.m16362h0(interfaceC8214a);
            C6272i.m12915i(context);
            this.f14599a = C1897o4.m5777s(context, zzclVar, Long.valueOf(j10));
        } else {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void isDataCollectionEnabled(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        m8533j();
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1898o5(this, interfaceC2843t0, 1));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @EnsuresNonNull({"scion"})
    /* JADX INFO: renamed from: j */
    public final void m8533j() {
        if (this.f14599a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5870n(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException {
        m8533j();
        C6272i.m12912f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzaw zzawVar = new zzaw(str2, new zzau(bundle), "app", j10);
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1880m5(this, interfaceC2843t0, zzawVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void logHealthData(int i10, String str, InterfaceC8214a interfaceC8214a, InterfaceC8214a interfaceC8214a2, InterfaceC8214a interfaceC8214a3) throws RemoteException {
        m8533j();
        Object objM16362h0 = null;
        Object objM16362h1 = interfaceC8214a == null ? null : BinderC8215b.m16362h0(interfaceC8214a);
        Object objM16362h2 = interfaceC8214a2 == null ? null : BinderC8215b.m16362h0(interfaceC8214a2);
        if (interfaceC8214a3 != null) {
            objM16362h0 = BinderC8215b.m16362h0(interfaceC8214a3);
        }
        C1860k3 c1860k3 = this.f14599a.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.m5710v(i10, true, false, str, objM16362h1, objM16362h2, objM16362h0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityCreated(InterfaceC8214a interfaceC8214a, Bundle bundle, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1925r5 c1925r5 = c1934s5.f10189c;
        if (c1925r5 != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
            c1925r5.onActivityCreated((Activity) BinderC8215b.m16362h0(interfaceC8214a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityDestroyed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1925r5 c1925r5 = c1934s5.f10189c;
        if (c1925r5 != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
            c1925r5.onActivityDestroyed((Activity) BinderC8215b.m16362h0(interfaceC8214a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityPaused(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1925r5 c1925r5 = c1934s5.f10189c;
        if (c1925r5 != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
            c1925r5.onActivityPaused((Activity) BinderC8215b.m16362h0(interfaceC8214a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityResumed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1925r5 c1925r5 = c1934s5.f10189c;
        if (c1925r5 != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
            c1925r5.onActivityResumed((Activity) BinderC8215b.m16362h0(interfaceC8214a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivitySaveInstanceState(InterfaceC8214a interfaceC8214a, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1925r5 c1925r5 = c1934s5.f10189c;
        Bundle bundle = new Bundle();
        if (c1925r5 != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
            c1925r5.onActivitySaveInstanceState((Activity) BinderC8215b.m16362h0(interfaceC8214a), bundle);
        }
        try {
            interfaceC2843t0.mo8058U(bundle);
        } catch (RemoteException e10) {
            C1860k3 c1860k3 = this.f14599a.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityStarted(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        if (c1934s5.f10189c != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void onActivityStopped(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        if (c1934s5.f10189c != null) {
            C1934s5 c1934s6 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s6);
            c1934s6.m5869m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void performAction(Bundle bundle, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException {
        m8533j();
        interfaceC2843t0.mo8058U(null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void registerOnMeasurementEventListener(InterfaceC2882w0 interfaceC2882w0) throws RemoteException {
        Object c1918q7;
        m8533j();
        synchronized (this.f14600b) {
            c1918q7 = (InterfaceC1799d5) this.f14600b.getOrDefault(Integer.valueOf(interfaceC2882w0.mo8158a()), null);
            if (c1918q7 == null) {
                c1918q7 = new C1918q7(this, interfaceC2882w0);
                this.f14600b.put(Integer.valueOf(interfaceC2882w0.mo8158a()), c1918q7);
            }
        }
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5851h();
        if (!c1934s5.f10191e.add(c1918q7)) {
            C1860k3 c1860k3 = ((C1897o4) c1934s5.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void resetAnalyticsData(long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.f10193g.set(null);
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1871l5(c1934s5, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        m8533j();
        if (bundle == null) {
            C1860k3 c1860k3 = this.f14599a.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Conditional user property must not be null");
        } else {
            C1934s5 c1934s5 = this.f14599a.f10060K;
            C1897o4.m5775j(c1934s5);
            c1934s5.m5875s(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setConsent(final Bundle bundle, final long j10) throws RemoteException {
        m8533j();
        final C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5754q(new Runnable() { // from class: cc.f5
            @Override // java.lang.Runnable
            public final void run() {
                C1934s5 c1934s6 = c1934s5;
                if (TextUtils.isEmpty(((C1897o4) c1934s6.f10430a).m5785p().m5531n())) {
                    c1934s6.m5876t(bundle, 0, j10);
                    return;
                }
                C1860k3 c1860k3 = ((C1897o4) c1934s6.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9947k.m5623a("Using developer consent only; google app id found");
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5876t(bundle, -20, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r2 <= 100) goto L26;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreen(InterfaceC8214a interfaceC8214a, String str, String str2, long j10) throws RemoteException {
        m8533j();
        C1782b6 c1782b6 = this.f14599a.f10059J;
        C1897o4.m5775j(c1782b6);
        Activity activity = (Activity) BinderC8215b.m16362h0(interfaceC8214a);
        if (!((C1897o4) c1782b6.f10430a).f10084g.m5583r()) {
            C1860k3 c1860k3 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9947k.m5623a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C1988y5 c1988y5 = c1782b6.f9685c;
        if (c1988y5 == null) {
            C1860k3 c1860k4 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9947k.m5623a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (c1782b6.f9688f.get(activity) == null) {
            C1860k3 c1860k5 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9947k.m5623a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c1782b6.m5523o(activity.getClass());
        }
        boolean zM14913K0 = C7499b.m14913K0(c1988y5.f10415b, str2);
        boolean zM14913K1 = C7499b.m14913K0(c1988y5.f10414a, str);
        if (zM14913K0 && zM14913K1) {
            C1860k3 c1860k6 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9947k.m5623a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                ((C1897o4) c1782b6.f10430a).getClass();
            }
            C1860k3 c1860k7 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k7);
            c1860k7.f9947k.m5624b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                ((C1897o4) c1782b6.f10430a).getClass();
                if (length2 <= 100) {
                }
            }
            C1860k3 c1860k8 = ((C1897o4) c1782b6.f10430a).f10086i;
            C1897o4.m5776k(c1860k8);
            c1860k8.f9947k.m5624b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        C1860k3 c1860k9 = ((C1897o4) c1782b6.f10430a).f10086i;
        C1897o4.m5776k(c1860k9);
        c1860k9.f9938I.m5625c(str == null ? "null" : str, str2, "Setting current screen to name, class");
        C1900o7 c1900o7 = ((C1897o4) c1782b6.f10430a).f10089l;
        C1897o4.m5774i(c1900o7);
        C1988y5 c1988y6 = new C1988y5(c1900o7.m5834l0(), str, str2);
        c1782b6.f9688f.put(activity, c1988y6);
        c1782b6.m5526r(activity, c1988y6, true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5851h();
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1923r3(1, c1934s5, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setDefaultEventParameters(Bundle bundle) {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1826g5(c1934s5, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setEventInterceptor(InterfaceC2882w0 interfaceC2882w0) throws RemoteException {
        m8533j();
        C7940t c7940t = new C7940t(this, interfaceC2882w0);
        C1879m4 c1879m4 = this.f14599a.f10087j;
        C1897o4.m5776k(c1879m4);
        if (!c1879m4.m5755r()) {
            C1879m4 c1879m5 = this.f14599a.f10087j;
            C1897o4.m5776k(c1879m5);
            c1879m5.m5753p(new RunnableC7933m(this, c7940t, 7));
            return;
        }
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.mo5748g();
        c1934s5.m5851h();
        C7940t c7940t2 = c1934s5.f10190d;
        if (c7940t != c7940t2) {
            C6272i.m12917k("EventInterceptor already set.", c7940t2 == null);
        }
        c1934s5.f10190d = c7940t;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setInstanceIdProvider(InterfaceC2908y0 interfaceC2908y0) throws RemoteException {
        m8533j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        Boolean boolValueOf = Boolean.valueOf(z10);
        c1934s5.m5851h();
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1888n4(c1934s5, 2, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        m8533j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        C1879m4 c1879m4 = ((C1897o4) c1934s5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1844i5(c1934s5, j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setUserId(String str, long j10) throws RemoteException {
        m8533j();
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
        if (str != null && TextUtils.isEmpty(str)) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("User ID must be non-empty or null");
        } else {
            C1879m4 c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC5494j(c1934s5, 2, str));
            c1934s5.m5879w(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void setUserProperty(String str, String str2, InterfaceC8214a interfaceC8214a, boolean z10, long j10) throws RemoteException {
        m8533j();
        Object objM16362h0 = BinderC8215b.m16362h0(interfaceC8214a);
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5879w(str, str2, objM16362h0, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public void unregisterOnMeasurementEventListener(InterfaceC2882w0 interfaceC2882w0) throws RemoteException {
        Object c1918q7;
        m8533j();
        synchronized (this.f14600b) {
            try {
                c1918q7 = (InterfaceC1799d5) this.f14600b.remove(Integer.valueOf(interfaceC2882w0.mo8158a()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c1918q7 == null) {
            c1918q7 = new C1918q7(this, interfaceC2882w0);
        }
        C1934s5 c1934s5 = this.f14599a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5851h();
        if (!c1934s5.f10191e.remove(c1918q7)) {
            C1860k3 c1860k3 = ((C1897o4) c1934s5.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("OnEventListener had not been registered");
        }
    }
}
