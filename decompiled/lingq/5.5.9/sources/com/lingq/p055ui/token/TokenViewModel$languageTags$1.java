package com.lingq.p055ui.token;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.InterfaceC7379f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m13365d2 = {"", "", "tags", "grammarTags", "Lli/f;", "selectedToken", "Lkotlin/Triple;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$languageTags$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class TokenViewModel$languageTags$1 extends SuspendLambda implements InterfaceC2058r<List<? extends String>, List<? extends String>, InterfaceC7379f, InterfaceC9968c<? super Triple<? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f31609e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f31610f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ InterfaceC7379f f31611g;

    public TokenViewModel$languageTags$1(InterfaceC9968c<? super TokenViewModel$languageTags$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(List<? extends String> list, List<? extends String> list2, InterfaceC7379f interfaceC7379f, InterfaceC9968c<? super Triple<? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>> interfaceC9968c) {
        TokenViewModel$languageTags$1 tokenViewModel$languageTags$1 = new TokenViewModel$languageTags$1(interfaceC9968c);
        tokenViewModel$languageTags$1.f31609e = list;
        tokenViewModel$languageTags$1.f31610f = list2;
        tokenViewModel$languageTags$1.f31611g = interfaceC7379f;
        return tokenViewModel$languageTags$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f31609e;
        List list2 = this.f31610f;
        return new Triple(list, C6752c.m13416J(C6752c.m13438f0(list2, this.f31611g.mo14773b())), list2);
    }
}
