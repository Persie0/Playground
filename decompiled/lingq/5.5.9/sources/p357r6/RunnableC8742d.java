package p357r6;

import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.events.EventGroup;

/* JADX INFO: renamed from: r6.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8742d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f46367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8740b f46368b;

    public RunnableC8742d(C8740b c8740b, Context context) {
        this.f46368b = c8740b;
        this.f46367a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8740b c8740b = this.f46368b;
        C2181a c2181aM6433b = c8740b.f46343d.m6433b();
        String str = c8740b.f46343d.f10995a;
        c2181aM6433b.getClass();
        C2181a.m6460m(str, "Pushing Notification Viewed event onto queue flush async");
        c8740b.m16980m0(this.f46367a, EventGroup.PUSH_NOTIFICATION_VIEWED);
    }
}
