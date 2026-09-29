package p531zc;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import p072dd.C5149b;
import p312p2.C8172d;
import p522z2.C10437a;

/* JADX INFO: renamed from: zc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10477a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static float m19426a(int i10, String[] strArr) {
        float f3 = Float.parseFloat(strArr[i10]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19427b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: c */
    public static int m19428c(int i10, Context context, int i11) {
        TypedValue typedValueM10922a = C5149b.m10922a(i10, context);
        if (typedValueM10922a != null && typedValueM10922a.type == 16) {
            i11 = typedValueM10922a.data;
        }
        return i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static TimeInterpolator m19429d(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!(m19427b(strValueOf, "cubic-bezier") || m19427b(strValueOf, "path"))) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m19427b(strValueOf, "cubic-bezier")) {
            if (m19427b(strValueOf, "path")) {
                return C10437a.m19410c(C8172d.m16226d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return C10437a.m19409b(m19426a(0, strArrSplit), m19426a(1, strArrSplit), m19426a(2, strArrSplit), m19426a(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}
