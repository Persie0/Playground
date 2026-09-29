package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2", m19206f = "VocabularyParentFilterFragment.kt", m19207l = {67}, m19208m = "invokeSuspend")
public final class VocabularyParentFilterFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26511e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyParentFilterFragment f26512f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2$1", m19206f = "VocabularyParentFilterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40701 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f26513e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyParentFilterFragment f26514f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40701(VocabularyParentFilterFragment vocabularyParentFilterFragment, InterfaceC9968c<? super C40701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26514f = vocabularyParentFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40701 c40701 = new C40701(this.f26514f, interfaceC9968c);
            c40701.f26513e = ((Boolean) obj).booleanValue();
            return c40701;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40701) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f26513e) {
                Fragment fragmentM3615C = this.f26514f.m3594l().m3615C(R.id.nav_host_fragment_vocabulary);
                C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                ((NavHostFragment) fragmentM3615C).m4035m0().m3995p();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyParentFilterFragment$onViewCreated$2$2(VocabularyParentFilterFragment vocabularyParentFilterFragment, InterfaceC9968c<? super VocabularyParentFilterFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26512f = vocabularyParentFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyParentFilterFragment$onViewCreated$2$2(this.f26512f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyParentFilterFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26511e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyParentFilterFragment vocabularyParentFilterFragment = this.f26512f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10047e2 = ((VocabularyParentFilterViewModel) vocabularyParentFilterFragment.f26499Q0.getValue()).mo10047e2();
            C40701 c40701 = new C40701(vocabularyParentFilterFragment, null);
            this.f26511e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10047e2, c40701, this) == coroutineSingletons) {
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
