package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class kh0 implements jh0, v6b {

    /* JADX INFO: renamed from: a */
    public static final kh0 f47284a = new kh0();

    /* JADX INFO: renamed from: b */
    public static final kh0 f47285b = new kh0();

    @Override // p000.v6b
    /* JADX INFO: renamed from: a */
    public r6b mo13180a(Activity activity, gb2 gb2Var) {
        gb2Var.getClass();
        jh0.f45539n.getClass();
        return new r6b(new hh0((Build.VERSION.SDK_INT >= 30 ? f47284a : x24.f67673b).mo14254b(activity)), gb2Var.mo12459c(activity));
    }

    @Override // p000.jh0
    /* JADX INFO: renamed from: b */
    public Rect mo14254b(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // p000.v6b
    /* JADX INFO: renamed from: d */
    public r6b mo13181d(Context context, gb2 gb2Var) {
        gb2Var.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new r6b(bounds, f);
    }
}
