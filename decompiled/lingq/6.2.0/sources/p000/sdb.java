package p000;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sdb implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: b */
    public static ndb m21272b(Intent intent, GoogleApiActivity googleApiActivity) {
        return new ndb(intent, googleApiActivity);
    }

    /* JADX INFO: renamed from: c */
    public static pdb m21273c(sb5 sb5Var, Intent intent) {
        return new pdb(sb5Var, intent);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17389a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                mo17389a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
