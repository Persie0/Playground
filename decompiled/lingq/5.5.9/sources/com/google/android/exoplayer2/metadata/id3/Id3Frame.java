package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final String f12691a;

    public Id3Frame(String str) {
        this.f12691a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f12691a;
    }
}
