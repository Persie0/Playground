package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C0988b0;
import com.google.android.gms.internal.play_billing.C0990c0;
import com.google.android.gms.internal.play_billing.C0992d0;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1007r;
import com.google.android.gms.internal.play_billing.C1008s;
import com.google.android.gms.internal.play_billing.zzjd;

/* JADX INFO: loaded from: classes.dex */
public final class frb implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final b64 f39535a;

    /* JADX INFO: renamed from: b */
    public final upb f39536b;

    /* JADX INFO: renamed from: c */
    public final upb f39537c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kc0 f39538d;

    public frb(kc0 kc0Var, b64 b64Var) {
        this.f39538d = kc0Var;
        sla slaVar = kc0Var.f46992B;
        this.f39536b = new upb(slaVar);
        this.f39537c = new upb(slaVar);
        this.f39535a = b64Var;
    }

    /* JADX INFO: renamed from: a */
    public final Long m12031a(boolean z) {
        kc0 kc0Var = this.f39538d;
        try {
            if (z) {
                synchronized (kc0Var.f46993a) {
                    try {
                        upb upbVar = this.f39536b;
                        if (!upbVar.f64199b) {
                            return null;
                        }
                        long jMo19435a = upbVar.f64198a.mo19435a();
                        if (!upbVar.f64199b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        upbVar.f64199b = false;
                        long j = (jMo19435a - upbVar.f64201d) + upbVar.f64200c;
                        upbVar.f64200c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (kc0Var.f46993a) {
                try {
                    upb upbVar2 = this.f39537c;
                    if (!upbVar2.f64199b) {
                        return null;
                    }
                    long jMo19435a2 = upbVar2.f64198a.mo19435a();
                    if (!upbVar2.f64199b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    upbVar2.f64199b = false;
                    long j2 = (jMo19435a2 - upbVar2.f64201d) + upbVar2.f64200c;
                    upbVar2.f64200c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AbstractC0985a.m5509j("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        AbstractC0985a.m5509j("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m12032b(qc0 qc0Var, zzjd zzjdVar, String str, boolean z) {
        try {
            vnc vncVarM5623q = C1007r.m5623q();
            int i = qc0Var.f57553a;
            vncVarM5623q.m18948b();
            C1007r.m5622p((C1007r) vncVarM5623q.f55715b, i);
            String str2 = qc0Var.f57555c;
            vncVarM5623q.m18948b();
            C1007r.m5625s((C1007r) vncVarM5623q.f55715b, str2);
            vncVarM5623q.m18948b();
            C1007r.m5628v((C1007r) vncVarM5623q.f55715b, zzjdVar);
            vncVarM5623q.m18948b();
            C1007r.m5626t((C1007r) vncVarM5623q.f55715b);
            if (str != null) {
                vncVarM5623q.m18948b();
                C1007r.m5624r((C1007r) vncVarM5623q.f55715b, str);
            }
            Long lM12031a = m12031a(z);
            kc0 kc0Var = this.f39538d;
            if (!z) {
                ptc ptcVarM5512p = C0988b0.m5512p();
                ptcVarM5512p.m19479c(vncVarM5623q);
                if (lM12031a != null) {
                    ptcVarM5512p.m19480d(lM12031a.longValue());
                }
                kc0Var.f47000h.m19924y((C0988b0) ptcVarM5512p.m18947a());
                return;
            }
            nuc nucVarM5520p = C0992d0.m5520p();
            nucVarM5520p.m17617c(false);
            nucVarM5520p.m17618d();
            nucVarM5520p.m18948b();
            C0992d0.m5524t((C0992d0) nucVarM5520p.f55715b);
            if (lM12031a != null) {
                long jLongValue = lM12031a.longValue();
                nucVarM5520p.m18948b();
                C0992d0.m5523s((C0992d0) nucVarM5520p.f55715b, jLongValue);
            }
            imc imcVarM5610s = C1005p.m5610s();
            imcVarM5610s.m14030c(vncVarM5623q);
            imcVarM5610s.m18948b();
            C1005p.m5609r((C1005p) imcVarM5610s.f55715b, 6);
            imcVarM5610s.m14031d(nucVarM5520p);
            kc0Var.m15098p((C1005p) imcVarM5610s.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12033c(qc0 qc0Var) {
        kc0 kc0Var = this.f39538d;
        synchronized (kc0Var.f46993a) {
            try {
                if (kc0Var.f46994b == 3) {
                    return;
                }
                try {
                    this.f39535a.m3366s(qc0Var);
                } catch (Throwable th) {
                    AbstractC0985a.m5509j("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        AbstractC0985a.m5508i("BillingClient", "Billing service died.");
        try {
            kc0 kc0Var = this.f39538d;
            synchronized (kc0Var.f46993a) {
                z = true;
                if (kc0Var.f46994b != 1) {
                    z = false;
                }
            }
            qfa qfaVar = kc0Var.f47000h;
            if (z) {
                imc imcVarM5610s = C1005p.m5610s();
                imcVarM5610s.m18948b();
                C1005p.m5609r((C1005p) imcVarM5610s.f55715b, 6);
                vnc vncVarM5623q = C1007r.m5623q();
                zzjd zzjdVar = zzjd.BINDING_DIED;
                vncVarM5623q.m18948b();
                C1007r.m5628v((C1007r) vncVarM5623q.f55715b, zzjdVar);
                imcVarM5610s.m14030c(vncVarM5623q);
                nuc nucVarM5520p = C0992d0.m5520p();
                nucVarM5520p.m17617c(false);
                nucVarM5520p.m17618d();
                imcVarM5610s.m14031d(nucVarM5520p);
                qfaVar.m19917q((C1005p) imcVarM5610s.m18947a());
            } else {
                qfaVar.m19923x(C1008s.m5630q());
            }
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
        kc0 kc0Var2 = this.f39538d;
        synchronized (kc0Var2.f46993a) {
            if (kc0Var2.f46994b != 3 && kc0Var2.f46994b != 0) {
                kc0Var2.m15101s(0);
                kc0Var2.m15103u();
                try {
                    this.f39535a.m3365r();
                } catch (Throwable th2) {
                    AbstractC0985a.m5509j("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0985a.m5507h("BillingClient", "Billing service connected.");
        kc0 kc0Var = this.f39538d;
        synchronized (kc0Var.f46993a) {
            try {
                if (kc0Var.f46994b == 3) {
                    return;
                }
                kc0Var.f47001i = mmb.m16924G(iBinder);
                if (kc0.m15082g(new z06(this, 2), 30000L, new RunnableC3468pp(this, 26), kc0Var.m15094l(), kc0Var.m15091f()) == null) {
                    qc0 qc0VarM15097o = kc0Var.m15097o();
                    kc0Var.m15100r(qc0VarM15097o, zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    m12033c(qc0VarM15097o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        AbstractC0985a.m5508i("BillingClient", "Billing service disconnected.");
        try {
            kc0 kc0Var = this.f39538d;
            synchronized (kc0Var.f46993a) {
                z = true;
                if (kc0Var.f46994b != 1) {
                    z = false;
                }
            }
            qfa qfaVar = kc0Var.f47000h;
            if (z) {
                imc imcVarM5610s = C1005p.m5610s();
                imcVarM5610s.m18948b();
                C1005p.m5609r((C1005p) imcVarM5610s.f55715b, 6);
                vnc vncVarM5623q = C1007r.m5623q();
                zzjd zzjdVar = zzjd.SERVICE_DISCONNECTED;
                vncVarM5623q.m18948b();
                C1007r.m5628v((C1007r) vncVarM5623q.f55715b, zzjdVar);
                imcVarM5610s.m14030c(vncVarM5623q);
                nuc nucVarM5520p = C0992d0.m5520p();
                nucVarM5520p.m17617c(false);
                nucVarM5520p.m17618d();
                imcVarM5610s.m14031d(nucVarM5520p);
                qfaVar.m19917q((C1005p) imcVarM5610s.m18947a());
            } else {
                qfaVar.m19925z(C0990c0.m5519q());
            }
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
        kc0 kc0Var2 = this.f39538d;
        synchronized (kc0Var2.f46993a) {
            try {
                upb upbVar = this.f39537c;
                upbVar.f64200c = 0L;
                upbVar.f64199b = false;
                upbVar.m22855a();
                if (kc0Var2.f46994b == 3) {
                    return;
                }
                kc0Var2.m15101s(0);
                try {
                    this.f39535a.m3365r();
                } catch (Throwable th2) {
                    AbstractC0985a.m5509j("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
