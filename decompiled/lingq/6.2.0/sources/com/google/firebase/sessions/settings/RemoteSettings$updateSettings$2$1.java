package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.r0a;
import p000.ry8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m4291f = "RemoteSettings.kt", m4292l = {126}, m4293m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13873a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1169a f13875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(C1169a c1169a, Continuation continuation) {
        super(2, continuation);
        this.f13875c = c1169a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.f13875c, continuation);
        remoteSettings$updateSettings$2$1.f13874b = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettings$updateSettings$2$1) create((JSONObject) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean bool;
        Double d;
        Integer num;
        JSONException jSONException;
        Integer num2;
        Double d2;
        Boolean bool2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13873a;
        Integer num3 = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            JSONObject jSONObject = (JSONObject) this.f13874b;
            Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                obj2.getClass();
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                if (jSONObject2.has("cache_duration")) {
                                    num3 = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e) {
                                jSONException = e;
                                lda.m16121g(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                            num2 = null;
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        num2 = null;
                        d2 = null;
                    }
                } catch (JSONException e4) {
                    jSONException = e4;
                    num2 = null;
                    d2 = null;
                    bool2 = null;
                }
                num = num2;
                d = d2;
                bool = bool2;
            } else {
                bool = null;
                d = null;
                num = null;
            }
            C1169a c1169a = this.f13875c;
            C1171c c1171c = c1169a.f13899e;
            int iIntValue = num3 != null ? num3.intValue() : C1169a.f13893g;
            c1169a.f13895a.getClass();
            ry8 ry8Var = new ry8(bool, d, num, new Integer(iIntValue), new Long(r0a.m20228a().f46521c));
            this.f13873a = 1;
            if (c1171c.m6769c(ry8Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
