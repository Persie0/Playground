package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atr extends atj {

    /* JADX INFO: renamed from: a */
    static final PorterDuff.Mode f2368a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public atp f2369b;

    /* JADX INFO: renamed from: c */
    public boolean f2370c;

    /* JADX INFO: renamed from: d */
    private PorterDuffColorFilter f2371d;

    /* JADX INFO: renamed from: f */
    private ColorFilter f2372f;

    /* JADX INFO: renamed from: g */
    private boolean f2373g;

    /* JADX INFO: renamed from: h */
    private final float[] f2374h;

    /* JADX INFO: renamed from: i */
    private final Matrix f2375i;

    /* JADX INFO: renamed from: j */
    private final Rect f2376j;

    public atr() {
        this.f2370c = true;
        this.f2374h = new float[9];
        this.f2375i = new Matrix();
        this.f2376j = new Rect();
        this.f2369b = new atp();
    }

    /* JADX INFO: renamed from: a */
    static int m1990a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* JADX INFO: renamed from: b */
    final PorterDuffColorFilter m1991b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2308e;
        if (drawable == null) {
            return false;
        }
        acv.m240i(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2376j);
        if (this.f2376j.width() <= 0 || this.f2376j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2372f;
        if (colorFilter == null) {
            colorFilter = this.f2371d;
        }
        canvas.getMatrix(this.f2375i);
        this.f2375i.getValues(this.f2374h);
        float fAbs = Math.abs(this.f2374h[0]);
        float fAbs2 = Math.abs(this.f2374h[4]);
        float fAbs3 = Math.abs(this.f2374h[1]);
        float fAbs4 = Math.abs(this.f2374h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        float fWidth = this.f2376j.width();
        int iHeight = (int) (this.f2376j.height() * fAbs2);
        int iMin = Math.min(2048, (int) (fWidth * fAbs));
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f2376j.left, this.f2376j.top);
        if (isAutoMirrored() && acw.m244a(this) == 1) {
            canvas.translate(this.f2376j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2376j.offsetTo(0, 0);
        atp atpVar = this.f2369b;
        Bitmap bitmap = atpVar.f2360f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != atpVar.f2360f.getHeight()) {
            atpVar.f2360f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            atpVar.f2365k = true;
        }
        if (this.f2370c) {
            atp atpVar2 = this.f2369b;
            if (atpVar2.f2365k || atpVar2.f2361g != atpVar2.f2357c || atpVar2.f2362h != atpVar2.f2358d || atpVar2.f2364j != atpVar2.f2359e || atpVar2.f2363i != atpVar2.f2356b.getRootAlpha()) {
                this.f2369b.m1988a(iMin, iMin2);
                atp atpVar3 = this.f2369b;
                atpVar3.f2361g = atpVar3.f2357c;
                atpVar3.f2362h = atpVar3.f2358d;
                atpVar3.f2363i = atpVar3.f2356b.getRootAlpha();
                atpVar3.f2364j = atpVar3.f2359e;
                atpVar3.f2365k = false;
            }
        } else {
            this.f2369b.m1988a(iMin, iMin2);
        }
        atp atpVar4 = this.f2369b;
        Rect rect = this.f2376j;
        if (atpVar4.f2356b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (atpVar4.f2366l == null) {
                atpVar4.f2366l = new Paint();
                atpVar4.f2366l.setFilterBitmap(true);
            }
            atpVar4.f2366l.setAlpha(atpVar4.f2356b.getRootAlpha());
            atpVar4.f2366l.setColorFilter(colorFilter);
            paint = atpVar4.f2366l;
        }
        canvas.drawBitmap(atpVar4.f2360f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acu.m226a(drawable) : this.f2369b.f2356b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2369b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acv.m232a(drawable) : this.f2372f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2369b.f2356b.f2343f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2369b.f2356b.f2342e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2308e;
        return drawable != null ? acu.m230e(drawable) : this.f2369b.f2359e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        atp atpVar = this.f2369b;
        if (atpVar != null) {
            if (atpVar.m1989b()) {
                return true;
            }
            ColorStateList colorStateList = this.f2369b.f2357c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2373g && super.mutate() == this) {
            this.f2369b = new atp(this.f2369b);
            this.f2373g = true;
        }
        return this;
    }

    @Override // p000.atj, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        atp atpVar = this.f2369b;
        ColorStateList colorStateList = atpVar.f2357c;
        boolean z = false;
        if (colorStateList != null && (mode = atpVar.f2358d) != null) {
            this.f2371d = m1991b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (atpVar.m1989b()) {
            boolean zMo1970c = atpVar.f2356b.f2341d.mo1970c(iArr);
            atpVar.f2365k |= zMo1970c;
            if (zMo1970c) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2369b.f2356b.getRootAlpha() != i) {
            this.f2369b.f2356b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acu.m229d(drawable, z);
        } else {
            this.f2369b.f2359e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2372f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m237f(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m238g(drawable, colorStateList);
            return;
        }
        atp atpVar = this.f2369b;
        if (atpVar.f2357c != colorStateList) {
            atpVar.f2357c = colorStateList;
            this.f2371d = m1991b(colorStateList, atpVar.f2358d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m239h(drawable, mode);
            return;
        }
        atp atpVar = this.f2369b;
        if (atpVar.f2358d != mode) {
            atpVar.f2358d = mode;
            this.f2371d = m1991b(atpVar.f2357c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2308e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            return new atq(drawable.getConstantState());
        }
        this.f2369b.f2355a = getChangingConfigurations();
        return this.f2369b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM184a;
        Drawable drawable = this.f2308e;
        if (drawable != null) {
            acv.m234c(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        atp atpVar = this.f2369b;
        atpVar.f2356b = new ato();
        TypedArray typedArrayM42f = aar.m42f(resources, theme, attributeSet, ata.f2286a);
        atp atpVar2 = this.f2369b;
        ato atoVar = atpVar2.f2356b;
        int iM40d = aar.m40d(typedArrayM42f, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        switch (iM40d) {
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.ADD;
                break;
        }
        atpVar2.f2358d = mode;
        int i = 2;
        if (aar.m46j(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM42f.getValue(1, typedValue);
            if (typedValue.type == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve attribute at index 1: ");
                sb.append(typedValue);
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            }
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = typedArrayM42f.getResources();
                int resourceId = typedArrayM42f.getResourceId(1, 0);
                int i2 = ace.f80a;
                try {
                    colorStateListM184a = ace.m184a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    colorStateListM184a = null;
                }
            } else {
                colorStateListM184a = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM184a = null;
        }
        if (colorStateListM184a != null) {
            atpVar2.f2357c = colorStateListM184a;
        }
        boolean z = atpVar2.f2359e;
        if (aar.m46j(xmlPullParser, "autoMirrored")) {
            z = typedArrayM42f.getBoolean(5, z);
        }
        atpVar2.f2359e = z;
        atoVar.f2344g = aar.m38b(typedArrayM42f, xmlPullParser, "viewportWidth", 7, atoVar.f2344g);
        float fM38b = aar.m38b(typedArrayM42f, xmlPullParser, "viewportHeight", 8, atoVar.f2345h);
        atoVar.f2345h = fM38b;
        if (atoVar.f2344g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayM42f.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fM38b <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayM42f.getPositionDescription()).concat(pIeXJQLZLfgIN.pKhCZGojaG));
        }
        int i3 = 3;
        atoVar.f2342e = typedArrayM42f.getDimension(3, atoVar.f2342e);
        float dimension = typedArrayM42f.getDimension(2, atoVar.f2343f);
        atoVar.f2343f = dimension;
        if (atoVar.f2342e <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayM42f.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayM42f.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        atoVar.setAlpha(aar.m38b(typedArrayM42f, xmlPullParser, "alpha", 4, atoVar.getAlpha()));
        String string = typedArrayM42f.getString(0);
        if (string != null) {
            atoVar.f2347j = string;
            atoVar.f2349l.put(string, atoVar);
        }
        typedArrayM42f.recycle();
        atpVar.f2355a = getChangingConfigurations();
        atpVar.f2365k = true;
        atp atpVar3 = this.f2369b;
        ato atoVar2 = atpVar3.f2356b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(atoVar2.f2341d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i4 = 1; eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3); i4 = 1) {
            if (eventType == i) {
                String name = xmlPullParser.getName();
                atm atmVar = (atm) arrayDeque.peek();
                if (atmVar != null) {
                    boolean zEquals = "path".equals(name);
                    String str = HRLmc.YAWddXToMqkADl;
                    if (zEquals) {
                        atl atlVar = new atl();
                        TypedArray typedArrayM42f2 = aar.m42f(resources, theme, attributeSet, ata.f2288c);
                        atlVar.f2309a = null;
                        if (aar.m46j(xmlPullParser, str)) {
                            String string2 = typedArrayM42f2.getString(0);
                            if (string2 != null) {
                                atlVar.f2335n = string2;
                            }
                            String string3 = typedArrayM42f2.getString(2);
                            if (string3 != null) {
                                atlVar.f2334m = aau.m56e(string3);
                            }
                            atlVar.f2320l = aar.m50n(typedArrayM42f2, xmlPullParser, theme, "fillColor", 1);
                            atlVar.f2312d = aar.m38b(typedArrayM42f2, xmlPullParser, "fillAlpha", 12, atlVar.f2312d);
                            int iM40d2 = aar.m40d(typedArrayM42f2, xmlPullParser, "strokeLineCap", 8, -1);
                            Paint.Cap cap = atlVar.f2316h;
                            switch (iM40d2) {
                                case 0:
                                    cap = Paint.Cap.BUTT;
                                    break;
                                case 1:
                                    cap = Paint.Cap.ROUND;
                                    break;
                                case 2:
                                    cap = Paint.Cap.SQUARE;
                                    break;
                            }
                            atlVar.f2316h = cap;
                            int iM40d3 = aar.m40d(typedArrayM42f2, xmlPullParser, "strokeLineJoin", 9, -1);
                            Paint.Join join = atlVar.f2317i;
                            switch (iM40d3) {
                                case 0:
                                    join = Paint.Join.MITER;
                                    break;
                                case 1:
                                    join = Paint.Join.ROUND;
                                    break;
                                case 2:
                                    join = Paint.Join.BEVEL;
                                    break;
                            }
                            atlVar.f2317i = join;
                            atlVar.f2318j = aar.m38b(typedArrayM42f2, xmlPullParser, "strokeMiterLimit", 10, atlVar.f2318j);
                            atlVar.f2319k = aar.m50n(typedArrayM42f2, xmlPullParser, theme, "strokeColor", 3);
                            atlVar.f2311c = aar.m38b(typedArrayM42f2, xmlPullParser, "strokeAlpha", 11, atlVar.f2311c);
                            atlVar.f2310b = aar.m38b(typedArrayM42f2, xmlPullParser, "strokeWidth", 4, atlVar.f2310b);
                            atlVar.f2314f = aar.m38b(typedArrayM42f2, xmlPullParser, "trimPathEnd", 6, atlVar.f2314f);
                            atlVar.f2315g = aar.m38b(typedArrayM42f2, xmlPullParser, "trimPathOffset", 7, atlVar.f2315g);
                            atlVar.f2313e = aar.m38b(typedArrayM42f2, xmlPullParser, "trimPathStart", 5, atlVar.f2313e);
                            atlVar.f2336o = aar.m40d(typedArrayM42f2, xmlPullParser, "fillType", 13, atlVar.f2336o);
                        }
                        typedArrayM42f2.recycle();
                        atmVar.f2322b.add(atlVar);
                        if (atlVar.getPathName() != null) {
                            atoVar2.f2349l.put(atlVar.getPathName(), atlVar);
                        }
                        int i5 = atpVar3.f2355a;
                        z2 = false;
                    } else {
                        depth = depth;
                        if ("clip-path".equals(name)) {
                            atk atkVar = new atk();
                            if (aar.m46j(xmlPullParser, str)) {
                                TypedArray typedArrayM42f3 = aar.m42f(resources, theme, attributeSet, ata.f2289d);
                                String string4 = typedArrayM42f3.getString(0);
                                if (string4 != null) {
                                    atkVar.f2335n = string4;
                                }
                                String string5 = typedArrayM42f3.getString(1);
                                if (string5 != null) {
                                    atkVar.f2334m = aau.m56e(string5);
                                }
                                atkVar.f2336o = aar.m40d(typedArrayM42f3, xmlPullParser, "fillType", 2, 0);
                                typedArrayM42f3.recycle();
                            }
                            atmVar.f2322b.add(atkVar);
                            if (atkVar.getPathName() != null) {
                                atoVar2.f2349l.put(atkVar.getPathName(), atkVar);
                            }
                            int i6 = atpVar3.f2355a;
                        } else if ("group".equals(name)) {
                            atm atmVar2 = new atm();
                            TypedArray typedArrayM42f4 = aar.m42f(resources, theme, attributeSet, ata.f2287b);
                            atmVar2.f2332l = null;
                            atmVar2.f2323c = aar.m38b(typedArrayM42f4, xmlPullParser, "rotation", 5, atmVar2.f2323c);
                            atmVar2.f2324d = typedArrayM42f4.getFloat(1, atmVar2.f2324d);
                            atmVar2.f2325e = typedArrayM42f4.getFloat(2, atmVar2.f2325e);
                            atmVar2.f2326f = aar.m38b(typedArrayM42f4, xmlPullParser, "scaleX", 3, atmVar2.f2326f);
                            atmVar2.f2327g = aar.m38b(typedArrayM42f4, xmlPullParser, "scaleY", 4, atmVar2.f2327g);
                            atmVar2.f2328h = aar.m38b(typedArrayM42f4, xmlPullParser, "translateX", 6, atmVar2.f2328h);
                            atmVar2.f2329i = aar.m38b(typedArrayM42f4, xmlPullParser, "translateY", 7, atmVar2.f2329i);
                            String string6 = typedArrayM42f4.getString(0);
                            if (string6 != null) {
                                atmVar2.f2333m = string6;
                            }
                            atmVar2.m1986d();
                            typedArrayM42f4.recycle();
                            atmVar.f2322b.add(atmVar2);
                            arrayDeque.push(atmVar2);
                            if (atmVar2.getGroupName() != null) {
                                atoVar2.f2349l.put(atmVar2.getGroupName(), atmVar2);
                            }
                            int i7 = atpVar3.f2355a;
                        }
                    }
                } else {
                    depth = depth;
                }
            } else {
                depth = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = depth;
            i3 = 3;
            i = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f2371d = m1991b(atpVar.f2357c, atpVar.f2358d);
    }

    public atr(atp atpVar) {
        this.f2370c = true;
        this.f2374h = new float[9];
        this.f2375i = new Matrix();
        this.f2376j = new Rect();
        this.f2369b = atpVar;
        this.f2371d = m1991b(atpVar.f2357c, atpVar.f2358d);
    }
}
