package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$9", m19206f = "VocabularyFragment.kt", m19207l = {327}, m19208m = "invokeSuspend")
public final class VocabularyFragment$onViewCreated$3$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26208e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFragment f26209f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$9$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/e;", "nav", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$9$1", m19206f = "VocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40181 extends SuspendLambda implements InterfaceC2056p<AbstractC4033e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26210e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFragment f26211f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40181(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super C40181> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26211f = vocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40181 c40181 = new C40181(this.f26211f, interfaceC9968c);
            c40181.f26210e = obj;
            return c40181;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4033e abstractC4033e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40181) mo1336a(abstractC4033e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4033e abstractC4033e = (AbstractC4033e) this.f26210e;
            boolean zM11106a = C5207g.m11106a(abstractC4033e, AbstractC4033e.a.f26343a);
            VocabularyFragment vocabularyFragment = this.f26211f;
            if (zM11106a) {
                NavController navControllerM16725g0 = C8573r0.m16725g0(vocabularyFragment);
                Bundle bundle = new Bundle();
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToVocabularyFilter) != null) {
                    navControllerM16725g0.m3992m(R.id.actionToVocabularyFilter, bundle, null);
                }
            } else if (abstractC4033e instanceof AbstractC4033e.b) {
                if (C8573r0.m16725g0(vocabularyFragment).m3988i().f6834h == R.id.nav_graph_home) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
                    HomeViewModel homeViewModel = (HomeViewModel) vocabularyFragment.f26136C0.getValue();
                    homeViewModel.f22743S.mo16479j(new HomeViewModel.AbstractC3479a.h(false, ((AbstractC4033e.b) abstractC4033e).f26344a, null, 22));
                } else {
                    C6704a c6704a = vocabularyFragment.f26139F0;
                    if (c6704a == null) {
                        C5207g.m11117l("appSettings");
                        throw null;
                    }
                    c6704a.m13311m(C6744b.m13393y0(((AbstractC4033e.b) abstractC4033e).f26344a.toArray(new String[0])));
                    C4924a.m10447Z(C8573r0.m16725g0(vocabularyFragment), C5206f.m11020r0(-1, null, true, true, 0, null, null, null, 242));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFragment$onViewCreated$3$9(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super VocabularyFragment$onViewCreated$3$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26209f = vocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFragment$onViewCreated$3$9(this.f26209f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFragment$onViewCreated$3$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26208e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = this.f26209f;
            VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
            C40181 c40181 = new C40181(vocabularyFragment, null);
            this.f26208e = 1;
            if (C0062b.m369m0(vocabularyViewModelM10022q0.f26239Z, c40181, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
