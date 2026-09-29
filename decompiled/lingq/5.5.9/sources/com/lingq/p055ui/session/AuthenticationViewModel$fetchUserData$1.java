package com.lingq.p055ui.session;

import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2015h;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$fetchUserData$1", m19206f = "AuthenticationViewModel.kt", m19207l = {353, 355, 359, 360, 361, 364, 365, 366, 382, 390, 392, 396, 405}, m19208m = "invokeSuspend")
public final class AuthenticationViewModel$fetchUserData$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Resource f30559e;

    /* JADX INFO: renamed from: f */
    public Resource f30560f;

    /* JADX INFO: renamed from: g */
    public Resource f30561g;

    /* JADX INFO: renamed from: h */
    public Resource f30562h;

    /* JADX INFO: renamed from: i */
    public int f30563i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AuthenticationViewModel f30564j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$fetchUserData$1(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super AuthenticationViewModel$fetchUserData$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30564j = authenticationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$fetchUserData$1(this.f30564j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$fetchUserData$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:104:0x027e  */
    /* JADX WARN: Code duplicated, block: B:105:0x028d  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0235  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Resource resource;
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        Resource resource2;
        Resource resource3;
        Resource resource4;
        Object objMo6027m;
        Resource resource5;
        Resource resource6;
        Resource resource7;
        Resource resource8;
        Profile profile2;
        String str;
        InterfaceC2011d interfaceC2011d;
        InterfaceC2015h interfaceC2015h;
        Resource.Status status;
        Resource.Status status2;
        Resource resourceM9437c;
        Profile profile3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30563i;
        boolean z10 = true;
        AuthenticationViewModel authenticationViewModel = this.f30564j;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                if (!authenticationViewModel.f30558l.m15512e()) {
                    this.f30563i = 13;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        C7138s c7138s = authenticationViewModel.f30537O;
                        Resource.C3303a c3303a = Resource.f17861d;
                        Boolean bool = Boolean.TRUE;
                        c3303a.getClass();
                        c7138s.mo14371k(Resource.C3303a.m9437c(bool));
                    } else {
                        authenticationViewModel.f30537O.mo14371k(Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data")));
                    }
                    return C9072e.f47360a;
                }
                Resource.f17861d.getClass();
                authenticationViewModel.f30539Q.setValue(new Resource(Resource.Status.LOADING, null, null).f17862a);
                this.f30563i = 1;
                obj = authenticationViewModel.f30550d.mo6148q(true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource = (Resource) obj;
                profile = (Profile) resource.f17863b;
                if (profile != null) {
                    interfaceC5180b = authenticationViewModel.f30557k;
                    this.f30559e = resource;
                    this.f30563i = 2;
                    if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (resource.f17862a != Resource.Status.SUCCESS) {
                    if (!authenticationViewModel.f30558l.m15514g()) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = authenticationViewModel.f30557k.mo9619h();
                        this.f30559e = null;
                        this.f30563i = 10;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile3 = (Profile) obj;
                        String strM15510c = authenticationViewModel.f30558l.m15510c("language_code");
                        profile3.getClass();
                        profile3.f17795o = strM15510c;
                        this.f30563i = 11;
                        if (authenticationViewModel.f30557k.mo9620i(profile3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    this.f30559e = null;
                    this.f30563i = 12;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a2 = Resource.f17861d;
                        Boolean bool2 = Boolean.TRUE;
                        c3303a2.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool2);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                InterfaceC2020m interfaceC2020m = authenticationViewModel.f30550d;
                this.f30559e = resource;
                this.f30563i = 3;
                obj = interfaceC2020m.mo6146o(true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource2 = resource;
                resource3 = (Resource) obj;
                InterfaceC2012e interfaceC2012e = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30563i = 4;
                obj = interfaceC2012e.mo6015a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource4 = (Resource) obj;
                InterfaceC2012e interfaceC2012e2 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30561g = resource4;
                this.f30563i = 5;
                objMo6027m = interfaceC2012e2.mo6027m(this);
                if (objMo6027m == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource5 = resource2;
                resource6 = resource4;
                obj = objMo6027m;
                resource7 = resource3;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2 || resource7.f17862a != status2 || resource6.f17862a != status2 || resource8.f17862a != status2) {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a3 = Resource.f17861d;
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        c3303a3.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a4 = Resource.f17861d;
                            Boolean bool3 = Boolean.TRUE;
                            c3303a4.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool3);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h2 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a5 = Resource.f17861d;
                    Boolean boolValueOf2 = Boolean.valueOf(z10);
                    c3303a5.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf2);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a6 = Resource.f17861d;
                        Boolean bool4 = Boolean.TRUE;
                        c3303a6.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool4);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                resource = (Resource) obj;
                profile = (Profile) resource.f17863b;
                if (profile != null) {
                    interfaceC5180b = authenticationViewModel.f30557k;
                    this.f30559e = resource;
                    this.f30563i = 2;
                    if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (resource.f17862a != Resource.Status.SUCCESS) {
                    if (!authenticationViewModel.f30558l.m15514g()) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h3 = authenticationViewModel.f30557k.mo9619h();
                        this.f30559e = null;
                        this.f30563i = 10;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h3, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile3 = (Profile) obj;
                        String strM15510c2 = authenticationViewModel.f30558l.m15510c("language_code");
                        profile3.getClass();
                        profile3.f17795o = strM15510c2;
                        this.f30563i = 11;
                        if (authenticationViewModel.f30557k.mo9620i(profile3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    this.f30559e = null;
                    this.f30563i = 12;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a7 = Resource.f17861d;
                        Boolean bool5 = Boolean.TRUE;
                        c3303a7.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool5);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                InterfaceC2020m interfaceC2020m2 = authenticationViewModel.f30550d;
                this.f30559e = resource;
                this.f30563i = 3;
                obj = interfaceC2020m2.mo6146o(true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource2 = resource;
                resource3 = (Resource) obj;
                InterfaceC2012e interfaceC2012e3 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30563i = 4;
                obj = interfaceC2012e3.mo6015a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource4 = (Resource) obj;
                InterfaceC2012e interfaceC2012e4 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30561g = resource4;
                this.f30563i = 5;
                objMo6027m = interfaceC2012e4.mo6027m(this);
                if (objMo6027m == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource5 = resource2;
                resource6 = resource4;
                obj = objMo6027m;
                resource7 = resource3;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a8 = Resource.f17861d;
                        Boolean boolValueOf3 = Boolean.valueOf(z10);
                        c3303a8.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf3);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a9 = Resource.f17861d;
                            Boolean bool6 = Boolean.TRUE;
                            c3303a9.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool6);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h4 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h4, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a10 = Resource.f17861d;
                    Boolean boolValueOf4 = Boolean.valueOf(z10);
                    c3303a10.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf4);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a11 = Resource.f17861d;
                        Boolean bool7 = Boolean.TRUE;
                        c3303a11.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool7);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 2:
                resource = this.f30559e;
                C7499b.m14977z0(obj);
                if (resource.f17862a != Resource.Status.SUCCESS) {
                    if (!authenticationViewModel.f30558l.m15514g()) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h5 = authenticationViewModel.f30557k.mo9619h();
                        this.f30559e = null;
                        this.f30563i = 10;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h5, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile3 = (Profile) obj;
                        String strM15510c3 = authenticationViewModel.f30558l.m15510c("language_code");
                        profile3.getClass();
                        profile3.f17795o = strM15510c3;
                        this.f30563i = 11;
                        if (authenticationViewModel.f30557k.mo9620i(profile3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    this.f30559e = null;
                    this.f30563i = 12;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a12 = Resource.f17861d;
                        Boolean bool8 = Boolean.TRUE;
                        c3303a12.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool8);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                InterfaceC2020m interfaceC2020m3 = authenticationViewModel.f30550d;
                this.f30559e = resource;
                this.f30563i = 3;
                obj = interfaceC2020m3.mo6146o(true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource2 = resource;
                resource3 = (Resource) obj;
                InterfaceC2012e interfaceC2012e5 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30563i = 4;
                obj = interfaceC2012e5.mo6015a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource4 = (Resource) obj;
                InterfaceC2012e interfaceC2012e6 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30561g = resource4;
                this.f30563i = 5;
                objMo6027m = interfaceC2012e6.mo6027m(this);
                if (objMo6027m == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource5 = resource2;
                resource6 = resource4;
                obj = objMo6027m;
                resource7 = resource3;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a13 = Resource.f17861d;
                        Boolean boolValueOf5 = Boolean.valueOf(z10);
                        c3303a13.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf5);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a14 = Resource.f17861d;
                            Boolean bool9 = Boolean.TRUE;
                            c3303a14.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool9);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h6 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h6, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a15 = Resource.f17861d;
                    Boolean boolValueOf6 = Boolean.valueOf(z10);
                    c3303a15.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf6);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a16 = Resource.f17861d;
                        Boolean bool10 = Boolean.TRUE;
                        c3303a16.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool10);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 3:
                resource = this.f30559e;
                C7499b.m14977z0(obj);
                resource2 = resource;
                resource3 = (Resource) obj;
                InterfaceC2012e interfaceC2012e7 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30563i = 4;
                obj = interfaceC2012e7.mo6015a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource4 = (Resource) obj;
                InterfaceC2012e interfaceC2012e8 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30561g = resource4;
                this.f30563i = 5;
                objMo6027m = interfaceC2012e8.mo6027m(this);
                if (objMo6027m == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource5 = resource2;
                resource6 = resource4;
                obj = objMo6027m;
                resource7 = resource3;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a17 = Resource.f17861d;
                        Boolean boolValueOf7 = Boolean.valueOf(z10);
                        c3303a17.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf7);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a18 = Resource.f17861d;
                            Boolean bool11 = Boolean.TRUE;
                            c3303a18.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool11);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h7 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h7, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a19 = Resource.f17861d;
                    Boolean boolValueOf8 = Boolean.valueOf(z10);
                    c3303a19.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf8);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a110 = Resource.f17861d;
                        Boolean bool12 = Boolean.TRUE;
                        c3303a110.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool12);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 4:
                resource3 = this.f30560f;
                resource2 = this.f30559e;
                C7499b.m14977z0(obj);
                resource4 = (Resource) obj;
                InterfaceC2012e interfaceC2012e9 = authenticationViewModel.f30551e;
                this.f30559e = resource2;
                this.f30560f = resource3;
                this.f30561g = resource4;
                this.f30563i = 5;
                objMo6027m = interfaceC2012e9.mo6027m(this);
                if (objMo6027m == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resource5 = resource2;
                resource6 = resource4;
                obj = objMo6027m;
                resource7 = resource3;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a111 = Resource.f17861d;
                        Boolean boolValueOf9 = Boolean.valueOf(z10);
                        c3303a111.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf9);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a112 = Resource.f17861d;
                            Boolean bool13 = Boolean.TRUE;
                            c3303a112.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool13);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h8 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h8, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a113 = Resource.f17861d;
                    Boolean boolValueOf10 = Boolean.valueOf(z10);
                    c3303a113.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf10);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a114 = Resource.f17861d;
                        Boolean bool14 = Boolean.TRUE;
                        c3303a114.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool14);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 5:
                Resource resource9 = this.f30561g;
                Resource resource10 = this.f30560f;
                Resource resource11 = this.f30559e;
                C7499b.m14977z0(obj);
                resource5 = resource11;
                resource7 = resource10;
                resource6 = resource9;
                resource8 = (Resource) obj;
                profile2 = (Profile) resource5.f17863b;
                if (profile2 != null) {
                    str = profile2.f17795o;
                    if (str == null) {
                    }
                    interfaceC2011d = authenticationViewModel.f30553g;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 7;
                    if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC2015h = authenticationViewModel.f30552f;
                    this.f30559e = resource5;
                    this.f30560f = resource7;
                    this.f30561g = resource6;
                    this.f30562h = resource8;
                    this.f30563i = 8;
                    if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    status = resource5.f17862a;
                    status2 = Resource.Status.SUCCESS;
                    if (status == status2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                    }
                    if (z10) {
                        Resource.C3303a c3303a115 = Resource.f17861d;
                        Boolean boolValueOf11 = Boolean.valueOf(z10);
                        c3303a115.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(boolValueOf11);
                    } else {
                        this.f30559e = null;
                        this.f30560f = null;
                        this.f30561g = null;
                        this.f30562h = null;
                        this.f30563i = 9;
                        obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Resource.C3303a c3303a116 = Resource.f17861d;
                            Boolean bool15 = Boolean.TRUE;
                            c3303a116.getClass();
                            resourceM9437c = Resource.C3303a.m9437c(bool15);
                        } else {
                            resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                        }
                    }
                    authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                    return C9072e.f47360a;
                }
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h9 = authenticationViewModel.f30557k.mo9619h();
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 6;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h9, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a117 = Resource.f17861d;
                    Boolean boolValueOf12 = Boolean.valueOf(z10);
                    c3303a117.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf12);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a118 = Resource.f17861d;
                        Boolean bool16 = Boolean.TRUE;
                        c3303a118.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool16);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                resource8 = this.f30562h;
                resource6 = this.f30561g;
                resource7 = this.f30560f;
                resource5 = this.f30559e;
                C7499b.m14977z0(obj);
                str = ((Profile) obj).f17795o;
                interfaceC2011d = authenticationViewModel.f30553g;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 7;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a119 = Resource.f17861d;
                    Boolean boolValueOf13 = Boolean.valueOf(z10);
                    c3303a119.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf13);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a1110 = Resource.f17861d;
                        Boolean bool17 = Boolean.TRUE;
                        c3303a1110.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool17);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                resource8 = this.f30562h;
                resource6 = this.f30561g;
                resource7 = this.f30560f;
                resource5 = this.f30559e;
                C7499b.m14977z0(obj);
                interfaceC2015h = authenticationViewModel.f30552f;
                this.f30559e = resource5;
                this.f30560f = resource7;
                this.f30561g = resource6;
                this.f30562h = resource8;
                this.f30563i = 8;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a1111 = Resource.f17861d;
                    Boolean boolValueOf14 = Boolean.valueOf(z10);
                    c3303a1111.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf14);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a1112 = Resource.f17861d;
                        Boolean bool18 = Boolean.TRUE;
                        c3303a1112.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool18);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 8:
                resource8 = this.f30562h;
                resource6 = this.f30561g;
                resource7 = this.f30560f;
                resource5 = this.f30559e;
                C7499b.m14977z0(obj);
                status = resource5.f17862a;
                status2 = Resource.Status.SUCCESS;
                if (status == status2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                }
                if (z10) {
                    Resource.C3303a c3303a1113 = Resource.f17861d;
                    Boolean boolValueOf15 = Boolean.valueOf(z10);
                    c3303a1113.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(boolValueOf15);
                } else {
                    this.f30559e = null;
                    this.f30560f = null;
                    this.f30561g = null;
                    this.f30562h = null;
                    this.f30563i = 9;
                    obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Resource.C3303a c3303a1114 = Resource.f17861d;
                        Boolean bool19 = Boolean.TRUE;
                        c3303a1114.getClass();
                        resourceM9437c = Resource.C3303a.m9437c(bool19);
                    } else {
                        resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                    }
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 9:
                C7499b.m14977z0(obj);
                if (((Boolean) obj).booleanValue()) {
                    Resource.C3303a c3303a1115 = Resource.f17861d;
                    Boolean bool110 = Boolean.TRUE;
                    c3303a1115.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(bool110);
                } else {
                    resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 10:
                C7499b.m14977z0(obj);
                profile3 = (Profile) obj;
                String strM15510c4 = authenticationViewModel.f30558l.m15510c("language_code");
                profile3.getClass();
                profile3.f17795o = strM15510c4;
                this.f30563i = 11;
                if (authenticationViewModel.f30557k.mo9620i(profile3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                this.f30559e = null;
                this.f30563i = 12;
                obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    Resource.C3303a c3303a120 = Resource.f17861d;
                    Boolean bool20 = Boolean.TRUE;
                    c3303a120.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(bool20);
                } else {
                    resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 11:
                C7499b.m14977z0(obj);
                authenticationViewModel.f30539Q.setValue(Resource.Status.ERROR);
                this.f30559e = null;
                this.f30563i = 12;
                obj = AuthenticationViewModel.m10327m2(authenticationViewModel, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    Resource.C3303a c3303a121 = Resource.f17861d;
                    Boolean bool21 = Boolean.TRUE;
                    c3303a121.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(bool21);
                } else {
                    resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 12:
                C7499b.m14977z0(obj);
                if (((Boolean) obj).booleanValue()) {
                    Resource.C3303a c3303a122 = Resource.f17861d;
                    Boolean bool22 = Boolean.TRUE;
                    c3303a122.getClass();
                    resourceM9437c = Resource.C3303a.m9437c(bool22);
                } else {
                    resourceM9437c = Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data"));
                }
                authenticationViewModel.f30537O.mo14371k(resourceM9437c);
                return C9072e.f47360a;
            case 13:
                C7499b.m14977z0(obj);
                if (((Boolean) obj).booleanValue()) {
                    C7138s c7138s2 = authenticationViewModel.f30537O;
                    Resource.C3303a c3303a20 = Resource.f17861d;
                    Boolean bool23 = Boolean.TRUE;
                    c3303a20.getClass();
                    c7138s2.mo14371k(Resource.C3303a.m9437c(bool23));
                } else {
                    authenticationViewModel.f30537O.mo14371k(Resource.C3303a.m9436b(Resource.f17861d, new Exception("no data")));
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
