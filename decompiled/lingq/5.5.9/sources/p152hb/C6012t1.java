package p152hb;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.media.AbstractC0140a;

/* JADX INFO: renamed from: hb.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6012t1 extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f35598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC6015u1 f35599b;

    public C6012t1(RunnableC6015u1 runnableC6015u1, AlertDialog alertDialog) {
        this.f35599b = runnableC6015u1;
        this.f35598a = alertDialog;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: j0 */
    public final void mo601j0() {
        this.f35599b.f35604b.m12469l();
        Dialog dialog = this.f35598a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
