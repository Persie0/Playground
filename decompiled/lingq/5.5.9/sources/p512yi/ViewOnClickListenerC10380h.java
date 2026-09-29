package p512yi;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyAdapter;
import dm.C5207g;
import p264mi.C7563c;

/* JADX INFO: renamed from: yi.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10380h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f52150b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1170u f52151c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f52152d;

    public /* synthetic */ ViewOnClickListenerC10380h(RecyclerView.AbstractC1109b0 abstractC1109b0, AbstractC1170u abstractC1170u, Object obj, int i10) {
        this.f52149a = i10;
        this.f52150b = abstractC1109b0;
        this.f52151c = abstractC1170u;
        this.f52152d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VocabularyAdapter.InterfaceC3992f interfaceC3992f;
        int i10 = this.f52149a;
        Object obj = this.f52152d;
        AbstractC1170u abstractC1170u = this.f52151c;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f52150b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) abstractC1109b0;
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) abstractC1170u;
                CollectionsAdapter.AbstractC3739a.a aVar = (CollectionsAdapter.AbstractC3739a.a) obj;
                C5207g.m11111f(abstractC3740b, "$holder");
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                int iM4241d = ((CollectionsAdapter.AbstractC3740b.g) abstractC3740b).m4241d();
                if (iM4241d != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p = collectionsAdapter.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    collectionsAdapter.f24478f.mo9809i(((CollectionsAdapter.AbstractC3739a.a) abstractC3739aM4528p).f24479a, aVar.f24483e);
                }
                break;
            default:
                VocabularyAdapter.AbstractC3988b abstractC3988b = (VocabularyAdapter.AbstractC3988b) abstractC1109b0;
                VocabularyAdapter vocabularyAdapter = (VocabularyAdapter) abstractC1170u;
                VocabularyAdapter.AbstractC3987a.a aVar2 = (VocabularyAdapter.AbstractC3987a.a) obj;
                C5207g.m11111f(abstractC3988b, "$holder");
                C5207g.m11111f(vocabularyAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                if (((VocabularyAdapter.AbstractC3988b.a) abstractC3988b).m4241d() != -1 && (interfaceC3992f = vocabularyAdapter.f26079h) != null) {
                    C7563c c7563c = aVar2.f26082a;
                    String str = c7563c.f41680b;
                    Integer numValueOf = Integer.valueOf(c7563c.f41682d);
                    C5207g.m11110e(view, "it");
                    interfaceC3992f.mo10017a(str, c7563c.f41681c, numValueOf, view);
                }
                break;
        }
    }
}
