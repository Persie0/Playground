package com.lingq.p055ui.token;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import fk.C5568j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$insertMeaning$1", m19206f = "TokenViewModel.kt", m19207l = {1135, 1138}, m19208m = "invokeSuspend")
final class TokenViewModel$insertMeaning$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f31592H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f31593I;

    /* JADX INFO: renamed from: e */
    public TokenViewModel f31594e;

    /* JADX INFO: renamed from: f */
    public TokenMeaning f31595f;

    /* JADX INFO: renamed from: g */
    public String f31596g;

    /* JADX INFO: renamed from: h */
    public int f31597h;

    /* JADX INFO: renamed from: i */
    public boolean f31598i;

    /* JADX INFO: renamed from: j */
    public int f31599j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TokenMeaning f31600k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TokenViewModel f31601l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$insertMeaning$1(TokenMeaning tokenMeaning, TokenViewModel tokenViewModel, int i10, boolean z10, InterfaceC9968c<? super TokenViewModel$insertMeaning$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31600k = tokenMeaning;
        this.f31601l = tokenViewModel;
        this.f31592H = i10;
        this.f31593I = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$insertMeaning$1(this.f31600k, this.f31601l, this.f31592H, this.f31593I, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$insertMeaning$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo14774c;
        Object objMo5970v;
        TokenViewModel tokenViewModel;
        String str;
        int i10;
        boolean z10;
        TokenMeaning tokenMeaning;
        boolean z11;
        TokenViewModel tokenViewModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f31599j;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z12 = this.f31598i;
                int i12 = this.f31597h;
                str = this.f31596g;
                tokenMeaning = this.f31595f;
                TokenViewModel tokenViewModel3 = this.f31594e;
                C7499b.m14977z0(obj);
                z10 = z12;
                tokenViewModel = tokenViewModel3;
                i10 = i12;
                objMo5970v = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.f31598i;
                tokenViewModel2 = this.f31594e;
                C7499b.m14977z0(obj);
            }
            C7828f.m15570d(tokenViewModel2.f31409J, null, null, new TokenViewModel$insertMeaning$1$1$1(tokenViewModel2, null), 3);
            tokenViewModel2.mo9730a1();
            if (z11) {
                InterfaceC4865b.a.m10388a(tokenViewModel2, false, 3);
            } else {
                TokenViewModel.m10372p2(tokenViewModel2, (InterfaceC7379f) tokenViewModel2.f31437X.getValue());
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        TokenMeaning tokenMeaning2 = this.f31600k;
        if (tokenMeaning2 != null) {
            TokenViewModel tokenViewModel4 = this.f31601l;
            InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel4.f31437X.getValue();
            if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
                strMo14774c = "";
            }
            if (strMo14774c.length() > 0) {
                String strMo498E1 = tokenViewModel4.mo498E1();
                this.f31594e = tokenViewModel4;
                this.f31595f = tokenMeaning2;
                this.f31596g = strMo14774c;
                int i13 = this.f31592H;
                this.f31597h = i13;
                boolean z13 = this.f31593I;
                this.f31598i = z13;
                this.f31599j = 1;
                objMo5970v = tokenViewModel4.f31443d.mo5970v(strMo498E1, strMo14774c, tokenMeaning2, this);
                if (objMo5970v == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tokenViewModel = tokenViewModel4;
                str = strMo14774c;
                i10 = i13;
                z10 = z13;
                tokenMeaning = tokenMeaning2;
            }
        }
        return C9072e.f47360a;
        if (!((Boolean) objMo5970v).booleanValue()) {
            InterfaceC2008a interfaceC2008a = tokenViewModel.f31443d;
            C5568j c5568j = tokenViewModel.f31429T;
            int i14 = c5568j.f34367b;
            String strMo498E2 = tokenViewModel.mo498E1();
            String str2 = c5568j.f34366a.f31179e.f27865a;
            this.f31594e = tokenViewModel;
            this.f31595f = null;
            this.f31596g = null;
            this.f31598i = z10;
            this.f31599j = 2;
            if (interfaceC2008a.mo5969u(i14, strMo498E2, str, tokenMeaning, i10, str2, "", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            z11 = z10;
            tokenViewModel2 = tokenViewModel;
            C7828f.m15570d(tokenViewModel2.f31409J, null, null, new TokenViewModel$insertMeaning$1$1$1(tokenViewModel2, null), 3);
            tokenViewModel2.mo9730a1();
            if (z11) {
                InterfaceC4865b.a.m10388a(tokenViewModel2, false, 3);
            } else {
                TokenViewModel.m10372p2(tokenViewModel2, (InterfaceC7379f) tokenViewModel2.f31437X.getValue());
            }
        }
        return C9072e.f47360a;
    }
}
