package p387t0;

import android.graphics.Bitmap;
import dm.C5207g;

/* JADX INFO: renamed from: t0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9143f implements InterfaceC9174z {

    /* JADX INFO: renamed from: a */
    public final Bitmap f47649a;

    public C9143f(Bitmap bitmap) {
        C5207g.m11111f(bitmap, "bitmap");
        this.f47649a = bitmap;
    }

    @Override // p387t0.InterfaceC9174z
    /* JADX INFO: renamed from: a */
    public final int mo17437a() {
        return this.f47649a.getHeight();
    }

    @Override // p387t0.InterfaceC9174z
    /* JADX INFO: renamed from: b */
    public final int mo17438b() {
        return this.f47649a.getWidth();
    }
}
