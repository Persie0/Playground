package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: fq */
/* JADX INFO: loaded from: classes.dex */
public class C3010fq extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C3488q8 f39444a;

    /* JADX INFO: renamed from: b */
    public final C3047gq f39445b;

    /* JADX INFO: renamed from: c */
    public boolean f39446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3010fq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k1a.m14773a(context);
        this.f39446c = false;
        oz9.m18842a(this, getContext());
        C3488q8 c3488q8 = new C3488q8(this);
        this.f39444a = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        C3047gq c3047gq = new C3047gq(this);
        this.f39445b = c3047gq;
        c3047gq.m12809m(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null) {
            c3047gq.m12799b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        l1a l1aVar;
        C3047gq c3047gq = this.f39445b;
        if (c3047gq == null || (l1aVar = (l1a) c3047gq.f41173d) == null) {
            return null;
        }
        return l1aVar.f48901a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l1a l1aVar;
        C3047gq c3047gq = this.f39445b;
        if (c3047gq == null || (l1aVar = (l1a) c3047gq.f41173d) == null) {
            return null;
        }
        return l1aVar.f48902b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f39445b.f41172c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null) {
            c3047gq.m12799b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null && drawable != null && !this.f39446c) {
            c3047gq.f41171b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c3047gq != null) {
            c3047gq.m12799b();
            if (this.f39446c) {
                return;
            }
            ImageView imageView = (ImageView) c3047gq.f41172c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c3047gq.f41171b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f39446c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C3047gq c3047gq = this.f39445b;
        ImageView imageView = (ImageView) c3047gq.f41172c;
        if (i != 0) {
            Drawable drawableM3932U = bna.m3932U(imageView.getContext(), i);
            if (drawableM3932U != null) {
                wl2.m24046a(drawableM3932U);
            }
            imageView.setImageDrawable(drawableM3932U);
        } else {
            imageView.setImageDrawable(null);
        }
        c3047gq.m12799b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null) {
            c3047gq.m12799b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f39444a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null) {
            if (((l1a) c3047gq.f41173d) == null) {
                c3047gq.f41173d = new l1a();
            }
            l1a l1aVar = (l1a) c3047gq.f41173d;
            l1aVar.f48901a = colorStateList;
            l1aVar.f48904d = true;
            c3047gq.m12799b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C3047gq c3047gq = this.f39445b;
        if (c3047gq != null) {
            if (((l1a) c3047gq.f41173d) == null) {
                c3047gq.f41173d = new l1a();
            }
            l1a l1aVar = (l1a) c3047gq.f41173d;
            l1aVar.f48902b = mode;
            l1aVar.f48903c = true;
            c3047gq.m12799b();
        }
    }
}
