package si;

import android.view.View;
import android.widget.PopupWindow;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.home.challenges.ChallengesAdapter;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.p055ui.home.library.LibraryAdapter;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.search.SearchAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyAdapter;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.lesson.tutorial.C4465a;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.ReviewSessionCompleteAdapter;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.review.views.speaking.MatchPairView;
import com.lingq.p055ui.token.DictionaryData;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumViewModel;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dk.C5199d;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6752c;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import ni.C7796d;
import p014aj.C0091h;
import p203ji.C6479a;
import p225kk.C6716m;
import p278nh.AbstractC7787n;
import p278nh.C7777d;
import p338qd.C8573r0;
import p462wj.AbstractC9953a;
import p462wj.InterfaceC9957e;
import p512yi.C10389q;
import ph.C8302i4;

/* JADX INFO: renamed from: si.m */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9029m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47269c;

    public /* synthetic */ ViewOnClickListenerC9029m(Object obj, int i10, Object obj2) {
        this.f47267a = i10;
        this.f47268b = obj;
        this.f47269c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10 = this.f47267a;
        Object obj = this.f47269c;
        Object obj2 = this.f47268b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ChallengesAdapter challengesAdapter = (ChallengesAdapter) obj2;
                ChallengesAdapter.AbstractC3515b.a aVar = (ChallengesAdapter.AbstractC3515b.a) obj;
                C5207g.m11111f(challengesAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                challengesAdapter.f23043e.mo9795a(new Pair<>(aVar.f23046a, Boolean.TRUE));
                return;
            case 1:
                CollectionsAdapter.AbstractC3740b abstractC3740b = (CollectionsAdapter.AbstractC3740b) obj2;
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj;
                C5207g.m11111f(abstractC3740b, "$holder");
                C5207g.m11111f(collectionsAdapter, "this$0");
                int iM4241d = ((CollectionsAdapter.AbstractC3740b.f) abstractC3740b).m4241d();
                if (iM4241d != -1) {
                    CollectionsAdapter.AbstractC3739a abstractC3739aM4528p = collectionsAdapter.m4528p(iM4241d);
                    C5207g.m11109d(abstractC3739aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Course");
                    collectionsAdapter.f24478f.mo9805e(((CollectionsAdapter.AbstractC3739a.a) abstractC3739aM4528p).f24479a);
                    return;
                }
                return;
            case 2:
                CollectionsAdapter collectionsAdapter2 = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.e eVar = (CollectionsAdapter.AbstractC3739a.e) obj;
                C5207g.m11111f(collectionsAdapter2, "this$0");
                C5207g.m11111f(eVar, "$item");
                collectionsAdapter2.f24478f.mo9805e(eVar.f24488a.f24522a);
                return;
            case 3:
                CollectionsAdapter collectionsAdapter3 = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(collectionsAdapter3, "this$0");
                C5207g.m11111f(jVar, "$item");
                collectionsAdapter3.f24478f.mo9815o(jVar.f24496a, jVar.f24497b);
                return;
            case 4:
                LibraryAdapter libraryAdapter = (LibraryAdapter) obj2;
                LibraryAdapter.AbstractC3755a.c cVar = (LibraryAdapter.AbstractC3755a.c) obj;
                C5207g.m11111f(libraryAdapter, "this$0");
                C5207g.m11111f(cVar, "$item");
                libraryAdapter.f24602f.mo9811k(cVar.f24609b);
                return;
            case 5:
                PopupWindow popupWindow = (PopupWindow) obj2;
                C10389q c10389q = (C10389q) obj;
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(c10389q, "this$0");
                popupWindow.dismiss();
                c10389q.f52179a.mo528n(CourseMenuItem.ViewCourse);
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C0091h c0091h = (C0091h) obj2;
                C6479a c6479a = (C6479a) obj;
                C5207g.m11111f(c0091h, "this$0");
                C5207g.m11111f(c6479a, "$item");
                c0091h.f245e.mo9795a(c6479a);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) obj2;
                PlaylistAdapter.AbstractC3890c.a aVar2 = (PlaylistAdapter.AbstractC3890c.a) obj;
                C5207g.m11111f(playlistAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                C5207g.m11110e(view, "it");
                playlistAdapter.f25399f.mo9879e(view, aVar2.f25406b.f37853a);
                return;
            case 8:
                SearchAdapter searchAdapter = (SearchAdapter) obj2;
                SearchAdapter.AbstractC3964c.f fVar = (SearchAdapter.AbstractC3964c.f) obj;
                C5207g.m11111f(searchAdapter, "this$0");
                C5207g.m11111f(fVar, "$item");
                searchAdapter.f25941e.mo10009e(fVar.f25953a);
                return;
            case 9:
                VocabularyAdapter vocabularyAdapter = (VocabularyAdapter) obj2;
                VocabularyAdapter.AbstractC3987a.a aVar3 = (VocabularyAdapter.AbstractC3987a.a) obj;
                C5207g.m11111f(vocabularyAdapter, "this$0");
                C5207g.m11111f(aVar3, "$item");
                VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                if (interfaceC3991e != null) {
                    interfaceC3991e.mo10016a(aVar3.f26082a.f41680b, CardStatus.Familiar.getValue());
                    return;
                }
                return;
            case 10:
            default:
                UpgradeGoPremiumFragment upgradeGoPremiumFragment = (UpgradeGoPremiumFragment) obj2;
                UpgradeReason upgradeReason = (UpgradeReason) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeGoPremiumFragment.f32014D0;
                C5207g.m11111f(upgradeGoPremiumFragment, "this$0");
                C5207g.m11111f(upgradeReason, "$reason");
                C7796d c7796d = upgradeGoPremiumFragment.f32017C0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "upgrade_button_click");
                UpgradeGoPremiumViewModel upgradeGoPremiumViewModel = (UpgradeGoPremiumViewModel) upgradeGoPremiumFragment.f32015A0.getValue();
                switch (UpgradeGoPremiumFragment.C4923a.f32018a[upgradeReason.ordinal()]) {
                    case 1:
                    case 2:
                        str = "Import After Limit";
                        break;
                    case 3:
                        str = "Sentence Translation";
                        break;
                    case 4:
                        str = "Blue Word Clicked";
                        break;
                    case 5:
                        str = "Challenge Signup Popup";
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "Playlist Create";
                        break;
                    default:
                        str = "";
                        break;
                }
                upgradeGoPremiumViewModel.f32026d.mo9772G1(str);
                upgradeGoPremiumFragment.m3598r().m3628T(UpgradeGoPremiumFragment.class.getName());
                return;
            case 11:
                C4079a c4079a = (C4079a) obj2;
                AbstractC7787n.h hVar = (AbstractC7787n.h) obj;
                C5207g.m11111f(c4079a, "this$0");
                C5207g.m11111f(hVar, "$item");
                c4079a.f26529f.mo9849c("", hVar.f42764c);
                return;
            case 12:
                C4079a c4079a2 = (C4079a) obj2;
                AbstractC7787n.o oVar = (AbstractC7787n.o) obj;
                C5207g.m11111f(c4079a2, "this$0");
                C5207g.m11111f(oVar, "$item");
                c4079a2.f26529f.mo9849c(oVar.f42794a, oVar.f42795b);
                return;
            case 13:
                LessonInfo lessonInfo = (LessonInfo) obj2;
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                C5207g.m11111f(lessonInfo, "$lesson");
                C5207g.m11111f(lessonInfoFragment, "this$0");
                String str2 = lessonInfo.f21962M;
                if (str2 != null) {
                    List<Integer> list = C6716m.f37937a;
                    C6716m.m13330o(lessonInfoFragment.m3578a0(), str2, C8573r0.m16725g0(lessonInfoFragment), 4);
                    return;
                }
                return;
            case 14:
                C4465a.a aVar4 = (C4465a.a) obj2;
                C4465a c4465a = (C4465a) obj;
                C5207g.m11111f(aVar4, "$holder");
                C5207g.m11111f(c4465a, "this$0");
                int iM4241d2 = aVar4.m4241d();
                if (iM4241d2 != -1) {
                    C7378e c7378eM4528p = c4465a.m4528p(iM4241d2);
                    C5207g.m11110e(c7378eM4528p, "clickedItem");
                    c4465a.f29204e.mo10227a(c7378eM4528p);
                    return;
                }
                return;
            case 15:
                Object obj3 = (AbstractC9953a) obj2;
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                if (obj3 instanceof InterfaceC9957e) {
                    reviewFragment.m10240o0().m10253D2();
                    reviewFragment.m10240o0().m10265y2(((InterfaceC9957e) obj3).mo18533a().f41692b);
                }
                reviewFragment.m10240o0().m10266z2();
                return;
            case 16:
                ReviewSessionCompleteAdapter.AbstractC4531b abstractC4531b = (ReviewSessionCompleteAdapter.AbstractC4531b) obj2;
                ReviewSessionCompleteAdapter reviewSessionCompleteAdapter = (ReviewSessionCompleteAdapter) obj;
                C5207g.m11111f(abstractC4531b, "$holder");
                C5207g.m11111f(reviewSessionCompleteAdapter, "this$0");
                ReviewSessionCompleteAdapter.AbstractC4531b.a aVar5 = (ReviewSessionCompleteAdapter.AbstractC4531b.a) abstractC4531b;
                if (aVar5.m4241d() != -1) {
                    ReviewSessionCompleteAdapter.AbstractC4530a abstractC4530aM4528p = reviewSessionCompleteAdapter.m4528p(aVar5.m4241d());
                    C5207g.m11109d(abstractC4530aM4528p, "null cannot be cast to non-null type com.lingq.ui.review.ReviewSessionCompleteAdapter.AdapterItem.TermStudied");
                    ReviewSessionCompleteAdapter.AbstractC4530a.b bVar = (ReviewSessionCompleteAdapter.AbstractC4530a.b) abstractC4530aM4528p;
                    ReviewSessionCompleteAdapter.InterfaceC4533d interfaceC4533d = reviewSessionCompleteAdapter.f29520f;
                    if (interfaceC4533d != null) {
                        C7374a c7374a = bVar.f29523a;
                        int i11 = c7374a.f41150i;
                        C5207g.m11110e(view, "it");
                        interfaceC4533d.mo10242a(c7374a, i11, c7374a.f41151j, view);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = (ReviewActivityMultiAndClozeFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = ReviewActivityMultiAndClozeFragment.f29872H0;
                C5207g.m11111f(reviewActivityMultiAndClozeFragment, "this$0");
                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), ((C7374a) obj).f41142a, true, 0.0f, 8);
                return;
            case 18:
                MatchPairView matchPairView = (MatchPairView) obj2;
                C8302i4 c8302i4 = (C8302i4) obj;
                int i12 = MatchPairView.f30458l;
                C5207g.m11111f(matchPairView, "this$0");
                C5207g.m11111f(c8302i4, "$this_with");
                MaterialCardView materialCardView = c8302i4.f44898d;
                C5207g.m11110e(materialCardView, "card4");
                MaterialTextView materialTextView = c8302i4.f44904j;
                C5207g.m11110e(materialTextView, "tvCard4");
                matchPairView.m10310a(materialCardView, materialTextView);
                return;
            case 19:
                C5199d c5199d = (C5199d) obj2;
                C5199d.a aVar6 = (C5199d.a) obj;
                C5207g.m11111f(c5199d, "this$0");
                C5207g.m11111f(aVar6, "$holder");
                c5199d.f33248e.mo9795a(new Pair<>(c5199d.m4528p(aVar6.m4241d()), Boolean.FALSE));
                return;
            case 20:
                TokenFragment tokenFragment = (TokenFragment) obj2;
                List list2 = (List) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(list2, "$meanings");
                TokenViewModel.m10374s2(tokenFragment.m10363o0(), (TokenMeaning) C6752c.m13423Q(list2), !C7777d.m15481b(tokenFragment));
                return;
            case 21:
                TokenFragment tokenFragment2 = (TokenFragment) obj2;
                InterfaceC7379f interfaceC7379f = (InterfaceC7379f) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment2, "this$0");
                C5207g.m11111f(interfaceC7379f, "$token");
                C5207g.m11110e(view, "view");
                C7374a c7374a2 = (C7374a) interfaceC7379f;
                tokenFragment2.m10364p0(view, c7374a2.f41150i, c7374a2.f41151j);
                return;
            case 22:
                DictionariesManageAdapter dictionariesManageAdapter = (DictionariesManageAdapter) obj2;
                DictionariesManageAdapter.AbstractC4874b.a aVar7 = (DictionariesManageAdapter.AbstractC4874b.a) obj;
                C5207g.m11111f(dictionariesManageAdapter, "this$0");
                C5207g.m11111f(aVar7, "$item");
                dictionariesManageAdapter.f31765f.mo10391c(aVar7.f31770a);
                return;
            case 23:
                DictionaryContentFragment dictionaryContentFragment = (DictionaryContentFragment) obj2;
                DictionaryData dictionaryData = (DictionaryData) obj;
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                C5207g.m11111f(dictionaryContentFragment, "this$0");
                C5207g.m11111f(dictionaryData, "$data");
                C5207g.m11110e(view, "it");
                dictionaryContentFragment.m10398w0(view, dictionaryData);
                return;
        }
    }
}
