package p000;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39608a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft0(Class cls, String str, int i) {
        super(cls, str);
        this.f39608a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f39608a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((l21) obj).f48929h);
            case 6:
                return Float.valueOf(((l21) obj).f48930i);
            default:
                return Float.valueOf(((yl2) obj).m25182b());
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f39608a) {
            case 0:
                ((jt0) obj).m14643b((PointF) obj2);
                break;
            case 1:
                ((jt0) obj).m14642a((PointF) obj2);
                break;
            case 2:
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                awa.m3101b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF2 = (PointF) obj2;
                awa.m3101b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int iRound = Math.round(pointF3.x);
                int iRound2 = Math.round(pointF3.y);
                awa.m3101b(view3, iRound, iRound2, view3.getWidth() + iRound, view3.getHeight() + iRound2);
                break;
            case 5:
                l21 l21Var = (l21) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                l21Var.f48929h = fFloatValue;
                int i = (int) (fFloatValue * 6000.0f);
                TimeInterpolator timeInterpolator = l21Var.f48926e;
                ArrayList arrayList = (ArrayList) l21Var.f67809b;
                bm2 bm2Var = (bm2) arrayList.get(0);
                float f = l21Var.f48929h * 1080.0f;
                int[] iArr = l21.f48920l;
                float interpolation = 0.0f;
                for (int i2 : iArr) {
                    interpolation += timeInterpolator.getInterpolation(x60.m24291b(i, i2, 500)) * 90.0f;
                }
                bm2Var.f8677g = f + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(x60.m24291b(i, 0, 3000)) - timeInterpolator.getInterpolation(x60.m24291b(i, 3000, 3000));
                bm2Var.f8671a = 0.0f;
                float[] fArr = l21.f48921m;
                float fM21522b = sob.m21522b(fArr[0], fArr[1], interpolation2);
                bm2Var.f8672b = fM21522b;
                float f2 = l21Var.f48930i;
                if (f2 > 0.0f) {
                    bm2Var.f8672b = (1.0f - f2) * fM21522b;
                }
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    float fM24291b = x60.m24291b(i, iArr[i3], 100);
                    if (fM24291b >= 0.0f && fM24291b <= 1.0f) {
                        int i4 = i3 + l21Var.f48928g;
                        int[] iArr2 = l21Var.f48927f.f67948e;
                        int length = i4 % iArr2.length;
                        int length2 = (length + 1) % iArr2.length;
                        ((bm2) arrayList.get(0)).f8673c = AbstractC3511qu.m20162a(timeInterpolator.getInterpolation(fM24291b), Integer.valueOf(iArr2[length]), Integer.valueOf(iArr2[length2])).intValue();
                        ((o34) l21Var.f67808a).invalidateSelf();
                    }
                    break;
                }
                ((o34) l21Var.f67808a).invalidateSelf();
                break;
            case 6:
                ((l21) obj).f48930i = ((Float) obj2).floatValue();
                break;
            default:
                yl2 yl2Var = (yl2) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (yl2Var.f69981i != fFloatValue2) {
                    yl2Var.f69981i = fFloatValue2;
                    yl2Var.invalidateSelf();
                }
                break;
        }
    }
}
