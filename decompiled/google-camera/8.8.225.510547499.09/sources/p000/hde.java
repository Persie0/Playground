package p000;

import android.os.Process;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hde implements Runnable {

    /* JADX INFO: renamed from: n */
    private final /* synthetic */ int f27312n;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ hde f27311m = new hde(14);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ hde f27310l = new hde(13);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ hde f27309k = new hde(12);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ hde f27308j = new hde(11);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ hde f27307i = new hde(10);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hde f27306h = new hde(9);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ hde f27305g = new hde(8);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hde f27304f = new hde(7);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hde f27303e = new hde(6);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hde f27302d = new hde(5);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hde f27301c = new hde(4);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ hde f27300b = new hde(3);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hde f27299a = new hde(2);

    public /* synthetic */ hde(int i) {
        this.f27312n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27312n) {
            case 0:
                jvd.m13538a();
                break;
            case 2:
                int i = EducationToastView.f6973c;
                break;
            case 3:
                int i2 = EducationToastView.f6973c;
                break;
            case 6:
                Duration duration = ToastView.f6979d;
                break;
            case 7:
                Duration duration2 = ToastView.f6979d;
                break;
            case 8:
                Duration duration3 = ToastView.f6979d;
                break;
            case 9:
                Duration duration4 = ToastView.f6979d;
                break;
            case 13:
                Process.setThreadPriority(-4);
                break;
        }
    }
}
