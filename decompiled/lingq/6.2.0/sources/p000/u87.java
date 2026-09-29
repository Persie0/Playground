package p000;

import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u87 {

    /* JADX INFO: renamed from: a */
    public static volatile C2927dg f63590a;

    /* JADX INFO: renamed from: b */
    public static final Logger f63591b;

    static {
        try {
            for (Map.Entry entry : AbstractC3649ui.f63957b.entrySet()) {
                AbstractC3649ui.m22744a((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        f63590a = new C2927dg();
        f63591b = Logger.getLogger(dr6.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
