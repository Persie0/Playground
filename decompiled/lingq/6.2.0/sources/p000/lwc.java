package p000;

import android.content.Context;
import com.google.android.play.core.review.C1075b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lwc {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f50233a = new StackTraceElement[0];

    /* JADX INFO: renamed from: a */
    public static C1075b m16559a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C1075b(new yic(context));
    }
}
