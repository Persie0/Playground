package p000;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1154a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchType;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xg1 {

    /* JADX INFO: renamed from: i */
    public static final int[] f68165i = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a */
    public final Object f68166a;

    /* JADX INFO: renamed from: b */
    public final Object f68167b;

    /* JADX INFO: renamed from: c */
    public final Object f68168c;

    /* JADX INFO: renamed from: d */
    public final Serializable f68169d;

    /* JADX INFO: renamed from: e */
    public final Object f68170e;

    /* JADX INFO: renamed from: f */
    public final Object f68171f;

    /* JADX INFO: renamed from: g */
    public final Object f68172g;

    /* JADX INFO: renamed from: h */
    public final Object f68173h;

    public /* synthetic */ xg1(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f68166a = obj;
        this.f68167b = obj2;
        this.f68168c = obj3;
        this.f68169d = serializable;
        this.f68170e = obj4;
        this.f68171f = obj5;
        this.f68172g = obj6;
        this.f68173h = obj7;
    }

    /* JADX INFO: renamed from: a */
    public wg1 m24489a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionM6749b = ((ConfigFetchHttpClient) this.f68171f).m6749b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.f68171f;
            HashMap mapM24492d = m24492d();
            String string = ((eh1) this.f68172g).f37250a.getString("last_fetch_etag", null);
            InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) ((uo7) this.f68167b).get();
            wg1 wg1VarFetch = configFetchHttpClient.fetch(httpURLConnectionM6749b, str, str2, mapM24492d, string, map, interfaceC3036gf != null ? (Long) ((C3182kf) interfaceC3036gf).f47117a.f12311a.m23085a(null, null, true).get("_fot") : null, date, ((eh1) this.f68172g).m11147b());
            sg1 sg1Var = wg1VarFetch.f66792b;
            if (sg1Var != null) {
                eh1 eh1Var = (eh1) this.f68172g;
                long j = sg1Var.f60810f;
                synchronized (eh1Var.f37251b) {
                    eh1Var.f37250a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = wg1VarFetch.f66793c;
            if (str4 != null) {
                eh1 eh1Var2 = (eh1) this.f68172g;
                synchronized (eh1Var2.f37251b) {
                    eh1Var2.f37250a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((eh1) this.f68172g).m11149d(0, eh1.f37249f);
            return wg1VarFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.f13791a;
            eh1 eh1Var3 = (eh1) this.f68172g;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = eh1Var3.m11146a().f72161b + 1;
                long millis = TimeUnit.MINUTES.toMillis(f68165i[Math.min(i2, 8) - 1]);
                eh1Var3.m11149d(i2, new Date(date.getTime() + (millis / 2) + ((long) ((Random) this.f68169d).nextInt((int) millis))));
            }
            ztb ztbVarM11146a = eh1Var3.m11146a();
            int i3 = e.f13791a;
            if (ztbVarM11146a.f72161b > 1 || i3 == 429) {
                ((Date) ztbVarM11146a.f72162c).getTime();
                throw new FirebaseRemoteConfigFetchThrottledException();
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e.f13791a, "Fetch failed: ".concat(str3), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public Task m24490b(Task task, long j, final HashMap map) {
        final xg1 xg1Var;
        Task taskMo5965g;
        Executor executor = (Executor) this.f68168c;
        x43 x43Var = (x43) this.f68166a;
        eh1 eh1Var = (eh1) this.f68172g;
        final Date date = new Date(System.currentTimeMillis());
        if (task.mo5971m()) {
            Date date2 = new Date(eh1Var.f37250a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(eh1.f37248e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return Tasks.m5975c(new wg1(2, null, null));
            }
        }
        Date date3 = (Date) eh1Var.m11146a().f72162c;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            taskMo5965g = Tasks.m5974b(new FirebaseRemoteConfigFetchThrottledException(str));
            xg1Var = this;
        } else {
            C1154a c1154a = (C1154a) x43Var;
            final tld tldVarM6697c = c1154a.m6697c();
            final tld tldVarM6698d = c1154a.m6698d();
            xg1Var = this;
            taskMo5965g = Tasks.m5977e(tldVarM6697c, tldVarM6698d).mo5965g(executor, new bm1() { // from class: ug1
                @Override // p000.bm1
                /* JADX INFO: renamed from: e */
                public final Object mo393e(Task task2) {
                    xg1 xg1Var2 = this.f63875a;
                    Date date5 = date;
                    HashMap map2 = map;
                    Task task3 = tldVarM6697c;
                    if (!task3.mo5971m()) {
                        return Tasks.m5974b(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.mo5966h()));
                    }
                    Task task4 = tldVarM6698d;
                    if (!task4.mo5971m()) {
                        return Tasks.m5974b(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.mo5966h()));
                    }
                    try {
                        wg1 wg1VarM24489a = xg1Var2.m24489a((String) task3.mo5967i(), ((t40) task4.mo5967i()).f61836a, date5, map2);
                        if (wg1VarM24489a.f66791a != 0) {
                            return Tasks.m5975c(wg1VarM24489a);
                        }
                        qg1 qg1Var = (qg1) xg1Var2.f68170e;
                        sg1 sg1Var = wg1VarM24489a.f66792b;
                        Executor executor2 = qg1Var.f57743a;
                        return Tasks.m5973a(new og1(0, qg1Var, sg1Var), executor2).mo5972n(executor2, new r41(2, qg1Var, sg1Var)).mo5972n((Executor) xg1Var2.f68168c, new C3487q7(wg1VarM24489a, 5));
                    } catch (FirebaseRemoteConfigException e) {
                        return Tasks.m5974b(e);
                    }
                }
            });
        }
        return taskMo5965g.mo5965g(executor, new r41(3, xg1Var, date));
    }

    /* JADX INFO: renamed from: c */
    public Task m24491c(ConfigFetchHandler$FetchType configFetchHandler$FetchType, int i) {
        HashMap map = new HashMap((Map) this.f68173h);
        map.put("X-Firebase-RC-Fetch-Type", configFetchHandler$FetchType.getValue() + "/" + i);
        return ((qg1) this.f68170e).m19940b().mo5965g((Executor) this.f68168c, new vg1(0, this, map));
    }

    /* JADX INFO: renamed from: d */
    public HashMap m24492d() {
        HashMap map = new HashMap();
        InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) ((uo7) this.f68167b).get();
        if (interfaceC3036gf != null) {
            for (Map.Entry entry : ((C3182kf) interfaceC3036gf).f47117a.f12311a.m23085a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
