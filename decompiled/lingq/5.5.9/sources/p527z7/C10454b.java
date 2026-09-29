package p527z7;

import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.Set;
import p067d8.C5086z;
import p173i8.C6205a;
import p260m8.C7499b;
import p291o7.C8004n;

/* JADX INFO: renamed from: z7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10454b {

    /* JADX INFO: renamed from: a */
    public static final C10454b f52308a = new C10454b();

    /* JADX INFO: renamed from: b */
    public static final Set<String> f52309b = C7499b.m14973x0("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class<z7.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX INFO: renamed from: a */
    public static final boolean m19414a() {
        ?? r10;
        ?? BooleanValue = C10454b.class;
        boolean z10 = false;
        if (C6205a.m12742b(BooleanValue)) {
            return false;
        }
        try {
            if ((C8004n.m15876f(C8004n.m15871a()) || C5086z.m10840y()) ? false : true) {
                RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f11538a;
                if (C6205a.m12742b(RemoteServiceWrapper.class)) {
                    r10 = 0;
                } else {
                    try {
                        if (RemoteServiceWrapper.f11540c == null) {
                            RemoteServiceWrapper.f11540c = Boolean.valueOf(RemoteServiceWrapper.f11538a.m6660a(C8004n.m15871a()) != null);
                        }
                        Boolean bool = RemoteServiceWrapper.f11540c;
                        if (bool == null) {
                            r10 = 0;
                        } else {
                            BooleanValue = bool.booleanValue();
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(RemoteServiceWrapper.class, th2);
                    }
                }
                if (r10 != 0) {
                    r10 = BooleanValue;
                    z10 = true;
                }
            }
            r10 = BooleanValue;
            return z10;
        } catch (Throwable th3) {
            C6205a.m12741a(BooleanValue, th3);
            return false;
        }
    }
}
