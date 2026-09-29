package p121fh;

import ag.C0075b;
import ag.C0076c;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p003a2.C0009a;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;
import p535zg.C10489a;

/* JADX INFO: renamed from: fh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5536e {

    /* JADX INFO: renamed from: i */
    public static final C0076c f34226i;

    /* JADX INFO: renamed from: a */
    public final InterfaceC7361c f34227a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC5532a> f34228b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    public final ArrayList f34229c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f34230d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f34231e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f34232f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f34233g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f34234h = false;

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f34226i = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "PrivacyProfileManager");
    }

    public C5536e(InterfaceC7361c interfaceC7361c) {
        this.f34227a = interfaceC7361c;
    }

    /* JADX INFO: renamed from: b */
    public static void m11781b(ArrayList arrayList, List list) {
        for (Object obj : list) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11782a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = false;
        for (InterfaceC5534c interfaceC5534c : this.f34229c) {
            if (m11783c(interfaceC5534c.mo11776a())) {
                m11781b(arrayList, interfaceC5534c.mo11780e());
                m11781b(arrayList2, interfaceC5534c.mo11779d());
                if (interfaceC5534c.mo11777b()) {
                    z10 = true;
                }
            }
        }
        Iterator it = this.f34230d.iterator();
        loop1: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                InterfaceC5534c interfaceC5534c2 = (InterfaceC5534c) it.next();
                if (m11783c(interfaceC5534c2.mo11776a())) {
                    m11781b(arrayList, interfaceC5534c2.mo11780e());
                    m11781b(arrayList2, interfaceC5534c2.mo11779d());
                    if (interfaceC5534c2.mo11777b()) {
                        z10 = true;
                    }
                }
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = this.f34232f;
        boolean z11 = !arrayList.equals(arrayList3);
        ArrayList arrayList4 = this.f34233g;
        boolean z12 = !arrayList2.equals(arrayList4);
        boolean z13 = z10 != this.f34234h;
        if (z11 || z12 || z13) {
            arrayList3.clear();
            m11781b(arrayList3, arrayList);
            arrayList4.clear();
            m11781b(arrayList4, arrayList2);
            this.f34234h = z10;
            C0076c c0076c = f34226i;
            if (z11) {
                c0076c.m459c("Privacy Profile datapoint deny list has changed to " + arrayList3);
            }
            if (z13) {
                c0076c.m459c("Privacy Profile sleep has changed to ".concat(this.f34234h ? "Enabled" : "Disabled"));
            }
            boolean z14 = z11 || z12;
            ArrayList arrayListM16896W = C8656b.m16896W(this.f34228b);
            if (arrayListM16896W.isEmpty()) {
                return;
            }
            ((C7360b) this.f34227a).m14769f(new RunnableC5535d(z14, arrayListM16896W, z13));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11783c(String str) {
        if ("_always".equals(str)) {
            return true;
        }
        return this.f34231e.contains(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m11784d(InterfaceC5534c interfaceC5534c) {
        for (InterfaceC5534c interfaceC5534c2 : this.f34230d) {
            if (interfaceC5534c2.mo11776a().equals(interfaceC5534c.mo11776a())) {
                this.f34230d.remove(interfaceC5534c2);
                break;
            }
        }
        this.f34230d.add(interfaceC5534c);
        m11782a();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m11785e(ArrayList arrayList) {
        this.f34229c.clear();
        this.f34229c.addAll(arrayList);
        m11782a();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m11786f(String str, boolean z10) {
        boolean zM11783c = m11783c(str);
        if (z10 && !zM11783c) {
            f34226i.m459c("Enabling privacy profile " + str);
            this.f34231e.add(str);
            m11782a();
        } else if (!z10 && zM11783c) {
            f34226i.m459c("Disabling privacy profile " + str);
            this.f34231e.remove(str);
            m11782a();
        }
    }
}
