package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class rw4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59961a;

    /* JADX INFO: renamed from: b */
    public final SideSheetBehavior f59962b;

    public /* synthetic */ rw4(SideSheetBehavior sideSheetBehavior, int i) {
        this.f59961a = i;
        this.f59962b = sideSheetBehavior;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20947e(AppCompatEditText appCompatEditText, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && dta.m10634e(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + appCompatEditText);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return AbstractC3344mq.m16992a(dragEvent, appCompatEditText, activity);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20948f(AppCompatEditText appCompatEditText, int i) {
        zk1 zk1Var;
        yk1 yk1Var;
        web webVar;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 31 || dta.m10634e(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                webVar = new web(primaryClip, 1);
            } else {
                zk1Var = new zk1();
                zk1Var.f71674b = primaryClip;
                zk1Var.f71675c = 1;
            }
            if (i != 16908322) {
                yk1Var = zk1Var;
                yk1Var = webVar;
                i3 = 1;
            }
            yk1Var = zk1Var;
            yk1Var = webVar;
            yk1Var.mo23878h(i3);
            dta.m10637h(appCompatEditText, yk1Var.build());
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m20949a() {
        int i = this.f59961a;
        SideSheetBehavior sideSheetBehavior = this.f59962b;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f13098n + sideSheetBehavior.f13099o);
            default:
                return Math.max(0, (sideSheetBehavior.f13097m - sideSheetBehavior.f13096l) - sideSheetBehavior.f13099o);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m20950b() {
        int i = this.f59961a;
        SideSheetBehavior sideSheetBehavior = this.f59962b;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f13096l) - sideSheetBehavior.f13099o;
            default:
                return sideSheetBehavior.f13097m;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m20951c(View view) {
        int i = this.f59961a;
        SideSheetBehavior sideSheetBehavior = this.f59962b;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f13099o;
            default:
                return view.getLeft() - sideSheetBehavior.f13099o;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m20952d() {
        switch (this.f59961a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20953g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f59961a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
