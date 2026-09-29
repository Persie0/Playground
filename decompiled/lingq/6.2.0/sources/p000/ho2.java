package p000;

import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.internal.FeatureManager$Feature;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.FileNotFoundException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho2 implements go2, o9a, zc1, tg5, k13, yr6, vt2, fn9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42684a;

    public /* synthetic */ ho2(int i) {
        this.f42684a = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13383c() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13384d(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13385e(String str) {
        throw new RuntimeException(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13386g(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13387h(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // p000.go2
    /* JADX INFO: renamed from: a */
    public float mo12780a(float f) {
        return f;
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        az8 az8Var = (az8) obj;
        String strM4509e = bz8.f9202b.m4509e(az8Var);
        strM4509e.getClass();
        Log.d("FirebaseSessions", "Session Event Type: " + az8Var.f7694a.name());
        byte[] bytes = strM4509e.getBytes(yu0.f70463a);
        bytes.getClass();
        return bytes;
    }

    @Override // p000.tg5
    /* JADX INFO: renamed from: b */
    public void mo13388b(Object obj, t63 t63Var) {
        ((ba7) obj).mo3521r();
    }

    @Override // p000.k13
    /* JADX INFO: renamed from: f */
    public void mo12756f(boolean z) {
        switch (this.f42684a) {
            case 9:
                if (z && ema.m11256c()) {
                    p13.m18851a(new v63(11), FeatureManager$Feature.CrashReport);
                    p13.m18851a(new v63(12), FeatureManager$Feature.ErrorReport);
                    p13.m18851a(new v63(13), FeatureManager$Feature.AnrReport);
                    break;
                }
                break;
            case 10:
                if (z && !lp1.f49971a.contains(AbstractC3122is.class)) {
                    try {
                        y23.f69125e.add(new C3086hs());
                        y23.m24856d();
                    } catch (Throwable th) {
                        lp1.m16420a(AbstractC3122is.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 11:
                if (z) {
                    sy2.f61598n = true;
                }
                break;
            case 12:
                if (z) {
                    sy2.f61599o = true;
                }
                break;
            default:
                if (z) {
                    sy2.f61600p = true;
                }
                break;
        }
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        return Tasks.m5975c(null);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f42684a) {
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f13631a.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.f13633c.get();
            case 5:
                return (ScheduledExecutorService) ExecutorsRegistrar.f13632b.get();
            case 6:
                ds4 ds4Var = ExecutorsRegistrar.f13631a;
                return UiExecutor.INSTANCE;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(co7Var);
            case 25:
                return FirebasePerfRegistrar.providesFirebasePerformance(co7Var);
            case 28:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(co7Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(co7Var);
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ ho2(Object obj, int i) {
        this.f42684a = i;
    }
}
