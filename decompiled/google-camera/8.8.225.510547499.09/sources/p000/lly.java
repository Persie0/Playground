package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lly {

    /* JADX INFO: renamed from: a */
    public static final nbh f38633a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector");

    /* JADX INFO: renamed from: b */
    public final oju f38634b;

    static {
        mxk.m17139K("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        Pattern.compile("([^\\?]+)(\\?+)");
        Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        Pattern.compile("([a-zA-Z0-9-_]+)");
        Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public lly(oju ojuVar) {
        this.f38634b = ojuVar;
    }
}
