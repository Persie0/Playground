package vi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.home.course.CourseOverviewMenuItem;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.p055ui.home.playlist.PlaylistsAdapter;
import com.lingq.p055ui.home.search.SearchAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyMenuItem;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.p055ui.lesson.edit.C4306a;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.review.ReviewSessionCompleteAdapter;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.session.magiclink.EmailLoginFragment;
import com.lingq.p055ui.settings.C4782a;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.p055ui.token.dictionaries.C4902a;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.linguist.R;
import dj.C5195m;
import dk.C5199d;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Pair;
import li.C7374a;
import li.InterfaceC7379f;
import p278nh.AbstractC7787n;
import p278nh.AbstractC7789p;
import p278nh.C7777d;
import p462wj.AbstractC9953a;
import p462wj.InterfaceC9957e;
import p512yi.C10389q;
import ph.C8298i0;
import ph.C8328n0;
import ph.C8342p2;
import ph.C8349r;
import sl.C9072e;

/* JADX INFO: renamed from: vi.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9734i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49759c;

    public /* synthetic */ ViewOnClickListenerC9734i(Object obj, int i10, Object obj2) {
        this.f49757a = i10;
        this.f49758b = obj;
        this.f49759c = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClipData.Item itemAt;
        int i10 = this.f49757a;
        Object obj = this.f49759c;
        Object obj2 = this.f49758b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                PopupWindow popupWindow = (PopupWindow) obj2;
                C9735j c9735j = (C9735j) obj;
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(c9735j, "this$0");
                popupWindow.dismiss();
                c9735j.f49760a.mo528n(CourseOverviewMenuItem.Like);
                break;
            case 1:
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(jVar, "$item");
                collectionsAdapter.f24478f.mo9818r(jVar.f24496a, jVar.f24497b);
                break;
            case 2:
                PopupWindow popupWindow2 = (PopupWindow) obj2;
                C10389q c10389q = (C10389q) obj;
                C5207g.m11111f(popupWindow2, "$popupWindow");
                C5207g.m11111f(c10389q, "this$0");
                popupWindow2.dismiss();
                c10389q.f52179a.mo528n(CourseMenuItem.AddToPlaylist);
                break;
            case 3:
                PlaylistsAdapter playlistsAdapter = (PlaylistsAdapter) obj2;
                PlaylistsAdapter.AbstractC3951c.b bVar = (PlaylistsAdapter.AbstractC3951c.b) obj;
                C5207g.m11111f(playlistsAdapter, "this$0");
                C5207g.m11111f(bVar, "$item");
                playlistsAdapter.f25854f.mo10000a(bVar.f25857a);
                break;
            case 4:
                SearchAdapter searchAdapter = (SearchAdapter) obj2;
                SearchAdapter.AbstractC3964c.c cVar = (SearchAdapter.AbstractC3964c.c) obj;
                C5207g.m11111f(searchAdapter, "this$0");
                C5207g.m11111f(cVar, "$item");
                searchAdapter.f25941e.mo10008d(cVar.f25949a);
                break;
            case 5:
                PopupWindow popupWindow3 = (PopupWindow) obj2;
                C5195m c5195m = (C5195m) obj;
                C5207g.m11111f(popupWindow3, "$popupWindow");
                C5207g.m11111f(c5195m, "this$0");
                popupWindow3.dismiss();
                c5195m.f33237a.mo528n(VocabularyMenuItem.Export);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C4079a c4079a = (C4079a) obj2;
                AbstractC7787n.n nVar = (AbstractC7787n.n) obj;
                C5207g.m11111f(c4079a, "this$0");
                C5207g.m11111f(nVar, "$item");
                c4079a.f26529f.mo9849c("", nVar.f42790c);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C4079a c4079a2 = (C4079a) obj2;
                AbstractC7787n.e eVar = (AbstractC7787n.e) obj;
                C5207g.m11111f(c4079a2, "this$0");
                C5207g.m11111f(eVar, "$item");
                c4079a2.f26529f.mo9849c("", eVar.f42751d);
                break;
            case 8:
                VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter = (VocabularyFilterSelectionAdapter) obj2;
                VocabularyFilterSelectionAdapter.AbstractC4037a.a aVar = (VocabularyFilterSelectionAdapter.AbstractC4037a.a) obj;
                C5207g.m11111f(vocabularyFilterSelectionAdapter, "this$0");
                C5207g.m11111f(aVar, "$item");
                vocabularyFilterSelectionAdapter.f26375e.mo10069b(aVar.f26376a.f42737d);
                break;
            case 9:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) obj2;
                C8328n0 c8328n0 = (C8328n0) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                C5207g.m11111f(lessonInfoFragment, "this$0");
                C5207g.m11111f(c8328n0, "$this_with");
                boolean z10 = lessonInfoFragment.f26844V0;
                TextView textView = c8328n0.f45066j;
                TextView textView2 = c8328n0.f45075s;
                if (!z10) {
                    lessonInfoFragment.f26844V0 = true;
                    textView2.setMaxLines(Integer.MAX_VALUE);
                    C5207g.m11110e(textView, "btnShowAll");
                    C4924a.m10442U(textView);
                } else {
                    lessonInfoFragment.f26844V0 = false;
                    textView2.setMaxLines(4);
                    textView.setText(lessonInfoFragment.m3600t(R.string.ui_show_all));
                }
                break;
            case 10:
                C4306a.c cVar2 = (C4306a.c) obj2;
                C4306a c4306a = (C4306a) obj;
                C5207g.m11111f(cVar2, "$holder");
                C5207g.m11111f(c4306a, "this$0");
                int iM4241d = cVar2.m4241d();
                if (iM4241d != -1) {
                    c4306a.f28121e.mo9795a(c4306a.m4528p(iM4241d).f28122a);
                }
                break;
            case 11:
                C8342p2 c8342p2 = (C8342p2) obj2;
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewFragment.f29431E0;
                C5207g.m11111f(c8342p2, "$this_with");
                C5207g.m11111f(reviewFragment, "this$0");
                TextView textView3 = c8342p2.f45144h;
                C5207g.m11110e(textView3, "tvDoNotKnow");
                C4924a.m10442U(textView3);
                LinearLayout linearLayout = c8342p2.f45146j;
                C5207g.m11110e(linearLayout, "viewFlipCard");
                C4924a.m10442U(linearLayout);
                Button button = c8342p2.f45145i;
                C5207g.m11110e(button, "tvFlip");
                C4924a.m10442U(button);
                Button button2 = c8342p2.f45138b;
                C5207g.m11110e(button2, "btnContinue");
                C4924a.m10442U(button2);
                LinearLayout linearLayout2 = c8342p2.f45147k;
                C5207g.m11110e(linearLayout2, "viewSessionComplete");
                C4924a.m10442U(linearLayout2);
                reviewFragment.m10240o0().f29648e0.mo16479j(C9072e.f47360a);
                break;
            case 12:
                Object obj3 = (AbstractC9953a) obj2;
                ReviewFragment reviewFragment2 = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment2, "this$0");
                if (obj3 instanceof InterfaceC9957e) {
                    reviewFragment2.m10240o0().m10254E2(((InterfaceC9957e) obj3).mo18533a().f41692b);
                }
                reviewFragment2.m10240o0().m10266z2();
                break;
            case 13:
                ReviewSessionCompleteAdapter.AbstractC4531b abstractC4531b = (ReviewSessionCompleteAdapter.AbstractC4531b) obj2;
                ReviewSessionCompleteAdapter reviewSessionCompleteAdapter = (ReviewSessionCompleteAdapter) obj;
                C5207g.m11111f(abstractC4531b, "$holder");
                C5207g.m11111f(reviewSessionCompleteAdapter, "this$0");
                ReviewSessionCompleteAdapter.AbstractC4531b.a aVar2 = (ReviewSessionCompleteAdapter.AbstractC4531b.a) abstractC4531b;
                if (aVar2.m4241d() != -1) {
                    ReviewSessionCompleteAdapter.AbstractC4530a abstractC4530aM4528p = reviewSessionCompleteAdapter.m4528p(aVar2.m4241d());
                    C5207g.m11109d(abstractC4530aM4528p, "null cannot be cast to non-null type com.lingq.ui.review.ReviewSessionCompleteAdapter.AdapterItem.TermStudied");
                    ReviewSessionCompleteAdapter.AbstractC4530a.b bVar2 = (ReviewSessionCompleteAdapter.AbstractC4530a.b) abstractC4530aM4528p;
                    ReviewSessionCompleteAdapter.InterfaceC4533d interfaceC4533d = reviewSessionCompleteAdapter.f29520f;
                    if (interfaceC4533d != null) {
                        C7374a c7374a = bVar2.f29523a;
                        int i11 = c7374a.f41150i;
                        C5207g.m11110e(view, "it");
                        interfaceC4533d.mo10242a(c7374a, i11, c7374a.f41151j, view);
                    }
                }
                break;
            case 14:
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = (ReviewActivityMultiAndClozeFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = ReviewActivityMultiAndClozeFragment.f29872H0;
                C5207g.m11111f(reviewActivityMultiAndClozeFragment, "this$0");
                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), ((C7374a) obj).f41142a, true, 0.0f, 8);
                break;
            case 15:
                EmailLoginFragment.m10346n0((C8349r) obj2, (EmailLoginFragment) obj);
                break;
            case 16:
                C4782a c4782a = (C4782a) obj2;
                AbstractC7789p.b bVar3 = (AbstractC7789p.b) obj;
                C5207g.m11111f(c4782a, "this$0");
                C5207g.m11111f(bVar3, "$item");
                c4782a.f31150e.mo10355a(bVar3);
                break;
            case 17:
                C5199d c5199d = (C5199d) obj2;
                C5199d.a aVar3 = (C5199d.a) obj;
                C5207g.m11111f(c5199d, "this$0");
                C5207g.m11111f(aVar3, "$holder");
                c5199d.f33248e.mo9795a(new Pair<>(c5199d.m4528p(aVar3.m4241d()), Boolean.TRUE));
                break;
            case 18:
                TokenFragment tokenFragment = (TokenFragment) obj2;
                List list = (List) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(list, "$meanings");
                TokenViewModel.m10374s2(tokenFragment.m10363o0(), (TokenMeaning) list.get(1), !C7777d.m15481b(tokenFragment));
                break;
            case 19:
                TokenFragment tokenFragment2 = (TokenFragment) obj2;
                InterfaceC7379f interfaceC7379f = (InterfaceC7379f) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment2, "this$0");
                C5207g.m11111f(interfaceC7379f, "$token");
                C5207g.m11110e(view, "view");
                C7374a c7374a2 = (C7374a) interfaceC7379f;
                tokenFragment2.m10364p0(view, c7374a2.f41150i, c7374a2.f41151j);
                break;
            case 20:
                C4902a.c cVar3 = (C4902a.c) obj2;
                C4902a c4902a = (C4902a) obj;
                C5207g.m11111f(cVar3, "$holder");
                C5207g.m11111f(c4902a, "this$0");
                if (cVar3.m4241d() != -1) {
                    c4902a.f31900e.mo9795a(c4902a.m4528p(cVar3.m4241d()).f31901a);
                }
                break;
            default:
                DictionaryContentFragment dictionaryContentFragment = (DictionaryContentFragment) obj2;
                C8298i0 c8298i0 = (C8298i0) obj;
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                C5207g.m11111f(dictionaryContentFragment, "this$0");
                C5207g.m11111f(c8298i0, "$this_with");
                ClipboardManager clipboardManager = dictionaryContentFragment.f31860U0;
                ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
                if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
                    CharSequence text = itemAt.getText();
                    dictionaryContentFragment.f31861V0 = text;
                    if (text != null) {
                        AppCompatEditText appCompatEditText = c8298i0.f44877e;
                        appCompatEditText.setText(((Object) appCompatEditText.getText()) + " " + ((Object) dictionaryContentFragment.f31861V0));
                    }
                    break;
                }
                break;
        }
    }
}
