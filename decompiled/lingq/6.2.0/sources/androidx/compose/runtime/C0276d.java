package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3386nv;
import p000.s46;
import p000.tr3;
import p000.ux5;
import p000.yc9;

/* JADX INFO: renamed from: androidx.compose.runtime.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0276d implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static ParcelableSnapshotMutableState m1249a(Parcel parcel, ClassLoader classLoader) {
        yc9 yc9Var;
        if (classLoader == null) {
            classLoader = C0276d.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            yc9Var = s46.f60289d;
        } else if (i == 1) {
            yc9Var = tr3.f62761g;
        } else {
            if (i != 2) {
                C3386nv.m17633t(ux5.m22989l("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            yc9Var = s46.f60290e;
        }
        return new ParcelableSnapshotMutableState(value, yc9Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m1249a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m1249a(parcel, classLoader);
    }
}
