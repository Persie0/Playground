package p512yi;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.lesson.vocabulary.C4495a;
import dm.C5207g;
import ki.C6698d;
import li.InterfaceC7379f;

/* JADX INFO: renamed from: yi.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10369a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f52122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1170u f52123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f52124d;

    public /* synthetic */ ViewOnClickListenerC10369a(RecyclerView.AbstractC1109b0 abstractC1109b0, AbstractC1170u abstractC1170u, Object obj, int i10) {
        this.f52121a = i10;
        this.f52122b = abstractC1109b0;
        this.f52123c = abstractC1170u;
        this.f52124d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f52121a;
        Object obj = this.f52124d;
        AbstractC1170u abstractC1170u = this.f52123c;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f52122b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) abstractC1109b0;
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) abstractC1170u;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(abstractC3740b, "$holder");
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(jVar, "$item");
                int iM4241d = ((CollectionsAdapter.AbstractC3740b.l) abstractC3740b).m4241d();
                if (iM4241d != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p = collectionsAdapter.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
                    collectionsAdapter.f24478f.mo9813m(((CollectionsAdapter.AbstractC3739a.j) abstractC3739aM4528p).f24496a, jVar.f24497b, jVar.f24501f);
                }
                break;
            case 1:
                PlaylistAdapter.AbstractC3888a abstractC3888a = (PlaylistAdapter.AbstractC3888a) abstractC1109b0;
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) abstractC1170u;
                PlaylistAdapter.AbstractC3890c.a aVar = (PlaylistAdapter.AbstractC3890c.a) obj;
                C5207g.m11111f(abstractC3888a, "$holder");
                C5207g.m11111f(playlistAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                int iM4241d2 = ((PlaylistAdapter.AbstractC3888a.b) abstractC3888a).m4241d();
                if (iM4241d2 != -1 && iM4241d2 < playlistAdapter.mo4226e()) {
                    C6698d c6698d = aVar.f25408d;
                    if (c6698d != null) {
                        z10 = true;
                        if (!c6698d.f37876b) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    playlistAdapter.f25399f.mo9881g(aVar.f25405a, z10);
                }
                break;
            default:
                C4495a.a aVar2 = (C4495a.a) abstractC1109b0;
                C4495a c4495a = (C4495a) abstractC1170u;
                InterfaceC7379f interfaceC7379f = (InterfaceC7379f) obj;
                C5207g.m11111f(aVar2, "$holder");
                C5207g.m11111f(c4495a, "this$0");
                if (aVar2.m4241d() != -1) {
                    C5207g.m11110e(interfaceC7379f, "item");
                    c4495a.f29354e.mo9795a(interfaceC7379f);
                }
                break;
        }
    }
}
