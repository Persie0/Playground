package p000;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ko8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lo8 f47606b;

    public /* synthetic */ ko8(lo8 lo8Var, int i) {
        this.f47605a = i;
        this.f47606b = lo8Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f47605a;
        xfa xfaVar = xfa.f68157a;
        lo8 lo8Var = this.f47606b;
        a31 a31Var = (a31) obj;
        switch (i) {
            case 0:
                a31Var.getClass();
                a31Var.m56a("type", sk9.f60960b);
                a31Var.m56a("value", pb1.m19041k("kotlinx.serialization.Sealed<" + lo8Var.f49940a.m25414c() + '>', cy8.f34711y, new SerialDescriptor[0], new ko8(lo8Var, 1)));
                List list = lo8Var.f49941b;
                list.getClass();
                a31Var.f164b = list;
                break;
            default:
                a31Var.getClass();
                for (Map.Entry entry : lo8Var.f49944e.entrySet()) {
                    a31Var.m56a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return xfaVar;
    }
}
