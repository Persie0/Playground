package p000;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffj implements igo {

    /* JADX INFO: renamed from: a */
    public final iid f21635a;

    /* JADX INFO: renamed from: b */
    public final elx f21636b;

    /* JADX INFO: renamed from: c */
    public final Handler f21637c;

    /* JADX INFO: renamed from: e */
    public final gtd f21639e;

    /* JADX INFO: renamed from: f */
    private final Resources f21640f;

    /* JADX INFO: renamed from: g */
    private final SharedPreferences f21641g;

    /* JADX INFO: renamed from: h */
    private final ScheduledExecutorService f21642h;

    /* JADX INFO: renamed from: i */
    private final boolean f21643i;

    /* JADX INFO: renamed from: j */
    private ifi f21644j;

    /* JADX INFO: renamed from: m */
    private final cdu f21647m;

    /* JADX INFO: renamed from: n */
    private final jfs f21648n;

    /* JADX INFO: renamed from: k */
    private kba f21645k = cgw.f5702o;

    /* JADX INFO: renamed from: l */
    private ScheduledFuture f21646l = null;

    /* JADX INFO: renamed from: d */
    public volatile kba f21638d = null;

    public ffj(cdu cduVar, iid iidVar, Resources resources, SharedPreferences sharedPreferences, elx elxVar, jfs jfsVar, gtd gtdVar, dhv dhvVar, ScheduledExecutorService scheduledExecutorService, Handler handler, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f21635a = iidVar;
        this.f21640f = resources;
        this.f21641g = sharedPreferences;
        this.f21636b = elxVar;
        this.f21648n = jfsVar;
        this.f21639e = gtdVar;
        this.f21642h = scheduledExecutorService;
        this.f21637c = handler;
        this.f21643i = dhvVar.mo6184l(dii.f11543s);
        this.f21647m = cduVar;
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m8345e() {
        this.f21646l = this.f21642h.schedule(new fdo(this, 9), 3000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m8346f() {
        ScheduledFuture scheduledFuture = this.f21646l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f21646l = null;
        }
        if (this.f21638d != null) {
            this.f21638d.close();
            this.f21638d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8347a() {
        this.f21648n.m13091aa("long_press", this.f21648n.m13088X("long_press") + 1);
    }

    @Override // p000.igo
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8348b(ifi ifiVar) {
        kba kbaVar;
        if (this.f21643i && ((this.f21644j == ifi.PHOTO_IDLE || this.f21644j == null) && ifiVar == ifi.PHOTO_LONGPRESS)) {
            m8345e();
        }
        if (this.f21644j == ifi.VIDEO_PRESSED && ifiVar == ifi.VIDEO_IDLE && !this.f21641g.contains("finish_video_capture")) {
            this.f21641g.edit().putBoolean("finish_video_capture", true).apply();
        }
        ifi ifiVar2 = this.f21644j;
        if ((ifiVar2 == ifi.PHOTO_LONGPRESS || ifiVar2 == ifi.PHOTO_LONGPRESS_LOCKED) && ifiVar == ifi.PHOTO_IDLE) {
            if (this.f21643i) {
                m8346f();
            }
            if (!this.f21641g.contains("finish_long_shot_capture")) {
                this.f21641g.edit().putBoolean("finish_long_shot_capture", true).apply();
            }
        }
        if (ifiVar != ifi.PHOTO_IDLE && (kbaVar = this.f21645k) != null) {
            kbaVar.close();
        }
        this.f21644j = ifiVar;
    }

    /* JADX INFO: renamed from: c */
    final synchronized boolean m8349c() {
        return this.f21644j == ifi.PHOTO_IDLE && this.f21648n.m13088X("long_press") == 0 && this.f21641g.getBoolean("finish_video_capture", false) && !this.f21641g.getBoolean("finish_long_shot_capture", false);
    }

    @Override // p000.igo
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8350d() {
        int height = this.f21635a.f31075l.getHeight();
        if (m8349c() && height > 0) {
            int dimensionPixelSize = ((-this.f21635a.f31075l.getHeight()) / 2) + this.f21640f.getDimensionPixelSize(C0100R.dimen.long_pressed_photo_button_radius) + this.f21640f.getDimensionPixelSize(C0100R.dimen.long_press_tooltip_above_shutter);
            igt igtVar = new igt(this.f21640f.getString(C0100R.string.long_press_tooltip));
            igtVar.m11299c(this.f21635a.f31075l, dimensionPixelSize);
            igtVar.mo11305i();
            igtVar.mo11307k();
            igtVar.mo11309m();
            igtVar.mo11310n();
            igtVar.f30869d = 1500;
            igtVar.mo11308l();
            igtVar.f30872g = true;
            igtVar.mo11303g(new fdo(this, 7), this.f21642h);
            igtVar.f30874i = this.f21636b;
            igtVar.f30878m = 4;
            igtVar.f30871f = true;
            this.f21645k = igtVar.mo11297a();
            this.f21647m.m3529i().m13537d(this.f21645k);
        }
    }
}
