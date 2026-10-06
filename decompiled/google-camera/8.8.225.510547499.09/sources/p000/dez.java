package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dez {
    /* JADX INFO: renamed from: a */
    public static TextView m6031a(Context context) {
        TextView textView = new TextView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0100R.dimen.dialog_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0100R.dimen.dialog_vertical_padding);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public static TextView m6032b(int i, Context context, Runnable runnable) {
        String string = context.getResources().getString(i);
        String string2 = context.getResources().getString(C0100R.string.learn_more);
        String str = string + " " + string2;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new dcg(runnable), str.length() - string2.length(), str.length(), 33);
        TextView textViewM6031a = m6031a(context);
        textViewM6031a.setText(spannableString);
        textViewM6031a.setMovementMethod(LinkMovementMethod.getInstance());
        return textViewM6031a;
    }

    /* JADX INFO: renamed from: c */
    public static void m6033c(Context context, Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    /* JADX INFO: renamed from: d */
    public static int m6034d(ddj ddjVar, int i, int i2, boolean z) {
        int i3 = ddjVar.f10564c;
        if (i3 > i2 && z) {
            return 4;
        }
        if (i3 != 0) {
            return i3 % (i + 1) == 0 ? 3 : 5;
        }
        int i4 = ddjVar.f10563b;
        return (i4 == 0 || i4 % (i + 1) != 0) ? 5 : 3;
    }

    /* JADX INFO: renamed from: e */
    public static void m6035e(jvb jvbVar, Future future) {
        jvbVar.m13537d(new cft(future, 4));
    }

    /* JADX INFO: renamed from: f */
    public static ciw m6036f(Runnable runnable, String str) {
        return m6038h(new czn(str, runnable, 1), str);
    }

    /* JADX INFO: renamed from: g */
    public static ciw m6037g(Runnable runnable, Executor executor, String str) {
        return m6038h(new dql(executor, str, runnable, 1), str);
    }

    /* JADX INFO: renamed from: h */
    public static ciw m6038h(ciw ciwVar, String str) {
        return new ciy(ciwVar, str);
    }

    /* JADX INFO: renamed from: i */
    public static String m6039i(ciw ciwVar) {
        return ciwVar.getClass().getName();
    }

    /* JADX INFO: renamed from: k */
    public static ddy m6041k(mrm mrmVar, oyo oyoVar, int i, int i2) {
        if (!mrmVar.mo16813g() || oyoVar == null || i == 0 || i2 == 0) {
            return null;
        }
        float f = i;
        float f2 = i2;
        PointF pointF = new PointF(((RectF) mrmVar.mo16809c()).centerX() / f, ((RectF) mrmVar.mo16809c()).centerY() / f2);
        float fHeight = ((RectF) mrmVar.mo16809c()).height() / f2;
        float fWidth = ((RectF) mrmVar.mo16809c()).width() / f;
        int i3 = oyoVar.f46847a;
        boolean z = i3 == 90 || i3 == 270;
        float f3 = true != z ? fWidth : fHeight;
        if (true == z) {
            fHeight = fWidth;
        }
        PointF pointFM19204h = oyoVar.m19204h(pointF);
        float f4 = f3 / 2.0f;
        float f5 = fHeight / 2.0f;
        return new ddy(new RectF(pointFM19204h.x - f4, pointFM19204h.y - f5, pointFM19204h.x + f4, pointFM19204h.y + f5), pointF);
    }
}
