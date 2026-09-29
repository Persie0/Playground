package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vgd {

    /* JADX INFO: renamed from: a */
    public final zzsb f65363a;

    public /* synthetic */ vgd(vf9 vf9Var) {
        this.f65363a = (zzsb) vf9Var.f65323a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof vgd) && x74.m24360q(this.f65363a, ((vgd) obj).f65363a) && x74.m24360q(null, null) && x74.m24360q(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f65363a, null, null});
    }
}
