package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: a */
    private final ParcelFileDescriptor f6484a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6484a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException {
        try {
            Os.lseek(this.f6484a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return this.f6484a;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
