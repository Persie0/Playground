package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cev implements mrf {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f5473a;

    public cev(int i) {
        this.f5473a = i;
    }

    @Override // p000.mrf
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f5473a) {
            case 0:
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    return 0;
                }
                return Integer.valueOf(Math.max(((Integer) mzg.f41839a.m17169e(list)).intValue(), 0));
            case 1:
                return Integer.valueOf(((gss) obj).f26275h);
            case 2:
                gtd gtdVar = (gtd) obj;
                return Boolean.valueOf((((fuo) gtdVar.f26334a).f23595a != gss.CONTINUOUS_PICTURE || ((fuo) gtdVar.f26334a).f23596b == gst.FOCUSED_LOCKED || ((fuo) gtdVar.f26334a).f23596b == gst.NOT_FOCUSED_LOCKED) ? false : true);
            case 3:
                return ((Boolean) obj).booleanValue() ? fxo.m8928b(CaptureRequest.CONTROL_AF_TRIGGER, 1) : fxo.m8931e();
            case 4:
                ArrayList arrayList = new ArrayList();
                for (kpp kppVar : (List) obj) {
                    mrl mrlVarM16766e = mpw.m16766e("Metadata");
                    mrlVarM16766e.m16823b("timestamp", kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP));
                    mrlVarM16766e.m16823b("NR", kppVar.mo9517d(CaptureResult.NOISE_REDUCTION_MODE));
                    mrlVarM16766e.m16823b("EDGE", kppVar.mo9517d(CaptureResult.EDGE_MODE));
                    mrlVarM16766e.m16823b("REEF", kppVar.mo9517d(CaptureResult.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR));
                    mrlVarM16766e.m16823b("Jpeg Qual", kppVar.mo9517d(CaptureResult.JPEG_QUALITY));
                    arrayList.add(mrlVarM16766e.toString());
                }
                return arrayList.toString();
            case 5:
                return ((gbi) obj).mo7626a();
            case 6:
                return ((gbi) obj).mo7627b();
            case 7:
                return Short.valueOf(((kei) obj).f35732i);
            case 8:
                return kyy.f37751a;
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
