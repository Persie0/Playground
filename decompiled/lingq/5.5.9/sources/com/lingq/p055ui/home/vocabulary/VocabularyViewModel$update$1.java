package com.lingq.p055ui.home.vocabulary;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$update$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyViewModel$update$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ VocabularyViewModel f26321e;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$update$1$a */
    public /* synthetic */ class C4028a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26322a;

        static {
            int[] iArr = new int[VocabularyAdapter.SelectedContent.values().length];
            try {
                iArr[VocabularyAdapter.SelectedContent.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VocabularyAdapter.SelectedContent.Phrases.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VocabularyAdapter.SelectedContent.SrsDue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26322a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$update$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$update$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26321e = vocabularyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$update$1(this.f26321e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$update$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        VocabularyViewModel vocabularyViewModel = this.f26321e;
        int i10 = C4028a.f26322a[((VocabularyAdapter.SelectedContent) vocabularyViewModel.f26223J.getValue()).ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            VocabularyViewModel.m10023l2(vocabularyViewModel);
        }
        return C9072e.f47360a;
    }
}
