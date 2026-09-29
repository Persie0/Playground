package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b3c {

    /* JADX INFO: renamed from: a */
    public final zzou f7882a;

    /* JADX INFO: renamed from: b */
    public final Boolean f7883b;

    /* JADX INFO: renamed from: c */
    public final vgd f7884c;

    public /* synthetic */ b3c(mq7 mq7Var) {
        this.f7882a = (zzou) mq7Var.f51733b;
        this.f7883b = (Boolean) mq7Var.f51734c;
        this.f7884c = (vgd) mq7Var.f51735d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b3c)) {
            return false;
        }
        b3c b3cVar = (b3c) obj;
        return x74.m24360q(this.f7882a, b3cVar.f7882a) && x74.m24360q(null, null) && x74.m24360q(this.f7883b, b3cVar.f7883b) && x74.m24360q(null, null) && x74.m24360q(this.f7884c, b3cVar.f7884c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7882a, null, this.f7883b, null, this.f7884c});
    }
}
