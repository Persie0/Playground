package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1372e;
import com.lingq.core.datastore.Web2WaveStoreImpl$special$$inlined$map$1$2$1;
import com.lingq.core.datastore.Web2WaveStoreImpl$special$$inlined$map$3$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class t2b implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f61777b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1372e f61778c;

    public /* synthetic */ t2b(e83 e83Var, C1372e c1372e, int i) {
        this.f61776a = i;
        this.f61777b = e83Var;
        this.f61778c = c1372e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Web2WaveStoreImpl$special$$inlined$map$1$2$1 web2WaveStoreImpl$special$$inlined$map$1$2$1;
        Web2WaveStoreImpl$special$$inlined$map$3$2$1 web2WaveStoreImpl$special$$inlined$map$3$2$1;
        int i = this.f61776a;
        xfa xfaVar = xfa.f68157a;
        C1372e c1372e = this.f61778c;
        e83 e83Var = this.f61777b;
        switch (i) {
            case 0:
                if (continuation instanceof Web2WaveStoreImpl$special$$inlined$map$1$2$1) {
                    web2WaveStoreImpl$special$$inlined$map$1$2$1 = (Web2WaveStoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i2 = web2WaveStoreImpl$special$$inlined$map$1$2$1.f18311b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        web2WaveStoreImpl$special$$inlined$map$1$2$1.f18311b = i2 - Integer.MIN_VALUE;
                    } else {
                        web2WaveStoreImpl$special$$inlined$map$1$2$1 = new Web2WaveStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    web2WaveStoreImpl$special$$inlined$map$1$2$1 = new Web2WaveStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = web2WaveStoreImpl$special$$inlined$map$1$2$1.f18310a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = web2WaveStoreImpl$special$$inlined$map$1$2$1.f18311b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                String str = (String) ((Preferences) obj).get(c1372e.f18591b);
                if (str == null) {
                    str = "";
                }
                web2WaveStoreImpl$special$$inlined$map$1$2$1.f18311b = 1;
                return e83Var.emit(str, web2WaveStoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof Web2WaveStoreImpl$special$$inlined$map$3$2$1) {
                    web2WaveStoreImpl$special$$inlined$map$3$2$1 = (Web2WaveStoreImpl$special$$inlined$map$3$2$1) continuation;
                    int i4 = web2WaveStoreImpl$special$$inlined$map$3$2$1.f18317b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        web2WaveStoreImpl$special$$inlined$map$3$2$1.f18317b = i4 - Integer.MIN_VALUE;
                    } else {
                        web2WaveStoreImpl$special$$inlined$map$3$2$1 = new Web2WaveStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    web2WaveStoreImpl$special$$inlined$map$3$2$1 = new Web2WaveStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj3 = web2WaveStoreImpl$special$$inlined$map$3$2$1.f18316a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = web2WaveStoreImpl$special$$inlined$map$3$2$1.f18317b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                Boolean bool = (Boolean) ((Preferences) obj).get(c1372e.f18593d);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                web2WaveStoreImpl$special$$inlined$map$3$2$1.f18317b = 1;
                return e83Var.emit(boolValueOf, web2WaveStoreImpl$special$$inlined$map$3$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}
