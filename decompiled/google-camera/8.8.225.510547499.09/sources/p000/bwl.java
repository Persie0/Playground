package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bwl implements bqv {
    @Override // p000.bqv
    /* JADX INFO: renamed from: b */
    public final bsz mo2933b(Context context, bsz bszVar, int i, int i2) {
        if (!cbi.m3393n(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        bti btiVar = box.m2826b(context).f4032a;
        Bitmap bitmap = (Bitmap) bszVar.mo3016c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo3132c = mo3132c(btiVar, bitmap, i, i2);
        return bitmap.equals(bitmapMo3132c) ? bszVar : bxk.m3162g(bitmapMo3132c, btiVar);
    }

    /* JADX INFO: renamed from: c */
    protected abstract Bitmap mo3132c(bti btiVar, Bitmap bitmap, int i, int i2);
}
