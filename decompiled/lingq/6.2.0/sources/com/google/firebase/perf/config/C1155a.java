package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.Map;
import p000.omd;

/* JADX INFO: renamed from: com.google.firebase.perf.config.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1155a extends omd {

    /* JADX INFO: renamed from: h */
    public static C1155a f13740h;

    /* JADX INFO: renamed from: i */
    public static final Map f13741i;

    static {
        ConfigurationConstants$LogSourceName$1 configurationConstants$LogSourceName$1 = new ConfigurationConstants$LogSourceName$1();
        configurationConstants$LogSourceName$1.put(461L, "FIREPERF_AUTOPUSH");
        configurationConstants$LogSourceName$1.put(462L, "FIREPERF");
        configurationConstants$LogSourceName$1.put(675L, "FIREPERF_INTERNAL_LOW");
        configurationConstants$LogSourceName$1.put(676L, "FIREPERF_INTERNAL_HIGH");
        f13741i = Collections.unmodifiableMap(configurationConstants$LogSourceName$1);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: I */
    public final String mo433I() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
