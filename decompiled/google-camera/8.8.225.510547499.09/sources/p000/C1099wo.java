package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1099wo {

    /* JADX INFO: renamed from: a */
    public final C1097wm f47946a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0946qx f47947b;

    /* JADX INFO: renamed from: c */
    public final Object f47948c;

    /* JADX INFO: renamed from: d */
    public final Map f47949d;

    /* JADX INFO: renamed from: e */
    public final Map f47950e;

    /* JADX INFO: renamed from: f */
    public final C1058va f47951f;

    public C1099wo(C1097wm c1097wm, InterfaceC0946qx interfaceC0946qx, C1058va c1058va, byte[] bArr) {
        c1097wm.getClass();
        interfaceC0946qx.getClass();
        c1058va.getClass();
        this.f47946a = c1097wm;
        this.f47947b = interfaceC0946qx;
        this.f47951f = c1058va;
        this.f47948c = new Object();
        this.f47949d = new LinkedHashMap();
        this.f47950e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m19528a() throws Exception {
        List listM18673M;
        synchronized (this.f47948c) {
            this.f47949d.clear();
            listM18673M = omn.m18673M(this.f47950e.values());
            this.f47950e.clear();
        }
        Iterator it = listM18673M.iterator();
        while (it.hasNext()) {
            ((AutoCloseable) it.next()).close();
        }
    }
}
