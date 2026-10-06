package p000;

import android.content.Intent;
import android.os.PowerManager;
import android.view.Window;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifa implements iey, fbp, fbd, fbn, fbj, fbl, kba, ezx, fac {

    /* JADX INFO: renamed from: b */
    private static final nbh f30592b = nbh.m17259h("com/google/android/apps/camera/ui/screenon/ScreenOnControllerImpl");

    /* JADX INFO: renamed from: c */
    private final Window f30594c;

    /* JADX INFO: renamed from: d */
    private final jvs f30595d;

    /* JADX INFO: renamed from: e */
    private final Runnable f30596e;

    /* JADX INFO: renamed from: f */
    private final Intent f30597f;

    /* JADX INFO: renamed from: g */
    private final PowerManager f30598g;

    /* JADX INFO: renamed from: h */
    private final eoq f30599h;

    /* JADX INFO: renamed from: i */
    private final kba f30600i;

    /* JADX INFO: renamed from: m */
    private final jfs f30604m;

    /* JADX INFO: renamed from: j */
    private boolean f30601j = false;

    /* JADX INFO: renamed from: k */
    private boolean f30602k = true;

    /* JADX INFO: renamed from: l */
    private int f30603l = 1;

    /* JADX INFO: renamed from: a */
    public int f30593a = 1;

    public ifa(final jvd jvdVar, Window window, eoq eoqVar, jfs jfsVar, ScheduledExecutorService scheduledExecutorService, cie cieVar, Intent intent, PowerManager powerManager, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f30594c = window;
        this.f30597f = intent;
        this.f30598g = powerManager;
        this.f30599h = eoqVar;
        this.f30604m = jfsVar;
        this.f30595d = new jvs(scheduledExecutorService, 120000L, TimeUnit.MILLISECONDS);
        this.f30600i = cieVar.m3798a(new cid() { // from class: iez
            @Override // p000.cid
            /* JADX INFO: renamed from: a */
            public final void mo3797a(Throwable th) {
                jvdVar.execute(new idd(this.f30584a, 5));
            }
        });
        this.f30596e = new hri(jvdVar, new idd(this, 6, null), 10);
    }

    /* JADX INFO: renamed from: l */
    private final void m11166l(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("extra_turn_screen_on", false)) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = this.f30598g.newWakeLock(268435466, "camera_screen_on");
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
    }

    /* JADX INFO: renamed from: m */
    private final void m11167m() {
        if (this.f30602k) {
            return;
        }
        m11168k();
    }

    @Override // p000.iey, p000.fac
    /* JADX INFO: renamed from: a */
    public final void mo8077a() {
        if (this.f30603l != 3) {
            mo11165i();
        }
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        m11166l(intent);
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f30602k = true;
        this.f30593a = 1;
        mo11163f();
        m11168k();
        ((kcj) this.f30604m.f33914a).m13975a(1);
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f30602k = false;
        m11168k();
        ((kcj) this.f30604m.f33914a).m13975a(2);
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        mo11165i();
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        mo11165i();
        m11166l(this.f30597f);
        eoq eoqVar = this.f30599h;
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        synchronized (eoqVar.f14895e) {
            eoqVar.f14893c.add(ambientController);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f30601j = true;
        this.f30600i.close();
    }

    @Override // p000.iey
    /* JADX INFO: renamed from: e */
    public final synchronized void mo11162e() {
        if (this.f30601j) {
            ((nbe) ((nbe) f30592b.m17252c()).mo17276G((char) 4223)).mo17290o("session closed. will NOT mute ringtone.");
        } else {
            ((kcj) this.f30604m.f33914a).m13975a(3);
        }
    }

    @Override // p000.iey
    /* JADX INFO: renamed from: f */
    public final synchronized void mo11163f() {
        if (this.f30601j) {
            ((nbe) ((nbe) f30592b.m17252c()).mo17276G((char) 4224)).mo17290o("session closed. will NOT restore ringtone.");
        } else {
            ((kcj) this.f30604m.f33914a).m13975a(2);
        }
    }

    @Override // p000.iey
    /* JADX INFO: renamed from: g */
    public final void mo11164g() {
        this.f30593a = 3;
        m11167m();
    }

    @Override // p000.iey
    /* JADX INFO: renamed from: i */
    public final void mo11165i() {
        this.f30593a = 2;
        m11167m();
    }

    /* JADX INFO: renamed from: k */
    public final void m11168k() {
        jvd.m13538a();
        if (this.f30593a == 1 && this.f30603l != 1) {
            this.f30594c.clearFlags(128);
        }
        if (this.f30593a != 1 && this.f30603l == 1) {
            this.f30594c.addFlags(128);
        }
        this.f30595d.m13585b();
        if (this.f30593a == 2) {
            this.f30595d.execute(this.f30596e);
        }
        this.f30603l = this.f30593a;
    }
}
