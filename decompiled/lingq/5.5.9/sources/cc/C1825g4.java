package cc;

import com.google.android.gms.internal.measurement.C2765n0;
import com.google.android.gms.internal.measurement.C2806q2;
import java.util.LinkedHashMap;
import p176ib.C6272i;
import p326q.C8450f;

/* JADX INFO: renamed from: cc.g4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1825g4 extends C8450f {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1834h4 f9814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825g4(C1834h4 c1834h4) {
        super(20);
        this.f9814f = c1834h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p326q.C8450f
    /* JADX INFO: renamed from: a */
    public final Object mo5610a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        C6272i.m12912f(str);
        C1834h4 c1834h4 = this.f9814f;
        c1834h4.m5494h();
        C6272i.m12912f(str);
        if (!c1834h4.m5619s(str)) {
            return null;
        }
        if (!c1834h4.f9844h.containsKey(str) || c1834h4.f9844h.getOrDefault(str, null) == 0) {
            c1834h4.m5615n(str);
        } else {
            c1834h4.m5616o(str, (C2806q2) c1834h4.f9844h.getOrDefault(str, null));
        }
        C1825g4 c1825g4 = c1834h4.f9846j;
        synchronized (c1825g4) {
            try {
                linkedHashMap = new LinkedHashMap(c1825g4.f45593a);
            } finally {
            }
        }
        return (C2765n0) linkedHashMap.get(str);
    }
}
