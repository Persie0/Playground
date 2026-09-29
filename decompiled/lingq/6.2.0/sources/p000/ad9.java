package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class ad9 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: a */
    public static SnapshotStateList m286a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ad9.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new SnapshotStateList();
        }
        x77 x77VarMo13607i = jb9.f45384b.mo13607i();
        for (int i2 = 0; i2 < i; i2++) {
            x77VarMo13607i.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(x77VarMo13607i.m24385g());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m286a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SnapshotStateList[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m286a(parcel, classLoader);
    }
}
