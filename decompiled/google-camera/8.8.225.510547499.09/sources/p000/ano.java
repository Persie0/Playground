package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ano extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(9);

    /* JADX INFO: renamed from: a */
    public Set f1845a;

    public ano(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f1845a = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f1845a, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1845a.size());
        Set set = this.f1845a;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }

    public ano(Parcelable parcelable) {
        super(parcelable);
    }
}
