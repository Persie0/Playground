package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1372e;
import com.lingq.core.datastore.Web2WaveStoreImpl$special$$inlined$map$2$2$1;
import com.lingq.core.datastore.Web2WaveStoreImpl$special$$inlined$map$4$2$1;
import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class v2b implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f64752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1372e f64753c;

    public /* synthetic */ v2b(e83 e83Var, C1372e c1372e, int i) {
        this.f64751a = i;
        this.f64752b = e83Var;
        this.f64753c = c1372e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Web2WaveStoreImpl$special$$inlined$map$2$2$1 web2WaveStoreImpl$special$$inlined$map$2$2$1;
        Web2WaveStoreImpl$special$$inlined$map$4$2$1 web2WaveStoreImpl$special$$inlined$map$4$2$1;
        Object failure;
        Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus;
        int i = this.f64751a;
        xfa xfaVar = xfa.f68157a;
        C1372e c1372e = this.f64753c;
        e83 e83Var = this.f64752b;
        switch (i) {
            case 0:
                if (continuation instanceof Web2WaveStoreImpl$special$$inlined$map$2$2$1) {
                    web2WaveStoreImpl$special$$inlined$map$2$2$1 = (Web2WaveStoreImpl$special$$inlined$map$2$2$1) continuation;
                    int i2 = web2WaveStoreImpl$special$$inlined$map$2$2$1.f18314b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        web2WaveStoreImpl$special$$inlined$map$2$2$1.f18314b = i2 - Integer.MIN_VALUE;
                    } else {
                        web2WaveStoreImpl$special$$inlined$map$2$2$1 = new Web2WaveStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    web2WaveStoreImpl$special$$inlined$map$2$2$1 = new Web2WaveStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj2 = web2WaveStoreImpl$special$$inlined$map$2$2$1.f18313a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = web2WaveStoreImpl$special$$inlined$map$2$2$1.f18314b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                String str = (String) ((Preferences) obj).get(c1372e.f18592c);
                if (str == null) {
                    str = "";
                }
                web2WaveStoreImpl$special$$inlined$map$2$2$1.f18314b = 1;
                return e83Var.emit(str, web2WaveStoreImpl$special$$inlined$map$2$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof Web2WaveStoreImpl$special$$inlined$map$4$2$1) {
                    web2WaveStoreImpl$special$$inlined$map$4$2$1 = (Web2WaveStoreImpl$special$$inlined$map$4$2$1) continuation;
                    int i4 = web2WaveStoreImpl$special$$inlined$map$4$2$1.f18320b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        web2WaveStoreImpl$special$$inlined$map$4$2$1.f18320b = i4 - Integer.MIN_VALUE;
                    } else {
                        web2WaveStoreImpl$special$$inlined$map$4$2$1 = new Web2WaveStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    web2WaveStoreImpl$special$$inlined$map$4$2$1 = new Web2WaveStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj3 = web2WaveStoreImpl$special$$inlined$map$4$2$1.f18319a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = web2WaveStoreImpl$special$$inlined$map$4$2$1.f18320b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                String str2 = (String) ((Preferences) obj).get(c1372e.f18594e);
                if (str2 != null) {
                    try {
                        failure = Web2WaveDeferredLoginStatus.valueOf(str2);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    web2WaveDeferredLoginStatus = (Web2WaveDeferredLoginStatus) (failure instanceof Result.Failure ? null : failure);
                    if (web2WaveDeferredLoginStatus == null) {
                        web2WaveDeferredLoginStatus = Web2WaveDeferredLoginStatus.NOT_ATTEMPTED;
                    }
                    break;
                } else {
                    web2WaveDeferredLoginStatus = Web2WaveDeferredLoginStatus.NOT_ATTEMPTED;
                }
                web2WaveStoreImpl$special$$inlined$map$4$2$1.f18320b = 1;
                return e83Var.emit(web2WaveDeferredLoginStatus, web2WaveStoreImpl$special$$inlined$map$4$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}
