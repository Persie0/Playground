package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class luc {

    /* JADX INFO: renamed from: a */
    public int f39211a;

    public luc() {
    }

    public luc(byte[] bArr) {
        this.f39211a = 1;
    }

    public luc(byte[] bArr, byte[] bArr2) {
        this.f39211a = -1;
    }

    public luc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f39211a = -1;
        this.f39211a = m15984d();
    }

    public luc(char[] cArr) {
        this.f39211a = 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m15983c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    /* JADX INFO: renamed from: d */
    public static int m15984d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    /* JADX INFO: renamed from: a */
    public final void m15985a(boolean z) {
        this.f39211a = (this.f39211a * 31) + (z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m15986b(Object obj) {
        this.f39211a = (this.f39211a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: e */
    public final void m15987e() {
        GLES20.glDeleteTextures(1, new int[]{this.f39211a}, 0);
        this.f39211a = -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m15988f() throws ewy {
        int i = this.f39211a;
        if (i < 0) {
            throw new ewy("Trying to bind without a loaded texture");
        }
        GLES20.glBindTexture(3553, i);
        ewy.m7963a("glBindTexture");
    }
}
