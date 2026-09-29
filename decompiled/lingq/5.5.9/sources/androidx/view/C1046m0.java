package androidx.view;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1046m0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6677a = new LinkedHashMap();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m3952a() {
        for (AbstractC1036h0 abstractC1036h0 : this.f6677a.values()) {
            abstractC1036h0.f6657c = true;
            HashMap map = abstractC1036h0.f6655a;
            if (map != null) {
                synchronized (map) {
                    Iterator it = abstractC1036h0.f6655a.values().iterator();
                    while (it.hasNext()) {
                        AbstractC1036h0.m3940i2(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC1036h0.f6656b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = abstractC1036h0.f6656b.iterator();
                    while (it2.hasNext()) {
                        AbstractC1036h0.m3940i2((Closeable) it2.next());
                    }
                }
            }
            abstractC1036h0.mo3725j2();
        }
        this.f6677a.clear();
    }
}
