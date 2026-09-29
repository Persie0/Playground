package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C2452a();

    /* JADX INFO: renamed from: a */
    public final List<Segment> f12715a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new C2451a();

        /* JADX INFO: renamed from: a */
        public final long f12716a;

        /* JADX INFO: renamed from: b */
        public final long f12717b;

        /* JADX INFO: renamed from: c */
        public final int f12718c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$a */
        public class C2451a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(int i10, long j10, long j11) {
            C10129a.m18990b(j10 < j11);
            this.f12716a = j10;
            this.f12717b = j11;
            this.f12718c = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                return this.f12716a == segment.f12716a && this.f12717b == segment.f12717b && this.f12718c == segment.f12718c;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f12716a), Long.valueOf(this.f12717b), Integer.valueOf(this.f12718c)});
        }

        public final String toString() {
            return C10134c0.m19045l("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12716a), Long.valueOf(this.f12717b), Integer.valueOf(this.f12718c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f12716a);
            parcel.writeLong(this.f12717b);
            parcel.writeInt(this.f12718c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$a */
    public class C2452a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f12715a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((Segment) arrayList.get(0)).f12717b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((Segment) arrayList.get(i10)).f12716a < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((Segment) arrayList.get(i10)).f12717b;
            }
        }
        C10129a.m18990b(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.f12715a.equals(((SlowMotionData) obj).f12715a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12715a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f12715a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f12715a);
    }
}
