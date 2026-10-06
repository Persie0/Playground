package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class iax {

    /* JADX INFO: renamed from: j */
    public final List f30188j;

    public iax(dhv dhvVar, Context context) {
        this();
        iay iayVar = new iay(eqz.ACTION, context.getResources().getString(C0100R.string.moblur_action_title), context.getResources().getString(C0100R.string.moblur_action_acc_desc));
        iay iayVar2 = new iay(eqz.LANDSCAPE, context.getResources().getString(C0100R.string.moblur_landscape_title), context.getResources().getString(C0100R.string.moblur_landscape_acc_desc));
        if (eqz.m7711a(((Integer) dhvVar.mo6173a(dik.f11606d).get()).intValue()).equals(eqz.ACTION)) {
            this.f30188j.addAll(mws.m17098m(iayVar, iayVar2));
        } else {
            this.f30188j.addAll(mws.m17098m(iayVar2, iayVar));
        }
        dhvVar.mo6175c();
    }

    public iax() {
        this.f30188j = new ArrayList();
    }
}
