package p000;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class gl7 {
    static {
        oj5.m18041h("ProcessUtils");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12735a(Context context, hh1 hh1Var) {
        context.getClass();
        hh1Var.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        return processName.equals(context.getApplicationInfo().processName);
    }
}
