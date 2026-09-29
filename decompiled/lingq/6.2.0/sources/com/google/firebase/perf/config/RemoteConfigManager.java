package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.concurrent.AbstractC1145a;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchType;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C3723wi;
import p000.eh1;
import p000.h58;
import p000.ho2;
import p000.i58;
import p000.k53;
import p000.kh1;
import p000.l53;
import p000.mz6;
import p000.n53;
import p000.o53;
import p000.qg1;
import p000.tg1;
import p000.uo7;
import p000.wc2;
import p000.xg1;

/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, n53> allRcConfigMap;
    private final wc2 cache;
    private final Executor executor;
    private l53 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private uo7 firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final C3723wi logger = C3723wi.m23970d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    private RemoteConfigManager() {
        this(wc2.m23844b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + MIN_CONFIG_FETCH_DELAY_MS);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private n53 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        n53 n53Var = this.allRcConfigMap.get(str);
        if (((o53) n53Var).f53860b != 2) {
            return null;
        }
        logger.m23972b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((o53) n53Var).m17806d(), str);
        return n53Var;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m6723xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m15811a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m6724xc904e814(Exception exc) {
        logger.m23976g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        l53 l53Var = this.firebaseRemoteConfig;
        xg1 xg1Var = l53Var.f49076e;
        long j = ((eh1) xg1Var.f68172g).f37250a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap((Map) xg1Var.f68173h);
        map.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler$FetchType.BASE.getValue() + "/1");
        ((qg1) xg1Var.f68170e).m19940b().mo5965g((Executor) xg1Var.f68168c, new tg1(xg1Var, j, map)).mo5972n(AbstractC1145a.m6669a(), new ho2(26)).mo5972n(l53Var.f49073b, new k53(l53Var)).mo5963e(this.executor, new i58(this)).mo5962d(this.executor, new i58(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m15811a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public mz6 getBoolean(String str) {
        if (str == null) {
            logger.m23971a("The key to get Remote Config boolean value is null.");
            return new mz6();
        }
        n53 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new mz6(Boolean.valueOf(((o53) remoteConfigValue).m17803a()));
            } catch (IllegalArgumentException unused) {
                o53 o53Var = (o53) remoteConfigValue;
                if (!o53Var.m17806d().isEmpty()) {
                    logger.m23972b("Could not parse value: '%s' for key: '%s'.", o53Var.m17806d(), str);
                }
            }
        }
        return new mz6();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public mz6 getDouble(String str) {
        if (str == null) {
            logger.m23971a("The key to get Remote Config double value is null.");
            return new mz6();
        }
        n53 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new mz6(Double.valueOf(((o53) remoteConfigValue).m17804b()));
            } catch (IllegalArgumentException unused) {
                o53 o53Var = (o53) remoteConfigValue;
                if (!o53Var.m17806d().isEmpty()) {
                    logger.m23972b("Could not parse value: '%s' for key: '%s'.", o53Var.m17806d(), str);
                }
            }
        }
        return new mz6();
    }

    public mz6 getLong(String str) {
        if (str == null) {
            logger.m23971a("The key to get Remote Config long value is null.");
            return new mz6();
        }
        n53 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new mz6(Long.valueOf(((o53) remoteConfigValue).m17805c()));
            } catch (IllegalArgumentException unused) {
                o53 o53Var = (o53) remoteConfigValue;
                if (!o53Var.m17806d().isEmpty()) {
                    logger.m23972b("Could not parse value: '%s' for key: '%s'.", o53Var.m17806d(), str);
                }
            }
        }
        return new mz6();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        n53 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(((o53) remoteConfigValue).m17803a());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(((o53) remoteConfigValue).m17804b());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) ((o53) remoteConfigValue).m17806d();
                    }
                    T t2 = (T) ((o53) remoteConfigValue).m17806d();
                    try {
                        logger.m23972b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        o53 o53Var = (o53) remoteConfigValue;
                        if (!o53Var.m17806d().isEmpty()) {
                            logger.m23972b("Could not parse value: '%s' for key: '%s'.", o53Var.m17806d(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(((o53) remoteConfigValue).m17805c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public mz6 getString(String str) {
        if (str == null) {
            logger.m23971a("The key to get Remote Config String value is null.");
            return new mz6();
        }
        n53 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new mz6(((o53) remoteConfigValue).m17806d()) : new mz6();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        uo7 uo7Var;
        h58 h58Var;
        if (this.firebaseRemoteConfig == null && (uo7Var = this.firebaseRemoteConfigProvider) != null && (h58Var = (h58) uo7Var.get()) != null) {
            this.firebaseRemoteConfig = h58Var.m13058b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        l53 l53Var = this.firebaseRemoteConfig;
        return l53Var == null || l53Var.m15812b().f54464a == 1 || this.firebaseRemoteConfig.m15812b().f54464a == 2;
    }

    public void setFirebaseRemoteConfigProvider(uo7 uo7Var) {
        this.firebaseRemoteConfigProvider = uo7Var;
    }

    public void syncConfigValues(Map<String, n53> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        kh1 kh1VarM15232i0 = kh1.m15232i0();
        ConcurrentHashMap<String, n53> concurrentHashMap = this.allRcConfigMap;
        kh1VarM15232i0.getClass();
        n53 n53Var = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (n53Var == null) {
            logger.m23971a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.m23849g("com.google.firebase.perf.ExperimentTTID", ((o53) n53Var).m17803a());
        } catch (Exception unused) {
            logger.m23971a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(wc2 wc2Var, Executor executor, l53 l53Var, long j) {
        ConcurrentHashMap<String, n53> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = wc2Var;
        this.executor = executor;
        this.firebaseRemoteConfig = l53Var;
        if (l53Var == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(l53Var.m15811a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
