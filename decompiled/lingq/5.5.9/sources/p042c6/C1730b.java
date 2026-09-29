package p042c6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import p104f.C5452a;
import p164i.C6102c;
import p254m2.C7472a;
import p286o2.C7906f;

/* JADX INFO: renamed from: c6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1730b {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f9576a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m5469a(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f9576a) {
                return m5470b(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            Object obj = C7472a.f41322a;
            return C7472a.c.m14849b(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f9576a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        return C7906f.a.m15676a(resources, i10, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m5470b(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            C6102c c6102c = new C6102c(context, theme);
            c6102c.m12599a(theme.getResources().getConfiguration());
            context = c6102c;
        }
        return C5452a.m11672a(context, i10);
    }
}
