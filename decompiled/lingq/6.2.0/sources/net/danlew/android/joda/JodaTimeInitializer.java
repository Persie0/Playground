package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;
import p000.c54;
import p000.c88;
import p000.ij6;
import p000.wcd;

/* JADX INFO: loaded from: classes.dex */
public class JodaTimeInitializer implements c54 {
    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        try {
            c88 c88Var = new c88(context);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
            }
            DateTimeZone.m18345u(c88Var);
            DateTimeZone.f54830b.set(c88Var);
            context.getApplicationContext().registerReceiver(new wcd(1), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e) {
            ij6.m13958p("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e);
            return null;
        }
    }
}
