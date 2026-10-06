package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mom {

    /* JADX INFO: renamed from: a */
    public final int f41196a;

    /* JADX INFO: renamed from: b */
    public final int f41197b;

    /* JADX INFO: renamed from: c */
    public final int f41198c;

    /* JADX INFO: renamed from: d */
    public final Object f41199d;

    public mom(String str, int i, int i2) {
        this.f41199d = str;
        this.f41197b = i;
        this.f41198c = i2;
        this.f41196a = -1;
    }

    public mom(String str, int i, int i2, int i3) {
        this.f41199d = str;
        this.f41197b = i;
        this.f41198c = i2;
        this.f41196a = i3;
    }

    public mom(mon monVar, int i, int i2, int i3) {
        this.f41196a = i;
        this.f41197b = i2;
        this.f41198c = i3;
        this.f41199d = monVar;
    }

    public mom(byte[] bArr, int i, int i2, int i3) {
        lku.m15670x(i2 >= 0, "offset must be >= 0");
        lku.m15670x(i3 > 0, "length must be > 0");
        lku.m15670x(i3 <= bArr.length, wUzNh.GtXncAZcy);
        this.f41199d = bArr;
        this.f41198c = i;
        this.f41196a = i2;
        this.f41197b = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m16710a() {
        return this.f41197b + 2;
    }
}
