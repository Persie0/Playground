package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$10$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$11$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$8$2$1;
import com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$9$2$1;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class pm7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f56482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1369b f56483c;

    public /* synthetic */ pm7(e83 e83Var, C1369b c1369b, int i) {
        this.f56481a = i;
        this.f56482b = e83Var;
        this.f56483c = c1369b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ProfileStoreImpl$special$$inlined$map$10$2$1 profileStoreImpl$special$$inlined$map$10$2$1;
        ProfileStoreImpl$special$$inlined$map$11$2$1 profileStoreImpl$special$$inlined$map$11$2$1;
        ProfileStoreImpl$special$$inlined$map$8$2$1 profileStoreImpl$special$$inlined$map$8$2$1;
        ProfileStoreImpl$special$$inlined$map$9$2$1 profileStoreImpl$special$$inlined$map$9$2$1;
        int i = this.f56481a;
        xfa xfaVar = xfa.f68157a;
        C1369b c1369b = this.f56483c;
        e83 e83Var = this.f56482b;
        switch (i) {
            case 0:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$10$2$1) {
                    profileStoreImpl$special$$inlined$map$10$2$1 = (ProfileStoreImpl$special$$inlined$map$10$2$1) continuation;
                    int i2 = profileStoreImpl$special$$inlined$map$10$2$1.f17977b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$10$2$1.f17977b = i2 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$10$2$1 = new ProfileStoreImpl$special$$inlined$map$10$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$10$2$1 = new ProfileStoreImpl$special$$inlined$map$10$2$1(this, continuation);
                }
                Object obj2 = profileStoreImpl$special$$inlined$map$10$2$1.f17976a;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = profileStoreImpl$special$$inlined$map$10$2$1.f17977b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                Object obj4 = (String) ((Preferences) obj).get(c1369b.f18478k);
                if (obj4 == null) {
                    obj4 = "";
                }
                profileStoreImpl$special$$inlined$map$10$2$1.f17977b = 1;
                return e83Var.emit(obj4, profileStoreImpl$special$$inlined$map$10$2$1) == obj3 ? obj3 : xfaVar;
            case 1:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$11$2$1) {
                    profileStoreImpl$special$$inlined$map$11$2$1 = (ProfileStoreImpl$special$$inlined$map$11$2$1) continuation;
                    int i4 = profileStoreImpl$special$$inlined$map$11$2$1.f17980b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$11$2$1.f17980b = i4 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$11$2$1 = new ProfileStoreImpl$special$$inlined$map$11$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$11$2$1 = new ProfileStoreImpl$special$$inlined$map$11$2$1(this, continuation);
                }
                Object obj5 = profileStoreImpl$special$$inlined$map$11$2$1.f17979a;
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = profileStoreImpl$special$$inlined$map$11$2$1.f17980b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                Boolean bool = (Boolean) ((Preferences) obj).get(c1369b.f18479l);
                Object objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                profileStoreImpl$special$$inlined$map$11$2$1.f17980b = 1;
                return e83Var.emit(objValueOf, profileStoreImpl$special$$inlined$map$11$2$1) == obj6 ? obj6 : xfaVar;
            case 2:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$8$2$1) {
                    profileStoreImpl$special$$inlined$map$8$2$1 = (ProfileStoreImpl$special$$inlined$map$8$2$1) continuation;
                    int i6 = profileStoreImpl$special$$inlined$map$8$2$1.f17995b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$8$2$1.f17995b = i6 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$8$2$1 = new ProfileStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$8$2$1 = new ProfileStoreImpl$special$$inlined$map$8$2$1(this, continuation);
                }
                Object obj7 = profileStoreImpl$special$$inlined$map$8$2$1.f17994a;
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = profileStoreImpl$special$$inlined$map$8$2$1.f17995b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                Integer num = (Integer) ((Preferences) obj).get(c1369b.f18476i);
                Object num2 = new Integer(num != null ? num.intValue() : 0);
                profileStoreImpl$special$$inlined$map$8$2$1.f17995b = 1;
                return e83Var.emit(num2, profileStoreImpl$special$$inlined$map$8$2$1) == obj8 ? obj8 : xfaVar;
            default:
                if (continuation instanceof ProfileStoreImpl$special$$inlined$map$9$2$1) {
                    profileStoreImpl$special$$inlined$map$9$2$1 = (ProfileStoreImpl$special$$inlined$map$9$2$1) continuation;
                    int i8 = profileStoreImpl$special$$inlined$map$9$2$1.f17998b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        profileStoreImpl$special$$inlined$map$9$2$1.f17998b = i8 - Integer.MIN_VALUE;
                    } else {
                        profileStoreImpl$special$$inlined$map$9$2$1 = new ProfileStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                    }
                } else {
                    profileStoreImpl$special$$inlined$map$9$2$1 = new ProfileStoreImpl$special$$inlined$map$9$2$1(this, continuation);
                }
                Object obj9 = profileStoreImpl$special$$inlined$map$9$2$1.f17997a;
                Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = profileStoreImpl$special$$inlined$map$9$2$1.f17998b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj9);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj9);
                Integer num3 = (Integer) ((Preferences) obj).get(c1369b.f18477j);
                Object num4 = new Integer(num3 != null ? num3.intValue() : 0);
                profileStoreImpl$special$$inlined$map$9$2$1.f17998b = 1;
                return e83Var.emit(num4, profileStoreImpl$special$$inlined$map$9$2$1) == obj10 ? obj10 : xfaVar;
        }
    }
}
