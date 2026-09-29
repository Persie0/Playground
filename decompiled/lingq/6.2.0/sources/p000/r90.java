package p000;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r90 extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r90(Class cls, String str, int i) {
        super(cls, str);
        this.f58929a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f58929a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                int iAlpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
                return Float.valueOf(iAlpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return Float.valueOf(((j21) obj).f44935h);
            case 5:
                return Float.valueOf(((j21) obj).f44936i);
            case 6:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 7:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 8:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 9:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 10:
                return Float.valueOf(((yc5) obj).f69633h);
            case 11:
                return Float.valueOf(((ad5) obj).f520i);
            case 12:
                return Float.valueOf(((zo9) obj).f71878U);
            case 13:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f58929a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                if (f.floatValue() == 1.0f) {
                    extendedFloatingActionButton.m6141z(extendedFloatingActionButton.getOriginalTextColor());
                } else {
                    int currentOriginalTextColor = extendedFloatingActionButton.getCurrentOriginalTextColor();
                    extendedFloatingActionButton.m6141z(ColorStateList.valueOf(ya1.m25016i(currentOriginalTextColor, Math.round(AbstractC0853cn.m4878a(0.0f, Color.alpha(currentOriginalTextColor), f.floatValue())))));
                }
                break;
            case 1:
                u04.m22374a((ImageView) obj, (Matrix) obj2);
                break;
            case 2:
                yt0 yt0Var = (yt0) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, yt0Var.f70435c, 0, fArr.length);
                yt0Var.m25310a();
                break;
            case 3:
                yt0 yt0Var2 = (yt0) obj;
                PointF pointF = (PointF) obj2;
                yt0Var2.getClass();
                yt0Var2.f70436d = pointF.x;
                yt0Var2.f70437e = pointF.y;
                yt0Var2.m25310a();
                break;
            case 4:
                j21 j21Var = (j21) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                j21Var.f44935h = fFloatValue;
                int i = (int) (fFloatValue * 5400.0f);
                qz2 qz2Var = j21Var.f44932e;
                ArrayList arrayList = (ArrayList) j21Var.f67809b;
                bm2 bm2Var = (bm2) arrayList.get(0);
                float f2 = j21Var.f44935h * 1520.0f;
                bm2Var.f8671a = (-20.0f) + f2;
                bm2Var.f8672b = f2;
                for (int i2 = 0; i2 < 4; i2++) {
                    bm2Var.f8672b = (qz2Var.getInterpolation(x60.m24291b(i, j21.f44925k[i2], 667)) * 250.0f) + bm2Var.f8672b;
                    bm2Var.f8671a = (qz2Var.getInterpolation(x60.m24291b(i, j21.f44926l[i2], 667)) * 250.0f) + bm2Var.f8671a;
                }
                float f3 = bm2Var.f8671a;
                float f4 = bm2Var.f8672b;
                bm2Var.f8671a = (((f4 - f3) * j21Var.f44936i) + f3) / 360.0f;
                bm2Var.f8672b = f4 / 360.0f;
                for (int i3 = 0; i3 < 4; i3++) {
                    float fM24291b = x60.m24291b(i, j21.f44927m[i3], 333);
                    if (fM24291b > 0.0f && fM24291b < 1.0f) {
                        int i4 = i3 + j21Var.f44934g;
                        int[] iArr = j21Var.f44933f.f67948e;
                        int length = i4 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i5 = iArr[length];
                        int i6 = iArr[length2];
                        ((bm2) arrayList.get(0)).f8673c = AbstractC3511qu.m20162a(qz2Var.getInterpolation(fM24291b), Integer.valueOf(i5), Integer.valueOf(i6)).intValue();
                        ((o34) j21Var.f67808a).invalidateSelf();
                    }
                    break;
                }
                ((o34) j21Var.f67808a).invalidateSelf();
                break;
            case 5:
                ((j21) obj).f44936i = ((Float) obj2).floatValue();
                break;
            case 6:
                View view = (View) obj;
                view.getLayoutParams().width = ((Float) obj2).intValue();
                view.requestLayout();
                break;
            case 7:
                View view2 = (View) obj;
                view2.getLayoutParams().height = ((Float) obj2).intValue();
                view2.requestLayout();
                break;
            case 8:
                View view3 = (View) obj;
                view3.setPaddingRelative(((Float) obj2).intValue(), view3.getPaddingTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                break;
            case 9:
                View view4 = (View) obj;
                view4.setPaddingRelative(view4.getPaddingStart(), view4.getPaddingTop(), ((Float) obj2).intValue(), view4.getPaddingBottom());
                break;
            case 10:
                yc5 yc5Var = (yc5) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                yc5Var.f69633h = fFloatValue2;
                ArrayList arrayList2 = (ArrayList) yc5Var.f67809b;
                ((bm2) arrayList2.get(0)).f8671a = 0.0f;
                float fM24291b2 = x60.m24291b((int) (fFloatValue2 * 333.0f), 0, 667);
                bm2 bm2Var2 = (bm2) arrayList2.get(0);
                bm2 bm2Var3 = (bm2) arrayList2.get(1);
                qz2 qz2Var2 = yc5Var.f69629d;
                float interpolation = qz2Var2.getInterpolation(fM24291b2);
                bm2Var3.f8671a = interpolation;
                bm2Var2.f8672b = interpolation;
                bm2 bm2Var4 = (bm2) arrayList2.get(1);
                bm2 bm2Var5 = (bm2) arrayList2.get(2);
                float interpolation2 = qz2Var2.getInterpolation(fM24291b2 + 0.49925038f);
                bm2Var5.f8671a = interpolation2;
                bm2Var4.f8672b = interpolation2;
                ((bm2) arrayList2.get(2)).f8672b = 1.0f;
                if (yc5Var.f69632g && ((bm2) arrayList2.get(1)).f8672b < 1.0f) {
                    ((bm2) arrayList2.get(2)).f8673c = ((bm2) arrayList2.get(1)).f8673c;
                    ((bm2) arrayList2.get(1)).f8673c = ((bm2) arrayList2.get(0)).f8673c;
                    ((bm2) arrayList2.get(0)).f8673c = yc5Var.f69630e.f67948e[yc5Var.f69631f];
                    yc5Var.f69632g = false;
                }
                ((o34) yc5Var.f67808a).invalidateSelf();
                break;
            case 11:
                ad5 ad5Var = (ad5) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                ad5Var.f520i = fFloatValue3;
                int i7 = (int) (fFloatValue3 * 1800.0f);
                Interpolator[] interpolatorArr = ad5Var.f516e;
                ArrayList arrayList3 = (ArrayList) ad5Var.f67809b;
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    bm2 bm2Var6 = (bm2) arrayList3.get(i8);
                    int[] iArr2 = ad5.f512l;
                    int i9 = i8 * 2;
                    int i10 = iArr2[i9];
                    int[] iArr3 = ad5.f511k;
                    bm2Var6.f8671a = AbstractC3584sr.m21644w(interpolatorArr[i9].getInterpolation(x60.m24291b(i7, i10, iArr3[i9])), 0.0f, 1.0f);
                    int i11 = i9 + 1;
                    bm2Var6.f8672b = AbstractC3584sr.m21644w(interpolatorArr[i11].getInterpolation(x60.m24291b(i7, iArr2[i11], iArr3[i11])), 0.0f, 1.0f);
                }
                if (ad5Var.f519h) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((bm2) it.next()).f8673c = ad5Var.f517f.f67948e[ad5Var.f518g];
                    }
                    ad5Var.f519h = false;
                }
                ((o34) ad5Var.f67808a).invalidateSelf();
                break;
            case 12:
                ((zo9) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 13:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
