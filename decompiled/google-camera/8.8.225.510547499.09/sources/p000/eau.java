package p000;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GyroSample;
import com.google.googlex.gcam.GyroSampleVector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eau implements kng {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f13131a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f13132b;

    public /* synthetic */ eau(GyroSampleVector gyroSampleVector, int i) {
        this.f13132b = i;
        this.f13131a = gyroSampleVector;
    }

    public /* synthetic */ eau(eav eavVar, int i) {
        this.f13132b = i;
        this.f13131a = eavVar;
    }

    public /* synthetic */ eau(List list, int i) {
        this.f13132b = i;
        this.f13131a = list;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p000.kng
    /* JADX INFO: renamed from: a */
    public final void mo6759a(List list) {
        switch (this.f13132b) {
            case 0:
                Object obj = this.f13131a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    knj knjVar = (knj) it.next();
                    eav eavVar = (eav) obj;
                    if (eavVar.f13134b) {
                        eavVar.f13133a.mo7554b(knjVar.f36608f, knjVar.f36609g, knjVar.f36610h, knjVar.f36607e);
                    } else {
                        eavVar.f13133a.mo7554b(knjVar.f36608f, -knjVar.f36609g, -knjVar.f36610h, knjVar.f36607e);
                    }
                }
                break;
            case 1:
                this.f13131a.addAll(list);
                break;
            default:
                Object obj2 = this.f13131a;
                kbc kbcVar = ect.f13400b;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    knj knjVar2 = (knj) it2.next();
                    GyroSample gyroSample = new GyroSample();
                    GcamModuleJNI.GyroSample_timestamp_ns_set(gyroSample.f8283a, gyroSample, knjVar2.f36607e);
                    GcamModuleJNI.GyroSample_x_set(gyroSample.f8283a, gyroSample, knjVar2.f36608f);
                    GcamModuleJNI.GyroSample_y_set(gyroSample.f8283a, gyroSample, knjVar2.f36609g);
                    GcamModuleJNI.GyroSample_z_set(gyroSample.f8283a, gyroSample, knjVar2.f36610h);
                    GyroSampleVector gyroSampleVector = (GyroSampleVector) obj2;
                    GcamModuleJNI.GyroSampleVector_add(gyroSampleVector.f8285a, gyroSampleVector, gyroSample.f8283a, gyroSample);
                }
                break;
        }
    }
}
