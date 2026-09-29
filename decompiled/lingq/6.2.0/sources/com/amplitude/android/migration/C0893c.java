package com.amplitude.android.migration;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.Storage$Constants;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3386nv;
import p000.b34;
import p000.b90;
import p000.cl9;
import p000.gz3;
import p000.lj5;
import p000.sq5;
import p000.u02;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.migration.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0893c {

    /* JADX INFO: renamed from: a */
    public final AbstractC0903a f10933a;

    /* JADX INFO: renamed from: b */
    public final u02 f10934b;

    public C0893c(AbstractC0903a abstractC0903a, u02 u02Var) {
        this.f10933a = abstractC0903a;
        this.f10934b = u02Var;
    }

    /* JADX INFO: renamed from: a */
    public static long m5082a(JSONObject jSONObject) throws JSONException {
        long j = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + '/' + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put("time", objOpt);
        }
        Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt("quantity");
            if (objOpt6 != null) {
                jSONObject.put("quantity", objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put("quantity", objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108 A[PHI: r0
      0x0108: PHI (r0v13 com.amplitude.android.migration.c) = (r0v11 com.amplitude.android.migration.c), (r0v14 com.amplitude.android.migration.c) binds: [B:60:0x00ec, B:68:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127 A[PHI: r10
      0x0127: PHI (r10v16 com.amplitude.android.migration.c) = (r10v14 com.amplitude.android.migration.c), (r10v20 com.amplitude.android.migration.c) binds: [B:74:0x0124, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0104, code lost:
    
        if (r10.m5086e(r1) == r2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0136, code lost:
    
        if (r10.m5101f(r1) == r2) goto L78;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5083b(ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$execute$1 remnantDataMigration$execute$1;
        C0893c c0893c;
        int i;
        String str;
        String str2;
        C0893c c0893c2;
        C0893c c0893c3;
        C0898b c0898bM5114h;
        AbstractC0903a abstractC0903a = this.f10933a;
        if (continuationImpl instanceof RemnantDataMigration$execute$1) {
            remnantDataMigration$execute$1 = (RemnantDataMigration$execute$1) continuationImpl;
            int i2 = remnantDataMigration$execute$1.f10897e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$execute$1.f10897e = i2 - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$execute$1 = new RemnantDataMigration$execute$1(this, continuationImpl);
            }
        } else {
            remnantDataMigration$execute$1 = new RemnantDataMigration$execute$1(this, continuationImpl);
        }
        Object obj = remnantDataMigration$execute$1.f10895c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (remnantDataMigration$execute$1.f10897e) {
            case 0:
                AbstractC3193b.m15359b(obj);
                String strM5096a = abstractC0903a.m5114h().m5096a(Storage$Constants.LAST_EVENT_TIME);
                int i3 = (strM5096a != null ? cl9.m4845b0(strM5096a) : null) == null ? 1 : 0;
                u02 u02Var = this.f10934b;
                try {
                    synchronized (u02Var) {
                        str = (String) u02Var.m22368e("store", "device_id");
                    }
                    synchronized (u02Var) {
                        str2 = (String) u02Var.m22368e("store", "user_id");
                    }
                    if (str != null || str2 != null) {
                        gz3 gz3VarM3833N = abstractC0903a.m5112f().m3833N();
                        if (gz3VarM3833N.f41548b == null && str != null) {
                            ((sq5) abstractC0903a.m5112f().f8656b).m21581x("device_id", str);
                        }
                        if (gz3VarM3833N.f41547a == null && str2 != null) {
                            ((sq5) abstractC0903a.m5112f().f8656b).m21581x("user_id", str2);
                        }
                    }
                } catch (Exception e) {
                    lj5.f49738c.mo16255a("device/user id migration failed: " + e.getMessage());
                }
                remnantDataMigration$execute$1.f10893a = this;
                remnantDataMigration$execute$1.f10894b = i3;
                remnantDataMigration$execute$1.f10897e = 1;
                if (m5088g(remnantDataMigration$execute$1) != coroutineSingletons) {
                    c0893c = this;
                    i = i3;
                    if (i == 0) {
                        remnantDataMigration$execute$1.f10893a = c0893c;
                        remnantDataMigration$execute$1.f10897e = 4;
                        if (c0893c.m5085d(remnantDataMigration$execute$1) != coroutineSingletons) {
                            c0893c3 = c0893c;
                            c0898bM5114h = c0893c3.f10933a.m5114h();
                            remnantDataMigration$execute$1.f10893a = c0893c3;
                            remnantDataMigration$execute$1.f10897e = 5;
                            if (c0898bM5114h.m5101f(remnantDataMigration$execute$1) != coroutineSingletons) {
                                C0898b c0898bM5111e = c0893c3.f10933a.m5111e();
                                remnantDataMigration$execute$1.f10893a = null;
                                remnantDataMigration$execute$1.f10897e = 6;
                            }
                        }
                    } else {
                        remnantDataMigration$execute$1.f10893a = c0893c;
                        remnantDataMigration$execute$1.f10897e = 2;
                        if (c0893c.m5087f(remnantDataMigration$execute$1) != coroutineSingletons) {
                            c0893c2 = c0893c;
                            remnantDataMigration$execute$1.f10893a = c0893c2;
                            remnantDataMigration$execute$1.f10897e = 3;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                i = remnantDataMigration$execute$1.f10894b;
                c0893c = remnantDataMigration$execute$1.f10893a;
                AbstractC3193b.m15359b(obj);
                if (i == 0) {
                    remnantDataMigration$execute$1.f10893a = c0893c;
                    remnantDataMigration$execute$1.f10897e = 2;
                    if (c0893c.m5087f(remnantDataMigration$execute$1) != coroutineSingletons) {
                        c0893c2 = c0893c;
                        remnantDataMigration$execute$1.f10893a = c0893c2;
                        remnantDataMigration$execute$1.f10897e = 3;
                    }
                    break;
                } else {
                    remnantDataMigration$execute$1.f10893a = c0893c;
                    remnantDataMigration$execute$1.f10897e = 4;
                    if (c0893c.m5085d(remnantDataMigration$execute$1) != coroutineSingletons) {
                        c0893c3 = c0893c;
                        c0898bM5114h = c0893c3.f10933a.m5114h();
                        remnantDataMigration$execute$1.f10893a = c0893c3;
                        remnantDataMigration$execute$1.f10897e = 5;
                        if (c0898bM5114h.m5101f(remnantDataMigration$execute$1) != coroutineSingletons) {
                            C0898b c0898bM5111e2 = c0893c3.f10933a.m5111e();
                            remnantDataMigration$execute$1.f10893a = null;
                            remnantDataMigration$execute$1.f10897e = 6;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                c0893c2 = remnantDataMigration$execute$1.f10893a;
                AbstractC3193b.m15359b(obj);
                remnantDataMigration$execute$1.f10893a = c0893c2;
                remnantDataMigration$execute$1.f10897e = 3;
                break;
            case 3:
                c0893c2 = remnantDataMigration$execute$1.f10893a;
                AbstractC3193b.m15359b(obj);
                c0893c = c0893c2;
                remnantDataMigration$execute$1.f10893a = c0893c;
                remnantDataMigration$execute$1.f10897e = 4;
                if (c0893c.m5085d(remnantDataMigration$execute$1) != coroutineSingletons) {
                    c0893c3 = c0893c;
                    c0898bM5114h = c0893c3.f10933a.m5114h();
                    remnantDataMigration$execute$1.f10893a = c0893c3;
                    remnantDataMigration$execute$1.f10897e = 5;
                    if (c0898bM5114h.m5101f(remnantDataMigration$execute$1) != coroutineSingletons) {
                        C0898b c0898bM5111e3 = c0893c3.f10933a.m5111e();
                        remnantDataMigration$execute$1.f10893a = null;
                        remnantDataMigration$execute$1.f10897e = 6;
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                c0893c3 = remnantDataMigration$execute$1.f10893a;
                AbstractC3193b.m15359b(obj);
                c0898bM5114h = c0893c3.f10933a.m5114h();
                remnantDataMigration$execute$1.f10893a = c0893c3;
                remnantDataMigration$execute$1.f10897e = 5;
                if (c0898bM5114h.m5101f(remnantDataMigration$execute$1) != coroutineSingletons) {
                    C0898b c0898bM5111e4 = c0893c3.f10933a.m5111e();
                    remnantDataMigration$execute$1.f10893a = null;
                    remnantDataMigration$execute$1.f10897e = 6;
                    break;
                }
                return coroutineSingletons;
            case 5:
                c0893c3 = remnantDataMigration$execute$1.f10893a;
                AbstractC3193b.m15359b(obj);
                C0898b c0898bM5111e5 = c0893c3.f10933a.m5111e();
                remnantDataMigration$execute$1.f10893a = null;
                remnantDataMigration$execute$1.f10897e = 6;
                break;
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final Object m5084c(JSONObject jSONObject, C0898b c0898b, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$moveEvent$1 remnantDataMigration$moveEvent$1;
        long j;
        vi3 vi3Var2;
        if (continuationImpl instanceof RemnantDataMigration$moveEvent$1) {
            remnantDataMigration$moveEvent$1 = (RemnantDataMigration$moveEvent$1) continuationImpl;
            int i = remnantDataMigration$moveEvent$1.f10902e;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveEvent$1.f10902e = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveEvent$1 = new RemnantDataMigration$moveEvent$1(this, continuationImpl);
            }
        } else {
            remnantDataMigration$moveEvent$1 = new RemnantDataMigration$moveEvent$1(this, continuationImpl);
        }
        Object obj = remnantDataMigration$moveEvent$1.f10900c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remnantDataMigration$moveEvent$1.f10902e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                long jM5082a = m5082a(jSONObject);
                b90 b90VarM3225V = b34.m3225V(jSONObject);
                remnantDataMigration$moveEvent$1.f10898a = (FunctionReferenceImpl) vi3Var;
                remnantDataMigration$moveEvent$1.f10899b = jM5082a;
                remnantDataMigration$moveEvent$1.f10902e = 1;
                if (c0898b.m5103h(b90VarM3225V, remnantDataMigration$moveEvent$1) == obj2) {
                    return obj2;
                }
                j = jM5082a;
                vi3Var2 = vi3Var;
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = remnantDataMigration$moveEvent$1.f10899b;
                vi3 vi3Var3 = (vi3) remnantDataMigration$moveEvent$1.f10898a;
                AbstractC3193b.m15359b(obj);
                vi3Var2 = vi3Var3;
            }
            vi3Var2.invoke(new Long(j));
        } catch (Exception e) {
            lj5.f49738c.mo16255a("event migration failed: " + e.getMessage());
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m5085d(ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$moveEvents$1 remnantDataMigration$moveEvents$1;
        AbstractList abstractListM22370p;
        C0893c c0893c;
        Iterator it;
        if (continuationImpl instanceof RemnantDataMigration$moveEvents$1) {
            remnantDataMigration$moveEvents$1 = (RemnantDataMigration$moveEvents$1) continuationImpl;
            int i = remnantDataMigration$moveEvents$1.f10907e;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveEvents$1.f10907e = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveEvents$1 = new RemnantDataMigration$moveEvents$1(this, continuationImpl);
            }
        } else {
            remnantDataMigration$moveEvents$1 = new RemnantDataMigration$moveEvents$1(this, continuationImpl);
        }
        Object obj = remnantDataMigration$moveEvents$1.f10905c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remnantDataMigration$moveEvents$1.f10907e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                u02 u02Var = this.f10934b;
                synchronized (u02Var) {
                    abstractListM22370p = u02Var.m22370p("events");
                }
                c0893c = this;
                it = abstractListM22370p.iterator();
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = remnantDataMigration$moveEvents$1.f10904b;
                C0893c c0893c2 = remnantDataMigration$moveEvents$1.f10903a;
                AbstractC3193b.m15359b(obj);
                c0893c = c0893c2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                C0898b c0898bM5114h = c0893c.f10933a.m5114h();
                RemnantDataMigration$moveEvents$2 remnantDataMigration$moveEvents$2 = new RemnantDataMigration$moveEvents$2(c0893c.f10934b);
                remnantDataMigration$moveEvents$1.f10903a = c0893c;
                remnantDataMigration$moveEvents$1.f10904b = it;
                remnantDataMigration$moveEvents$1.f10907e = 1;
                if (c0893c.m5084c(jSONObject, c0898bM5114h, remnantDataMigration$moveEvents$2, remnantDataMigration$moveEvents$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e) {
            lj5.f49738c.mo16255a("events migration failed: " + e.getMessage());
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m5086e(ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$moveIdentifies$1 remnantDataMigration$moveIdentifies$1;
        AbstractList abstractListM22370p;
        C0893c c0893c;
        Iterator it;
        if (continuationImpl instanceof RemnantDataMigration$moveIdentifies$1) {
            remnantDataMigration$moveIdentifies$1 = (RemnantDataMigration$moveIdentifies$1) continuationImpl;
            int i = remnantDataMigration$moveIdentifies$1.f10912e;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveIdentifies$1.f10912e = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveIdentifies$1 = new RemnantDataMigration$moveIdentifies$1(this, continuationImpl);
            }
        } else {
            remnantDataMigration$moveIdentifies$1 = new RemnantDataMigration$moveIdentifies$1(this, continuationImpl);
        }
        Object obj = remnantDataMigration$moveIdentifies$1.f10910c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remnantDataMigration$moveIdentifies$1.f10912e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                u02 u02Var = this.f10934b;
                synchronized (u02Var) {
                    abstractListM22370p = u02Var.m22370p("identifys");
                }
                c0893c = this;
                it = abstractListM22370p.iterator();
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = remnantDataMigration$moveIdentifies$1.f10909b;
                C0893c c0893c2 = remnantDataMigration$moveIdentifies$1.f10908a;
                AbstractC3193b.m15359b(obj);
                c0893c = c0893c2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                C0898b c0898bM5114h = c0893c.f10933a.m5114h();
                RemnantDataMigration$moveIdentifies$2 remnantDataMigration$moveIdentifies$2 = new RemnantDataMigration$moveIdentifies$2(c0893c.f10934b);
                remnantDataMigration$moveIdentifies$1.f10908a = c0893c;
                remnantDataMigration$moveIdentifies$1.f10909b = it;
                remnantDataMigration$moveIdentifies$1.f10912e = 1;
                if (c0893c.m5084c(jSONObject, c0898bM5114h, remnantDataMigration$moveIdentifies$2, remnantDataMigration$moveIdentifies$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e) {
            lj5.f49738c.mo16255a("identifies migration failed: " + e.getMessage());
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m5087f(ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$moveInterceptedIdentifies$1 remnantDataMigration$moveInterceptedIdentifies$1;
        List listM22370p;
        C0893c c0893c;
        Iterator it;
        if (continuationImpl instanceof RemnantDataMigration$moveInterceptedIdentifies$1) {
            remnantDataMigration$moveInterceptedIdentifies$1 = (RemnantDataMigration$moveInterceptedIdentifies$1) continuationImpl;
            int i = remnantDataMigration$moveInterceptedIdentifies$1.f10917e;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveInterceptedIdentifies$1.f10917e = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveInterceptedIdentifies$1 = new RemnantDataMigration$moveInterceptedIdentifies$1(this, continuationImpl);
            }
        } else {
            remnantDataMigration$moveInterceptedIdentifies$1 = new RemnantDataMigration$moveInterceptedIdentifies$1(this, continuationImpl);
        }
        Object obj = remnantDataMigration$moveInterceptedIdentifies$1.f10915c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remnantDataMigration$moveInterceptedIdentifies$1.f10917e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                u02 u02Var = this.f10934b;
                synchronized (u02Var) {
                    listM22370p = u02Var.f63166d < 4 ? EmptyList.f47638a : u02Var.m22370p("identify_interceptor");
                }
                c0893c = this;
                it = listM22370p.iterator();
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = remnantDataMigration$moveInterceptedIdentifies$1.f10914b;
                C0893c c0893c2 = remnantDataMigration$moveInterceptedIdentifies$1.f10913a;
                AbstractC3193b.m15359b(obj);
                c0893c = c0893c2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                C0898b c0898bM5111e = c0893c.f10933a.m5111e();
                RemnantDataMigration$moveInterceptedIdentifies$2 remnantDataMigration$moveInterceptedIdentifies$2 = new RemnantDataMigration$moveInterceptedIdentifies$2(c0893c.f10934b);
                remnantDataMigration$moveInterceptedIdentifies$1.f10913a = c0893c;
                remnantDataMigration$moveInterceptedIdentifies$1.f10914b = it;
                remnantDataMigration$moveInterceptedIdentifies$1.f10917e = 1;
                if (c0893c.m5084c(jSONObject, c0898bM5111e, remnantDataMigration$moveInterceptedIdentifies$2, remnantDataMigration$moveInterceptedIdentifies$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e) {
            lj5.f49738c.mo16255a("intercepted identifies migration failed: " + e.getMessage());
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010a A[DONT_INVERT, PHI: r0 r2 r3
      0x010a: PHI (r0v7 com.amplitude.android.migration.c) = 
      (r0v4 com.amplitude.android.migration.c)
      (r0v4 com.amplitude.android.migration.c)
      (r0v9 com.amplitude.android.migration.c)
     binds: [B:48:0x00d5, B:49:0x00d7, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r2v6 java.lang.Long) = (r2v3 java.lang.Long), (r2v3 java.lang.Long), (r2v9 java.lang.Long) binds: [B:48:0x00d5, B:49:0x00d7, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r3v8 java.lang.Long) = (r3v5 java.lang.Long), (r3v5 java.lang.Long), (r3v11 java.lang.Long) binds: [B:48:0x00d5, B:49:0x00d7, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        if (r13 == r5) goto L59;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5088g(ContinuationImpl continuationImpl) throws Throwable {
        RemnantDataMigration$moveSessionData$1 remnantDataMigration$moveSessionData$1;
        Long lM4845b0;
        Long lM22367c;
        Long lM22367c2;
        Long l;
        Long l2;
        C0893c c0893c;
        Long l3;
        Long l4;
        C0893c c0893c2 = this;
        u02 u02Var = c0893c2.f10934b;
        AbstractC0903a abstractC0903a = c0893c2.f10933a;
        if (continuationImpl instanceof RemnantDataMigration$moveSessionData$1) {
            remnantDataMigration$moveSessionData$1 = (RemnantDataMigration$moveSessionData$1) continuationImpl;
            int i = remnantDataMigration$moveSessionData$1.f10925h;
            if ((i & Integer.MIN_VALUE) != 0) {
                remnantDataMigration$moveSessionData$1.f10925h = i - Integer.MIN_VALUE;
            } else {
                remnantDataMigration$moveSessionData$1 = new RemnantDataMigration$moveSessionData$1(c0893c2, continuationImpl);
            }
        } else {
            remnantDataMigration$moveSessionData$1 = new RemnantDataMigration$moveSessionData$1(c0893c2, continuationImpl);
        }
        Object obj = remnantDataMigration$moveSessionData$1.f10923f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remnantDataMigration$moveSessionData$1.f10925h;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    Long l5 = remnantDataMigration$moveSessionData$1.f10922e;
                    Long l6 = remnantDataMigration$moveSessionData$1.f10921d;
                    l = remnantDataMigration$moveSessionData$1.f10920c;
                    l2 = remnantDataMigration$moveSessionData$1.f10919b;
                    C0893c c0893c3 = remnantDataMigration$moveSessionData$1.f10918a;
                    AbstractC3193b.m15359b(obj);
                    lM22367c = l6;
                    lM22367c2 = l5;
                    c0893c2 = c0893c3;
                } else {
                    if (i2 == 2) {
                        l3 = remnantDataMigration$moveSessionData$1.f10920c;
                        l4 = remnantDataMigration$moveSessionData$1.f10919b;
                        c0893c = remnantDataMigration$moveSessionData$1.f10918a;
                        AbstractC3193b.m15359b(obj);
                        c0893c.f10934b.m22372r("last_event_time");
                        Long l7 = l4;
                        lM22367c2 = l3;
                        c0893c2 = c0893c;
                        l = l7;
                        if (l == null && lM22367c2 != null) {
                            C0898b c0898bM5114h = c0893c2.f10933a.m5114h();
                            Storage$Constants storage$Constants = Storage$Constants.LAST_EVENT_ID;
                            String string = lM22367c2.toString();
                            remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                            remnantDataMigration$moveSessionData$1.f10919b = null;
                            remnantDataMigration$moveSessionData$1.f10920c = null;
                            remnantDataMigration$moveSessionData$1.f10921d = null;
                            remnantDataMigration$moveSessionData$1.f10922e = null;
                            remnantDataMigration$moveSessionData$1.f10925h = 3;
                            c0898bM5114h.m5102g(storage$Constants, string);
                        }
                        return xfaVar;
                    }
                    if (i2 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0893c2 = remnantDataMigration$moveSessionData$1.f10918a;
                    AbstractC3193b.m15359b(obj);
                }
                c0893c2.f10934b.m22372r("last_event_id");
                return xfaVar;
            }
            AbstractC3193b.m15359b(obj);
            C0898b c0898bM5114h2 = abstractC0903a.m5114h();
            Storage$Constants storage$Constants2 = Storage$Constants.PREVIOUS_SESSION_ID;
            String strM5096a = c0898bM5114h2.m5096a(storage$Constants2);
            Long lM4845b1 = strM5096a != null ? cl9.m4845b0(strM5096a) : null;
            String strM5096a2 = abstractC0903a.m5114h().m5096a(Storage$Constants.LAST_EVENT_TIME);
            lM4845b0 = strM5096a2 != null ? cl9.m4845b0(strM5096a2) : null;
            String strM5096a3 = abstractC0903a.m5114h().m5096a(Storage$Constants.LAST_EVENT_ID);
            Long lM4845b2 = strM5096a3 != null ? cl9.m4845b0(strM5096a3) : null;
            Long lM22367c3 = u02Var.m22367c("previous_session_id");
            lM22367c = u02Var.m22367c("last_event_time");
            lM22367c2 = u02Var.m22367c("last_event_id");
            if (lM4845b1 != null || lM22367c3 == null) {
                l = lM4845b2;
                if (lM4845b0 == null || lM22367c == null) {
                    if (l == null) {
                        C0898b c0898bM5114h3 = c0893c2.f10933a.m5114h();
                        Storage$Constants storage$Constants3 = Storage$Constants.LAST_EVENT_ID;
                        String string2 = lM22367c2.toString();
                        remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                        remnantDataMigration$moveSessionData$1.f10919b = null;
                        remnantDataMigration$moveSessionData$1.f10920c = null;
                        remnantDataMigration$moveSessionData$1.f10921d = null;
                        remnantDataMigration$moveSessionData$1.f10922e = null;
                        remnantDataMigration$moveSessionData$1.f10925h = 3;
                        c0898bM5114h3.m5102g(storage$Constants3, string2);
                    }
                    return xfaVar;
                }
                C0898b c0898bM5114h4 = c0893c2.f10933a.m5114h();
                Storage$Constants storage$Constants4 = Storage$Constants.LAST_EVENT_TIME;
                String string3 = lM22367c.toString();
                remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                remnantDataMigration$moveSessionData$1.f10919b = l;
                remnantDataMigration$moveSessionData$1.f10920c = lM22367c2;
                remnantDataMigration$moveSessionData$1.f10921d = null;
                remnantDataMigration$moveSessionData$1.f10922e = null;
                remnantDataMigration$moveSessionData$1.f10925h = 2;
                c0898bM5114h4.m5102g(storage$Constants4, string3);
                if (xfaVar != coroutineSingletons) {
                    Long l8 = l;
                    c0893c = c0893c2;
                    l3 = lM22367c2;
                    l4 = l8;
                    c0893c.f10934b.m22372r("last_event_time");
                    Long l9 = l4;
                    lM22367c2 = l3;
                    c0893c2 = c0893c;
                    l = l9;
                    if (l == null) {
                        C0898b c0898bM5114h5 = c0893c2.f10933a.m5114h();
                        Storage$Constants storage$Constants5 = Storage$Constants.LAST_EVENT_ID;
                        String string4 = lM22367c2.toString();
                        remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                        remnantDataMigration$moveSessionData$1.f10919b = null;
                        remnantDataMigration$moveSessionData$1.f10920c = null;
                        remnantDataMigration$moveSessionData$1.f10921d = null;
                        remnantDataMigration$moveSessionData$1.f10922e = null;
                        remnantDataMigration$moveSessionData$1.f10925h = 3;
                        c0898bM5114h5.m5102g(storage$Constants5, string4);
                    }
                    return xfaVar;
                }
            } else {
                C0898b c0898bM5114h6 = abstractC0903a.m5114h();
                String string5 = lM22367c3.toString();
                remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                remnantDataMigration$moveSessionData$1.f10919b = lM4845b0;
                remnantDataMigration$moveSessionData$1.f10920c = lM4845b2;
                remnantDataMigration$moveSessionData$1.f10921d = lM22367c;
                remnantDataMigration$moveSessionData$1.f10922e = lM22367c2;
                remnantDataMigration$moveSessionData$1.f10925h = 1;
                c0898bM5114h6.m5102g(storage$Constants2, string5);
                if (xfaVar != coroutineSingletons) {
                    l2 = lM4845b0;
                    l = lM4845b2;
                }
            }
            return coroutineSingletons;
            c0893c2.f10934b.m22372r("previous_session_id");
            lM4845b0 = l2;
            if (lM4845b0 == null) {
                if (l == null) {
                    C0898b c0898bM5114h7 = c0893c2.f10933a.m5114h();
                    Storage$Constants storage$Constants6 = Storage$Constants.LAST_EVENT_ID;
                    String string6 = lM22367c2.toString();
                    remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                    remnantDataMigration$moveSessionData$1.f10919b = null;
                    remnantDataMigration$moveSessionData$1.f10920c = null;
                    remnantDataMigration$moveSessionData$1.f10921d = null;
                    remnantDataMigration$moveSessionData$1.f10922e = null;
                    remnantDataMigration$moveSessionData$1.f10925h = 3;
                    c0898bM5114h7.m5102g(storage$Constants6, string6);
                }
            } else if (l == null) {
                C0898b c0898bM5114h8 = c0893c2.f10933a.m5114h();
                Storage$Constants storage$Constants7 = Storage$Constants.LAST_EVENT_ID;
                String string7 = lM22367c2.toString();
                remnantDataMigration$moveSessionData$1.f10918a = c0893c2;
                remnantDataMigration$moveSessionData$1.f10919b = null;
                remnantDataMigration$moveSessionData$1.f10920c = null;
                remnantDataMigration$moveSessionData$1.f10921d = null;
                remnantDataMigration$moveSessionData$1.f10922e = null;
                remnantDataMigration$moveSessionData$1.f10925h = 3;
                c0898bM5114h8.m5102g(storage$Constants7, string7);
            }
            return xfaVar;
        } catch (Exception e) {
            lj5.f49738c.mo16255a("session data migration failed: " + e.getMessage());
            return xfaVar;
        }
    }
}
