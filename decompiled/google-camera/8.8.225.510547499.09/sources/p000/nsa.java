package p000;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsa extends RawWriteView {

    /* JADX INFO: renamed from: c */
    private transient long f44348c;

    public nsa() {
        this(GcamModuleJNI.new_RawImage__SWIG_0());
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    /* JADX INFO: renamed from: a */
    public final synchronized void mo5090a() {
        long j = this.f44348c;
        if (j != 0) {
            if (this.f8350b) {
                this.f8350b = false;
                GcamModuleJNI.delete_RawImage(j);
            }
            this.f44348c = 0L;
        }
        super.mo5090a();
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    protected final void finalize() {
        mo5090a();
    }

    public nsa(long j) {
        super(GcamModuleJNI.RawImage_SWIGUpcast(j));
        this.f44348c = j;
    }
}
