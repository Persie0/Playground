package com.tonyodev.fetch2;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m13365d2 = {"Lcom/tonyodev/fetch2/Status;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "NONE", "QUEUED", "DOWNLOADING", "PAUSED", "COMPLETED", "CANCELLED", "FAILED", "REMOVED", "DELETED", "ADDED", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum Status {
    NONE(0),
    QUEUED(1),
    DOWNLOADING(2),
    PAUSED(3),
    COMPLETED(4),
    CANCELLED(5),
    FAILED(6),
    REMOVED(7),
    DELETED(8),
    ADDED(9);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.Status$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Status m10597a(int i10) {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return Status.NONE;
                case 1:
                    return Status.QUEUED;
                case 2:
                    return Status.DOWNLOADING;
                case 3:
                    return Status.PAUSED;
                case 4:
                    return Status.COMPLETED;
                case 5:
                    return Status.CANCELLED;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return Status.FAILED;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return Status.REMOVED;
                case 8:
                    return Status.DELETED;
                case 9:
                    return Status.ADDED;
                default:
                    return Status.NONE;
            }
        }
    }

    Status(int i10) {
        this.value = i10;
    }

    public static final Status valueOf(int i10) {
        INSTANCE.getClass();
        return Companion.m10597a(i10);
    }

    public final int getValue() {
        return this.value;
    }
}
