package vi;

import android.content.DialogInterface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.edit.SentenceEditPageFragment;

/* JADX INFO: renamed from: vi.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9729d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49748a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f49748a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                break;
            default:
                SentenceEditPageFragment.C4294a c4294a = SentenceEditPageFragment.f27986E0;
                dialogInterface.dismiss();
                break;
        }
    }
}
