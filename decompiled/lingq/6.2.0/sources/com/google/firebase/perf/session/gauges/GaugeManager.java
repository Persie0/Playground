package com.google.firebase.perf.session.gauges;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.C0021aj;
import p000.C3723wi;
import p000.RunnableC3725wk;
import p000.cd1;
import p000.ck3;
import p000.dh1;
import p000.ds4;
import p000.dw5;
import p000.ek3;
import p000.fk3;
import p000.fp1;
import p000.gk3;
import p000.ik3;
import p000.ip1;
import p000.jk3;
import p000.kaa;
import p000.mba;
import p000.mz6;
import p000.sh1;
import p000.th1;
import p000.vh1;
import p000.wh1;
import p000.yg1;

/* JADX INFO: loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final dh1 configResolver;
    private final ds4 cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final ds4 gaugeManagerExecutor;
    private gk3 gaugeMetadataManager;
    private final ds4 memoryGaugeCollector;
    private String sessionId;
    private final mba transportManager;
    private static final C3723wi logger = C3723wi.m23970d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new ds4(new cd1(5)), mba.f50883N, dh1.m10376e(), null, new ds4(new cd1(6)), new ds4(new cd1(7)));
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long jLongValue;
        int i = ck3.f10190a[applicationProcessState.ordinal()];
        if (i == 1) {
            dh1 dh1Var = this.configResolver;
            dh1Var.getClass();
            sh1 sh1VarM21371i0 = sh1.m21371i0();
            mz6 mz6VarM10388i = dh1Var.m10388i(sh1VarM21371i0);
            if (mz6VarM10388i.m17160b() && dh1.m10379m(((Long) mz6VarM10388i.m17159a()).longValue())) {
                jLongValue = ((Long) mz6VarM10388i.m17159a()).longValue();
            } else {
                mz6 mz6Var = dh1Var.f35642a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (mz6Var.m17160b() && dh1.m10379m(((Long) mz6Var.m17159a()).longValue())) {
                    dh1Var.f35644c.m23847e("com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs", ((Long) mz6Var.m17159a()).longValue());
                    jLongValue = ((Long) mz6Var.m17159a()).longValue();
                } else {
                    mz6 mz6VarM10383c = dh1Var.m10383c(sh1VarM21371i0);
                    jLongValue = (mz6VarM10383c.m17160b() && dh1.m10379m(((Long) mz6VarM10383c.m17159a()).longValue())) ? ((Long) mz6VarM10383c.m17159a()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            dh1 dh1Var2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = dh1Var2.f35642a;
            th1 th1VarM22034i0 = th1.m22034i0();
            mz6 mz6VarM10388i2 = dh1Var2.m10388i(th1VarM22034i0);
            if (mz6VarM10388i2.m17160b() && dh1.m10379m(((Long) mz6VarM10388i2.m17159a()).longValue())) {
                jLongValue = ((Long) mz6VarM10388i2.m17159a()).longValue();
            } else {
                mz6 mz6Var2 = remoteConfigManager.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (mz6Var2.m17160b() && dh1.m10379m(((Long) mz6Var2.m17159a()).longValue())) {
                    dh1Var2.f35644c.m23847e("com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs", ((Long) mz6Var2.m17159a()).longValue());
                    jLongValue = ((Long) mz6Var2.m17159a()).longValue();
                } else {
                    mz6 mz6VarM10383c2 = dh1Var2.m10383c(th1VarM22034i0);
                    if (mz6VarM10383c2.m17160b() && dh1.m10379m(((Long) mz6VarM10383c2.m17159a()).longValue())) {
                        jLongValue = ((Long) mz6VarM10383c2.m17159a()).longValue();
                    } else {
                        jLongValue = remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        }
        return fp1.m11980b(jLongValue) ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private fk3 getGaugeMetadata() {
        ek3 ek3VarM11924x = fk3.m11924x();
        gk3 gk3Var = this.gaugeMetadataManager;
        gk3Var.getClass();
        StorageUnit storageUnit = StorageUnit.BYTES;
        ek3VarM11924x.m11205i(kaa.m15043e(storageUnit.toKilobytes(gk3Var.f40910c.totalMem)));
        gk3 gk3Var2 = this.gaugeMetadataManager;
        gk3Var2.getClass();
        ek3VarM11924x.m11206j(kaa.m15043e(storageUnit.toKilobytes(gk3Var2.f40908a.maxMemory())));
        gk3 gk3Var3 = this.gaugeMetadataManager;
        gk3Var3.getClass();
        ek3VarM11924x.m11207k(kaa.m15043e(StorageUnit.MEGABYTES.toKilobytes(gk3Var3.f40909b.getMemoryClass())));
        return (fk3) ek3VarM11924x.m22766g();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long jLongValue;
        int i = ck3.f10190a[applicationProcessState.ordinal()];
        if (i == 1) {
            dh1 dh1Var = this.configResolver;
            dh1Var.getClass();
            vh1 vh1VarM23285i0 = vh1.m23285i0();
            mz6 mz6VarM10388i = dh1Var.m10388i(vh1VarM23285i0);
            if (mz6VarM10388i.m17160b() && dh1.m10379m(((Long) mz6VarM10388i.m17159a()).longValue())) {
                jLongValue = ((Long) mz6VarM10388i.m17159a()).longValue();
            } else {
                mz6 mz6Var = dh1Var.f35642a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (mz6Var.m17160b() && dh1.m10379m(((Long) mz6Var.m17159a()).longValue())) {
                    dh1Var.f35644c.m23847e("com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs", ((Long) mz6Var.m17159a()).longValue());
                    jLongValue = ((Long) mz6Var.m17159a()).longValue();
                } else {
                    mz6 mz6VarM10383c = dh1Var.m10383c(vh1VarM23285i0);
                    jLongValue = (mz6VarM10383c.m17160b() && dh1.m10379m(((Long) mz6VarM10383c.m17159a()).longValue())) ? ((Long) mz6VarM10383c.m17159a()).longValue() : 0L;
                }
            }
        } else if (i != 2) {
            jLongValue = -1;
        } else {
            dh1 dh1Var2 = this.configResolver;
            RemoteConfigManager remoteConfigManager = dh1Var2.f35642a;
            wh1 wh1VarM23951i0 = wh1.m23951i0();
            mz6 mz6VarM10388i2 = dh1Var2.m10388i(wh1VarM23951i0);
            if (mz6VarM10388i2.m17160b() && dh1.m10379m(((Long) mz6VarM10388i2.m17159a()).longValue())) {
                jLongValue = ((Long) mz6VarM10388i2.m17159a()).longValue();
            } else {
                mz6 mz6Var2 = remoteConfigManager.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (mz6Var2.m17160b() && dh1.m10379m(((Long) mz6Var2.m17159a()).longValue())) {
                    dh1Var2.f35644c.m23847e("com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs", ((Long) mz6Var2.m17159a()).longValue());
                    jLongValue = ((Long) mz6Var2.m17159a()).longValue();
                } else {
                    mz6 mz6VarM10383c2 = dh1Var2.m10383c(wh1VarM23951i0);
                    if (mz6VarM10383c2.m17160b() && dh1.m10379m(((Long) mz6VarM10383c2.m17159a()).longValue())) {
                        jLongValue = ((Long) mz6VarM10383c2.m17159a()).longValue();
                    } else {
                        jLongValue = remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        }
        return dw5.m10693b(jLongValue) ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fp1 lambda$new$0() {
        return new fp1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dw5 lambda$new$1() {
        return new dw5();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m23971a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((fp1) this.cpuGaugeCollector.get()).m11983d(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m23971a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((dw5) this.memoryGaugeCollector.get()).m10696d(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        ik3 ik3VarM14511D = jk3.m14511D();
        while (!((fp1) this.cpuGaugeCollector.get()).f39406a.isEmpty()) {
            ik3VarM14511D.m13992j((ip1) ((fp1) this.cpuGaugeCollector.get()).f39406a.poll());
        }
        while (!((dw5) this.memoryGaugeCollector.get()).f36318b.isEmpty()) {
            ik3VarM14511D.m13991i((C0021aj) ((dw5) this.memoryGaugeCollector.get()).f36318b.poll());
        }
        ik3VarM14511D.m13994l(str);
        mba mbaVar = this.transportManager;
        mbaVar.f50897i.execute(new RunnableC3725wk(mbaVar, (jk3) ik3VarM14511D.m22766g(), applicationProcessState, 17));
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((fp1) this.cpuGaugeCollector.get(), (dw5) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new gk3(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        ik3 ik3VarM14511D = jk3.m14511D();
        ik3VarM14511D.m13994l(str);
        ik3VarM14511D.m13993k(getGaugeMetadata());
        jk3 jk3Var = (jk3) ik3VarM14511D.m22766g();
        mba mbaVar = this.transportManager;
        mbaVar.f50897i.execute(new RunnableC3725wk(mbaVar, jk3Var, applicationProcessState, 17));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.f13785b);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m23975f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.f13784a;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new RunnableC3725wk(this, str, applicationProcessState, 10), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.m23975f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        ((fp1) this.cpuGaugeCollector.get()).m11984e();
        ((dw5) this.memoryGaugeCollector.get()).m10697e();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new yg1(this, str, applicationProcessState, 2), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(fp1 fp1Var, dw5 dw5Var, Timer timer) {
        fp1Var.m11981a(timer);
        dw5Var.m10694a(timer);
    }

    public GaugeManager(ds4 ds4Var, mba mbaVar, dh1 dh1Var, gk3 gk3Var, ds4 ds4Var2, ds4 ds4Var3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = ds4Var;
        this.transportManager = mbaVar;
        this.configResolver = dh1Var;
        this.gaugeMetadataManager = gk3Var;
        this.cpuGaugeCollector = ds4Var2;
        this.memoryGaugeCollector = ds4Var3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
