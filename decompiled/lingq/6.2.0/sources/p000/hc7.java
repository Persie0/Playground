package p000;

import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayerViewState;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class hc7 {

    /* JADX INFO: renamed from: a */
    public final PlayerType f42173a;

    /* JADX INFO: renamed from: b */
    public final PlayerState f42174b;

    /* JADX INFO: renamed from: c */
    public final PlayerViewState f42175c;

    /* JADX INFO: renamed from: d */
    public final long f42176d;

    /* JADX INFO: renamed from: e */
    public final int f42177e;

    /* JADX INFO: renamed from: f */
    public final long f42178f;

    /* JADX INFO: renamed from: g */
    public final boolean f42179g;

    /* JADX INFO: renamed from: h */
    public final boolean f42180h;

    /* JADX INFO: renamed from: i */
    public final ac7 f42181i;

    /* JADX INFO: renamed from: j */
    public final tb7 f42182j;

    /* JADX INFO: renamed from: k */
    public final boolean f42183k;

    /* JADX INFO: renamed from: l */
    public final List f42184l;

    /* JADX INFO: renamed from: m */
    public final tb7 f42185m;

    public /* synthetic */ hc7(List list, tb7 tb7Var, int i) {
        this(PlayerType.Undefined, PlayerState.Paused, PlayerViewState.Closed, 0L, 0, 0L, false, false, new ac7(), null, false, (i & 2048) != 0 ? EmptyList.f47638a : list, (i & 4096) != 0 ? null : tb7Var);
    }

    /* JADX INFO: renamed from: a */
    public static hc7 m13196a(hc7 hc7Var, PlayerType playerType, PlayerState playerState, PlayerViewState playerViewState, long j, int i, long j2, boolean z, boolean z2, ac7 ac7Var, tb7 tb7Var, boolean z3, List list, tb7 tb7Var2, int i2) {
        PlayerType playerType2 = (i2 & 1) != 0 ? hc7Var.f42173a : playerType;
        PlayerState playerState2 = (i2 & 2) != 0 ? hc7Var.f42174b : playerState;
        PlayerViewState playerViewState2 = (i2 & 4) != 0 ? hc7Var.f42175c : playerViewState;
        long j3 = (i2 & 8) != 0 ? hc7Var.f42176d : j;
        int i3 = (i2 & 16) != 0 ? hc7Var.f42177e : i;
        long j4 = (i2 & 32) != 0 ? hc7Var.f42178f : j2;
        boolean z4 = (i2 & 64) != 0 ? hc7Var.f42179g : z;
        boolean z5 = (i2 & 128) != 0 ? hc7Var.f42180h : z2;
        ac7 ac7Var2 = (i2 & 256) != 0 ? hc7Var.f42181i : ac7Var;
        tb7 tb7Var3 = (i2 & 512) != 0 ? hc7Var.f42182j : tb7Var;
        boolean z6 = (i2 & 1024) != 0 ? hc7Var.f42183k : z3;
        List list2 = (i2 & 2048) != 0 ? hc7Var.f42184l : list;
        tb7 tb7Var4 = (i2 & 4096) != 0 ? hc7Var.f42185m : tb7Var2;
        hc7Var.getClass();
        playerType2.getClass();
        playerState2.getClass();
        playerViewState2.getClass();
        ac7Var2.getClass();
        list2.getClass();
        return new hc7(playerType2, playerState2, playerViewState2, j3, i3, j4, z4, z5, ac7Var2, tb7Var3, z6, list2, tb7Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc7)) {
            return false;
        }
        hc7 hc7Var = (hc7) obj;
        return this.f42173a == hc7Var.f42173a && this.f42174b == hc7Var.f42174b && this.f42175c == hc7Var.f42175c && this.f42176d == hc7Var.f42176d && this.f42177e == hc7Var.f42177e && this.f42178f == hc7Var.f42178f && this.f42179g == hc7Var.f42179g && this.f42180h == hc7Var.f42180h && fa4.m11650l(this.f42181i, hc7Var.f42181i) && fa4.m11650l(this.f42182j, hc7Var.f42182j) && this.f42183k == hc7Var.f42183k && fa4.m11650l(this.f42184l, hc7Var.f42184l) && fa4.m11650l(this.f42185m, hc7Var.f42185m);
    }

    public final int hashCode() {
        int iHashCode = (this.f42181i.hashCode() + g9a.m12428e(g9a.m12428e(ux5.m22981d(this.f42178f, wq1.m24106b(this.f42177e, ux5.m22981d(this.f42176d, (this.f42175c.hashCode() + ((this.f42174b.hashCode() + (this.f42173a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31, this.f42179g), 31, this.f42180h)) * 31;
        tb7 tb7Var = this.f42182j;
        int iM22979b = ux5.m22979b(g9a.m12428e((iHashCode + (tb7Var == null ? 0 : tb7Var.hashCode())) * 31, 31, this.f42183k), 31, this.f42184l);
        tb7 tb7Var2 = this.f42185m;
        return iM22979b + (tb7Var2 != null ? tb7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerUiState(playerType=" + this.f42173a + ", playerState=" + this.f42174b + ", viewState=" + this.f42175c + ", duration=" + this.f42176d + ", currentPosition=" + this.f42177e + ", bufferedPosition=" + this.f42178f + ", isRandomActive=" + this.f42179g + ", isLoopActive=" + this.f42180h + ", playbackSpeed=" + this.f42181i + ", contentItem=" + this.f42182j + ", shouldSeek=" + this.f42183k + ", playingTracks=" + this.f42184l + ", selectedTrack=" + this.f42185m + ")";
    }

    public hc7(PlayerType playerType, PlayerState playerState, PlayerViewState playerViewState, long j, int i, long j2, boolean z, boolean z2, ac7 ac7Var, tb7 tb7Var, boolean z3, List list, tb7 tb7Var2) {
        playerType.getClass();
        playerState.getClass();
        playerViewState.getClass();
        list.getClass();
        this.f42173a = playerType;
        this.f42174b = playerState;
        this.f42175c = playerViewState;
        this.f42176d = j;
        this.f42177e = i;
        this.f42178f = j2;
        this.f42179g = z;
        this.f42180h = z2;
        this.f42181i = ac7Var;
        this.f42182j = tb7Var;
        this.f42183k = z3;
        this.f42184l = list;
        this.f42185m = tb7Var2;
    }
}
