package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12499a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12500b;

    public dsi(oju ojuVar, int i) {
        this.f12500b = i;
        this.f12499a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static dsi m6651a(oju ojuVar) {
        return new dsi(ojuVar, 1);
    }

    /* JADX INFO: renamed from: b */
    public static dsi m6652b(oju ojuVar) {
        return new dsi(ojuVar, 4);
    }

    /* JADX INFO: renamed from: c */
    public static dsi m6653c(oju ojuVar) {
        return new dsi(ojuVar, 18);
    }

    /* JADX INFO: renamed from: d */
    public static dsi m6654d(oju ojuVar) {
        return new dsi(ojuVar, 20);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12500b) {
            case 0:
                jwn jwnVarM16852g = ((msa) this.f12499a.get()).m16852g();
                jwnVarM16852g.getClass();
                return jwnVarM16852g;
            case 1:
                dro droVar = (dro) ohh.m18485a(this.f12499a).get();
                droVar.getClass();
                return droVar;
            case 2:
                dhv dhvVar = (dhv) this.f12499a.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                return false;
            case 3:
                return new cvy(new bko((char[]) null, (short[]) null), (jwn) this.f12499a.get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 4:
                jvb jvbVar = (jvb) this.f12499a.get();
                ExecutorService executorServiceM13824l = jzn.m13824l("FeatureCentral");
                jvi jviVar = new jvi(executorServiceM13824l);
                executorServiceM13824l.getClass();
                jvbVar.m13537d(new dev(executorServiceM13824l, 16));
                return jviVar;
            case 5:
                dvl dvlVarM6866b = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b.f12658a = 1;
                dvlVarM6866b.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b.m6778b();
                return dvlVarM6866b.m6777a();
            case 6:
                dvl dvlVarM6866b2 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b2.f12658a = 1;
                dvlVarM6866b2.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b2.m6778b();
                return dvlVarM6866b2.m6777a();
            case 7:
                dvl dvlVarM6866b3 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b3.f12658a = 1;
                dvlVarM6866b3.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b3.m6778b();
                return dvlVarM6866b3.m6777a();
            case 8:
                dvl dvlVarM6866b4 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b4.f12658a = 1;
                dvlVarM6866b4.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b4.m6778b();
                return dvlVarM6866b4.m6777a();
            case 9:
                dvl dvlVarM6866b5 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b5.f12658a = 1;
                dvlVarM6866b5.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b5.m6778b();
                return dvlVarM6866b5.m6777a();
            case 10:
                dvl dvlVarM6866b6 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b6.f12658a = 1;
                dvlVarM6866b6.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b6.m6778b();
                return dvlVarM6866b6.m6777a();
            case 11:
                dvl dvlVarM6866b7 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b7.f12658a = 1;
                dvlVarM6866b7.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b7.m6778b();
                return dvlVarM6866b7.m6777a();
            case 12:
                dtj dtjVar = (dtj) this.f12499a.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.camera.motion-sharpness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.camera.motion-sharpness'!");
                }
                arrayList.add(dtjVar);
                return dti.m6727a("feature.acmi.camera.motion-sharpness", arrayList, arrayList2);
            case 13:
                dvl dvlVarM6866b8 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b8.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b8.f12659b = 30;
                dvlVarM6866b8.f12658a = 3;
                dvlVarM6866b8.f12660c = 5;
                dvlVarM6866b8.m6778b();
                return dvlVarM6866b8.m6777a();
            case 14:
                dvl dvlVarM6866b9 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b9.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b9.f12659b = 30;
                dvlVarM6866b9.f12658a = 1;
                dvlVarM6866b9.f12660c = 5;
                dvlVarM6866b9.m6778b();
                return dvlVarM6866b9.m6777a();
            case 15:
                dtj dtjVar2 = (dtj) this.f12499a.get();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.imu.frame-straightness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.imu.frame-straightness'!");
                }
                arrayList3.add(dtjVar2);
                return dti.m6727a("feature.acmi.imu.frame-straightness", arrayList3, arrayList4);
            case 16:
                dvl dvlVarM6866b10 = dxu.m6866b((dtj) this.f12499a.get());
                dvlVarM6866b10.m6779c(5L, TimeUnit.MINUTES);
                dvlVarM6866b10.f12659b = 50;
                dvlVarM6866b10.f12658a = 3;
                dvlVarM6866b10.f12660c = 5;
                dvlVarM6866b10.m6778b();
                return dvlVarM6866b10.m6777a();
            case 17:
                return (FilmstripTransitionLayout) ((iih) this.f12499a).get().m13100f(C0100R.id.filmstrip_transition_layout);
            case 18:
                return new dxx(null);
            case 19:
                return new bko(((ggz) this.f12499a).get(), (byte[]) null);
            default:
                return new dym((dyl) this.f12499a.get(), TimeUnit.NANOSECONDS.convert(500L, TimeUnit.MICROSECONDS));
        }
    }
}
