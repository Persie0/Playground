package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdc implements hes {

    /* JADX INFO: renamed from: b */
    public hew f21395b;

    /* JADX INFO: renamed from: c */
    public hev f21396c;

    /* JADX INFO: renamed from: d */
    public final fly f21397d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f21398e;

    /* JADX INFO: renamed from: f */
    public final cna f21399f;

    /* JADX INFO: renamed from: g */
    public boolean f21400g;

    /* JADX INFO: renamed from: h */
    public ScheduledFuture f21401h;

    /* JADX INFO: renamed from: i */
    public boolean f21402i;

    /* JADX INFO: renamed from: j */
    public final jfs f21403j;

    /* JADX INFO: renamed from: k */
    private final Resources f21404k;

    /* JADX INFO: renamed from: l */
    private final eby f21405l;

    /* JADX INFO: renamed from: m */
    private kba f21406m;

    /* JADX INFO: renamed from: n */
    private final ebx f21407n = new fdb(this);

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f21394a = new AtomicBoolean(false);

    public fdc(Resources resources, fly flyVar, ScheduledExecutorService scheduledExecutorService, eby ebyVar, jfs jfsVar, cna cnaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21404k = resources;
        this.f21397d = flyVar;
        this.f21398e = scheduledExecutorService;
        this.f21405l = ebyVar;
        this.f21403j = jfsVar;
        this.f21399f = cnaVar;
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        ScheduledFuture scheduledFuture = this.f21401h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f21395b = hewVar;
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f21404k.getString(C0100R.string.astrophotography_suggestion_text);
        heuVarM10165a.f27493b = this.f21404k.getDrawable(C0100R.drawable.quantum_gm_ic_auto_awesome_white_24, null);
        heuVarM10165a.f27498g = new evu(this, 16);
        heuVarM10165a.f27494c = new evu(this, 17);
        heuVarM10165a.f27497f = new evu(this, 18);
        this.f21396c = heuVarM10165a.m10160a();
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f21394a.set(false);
        kba kbaVar = this.f21406m;
        if (kbaVar != null) {
            kbaVar.close();
        }
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f21406m = this.f21405l.m7094e(this.f21407n);
    }
}
