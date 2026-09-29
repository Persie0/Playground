package p152hb;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p136gc.C5752h;

/* JADX INFO: renamed from: hb.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5998p {

    /* JADX INFO: renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f35567a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Map<C5752h<?>, Boolean> f35568b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m12449a(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f35567a) {
            map = new HashMap(this.f35567a);
        }
        synchronized (this.f35568b) {
            try {
                map2 = new HashMap(this.f35568b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m7565d(status);
            }
        }
        while (true) {
            for (Map.Entry entry2 : map2.entrySet()) {
                if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                    ((C5752h) entry2.getKey()).m12115c(new ApiException(status));
                }
            }
            return;
        }
    }
}
