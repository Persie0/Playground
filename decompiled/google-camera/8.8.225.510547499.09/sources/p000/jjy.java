package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjy implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m13322a(jjx jjxVar, Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, jjxVar.f34197a);
        jiy.m13289p(parcel, 3, jjxVar.f34198b);
        jiy.m13296w(parcel, 5, jjxVar.f34199c);
        jiy.m13295v(parcel, 6, jjxVar.f34200d, i);
        jiy.m13296w(parcel, 7, jjxVar.f34201e);
        jiy.m13295v(parcel, 8, jjxVar.f34202f, i);
        jiy.m13296w(parcel, 9, jjxVar.f34203g);
        jiy.m13239A(parcel, 10, jjxVar.f34204h);
        jiy.m13284k(parcel, 11, jjxVar.f34205i);
        jiy.m13295v(parcel, 12, jjxVar.f34206j, i);
        jiy.m13295v(parcel, 13, jjxVar.f34207k, i);
        jiy.m13284k(parcel, 14, jjxVar.f34208l);
        jiy.m13295v(parcel, 15, jjxVar.f34209m, i);
        jiy.m13296w(parcel, 16, jjxVar.f34210n);
        jiy.m13284k(parcel, 17, jjxVar.f34211o);
        jiy.m13288o(parcel, 18, jjxVar.f34212p);
        jiy.m13284k(parcel, 19, jjxVar.f34213q);
        jiy.m13283j(parcel, iM13281h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM13245G = jiy.m13245G(parcel);
        long jM13246H = 0;
        String strM13250L = null;
        Bundle bundleM13247I = null;
        String strM13250L2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strM13250L3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strM13250L4 = null;
        ArrayList arrayListM13253O = null;
        jkb jkbVar = null;
        jka jkaVar = null;
        Bitmap bitmap = null;
        String strM13250L5 = null;
        boolean zM13257S = false;
        boolean zM13257S2 = false;
        boolean zM13257S3 = false;
        boolean zM13257S4 = false;
        while (parcel.dataPosition() < iM13245G) {
            int i = parcel.readInt();
            switch (jiy.m13241C(i)) {
                case 2:
                    strM13250L = jiy.m13250L(parcel, i);
                    break;
                case 3:
                    bundleM13247I = jiy.m13247I(parcel, i);
                    break;
                case 4:
                default:
                    jiy.m13256R(parcel, i);
                    break;
                case 5:
                    strM13250L2 = jiy.m13250L(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) jiy.m13249K(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strM13250L3 = jiy.m13250L(parcel, i);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) jiy.m13249K(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strM13250L4 = jiy.m13250L(parcel, i);
                    break;
                case 10:
                    arrayListM13253O = jiy.m13253O(parcel, i, jjz.CREATOR);
                    break;
                case 11:
                    zM13257S = jiy.m13257S(parcel, i);
                    break;
                case 12:
                    jkbVar = (jkb) jiy.m13249K(parcel, i, jkb.CREATOR);
                    break;
                case 13:
                    jkaVar = (jka) jiy.m13249K(parcel, i, jka.CREATOR);
                    break;
                case 14:
                    zM13257S2 = jiy.m13257S(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) jiy.m13249K(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strM13250L5 = jiy.m13250L(parcel, i);
                    break;
                case 17:
                    zM13257S3 = jiy.m13257S(parcel, i);
                    break;
                case 18:
                    jM13246H = jiy.m13246H(parcel, i);
                    break;
                case 19:
                    zM13257S4 = jiy.m13257S(parcel, i);
                    break;
            }
        }
        jiy.m13254P(parcel, iM13245G);
        return new jjx(strM13250L, bundleM13247I, strM13250L2, applicationErrorReport, strM13250L3, bitmapTeleporter, strM13250L4, arrayListM13253O, zM13257S, jkbVar, jkaVar, zM13257S2, bitmap, strM13250L5, zM13257S3, jM13246H, zM13257S4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jjx[i];
    }
}
