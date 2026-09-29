package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C2455a();

    /* JADX INFO: renamed from: H */
    public final int f12724H;

    /* JADX INFO: renamed from: a */
    public final long f12725a;

    /* JADX INFO: renamed from: b */
    public final boolean f12726b;

    /* JADX INFO: renamed from: c */
    public final boolean f12727c;

    /* JADX INFO: renamed from: d */
    public final boolean f12728d;

    /* JADX INFO: renamed from: e */
    public final boolean f12729e;

    /* JADX INFO: renamed from: f */
    public final long f12730f;

    /* JADX INFO: renamed from: g */
    public final long f12731g;

    /* JADX INFO: renamed from: h */
    public final List<C2456b> f12732h;

    /* JADX INFO: renamed from: i */
    public final boolean f12733i;

    /* JADX INFO: renamed from: j */
    public final long f12734j;

    /* JADX INFO: renamed from: k */
    public final int f12735k;

    /* JADX INFO: renamed from: l */
    public final int f12736l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public class C2455a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C2456b {

        /* JADX INFO: renamed from: a */
        public final int f12737a;

        /* JADX INFO: renamed from: b */
        public final long f12738b;

        /* JADX INFO: renamed from: c */
        public final long f12739c;

        public C2456b(int i10, long j10, long j11) {
            this.f12737a = i10;
            this.f12738b = j10;
            this.f12739c = j11;
        }
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<C2456b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f12725a = j10;
        this.f12726b = z10;
        this.f12727c = z11;
        this.f12728d = z12;
        this.f12729e = z13;
        this.f12730f = j11;
        this.f12731g = j12;
        this.f12732h = Collections.unmodifiableList(list);
        this.f12733i = z14;
        this.f12734j = j13;
        this.f12735k = i10;
        this.f12736l = i11;
        this.f12724H = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f12725a = parcel.readLong();
        boolean z10 = true;
        this.f12726b = parcel.readByte() == 1;
        this.f12727c = parcel.readByte() == 1;
        this.f12728d = parcel.readByte() == 1;
        this.f12729e = parcel.readByte() == 1;
        this.f12730f = parcel.readLong();
        this.f12731g = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C2456b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f12732h = Collections.unmodifiableList(arrayList);
        this.f12733i = parcel.readByte() != 1 ? false : z10;
        this.f12734j = parcel.readLong();
        this.f12735k = parcel.readInt();
        this.f12736l = parcel.readInt();
        this.f12724H = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12725a);
        parcel.writeByte(this.f12726b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12727c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12728d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12729e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12730f);
        parcel.writeLong(this.f12731g);
        List<C2456b> list = this.f12732h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C2456b c2456b = list.get(i11);
            parcel.writeInt(c2456b.f12737a);
            parcel.writeLong(c2456b.f12738b);
            parcel.writeLong(c2456b.f12739c);
        }
        parcel.writeByte(this.f12733i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12734j);
        parcel.writeInt(this.f12735k);
        parcel.writeInt(this.f12736l);
        parcel.writeInt(this.f12724H);
    }
}
