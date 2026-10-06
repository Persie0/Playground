package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bya {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f4733a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m3180a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (f4733a) {
                if (theme != null) {
                    C0931qi c0931qi = new C0931qi(context2, theme);
                    c0931qi.m19345a(theme.getResources().getConfiguration());
                    context3 = c0931qi;
                } else {
                    context3 = context2;
                }
                return C0194fs.m8752a(context3, i);
            }
        } catch (Resources.NotFoundException e) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return abt.m154a(context2, i);
        } catch (NoClassDefFoundError e3) {
            f4733a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ach.m188a(context2.getResources(), i, theme);
    }
}
