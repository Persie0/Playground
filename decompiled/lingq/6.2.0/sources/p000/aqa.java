package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aqa implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final Choreographer f7370a;

    /* JADX INFO: renamed from: b */
    public final DisplayManager f7371b;

    /* JADX INFO: renamed from: c */
    public volatile long f7372c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public volatile long f7373d = -9223372036854775807L;

    public aqa(Choreographer choreographer, DisplayManager displayManager) {
        this.f7370a = choreographer;
        this.f7371b = displayManager;
    }

    /* JADX INFO: renamed from: a */
    public static aqa m2992a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        try {
            Choreographer choreographer = Choreographer.getInstance();
            return Build.VERSION.SDK_INT >= 33 ? new cqa(choreographer, displayManager) : new bqa(choreographer, displayManager);
        } catch (RuntimeException e) {
            ss5.m21709e0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2993b();

    /* JADX INFO: renamed from: c */
    public abstract void mo2994c();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
