package com.google.android.clockwork.common.wearable.wearmaterial.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.aea;
import p000.iza;
import p000.izd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BlendContentDrawable extends DrawableWrapper {
    private iza blendMode;
    private final Paint contentPaint;
    private aea contentProvider;
    private final Paint drawablePaint;
    private final RectF tmpRectF;

    public BlendContentDrawable() {
        super(null);
        Paint paint = new Paint();
        this.contentPaint = paint;
        Paint paint2 = new Paint();
        this.drawablePaint = paint2;
        this.tmpRectF = new RectF();
        this.blendMode = iza.NONE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    }

    public static BlendContentDrawable create(Drawable drawable) {
        return create(drawable, iza.NONE);
    }

    private void drawWithAlphaBlending(Canvas canvas, aea aeaVar) {
        this.tmpRectF.set(getBounds());
        int iSaveLayer = canvas.saveLayer(this.tmpRectF, this.contentPaint);
        aeaVar.mo309a(canvas);
        int iSaveLayer2 = canvas.saveLayer(this.tmpRectF, this.drawablePaint);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer2);
        canvas.restoreToCount(iSaveLayer);
    }

    private void initialize(Drawable drawable, iza izaVar) {
        setDrawable(drawable);
        setBlendMode(izaVar);
    }

    private boolean useAlphaChannelBlending() {
        return this.blendMode != iza.NONE;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        aea aeaVar = this.contentProvider;
        if (aeaVar != null) {
            draw(canvas, aeaVar);
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
        if (useAlphaChannelBlending()) {
            return -3;
        }
        return super.getOpacity();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        iza izaVar;
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, izd.f32705a, 0, 0) : resources.obtainAttributes(attributeSet, izd.f32705a);
        setDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        switch (typedArrayObtainStyledAttributes.getInt(1, 0)) {
            case 1:
                izaVar = iza.COLOR;
                break;
            case 2:
                izaVar = iza.ALPHA;
                break;
            default:
                izaVar = iza.NONE;
                break;
        }
        setBlendMode(izaVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setBlendMode(iza izaVar) {
        this.blendMode = izaVar;
        Paint paint = this.drawablePaint;
        iza izaVar2 = iza.NONE;
        paint.setXfermode(new PorterDuffXfermode(izaVar.f32702d));
    }

    public void setContentProvider(aea aeaVar) {
        if (this.contentProvider == null) {
            this.contentProvider = aeaVar;
        }
    }

    public static BlendContentDrawable create(Drawable drawable, iza izaVar) {
        BlendContentDrawable blendContentDrawable = new BlendContentDrawable();
        blendContentDrawable.initialize(drawable, izaVar);
        return blendContentDrawable;
    }

    private void draw(Canvas canvas, aea aeaVar) {
        if (useAlphaChannelBlending()) {
            drawWithAlphaBlending(canvas, aeaVar);
        } else {
            aeaVar.mo309a(canvas);
            super.draw(canvas);
        }
    }
}
