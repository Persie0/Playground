package com.google.android.clockwork.common.wearable.wearmaterial.pageindicator;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.acp;
import p000.ixm;
import p000.ixn;
import p000.ixo;
import p000.ixp;
import p000.ixq;
import p000.jbx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearPageIndicatorDrawable extends Drawable {
    private static final float MAX_PAGE_POS_TO_CENTER_DISTANCE = 0.5f;
    private static final int MAX_VISIBLE_INDICATORS = 6;
    private static final float OVERFLOW_FADEOUT_LENGTH = 6.0f;
    private static final float OVERFLOW_FADE_DISTANCE_TO_PAGE_POS = 1.0f;
    private ixq canvasTransformer;
    private int dotRadius;
    private final Paint indicatorPaint;
    private float selectedAlpha;
    private final ixm state;
    private float unselectedAlpha;

    public WearPageIndicatorDrawable() {
        Paint paint = new Paint();
        this.indicatorPaint = paint;
        this.state = new ixm();
        paint.setAntiAlias(true);
    }

    private float computeIndicatorDotRadius(int i) {
        ixm ixmVar = this.state;
        if (ixmVar.f32583a) {
            return this.dotRadius;
        }
        float f = ixmVar.f32587e;
        float f2 = i;
        float fAbs = Math.abs(f2 - ixmVar.f32588f);
        float fAbs2 = Math.abs(f2 - f) - 1.0f;
        float f3 = fAbs - 3.0f;
        return this.dotRadius * jbx.m12864i(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - (f3 + f3), 0.0f, OVERFLOW_FADE_DISTANCE_TO_PAGE_POS) * jbx.m12864i(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - (fAbs2 / OVERFLOW_FADEOUT_LENGTH), 0.0f, OVERFLOW_FADE_DISTANCE_TO_PAGE_POS);
    }

    private boolean needsMirroring() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ixm ixmVar;
        int i;
        float fM12864i;
        if (this.canvasTransformer == null || (i = (ixmVar = this.state).f32584b) <= 1) {
            return;
        }
        float fM12864i2 = jbx.m12864i(ixmVar.f32587e, 0.0f, i - 1);
        ixmVar.f32587e = fM12864i2;
        if (ixmVar.f32583a) {
            fM12864i = (ixmVar.f32584b - 1) / 2.0f;
            ixmVar.f32588f = fM12864i;
        } else {
            float fMin = ixmVar.f32588f;
            float f = fMin - 0.5f;
            float f2 = fMin + MAX_PAGE_POS_TO_CENTER_DISTANCE;
            float f3 = ixmVar.f32591i;
            if (fM12864i2 < f) {
                fMin = fM12864i2 + MAX_PAGE_POS_TO_CENTER_DISTANCE;
                ixmVar.f32588f = fMin;
                ixmVar.f32594l = 2;
            } else if (fM12864i2 > f2) {
                fMin = fM12864i2 - 0.5f;
                ixmVar.f32588f = fMin;
                ixmVar.f32594l = 1;
            } else if (fMin != f3) {
                int i2 = ixmVar.f32594l;
                if (i2 == 1) {
                    fMin = Math.max(fM12864i2 - 0.5f, ixmVar.f32592j);
                    ixmVar.f32588f = fMin;
                } else if (i2 == 2) {
                    fMin = Math.min(fM12864i2 + MAX_PAGE_POS_TO_CENTER_DISTANCE, ixmVar.f32593k);
                    ixmVar.f32588f = fMin;
                }
            }
            fM12864i = jbx.m12864i(fMin, ixmVar.f32590h, ixmVar.f32589g);
            ixmVar.f32588f = fM12864i;
        }
        int iFloor = (int) Math.floor(fM12864i);
        float f4 = ixmVar.f32588f;
        float f5 = iFloor;
        float f6 = f4 - f5 > MAX_PAGE_POS_TO_CENTER_DISTANCE ? f5 + MAX_PAGE_POS_TO_CENTER_DISTANCE : f5 - 0.5f;
        ixmVar.f32592j = f6;
        ixmVar.f32593k = f6 + OVERFLOW_FADE_DISTANCE_TO_PAGE_POS;
        ixmVar.f32591i = Math.abs(f4 - f6) < Math.abs(ixmVar.f32588f - ixmVar.f32593k) ? ixmVar.f32592j : ixmVar.f32593k;
        if (ixmVar.f32583a) {
            ixmVar.f32585c = 0;
            ixmVar.f32586d = ixmVar.f32584b - 1;
        } else {
            ixmVar.f32585c = (int) jbx.m12864i((float) Math.floor(ixmVar.f32588f - 3.0f), 0.0f, ixmVar.f32584b - 1);
            ixmVar.f32586d = (int) jbx.m12864i((float) StrictMath.ceil(ixmVar.f32588f + 3.0f), 0.0f, ixmVar.f32584b - 1);
        }
        ixm ixmVar2 = this.state;
        int i3 = ixmVar2.f32585c;
        int i4 = ixmVar2.f32586d;
        float f7 = ixmVar2.f32588f;
        float f8 = needsMirroring() ? i4 - this.state.f32587e : this.state.f32587e;
        canvas.save();
        this.canvasTransformer.mo11864a(getBounds(), canvas, i3, f7);
        while (i3 <= i4) {
            float fMin2 = OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - Math.min(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS, Math.abs(f8 - i3));
            float f9 = this.unselectedAlpha;
            this.indicatorPaint.setColor(acp.m212d(-1, (int) (f9 + ((this.selectedAlpha - f9) * fMin2))));
            canvas.drawCircle(0.0f, 0.0f, computeIndicatorDotRadius(i3), this.indicatorPaint);
            this.canvasTransformer.mo11865b(getBounds(), canvas);
            i3++;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, ixn.f32595a, 0, 0) : resources.obtainAttributes(attributeSet, ixn.f32595a);
        this.dotRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.selectedAlpha = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.unselectedAlpha = typedArrayObtainStyledAttributes.getInteger(3, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (resources.getConfiguration().isScreenRound()) {
            this.canvasTransformer = new ixp(this.dotRadius, dimensionPixelSize);
        } else {
            this.canvasTransformer = new ixo(this.dotRadius, resources.getDimensionPixelOffset(C0100R.dimen.wear_page_indicator_rectangular_dot_distance), dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setPageCount(int i) {
        ixm ixmVar = this.state;
        ixmVar.f32584b = i;
        ixmVar.f32583a = i <= 6;
        ixmVar.f32590h = 2.5f;
        ixmVar.f32589g = (i - 1) - 2.5f;
        invalidateSelf();
    }

    public void setPagePosition(float f) {
        this.state.f32587e = f;
        invalidateSelf();
    }
}
