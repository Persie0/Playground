package cc;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C2550e;
import com.google.android.gms.common.C2551f;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p115fb.RunnableC5494j;
import p152hb.RunnableC5952a2;
import p176ib.C6272i;
import p260m8.C7499b;
import p262mb.C7533f;
import p289o5.RunnableC7933m;

/* JADX INFO: renamed from: cc.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1987y4 extends AbstractBinderC1770a3 {

    /* JADX INFO: renamed from: a */
    public final C1846i7 f10411a;

    /* JADX INFO: renamed from: b */
    public Boolean f10412b;

    /* JADX INFO: renamed from: c */
    public String f10413c;

    public BinderC1987y4(C1846i7 c1846i7) {
        C6272i.m12915i(c1846i7);
        this.f10411a = c1846i7;
        this.f10413c = null;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: A0 */
    public final List mo5498A0(String str, String str2, boolean z10, zzq zzqVar) {
        m5925b1(zzqVar);
        String str3 = zzqVar.f14638a;
        C6272i.m12915i(str3);
        C1846i7 c1846i7 = this.f10411a;
        try {
            List<C1882m7> list = (List) c1846i7.mo5518f().m5751n(new CallableC1915q4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1882m7 c1882m7 : list) {
                if (z10 || !C1900o7.m5792V(c1882m7.f10015c)) {
                    arrayList.add(new zzli(c1882m7));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            C1860k3 c1860k3Mo5517e = c1846i7.mo5517e();
            c1860k3Mo5517e.f9942f.m5625c(C1860k3.m5700q(str3), e10, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: C0 */
    public final void mo5499C0(zzli zzliVar, zzq zzqVar) {
        C6272i.m12915i(zzliVar);
        m5925b1(zzqVar);
        m5927h0(new RunnableC1906p4(this, zzliVar, zzqVar, 1));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: E */
    public final byte[] mo5500E(zzaw zzawVar, String str) {
        C6272i.m12912f(str);
        C6272i.m12915i(zzawVar);
        m5926d1(str, true);
        C1846i7 c1846i7 = this.f10411a;
        C1860k3 c1860k3Mo5517e = c1846i7.mo5517e();
        C1897o4 c1897o4 = c1846i7.f9902l;
        C1815f3 c1815f3 = c1897o4.f10057H;
        String str2 = zzawVar.f14613a;
        c1860k3Mo5517e.f9937H.m5624b(c1815f3.m5603d(str2), "Log and bundle. event");
        ((C7499b) c1846i7.mo5514b()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        C1879m4 c1879m4Mo5518f = c1846i7.mo5518f();
        CallableC1960v4 callableC1960v4 = new CallableC1960v4(this, zzawVar, str);
        c1879m4Mo5518f.m5492j();
        C1861k4 c1861k4 = new C1861k4(c1879m4Mo5518f, callableC1960v4, true);
        if (Thread.currentThread() == c1879m4Mo5518f.f9993c) {
            c1861k4.run();
        } else {
            c1879m4Mo5518f.m5756s(c1861k4);
        }
        try {
            byte[] bArr = (byte[]) c1861k4.get();
            if (bArr == null) {
                c1846i7.mo5517e().f9942f.m5624b(C1860k3.m5700q(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((C7499b) c1846i7.mo5514b()).getClass();
            c1846i7.mo5517e().f9937H.m5626d("Log and bundle processed. event, size, time_ms", c1897o4.f10057H.m5603d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            C1860k3 c1860k3Mo5517e2 = c1846i7.mo5517e();
            c1860k3Mo5517e2.f9942f.m5626d("Failed to log and bundle. appId, event, error", C1860k3.m5700q(str), c1897o4.f10057H.m5603d(str2), e10);
            return null;
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: F0 */
    public final void mo5501F0(zzq zzqVar) {
        C6272i.m12912f(zzqVar.f14638a);
        m5926d1(zzqVar.f14638a, false);
        m5927h0(new RunnableC1951u4(this, zzqVar, 0));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: J0 */
    public final void mo5502J0(zzac zzacVar, zzq zzqVar) {
        C6272i.m12915i(zzacVar);
        C6272i.m12915i(zzacVar.f14603c);
        m5925b1(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f14601a = zzqVar.f14638a;
        m5927h0(new RunnableC1906p4(this, zzacVar2, zzqVar, 0));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: K */
    public final String mo5503K(zzq zzqVar) {
        m5925b1(zzqVar);
        C1846i7 c1846i7 = this.f10411a;
        try {
            return (String) c1846i7.mo5518f().m5751n(new CallableC1810e7(c1846i7, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            C1860k3 c1860k3Mo5517e = c1846i7.mo5517e();
            c1860k3Mo5517e.f9942f.m5625c(C1860k3.m5700q(zzqVar.f14638a), e10, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: O */
    public final List mo5504O(String str, String str2, String str3) {
        m5926d1(str, true);
        C1846i7 c1846i7 = this.f10411a;
        try {
            return (List) c1846i7.mo5518f().m5751n(new CallableC1942t4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            c1846i7.mo5517e().f9942f.m5624b(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m5925b1(zzq zzqVar) {
        C6272i.m12915i(zzqVar);
        String str = zzqVar.f14638a;
        C6272i.m12912f(str);
        m5926d1(str, false);
        this.f10411a.m5645P().m5813I(zzqVar.f14639b, zzqVar.f14628L);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d1 */
    public final void m5926d1(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C1846i7 c1846i7 = this.f10411a;
        if (zIsEmpty) {
            c1846i7.mo5517e().f9942f.m5623a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f10412b == null) {
                    this.f10412b = Boolean.valueOf("com.google.android.gms".equals(this.f10413c) || C7533f.m15045a(c1846i7.f9902l.f10076a, Binder.getCallingUid()) || C2551f.m7592a(c1846i7.f9902l.f10076a).m7595b(Binder.getCallingUid()));
                }
                if (this.f10412b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                c1846i7.mo5517e().f9942f.m5624b(C1860k3.m5700q(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f10413c == null && C2550e.uidHasPackageName(c1846i7.f9902l.f10076a, Binder.getCallingUid(), str)) {
            this.f10413c = str;
        }
        if (str.equals(this.f10413c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: f0 */
    public final void mo5505f0(zzaw zzawVar, zzq zzqVar) {
        C6272i.m12915i(zzawVar);
        m5925b1(zzqVar);
        m5927h0(new RunnableC5952a2(1, this, zzawVar, zzqVar));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5927h0(Runnable runnable) {
        C1846i7 c1846i7 = this.f10411a;
        if (c1846i7.mo5518f().m5755r()) {
            runnable.run();
        } else {
            c1846i7.mo5518f().m5753p(runnable);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5928j(zzaw zzawVar, zzq zzqVar) {
        C1846i7 c1846i7 = this.f10411a;
        c1846i7.m5647a();
        c1846i7.m5650i(zzawVar, zzqVar);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: k0 */
    public final void mo5506k0(zzq zzqVar) {
        m5925b1(zzqVar);
        m5927h0(new RunnableC1951u4(this, zzqVar, 1));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: l0 */
    public final List mo5507l0(String str, String str2, zzq zzqVar) {
        m5925b1(zzqVar);
        String str3 = zzqVar.f14638a;
        C6272i.m12915i(str3);
        C1846i7 c1846i7 = this.f10411a;
        try {
            return (List) c1846i7.mo5518f().m5751n(new CallableC1933s4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            c1846i7.mo5517e().f9942f.m5624b(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: o0 */
    public final void mo5508o0(long j10, String str, String str2, String str3) {
        m5927h0(new RunnableC1978x4(this, str2, str3, str, j10));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: q */
    public final void mo5509q(zzq zzqVar) {
        m5925b1(zzqVar);
        m5927h0(new RunnableC5494j(this, zzqVar, 1));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: v */
    public final void mo5510v(Bundle bundle, zzq zzqVar) {
        m5925b1(zzqVar);
        String str = zzqVar.f14638a;
        C6272i.m12915i(str);
        m5927h0(new RunnableC1994z3(this, str, bundle));
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: x0 */
    public final void mo5511x0(zzq zzqVar) {
        C6272i.m12912f(zzqVar.f14638a);
        C6272i.m12915i(zzqVar.f14633Q);
        RunnableC7933m runnableC7933m = new RunnableC7933m(this, zzqVar, 3);
        C1846i7 c1846i7 = this.f10411a;
        if (c1846i7.mo5518f().m5755r()) {
            runnableC7933m.run();
        } else {
            c1846i7.mo5518f().m5754q(runnableC7933m);
        }
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: y */
    public final List mo5512y(String str, String str2, String str3, boolean z10) {
        m5926d1(str, true);
        C1846i7 c1846i7 = this.f10411a;
        try {
            List<C1882m7> list = (List) c1846i7.mo5518f().m5751n(new CallableC1924r4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            while (true) {
                for (C1882m7 c1882m7 : list) {
                    if (z10 || !C1900o7.m5792V(c1882m7.f10015c)) {
                        arrayList.add(new zzli(c1882m7));
                    }
                }
                return arrayList;
            }
        } catch (InterruptedException | ExecutionException e10) {
            C1860k3 c1860k3Mo5517e = c1846i7.mo5517e();
            c1860k3Mo5517e.f9942f.m5625c(C1860k3.m5700q(str), e10, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }
}
