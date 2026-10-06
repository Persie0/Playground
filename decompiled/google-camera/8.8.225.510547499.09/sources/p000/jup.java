package p000;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jup {

    /* JADX INFO: renamed from: a */
    public static ContentResolver f34849a = null;

    /* JADX INFO: renamed from: b */
    protected final String f34850b;

    /* JADX INFO: renamed from: c */
    protected final Object f34851c;

    protected jup(String str, Object obj) {
        this.f34850b = str;
        this.f34851c = obj;
    }

    /* JADX INFO: renamed from: b */
    public static void m13521b(Context context) {
        f34849a = context.getContentResolver();
    }

    /* JADX INFO: renamed from: c */
    public static jup m13522c(String str) {
        return new jun(str, false);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13520a();
}
