package p000;

import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.view.Surface;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjo implements kph {

    /* JADX INFO: renamed from: a */
    private final kka f36284a;

    /* JADX INFO: renamed from: b */
    private final kkk f36285b;

    /* JADX INFO: renamed from: d */
    private final Handler f36287d;

    /* JADX INFO: renamed from: e */
    private final kbz f36288e;

    /* JADX INFO: renamed from: f */
    private final kbo f36289f;

    /* JADX INFO: renamed from: g */
    private final int f36290g;

    /* JADX INFO: renamed from: n */
    private final lpe f36297n;

    /* JADX INFO: renamed from: h */
    private kpi f36291h = null;

    /* JADX INFO: renamed from: i */
    private List f36292i = null;

    /* JADX INFO: renamed from: j */
    private boolean f36293j = false;

    /* JADX INFO: renamed from: k */
    private boolean f36294k = false;

    /* JADX INFO: renamed from: l */
    private boolean f36295l = false;

    /* JADX INFO: renamed from: m */
    private final Map f36296m = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final jvb f36286c = new jvb();

    public kjo(kka kkaVar, kkk kkkVar, Handler handler, kbz kbzVar, kbo kboVar, lpe lpeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i;
        this.f36284a = kkaVar;
        this.f36285b = kkkVar;
        this.f36287d = handler;
        this.f36288e = kbzVar;
        this.f36297n = lpeVar;
        this.f36289f = kboVar.mo6314a("CaptureSessionState");
        synchronized (kiu.class) {
            i = kiu.f36221d;
            kiu.f36221d = i + 1;
        }
        this.f36290g = i;
    }

    /* JADX INFO: renamed from: l */
    private final void m14379l(kpi kpiVar) {
        if (this.f36293j || this.f36286c.mo8995b()) {
            this.f36288e.mo13961e("cameraCaptureSession#close");
            kpiVar.close();
            this.f36288e.mo13962f();
            return;
        }
        m14380m(kpiVar);
        boolean z = false;
        if (!this.f36294k) {
            lku.m15657k(this.f36291h == null);
            this.f36291h = kpiVar;
            return;
        }
        kpi kpiVar2 = this.f36291h;
        if (kpiVar2 == null || kpiVar2 == kpiVar) {
            z = true;
        }
        lku.m15657k(z);
        this.f36291h = kpiVar;
        List list = this.f36292i;
        if (list != null && !list.isEmpty()) {
            m14384c(list);
        }
        this.f36295l = true;
        m14381n();
    }

    /* JADX INFO: renamed from: m */
    private final void m14380m(kpi kpiVar) {
        if (this.f36296m.isEmpty()) {
            return;
        }
        this.f36288e.mo13961e("prepare");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f36296m.entrySet()) {
            Surface surface = (Surface) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            try {
                this.f36289f.mo13944f("Prepare:" + String.valueOf(surface) + " " + iIntValue);
                kpiVar.mo14489g(surface, iIntValue);
            } catch (CameraAccessException e) {
                this.f36289f.mo13948j(rmwTRjObXLGH.kmmH, e);
                arrayList.add(surface);
            }
        }
        this.f36296m.keySet().removeAll(arrayList);
        this.f36289f.mo13944f("Preparing surfaces. Count: " + this.f36296m.size());
        this.f36288e.mo13962f();
    }

    /* JADX INFO: renamed from: n */
    private final void m14381n() {
        if (!this.f36293j && this.f36295l && this.f36294k && this.f36296m.isEmpty()) {
            this.f36288e.mo13961e(IuyLAqNmW.ViMTwMteUZbUF);
            kka kkaVar = this.f36284a;
            kpi kpiVar = this.f36291h;
            lku.m15662p(kpiVar);
            kki kkiVar = new kki(kpiVar instanceof klj ? new kkg((klj) kpiVar, 1) : new kkg(kpiVar, 0), this.f36285b, this.f36287d, this.f36288e, this.f36289f, this.f36297n, null, null, null, null);
            synchronized (kkaVar) {
                kkaVar.f36318b = kkiVar;
                if (!kkaVar.f36322f) {
                    kkaVar.f36319c = null;
                    kiy kiyVarM14406f = kkaVar.m14406f();
                    if (kiyVarM14406f != null) {
                        kiyVarM14406f.mo14325b();
                    }
                    kkaVar.f36317a.mo14325b();
                }
            }
            this.f36288e.mo13962f();
        }
    }

    /* JADX INFO: renamed from: a */
    final jvb m14382a() {
        return this.f36286c.m13536c();
    }

    /* JADX INFO: renamed from: b */
    final void m14383b() {
        kpi kpiVar;
        synchronized (this) {
            kpiVar = this.f36291h;
            this.f36291h = null;
            this.f36292i = null;
            this.f36293j = true;
        }
        if (kpiVar != null) {
            this.f36284a.m14407g();
        }
        this.f36286c.close();
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m14384c(List list) {
        kbz kbzVar;
        if (this.f36293j || this.f36286c.mo8995b()) {
            this.f36289f.mo13944f("Ignoring finalizeOutputConfigurations. " + toString() + " is closed.");
        } else {
            kpi kpiVar = this.f36291h;
            if (kpiVar != null) {
                this.f36288e.mo13961e(toString().concat(xPAWq.bduT));
                try {
                    try {
                        kpiVar.mo14488f(list);
                        this.f36289f.mo13944f("Finalized outputs for " + toString());
                        this.f36285b.m14432a(this, list);
                        this.f36292i = null;
                        kbzVar = this.f36288e;
                    } catch (Throwable th) {
                        this.f36292i = null;
                        this.f36288e.mo13962f();
                        throw th;
                    }
                } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | NullPointerException e) {
                    this.f36289f.mo13947i("WARNING: Failed to finalize outputs for " + list.toString() + ": " + e.getMessage());
                    this.f36292i = null;
                    kbzVar = this.f36288e;
                }
                kbzVar.mo13962f();
                return;
            }
            this.f36292i = list;
        }
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: d */
    public final synchronized void mo14385d(kpi kpiVar) {
        this.f36289f.mo13940b(toString().concat(" is Closed."));
        this.f36286c.m13537d(kpiVar);
        m14389h();
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: e */
    public final synchronized void mo14386e(kpi kpiVar) {
        this.f36289f.mo13947i(toString().concat(" failed to configure."));
        this.f36286c.m13537d(kpiVar);
        m14389h();
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: f */
    public final synchronized void mo14387f(kpi kpiVar) {
        m14379l(kpiVar);
    }

    /* JADX INFO: renamed from: g */
    final synchronized void m14388g() {
        lku.m15657k(!this.f36294k);
        this.f36294k = true;
        kpi kpiVar = this.f36291h;
        if (kpiVar != null) {
            m14379l(kpiVar);
        }
    }

    /* JADX INFO: renamed from: h */
    final void m14389h() {
        kpi kpiVar;
        kbz kbzVar;
        synchronized (this) {
            kpiVar = this.f36291h;
            this.f36291h = null;
            this.f36292i = null;
            this.f36293j = true;
        }
        this.f36284a.m14407g();
        if (kpiVar != null) {
            this.f36288e.mo13961e(toString().concat("#shutdown"));
            try {
                try {
                    this.f36289f.mo13944f(toString() + " shutdown");
                    this.f36288e.mo13961e("RequestProcessor#disconnect");
                    this.f36288e.mo13963g("captureSession#stopRepeating");
                    kpiVar.mo14490h();
                    this.f36288e.mo13963g("captureSession#abortCaptures");
                    kpiVar.mo14487e();
                    kbzVar = this.f36288e;
                } catch (Throwable th) {
                    this.f36288e.mo13962f();
                    this.f36288e.mo13962f();
                    throw th;
                }
            } catch (CameraAccessException | kpf e) {
                this.f36289f.mo13948j("Encountered an error while shutting down " + toString(), e);
                kbzVar = this.f36288e;
            }
            kbzVar.mo13962f();
            this.f36288e.mo13962f();
        }
        this.f36286c.close();
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: i */
    public final synchronized void mo14390i() {
        this.f36289f.mo13940b(toString().concat(" is Active."));
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: j */
    public final synchronized void mo14391j() {
        this.f36289f.mo13940b(toString().concat(" is Ready."));
        kka kkaVar = this.f36284a;
        synchronized (kkaVar) {
            if (!kkaVar.f36322f && kkaVar.f36321e) {
                kiv kivVar = kkaVar.f36319c;
                if (kivVar == null) {
                    kkaVar.f36321e = false;
                    return;
                }
                kkaVar.f36318b = kivVar;
                kkaVar.f36319c = null;
                kkaVar.f36321e = false;
                kkaVar.m14406f();
            }
        }
    }

    @Override // p000.kph
    /* JADX INFO: renamed from: k */
    public final synchronized void mo14392k(Surface surface) {
        this.f36296m.remove(surface);
        this.f36289f.mo13944f("A surface " + String.valueOf(surface) + " is prepared. Remaining: " + this.f36296m.size());
        m14381n();
    }

    public final String toString() {
        return TVkaNXnfP.rQNJalNdA + this.f36290g;
    }
}
