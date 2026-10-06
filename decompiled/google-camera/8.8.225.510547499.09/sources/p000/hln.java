package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hln {

    /* JADX INFO: renamed from: a */
    public final krd f28266a;

    /* JADX INFO: renamed from: b */
    public mrm f28267b;

    /* JADX INFO: renamed from: c */
    public mrm f28268c;

    /* JADX INFO: renamed from: d */
    public mrm f28269d;

    /* JADX INFO: renamed from: e */
    public boolean f28270e;

    /* JADX INFO: renamed from: f */
    public gdb f28271f;

    public hln(krd krdVar) {
        mqu mquVar = mqu.f41450a;
        this.f28267b = mquVar;
        this.f28268c = mquVar;
        this.f28269d = mquVar;
        this.f28270e = false;
        this.f28271f = gdb.OFF;
        this.f28266a = krdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10447a(ExifInterface exifInterface) {
        this.f28268c = mrm.m16828h(exifInterface);
    }

    /* JADX INFO: renamed from: b */
    public final void m10448b(kay kayVar) {
        this.f28267b = mrm.m16828h(kayVar);
    }
}
