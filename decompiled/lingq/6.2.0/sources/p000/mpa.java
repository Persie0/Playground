package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class mpa extends lpa {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f51706d;

    /* JADX INFO: renamed from: e */
    public final Parcel f51707e;

    /* JADX INFO: renamed from: f */
    public final int f51708f;

    /* JADX INFO: renamed from: g */
    public final int f51709g;

    /* JADX INFO: renamed from: h */
    public final String f51710h;

    /* JADX INFO: renamed from: i */
    public int f51711i;

    /* JADX INFO: renamed from: j */
    public int f51712j;

    /* JADX INFO: renamed from: k */
    public int f51713k;

    public mpa(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C3275kv(0), new C3275kv(0), new C3275kv(0));
    }

    @Override // p000.lpa
    /* JADX INFO: renamed from: a */
    public final mpa mo16429a() {
        Parcel parcel = this.f51707e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f51712j;
        if (i == this.f51708f) {
            i = this.f51709g;
        }
        return new mpa(parcel, iDataPosition, i, AbstractC3393o1.m17738m(new StringBuilder(), this.f51710h, "  "), this.f49990a, this.f49991b, this.f49992c);
    }

    @Override // p000.lpa
    /* JADX INFO: renamed from: e */
    public final boolean mo16433e(int i) {
        while (true) {
            int i2 = this.f51712j;
            int i3 = this.f51713k;
            if (i2 >= this.f51709g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f51712j;
            Parcel parcel = this.f51707e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f51713k = parcel.readInt();
            this.f51712j += i5;
        }
    }

    @Override // p000.lpa
    /* JADX INFO: renamed from: i */
    public final void mo16437i(int i) {
        int i2 = this.f51711i;
        SparseIntArray sparseIntArray = this.f51706d;
        Parcel parcel = this.f51707e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f51711i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public mpa(Parcel parcel, int i, int i2, String str, C3275kv c3275kv, C3275kv c3275kv2, C3275kv c3275kv3) {
        super(c3275kv, c3275kv2, c3275kv3);
        this.f51706d = new SparseIntArray();
        this.f51711i = -1;
        this.f51713k = -1;
        this.f51707e = parcel;
        this.f51708f = i;
        this.f51709g = i2;
        this.f51712j = i;
        this.f51710h = str;
    }
}
