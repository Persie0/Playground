package p196ja;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.C2491d;
import com.google.android.exoplayer2.upstream.C2529c;
import java.util.List;
import p114fa.C5484b;

/* JADX INFO: renamed from: ja.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6439b implements InterfaceC6441d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6441d f36987a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f36988b;

    public C6439b(C6438a c6438a, List list) {
        this.f36987a = c6438a;
        this.f36988b = list;
    }

    @Override // p196ja.InterfaceC6441d
    /* JADX INFO: renamed from: a */
    public final C2529c.a<AbstractC6440c> mo13066a(C2491d c2491d, C2490c c2490c) {
        return new C5484b(this.f36987a.mo13066a(c2491d, c2490c), this.f36988b);
    }

    @Override // p196ja.InterfaceC6441d
    /* JADX INFO: renamed from: b */
    public final C2529c.a<AbstractC6440c> mo13067b() {
        return new C5484b(this.f36987a.mo13067b(), this.f36988b);
    }
}
