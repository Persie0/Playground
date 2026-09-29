package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$10$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$13$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$15$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$3$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$4$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$5$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$9$2$1;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.onboarding.RatingController;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class xma implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f68358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371d f68359c;

    public /* synthetic */ xma(e83 e83Var, C1371d c1371d, int i) {
        this.f68357a = i;
        this.f68358b = e83Var;
        this.f68359c = c1371d;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x0215  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        UtilStoreImpl$special$$inlined$map$10$2$1 utilStoreImpl$special$$inlined$map$10$2$1;
        UtilStoreImpl$special$$inlined$map$13$2$1 utilStoreImpl$special$$inlined$map$13$2$1;
        UtilStoreImpl$special$$inlined$map$15$2$1 utilStoreImpl$special$$inlined$map$15$2$1;
        UtilStoreImpl$special$$inlined$map$3$2$1 utilStoreImpl$special$$inlined$map$3$2$1;
        String str;
        UtilStoreImpl$special$$inlined$map$4$2$1 utilStoreImpl$special$$inlined$map$4$2$1;
        UtilStoreImpl$special$$inlined$map$5$2$1 utilStoreImpl$special$$inlined$map$5$2$1;
        UtilStoreImpl$special$$inlined$map$9$2$1 utilStoreImpl$special$$inlined$map$9$2$1;
        int i = this.f68357a;
        xfa xfaVar = xfa.f68157a;
        C1371d c1371d = this.f68359c;
        e83 e83Var = this.f68358b;
        switch (i) {
            case 0:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$10$2$1) {
                    utilStoreImpl$special$$inlined$map$10$2$1 = (UtilStoreImpl$special$$inlined$map$10$2$1) continuation;
                    int i2 = utilStoreImpl$special$$inlined$map$10$2$1.f18259b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$10$2$1.f18259b = i2 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$10$2$1 = new UtilStoreImpl$special$$inlined$map$10$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$10$2$1 = new UtilStoreImpl$special$$inlined$map$10$2$1(this, continuation);
                }
                Object obj2 = utilStoreImpl$special$$inlined$map$10$2$1.f18258a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = utilStoreImpl$special$$inlined$map$10$2$1.f18259b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                df4 df4Var = c1371d.f18564a;
                String str2 = (String) ((Preferences) obj).get(c1371d.f18574k);
                Object objM10321a = df4Var.m10321a(str2 != null ? str2 : "{}", new je5(sk9.f60959a, DailyGoalMet.Companion.serializer()));
                utilStoreImpl$special$$inlined$map$10$2$1.f18259b = 1;
                return e83Var.emit(objM10321a, utilStoreImpl$special$$inlined$map$10$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$13$2$1) {
                    utilStoreImpl$special$$inlined$map$13$2$1 = (UtilStoreImpl$special$$inlined$map$13$2$1) continuation;
                    int i4 = utilStoreImpl$special$$inlined$map$13$2$1.f18268b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$13$2$1.f18268b = i4 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$13$2$1 = new UtilStoreImpl$special$$inlined$map$13$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$13$2$1 = new UtilStoreImpl$special$$inlined$map$13$2$1(this, continuation);
                }
                Object obj3 = utilStoreImpl$special$$inlined$map$13$2$1.f18267a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = utilStoreImpl$special$$inlined$map$13$2$1.f18268b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                df4 df4Var2 = c1371d.f18564a;
                String str3 = (String) ((Preferences) obj).get(c1371d.f18577n);
                Object objM10321a2 = df4Var2.m10321a(str3 != null ? str3 : "{}", new je5(sk9.f60959a, l84.f49294a));
                utilStoreImpl$special$$inlined$map$13$2$1.f18268b = 1;
                return e83Var.emit(objM10321a2, utilStoreImpl$special$$inlined$map$13$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$15$2$1) {
                    utilStoreImpl$special$$inlined$map$15$2$1 = (UtilStoreImpl$special$$inlined$map$15$2$1) continuation;
                    int i6 = utilStoreImpl$special$$inlined$map$15$2$1.f18274b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$15$2$1.f18274b = i6 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$15$2$1 = new UtilStoreImpl$special$$inlined$map$15$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$15$2$1 = new UtilStoreImpl$special$$inlined$map$15$2$1(this, continuation);
                }
                Object obj4 = utilStoreImpl$special$$inlined$map$15$2$1.f18273a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = utilStoreImpl$special$$inlined$map$15$2$1.f18274b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                df4 df4Var3 = c1371d.f18564a;
                String str4 = (String) ((Preferences) obj).get(c1371d.f18579p);
                Object objM10321a3 = df4Var3.m10321a(str4 != null ? str4 : "{}", RatingController.Companion.serializer());
                utilStoreImpl$special$$inlined$map$15$2$1.f18274b = 1;
                return e83Var.emit(objM10321a3, utilStoreImpl$special$$inlined$map$15$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            case 3:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$3$2$1) {
                    utilStoreImpl$special$$inlined$map$3$2$1 = (UtilStoreImpl$special$$inlined$map$3$2$1) continuation;
                    int i8 = utilStoreImpl$special$$inlined$map$3$2$1.f18280b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$3$2$1.f18280b = i8 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$3$2$1 = new UtilStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$3$2$1 = new UtilStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj5 = utilStoreImpl$special$$inlined$map$3$2$1.f18279a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = utilStoreImpl$special$$inlined$map$3$2$1.f18280b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                df4 df4Var4 = c1371d.f18564a;
                String str5 = (String) ((Preferences) obj).get(c1371d.f18569f);
                str = str5 != null ? str5 : "{}";
                sk9 sk9Var = sk9.f60959a;
                Object objM10321a4 = df4Var4.m10321a(str, new je5(sk9Var, sk9Var));
                utilStoreImpl$special$$inlined$map$3$2$1.f18280b = 1;
                return e83Var.emit(objM10321a4, utilStoreImpl$special$$inlined$map$3$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$4$2$1) {
                    utilStoreImpl$special$$inlined$map$4$2$1 = (UtilStoreImpl$special$$inlined$map$4$2$1) continuation;
                    int i10 = utilStoreImpl$special$$inlined$map$4$2$1.f18283b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$4$2$1.f18283b = i10 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$4$2$1 = new UtilStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$4$2$1 = new UtilStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj6 = utilStoreImpl$special$$inlined$map$4$2$1.f18282a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = utilStoreImpl$special$$inlined$map$4$2$1.f18283b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                df4 df4Var5 = c1371d.f18564a;
                String str6 = (String) ((Preferences) obj).get(c1371d.f18570g);
                Object objM10321a5 = df4Var5.m10321a(str6 != null ? str6 : "{}", new je5(l84.f49294a, LessonBookmark.Companion.serializer()));
                utilStoreImpl$special$$inlined$map$4$2$1.f18283b = 1;
                return e83Var.emit(objM10321a5, utilStoreImpl$special$$inlined$map$4$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
            case 5:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$5$2$1) {
                    utilStoreImpl$special$$inlined$map$5$2$1 = (UtilStoreImpl$special$$inlined$map$5$2$1) continuation;
                    int i12 = utilStoreImpl$special$$inlined$map$5$2$1.f18286b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$5$2$1.f18286b = i12 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$5$2$1 = new UtilStoreImpl$special$$inlined$map$5$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$5$2$1 = new UtilStoreImpl$special$$inlined$map$5$2$1(this, continuation);
                }
                Object obj7 = utilStoreImpl$special$$inlined$map$5$2$1.f18285a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = utilStoreImpl$special$$inlined$map$5$2$1.f18286b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                df4 df4Var6 = c1371d.f18564a;
                String str7 = (String) ((Preferences) obj).get(c1371d.f18571h);
                Object objM10321a6 = df4Var6.m10321a(str7 != null ? str7 : "{}", new je5(l84.f49294a, sk9.f60959a));
                utilStoreImpl$special$$inlined$map$5$2$1.f18286b = 1;
                return e83Var.emit(objM10321a6, utilStoreImpl$special$$inlined$map$5$2$1) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
            default:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$9$2$1) {
                    utilStoreImpl$special$$inlined$map$9$2$1 = (UtilStoreImpl$special$$inlined$map$9$2$1) continuation;
                    int i14 = utilStoreImpl$special$$inlined$map$9$2$1.f18295b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$9$2$1.f18295b = i14 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$9$2$1 = new UtilStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$9$2$1 = new UtilStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                }
                Object obj8 = utilStoreImpl$special$$inlined$map$9$2$1.f18294a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = utilStoreImpl$special$$inlined$map$9$2$1.f18295b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC3193b.m15359b(obj8);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj8);
                df4 df4Var7 = c1371d.f18564a;
                String str8 = (String) ((Preferences) obj).get(c1371d.f18573j);
                str = str8 != null ? str8 : "{}";
                sk9 sk9Var2 = sk9.f60959a;
                Object objM10321a7 = df4Var7.m10321a(str, new je5(sk9Var2, sk9Var2));
                utilStoreImpl$special$$inlined$map$9$2$1.f18295b = 1;
                return e83Var.emit(objM10321a7, utilStoreImpl$special$$inlined$map$9$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
        }
    }
}
