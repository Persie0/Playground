package com.lingq.p055ui.token;

import ae.C0062b;
import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.C7115b;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import li.C7374a;
import li.C7375b;
import li.C7378e;
import li.InterfaceC7379f;
import ni.C7793a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lli/f;", "Lcom/lingq/ui/token/TokenData;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$selectedToken$1", m19206f = "TokenViewModel.kt", m19207l = {119, 121, 123}, m19208m = "invokeSuspend")
final class TokenViewModel$selectedToken$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super InterfaceC7379f>, TokenData, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31632e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31633f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ TokenData f31634g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TokenViewModel f31635h;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$selectedToken$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lli/e;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$selectedToken$1$1", m19206f = "TokenViewModel.kt", m19207l = {133}, m19208m = "invokeSuspend")
    public static final class C48541 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31636e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31637f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC7117d<InterfaceC7379f> f31638g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ TokenData f31639h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C48541(TokenViewModel tokenViewModel, InterfaceC7117d<? super InterfaceC7379f> interfaceC7117d, TokenData tokenData, InterfaceC9968c<? super C48541> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31637f = tokenViewModel;
            this.f31638g = interfaceC7117d;
            this.f31639h = tokenData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48541(this.f31637f, this.f31638g, this.f31639h, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super C7378e> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48541) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31636e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Locale localeForLanguageTag = Locale.forLanguageTag(this.f31637f.mo498E1());
                TokenData tokenData = this.f31639h;
                String str = tokenData.f31175a;
                C5207g.m11110e(localeForLanguageTag, "locale");
                String strM15502f = C7793a.m15502f(str, localeForLanguageTag);
                String value = WordStatus.New.getValue();
                List listM14299s3 = C7076b.m14299s3(tokenData.f31175a, new String[]{" "}, 0, 6);
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listM14299s3, 10));
                Iterator it = listM14299s3.iterator();
                while (it.hasNext()) {
                    arrayList.add(C7793a.m15502f((String) it.next(), localeForLanguageTag));
                }
                C7375b c7375b = new C7375b(strM15502f, tokenData.f31182h, value, arrayList);
                this.f31636e = 1;
                if (this.f31638g.mo1339r(c7375b, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$selectedToken$1$a */
    public /* synthetic */ class C4855a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31640a;

        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.WordType.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenType.NewWordOrPhraseType.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31640a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$selectedToken$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$selectedToken$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f31635h = tokenViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super InterfaceC7379f> interfaceC7117d, TokenData tokenData, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        TokenViewModel$selectedToken$1 tokenViewModel$selectedToken$1 = new TokenViewModel$selectedToken$1(this.f31635h, interfaceC9968c);
        tokenViewModel$selectedToken$1.f31633f = interfaceC7117d;
        tokenViewModel$selectedToken$1.f31634g = tokenData;
        return tokenViewModel$selectedToken$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        TokenData tokenData;
        String str;
        InterfaceC7116c<C7378e> interfaceC7116cMo6191a;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31632e;
        String str3 = "";
        TokenViewModel tokenViewModel = this.f31635h;
        if (i10 != 0) {
            if (i10 == 1) {
                tokenData = this.f31634g;
                interfaceC7117d = this.f31633f;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        interfaceC7117d = this.f31633f;
        tokenData = this.f31634g;
        InterfaceC2008a interfaceC2008a = tokenViewModel.f31443d;
        String strMo498E1 = tokenViewModel.mo498E1();
        if (tokenData == null || (str = tokenData.f31175a) == null) {
            str = "";
        }
        this.f31633f = interfaceC7117d;
        this.f31634g = tokenData;
        this.f31632e = 1;
        obj = interfaceC2008a.mo5965q(strMo498E1, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((C7374a) obj) != null) {
            InterfaceC2008a interfaceC2008a2 = tokenViewModel.f31443d;
            String strMo498E2 = tokenViewModel.mo498E1();
            if (tokenData != null && (str2 = tokenData.f31175a) != null) {
                str3 = str2;
            }
            InterfaceC7116c<C7374a> interfaceC7116cMo5959k = interfaceC2008a2.mo5959k(strMo498E2, str3);
            this.f31633f = null;
            this.f31634g = null;
            this.f31632e = 2;
            if (C0062b.m280J0(this, interfaceC7116cMo5959k, interfaceC7117d) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            TokenType tokenType = tokenData != null ? tokenData.f31176b : null;
            int i11 = tokenType == null ? -1 : C4855a.f31640a[tokenType.ordinal()];
            if (i11 != 1) {
                interfaceC7116cMo6191a = i11 != 2 ? C7115b.f40281a : new C7136q(new C48541(tokenViewModel, interfaceC7117d, tokenData, null));
            } else {
                interfaceC7116cMo6191a = tokenViewModel.f31445e.mo6191a(tokenViewModel.mo498E1(), tokenData.f31175a);
            }
            this.f31633f = null;
            this.f31634g = null;
            this.f31632e = 3;
            if (C0062b.m280J0(this, interfaceC7116cMo6191a, interfaceC7117d) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
