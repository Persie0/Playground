package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.lpa;
import p000.mpa;
import p000.npa;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(lpa lpaVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        npa npaVarM16436h = remoteActionCompat.f5490a;
        boolean z = true;
        if (lpaVar.mo16433e(1)) {
            npaVarM16436h = lpaVar.m16436h();
        }
        remoteActionCompat.f5490a = (IconCompat) npaVarM16436h;
        CharSequence charSequence = remoteActionCompat.f5491b;
        if (lpaVar.mo16433e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((mpa) lpaVar).f51707e);
        }
        remoteActionCompat.f5491b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5492c;
        if (lpaVar.mo16433e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((mpa) lpaVar).f51707e);
        }
        remoteActionCompat.f5492c = charSequence2;
        remoteActionCompat.f5493d = (PendingIntent) lpaVar.m16435g(remoteActionCompat.f5493d, 4);
        boolean z2 = remoteActionCompat.f5494e;
        if (lpaVar.mo16433e(5)) {
            z2 = ((mpa) lpaVar).f51707e.readInt() != 0;
        }
        remoteActionCompat.f5494e = z2;
        boolean z3 = remoteActionCompat.f5495f;
        if (!lpaVar.mo16433e(6)) {
            z = z3;
        } else if (((mpa) lpaVar).f51707e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f5495f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, lpa lpaVar) {
        lpaVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f5490a;
        lpaVar.mo16437i(1);
        lpaVar.m16440l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5491b;
        lpaVar.mo16437i(2);
        Parcel parcel = ((mpa) lpaVar).f51707e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f5492c;
        lpaVar.mo16437i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        lpaVar.m16439k(remoteActionCompat.f5493d, 4);
        boolean z = remoteActionCompat.f5494e;
        lpaVar.mo16437i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f5495f;
        lpaVar.mo16437i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
