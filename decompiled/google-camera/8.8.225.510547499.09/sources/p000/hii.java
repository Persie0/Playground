package p000;

import android.os.Environment;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hii implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f27904a;

    public hii(int i) {
        this.f27904a = i;
    }

    /* JADX INFO: renamed from: a */
    public static hlk m10340a() {
        return new hlk();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27904a) {
            case 0:
                return new inr((char[]) null);
            case 1:
                return new kym(20);
            case 2:
                return new Instrumentation();
            case 3:
                return new hki();
            case 4:
                return new ksa();
            case 5:
                return m10340a();
            case 6:
                return new hlp();
            case 7:
                return jib.m13218w();
            case 8:
                return new hlw(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Raw"));
            case 9:
                return new jwf(Boolean.FALSE);
            case 10:
                return new jwf(hno.INACTIVE);
            case 11:
                return new jwf(false);
            case 12:
                return jib.m13219x();
            case 13:
                return jib.m13216u();
            case 14:
                ExecutorService executorServiceM13824l = jzn.m13824l("CheetahExecutor");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 15:
                return new jvb();
            case 16:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("trk-deinit");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
            case 17:
                ExecutorService executorServiceM13824l3 = jzn.m13824l("trk-analysis");
                executorServiceM13824l3.getClass();
                return executorServiceM13824l3;
            case 18:
                ExecutorService executorServiceM13824l4 = jzn.m13824l("trk-roi");
                executorServiceM13824l4.getClass();
                return executorServiceM13824l4;
            case 19:
                return new htb();
            default:
                return new jwf(false);
        }
    }
}
