package p000;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdr implements gdo {

    /* JADX INFO: renamed from: a */
    private final ViewfinderJankSession f24334a;

    /* JADX INFO: renamed from: b */
    private double f24335b = 33.0d;

    public gdr(ViewfinderJankSession viewfinderJankSession) {
        this.f24334a = viewfinderJankSession;
    }

    @Override // p000.gdo
    /* JADX INFO: renamed from: a */
    public final void mo9080a(kpp kppVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.f24334a;
        viewfinderJankSession.f6955d++;
        double d3 = this.f24335b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 0.5d) {
                synchronized (viewfinderJankSession.f6952a) {
                    if (d4 >= 0.5d) {
                        try {
                            viewfinderJankSession.f6956e++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (d4 >= 1.5d) {
                        viewfinderJankSession.f6957f++;
                    }
                    if (d4 >= 5.0d) {
                        viewfinderJankSession.f6958g++;
                    }
                    if (d4 >= 1.5d) {
                        nje njeVarM4301c = ViewfinderJankSession.m4301c(kppVar, d, d3);
                        viewfinderJankSession.f6954c.add(njeVarM4301c);
                        viewfinderJankSession.m4302a(njeVarM4301c);
                    }
                }
            }
        }
        if (d > 33.0d) {
            double d5 = this.f24335b;
            if (d > d5) {
                this.f24335b = (d + (d5 * 10.0d)) / 11.0d;
            } else {
                this.f24335b = d;
            }
        }
    }
}
