package p290o6;

import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.product_config.CTProductConfigController;
import p003a2.C0009a;
import p043c7.InterfaceC1742h;
import p381s6.C8967b;
import p501y6.C10299c;

/* JADX INFO: renamed from: o6.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7947b0 implements InterfaceC1742h<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7951d0 f43282a;

    public C7947b0(C7951d0 c7951d0) {
        this.f43282a = c7951d0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013b A[ADDED_TO_REGION, REMOVE] */
    @Override // p043c7.InterfaceC1742h
    /* JADX INFO: renamed from: a */
    public final void mo5478a(Void r13) {
        C7951d0 c7951d0 = this.f43282a;
        C2181a c2181aM15763g = c7951d0.m15763g();
        StringBuilder sb2 = new StringBuilder();
        CleverTapInstanceConfig cleverTapInstanceConfig = c7951d0.f43294d;
        String strM23l = C0009a.m23l(sb2, cleverTapInstanceConfig.f10995a, ":async_deviceID");
        String str = "DeviceID initialized successfully!" + Thread.currentThread();
        c2181aM15763g.getClass();
        C2181a.m6460m(strM23l, str);
        CleverTapAPI cleverTapAPIM6423j = CleverTapAPI.m6423j(c7951d0.f43295e, cleverTapInstanceConfig, null);
        String strM15765i = c7951d0.m15765i();
        C7987z c7987z = cleverTapAPIM6423j.f10981b;
        String str2 = c7987z.f43471a.f10995a;
        C7985x c7985x = c7987z.f43477g;
        if (c7985x == null) {
            cleverTapAPIM6423j.m6429f().getClass();
            C2181a.m6460m(str2 + ":async_deviceID", "ControllerManager not set yet! Returning from deviceIDCreated()");
            return;
        }
        if (c7985x.f43432a == null) {
            C2181a c2181aM6429f = cleverTapAPIM6423j.m6429f();
            c2181aM6429f.getClass();
            C2181a.m6460m(C0166e.m765k(str2, ":async_deviceID"), "Initializing InAppFC after Device ID Created = " + strM15765i);
            C7987z c7987z2 = cleverTapAPIM6423j.f10981b;
            c7987z2.f43477g.f43432a = new C7957g0(cleverTapAPIM6423j.f10980a, c7987z2.f43471a, strM15765i);
        }
        C8967b c8967b = cleverTapAPIM6423j.f10981b.f43477g.f43435d;
        if (c8967b != null && TextUtils.isEmpty(c8967b.f46976b)) {
            C2181a c2181aM6429f2 = cleverTapAPIM6423j.m6429f();
            c2181aM6429f2.getClass();
            C2181a.m6460m(C0166e.m765k(str2, ":async_deviceID"), "Initializing Feature Flags after Device ID Created = " + strM15765i);
            if (!c8967b.f46977c) {
                c8967b.f46976b = strM15765i;
                c8967b.m17195e();
            }
        }
        CTProductConfigController cTProductConfigController = cleverTapAPIM6423j.f10981b.f43477g.f43438g;
        if (cTProductConfigController != null) {
            C10299c c10299c = cTProductConfigController.f11323h;
            if (TextUtils.isEmpty(c10299c.f51810b)) {
                C2181a c2181aM6429f3 = cleverTapAPIM6423j.m6429f();
                c2181aM6429f3.getClass();
                C2181a.m6460m(C0166e.m765k(str2, ":async_deviceID"), "Initializing Product Config after Device ID Created = " + strM15765i);
                if (!cTProductConfigController.f11318c.get() && !TextUtils.isEmpty(strM15765i)) {
                    c10299c.f51810b = strM15765i;
                    cTProductConfigController.m6563f();
                }
            }
        }
        cleverTapAPIM6423j.m6429f().getClass();
        C2181a.m6460m(str2 + ":async_deviceID", "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        cleverTapAPIM6423j.f10981b.f43476f.mo583U(strM15765i);
        cleverTapAPIM6423j.f10981b.f43476f.mo572J();
    }
}
