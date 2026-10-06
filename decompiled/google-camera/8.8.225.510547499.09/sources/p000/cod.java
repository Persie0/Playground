package p000;

import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cod implements nph {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f6426a;

    public cod(int i) {
        this.f6426a = i;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f6426a) {
            case 0:
                ((nbe) ((nbe) ((nbe) coe.f6427a.m17251b()).mo17283h(th)).mo17276G((char) 347)).mo17290o("Failed to clear all examples");
                return;
            case 1:
                ((nbe) ((nbe) ((nbe) cmp.f6238a.m17251b()).mo17283h(th)).mo17276G((char) 272)).mo17290o(gBCSQzBeB.WaWfhZvSuO);
                return;
            case 2:
                if (!(th instanceof CancellationException)) {
                    throw new IllegalStateException("Error during photos launch", th);
                }
                ((nbe) ((nbe) ((nbe) dwc.f12703a.m17252c()).mo17283h(th)).mo17276G((char) 1139)).mo17290o("Photos launch was cancelled");
                return;
            case 3:
                Log.w(aJFPpVSaoDO.Aokkiwx, "Cannot close fence, as there was an error retrieving it.", th);
                return;
            default:
                ((nbe) ((nbe) ((nbe) lhi.f38263a.m17252c()).mo17283h(th)).mo17276G((char) 4493)).mo17290o("Failed to add examples");
                return;
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        switch (this.f6426a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((ldb) obj).close();
                break;
            default:
                break;
        }
    }
}
