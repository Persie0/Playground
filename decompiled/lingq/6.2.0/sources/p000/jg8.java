package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$1$2$1;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$14$2$1;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$34$2$1;
import com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$35$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class jg8 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f45522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1370c f45523c;

    public /* synthetic */ jg8(e83 e83Var, C1370c c1370c, int i) {
        this.f45521a = i;
        this.f45522b = e83Var;
        this.f45523c = c1370c;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ReviewStoreImpl$special$$inlined$map$1$2$1 reviewStoreImpl$special$$inlined$map$1$2$1;
        ReviewStoreImpl$special$$inlined$map$14$2$1 reviewStoreImpl$special$$inlined$map$14$2$1;
        ReviewStoreImpl$special$$inlined$map$34$2$1 reviewStoreImpl$special$$inlined$map$34$2$1;
        ReviewStoreImpl$special$$inlined$map$35$2$1 reviewStoreImpl$special$$inlined$map$35$2$1;
        int i = this.f45521a;
        xfa xfaVar = xfa.f68157a;
        C1370c c1370c = this.f45523c;
        e83 e83Var = this.f45522b;
        switch (i) {
            case 0:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$1$2$1) {
                    reviewStoreImpl$special$$inlined$map$1$2$1 = (ReviewStoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i2 = reviewStoreImpl$special$$inlined$map$1$2$1.f18106b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$1$2$1.f18106b = i2 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$1$2$1 = new ReviewStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$1$2$1 = new ReviewStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = reviewStoreImpl$special$$inlined$map$1$2$1.f18105a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = reviewStoreImpl$special$$inlined$map$1$2$1.f18106b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                df4 df4Var = c1370c.f18515a;
                String str = (String) ((Preferences) obj).get(c1370c.f18519c);
                Object objM10321a = df4Var.m10321a(str != null ? str : "{}", new je5(sk9.f60959a, lf0.f49579a));
                reviewStoreImpl$special$$inlined$map$1$2$1.f18106b = 1;
                return e83Var.emit(objM10321a, reviewStoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$14$2$1) {
                    reviewStoreImpl$special$$inlined$map$14$2$1 = (ReviewStoreImpl$special$$inlined$map$14$2$1) continuation;
                    int i4 = reviewStoreImpl$special$$inlined$map$14$2$1.f18121b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$14$2$1.f18121b = i4 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$14$2$1 = new ReviewStoreImpl$special$$inlined$map$14$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$14$2$1 = new ReviewStoreImpl$special$$inlined$map$14$2$1(this, continuation);
                }
                Object obj3 = reviewStoreImpl$special$$inlined$map$14$2$1.f18120a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = reviewStoreImpl$special$$inlined$map$14$2$1.f18121b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                df4 df4Var2 = c1370c.f18515a;
                String str2 = (String) ((Preferences) obj).get(c1370c.f18494F);
                String str3 = str2 != null ? str2 : "{}";
                sk9 sk9Var = sk9.f60959a;
                Object objM10321a2 = df4Var2.m10321a(str3, new je5(sk9Var, sk9Var));
                reviewStoreImpl$special$$inlined$map$14$2$1.f18121b = 1;
                return e83Var.emit(objM10321a2, reviewStoreImpl$special$$inlined$map$14$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$34$2$1) {
                    reviewStoreImpl$special$$inlined$map$34$2$1 = (ReviewStoreImpl$special$$inlined$map$34$2$1) continuation;
                    int i6 = reviewStoreImpl$special$$inlined$map$34$2$1.f18187b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$34$2$1.f18187b = i6 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$34$2$1 = new ReviewStoreImpl$special$$inlined$map$34$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$34$2$1 = new ReviewStoreImpl$special$$inlined$map$34$2$1(this, continuation);
                }
                Object obj4 = reviewStoreImpl$special$$inlined$map$34$2$1.f18186a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = reviewStoreImpl$special$$inlined$map$34$2$1.f18187b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                df4 df4Var3 = c1370c.f18515a;
                String str4 = (String) ((Preferences) obj).get(c1370c.f18498J);
                Object objM10321a3 = df4Var3.m10321a(str4 != null ? str4 : "{}", new je5(sk9.f60959a, lf0.f49579a));
                reviewStoreImpl$special$$inlined$map$34$2$1.f18187b = 1;
                return e83Var.emit(objM10321a3, reviewStoreImpl$special$$inlined$map$34$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            default:
                if (continuation instanceof ReviewStoreImpl$special$$inlined$map$35$2$1) {
                    reviewStoreImpl$special$$inlined$map$35$2$1 = (ReviewStoreImpl$special$$inlined$map$35$2$1) continuation;
                    int i8 = reviewStoreImpl$special$$inlined$map$35$2$1.f18190b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        reviewStoreImpl$special$$inlined$map$35$2$1.f18190b = i8 - Integer.MIN_VALUE;
                    } else {
                        reviewStoreImpl$special$$inlined$map$35$2$1 = new ReviewStoreImpl$special$$inlined$map$35$2$1(this, continuation);
                    }
                } else {
                    reviewStoreImpl$special$$inlined$map$35$2$1 = new ReviewStoreImpl$special$$inlined$map$35$2$1(this, continuation);
                }
                Object obj5 = reviewStoreImpl$special$$inlined$map$35$2$1.f18189a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = reviewStoreImpl$special$$inlined$map$35$2$1.f18190b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                df4 df4Var4 = c1370c.f18515a;
                String str5 = (String) ((Preferences) obj).get(c1370c.f18499K);
                Object objM10321a4 = df4Var4.m10321a(str5 != null ? str5 : "{}", new je5(sk9.f60959a, lf0.f49579a));
                reviewStoreImpl$special$$inlined$map$35$2$1.f18190b = 1;
                return e83Var.emit(objM10321a4, reviewStoreImpl$special$$inlined$map$35$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
        }
    }
}
