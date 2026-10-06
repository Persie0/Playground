package com.google.googlex.gcam;

import p000.nrz;
import p000.nsd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RawWriteView extends RawReadView {

    /* JADX INFO: renamed from: c */
    private transient long f8351c;

    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0());
    }

    /* JADX INFO: renamed from: c */
    public static long m5092c(RawWriteView rawWriteView) {
        if (rawWriteView == null) {
            return 0L;
        }
        return rawWriteView.f8351c;
    }

    @Override // com.google.googlex.gcam.RawReadView
    /* JADX INFO: renamed from: a */
    public synchronized void mo5090a() {
        long j = this.f8351c;
        if (j != 0) {
            if (this.f8350b) {
                this.f8350b = false;
                GcamModuleJNI.delete_RawWriteView(j);
            }
            this.f8351c = 0L;
        }
        super.mo5090a();
    }

    @Override // com.google.googlex.gcam.RawReadView
    protected void finalize() {
        mo5090a();
    }

    public RawWriteView(int i, int i2, int i3, nrz nrzVar, nsd nsdVar) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(i, i2, i3, nrzVar.f44331f, nsd.m17642a(nsdVar)));
    }

    public RawWriteView(long j) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(j));
        this.f8351c = j;
    }
}
