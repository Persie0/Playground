package ac;

import android.os.Bundle;
import android.os.SystemClock;
import cc.C1782b6;
import cc.C1860k3;
import cc.C1879m4;
import cc.C1897o4;
import cc.C1900o7;
import cc.C1930s1;
import cc.C1934s5;
import cc.C1988y5;
import cc.RunnableC1880m5;
import com.google.android.gms.measurement.internal.zzli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p115fb.RunnableC5491g;
import p176ib.C6272i;
import p326q.C8446b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: ac.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0054a extends AbstractC0056c {

    /* JADX INFO: renamed from: a */
    public final C1897o4 f68a;

    /* JADX INFO: renamed from: b */
    public final C1934s5 f69b;

    public C0054a(C1897o4 c1897o4) {
        C6272i.m12915i(c1897o4);
        this.f68a = c1897o4;
        C1934s5 c1934s5 = c1897o4.f10060K;
        C1897o4.m5775j(c1934s5);
        this.f69b = c1934s5;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: c */
    public final long mo213c() {
        C1900o7 c1900o7 = this.f68a.f10089l;
        C1897o4.m5774i(c1900o7);
        return c1900o7.m5834l0();
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: e */
    public final String mo214e() {
        return this.f69b.m5866A();
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: f */
    public final String mo215f() {
        C1782b6 c1782b6 = ((C1897o4) this.f69b.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        C1988y5 c1988y5 = c1782b6.f9685c;
        if (c1988y5 != null) {
            return c1988y5.f10415b;
        }
        return null;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: h */
    public final String mo216h() {
        C1782b6 c1782b6 = ((C1897o4) this.f69b.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        C1988y5 c1988y5 = c1782b6.f9685c;
        if (c1988y5 != null) {
            return c1988y5.f10414a;
        }
        return null;
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: j */
    public final String mo217j() {
        return this.f69b.m5866A();
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: k */
    public final List mo218k(String str, String str2) {
        C1934s5 c1934s5 = this.f69b;
        C1897o4 c1897o4 = (C1897o4) c1934s5.f10430a;
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        boolean zM5755r = c1879m4.m5755r();
        C1860k3 c1860k3 = c1897o4.f10086i;
        if (zM5755r) {
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C8573r0.m16748p1()) {
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C1879m4 c1879m5 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m5);
        c1879m5.m5750m(atomicReference, 5000L, "get conditional user properties", new RunnableC1880m5(c1934s5, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C1900o7.m5802r(list);
        }
        C1897o4.m5776k(c1860k3);
        c1860k3.f9942f.m5624b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: l */
    public final Map mo219l(String str, String str2, boolean z10) {
        C1934s5 c1934s5 = this.f69b;
        C1897o4 c1897o4 = (C1897o4) c1934s5.f10430a;
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        boolean zM5755r = c1879m4.m5755r();
        C1860k3 c1860k3 = c1897o4.f10086i;
        if (zM5755r) {
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C8573r0.m16748p1()) {
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C1879m4 c1879m5 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m5);
        c1879m5.m5750m(atomicReference, 5000L, "get user properties", new RunnableC5491g(c1934s5, atomicReference, str, str2, z10));
        List<zzli> list = (List) atomicReference.get();
        if (list == null) {
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C8446b c8446b = new C8446b(list.size());
        while (true) {
            for (zzli zzliVar : list) {
                Object objM8536q = zzliVar.m8536q();
                if (objM8536q != null) {
                    c8446b.put(zzliVar.f14618b, objM8536q);
                }
            }
            return c8446b;
        }
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: m */
    public final void mo220m(Bundle bundle) {
        C1934s5 c1934s5 = this.f69b;
        ((C1897o4) c1934s5.f10430a).f10058I.getClass();
        c1934s5.m5875s(bundle, System.currentTimeMillis());
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: n */
    public final void mo221n(String str, String str2, Bundle bundle) {
        C1934s5 c1934s5 = this.f69b;
        ((C1897o4) c1934s5.f10430a).f10058I.getClass();
        c1934s5.m5870n(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: o */
    public final void mo222o(String str) {
        C1897o4 c1897o4 = this.f68a;
        C1930s1 c1930s1M5782m = c1897o4.m5782m();
        c1897o4.f10058I.getClass();
        c1930s1M5782m.m5857h(str, SystemClock.elapsedRealtime());
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: p */
    public final void mo223p(String str, String str2, Bundle bundle) {
        C1934s5 c1934s5 = this.f68a.f10060K;
        C1897o4.m5775j(c1934s5);
        c1934s5.m5868l(str, str2, bundle);
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: q */
    public final void mo224q(String str) {
        C1897o4 c1897o4 = this.f68a;
        C1930s1 c1930s1M5782m = c1897o4.m5782m();
        c1897o4.f10058I.getClass();
        c1930s1M5782m.m5858j(str, SystemClock.elapsedRealtime());
    }

    @Override // cc.InterfaceC1943t5
    /* JADX INFO: renamed from: r */
    public final int mo225r(String str) {
        C1934s5 c1934s5 = this.f69b;
        c1934s5.getClass();
        C6272i.m12912f(str);
        ((C1897o4) c1934s5.f10430a).getClass();
        return 25;
    }
}
