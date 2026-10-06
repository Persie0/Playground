package p000;

import android.content.BroadcastReceiver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpu {

    /* JADX INFO: renamed from: a */
    public static final nbh f28995a = nbh.m17259h("com/google/android/apps/camera/timelapse/TimelapseStateMonitor");

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f28996b;

    /* JADX INFO: renamed from: c */
    public final chk f28997c;

    /* JADX INFO: renamed from: d */
    public final Executor f28998d;

    /* JADX INFO: renamed from: e */
    public final jvb f28999e;

    /* JADX INFO: renamed from: f */
    public final jvd f29000f;

    /* JADX INFO: renamed from: g */
    public final idl f29001g;

    /* JADX INFO: renamed from: h */
    public final hmp f29002h;

    /* JADX INFO: renamed from: i */
    public final hnw f29003i;

    /* JADX INFO: renamed from: j */
    public final hqk f29004j;

    /* JADX INFO: renamed from: k */
    public DialogInterfaceC0155eg f29005k;

    /* JADX INFO: renamed from: l */
    mws f29006l;

    /* JADX INFO: renamed from: m */
    public final hmr f29007m;

    /* JADX INFO: renamed from: n */
    public jfo f29008n;

    /* JADX INFO: renamed from: o */
    public final jfs f29009o;

    public hpu(chk chkVar, Executor executor, jvb jvbVar, jvd jvdVar, idl idlVar, hmp hmpVar, jfs jfsVar, hmr hmrVar, hnw hnwVar, hqk hqkVar, byte[] bArr, byte[] bArr2) {
        int i = mws.f41739d;
        this.f29006l = mzr.f41857a;
        this.f28997c = chkVar;
        this.f28998d = executor;
        this.f29000f = jvdVar;
        this.f29001g = idlVar;
        this.f29002h = hmpVar;
        this.f29009o = jfsVar;
        this.f29007m = hmrVar;
        this.f29003i = hnwVar;
        this.f28999e = jvbVar;
        this.f29004j = hqkVar;
        this.f28996b = new hpt(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m10592a(hmq hmqVar, boolean z) {
        if (hmqVar.m10467c()) {
            return;
        }
        this.f29000f.m13541c(new bnp(this, z, 16));
        ((hpm) this.f29008n.f33911b).m10590h();
    }
}
