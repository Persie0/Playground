package com.lingq.p055ui.token;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenTranslationSimple;
import com.lingq.shared.uimodel.token.TokenTranslations;
import dm.C5207g;
import fk.C5575q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7378e;
import li.InterfaceC7379f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$autoLingQCreate$1", m19206f = "TokenViewModel.kt", m19207l = {1251, 1255}, m19208m = "invokeSuspend")
final class TokenViewModel$autoLingQCreate$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31518e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31519f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f31520g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f31521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$autoLingQCreate$1(TokenViewModel tokenViewModel, boolean z10, boolean z11, InterfaceC9968c<? super TokenViewModel$autoLingQCreate$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31519f = tokenViewModel;
        this.f31520g = z10;
        this.f31521h = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$autoLingQCreate$1(this.f31519f, this.f31520g, this.f31521h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$autoLingQCreate$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo14774c;
        Object objMo6201k;
        List<TokenMeaning> list;
        Object objMo6165c;
        TokenTranslations tokenTranslations;
        List<TokenTranslationSimple> list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31518e;
        boolean z10 = this.f31521h;
        boolean z11 = this.f31520g;
        TokenViewModel tokenViewModel = this.f31519f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
                objMo6201k = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                objMo6165c = obj;
            }
            tokenTranslations = (TokenTranslations) objMo6165c;
            if (tokenTranslations != null || (list2 = tokenTranslations.f22122b) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TokenMeaning(0, tokenViewModel.mo507p1(), ((TokenTranslationSimple) it.next()).f22117a, 0, false, tokenViewModel.mo507p1(), true, 0));
                }
                list = arrayList;
            }
            if (list == null) {
                list = EmptyList.f38032a;
            }
            if (!list.isEmpty()) {
                TokenViewModel.m10374s2(tokenViewModel, (TokenMeaning) C6752c.m13425S(list), z11);
            } else if (z11) {
                InterfaceC4865b.a.m10388a(tokenViewModel, z10, 2);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel.f31437X.getValue();
        String strMo498E1 = tokenViewModel.mo498E1();
        if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
            strMo14774c = "";
        }
        this.f31518e = 1;
        objMo6201k = tokenViewModel.f31445e.mo6201k(strMo498E1, strMo14774c, this);
        if (objMo6201k == coroutineSingletons) {
            return coroutineSingletons;
        }
        C7378e c7378e = (C7378e) objMo6201k;
        if (c7378e != null) {
            if (C5207g.m11106a(c7378e.f41174h, WordStatus.New.getValue())) {
                C5575q c5575q = (C5575q) tokenViewModel.f31420O0.getValue();
                List<TokenMeaning> list3 = c7378e.f41171e;
                if (c5575q == null || (list = c5575q.f34380c) == null) {
                    list = list3;
                }
                if (list3.isEmpty()) {
                    String strMo498E2 = tokenViewModel.mo498E1();
                    String strMo507p1 = tokenViewModel.mo507p1();
                    this.f31518e = 2;
                    objMo6165c = tokenViewModel.f31447f.mo6165c(strMo498E2, strMo507p1, c7378e.f41167a, this);
                    if (objMo6165c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tokenTranslations = (TokenTranslations) objMo6165c;
                    if (tokenTranslations != null) {
                        list = null;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = EmptyList.f38032a;
                    }
                    if (!list.isEmpty()) {
                        TokenViewModel.m10374s2(tokenViewModel, (TokenMeaning) C6752c.m13425S(list), z11);
                    } else if (z11) {
                        InterfaceC4865b.a.m10388a(tokenViewModel, z10, 2);
                    }
                } else if (!list.isEmpty()) {
                    TokenViewModel.m10374s2(tokenViewModel, (TokenMeaning) C6752c.m13425S(list), z11);
                } else if (z11) {
                    InterfaceC4865b.a.m10388a(tokenViewModel, z10, 2);
                }
            }
            return C9072e.f47360a;
        }
        if (z11) {
            InterfaceC4865b.a.m10388a(tokenViewModel, z10, 2);
        }
        return C9072e.f47360a;
    }
}
