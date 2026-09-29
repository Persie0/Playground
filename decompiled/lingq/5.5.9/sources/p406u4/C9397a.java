package p406u4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.activity.result.C0204c;
import org.xmlpull.v1.XmlPullParser;
import p286o2.C7911k;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9397a extends AbstractC9446y {

    /* JADX INFO: renamed from: d */
    public static final float f48215d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a */
    public float f48216a;

    /* JADX INFO: renamed from: b */
    public float f48217b;

    /* JADX INFO: renamed from: c */
    public float f48218c;

    @SuppressLint({"RestrictedApi"})
    public C9397a(Context context, AttributeSet attributeSet) {
        super(0);
        this.f48216a = 0.0f;
        this.f48217b = 0.0f;
        this.f48218c = f48215d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48268i);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f48217b = m17756b(C7911k.m15687e(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f48216a = m17756b(C7911k.m15687e(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f48218c = m17756b(C7911k.m15687e(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static float m17756b(float f3) {
        if (f3 < 0.0f || f3 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f3 / 2.0f));
    }

    @Override // p406u4.AbstractC9446y
    /* JADX INFO: renamed from: a */
    public final Path mo17757a(float f3, float f10, float f11, float f12) {
        float fM845d;
        float fM845d2;
        float f13;
        Path path = new Path();
        path.moveTo(f3, f10);
        float f14 = f11 - f3;
        float f15 = f12 - f10;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = (f3 + f11) / 2.0f;
        float f18 = (f10 + f12) / 2.0f;
        float f19 = 0.25f * f16;
        boolean z10 = f10 > f12;
        if (Math.abs(f14) < Math.abs(f15)) {
            float fAbs = Math.abs(f16 / (f15 * 2.0f));
            if (z10) {
                fM845d2 = fAbs + f12;
                fM845d = f11;
            } else {
                fM845d2 = fAbs + f10;
                fM845d = f3;
            }
            f13 = this.f48217b;
        } else {
            float f20 = f16 / (f14 * 2.0f);
            if (z10) {
                fM845d2 = f10;
                fM845d = f20 + f3;
            } else {
                fM845d = f11 - f20;
                fM845d2 = f12;
            }
            f13 = this.f48216a;
        }
        float f21 = f19 * f13 * f13;
        float f22 = f17 - fM845d;
        float f23 = f18 - fM845d2;
        float f24 = (f23 * f23) + (f22 * f22);
        float f25 = this.f48218c;
        float f26 = f19 * f25 * f25;
        if (f24 >= f21) {
            f21 = f24 > f26 ? f26 : 0.0f;
        }
        if (f21 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f21 / f24);
            fM845d = C0204c.m845d(fM845d, f17, fSqrt, f17);
            fM845d2 = C0204c.m845d(fM845d2, f18, fSqrt, f18);
        }
        path.cubicTo((f3 + fM845d) / 2.0f, (f10 + fM845d2) / 2.0f, (fM845d + f11) / 2.0f, (fM845d2 + f12) / 2.0f, f11, f12);
        return path;
    }
}
