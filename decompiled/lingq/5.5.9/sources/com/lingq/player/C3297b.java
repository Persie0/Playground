package com.lingq.player;

import androidx.activity.result.C0204c;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.lingq.player.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3297b {

    /* JADX INFO: renamed from: a */
    public final PlayerContentController.PlayerContentItem f17748a;

    /* JADX INFO: renamed from: b */
    public final long f17749b;

    /* JADX INFO: renamed from: c */
    public final int f17750c;

    /* JADX INFO: renamed from: d */
    public final long f17751d;

    public C3297b() {
        this(0);
    }

    public /* synthetic */ C3297b(int i10) {
        this(null, 0L, 0, 0L);
    }

    public C3297b(PlayerContentController.PlayerContentItem playerContentItem, long j10, int i10, long j11) {
        this.f17748a = playerContentItem;
        this.f17749b = j10;
        this.f17750c = i10;
        this.f17751d = j11;
    }

    /* JADX INFO: renamed from: a */
    public static C3297b m9431a(C3297b c3297b, long j10, int i10, int i11) {
        PlayerContentController.PlayerContentItem playerContentItem = (i11 & 1) != 0 ? c3297b.f17748a : null;
        if ((i11 & 2) != 0) {
            j10 = c3297b.f17749b;
        }
        long j11 = j10;
        if ((i11 & 4) != 0) {
            i10 = c3297b.f17750c;
        }
        int i12 = i10;
        long j12 = (i11 & 8) != 0 ? c3297b.f17751d : 0L;
        c3297b.getClass();
        return new C3297b(playerContentItem, j11, i12, j12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3297b)) {
            return false;
        }
        C3297b c3297b = (C3297b) obj;
        if (C5207g.m11106a(this.f17748a, c3297b.f17748a) && this.f17749b == c3297b.f17749b && this.f17750c == c3297b.f17750c && this.f17751d == c3297b.f17751d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        PlayerContentController.PlayerContentItem playerContentItem = this.f17748a;
        return Long.hashCode(this.f17751d) + C0009a.m16d(this.f17750c, C0204c.m847f(this.f17749b, (playerContentItem == null ? 0 : playerContentItem.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "PlayerDataState(track=" + this.f17748a + ", duration=" + this.f17749b + ", currentPosition=" + this.f17750c + ", bufferedPosition=" + this.f17751d + ")";
    }
}
