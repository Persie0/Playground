package p000;

import android.content.Context;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g8d {
    /* JADX INFO: renamed from: a */
    public static void m12416a(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m12417b() {
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c */
    public static int m12418c(Context context, int i) {
        return context.getColor(i);
    }
}
