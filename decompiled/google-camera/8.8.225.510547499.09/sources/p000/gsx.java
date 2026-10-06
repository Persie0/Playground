package p000;

import android.os.Trace;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNima;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsx implements kba {

    /* JADX INFO: renamed from: a */
    private ena f26299a;

    /* JADX INFO: renamed from: b */
    private final gtr f26300b;

    /* JADX INFO: renamed from: c */
    private boolean f26301c = false;

    /* JADX INFO: renamed from: d */
    private float f26302d = -1.0f;

    /* JADX INFO: renamed from: e */
    private final float[] f26303e;

    public gsx(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f26299a = null;
        if (z) {
            ena aestheticScorerNimaV2 = z3 ? new AestheticScorerNimaV2() : new AestheticScorerNima();
            this.f26299a = aestheticScorerNimaV2;
            aestheticScorerNimaV2.mo4185c(z4);
        }
        this.f26303e = new float[z2 ? z3 ? 288 : 256 : 0];
        this.f26300b = gtr.m9767b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m9719a(kpw kpwVar, gsr gsrVar) {
        if (this.f26299a != null && gsrVar.f26257q.length <= 0) {
            boolean z = this.f26302d > 0.0f && !this.f26300b.m9768a(gsrVar.f26243c);
            this.f26301c = z;
            if (!z) {
                Trace.beginSection("AestheticFrameQualityScorer.getFrameScore");
                List listMo7251g = kpwVar.mo7251g();
                kpv kpvVar = (kpv) listMo7251g.get(0);
                kpv kpvVar2 = (kpv) listMo7251g.get(1);
                kpv kpvVar3 = (kpv) listMo7251g.get(2);
                ena enaVar = this.f26299a;
                if (enaVar != null) {
                    this.f26302d = enaVar.mo4183a(kpwVar.mo7247c(), kpwVar.mo7246b(), kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), this.f26303e);
                } else {
                    Arrays.fill(this.f26303e, 0.0f);
                    this.f26302d = 0.0f;
                }
                Trace.endSection();
            }
            return this.f26302d;
        }
        Arrays.fill(this.f26303e, 0.0f);
        this.f26302d = 0.0f;
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized mrm m9720b() {
        float[] fArr = this.f26303e;
        if (fArr.length == 0) {
            return mqu.f41450a;
        }
        float fAbs = 0.0f;
        for (float f : fArr) {
            fAbs += Math.abs(f);
        }
        return ((double) fAbs) < 1.0E-6d ? mqu.f41450a : mrm.m16829i((float[]) this.f26303e.clone());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m9721c() {
        return this.f26301c;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        ena enaVar = this.f26299a;
        if (enaVar != null) {
            enaVar.mo4184b();
            this.f26299a = null;
        }
    }
}
