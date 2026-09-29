package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class l3d extends k06 implements hx9 {

    /* JADX INFO: renamed from: f */
    public final jx9 f49000f;

    public l3d(kx9 kx9Var, Executor executor, C0984o c0984o, jx9 jx9Var) {
        super(kx9Var, executor);
        this.f49000f = jx9Var;
        a34 a34Var = new a34();
        a34Var.f175c = jx9Var.mo14186g() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        mq7 mq7Var = new mq7(20, false);
        vf9 vf9Var = new vf9();
        vf9Var.f65323a = umb.m22832a(jx9Var.mo14183d());
        mq7Var.f51735d = new vgd(vf9Var);
        a34Var.f176d = new mgd(mq7Var);
        C1172a.m6772c().execute(new jo0(c0984o, new C3299li(a34Var, 1), zzov.ON_DEVICE_TEXT_CREATE, c0984o.m5480c(), 13, false));
    }

    @Override // p000.oz6
    /* JADX INFO: renamed from: a */
    public final Feature[] mo11281a() {
        return z6d.m25480c(this.f49000f);
    }
}
