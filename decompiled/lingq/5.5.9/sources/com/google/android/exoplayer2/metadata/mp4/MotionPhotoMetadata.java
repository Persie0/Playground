package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import p349qo.C8656b;

/* JADX INFO: loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C2450a();

    /* JADX INFO: renamed from: a */
    public final long f12710a;

    /* JADX INFO: renamed from: b */
    public final long f12711b;

    /* JADX INFO: renamed from: c */
    public final long f12712c;

    /* JADX INFO: renamed from: d */
    public final long f12713d;

    /* JADX INFO: renamed from: e */
    public final long f12714e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata$a */
    public class C2450a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f12710a = j10;
        this.f12711b = j11;
        this.f12712c = j12;
        this.f12713d = j13;
        this.f12714e = j14;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f12710a = parcel.readLong();
        this.f12711b = parcel.readLong();
        this.f12712c = parcel.readLong();
        this.f12713d = parcel.readLong();
        this.f12714e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            return this.f12710a == motionPhotoMetadata.f12710a && this.f12711b == motionPhotoMetadata.f12711b && this.f12712c == motionPhotoMetadata.f12712c && this.f12713d == motionPhotoMetadata.f12713d && this.f12714e == motionPhotoMetadata.f12714e;
        }
        return false;
    }

    public final int hashCode() {
        return C8656b.m16918z(this.f12714e) + ((C8656b.m16918z(this.f12713d) + ((C8656b.m16918z(this.f12712c) + ((C8656b.m16918z(this.f12711b) + ((C8656b.m16918z(this.f12710a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12710a + ", photoSize=" + this.f12711b + ", photoPresentationTimestampUs=" + this.f12712c + ", videoStartPosition=" + this.f12713d + ", videoSize=" + this.f12714e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12710a);
        parcel.writeLong(this.f12711b);
        parcel.writeLong(this.f12712c);
        parcel.writeLong(this.f12713d);
        parcel.writeLong(this.f12714e);
    }
}
