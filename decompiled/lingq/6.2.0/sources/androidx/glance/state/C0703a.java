package androidx.glance.state;

import android.content.Context;
import androidx.datastore.core.DataStore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c76;
import p000.c83;
import p000.pn3;
import p000.xfa;
import p000.zi3;
import p000.zi7;

/* JADX INFO: renamed from: androidx.glance.state.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0703a {

    /* JADX INFO: renamed from: a */
    public static final C0703a f6305a = new C0703a();

    /* JADX INFO: renamed from: b */
    public static final C3248a f6306b = new C3248a();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f6307c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m2502a(Context context, zi7 zi7Var, String str, ContinuationImpl continuationImpl) throws Throwable {
        GlanceState$deleteStore$1 glanceState$deleteStore$1;
        C3248a c3248a;
        if (continuationImpl instanceof GlanceState$deleteStore$1) {
            glanceState$deleteStore$1 = (GlanceState$deleteStore$1) continuationImpl;
            int i = glanceState$deleteStore$1.f6290g;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceState$deleteStore$1.f6290g = i - Integer.MIN_VALUE;
            } else {
                glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, continuationImpl);
            }
        } else {
            glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, continuationImpl);
        }
        Object obj = glanceState$deleteStore$1.f6288e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceState$deleteStore$1.f6290g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            glanceState$deleteStore$1.f6284a = context;
            glanceState$deleteStore$1.f6285b = zi7Var;
            glanceState$deleteStore$1.f6286c = str;
            c3248a = f6306b;
            glanceState$deleteStore$1.f6287d = c3248a;
            glanceState$deleteStore$1.f6290g = 1;
            if (c3248a.mo4388c(glanceState$deleteStore$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C3248a c3248a2 = glanceState$deleteStore$1.f6287d;
            str = glanceState$deleteStore$1.f6286c;
            zi7Var = glanceState$deleteStore$1.f6285b;
            Context context2 = glanceState$deleteStore$1.f6284a;
            AbstractC3193b.m15359b(obj);
            c3248a = c3248a2;
            context = context2;
        }
        try {
            f6307c.remove(str);
            zi7Var.mo19407a(context, str).delete();
            return xfa.f68157a;
        } finally {
            c3248a.mo4387b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m2503b(Context context, pn3 pn3Var, String str, ContinuationImpl continuationImpl) throws Throwable {
        GlanceState$getDataStore$1 glanceState$getDataStore$1;
        C3248a c3248a;
        c76 c76Var;
        Throwable th;
        Object obj;
        String str2;
        Map map;
        if (continuationImpl instanceof GlanceState$getDataStore$1) {
            glanceState$getDataStore$1 = (GlanceState$getDataStore$1) continuationImpl;
            int i = glanceState$getDataStore$1.f6297g;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceState$getDataStore$1.f6297g = i - Integer.MIN_VALUE;
            } else {
                glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, continuationImpl);
            }
        } else {
            glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, continuationImpl);
        }
        Object obj2 = glanceState$getDataStore$1.f6295e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceState$getDataStore$1.f6297g;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj2);
                glanceState$getDataStore$1.f6291a = context;
                glanceState$getDataStore$1.f6292b = pn3Var;
                glanceState$getDataStore$1.f6293c = str;
                c3248a = f6306b;
                glanceState$getDataStore$1.f6294d = c3248a;
                glanceState$getDataStore$1.f6297g = 1;
                if (c3248a.mo4388c(glanceState$getDataStore$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = glanceState$getDataStore$1.f6293c;
                map = (Map) glanceState$getDataStore$1.f6292b;
                c76Var = (c76) glanceState$getDataStore$1.f6291a;
                try {
                    AbstractC3193b.m15359b(obj2);
                    obj = (DataStore) obj2;
                    map.put(str2, obj);
                    obj.getClass();
                    DataStore dataStore = (DataStore) obj;
                    c76Var.mo4387b(null);
                    return dataStore;
                } catch (Throwable th2) {
                    th = th2;
                    c76Var.mo4387b(null);
                    throw th;
                }
            }
            C3248a c3248a2 = glanceState$getDataStore$1.f6294d;
            str = glanceState$getDataStore$1.f6293c;
            pn3Var = (pn3) glanceState$getDataStore$1.f6292b;
            Context context2 = (Context) glanceState$getDataStore$1.f6291a;
            AbstractC3193b.m15359b(obj2);
            c3248a = c3248a2;
            context = context2;
            LinkedHashMap linkedHashMap = f6307c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                glanceState$getDataStore$1.f6291a = c3248a;
                glanceState$getDataStore$1.f6292b = linkedHashMap;
                glanceState$getDataStore$1.f6293c = str;
                glanceState$getDataStore$1.f6294d = null;
                glanceState$getDataStore$1.f6297g = 2;
                DataStore dataStoreMo19408b = pn3Var.mo19408b(context, str);
                if (dataStoreMo19408b != coroutineSingletons) {
                    String str3 = str;
                    c76Var = c3248a;
                    obj2 = dataStoreMo19408b;
                    str2 = str3;
                    map = linkedHashMap;
                    obj = (DataStore) obj2;
                    map.put(str2, obj);
                }
                return coroutineSingletons;
            }
            c76Var = c3248a;
            obj.getClass();
            DataStore dataStore2 = (DataStore) obj;
            c76Var.mo4387b(null);
            return dataStore2;
        } catch (Throwable th3) {
            c76Var = c3248a;
            th = th3;
            c76Var.mo4387b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m2504c(Context context, pn3 pn3Var, String str, ContinuationImpl continuationImpl) throws Throwable {
        GlanceState$getValue$1 glanceState$getValue$1;
        if (continuationImpl instanceof GlanceState$getValue$1) {
            glanceState$getValue$1 = (GlanceState$getValue$1) continuationImpl;
            int i = glanceState$getValue$1.f6300c;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceState$getValue$1.f6300c = i - Integer.MIN_VALUE;
            } else {
                glanceState$getValue$1 = new GlanceState$getValue$1(this, continuationImpl);
            }
        } else {
            glanceState$getValue$1 = new GlanceState$getValue$1(this, continuationImpl);
        }
        Object objM2503b = glanceState$getValue$1.f6298a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceState$getValue$1.f6300c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2503b);
            glanceState$getValue$1.f6300c = 1;
            objM2503b = m2503b(context, pn3Var, str, glanceState$getValue$1);
            if (objM2503b != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM2503b);
                return objM2503b;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM2503b);
        c83 data = ((DataStore) objM2503b).getData();
        glanceState$getValue$1.f6300c = 2;
        Object objM15541t = AbstractC3224d.m15541t(data, glanceState$getValue$1);
        return objM15541t == obj ? obj : objM15541t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Object m2505d(Context context, pn3 pn3Var, String str, zi3 zi3Var, ContinuationImpl continuationImpl) {
        GlanceState$updateValue$1 glanceState$updateValue$1;
        zi3 zi3Var2;
        if (continuationImpl instanceof GlanceState$updateValue$1) {
            glanceState$updateValue$1 = (GlanceState$updateValue$1) continuationImpl;
            int i = glanceState$updateValue$1.f6304d;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceState$updateValue$1.f6304d = i - Integer.MIN_VALUE;
            } else {
                glanceState$updateValue$1 = new GlanceState$updateValue$1(this, continuationImpl);
            }
        } else {
            glanceState$updateValue$1 = new GlanceState$updateValue$1(this, continuationImpl);
        }
        Object objM2503b = glanceState$updateValue$1.f6302b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceState$updateValue$1.f6304d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2503b);
            glanceState$updateValue$1.f6301a = (SuspendLambda) zi3Var;
            glanceState$updateValue$1.f6304d = 1;
            objM2503b = m2503b(context, pn3Var, str, glanceState$updateValue$1);
            if (objM2503b != obj) {
            }
            zi3Var2 = zi3Var;
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM2503b);
                return objM2503b;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zi3 zi3Var3 = (zi3) glanceState$updateValue$1.f6301a;
        AbstractC3193b.m15359b(objM2503b);
        zi3Var2 = zi3Var3;
        zi3Var2 = zi3Var;
        glanceState$updateValue$1.f6301a = null;
        glanceState$updateValue$1.f6304d = 2;
        Object objUpdateData = ((DataStore) objM2503b).updateData(zi3Var2, glanceState$updateValue$1);
        if (objUpdateData != obj) {
            return objUpdateData;
        }
        zi3Var2 = zi3Var;
        return obj;
    }
}
