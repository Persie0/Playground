package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpq extends hel {

    /* JADX INFO: renamed from: a */
    public final fly f26007a;

    /* JADX INFO: renamed from: b */
    public final cna f26008b;

    /* JADX INFO: renamed from: c */
    private final Resources f26009c;

    /* JADX INFO: renamed from: d */
    private final jwn f26010d;

    /* JADX INFO: renamed from: e */
    private Rect f26011e;

    public gpq(Resources resources, fly flyVar, jfs jfsVar, jwn jwnVar, ScheduledExecutorService scheduledExecutorService, cna cnaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(scheduledExecutorService, jfsVar, "portrait_smarts_chip", null, null, null);
        this.f26009c = resources;
        this.f26007a = flyVar;
        this.f26010d = jwnVar;
        this.f26008b = cnaVar;
    }

    @Override // p000.hel, p000.her
    /* JADX INFO: renamed from: c */
    public final void mo3952c(kmd kmdVar) {
        super.mo3952c(kmdVar);
        this.f26011e = (Rect) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: d */
    protected final hek mo6109d() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f26009c.getString(C0100R.string.portrait_suggestion_text);
        heuVarM10165a.f27493b = this.f26009c.getDrawable(C0100R.drawable.quantum_gm_ic_portrait_white_24, null);
        heuVarM10165a.f27494c = new gpn(this, 3);
        heuVarM10165a.f27498g = new gpn(this, 4);
        heuVarM10165a.m10164e(5000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        hej hejVarM10157a = hek.m10157a();
        hejVarM10157a.f27464a = hevVarM10160a;
        hejVarM10157a.m10155b(30);
        hejVarM10157a.m10156c(5);
        return hejVarM10157a.m10154a();
    }

    @Override // p000.hel
    /* JADX INFO: renamed from: e */
    protected final boolean mo6110e(kpp kppVar) {
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        if (faceArr == null) {
            return false;
        }
        int i = 0;
        while (true) {
            int length = faceArr.length;
            if (i >= length) {
                return length > 0 && length <= 1 && ((Float) this.f26010d.mo3831be()).floatValue() >= 1.0f;
            }
            Rect bounds = faceArr[i].getBounds();
            float fWidth = bounds.width();
            Rect rect = this.f26011e;
            rect.getClass();
            float fWidth2 = rect.width();
            float fHeight = bounds.height();
            Rect rect2 = this.f26011e;
            rect2.getClass();
            if ((fWidth / fWidth2) * (fHeight / rect2.height()) < 0.05f) {
                return false;
            }
            i++;
        }
    }
}
