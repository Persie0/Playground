package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grj implements gqj {

    /* JADX INFO: renamed from: a */
    public static final nbh f26138a = nbh.m17259h("com/google/android/apps/camera/processing/imagebackend/ImageShadowTaskImpl");

    /* JADX INFO: renamed from: d */
    private static final ExecutorService f26139d = jzn.m13821i("ImgShadowTask");

    /* JADX INFO: renamed from: b */
    public final gqi f26140b;

    /* JADX INFO: renamed from: c */
    public final Runnable f26141c;

    /* JADX INFO: renamed from: e */
    private final gyh f26142e;

    public grj(gyh gyhVar) {
        gqi gqiVar = new gqi();
        gqiVar.m9641e(1);
        this(gqiVar, gyhVar, mqu.f41450a);
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gqr mo7363a() {
        return this.f26142e;
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: b */
    public final String mo7364b() {
        return "ImageShadowTask-".concat(String.valueOf(String.valueOf(this.f26142e.mo9902h())));
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: c */
    public final void mo7365c(kao kaoVar) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: d */
    public final void mo7366d(Context context) {
        gqi gqiVar;
        try {
            f26139d.submit(new gpn(this, 12), null).get(5L, TimeUnit.MINUTES);
            gqiVar = this.f26140b;
        } catch (ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f26138a.m17252c()).mo17283h(e)).mo17276G(3206)).mo17290o("ImageShadowTask failed to complete.");
            gqiVar = this.f26140b;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((nbe) ((nbe) ((nbe) f26138a.m17252c()).mo17283h(e2)).mo17276G(3208)).mo17290o("ImageShadowTask failed because the future was interrupted.");
            gqiVar = this.f26140b;
        } catch (TimeoutException e3) {
            ((nbe) ((nbe) f26138a.m17252c()).mo17276G(3207)).mo17290o("ImageShadowTask failed to complete after 5 minutes.");
            gqiVar = this.f26140b;
        } finally {
            this.f26140b.m9641e(0);
            this.f26140b.m9640d();
        }
        gqiVar.m9641e(0);
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: e */
    public final void mo7367e(kao kaoVar) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: f */
    public final void mo7368f() {
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: g */
    public final void mo7369g() {
    }

    @Override // p000.gqj
    /* JADX INFO: renamed from: h */
    public final void mo9642h() {
        this.f26140b.m9641e(0);
        this.f26140b.m9640d();
    }

    public grj(gqi gqiVar, gyh gyhVar, mrm mrmVar) {
        this.f26140b = gqiVar;
        this.f26142e = gyhVar;
        this.f26141c = (Runnable) mrmVar.mo16812f();
    }
}
