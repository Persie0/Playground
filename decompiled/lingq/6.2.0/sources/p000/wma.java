package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$1$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$11$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$12$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$14$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$2$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$6$2$1;
import com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$8$2$1;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class wma implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f67066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371d f67067c;

    public /* synthetic */ wma(e83 e83Var, C1371d c1371d, int i) {
        this.f67065a = i;
        this.f67066b = e83Var;
        this.f67067c = c1371d;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:122:0x0207  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        UtilStoreImpl$special$$inlined$map$1$2$1 utilStoreImpl$special$$inlined$map$1$2$1;
        UtilStoreImpl$special$$inlined$map$11$2$1 utilStoreImpl$special$$inlined$map$11$2$1;
        String str;
        UtilStoreImpl$special$$inlined$map$12$2$1 utilStoreImpl$special$$inlined$map$12$2$1;
        UtilStoreImpl$special$$inlined$map$14$2$1 utilStoreImpl$special$$inlined$map$14$2$1;
        UtilStoreImpl$special$$inlined$map$2$2$1 utilStoreImpl$special$$inlined$map$2$2$1;
        UtilStoreImpl$special$$inlined$map$6$2$1 utilStoreImpl$special$$inlined$map$6$2$1;
        UtilStoreImpl$special$$inlined$map$8$2$1 utilStoreImpl$special$$inlined$map$8$2$1;
        int i = this.f67065a;
        xfa xfaVar = xfa.f68157a;
        C1371d c1371d = this.f67067c;
        e83 e83Var = this.f67066b;
        switch (i) {
            case 0:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$1$2$1) {
                    utilStoreImpl$special$$inlined$map$1$2$1 = (UtilStoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i2 = utilStoreImpl$special$$inlined$map$1$2$1.f18256b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$1$2$1.f18256b = i2 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$1$2$1 = new UtilStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$1$2$1 = new UtilStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = utilStoreImpl$special$$inlined$map$1$2$1.f18255a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = utilStoreImpl$special$$inlined$map$1$2$1.f18256b;
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
                String str2 = (String) ((Preferences) obj).get(c1371d.f18567d);
                Object objM10321a = df4Var.m10321a(str2 != null ? str2 : "{}", new je5(sk9.f60959a, VocabularySearchQuery.Companion.serializer()));
                utilStoreImpl$special$$inlined$map$1$2$1.f18256b = 1;
                return e83Var.emit(objM10321a, utilStoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$11$2$1) {
                    utilStoreImpl$special$$inlined$map$11$2$1 = (UtilStoreImpl$special$$inlined$map$11$2$1) continuation;
                    int i4 = utilStoreImpl$special$$inlined$map$11$2$1.f18262b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$11$2$1.f18262b = i4 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$11$2$1 = new UtilStoreImpl$special$$inlined$map$11$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$11$2$1 = new UtilStoreImpl$special$$inlined$map$11$2$1(this, continuation);
                }
                Object obj3 = utilStoreImpl$special$$inlined$map$11$2$1.f18261a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = utilStoreImpl$special$$inlined$map$11$2$1.f18262b;
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
                String str3 = (String) ((Preferences) obj).get(c1371d.f18575l);
                str = str3 != null ? str3 : "{}";
                sk9 sk9Var = sk9.f60959a;
                Object objM10321a2 = df4Var2.m10321a(str, new je5(sk9Var, sk9Var));
                utilStoreImpl$special$$inlined$map$11$2$1.f18262b = 1;
                return e83Var.emit(objM10321a2, utilStoreImpl$special$$inlined$map$11$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$12$2$1) {
                    utilStoreImpl$special$$inlined$map$12$2$1 = (UtilStoreImpl$special$$inlined$map$12$2$1) continuation;
                    int i6 = utilStoreImpl$special$$inlined$map$12$2$1.f18265b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$12$2$1.f18265b = i6 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$12$2$1 = new UtilStoreImpl$special$$inlined$map$12$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$12$2$1 = new UtilStoreImpl$special$$inlined$map$12$2$1(this, continuation);
                }
                Object obj4 = utilStoreImpl$special$$inlined$map$12$2$1.f18264a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = utilStoreImpl$special$$inlined$map$12$2$1.f18265b;
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
                String str4 = (String) ((Preferences) obj).get(c1371d.f18576m);
                Object objM10321a3 = df4Var3.m10321a(str4 != null ? str4 : "{}", new je5(sk9.f60959a, l84.f49294a));
                utilStoreImpl$special$$inlined$map$12$2$1.f18265b = 1;
                return e83Var.emit(objM10321a3, utilStoreImpl$special$$inlined$map$12$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            case 3:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$14$2$1) {
                    utilStoreImpl$special$$inlined$map$14$2$1 = (UtilStoreImpl$special$$inlined$map$14$2$1) continuation;
                    int i8 = utilStoreImpl$special$$inlined$map$14$2$1.f18271b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$14$2$1.f18271b = i8 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$14$2$1 = new UtilStoreImpl$special$$inlined$map$14$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$14$2$1 = new UtilStoreImpl$special$$inlined$map$14$2$1(this, continuation);
                }
                Object obj5 = utilStoreImpl$special$$inlined$map$14$2$1.f18270a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = utilStoreImpl$special$$inlined$map$14$2$1.f18271b;
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
                String str5 = (String) ((Preferences) obj).get(c1371d.f18578o);
                Object objM10321a4 = df4Var4.m10321a(str5 != null ? str5 : "{}", new je5(sk9.f60959a, lf0.f49579a));
                utilStoreImpl$special$$inlined$map$14$2$1.f18271b = 1;
                return e83Var.emit(objM10321a4, utilStoreImpl$special$$inlined$map$14$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$2$2$1) {
                    utilStoreImpl$special$$inlined$map$2$2$1 = (UtilStoreImpl$special$$inlined$map$2$2$1) continuation;
                    int i10 = utilStoreImpl$special$$inlined$map$2$2$1.f18277b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$2$2$1.f18277b = i10 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$2$2$1 = new UtilStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$2$2$1 = new UtilStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj6 = utilStoreImpl$special$$inlined$map$2$2$1.f18276a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = utilStoreImpl$special$$inlined$map$2$2$1.f18277b;
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
                String str6 = (String) ((Preferences) obj).get(c1371d.f18568e);
                str = str6 != null ? str6 : "{}";
                l84 l84Var = l84.f49294a;
                Object objM10321a5 = df4Var5.m10321a(str, new je5(l84Var, l84Var));
                utilStoreImpl$special$$inlined$map$2$2$1.f18277b = 1;
                return e83Var.emit(objM10321a5, utilStoreImpl$special$$inlined$map$2$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
            case 5:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$6$2$1) {
                    utilStoreImpl$special$$inlined$map$6$2$1 = (UtilStoreImpl$special$$inlined$map$6$2$1) continuation;
                    int i12 = utilStoreImpl$special$$inlined$map$6$2$1.f18289b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$6$2$1.f18289b = i12 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$6$2$1 = new UtilStoreImpl$special$$inlined$map$6$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$6$2$1 = new UtilStoreImpl$special$$inlined$map$6$2$1(this, continuation);
                }
                Object obj7 = utilStoreImpl$special$$inlined$map$6$2$1.f18288a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = utilStoreImpl$special$$inlined$map$6$2$1.f18289b;
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
                String str7 = (String) ((Preferences) obj).get(c1371d.f18566c);
                Object objM10321a6 = df4Var6.m10321a(str7 != null ? str7 : "{}", new je5(sk9.f60959a, LibrarySearchQuery.Companion.serializer()));
                utilStoreImpl$special$$inlined$map$6$2$1.f18289b = 1;
                return e83Var.emit(objM10321a6, utilStoreImpl$special$$inlined$map$6$2$1) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
            default:
                if (continuation instanceof UtilStoreImpl$special$$inlined$map$8$2$1) {
                    utilStoreImpl$special$$inlined$map$8$2$1 = (UtilStoreImpl$special$$inlined$map$8$2$1) continuation;
                    int i14 = utilStoreImpl$special$$inlined$map$8$2$1.f18292b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        utilStoreImpl$special$$inlined$map$8$2$1.f18292b = i14 - Integer.MIN_VALUE;
                    } else {
                        utilStoreImpl$special$$inlined$map$8$2$1 = new UtilStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                    }
                } else {
                    utilStoreImpl$special$$inlined$map$8$2$1 = new UtilStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                }
                Object obj8 = utilStoreImpl$special$$inlined$map$8$2$1.f18291a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = utilStoreImpl$special$$inlined$map$8$2$1.f18292b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC3193b.m15359b(obj8);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj8);
                String str8 = (String) ((Preferences) obj).get(c1371d.f18572i);
                if (str8 == null) {
                    str8 = "";
                }
                utilStoreImpl$special$$inlined$map$8$2$1.f18292b = 1;
                return e83Var.emit(str8, utilStoreImpl$special$$inlined$map$8$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
        }
    }
}
