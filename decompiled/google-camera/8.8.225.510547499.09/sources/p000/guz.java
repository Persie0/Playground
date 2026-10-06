package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guz extends gvc {

    /* JADX INFO: renamed from: b */
    public static final nbh f26457b = nbh.m17259h("com/google/android/apps/camera/rewind/RewindControllerImpl");

    /* JADX INFO: renamed from: l */
    private static final Duration f26458l = Duration.ofMillis(250);

    /* JADX INFO: renamed from: c */
    public final Context f26459c;

    /* JADX INFO: renamed from: d */
    public final msi f26460d;

    /* JADX INFO: renamed from: e */
    public final WindowManager f26461e;

    /* JADX INFO: renamed from: f */
    public final hht f26462f;

    /* JADX INFO: renamed from: g */
    public final gva f26463g;

    /* JADX INFO: renamed from: h */
    public final iid f26464h;

    /* JADX INFO: renamed from: i */
    public final Handler f26465i = jvh.m13557e(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public final npk f26466j;

    /* JADX INFO: renamed from: k */
    public final djm f26467k;

    /* JADX INFO: renamed from: m */
    private final BottomBarController f26468m;

    /* JADX INFO: renamed from: n */
    private final BottomBarListener f26469n;

    public guz(Context context, msi msiVar, djm djmVar, BottomBarController bottomBarController, icf icfVar, gva gvaVar, iid iidVar, WindowManager windowManager, hht hhtVar, npk npkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f26459c = context;
        this.f26460d = msiVar;
        this.f26467k = djmVar;
        this.f26468m = bottomBarController;
        this.f26463g = gvaVar;
        this.f26464h = iidVar;
        this.f26461e = windowManager;
        this.f26462f = hhtVar;
        this.f26466j = npkVar;
        this.f26469n = new guy(icfVar);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        this.f26468m.removeListener(this.f26469n);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        this.f26468m.addListener(this.f26469n);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        return false;
    }
}
