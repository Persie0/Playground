package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: iq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0273iq extends ImageButton {
    private final C0266ij mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C0274ir mImageHelper;

    public C0273iq(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            return c0266ij.m11390a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            return c0266ij.m11391b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Object obj;
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir == null || (obj = c0274ir.f31847c) == null) {
            return null;
        }
        return ((C0850ni) obj).f42633a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Object obj;
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir == null || (obj = c0274ir.f31847c) == null) {
            return null;
        }
        return ((C0850ni) obj).f42634b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m11627f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null && drawable != null && !this.mHasLevel) {
            c0274ir.m11625d(drawable);
        }
        super.setImageDrawable(drawable);
        C0274ir c0274ir2 = this.mImageHelper;
        if (c0274ir2 != null) {
            c0274ir2.m11623b();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m11622a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.m11626e(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            c0266ij.m11396g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0266ij c0266ij = this.mBackgroundTintHelper;
        if (c0266ij != null) {
            c0266ij.m11397h(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null) {
            if (c0274ir.f31847c == null) {
                c0274ir.f31847c = new C0850ni();
            }
            C0850ni c0850ni = (C0850ni) c0274ir.f31847c;
            c0850ni.f42633a = colorStateList;
            c0850ni.f42636d = true;
            c0274ir.m11623b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0274ir c0274ir = this.mImageHelper;
        if (c0274ir != null) {
            if (c0274ir.f31847c == null) {
                c0274ir.f31847c = new C0850ni();
            }
            C0850ni c0850ni = (C0850ni) c0274ir.f31847c;
            c0850ni.f42634b = mode;
            c0850ni.f42635c = true;
            c0274ir.m11623b();
        }
    }

    public C0273iq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0273iq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0849nh.m17473a(context);
        this.mHasLevel = false;
        C0847nf.m17435d(this, getContext());
        C0266ij c0266ij = new C0266ij(this);
        this.mBackgroundTintHelper = c0266ij;
        c0266ij.m11393d(attributeSet, i);
        C0274ir c0274ir = new C0274ir(this);
        this.mImageHelper = c0274ir;
        c0274ir.m11624c(attributeSet, i);
    }
}
