package p512yi;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.search.SearchAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyAdapter;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.settings.C4782a;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import dm.C5207g;
import p138gk.C5811a;
import p181ii.C6332a;
import p278nh.AbstractC7789p;

/* JADX INFO: renamed from: yi.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10371b implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52129b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52130c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f52131d;

    public /* synthetic */ ViewOnClickListenerC10371b(int i10, Object obj, Object obj2, Object obj3) {
        this.f52128a = i10;
        this.f52129b = obj;
        this.f52130c = obj2;
        this.f52131d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f52128a;
        boolean zM10424C = true;
        Object obj = this.f52131d;
        Object obj2 = this.f52130c;
        Object obj3 = this.f52129b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) obj3;
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.a aVar = (CollectionsAdapter.AbstractC3739a.a) obj;
                C5207g.m11111f(abstractC3740b, "$holder");
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                int iM4241d = ((CollectionsAdapter.AbstractC3740b.f) abstractC3740b).m4241d();
                if (iM4241d != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p = collectionsAdapter.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    collectionsAdapter.f24478f.mo9809i(((CollectionsAdapter.AbstractC3739a.a) abstractC3739aM4528p).f24479a, aVar.f24483e);
                }
                break;
            case 1:
                CollectionsAdapter.AbstractC3740b abstractC3740b2 = (CollectionsAdapter.AbstractC3740b) obj3;
                CollectionsAdapter collectionsAdapter2 = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(abstractC3740b2, "$holder");
                C5207g.m11111f(collectionsAdapter2, "this$0");
                C5207g.m11111f(jVar, "$item");
                int iM4241d2 = ((CollectionsAdapter.AbstractC3740b.k) abstractC3740b2).m4241d();
                if (iM4241d2 != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p2 = collectionsAdapter2.m4528p(iM4241d2);
                    C5207g.m11109d(abstractC3739aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson");
                    CollectionsAdapter.AbstractC3739a.j jVar2 = (CollectionsAdapter.AbstractC3739a.j) abstractC3739aM4528p2;
                    C6332a c6332a = jVar2.f24496a;
                    LibraryItemCounter libraryItemCounter = jVar2.f24497b;
                    if (libraryItemCounter != null) {
                        c6332a.f36589P = Boolean.valueOf(libraryItemCounter.f22009f);
                    }
                    collectionsAdapter2.f24478f.mo9813m(c6332a, jVar.f24497b, jVar.f24501f);
                }
                break;
            case 2:
                SearchAdapter.AbstractC3962a abstractC3962a = (SearchAdapter.AbstractC3962a) obj3;
                SearchAdapter searchAdapter = (SearchAdapter) obj2;
                SearchAdapter.AbstractC3964c.c cVar = (SearchAdapter.AbstractC3964c.c) obj;
                C5207g.m11111f(abstractC3962a, "$holder");
                C5207g.m11111f(searchAdapter, "this$0");
                C5207g.m11111f(cVar, "$item");
                int iM4241d3 = ((SearchAdapter.AbstractC3962a.c) abstractC3962a).m4241d();
                if (iM4241d3 != -1) {
                    SearchAdapter.AbstractC3964c abstractC3964cM4528p = searchAdapter.m4528p(iM4241d3);
                    C5207g.m11109d(abstractC3964cM4528p, "null cannot be cast to non-null type com.lingq.ui.home.search.SearchAdapter.SearchAdapterItem.Lesson");
                    C5207g.m11110e(view, "it");
                    searchAdapter.f25941e.mo10006b(view, ((SearchAdapter.AbstractC3964c.c) abstractC3964cM4528p).f25949a, cVar.f25950b);
                }
                break;
            case 3:
                VocabularyAdapter.AbstractC3988b abstractC3988b = (VocabularyAdapter.AbstractC3988b) obj3;
                VocabularyAdapter vocabularyAdapter = (VocabularyAdapter) obj2;
                VocabularyAdapter.AbstractC3987a.a aVar2 = (VocabularyAdapter.AbstractC3987a.a) obj;
                C5207g.m11111f(abstractC3988b, "$holder");
                C5207g.m11111f(vocabularyAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                if (((VocabularyAdapter.AbstractC3988b.a) abstractC3988b).m4241d() != -1) {
                    vocabularyAdapter.f26076e.mo9795a(aVar2.f26082a);
                }
                break;
            case 4:
                LessonInfoFragment.m10096u0((LessonInfo) obj3, (LibraryItemCounter) obj2, (LessonInfoFragment) obj);
                break;
            case 5:
                AbstractC7789p.a aVar3 = (AbstractC7789p.a) obj3;
                C4782a.a aVar4 = (C4782a.a) obj2;
                C4782a c4782a = (C4782a) obj;
                C5207g.m11111f(aVar3, "$item");
                C5207g.m11111f(aVar4, "$holder");
                C5207g.m11111f(c4782a, "this$0");
                LessonFont.INSTANCE.getClass();
                LessonFont lessonFontM9552b = LessonFont.Companion.m9552b(aVar3.f42798c);
                if (!C3398a.m9699b(lessonFontM9552b)) {
                    Context context = aVar4.f7054a.getContext();
                    C5207g.m11110e(context, "holder.itemView.context");
                    zM10424C = C4924a.m10424C(lessonFontM9552b, context);
                }
                c4782a.f31150e.mo10357c(aVar3, zM10424C);
                break;
            default:
                C5811a.b bVar = (C5811a.b) obj3;
                C5811a.c cVar2 = (C5811a.c) obj2;
                C5811a c5811a = (C5811a) obj;
                C5207g.m11111f(cVar2, "$holder");
                C5207g.m11111f(c5811a, "this$0");
                boolean z10 = !bVar.f35095b;
                bVar.f35095b = z10;
                ((AppCompatCheckBox) cVar2.f35097u.f45408d).setChecked(z10);
                c5811a.f35093e.mo9795a(bVar.f35094a);
                break;
        }
    }
}
