package p000;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.Pair;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes2.dex */
public final class bf7 implements af7 {

    /* JADX INFO: renamed from: a */
    public final C3211a f8474a;

    /* JADX INFO: renamed from: b */
    public final C3211a f8475b;

    /* JADX INFO: renamed from: c */
    public final C3211a f8476c;

    /* JADX INFO: renamed from: d */
    public final du0 f8477d;

    /* JADX INFO: renamed from: e */
    public final du0 f8478e;

    /* JADX INFO: renamed from: f */
    public final du0 f8479f;

    public bf7() {
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f8474a = c3211aM7042a;
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f8475b = c3211aM7042a2;
        C3211a c3211aM7042a3 = AbstractC1261a.m7042a();
        this.f8476c = c3211aM7042a3;
        this.f8477d = AbstractC3224d.m15519A(c3211aM7042a);
        this.f8478e = AbstractC3224d.m15519A(c3211aM7042a2);
        this.f8479f = AbstractC3224d.m15519A(c3211aM7042a3);
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: V1 */
    public final void mo343V1(Playlist playlist) {
        playlist.getClass();
        this.f8476c.mo4677k(playlist);
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: f2 */
    public final void mo344f2(Playlist playlist) {
        playlist.getClass();
        this.f8475b.mo4677k(playlist);
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: m2 */
    public final c83 mo345m2() {
        return this.f8479f;
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: t1 */
    public final c83 mo346t1() {
        return this.f8478e;
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x */
    public final c83 mo347x() {
        return this.f8477d;
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x0 */
    public final void mo348x0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8474a.mo4677k(new Pair(str, str2));
    }
}
