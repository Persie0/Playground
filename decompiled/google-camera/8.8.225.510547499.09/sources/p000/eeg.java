package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eeg implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f13642a;

    public eeg(int i) {
        this.f13642a = i;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f13642a) {
            case 0:
                return new jwf(Float.valueOf(-999.0f));
            case 1:
                return new jwf(false);
            case 2:
                return new bko((int[]) null);
            case 3:
                return new jwf(false);
            case 4:
                return new jwf(true);
            case 5:
                return new jwf(false);
            case 6:
                return new jwf(false);
            case 7:
                Object objM17136H = fdh.m8268h() ? mxk.m17136H(fxo.m8928b(ivt.f32353g, 0)) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 8:
                return new jwf(false);
            case 9:
                return new jwf(true);
            case 10:
                return nqf.m17621g();
            case 11:
                return mqu.f41450a;
            case 12:
                return kgq.m14215e(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1);
            case 13:
                Object objM17136H2 = ivw.f32424j != null ? mxk.m17136H(kgq.m14215e(ivw.f32424j, true)) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 14:
                Object objM17136H3 = ivx.f32445h != null ? mxk.m17136H(kgq.m14215e(ivx.f32445h, false)) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 15:
                return new cwd((byte[]) null, (char[]) null);
            case 16:
                return new ejd();
            case 17:
                Set setSynchronizedSet = Collections.synchronizedSet(new HashSet());
                setSynchronizedSet.getClass();
                return setSynchronizedSet;
            case 18:
                return new jvb();
            case 19:
                return gtd.m9736s();
            default:
                return gtd.m9735q();
        }
    }
}
