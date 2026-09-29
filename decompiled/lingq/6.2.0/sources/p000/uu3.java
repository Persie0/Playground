package p000;

import android.content.DialogInterface;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uu3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64365a;

    public /* synthetic */ uu3(int i) {
        this.f64365a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f64365a) {
            case 0:
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
