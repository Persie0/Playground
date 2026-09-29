package p000;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qad {

    /* JADX INFO: renamed from: a */
    public static p04 f57520a;

    /* JADX INFO: renamed from: a */
    public static String m19839a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* JADX INFO: renamed from: b */
    public static String m19840b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX INFO: renamed from: c */
    public static String m19841c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return ux5.m22988k(i, "?");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m19842d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: e */
    public static final p04 m19843e() {
        p04 p04Var = f57520a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Outlined.Videocam", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(15.0f, 8.0f);
        f57Var.m11557l(8.0f);
        f57Var.m11549d(5.0f);
        f57Var.m11556k(8.0f);
        f57Var.m11550e(10.0f);
        y57 y57Var = new y57(1.0f, -2.0f);
        ArrayList arrayList = f57Var.f38440a;
        arrayList.add(y57Var);
        f57Var.m11549d(4.0f);
        f57Var.m11548c(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        f57Var.m11557l(10.0f);
        f57Var.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f57Var.m11550e(12.0f);
        f57Var.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f57Var.m11557l(-3.5f);
        f57Var.m11552g(4.0f, 4.0f);
        f57Var.m11557l(-11.0f);
        f57Var.m11552g(-4.0f, 4.0f);
        f57Var.m11556k(7.0f);
        f57Var.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, arrayList, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f57520a = p04VarM17721b;
        return p04VarM17721b;
    }
}
