package com.lingq.commons.controllers;

import android.net.Uri;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.AbstractC6707d;
import p225kk.C6706c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.DeepLinkControllerImpl$deepLink$1", m19206f = "DeepLinkController.kt", m19207l = {58, 59}, m19208m = "invokeSuspend")
public final class DeepLinkControllerImpl$deepLink$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16518e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f16519f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DeepLinkControllerImpl f16520g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$deepLink$1(long j10, DeepLinkControllerImpl deepLinkControllerImpl, String str, InterfaceC9968c<? super DeepLinkControllerImpl$deepLink$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16519f = j10;
        this.f16520g = deepLinkControllerImpl;
        this.f16521h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DeepLinkControllerImpl$deepLink$1(this.f16519f, this.f16520g, this.f16521h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DeepLinkControllerImpl$deepLink$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0200  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        boolean z10;
        String str2;
        AbstractC6707d abstractC6707dM13314b;
        boolean z11;
        C7138s c7138s;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        AbstractC6707d.k kVar;
        String str7;
        String str8;
        Integer num2;
        AbstractC6707d.b bVar;
        Uri uri;
        AbstractC6707d.a aVar;
        Uri uri2;
        String str9;
        Uri uri3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16518e;
        DeepLinkControllerImpl deepLinkControllerImpl = this.f16520g;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            str = ((Login) obj).f17773b;
            if (str != null || str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String strMo498E1 = deepLinkControllerImpl.mo498E1();
            str2 = this.f16521h;
            abstractC6707dM13314b = new C6706c(str2, strMo498E1, !z10).m13314b();
            z11 = abstractC6707dM13314b instanceof AbstractC6707d.i;
            c7138s = deepLinkControllerImpl.f16516g;
            if (z11) {
                uri3 = ((AbstractC6707d.i) abstractC6707dM13314b).f37915a;
                if (uri3 != null) {
                    c7138s.mo14371k(new AbstractC3274b.i(uri3));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.l) {
                str9 = ((AbstractC6707d.l) abstractC6707dM13314b).f37919a;
                if (str9 != null) {
                    C7828f.m15570d(deepLinkControllerImpl.f16511b, deepLinkControllerImpl.f16512c, null, new DeepLinkControllerImpl$getFinalRedirectedUrl$1(deepLinkControllerImpl, str9, null), 2);
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.j) {
                c7138s.mo14371k(new AbstractC3274b.j(((AbstractC6707d.j) abstractC6707dM13314b).f37916a));
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.m) {
                AbstractC6707d.m mVar = (AbstractC6707d.m) abstractC6707dM13314b;
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, mVar.f37920a, new AbstractC3274b.n(mVar.f37921b));
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.a) {
                aVar = (AbstractC6707d.a) abstractC6707dM13314b;
                uri2 = aVar.f37900a;
                if (uri2 != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, aVar.f37901b, new AbstractC3274b.b(uri2));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.b) {
                bVar = (AbstractC6707d.b) abstractC6707dM13314b;
                uri = bVar.f37902a;
                if (uri != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, bVar.f37903b, new AbstractC3274b.a(uri));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.o) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, ((AbstractC6707d.o) abstractC6707dM13314b).f37923a, AbstractC3274b.r.f16704a);
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.g) {
                AbstractC6707d.g gVar = (AbstractC6707d.g) abstractC6707dM13314b;
                str8 = gVar.f37910a;
                if (str8 == null && (num2 = gVar.f37911b) != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str8, new AbstractC3274b.g(gVar.f37912c, num2.intValue(), gVar.f37913d));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.h) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, ((AbstractC6707d.h) abstractC6707dM13314b).f37914a, AbstractC3274b.h.f16692a);
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.n) {
                deepLinkControllerImpl.mo9319q(new AbstractC3274b.q(((AbstractC6707d.n) abstractC6707dM13314b).f37922a));
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.k) {
                c7138s.mo14371k(AbstractC3274b.h.f16692a);
                kVar = (AbstractC6707d.k) abstractC6707dM13314b;
                str7 = kVar.f37917a;
                if (str7 != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str7, new AbstractC3274b.l(kVar.f37918b, str7));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.c) {
                c7138s.mo14371k(AbstractC3274b.h.f16692a);
                AbstractC6707d.c cVar = (AbstractC6707d.c) abstractC6707dM13314b;
                str5 = cVar.f37904a;
                if (str5 == null && (str6 = cVar.f37905b) != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str5, new AbstractC3274b.o(str5, str6));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.d) {
                AbstractC6707d.d dVar = (AbstractC6707d.d) abstractC6707dM13314b;
                str4 = dVar.f37906a;
                if (str4 == null && (num = dVar.f37907b) != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str4, new AbstractC3274b.e(num.intValue()));
                }
            } else if (abstractC6707dM13314b instanceof AbstractC6707d.f) {
                c7138s.mo14371k(AbstractC3274b.h.f16692a);
                str3 = ((AbstractC6707d.f) abstractC6707dM13314b).f37909a;
                if (str3 != null) {
                    DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str3, AbstractC3274b.f.f16688a);
                }
            } else if (C4924a.m10425D(str2)) {
                deepLinkControllerImpl.mo9319q(new AbstractC3274b.p(str2));
            } else {
                deepLinkControllerImpl.mo9319q(AbstractC3274b.k.f16695a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        this.f16518e = 1;
        if (C7828f.m15567a(this.f16519f, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = deepLinkControllerImpl.f16510a.mo9613b();
        this.f16518e = 2;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = ((Login) obj).f17773b;
        if (str != null) {
            z10 = true;
        } else {
            z10 = true;
        }
        String strMo498E2 = deepLinkControllerImpl.mo498E1();
        str2 = this.f16521h;
        abstractC6707dM13314b = new C6706c(str2, strMo498E2, !z10).m13314b();
        z11 = abstractC6707dM13314b instanceof AbstractC6707d.i;
        c7138s = deepLinkControllerImpl.f16516g;
        if (z11) {
            uri3 = ((AbstractC6707d.i) abstractC6707dM13314b).f37915a;
            if (uri3 != null) {
                c7138s.mo14371k(new AbstractC3274b.i(uri3));
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.l) {
            str9 = ((AbstractC6707d.l) abstractC6707dM13314b).f37919a;
            if (str9 != null) {
                C7828f.m15570d(deepLinkControllerImpl.f16511b, deepLinkControllerImpl.f16512c, null, new DeepLinkControllerImpl$getFinalRedirectedUrl$1(deepLinkControllerImpl, str9, null), 2);
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.j) {
            c7138s.mo14371k(new AbstractC3274b.j(((AbstractC6707d.j) abstractC6707dM13314b).f37916a));
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.m) {
            AbstractC6707d.m mVar2 = (AbstractC6707d.m) abstractC6707dM13314b;
            DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, mVar2.f37920a, new AbstractC3274b.n(mVar2.f37921b));
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.a) {
            aVar = (AbstractC6707d.a) abstractC6707dM13314b;
            uri2 = aVar.f37900a;
            if (uri2 != null) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, aVar.f37901b, new AbstractC3274b.b(uri2));
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.b) {
            bVar = (AbstractC6707d.b) abstractC6707dM13314b;
            uri = bVar.f37902a;
            if (uri != null) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, bVar.f37903b, new AbstractC3274b.a(uri));
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.o) {
            DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, ((AbstractC6707d.o) abstractC6707dM13314b).f37923a, AbstractC3274b.r.f16704a);
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.g) {
            AbstractC6707d.g gVar2 = (AbstractC6707d.g) abstractC6707dM13314b;
            str8 = gVar2.f37910a;
            if (str8 == null) {
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.h) {
            DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, ((AbstractC6707d.h) abstractC6707dM13314b).f37914a, AbstractC3274b.h.f16692a);
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.n) {
            deepLinkControllerImpl.mo9319q(new AbstractC3274b.q(((AbstractC6707d.n) abstractC6707dM13314b).f37922a));
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.k) {
            c7138s.mo14371k(AbstractC3274b.h.f16692a);
            kVar = (AbstractC6707d.k) abstractC6707dM13314b;
            str7 = kVar.f37917a;
            if (str7 != null) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str7, new AbstractC3274b.l(kVar.f37918b, str7));
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.c) {
            c7138s.mo14371k(AbstractC3274b.h.f16692a);
            AbstractC6707d.c cVar2 = (AbstractC6707d.c) abstractC6707dM13314b;
            str5 = cVar2.f37904a;
            if (str5 == null) {
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.d) {
            AbstractC6707d.d dVar2 = (AbstractC6707d.d) abstractC6707dM13314b;
            str4 = dVar2.f37906a;
            if (str4 == null) {
            }
        } else if (abstractC6707dM13314b instanceof AbstractC6707d.f) {
            c7138s.mo14371k(AbstractC3274b.h.f16692a);
            str3 = ((AbstractC6707d.f) abstractC6707dM13314b).f37909a;
            if (str3 != null) {
                DeepLinkControllerImpl.m9316a(deepLinkControllerImpl, str3, AbstractC3274b.f.f16688a);
            }
        } else if (C4924a.m10425D(str2)) {
            deepLinkControllerImpl.mo9319q(new AbstractC3274b.p(str2));
        } else {
            deepLinkControllerImpl.mo9319q(AbstractC3274b.k.f16695a);
        }
        return C9072e.f47360a;
    }
}
