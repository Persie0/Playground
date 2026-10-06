package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzm implements fzc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bkn f23978a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23979b;

    public fzm(bkn bknVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23979b = i;
        this.f23978a = bknVar;
    }

    public /* synthetic */ fzm(bkn bknVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23979b = i;
        this.f23978a = bknVar;
    }

    @Override // p000.fzc
    /* JADX INFO: renamed from: a */
    public final fzo mo8968a(fzd fzdVar) {
        switch (this.f23979b) {
            case 0:
                C1058va c1058vaM2576Z = this.f23978a.m2576Z(fzdVar);
                ArrayList arrayList = new ArrayList();
                fzn.m8979b("legacy", c1058vaM2576Z.m19498z(2), arrayList);
                return fzn.m8978a("legacy", arrayList);
            case 1:
                bkn bknVar = this.f23978a;
                C1058va c1058vaM2576Z2 = bknVar.m2576Z(fzdVar);
                ArrayList arrayList2 = new ArrayList();
                fzn.m8979b("single image", c1058vaM2576Z2.m19494v(), arrayList2);
                fzn.m8979b("limited or full", c1058vaM2576Z2.m19498z(0, 1, 3), arrayList2);
                fzn.m8979b("hw jpeg, sw jpeg, reprocessing", c1058vaM2576Z2.m19497y(fzf.HW_JPEG, fzf.SW_JPEG, fzf.REPROCESSING), arrayList2);
                fzn.m8979b("flash fired", ((bkn) c1058vaM2576Z2.f47804c).m2579ab().m2562L(CaptureResult.FLASH_STATE, 3), arrayList2);
                fzn.m8979b("edge", c1058vaM2576Z2.m19492t(), arrayList2);
                fzn.m8979b("noise reduction", c1058vaM2576Z2.m19495w(), arrayList2);
                fzn.m8979b("af converged", ((bkn) c1058vaM2576Z2.f47804c).m2579ab().m2563M(CaptureResult.CONTROL_AF_STATE, 2, 6, 0, 4, 5), arrayList2);
                int[] iArr = (int[]) ((kmr) bknVar.f3651a).mo14559l(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
                if (iArr != null && iArr.length > 1) {
                    fzn.m8979b(CswIK.fTbDIPRYvVtqX, c1058vaM2576Z2.m19496x(Integer.class, CaptureResult.COLOR_CORRECTION_ABERRATION_MODE, 0, mxk.m17137I(1, 2), mxk.m17137I(1, 2)), arrayList2);
                }
                return fzn.m8978a("flash", arrayList2);
            case 2:
                C1058va c1058vaM2576Z3 = this.f23978a.m2576Z(fzdVar);
                ArrayList arrayList3 = new ArrayList();
                fzn.m8979b("single image", c1058vaM2576Z3.m19494v(), arrayList3);
                fzn.m8979b("limited or full", c1058vaM2576Z3.m19498z(0, 1, 3), arrayList3);
                fzn.m8979b("hw_jpeg, sw_jpeg, reprocessing", c1058vaM2576Z3.m19497y(fzf.HW_JPEG, fzf.SW_JPEG, fzf.REPROCESSING), arrayList3);
                fzn.m8979b("flash off", c1058vaM2576Z3.m19493u(), arrayList3);
                fzn.m8979b("edge", c1058vaM2576Z3.m19492t(), arrayList3);
                fzn.m8979b("noise reduction", c1058vaM2576Z3.m19495w(), arrayList3);
                return fzn.m8978a("regular", arrayList3);
            default:
                C1058va c1058vaM2576Z4 = this.f23978a.m2576Z(fzdVar);
                ArrayList arrayList4 = new ArrayList();
                fzn.m8979b("single image", c1058vaM2576Z4.m19494v(), arrayList4);
                fzn.m8979b("limited or full", c1058vaM2576Z4.m19498z(0, 1), arrayList4);
                fzn.m8979b("processing method", c1058vaM2576Z4.m19497y(fzf.NPF_REPROCESSING), arrayList4);
                fzn.m8979b("flash off", c1058vaM2576Z4.m19493u(), arrayList4);
                return fzn.m8978a("npf reprocessing", arrayList4);
        }
    }
}
