package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class qj7 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rj7 f57857a;

    public qj7(rj7 rj7Var) {
        this.f57857a = rj7Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        rj7 rj7Var = this.f57857a;
        try {
            ls2 ls2Var = ls2.f50069c;
            Mac mac = (Mac) ls2Var.f50070a.mo13283r(rj7Var.f59406b);
            mac.init(rj7Var.f59407c);
            return mac;
        } catch (GeneralSecurityException e) {
            uk9.m22779n(e);
            return null;
        }
    }
}
