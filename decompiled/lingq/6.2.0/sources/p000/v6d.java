package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v6d {

    /* JADX INFO: renamed from: a */
    public final zzob f64953a;

    /* JADX INFO: renamed from: b */
    public final Integer f64954b;

    public /* synthetic */ v6d(cdb cdbVar) {
        this.f64953a = (zzob) cdbVar.f9945b;
        this.f64954b = (Integer) cdbVar.f9946c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v6d)) {
            return false;
        }
        v6d v6dVar = (v6d) obj;
        return x74.m24360q(this.f64953a, v6dVar.f64953a) && x74.m24360q(this.f64954b, v6dVar.f64954b) && x74.m24360q(null, null) && x74.m24360q(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f64953a, this.f64954b, null, null});
    }
}
