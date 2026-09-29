package com.lingq.player;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import sh.C9009e;

/* JADX INFO: renamed from: com.lingq.player.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3296a {

    /* JADX INFO: renamed from: a */
    public final C3300e f17739a;

    /* JADX INFO: renamed from: b */
    public final boolean f17740b;

    /* JADX INFO: renamed from: c */
    public final boolean f17741c;

    /* JADX INFO: renamed from: d */
    public final C9009e f17742d;

    /* JADX INFO: renamed from: e */
    public final int f17743e;

    /* JADX INFO: renamed from: f */
    public final int f17744f;

    /* JADX INFO: renamed from: g */
    public final int f17745g;

    /* JADX INFO: renamed from: h */
    public final PlayerContentController.PlayerContentItem f17746h;

    /* JADX INFO: renamed from: i */
    public final boolean f17747i;

    public C3296a() {
        this(0);
    }

    public /* synthetic */ C3296a(int i10) {
        this(new C3300e(0), false, false, new C9009e(0), 0, 0, 0, null, false);
    }

    public C3296a(C3300e c3300e, boolean z10, boolean z11, C9009e c9009e, int i10, int i11, int i12, PlayerContentController.PlayerContentItem playerContentItem, boolean z12) {
        C5207g.m11111f(c3300e, "playerState");
        C5207g.m11111f(c9009e, "playbackSpeed");
        this.f17739a = c3300e;
        this.f17740b = z10;
        this.f17741c = z11;
        this.f17742d = c9009e;
        this.f17743e = i10;
        this.f17744f = i11;
        this.f17745g = i12;
        this.f17746h = playerContentItem;
        this.f17747i = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3296a)) {
            return false;
        }
        C3296a c3296a = (C3296a) obj;
        if (C5207g.m11106a(this.f17739a, c3296a.f17739a) && this.f17740b == c3296a.f17740b && this.f17741c == c3296a.f17741c && C5207g.m11106a(this.f17742d, c3296a.f17742d) && this.f17743e == c3296a.f17743e && this.f17744f == c3296a.f17744f && this.f17745g == c3296a.f17745g && C5207g.m11106a(this.f17746h, c3296a.f17746h) && this.f17747i == c3296a.f17747i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public final int hashCode() {
        int iHashCode = this.f17739a.hashCode() * 31;
        ?? r10 = 1;
        boolean z10 = this.f17740b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        boolean z11 = this.f17741c;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int iM16d = C0009a.m16d(this.f17745g, C0009a.m16d(this.f17744f, C0009a.m16d(this.f17743e, (this.f17742d.hashCode() + ((i10 + r12) * 31)) * 31, 31), 31), 31);
        PlayerContentController.PlayerContentItem playerContentItem = this.f17746h;
        int iHashCode2 = (iM16d + (playerContentItem == null ? 0 : playerContentItem.hashCode())) * 31;
        boolean z12 = this.f17747i;
        if (!z12) {
            r10 = z12;
        }
        return iHashCode2 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayerUpdateViewsState(playerState=");
        sb2.append(this.f17739a);
        sb2.append(", isRandomActive=");
        sb2.append(this.f17740b);
        sb2.append(", isLoopActive=");
        sb2.append(this.f17741c);
        sb2.append(", playbackSpeed=");
        sb2.append(this.f17742d);
        sb2.append(", duration=");
        sb2.append(this.f17743e);
        sb2.append(", currentPosition=");
        sb2.append(this.f17744f);
        sb2.append(", bufferedPosition=");
        sb2.append(this.f17745g);
        sb2.append(", contentItem=");
        sb2.append(this.f17746h);
        sb2.append(", shouldSeek=");
        return C0166e.m769p(sb2, this.f17747i, ")");
    }
}
