package ci;

import com.lingq.shared.network.requests.RequestAppUsageStat;
import com.lingq.shared.network.requests.RequestLanguageProgress;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import gi.C5804b;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2013f {
    /* JADX INFO: renamed from: b */
    Object mo6041b(String str, InterfaceC9968c<? super UserLanguageStudyStats> interfaceC9968c);

    /* JADX INFO: renamed from: c */
    Object mo6042c(String str, String str2, String str3, InterfaceC9968c<? super Boolean> interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo6043d(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    InterfaceC7116c<UserLanguageProgress> mo6044e(String str, String str2);

    /* JADX INFO: renamed from: f */
    Object mo6045f(String str, String str2, String str3, double d10, double d11, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: g */
    InterfaceC7116c<List<UserLanguageProgressChartEntry>> mo6046g(String str, String str2, String str3);

    /* JADX INFO: renamed from: h */
    void mo6047h(String str, String str2, double d10);

    /* JADX INFO: renamed from: i */
    Object mo6048i(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: j */
    Object mo6049j(String str, RequestLanguageProgress requestLanguageProgress, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: k */
    InterfaceC7116c<C5804b> mo6050k(String str);

    /* JADX INFO: renamed from: l */
    InterfaceC7116c<UserLanguageStudyStats> mo6051l(String str);

    /* JADX INFO: renamed from: m */
    Object mo6052m(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: n */
    Object mo6053n(String str, RequestAppUsageStat requestAppUsageStat, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: o */
    Object mo6054o(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
