package p290o6;

import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import p003a2.C0009a;

/* JADX INFO: renamed from: o6.u */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7982u implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7987z f43418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7985x f43419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CleverTapInstanceConfig f43420c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f43421d;

    public CallableC7982u(C7987z c7987z, C7985x c7985x, CleverTapInstanceConfig cleverTapInstanceConfig, Context context) {
        this.f43418a = c7987z;
        this.f43419b = c7985x;
        this.f43420c = cleverTapInstanceConfig;
        this.f43421d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C7987z c7987z = this.f43418a;
        C7951d0 c7951d0 = c7987z.f43472b;
        if (c7951d0 == null || c7951d0.m15765i() == null) {
            return null;
        }
        C7985x c7985x = this.f43419b;
        if (c7985x.f43432a != null) {
            return null;
        }
        C2181a c2181aM6433b = c7987z.f43471a.m6433b();
        StringBuilder sb2 = new StringBuilder();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43420c;
        String strM23l = C0009a.m23l(sb2, cleverTapInstanceConfig.f10995a, ":async_deviceID");
        String str = "Initializing InAppFC with device Id = " + c7987z.f43472b.m15765i();
        c2181aM6433b.getClass();
        C2181a.m6460m(strM23l, str);
        c7985x.f43432a = new C7957g0(this.f43421d, cleverTapInstanceConfig, c7987z.f43472b.m15765i());
        return null;
    }
}
