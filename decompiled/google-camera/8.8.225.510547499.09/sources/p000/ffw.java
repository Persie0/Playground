package p000;

import android.app.ActivityManager;
import android.util.Log;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffw implements msi {

    /* JADX INFO: renamed from: n */
    private final /* synthetic */ int f21768n;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ ffw f21767m = new ffw(13);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ ffw f21766l = new ffw(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ ffw f21765k = new ffw(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ ffw f21764j = new ffw(10);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ ffw f21763i = new ffw(9);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ ffw f21762h = new ffw(8);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ffw f21761g = new ffw(7);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ffw f21760f = new ffw(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ffw f21759e = new ffw(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ffw f21758d = new ffw(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ffw f21757c = new ffw(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ffw f21756b = new ffw(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ffw f21755a = new ffw(0);

    public /* synthetic */ ffw(int i) {
        this.f21768n = i;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        boolean z = true;
        switch (this.f21768n) {
            case 0:
                return new fil();
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return 6;
            case 4:
                return Pattern.compile("medres-([0-9]+)\\.jpg");
            case 5:
                return jbx.m12856a();
            case 6:
                long jCeil = lku.f38516a;
                if (jCeil == 0) {
                    synchronized (lku.class) {
                        jCeil = lku.f38516a;
                        if (jCeil == 0) {
                            float fFloatValue = Float.valueOf(60.0f).floatValue();
                            double d = fFloatValue >= 1.0f ? fFloatValue : 60.0f;
                            Double.isNaN(d);
                            jCeil = (long) Math.ceil(1.0E9d / d);
                            lku.f38516a = jCeil;
                        }
                        break;
                    }
                }
                return Long.valueOf(jCeil);
            case 7:
                return llu.m15711a();
            case 8:
                return new ksp(2065731759, C0100R.raw.f6535x171be3e1);
            case 9:
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : ActivityManager.isRunningInUserTestHarness());
            case 10:
                return false;
            case 11:
                return kxk.m14955A(Executors.newSingleThreadScheduledExecutor(kuw.f37261b));
            case 12:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    if (runningAppProcessInfo.importance < 400) {
                        z = false;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", hiCTUJiAxf.dMsAEkyr, e);
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                throw new IllegalStateException();
        }
    }
}
