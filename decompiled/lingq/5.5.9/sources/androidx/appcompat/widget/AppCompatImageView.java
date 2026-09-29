package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public final C0304d f897a;

    /* JADX INFO: renamed from: b */
    public final C0328m f898b;

    /* JADX INFO: renamed from: c */
    public boolean f899c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AppCompatImageView() {
        throw null;
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0353y0.m1309a(context);
        this.f899c = false;
        C0349w0.m1279a(getContext(), this);
        C0304d c0304d = new C0304d(this);
        this.f897a = c0304d;
        c0304d.m1128d(attributeSet, i10);
        C0328m c0328m = new C0328m(this);
        this.f898b = c0328m;
        c0328m.m1248b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            c0328m.m1247a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0355z0 c0355z0;
        C0328m c0328m = this.f898b;
        if (c0328m == null || (c0355z0 = c0328m.f1295b) == null) {
            return null;
        }
        return c0355z0.f1407a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0355z0 c0355z0;
        C0328m c0328m = this.f898b;
        if (c0328m == null || (c0355z0 = c0328m.f1295b) == null) {
            return null;
        }
        return c0355z0.f1408b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f898b.f1294a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            c0328m.m1247a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0328m c0328m = this.f898b;
        if (c0328m != null && drawable != null && !this.f899c) {
            c0328m.f1296c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0328m != null) {
            c0328m.m1247a();
            if (!this.f899c) {
                ImageView imageView = c0328m.f1294a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c0328m.f1296c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f899c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            c0328m.m1249c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            c0328m.m1247a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f897a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            if (c0328m.f1295b == null) {
                c0328m.f1295b = new C0355z0();
            }
            C0355z0 c0355z0 = c0328m.f1295b;
            c0355z0.f1407a = colorStateList;
            c0355z0.f1410d = true;
            c0328m.m1247a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0328m c0328m = this.f898b;
        if (c0328m != null) {
            if (c0328m.f1295b == null) {
                c0328m.f1295b = new C0355z0();
            }
            C0355z0 c0355z0 = c0328m.f1295b;
            c0355z0.f1408b = mode;
            c0355z0.f1409c = true;
            c0328m.m1247a();
        }
    }
}
