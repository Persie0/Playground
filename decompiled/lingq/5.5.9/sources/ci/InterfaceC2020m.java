package ci;

import com.lingq.shared.domain.LingQsOffer;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestPurchase;
import com.lingq.shared.network.requests.RequestUserUpdate;
import com.lingq.shared.network.result.ResultRegistrationValidation;
import java.util.ArrayList;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2020m {
    /* JADX INFO: renamed from: a */
    Object mo6132a(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c);

    /* JADX INFO: renamed from: b */
    Object mo6133b(String str, String str2, String str3, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c);

    /* JADX INFO: renamed from: c */
    Object mo6134c(String str, String str2, InterfaceC9968c<? super Resource<Login>> interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo6135d(String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo6136e(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    Object mo6137f(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c);

    /* JADX INFO: renamed from: g */
    Object mo6138g(String str, String str2, String str3, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo6139h(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    Object mo6140i(ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: j */
    Object mo6141j(RequestPurchase requestPurchase, InterfaceC9968c<? super Resource<RequestPurchase>> interfaceC9968c);

    /* JADX INFO: renamed from: k */
    Object mo6142k(LingQsOffer lingQsOffer, long j10, InterfaceC9968c<? super Boolean> interfaceC9968c);

    /* JADX INFO: renamed from: l */
    Object mo6143l(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: m */
    Object mo6144m(boolean z10, InterfaceC9968c<? super Resource<Profile>> interfaceC9968c);

    /* JADX INFO: renamed from: n */
    Object mo6145n(String str, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c);

    /* JADX INFO: renamed from: o */
    Object mo6146o(boolean z10, InterfaceC9968c<? super Resource<ProfileAccount>> interfaceC9968c);

    /* JADX INFO: renamed from: p */
    Object mo6147p(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: q */
    Object mo6148q(boolean z10, InterfaceC9968c<? super Resource<Profile>> interfaceC9968c);

    /* JADX INFO: renamed from: r */
    Object mo6149r(String str, String str2, InterfaceC9968c<? super ResultRegistrationValidation> interfaceC9968c);

    /* JADX INFO: renamed from: s */
    Object mo6150s(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c);

    /* JADX INFO: renamed from: t */
    Object mo6151t(int i10, RequestUserUpdate requestUserUpdate, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: u */
    FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 mo6152u(String str);
}
