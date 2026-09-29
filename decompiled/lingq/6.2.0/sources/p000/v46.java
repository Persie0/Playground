package p000;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class v46 extends RemoteCallbackList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f64843a;

    public v46(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f64843a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((zx3) iInterface).getClass();
        obj.getClass();
        this.f64843a.f6724b.remove((Integer) obj);
    }
}
