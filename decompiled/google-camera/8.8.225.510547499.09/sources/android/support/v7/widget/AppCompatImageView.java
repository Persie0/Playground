package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000.C0266ij;
import p000.C0274ir;
import p000.C0847nf;
import p000.C0849nh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private final C0266ij f1003a;

    /* JADX INFO: renamed from: b */
    private final C0274ir f1004b;

    /* JADX INFO: renamed from: c */
    private boolean f1005c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f1003a;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0274ir c0274ir = this.f1004b;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1004b.m11627f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f1003a;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f1003a;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0274ir c0274ir = this.f1004b;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0274ir c0274ir = this.f1004b;
        if (c0274ir != null && drawable != null && !this.f1005c) {
            c0274ir.m11625d(drawable);
        }
        super.setImageDrawable(drawable);
        C0274ir c0274ir2 = this.f1004b;
        if (c0274ir2 != null) {
            c0274ir2.m11623b();
            if (this.f1005c) {
                return;
            }
            this.f1004b.m11622a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1005c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0274ir c0274ir = this.f1004b;
        if (c0274ir != null) {
            c0274ir.m11626e(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0274ir c0274ir = this.f1004b;
        if (c0274ir != null) {
            c0274ir.m11623b();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0849nh.m17473a(context);
        this.f1005c = false;
        C0847nf.m17435d(this, getContext());
        C0266ij c0266ij = new C0266ij(this);
        this.f1003a = c0266ij;
        c0266ij.m11393d(attributeSet, i);
        C0274ir c0274ir = new C0274ir(this);
        this.f1004b = c0274ir;
        c0274ir.m11624c(attributeSet, i);
    }
}
