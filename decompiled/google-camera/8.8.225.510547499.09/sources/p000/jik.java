package p000;

import android.os.Parcel;
import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jik extends RuntimeException {
    public jik(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + hiCTUJiAxf.iPreMIXEC + parcel.dataSize());
    }
}
