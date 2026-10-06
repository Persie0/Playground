package p000;

import android.content.res.Resources;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hto implements chn {

    /* JADX INFO: renamed from: a */
    public static final nbh f29537a = nbh.m17259h("com/google/android/apps/camera/ui/captureindicator/wirer/FilmstripDataCaptureIndicatorUpdater");

    /* JADX INFO: renamed from: b */
    public final chv f29538b;

    /* JADX INFO: renamed from: c */
    public final Resources f29539c;

    /* JADX INFO: renamed from: d */
    public boolean f29540d;

    /* JADX INFO: renamed from: e */
    private final Consumer f29541e;

    public hto(Consumer consumer, chv chvVar, Resources resources, hah hahVar, jvd jvdVar, dhv dhvVar, cdu cduVar) {
        this.f29541e = consumer;
        this.f29538b = chvVar;
        this.f29539c = resources;
        if (dhvVar.mo6184l(dib.f11305bL)) {
            cduVar.m3529i().m13537d(hahVar.mo10029a(gzy.f27036at).mo3830a(new gmb(this, chvVar, 12), jvdVar));
        }
    }

    @Override // p000.chn
    /* JADX INFO: renamed from: a */
    public final void mo3727a() {
        this.f29541e.accept(new fff(this, 5));
    }
}
