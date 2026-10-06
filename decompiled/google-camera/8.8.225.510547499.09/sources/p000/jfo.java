package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.widget.LinearLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f33910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33911b;

    public jfo() {
    }

    public jfo(Context context, Handler handler) {
        this.f33910a = context;
        this.f33911b = handler;
    }

    public /* synthetic */ jfo(LinearLayout linearLayout, EduImageView eduImageView) {
        this.f33911b = linearLayout;
        this.f33910a = eduImageView;
    }

    public jfo(fvx fvxVar, Dialog dialog, byte[] bArr) {
        this.f33911b = fvxVar;
        this.f33910a = dialog;
    }

    public jfo(hpm hpmVar, dhv dhvVar) {
        this.f33910a = hpmVar;
        this.f33911b = dhvVar;
    }

    public jfo(hpm hpmVar, hqk hqkVar) {
        this.f33911b = hpmVar;
        this.f33910a = hqkVar;
    }

    public jfo(iuj iujVar, BottomBarController bottomBarController) {
        this.f33911b = iujVar;
        this.f33910a = bottomBarController;
    }

    /* JADX INFO: renamed from: a */
    public final void m13052a() {
        ((jfa) ((fvx) this.f33911b).f23722a).m13011b();
        if (((Dialog) this.f33910a).isShowing()) {
            ((Dialog) this.f33910a).dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13053b() {
        Object obj = this.f33911b;
        jvd.m13538a();
        hpm hpmVar = (hpm) obj;
        if (((hor) hpmVar.f28925j.f34942d).equals(hor.STATE_RECORDING) || ((hor) hpmVar.f28925j.f34942d).equals(hor.STATE_RECORDING_PAUSE)) {
            hpmVar.m10589g(false);
        } else if (((hor) hpmVar.f28925j.f34942d).equals(hor.STATE_IDLE)) {
            hpmVar.m10587e();
        } else {
            ((nbe) ((nbe) hpm.f28881a.m17252c()).mo17276G((char) 3868)).mo17293r("Recording state is incorrect. State: %s", ((hor) hpmVar.f28925j.f34942d).name());
        }
    }
}
