package p115fb;

import android.text.TextUtils;
import android.util.Log;
import dm.C5212l;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import no.C7814a0;
import org.json.JSONObject;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5747c;
import p166i1.C6153k;
import p241le.C7331e0;
import pe.C8237a;
import se.C8997g;

/* JADX INFO: renamed from: fb.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5502r implements InterfaceC5747c {

    /* JADX INFO: renamed from: a */
    public final String f34114a;

    /* JADX INFO: renamed from: b */
    public final Object f34115b;

    /* JADX INFO: renamed from: c */
    public final Object f34116c;

    public /* synthetic */ C5502r(C5486b c5486b, String str, ScheduledFuture scheduledFuture) {
        this.f34115b = c5486b;
        this.f34114a = str;
        this.f34116c = scheduledFuture;
    }

    public C5502r(String str, C7814a0 c7814a0) {
        C5212l c5212l = C5212l.f33289h;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f34116c = c5212l;
        this.f34115b = c7814a0;
        this.f34114a = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m11729a(C8237a c8237a, C8997g c8997g) {
        m11730b(c8237a, "X-CRASHLYTICS-GOOGLE-APP-ID", c8997g.f47187a);
        m11730b(c8237a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m11730b(c8237a, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.6");
        m11730b(c8237a, "Accept", "application/json");
        m11730b(c8237a, "X-CRASHLYTICS-DEVICE-MODEL", c8997g.f47188b);
        m11730b(c8237a, "X-CRASHLYTICS-OS-BUILD-VERSION", c8997g.f47189c);
        m11730b(c8237a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c8997g.f47190d);
        m11730b(c8237a, "X-CRASHLYTICS-INSTALLATION-ID", ((C7331e0) c8997g.f47191e).m14747c());
    }

    /* JADX INFO: renamed from: b */
    public static void m11730b(C8237a c8237a, String str, String str2) {
        if (str2 != null) {
            c8237a.f44505c.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m11731c(C8997g c8997g) {
        HashMap map = new HashMap();
        map.put("build_version", c8997g.f47194h);
        map.put("display_version", c8997g.f47193g);
        map.put("source", Integer.toString(c8997g.f47195i));
        String str = c8997g.f47192f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0071, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final JSONObject m11732d(C6153k c6153k) {
        boolean z10;
        String str;
        String str2;
        String str3;
        int i10 = c6153k.f35977a;
        C5212l c5212l = (C5212l) this.f34116c;
        c5212l.m11193q0("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202) {
            if (i10 != 203) {
                z10 = false;
            }
            str = this.f34114a;
            if (!z10) {
                str2 = "Settings request failed; (status: " + i10 + ") from " + str;
                if (c5212l.m11195w(6)) {
                    Log.e("FirebaseCrashlytics", str2, null);
                }
                return null;
            }
            str3 = (String) c6153k.f35978b;
            try {
                return new JSONObject(str3);
            } catch (Exception e10) {
                c5212l.m11194r0("Failed to parse settings JSON from " + str, e10);
                c5212l.m11194r0("Settings response " + str3, null);
                return null;
            }
        }
        z10 = true;
        str = this.f34114a;
        if (!z10) {
            str3 = (String) c6153k.f35978b;
            return new JSONObject(str3);
        }
        str2 = "Settings request failed; (status: " + i10 + ") from " + str;
        if (c5212l.m11195w(6)) {
            Log.e("FirebaseCrashlytics", str2, null);
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public final void mo205e(AbstractC5751g abstractC5751g) {
        C5486b c5486b = (C5486b) this.f34115b;
        String str = this.f34114a;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f34116c;
        synchronized (c5486b.f34074a) {
            try {
                c5486b.f34074a.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        scheduledFuture.cancel(false);
    }
}
