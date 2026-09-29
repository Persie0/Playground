package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$4", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {97}, m19208m = "invokeSuspend")
public final class VocabularyFilterSelectionFragment$onViewCreated$4$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26408e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterSelectionFragment f26409f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "show", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$4$1", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40461 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f26410e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFilterSelectionFragment f26411f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40461(VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment, InterfaceC9968c<? super C40461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26411f = vocabularyFilterSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40461 c40461 = new C40461(this.f26411f, interfaceC9968c);
            c40461.f26410e = ((Boolean) obj).booleanValue();
            return c40461;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40461) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f26410e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFilterSelectionFragment.f26380D0;
            TextView textView = this.f26411f.m10070n0().f44958a;
            C5207g.m11110e(textView, "binding.btnClear");
            textView.setVisibility(z10 ? 0 : 4);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionFragment$onViewCreated$4$4(VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment, InterfaceC9968c<? super VocabularyFilterSelectionFragment$onViewCreated$4$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26409f = vocabularyFilterSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterSelectionFragment$onViewCreated$4$4(this.f26409f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterSelectionFragment$onViewCreated$4$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26408e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFilterSelectionFragment.f26380D0;
            VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = this.f26409f;
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModelM10071o0 = vocabularyFilterSelectionFragment.m10071o0();
            C40461 c40461 = new C40461(vocabularyFilterSelectionFragment, null);
            this.f26408e = 1;
            if (C0062b.m369m0(vocabularyFilterSelectionViewModelM10071o0.f26423H, c40461, this) == coroutineSingletons) {
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
