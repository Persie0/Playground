package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvm implements fbp, fbg, fbn, fbo, fbd {

    /* JADX INFO: renamed from: a */
    public final kbo f26497a;

    /* JADX INFO: renamed from: d */
    private final Context f26500d;

    /* JADX INFO: renamed from: e */
    private final cej f26501e;

    /* JADX INFO: renamed from: b */
    public boolean f26498b = false;

    /* JADX INFO: renamed from: c */
    boolean f26499c = false;

    /* JADX INFO: renamed from: g */
    private final BroadcastReceiver f26503g = new gvj(this);

    /* JADX INFO: renamed from: h */
    private final BroadcastReceiver f26504h = new gvk(this);

    /* JADX INFO: renamed from: i */
    private final BroadcastReceiver f26505i = new gvl(this);

    /* JADX INFO: renamed from: f */
    private boolean f26502f = false;

    public gvm(Context context, cej cejVar, kbn kbnVar) {
        this.f26500d = context;
        this.f26501e = cejVar;
        this.f26497a = kbnVar.mo6314a("ActivityCloseSec");
    }

    /* JADX INFO: renamed from: b */
    public final void m9791b() {
        if (this.f26502f) {
            this.f26497a.mo13940b("Detaching secure activity shutdown receivers.");
            try {
                this.f26500d.unregisterReceiver(this.f26504h);
            } catch (IllegalArgumentException e) {
                this.f26497a.mo13944f("unregisterReceiver screenOffReceiver fail".concat(String.valueOf(e.getMessage())));
            }
            try {
                this.f26500d.unregisterReceiver(this.f26503g);
            } catch (IllegalArgumentException e2) {
                this.f26497a.mo13944f("unregisterReceiver screenOnReceiver fail".concat(String.valueOf(e2.getMessage())));
            }
            try {
                this.f26500d.unregisterReceiver(this.f26505i);
            } catch (IllegalArgumentException e3) {
                this.f26497a.mo13944f("unregisterReceiver userUnlockReceiver fail".concat(String.valueOf(e3.getMessage())));
            }
            this.f26502f = false;
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        m9791b();
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        this.f26498b = true;
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        if (this.f26502f) {
            return;
        }
        this.f26497a.mo13944f("Attaching secure activity shutdown receivers.");
        this.f26500d.registerReceiver(this.f26504h, new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.f26500d.registerReceiver(this.f26503g, new IntentFilter("android.intent.action.SCREEN_ON"));
        this.f26500d.registerReceiver(this.f26505i, new IntentFilter("android.intent.action.USER_PRESENT"));
        this.f26502f = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m9792c(String str) {
        m9791b();
        this.f26501e.m3557a(str);
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f26498b = false;
        if (this.f26499c) {
            m9792c("Already received ScreenOff broadcast so closing the activity.");
        }
    }
}
