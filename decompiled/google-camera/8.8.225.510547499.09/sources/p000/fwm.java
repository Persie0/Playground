package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwm extends jxc {

    /* JADX INFO: renamed from: a */
    private final fvu f23751a;

    public fwm(fvu fvuVar, gcx gcxVar, jwn jwnVar) {
        super(jwr.m13632b(gcxVar, jwnVar));
        this.f23751a = fvuVar;
        ((int[]) fvuVar.mo14559l(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)).getClass();
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        gcy gcyVar = (gcy) ((List) obj).get(0);
        if (gcyVar != gcy.ON) {
            return (gcyVar == gcy.AUTO && this.f23751a.mo14541J()) ? 2 : 1;
        }
        if (this.f23751a.mo14541J()) {
            return 3;
        }
        int[] iArr = (int[]) this.f23751a.mo14560m(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, fvu.f36533c);
        int length = iArr.length;
        for (int i = 0; i < length && iArr[i] != 5; i++) {
        }
        return 1;
    }
}
