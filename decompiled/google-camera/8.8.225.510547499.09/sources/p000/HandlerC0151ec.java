package p000;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import com.google.lens.sdk.LensApi;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC0151ec extends Handler {

    /* JADX INFO: renamed from: a */
    private final WeakReference f13327a;

    public HandlerC0151ec(DialogInterface dialogInterface) {
        this.f13327a = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f13327a.get(), message.what);
                break;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                break;
        }
    }
}
