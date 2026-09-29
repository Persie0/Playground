package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class gd0 implements zz3 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f40558a;

    public gd0(Bitmap bitmap) {
        this.f40558a = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.f40558a;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
