package p067d8;

import android.net.Uri;
import android.os.Bundle;
import dm.C5207g;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5075o extends C5061d {
    public C5075o(Bundle bundle, String str) {
        Uri uriM10817b;
        super(bundle, str);
        bundle = bundle == null ? new Bundle() : bundle;
        if (C5207g.m11106a(str, "oauth")) {
            C5086z c5086z = C5086z.f33015a;
            uriM10817b = C5086z.m10817b(C5083w.m10801b(), "oauth/authorize", bundle);
        } else {
            C5086z c5086z2 = C5086z.f33015a;
            uriM10817b = C5086z.m10817b(C5083w.m10801b(), C8004n.m15874d() + "/dialog/" + str, bundle);
        }
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            this.f32915a = uriM10817b;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
