package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: av */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0049av implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(1);

    /* JADX INFO: renamed from: a */
    final int[] f2460a;

    /* JADX INFO: renamed from: b */
    final ArrayList f2461b;

    /* JADX INFO: renamed from: c */
    final int[] f2462c;

    /* JADX INFO: renamed from: d */
    final int[] f2463d;

    /* JADX INFO: renamed from: e */
    final int f2464e;

    /* JADX INFO: renamed from: f */
    final String f2465f;

    /* JADX INFO: renamed from: g */
    final int f2466g;

    /* JADX INFO: renamed from: h */
    final int f2467h;

    /* JADX INFO: renamed from: i */
    final CharSequence f2468i;

    /* JADX INFO: renamed from: j */
    final int f2469j;

    /* JADX INFO: renamed from: k */
    final CharSequence f2470k;

    /* JADX INFO: renamed from: l */
    final ArrayList f2471l;

    /* JADX INFO: renamed from: m */
    final ArrayList f2472m;

    /* JADX INFO: renamed from: n */
    final boolean f2473n;

    public C0049av(Parcel parcel) {
        this.f2460a = parcel.createIntArray();
        this.f2461b = parcel.createStringArrayList();
        this.f2462c = parcel.createIntArray();
        this.f2463d = parcel.createIntArray();
        this.f2464e = parcel.readInt();
        this.f2465f = parcel.readString();
        this.f2466g = parcel.readInt();
        this.f2467h = parcel.readInt();
        this.f2468i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2469j = parcel.readInt();
        this.f2470k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2471l = parcel.createStringArrayList();
        this.f2472m = parcel.createStringArrayList();
        this.f2473n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2460a);
        parcel.writeStringList(this.f2461b);
        parcel.writeIntArray(this.f2462c);
        parcel.writeIntArray(this.f2463d);
        parcel.writeInt(this.f2464e);
        parcel.writeString(this.f2465f);
        parcel.writeInt(this.f2466g);
        parcel.writeInt(this.f2467h);
        TextUtils.writeToParcel(this.f2468i, parcel, 0);
        parcel.writeInt(this.f2469j);
        TextUtils.writeToParcel(this.f2470k, parcel, 0);
        parcel.writeStringList(this.f2471l);
        parcel.writeStringList(this.f2472m);
        parcel.writeInt(this.f2473n ? 1 : 0);
    }

    public C0049av(C0048au c0048au) {
        int size = c0048au.f9926d.size();
        this.f2460a = new int[size * 6];
        if (!c0048au.f9932j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2461b = new ArrayList(size);
        this.f2462c = new int[size];
        this.f2463d = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0117cw c0117cw = (C0117cw) c0048au.f9926d.get(i);
            int i3 = i2 + 1;
            this.f2460a[i2] = c0117cw.f9849a;
            ArrayList arrayList = this.f2461b;
            ComponentCallbacksC0077bw componentCallbacksC0077bw = c0117cw.f9850b;
            arrayList.add(componentCallbacksC0077bw != null ? componentCallbacksC0077bw.f4609k : null);
            int[] iArr = this.f2460a;
            int i4 = i3 + 1;
            iArr[i3] = c0117cw.f9851c ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = c0117cw.f9852d;
            int i6 = i5 + 1;
            iArr[i5] = c0117cw.f9853e;
            int i7 = i6 + 1;
            iArr[i6] = c0117cw.f9854f;
            iArr[i7] = c0117cw.f9855g;
            this.f2462c[i] = c0117cw.f9856h.ordinal();
            this.f2463d[i] = c0117cw.f9857i.ordinal();
            i++;
            i2 = i7 + 1;
        }
        this.f2464e = c0048au.f9931i;
        this.f2465f = c0048au.f9934l;
        this.f2466g = c0048au.f2401c;
        this.f2467h = c0048au.f9935m;
        this.f2468i = c0048au.f9936n;
        this.f2469j = c0048au.f9937o;
        this.f2470k = c0048au.f9938p;
        this.f2471l = c0048au.f9939q;
        this.f2472m = c0048au.f9940r;
        this.f2473n = c0048au.f9941s;
    }
}
