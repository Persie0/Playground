package com.facebook.appevents.p008ml;

import p000.gm5;
import p000.v06;

/* JADX INFO: loaded from: classes2.dex */
public enum ModelManager$Task {
    MTML_INTEGRITY_DETECT,
    MTML_APP_EVENT_PREDICTION;

    public final String toKey() {
        int i = v06.f64659a[ordinal()];
        if (i == 1) {
            return "integrity_detect";
        }
        if (i == 2) {
            return "app_event_pred";
        }
        gm5.m12750e();
        return null;
    }

    public final String toUseCase() {
        int i = v06.f64659a[ordinal()];
        if (i == 1) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (i == 2) {
            return "MTML_APP_EVENT_PRED";
        }
        gm5.m12750e();
        return null;
    }
}
