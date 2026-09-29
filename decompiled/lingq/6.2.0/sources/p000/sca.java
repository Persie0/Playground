package p000;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public interface sca {
    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ void m21224J0(sca scaVar, String str, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        if ((i & 8) != 0) {
            z = false;
        }
        scaVar.mo8484Y0(str, z2, 1.0f, z);
    }

    /* JADX INFO: renamed from: P */
    void mo8482P();

    /* JADX INFO: renamed from: U0 */
    void mo8483U0(int i, double d, Double d2, float f, String str);

    /* JADX INFO: renamed from: Y0 */
    void mo8484Y0(String str, boolean z, float f, boolean z2);

    /* JADX INFO: renamed from: c2 */
    void mo8485c2();

    /* JADX INFO: renamed from: d */
    c83 mo8486d();

    /* JADX INFO: renamed from: m1 */
    Object mo8492m1(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: n */
    void mo8493n(double d, Double d2, int i, float f, Long l);

    /* JADX INFO: renamed from: u */
    eh9 mo8494u();

    /* JADX INFO: renamed from: y1 */
    void mo8495y1(Set set);
}
