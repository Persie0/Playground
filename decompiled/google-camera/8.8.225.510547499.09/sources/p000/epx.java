package p000;

import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.modeslider.ModeSlider;
import com.google.android.apps.camera.p014ui.modeslider.ModeSliderUi;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epx implements era, kba {

    /* JADX INFO: renamed from: a */
    public final jww f15057a;

    /* JADX INFO: renamed from: b */
    public ModeSliderUi f15058b;

    /* JADX INFO: renamed from: c */
    public final iax f15059c;

    /* JADX INFO: renamed from: d */
    private final ibj f15060d;

    /* JADX INFO: renamed from: e */
    private final Set f15061e;

    /* JADX INFO: renamed from: f */
    private final jvb f15062f = new jvb();

    /* JADX INFO: renamed from: g */
    private final cdu f15063g;

    public epx(jww jwwVar, ibj ibjVar, Set set, iax iaxVar, cdu cduVar) {
        this.f15057a = jwwVar;
        this.f15060d = ibjVar;
        this.f15061e = new HashSet(set);
        this.f15059c = iaxVar;
        this.f15063g = cduVar;
    }

    @Override // p000.era
    /* JADX INFO: renamed from: a */
    public final void mo7654a(boolean z) {
        if (z) {
            this.f15058b.m4384b().mo4073d();
        } else {
            this.f15058b.m4384b().mo4072c();
        }
    }

    @Override // p000.era
    /* JADX INFO: renamed from: b */
    public final void mo7655b(ilk ilkVar) {
        this.f15058b.m4385c(ilkVar);
    }

    @Override // p000.era
    /* JADX INFO: renamed from: c */
    public final void mo7656c(ViewStub viewStub) {
        if (this.f15058b == null) {
            this.f15058b = (ModeSliderUi) viewStub.inflate().findViewById(C0100R.id.lasagna_mode_slider_ui);
        }
        ibj ibjVar = this.f15060d;
        ModeSliderUi modeSliderUi = this.f15058b;
        ModeSlider modeSliderM4384b = modeSliderUi.m4384b();
        Set set = this.f15061e;
        ibjVar.f30206d = modeSliderUi;
        ibjVar.f30207e = modeSliderM4384b;
        ibjVar.f30208f = set;
        ModeSlider modeSliderM4384b2 = this.f15058b.m4384b();
        modeSliderM4384b2.m4380i(this.f15059c);
        modeSliderM4384b2.f7051a = new epw(this, 0);
        this.f15060d.mo5711f();
        this.f15062f.m13537d(this.f15057a.mo3830a(new dsu(this, 10), not.INSTANCE));
        this.f15063g.m3529i().m13537d(this);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        mo7657d();
        this.f15061e.clear();
        this.f15062f.close();
    }

    @Override // p000.era
    /* JADX INFO: renamed from: d */
    public final void mo7657d() {
        this.f15058b.setAlpha(0.0f);
        this.f15060d.mo10992a();
    }

    @Override // p000.era
    /* JADX INFO: renamed from: e */
    public final void mo7658e() {
        this.f15058b.setAlpha(1.0f);
        this.f15060d.mo10993b();
    }
}
