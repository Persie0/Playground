package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class b04 {

    /* JADX INFO: renamed from: a */
    public int f7720a;

    /* JADX INFO: renamed from: b */
    public long f7721b;

    /* JADX INFO: renamed from: c */
    public Object f7722c;

    public b04(int i, long j) {
        this.f7720a = i;
        this.f7721b = j;
    }

    /* JADX INFO: renamed from: a */
    public long m3144a() {
        return this.f7721b;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m3145b() {
        return (Bitmap) this.f7722c;
    }

    /* JADX INFO: renamed from: c */
    public int m3146c() {
        return this.f7720a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3147d() {
        return ((Bitmap) this.f7722c) != null;
    }

    /* JADX INFO: renamed from: e */
    public void m3148e(Bitmap bitmap) {
        this.f7722c = bitmap;
    }
}
