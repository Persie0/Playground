package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class cfb extends rrb {

    /* JADX INFO: renamed from: a */
    public final kjc f10007a;

    /* JADX INFO: renamed from: b */
    public final C1043b f10008b;

    public cfb(kjc kjcVar) {
        lda.m16130p(kjcVar);
        this.f10007a = kjcVar;
        C1043b c1043b = kjcVar.f47414H;
        kjc.m15279k(c1043b);
        this.f10008b = c1043b;
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: f */
    public final String mo4005f() {
        j0d j0dVar = ((kjc) this.f10008b.f60774a).f47444l;
        kjc.m15279k(j0dVar);
        bzc bzcVar = j0dVar.f44861c;
        if (bzcVar != null) {
            return bzcVar.f9208a;
        }
        return null;
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: g */
    public final void mo4006g(String str, String str2, Bundle bundle) {
        this.f10008b.m5851H(str, str2, bundle);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: l */
    public final long mo4007l() {
        rad radVar = this.f10007a.f47441i;
        kjc.m15278j(radVar);
        return radVar.m20515A0();
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: m */
    public final String mo4008m() {
        j0d j0dVar = ((kjc) this.f10008b.f60774a).f47444l;
        kjc.m15279k(j0dVar);
        bzc bzcVar = j0dVar.f44861c;
        if (bzcVar != null) {
            return bzcVar.f9209b;
        }
        return null;
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: n */
    public final void mo4009n(Bundle bundle) {
        C1043b c1043b = this.f10008b;
        ((kjc) c1043b.f60774a).f47443k.getClass();
        c1043b.m5860Q(bundle, System.currentTimeMillis());
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: o */
    public final void mo4010o(String str) {
        kjc kjcVar = this.f10007a;
        jwb jwbVar = kjcVar.f47415I;
        kjc.m15277i(jwbVar);
        kjcVar.f47443k.getClass();
        jwbVar.m14730F(str, SystemClock.elapsedRealtime());
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: p */
    public final void mo4011p(String str) {
        kjc kjcVar = this.f10007a;
        jwb jwbVar = kjcVar.f47415I;
        kjc.m15277i(jwbVar);
        kjcVar.f47443k.getClass();
        jwbVar.m14729E(str, SystemClock.elapsedRealtime());
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: q */
    public final void mo4012q(String str, String str2, Bundle bundle) {
        C1043b c1043b = this.f10007a.f47414H;
        kjc.m15279k(c1043b);
        c1043b.m5861R(str, str2, bundle);
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: r */
    public final List mo4013r(String str, String str2) {
        C1043b c1043b = this.f10008b;
        kjc kjcVar = (kjc) c1043b.f60774a;
        tic ticVar = kjcVar.f47439g;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(ticVar);
        if (ticVar.m22073J()) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (s46.m21077y()) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        tic ticVar2 = kjcVar.f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.m22077N(atomicReference, 5000L, "get conditional user properties", new jo0(c1043b, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return rad.m20512w0(list);
        }
        kjc.m15280l(xccVar);
        xccVar.f68080f.m17924b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: s */
    public final int mo4014s(String str) {
        C1043b c1043b = this.f10008b;
        c1043b.getClass();
        lda.m16127m(str);
        ((kjc) c1043b.f60774a).getClass();
        return 25;
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: t */
    public final String mo4015t() {
        return (String) this.f10008b.f12329g.get();
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: u */
    public final String mo4016u() {
        return this.f10008b.m5862S();
    }

    @Override // p000.oxc
    /* JADX INFO: renamed from: v */
    public final Map mo4017v(String str, String str2, boolean z) {
        C1043b c1043b = this.f10008b;
        kjc kjcVar = (kjc) c1043b.f60774a;
        tic ticVar = kjcVar.f47439g;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(ticVar);
        if (ticVar.m22073J()) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (s46.m21077y()) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        tic ticVar2 = kjcVar.f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.m22077N(atomicReference, 5000L, "get user properties", new rtc(c1043b, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C3275kv c3275kv = new C3275kv(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                c3275kv.put(zzplVar.f12407b, objZza);
            }
        }
        return c3275kv;
    }
}
