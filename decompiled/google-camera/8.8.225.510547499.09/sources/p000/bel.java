package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bel {

    /* JADX INFO: renamed from: a */
    public final Map f3040a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f3041b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f3042c = new Object();

    /* JADX INFO: renamed from: d */
    public final bkn f3043d;

    static {
        ayc.m2100b("WorkTimer");
    }

    public bel(bkn bknVar, byte[] bArr, byte[] bArr2) {
        this.f3043d = bknVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m2265a(bcj bcjVar) {
        synchronized (this.f3042c) {
            if (((bek) this.f3040a.remove(bcjVar)) != null) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("Stopping timer for ");
                sb.append(bcjVar);
                this.f3041b.remove(bcjVar);
            }
        }
    }
}
