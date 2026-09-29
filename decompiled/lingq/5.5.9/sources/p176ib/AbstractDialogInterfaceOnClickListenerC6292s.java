package p176ib;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: ib.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC6292s implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: a */
    public abstract void mo12928a();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                mo12928a();
                dialogInterface.dismiss();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
                dialogInterface.dismiss();
            }
        } catch (Throwable th2) {
            dialogInterface.dismiss();
            throw th2;
        }
    }
}
