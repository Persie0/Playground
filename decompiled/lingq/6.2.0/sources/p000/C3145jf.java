package p000;

import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.Plugin$Type;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes.dex */
public final class C3145jf implements zf7 {

    /* JADX INFO: renamed from: a */
    public final Plugin$Type f45496a = Plugin$Type.Observe;

    /* JADX INFO: renamed from: b */
    public C3073hf f45497b;

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        String str = abstractC0903a.f11016a.f10792e;
        Object obj = C3073hf.f42287c;
        C3073hf c3073hfM24728A = xwc.m24728A(str);
        this.f45497b = c3073hfM24728A;
        ny8 ny8Var = c3073hfM24728A.f42289a;
        sq5 sq5Var = abstractC0903a.f11017b;
        ny8Var.m17685M(new hz3((String) sq5Var.f61248b, 4, (String) sq5Var.f61249c));
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: b */
    public final b90 mo5143b(b90 b90Var) {
        return null;
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        return this.f45496a;
    }
}
