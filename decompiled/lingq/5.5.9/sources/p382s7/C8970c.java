package p382s7;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p173i8.C6205a;

/* JADX INFO: renamed from: s7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8970c {

    /* JADX INFO: renamed from: c */
    public static SensorManager f47000c;

    /* JADX INFO: renamed from: d */
    public static C8974g f47001d;

    /* JADX INFO: renamed from: e */
    public static String f47002e;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f47005h;

    /* JADX INFO: renamed from: a */
    public static final C8970c f46998a = new C8970c();

    /* JADX INFO: renamed from: b */
    public static final C8975h f46999b = new C8975h();

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f47003f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f47004g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final String m17200a() {
        if (C6205a.m12742b(C8970c.class)) {
            return null;
        }
        try {
            if (f47002e == null) {
                f47002e = UUID.randomUUID().toString();
            }
            String str = f47002e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            C6205a.m12741a(C8970c.class, th2);
            return null;
        }
    }
}
