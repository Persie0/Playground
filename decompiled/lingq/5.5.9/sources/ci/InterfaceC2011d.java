package ci;

import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestDictionariesOrder;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2011d {
    /* JADX INFO: renamed from: a */
    InterfaceC7116c<List<UserDictionaryData>> mo6001a(String str);

    /* JADX INFO: renamed from: b */
    Object mo6002b(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: c */
    Object mo6003c(String str, InterfaceC9968c<? super Resource<? extends List<UserDictionaryData>>> interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo6004d(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo6005e(String str, RequestDictionariesOrder requestDictionariesOrder, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    InterfaceC7116c<List<UserDictionaryData>> mo6006f(String str);

    /* JADX INFO: renamed from: g */
    C9072e mo6007g(String str, ArrayList arrayList);

    /* JADX INFO: renamed from: h */
    Object mo6008h(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    InterfaceC7116c<List<UserDictionaryData>> mo6009i(String str, String str2);

    /* JADX INFO: renamed from: j */
    InterfaceC7116c<List<UserDictionaryLocale>> mo6010j(String str);

    /* JADX INFO: renamed from: k */
    Object mo6011k(int i10, int i11, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: l */
    Object mo6012l(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: m */
    Object mo6013m(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: n */
    Object mo6014n(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
