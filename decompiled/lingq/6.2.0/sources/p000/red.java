package p000;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class red {
    /* JADX INFO: renamed from: a */
    public static final void m20596a(RemoteViews remoteViews, yaa yaaVar, int i, String str, b58 b58Var) {
        if (Build.VERSION.SDK_INT > 31) {
            AbstractC0780ao.m2944j(remoteViews, i, b58Var);
            return;
        }
        Context context = yaaVar.f69568a;
        int i2 = yaaVar.f69569b;
        Intent intentPutExtra = new Intent().setComponent((ComponentName) yaaVar.f69582o.f50863e).putExtra("appWidgetId", i2).putExtra("androidx.glance.widget.extra.view_id", i).putExtra("androidx.glance.widget.extra.size_info", str);
        intentPutExtra.setData(Uri.parse(intentPutExtra.toUri(1)));
        if (context.getPackageManager().resolveService(intentPutExtra, 0) == null) {
            throw new IllegalStateException((intentPutExtra.getComponent() + " could not be resolved, check the app manifest.").toString());
        }
        remoteViews.setRemoteAdapter(i, intentPutExtra);
        v11 v11Var = GlanceRemoteViewsService.f5947a;
        synchronized (v11Var) {
            v11Var.f64686a.put(v11.m23038b(i2, str, i), b58Var);
        }
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i2, i);
    }

    /* JADX INFO: renamed from: b */
    public static String m20597b(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m20598c(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m20598c(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m20598c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM17739n = AbstractC3393o1.m17739n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM17739n), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM17739n.length() + 8 + name2.length() + 1);
            AbstractC3393o1.m17725C(sb, "<", strM17739n, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
