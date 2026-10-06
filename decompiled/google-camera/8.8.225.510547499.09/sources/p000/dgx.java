package p000;

import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10999a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f11000b;

    public dgx(oju ojuVar, int i) {
        this.f11000b = i;
        this.f10999a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static dgx m6130a(oju ojuVar) {
        return new dgx(ojuVar, 4);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f11000b) {
            case 0:
                return new dgw((dhv) this.f10999a.get());
            case 1:
                return new cwd((fcp) this.f10999a.get());
            case 2:
                djg djgVar = (djg) this.f10999a.get();
                djgVar.getClass();
                return djgVar;
            case 3:
                return new djz(((emh) this.f10999a).m7522a());
            case 4:
                dhv dhvVar = (dhv) this.f10999a.get();
                int i = dkn.f11896a;
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 5:
                return new erm((dhv) this.f10999a.get(), 1);
            case 6:
                dlx dlxVar = ((dly) this.f10999a).get();
                dlxVar.m6380m();
                return dlxVar;
            case 7:
                return new dlr((dlw) this.f10999a.get(), 0);
            case 8:
                aps apsVarM348g = aek.m348g(((dws) this.f10999a).m6830a(), ShotDatabase.class, "shot_db");
                apsVarM348g.m1816d();
                ShotDatabase shotDatabase = (ShotDatabase) apsVarM348g.m1813a();
                shotDatabase.getClass();
                return shotDatabase;
            case 9:
                return new dmv((dhv) this.f10999a.get());
            case 10:
                dhv dhvVar2 = (dhv) this.f10999a.get();
                int i2 = dhn.f11140a;
                dhvVar2.mo6175c();
                return false;
            case 11:
                return new AmbientDelegate((jwf) this.f10999a.get());
            case 12:
                return new dnn((dhv) this.f10999a.get());
            case 13:
                return new dsx();
            case 14:
                dhv dhvVar3 = (dhv) this.f10999a.get();
                int i3 = true == dhvVar3.mo6184l(dhp.f11146c) ? 3 : 1;
                if (dhvVar3.mo6184l(dhp.f11147d)) {
                    i3 |= 4;
                }
                return Integer.valueOf(i3);
            case 15:
                dhv dhvVar4 = (dhv) this.f10999a.get();
                dhx dhxVar2 = dhp.f11144a;
                dhvVar4.mo6178f();
                return false;
            case 16:
                return Boolean.valueOf(((dhv) this.f10999a.get()).mo6184l(dhp.f11150g));
            case 17:
                return Boolean.valueOf(((dhv) this.f10999a.get()).mo6184l(dhp.f11151h));
            case 18:
                dhv dhvVar5 = (dhv) this.f10999a.get();
                dhx dhxVar3 = dhp.f11144a;
                dhvVar5.mo6178f();
                return false;
            case 19:
                return Boolean.valueOf(((dhv) this.f10999a.get()).mo6184l(dhp.f11152i));
            default:
                return new dta(((efm) this.f10999a).m7271b(), 1);
        }
    }
}
