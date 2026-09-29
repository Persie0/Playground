package p408u6;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter;
import com.lingq.p055ui.home.language.stats.LanguageProgressUpdateFragment;
import com.lingq.p055ui.home.language.stats.LanguageProgressUpdateViewModel;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.p055ui.home.search.SearchAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyMenuItem;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.p055ui.imports.userImport.UserImportAddCourse;
import com.lingq.p055ui.info.InterfaceC4158a;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import com.lingq.p055ui.lesson.player.C4411a;
import com.lingq.p055ui.lesson.vocabulary.C4495a;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.review.data.ReviewActivityResult;
import com.lingq.p055ui.review.views.speaking.MatchPairView;
import com.lingq.p055ui.settings.C4782a;
import com.lingq.p055ui.token.TokenEditFragment;
import com.lingq.p055ui.token.TokenEditViewModel;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.linguist.R;
import dj.C5195m;
import dk.C5196a;
import dk.C5197b;
import dm.C5207g;
import fk.C5563e;
import fk.C5574p;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.text.C7076b;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import mo.C7660h;
import mo.C7661i;
import p040c4.C1681f;
import p138gk.C5812b;
import p138gk.C5816f;
import p138gk.C5817g;
import p213k4.RunnableC6590j;
import p225kk.C6716m;
import p278nh.AbstractC7787n;
import p278nh.AbstractC7789p;
import p286o2.C7906f;
import p338qd.C8573r0;
import p462wj.AbstractC9953a;
import p462wj.InterfaceC9957e;
import p512yi.C10389q;
import ph.C8270d2;
import ph.C8286g0;
import ph.C8298i0;
import ph.C8302i4;
import ph.C8371v1;
import ph.C8376w1;
import ph.C8391z1;

