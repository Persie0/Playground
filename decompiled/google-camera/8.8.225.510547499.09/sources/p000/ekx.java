package p000;

import com.google.android.apps.camera.imax.cyclops.image.CyclopsPhotoWriter;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.geo.lightfield.processing.ProgressCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekx implements ekw {
    static {
        System.loadLibrary("cyclops");
    }

    @Override // p000.ekw
    /* JADX INFO: renamed from: a */
    public final void mo7429a(StereoPanorama stereoPanorama, String str, ProgressCallback progressCallback) {
        progressCallback.setProgress(0.2f);
        CyclopsPhotoWriter.writeToFile(stereoPanorama.f6738a, stereoPanorama.f6739b, stereoPanorama.f6740c, stereoPanorama.f6741d, str);
    }
}
