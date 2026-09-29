package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import no.AbstractC7821c1;
import p003a2.C0009a;
import p385sf.C9000b;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7162l {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7821c1 f40438a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        String property;
        Object next;
        int i10 = C7169s.f40443a;
        AbstractC7821c1 abstractC7821c1Mo14459b = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List<? extends InterfaceC7161k> listM17255u = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14248I2(C0009a.m27p())));
        Iterator it = listM17255u.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iMo14460c = ((InterfaceC7161k) next).mo14460c();
                do {
                    Object next2 = it.next();
                    int iMo14460c2 = ((InterfaceC7161k) next2).mo14460c();
                    if (iMo14460c < iMo14460c2) {
                        next = next2;
                        iMo14460c = iMo14460c2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        InterfaceC7161k interfaceC7161k = (InterfaceC7161k) next;
        if (interfaceC7161k == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        try {
            abstractC7821c1Mo14459b = interfaceC7161k.mo14459b(listM17255u);
        } catch (Throwable unused2) {
            interfaceC7161k.mo14458a();
        }
        if (abstractC7821c1Mo14459b != null) {
            f40438a = abstractC7821c1Mo14459b;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        throw th;
    }
}
