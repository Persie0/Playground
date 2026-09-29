package p000;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.material3.R$style;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.window.SecureFlagPolicy;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class n06 extends xc1 {

    /* JADX INFO: renamed from: e */
    public ui3 f52121e;

    /* JADX INFO: renamed from: f */
    public q06 f52122f;

    /* JADX INFO: renamed from: g */
    public long f52123g;

    /* JADX INFO: renamed from: h */
    public final View f52124h;

    /* JADX INFO: renamed from: i */
    public final l06 f52125i;

    public n06(ui3 ui3Var, q06 q06Var, long j, View view, LayoutDirection layoutDirection, fb2 fb2Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R$style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f52121e = ui3Var;
        this.f52122f = q06Var;
        this.f52123g = j;
        this.f52124h = view;
        Window window = getWindow();
        if (window == null) {
            C3386nv.m17633t("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        kaa.m15044f(window, false);
        l06 l06Var = new l06(getContext());
        l06Var.setTag(R$id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        l06Var.setClipChildren(false);
        l06Var.setElevation(fb2Var.mo912g0(8.0f));
        l06Var.setOutlineProvider(new c41(2));
        this.f52125i = l06Var;
        setContentView(l06Var);
        l06Var.setTag(androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner, zha.m25659b(view));
        l06Var.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, eja.m11183a(view));
        l06Var.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, dja.m10417a(view));
        m17166f(this.f52121e, this.f52122f, this.f52123g, layoutDirection);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    /* JADX INFO: renamed from: f */
    public final void m17166f(ui3 ui3Var, q06 q06Var, long j, LayoutDirection layoutDirection) {
        bca h6bVar;
        this.f52121e = ui3Var;
        this.f52122f = q06Var;
        this.f52123g = j;
        SecureFlagPolicy secureFlagPolicy = q06Var.f57093a;
        ViewGroup.LayoutParams layoutParams = this.f52124h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = sa0.f60573a[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            z = false;
        } else if (i2 == 2) {
            z = true;
        } else if (i2 != 3) {
            gm5.m12750e();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int i3 = m06.f50384a[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else if (i3 != 2) {
            gm5.m12750e();
            return;
        }
        this.f52125i.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window4 = getWindow();
        window4.getClass();
        Window window5 = getWindow();
        window5.getClass();
        cc4 cc4Var = new cc4(window5.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            h6bVar = new j6b(window4, cc4Var);
        } else {
            h6bVar = i4 >= 30 ? new h6b(window4, cc4Var) : new g6b(window4, cc4Var);
        }
        h6bVar.mo3618i(xpb.m24636b(j));
        h6bVar.mo3617h(xpb.m24636b(j));
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f52121e.mo0a();
        }
        return zOnTouchEvent;
    }
}
