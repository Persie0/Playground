package p199jd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.snackbar.Snackbar;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter;
import com.lingq.p055ui.home.course.CourseOverviewMenuItem;
import com.lingq.p055ui.home.language.C3700a;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.p055ui.home.library.LessonMenuItem;
import com.lingq.p055ui.home.notifications.C3887b;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.playlist.PlaylistsAdapter;
import com.lingq.p055ui.home.vocabulary.VocabularyMenuItem;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.p055ui.imports.userImport.UserImportTextFragment;
import com.lingq.p055ui.imports.userImport.UserImportTextViewModel;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.lesson.vocabulary.C4495a;
import com.lingq.p055ui.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.p055ui.settings.SettingsEditFragment;
import com.lingq.p055ui.token.DictionaryData;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.util.C4924a;
import com.linguist.R;
import dj.C5195m;
import dm.C5207g;
import fj.C5546g;
import fj.C5557r;
import fj.InterfaceC5547h;
import fk.C5574p;
import km.InterfaceC6727j;
import kotlin.text.C7076b;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import p014aj.C0096m;
import p080e.RunnableC5286r;
import p138gk.C5816f;
import p181ii.C6336e;
import p225kk.C6704a;
import p254m2.C7472a;
import p264mi.C7562b;
import p278nh.AbstractC7787n;
import p278nh.AbstractC7791r;
import p278nh.InterfaceC7775b;
import p487xi.C10201i;
import p512yi.C10372b0;
import p512yi.C10374c0;
import p512yi.C10389q;
import ph.C8292h0;
import ph.C8294h2;
import ph.C8351r1;
import ph.C8371v1;
import vi.C9735j;

