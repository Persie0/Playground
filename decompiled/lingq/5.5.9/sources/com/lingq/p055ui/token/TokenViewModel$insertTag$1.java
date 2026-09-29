package com.lingq.p055ui.token;

import ci.InterfaceC2008a;
import ci.InterfaceC2012e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import gi.C5803a;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import li.InterfaceC7379f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$insertTag$1", m19206f = "TokenViewModel.kt", m19207l = {1210, 1213, 1219, 1223}, m19208m = "invokeSuspend")
final class TokenViewModel$insertTag$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f31604e;

    /* JADX INFO: renamed from: f */
    public TokenViewModel f31605f;

    /* JADX INFO: renamed from: g */
    public int f31606g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TokenViewModel f31607h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f31608i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$insertTag$1(TokenViewModel tokenViewModel, String str, InterfaceC9968c<? super TokenViewModel$insertTag$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31607h = tokenViewModel;
        this.f31608i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$insertTag$1(this.f31607h, this.f31608i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$insertTag$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo14774c;
        String str;
        String strMo14774c2;
        String str2;
        TokenViewModel tokenViewModel;
        C5803a c5803a;
        List<String> list;
        InterfaceC2012e interfaceC2012e;
        String strMo498E1;
        List<String> listM13453u0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31606g;
        String str3 = "";
        TokenViewModel tokenViewModel2 = this.f31607h;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                tokenViewModel2 = this.f31605f;
                str = this.f31604e;
                C7499b.m14977z0(obj);
                str2 = str;
                InterfaceC2012e interfaceC2012e2 = tokenViewModel2.f31453i;
                String strMo498E2 = tokenViewModel2.mo498E1();
                this.f31604e = str2;
                this.f31605f = tokenViewModel2;
                this.f31606g = 3;
                obj = interfaceC2012e2.mo6023i(strMo498E2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tokenViewModel = tokenViewModel2;
                c5803a = (C5803a) obj;
                if (c5803a != null) {
                    list = c5803a.f35072b;
                    if (!list.contains(str2)) {
                        LinkedHashSet linkedHashSetM17690M0 = C9338z.m17690M0(C6752c.m13456x0(list), str2);
                        interfaceC2012e = tokenViewModel.f31453i;
                        strMo498E1 = tokenViewModel.mo498E1();
                        listM13453u0 = C6752c.m13453u0(linkedHashSetM17690M0);
                        this.f31604e = null;
                        this.f31605f = null;
                        this.f31606g = 4;
                        if (interfaceC2012e.mo6028n(strMo498E1, listM13453u0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } else if (i10 == 3) {
                tokenViewModel = this.f31605f;
                str2 = this.f31604e;
                C7499b.m14977z0(obj);
                c5803a = (C5803a) obj;
                if (c5803a != null) {
                    list = c5803a.f35072b;
                    if (!list.contains(str2)) {
                        LinkedHashSet linkedHashSetM17690M1 = C9338z.m17690M0(C6752c.m13456x0(list), str2);
                        interfaceC2012e = tokenViewModel.f31453i;
                        strMo498E1 = tokenViewModel.mo498E1();
                        listM13453u0 = C6752c.m13453u0(linkedHashSetM17690M1);
                        this.f31604e = null;
                        this.f31605f = null;
                        this.f31606g = 4;
                        if (interfaceC2012e.mo6028n(strMo498E1, listM13453u0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2008a interfaceC2008a = tokenViewModel2.f31443d;
        String strMo498E3 = tokenViewModel2.mo498E1();
        InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel2.f31437X.getValue();
        if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
            strMo14774c = "";
        }
        this.f31606g = 1;
        obj = interfaceC2008a.mo5965q(strMo498E3, strMo14774c, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C7374a c7374a = (C7374a) obj;
        if (c7374a != null) {
            List<String> list2 = c7374a.f41143b;
            str = this.f31608i;
            if (!list2.contains(str)) {
                InterfaceC2008a interfaceC2008a2 = tokenViewModel2.f31443d;
                String strMo498E4 = tokenViewModel2.mo498E1();
                InterfaceC7379f interfaceC7379f2 = (InterfaceC7379f) tokenViewModel2.f31437X.getValue();
                if (interfaceC7379f2 != null && (strMo14774c2 = interfaceC7379f2.mo14774c()) != null) {
                    str3 = strMo14774c2;
                }
                this.f31604e = str;
                this.f31605f = tokenViewModel2;
                this.f31606g = 2;
                if (interfaceC2008a2.mo5967s(strMo498E4, str3, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                InterfaceC2012e interfaceC2012e3 = tokenViewModel2.f31453i;
                String strMo498E5 = tokenViewModel2.mo498E1();
                this.f31604e = str2;
                this.f31605f = tokenViewModel2;
                this.f31606g = 3;
                obj = interfaceC2012e3.mo6023i(strMo498E5, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tokenViewModel = tokenViewModel2;
                c5803a = (C5803a) obj;
                if (c5803a != null) {
                    list = c5803a.f35072b;
                    if (!list.contains(str2)) {
                        LinkedHashSet linkedHashSetM17690M2 = C9338z.m17690M0(C6752c.m13456x0(list), str2);
                        interfaceC2012e = tokenViewModel.f31453i;
                        strMo498E1 = tokenViewModel.mo498E1();
                        listM13453u0 = C6752c.m13453u0(linkedHashSetM17690M2);
                        this.f31604e = null;
                        this.f31605f = null;
                        this.f31606g = 4;
                        if (interfaceC2012e.mo6028n(strMo498E1, listM13453u0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            }
        }
        return C9072e.f47360a;
    }
}
