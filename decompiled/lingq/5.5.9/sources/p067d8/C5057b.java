package p067d8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import dm.C5207g;
import java.util.Set;
import kotlin.text.Regex;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8201h;
import p498y3.C10289a;

/* JADX INFO: renamed from: d8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5057b extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static C5057b f32911b;

    /* JADX INFO: renamed from: a */
    public final Context f32912a;

    /* JADX INFO: renamed from: d8.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m10749a(Context context) {
            if (C5057b.m10748a() != null) {
                C5057b.m10748a();
                return;
            }
            C5057b c5057b = new C5057b(context);
            if (!C6205a.m12742b(C5057b.class)) {
                try {
                    if (!C6205a.m12742b(c5057b)) {
                        try {
                            C10289a c10289aM19281a = C10289a.m19281a(c5057b.f32912a);
                            C5207g.m11110e(c10289aM19281a, "getInstance(applicationContext)");
                            c10289aM19281a.m19282b(c5057b, new IntentFilter("com.parse.bolts.measurement_event"));
                        } catch (Throwable th2) {
                            C6205a.m12741a(c5057b, th2);
                        }
                    }
                } catch (Throwable th3) {
                    C6205a.m12741a(C5057b.class, th3);
                }
            }
            if (!C6205a.m12742b(C5057b.class)) {
                try {
                    C5057b.f32911b = c5057b;
                } catch (Throwable th4) {
                    C6205a.m12741a(C5057b.class, th4);
                }
            }
            C5057b.m10748a();
        }
    }

    public C5057b(Context context) {
        Context applicationContext = context.getApplicationContext();
        C5207g.m11110e(applicationContext, "context.applicationContext");
        this.f32912a = applicationContext;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C5057b m10748a() {
        if (C6205a.m12742b(C5057b.class)) {
            return null;
        }
        try {
            return f32911b;
        } catch (Throwable th2) {
            C6205a.m12741a(C5057b.class, th2);
            return null;
        }
    }

    public final void finalize() throws Throwable {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C10289a c10289aM19281a = C10289a.m19281a(this.f32912a);
                C5207g.m11110e(c10289aM19281a, "getInstance(applicationContext)");
                c10289aM19281a.m19284d(this);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Set<String> setKeySet = null;
            C8201h c8201h = new C8201h(context, (String) null);
            String strM11116k = C5207g.m11116k(intent == null ? null : intent.getStringExtra("event_name"), "bf_");
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                setKeySet = bundleExtra.keySet();
            }
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    C5207g.m11110e(str, "key");
                    bundle.putString(new Regex("[ -]*$").m14272c(new Regex("^[ -]*").m14272c(new Regex("[^0-9a-zA-Z _-]").m14272c(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            C8004n c8004n = C8004n.f43550a;
            if (C7993c0.m15849b()) {
                c8201h.m16332d(bundle, strM11116k);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
