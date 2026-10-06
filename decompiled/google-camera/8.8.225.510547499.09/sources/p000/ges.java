package p000;

import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ges implements kba {

    /* JADX INFO: renamed from: a */
    public static final gfc f24424a = gfc.TIMER_ZERO_SECONDS;

    /* JADX INFO: renamed from: b */
    public static final mtz f24425b = mwh.m17063c(gfc.TIMER_ZERO_SECONDS, gzp.OFF, gfc.TIMER_THREE_SECONDS, gzp.THREE, gfc.TIMER_TEN_SECONDS, gzp.TEN, gfc.TIMER_AUTO, gzp.AUTO);

    /* JADX INFO: renamed from: c */
    public final jww f24426c;

    /* JADX INFO: renamed from: d */
    public final Executor f24427d;

    /* JADX INFO: renamed from: e */
    public final jvb f24428e;

    /* JADX INFO: renamed from: f */
    public final jwn f24429f;

    /* JADX INFO: renamed from: g */
    public final iuj f24430g;

    /* JADX INFO: renamed from: h */
    public ggg f24431h;

    /* JADX INFO: renamed from: i */
    public TimerWidget f24432i;

    /* JADX INFO: renamed from: j */
    private final msi f24433j;

    public ges(jww jwwVar, Executor executor, msi msiVar, jwn jwnVar, cdu cduVar, iuj iujVar) {
        this.f24428e = cduVar.m3529i().m13536c();
        this.f24426c = jwwVar;
        this.f24427d = executor;
        this.f24433j = msiVar;
        this.f24429f = jwnVar;
        this.f24430g = iujVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9143a(boolean z) {
        this.f24432i.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(300L).setInterpolator(new akf()).withStartAction(new bnp(this, z, 13)).withEndAction(new bnp(this, z, 14)).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m9144b() {
        if (!m9145c()) {
            this.f24432i.setVisibility(8);
        } else if (hzk.m10914b((ikw) this.f24429f.mo3831be())) {
            this.f24432i.setVisibility(0);
        } else {
            this.f24432i.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9145c() {
        return this.f24433j.mo6051a() != null && ((hzp) this.f24433j.mo6051a()).f30074a.f30073i.equals(hzj.f30014d);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f24428e.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m9146d() {
        m9143a(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m9147e() {
        if (m9145c() && hzk.m10914b((ikw) this.f24429f.mo3831be())) {
            m9143a(true);
        }
    }
}
