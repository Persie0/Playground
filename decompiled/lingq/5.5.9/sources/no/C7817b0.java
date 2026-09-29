package no;

import kotlinx.coroutines.RunnableC7081b;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.internal.C7169s;
import kotlinx.coroutines.scheduling.C7178b;

/* JADX INFO: renamed from: no.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7817b0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7820c0 f42918a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        InterfaceC7820c0 interfaceC7820c0;
        int i10 = C7169s.f40443a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C7178b c7178b = C7832g0.f42930a;
            AbstractC7821c1 abstractC7821c1 = C7162l.f40438a;
            abstractC7821c1.mo14316C1();
            interfaceC7820c0 = !(abstractC7821c1 instanceof InterfaceC7820c0) ? RunnableC7081b.f40007i : (InterfaceC7820c0) abstractC7821c1;
        } else {
            interfaceC7820c0 = RunnableC7081b.f40007i;
        }
        f42918a = interfaceC7820c0;
    }
}
