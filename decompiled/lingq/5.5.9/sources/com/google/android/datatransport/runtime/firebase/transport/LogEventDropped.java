package com.google.android.datatransport.runtime.firebase.transport;

import ye.InterfaceC10353b;

/* JADX INFO: loaded from: classes.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: a */
    public final long f11778a;

    /* JADX INFO: renamed from: b */
    public final Reason f11779b;

    public enum Reason implements InterfaceC10353b {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i10) {
            this.number_ = i10;
        }

        @Override // ye.InterfaceC10353b
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        Reason reason = Reason.REASON_UNKNOWN;
    }

    public LogEventDropped(long j10, Reason reason) {
        this.f11778a = j10;
        this.f11779b = reason;
    }
}
