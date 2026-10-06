package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogi extends ogj {

    /* JADX INFO: renamed from: c */
    public int f45915c;

    /* JADX INFO: renamed from: e */
    public boolean f45917e;

    /* JADX INFO: renamed from: g */
    public long f45919g;

    /* JADX INFO: renamed from: h */
    public int f45920h;

    /* JADX INFO: renamed from: a */
    public static final ArrayDeque f45913a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public static final Object f45914b = new Object();
    public static final Parcelable.Creator CREATOR = new lrq(7);

    /* JADX INFO: renamed from: d */
    public ogn[] f45916d = new ogn[16];

    /* JADX INFO: renamed from: f */
    public ogf f45918f = new ogf();

    /* JADX INFO: renamed from: i */
    public final ogr[] f45921i = new ogr[16];

    public ogi() {
        for (int i = 0; i < 16; i++) {
            this.f45916d[i] = new ogn();
            this.f45921i[i] = new ogr();
        }
        mo18476a();
    }

    @Override // p000.ogj
    /* JADX INFO: renamed from: a */
    public final void mo18476a() {
        super.mo18476a();
        this.f45915c = 0;
        this.f45920h = 0;
        this.f45917e = false;
        this.f45919g = 0L;
    }

    @Override // p000.ogj
    /* JADX INFO: renamed from: b */
    public final void mo18477b(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.mo18477b(parcel);
        if (parcel.dataPosition() < iDataPosition) {
            int i = parcel.readInt();
            this.f45915c = i;
            m18481f(i);
            for (int i2 = 0; i2 < this.f45915c; i2++) {
                this.f45916d[i2].mo18475a(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            boolean z = parcel.readInt() != 0;
            this.f45917e = z;
            if (z) {
                this.f45918f.mo18475a(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            this.f45919g = parcel.readLong();
        }
        if (parcel.dataPosition() < iDataPosition) {
            int i3 = parcel.readInt();
            this.f45920h = i3;
            m18481f(i3);
            for (int i4 = 0; i4 < this.f45920h; i4++) {
                this.f45921i[i4].mo18475a(parcel);
            }
        }
        parcel.setDataPosition(iDataPosition);
    }

    @Override // p000.ogj
    /* JADX INFO: renamed from: c */
    public final void mo18478c() {
        mo18476a();
        synchronized (f45914b) {
            ArrayDeque arrayDeque = f45913a;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    @Override // p000.ogj
    /* JADX INFO: renamed from: d */
    public final void mo18479d(int i) {
        super.mo18479d(i);
        m18480e(i, this.f45915c, this.f45916d);
        this.f45918f.f45912e = i;
        m18480e(i, this.f45920h, this.f45921i);
    }

    @Override // p000.ogj, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogj, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        int i2 = 24;
        for (int i3 = 0; i3 < this.f45924l; i3++) {
            oge ogeVar = this.f45925m[i3];
            i2 += 24;
        }
        for (int i4 = 0; i4 < this.f45926n; i4++) {
            ogg oggVar = this.f45927o[i4];
            i2 += 20;
        }
        for (int i5 = 0; i5 < this.f45928p; i5++) {
            ogk ogkVar = this.f45929q[i5];
            i2 += 24;
        }
        for (int i6 = 0; i6 < this.f45930r; i6++) {
            ogm ogmVar = this.f45931s[i6];
            i2 += 28;
        }
        for (int i7 = 0; i7 < this.f45932t; i7++) {
            ogq ogqVar = this.f45933u[i7];
            i2 += 28;
        }
        int i8 = i2 + 8;
        for (int i9 = 0; i9 < this.f45915c; i9++) {
            ogn ognVar = this.f45916d[i9];
            i8 += 24;
        }
        int i10 = i8 + 4;
        if (this.f45917e) {
            i10 += 20;
        }
        int i11 = i10 + 12;
        for (int i12 = 0; i12 < this.f45920h; i12++) {
            ogr ogrVar = this.f45921i[i12];
            i11 += 20;
        }
        parcel.writeInt(i11);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f45915c);
        for (int i13 = 0; i13 < this.f45915c; i13++) {
            this.f45916d[i13].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f45917e ? 1 : 0);
        if (this.f45917e) {
            this.f45918f.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f45919g);
        parcel.writeInt(this.f45920h);
        for (int i14 = 0; i14 < this.f45920h; i14++) {
            this.f45921i[i14].writeToParcel(parcel, i);
        }
        if (parcel.dataPosition() - iDataPosition != i11) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }
}
