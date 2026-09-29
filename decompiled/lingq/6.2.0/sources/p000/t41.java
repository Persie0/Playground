package p000;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class t41 {

    /* JADX INFO: renamed from: c */
    public static SensorManager f61841c;

    /* JADX INFO: renamed from: d */
    public static ota f61842d;

    /* JADX INFO: renamed from: e */
    public static String f61843e;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f61846h;

    /* JADX INFO: renamed from: a */
    public static final t41 f61839a = new t41();

    /* JADX INFO: renamed from: b */
    public static final pta f61840b = new pta();

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f61844f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f61845g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final String m21837a() {
        if (lp1.f49971a.contains(t41.class)) {
            return null;
        }
        try {
            if (f61843e == null) {
                f61843e = UUID.randomUUID().toString();
            }
            String str = f61843e;
            str.getClass();
            return str;
        } catch (Throwable th) {
            lp1.m16420a(t41.class, th);
            return null;
        }
    }
}
