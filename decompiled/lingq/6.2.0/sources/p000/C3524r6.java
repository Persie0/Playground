package p000;

import android.app.Application;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C3524r6 implements mk3 {

    /* JADX INFO: renamed from: a */
    public volatile cy1 f58783a;

    /* JADX INFO: renamed from: b */
    public final Object f58784b = new Object();

    /* JADX INFO: renamed from: c */
    public final MainActivity f58785c;

    /* JADX INFO: renamed from: d */
    public final C3749x7 f58786d;

    /* JADX INFO: renamed from: e */
    public xe1 f58787e;

    public C3524r6(MainActivity mainActivity) {
        this.f58785c = mainActivity;
        this.f58786d = new C3749x7(mainActivity);
    }

    /* JADX INFO: renamed from: a */
    public final cy1 m20419a() {
        String str;
        MainActivity mainActivity = this.f58785c;
        if (mainActivity.getApplication() instanceof mk3) {
            ey1 ey1Var = (ey1) ((InterfaceC3486q6) ci8.m4741z(this.f58786d, InterfaceC3486q6.class));
            return new cy1(ey1Var.f38069a, ey1Var.f38070b);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f58783a == null) {
            synchronized (this.f58784b) {
                try {
                    if (this.f58783a == null) {
                        this.f58783a = m20419a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58783a;
    }
}
