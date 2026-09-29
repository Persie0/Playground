package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;
import p355r4.InterfaceC8730b;
import ro.C8893b;
import ro.C8894c;

/* JADX INFO: loaded from: classes2.dex */
public class JodaTimeInitializer implements InterfaceC8730b<Object> {
    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC8730b<?>>> mo3510a() {
        return Collections.emptyList();
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: b */
    public final Object mo3511b(Context context) {
        try {
            C8893b c8893b = new C8893b(context);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
            }
            DateTimeZone.m16013C(c8893b);
            DateTimeZone.f43950b.set(c8893b);
            context.getApplicationContext().registerReceiver(new C8894c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e10) {
            throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e10);
        }
    }
}
