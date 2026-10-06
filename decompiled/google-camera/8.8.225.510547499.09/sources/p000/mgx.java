package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgx extends ahx {
    public static final Parcelable.Creator CREATOR = new mgw(0);

    /* JADX INFO: renamed from: a */
    public final int f40461a;

    /* JADX INFO: renamed from: b */
    public final int f40462b;

    /* JADX INFO: renamed from: e */
    public final boolean f40463e;

    /* JADX INFO: renamed from: f */
    public final boolean f40464f;

    /* JADX INFO: renamed from: g */
    public final boolean f40465g;

    public mgx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40461a = parcel.readInt();
        this.f40462b = parcel.readInt();
        this.f40463e = parcel.readInt() == 1;
        this.f40464f = parcel.readInt() == 1;
        this.f40465g = parcel.readInt() == 1;
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40461a);
        parcel.writeInt(this.f40462b);
        parcel.writeInt(this.f40463e ? 1 : 0);
        parcel.writeInt(this.f40464f ? 1 : 0);
        parcel.writeInt(this.f40465g ? 1 : 0);
    }

    public mgx(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.f40461a = bottomSheetBehavior.f8128x;
        this.f40462b = bottomSheetBehavior.f8107c;
        this.f40463e = bottomSheetBehavior.f8101a;
        this.f40464f = bottomSheetBehavior.f8125u;
        this.f40465g = bottomSheetBehavior.f8126v;
    }
}
