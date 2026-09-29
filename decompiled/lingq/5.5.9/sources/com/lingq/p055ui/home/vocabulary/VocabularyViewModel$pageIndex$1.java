package com.lingq.p055ui.home.vocabulary;

import android.support.v4.media.session.C0166e;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "totalPages", "currentPage", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$pageIndex$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyViewModel$pageIndex$1 extends SuspendLambda implements InterfaceC2057q<Integer, Integer, InterfaceC9968c<? super String>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f26306e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ int f26307f;

    public VocabularyViewModel$pageIndex$1(InterfaceC9968c<? super VocabularyViewModel$pageIndex$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Integer num, Integer num2, InterfaceC9968c<? super String> interfaceC9968c) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        VocabularyViewModel$pageIndex$1 vocabularyViewModel$pageIndex$1 = new VocabularyViewModel$pageIndex$1(interfaceC9968c);
        vocabularyViewModel$pageIndex$1.f26306e = iIntValue;
        vocabularyViewModel$pageIndex$1.f26307f = iIntValue2;
        return vocabularyViewModel$pageIndex$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        int i10 = this.f26306e;
        int i11 = this.f26307f;
        if (i10 == 0) {
            i10 = 1;
        }
        return C0166e.m770q(new Object[]{new Integer(i11), new Integer(i10)}, 2, "%d/%d", "format(format, *args)");
    }
}
