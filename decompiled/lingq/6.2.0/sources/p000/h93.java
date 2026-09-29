package p000;

import androidx.room.AbstractC0746d;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1;
import androidx.room.util.AbstractC0758a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class h93 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e83 f42034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f42035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f42036c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f42037d;

    public h93(e83 e83Var, AbstractC0746d abstractC0746d, boolean z, vi3 vi3Var) {
        this.f42034a = e83Var;
        this.f42035b = abstractC0746d;
        this.f42036c = z;
        this.f42037d = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L22;
     */
    @Override // p000.e83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowUtil$createFlow$$inlined$map$1$2$1 flowUtil$createFlow$$inlined$map$1$2$1;
        e83 e83Var;
        if (continuation instanceof FlowUtil$createFlow$$inlined$map$1$2$1) {
            flowUtil$createFlow$$inlined$map$1$2$1 = (FlowUtil$createFlow$$inlined$map$1$2$1) continuation;
            int i = flowUtil$createFlow$$inlined$map$1$2$1.f6861b;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowUtil$createFlow$$inlined$map$1$2$1.f6861b = i - Integer.MIN_VALUE;
            } else {
                flowUtil$createFlow$$inlined$map$1$2$1 = new FlowUtil$createFlow$$inlined$map$1$2$1(this, continuation);
            }
        } else {
            flowUtil$createFlow$$inlined$map$1$2$1 = new FlowUtil$createFlow$$inlined$map$1$2$1(this, continuation);
        }
        Object objM2861d = flowUtil$createFlow$$inlined$map$1$2$1.f6860a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowUtil$createFlow$$inlined$map$1$2$1.f6861b;
        if (i2 != 0) {
            if (i2 == 1) {
                e83Var = flowUtil$createFlow$$inlined$map$1$2$1.f6862c;
                AbstractC3193b.m15359b(objM2861d);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM2861d);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2861d);
        e83 e83Var2 = this.f42034a;
        flowUtil$createFlow$$inlined$map$1$2$1.f6862c = e83Var2;
        flowUtil$createFlow$$inlined$map$1$2$1.f6861b = 1;
        objM2861d = AbstractC0758a.m2861d(this.f42037d, this.f42035b, flowUtil$createFlow$$inlined$map$1$2$1, true, this.f42036c);
        if (objM2861d != coroutineSingletons) {
            e83Var = e83Var2;
        }
        return coroutineSingletons;
        flowUtil$createFlow$$inlined$map$1$2$1.f6862c = null;
        flowUtil$createFlow$$inlined$map$1$2$1.f6861b = 2;
    }
}
