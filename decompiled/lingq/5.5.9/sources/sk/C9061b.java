package sk;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.C4931a;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p304ok.InterfaceC8066b;
import pk.AbstractC8400a;
import pk.InterfaceC8402c;

/* JADX INFO: renamed from: sk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9061b extends AbstractC8400a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4931a f47341a;

    public C9061b(C4931a c4931a) {
        this.f47341a = c4931a;
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: h */
    public final void mo10114h(InterfaceC8066b interfaceC8066b) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        C4931a c4931a = this.f47341a;
        c4931a.setYouTubePlayerReady$core_release(true);
        LinkedHashSet linkedHashSet = c4931a.f32173f;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC8402c) it.next()).mo5247a(interfaceC8066b);
        }
        linkedHashSet.clear();
        interfaceC8066b.mo15930a(this);
    }
}
