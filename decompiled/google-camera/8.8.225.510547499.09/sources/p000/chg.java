package p000;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chg implements bnm, chu {

    /* JADX INFO: renamed from: a */
    public static final nbh f5729a = nbh.m17259h("com/google/android/apps/camera/app/LegacyCameraController");

    /* JADX INFO: renamed from: b */
    public final Handler f5730b;

    /* JADX INFO: renamed from: c */
    public bnm f5731c;

    /* JADX INFO: renamed from: d */
    public bnq f5732d;

    /* JADX INFO: renamed from: e */
    public kmg f5733e = null;

    /* JADX INFO: renamed from: f */
    public final HashSet f5734f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final chf f5735g;

    /* JADX INFO: renamed from: h */
    private final kcu f5736h;

    /* JADX INFO: renamed from: i */
    private final kme f5737i;

    /* JADX INFO: renamed from: j */
    private final DevicePolicyManager f5738j;

    /* JADX INFO: renamed from: k */
    private final Executor f5739k;

    /* JADX INFO: renamed from: l */
    private final Semaphore f5740l;

    /* JADX INFO: renamed from: m */
    private bod f5741m;

    /* JADX INFO: renamed from: n */
    private final bog f5742n;

    /* JADX INFO: renamed from: o */
    private final AmbientDelegate f5743o;

    public chg(Handler handler, chf chfVar, kcu kcuVar, kme kmeVar, AmbientDelegate ambientDelegate, DevicePolicyManager devicePolicyManager, Executor executor, Semaphore semaphore, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bnm bnmVar;
        esj esjVar = new esj(this, 1);
        this.f5742n = esjVar;
        this.f5730b = handler;
        this.f5735g = chfVar;
        this.f5738j = devicePolicyManager;
        this.f5743o = ambientDelegate;
        this.f5736h = kcuVar;
        this.f5737i = kmeVar;
        this.f5739k = executor;
        this.f5740l = semaphore;
        bod bodVarM3668a = chfVar.m3668a();
        this.f5741m = bodVarM3668a;
        if (bodVarM3668a == null && (bnmVar = this.f5731c) != null) {
            bnmVar.mo2771c(-1, "GETTING_CAMERA_INFO");
        }
        chfVar.m3670c(new boh(esjVar, handler));
    }

    /* JADX INFO: renamed from: n */
    private final void m3672n(chf chfVar, kmg kmgVar, Handler handler, bnm bnmVar) throws InterruptedException {
        try {
            if (this.f5738j.getCameraDisabled(null)) {
                throw new dob();
            }
            this.f5740l.acquire();
            chfVar.m3669b(handler, kmgVar.m14576a(), bnmVar);
        } catch (dob e) {
            handler.post(new cgl(bnmVar, kmgVar, 6));
        }
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: a */
    public final void mo2769a(int i) {
        bnm bnmVar = this.f5731c;
        if (bnmVar != null) {
            bnmVar.mo2769a(i);
        }
        m3679k();
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: b */
    public final synchronized void mo2770b(bnq bnqVar) {
        int iMo2716a = bnqVar.mo2716a();
        kmg kmgVar = this.f5733e;
        int iM14576a = kmgVar != null ? kmgVar.m14576a() : -1;
        if (iM14576a != iMo2716a) {
            m3681m(false);
            return;
        }
        if (bnqVar.mo2722g().m2800a() != 1) {
            bnq bnqVar2 = this.f5732d;
            if (bnqVar2 != null && bnqVar2.mo2716a() != iMo2716a) {
                m3681m(false);
            }
            this.f5733e = null;
            this.f5732d = bnqVar;
            bnm bnmVar = this.f5731c;
            if (bnmVar != null) {
                bnmVar.mo2770b(bnqVar);
            }
        } else {
            bnm bnmVar2 = this.f5731c;
            if (bnmVar2 != null) {
                bnmVar2.mo2771c(iMo2716a, pIeXJQLZLfgIN.ZKA + iM14576a + " opened, but in UNOPENED state");
            }
        }
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: c */
    public final void mo2771c(int i, String str) {
        bnm bnmVar = this.f5731c;
        if (bnmVar != null) {
            bnmVar.mo2771c(i, str);
        }
        m3679k();
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: d */
    public final void mo2772d(int i, String str) {
        m3675g(i);
        bnm bnmVar = this.f5731c;
        if (bnmVar != null) {
            bnmVar.mo2772d(i, str);
        }
        m3679k();
    }

    @Override // p000.chu
    /* JADX INFO: renamed from: e */
    public final int mo3673e() {
        bod bodVar = this.f5741m;
        if (bodVar == null) {
            return -1;
        }
        return bodVar.mo2714a();
    }

    @Override // p000.chu
    /* JADX INFO: renamed from: f */
    public final boc mo3674f(int i) {
        bod bodVar = this.f5741m;
        if (bodVar == null) {
            return null;
        }
        return bodVar.mo2715b(i);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3675g(int i) {
        kmg kmgVar = this.f5733e;
        if (kmgVar != null) {
            kmgVar.m14576a();
        }
        kmg kmgVar2 = this.f5733e;
        if (kmgVar2 != null && kmgVar2.m14576a() == i) {
            this.f5733e = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m3676h() {
        kmg kmgVar = this.f5733e;
        if (kmgVar == null) {
            ((nbe) ((nbe) f5729a.m17252c()).mo17276G((char) 149)).mo17290o("doRequestCamera: might be interrupted by early release. return");
            return;
        }
        this.f5743o.m1587R(kmgVar);
        chf chfVar = this.f5735g;
        chfVar.getClass();
        bnq bnqVar = this.f5732d;
        if (bnqVar == null) {
            m3672n(chfVar, kmgVar, this.f5730b, this);
        } else if (bnqVar.mo2716a() != kmgVar.m14576a()) {
            m3681m(false);
            m3672n(this.f5735g, kmgVar, this.f5730b, this);
        } else {
            try {
                bnqVar.mo2723h().m2806a(new bmj(bnqVar, this.f5730b, this, 5));
            } catch (RuntimeException e) {
                bnqVar.mo2719d().mo2744c().mo2759c(e);
            }
        }
        this.f5741m = this.f5735g.m3668a();
    }

    @Override // p000.chu
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo3677i() {
        int iMo3673e = mo3673e();
        if (iMo3673e != -1) {
            mo3678j(iMo3673e);
        }
    }

    @Override // p000.chu
    /* JADX INFO: renamed from: j */
    public final void mo3678j(int i) {
        m3675g(i);
        bnq bnqVar = this.f5732d;
        if (bnqVar == null) {
            ((nbe) ((nbe) f5729a.m17252c()).mo17276G(153)).mo17291p("releaseCamera: Try to release a not-yet-available camera(%s). Wait till it's available", i);
            return;
        }
        int iMo2716a = bnqVar.mo2716a();
        if (iMo2716a != i) {
            ((nbe) ((nbe) f5729a.m17252c()).mo17276G(152)).mo17294s("releaseCamera: Try to release a camera that is not opened. current=%s id=%s", iMo2716a, i);
            return;
        }
        AmbientDelegate ambientDelegate = this.f5743o;
        kmg kmgVarMo13856c = this.f5737i.mo13856c(i);
        synchronized (ambientDelegate.f1686b) {
            Object obj = ambientDelegate.f1685a;
            if (obj != null && ((kmg) obj).equals(kmgVarMo13856c)) {
                ambientDelegate.f1685a = null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3679k() {
        if (this.f5740l.availablePermits() == 0) {
            this.f5740l.release();
        }
    }

    @Override // p000.chu
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo3680l() {
        int iMo3673e = mo3673e();
        if (iMo3673e != -1) {
            kmg kmgVarMo13856c = this.f5737i.mo13856c(iMo3673e);
            synchronized (this) {
                kmg kmgVar = this.f5733e;
                if (kmgVar != null) {
                    if (kmgVar.equals(kmgVarMo13856c)) {
                        return;
                    } else {
                        mo3678j(this.f5733e.m14576a());
                    }
                }
                this.f5733e = kmgVarMo13856c;
                this.f5736h.mo13984a();
                this.f5739k.execute(new bbt(this, iMo3673e, 6));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3681m(boolean z) {
        chf chfVar = this.f5735g;
        chfVar.getClass();
        chfVar.m3671d(z);
        m3679k();
    }
}
