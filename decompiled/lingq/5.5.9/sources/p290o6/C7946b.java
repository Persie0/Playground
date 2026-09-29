package p290o6;

import android.graphics.Point;
import androidx.appcompat.widget.C0337q0;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.collect.AbstractC3177a0;
import com.google.common.collect.ImmutableList;
import com.lingq.p055ui.home.challenges.ChallengesFragment;
import com.lingq.p055ui.home.collections.CollectionsFragment;
import com.lingq.p055ui.home.language.stats.LanguageStatsFragment;
import com.lingq.p055ui.home.library.LibraryFragment;
import com.lingq.p055ui.home.notifications.NotificationsFragment;
import com.lingq.p055ui.home.playlist.PlaylistFragment;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.linguist.R;
import dm.C5207g;
import ga.C5735r;
import java.util.List;
import km.InterfaceC6727j;
import p043c7.InterfaceC1742h;
import p045c9.C1753g;
import p067d8.AbstractServiceConnectionC5081u;
import p090e9.InterfaceC5385a;
import p174i9.InterfaceC6208b;
import p225kk.C6716m;
import p452w8.AbstractC9838s;
import p479xa.C10134c0;
import p479xa.C10144m;
import ph.C8268d0;
import ph.C8273e;
import ph.C8280f0;
import ph.C8364u;
import ph.C8369v;
import ph.C8370v0;
import ph.C8379x;
import ua.C9496e;

