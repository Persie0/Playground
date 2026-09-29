package com.amplitude.core.utilities;

import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.platform.C0907a;
import com.amplitude.core.platform.WriteQueueMessageType;
import com.amplitude.core.utilities.http.HttpStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.C3211a;
import org.json.JSONArray;
import org.json.JSONException;
import p000.AbstractC3572sf;
import p000.al3;
import p000.b34;
import p000.b90;
import p000.dr5;
import p000.ed2;
import p000.f1a;
import p000.fd2;
import p000.gn9;
import p000.jz2;
import p000.m5a;
import p000.md2;
import p000.nn1;
import p000.o9b;
import p000.pj5;
import p000.q67;
import p000.r70;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: com.amplitude.core.utilities.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0915c {

    /* JADX INFO: renamed from: a */
    public final C0898b f11264a;

    /* JADX INFO: renamed from: b */
    public final C0907a f11265b;

    /* JADX INFO: renamed from: c */
    public final un1 f11266c;

    /* JADX INFO: renamed from: d */
    public final nn1 f11267d;

    /* JADX INFO: renamed from: e */
    public final pj5 f11268e;

    /* JADX INFO: renamed from: f */
    public final C0905a f11269f;

    public C0915c(C0898b c0898b, C0907a c0907a, C0880b c0880b, un1 un1Var, nn1 nn1Var, pj5 pj5Var, C0905a c0905a) {
        c0898b.getClass();
        un1Var.getClass();
        this.f11264a = c0898b;
        this.f11265b = c0907a;
        this.f11266c = un1Var;
        this.f11267d = nn1Var;
        this.f11268e = pj5Var;
        this.f11269f = c0905a;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m5168a(AbstractC3572sf abstractC3572sf, Object obj, String str) throws JSONException {
        obj.getClass();
        if (abstractC3572sf instanceof gn9) {
            gn9 gn9Var = (gn9) abstractC3572sf;
            obj.getClass();
            String str2 = (String) obj;
            pj5 pj5Var = this.f11268e;
            if (pj5Var != null) {
                pj5Var.mo16256b("Handle response, status: " + ((HttpStatus) gn9Var.f60774a));
            }
            m5170c(HttpStatus.SUCCESS.getStatusCode(), "Event sent success.", b34.m3226W(m5169b(str, str2)));
            wfb.m23926u(this.f11266c, this.f11267d, null, new FileResponseHandler$handleSuccessResponse$1(this, str2, null), 2);
            return null;
        }
        boolean z = true;
        if (abstractC3572sf instanceof r70) {
            r70 r70Var = (r70) abstractC3572sf;
            obj.getClass();
            pj5 pj5Var2 = this.f11268e;
            if (pj5Var2 != null) {
                pj5Var2.mo16256b("Handle response, status: " + ((HttpStatus) r70Var.f60774a) + ", error: " + r70Var.m20420E());
            }
            String str3 = (String) obj;
            ArrayList arrayListM3226W = b34.m3226W(m5169b(str, str3));
            boolean zM20423H = r70Var.m20423H();
            nn1 nn1Var = this.f11267d;
            un1 un1Var = this.f11266c;
            if (!zM20423H) {
                LinkedHashSet linkedHashSetM20421F = r70Var.m20421F();
                ArrayList arrayList = new ArrayList();
                ArrayList<b90> arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj2 : arrayListM3226W) {
                    int i2 = i + 1;
                    if (i < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    b90 b90Var = (b90) obj2;
                    if (linkedHashSetM20421F.contains(Integer.valueOf(i)) || r70Var.m20422G(b90Var)) {
                        arrayList.add(b90Var);
                    } else {
                        arrayList2.add(b90Var);
                    }
                    i = i2;
                }
                if (arrayList.isEmpty()) {
                    wfb.m23926u(un1Var, nn1Var, null, new FileResponseHandler$handleBadRequestResponse$3(this, obj, null), 2);
                } else {
                    m5170c(HttpStatus.BAD_REQUEST.getStatusCode(), r70Var.m20420E(), arrayList);
                    for (b90 b90Var2 : arrayList2) {
                        b90Var2.getClass();
                        this.f11265b.f11101g.mo4677k(new o9b(WriteQueueMessageType.EVENT, b90Var2));
                    }
                    wfb.m23926u(un1Var, nn1Var, null, new FileResponseHandler$handleBadRequestResponse$5(this, str3, arrayList, arrayList2, null), 2);
                }
                return Boolean.valueOf(z);
            }
            m5170c(HttpStatus.BAD_REQUEST.getStatusCode(), r70Var.m20420E(), arrayListM3226W);
            wfb.m23926u(un1Var, nn1Var, null, new FileResponseHandler$handleBadRequestResponse$1(this, str3, null), 2);
            z = false;
            return Boolean.valueOf(z);
        }
        if (abstractC3572sf instanceof q67) {
            q67 q67Var = (q67) abstractC3572sf;
            obj.getClass();
            pj5 pj5Var3 = this.f11268e;
            if (pj5Var3 != null) {
                pj5Var3.mo16256b("Handle response, status: " + ((HttpStatus) q67Var.f60774a) + ", error: " + q67Var.m19681E());
            }
            String str4 = (String) obj;
            JSONArray jSONArrayM5169b = m5169b(str, str4);
            int length = jSONArrayM5169b.length();
            nn1 nn1Var2 = this.f11267d;
            un1 un1Var2 = this.f11266c;
            if (length == 1) {
                m5170c(HttpStatus.PAYLOAD_TOO_LARGE.getStatusCode(), q67Var.m19681E(), b34.m3226W(jSONArrayM5169b));
                wfb.m23926u(un1Var2, nn1Var2, null, new FileResponseHandler$handlePayloadTooLargeResponse$1(this, str4, null), 2);
            } else {
                wfb.m23926u(un1Var2, nn1Var2, null, new FileResponseHandler$handlePayloadTooLargeResponse$2(this, str4, jSONArrayM5169b, null), 2);
            }
            return Boolean.TRUE;
        }
        if (abstractC3572sf instanceof m5a) {
            m5a m5aVar = (m5a) abstractC3572sf;
            obj.getClass();
            pj5 pj5Var4 = this.f11268e;
            if (pj5Var4 != null) {
                pj5Var4.mo16256b("Handle response, status: " + ((HttpStatus) m5aVar.f60774a) + ", error: " + m5aVar.m16652E());
            }
            wfb.m23926u(this.f11266c, this.f11267d, null, new FileResponseHandler$handleTooManyRequestsResponse$1(this, obj, null), 2);
            return Boolean.TRUE;
        }
        if (abstractC3572sf instanceof f1a) {
            f1a f1aVar = (f1a) abstractC3572sf;
            obj.getClass();
            pj5 pj5Var5 = this.f11268e;
            if (pj5Var5 != null) {
                pj5Var5.mo16256b("Handle response, status: " + ((HttpStatus) f1aVar.f60774a));
            }
            wfb.m23926u(this.f11266c, this.f11267d, null, new FileResponseHandler$handleTimeoutResponse$1(this, obj, null), 2);
            return Boolean.TRUE;
        }
        jz2 jz2Var = (jz2) abstractC3572sf;
        obj.getClass();
        pj5 pj5Var6 = this.f11268e;
        if (pj5Var6 != null) {
            pj5Var6.mo16256b("Handle response, status: " + ((HttpStatus) jz2Var.f60774a) + ", error: " + jz2Var.m14753E());
        }
        wfb.m23926u(this.f11266c, this.f11267d, null, new FileResponseHandler$handleFailedResponse$1(this, obj, null), 2);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m5169b(String str, String str2) throws JSONException {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            FileResponseHandler$parseEvents$1 fileResponseHandler$parseEvents$1 = new FileResponseHandler$parseEvents$1(this, str2, null);
            un1 un1Var = this.f11266c;
            nn1 nn1Var = this.f11267d;
            wfb.m23926u(un1Var, nn1Var, null, fileResponseHandler$parseEvents$1, 2);
            al3 al3Var = new al3(Regex.m15422c(new Regex("\"insert_id\":\"(.{36})\","), str));
            while (al3Var.hasNext()) {
                wfb.m23926u(un1Var, nn1Var, null, new FileResponseHandler$removeCallbackByInsertId$1$1(this, (dr5) al3Var.next(), null), 2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5170c(int i, String str, ArrayList arrayList) {
        C0915c c0915c;
        int i2;
        String str2;
        C0905a c0905a;
        if (!arrayList.isEmpty() && (c0905a = this.f11269f) != null) {
            str.getClass();
            if (!arrayList.isEmpty()) {
                if (200 > i || i >= 300) {
                    long size = arrayList.size();
                    C3211a c3211a = c0905a.f11068r;
                    c3211a.mo4677k(new fd2("analytics.events.dropped", size));
                    ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((b90) it.next()).mo3490a());
                    }
                    c3211a.mo4677k(new ed2(new md2("analytics.events.dropped", System.currentTimeMillis() / 1000.0d, AbstractC3194a.m15365R(new Pair("events", arrayList2), new Pair("count", Integer.valueOf(arrayList.size())), new Pair("code", Integer.valueOf(i)), new Pair("message", str)))));
                } else {
                    c0905a.f11068r.mo4677k(new fd2("analytics.events.sent", arrayList.size()));
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b90 b90Var = (b90) it2.next();
            String str3 = b90Var.f8147f;
            if (str3 != null) {
                c0915c = this;
                i2 = i;
                str2 = str;
                wfb.m23926u(c0915c.f11266c, c0915c.f11267d, null, new FileResponseHandler$triggerEventsCallback$1$2$1(c0915c, str3, b90Var, i2, str2, null), 2);
            } else {
                c0915c = this;
                i2 = i;
                str2 = str;
            }
            this = c0915c;
            i = i2;
            str = str2;
        }
    }
}
