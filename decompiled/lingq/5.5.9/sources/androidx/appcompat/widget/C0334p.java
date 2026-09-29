package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p329q2.InterfaceC8491d;

/* JADX INFO: renamed from: androidx.appcompat.widget.p */
/* JADX INFO: loaded from: classes.dex */
public class C0334p {

    /* JADX INFO: renamed from: c */
    public static final int[] f1308c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final ProgressBar f1309a;

    /* JADX INFO: renamed from: b */
    public Bitmap f1310b;

    public C0334p(ProgressBar progressBar) {
        this.f1309a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public void mo1254a(AttributeSet attributeSet, int i10) {
        ProgressBar progressBar = this.f1309a;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(progressBar.getContext(), attributeSet, f1308c, i10);
        Drawable drawableM1117f = c0300b1M1111m.m1117f(0);
        if (drawableM1117f != null) {
            if (drawableM1117f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM1117f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable drawableM1255b = m1255b(animationDrawable.getFrame(i11), true);
                    drawableM1255b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM1255b, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                drawableM1117f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableM1117f);
        }
        Drawable drawableM1117f2 = c0300b1M1111m.m1117f(1);
        if (drawableM1117f2 != null) {
            progressBar.setProgressDrawable(m1255b(drawableM1117f2, false));
        }
        c0300b1M1111m.m1124n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Drawable m1255b(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC8491d) {
            InterfaceC8491d interfaceC8491d = (InterfaceC8491d) drawable;
            Drawable drawableM16578b = interfaceC8491d.m16578b();
            if (drawableM16578b != null) {
                interfaceC8491d.m16577a(m1255b(drawableM16578b, z10));
            }
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                drawableArr[i10] = m1255b(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
            }
            return layerDrawable2;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1310b == null) {
                this.f1310b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
