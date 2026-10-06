package p000;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgb implements cfe {

    /* JADX INFO: renamed from: a */
    public boolean f5556a;

    /* JADX INFO: renamed from: b */
    public final cgc f5557b;

    /* JADX INFO: renamed from: c */
    private long f5558c = 0;

    /* JADX INFO: renamed from: d */
    private ScheduledFuture f5559d;

    /* JADX INFO: renamed from: e */
    private ScheduledExecutorService f5560e;

    /* JADX INFO: renamed from: f */
    private kmq f5561f;

    /* JADX INFO: renamed from: g */
    private final Resources f5562g;

    /* JADX INFO: renamed from: h */
    private final fcp f5563h;

    /* JADX INFO: renamed from: i */
    private final ces f5564i;

    /* JADX INFO: renamed from: j */
    private final jwn f5565j;

    /* JADX INFO: renamed from: k */
    private final jwn f5566k;

    /* JADX INFO: renamed from: l */
    private final jwn f5567l;

    /* JADX INFO: renamed from: m */
    private final dhv f5568m;

    /* JADX INFO: renamed from: n */
    private cfi f5569n;

    /* JADX INFO: renamed from: o */
    private cfk f5570o;

    /* JADX INFO: renamed from: p */
    private final bkn f5571p;

    public cgb(bkn bknVar, cgc cgcVar, Resources resources, fcp fcpVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5571p = bknVar;
        this.f5557b = cgcVar;
        this.f5562g = resources;
        this.f5563h = fcpVar;
        ces cesVar = new ces();
        this.f5564i = cesVar;
        this.f5565j = jwnVar;
        this.f5566k = jwnVar2;
        this.f5567l = jwnVar3;
        this.f5568m = dhvVar;
        this.f5569n = cesVar;
    }

    /* JADX INFO: renamed from: h */
    private final synchronized ScheduledFuture m3618h(long j) {
        if (this.f5560e == null) {
            this.f5560e = jzn.m13828p("scn-dist");
        }
        return this.f5560e.schedule(new cei(this, 5), j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m3619i() {
        cfi cfiVar = this.f5569n;
        if (cfiVar != null) {
            return cfiVar.mo3573c() == 1 || cfiVar.mo3573c() == 2;
        }
        return false;
    }

    @Override // p000.cfe
    /* JADX INFO: renamed from: a */
    public final void mo3594a(kpp kppVar) {
        kmq kmqVar = this.f5561f;
        if ((kmqVar == null || kmqVar != kmq.f36557a) && this.f5557b.mo3592c()) {
            if (this.f5568m.mo6184l(dib.f11351ce) && this.f5556a && ((Float) this.f5567l.mo3831be()).floatValue() <= ((Float) this.f5568m.mo6180h(dib.f11352cf).get()).floatValue() && (!((hnp) this.f5566k.mo3831be()).equals(hnp.OFF) || !((hno) this.f5565j.mo3831be()).equals(hno.INACTIVE))) {
                mo3597c();
                return;
            }
            if (((Boolean) ((jwf) this.f5571p.f3651a).f34942d).booleanValue()) {
                mo3597c();
                return;
            }
            Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return;
            }
            if (num.intValue() == 0) {
                mo3597c();
                return;
            }
            Boolean bool = (Boolean) kppVar.mo9517d(ivt.f32347a);
            if (bool == null) {
                return;
            }
            if (!bool.booleanValue()) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f5558c;
                if (jUptimeMillis < 2000) {
                    this.f5559d = m3618h(2000 - jUptimeMillis);
                    return;
                } else {
                    m3620g();
                    return;
                }
            }
            nbh.f41935b.mo17277H(TimeUnit.SECONDS);
            if (m3619i()) {
                ScheduledFuture scheduledFuture = this.f5559d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    return;
                }
                return;
            }
            cfk cfkVar = this.f5570o;
            if (cfkVar != null) {
                String string = this.f5562g.getString(C0100R.string.advice_scene_distance_message);
                cfi cfiVarM3601a = cfkVar.m3601a(cep.m3570a(string, string, cep.f5464a, true, 0));
                this.f5569n = cfiVarM3601a;
                if (cfiVarM3601a == null || cfiVarM3601a.mo3573c() == 4) {
                    return;
                }
                this.f5558c = SystemClock.uptimeMillis();
                this.f5563h.mo8206z();
            }
        }
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: b */
    public final cfc mo3596b() {
        return this.f5557b;
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: c */
    public final synchronized void mo3597c() {
        m3620g();
        ScheduledExecutorService scheduledExecutorService = this.f5560e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f5560e = null;
        }
        this.f5559d = null;
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: d */
    public final void mo3598d(kmg kmgVar) {
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: e */
    public final void mo3599e(kmd kmdVar) {
        this.f5561f = kmdVar.mo14558k();
        m3620g();
    }

    @Override // p000.cfg
    /* JADX INFO: renamed from: f */
    public final void mo3600f(cfk cfkVar) {
        this.f5570o = cfkVar;
        if (cfkVar == null) {
            this.f5569n = this.f5564i;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3620g() {
        cfi cfiVar = this.f5569n;
        if (cfiVar != null && m3619i()) {
            cfiVar.mo3571a();
        }
    }
}
