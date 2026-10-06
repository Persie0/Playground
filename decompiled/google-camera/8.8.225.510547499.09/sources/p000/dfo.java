package p000;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfo implements kos {

    /* JADX INFO: renamed from: a */
    public final ggm f10794a;

    /* JADX INFO: renamed from: b */
    public final jwn f10795b;

    /* JADX INFO: renamed from: c */
    public boolean f10796c = false;

    /* JADX INFO: renamed from: d */
    public boolean f10797d = true;

    /* JADX INFO: renamed from: e */
    public mrm f10798e = mqu.f41450a;

    /* JADX INFO: renamed from: f */
    public final cdu f10799f;

    public dfo(ggm ggmVar, cdu cduVar, jwn jwnVar) {
        this.f10799f = cduVar;
        this.f10794a = ggmVar;
        this.f10795b = jwnVar;
    }

    /* JADX INFO: renamed from: e */
    static final kba m6076e(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        return new dev(scheduledExecutorService.scheduleAtFixedRate(runnable, 0L, 33L, TimeUnit.MILLISECONDS), 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m6077a() {
        this.f10797d = false;
        if (this.f10798e.mo16813g()) {
            CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) this.f10798e.mo16809c();
            if (cameraCoachHudView.f6591b.mo16813g()) {
                cameraCoachHudView.post(new dfq(cameraCoachHudView, 2));
            }
            if (cameraCoachHudView.f6592c.mo16813g()) {
                cameraCoachHudView.post(new dfq(cameraCoachHudView, 3));
            }
            if (cameraCoachHudView.f6593d.mo16813g()) {
                cameraCoachHudView.post(new dfq(cameraCoachHudView, 4));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6078b() {
        this.f10797d = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6079c(boolean z) {
        if (this.f10798e.mo16813g()) {
            ((CameraCoachHudView) this.f10798e.mo16809c()).f6594e = z;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6080d() {
        this.f10796c = true;
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        if (this.f10798e.mo16813g()) {
            ((CameraCoachHudView) this.f10798e.mo16809c()).f6590a = kayVar.f35503e;
        }
    }
}
