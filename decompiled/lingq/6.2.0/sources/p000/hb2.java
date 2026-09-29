package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class hb2 implements gb2, v6b {

    /* JADX INFO: renamed from: a */
    public static final hb2 f42124a = new hb2();

    /* JADX INFO: renamed from: b */
    public static final hb2 f42125b = new hb2();

    @Override // p000.v6b
    /* JADX INFO: renamed from: a */
    public r6b mo13180a(Activity activity, gb2 gb2Var) {
        gb2Var.getClass();
        return kh0.f47285b.mo13180a(activity, gb2Var);
    }

    @Override // p000.gb2
    /* JADX INFO: renamed from: c */
    public float mo12459c(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // p000.v6b
    /* JADX INFO: renamed from: d */
    public r6b mo13181d(Context context, gb2 gb2Var) {
        gb2Var.getClass();
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new r6b(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
