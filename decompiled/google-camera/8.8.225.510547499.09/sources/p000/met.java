package p000;

import com.google.android.libraries.vision.visionkit.pipeline.NativePipelineImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class met {

    /* JADX INFO: renamed from: a */
    private final long f40220a;

    /* JADX INFO: renamed from: b */
    public final mer f40221b;

    /* JADX INFO: renamed from: c */
    public long f40222c;

    /* JADX INFO: renamed from: d */
    private final long f40223d;

    /* JADX INFO: renamed from: e */
    private final long f40224e;

    /* JADX INFO: renamed from: f */
    private final mav f40225f;

    public met(meu meuVar) {
        nxf nxfVarM18011a = nxf.m18011a();
        nxfVarM18011a = nxfVarM18011a == null ? nxf.f44904a : nxfVarM18011a;
        if (meuVar.f40229b == 5 && ((Boolean) meuVar.f40230c).booleanValue()) {
            this.f40221b = new mes();
        } else if (meuVar.f40229b == 6 && ((Boolean) meuVar.f40230c).booleanValue()) {
            this.f40221b = new NativePipelineImpl(this, this, nxfVarM18011a);
        } else {
            this.f40221b = new NativePipelineImpl(this, this, nxfVarM18011a, null);
        }
        if ((meuVar.f40228a & 128) != 0) {
            int i = meuVar.f40233f;
            this.f40225f = new mav((byte[]) null);
        } else {
            this.f40225f = new mav((byte[]) null);
        }
        long jInitializeFrameManager = this.f40221b.initializeFrameManager();
        this.f40220a = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.f40221b.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.f40223d = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.f40221b.initializeResultsCallback();
        this.f40224e = jInitializeResultsCallback;
        this.f40222c = this.f40221b.initialize(meuVar.mo17760J(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, 0L, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void mo6005a(long j) {
        this.f40225f.m16286b(j);
    }

    /* JADX INFO: renamed from: b */
    public void mo6006b(mew mewVar) {
        lvd lvdVar = lvd.f39383a;
        String strValueOf = String.valueOf(String.valueOf(mewVar));
        Object[] objArr = new Object[0];
        if (lvdVar.m16091e(4)) {
            lvdVar.m16088b(this, "Pipeline received results: ".concat(strValueOf), objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16339c() {
        long j = this.f40222c;
        if (j != 0) {
            this.f40221b.stop(j);
            this.f40221b.close(this.f40222c, this.f40220a, this.f40223d, this.f40224e);
            this.f40222c = 0L;
            this.f40221b.mo4733a();
        }
    }
}
