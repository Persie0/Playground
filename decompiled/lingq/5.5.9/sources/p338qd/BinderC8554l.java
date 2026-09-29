package p338qd;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import p457wd.C9910k;

/* JADX INFO: renamed from: qd.l */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8554l extends BinderC8548j {
    public BinderC8554l(C3110a c3110a, C9907h c9907h) {
        super(c3110a, c9907h);
    }

    @Override // p338qd.BinderC8548j, td.InterfaceC9251a0
    /* JADX INFO: renamed from: l */
    public final void mo16656l(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo16656l(bundle, bundle2);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor");
        C9910k c9910k = this.f45886a.f50541a;
        synchronized (c9910k.f50543a) {
            if (c9910k.f50545c) {
                return;
            }
            c9910k.f50545c = true;
            c9910k.f50546d = parcelFileDescriptor;
            c9910k.f50544b.m12895c(c9910k);
        }
    }
}
