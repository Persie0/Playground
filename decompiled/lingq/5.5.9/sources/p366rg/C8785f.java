package p366rg;

import android.content.Context;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;
import p075dh.C5176d;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: rg.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8785f implements InterfaceC8786g {

    /* JADX INFO: renamed from: d */
    public final AbstractC8781b f46578d;

    /* JADX INFO: renamed from: e */
    public boolean f46579e = false;

    /* JADX INFO: renamed from: f */
    public ArrayList f46580f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<String> f46581g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<PayloadType> f46582h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<String> f46583i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<String> f46584j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public List<String> f46585k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<PayloadType> f46586l = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C8783d f46575a = new C8783d();

    /* JADX INFO: renamed from: b */
    public final C8782c f46576b = new C8782c();

    /* JADX INFO: renamed from: c */
    public final C8784e f46577c = new C8784e();

    public C8785f() {
        AbstractC8781b abstractC8781b;
        try {
            Object objNewInstance = Class.forName("com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork").newInstance();
            if (!(objNewInstance instanceof AbstractC8781b)) {
                throw new Exception("DataPointCollection of invalid type");
            }
            abstractC8781b = (AbstractC8781b) objNewInstance;
            this.f46578d = abstractC8781b;
        } catch (Throwable unused) {
            AbstractC8781b.f46541b.m459c("Unable to build data collection module com.kochava.tracker.datapointnetwork.internal.DataPointCollectionNetwork");
            abstractC8781b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m17068a(List<String> list, InterfaceC10488f interfaceC10488f, InterfaceC10488f interfaceC10488f2) {
        for (String str : list) {
            if (!str.isEmpty()) {
                interfaceC10488f2.mo19465o(str);
                interfaceC10488f.mo19465o(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17069b(Context context, C5176d c5176d, boolean z10, InterfaceC10488f interfaceC10488f, InterfaceC10488f interfaceC10488f2) {
        this.f46575a.m17044d(context, c5176d, z10, this.f46579e, this.f46580f, this.f46581g, this.f46585k, this.f46584j, interfaceC10488f, interfaceC10488f2);
        this.f46576b.m17044d(context, c5176d, z10, this.f46579e, this.f46580f, this.f46581g, this.f46585k, this.f46584j, interfaceC10488f, interfaceC10488f2);
        this.f46577c.m17044d(context, c5176d, z10, this.f46579e, this.f46580f, this.f46581g, this.f46585k, this.f46584j, interfaceC10488f, interfaceC10488f2);
        AbstractC8781b abstractC8781b = this.f46578d;
        if (abstractC8781b != null) {
            abstractC8781b.m17044d(context, c5176d, z10, this.f46579e, this.f46580f, this.f46581g, this.f46585k, this.f46584j, interfaceC10488f, interfaceC10488f2);
        }
        if (z10) {
            m17068a(this.f46581g, interfaceC10488f, interfaceC10488f2);
            if (c5176d.f33197a != PayloadType.Init) {
                m17068a(this.f46585k, interfaceC10488f, interfaceC10488f2);
            }
            if (c5176d.f33197a == PayloadType.Install) {
                List<String> list = this.f46584j;
                InterfaceC10488f interfaceC10488fMo19454d = interfaceC10488f2.mo19454d("identity_link", false);
                if (interfaceC10488fMo19454d != null) {
                    for (String str : list) {
                        if (!str.isEmpty()) {
                            interfaceC10488fMo19454d.mo19465o(str);
                        }
                    }
                    if (interfaceC10488fMo19454d.length() == 0) {
                        interfaceC10488f2.mo19465o("identity_link");
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized C8782c m17070c() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46576b;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized C8783d m17071d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46575a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized boolean m17072e(PayloadType payloadType, String str) {
        if (this.f46581g.contains(str)) {
            return false;
        }
        return payloadType == PayloadType.Init || !this.f46585k.contains(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized boolean m17073f(PayloadType payloadType) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return (this.f46582h.contains(payloadType) || this.f46586l.contains(payloadType)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m17074g(ArrayList arrayList) {
        this.f46580f = new ArrayList(arrayList);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m17075h(ArrayList arrayList) {
        this.f46581g = arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m17076i(ArrayList arrayList) {
        try {
            this.f46583i = arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m17077j(boolean z10) {
        this.f46579e = z10;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m17078k(ArrayList arrayList) {
        try {
            this.f46584j = arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final synchronized void m17079l(ArrayList arrayList) {
        this.f46582h = arrayList;
    }
}
