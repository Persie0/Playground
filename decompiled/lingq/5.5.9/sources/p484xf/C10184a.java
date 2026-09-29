package p484xf;

import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: xf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10184a {

    /* JADX INFO: renamed from: a */
    public final C10487e f51514a = C10487e.m19445u();

    /* JADX INFO: renamed from: b */
    public final List<Object> f51515b = Collections.synchronizedList(new ArrayList());

    public C10184a() {
        Math.max(1, 100);
        Math.max(1, BuildConfig.SDK_TRUNCATE_LENGTH);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m19197a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f51514a.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m19198b(InterfaceC10488f interfaceC10488f) {
        try {
            C10487e c10487e = this.f51514a;
            synchronized (c10487e) {
                try {
                    Iterator<String> itKeys = c10487e.f52418a.keys();
                    while (itKeys.hasNext()) {
                        itKeys.next();
                        itKeys.remove();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f51514a.mo19464n(interfaceC10488f);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
