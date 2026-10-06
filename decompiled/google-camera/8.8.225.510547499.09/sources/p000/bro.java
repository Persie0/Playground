package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bro implements brc {

    /* JADX INFO: renamed from: a */
    private final ParcelFileDescriptorRewinder$InternalRewinder f4231a;

    public bro(ParcelFileDescriptor parcelFileDescriptor) {
        this.f4231a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2956d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // p000.brc
    /* JADX INFO: renamed from: b */
    public final void mo2950b() {
    }

    @Override // p000.brc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor mo2949a() {
        return this.f4231a.rewind();
    }
}
