package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$8$2$1;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$9$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class ng8 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f52708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1370c f52709c;

    public /* synthetic */ ng8(e83 e83Var, C1370c c1370c, int i) {
        this.f52707a = i;
        this.f52708b = e83Var;
        this.f52709c = c1370c;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ReviewStoreImpl$special$$inlined$map$9$2$1 reviewStoreImpl$special$$inlined$map$9$2$1;
        ReviewStoreImpl$special$$inlined$map$8$2$1 reviewStoreImpl$special$$inlined$map$8$2$1;
        int i = this.f52707a;
        xfa xfaVar = xfa.f68157a;
        C1370c c1370c = this.f52709c;
        e83 e83Var = this.f52708b;
        switch (i) {
            case 0:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$9$2$1) {
                    reviewStoreImpl$special$$inlined$map$9$2$1 = (ReviewStoreImpl$special$$inlined$map$9$2$1) continuation;
                    int i2 = reviewStoreImpl$special$$inlined$map$9$2$1.f18208b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$9$2$1.f18208b = i2 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$9$2$1 = new ReviewStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$9$2$1 = new ReviewStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                }
                Object obj2 = reviewStoreImpl$special$$inlined$map$9$2$1.f18207a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = reviewStoreImpl$special$$inlined$map$9$2$1.f18208b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                Boolean bool = (Boolean) ((Preferences) obj).get(c1370c.f18535k);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                reviewStoreImpl$special$$inlined$map$9$2$1.f18208b = 1;
                return e83Var.emit(boolValueOf, reviewStoreImpl$special$$inlined$map$9$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$8$2$1) {
                    reviewStoreImpl$special$$inlined$map$8$2$1 = (ReviewStoreImpl$special$$inlined$map$8$2$1) continuation;
                    int i4 = reviewStoreImpl$special$$inlined$map$8$2$1.f18205b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$8$2$1.f18205b = i4 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$8$2$1 = new ReviewStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$8$2$1 = new ReviewStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                }
                Object obj3 = reviewStoreImpl$special$$inlined$map$8$2$1.f18204a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = reviewStoreImpl$special$$inlined$map$8$2$1.f18205b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                Boolean bool2 = (Boolean) ((Preferences) obj).get(c1370c.f18533j);
                Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
                reviewStoreImpl$special$$inlined$map$8$2$1.f18205b = 1;
                return e83Var.emit(boolValueOf2, reviewStoreImpl$special$$inlined$map$8$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}
