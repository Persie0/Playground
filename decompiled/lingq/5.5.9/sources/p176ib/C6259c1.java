package p176ib;

import java.util.ArrayDeque;
import java.util.Queue;
import p457wd.C9910k;
import p457wd.InterfaceC9906g;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: ib.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6259c1 {

    /* JADX INFO: renamed from: a */
    public boolean f36454a;

    /* JADX INFO: renamed from: b */
    public final Object f36455b;

    /* JADX INFO: renamed from: c */
    public Object f36456c;

    public C6259c1() {
        this.f36455b = new Object();
    }

    public C6259c1(String str, boolean z10) {
        this.f36456c = "com.google.android.gms";
        this.f36455b = str;
        this.f36454a = z10;
    }

    public C6259c1(boolean z10, String str, InterfaceC10488f interfaceC10488f) {
        this.f36454a = z10;
        this.f36455b = str;
        this.f36456c = interfaceC10488f;
    }

    /* JADX INFO: renamed from: a */
    public final C10487e m12893a() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19472x("match", this.f36454a);
        String str = (String) this.f36455b;
        if (str != null) {
            c10487eM19445u.m19450D("detail", str);
        }
        InterfaceC10488f interfaceC10488f = (InterfaceC10488f) this.f36456c;
        if (interfaceC10488f != null) {
            c10487eM19445u.m19448B(interfaceC10488f, "deeplink");
        }
        return c10487eM19445u;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m12894b(InterfaceC9906g interfaceC9906g) {
        synchronized (this.f36455b) {
            if (((Queue) this.f36456c) == null) {
                this.f36456c = new ArrayDeque();
            }
            ((Queue) this.f36456c).add(interfaceC9906g);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m12895c(C9910k c9910k) {
        InterfaceC9906g interfaceC9906g;
        synchronized (this.f36455b) {
            if (((Queue) this.f36456c) == null || this.f36454a) {
                return;
            }
            this.f36454a = true;
            while (true) {
                synchronized (this.f36455b) {
                    interfaceC9906g = (InterfaceC9906g) ((Queue) this.f36456c).poll();
                    if (interfaceC9906g == null) {
                        this.f36454a = false;
                        return;
                    }
                }
                interfaceC9906g.mo18406a(c9910k);
            }
        }
    }
}