/* JADX INFO: renamed from: jd.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6464i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37035c;

    public /* synthetic */ ViewOnClickListenerC6464i(Object obj, int i10, Object obj2) {
        this.f37033a = i10;
        this.f37034b = obj;
        this.f37035c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f37033a;
        Object obj = this.f37035c;
        Object obj2 = this.f37034b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Snackbar snackbar = (Snackbar) obj2;
                snackbar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                snackbar.m8834b(1);
                return;
            case 1:
                CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter = (CollectionsSearchFilterSelectionAdapter) obj2;
                CollectionsSearchFilterSelectionAdapter.AbstractC3584a abstractC3584a = (CollectionsSearchFilterSelectionAdapter.AbstractC3584a) obj;
                C5207g.m11111f(collectionsSearchFilterSelectionAdapter, "this$0");
                C5207g.m11111f(abstractC3584a, "$holder");
                CollectionsSearchFilterSelectionAdapter.AbstractC3585b abstractC3585bM4528p = collectionsSearchFilterSelectionAdapter.m4528p(((CollectionsSearchFilterSelectionAdapter.AbstractC3584a.c) abstractC3584a).m4241d());
                C5207g.m11109d(abstractC3585bM4528p, "null cannot be cast to non-null type com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.CollectionsFilterAdapterItem.Selection");
                collectionsSearchFilterSelectionAdapter.f23481e.mo9851b(((CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c) abstractC3585bM4528p).f23488a);
                return;
            case 2:
                PopupWindow popupWindow = (PopupWindow) obj2;
                C9735j c9735j = (C9735j) obj;
                C5207g.m11111f(popupWindow, "$popupWindow");
                C5207g.m11111f(c9735j, "this$0");
                popupWindow.dismiss();
                c9735j.f49760a.mo528n(CourseOverviewMenuItem.SaveAllLessons);
                return;
            case 3:
                C3700a.b bVar = (C3700a.b) obj2;
                C3700a c3700a = (C3700a) obj;
                C5207g.m11111f(bVar, "$holder");
                C5207g.m11111f(c3700a, "this$0");
                int iM4241d = ((C3700a.b.a) bVar).m4241d();
                if (iM4241d != -1) {
                    C3700a.a aVarM4528p = c3700a.m4528p(iM4241d);
                    C5207g.m11109d(aVarM4528p, "null cannot be cast to non-null type com.lingq.ui.home.language.LanguageSelectorAdapter.AdapterItem.Content");
                    c3700a.f24213e.mo9795a(((C3700a.a.C10621a) aVarM4528p).f24214a);
                    return;
                }
                return;
            case 4:
                C10201i c10201i = (C10201i) obj2;
                AbstractC7791r.a aVar = (AbstractC7791r.a) obj;
                C5207g.m11111f(c10201i, "this$0");
                C5207g.m11111f(aVar, "$item");
                InterfaceC7775b interfaceC7775b = c10201i.f51575f;
                if (interfaceC7775b != null) {
                    interfaceC7775b.mo10219b(!aVar.f42821a);
                }
                return;
            case 5:
                C10201i c10201i2 = (C10201i) obj2;
                AbstractC7791r.m mVar = (AbstractC7791r.m) obj;
                C5207g.m11111f(c10201i2, "this$0");
                C5207g.m11111f(mVar, "$item");
                Integer num = mVar.f42848c;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = mVar.f42849d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = mVar.f42850e;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = mVar.f42851f;
                c10201i2.f51574e.mo9914f(iIntValue, iIntValue2, iIntValue3, num4 != null ? num4.intValue() : 0);
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                CollectionsAdapter collectionsAdapter = (CollectionsAdapter) obj2;
                CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(jVar, "$item");
                collectionsAdapter.f24478f.mo9808h(jVar.f24496a, jVar.f24497b);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                PopupWindow popupWindow2 = (PopupWindow) obj2;
                C10389q c10389q = (C10389q) obj;
                C5207g.m11111f(popupWindow2, "$popupWindow");
                C5207g.m11111f(c10389q, "this$0");
                popupWindow2.dismiss();
                c10389q.f52179a.mo528n(CourseMenuItem.Like);
                return;
            case 8:
                PopupWindow popupWindow3 = (PopupWindow) obj2;
                C10372b0 c10372b0 = (C10372b0) obj;
                C5207g.m11111f(popupWindow3, "$popupWindow");
                C5207g.m11111f(c10372b0, "this$0");
                popupWindow3.dismiss();
                c10372b0.f52132a.mo528n(LessonMenuItem.Like);
                return;
            case 9:
                C10374c0 c10374c0 = (C10374c0) obj2;
                C10374c0.b bVar2 = (C10374c0.b) obj;
                C5207g.m11111f(c10374c0, "this$0");
                C5207g.m11111f(bVar2, "$holder");
                C6336e c6336eM4528p = c10374c0.m4528p(bVar2.m4241d());
                C5207g.m11110e(c6336eM4528p, "getItem(\n               …osition\n                )");
                c10374c0.f52136e.mo9804d(c6336eM4528p);
                return;
            case 10:
                C0096m c0096m = (C0096m) obj2;
                C0096m.b bVar3 = (C0096m.b) obj;
                C5207g.m11111f(c0096m, "this$0");
                C5207g.m11111f(bVar3, "$holderSelection");
                c0096m.f252e.mo9795a(c0096m.m4528p(bVar3.m4241d()).f42737d);
                return;
            case 11:
                C3887b c3887b = (C3887b) obj2;
                C3887b.a.C10625a c10625a = (C3887b.a.C10625a) obj;
                C5207g.m11111f(c3887b, "this$0");
                C5207g.m11111f(c10625a, "$item");
                c3887b.f25392e.mo9795a(c10625a.f25393a);
                return;
            case 12:
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) obj2;
                PlaylistAdapter.AbstractC3890c.a aVar2 = (PlaylistAdapter.AbstractC3890c.a) obj;
                C5207g.m11111f(playlistAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                C5207g.m11110e(view, "it");
                playlistAdapter.f25399f.mo9883i(view, aVar2.f25405a);
                return;
            case 13:
                PlaylistsAdapter playlistsAdapter = (PlaylistsAdapter) obj2;
                PlaylistsAdapter.AbstractC3951c.b bVar4 = (PlaylistsAdapter.AbstractC3951c.b) obj;
                C5207g.m11111f(playlistsAdapter, "this$0");
                C5207g.m11111f(bVar4, "$item");
                C5207g.m11110e(view, "it");
                playlistsAdapter.f25854f.mo10002c(view, bVar4.f25857a);
                return;
            case 14:
                PopupWindow popupWindow4 = (PopupWindow) obj2;
                C5195m c5195m = (C5195m) obj;
                C5207g.m11111f(popupWindow4, "$popupWindow");
                C5207g.m11111f(c5195m, "this$0");
                popupWindow4.dismiss();
                c5195m.f33237a.mo528n(VocabularyMenuItem.ExportAll);
                return;
            case 15:
                C4079a c4079a = (C4079a) obj2;
                AbstractC7787n.i iVar = (AbstractC7787n.i) obj;
                C5207g.m11111f(c4079a, "this$0");
                C5207g.m11111f(iVar, "$item");
                c4079a.f26529f.mo9849c("", iVar.f42768d);
                return;
            case 16:
                UserImportTextFragment userImportTextFragment = (UserImportTextFragment) obj2;
                C8294h2 c8294h2 = (C8294h2) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportTextFragment.f26757E0;
                C5207g.m11111f(userImportTextFragment, "this$0");
                C5207g.m11111f(c8294h2, "$this_with");
                String strValueOf = String.valueOf(((C8294h2) userImportTextFragment.f26758A0.m10489a(userImportTextFragment, UserImportTextFragment.f26757E0[0])).f44849c.getText());
                if (((C5557r) userImportTextFragment.f26761D0.getValue()).f34312b && !C4924a.m10425D(strValueOf)) {
                    c8294h2.f44850d.setError(userImportTextFragment.m3600t(R.string.user_import_invalid_url));
                    return;
                }
                UserImportTextViewModel userImportTextViewModel = (UserImportTextViewModel) userImportTextFragment.f26759B0.getValue();
                C5546g value = userImportTextViewModel.mo10080T1().getValue();
                int i11 = UserImportTextViewModel.C4127a.f26793a[userImportTextViewModel.f26790f.ordinal()];
                InterfaceC5547h interfaceC5547h = userImportTextViewModel.f26788d;
                if (i11 == 1) {
                    String string = C7076b.m14277B3(strValueOf).toString();
                    value.getClass();
                    C5207g.m11111f(string, "<set-?>");
                    value.f34281b = string;
                    interfaceC5547h.mo10085v0(value);
                } else if (i11 == 2) {
                    String string2 = C7076b.m14277B3(strValueOf).toString();
                    value.getClass();
                    C5207g.m11111f(string2, "<set-?>");
                    value.f34285f = string2;
                    interfaceC5547h.mo10085v0(value);
                } else if (i11 == 3) {
                    String string3 = C7076b.m14277B3(strValueOf).toString();
                    value.getClass();
                    C5207g.m11111f(string3, "<set-?>");
                    value.f34286g = string3;
                    interfaceC5547h.mo10085v0(value);
                }
                userImportTextViewModel.f26791g.mo14371k(Boolean.TRUE);
                return;
            case 17:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj2;
                C8292h0 c8292h0 = (C8292h0) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonDealWithWordsFragment.f29086F0;
                C5207g.m11111f(lessonDealWithWordsFragment, "this$0");
                C5207g.m11111f(c8292h0, "$this_with");
                C6704a c6704a = lessonDealWithWordsFragment.f29090D0;
                if (c6704a == null) {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
                c6704a.f37891b.edit().putBoolean("pagingDealWithWords", false).apply();
                Context contextM3578a0 = lessonDealWithWordsFragment.m3578a0();
                Object obj3 = C7472a.f41322a;
                c8292h0.f44836e.setCompoundDrawablesWithIntrinsicBounds(C7472a.c.m14849b(contextM3578a0, R.drawable.ic_check_thick), (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            case 18:
                C4495a.a aVar3 = (C4495a.a) obj2;
                C4495a c4495a = (C4495a) obj;
                C5207g.m11111f(aVar3, "$holder");
                C5207g.m11111f(c4495a, "this$0");
                if (aVar3.m4241d() != -1) {
                    InterfaceC7379f interfaceC7379fM4528p = c4495a.m4528p(aVar3.m4241d());
                    if (interfaceC7379fM4528p instanceof C7374a) {
                        C4495a.c cVar = c4495a.f29355f;
                        if (cVar != null) {
                            String strMo14774c = interfaceC7379fM4528p.mo14774c();
                            C7374a c7374a = (C7374a) interfaceC7379fM4528p;
                            C5207g.m11110e(view, "it");
                            cVar.mo10233a(strMo14774c, c7374a.f41150i, c7374a.f41151j, view);
                            return;
                        }
                    } else {
                        boolean z10 = interfaceC7379fM4528p instanceof C7378e;
                    }
                }
                return;
            case 19:
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = (ReviewActivityMultiAndClozeFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewActivityMultiAndClozeFragment.f29872H0;
                C5207g.m11111f(reviewActivityMultiAndClozeFragment, "this$0");
                InterfaceC3275c.a.m9347b(reviewActivityMultiAndClozeFragment.m10274o0(), reviewActivityMultiAndClozeFragment.m10274o0().mo498E1(), ((C7562b) obj).f41676a, true, 0.0f, 8);
                return;
            case 20:
                SettingsEditFragment.m10352u0((C8351r1) obj2, (SettingsEditFragment) obj);
                return;
            case 21:
                TokenFragment tokenFragment = (TokenFragment) obj2;
                C8371v1 c8371v1 = (C8371v1) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(c8371v1, "$this_with");
                tokenFragment.m10362n0().f45395q.m2796H(R.id.collapsedTransition, R.id.expandedTransition);
                tokenFragment.m10362n0().f45395q.m2798J();
                RecyclerView.AbstractC1109b0 abstractC1109b0M4175H = c8371v1.f45400v.m4175H(0);
                if (abstractC1109b0M4175H != null) {
                    ((C5816f.d) abstractC1109b0M4175H).f35115u.f45508b.postDelayed(new RunnableC5286r(abstractC1109b0M4175H, 21, tokenFragment), 100L);
                    return;
                }
                return;
            case 22:
                PopupWindow popupWindow5 = (PopupWindow) obj2;
                C5574p c5574p = (C5574p) obj;
                C5207g.m11111f(popupWindow5, "$popupWindow");
                C5207g.m11111f(c5574p, "this$0");
                popupWindow5.dismiss();
                c5574p.f34377a.mo528n(TokenStatusMenuItem.New);
                return;
            case 23:
                DictionariesManageAdapter dictionariesManageAdapter = (DictionariesManageAdapter) obj2;
                DictionariesManageAdapter.AbstractC4874b.b bVar5 = (DictionariesManageAdapter.AbstractC4874b.b) obj;
                C5207g.m11111f(dictionariesManageAdapter, "this$0");
                C5207g.m11111f(bVar5, "$item");
                dictionariesManageAdapter.f31765f.mo10392d(bVar5.f31771a);
                return;
            case 24:
                DictionaryContentFragment dictionaryContentFragment = (DictionaryContentFragment) obj2;
                DictionaryData dictionaryData = (DictionaryData) obj;
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                C5207g.m11111f(dictionaryContentFragment, "this$0");
                C5207g.m11111f(dictionaryData, "$data");
                InterfaceC3275c interfaceC3275c = dictionaryContentFragment.f31862W0;
                if (interfaceC3275c != null) {
                    InterfaceC3275c.a.m9347b(interfaceC3275c, dictionaryContentFragment.m10397v0().mo498E1(), dictionaryData.f31171a, false, 0.0f, 12);
                    return;
                } else {
                    C5207g.m11117l("ttsController");
                    throw null;
                }
            default:
                UpgradeGoPremiumFragment upgradeGoPremiumFragment = (UpgradeGoPremiumFragment) obj2;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = UpgradeGoPremiumFragment.f32014D0;
                C5207g.m11111f(upgradeGoPremiumFragment, "this$0");
                C5207g.m11111f((UpgradeReason) obj, "$reason");
                upgradeGoPremiumFragment.m3598r().m3628T(UpgradeGoPremiumFragment.class.getName());
                return;
        }
    }
}
