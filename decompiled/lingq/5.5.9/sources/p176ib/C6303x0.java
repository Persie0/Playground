package p176ib;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: ib.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6303x0 {

    /* JADX INFO: renamed from: d */
    public static final Uri f36511d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public final String f36512a;

    /* JADX INFO: renamed from: b */
    public final String f36513b;

    /* JADX INFO: renamed from: c */
    public final boolean f36514c;

    public C6303x0(String str, String str2, boolean z10) {
        C6272i.m12912f(str);
        this.f36512a = str;
        C6272i.m12912f(str2);
        this.f36513b = str2;
        this.f36514c = z10;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m12933a(Context context) {
        Bundle bundleCall;
        Intent component = null;
        String str = this.f36512a;
        if (str != null) {
            if (this.f36514c) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", str);
                try {
                    bundleCall = context.getContentResolver().call(f36511d, "serviceIntentCall", (String) null, bundle);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundleCall = null;
                }
                component = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
                if (component == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (component == null) {
                return new Intent(str).setPackage(this.f36513b);
            }
        } else {
            component = new Intent().setComponent(null);
        }
        return component;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6303x0)) {
            return false;
        }
        C6303x0 c6303x0 = (C6303x0) obj;
        return C6268g.m12905a(this.f36512a, c6303x0.f36512a) && C6268g.m12905a(this.f36513b, c6303x0.f36513b) && C6268g.m12905a(null, null) && this.f36514c == c6303x0.f36514c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36512a, this.f36513b, null, 4225, Boolean.valueOf(this.f36514c)});
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String str = this.f36512a;
        if (str != null) {
            return str;
        }
        C6272i.m12915i(null);
        throw null;
    }
}
