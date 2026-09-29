package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.lingq.core.designsystem.R$color;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mbd {
    /* JADX INFO: renamed from: a */
    public static final void m16753a(Context context, String str) {
        context.getClass();
        str.getClass();
        C2943dx c2943dx = new C2943dx();
        int color = context.getColor(R$color.indigo_dark) | (-16777216);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
        c2943dx.f36349f = bundle;
        c2943dx.m10726n();
        ((Intent) c2943dx.f36346c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        C3156jq c3156jqM10716c = c2943dx.m10716c();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = (Intent) c3156jqM10716c.f45990a;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.isEmpty()) {
            return;
        }
        intent.setData(Uri.parse(str));
        context.startActivity(intent, (Bundle) c3156jqM10716c.f45991b);
    }

    /* JADX INFO: renamed from: b */
    public static void m16754b(ud6 ud6Var, String str, Integer num) {
        String string;
        pd6 pd6Var = qd6.Companion;
        if (num == null) {
            string = null;
        } else {
            string = ud6Var.f63759a.getString(num.intValue());
            if (string == null) {
                string = "";
            }
        }
        pd6Var.getClass();
        jfa.m14428k(ud6Var, new od6(str, string), null);
    }

    /* JADX INFO: renamed from: c */
    public static void m16755c(Activity activity, String str, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        activity.getClass();
        str.getClass();
        ud6 ud6VarM4736u = ci8.m4736u(activity, activity.getResources().getIdentifier("nav_host_fragment_top", "id", activity.getPackageName()));
        if (!vk9.m23380c0(str, "useWeb=true", false)) {
            str = str.concat("?disable_purchase=true");
        }
        try {
            C2943dx c2943dx = new C2943dx();
            int color = activity.getColor(R$color.indigo_dark) | (-16777216);
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
            c2943dx.f36349f = bundle;
            c2943dx.m10726n();
            ((Intent) c2943dx.f36346c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            C3156jq c3156jqM10716c = c2943dx.m10716c();
            Intent intent = (Intent) c3156jqM10716c.f45990a;
            List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.isEmpty()) {
                m16754b(ud6VarM4736u, str, num);
            } else {
                intent.setData(Uri.parse(str));
                activity.startActivity(intent, (Bundle) c3156jqM10716c.f45991b);
            }
        } catch (ActivityNotFoundException unused) {
            m16754b(ud6VarM4736u, str, num);
        } catch (IllegalArgumentException unused2) {
            m16754b(ud6VarM4736u, str, num);
        } catch (Exception unused3) {
            Toast.makeText(activity, "No browser installed.", 1).show();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m16756d(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            C3386nv.m17626m("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i, i2, i3, i4);
        return bitmapCreateBitmap;
    }
}
