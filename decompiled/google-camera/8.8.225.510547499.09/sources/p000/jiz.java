package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jiz {

    /* JADX INFO: renamed from: a */
    private static final jiz f34152a = new jiz();

    /* JADX INFO: renamed from: b */
    private khb f34153b = null;

    /* JADX INFO: renamed from: b */
    public static khb m13300b(Context context) {
        return f34152a.m13301a(context);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized khb m13301a(Context context) {
        if (this.f34153b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f34153b = new khb(context);
        }
        return this.f34153b;
    }
}
