package p526z6;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.C2260f;
import com.clevertap.android.sdk.pushnotification.InterfaceC2254a;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: z6.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC10451g implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2260f f52303a;

    public CallableC10451g(C2260f c2260f) {
        this.f52303a = c2260f;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        CleverTapInstanceConfig cleverTapInstanceConfig;
        C2260f c2260f = this.f52303a;
        Iterator<InterfaceC2254a> it = c2260f.f11340c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cleverTapInstanceConfig = c2260f.f11344g;
            if (!zHasNext) {
                break;
            }
            InterfaceC2254a next = it.next();
            try {
                next.requestToken();
            } catch (Throwable th2) {
                cleverTapInstanceConfig.m6435d("Token Refresh error " + next, th2);
            }
        }
        for (PushConstants.PushType pushType : c2260f.f11341d) {
            try {
                c2260f.m6580j(pushType, c2260f.m6577g(pushType), true);
            } catch (Throwable th3) {
                cleverTapInstanceConfig.m6435d("Token Refresh error " + pushType, th3);
            }
        }
        return null;
    }
}
