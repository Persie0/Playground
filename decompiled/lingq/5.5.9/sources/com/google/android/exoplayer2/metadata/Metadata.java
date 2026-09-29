package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2467q;
import java.util.Arrays;
import java.util.List;
import p349qo.C8656b;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C2430a();

    /* JADX INFO: renamed from: a */
    public final Entry[] f12627a;

    /* JADX INFO: renamed from: b */
    public final long f12628b;

    public interface Entry extends Parcelable {
        /* JADX INFO: renamed from: G */
        default C2416m mo7204G() {
            return null;
        }

        /* JADX INFO: renamed from: h0 */
        default byte[] mo7205h0() {
            return null;
        }

        /* JADX INFO: renamed from: s */
        default void mo7206s(C2467q.a aVar) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public class C2430a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f12628b = j10;
        this.f12627a = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.f12627a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f12627a;
            if (i10 >= entryArr.length) {
                this.f12628b = parcel.readLong();
                return;
            } else {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            }
        }
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f12627a, metadata.f12627a) && this.f12628b == metadata.f12628b;
    }

    public final int hashCode() {
        return C8656b.m16918z(this.f12628b) + (Arrays.hashCode(this.f12627a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f12627a));
        long j10 = this.f12628b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Entry[] entryArr = this.f12627a;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f12628b);
    }
}
