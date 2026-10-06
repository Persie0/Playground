package p000;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbr implements ban, ayo {

    /* JADX INFO: renamed from: a */
    public static final String f2911a = ayc.m2100b("SystemFgDispatcher");

    /* JADX INFO: renamed from: b */
    public final azp f2912b;

    /* JADX INFO: renamed from: c */
    public final Object f2913c = new Object();

    /* JADX INFO: renamed from: d */
    bcj f2914d;

    /* JADX INFO: renamed from: e */
    final Map f2915e;

    /* JADX INFO: renamed from: f */
    public final Map f2916f;

    /* JADX INFO: renamed from: g */
    public final Set f2917g;

    /* JADX INFO: renamed from: h */
    public final bao f2918h;

    /* JADX INFO: renamed from: i */
    public bbq f2919i;

    /* JADX INFO: renamed from: j */
    public final C1058va f2920j;

    /* JADX INFO: renamed from: k */
    private final Context f2921k;

    public bbr(Context context) {
        this.f2921k = context;
        azp azpVarM2125e = azp.m2125e(context);
        this.f2912b = azpVarM2125e;
        this.f2920j = azpVarM2125e.f2789k;
        this.f2914d = null;
        this.f2915e = new LinkedHashMap();
        this.f2917g = new HashSet();
        this.f2916f = new HashMap();
        this.f2918h = new bap(azpVarM2125e.f2787i, this);
        azpVarM2125e.f2784f.m2112b(this);
    }

    @Override // p000.ayo
    /* JADX INFO: renamed from: a */
    public final void mo1714a(bcj bcjVar, boolean z) {
        Map.Entry entry;
        synchronized (this.f2913c) {
            bcv bcvVar = (bcv) this.f2916f.remove(bcjVar);
            if (bcvVar != null && this.f2917g.remove(bcvVar)) {
                this.f2918h.mo2166a(this.f2917g);
            }
        }
        axv axvVar = (axv) this.f2915e.remove(bcjVar);
        if (bcjVar.equals(this.f2914d) && this.f2915e.size() > 0) {
            Iterator it = this.f2915e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f2914d = (bcj) entry.getKey();
            if (this.f2919i != null) {
                axv axvVar2 = (axv) entry.getValue();
                this.f2919i.mo1718c(axvVar2.f2694a, axvVar2.f2695b, axvVar2.f2696c);
                this.f2919i.mo1716a(axvVar2.f2694a);
            }
        }
        bbq bbqVar = this.f2919i;
        if (axvVar == null || bbqVar == null) {
            return;
        }
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("Removing Notification (id: ");
        sb.append(axvVar.f2694a);
        sb.append(", workSpecId: ");
        sb.append(bcjVar);
        sb.append(", notificationType: ");
        sb.append(axvVar.f2695b);
        bbqVar.mo1716a(axvVar.f2694a);
    }

    /* JADX INFO: renamed from: b */
    public final void m2186b(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        bcj bcjVar = new bcj(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ayc.m2099a();
        if (notification == null || this.f2919i == null) {
            return;
        }
        this.f2915e.put(bcjVar, new axv(intExtra, notification, intExtra2));
        if (this.f2914d == null) {
            this.f2914d = bcjVar;
            this.f2919i.mo1718c(intExtra, intExtra2, notification);
            return;
        }
        this.f2919i.mo1717b(intExtra, notification);
        if (intExtra2 != 0) {
            Iterator it = this.f2915e.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((axv) ((Map.Entry) it.next()).getValue()).f2695b;
            }
            axv axvVar = (axv) this.f2915e.get(this.f2914d);
            if (axvVar != null) {
                this.f2919i.mo1718c(axvVar.f2694a, i, axvVar.f2696c);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2187c() {
        this.f2919i = null;
        synchronized (this.f2913c) {
            this.f2918h.mo2167b();
        }
        this.f2912b.f2784f.m2113c(this);
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: e */
    public final void mo1720e(List list) {
    }

    @Override // p000.ban
    /* JADX INFO: renamed from: f */
    public final void mo1721f(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcv bcvVar = (bcv) it.next();
            String str = bcvVar.f2964a;
            ayc.m2099a();
            azp azpVar = this.f2912b;
            bdx.m2257b(azpVar.f2789k, new bed(azpVar, new bkn(bbu.m2189b(bcvVar)), true, null));
        }
    }
}