/* JADX INFO: renamed from: u6.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9466e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48520c;

    public /* synthetic */ ViewOnClickListenerC9466e(Object obj, int i10, Object obj2) {
        this.f48518a = i10;
        this.f48519b = obj;
        this.f48520c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f48518a;
        Object obj = this.f48520c;
        Object obj2 = this.f48519b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C9467f c9467f = (C9467f) obj2;
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                c9467f.getClass();
                float volume = exoPlayer != null ? exoPlayer.getVolume() : 0.0f;
                if (volume > 0.0f) {
                    exoPlayer.setVolume(0.0f);
                    ImageView imageView = c9467f.f48526F;
                    Resources resources = c9467f.f48530u.getResources();
                    ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
                    imageView.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_volume_off, null));
                } else if (volume == 0.0f) {
                    if (exoPlayer != null) {
                        exoPlayer.setVolume(1.0f);
                    }
                    ImageView imageView2 = c9467f.f48526F;
                    Resources resources2 = c9467f.f48530u.getResources();
                    ThreadLocal<TypedValue> threadLocal2 = C7906f.f43056a;
                    imageView2.setImageDrawable(C7906f.a.m15676a(resources2, R.drawable.ct_volume_on, null));
                }
                break;
            case 1:
                CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter = (CollectionsSearchFilterSelectionAdapter) obj2;
                CollectionsSearchFilterSelectionAdapter.AbstractC3585b.d dVar = (CollectionsSearchFilterSelectionAdapter.AbstractC3585b.d) obj;
                C5207g.m11111f(collectionsSearchFilterSelectionAdapter, "this$0");
                C5207g.m11111f(dVar, "$item");
                collectionsSearchFilterSelectionAdapter.f23481e.mo9852c(dVar.f23489a);
                break;
            case 2:
                LanguageProgressUpdateFragment languageProgressUpdateFragment = (LanguageProgressUpdateFragment) obj2;
                C8391z1 c8391z1 = (C8391z1) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageProgressUpdateFragment.f24219T0;
                C5207g.m11111f(languageProgressUpdateFragment, "this$0");
                C5207g.m11111f(c8391z1, "$this_with");
                int i11 = languageProgressUpdateFragment.m9904u0().f51565c;
                C1038i0 c1038i0 = languageProgressUpdateFragment.f24221R0;
                TextInputEditText textInputEditText = c8391z1.f45502e;
                if (i11 != 2) {
                    String strValueOf = String.valueOf(textInputEditText.getText());
                    if (!C7661i.m15250P2(strValueOf)) {
                        LanguageProgressUpdateViewModel languageProgressUpdateViewModel = (LanguageProgressUpdateViewModel) c1038i0.getValue();
                        String str = languageProgressUpdateFragment.m9904u0().f51566d;
                        String str2 = languageProgressUpdateFragment.m9904u0().f51564b;
                        Double dM15245K2 = C7660h.m15245K2(strValueOf);
                        languageProgressUpdateViewModel.m9905l2(str, str2, dM15245K2 != null ? dM15245K2.doubleValue() : 0.0d, languageProgressUpdateFragment.m9904u0().f51567e);
                    }
                    C8573r0.m16725g0(languageProgressUpdateFragment).m3995p();
                } else {
                    String strValueOf2 = String.valueOf(textInputEditText.getText());
                    String strValueOf3 = String.valueOf(c8391z1.f45503f.getText());
                    if (C7661i.m15250P2(strValueOf3) && C7661i.m15250P2(strValueOf2)) {
                        C8573r0.m16725g0(languageProgressUpdateFragment).m3995p();
                    } else {
                        if (C7661i.m15250P2(strValueOf2)) {
                            strValueOf2 = "0";
                        }
                        if (C7661i.m15250P2(strValueOf3)) {
                            strValueOf3 = "0";
                        }
                        Double dM15245K3 = C7660h.m15245K2(strValueOf2);
                        double dDoubleValue = dM15245K3 != null ? dM15245K3.doubleValue() : 0.0d;
                        Double dM15245K4 = C7660h.m15245K2(strValueOf3);
                        ((LanguageProgressUpdateViewModel) c1038i0.getValue()).m9905l2(languageProgressUpdateFragment.m9904u0().f51566d, languageProgressUpdateFragment.m9904u0().f51564b, ((dM15245K4 != null ? dM15245K4.doubleValue() : 0.0d) / 60.0d) + dDoubleValue, languageProgressUpdateFragment.m9904u0().f51567e);
                        C8573r0.m16725g0(languageProgressUpdateFragment).m3995p();
                    }
                }
                break;
            case 3:
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(jVar, "$item");
                collectionsAdapter.f24478f.mo9808h(jVar.f24496a, jVar.f24497b);
                break;
            case 4:
                PopupWindow popupWindow = (PopupWindow) obj2;
                C10389q c10389q = (C10389q) obj;
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(c10389q, "this$0");
                popupWindow.dismiss();
                c10389q.f52179a.mo528n(CourseMenuItem.Report);
                break;
            case 5:
                SearchAdapter searchAdapter = (SearchAdapter) obj2;
                SearchAdapter.AbstractC3964c.a aVar = (SearchAdapter.AbstractC3964c.a) obj;
                C5207g.m11111f(searchAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                searchAdapter.f25941e.mo10007c(aVar.f25947a);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                PopupWindow popupWindow2 = (PopupWindow) obj2;
                C5195m c5195m = (C5195m) obj;
                C5207g.m11111f(popupWindow2, "$popupWindow");
                C5207g.m11111f(c5195m, "this$0");
                popupWindow2.dismiss();
                c5195m.f33237a.mo528n(VocabularyMenuItem.ExportAnki);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C4079a c4079a = (C4079a) obj2;
                AbstractC7787n.m mVar = (AbstractC7787n.m) obj;
                C5207g.m11111f(c4079a, "this$0");
                C5207g.m11111f(mVar, "$item");
                c4079a.f26529f.mo9849c("", mVar.f42787b.intValue());
                break;
            case 8:
                C4079a c4079a2 = (C4079a) obj2;
                AbstractC7787n.l lVar = (AbstractC7787n.l) obj;
                C5207g.m11111f(c4079a2, "this$0");
                C5207g.m11111f(lVar, "$item");
                c4079a2.f26529f.mo9849c(lVar.f42783b, lVar.f42785d);
                break;
            case 9:
                UserImportAddCourse.m10074u0((C8270d2) obj2, (UserImportAddCourse) obj);
                break;
            case 10:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj2;
                LessonInfo lessonInfo = (LessonInfo) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                C5207g.m11111f(lessonInfoFragment, "this$0");
                C5207g.m11111f(lessonInfo, "$lesson");
                lessonInfoFragment.m10099x0().m10104p2(new InterfaceC4158a.b(lessonInfo));
                break;
            case 11:
                LessonPageFragment.m10187n0((LessonPageFragment) obj2, (C8286g0) obj);
                break;
            case 12:
                C4411a.c cVar = (C4411a.c) obj2;
                C4411a c4411a = (C4411a) obj;
                C5207g.m11111f(cVar, "$holder");
                C5207g.m11111f(c4411a, "this$0");
                if (cVar.m4241d() != -1) {
                    c4411a.f28886e.mo9795a(c4411a.m4528p(cVar.m4241d()).f28887a);
                }
                break;
            case 13:
                C4495a.a aVar2 = (C4495a.a) obj2;
                C4495a c4495a = (C4495a) obj;
                C5207g.m11111f(aVar2, "$holder");
                C5207g.m11111f(c4495a, "this$0");
                if (aVar2.m4241d() != -1) {
                    InterfaceC7379f interfaceC7379fM4528p = c4495a.m4528p(aVar2.m4241d());
                    if (!(interfaceC7379fM4528p instanceof C7374a)) {
                        boolean z10 = interfaceC7379fM4528p instanceof C7378e;
                    } else {
                        C4495a.c cVar2 = c4495a.f29355f;
                        if (cVar2 != null) {
                            String strMo14774c = interfaceC7379fM4528p.mo14774c();
                            C7374a c7374a = (C7374a) interfaceC7379fM4528p;
                            C5207g.m11110e(view, "it");
                            cVar2.mo10233a(strMo14774c, c7374a.f41150i, c7374a.f41151j, view);
                        }
                    }
                }
                break;
            case 14:
                Object obj3 = (AbstractC9953a) obj2;
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                if (obj3 instanceof InterfaceC9957e) {
                    reviewFragment.m10241p0((InterfaceC9957e) obj3, ReviewActivityResult.None, "");
                }
                break;
            case 15:
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = (ReviewActivityMultiAndClozeFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = ReviewActivityMultiAndClozeFragment.f29872H0;
                C5207g.m11111f(reviewActivityMultiAndClozeFragment, "this$0");
                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), ((C7374a) obj).f41142a, true, 0.0f, 8);
                break;
            case 16:
                MatchPairView matchPairView = (MatchPairView) obj2;
                C8302i4 c8302i4 = (C8302i4) obj;
                int i12 = MatchPairView.f30458l;
                C5207g.m11111f(matchPairView, "this$0");
                C5207g.m11111f(c8302i4, "$this_with");
                MaterialCardView materialCardView = c8302i4.f44897c;
                C5207g.m11110e(materialCardView, "card3");
                MaterialTextView materialTextView = c8302i4.f44903i;
                C5207g.m11110e(materialTextView, "tvCard3");
                matchPairView.m10310a(materialCardView, materialTextView);
                break;
            case 17:
                C4782a c4782a = (C4782a) obj2;
                AbstractC7789p.e eVar = (AbstractC7789p.e) obj;
                C5207g.m11111f(c4782a, "this$0");
                C5207g.m11111f(eVar, "$item");
                c4782a.f31150e.mo10356b(eVar);
                break;
            case 18:
                C5197b c5197b = (C5197b) obj2;
                C5197b.b bVar = (C5197b.b) obj;
                C5207g.m11111f(c5197b, "this$0");
                C5207g.m11111f(bVar, "$holderStatsDetail");
                C5196a c5196aM4528p = c5197b.m4528p(bVar.m4241d());
                C5207g.m11110e(c5196aM4528p, "getItem(holderStatsDetail.bindingAdapterPosition)");
                c5197b.f33245e.mo9795a(c5196aM4528p);
                break;
            case 19:
                C8376w1 c8376w1 = (C8376w1) obj2;
                TokenEditFragment tokenEditFragment = (TokenEditFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenEditFragment.f31188T0;
                C5207g.m11111f(c8376w1, "$this_with");
                C5207g.m11111f(tokenEditFragment, "this$0");
                String strValueOf4 = String.valueOf(c8376w1.f45435c.getText());
                C1681f c1681f = tokenEditFragment.f31190R0;
                int i13 = TokenEditFragment.C4786a.f31192a[((C5563e) c1681f.getValue()).f34360a.f31185a.ordinal()];
                C1038i0 c1038i1 = tokenEditFragment.f31191S0;
                if (i13 == 1) {
                    ((TokenEditViewModel) c1038i1.getValue()).f31201d.mo10030N0(strValueOf4);
                } else if (i13 != 2) {
                    if (i13 == 3) {
                        Object obj4 = ((C5563e) c1681f.getValue()).f34360a.f31187c;
                        TokenMeaning tokenMeaning = obj4 instanceof TokenMeaning ? (TokenMeaning) obj4 : null;
                        if (tokenMeaning != null) {
                            if (C7661i.m15250P2(C7076b.m14277B3(strValueOf4).toString())) {
                                ((TokenEditViewModel) c1038i1.getValue()).f31201d.mo10037V0(tokenMeaning);
                            } else {
                                ((TokenEditViewModel) c1038i1.getValue()).f31201d.mo10057o0(tokenMeaning, strValueOf4);
                            }
                        }
                    }
                } else if (!C7661i.m15250P2(strValueOf4)) {
                    ((TokenEditViewModel) c1038i1.getValue()).f31201d.mo10062r(strValueOf4);
                }
                C8573r0.m16725g0(tokenEditFragment).m3995p();
                break;
            case 20:
                TokenFragment tokenFragment = (TokenFragment) obj2;
                C8371v1 c8371v1 = (C8371v1) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(c8371v1, "$this_with");
                tokenFragment.m10362n0().f45395q.m2796H(R.id.collapsedTransition, R.id.expandedTransition);
                tokenFragment.m10362n0().f45395q.m2798J();
                RecyclerView.AbstractC1109b0 abstractC1109b0M4175H = c8371v1.f45400v.m4175H(1);
                if (abstractC1109b0M4175H != null) {
                    ((C5816f.d) abstractC1109b0M4175H).f35115u.f45508b.postDelayed(new RunnableC6590j(abstractC1109b0M4175H, 17, tokenFragment), 100L);
                }
                break;
            case 21:
                PopupWindow popupWindow3 = (PopupWindow) obj2;
                C5574p c5574p = (C5574p) obj;
                C5207g.m11111f(popupWindow3, "$popupWindow");
                C5207g.m11111f(c5574p, "this$0");
                popupWindow3.dismiss();
                c5574p.f34377a.mo528n(TokenStatusMenuItem.Recognized);
                break;
            case 22:
                C5812b.c cVar3 = (C5812b.c) obj2;
                C5812b c5812b = (C5812b) obj;
                C5207g.m11111f(cVar3, "$holder");
                C5207g.m11111f(c5812b, "this$0");
                int iM4241d = cVar3.m4241d();
                if (iM4241d != -1) {
                    c5812b.f35098e.mo9795a(c5812b.m4528p(iM4241d).f35099a);
                }
                break;
            case 23:
                C5817g.b bVar2 = (C5817g.b) obj2;
                C5817g c5817g = (C5817g) obj;
                C5207g.m11111f(bVar2, "$holder");
                C5207g.m11111f(c5817g, "this$0");
                int iM4241d2 = ((C5817g.b.a) bVar2).m4241d();
                if (iM4241d2 != -1) {
                    C5817g.a aVarM4528p = c5817g.m4528p(iM4241d2);
                    C5207g.m11109d(aVarM4528p, "null cannot be cast to non-null type com.lingq.ui.token.adapters.TagsAdapter.AdapterItem.Content");
                    c5817g.f35116e.mo9795a(((C5817g.a.C10634a) aVarM4528p).f35118a);
                }
                break;
            case 24:
                DictionaryContentFragment dictionaryContentFragment = (DictionaryContentFragment) obj2;
                C8298i0 c8298i0 = (C8298i0) obj;
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                C5207g.m11111f(dictionaryContentFragment, "this$0");
                C5207g.m11111f(c8298i0, "$this_with");
                List<Integer> list = C6716m.f37937a;
                Context contextM3578a0 = dictionaryContentFragment.m3578a0();
                C5207g.m11110e(view, "it");
                C6716m.m13321f(contextM3578a0, view);
                WebView webView = c8298i0.f44883k;
                webView.setLayerType(1, null);
                C4924a.m10442U(webView);
                dictionaryContentFragment.mo3766m0();
                break;
            default:
                UpgradeGoPremiumFragment upgradeGoPremiumFragment = (UpgradeGoPremiumFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = UpgradeGoPremiumFragment.f32014D0;
                C5207g.m11111f(upgradeGoPremiumFragment, "this$0");
                C5207g.m11111f((UpgradeReason) obj, "$reason");
                upgradeGoPremiumFragment.m3598r().m3628T(UpgradeGoPremiumFragment.class.getName());
                break;
        }
    }
}
