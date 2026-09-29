package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1154a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mba implements InterfaceC3622ts {

    /* JADX INFO: renamed from: M */
    public static final C3723wi f50882M = C3723wi.m23970d();

    /* JADX INFO: renamed from: N */
    public static final mba f50883N = new mba();

    /* JADX INFO: renamed from: H */
    public C3659us f50884H;

    /* JADX INFO: renamed from: I */
    public C3310lt f50885I;

    /* JADX INFO: renamed from: J */
    public String f50886J;

    /* JADX INFO: renamed from: K */
    public String f50887K;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f50889a;

    /* JADX INFO: renamed from: d */
    public q43 f50892d;

    /* JADX INFO: renamed from: e */
    public g53 f50893e;

    /* JADX INFO: renamed from: f */
    public x43 f50894f;

    /* JADX INFO: renamed from: g */
    public uo7 f50895g;

    /* JADX INFO: renamed from: h */
    public w63 f50896h;

    /* JADX INFO: renamed from: j */
    public Context f50898j;

    /* JADX INFO: renamed from: k */
    public dh1 f50899k;

    /* JADX INFO: renamed from: l */
    public tq7 f50900l;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f50890b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f50891c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: L */
    public boolean f50888L = false;

    /* JADX INFO: renamed from: i */
    public final ThreadPoolExecutor f50897i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public mba() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f50889a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* JADX INFO: renamed from: a */
    public static String m16749a(y67 y67Var) {
        if (y67Var.mo23772b()) {
            e8a e8aVarMo23773c = y67Var.mo23773c();
            long jM10937G = e8aVarMo23773c.m10937G();
            Locale locale = Locale.ENGLISH;
            return ux5.m22991n("trace metric: ", e8aVarMo23773c.m10938H(), " (duration: ", new DecimalFormat("#.####").format(jM10937G / 1000.0d), "ms)");
        }
        if (y67Var.mo23774d()) {
            kk6 kk6VarMo23775e = y67Var.mo23775e();
            long jM15315N = kk6VarMo23775e.m15324W() ? kk6VarMo23775e.m15315N() : 0L;
            String strValueOf = kk6VarMo23775e.m15320S() ? String.valueOf(kk6VarMo23775e.m15310I()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return AbstractC3393o1.m17738m(ux5.m23000w("network request trace: ", kk6VarMo23775e.m15317P(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jM15315N / 1000.0d), "ms)");
        }
        if (!y67Var.mo23771a()) {
            return "log";
        }
        jk3 jk3VarMo23776f = y67Var.mo23776f();
        Locale locale3 = Locale.ENGLISH;
        boolean zM14519B = jk3VarMo23776f.m14519B();
        int iM14522y = jk3VarMo23776f.m14522y();
        int iM14521x = jk3VarMo23776f.m14521x();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zM14519B);
        sb.append(", cpuGaugeCount: ");
        sb.append(iM14522y);
        sb.append(", memoryGaugeCount: ");
        return wq1.m24123s(sb, iM14521x, ")");
    }

    /* JADX INFO: renamed from: b */
    public final void m16750b(x67 x67Var) {
        if (x67Var.mo23772b()) {
            this.f50884H.m22882b(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (x67Var.mo23774d()) {
            this.f50884H.m22882b(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16751c(e8a e8aVar, ApplicationProcessState applicationProcessState) {
        this.f50897i.execute(new yg1(this, e8aVar, applicationProcessState, 5));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    /* JADX WARN: Code duplicated, block: B:146:0x039e  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:151:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03de  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f0 A[Catch: all -> 0x03f8, TryCatch #2 {all -> 0x03f8, blocks: (B:164:0x03ec, B:166:0x03f0, B:169:0x03fb), top: B:237:0x03ec }] */
    /* JADX WARN: Code duplicated, block: B:173:0x040f  */
    /* JADX WARN: Code duplicated, block: B:176:0x043b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0445  */
    /* JADX WARN: Code duplicated, block: B:181:0x0460  */
    /* JADX WARN: Code duplicated, block: B:183:0x0468  */
    /* JADX WARN: Code duplicated, block: B:187:0x0470  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:201:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:212:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:213:0x050c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0514  */
    /* JADX WARN: Code duplicated, block: B:217:0x0530  */
    /* JADX WARN: Code duplicated, block: B:218:0x054c  */
    /* JADX WARN: Code duplicated, block: B:220:0x056f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0584  */
    /* JADX WARN: Code duplicated, block: B:225:0x058e  */
    /* JADX WARN: Code duplicated, block: B:226:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:229:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:230:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x047c, code lost:
    
        if (p000.tq7.m22267a(r14.mo23775e().m15311J()) == false) goto L189;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:217:0x0530, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:218:0x054c, please report this as an issue */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m16752d(w67 w67Var, ApplicationProcessState applicationProcessState) {
        tq7 tq7Var;
        int i;
        boolean zM21589b;
        C3723wi c3723wi;
        w63 w63Var;
        C3723wi c3723wi2;
        hba hbaVar;
        fba fbaVar;
        String strM10938H;
        boolean zStartsWith;
        String str;
        String str2;
        String str3;
        dh1 dh1Var;
        oh1 oh1Var;
        mz6 mz6Var;
        mz6 mz6VarM10382b;
        lh1 lh1Var;
        mz6 mz6Var2;
        mz6 mz6VarM10382b2;
        double dDoubleValue;
        ai1 ai1Var;
        double dDoubleValue2;
        String str4;
        boolean z = true;
        if (!this.f50891c.get()) {
            ConcurrentHashMap concurrentHashMap = this.f50889a;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int iIntValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int iIntValue3 = num3.intValue();
            if (w67Var.mo23772b() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else if (w67Var.mo23774d() && iIntValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            } else {
                if (!w67Var.mo23771a() || iIntValue3 <= 0) {
                    f50882M.m23972b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m16749a(w67Var), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            }
            f50882M.m23972b("Transport is not initialized yet, %s will be queued for to be dispatched later", m16749a(w67Var));
            this.f50890b.add(new t67(w67Var, applicationProcessState));
            return;
        }
        C3723wi c3723wi3 = f50882M;
        if (this.f50899k.m10390n() && (!((C3435ot) this.f50885I.f64019b).m18471A() || this.f50888L)) {
            try {
                str4 = (String) Tasks.await(((C1154a) this.f50894f).m6697c(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                c3723wi3.m23973c("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str4 = null;
            } catch (ExecutionException e2) {
                c3723wi3.m23973c("Unable to retrieve Installation Id: %s", e2.getMessage());
                str4 = null;
            } catch (TimeoutException e3) {
                c3723wi3.m23973c("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                c3723wi3.m23975f("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                C3310lt c3310lt = this.f50885I;
                c3310lt.m22767h();
                C3435ot.m18468v((C3435ot) c3310lt.f64019b, str4);
            }
        }
        C3310lt c3310lt2 = this.f50885I;
        c3310lt2.m22767h();
        C3435ot.m18466t((C3435ot) c3310lt2.f64019b, applicationProcessState);
        if (w67Var.mo23772b() || w67Var.mo23774d()) {
            AbstractC1183d abstractC1183d = c3310lt2.f64018a;
            abstractC1183d.getClass();
            uk3 uk3Var = (uk3) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
            boolean zM6815n = c3310lt2.f64019b.m6815n();
            AbstractC1183d abstractC1183d2 = c3310lt2.f64019b;
            if (zM6815n) {
                abstractC1183d2.getClass();
                go7 go7Var = go7.f41083c;
                go7Var.getClass();
                go7Var.m12783a(abstractC1183d2.getClass()).makeImmutable(abstractC1183d2);
                abstractC1183d2.m6816o();
                abstractC1183d2 = c3310lt2.f64019b;
            }
            uk3Var.f64019b = abstractC1183d2;
            c3310lt2 = (C3310lt) uk3Var;
            if (this.f50893e == null && this.f50891c.get()) {
                C3723wi c3723wi4 = g53.f40227b;
                this.f50893e = (g53) q43.m19641c().m19645b(g53.class);
            }
            g53 g53Var = this.f50893e;
            Map map = g53Var != null ? new HashMap(g53Var.f40228a) : Collections.EMPTY_MAP;
            c3310lt2.m22767h();
            C3435ot.m18467u((C3435ot) c3310lt2.f64019b).putAll(map);
        }
        w67Var.m22767h();
        x67.m24317s((x67) w67Var.f64019b, (C3435ot) c3310lt2.m22766g());
        x67 x67Var = (x67) w67Var.m22766g();
        if (!this.f50899k.m10390n()) {
            f50882M.m23974e("Performance collection is not enabled, dropping %s", m16749a(x67Var));
            return;
        }
        if (!x67Var.m24322w().m18471A()) {
            f50882M.m23976g("App Instance ID is null or empty, dropping %s", m16749a(x67Var));
            return;
        }
        Context context = this.f50898j;
        Pattern pattern = z67.f70988a;
        ArrayList arrayList = new ArrayList();
        if (x67Var.mo23772b()) {
            arrayList.add(new f53(x67Var.mo23773c()));
        }
        if (x67Var.mo23774d()) {
            arrayList.add(new e53(x67Var.mo23775e(), context));
        }
        if (x67Var.m24323x()) {
            arrayList.add(new b53(x67Var.m24322w()));
        }
        if (x67Var.mo23771a()) {
            arrayList.add(new d53(x67Var.mo23776f()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((z67) it.next()).mo3300a()) {
                }
            }
            tq7 tq7Var2 = this.f50900l;
            tq7Var2.getClass();
            double dDoubleValue3 = 1.0d;
            if (!x67Var.mo23772b()) {
                if (x67Var.mo23772b()) {
                    if (x67Var.mo23774d()) {
                        dh1Var = tq7Var2.f62734a;
                        dh1Var.getClass();
                        synchronized (oh1.class) {
                            if (oh1.f54337h == null) {
                                oh1.f54337h = new oh1();
                            }
                            oh1Var = oh1.f54337h;
                            RemoteConfigManager remoteConfigManager = dh1Var.f35642a;
                            oh1Var.getClass();
                            mz6Var = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
                            if (mz6Var.m17160b()) {
                                mz6VarM10382b = dh1Var.m10382b(oh1Var);
                                if (!mz6VarM10382b.m17160b()) {
                                    if (dh1Var.f35642a.isLastFetchFailed()) {
                                        dDoubleValue3 = 0.001d;
                                    }
                                } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            } else {
                                mz6VarM10382b = dh1Var.m10382b(oh1Var);
                                if (!mz6VarM10382b.m17160b()) {
                                    if (dh1Var.f35642a.isLastFetchFailed()) {
                                        dDoubleValue3 = 0.001d;
                                    }
                                } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            }
                            if (tq7Var2.f62735b >= dDoubleValue3) {
                            }
                        }
                    }
                    tq7Var = this.f50900l;
                    tq7Var.getClass();
                    i = 0;
                    if (x67Var.mo23772b()) {
                        if (x67Var.mo23774d()) {
                            zM21589b = tq7Var.f62738e.m21589b();
                        } else if (x67Var.mo23772b()) {
                            zM21589b = tq7Var.f62737d.m21589b();
                        }
                        z = true ^ zM21589b;
                    } else {
                        if (x67Var.mo23774d()) {
                            zM21589b = tq7Var.f62738e.m21589b();
                        } else if (x67Var.mo23772b()) {
                            zM21589b = tq7Var.f62737d.m21589b();
                        }
                        z = true ^ zM21589b;
                    }
                    if (z) {
                        m16750b(x67Var);
                        f50882M.m23974e("Rate limited (per device) - %s", m16749a(x67Var));
                        return;
                    }
                    c3723wi = f50882M;
                    if (x67Var.mo23772b()) {
                        String strM16749a = m16749a(x67Var);
                        strM10938H = x67Var.mo23773c().m10938H();
                        zStartsWith = strM10938H.startsWith("_st_");
                        str = this.f50887K;
                        str2 = this.f50886J;
                        if (zStartsWith) {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/SCREEN_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        } else {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/DURATION_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        }
                        c3723wi.m23974e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strM16749a, str3);
                    } else {
                        c3723wi.m23974e("Logging %s", m16749a(x67Var));
                    }
                    w63Var = this.f50896h;
                    c3723wi2 = w63.f66452d;
                    if (w63Var.f66455c == null) {
                        fbaVar = (fba) w63Var.f66454b.get();
                        if (fbaVar != null) {
                            w63Var.f66455c = ((gba) fbaVar).m12466a(w63Var.f66453a, new bs2("proto"), new v63(i));
                        } else {
                            c3723wi2.m23975f("Flg TransportFactory is not available at the moment");
                        }
                    }
                    hbaVar = w63Var.f66455c;
                    if (hbaVar != null) {
                        hbaVar.m13185a(new j40(x67Var, Priority.DEFAULT, null), new uk9(8));
                    } else {
                        c3723wi2.m23975f("Unable to dispatch event because Flg Transport is not available");
                    }
                    SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    return;
                }
                if (x67Var.mo23774d()) {
                    dh1Var = tq7Var2.f62734a;
                    dh1Var.getClass();
                    synchronized (oh1.class) {
                        if (oh1.f54337h == null) {
                            oh1.f54337h = new oh1();
                        }
                        oh1Var = oh1.f54337h;
                        RemoteConfigManager remoteConfigManager2 = dh1Var.f35642a;
                        oh1Var.getClass();
                        mz6Var = remoteConfigManager2.getDouble("fpr_vc_network_request_sampling_rate");
                        if (mz6Var.m17160b()) {
                            mz6VarM10382b = dh1Var.m10382b(oh1Var);
                            if (!mz6VarM10382b.m17160b()) {
                                if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                dDoubleValue3 = 0.001d;
                            }
                        } else {
                            mz6VarM10382b = dh1Var.m10382b(oh1Var);
                            if (!mz6VarM10382b.m17160b()) {
                                if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                dDoubleValue3 = 0.001d;
                            }
                        }
                        if (tq7Var2.f62735b >= dDoubleValue3) {
                        }
                    }
                }
                tq7Var = this.f50900l;
                tq7Var.getClass();
                i = 0;
                if (x67Var.mo23772b()) {
                    if (x67Var.mo23774d()) {
                        zM21589b = tq7Var.f62738e.m21589b();
                    } else if (x67Var.mo23772b()) {
                        zM21589b = tq7Var.f62737d.m21589b();
                    }
                    z = true ^ zM21589b;
                } else {
                    if (x67Var.mo23774d()) {
                        zM21589b = tq7Var.f62738e.m21589b();
                    } else if (x67Var.mo23772b()) {
                        zM21589b = tq7Var.f62737d.m21589b();
                    }
                    z = true ^ zM21589b;
                }
                if (z) {
                    m16750b(x67Var);
                    f50882M.m23974e("Rate limited (per device) - %s", m16749a(x67Var));
                    return;
                }
                c3723wi = f50882M;
                if (x67Var.mo23772b()) {
                    String strM16749a2 = m16749a(x67Var);
                    strM10938H = x67Var.mo23773c().m10938H();
                    zStartsWith = strM10938H.startsWith("_st_");
                    str = this.f50887K;
                    str2 = this.f50886J;
                    if (zStartsWith) {
                        str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/SCREEN_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                    } else {
                        str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/DURATION_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                    }
                    c3723wi.m23974e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strM16749a2, str3);
                } else {
                    c3723wi.m23974e("Logging %s", m16749a(x67Var));
                }
                w63Var = this.f50896h;
                c3723wi2 = w63.f66452d;
                if (w63Var.f66455c == null) {
                    fbaVar = (fba) w63Var.f66454b.get();
                    if (fbaVar != null) {
                        w63Var.f66455c = ((gba) fbaVar).m12466a(w63Var.f66453a, new bs2("proto"), new v63(i));
                    } else {
                        c3723wi2.m23975f("Flg TransportFactory is not available at the moment");
                    }
                }
                hbaVar = w63Var.f66455c;
                if (hbaVar != null) {
                    hbaVar.m13185a(new j40(x67Var, Priority.DEFAULT, null), new uk9(8));
                } else {
                    c3723wi2.m23975f("Unable to dispatch event because Flg Transport is not available");
                }
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                return;
            }
            dh1 dh1Var2 = tq7Var2.f62734a;
            dh1Var2.getClass();
            synchronized (ai1.class) {
                try {
                    if (ai1.f688h == null) {
                        ai1.f688h = new ai1();
                    }
                    ai1Var = ai1.f688h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager3 = dh1Var2.f35642a;
            ai1Var.getClass();
            mz6 mz6Var3 = remoteConfigManager3.getDouble("fpr_vc_trace_sampling_rate");
            if (mz6Var3.m17160b() && dh1.m10380o(((Double) mz6Var3.m17159a()).doubleValue())) {
                dh1Var2.f35644c.m23846d(((Double) mz6Var3.m17159a()).doubleValue(), "com.google.firebase.perf.TraceSamplingRate");
                dDoubleValue2 = ((Double) mz6Var3.m17159a()).doubleValue();
            } else {
                mz6 mz6VarM10382b3 = dh1Var2.m10382b(ai1Var);
                if (mz6VarM10382b3.m17160b() && dh1.m10380o(((Double) mz6VarM10382b3.m17159a()).doubleValue())) {
                    dDoubleValue2 = ((Double) mz6VarM10382b3.m17159a()).doubleValue();
                } else {
                    dDoubleValue2 = dh1Var2.f35642a.isLastFetchFailed() ? 0.001d : 1.0d;
                }
            }
            if (tq7Var2.f62735b < dDoubleValue2 || tq7.m22267a(x67Var.mo23773c().m10939I())) {
                if (x67Var.mo23772b() || !x67Var.mo23773c().m10938H().startsWith("_st_") || !x67Var.mo23773c().m10933B()) {
                    if (x67Var.mo23774d()) {
                        dh1Var = tq7Var2.f62734a;
                        dh1Var.getClass();
                        synchronized (oh1.class) {
                            try {
                                if (oh1.f54337h == null) {
                                    oh1.f54337h = new oh1();
                                }
                                oh1Var = oh1.f54337h;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        RemoteConfigManager remoteConfigManager4 = dh1Var.f35642a;
                        oh1Var.getClass();
                        mz6Var = remoteConfigManager4.getDouble("fpr_vc_network_request_sampling_rate");
                        if (mz6Var.m17160b() || !dh1.m10380o(((Double) mz6Var.m17159a()).doubleValue())) {
                            mz6VarM10382b = dh1Var.m10382b(oh1Var);
                            if (!mz6VarM10382b.m17160b() && dh1.m10380o(((Double) mz6VarM10382b.m17159a()).doubleValue())) {
                                dDoubleValue3 = ((Double) mz6VarM10382b.m17159a()).doubleValue();
                            } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                dDoubleValue3 = 0.001d;
                            }
                        } else {
                            dh1Var.f35644c.m23846d(((Double) mz6Var.m17159a()).doubleValue(), "com.google.firebase.perf.NetworkRequestSamplingRate");
                            dDoubleValue3 = ((Double) mz6Var.m17159a()).doubleValue();
                        }
                        if (tq7Var2.f62735b >= dDoubleValue3) {
                        }
                    }
                    tq7Var = this.f50900l;
                    tq7Var.getClass();
                    i = 0;
                    if ((x67Var.mo23772b() || (!(x67Var.mo23773c().m10938H().equals(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString()) || x67Var.mo23773c().m10938H().equals(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString())) || x67Var.mo23773c().m10934C() <= 0)) && !x67Var.mo23771a()) {
                        if (x67Var.mo23774d()) {
                            zM21589b = tq7Var.f62738e.m21589b();
                        } else if (x67Var.mo23772b()) {
                            zM21589b = tq7Var.f62737d.m21589b();
                        }
                        z = true ^ zM21589b;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m16750b(x67Var);
                        f50882M.m23974e("Rate limited (per device) - %s", m16749a(x67Var));
                        return;
                    }
                    c3723wi = f50882M;
                    if (x67Var.mo23772b()) {
                        String strM16749a3 = m16749a(x67Var);
                        strM10938H = x67Var.mo23773c().m10938H();
                        zStartsWith = strM10938H.startsWith("_st_");
                        str = this.f50887K;
                        str2 = this.f50886J;
                        if (zStartsWith) {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/SCREEN_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        } else {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/DURATION_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        }
                        c3723wi.m23974e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strM16749a3, str3);
                    } else {
                        c3723wi.m23974e("Logging %s", m16749a(x67Var));
                    }
                    w63Var = this.f50896h;
                    c3723wi2 = w63.f66452d;
                    if (w63Var.f66455c == null) {
                        fbaVar = (fba) w63Var.f66454b.get();
                        if (fbaVar != null) {
                            w63Var.f66455c = ((gba) fbaVar).m12466a(w63Var.f66453a, new bs2("proto"), new v63(i));
                        } else {
                            c3723wi2.m23975f("Flg TransportFactory is not available at the moment");
                        }
                    }
                    hbaVar = w63Var.f66455c;
                    if (hbaVar != null) {
                        hbaVar.m13185a(new j40(x67Var, Priority.DEFAULT, null), new uk9(8));
                    } else {
                        c3723wi2.m23975f("Unable to dispatch event because Flg Transport is not available");
                    }
                    SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    return;
                }
                dh1 dh1Var3 = tq7Var2.f62734a;
                dh1Var3.getClass();
                synchronized (lh1.class) {
                    try {
                        if (lh1.f49652h == null) {
                            lh1.f49652h = new lh1();
                        }
                        lh1Var = lh1.f49652h;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                mz6 mz6VarM10387h = dh1Var3.m10387h(lh1Var);
                if (mz6VarM10387h.m17160b()) {
                    dDoubleValue = ((Double) mz6VarM10387h.m17159a()).doubleValue() / 100.0d;
                    if (!dh1.m10380o(dDoubleValue)) {
                        mz6Var2 = dh1Var3.f35642a.getDouble("fpr_vc_fragment_sampling_rate");
                        if (mz6Var2.m17160b() || !dh1.m10380o(((Double) mz6Var2.m17159a()).doubleValue())) {
                            mz6VarM10382b2 = dh1Var3.m10382b(lh1Var);
                            if (mz6VarM10382b2.m17160b() || !dh1.m10380o(((Double) mz6VarM10382b2.m17159a()).doubleValue())) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = ((Double) mz6VarM10382b2.m17159a()).doubleValue();
                            }
                        } else {
                            dh1Var3.f35644c.m23846d(((Double) mz6Var2.m17159a()).doubleValue(), "com.google.firebase.perf.FragmentSamplingRate");
                            dDoubleValue = ((Double) mz6Var2.m17159a()).doubleValue();
                        }
                    }
                } else {
                    mz6Var2 = dh1Var3.f35642a.getDouble("fpr_vc_fragment_sampling_rate");
                    if (mz6Var2.m17160b()) {
                        mz6VarM10382b2 = dh1Var3.m10382b(lh1Var);
                        if (mz6VarM10382b2.m17160b()) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                    } else {
                        mz6VarM10382b2 = dh1Var3.m10382b(lh1Var);
                        if (mz6VarM10382b2.m17160b()) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                    }
                }
                if (tq7Var2.f62736c < dDoubleValue || tq7.m22267a(x67Var.mo23773c().m10939I())) {
                    if (x67Var.mo23774d()) {
                        dh1Var = tq7Var2.f62734a;
                        dh1Var.getClass();
                        synchronized (oh1.class) {
                            if (oh1.f54337h == null) {
                                oh1.f54337h = new oh1();
                            }
                            oh1Var = oh1.f54337h;
                            RemoteConfigManager remoteConfigManager5 = dh1Var.f35642a;
                            oh1Var.getClass();
                            mz6Var = remoteConfigManager5.getDouble("fpr_vc_network_request_sampling_rate");
                            if (mz6Var.m17160b()) {
                                mz6VarM10382b = dh1Var.m10382b(oh1Var);
                                if (!mz6VarM10382b.m17160b()) {
                                    if (dh1Var.f35642a.isLastFetchFailed()) {
                                        dDoubleValue3 = 0.001d;
                                    }
                                } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            } else {
                                mz6VarM10382b = dh1Var.m10382b(oh1Var);
                                if (!mz6VarM10382b.m17160b()) {
                                    if (dh1Var.f35642a.isLastFetchFailed()) {
                                        dDoubleValue3 = 0.001d;
                                    }
                                } else if (dh1Var.f35642a.isLastFetchFailed()) {
                                    dDoubleValue3 = 0.001d;
                                }
                            }
                            if (tq7Var2.f62735b >= dDoubleValue3) {
                            }
                        }
                    }
                    tq7Var = this.f50900l;
                    tq7Var.getClass();
                    i = 0;
                    if (x67Var.mo23772b()) {
                        if (x67Var.mo23774d()) {
                            zM21589b = tq7Var.f62738e.m21589b();
                        } else if (x67Var.mo23772b()) {
                            zM21589b = tq7Var.f62737d.m21589b();
                        }
                        z = true ^ zM21589b;
                    } else {
                        if (x67Var.mo23774d()) {
                            zM21589b = tq7Var.f62738e.m21589b();
                        } else if (x67Var.mo23772b()) {
                            zM21589b = tq7Var.f62737d.m21589b();
                        }
                        z = true ^ zM21589b;
                    }
                    if (z) {
                        m16750b(x67Var);
                        f50882M.m23974e("Rate limited (per device) - %s", m16749a(x67Var));
                        return;
                    }
                    c3723wi = f50882M;
                    if (x67Var.mo23772b()) {
                        String strM16749a4 = m16749a(x67Var);
                        strM10938H = x67Var.mo23773c().m10938H();
                        zStartsWith = strM10938H.startsWith("_st_");
                        str = this.f50887K;
                        str2 = this.f50886J;
                        if (zStartsWith) {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/SCREEN_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        } else {
                            str3 = AbstractC3184kh.m15224r(str, str2) + "/troubleshooting/trace/DURATION_TRACE/" + strM10938H + "?utm_source=perf-android-sdk&utm_medium=android-ide";
                        }
                        c3723wi.m23974e("Logging %s. In a minute, visit the Firebase console to view your data: %s", strM16749a4, str3);
                    } else {
                        c3723wi.m23974e("Logging %s", m16749a(x67Var));
                    }
                    w63Var = this.f50896h;
                    c3723wi2 = w63.f66452d;
                    if (w63Var.f66455c == null) {
                        fbaVar = (fba) w63Var.f66454b.get();
                        if (fbaVar != null) {
                            w63Var.f66455c = ((gba) fbaVar).m12466a(w63Var.f66453a, new bs2("proto"), new v63(i));
                        } else {
                            c3723wi2.m23975f("Flg TransportFactory is not available at the moment");
                        }
                    }
                    hbaVar = w63Var.f66455c;
                    if (hbaVar != null) {
                        hbaVar.m13185a(new j40(x67Var, Priority.DEFAULT, null), new uk9(8));
                    } else {
                        c3723wi2.m23975f("Unable to dispatch event because Flg Transport is not available");
                    }
                    SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                    return;
                }
            }
            m16750b(x67Var);
            f50882M.m23974e("Event dropped due to device sampling - %s", m16749a(x67Var));
            return;
        }
        C3723wi.m23970d().m23971a("No validators found for PerfMetric.");
        f50882M.m23976g("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m16749a(x67Var));
    }

    @Override // p000.InterfaceC3622ts
    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.f50888L = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.f50891c.get()) {
            this.f50897i.execute(new lba(this, 0));
        }
    }
}
