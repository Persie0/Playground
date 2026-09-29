package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class poa extends goa {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f56599j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public noa f56600b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f56601c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f56602d;

    /* JADX INFO: renamed from: e */
    public boolean f56603e;

    /* JADX INFO: renamed from: f */
    public boolean f56604f;

    /* JADX INFO: renamed from: g */
    public final float[] f56605g;

    /* JADX INFO: renamed from: h */
    public final Matrix f56606h;

    /* JADX INFO: renamed from: i */
    public final Rect f56607i;

    public poa() {
        this.f56604f = true;
        this.f56605g = new float[9];
        this.f56606h = new Matrix();
        this.f56607i = new Rect();
        noa noaVar = new noa();
        noaVar.f53070c = null;
        noaVar.f53071d = f56599j;
        noaVar.f53069b = new moa();
        this.f56600b = noaVar;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m19434a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f41098a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f56607i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f56602d;
        if (colorFilter == null) {
            colorFilter = this.f56601c;
        }
        Matrix matrix = this.f56606h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f56605g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        noa noaVar = this.f56600b;
        Bitmap bitmap = noaVar.f53073f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != noaVar.f53073f.getHeight()) {
            noaVar.f53073f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            noaVar.f53078k = true;
        }
        boolean z = this.f56604f;
        noa noaVar2 = this.f56600b;
        if (!z) {
            noaVar2.f53073f.eraseColor(0);
            Canvas canvas2 = new Canvas(noaVar2.f53073f);
            moa moaVar = noaVar2.f53069b;
            moaVar.m16959a(moaVar.f51657g, moa.f51650p, canvas2, iMin, iMin2);
        } else if (noaVar2.f53078k || noaVar2.f53074g != noaVar2.f53070c || noaVar2.f53075h != noaVar2.f53071d || noaVar2.f53077j != noaVar2.f53072e || noaVar2.f53076i != noaVar2.f53069b.getRootAlpha()) {
            noa noaVar3 = this.f56600b;
            noaVar3.f53073f.eraseColor(0);
            Canvas canvas3 = new Canvas(noaVar3.f53073f);
            moa moaVar2 = noaVar3.f53069b;
            moaVar2.m16959a(moaVar2.f51657g, moa.f51650p, canvas3, iMin, iMin2);
            noa noaVar4 = this.f56600b;
            noaVar4.f53074g = noaVar4.f53070c;
            noaVar4.f53075h = noaVar4.f53071d;
            noaVar4.f53076i = noaVar4.f53069b.getRootAlpha();
            noaVar4.f53077j = noaVar4.f53072e;
            noaVar4.f53078k = false;
        }
        noa noaVar5 = this.f56600b;
        if (noaVar5.f53069b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (noaVar5.f53079l == null) {
                Paint paint2 = new Paint();
                noaVar5.f53079l = paint2;
                paint2.setFilterBitmap(true);
            }
            noaVar5.f53079l.setAlpha(noaVar5.f53069b.getRootAlpha());
            noaVar5.f53079l.setColorFilter(colorFilter);
            paint = noaVar5.f53079l;
        }
        canvas.drawBitmap(noaVar5.f53073f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getAlpha() : this.f56600b.f53069b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f56600b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getColorFilter() : this.f56602d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f41098a != null) {
            return new ooa(this.f41098a.getConstantState());
        }
        this.f56600b.f53068a = getChangingConfigurations();
        return this.f56600b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f56600b.f53069b.f51659i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f56600b.f53069b.f51658h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        boolean z;
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        noa noaVar = this.f56600b;
        noaVar.f53069b = new moa();
        TypedArray typedArrayM17383g = nda.m17383g(resources, theme, attributeSet, xx1.f68917a);
        noa noaVar2 = this.f56600b;
        moa moaVar = noaVar2.f53069b;
        int iM17380d = nda.m17380d(typedArrayM17383g, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i2 = 3;
        if (iM17380d == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM17380d != 5) {
            if (iM17380d != 9) {
                switch (iM17380d) {
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
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        noaVar2.f53071d = mode;
        ColorStateList colorStateListM17378b = nda.m17378b(typedArrayM17383g, xmlPullParser, theme);
        if (colorStateListM17378b != null) {
            noaVar2.f53070c = colorStateListM17378b;
        }
        boolean z2 = noaVar2.f53072e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = typedArrayM17383g.getBoolean(5, z2);
        }
        noaVar2.f53072e = z2;
        float f = moaVar.f51660j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM17383g.getFloat(7, f);
        }
        moaVar.f51660j = f;
        float f2 = moaVar.f51661k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM17383g.getFloat(8, f2);
        }
        moaVar.f51661k = f2;
        if (moaVar.f51660j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        moaVar.f51658h = typedArrayM17383g.getDimension(3, moaVar.f51658h);
        int i3 = 2;
        float dimension = typedArrayM17383g.getDimension(2, moaVar.f51659i);
        moaVar.f51659i = dimension;
        if (moaVar.f51658h <= 0.0f) {
            throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = moaVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM17383g.getFloat(4, alpha);
        }
        moaVar.setAlpha(alpha);
        String string = typedArrayM17383g.getString(0);
        if (string != null) {
            moaVar.f51663m = string;
            moaVar.f51665o.put(string, moaVar);
        }
        typedArrayM17383g.recycle();
        noaVar.f53068a = getChangingConfigurations();
        int i4 = 1;
        noaVar.f53078k = true;
        noa noaVar3 = this.f56600b;
        moa moaVar2 = noaVar3.f53069b;
        ArrayDeque arrayDeque = new ArrayDeque();
        joa joaVar = moaVar2.f51657g;
        C3275kv c3275kv = moaVar2.f51665o;
        arrayDeque.push(joaVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i2)) {
            if (eventType == i3) {
                String name = xmlPullParser.getName();
                joa joaVar2 = (joa) arrayDeque.peek();
                if ("path".equals(name)) {
                    ioa ioaVar = new ioa();
                    ioaVar.m14056e(resources, xmlPullParser, attributeSet, theme);
                    joaVar2.f45926b.add(ioaVar);
                    if (ioaVar.getPathName() != null) {
                        c3275kv.put(ioaVar.getPathName(), ioaVar);
                    }
                    noaVar3.f53068a = noaVar3.f53068a;
                    z = false;
                    z3 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        hoa hoaVar = new hoa();
                        hoaVar.m13418e(resources, xmlPullParser, attributeSet, theme);
                        joaVar2.f45926b.add(hoaVar);
                        if (hoaVar.getPathName() != null) {
                            c3275kv.put(hoaVar.getPathName(), hoaVar);
                        }
                        noaVar3.f53068a = noaVar3.f53068a;
                    } else if ("group".equals(name)) {
                        joa joaVar3 = new joa();
                        TypedArray typedArrayM17383g2 = nda.m17383g(resources, theme, attributeSet, xx1.f68918b);
                        float f3 = joaVar3.f45927c;
                        if (nda.m17382f(xmlPullParser, "rotation")) {
                            f3 = typedArrayM17383g2.getFloat(5, f3);
                        }
                        joaVar3.f45927c = f3;
                        joaVar3.f45928d = typedArrayM17383g2.getFloat(1, joaVar3.f45928d);
                        joaVar3.f45929e = typedArrayM17383g2.getFloat(2, joaVar3.f45929e);
                        float f4 = joaVar3.f45930f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f4 = typedArrayM17383g2.getFloat(3, f4);
                        }
                        joaVar3.f45930f = f4;
                        float f5 = joaVar3.f45931g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f5 = typedArrayM17383g2.getFloat(4, f5);
                        }
                        joaVar3.f45931g = f5;
                        float f6 = joaVar3.f45932h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f6 = typedArrayM17383g2.getFloat(6, f6);
                        }
                        joaVar3.f45932h = f6;
                        float f7 = joaVar3.f45933i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f7 = typedArrayM17383g2.getFloat(7, f7);
                        }
                        joaVar3.f45933i = f7;
                        z = false;
                        String string2 = typedArrayM17383g2.getString(0);
                        if (string2 != null) {
                            joaVar3.f45935k = string2;
                        }
                        joaVar3.m14573c();
                        typedArrayM17383g2.recycle();
                        joaVar2.f45926b.add(joaVar3);
                        arrayDeque.push(joaVar3);
                        if (joaVar3.getGroupName() != null) {
                            c3275kv.put(joaVar3.getGroupName(), joaVar3);
                        }
                        noaVar3.f53068a = noaVar3.f53068a;
                    }
                    z = false;
                }
                i = 3;
            } else {
                i = i2;
                if (eventType == i && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i2 = i;
            i4 = 1;
            i3 = 2;
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
        this.f56601c = m19434a(noaVar.f53070c, noaVar.f53071d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.isAutoMirrored() : this.f56600b.f53072e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        noa noaVar = this.f56600b;
        if (noaVar == null) {
            return false;
        }
        moa moaVar = noaVar.f53069b;
        if (moaVar.f51664n == null) {
            moaVar.f51664n = Boolean.valueOf(moaVar.f51657g.mo14054a());
        }
        if (moaVar.f51664n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f56600b.f53070c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f56603e && super.mutate() == this) {
            noa noaVar = this.f56600b;
            noa noaVar2 = new noa();
            noaVar2.f53070c = null;
            noaVar2.f53071d = f56599j;
            if (noaVar != null) {
                noaVar2.f53068a = noaVar.f53068a;
                moa moaVar = new moa(noaVar.f53069b);
                noaVar2.f53069b = moaVar;
                if (noaVar.f53069b.f51655e != null) {
                    moaVar.f51655e = new Paint(noaVar.f53069b.f51655e);
                }
                if (noaVar.f53069b.f51654d != null) {
                    noaVar2.f53069b.f51654d = new Paint(noaVar.f53069b.f51654d);
                }
                noaVar2.f53070c = noaVar.f53070c;
                noaVar2.f53071d = noaVar.f53071d;
                noaVar2.f53072e = noaVar.f53072e;
            }
            this.f56600b = noaVar2;
            this.f56603e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        noa noaVar = this.f56600b;
        ColorStateList colorStateList = noaVar.f53070c;
        if (colorStateList == null || (mode = noaVar.f53071d) == null) {
            z = false;
        } else {
            this.f56601c = m19434a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        moa moaVar = noaVar.f53069b;
        if (moaVar.f51664n == null) {
            moaVar.f51664n = Boolean.valueOf(moaVar.f51657g.mo14054a());
        }
        if (moaVar.f51664n.booleanValue()) {
            boolean zMo14055b = noaVar.f53069b.f51657g.mo14055b(iArr);
            noaVar.f53078k |= zMo14055b;
            if (zMo14055b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f56600b.f53069b.getRootAlpha() != i) {
            this.f56600b.f53069b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f56600b.f53072e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f56602d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        noa noaVar = this.f56600b;
        if (noaVar.f53070c != colorStateList) {
            noaVar.f53070c = colorStateList;
            this.f56601c = m19434a(colorStateList, noaVar.f53071d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        noa noaVar = this.f56600b;
        if (noaVar.f53071d != mode) {
            noaVar.f53071d = mode;
            this.f56601c = m19434a(noaVar.f53070c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f41098a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public poa(noa noaVar) {
        this.f56604f = true;
        this.f56605g = new float[9];
        this.f56606h = new Matrix();
        this.f56607i = new Rect();
        this.f56600b = noaVar;
        this.f56601c = m19434a(noaVar.f53070c, noaVar.f53071d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f41098a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
