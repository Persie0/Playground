package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import kotlin.sequences.AbstractC3204c;
import p000.C3386nv;
import p000.ux8;
import p000.z91;

/* JADX INFO: renamed from: androidx.core.view.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0479a {
    /* JADX INFO: renamed from: a */
    public static Bitmap m1999a(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!view.isLaidOut()) {
            C3386nv.m17633t("View needs to be laid out before calling drawToBitmap()");
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static final z91 m2000b(View view) {
        return new z91(new ViewKt$allViews$1(view, null), 1);
    }

    /* JADX INFO: renamed from: c */
    public static final ux8 m2001c(View view) {
        return AbstractC3204c.m15418n0(view.getParent(), ViewKt$ancestors$1.f5518i);
    }
}
