package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cit implements hjk, fbp, fbn, fbo {

    /* JADX INFO: renamed from: a */
    public static final nbh f5891a = nbh.m17259h("com/google/android/apps/camera/assistant/CameraAssistantBehavior");

    /* JADX INFO: renamed from: b */
    public final Context f5892b;

    /* JADX INFO: renamed from: c */
    public final kbz f5893c;

    /* JADX INFO: renamed from: d */
    private final dhv f5894d;

    /* JADX INFO: renamed from: e */
    private final fba f5895e;

    /* JADX INFO: renamed from: f */
    private final jvd f5896f;

    /* JADX INFO: renamed from: g */
    private final Executor f5897g;

    /* JADX INFO: renamed from: h */
    private nps f5898h;

    public cit(Context context, dhv dhvVar, fba fbaVar, jvd jvdVar, Executor executor, kbz kbzVar) {
        this.f5892b = context;
        this.f5894d = dhvVar;
        this.f5895e = fbaVar;
        this.f5896f = jvdVar;
        this.f5897g = executor;
        this.f5893c = kbzVar;
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        if (this.f5898h != null) {
            return;
        }
        this.f5898h = kxk.m14970P(new cnm(this, 1), this.f5897g);
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        nps npsVar = this.f5898h;
        if (npsVar == null) {
            return;
        }
        jvh.m13562j(npsVar, new cis(this, 0), this.f5897g);
        this.f5898h = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5894d.mo6184l(dib.f11236W)) {
            fdh.m8265e(this.f5896f, this.f5895e, this);
        }
    }
}
