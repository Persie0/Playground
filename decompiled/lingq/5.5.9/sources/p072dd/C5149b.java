package p072dd;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5149b {
    /* JADX INFO: renamed from: a */
    public static TypedValue m10922a(int i10, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10923b(Context context, int i10, boolean z10) {
        TypedValue typedValueM10922a = m10922a(i10, context);
        if (typedValueM10922a == null || typedValueM10922a.type != 18) {
            return z10;
        }
        return typedValueM10922a.data != 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static TypedValue m10924c(Context context, int i10, String str) {
        TypedValue typedValueM10922a = m10922a(i10, context);
        if (typedValueM10922a != null) {
            return typedValueM10922a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }
}
