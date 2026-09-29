package com.tonyodev.fetch2core;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m13365d2 = {"Lcom/tonyodev/fetch2core/Reason;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "NOT_SPECIFIED", "DOWNLOAD_ADDED", "DOWNLOAD_QUEUED", "DOWNLOAD_STARTED", "DOWNLOAD_WAITING_ON_NETWORK", "DOWNLOAD_PROGRESS_CHANGED", "DOWNLOAD_COMPLETED", "DOWNLOAD_ERROR", "DOWNLOAD_PAUSED", "DOWNLOAD_RESUMED", "DOWNLOAD_CANCELLED", "DOWNLOAD_REMOVED", "DOWNLOAD_DELETED", "DOWNLOAD_BLOCK_UPDATED", "OBSERVER_ATTACHED", "REPORTING", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum Reason {
    NOT_SPECIFIED(0),
    DOWNLOAD_ADDED(1),
    DOWNLOAD_QUEUED(2),
    DOWNLOAD_STARTED(3),
    DOWNLOAD_WAITING_ON_NETWORK(4),
    DOWNLOAD_PROGRESS_CHANGED(5),
    DOWNLOAD_COMPLETED(6),
    DOWNLOAD_ERROR(7),
    DOWNLOAD_PAUSED(8),
    DOWNLOAD_RESUMED(9),
    DOWNLOAD_CANCELLED(10),
    DOWNLOAD_REMOVED(11),
    DOWNLOAD_DELETED(12),
    DOWNLOAD_BLOCK_UPDATED(13),
    OBSERVER_ATTACHED(14),
    REPORTING(15);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.Reason$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    Reason(int i10) {
        this.value = i10;
    }

    public static final Reason valueOf(int i10) {
        INSTANCE.getClass();
        switch (i10) {
            case 1:
                return DOWNLOAD_ADDED;
            case 2:
                return DOWNLOAD_QUEUED;
            case 3:
                return DOWNLOAD_STARTED;
            case 4:
                return DOWNLOAD_WAITING_ON_NETWORK;
            case 5:
                return DOWNLOAD_PROGRESS_CHANGED;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return DOWNLOAD_COMPLETED;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return DOWNLOAD_ERROR;
            case 8:
                return DOWNLOAD_PAUSED;
            case 9:
                return DOWNLOAD_RESUMED;
            case 10:
                return DOWNLOAD_CANCELLED;
            case 11:
                return DOWNLOAD_REMOVED;
            case 12:
                return DOWNLOAD_DELETED;
            case 13:
                return DOWNLOAD_BLOCK_UPDATED;
            case 14:
                return OBSERVER_ATTACHED;
            case 15:
                return REPORTING;
            default:
                return NOT_SPECIFIED;
        }
    }

    public final int getValue() {
        return this.value;
    }
}
