package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: cr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0112cr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(3);

    /* JADX INFO: renamed from: a */
    ArrayList f9058a;

    /* JADX INFO: renamed from: b */
    ArrayList f9059b;

    /* JADX INFO: renamed from: c */
    C0049av[] f9060c;

    /* JADX INFO: renamed from: d */
    int f9061d;

    /* JADX INFO: renamed from: e */
    String f9062e;

    /* JADX INFO: renamed from: f */
    ArrayList f9063f;

    /* JADX INFO: renamed from: g */
    ArrayList f9064g;

    /* JADX INFO: renamed from: h */
    ArrayList f9065h;

    public C0112cr() {
        this.f9062e = null;
        this.f9063f = new ArrayList();
        this.f9064g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f9058a);
        parcel.writeStringList(this.f9059b);
        parcel.writeTypedArray(this.f9060c, i);
        parcel.writeInt(this.f9061d);
        parcel.writeString(this.f9062e);
        parcel.writeStringList(this.f9063f);
        parcel.writeTypedList(this.f9064g);
        parcel.writeTypedList(this.f9065h);
    }

    public C0112cr(Parcel parcel) {
        this.f9062e = null;
        this.f9063f = new ArrayList();
        this.f9064g = new ArrayList();
        this.f9058a = parcel.createStringArrayList();
        this.f9059b = parcel.createStringArrayList();
        this.f9060c = (C0049av[]) parcel.createTypedArray(C0049av.CREATOR);
        this.f9061d = parcel.readInt();
        this.f9062e = parcel.readString();
        this.f9063f = parcel.createStringArrayList();
        this.f9064g = parcel.createTypedArrayList(C0051ax.CREATOR);
        this.f9065h = parcel.createTypedArrayList(C0095cn.CREATOR);
    }
}
