package com.lingq.p055ui.info;

import ae.C0062b;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2010c;
import ci.InterfaceC2014g;
import ci.InterfaceC2019l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p137gj.C5808d;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/info/LessonInfoViewModel;", "Landroidx/lifecycle/h0;", "Luh/a;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonInfoViewModel extends AbstractC1036h0 implements InterfaceC9527a, InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC0113j f26920H;

    /* JADX INFO: renamed from: I */
    public final C5808d f26921I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f26922J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f26923K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f26924L;

    /* JADX INFO: renamed from: M */
    public final C7135p f26925M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f26926N;

    /* JADX INFO: renamed from: O */
    public final C7135p f26927O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f26928P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f26929Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f26930R;

    /* JADX INFO: renamed from: S */
    public final C7135p f26931S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f26932T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f26933U;

    /* JADX INFO: renamed from: V */
    public final AbstractChannel f26934V;

    /* JADX INFO: renamed from: W */
    public final C7114a f26935W;

    /* JADX INFO: renamed from: X */
    public final AbstractChannel f26936X;

    /* JADX INFO: renamed from: Y */
    public final C7114a f26937Y;

    /* JADX INFO: renamed from: Z */
    public final C7135p f26938Z;

    /* JADX INFO: renamed from: a0 */
    public final C7135p f26939a0;

    /* JADX INFO: renamed from: b0 */
    public final C7138s f26940b0;

    /* JADX INFO: renamed from: c0 */
    public final C7134o f26941c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f26942d;

    /* JADX INFO: renamed from: d0 */
    public final C7138s f26943d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2014g f26944e;

    /* JADX INFO: renamed from: e0 */
    public final C7134o f26945e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2019l f26946f;

    /* JADX INFO: renamed from: f0 */
    public final C7138s f26947f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2010c f26948g;

    /* JADX INFO: renamed from: g0 */
    public final C7134o f26949g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5182d f26950h;

    /* JADX INFO: renamed from: h0 */
    public final StateFlowImpl f26951h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5180b f26952i;

    /* JADX INFO: renamed from: i0 */
    public final C7135p f26953i0;

    /* JADX INFO: renamed from: j */
    public final CoroutineDispatcher f26954j;

    /* JADX INFO: renamed from: k */
    public final CoroutineJobManager f26955k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC9527a f26956l;

    public LessonInfoViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2014g interfaceC2014g, InterfaceC2019l interfaceC2019l, InterfaceC2010c interfaceC2010c, InterfaceC5182d interfaceC5182d, InterfaceC5180b interfaceC5180b, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, InterfaceC9527a interfaceC9527a, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26942d = interfaceC3324a;
        this.f26944e = interfaceC2014g;
        this.f26946f = interfaceC2019l;
        this.f26948g = interfaceC2010c;
        this.f26950h = interfaceC5182d;
        this.f26952i = interfaceC5180b;
        this.f26954j = executorC7177a;
        this.f26955k = coroutineJobManager;
        this.f26956l = interfaceC9527a;
        this.f26920H = interfaceC0113j;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"lessonId\" of type integer does not support null values");
        }
        if (!linkedHashMap.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str = (String) c1024c0.m3929b("title");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("imageURL")) {
            throw new IllegalArgumentException("Required argument \"imageURL\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) c1024c0.m3929b("imageURL");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"imageURL\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("originalImageUrl")) {
            throw new IllegalArgumentException("Required argument \"originalImageUrl\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) c1024c0.m3929b("originalImageUrl");
        if (!linkedHashMap.containsKey("description")) {
            throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) c1024c0.m3929b("description");
        if (str4 == null) {
            throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("from")) {
            throw new IllegalArgumentException("Required argument \"from\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LessonInfoParent.class) && !Serializable.class.isAssignableFrom(LessonInfoParent.class)) {
            throw new UnsupportedOperationException(LessonInfoParent.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LessonInfoParent lessonInfoParent = (LessonInfoParent) c1024c0.m3929b("from");
        if (lessonInfoParent == null) {
            throw new IllegalArgumentException("Argument \"from\" is marked as non-null but was passed a null value");
        }
        int iIntValue = num.intValue();
        this.f26921I = new C5808d(iIntValue, str, str2, str3, str4, lessonInfoParent);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f26922J = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f26923K = stateFlowImplM14379a2;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool);
        this.f26924L = stateFlowImplM14379a3;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f26925M = C0062b.m353h2(stateFlowImplM14379a3, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(0);
        this.f26926N = stateFlowImplM14379a4;
        this.f26927O = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        Resource.Status status = Resource.Status.LOADING;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(status);
        this.f26928P = stateFlowImplM14379a5;
        this.f26929Q = C0062b.m353h2(stateFlowImplM14379a5, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a("");
        this.f26930R = stateFlowImplM14379a6;
        this.f26931S = C0062b.m353h2(stateFlowImplM14379a6, C8573r0.m16767w0(this), startedWhileSubscribed, "");
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(bool);
        this.f26932T = stateFlowImplM14379a7;
        C0062b.m353h2(stateFlowImplM14379a7, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(bool);
        this.f26933U = stateFlowImplM14379a8;
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f26934V = abstractChannelM16738m;
        this.f26935W = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f26936X = abstractChannelM16738m2;
        this.f26937Y = C0062b.m287L1(abstractChannelM16738m2);
        this.f26938Z = C0062b.m353h2(new C7131l(stateFlowImplM14379a8, stateFlowImplM14379a7, new LessonInfoViewModel$isAvailableOffline$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f26939a0 = C0062b.m353h2(C0062b.m385q0(stateFlowImplM14379a, stateFlowImplM14379a2, new LessonInfoViewModel$lessonWithCounters$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26940b0 = c7138sM10448a;
        this.f26941c0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f26943d0 = c7138sM10448a2;
        this.f26945e0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f26947f0 = c7138sM10448a3;
        this.f26949g0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(null);
        this.f26951h0 = stateFlowImplM14379a9;
        this.f26953i0 = C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("getLesson ", iIntValue), new LessonInfoViewModel$getLesson$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("fetchLesson ", iIntValue), new LessonInfoViewModel$fetchLesson$1(this, null));
        List listM17251q = C9000b.m17251q(Integer.valueOf(iIntValue));
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonInfoViewModel$getLessonCounters$1(this, listM17251q, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonInfoViewModel$fetchLessonCounters$1(this, listM17251q, null), 3);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("isLessonAudioDownloaded $", iIntValue), new LessonInfoViewModel$isLessonAudioDownloaded$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("isLessonDownloaded ", iIntValue), new LessonInfoViewModel$isLessonDownloaded$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0166e.m761g("lessonPlaylists $", iIntValue), new LessonInfoViewModel$getPlaylistLessonCount$1(this, null));
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m10100l2(LessonInfoViewModel lessonInfoViewModel, int i10) {
        C7499b.m14933c0(C8573r0.m16767w0(lessonInfoViewModel), lessonInfoViewModel.f26955k, lessonInfoViewModel.f26954j, C0166e.m761g("fetchCourse ", i10), new LessonInfoViewModel$fetchCourse$1(lessonInfoViewModel, i10, null));
    }

    /* JADX INFO: renamed from: m2 */
    public static final void m10101m2(LessonInfoViewModel lessonInfoViewModel, int i10) {
        lessonInfoViewModel.getClass();
        C7499b.m14933c0(C8573r0.m16767w0(lessonInfoViewModel), lessonInfoViewModel.f26955k, lessonInfoViewModel.f26954j, C0166e.m761g("getCourse ", i10), new LessonInfoViewModel$getCourse$1(lessonInfoViewModel, i10, null));
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f26956l.mo9391A0(i10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26920H.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26920H.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26920H.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26920H.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26920H.mo500P();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26956l.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f26956l.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26956l.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f26956l.mo9409a2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26920H.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26920H;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26920H.mo503f1(interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f26956l.mo9412i1(arrayList, str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26920H.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26920H.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26920H.mo506l1();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m10102n2() {
        LessonInfo lessonInfo = (LessonInfo) this.f26922J.getValue();
        int i10 = lessonInfo != null ? lessonInfo.f21961L : 0;
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) this.f26923K.getValue();
        return (libraryItemCounter != null && !libraryItemCounter.f22009f) && i10 > 0;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m10103o2(AbstractC4161d abstractC4161d) {
        if ((abstractC4161d instanceof AbstractC4161d.b) && m10102n2()) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonInfoViewModel$showBuyPremiumLesson$1(this, null), 3);
        } else {
            this.f26934V.mo16479j(abstractC4161d);
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26920H.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m10104p2(InterfaceC4158a interfaceC4158a) {
        if (m10102n2()) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonInfoViewModel$showBuyPremiumLesson$1(this, null), 3);
        } else {
            this.f26936X.mo16479j(interfaceC4158a);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final void m10105q2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f26955k, this.f26954j, C0166e.m761g("updateLike ", this.f26921I.f35086a), new LessonInfoViewModel$updateLike$1(this, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26920H.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26920H.mo509w0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26956l.mo9422x0(downloadItem, interfaceC9968c);
    }
}
