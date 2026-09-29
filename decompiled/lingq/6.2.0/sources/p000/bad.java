package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bad {
    /* JADX INFO: renamed from: a */
    public static final void m3546a(ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        tj3 tj3Var;
        ui3 ui3Var2;
        ui3 ui3Var3;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1212362579);
        if ((i & 48) == 0) {
            i3 = i | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        } else {
            i3 = i;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 17) != 16)) {
            if ((i2 & 1) != 0) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O);
                }
                ui3Var3 = (ui3) objM22097O;
            } else {
                ui3Var3 = ui3Var;
            }
            tj3Var = tj3Var2;
            b34.m3232b(null, bsc.f8959c, null, null, null, 0, 0L, 0L, null, ci8.m4703P(356884926, new xw8(vi3Var, 3), tj3Var2), tj3Var, 805306416, 509);
            ui3Var2 = ui3Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            ui3Var2 = ui3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qa4(i, i2, 4, ui3Var2, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3547b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: c */
    public static void m3548c(cj1 cj1Var, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + cj1Var.f10160b;
        try {
            int i = lx1.f50237a[cj1Var.f10161c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (i) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM3547b = (m3547b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m3547b((int) (fArr[3] * 255.0f)) << 24) | (m3547b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m3547b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM3547b);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((m3547b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m3547b((int) (fArr[3] * 255.0f)) << 24) | (m3547b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m3547b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + cj1Var.f10160b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Cannot access method ", str, " on View \"");
            sbM17742q.append(qad.m19842d(view));
            sbM17742q.append("\"");
            Log.e("CustomSupport", sbM17742q.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sbM17742q2 = AbstractC3393o1.m17742q("No method ", str, " on View \"");
            sbM17742q2.append(qad.m19842d(view));
            sbM17742q2.append("\"");
            Log.e("CustomSupport", sbM17742q2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbM17742q3 = AbstractC3393o1.m17742q("Cannot invoke method ", str, " on View \"");
            sbM17742q3.append(qad.m19842d(view));
            sbM17742q3.append("\"");
            Log.e("CustomSupport", sbM17742q3.toString(), e3);
        }
    }
}
