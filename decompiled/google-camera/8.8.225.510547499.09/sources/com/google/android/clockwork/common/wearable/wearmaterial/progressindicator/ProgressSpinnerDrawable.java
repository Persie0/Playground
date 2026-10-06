package com.google.android.clockwork.common.wearable.wearmaterial.progressindicator;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.aax;
import p000.iyk;
import p000.iyl;
import p000.iym;
import p000.iyn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressSpinnerDrawable extends Drawable {
    private static final int DEFAULT_PROGRESS_COLOR = -1;
    private static final int DEFAULT_TRACK_COLOR = 452984831;
    private static final float DEFAULT_TRACK_WIDTH_DP = 3.0f;
    private static final float DEGREES_PER_RADIAN = 57.295776f;
    private static final int LEVEL_RANGE = 10000;
    private static final float MAX_DEGREES = 360.0f;
    private static final float START_OFFSET = 270.0f;
    private static final float TINY_SWEEP_ANGLE_SIZE = 0.01f;
    private static final int TRACK_ALPHA = 26;
    private float capRadiusInDegrees;
    private final Paint paintProgress;
    private final Paint paintTrack;
    private float rotation;
    private boolean showEmptySweepAngle;
    private float startAngle;
    private float sweepAngle;
    private ColorStateList trackColor;
    private float trackStartAngle;
    private float trackWidth;
    private final iyn typedArrayHelper;
    private final iyl themeState = new iyl(this);
    private ColorStateList progressColor = ColorStateList.valueOf(-1);
    private int gravity = 17;
    private iyk direction = iyk.CLOCKWISE;
    private float trackEndAngle = MAX_DEGREES;
    private final Rect destSquare = new Rect();

    public ProgressSpinnerDrawable() {
        Paint paint = new Paint();
        this.paintProgress = paint;
        Paint paint2 = new Paint();
        this.paintTrack = paint2;
        this.typedArrayHelper = new iyn(iym.f32661a);
        this.trackWidth = Resources.getSystem().getDisplayMetrics().density * DEFAULT_TRACK_WIDTH_DP;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.trackWidth);
        paint.setColor(this.progressColor.getDefaultColor());
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.trackWidth);
        paint2.setColor(this.progressColor.getDefaultColor());
    }

    private void applyGravity(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        Gravity.apply(this.gravity, iMin, iMin, rect, this.destSquare);
    }

    private float getArcRadius() {
        float fWidth = this.destSquare.width();
        float f = this.trackWidth;
        return Math.max(fWidth - f, f) / 2.0f;
    }

    private void obtainAttributes(TypedArray typedArray) {
        obtainThemedAttributes(typedArray);
        int[] iArr = iym.f32661a;
        setTrackWidth(typedArray.getDimension(11, this.paintTrack.getStrokeWidth()));
        setTrackStartAngle(typedArray.getFloat(10, this.trackStartAngle));
        setTrackEndAngle(typedArray.getFloat(9, this.trackEndAngle));
        iyk iykVar = this.direction;
        iyk iykVar2 = iyk.CLOCKWISE;
        setDirection(typedArray.getInt(3, iykVar.f32657c) == 1 ? iyk.COUNTER_CLOCKWISE : iyk.CLOCKWISE);
        showEmptySweepAngle(typedArray.getBoolean(2, this.showEmptySweepAngle));
        setStartAngle(typedArray.getFloat(6, this.startAngle));
        setSweepAngle(typedArray.getFloat(7, this.sweepAngle));
        setLevel(typedArray.getInt(1, getLevel()));
        setRotation(typedArray.getFloat(5, this.rotation));
        setGravity(typedArray.getInt(0, this.gravity));
    }

    private void obtainThemedAttributes(TypedArray typedArray) {
        int[] iArr = iym.f32661a;
        if (iyn.m11907a(typedArray, 4)) {
            this.themeState.f32658a = typedArray.getColorStateList(4);
        }
        if (iyn.m11907a(typedArray, 8)) {
            this.themeState.f32659b = typedArray.getColorStateList(8);
        }
    }

    private void updateBounds(Rect rect) {
        applyGravity(rect);
        updateCapRadius();
        updateProgressPaint();
    }

    private void updateCapRadius() {
        this.capRadiusInDegrees = (this.trackWidth / getArcRadius()) * DEGREES_PER_RADIAN;
    }

    private boolean updateColors(int[] iArr) {
        int colorForState = this.progressColor.getColorForState(iArr, -1);
        boolean z = colorForState != this.paintProgress.getColor();
        if (z) {
            this.paintProgress.setColor(colorForState);
        }
        ColorStateList colorStateListWithAlpha = this.trackColor;
        if (colorStateListWithAlpha == null) {
            colorStateListWithAlpha = this.progressColor.withAlpha(26);
        }
        int colorForState2 = colorStateListWithAlpha.getColorForState(iArr, DEFAULT_TRACK_COLOR);
        boolean z2 = colorForState2 != this.paintTrack.getColor();
        if (z2) {
            this.paintTrack.setColor(colorForState2);
        }
        return z || z2;
    }

    private void updateTrackCap() {
        this.paintTrack.setStrokeCap(getMaximumSweepAngle() == MAX_DEGREES ? Paint.Cap.BUTT : Paint.Cap.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(this.typedArrayHelper.f32663b);
        obtainThemedAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.themeState.m11906a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.typedArrayHelper.f32664c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        if (!isVisible() || this.destSquare.isEmpty()) {
            return;
        }
        float f2 = this.sweepAngle;
        float f3 = this.capRadiusInDegrees;
        float fMin = TINY_SWEEP_ANGLE_SIZE;
        if (f2 > f3 || !this.showEmptySweepAngle) {
            if (f2 == 0.0f) {
                fMin = 0.0f;
            } else if (f2 > f3) {
                float f4 = f2 - f3;
                fMin = f4 + ((this.sweepAngle - f4) * Math.min(f4 / (MAX_DEGREES - f3), 1.0f));
            }
            f = this.direction == iyk.CLOCKWISE ? this.trackStartAngle + this.startAngle : (this.trackEndAngle - this.startAngle) - fMin;
        } else {
            f = (this.trackStartAngle + this.startAngle) - 0.005f;
        }
        draw(canvas, f + START_OFFSET, fMin);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.paintProgress.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.paintProgress.getColorFilter();
    }

    public float getMaximumSweepAngle() {
        return Math.abs(this.trackEndAngle - this.trackStartAngle);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public Insets getOpticalInsets() {
        Rect bounds = getBounds();
        return Insets.of(this.destSquare.left - bounds.left, this.destSquare.top - bounds.top, bounds.right - this.destSquare.right, bounds.bottom - this.destSquare.bottom);
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    public float getSweepAngle() {
        return this.sweepAngle;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        iyn iynVar = this.typedArrayHelper;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iynVar.f32662a, 0, 0) : resources.obtainAttributes(attributeSet, iynVar.f32662a);
        TypedValue typedValue = new TypedValue();
        for (int i = 0; i < 12; i++) {
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.getValue(i, typedValue);
                if (typedValue.type == 2) {
                    iynVar.f32663b[i] = typedValue.data;
                    iynVar.f32664c = true;
                }
            }
        }
        obtainAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (this.typedArrayHelper.f32664c) {
            return;
        }
        this.themeState.m11906a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.progressColor.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.trackColor;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        updateBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int iM69d = aax.m69d(Math.abs(i), 0, LEVEL_RANGE);
        float maximumSweepAngle = getMaximumSweepAngle();
        if (iM69d != LEVEL_RANGE) {
            maximumSweepAngle = (maximumSweepAngle / 10000.0f) * iM69d;
        }
        if (this.sweepAngle == maximumSweepAngle) {
            return false;
        }
        this.sweepAngle = maximumSweepAngle;
        if (this.showEmptySweepAngle) {
            return true;
        }
        updateProgressPaint();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return updateColors(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.paintTrack.getAlpha() != i) {
            this.paintProgress.setAlpha(i);
            this.paintTrack.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paintProgress.setColorFilter(colorFilter);
        this.paintTrack.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(iyk iykVar) {
        if (this.direction != iykVar) {
            this.direction = iykVar;
            invalidateSelf();
        }
    }

    public void setGravity(int i) {
        if (this.gravity != i) {
            this.gravity = i;
            updateBounds(getBounds());
            invalidateSelf();
        }
    }

    public void setProgressColor(ColorStateList colorStateList) {
        this.progressColor = colorStateList;
        if (updateColors(getState())) {
            invalidateSelf();
        }
    }

    public void setRotation(float f) {
        float f2 = this.rotation;
        float f3 = f % MAX_DEGREES;
        if (f2 != f3) {
            this.rotation = f3;
            invalidateSelf();
        }
    }

    public void setStartAngle(float f) {
        float maximumSweepAngle = f % getMaximumSweepAngle();
        if (this.startAngle != maximumSweepAngle) {
            this.startAngle = maximumSweepAngle;
            invalidateSelf();
        }
    }

    public void setSweepAngle(float f) {
        float fMin = Math.min(Math.abs(f), getMaximumSweepAngle());
        if (this.sweepAngle != fMin) {
            this.sweepAngle = fMin;
            if (!this.showEmptySweepAngle) {
                updateProgressPaint();
            }
            invalidateSelf();
        }
    }

    public void setTrackColor(ColorStateList colorStateList) {
        this.trackColor = colorStateList;
        if (updateColors(getState())) {
            invalidateSelf();
        }
    }

    public void setTrackEndAngle(float f) {
        if (this.trackEndAngle != f) {
            this.trackEndAngle = f;
            updateTrackCap();
            invalidateSelf();
        }
    }

    public void setTrackStartAngle(float f) {
        if (this.trackStartAngle != f) {
            this.trackStartAngle = f;
            updateTrackCap();
            invalidateSelf();
        }
    }

    public void setTrackWidth(float f) {
        float fMax = Math.max(0.0f, f);
        if (this.trackWidth == fMax) {
            return;
        }
        this.trackWidth = fMax;
        this.paintTrack.setStrokeWidth(fMax);
        updateCapRadius();
        updateProgressPaint();
        invalidateSelf();
    }

    public void showEmptySweepAngle(boolean z) {
        if (this.showEmptySweepAngle != z) {
            this.showEmptySweepAngle = z;
            updateProgressPaint();
            invalidateSelf();
        }
    }

    private void updateProgressPaint() {
        this.paintProgress.setStrokeWidth((this.showEmptySweepAngle ? 1.0f : Math.min(1.0f, ((this.sweepAngle * getArcRadius()) / DEGREES_PER_RADIAN) / this.trackWidth)) * this.trackWidth);
    }

    private void draw(Canvas canvas, float f, float f2) {
        int saveCount = canvas.getSaveCount();
        canvas.clipRect(this.destSquare);
        canvas.translate(this.destSquare.left, this.destSquare.top);
        float fWidth = this.destSquare.width() / 2.0f;
        canvas.rotate(this.rotation, fWidth, fWidth);
        float fCeil = (float) Math.ceil(this.paintTrack.getStrokeWidth() / 2.0f);
        float f3 = this.destSquare.right - fCeil;
        canvas.drawArc(fCeil, fCeil, f3, f3, this.trackStartAngle + START_OFFSET, getMaximumSweepAngle(), false, this.paintTrack);
        canvas.drawArc(fCeil, fCeil, f3, f3, f, f2, false, this.paintProgress);
        canvas.restoreToCount(saveCount);
    }
}
