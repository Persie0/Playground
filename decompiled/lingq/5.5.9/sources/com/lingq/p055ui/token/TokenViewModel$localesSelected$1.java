package com.lingq.p055ui.token;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "locales", "Lkotlin/Pair;", "", "selected", "Lkotlin/Triple;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$localesSelected$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class TokenViewModel$localesSelected$1 extends SuspendLambda implements InterfaceC2057q<List<? extends UserDictionaryLocale>, Pair<? extends List<? extends String>, ? extends String>, InterfaceC9968c<? super Triple<? extends List<? extends UserDictionaryLocale>, ? extends List<? extends String>, ? extends String>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f31612e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Pair f31613f;

    public TokenViewModel$localesSelected$1(InterfaceC9968c<? super TokenViewModel$localesSelected$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends UserDictionaryLocale> list, Pair<? extends List<? extends String>, ? extends String> pair, InterfaceC9968c<? super Triple<? extends List<? extends UserDictionaryLocale>, ? extends List<? extends String>, ? extends String>> interfaceC9968c) {
        TokenViewModel$localesSelected$1 tokenViewModel$localesSelected$1 = new TokenViewModel$localesSelected$1(interfaceC9968c);
        tokenViewModel$localesSelected$1.f31612e = list;
        tokenViewModel$localesSelected$1.f31613f = pair;
        return tokenViewModel$localesSelected$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f31612e;
        Pair pair = this.f31613f;
        return new Triple(list, pair.f38012a, pair.f38013b);
    }
}
