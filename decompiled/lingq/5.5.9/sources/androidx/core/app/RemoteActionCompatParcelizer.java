package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC9812c interfaceC9812cM4630n = remoteActionCompat.f5569a;
        if (versionedParcel.mo4624h(1)) {
            interfaceC9812cM4630n = versionedParcel.m4630n();
        }
        remoteActionCompat.f5569a = (IconCompat) interfaceC9812cM4630n;
        CharSequence charSequenceMo4623g = remoteActionCompat.f5570b;
        if (versionedParcel.mo4624h(2)) {
            charSequenceMo4623g = versionedParcel.mo4623g();
        }
        remoteActionCompat.f5570b = charSequenceMo4623g;
        CharSequence charSequenceMo4623g2 = remoteActionCompat.f5571c;
        if (versionedParcel.mo4624h(3)) {
            charSequenceMo4623g2 = versionedParcel.mo4623g();
        }
        remoteActionCompat.f5571c = charSequenceMo4623g2;
        remoteActionCompat.f5572d = (PendingIntent) versionedParcel.m4628l(remoteActionCompat.f5572d, 4);
        boolean zMo4621e = remoteActionCompat.f5573e;
        if (versionedParcel.mo4624h(5)) {
            zMo4621e = versionedParcel.mo4621e();
        }
        remoteActionCompat.f5573e = zMo4621e;
        boolean zMo4621e2 = remoteActionCompat.f5574f;
        if (versionedParcel.mo4624h(6)) {
            zMo4621e2 = versionedParcel.mo4621e();
        }
        remoteActionCompat.f5574f = zMo4621e2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f5569a;
        versionedParcel.mo4631o(1);
        versionedParcel.m4639w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5570b;
        versionedParcel.mo4631o(2);
        versionedParcel.mo4634r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f5571c;
        versionedParcel.mo4631o(3);
        versionedParcel.mo4634r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f5572d;
        versionedParcel.mo4631o(4);
        versionedParcel.mo4637u(pendingIntent);
        boolean z10 = remoteActionCompat.f5573e;
        versionedParcel.mo4631o(5);
        versionedParcel.mo4632p(z10);
        boolean z11 = remoteActionCompat.f5574f;
        versionedParcel.mo4631o(6);
        versionedParcel.mo4632p(z11);
    }
}
