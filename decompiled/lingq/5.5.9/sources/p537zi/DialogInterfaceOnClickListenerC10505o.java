package p537zi;

import android.content.DialogInterface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenFragment;
import km.InterfaceC6727j;

/* JADX INFO: renamed from: zi.o */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10505o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52452a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f52452a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                dialogInterface.dismiss();
                break;
            default:
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                dialogInterface.dismiss();
                break;
        }
    }
}
