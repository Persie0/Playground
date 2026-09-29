package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.AbstractC0989c;
import com.google.android.gms.internal.play_billing.C0994e0;
import com.google.android.gms.internal.play_billing.C0999j;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1010u;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import com.lingq.p020ui.MainActivity;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class hvb extends kc0 {

    /* JADX INFO: renamed from: C */
    public final MainActivity f43014C;

    /* JADX INFO: renamed from: D */
    public volatile int f43015D;

    /* JADX INFO: renamed from: E */
    public volatile unb f43016E;

    /* JADX INFO: renamed from: F */
    public volatile yub f43017F;

    /* JADX INFO: renamed from: G */
    public volatile ScheduledExecutorService f43018G;

    public hvb(e41 e41Var, MainActivity mainActivity, C3370nf c3370nf) {
        super(e41Var, mainActivity, c3370nf);
        this.f43015D = 0;
        this.f43014C = mainActivity;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized boolean m13508F() {
        return (this.f43015D != 2 || this.f43016E == null || this.f43017F == null) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final vwb m13509G(int i) {
        if (!m13508F()) {
            AbstractC0985a.m5508i("BillingClientTesting", "Billing Override Service is not ready.");
            m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, wwb.m24184a(-1, "Billing Override Service connection is disconnected."));
            return new nwb(0);
        }
        ztb ztbVar = new ztb(this, i, 0);
        C0994e0 c0994e0 = new C0994e0();
        c0994e0.f12182c = new eld();
        zid zidVar = new zid(c0994e0);
        c0994e0.f12181b = zidVar;
        c0994e0.f12180a = ztb.class;
        try {
            ztbVar.m25787i(c0994e0);
            c0994e0.f12180a = "billingOverrideService.getBillingOverride";
            return zidVar;
        } catch (Exception e) {
            C0999j c0999j = new C0999j(e);
            idd iddVar = m6d.f50686f;
            pgd pgdVar = zidVar.f71629b;
            if (iddVar.mo13805e(pgdVar, null, c0999j)) {
                m6d.m16658d(pgdVar);
            }
            return zidVar;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m13510H(zzjd zzjdVar, int i, qc0 qc0Var) {
        int i2 = qvb.f58258a;
        C1005p c1005pM20182b = qvb.m20182b(zzjdVar, i, qc0Var, null, zzjk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c1005pM20182b, "ApiFailure should not be null");
        this.f47000h.m19917q(c1005pM20182b);
    }

    /* JADX INFO: renamed from: I */
    public final void m13511I(int i) {
        int i2 = qvb.f58258a;
        C1006q c1006qM20183c = qvb.m20183c(i, zzjk.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c1006qM20183c, "ApiSuccess should not be null");
        qfa qfaVar = this.f47000h;
        qfaVar.getClass();
        try {
            qfaVar.m19905B(c1006qM20183c, (C1010u) qfaVar.f57705a);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13512J(int i, lk1 lk1Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        vwb vwbVarM13509G = m13509G(i);
        synchronized (this) {
            try {
                if (this.f43018G == null) {
                    this.f43018G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.f43018G;
            } catch (Throwable th) {
                throw th;
            }
        }
        vwb vwbVarM5517b = AbstractC0989c.m5517b(vwbVarM13509G, scheduledExecutorService);
        gld gldVar = new gld(this, i, lk1Var, runnable);
        vwbVarM5517b.mo16661b(new gvb(0, vwbVarM5517b, gldVar), m15091f());
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: a */
    public final void mo13513a(gp0 gp0Var, C3440oy c3440oy) {
        m13512J(3, new lb3(c3440oy, 3), new kr3(4, this, gp0Var, c3440oy, false));
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: b */
    public final void mo13514b() {
        synchronized (this) {
            m13511I(27);
            try {
                try {
                    if (this.f43017F != null && this.f43016E != null) {
                        AbstractC0985a.m5507h("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f43014C.unbindService(this.f43017F);
                        this.f43017F = new yub(this, 0);
                    }
                    this.f43016E = null;
                    if (this.f43018G != null) {
                        this.f43018G.shutdownNow();
                        this.f43018G = null;
                    }
                } catch (RuntimeException e) {
                    AbstractC0985a.m5509j("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.f43015D = 3;
            } catch (Throwable th) {
                this.f43015D = 3;
                throw th;
            }
        }
        super.mo13514b();
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: c */
    public final qc0 mo13515c(MainActivity mainActivity, nc0 nc0Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) m13509G(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, wwb.f67453r);
            AbstractC0985a.m5509j("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, wwb.f67453r);
            AbstractC0985a.m5509j("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            qc0 qc0VarM24184a = wwb.m24184a(iIntValue, "Billing override value was set by a license tester.");
            m13510H(zzjd.LICENSE_TESTER_BILLING_OVERRIDE, 2, qc0VarM24184a);
            m15090E(qc0VarM24184a);
            return qc0VarM24184a;
        }
        try {
            return super.mo13515c(mainActivity, nc0Var);
        } catch (Exception e3) {
            zzjd zzjdVar = zzjd.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            qc0 qc0Var = wwb.f67443h;
            m13510H(zzjdVar, 2, qc0Var);
            AbstractC0985a.m5509j("BillingClientTesting", "An internal error occurred.", e3);
            return qc0Var;
        }
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: d */
    public final void mo13516d(cc4 cc4Var, C3440oy c3440oy) {
        m13512J(7, new lb3(c3440oy, 2), new kr3(3, this, cc4Var, c3440oy, false));
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: e */
    public final void mo13517e(b64 b64Var) {
        synchronized (this) {
            if (m13508F()) {
                AbstractC0985a.m5507h("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                m13511I(26);
            } else if (this.f43015D == 1) {
                AbstractC0985a.m5508i("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.f43015D == 3) {
                AbstractC0985a.m5508i("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                m13510H(zzjd.BILLING_CLIENT_CLOSED, 26, wwb.m24184a(-1, "Billing Override Service connection is disconnected."));
            } else {
                this.f43015D = 1;
                AbstractC0985a.m5507h("BillingClientTesting", "Starting Billing Override Service setup.");
                this.f43017F = new yub(this, 0);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                MainActivity mainActivity = this.f43014C;
                List<ResolveInfo> listQueryIntentServices = mainActivity.getPackageManager().queryIntentServices(intent, 0);
                zzjd zzjdVar = zzjd.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                            AbstractC0985a.m5508i("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (mainActivity.bindService(intent2, this.f43017F, 1)) {
                                AbstractC0985a.m5507h("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                                AbstractC0985a.m5508i("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.f43015D = 0;
                AbstractC0985a.m5507h("BillingClientTesting", "Billing Override Service unavailable on device.");
                m13510H(zzjdVar, 26, wwb.m24184a(2, "Billing Override Service unavailable on device."));
            }
        }
        m15102t(b64Var);
    }

    public hvb(e41 e41Var, MainActivity mainActivity, pc0 pc0Var, C3370nf c3370nf) {
        super(e41Var, mainActivity, pc0Var, c3370nf);
        this.f43015D = 0;
        this.f43014C = mainActivity;
    }
}
