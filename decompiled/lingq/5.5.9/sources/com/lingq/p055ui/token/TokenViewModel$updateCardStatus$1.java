package com.lingq.p055ui.token;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import li.C7376c;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$updateCardStatus$1", m19206f = "TokenViewModel.kt", m19207l = {1043, 1046, 1051}, m19208m = "invokeSuspend")
final class TokenViewModel$updateCardStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Object f31671e;

    /* JADX INFO: renamed from: f */
    public TokenViewModel f31672f;

    /* JADX INFO: renamed from: g */
    public int f31673g;

    /* JADX INFO: renamed from: h */
    public boolean f31674h;

    /* JADX INFO: renamed from: i */
    public int f31675i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TokenViewModel f31676j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f31677k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f31678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$updateCardStatus$1(TokenViewModel tokenViewModel, int i10, boolean z10, InterfaceC9968c<? super TokenViewModel$updateCardStatus$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31676j = tokenViewModel;
        this.f31677k = i10;
        this.f31678l = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$updateCardStatus$1(this.f31676j, this.f31677k, this.f31678l, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$updateCardStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        TokenViewModel tokenViewModel;
        InterfaceC7379f interfaceC7379f;
        boolean z10;
        int i10;
        TokenMeaning tokenMeaning;
        List<TokenMeaning> list;
        boolean z11;
        TokenViewModel tokenViewModel2;
        InterfaceC7379f interfaceC7379f2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f31675i;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel3 = this.f31676j;
            InterfaceC7379f interfaceC7379f3 = (InterfaceC7379f) tokenViewModel3.f31437X.getValue();
            if (interfaceC7379f3 != null) {
                String strMo498E1 = tokenViewModel3.mo498E1();
                String strMo14774c = interfaceC7379f3.mo14774c();
                this.f31671e = interfaceC7379f3;
                this.f31672f = tokenViewModel3;
                int i12 = this.f31677k;
                this.f31673g = i12;
                boolean z12 = this.f31678l;
                this.f31674h = z12;
                this.f31675i = 1;
                Object objMo5965q = tokenViewModel3.f31443d.mo5965q(strMo498E1, strMo14774c, this);
                if (objMo5965q == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tokenViewModel = tokenViewModel3;
                obj = objMo5965q;
                interfaceC7379f = interfaceC7379f3;
                z10 = z12;
                i10 = i12;
            }
            return C9072e.f47360a;
        }
        if (i11 == 1) {
            z10 = this.f31674h;
            int i13 = this.f31673g;
            TokenViewModel tokenViewModel4 = this.f31672f;
            interfaceC7379f = (InterfaceC7379f) this.f31671e;
            C7499b.m14977z0(obj);
            i10 = i13;
            tokenViewModel = tokenViewModel4;
        } else if (i11 == 2) {
            z11 = this.f31674h;
            tokenViewModel2 = this.f31672f;
            interfaceC7379f2 = (InterfaceC7379f) this.f31671e;
            C7499b.m14977z0(obj);
            if (z11) {
                TokenViewModel.m10372p2(tokenViewModel2, interfaceC7379f2);
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.f31674h;
            tokenViewModel2 = (TokenViewModel) this.f31671e;
            C7499b.m14977z0(obj);
        }
        if (!z11) {
            InterfaceC4865b.a.m10388a(tokenViewModel2, false, 3);
        }
        return C9072e.f47360a;
        C7374a c7374a = (C7374a) obj;
        if (c7374a != null) {
            int value = CardStatus.Ignored.getValue();
            String str = c7374a.f41142a;
            if (i10 == value) {
                InterfaceC2008a interfaceC2008a = tokenViewModel.f31443d;
                String strMo498E2 = tokenViewModel.mo498E1();
                this.f31671e = interfaceC7379f;
                this.f31672f = tokenViewModel;
                this.f31674h = z10;
                this.f31675i = 2;
                if (interfaceC2008a.mo5950b(i10, strMo498E2, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z11 = z10;
                interfaceC7379f2 = interfaceC7379f;
                tokenViewModel2 = tokenViewModel;
                if (z11) {
                    TokenViewModel.m10372p2(tokenViewModel2, interfaceC7379f2);
                }
            } else {
                InterfaceC2008a interfaceC2008a2 = tokenViewModel.f31443d;
                String strMo498E3 = tokenViewModel.mo498E1();
                this.f31671e = tokenViewModel;
                this.f31672f = null;
                this.f31674h = z10;
                this.f31675i = 3;
                if (interfaceC2008a2.mo5957i(i10, strMo498E3, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z11 = z10;
                tokenViewModel2 = tokenViewModel;
            }
            if (!z11) {
                InterfaceC4865b.a.m10388a(tokenViewModel2, false, 3);
            }
        } else if (i10 == CardStatus.Ignored.getValue()) {
            tokenViewModel.m10377B2(WordStatus.Ignored.getValue(), !z10);
        } else if (i10 == CardStatus.Known.getValue()) {
            tokenViewModel.m10377B2(WordStatus.Known.getValue(), !z10);
        } else {
            TokenMeaning tokenMeaning2 = (TokenMeaning) C6752c.m13425S(interfaceC7379f.mo14772a());
            if (tokenMeaning2 != null) {
                tokenMeaning = tokenMeaning2;
            } else {
                C7376c c7376c = (C7376c) tokenViewModel.f31442c0.getValue();
                if (c7376c == null || (list = c7376c.f41165a) == null) {
                    tokenMeaning = null;
                } else {
                    tokenMeaning2 = (TokenMeaning) C6752c.m13425S(list);
                    tokenMeaning = tokenMeaning2;
                }
            }
            tokenViewModel.getClass();
            C7828f.m15570d(tokenViewModel.f31409J, null, null, new TokenViewModel$insertMeaning$1(tokenMeaning, tokenViewModel, i10, !z10, null), 3);
        }
        return C9072e.f47360a;
    }
}
