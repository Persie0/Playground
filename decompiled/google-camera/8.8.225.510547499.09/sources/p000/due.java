package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class due implements dte {

    /* JADX INFO: renamed from: a */
    public Rect f12586a;

    /* JADX INFO: renamed from: b */
    public cem f12587b;

    /* JADX INFO: renamed from: c */
    public final fya f12588c;

    public due(fya fyaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12588c = fyaVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6753a(kmd kmdVar, cem cemVar) {
        Rect rect = (Rect) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        this.f12586a = rect;
        this.f12587b = cemVar;
    }

    @Override // p000.dte
    /* JADX INFO: renamed from: b */
    public final void mo4009b(key keyVar, kgg kggVar) {
        key keyVarMo7040a = keyVar.mo7040a();
        if (keyVarMo7040a != null) {
            keyVarMo7040a.mo7050k(new dud(this, keyVarMo7040a, kggVar));
        }
    }
}
