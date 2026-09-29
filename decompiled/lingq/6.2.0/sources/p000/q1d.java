package p000;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.lingq.feature.onboarding.R$string;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q1d {
    /* JADX INFO: renamed from: a */
    public static final void m19600a(int i, int i2, Integer num, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i3) {
        ui3 ui3Var2;
        Integer num2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(95392741);
        int i4 = (tj3Var.m22116e(i) ? 4 : 2) | i3 | (tj3Var.m22116e(i2) ? 32 : 16) | (tj3Var.m22120g(num) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, i);
            int i5 = i4 >> 3;
            String strM23620a1 = vz1.m23620a0(tj3Var, i2);
            if (vk9.m23391n0(strM23620a1)) {
                strM23620a1 = null;
            }
            ui3Var2 = ui3Var;
            gxb.m12965a(strM23620a0, vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue), ui3Var2, strM23620a1, num, null, tj3Var, (i5 & 8064) | ((i4 << 9) & 458752), 64);
            num2 = num;
            e16Var = b16.f7762a;
        } else {
            ui3Var2 = ui3Var;
            num2 = num;
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(i, i2, num2, ui3Var2, e16Var2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19601b(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
