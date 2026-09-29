package bg;

import android.content.Context;
import dm.C5212l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import mg.C7557a;
import p338qd.C8573r0;
import p349qo.C8656b;
import p534zf.C10483a;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: bg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1380a {

    /* JADX INFO: renamed from: a */
    public final boolean f8290a;

    /* JADX INFO: renamed from: b */
    public final String f8291b;

    /* JADX INFO: renamed from: c */
    public final String f8292c;

    /* JADX INFO: renamed from: d */
    public final String f8293d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC1384e> f8294e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC1382c> f8295f;

    public C1380a() {
        this.f8290a = false;
        this.f8291b = "";
        this.f8292c = "";
        this.f8293d = "";
        this.f8294e = Collections.emptyList();
        this.f8295f = Collections.emptyList();
    }

    public C1380a(String str, String str2, String str3, List<InterfaceC1384e> list, List<InterfaceC1382c> list2) {
        this.f8290a = true;
        this.f8291b = str;
        this.f8292c = str2;
        this.f8293d = str3;
        this.f8294e = list;
        this.f8295f = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C1380a m4966a(Context context, String str) {
        if (!C5212l.m11150W(str)) {
            return new C1380a();
        }
        try {
            Class<?> cls = Class.forName(str);
            String strM16889P = C8656b.m16889P(C5212l.m11145R(cls, "SDK_MODULE_NAME"), "");
            String strM16889P2 = C8656b.m16889P(C5212l.m11145R(cls, "SDK_VERSION"), "");
            Date date = new Date(C8656b.m16888O(C5212l.m11145R(cls, "SDK_BUILD_TIME_MILLIS"), 0L).longValue());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str2 = simpleDateFormat.format(date);
            InterfaceC10484b interfaceC10484bM16884K = C8656b.m16884K(C5212l.m11145R(cls, "SDK_PERMISSIONS"));
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < interfaceC10484bM16884K.length(); i10++) {
                InterfaceC10488f interfaceC10488fMo19434d = interfaceC10484bM16884K.mo19434d(i10);
                if (interfaceC10488fMo19434d != null) {
                    arrayList.add(new C1383d(interfaceC10488fMo19434d.mo19467q("name", ""), C7557a.m15078b(context, interfaceC10488fMo19434d.mo19467q("path", ""))));
                }
            }
            InterfaceC10484b interfaceC10484bM16884K2 = C8656b.m16884K(C5212l.m11145R(cls, "SDK_DEPENDENCIES"));
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < interfaceC10484bM16884K2.length(); i11++) {
                InterfaceC10488f interfaceC10488fMo19434d2 = interfaceC10484bM16884K2.mo19434d(i11);
                if (interfaceC10488fMo19434d2 != null) {
                    arrayList2.add(new C1381b(interfaceC10488fMo19434d2.mo19467q("name", ""), C5212l.m11150W(interfaceC10488fMo19434d2.mo19467q("path", ""))));
                }
            }
            if (!strM16889P.isEmpty() && !strM16889P2.isEmpty() && !str2.isEmpty()) {
                return new C1380a(strM16889P, strM16889P2, str2, arrayList, arrayList2);
            }
            return new C1380a();
        } catch (Throwable unused) {
            return new C1380a();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C10487e m4967b() {
        C10487e c10487eM19445u = C10487e.m19445u();
        String str = this.f8291b;
        if (!C8573r0.m16662A0(str)) {
            c10487eM19445u.m19450D("name", str);
        }
        String str2 = this.f8292c;
        if (!C8573r0.m16662A0(str2)) {
            c10487eM19445u.m19450D("version", str2);
        }
        String str3 = this.f8293d;
        if (!C8573r0.m16662A0(str3)) {
            c10487eM19445u.m19450D("buildDate", str3);
        }
        C10483a c10483aM19430i = C10483a.m19430i();
        for (InterfaceC1384e interfaceC1384e : this.f8294e) {
            if (interfaceC1384e.mo4971b()) {
                String strMo4970a = interfaceC1384e.mo4970a();
                synchronized (c10483aM19430i) {
                    try {
                        c10483aM19430i.m19437g(strMo4970a);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (c10483aM19430i.length() > 0) {
            c10487eM19445u.m19447A("permissions", c10483aM19430i);
        }
        C10483a c10483aM19430i2 = C10483a.m19430i();
        for (InterfaceC1382c interfaceC1382c : this.f8295f) {
            if (interfaceC1382c.mo4969b()) {
                String strMo4968a = interfaceC1382c.mo4968a();
                synchronized (c10483aM19430i2) {
                    c10483aM19430i2.m19437g(strMo4968a);
                }
            }
        }
        if (c10483aM19430i2.length() > 0) {
            c10487eM19445u.m19447A("dependencies", c10483aM19430i2);
        }
        return c10487eM19445u;
    }
}
