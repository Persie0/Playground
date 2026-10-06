package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hny {

    /* JADX INFO: renamed from: a */
    private hnv f28549a;

    /* JADX INFO: renamed from: b */
    private Runnable f28550b;

    /* JADX INFO: renamed from: c */
    private Runnable f28551c;

    /* JADX INFO: renamed from: d */
    private Executor f28552d;

    /* JADX INFO: renamed from: e */
    private String f28553e;

    public hny() {
    }

    public hny(hnz hnzVar) {
        this.f28549a = hnzVar.f28555b;
        this.f28550b = hnzVar.f28556c;
        this.f28551c = hnzVar.f28557d;
        this.f28552d = hnzVar.f28558e;
        this.f28553e = hnzVar.f28559f;
    }

    /* JADX INFO: renamed from: a */
    public final hnz m10522a() {
        Runnable runnable;
        Runnable runnable2;
        Executor executor;
        String str;
        lku.m15607B(m10523b().m10520a(hnv.HEAT_LIGHT), "Cannot disable feature at NORMAL or lower, threshold = %s", m10523b());
        String str2 = this.f28553e;
        if (str2 == null) {
            throw new IllegalStateException("Property \"featureName\" has not been set");
        }
        lku.m15670x(!mro.m16832b(str2), "featureName cannot be blank.");
        hnv hnvVar = this.f28549a;
        if (hnvVar != null && (runnable = this.f28550b) != null && (runnable2 = this.f28551c) != null && (executor = this.f28552d) != null && (str = this.f28553e) != null) {
            return new hnz(hnvVar, runnable, runnable2, executor, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f28549a == null) {
            sb.append(" threshold");
        }
        if (this.f28550b == null) {
            sb.append(" onEnable");
        }
        if (this.f28551c == null) {
            sb.append(" onDisable");
        }
        if (this.f28552d == null) {
            sb.append(yTyWiTtGtnBhy.WakBWInXKk);
        }
        if (this.f28553e == null) {
            sb.append(" featureName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final hnv m10523b() {
        hnv hnvVar = this.f28549a;
        if (hnvVar != null) {
            return hnvVar;
        }
        throw new IllegalStateException("Property \"threshold\" has not been set");
    }

    /* JADX INFO: renamed from: c */
    public final void m10524c(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        this.f28552d = executor;
    }

    /* JADX INFO: renamed from: d */
    public final void m10525d(String str) {
        if (str == null) {
            throw new NullPointerException("Null featureName");
        }
        this.f28553e = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m10526e(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onDisable");
        }
        this.f28551c = runnable;
    }

    /* JADX INFO: renamed from: f */
    public final void m10527f(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onEnable");
        }
        this.f28550b = runnable;
    }

    /* JADX INFO: renamed from: g */
    public final void m10528g(hnv hnvVar) {
        if (hnvVar == null) {
            throw new NullPointerException("Null threshold");
        }
        this.f28549a = hnvVar;
    }
}
