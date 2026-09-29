package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$1$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$2$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$3$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$4$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$6$2$1;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class om7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f54588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1369b f54589c;

    public /* synthetic */ om7(e83 e83Var, C1369b c1369b, int i) {
        this.f54587a = i;
        this.f54588b = e83Var;
        this.f54589c = c1369b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ProfileStoreImpl$special$$inlined$map$1$2$1 profileStoreImpl$special$$inlined$map$1$2$1;
        ProfileStoreImpl$special$$inlined$map$2$2$1 profileStoreImpl$special$$inlined$map$2$2$1;
        ProfileStoreImpl$special$$inlined$map$3$2$1 profileStoreImpl$special$$inlined$map$3$2$1;
        ProfileStoreImpl$special$$inlined$map$4$2$1 profileStoreImpl$special$$inlined$map$4$2$1;
        ProfileStoreImpl$special$$inlined$map$6$2$1 profileStoreImpl$special$$inlined$map$6$2$1;
        int i = this.f54587a;
        xfa xfaVar = xfa.f68157a;
        C1369b c1369b = this.f54589c;
        e83 e83Var = this.f54588b;
        switch (i) {
            case 0:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$1$2$1) {
                    profileStoreImpl$special$$inlined$map$1$2$1 = (ProfileStoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i2 = profileStoreImpl$special$$inlined$map$1$2$1.f17974b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$1$2$1.f17974b = i2 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$1$2$1 = new ProfileStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$1$2$1 = new ProfileStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = profileStoreImpl$special$$inlined$map$1$2$1.f17973a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = profileStoreImpl$special$$inlined$map$1$2$1.f17974b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                df4 df4Var = c1369b.f18468a;
                String str = (String) ((Preferences) obj).get(c1369b.f18470c);
                Object objM10321a = df4Var.m10321a(str != null ? str : "{}", Profile.Companion.serializer());
                profileStoreImpl$special$$inlined$map$1$2$1.f17974b = 1;
                return e83Var.emit(objM10321a, profileStoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$2$2$1) {
                    profileStoreImpl$special$$inlined$map$2$2$1 = (ProfileStoreImpl$special$$inlined$map$2$2$1) continuation;
                    int i4 = profileStoreImpl$special$$inlined$map$2$2$1.f17983b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$2$2$1.f17983b = i4 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$2$2$1 = new ProfileStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$2$2$1 = new ProfileStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj3 = profileStoreImpl$special$$inlined$map$2$2$1.f17982a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = profileStoreImpl$special$$inlined$map$2$2$1.f17983b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                df4 df4Var2 = c1369b.f18468a;
                String str2 = (String) ((Preferences) obj).get(c1369b.f18471d);
                Object objM10321a2 = df4Var2.m10321a(str2 != null ? str2 : "{}", ProfileAccount.Companion.serializer());
                profileStoreImpl$special$$inlined$map$2$2$1.f17983b = 1;
                return e83Var.emit(objM10321a2, profileStoreImpl$special$$inlined$map$2$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$3$2$1) {
                    profileStoreImpl$special$$inlined$map$3$2$1 = (ProfileStoreImpl$special$$inlined$map$3$2$1) continuation;
                    int i6 = profileStoreImpl$special$$inlined$map$3$2$1.f17986b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$3$2$1.f17986b = i6 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$3$2$1 = new ProfileStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$3$2$1 = new ProfileStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj4 = profileStoreImpl$special$$inlined$map$3$2$1.f17985a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = profileStoreImpl$special$$inlined$map$3$2$1.f17986b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                df4 df4Var3 = c1369b.f18468a;
                String str3 = (String) ((Preferences) obj).get(c1369b.f18473f);
                Object objM10321a3 = df4Var3.m10321a(str3 != null ? str3 : "{}", Login.Companion.serializer());
                profileStoreImpl$special$$inlined$map$3$2$1.f17986b = 1;
                return e83Var.emit(objM10321a3, profileStoreImpl$special$$inlined$map$3$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            case 3:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$4$2$1) {
                    profileStoreImpl$special$$inlined$map$4$2$1 = (ProfileStoreImpl$special$$inlined$map$4$2$1) continuation;
                    int i8 = profileStoreImpl$special$$inlined$map$4$2$1.f17989b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$4$2$1.f17989b = i8 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$4$2$1 = new ProfileStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$4$2$1 = new ProfileStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj5 = profileStoreImpl$special$$inlined$map$4$2$1.f17988a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = profileStoreImpl$special$$inlined$map$4$2$1.f17989b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                df4 df4Var4 = c1369b.f18468a;
                String str4 = (String) ((Preferences) obj).get(c1369b.f18474g);
                Object objM10321a4 = df4Var4.m10321a(str4 != null ? str4 : "{}", SubscriptionDetails.Companion.serializer());
                profileStoreImpl$special$$inlined$map$4$2$1.f17989b = 1;
                return e83Var.emit(objM10321a4, profileStoreImpl$special$$inlined$map$4$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            default:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$6$2$1) {
                    profileStoreImpl$special$$inlined$map$6$2$1 = (ProfileStoreImpl$special$$inlined$map$6$2$1) continuation;
                    int i10 = profileStoreImpl$special$$inlined$map$6$2$1.f17992b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$6$2$1.f17992b = i10 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$6$2$1 = new ProfileStoreImpl$special$$inlined$map$6$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$6$2$1 = new ProfileStoreImpl$special$$inlined$map$6$2$1(this, continuation);
                }
                Object obj6 = profileStoreImpl$special$$inlined$map$6$2$1.f17991a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = profileStoreImpl$special$$inlined$map$6$2$1.f17992b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                String str5 = (String) ((Preferences) obj).get(c1369b.f18472e);
                if (str5 == null) {
                    str5 = "";
                }
                profileStoreImpl$special$$inlined$map$6$2$1.f17992b = 1;
                return e83Var.emit(str5, profileStoreImpl$special$$inlined$map$6$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
        }
    }
}
