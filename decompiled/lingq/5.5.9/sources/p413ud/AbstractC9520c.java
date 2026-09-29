package p413ud;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import p290o6.C7967l0;

/* JADX INFO: renamed from: ud.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9520c {

    /* JADX INFO: renamed from: a */
    public final C7967l0 f49023a;

    /* JADX INFO: renamed from: b */
    public final IntentFilter f49024b;

    /* JADX INFO: renamed from: c */
    public final Context f49025c;

    /* JADX INFO: renamed from: d */
    public final HashSet f49026d = new HashSet();

    /* JADX INFO: renamed from: e */
    public C9519b f49027e = null;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49028f = false;

    public AbstractC9520c(C7967l0 c7967l0, IntentFilter intentFilter, Context context) {
        this.f49023a = c7967l0;
        this.f49024b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f49025c = applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8963a(Intent intent);

    /* JADX INFO: renamed from: b */
    public final void m17981b() {
        C9519b c9519b;
        if ((this.f49028f || !this.f49026d.isEmpty()) && this.f49027e == null) {
            C9519b c9519b2 = new C9519b(this);
            this.f49027e = c9519b2;
            this.f49025c.registerReceiver(c9519b2, this.f49024b);
        }
        if (this.f49028f || !this.f49026d.isEmpty() || (c9519b = this.f49027e) == null) {
            return;
        }
        this.f49025c.unregisterReceiver(c9519b);
        this.f49027e = null;
    }
}
