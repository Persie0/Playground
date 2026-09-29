package no;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;

/* JADX INFO: renamed from: no.c1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7821c1 extends CoroutineDispatcher {
    /* JADX INFO: renamed from: C1 */
    public abstract AbstractC7821c1 mo14316C1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        AbstractC7821c1 abstractC7821c1Mo14316C1;
        String str;
        C7178b c7178b = C7832g0.f42930a;
        AbstractC7821c1 abstractC7821c1 = C7162l.f40438a;
        if (this == abstractC7821c1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC7821c1Mo14316C1 = abstractC7821c1.mo14316C1();
            } catch (UnsupportedOperationException unused) {
                abstractC7821c1Mo14316C1 = null;
            }
            str = this == abstractC7821c1Mo14316C1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C7814a0.m15551c(this);
    }
}
