package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0843nb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(19);

    /* JADX INFO: renamed from: a */
    public int f41920a;

    /* JADX INFO: renamed from: b */
    public int f41921b;

    /* JADX INFO: renamed from: c */
    public int f41922c;

    /* JADX INFO: renamed from: d */
    public int[] f41923d;

    /* JADX INFO: renamed from: e */
    public int f41924e;

    /* JADX INFO: renamed from: f */
    public int[] f41925f;

    /* JADX INFO: renamed from: g */
    public List f41926g;

    /* JADX INFO: renamed from: h */
    public boolean f41927h;

    /* JADX INFO: renamed from: i */
    public boolean f41928i;

    /* JADX INFO: renamed from: j */
    public boolean f41929j;

    public C0843nb() {
    }

    public C0843nb(Parcel parcel) {
        this.f41920a = parcel.readInt();
        this.f41921b = parcel.readInt();
        int i = parcel.readInt();
        this.f41922c = i;
        if (i > 0) {
            int[] iArr = new int[i];
            this.f41923d = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        this.f41924e = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            this.f41925f = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f41927h = parcel.readInt() == 1;
        this.f41928i = parcel.readInt() == 1;
        this.f41929j = parcel.readInt() == 1;
        this.f41926g = parcel.readArrayList(C0842na.class.getClassLoader());
    }

    public C0843nb(C0843nb c0843nb) {
        this.f41922c = c0843nb.f41922c;
        this.f41920a = c0843nb.f41920a;
        this.f41921b = c0843nb.f41921b;
        this.f41923d = c0843nb.f41923d;
        this.f41924e = c0843nb.f41924e;
        this.f41925f = c0843nb.f41925f;
        this.f41927h = c0843nb.f41927h;
        this.f41928i = c0843nb.f41928i;
        this.f41929j = c0843nb.f41929j;
        this.f41926g = c0843nb.f41926g;
    }

    /* JADX INFO: renamed from: a */
    public final void m17247a() {
        this.f41923d = null;
        this.f41922c = 0;
        this.f41920a = -1;
        this.f41921b = -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m17248b() {
        this.f41923d = null;
        this.f41922c = 0;
        this.f41924e = 0;
        this.f41925f = null;
        this.f41926g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41920a);
        parcel.writeInt(this.f41921b);
        parcel.writeInt(this.f41922c);
        if (this.f41922c > 0) {
            parcel.writeIntArray(this.f41923d);
        }
        parcel.writeInt(this.f41924e);
        if (this.f41924e > 0) {
            parcel.writeIntArray(this.f41925f);
        }
        parcel.writeInt(this.f41927h ? 1 : 0);
        parcel.writeInt(this.f41928i ? 1 : 0);
        parcel.writeInt(this.f41929j ? 1 : 0);
        parcel.writeList(this.f41926g);
    }
}
