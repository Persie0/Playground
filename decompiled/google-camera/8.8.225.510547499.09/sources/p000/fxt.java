package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxt {

    /* JADX INFO: renamed from: a */
    public final long f23817a;

    /* JADX INFO: renamed from: b */
    public final byte[] f23818b;

    /* JADX INFO: renamed from: c */
    public final int f23819c;

    /* JADX INFO: renamed from: d */
    public final ExifInterface f23820d;

    /* JADX INFO: renamed from: e */
    public final kbc f23821e;

    private fxt(long j, byte[] bArr, kbc kbcVar, int i, ExifInterface exifInterface) {
        this.f23817a = j;
        this.f23818b = bArr;
        this.f23819c = i;
        this.f23821e = kbcVar;
        this.f23820d = exifInterface;
    }

    /* JADX INFO: renamed from: a */
    public static fxt m8941a(long j, byte[] bArr, kbc kbcVar, int i, ExifInterface exifInterface, jfs jfsVar) {
        if (jfsVar != null) {
            jfsVar.m13108n(exifInterface);
        }
        return new fxt(j, bArr, kbcVar, i, exifInterface);
    }
}
