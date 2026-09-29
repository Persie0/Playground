package ci;

import com.lingq.shared.network.requests.RequestPlaylistCreate;
import com.lingq.shared.network.requests.RequestPlaylistLessonAction;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.List;
import ki.C6697c;
import ki.C6698d;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9321i;

/* JADX INFO: renamed from: ci.l */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2019l {
    /* JADX INFO: renamed from: A */
    InterfaceC7116c<Integer> mo6095A(String str, int i10);

    /* JADX INFO: renamed from: B */
    C7136q mo6096B(String str);

    /* JADX INFO: renamed from: C */
    Object mo6097C(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: D */
    Object mo6098D(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: E */
    Object mo6099E(String str, String str2, RequestPlaylistLessonAction requestPlaylistLessonAction, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: F */
    InterfaceC7116c mo6100F(String str);

    /* JADX INFO: renamed from: G */
    Object mo6101G(String str, C9321i c9321i, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: H */
    Object mo6102H(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: I */
    Object mo6103I(int i10, int i11, String str, String str2, String str3, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: J */
    Object mo6104J(String str, String str2, String str3, int i10, Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: K */
    InterfaceC7116c<List<C6698d>> mo6105K(String str);

    /* JADX INFO: renamed from: a */
    Object mo6106a(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: b */
    Object mo6107b(String str, InterfaceC9968c<? super List<C6698d>> interfaceC9968c);

    /* JADX INFO: renamed from: c */
    Object mo6108c(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo6109d(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo6110e(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    InterfaceC7116c<List<UserPlaylist>> mo6111f(String str, int i10);

    /* JADX INFO: renamed from: g */
    Object mo6112g(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo6113h(String str, String str2, InterfaceC9968c<? super UserPlaylist> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    InterfaceC7116c mo6114i(String str, String str2);

    /* JADX INFO: renamed from: j */
    Object mo6115j(String str, String str2, RequestPlaylistCreate requestPlaylistCreate, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: k */
    Object mo6116k(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: l */
    InterfaceC7116c mo6117l(String str, String str2);

    /* JADX INFO: renamed from: m */
    Object mo6118m(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: n */
    Object mo6119n(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: o */
    Object mo6120o(InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: p */
    Object mo6121p(String str, String str2, String str3, Integer num, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: q */
    Object mo6122q(int i10, int i11, String str, int i12, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: r */
    InterfaceC7116c<List<Integer>> mo6123r(String str);

    /* JADX INFO: renamed from: s */
    Object mo6124s(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: t */
    InterfaceC7116c<C6698d> mo6125t(String str, int i10);

    /* JADX INFO: renamed from: u */
    InterfaceC7116c<List<C6697c>> mo6126u(CoursePlaylistSort coursePlaylistSort, int i10);

    /* JADX INFO: renamed from: v */
    Object mo6127v(int i10, int i11, String str, String str2, String str3, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: w */
    Object mo6128w(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: x */
    Object mo6129x(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10);

    /* JADX INFO: renamed from: y */
    Object mo6130y(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: z */
    Object mo6131z(String str, RequestPlaylistCreate requestPlaylistCreate, Integer num, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
