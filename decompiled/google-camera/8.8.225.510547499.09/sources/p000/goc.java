package p000;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25846a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25847b;

    public goc(oju ojuVar, int i) {
        this.f25847b = i;
        this.f25846a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static goc m9573a(oju ojuVar) {
        return new goc(ojuVar, 11);
    }

    /* JADX INFO: renamed from: b */
    public static goc m9574b(oju ojuVar) {
        return new goc(ojuVar, 17);
    }

    /* JADX INFO: renamed from: c */
    public static goc m9575c(oju ojuVar) {
        return new goc(ojuVar, 19);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f25847b) {
            case 0:
                dhv dhvVar = (dhv) this.f25846a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6177e();
                return cdw.f5366g;
            case 1:
                return new klv((goa) this.f25846a.get(), 1);
            case 2:
                goy.m9590c((dhv) this.f25846a.get());
                return new god() { // from class: gob
                    @Override // p000.god
                    /* JADX INFO: renamed from: a */
                    public final nlj mo9572a() {
                        return nlj.f43528d;
                    }
                };
            case 3:
                return new goq((kfk) this.f25846a.get());
            case 4:
                gpu gpuVar = (gpu) enc.m7545a(this.f25846a);
                gpuVar.getClass();
                return gpuVar;
            case 5:
                gpw gpwVar = (gpw) enc.m7545a(this.f25846a);
                gpwVar.getClass();
                return gpwVar;
            case 6:
                gpx gpxVar = (gpx) enc.m7545a(this.f25846a);
                gpxVar.getClass();
                return gpxVar;
            case 7:
                return new gdt(((Integer) ((dhv) this.f25846a.get()).mo6173a(dio.f11659a).get()).intValue());
            case 8:
                return new jvt(new jvs((ScheduledExecutorService) this.f25846a.get(), 10L, TimeUnit.SECONDS));
            case 9:
                new gsh();
                dhv dhvVar2 = (dhv) this.f25846a.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6176d();
                return new gsh();
            case 10:
                return new gtj((gti) this.f25846a.get(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
            case 11:
                return new gtq(((fkq) this.f25846a).get());
            case 12:
                return new djm((guq) this.f25846a.get());
            case 13:
                dhv dhvVar3 = (dhv) this.f25846a.get();
                dhx dhxVar3 = dib.f11240a;
                dhvVar3.mo6179g();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 14:
                return new kon((jvd) this.f25846a.get());
            case 15:
                return new jfs(this.f25846a, (byte[]) null);
            case 16:
                return new jfs((hlp) this.f25846a.get());
            case 17:
                return new jwl((kbz) this.f25846a.get());
            case 18:
                return new gyz((jww) this.f25846a.get());
            case 19:
                return new jfs((SharedPreferences) this.f25846a.get());
            default:
                return ((haj) this.f25846a).get().m11349q("pref_camera_advice_settings", true);
        }
    }
}
