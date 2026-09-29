package p007a6;

import android.graphics.Bitmap;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import p003a2.C0009a;
import p258m6.C7492l;
import p356r5.InterfaceC8738h;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0029h implements InterfaceC8738h<Bitmap> {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p356r5.InterfaceC8738h
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m mo160a(C2085g c2085g, InterfaceC9207m interfaceC9207m, int i10, int i11) {
        if (!C7492l.m14888i(i10, i11)) {
            throw new IllegalArgumentException(C0009a.m20h("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC9452c interfaceC9452c = ComponentCallbacks2C2080b.m6235a(c2085g).f10550a;
        Bitmap bitmap = (Bitmap) interfaceC9207m.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapMo161c = mo161c(interfaceC9452c, bitmap, i10, i11);
        return bitmap.equals(bitmapMo161c) ? interfaceC9207m : C0028g.m155e(bitmapMo161c, interfaceC9452c);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo161c(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11);
}
