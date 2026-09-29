package com.google.firebase.sessions.settings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import p000.C3386nv;
import p000.c32;
import p000.q58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m4291f = "RemoteSettingsFetcher.kt", m4292l = {73, 75, 78}, m4293m = "invokeSuspend")
final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f13877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q58 f13878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f13879c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f13880d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f13881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettingsFetcher$doConfigFetch$2(q58 q58Var, Map map, zi3 zi3Var, zi3 zi3Var2, Continuation continuation) {
        super(2, continuation);
        this.f13878b = q58Var;
        this.f13879c = map;
        this.f13880d = zi3Var;
        this.f13881e = zi3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.f13878b, this.f13879c, this.f13880d, this.f13881e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00db A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f13877a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f13881e;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                URLConnection uRLConnectionOpenConnection = q58.m19661a(this.f13878b).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f13879c.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    zi3 zi3Var2 = this.f13880d;
                    this.f13877a = 1;
                    if (((RemoteSettings$updateSettings$2$1) zi3Var2).invoke(jSONObject, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    this.f13877a = 2;
                    ((RemoteSettings$updateSettings$2$2) zi3Var).invoke("Bad response code: " + responseCode, this);
                    if (xfaVar == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.f13877a = 3;
            ((RemoteSettings$updateSettings$2$2) zi3Var).invoke(message, this);
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
