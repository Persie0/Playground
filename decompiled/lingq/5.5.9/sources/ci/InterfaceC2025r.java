package ci;

import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.ExportType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p264mi.C7563c;
import p264mi.C7566f;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: ci.r */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2025r {

    /* JADX INFO: renamed from: ci.r$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: a */
    Serializable mo6179a(String str, ArrayList arrayList, ExportType exportType, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: b */
    Object mo6180b(String str, List list, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: c */
    Object mo6181c(List<String> list, CardStatus cardStatus, InterfaceC9968c<? super List<C7566f>> interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo6182d(String str, int i10, String str2, boolean z10, boolean z11, String str3, int i11, InterfaceC9968c<? super InterfaceC7116c<? extends List<C7563c>>> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    C7136q mo6183e(int i10, String str);

    /* JADX INFO: renamed from: f */
    InterfaceC7116c<Integer> mo6184f(String str);

    /* JADX INFO: renamed from: g */
    Object mo6185g(String str, ExportType exportType, InterfaceC9968c<? super Boolean> interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo6186h(String str, String str2, boolean z10, boolean z11, String str3, InterfaceC9968c<? super InterfaceC7116c<Integer>> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    Object mo6187i(String str, InterfaceC9968c<? super Resource<? extends List<C7566f>>> interfaceC9968c);

    /* JADX INFO: renamed from: j */
    Serializable mo6188j(String str, int i10, String str2, boolean z10, boolean z11, String str3, int i11, InterfaceC9968c interfaceC9968c);
}
