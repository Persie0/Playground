package p000;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaRecorder;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kae implements jyx {

    /* JADX INFO: renamed from: a */
    public final Object f35459a = new Object();

    /* JADX INFO: renamed from: b */
    public final jzz f35460b;

    /* JADX INFO: renamed from: c */
    public jyz f35461c;

    /* JADX INFO: renamed from: d */
    public int f35462d;

    /* JADX INFO: renamed from: e */
    private final Location f35463e;

    /* JADX INFO: renamed from: f */
    private final FileDescriptor f35464f;

    /* JADX INFO: renamed from: g */
    private final npu f35465g;

    /* JADX INFO: renamed from: h */
    private final int f35466h;

    /* JADX INFO: renamed from: i */
    private final int f35467i;

    public kae(kad kadVar) throws jzx {
        int i;
        this.f35465g = kadVar.f35446a;
        nps npsVar = kadVar.f35454i;
        FileDescriptor fileDescriptor = npsVar != null ? (FileDescriptor) kxk.m14974T(npsVar) : null;
        this.f35464f = fileDescriptor;
        this.f35466h = kadVar.f35453h;
        this.f35463e = kadVar.f35455j;
        jzz jzzVar = kadVar.f35447b;
        this.f35460b = jzzVar;
        int i2 = kadVar.f35458m;
        this.f35467i = i2;
        jzzVar.mo5593f();
        mrm mrmVarM16828h = mrm.m16828h(kadVar.f35456k);
        jxv jxvVar = kadVar.f35450e;
        jxs jxsVar = kadVar.f35449d;
        mrm mrmVarM16828h2 = mrm.m16828h(fileDescriptor);
        mrm mrmVarM16828h3 = mrm.m16828h(null);
        mrm mrmVarM16828h4 = mrm.m16828h(kadVar.f35455j);
        int i3 = kadVar.f35453h;
        int i4 = kadVar.f35451f;
        long j = kadVar.f35452g;
        jzzVar.mo5593f();
        if (mrmVarM16828h2.mo16813g()) {
            jzzVar.mo5609v((FileDescriptor) mrmVarM16828h2.mo16809c());
        } else {
            if (!mrmVarM16828h3.mo16813g()) {
                Log.e("MedRecPrep", "Either output file path or descriptor should present");
                throw new IllegalArgumentException("Either output file path or descriptor should present");
            }
            jzzVar.mo5610w(((File) mrmVarM16828h3.mo16809c()).getAbsolutePath());
        }
        if (mrmVarM16828h.mo16813g()) {
            jzzVar.mo5601n((Surface) mrmVarM16828h.mo16809c());
        }
        if (jxsVar != null) {
            if (i2 == 0) {
                throw null;
            }
            jzzVar.mo5599l(i2 != 2 ? 5 : 1);
        }
        jzzVar.mo5587E();
        jzzVar.mo5611x(jxvVar.f35097a.f35065d);
        jzzVar.mo5612y(jxvVar.f35100d);
        int i5 = jxvVar.f35101e;
        if (i5 != -1 && (i = jxvVar.f35102f) != -1) {
            MediaRecorder mediaRecorderMo5588a = jzzVar.mo5588a();
            int[] iArr = ivz.f32455a;
            mediaRecorderMo5588a.setVideoEncodingProfileLevel(i5, i);
        }
        jxvVar.f35098b.toString();
        jzzVar.mo5584B(jxvVar.f35098b.m13661b().f35517a, jxvVar.f35098b.m13661b().f35518b);
        jxvVar.m13670b();
        jzzVar.mo5613z(jxvVar.m13670b());
        jxvVar.m13671c();
        jzzVar.mo5583A(jxvVar.m13671c());
        jxvVar.m13669a();
        jzzVar.mo5600m(jxvVar.m13669a());
        if (jxsVar != null) {
            jzzVar.mo5597j(jxsVar.f35087b);
            jzzVar.mo5595h(jxsVar.f35090e);
            jzzVar.mo5598k(jxsVar.f35088c);
            jxsVar.f35086a.toString();
            jzzVar.mo5596i(jxsVar.f35086a.f35034g);
        }
        if (mrmVarM16828h4.mo16813g()) {
            jzzVar.mo5602o((float) ((Location) mrmVarM16828h4.mo16809c()).getLatitude(), (float) ((Location) mrmVarM16828h4.mo16809c()).getLongitude());
        }
        jzzVar.mo5608u(i3);
        if (i4 > 0) {
            jzzVar.mo5603p(i4);
        }
        if (j > 0) {
            jzzVar.mo5604q(j);
        }
        try {
            jzzVar.mo5591d();
            jzzVar.mo5606s(new kac(kadVar));
            jyz jyzVar = kadVar.f35457l;
            if (jyzVar != null) {
                this.f35461c = jyzVar;
            }
            this.f35462d = 1;
        } catch (jzx e) {
            Log.e("MedRecPrep", "immediateFailedFuture: MediaRecorder.prepare() exception: ".concat(e.toString()));
            throw e;
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: a */
    public final int mo13742a() {
        return this.f35466h;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: b */
    public final MediaCodec mo13743b() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: c */
    public final mrm mo13744c() {
        mrm mrmVarM16828h;
        synchronized (this.f35459a) {
            lku.m15613H(this.f35462d != 3);
            mrmVarM16828h = mrm.m16828h(this.f35460b.mo5589b());
        }
        return mrmVarM16828h;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f35459a) {
            if (this.f35462d == 3) {
                Log.w("VidRecMedRec", "Already stopped");
                return;
            }
            try {
                this.f35460b.mo5586D();
                jyz jyzVar = this.f35461c;
                if (jyzVar != null) {
                    jyzVar.mo5567c();
                }
            } catch (jzx e) {
                Log.e("VidRecMedRec", "Fails to stop mediarecorder. Perhaps the recording is too short");
            }
            this.f35462d = 3;
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: d */
    public final mrm mo13745d() {
        return mrm.m16828h(this.f35463e);
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: e */
    public final mrm mo13746e() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: f */
    public final mrm mo13747f() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: g */
    public final nps mo13748g() {
        return this.f35465g.submit(new bdv(this, 20));
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: h */
    public final nps mo13749h() {
        return this.f35465g.submit(new kij(this, 1));
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: i */
    public final nps mo13750i() {
        throw new UnsupportedOperationException("fast shutdown is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: j */
    public final nps mo13751j(jyt jytVar) {
        return this.f35465g.submit(new kab(this, jytVar, 0));
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: k */
    public final nps mo13752k() {
        return this.f35465g.submit(new bpr(this, 3));
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: l */
    public final void mo13753l(MediaFormat mediaFormat) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: m */
    public final void mo13754m(FileDescriptor fileDescriptor) {
        synchronized (this.f35459a) {
            int i = this.f35462d;
            boolean z = true;
            if (i != 2 && i != 4) {
                z = false;
            }
            lku.m15613H(z);
            try {
                this.f35460b.mo5605r(fileDescriptor);
            } catch (jzx e) {
                Log.e("VidRecMedRec", "Fail to set next file descriptor.");
                throw new IllegalStateException("Fail to set next file descriptor.", e);
            }
        }
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: n */
    public final void mo13755n(int i, MediaCodec.BufferInfo bufferInfo) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: o */
    public final void mo13756o(Object obj) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: p */
    public final mrm mo13757p() {
        return mqu.f41450a;
    }

    @Override // p000.jyx
    /* JADX INFO: renamed from: q */
    public final void mo13758q(float f) {
        throw new UnsupportedOperationException("changeBitrate is not supported, please use VideoRecorderMediaCodec");
    }
}
