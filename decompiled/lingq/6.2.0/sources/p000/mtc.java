package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.PlaylistEntity;
import com.lingq.core.network.api.result.ResultPlaylistFolder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mtc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51839a = new C0282a(-2130068116, false, new je1(12));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51840b = new C0282a(1916004556, false, new je1(13));

    /* JADX INFO: renamed from: a */
    public static final PlaylistEntity m17048a(ResultPlaylistFolder resultPlaylistFolder, String str, int i) {
        resultPlaylistFolder.getClass();
        str.getClass();
        return new PlaylistEntity(resultPlaylistFolder.f21460a, i, vz1.m23629f(resultPlaylistFolder.f21461b, str), str, resultPlaylistFolder.f21461b, resultPlaylistFolder.f21462c, resultPlaylistFolder.f21463d);
    }
}
