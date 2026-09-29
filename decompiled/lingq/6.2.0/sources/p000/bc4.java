package p000;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.iterable.iterableapi.C1209e;

/* JADX INFO: loaded from: classes2.dex */
public final class bc4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ id3 f8328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f8329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1209e f8330c;

    public bc4(C1209e c1209e, id3 id3Var, float f) {
        this.f8330c = c1209e;
        this.f8328a = id3Var;
        this.f8329b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1209e c1209e;
        Dialog dialog;
        C1209e c1209e2 = this.f8330c;
        try {
            if (c1209e2.mo2107i() != null && (c1209e = C1209e.f13998Z0) != null && (dialog = c1209e.f8417H0) != null && dialog.getWindow() != null && C1209e.f13998Z0.f8417H0.isShowing()) {
                this.f8328a.getResources().getDisplayMetrics();
                Window window = C1209e.f13998Z0.f8417H0.getWindow();
                Rect rect = C1209e.f13998Z0.f14010V0;
                Display defaultDisplay = ((WindowManager) c1209e2.mo2107i().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                int i = point.x;
                int i2 = point.y;
                if (rect.bottom == 0 && rect.top == 0) {
                    window.setLayout(i, i2);
                    c1209e2.f8417H0.getWindow().setFlags(1024, 1024);
                    return;
                }
                float f = this.f8329b * c1209e2.m2110l().getDisplayMetrics().density;
                int i3 = c1209e2.m2110l().getDisplayMetrics().widthPixels;
                int i4 = (int) f;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
                int iM6904p0 = C1209e.m6904p0(rect);
                eh0.m11133m("IterableInAppFragmentHTMLNotification", "Resizing WebView directly - gravity: " + iM6904p0 + " size: " + i3 + "x" + i4 + "px for inset padding: " + rect);
                if (iM6904p0 == 16) {
                    layoutParams.addRule(13);
                    eh0.m11133m("IterableInAppFragmentHTMLNotification", "Applied CENTER_IN_PARENT to WebView");
                } else if (iM6904p0 == 48) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                    eh0.m11133m("IterableInAppFragmentHTMLNotification", "Applied TOP alignment to WebView");
                } else if (iM6904p0 == 80) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                    eh0.m11133m("IterableInAppFragmentHTMLNotification", "Applied BOTTOM alignment to WebView");
                }
                window.setLayout(-1, -1);
                c1209e2.f14001M0.setLayoutParams(layoutParams);
                c1209e2.f14001M0.requestLayout();
                if (c1209e2.f14001M0.getParent() instanceof ViewGroup) {
                    ((ViewGroup) c1209e2.f14001M0.getParent()).requestLayout();
                }
                eh0.m11133m("IterableInAppFragmentHTMLNotification", "Applied explicit size and positioning to WebView: " + i3 + "x" + i4);
            }
        } catch (IllegalArgumentException e) {
            eh0.m11136q("IterableInAppFragmentHTMLNotification", "Exception while trying to resize an in-app message", e);
        }
    }
}
