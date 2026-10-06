package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ogj implements Parcelable {

    /* JADX INFO: renamed from: l */
    public int f45924l;

    /* JADX INFO: renamed from: n */
    public int f45926n;

    /* JADX INFO: renamed from: p */
    public int f45928p;

    /* JADX INFO: renamed from: r */
    public int f45930r;

    /* JADX INFO: renamed from: t */
    public int f45932t;

    /* JADX INFO: renamed from: j */
    public static final ArrayDeque f45922j = new ArrayDeque();

    /* JADX INFO: renamed from: k */
    public static final Object f45923k = new Object();
    public static final Parcelable.Creator CREATOR = new lrq(6);

    /* JADX INFO: renamed from: m */
    public oge[] f45925m = new oge[16];

    /* JADX INFO: renamed from: o */
    public ogg[] f45927o = new ogg[16];

    /* JADX INFO: renamed from: q */
    public ogk[] f45929q = new ogk[16];

    /* JADX INFO: renamed from: s */
    public ogm[] f45931s = new ogm[16];

    /* JADX INFO: renamed from: u */
    public ogq[] f45933u = new ogq[16];

    public ogj() {
        for (int i = 0; i < 16; i++) {
            this.f45925m[i] = new oge();
            this.f45927o[i] = new ogg();
            this.f45929q[i] = new ogk();
            this.f45931s[i] = new ogm();
            this.f45933u[i] = new ogq();
        }
        mo18476a();
    }

    /* JADX INFO: renamed from: e */
    static void m18480e(int i, int i2, ogh[] oghVarArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            oghVarArr[i3].f45912e = i;
        }
    }

    /* JADX INFO: renamed from: f */
    protected static final void m18481f(int i) {
        if (i < 0 || i >= 16) {
            throw new IllegalArgumentException("Invalid event count: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo18476a() {
        this.f45924l = 0;
        this.f45926n = 0;
        this.f45928p = 0;
        this.f45930r = 0;
        this.f45932t = 0;
    }

    /* JADX INFO: renamed from: b */
    public void mo18477b(Parcel parcel) {
        parcel.readInt();
        int i = parcel.readInt();
        this.f45924l = i;
        m18481f(i);
        for (int i2 = 0; i2 < this.f45924l; i2++) {
            this.f45925m[i2].mo18475a(parcel);
        }
        int i3 = parcel.readInt();
        this.f45926n = i3;
        m18481f(i3);
        for (int i4 = 0; i4 < this.f45926n; i4++) {
            this.f45927o[i4].mo18475a(parcel);
        }
        int i5 = parcel.readInt();
        this.f45928p = i5;
        m18481f(i5);
        for (int i6 = 0; i6 < this.f45928p; i6++) {
            this.f45929q[i6].mo18475a(parcel);
        }
        int i7 = parcel.readInt();
        this.f45930r = i7;
        m18481f(i7);
        for (int i8 = 0; i8 < this.f45930r; i8++) {
            this.f45931s[i8].mo18475a(parcel);
        }
        int i9 = parcel.readInt();
        this.f45932t = i9;
        m18481f(i9);
        for (int i10 = 0; i10 < this.f45932t; i10++) {
            this.f45933u[i10].mo18475a(parcel);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo18478c() {
        mo18476a();
        synchronized (f45923k) {
            ArrayDeque arrayDeque = f45922j;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo18479d(int i) {
        m18480e(i, this.f45924l, this.f45925m);
        m18480e(i, this.f45926n, this.f45927o);
        m18480e(i, this.f45928p, this.f45929q);
        m18480e(i, this.f45930r, this.f45931s);
        m18480e(i, this.f45932t, this.f45933u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.f45924l);
        for (int i2 = 0; i2 < this.f45924l; i2++) {
            this.f45925m[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f45926n);
        for (int i3 = 0; i3 < this.f45926n; i3++) {
            this.f45927o[i3].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f45928p);
        for (int i4 = 0; i4 < this.f45928p; i4++) {
            this.f45929q[i4].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f45930r);
        for (int i5 = 0; i5 < this.f45930r; i5++) {
            this.f45931s[i5].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f45932t);
        for (int i6 = 0; i6 < this.f45932t; i6++) {
            this.f45933u[i6].writeToParcel(parcel, i);
        }
    }
}
