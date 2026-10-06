package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlr {

    /* JADX INFO: renamed from: a */
    public final Bitmap f28275a;

    /* JADX INFO: renamed from: b */
    public final kay f28276b;

    public hlr(Bitmap bitmap, kay kayVar) {
        bitmap.getClass();
        kayVar.getClass();
        this.f28275a = bitmap;
        this.f28276b = kayVar;
    }

    public final String toString() {
        return "OrientationBitmap[Bitmap: " + this.f28275a.toString() + "][rotation: " + this.f28276b.toString() + "]: " + hashCode();
    }
}
