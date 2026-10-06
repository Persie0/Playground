package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htk {

    /* JADX INFO: renamed from: c */
    private static final Bitmap f29528c = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);

    /* JADX INFO: renamed from: a */
    public final Bitmap f29529a;

    /* JADX INFO: renamed from: b */
    public final int f29530b;

    public htk(Bitmap bitmap, int i) {
        this.f29529a = bitmap;
        this.f29530b = i;
    }

    /* JADX INFO: renamed from: a */
    public static htk m10745a() {
        return new htk(f29528c, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10746b() {
        return this.f29529a == null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10747c() {
        return this.f29529a == f29528c;
    }
}
