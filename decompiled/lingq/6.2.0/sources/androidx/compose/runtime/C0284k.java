package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC3208a;
import p000.cd4;
import p000.kn1;
import p000.nf1;
import p000.nj0;
import p000.sd4;
import p000.un1;
import p000.wm0;
import p000.x48;
import p000.z48;

/* JADX INFO: renamed from: androidx.compose.runtime.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0284k implements un1, x48 {

    /* JADX INFO: renamed from: d */
    public static final wm0 f3788d = new wm0(0);

    /* JADX INFO: renamed from: a */
    public final kn1 f3789a;

    /* JADX INFO: renamed from: b */
    public final C0284k f3790b = this;

    /* JADX INFO: renamed from: c */
    public volatile kn1 f3791c;

    public C0284k(kn1 kn1Var) {
        this.f3789a = kn1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1308a() {
        synchronized (this.f3790b) {
            try {
                kn1 kn1Var = this.f3791c;
                if (kn1Var == null) {
                    this.f3791c = f3788d;
                } else {
                    AbstractC3208a.m15436c(kn1Var, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
        m1308a();
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        m1308a();
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        kn1 kn1VarPlus;
        kn1 kn1Var = this.f3791c;
        if (kn1Var == null || kn1Var == f3788d) {
            nf1 nf1Var = (nf1) this.f3789a.get(nf1.f52669b);
            kn1 z48Var = nf1Var != null ? new z48(nf1Var, this) : EmptyCoroutineContext.f47685a;
            synchronized (this.f3790b) {
                try {
                    kn1 kn1Var2 = this.f3791c;
                    if (kn1Var2 == null) {
                        kn1 kn1Var3 = this.f3789a;
                        kn1VarPlus = kn1Var3.plus(new sd4((cd4) kn1Var3.get(nj0.f52795N))).plus(EmptyCoroutineContext.f47685a).plus(z48Var);
                    } else if (kn1Var2 == f3788d) {
                        kn1 kn1Var4 = this.f3789a;
                        sd4 sd4Var = new sd4((cd4) kn1Var4.get(nj0.f52795N));
                        sd4Var.m15518y(new ForgottenCoroutineScopeException());
                        kn1VarPlus = kn1Var4.plus(sd4Var).plus(EmptyCoroutineContext.f47685a).plus(z48Var);
                    } else {
                        kn1VarPlus = kn1Var2;
                    }
                    this.f3791c = kn1VarPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            kn1Var = kn1VarPlus;
        }
        kn1Var.getClass();
        return kn1Var;
    }
}
