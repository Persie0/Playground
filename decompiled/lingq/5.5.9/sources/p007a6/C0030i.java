package p007a6;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.C2140a;
import com.bumptech.glide.load.resource.bitmap.InterfaceC2141b;
import java.nio.ByteBuffer;
import java.util.List;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: a6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0030i implements InterfaceC8736f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25a;

    /* JADX INFO: renamed from: b */
    public final C2140a f26b;

    public /* synthetic */ C0030i(C2140a c2140a, int i10) {
        this.f25a = i10;
        this.f26b = c2140a;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m mo68a(Object obj, int i10, int i11, C8735e c8735e) {
        int i12 = this.f25a;
        C2140a c2140a = this.f26b;
        switch (i12) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                List<ImageHeaderParser> list = c2140a.f10835d;
                return c2140a.m6353a(new InterfaceC2141b.a(c2140a.f10834c, (ByteBuffer) obj, list), i10, i11, c8735e, C2140a.f10829k);
            default:
                return c2140a.m6353a(new InterfaceC2141b.c((ParcelFileDescriptor) obj, c2140a.f10835d, c2140a.f10834c), i10, i11, c8735e, C2140a.f10829k);
        }
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(Object obj, C8735e c8735e) {
        int i10 = this.f25a;
        C2140a c2140a = this.f26b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                c2140a.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    c2140a.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
