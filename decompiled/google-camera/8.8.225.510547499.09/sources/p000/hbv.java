package p000;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.os.Build;
import com.google.android.apps.camera.sideline.SidelineJobService;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbv {

    /* JADX INFO: renamed from: a */
    public static final nbh f27171a = nbh.m17259h("com/google/android/apps/camera/sideline/SidelineInstaller");

    /* JADX INFO: renamed from: b */
    public final Context f27172b;

    /* JADX INFO: renamed from: c */
    public final dja f27173c;

    /* JADX INFO: renamed from: d */
    public final String f27174d;

    /* JADX INFO: renamed from: e */
    public final Executor f27175e;

    /* JADX INFO: renamed from: f */
    public final Executor f27176f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f27177g;

    /* JADX INFO: renamed from: h */
    public final jvd f27178h;

    /* JADX INFO: renamed from: i */
    public final PackageInstaller f27179i;

    /* JADX INFO: renamed from: j */
    public final dnm f27180j;

    /* JADX INFO: renamed from: k */
    public final hca f27181k;

    /* JADX INFO: renamed from: l */
    public final hah f27182l;

    /* JADX INFO: renamed from: m */
    public final hai f27183m;

    /* JADX INFO: renamed from: n */
    public final oju f27184n;

    /* JADX INFO: renamed from: o */
    public final oju f27185o;

    /* JADX INFO: renamed from: p */
    public final kbz f27186p;

    /* JADX INFO: renamed from: q */
    public nqf f27187q;

    /* JADX INFO: renamed from: r */
    public long f27188r = -1;

    /* JADX INFO: renamed from: s */
    public kcc f27189s;

    /* JADX INFO: renamed from: t */
    public final lih f27190t;

    /* JADX INFO: renamed from: u */
    public final djm f27191u;

    /* JADX INFO: renamed from: v */
    private final long f27192v;

    static {
        try {
            System.loadLibrary("brotli");
        } catch (UnsatisfiedLinkError e) {
        }
    }

    public hbv(Context context, dja djaVar, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, jvd jvdVar, djm djmVar, lih lihVar, dnm dnmVar, hca hcaVar, hah hahVar, hai haiVar, oju ojuVar, oju ojuVar2, PackageInfo packageInfo, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27172b = context;
        this.f27173c = djaVar;
        this.f27175e = executor;
        this.f27176f = executor2;
        this.f27177g = scheduledExecutorService;
        this.f27178h = jvdVar;
        this.f27191u = djmVar;
        this.f27190t = lihVar;
        this.f27180j = dnmVar;
        this.f27181k = hcaVar;
        this.f27182l = hahVar;
        this.f27183m = haiVar;
        this.f27184n = ojuVar;
        this.f27185o = ojuVar2;
        this.f27186p = kbzVar;
        this.f27192v = packageInfo.getLongVersionCode();
        String str = (Build.TAGS == null || !Build.TAGS.contains("release-keys")) ? "test" : "release";
        this.f27174d = str + "-keys_" + Build.DEVICE + "_com.google.pixel.camera.hal.apex.br";
        this.f27179i = context.getPackageManager().getPackageInstaller();
    }

    /* JADX INFO: renamed from: a */
    public final void m10093a(int i, Optional optional) {
        int i2;
        ((nbe) ((nbe) f27171a.m17251b()).mo17276G(3437)).mo17296u("Install failed! Status (%d): %s", i, optional.orElse(null));
        if (this.f27173c.m6200b(dja.DOGFOOD)) {
            this.f27191u.m6220A();
        }
        m10095c();
        int i3 = 1;
        this.f27187q.mo14894e(true);
        if (i != 1) {
            i3 = i;
            i2 = 2;
        } else if (optional.isPresent() && Pattern.matches("INSTALL_FAILED_INTERNAL_ERROR.*signature.*not compatible.*", (CharSequence) optional.get())) {
            i2 = 12;
        } else {
            i = 1;
            i3 = i;
            i2 = 2;
        }
        this.f27181k.m10099b(i3, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m10094b() {
        if (((emp) this.f27185o).get().schedule(new JobInfo.Builder(58451, new ComponentName(this.f27172b, (Class<?>) SidelineJobService.class)).setPersisted(true).setRequiresDeviceIdle(true).build()) == 1) {
            return;
        }
        ((nbe) ((nbe) f27171a.m17252c()).mo17276G((char) 3444)).mo17290o("Failed to schedule retry!");
    }

    /* JADX INFO: renamed from: c */
    public final void m10095c() {
        this.f27183m.mo10033e(gzy.f27026aj, Long.valueOf(this.f27192v));
    }
}
