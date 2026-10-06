package p000;

import android.content.ContentResolver;
import android.os.Handler;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class csv {

    /* JADX INFO: renamed from: b */
    private static final nbh f9389b = nbh.m17259h("com/google/android/apps/camera/camcorder/display/DisplayBrightnessAdjuster");

    /* JADX INFO: renamed from: c */
    private static final Duration f9390c = Duration.ofMillis(250);

    /* JADX INFO: renamed from: a */
    public final css f9391a;

    /* JADX INFO: renamed from: d */
    private final ContentResolver f9392d;

    /* JADX INFO: renamed from: e */
    private final Handler f9393e;

    /* JADX INFO: renamed from: f */
    private final ScheduledExecutorService f9394f;

    /* JADX INFO: renamed from: g */
    private final Window f9395g;

    /* JADX INFO: renamed from: h */
    private ScheduledFuture f9396h;

    public csv(ContentResolver contentResolver, css cssVar, ScheduledExecutorService scheduledExecutorService, Handler handler, Window window) {
        this.f9392d = contentResolver;
        this.f9391a = cssVar;
        this.f9393e = handler;
        this.f9394f = scheduledExecutorService;
        this.f9395g = window;
    }

    /* JADX INFO: renamed from: f */
    private final void m5476f() {
        ScheduledFuture scheduledFuture = this.f9396h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9396h = null;
    }

    /* JADX INFO: renamed from: a */
    public final int m5477a() {
        try {
            return Settings.System.getInt(this.f9392d, "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            ((nbe) ((nbe) ((nbe) f9389b.m17252c()).mo17283h(e)).mo17276G((char) 586)).mo17290o("Fail to get screen brightness setting.");
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5478b() {
        m5476f();
        this.f9393e.post(new cqr(this, 17));
    }

    /* JADX INFO: renamed from: c */
    public final void m5479c(float f) {
        WindowManager.LayoutParams attributes = this.f9395g.getAttributes();
        attributes.screenBrightness = f;
        this.f9395g.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: d */
    public final void m5480d(int i, boolean z) {
        m5476f();
        switch (i - 1) {
            case 0:
                int iM5477a = m5477a();
                if (iM5477a != -1) {
                    this.f9393e.post(new bbt(this, this.f9391a.m5474b(iM5477a, 0.1f, z), 7));
                }
                break;
            default:
                int iM5477a2 = m5477a();
                if (iM5477a2 != -1) {
                    m5481e(iM5477a2, this.f9391a.m5474b(iM5477a2, 0.1f, z), z);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5481e(int i, final int i2, final boolean z) {
        final int iM5474b = this.f9391a.m5474b(i, 0.0025f, z);
        if (iM5474b < i2) {
            iM5474b = i2;
        } else if (iM5474b == i) {
            iM5474b--;
        }
        this.f9393e.post(new bbt(this, iM5474b, 8));
        if (iM5474b > i2) {
            this.f9396h = this.f9394f.schedule(new Runnable() { // from class: csu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9385a.m5481e(iM5474b, i2, z);
                }
            }, f9390c.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
