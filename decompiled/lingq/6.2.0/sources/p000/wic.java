package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;

/* JADX INFO: loaded from: classes2.dex */
public final class wic extends mcb implements vrc {
    /* JADX INFO: renamed from: Q */
    public final eec m23993Q(lp6 lp6Var, zzp zzpVar) {
        eec eecVar;
        Parcel parcelM16773J = m16773J();
        int i = qrb.f58116a;
        parcelM16773J.writeStrongBinder(lp6Var);
        parcelM16773J.writeInt(1);
        zzpVar.writeToParcel(parcelM16773J, 0);
        Parcel parcelM16775L = m16775L(parcelM16773J, 1);
        IBinder strongBinder = parcelM16775L.readStrongBinder();
        if (strongBinder == null) {
            eecVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            eecVar = iInterfaceQueryLocalInterface instanceof eec ? (eec) iInterfaceQueryLocalInterface : new eec(strongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 2);
        }
        parcelM16775L.recycle();
        return eecVar;
    }
}
