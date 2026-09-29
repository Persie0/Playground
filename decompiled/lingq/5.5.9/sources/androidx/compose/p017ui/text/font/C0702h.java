package androidx.compose.p017ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import p328q1.C8475l;
import p328q1.C8484u;
import p328q1.InterfaceC8474k;
import p338qd.C8573r0;
import p470x1.C10016d;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0702h {
    /* JADX INFO: renamed from: a */
    public static final Typeface m2600a(Typeface typeface, C8475l c8475l, Context context) {
        C5207g.m11111f(c8475l, "variationSettings");
        ThreadLocal<Paint> threadLocal = C8484u.f45664a;
        if (typeface == null) {
            return null;
        }
        ArrayList arrayList = c8475l.f45645a;
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal2 = C8484u.f45664a;
        Paint paint = threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setTypeface(typeface);
        final C10016d c10016dM16746p = C8573r0.m16746p(context);
        paint.setFontVariationSettings(C8573r0.m16719d0(arrayList, null, new InterfaceC2052l<InterfaceC8474k, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(InterfaceC8474k interfaceC8474k) {
                InterfaceC8474k interfaceC8474k2 = interfaceC8474k;
                C5207g.m11111f(interfaceC8474k2, "setting");
                return "'" + interfaceC8474k2.m16551c() + "' " + interfaceC8474k2.m16550b();
            }
        }, 31));
        return paint.getTypeface();
    }
}
