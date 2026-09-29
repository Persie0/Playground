package p000;

import android.os.Parcel;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xnc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68414a = new C0282a(1169828477, false, new de1(5));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68415b = new C0282a(-976535524, false, new be1(29));

    /* JADX INFO: renamed from: a */
    public static Object m24622a(byte[] bArr, vi3 vi3Var) {
        bArr.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return vi3Var.invoke(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }
}
