package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uc2 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63710b;

    public /* synthetic */ uc2(Object obj, int i) {
        this.f63709a = i;
        this.f63710b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f63709a;
        Object obj = this.f63710b;
        switch (i2) {
            case 0:
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog) obj;
                View viewM5206m0 = deviceAuthDialog.m5206m0(false);
                Dialog dialog = deviceAuthDialog.f8417H0;
                if (dialog != null) {
                    dialog.setContentView(viewM5206m0);
                }
                LoginClient.Request request = deviceAuthDialog.f11430W0;
                if (request != null) {
                    deviceAuthDialog.m5213t0(request);
                }
                break;
            default:
                qn2 qn2Var = (qn2) obj;
                ((zi3) qn2Var.f57964c).invoke((String) qn2Var.f57967f, (String) qn2Var.f57968g);
                Toast.makeText((Context) qn2Var.f57962a, R$string.report_successfully_flagged, 0).show();
                dialogInterface.dismiss();
                break;
        }
    }
}
