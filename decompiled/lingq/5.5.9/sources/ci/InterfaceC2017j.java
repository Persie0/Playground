package ci;

import com.lingq.shared.network.requests.RequestNotice;
import com.lingq.shared.uimodel.notification.UserNotice;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.j */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2017j {
    /* JADX INFO: renamed from: a */
    Object mo6086a(RequestNotice requestNotice, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: b */
    Object mo6087b(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: c */
    InterfaceC7116c<List<UserNotice>> mo6088c(String str);

    /* JADX INFO: renamed from: d */
    Object mo6089d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
