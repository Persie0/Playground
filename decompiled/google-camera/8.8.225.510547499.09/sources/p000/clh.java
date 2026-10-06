package p000;

import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clh implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f6101a = nbh.m17259h("com/google/android/apps/camera/autotimer/AutoTimerAnalysis");

    /* JADX INFO: renamed from: b */
    public final jwf f6102b;

    /* JADX INFO: renamed from: c */
    public final jww f6103c;

    /* JADX INFO: renamed from: d */
    public final clz f6104d;

    /* JADX INFO: renamed from: e */
    public final oju f6105e;

    /* JADX INFO: renamed from: f */
    public final Executor f6106f;

    /* JADX INFO: renamed from: g */
    public final kfk f6107g;

    /* JADX INFO: renamed from: h */
    public final jwn f6108h;

    /* JADX INFO: renamed from: i */
    public final nta f6109i;

    /* JADX INFO: renamed from: j */
    public final ohb f6110j;

    /* JADX INFO: renamed from: k */
    public final kgg f6111k;

    /* JADX INFO: renamed from: l */
    public final kbz f6112l;

    /* JADX INFO: renamed from: o */
    public kba f6115o;

    /* JADX INFO: renamed from: q */
    public final msa f6117q;

    /* JADX INFO: renamed from: r */
    public final cwd f6118r;

    /* JADX INFO: renamed from: m */
    public BaseCurator f6113m = null;

    /* JADX INFO: renamed from: n */
    public kfc f6114n = null;

    /* JADX INFO: renamed from: p */
    public boolean f6116p = false;

    public clh(jwf jwfVar, jww jwwVar, cwd cwdVar, clz clzVar, oju ojuVar, Executor executor, kfk kfkVar, jwn jwnVar, nta ntaVar, msa msaVar, ohb ohbVar, kbz kbzVar, kgg kggVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f6102b = jwfVar;
        this.f6103c = jwwVar;
        this.f6118r = cwdVar;
        this.f6104d = clzVar;
        this.f6105e = ojuVar;
        this.f6106f = kxk.m14956B(executor);
        this.f6107g = kfkVar;
        this.f6108h = jwnVar;
        this.f6109i = ntaVar;
        this.f6117q = msaVar;
        this.f6110j = ohbVar;
        this.f6111k = kggVar;
        this.f6112l = kbzVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f6106f.execute(new cei(this, 19));
    }
}
