package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.p020vr.vrcore.controller.api.ControllerServiceBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ogp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45951c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f45952d;

    public ogp(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.f45952d = i2;
        this.f45950b = bottomSheetBehavior;
        this.f45951c = view;
        this.f45949a = i;
    }

    public /* synthetic */ ogp(ControllerServiceBridge controllerServiceBridge, int i, ogo ogoVar, int i2) {
        this.f45952d = i2;
        this.f45950b = controllerServiceBridge;
        this.f45949a = i;
        this.f45951c = ogoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45952d) {
            case 0:
                ((ControllerServiceBridge) this.f45950b).m5196c(this.f45949a, (ogo) this.f45951c);
                break;
            case 1:
                Object obj = this.f45950b;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.m4810E((View) this.f45951c, this.f45949a, false);
                break;
            default:
                ((ControllerServiceBridge) this.f45950b).m5196c(this.f45949a, (ogo) this.f45951c);
                break;
        }
    }
}
