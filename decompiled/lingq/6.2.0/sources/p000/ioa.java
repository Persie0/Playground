package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class ioa extends loa {

    /* JADX INFO: renamed from: d */
    public C3047gq f44370d;

    /* JADX INFO: renamed from: e */
    public float f44371e;

    /* JADX INFO: renamed from: f */
    public C3047gq f44372f;

    /* JADX INFO: renamed from: g */
    public float f44373g;

    /* JADX INFO: renamed from: h */
    public float f44374h;

    /* JADX INFO: renamed from: i */
    public float f44375i;

    /* JADX INFO: renamed from: j */
    public float f44376j;

    /* JADX INFO: renamed from: k */
    public float f44377k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f44378l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f44379m;

    /* JADX INFO: renamed from: n */
    public float f44380n;

    public ioa(ioa ioaVar) {
        super(ioaVar);
        this.f44371e = 0.0f;
        this.f44373g = 1.0f;
        this.f44374h = 1.0f;
        this.f44375i = 0.0f;
        this.f44376j = 1.0f;
        this.f44377k = 0.0f;
        this.f44378l = Paint.Cap.BUTT;
        this.f44379m = Paint.Join.MITER;
        this.f44380n = 4.0f;
        this.f44370d = ioaVar.f44370d;
        this.f44371e = ioaVar.f44371e;
        this.f44373g = ioaVar.f44373g;
        this.f44372f = ioaVar.f44372f;
        this.f49951c = ioaVar.f49951c;
        this.f44374h = ioaVar.f44374h;
        this.f44375i = ioaVar.f44375i;
        this.f44376j = ioaVar.f44376j;
        this.f44377k = ioaVar.f44377k;
        this.f44378l = ioaVar.f44378l;
        this.f44379m = ioaVar.f44379m;
        this.f44380n = ioaVar.f44380n;
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: a */
    public final boolean mo14054a() {
        return this.f44372f.m12808l() || this.f44370d.m12808l();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.koa
    /* JADX INFO: renamed from: b */
    public final boolean mo14055b(int[] iArr) {
        boolean z;
        C3047gq c3047gq = this.f44372f;
        boolean z2 = true;
        if (c3047gq.m12808l()) {
            ColorStateList colorStateList = (ColorStateList) c3047gq.f41173d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c3047gq.f41171b) {
                c3047gq.f41171b = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C3047gq c3047gq2 = this.f44370d;
        if (c3047gq2.m12808l()) {
            ColorStateList colorStateList2 = (ColorStateList) c3047gq2.f41173d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c3047gq2.f41171b) {
                c3047gq2.f41171b = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    /* JADX INFO: renamed from: e */
    public final void m14056e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM17383g = nda.m17383g(resources, theme, attributeSet, xx1.f68919c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayM17383g.getString(0);
            if (string != null) {
                this.f49950b = string;
            }
            String string2 = typedArrayM17383g.getString(2);
            if (string2 != null) {
                this.f49949a = tzb.m22362b(string2);
            }
            this.f44372f = nda.m17379c(typedArrayM17383g, xmlPullParser, theme, "fillColor", 1);
            float f = this.f44374h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayM17383g.getFloat(12, f);
            }
            this.f44374h = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM17383g.getInt(8, -1) : -1;
            Paint.Cap cap = this.f44378l;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.f44378l = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM17383g.getInt(9, -1) : -1;
            Paint.Join join = this.f44379m;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.f44379m = join;
            float f2 = this.f44380n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayM17383g.getFloat(10, f2);
            }
            this.f44380n = f2;
            this.f44370d = nda.m17379c(typedArrayM17383g, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.f44373g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayM17383g.getFloat(11, f3);
            }
            this.f44373g = f3;
            float f4 = this.f44371e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayM17383g.getFloat(4, f4);
            }
            this.f44371e = f4;
            float f5 = this.f44376j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayM17383g.getFloat(6, f5);
            }
            this.f44376j = f5;
            float f6 = this.f44377k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayM17383g.getFloat(7, f6);
            }
            this.f44377k = f6;
            float f7 = this.f44375i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayM17383g.getFloat(5, f7);
            }
            this.f44375i = f7;
            int i3 = this.f49951c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayM17383g.getInt(13, i3);
            }
            this.f49951c = i3;
        }
        typedArrayM17383g.recycle();
    }

    public float getFillAlpha() {
        return this.f44374h;
    }

    public int getFillColor() {
        return this.f44372f.f41171b;
    }

    public float getStrokeAlpha() {
        return this.f44373g;
    }

    public int getStrokeColor() {
        return this.f44370d.f41171b;
    }

    public float getStrokeWidth() {
        return this.f44371e;
    }

    public float getTrimPathEnd() {
        return this.f44376j;
    }

    public float getTrimPathOffset() {
        return this.f44377k;
    }

    public float getTrimPathStart() {
        return this.f44375i;
    }

    public void setFillAlpha(float f) {
        this.f44374h = f;
    }

    public void setFillColor(int i) {
        this.f44372f.f41171b = i;
    }

    public void setStrokeAlpha(float f) {
        this.f44373g = f;
    }

    public void setStrokeColor(int i) {
        this.f44370d.f41171b = i;
    }

    public void setStrokeWidth(float f) {
        this.f44371e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f44376j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f44377k = f;
    }

    public void setTrimPathStart(float f) {
        this.f44375i = f;
    }

    public ioa() {
        this.f44371e = 0.0f;
        this.f44373g = 1.0f;
        this.f44374h = 1.0f;
        this.f44375i = 0.0f;
        this.f44376j = 1.0f;
        this.f44377k = 0.0f;
        this.f44378l = Paint.Cap.BUTT;
        this.f44379m = Paint.Join.MITER;
        this.f44380n = 4.0f;
    }
}
