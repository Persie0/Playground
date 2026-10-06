package p000;

import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dvx implements cht, fbn, fbl, fbj, fbo {

    /* JADX INFO: renamed from: b */
    private final dvv f12689b;

    /* JADX INFO: renamed from: c */
    private final FilmstripTransitionLayout f12690c;

    /* JADX INFO: renamed from: d */
    private final chv f12691d;

    /* JADX INFO: renamed from: a */
    public final Set f12688a = new HashSet();

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f12692e = new AtomicBoolean(false);

    public dvx(dvv dvvVar, FilmstripTransitionLayout filmstripTransitionLayout, chv chvVar) {
        this.f12689b = dvvVar;
        this.f12690c = filmstripTransitionLayout;
        this.f12691d = chvVar;
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: a */
    public final kba mo3753a(chs chsVar) {
        this.f12688a.add(chsVar);
        return new cic(this, chsVar, 17);
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f12692e.set(true);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12690c;
        if (filmstripTransitionLayout.f6663b.isStarted()) {
            filmstripTransitionLayout.f6663b.pause();
        }
        if (filmstripTransitionLayout.f6662a.isStarted()) {
            filmstripTransitionLayout.f6662a.pause();
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f12692e.set(false);
        this.f12689b.mo6796c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12690c;
        if (filmstripTransitionLayout.f6663b.isPaused()) {
            filmstripTransitionLayout.f6663b.resume();
        }
        if (filmstripTransitionLayout.f6662a.isPaused()) {
            filmstripTransitionLayout.f6662a.resume();
        }
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f12691d.mo3760bt();
    }

    @Override // p000.ezs
    /* JADX INFO: renamed from: bH */
    public final boolean mo3807bH() {
        return this.f12689b.mo6798e();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12690c;
        if (filmstripTransitionLayout.f6663b.isStarted()) {
            filmstripTransitionLayout.f6665d = true;
            filmstripTransitionLayout.f6663b.cancel();
        }
        if (filmstripTransitionLayout.f6662a.isStarted()) {
            filmstripTransitionLayout.f6664c = true;
            filmstripTransitionLayout.f6662a.cancel();
        }
        this.f12690c.setVisibility(4);
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: f */
    public final void mo3754f() {
        Collection$EL.forEach(this.f12688a, cpf.f8555g);
        this.f12690c.setVisibility(4);
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: g */
    public final void mo3755g() {
        this.f12689b.mo6794a();
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: h */
    public final void mo3756h() {
        Collection$EL.forEach(this.f12688a, cpf.f8556h);
        this.f12689b.mo6795b();
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: i */
    public final boolean mo3757i() {
        return this.f12689b.mo6798e();
    }

    @Override // p000.cht
    /* JADX INFO: renamed from: j */
    public final void mo3758j(chk chkVar) {
        this.f12689b.mo6797d(chkVar);
    }
}
