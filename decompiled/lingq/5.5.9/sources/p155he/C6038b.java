package p155he;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import je.InterfaceC6466b;
import p047ce.InterfaceC1999a;

/* JADX INFO: renamed from: he.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6038b implements InterfaceC1999a.a {

    /* JADX INFO: renamed from: a */
    public InterfaceC6466b f35683a;

    /* JADX INFO: renamed from: b */
    public InterfaceC6466b f35684b;

    /* JADX INFO: renamed from: a */
    public final void m12475a(int i10, Bundle bundle) {
        String str = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC6466b interfaceC6466b = "clx".equals(bundle2.getString("_o")) ? this.f35683a : this.f35684b;
            if (interfaceC6466b == null) {
                return;
            }
            interfaceC6466b.mo13075a(bundle2, string);
        }
    }
}
