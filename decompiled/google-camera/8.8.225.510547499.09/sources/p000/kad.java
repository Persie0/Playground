package p000;

import android.location.Location;
import android.media.MediaCodec;
import android.util.Log;
import android.view.Surface;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kad implements jyy {

    /* JADX INFO: renamed from: a */
    public final npu f35446a;

    /* JADX INFO: renamed from: b */
    public final jzz f35447b;

    /* JADX INFO: renamed from: c */
    public final jzy f35448c;

    /* JADX INFO: renamed from: d */
    public jxs f35449d;

    /* JADX INFO: renamed from: e */
    public jxv f35450e;

    /* JADX INFO: renamed from: i */
    public nps f35454i;

    /* JADX INFO: renamed from: j */
    public Location f35455j;

    /* JADX INFO: renamed from: k */
    public Surface f35456k;

    /* JADX INFO: renamed from: l */
    public jyz f35457l;

    /* JADX INFO: renamed from: f */
    public int f35451f = 0;

    /* JADX INFO: renamed from: g */
    public long f35452g = 0;

    /* JADX INFO: renamed from: h */
    public int f35453h = 0;

    /* JADX INFO: renamed from: m */
    public int f35458m = 6;

    public kad(jzz jzzVar, npu npuVar, jzy jzyVar) {
        this.f35446a = npuVar;
        this.f35447b = jzzVar;
        this.f35448c = jzyVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: b */
    public final jyy mo13760b(jyz jyzVar) {
        this.f35457l = jyzVar;
        return this;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: c */
    public final void mo13761c(jxs jxsVar) {
        this.f35449d = jxsVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: d */
    public final void mo13762d(int i) {
        this.f35458m = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: e */
    public final void mo13763e(jym jymVar) {
        jym jymVar2 = jym.SURFACE;
        if (jymVar == jymVar2) {
            return;
        }
        throw new IllegalArgumentException("Only " + String.valueOf(jymVar2) + VzWFSVj.YdrFWtgkrFDRmM + kae.class.getSimpleName() + ", but we get " + jymVar.toString());
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: f */
    public final void mo13764f(int i) {
        throw new UnsupportedOperationException("Color standard is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: g */
    public final void mo13765g(Surface surface) {
        this.f35456k = surface;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: h */
    public final void mo13766h(Location location) {
        this.f35455j = location;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: i */
    public final void mo13767i(nps npsVar) {
        try {
            mrm mrmVar = (mrm) npsVar.get();
            if (mrmVar.mo16813g()) {
                this.f35455j = (Location) mrmVar.mo16809c();
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.w("VidRecMedRec", "Failed to set the location, Ignoring.", e);
        }
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: j */
    public final void mo13768j(int i) {
        this.f35451f = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: k */
    public final void mo13769k(long j) {
        this.f35452g = j;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: l */
    public final void mo13770l(long j) {
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: m */
    public final void mo13771m(MediaCodec.Callback callback) {
        throw new UnsupportedOperationException("Cannot add a MediaCodec's callback with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: n */
    public final void mo13772n(boolean z) {
        throw new UnsupportedOperationException("Cannot apply synchronous mode with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: o */
    public final void mo13773o(int i) {
        this.f35453h = i;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: p */
    public final void mo13774p(nps npsVar) {
        this.f35454i = npsVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: q */
    public final void mo13775q(FileDescriptor fileDescriptor) {
        this.f35454i = kxk.m14965K(fileDescriptor);
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: r */
    public final void mo13776r(jxv jxvVar) {
        this.f35450e = jxvVar;
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: s */
    public final void mo13777s(boolean z) {
    }

    @Override // p000.jyy
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ jyx mo13759a() {
        if (this.f35454i != null) {
            return new kae(this);
        }
        throw new IllegalArgumentException("Either Output video file path or descriptor is required");
    }
}
