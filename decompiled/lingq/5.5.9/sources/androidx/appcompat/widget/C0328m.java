package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p024b3.C1299f;
import p058d.C4999a;
import p104f.C5452a;
import p471x2.C10029b0;

/* JADX INFO: renamed from: androidx.appcompat.widget.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0328m {

    /* JADX INFO: renamed from: a */
    public final ImageView f1294a;

    /* JADX INFO: renamed from: b */
    public C0355z0 f1295b;

    /* JADX INFO: renamed from: c */
    public int f1296c = 0;

    public C0328m(ImageView imageView) {
        this.f1294a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m1247a() {
        C0355z0 c0355z0;
        ImageView imageView = this.f1294a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0311f0.m1186a(drawable);
        }
        if (drawable != null && (c0355z0 = this.f1295b) != null) {
            C0319i.m1204e(drawable, c0355z0, imageView.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1248b(AttributeSet attributeSet, int i10) {
        int iM1120i;
        ImageView imageView = this.f1294a;
        Context context = imageView.getContext();
        int[] iArr = C4999a.f32592f;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context, attributeSet, iArr, i10);
        C10029b0.m18657m(imageView, imageView.getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iM1120i = c0300b1M1111m.m1120i(1, -1)) != -1 && (drawable = C5452a.m11672a(imageView.getContext(), iM1120i)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0311f0.m1186a(drawable);
            }
            if (c0300b1M1111m.m1123l(2)) {
                C1299f.m4817c(imageView, c0300b1M1111m.m1113b(2));
            }
            if (c0300b1M1111m.m1123l(3)) {
                C1299f.m4818d(imageView, C0311f0.m1188c(c0300b1M1111m.m1119h(3, -1), null));
            }
        } finally {
            c0300b1M1111m.m1124n();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1249c(int i10) {
        ImageView imageView = this.f1294a;
        if (i10 != 0) {
            Drawable drawableM11672a = C5452a.m11672a(imageView.getContext(), i10);
            if (drawableM11672a != null) {
                C0311f0.m1186a(drawableM11672a);
            }
            imageView.setImageDrawable(drawableM11672a);
        } else {
            imageView.setImageDrawable(null);
        }
        m1247a();
    }
}
