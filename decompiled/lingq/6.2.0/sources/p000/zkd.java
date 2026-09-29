package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;

/* JADX INFO: loaded from: classes2.dex */
public final class zkd extends mcb implements bld {
    /* JADX INFO: renamed from: Q */
    public final ykd m25686Q(lp6 lp6Var) {
        ykd ykdVar;
        Parcel parcelM16773J = m16773J();
        int i = qrb.f58116a;
        parcelM16773J.writeStrongBinder(lp6Var);
        Parcel parcelM16775L = m16775L(parcelM16773J, 1);
        IBinder strongBinder = parcelM16775L.readStrongBinder();
        if (strongBinder == null) {
            ykdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            ykdVar = iInterfaceQueryLocalInterface instanceof ykd ? (ykd) iInterfaceQueryLocalInterface : new ykd(strongBinder);
        }
        parcelM16775L.recycle();
        return ykdVar;
    }

    /* JADX INFO: renamed from: R */
    public final ykd m25687R(lp6 lp6Var, zzvh zzvhVar) {
        ykd ykdVar;
        Parcel parcelM16773J = m16773J();
        int i = qrb.f58116a;
        parcelM16773J.writeStrongBinder(lp6Var);
        parcelM16773J.writeInt(1);
        zzvhVar.writeToParcel(parcelM16773J, 0);
        Parcel parcelM16775L = m16775L(parcelM16773J, 2);
        IBinder strongBinder = parcelM16775L.readStrongBinder();
        if (strongBinder == null) {
            ykdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            ykdVar = iInterfaceQueryLocalInterface instanceof ykd ? (ykd) iInterfaceQueryLocalInterface : new ykd(strongBinder);
        }
        parcelM16775L.recycle();
        return ykdVar;
    }
}
