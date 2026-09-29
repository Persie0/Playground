package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C2458a();

    /* JADX INFO: renamed from: a */
    public final List<C2460c> f12740a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public class C2458a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C2459b {

        /* JADX INFO: renamed from: a */
        public final int f12741a;

        /* JADX INFO: renamed from: b */
        public final long f12742b;

        public C2459b(int i10, long j10) {
            this.f12741a = i10;
            this.f12742b = j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C2460c {

        /* JADX INFO: renamed from: a */
        public final long f12743a;

        /* JADX INFO: renamed from: b */
        public final boolean f12744b;

        /* JADX INFO: renamed from: c */
        public final boolean f12745c;

        /* JADX INFO: renamed from: d */
        public final boolean f12746d;

        /* JADX INFO: renamed from: e */
        public final long f12747e;

        /* JADX INFO: renamed from: f */
        public final List<C2459b> f12748f;

        /* JADX INFO: renamed from: g */
        public final boolean f12749g;

        /* JADX INFO: renamed from: h */
        public final long f12750h;

        /* JADX INFO: renamed from: i */
        public final int f12751i;

        /* JADX INFO: renamed from: j */
        public final int f12752j;

        /* JADX INFO: renamed from: k */
        public final int f12753k;

        public C2460c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f12743a = j10;
            this.f12744b = z10;
            this.f12745c = z11;
            this.f12746d = z12;
            this.f12748f = Collections.unmodifiableList(arrayList);
            this.f12747e = j11;
            this.f12749g = z13;
            this.f12750h = j12;
            this.f12751i = i10;
            this.f12752j = i11;
            this.f12753k = i12;
        }

        public C2460c(Parcel parcel) {
            this.f12743a = parcel.readLong();
            this.f12744b = parcel.readByte() == 1;
            this.f12745c = parcel.readByte() == 1;
            this.f12746d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new C2459b(parcel.readInt(), parcel.readLong()));
            }
            this.f12748f = Collections.unmodifiableList(arrayList);
            this.f12747e = parcel.readLong();
            this.f12749g = parcel.readByte() == 1;
            this.f12750h = parcel.readLong();
            this.f12751i = parcel.readInt();
            this.f12752j = parcel.readInt();
            this.f12753k = parcel.readInt();
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C2460c(parcel));
        }
        this.f12740a = Collections.unmodifiableList(arrayList);
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f12740a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List<C2460c> list = this.f12740a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C2460c c2460c = list.get(i11);
            parcel.writeLong(c2460c.f12743a);
            parcel.writeByte(c2460c.f12744b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2460c.f12745c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2460c.f12746d ? (byte) 1 : (byte) 0);
            List<C2459b> list2 = c2460c.f12748f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                C2459b c2459b = list2.get(i12);
                parcel.writeInt(c2459b.f12741a);
                parcel.writeLong(c2459b.f12742b);
            }
            parcel.writeLong(c2460c.f12747e);
            parcel.writeByte(c2460c.f12749g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c2460c.f12750h);
            parcel.writeInt(c2460c.f12751i);
            parcel.writeInt(c2460c.f12752j);
            parcel.writeInt(c2460c.f12753k);
        }
    }
}
