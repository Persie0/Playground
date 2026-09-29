package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1450h5;
import bi.AbstractC1562x5;
import ci.InterfaceC2023p;
import com.lingq.entity.TranslationGoogle;
import com.lingq.entity.Translations;
import com.lingq.shared.network.requests.RequestTranslate;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.token.TokenTranslations;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7376c;
import ni.C7793a;
import p003a2.C0009a;
import p260m8.C7499b;
import p367rh.C8806t;
import p367rh.C8807u;
import p460wh.InterfaceC9948p;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TokenDataRepositoryImpl implements InterfaceC2023p {

    /* JADX INFO: renamed from: a */
    public final AbstractC1450h5 f20541a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9948p f20542b;

    public TokenDataRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1450h5 abstractC1450h5, InterfaceC9948p interfaceC9948p, AbstractC1562x5 abstractC1562x5) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1450h5, "tokenDataDao");
        C5207g.m11111f(interfaceC9948p, "tokenDataService");
        C5207g.m11111f(abstractC1562x5, "wordDao");
        this.f20541a = abstractC1450h5;
        this.f20542b = interfaceC9948p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: a */
    public final Object mo6163a(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        TokenDataRepositoryImpl$networkPopularMeanings$1 tokenDataRepositoryImpl$networkPopularMeanings$1;
        TokenDataRepositoryImpl tokenDataRepositoryImpl;
        if (interfaceC9968c instanceof TokenDataRepositoryImpl$networkPopularMeanings$1) {
            tokenDataRepositoryImpl$networkPopularMeanings$1 = (TokenDataRepositoryImpl$networkPopularMeanings$1) interfaceC9968c;
            int i10 = tokenDataRepositoryImpl$networkPopularMeanings$1.f20549j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$networkPopularMeanings$1.f20549j = i10 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$networkPopularMeanings$1 = new TokenDataRepositoryImpl$networkPopularMeanings$1(this, interfaceC9968c);
            }
        } else {
            tokenDataRepositoryImpl$networkPopularMeanings$1 = new TokenDataRepositoryImpl$networkPopularMeanings$1(this, interfaceC9968c);
        }
        Object objM18526c = tokenDataRepositoryImpl$networkPopularMeanings$1.f20547h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = tokenDataRepositoryImpl$networkPopularMeanings$1.f20549j;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = tokenDataRepositoryImpl$networkPopularMeanings$1.f20546g;
                str2 = tokenDataRepositoryImpl$networkPopularMeanings$1.f20545f;
                str = tokenDataRepositoryImpl$networkPopularMeanings$1.f20544e;
                tokenDataRepositoryImpl = tokenDataRepositoryImpl$networkPopularMeanings$1.f20543d;
                C7499b.m14977z0(objM18526c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18526c);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18526c);
        InterfaceC9948p interfaceC9948p = this.f20542b;
        Boolean bool = Boolean.TRUE;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20543d = this;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20544e = str;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20545f = str2;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20546g = str3;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20549j = 1;
        objM18526c = interfaceC9948p.m18526c(str, str2, bool, str3, tokenDataRepositoryImpl$networkPopularMeanings$1);
        if (objM18526c == coroutineSingletons) {
            return coroutineSingletons;
        }
        tokenDataRepositoryImpl = this;
        AbstractC1450h5 abstractC1450h5 = tokenDataRepositoryImpl.f20541a;
        C8806t c8806t = new C8806t(C7793a.m15498b(str, C7793a.m15501e(str2, str)), str3, (List) objM18526c);
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20543d = null;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20544e = null;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20545f = null;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20546g = null;
        tokenDataRepositoryImpl$networkPopularMeanings$1.f20549j = 2;
        if (abstractC1450h5.mo5047f(c8806t, tokenDataRepositoryImpl$networkPopularMeanings$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: b */
    public final Object mo6164b(String str, String str2, String str3, int i10, InterfaceC9968c interfaceC9968c) throws Throwable {
        TokenDataRepositoryImpl$networkRelatedPhrases$1 tokenDataRepositoryImpl$networkRelatedPhrases$1;
        TokenDataRepositoryImpl tokenDataRepositoryImpl;
        if (interfaceC9968c instanceof TokenDataRepositoryImpl$networkRelatedPhrases$1) {
            tokenDataRepositoryImpl$networkRelatedPhrases$1 = (TokenDataRepositoryImpl$networkRelatedPhrases$1) interfaceC9968c;
            int i11 = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20556j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$networkRelatedPhrases$1.f20556j = i11 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$networkRelatedPhrases$1 = new TokenDataRepositoryImpl$networkRelatedPhrases$1(this, interfaceC9968c);
            }
        } else {
            tokenDataRepositoryImpl$networkRelatedPhrases$1 = new TokenDataRepositoryImpl$networkRelatedPhrases$1(this, interfaceC9968c);
        }
        Object objM18525b = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20554h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20556j;
        if (i12 != 0) {
            if (i12 == 1) {
                str3 = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20553g;
                str2 = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20552f;
                str = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20551e;
                tokenDataRepositoryImpl = tokenDataRepositoryImpl$networkRelatedPhrases$1.f20550d;
                C7499b.m14977z0(objM18525b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18525b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18525b);
        InterfaceC9948p interfaceC9948p = this.f20542b;
        Integer num = new Integer(i10);
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20550d = this;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20551e = str;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20552f = str2;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20553g = str3;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20556j = 1;
        objM18525b = interfaceC9948p.m18525b(str, str2, str3, num, tokenDataRepositoryImpl$networkRelatedPhrases$1);
        if (objM18525b == coroutineSingletons) {
            return coroutineSingletons;
        }
        tokenDataRepositoryImpl = this;
        AbstractC1450h5 abstractC1450h5 = tokenDataRepositoryImpl.f20541a;
        C8807u c8807u = new C8807u((List) objM18525b, C0009a.m21i(C7793a.m15498b(str, C7793a.m15501e(str2, str)), "_", str3));
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20550d = null;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20551e = null;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20552f = null;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20553g = null;
        tokenDataRepositoryImpl$networkRelatedPhrases$1.f20556j = 2;
        if (abstractC1450h5.mo5048g(c8807u, tokenDataRepositoryImpl$networkRelatedPhrases$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: c */
    public final Object mo6165c(String str, String str2, String str3, InterfaceC9968c<? super TokenTranslations> interfaceC9968c) {
        return this.f20541a.mo5045d(C7793a.m15498b(str2, C7793a.m15498b(str, str3)), interfaceC9968c);
    }

    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: d */
    public final InterfaceC7116c<C7376c> mo6166d(String str, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "term");
        C5207g.m11111f(str3, "locale");
        return C0062b.m273H0(this.f20541a.mo5042a(C7793a.m15498b(str, C7793a.m15501e(str2, str)), str3));
    }

    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: e */
    public final InterfaceC7116c mo6167e(String str, String str2, TokenType tokenType, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "term");
        C5207g.m11111f(tokenType, "type");
        C5207g.m11111f(str3, "fragment");
        return C0062b.m273H0(this.f20541a.mo5043b(C0009a.m21i(C7793a.m15498b(str, C7793a.m15501e(str2, str)), "_", str3)));
    }

    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<TokenTranslations> mo6168f(String str, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "targetLanguage");
        C5207g.m11111f(str3, "text");
        return C0062b.m273H0(this.f20541a.mo5044c(C7793a.m15498b(str, C7793a.m15498b(str2, C7793a.m15501e(str3, str)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2023p
    /* JADX INFO: renamed from: g */
    public final Object mo6169g(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        TokenDataRepositoryImpl$networkTokenTranslations$1 tokenDataRepositoryImpl$networkTokenTranslations$1;
        TokenDataRepositoryImpl tokenDataRepositoryImpl;
        if (interfaceC9968c instanceof TokenDataRepositoryImpl$networkTokenTranslations$1) {
            tokenDataRepositoryImpl$networkTokenTranslations$1 = (TokenDataRepositoryImpl$networkTokenTranslations$1) interfaceC9968c;
            int i10 = tokenDataRepositoryImpl$networkTokenTranslations$1.f20563j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tokenDataRepositoryImpl$networkTokenTranslations$1.f20563j = i10 - Integer.MIN_VALUE;
            } else {
                tokenDataRepositoryImpl$networkTokenTranslations$1 = new TokenDataRepositoryImpl$networkTokenTranslations$1(this, interfaceC9968c);
            }
        } else {
            tokenDataRepositoryImpl$networkTokenTranslations$1 = new TokenDataRepositoryImpl$networkTokenTranslations$1(this, interfaceC9968c);
        }
        Object objM18524a = tokenDataRepositoryImpl$networkTokenTranslations$1.f20561h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = tokenDataRepositoryImpl$networkTokenTranslations$1.f20563j;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = tokenDataRepositoryImpl$networkTokenTranslations$1.f20560g;
                str2 = tokenDataRepositoryImpl$networkTokenTranslations$1.f20559f;
                str = tokenDataRepositoryImpl$networkTokenTranslations$1.f20558e;
                tokenDataRepositoryImpl = tokenDataRepositoryImpl$networkTokenTranslations$1.f20557d;
                C7499b.m14977z0(objM18524a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18524a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18524a);
        RequestTranslate requestTranslate = new RequestTranslate(str, str2, str3);
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20557d = this;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20558e = str;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20559f = str2;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20560g = str3;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20563j = 1;
        objM18524a = this.f20542b.m18524a(str, requestTranslate, tokenDataRepositoryImpl$networkTokenTranslations$1);
        if (objM18524a == coroutineSingletons) {
            return coroutineSingletons;
        }
        tokenDataRepositoryImpl = this;
        Translations translations = new Translations(((TranslationGoogle) objM18524a).f17526a, C7793a.m15498b(str, C7793a.m15498b(str2, C7793a.m15501e(str3, str))));
        AbstractC1450h5 abstractC1450h5 = tokenDataRepositoryImpl.f20541a;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20557d = null;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20558e = null;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20559f = null;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20560g = null;
        tokenDataRepositoryImpl$networkTokenTranslations$1.f20563j = 2;
        if (abstractC1450h5.mo5046e(translations, tokenDataRepositoryImpl$networkTokenTranslations$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
