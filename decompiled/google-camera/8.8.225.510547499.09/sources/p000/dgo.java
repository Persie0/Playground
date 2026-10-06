package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgo extends hel {

    /* JADX INFO: renamed from: a */
    public final Context f10937a;

    /* JADX INFO: renamed from: b */
    public final gvo f10938b;

    /* JADX INFO: renamed from: c */
    public final fcp f10939c;

    /* JADX INFO: renamed from: d */
    public final dgp f10940d;

    /* JADX INFO: renamed from: e */
    public final boolean f10941e;

    /* JADX INFO: renamed from: f */
    public final View.OnClickListener f10942f;

    /* JADX INFO: renamed from: g */
    public final View.OnClickListener f10943g;

    /* JADX INFO: renamed from: h */
    public mrm f10944h;

    /* JADX INFO: renamed from: j */
    private final Resources f10945j;

    /* JADX INFO: renamed from: k */
    private final dtk f10946k;

    public dgo(dgp dgpVar, Context context, gvo gvoVar, mrm mrmVar, fcp fcpVar, ScheduledExecutorService scheduledExecutorService, jfs jfsVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(scheduledExecutorService, jfsVar, "selfie_angle_advice_smarts_chip", null, null, null);
        this.f10942f = new ViewOnClickListenerC0250hu(this, 10);
        this.f10943g = new ViewOnClickListenerC0250hu(this, 11);
        this.f10944h = mqu.f41450a;
        this.f10940d = dgpVar;
        this.f10937a = context;
        this.f10945j = context.getResources();
        this.f10939c = fcpVar;
        lku.m15613H(true);
        this.f10946k = (dtk) ((mrq) mrmVar).f41482a;
        this.f10938b = gvoVar;
        this.f10941e = dhvVar.mo6184l(dhi.f11125l);
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: d */
    protected final hek mo6109d() {
        hej hejVarM10157a = hek.m10157a();
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f10945j.getString(C0100R.string.selfie_angle_message);
        heuVarM10165a.f27493b = this.f10945j.getDrawable(C0100R.drawable.quantum_ic_aspect_ratio_white_24, null);
        dgp dgpVar = this.f10940d;
        dgpVar.getClass();
        heuVarM10165a.f27497f = new dfq(dgpVar, 13);
        heuVarM10165a.m10164e(6000L);
        heuVarM10165a.f27498g = new dfq(this, 14);
        heuVarM10165a.f27494c = new dfq(this, 15);
        dgp dgpVar2 = this.f10940d;
        dgpVar2.getClass();
        heuVarM10165a.f27499h = new dfq(dgpVar2, 16);
        hejVarM10157a.f27464a = heuVarM10165a.m10160a();
        return hejVarM10157a.m10154a();
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: e */
    protected final boolean mo6110e(kpp kppVar) {
        if (this.f10946k.mo6738e()) {
            return false;
        }
        this.f10940d.m6116d(fkg.m8506a(this.f10946k.mo6737d()).f22371b);
        return this.f10940d.m6118f();
    }

    @Override // p000.hel, p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        super.mo3969v();
        this.f10940d.m6117e();
        if (this.f10944h.mo16813g() && this.f10941e) {
            ((dsx) this.f10944h.mo16809c()).m6697l();
        }
    }
}