/* JADX INFO: renamed from: o6.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7946b implements InterfaceC1742h, AbstractServiceConnectionC5081u.a, InterfaceC5385a.a, C10144m.a, C9496e.g.a, InterfaceC2004a.a, SwipeRefreshLayout.InterfaceC1198f, C0337q0.a, NestedScrollView.InterfaceC0786c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43280b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43281c;

    public /* synthetic */ C7946b(Object obj, int i10, Object obj2) {
        this.f43279a = i10;
        this.f43280b = obj;
        this.f43281c = obj2;
    }

    @Override // p043c7.InterfaceC1742h
    /* JADX INFO: renamed from: a */
    public final void mo5478a(Object obj) {
        C7950d c7950d = (C7950d) this.f43280b;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f43281c;
        ReferrerDetails referrerDetails = (ReferrerDetails) obj;
        C7944a c7944a = c7950d.f43289b;
        try {
            String installReferrer = referrerDetails.getInstallReferrer();
            C7986y c7986y = c7944a.f43272f;
            CleverTapInstanceConfig cleverTapInstanceConfig = c7944a.f43270d;
            c7986y.f43454L = referrerDetails.getReferrerClickTimestampSeconds();
            c7986y.f43459a = referrerDetails.getInstallBeginTimestampSeconds();
            c7944a.f43267a.m6415x0(installReferrer);
            c7986y.f43467i = true;
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            c2181aM6433b.getClass();
            C2181a.m6452d(cleverTapInstanceConfig.f10995a, "Install Referrer data set [Referrer URL-" + installReferrer + "]");
        } catch (NullPointerException e10) {
            C2181a c2181aM6433b2 = c7944a.f43270d.m6433b();
            String str = c7944a.f43270d.f10995a;
            String str2 = "Install referrer client null pointer exception caused by Google Play Install Referrer library - " + e10.getMessage();
            c2181aM6433b2.getClass();
            C2181a.m6452d(str, str2);
            installReferrerClient.endConnection();
            c7944a.f43272f.f43467i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // ua.C9496e.g.a
    /* JADX INFO: renamed from: b */
    public final List mo10864b(int i10, C5735r c5735r, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Point point;
        C9496e.c cVar = (C9496e.c) this.f43280b;
        int[] iArr2 = (int[]) this.f43281c;
        AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
        int i17 = iArr2[i10];
        int i18 = cVar.f48979i;
        int i19 = -1;
        if (i18 == Integer.MAX_VALUE || (i13 = cVar.f48980j) == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i20 = Integer.MAX_VALUE;
            for (int i21 = 0; i21 < c5735r.f34800a; i21++) {
                C2416m c2416m = c5735r.f34803d[i21];
                int i22 = c2416m.f12455L;
                if (i22 > 0 && (i14 = c2416m.f12456M) > 0) {
                    if (!cVar.f48981k) {
                        i15 = i18;
                        i16 = i13;
                    } else if ((i22 > i14) != (i18 > i13)) {
                        i16 = i18;
                        i15 = i13;
                    } else {
                        i15 = i18;
                        i16 = i13;
                    }
                    int i23 = i22 * i16;
                    int i24 = i14 * i15;
                    if (i23 >= i24) {
                        int i25 = C10134c0.f51354a;
                        point = new Point(i15, ((i24 + i22) - 1) / i22);
                    } else {
                        int i26 = C10134c0.f51354a;
                        point = new Point(((i23 + i14) - 1) / i14, i16);
                    }
                    int i27 = c2416m.f12455L;
                    int i28 = i27 * i14;
                    if (i27 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i28 < i20) {
                        i20 = i28;
                    }
                }
            }
            i11 = i20;
        }
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        int i29 = 0;
        while (i29 < c5735r.f34800a) {
            C2416m c2416m2 = c5735r.f34803d[i29];
            int i30 = c2416m2.f12455L;
            int i31 = (i30 == i19 || (i12 = c2416m2.f12456M) == i19) ? i19 : i30 * i12;
            c3146a.m9055b(new C9496e.h(i10, c5735r, i29, cVar, iArr[i29], i17, i11 == Integer.MAX_VALUE || (i31 != i19 && i31 <= i11)));
            i29++;
            i19 = -1;
        }
        return c3146a.m9068e();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1198f
    /* JADX INFO: renamed from: c */
    public final void mo4616c() {
        int i10 = this.f43279a;
        Object obj = this.f43281c;
        Object obj2 = this.f43280b;
        switch (i10) {
            case 10:
                ChallengesFragment.m9791n0((ChallengesFragment) obj2, (C8273e) obj);
                return;
            case 11:
                CollectionsFragment.m9798n0((CollectionsFragment) obj2, (C8364u) obj);
                return;
            case 12:
                LanguageStatsFragment.m9906n0((LanguageStatsFragment) obj2, (C8268d0) obj);
                return;
            case 14:
                LibraryFragment.m9933n0((LibraryFragment) obj2, (C8369v) obj);
                return;
            case 15:
                NotificationsFragment.m9967n0((NotificationsFragment) obj2, (C8370v0) obj);
                return;
        }
        PlaylistFragment.m9980n0((PlaylistFragment) obj2, (C8379x) obj);
    }

    @Override // androidx.core.widget.NestedScrollView.InterfaceC0786c
    /* JADX INFO: renamed from: d */
    public final void mo3002d(NestedScrollView nestedScrollView, int i10) {
        C8280f0 c8280f0 = (C8280f0) this.f43280b;
        LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) this.f43281c;
        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
        C5207g.m11111f(c8280f0, "$this_with");
        C5207g.m11111f(lessonCompleteFragment, "this$0");
        C5207g.m11111f(nestedScrollView, "<anonymous parameter 0>");
        AppBarLayout appBarLayout = c8280f0.f44752a;
        MaterialToolbar materialToolbar = c8280f0.f44755d;
        if (i10 == 0) {
            List<Integer> list = C6716m.f37937a;
            materialToolbar.setBackgroundColor(C6716m.m13333r(R.attr.backgroundGeneralAlternative, lessonCompleteFragment.m3578a0()));
            appBarLayout.setBackgroundColor(C6716m.m13333r(R.attr.backgroundGeneralAlternative, lessonCompleteFragment.m3578a0()));
            materialToolbar.setElevation(0.0f);
            appBarLayout.setElevation(0.0f);
            return;
        }
        List<Integer> list2 = C6716m.f37937a;
        materialToolbar.setBackgroundColor(C6716m.m13333r(R.attr.backgroundGeneral, lessonCompleteFragment.m3578a0()));
        appBarLayout.setBackgroundColor(C6716m.m13333r(R.attr.backgroundGeneral, lessonCompleteFragment.m3578a0()));
        materialToolbar.setElevation(5.0f);
        appBarLayout.setElevation(5.0f);
    }

    @Override // cf.InterfaceC2004a.a
    /* JADX INFO: renamed from: f */
    public final void mo5937f(InterfaceC2005b interfaceC2005b) {
        InterfaceC2004a.a aVar = (InterfaceC2004a.a) this.f43280b;
        InterfaceC2004a.a aVar2 = (InterfaceC2004a.a) this.f43281c;
        aVar.mo5937f(interfaceC2005b);
        aVar2.mo5937f(interfaceC2005b);
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        C1753g c1753g = (C1753g) this.f43280b;
        return Boolean.valueOf(c1753g.f9632c.mo10860j1((AbstractC9838s) this.f43281c));
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f43279a;
        Object obj2 = this.f43281c;
        Object obj3 = this.f43280b;
        switch (i10) {
            case 3:
                ((InterfaceC6208b) obj).getClass();
                break;
            case 4:
                ((InterfaceC6208b) obj).mo12770E((InterfaceC6208b.a) obj3, (String) obj2);
                break;
            case 5:
                ((InterfaceC6208b) obj).getClass();
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC6208b) obj).getClass();
                break;
            default:
                ((InterfaceC6208b) obj).mo12788b((InterfaceC6208b.a) obj3, (C2505u) obj2);
                break;
        }
    }
}
