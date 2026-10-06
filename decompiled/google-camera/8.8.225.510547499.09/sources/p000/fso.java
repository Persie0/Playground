package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fso implements frl {
    @Override // p000.frl
    /* JADX INFO: renamed from: a */
    public final kpw mo8714a(iay iayVar, YuvWriteView yuvWriteView, kpw kpwVar, ShotMetadata shotMetadata) {
        return new eev(yuvWriteView, ((Long) iayVar.f30191c).longValue());
    }

    @Override // p000.frl
    /* JADX INFO: renamed from: b */
    public final kpw mo8715b(iay iayVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return new kno(hardwareBuffer, ((Long) iayVar.f30191c).longValue());
    }
}
