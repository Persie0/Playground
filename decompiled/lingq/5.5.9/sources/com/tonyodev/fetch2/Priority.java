package com.tonyodev.fetch2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m13365d2 = {"Lcom/tonyodev/fetch2/Priority;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "HIGH", "NORMAL", "LOW", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum Priority {
    HIGH(1),
    NORMAL(0),
    LOW(-1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.Priority$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Priority m10596a(int i10) {
            if (i10 == -1) {
                return Priority.LOW;
            }
            if (i10 != 0 && i10 == 1) {
                return Priority.HIGH;
            }
            return Priority.NORMAL;
        }
    }

    Priority(int i10) {
        this.value = i10;
    }

    public static final Priority valueOf(int i10) {
        INSTANCE.getClass();
        return Companion.m10596a(i10);
    }

    public final int getValue() {
        return this.value;
    }
}
