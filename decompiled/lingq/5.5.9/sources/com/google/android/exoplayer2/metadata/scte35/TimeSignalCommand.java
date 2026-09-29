package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p479xa.C10151t;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C2461a();

    /* JADX INFO: renamed from: a */
    public final long f12754a;

    /* JADX INFO: renamed from: b */
    public final long f12755b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public class C2461a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public TimeSignalCommand(long j10, long j11) {
        this.f12754a = j10;
        this.f12755b = j11;
    }

    /* JADX INFO: renamed from: a */
    public static long m7212a(long j10, C10151t c10151t) {
        long jM19145t = c10151t.m19145t();
        if ((128 & jM19145t) != 0) {
            return 8589934591L & ((((jM19145t & 1) << 32) | c10151t.m19146u()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12754a);
        parcel.writeLong(this.f12755b);
    }
}
