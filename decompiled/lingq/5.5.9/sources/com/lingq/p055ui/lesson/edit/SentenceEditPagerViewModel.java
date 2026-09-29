package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2015h;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p204jj.InterfaceC6484e;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/SentenceEditPagerViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Ljj/e;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceEditPagerViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC6484e {

    /* JADX INFO: renamed from: H */
    public final C7135p f28109H;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f28110d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2015h f28111e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3275c f28112f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f28113g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC6484e f28114h;

    /* JADX INFO: renamed from: i */
    public final int f28115i;

    /* JADX INFO: renamed from: j */
    public final boolean f28116j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f28117k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f28118l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPagerViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPagerViewModel$1", m19206f = "SentenceEditPagerViewModel.kt", m19207l = {41}, m19208m = "invokeSuspend")
    final class C43051 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28119e;

        public C43051(InterfaceC9968c<? super C43051> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SentenceEditPagerViewModel.this.new C43051(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43051) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28119e;
            SentenceEditPagerViewModel sentenceEditPagerViewModel = SentenceEditPagerViewModel.this;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC3324a interfaceC3324a = sentenceEditPagerViewModel.f28110d;
                String strMo498E1 = sentenceEditPagerViewModel.mo498E1();
                this.f28119e = 1;
                obj = interfaceC3324a.mo9501W(sentenceEditPagerViewModel.f28115i, strMo498E1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                StateFlowImpl stateFlowImpl = sentenceEditPagerViewModel.f28118l;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                int i11 = 0;
                while (i11 < size) {
                    i11++;
                    arrayList.add(new C4307b.a(sentenceEditPagerViewModel.f28115i, i11, sentenceEditPagerViewModel.f28116j));
                }
                stateFlowImpl.setValue(arrayList);
            }
            return C9072e.f47360a;
        }
    }

    public SentenceEditPagerViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2015h interfaceC2015h, ExecutorC7177a executorC7177a, InterfaceC3275c interfaceC3275c, InterfaceC0113j interfaceC0113j, InterfaceC6484e interfaceC6484e, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6484e, "lessonEditDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28110d = interfaceC3324a;
        this.f28111e = interfaceC2015h;
        this.f28112f = interfaceC3275c;
        this.f28113g = interfaceC0113j;
        this.f28114h = interfaceC6484e;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f28115i = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) c1024c0.m3929b("hasAudio");
        this.f28116j = bool != null ? bool.booleanValue() : false;
        Integer num2 = (Integer) c1024c0.m3929b("sentenceIndex");
        this.f28117k = C7120g.m14379a(Integer.valueOf(num2 != null ? num2.intValue() : 0));
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f28118l = stateFlowImplM14379a;
        this.f28109H = C0062b.m353h2(stateFlowImplM14379a, C8573r0.m16767w0(this), C6715l.f37936a, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43051(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f28113g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28113g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f28113g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28113g.mo499J(profile, interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC7137r<Boolean> mo10155K0() {
        return this.f28114h.mo10155K0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC7137r<Pair<Integer, Integer>> mo10156M0() {
        return this.f28114h.mo10156M0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f28113g.mo500P();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: T */
    public final void mo10157T(int i10) {
        this.f28114h.mo10157T(i10);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: W0 */
    public final void mo10158W0() {
        this.f28114h.mo10158W0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: Z1 */
    public final List<Integer> mo10159Z1() {
        return this.f28114h.mo10159Z1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28113g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f28113g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28113g.mo503f1(interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: i */
    public final void mo10160i(int i10, int i11) {
        this.f28114h.mo10160i(i10, i11);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f28113g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28113g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f28113g.mo506l1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC7137r<Boolean> mo10161m0() {
        return this.f28114h.mo10161m0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f28113g.mo507p1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: s0 */
    public final void mo10162s0() {
        this.f28114h.mo10162s0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f28113g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f28113g.mo509w0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: x1 */
    public final void mo10163x1() {
        this.f28114h.mo10163x1();
    }
}
