package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC2098e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final InternalRewinder f10603a;

    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a */
        public final ParcelFileDescriptor f10604a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f10604a = parcelFileDescriptor;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f10604a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C2093a implements InterfaceC2098e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: a */
        public final Class<ParcelFileDescriptor> mo4885a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2098e<ParcelFileDescriptor> mo4886b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10603a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: b */
    public final void mo4884b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2098e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor mo4883a() throws IOException {
        return this.f10603a.rewind();
    }
}
