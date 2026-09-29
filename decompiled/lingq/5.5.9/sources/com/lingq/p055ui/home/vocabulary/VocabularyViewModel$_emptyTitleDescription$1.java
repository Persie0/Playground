package com.lingq.p055ui.home.vocabulary;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"", "query", "", "hasCreatedLinqgs", "Lkotlin/Pair;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$_emptyTitleDescription$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyViewModel$_emptyTitleDescription$1 extends SuspendLambda implements InterfaceC2057q<String, Boolean, InterfaceC9968c<? super Pair<? extends Integer, ? extends Integer>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f26271e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f26272f;

    public VocabularyViewModel$_emptyTitleDescription$1(InterfaceC9968c<? super VocabularyViewModel$_emptyTitleDescription$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(String str, Boolean bool, InterfaceC9968c<? super Pair<? extends Integer, ? extends Integer>> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        VocabularyViewModel$_emptyTitleDescription$1 vocabularyViewModel$_emptyTitleDescription$1 = new VocabularyViewModel$_emptyTitleDescription$1(interfaceC9968c);
        vocabularyViewModel$_emptyTitleDescription$1.f26271e = str;
        vocabularyViewModel$_emptyTitleDescription$1.f26272f = zBooleanValue;
        return vocabularyViewModel$_emptyTitleDescription$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return (!C7661i.m15250P2(this.f26271e) || this.f26272f) ? new Pair(new Integer(R.string.search_no_search_results), new Integer(-1)) : new Pair(new Integer(R.string.vocabulary_empty_no_lingqs), new Integer(R.string.vocabulary_empty_choose_lesson));
    }
}
