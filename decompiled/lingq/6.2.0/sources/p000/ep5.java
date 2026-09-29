package p000;

import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.p020ui.C2889e;
import com.lingq.p020ui.MainViewModel$special$$inlined$filter$1$2$1;
import com.lingq.p020ui.MainViewModel$special$$inlined$filter$2$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class ep5 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f37686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2889e f37687c;

    public /* synthetic */ ep5(e83 e83Var, C2889e c2889e, int i) {
        this.f37685a = i;
        this.f37686b = e83Var;
        this.f37687c = c2889e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        MainViewModel$special$$inlined$filter$1$2$1 mainViewModel$special$$inlined$filter$1$2$1;
        MainViewModel$special$$inlined$filter$2$2$1 mainViewModel$special$$inlined$filter$2$2$1;
        int i = this.f37685a;
        xfa xfaVar = xfa.f68157a;
        C2889e c2889e = this.f37687c;
        e83 e83Var = this.f37686b;
        switch (i) {
            case 0:
                if (continuation instanceof MainViewModel$special$$inlined$filter$1$2$1) {
                    mainViewModel$special$$inlined$filter$1$2$1 = (MainViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i2 = mainViewModel$special$$inlined$filter$1$2$1.f34143b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mainViewModel$special$$inlined$filter$1$2$1.f34143b = i2 - Integer.MIN_VALUE;
                    } else {
                        mainViewModel$special$$inlined$filter$1$2$1 = new MainViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                } else {
                    mainViewModel$special$$inlined$filter$1$2$1 = new MainViewModel$special$$inlined$filter$1$2$1(this, continuation);
                }
                Object obj2 = mainViewModel$special$$inlined$filter$1$2$1.f34142a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = mainViewModel$special$$inlined$filter$1$2$1.f34143b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                if (((LqTheme) obj) == c2889e.f34220v) {
                    return xfaVar;
                }
                mainViewModel$special$$inlined$filter$1$2$1.f34143b = 1;
                return e83Var.emit(obj, mainViewModel$special$$inlined$filter$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof MainViewModel$special$$inlined$filter$2$2$1) {
                    mainViewModel$special$$inlined$filter$2$2$1 = (MainViewModel$special$$inlined$filter$2$2$1) continuation;
                    int i4 = mainViewModel$special$$inlined$filter$2$2$1.f34146b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mainViewModel$special$$inlined$filter$2$2$1.f34146b = i4 - Integer.MIN_VALUE;
                    } else {
                        mainViewModel$special$$inlined$filter$2$2$1 = new MainViewModel$special$$inlined$filter$2$2$1(this, continuation);
                    }
                } else {
                    mainViewModel$special$$inlined$filter$2$2$1 = new MainViewModel$special$$inlined$filter$2$2$1(this, continuation);
                }
                Object obj3 = mainViewModel$special$$inlined$filter$2$2$1.f34145a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = mainViewModel$special$$inlined$filter$2$2$1.f34146b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                if (fa4.m11650l((String) obj, c2889e.f34222x)) {
                    return xfaVar;
                }
                mainViewModel$special$$inlined$filter$2$2$1.f34146b = 1;
                return e83Var.emit(obj, mainViewModel$special$$inlined$filter$2$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}
