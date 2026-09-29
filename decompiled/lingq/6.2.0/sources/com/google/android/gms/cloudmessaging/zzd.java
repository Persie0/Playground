package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new qmb(3);

    /* JADX INFO: renamed from: a */
    public final Messenger f11634a;

    public zzd(IBinder iBinder) {
        this.f11634a = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final void m5277a(Message message) throws RemoteException {
        Messenger messenger = this.f11634a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f11634a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzd) obj).f11634a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f11634a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f11634a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
