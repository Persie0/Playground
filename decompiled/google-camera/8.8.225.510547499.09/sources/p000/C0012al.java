package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0012al {

    /* JADX INFO: renamed from: d */
    public float f614d;

    /* JADX INFO: renamed from: h */
    public int f618h;

    /* JADX INFO: renamed from: a */
    public int f611a = -1;

    /* JADX INFO: renamed from: b */
    public int f612b = -1;

    /* JADX INFO: renamed from: c */
    public int f613c = 0;

    /* JADX INFO: renamed from: e */
    public final float[] f615e = new float[6];

    /* JADX INFO: renamed from: f */
    C0009ai[] f616f = new C0009ai[8];

    /* JADX INFO: renamed from: g */
    int f617g = 0;

    public C0012al(int i) {
        this.f618h = i;
    }

    /* JADX INFO: renamed from: a */
    final void m891a(C0009ai c0009ai) {
        int i = 0;
        for (int i2 = 0; i2 < this.f617g; i2++) {
            if (this.f616f[i2] == c0009ai) {
                while (true) {
                    int i3 = this.f617g;
                    if (i >= (i3 - i2) - 1) {
                        this.f617g = i3 - 1;
                        return;
                    }
                    C0009ai[] c0009aiArr = this.f616f;
                    int i4 = i2 + i;
                    c0009aiArr[i4] = c0009aiArr[i4 + 1];
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m892b() {
        this.f618h = 5;
        this.f613c = 0;
        this.f611a = -1;
        this.f612b = -1;
        this.f614d = 0.0f;
        this.f617g = 0;
    }

    public final String toString() {
        return gBCSQzBeB.ACrcMI;
    }
}
