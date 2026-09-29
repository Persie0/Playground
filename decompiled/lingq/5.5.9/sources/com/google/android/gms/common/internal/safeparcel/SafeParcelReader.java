package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
public final class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m7597a(Parcel parcel, int i10) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM7607k);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Parcelable> T m7598b(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM7607k);
        return tCreateFromParcel;
    }

    /* JADX INFO: renamed from: c */
    public static String m7599c(Parcel parcel, int i10) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM7607k);
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static <T> T[] m7600d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM7607k);
        return tArr;
    }

    /* JADX INFO: renamed from: e */
    public static <T> ArrayList<T> m7601e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM7607k);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m7602f(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new ParseException(C0166e.m761g("Overread allowed size end=", i10), parcel);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7603g(Parcel parcel, int i10) {
        m7611o(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: h */
    public static IBinder m7604h(Parcel parcel, int i10) {
        int iM7607k = m7607k(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM7607k == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM7607k);
        return strongBinder;
    }

    /* JADX INFO: renamed from: i */
    public static int m7605i(Parcel parcel, int i10) {
        m7611o(parcel, i10, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: j */
    public static long m7606j(Parcel parcel, int i10) {
        m7611o(parcel, i10, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: k */
    public static int m7607k(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: l */
    public static void m7608l(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m7607k(parcel, i10));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m */
    public static int m7609m(Parcel parcel) {
        int i10 = parcel.readInt();
        int iM7607k = m7607k(parcel, i10);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iM7607k + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new ParseException(C0204c.m851j("Size read is invalid start=", iDataPosition, " end=", i11), parcel);
        }
        return i11;
    }

    /* JADX INFO: renamed from: n */
    public static void m7610n(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new ParseException(C0009a.m23l(C0009a.m25n("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public static void m7611o(Parcel parcel, int i10, int i11) {
        int iM7607k = m7607k(parcel, i10);
        if (iM7607k == i11) {
            return;
        }
        throw new ParseException(C0009a.m23l(C0009a.m25n("Expected size ", i11, " got ", iM7607k, " (0x"), Integer.toHexString(iM7607k), ")"), parcel);
    }
}
