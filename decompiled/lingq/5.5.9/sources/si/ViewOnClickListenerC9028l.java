package si;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.challenges.ChallengesAdapter;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.review.ReviewSessionCompleteAdapter;
import dm.C5207g;
import kotlin.Pair;

/* JADX INFO: renamed from: si.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9028l implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f47264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1170u f47265c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f47266d;

    public /* synthetic */ ViewOnClickListenerC9028l(RecyclerView.AbstractC1109b0 abstractC1109b0, AbstractC1170u abstractC1170u, Object obj, int i10) {
        this.f47263a = i10;
        this.f47264b = abstractC1109b0;
        this.f47265c = abstractC1170u;
        this.f47266d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f47263a;
        Object obj = this.f47266d;
        AbstractC1170u abstractC1170u = this.f47265c;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f47264b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ChallengesAdapter.AbstractC3514a abstractC3514a = (ChallengesAdapter.AbstractC3514a) abstractC1109b0;
                ChallengesAdapter challengesAdapter = (ChallengesAdapter) abstractC1170u;
                ChallengesAdapter.AbstractC3515b.a aVar = (ChallengesAdapter.AbstractC3515b.a) obj;
                C5207g.m11111f(abstractC3514a, "$holder");
                C5207g.m11111f(challengesAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                if (((ChallengesAdapter.AbstractC3514a.a) abstractC3514a).m4241d() != -1) {
                    challengesAdapter.f23043e.mo9795a(new Pair<>(aVar.f23046a, Boolean.FALSE));
                }
                break;
            case 1:
                CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) abstractC1109b0;
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) abstractC1170u;
                CollectionsAdapter.AbstractC3739a.a aVar2 = (CollectionsAdapter.AbstractC3739a.a) obj;
                C5207g.m11111f(abstractC3740b, "$holder");
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                int iM4241d = ((CollectionsAdapter.AbstractC3740b.f) abstractC3740b).m4241d();
                if (iM4241d != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p = collectionsAdapter.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    CollectionsAdapter.AbstractC3739a.a aVar3 = (CollectionsAdapter.AbstractC3739a.a) abstractC3739aM4528p;
                    C5207g.m11110e(view, "it");
                    collectionsAdapter.f24478f.mo9812l(view, aVar3.f24479a, aVar3.f24480b, aVar2.f24483e);
                }
                break;
            case 2:
                CollectionsAdapter.AbstractC3740b abstractC3740b2 = (CollectionsAdapter.AbstractC3740b) abstractC1109b0;
                CollectionsAdapter collectionsAdapter2 = (CollectionsAdapter) abstractC1170u;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(abstractC3740b2, "$holder");
                C5207g.m11111f(collectionsAdapter2, "this$0");
                C5207g.m11111f(jVar, "$item");
                int iM4241d2 = ((CollectionsAdapter.AbstractC3740b.k) abstractC3740b2).m4241d();
                if (iM4241d2 != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p2 = collectionsAdapter2.m4528p(iM4241d2);
                    C5207g.m11109d(abstractC3739aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
                    C5207g.m11110e(view, "it");
                    collectionsAdapter2.f24478f.mo9825y(view, ((CollectionsAdapter.AbstractC3739a.j) abstractC3739aM4528p2).f24496a, jVar.f24497b, jVar.f24501f);
                }
                break;
            case 3:
                PlaylistAdapter.AbstractC3888a abstractC3888a = (PlaylistAdapter.AbstractC3888a) abstractC1109b0;
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) abstractC1170u;
                PlaylistAdapter.AbstractC3890c.a aVar4 = (PlaylistAdapter.AbstractC3890c.a) obj;
                C5207g.m11111f(abstractC3888a, "$holder");
                C5207g.m11111f(playlistAdapter, "this$0");
                C5207g.m11111f(aVar4, "$item");
                int iM4241d3 = ((PlaylistAdapter.AbstractC3888a.b) abstractC3888a).m4241d();
                if (iM4241d3 != -1 && iM4241d3 < playlistAdapter.mo4226e()) {
                    playlistAdapter.f25399f.mo9878d(aVar4.f25406b.f37853a);
                    break;
                }
                break;
            default:
                ReviewSessionCompleteAdapter.AbstractC4531b abstractC4531b = (ReviewSessionCompleteAdapter.AbstractC4531b) abstractC1109b0;
                ReviewSessionCompleteAdapter reviewSessionCompleteAdapter = (ReviewSessionCompleteAdapter) abstractC1170u;
                ReviewSessionCompleteAdapter.AbstractC4530a.b bVar = (ReviewSessionCompleteAdapter.AbstractC4530a.b) obj;
                C5207g.m11111f(abstractC4531b, "$holder");
                C5207g.m11111f(reviewSessionCompleteAdapter, "this$0");
                C5207g.m11111f(bVar, "$item");
                if (((ReviewSessionCompleteAdapter.AbstractC4531b.a) abstractC4531b).m4241d() != -1) {
                    reviewSessionCompleteAdapter.f29519e.mo9795a(bVar.f29523a);
                }
                break;
        }
    }
}
