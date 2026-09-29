package p000;

import androidx.datastore.preferences.core.Preferences;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$1$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$15$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$2$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$20$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$21$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$22$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$23$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$3$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$35$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$37$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$4$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$46$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$51$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$52$2$1;
import com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$69$2$1;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class ti7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f62343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1368a f62344c;

    public /* synthetic */ ti7(e83 e83Var, C1368a c1368a, int i) {
        this.f62342a = i;
        this.f62343b = e83Var;
        this.f62344c = c1368a;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0228  */
    /* JADX WARN: Code duplicated, block: B:148:0x028b  */
    /* JADX WARN: Code duplicated, block: B:171:0x031b  */
    /* JADX WARN: Code duplicated, block: B:189:0x035f  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:249:0x0488  */
    /* JADX WARN: Code duplicated, block: B:268:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:286:0x0518  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:304:0x0562  */
    /* JADX WARN: Code duplicated, block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v41 */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        PreferenceStoreImpl$special$$inlined$map$1$2$1 preferenceStoreImpl$special$$inlined$map$1$2$1;
        PreferenceStoreImpl$special$$inlined$map$15$2$1 preferenceStoreImpl$special$$inlined$map$15$2$1;
        PreferenceStoreImpl$special$$inlined$map$2$2$1 preferenceStoreImpl$special$$inlined$map$2$2$1;
        PreferenceStoreImpl$special$$inlined$map$20$2$1 preferenceStoreImpl$special$$inlined$map$20$2$1;
        PreferenceStoreImpl$special$$inlined$map$21$2$1 preferenceStoreImpl$special$$inlined$map$21$2$1;
        Object failure;
        Map mapM15360M;
        ?? failure2;
        PreferenceStoreImpl$special$$inlined$map$22$2$1 preferenceStoreImpl$special$$inlined$map$22$2$1;
        PreferenceStoreImpl$special$$inlined$map$23$2$1 preferenceStoreImpl$special$$inlined$map$23$2$1;
        PreferenceStoreImpl$special$$inlined$map$3$2$1 preferenceStoreImpl$special$$inlined$map$3$2$1;
        PreferenceStoreImpl$special$$inlined$map$35$2$1 preferenceStoreImpl$special$$inlined$map$35$2$1;
        PreferenceStoreImpl$special$$inlined$map$37$2$1 preferenceStoreImpl$special$$inlined$map$37$2$1;
        PreferenceStoreImpl$special$$inlined$map$4$2$1 preferenceStoreImpl$special$$inlined$map$4$2$1;
        PreferenceStoreImpl$special$$inlined$map$46$2$1 preferenceStoreImpl$special$$inlined$map$46$2$1;
        PreferenceStoreImpl$special$$inlined$map$51$2$1 preferenceStoreImpl$special$$inlined$map$51$2$1;
        PreferenceStoreImpl$special$$inlined$map$52$2$1 preferenceStoreImpl$special$$inlined$map$52$2$1;
        PreferenceStoreImpl$special$$inlined$map$69$2$1 preferenceStoreImpl$special$$inlined$map$69$2$1;
        ServerEnvironment serverEnvironment;
        int i = this.f62342a;
        xfa xfaVar = xfa.f68157a;
        C1368a c1368a = this.f62344c;
        e83 e83Var = this.f62343b;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$1$2$1) {
                    preferenceStoreImpl$special$$inlined$map$1$2$1 = (PreferenceStoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i2 = preferenceStoreImpl$special$$inlined$map$1$2$1.f17729b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$1$2$1.f17729b = i2 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$1$2$1 = new PreferenceStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$1$2$1 = new PreferenceStoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj3 = preferenceStoreImpl$special$$inlined$map$1$2$1.f17728a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = preferenceStoreImpl$special$$inlined$map$1$2$1.f17729b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                String str = (String) ((Preferences) obj).get(c1368a.f18396c);
                if (str == null) {
                    str = "System";
                }
                LqTheme lqThemeValueOf = LqTheme.valueOf(str);
                preferenceStoreImpl$special$$inlined$map$1$2$1.f17729b = 1;
                return e83Var.emit(lqThemeValueOf, preferenceStoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$15$2$1) {
                    preferenceStoreImpl$special$$inlined$map$15$2$1 = (PreferenceStoreImpl$special$$inlined$map$15$2$1) continuation;
                    int i4 = preferenceStoreImpl$special$$inlined$map$15$2$1.f17747b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$15$2$1.f17747b = i4 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$15$2$1 = new PreferenceStoreImpl$special$$inlined$map$15$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$15$2$1 = new PreferenceStoreImpl$special$$inlined$map$15$2$1(this, continuation);
                }
                Object obj4 = preferenceStoreImpl$special$$inlined$map$15$2$1.f17746a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = preferenceStoreImpl$special$$inlined$map$15$2$1.f17747b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                String language = (String) ((Preferences) obj).get(c1368a.f18429n);
                if (language == null) {
                    language = Locale.getDefault().getLanguage();
                }
                preferenceStoreImpl$special$$inlined$map$15$2$1.f17747b = 1;
                return e83Var.emit(language, preferenceStoreImpl$special$$inlined$map$15$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$2$2$1) {
                    preferenceStoreImpl$special$$inlined$map$2$2$1 = (PreferenceStoreImpl$special$$inlined$map$2$2$1) continuation;
                    int i6 = preferenceStoreImpl$special$$inlined$map$2$2$1.f17762b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$2$2$1.f17762b = i6 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$2$2$1 = new PreferenceStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$2$2$1 = new PreferenceStoreImpl$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj5 = preferenceStoreImpl$special$$inlined$map$2$2$1.f17761a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = preferenceStoreImpl$special$$inlined$map$2$2$1.f17762b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                String str2 = (String) ((Preferences) obj).get(c1368a.f18399d);
                if (str2 == null) {
                    str2 = "default";
                }
                preferenceStoreImpl$special$$inlined$map$2$2$1.f17762b = 1;
                return e83Var.emit(str2, preferenceStoreImpl$special$$inlined$map$2$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
            case 3:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$20$2$1) {
                    preferenceStoreImpl$special$$inlined$map$20$2$1 = (PreferenceStoreImpl$special$$inlined$map$20$2$1) continuation;
                    int i8 = preferenceStoreImpl$special$$inlined$map$20$2$1.f17765b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$20$2$1.f17765b = i8 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$20$2$1 = new PreferenceStoreImpl$special$$inlined$map$20$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$20$2$1 = new PreferenceStoreImpl$special$$inlined$map$20$2$1(this, continuation);
                }
                Object obj6 = preferenceStoreImpl$special$$inlined$map$20$2$1.f17764a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = preferenceStoreImpl$special$$inlined$map$20$2$1.f17765b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                Boolean bool = (Boolean) ((Preferences) obj).get(c1368a.f18441r);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                preferenceStoreImpl$special$$inlined$map$20$2$1.f17765b = 1;
                return e83Var.emit(boolValueOf, preferenceStoreImpl$special$$inlined$map$20$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$21$2$1) {
                    preferenceStoreImpl$special$$inlined$map$21$2$1 = (PreferenceStoreImpl$special$$inlined$map$21$2$1) continuation;
                    int i10 = preferenceStoreImpl$special$$inlined$map$21$2$1.f17768b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$21$2$1.f17768b = i10 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$21$2$1 = new PreferenceStoreImpl$special$$inlined$map$21$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$21$2$1 = new PreferenceStoreImpl$special$$inlined$map$21$2$1(this, continuation);
                }
                Object obj7 = preferenceStoreImpl$special$$inlined$map$21$2$1.f17767a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = preferenceStoreImpl$special$$inlined$map$21$2$1.f17768b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                Preferences preferences = (Preferences) obj;
                df4 df4Var = c1368a.f18390a;
                String str3 = (String) preferences.get(c1368a.f18447t);
                if (str3 != null) {
                    try {
                        sk9 sk9Var = sk9.f60959a;
                        failure = (Map) df4Var.m10321a(str3, new je5(sk9Var, sk9Var));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Object objM15360M = AbstractC3194a.m15360M();
                    if (failure instanceof Result.Failure) {
                        failure = objM15360M;
                    }
                    mapM15360M = (Map) failure;
                    break;
                } else {
                    String str4 = (String) preferences.get(c1368a.f18444s);
                    if (str4 == null || vk9.m23391n0(str4)) {
                        mapM15360M = AbstractC3194a.m15360M();
                    } else {
                        try {
                            Map map = (Map) df4Var.m10321a(str4, new je5(sk9.f60959a, TextToSpeechVoice.Companion.serializer()));
                            failure2 = new LinkedHashMap(AbstractC3194a.m15363P(map.size()));
                            for (Object obj8 : map.entrySet()) {
                                failure2.put(((Map.Entry) obj8).getKey(), ((TextToSpeechVoice) ((Map.Entry) obj8).getValue()).m8121a());
                            }
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        Map mapM15360M2 = AbstractC3194a.m15360M();
                        boolean z = failure2 instanceof Result.Failure;
                        ?? r12 = failure2;
                        if (z) {
                            r12 = mapM15360M2;
                        }
                        mapM15360M = (Map) r12;
                    }
                }
                preferenceStoreImpl$special$$inlined$map$21$2$1.f17768b = 1;
                return e83Var.emit(mapM15360M, preferenceStoreImpl$special$$inlined$map$21$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
            case 5:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$22$2$1) {
                    preferenceStoreImpl$special$$inlined$map$22$2$1 = (PreferenceStoreImpl$special$$inlined$map$22$2$1) continuation;
                    int i12 = preferenceStoreImpl$special$$inlined$map$22$2$1.f17771b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$22$2$1.f17771b = i12 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$22$2$1 = new PreferenceStoreImpl$special$$inlined$map$22$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$22$2$1 = new PreferenceStoreImpl$special$$inlined$map$22$2$1(this, continuation);
                }
                Object obj9 = preferenceStoreImpl$special$$inlined$map$22$2$1.f17770a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = preferenceStoreImpl$special$$inlined$map$22$2$1.f17771b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC3193b.m15359b(obj9);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj9);
                Boolean bool2 = (Boolean) ((Preferences) obj).get(c1368a.f18450u);
                Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                preferenceStoreImpl$special$$inlined$map$22$2$1.f17771b = 1;
                return e83Var.emit(boolValueOf2, preferenceStoreImpl$special$$inlined$map$22$2$1) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
            case 6:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$23$2$1) {
                    preferenceStoreImpl$special$$inlined$map$23$2$1 = (PreferenceStoreImpl$special$$inlined$map$23$2$1) continuation;
                    int i14 = preferenceStoreImpl$special$$inlined$map$23$2$1.f17774b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$23$2$1.f17774b = i14 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$23$2$1 = new PreferenceStoreImpl$special$$inlined$map$23$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$23$2$1 = new PreferenceStoreImpl$special$$inlined$map$23$2$1(this, continuation);
                }
                Object obj10 = preferenceStoreImpl$special$$inlined$map$23$2$1.f17773a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = preferenceStoreImpl$special$$inlined$map$23$2$1.f17774b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC3193b.m15359b(obj10);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj10);
                Object obj11 = (Set) ((Preferences) obj).get(c1368a.f18453v);
                if (obj11 == null) {
                    obj11 = EmptySet.f47640a;
                }
                preferenceStoreImpl$special$$inlined$map$23$2$1.f17774b = 1;
                return e83Var.emit(obj11, preferenceStoreImpl$special$$inlined$map$23$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
            case 7:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$3$2$1) {
                    preferenceStoreImpl$special$$inlined$map$3$2$1 = (PreferenceStoreImpl$special$$inlined$map$3$2$1) continuation;
                    int i16 = preferenceStoreImpl$special$$inlined$map$3$2$1.f17795b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$3$2$1.f17795b = i16 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$3$2$1 = new PreferenceStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$3$2$1 = new PreferenceStoreImpl$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj12 = preferenceStoreImpl$special$$inlined$map$3$2$1.f17794a;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = preferenceStoreImpl$special$$inlined$map$3$2$1.f17795b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC3193b.m15359b(obj12);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj12);
                df4 df4Var2 = c1368a.f18390a;
                String str5 = (String) ((Preferences) obj).get(c1368a.f18402e);
                String str6 = str5 != null ? str5 : "{}";
                sk9 sk9Var2 = sk9.f60959a;
                Map map2 = (Map) df4Var2.m10321a(str6, new je5(sk9Var2, sk9Var2));
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    xv7 xv7Var = ReaderFont.Companion;
                    String str7 = (String) entry.getValue();
                    xv7Var.getClass();
                    arrayList.add(new Pair(key, xv7.m24711b(str7)));
                }
                Map mapM15370W = AbstractC3194a.m15370W(arrayList);
                preferenceStoreImpl$special$$inlined$map$3$2$1.f17795b = 1;
                return e83Var.emit(mapM15370W, preferenceStoreImpl$special$$inlined$map$3$2$1) == coroutineSingletons8 ? coroutineSingletons8 : xfaVar;
            case 8:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$35$2$1) {
                    preferenceStoreImpl$special$$inlined$map$35$2$1 = (PreferenceStoreImpl$special$$inlined$map$35$2$1) continuation;
                    int i18 = preferenceStoreImpl$special$$inlined$map$35$2$1.f17813b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$35$2$1.f17813b = i18 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$35$2$1 = new PreferenceStoreImpl$special$$inlined$map$35$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$35$2$1 = new PreferenceStoreImpl$special$$inlined$map$35$2$1(this, continuation);
                }
                Object obj13 = preferenceStoreImpl$special$$inlined$map$35$2$1.f17812a;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = preferenceStoreImpl$special$$inlined$map$35$2$1.f17813b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC3193b.m15359b(obj13);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj13);
                df4 df4Var3 = c1368a.f18390a;
                String str8 = (String) ((Preferences) obj).get(c1368a.f18349J);
                Object objM10321a = df4Var3.m10321a(str8 != null ? str8 : "{}", new je5(sk9.f60959a, new je5(new zs2("com.lingq.core.domain.model.LearningLevel", LearningLevel.values()), lf0.f49579a)));
                preferenceStoreImpl$special$$inlined$map$35$2$1.f17813b = 1;
                return e83Var.emit(objM10321a, preferenceStoreImpl$special$$inlined$map$35$2$1) == coroutineSingletons9 ? coroutineSingletons9 : xfaVar;
            case 9:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$37$2$1) {
                    preferenceStoreImpl$special$$inlined$map$37$2$1 = (PreferenceStoreImpl$special$$inlined$map$37$2$1) continuation;
                    int i20 = preferenceStoreImpl$special$$inlined$map$37$2$1.f17819b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$37$2$1.f17819b = i20 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$37$2$1 = new PreferenceStoreImpl$special$$inlined$map$37$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$37$2$1 = new PreferenceStoreImpl$special$$inlined$map$37$2$1(this, continuation);
                }
                Object obj14 = preferenceStoreImpl$special$$inlined$map$37$2$1.f17818a;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = preferenceStoreImpl$special$$inlined$map$37$2$1.f17819b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC3193b.m15359b(obj14);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj14);
                Boolean bool3 = (Boolean) ((Preferences) obj).get(c1368a.f18355L);
                Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : true);
                preferenceStoreImpl$special$$inlined$map$37$2$1.f17819b = 1;
                return e83Var.emit(boolValueOf3, preferenceStoreImpl$special$$inlined$map$37$2$1) == coroutineSingletons10 ? coroutineSingletons10 : xfaVar;
            case 10:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$4$2$1) {
                    preferenceStoreImpl$special$$inlined$map$4$2$1 = (PreferenceStoreImpl$special$$inlined$map$4$2$1) continuation;
                    int i22 = preferenceStoreImpl$special$$inlined$map$4$2$1.f17828b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$4$2$1.f17828b = i22 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$4$2$1 = new PreferenceStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$4$2$1 = new PreferenceStoreImpl$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj15 = preferenceStoreImpl$special$$inlined$map$4$2$1.f17827a;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = preferenceStoreImpl$special$$inlined$map$4$2$1.f17828b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        AbstractC3193b.m15359b(obj15);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj15);
                String str9 = (String) ((Preferences) obj).get(c1368a.f18408g);
                if (str9 == null) {
                    str9 = xs3.f68639d.f65845a;
                }
                preferenceStoreImpl$special$$inlined$map$4$2$1.f17828b = 1;
                return e83Var.emit(str9, preferenceStoreImpl$special$$inlined$map$4$2$1) == coroutineSingletons11 ? coroutineSingletons11 : xfaVar;
            case 11:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$46$2$1) {
                    preferenceStoreImpl$special$$inlined$map$46$2$1 = (PreferenceStoreImpl$special$$inlined$map$46$2$1) continuation;
                    int i24 = preferenceStoreImpl$special$$inlined$map$46$2$1.f17849b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$46$2$1.f17849b = i24 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$46$2$1 = new PreferenceStoreImpl$special$$inlined$map$46$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$46$2$1 = new PreferenceStoreImpl$special$$inlined$map$46$2$1(this, continuation);
                }
                Object obj16 = preferenceStoreImpl$special$$inlined$map$46$2$1.f17848a;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = preferenceStoreImpl$special$$inlined$map$46$2$1.f17849b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        AbstractC3193b.m15359b(obj16);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj16);
                String str10 = (String) ((Preferences) obj).get(c1368a.f18380V);
                if (str10 == null) {
                    str10 = "Romaji";
                }
                preferenceStoreImpl$special$$inlined$map$46$2$1.f17849b = 1;
                return e83Var.emit(str10, preferenceStoreImpl$special$$inlined$map$46$2$1) == coroutineSingletons12 ? coroutineSingletons12 : xfaVar;
            case 12:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$51$2$1) {
                    preferenceStoreImpl$special$$inlined$map$51$2$1 = (PreferenceStoreImpl$special$$inlined$map$51$2$1) continuation;
                    int i26 = preferenceStoreImpl$special$$inlined$map$51$2$1.f17867b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$51$2$1.f17867b = i26 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$51$2$1 = new PreferenceStoreImpl$special$$inlined$map$51$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$51$2$1 = new PreferenceStoreImpl$special$$inlined$map$51$2$1(this, continuation);
                }
                Object obj17 = preferenceStoreImpl$special$$inlined$map$51$2$1.f17866a;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = preferenceStoreImpl$special$$inlined$map$51$2$1.f17867b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        AbstractC3193b.m15359b(obj17);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj17);
                Boolean bool4 = (Boolean) ((Preferences) obj).get(c1368a.f18394b0);
                Boolean boolValueOf4 = Boolean.valueOf(bool4 != null ? bool4.booleanValue() : true);
                preferenceStoreImpl$special$$inlined$map$51$2$1.f17867b = 1;
                return e83Var.emit(boolValueOf4, preferenceStoreImpl$special$$inlined$map$51$2$1) == coroutineSingletons13 ? coroutineSingletons13 : xfaVar;
            case 13:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$52$2$1) {
                    preferenceStoreImpl$special$$inlined$map$52$2$1 = (PreferenceStoreImpl$special$$inlined$map$52$2$1) continuation;
                    int i28 = preferenceStoreImpl$special$$inlined$map$52$2$1.f17870b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$52$2$1.f17870b = i28 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$52$2$1 = new PreferenceStoreImpl$special$$inlined$map$52$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$52$2$1 = new PreferenceStoreImpl$special$$inlined$map$52$2$1(this, continuation);
                }
                Object obj18 = preferenceStoreImpl$special$$inlined$map$52$2$1.f17869a;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = preferenceStoreImpl$special$$inlined$map$52$2$1.f17870b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        AbstractC3193b.m15359b(obj18);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj18);
                df4 df4Var4 = c1368a.f18390a;
                String str11 = (String) ((Preferences) obj).get(c1368a.f18397c0);
                Object objM10321a2 = df4Var4.m10321a(str11 != null ? str11 : "{}", new je5(sk9.f60959a, lf0.f49579a));
                preferenceStoreImpl$special$$inlined$map$52$2$1.f17870b = 1;
                return e83Var.emit(objM10321a2, preferenceStoreImpl$special$$inlined$map$52$2$1) == coroutineSingletons14 ? coroutineSingletons14 : xfaVar;
            default:
                if (continuation instanceof PreferenceStoreImpl$special$$inlined$map$69$2$1) {
                    preferenceStoreImpl$special$$inlined$map$69$2$1 = (PreferenceStoreImpl$special$$inlined$map$69$2$1) continuation;
                    int i30 = preferenceStoreImpl$special$$inlined$map$69$2$1.f17924b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        preferenceStoreImpl$special$$inlined$map$69$2$1.f17924b = i30 - Integer.MIN_VALUE;
                    } else {
                        preferenceStoreImpl$special$$inlined$map$69$2$1 = new PreferenceStoreImpl$special$$inlined$map$69$2$1(this, continuation);
                    }
                } else {
                    preferenceStoreImpl$special$$inlined$map$69$2$1 = new PreferenceStoreImpl$special$$inlined$map$69$2$1(this, continuation);
                }
                Object obj19 = preferenceStoreImpl$special$$inlined$map$69$2$1.f17923a;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = preferenceStoreImpl$special$$inlined$map$69$2$1.f17924b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        AbstractC3193b.m15359b(obj19);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj19);
                String baseUrl = (String) ((Preferences) obj).get(c1368a.f18451u0);
                if (baseUrl == null) {
                    baseUrl = ServerEnvironment.Production.getBaseUrl();
                }
                ServerEnvironment.Companion.getClass();
                baseUrl.getClass();
                String strM22990m = ux5.m22990m(vk9.m23378N0(vk9.m23376L0(baseUrl).toString(), '/'), "/");
                for (Object obj20 : ServerEnvironment.getEntries()) {
                    if (fa4.m11650l(((ServerEnvironment) obj20).getBaseUrl(), strM22990m)) {
                        obj2 = obj20;
                        serverEnvironment = (ServerEnvironment) obj2;
                        if (serverEnvironment == null) {
                            serverEnvironment = ServerEnvironment.Production;
                        }
                        preferenceStoreImpl$special$$inlined$map$69$2$1.f17924b = 1;
                        if (e83Var.emit(serverEnvironment, preferenceStoreImpl$special$$inlined$map$69$2$1) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                        return xfaVar;
                    }
                }
                serverEnvironment = (ServerEnvironment) obj2;
                if (serverEnvironment == null) {
                    serverEnvironment = ServerEnvironment.Production;
                }
                preferenceStoreImpl$special$$inlined$map$69$2$1.f17924b = 1;
                if (e83Var.emit(serverEnvironment, preferenceStoreImpl$special$$inlined$map$69$2$1) == coroutineSingletons15) {
                    return coroutineSingletons15;
                }
                return xfaVar;
        }
    }
}
