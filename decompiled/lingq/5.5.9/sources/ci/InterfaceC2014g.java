package ci;

import com.lingq.shared.uimodel.lesson.LessonAudio;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.Sort;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p181ii.C6332a;
import p181ii.C6333b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: ci.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2014g {

    /* JADX INFO: renamed from: ci.g$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: a */
    Object mo6055a(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c);

    /* JADX INFO: renamed from: b */
    InterfaceC7116c<LessonInfo> mo6056b(int i10);

    /* JADX INFO: renamed from: c */
    InterfaceC7116c mo6057c(List list);

    /* JADX INFO: renamed from: d */
    Object mo6058d(int i10, InterfaceC9968c<? super List<LessonAudio>> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo6059e(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    Object mo6060f(int i10, String str, InterfaceC9968c<? super Boolean> interfaceC9968c);

    /* JADX INFO: renamed from: g */
    Object mo6061g(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo6062h(String str, int i10, boolean z10, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    InterfaceC7116c mo6063i(int i10);

    /* JADX INFO: renamed from: j */
    Object mo6064j(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, int i10, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: k */
    InterfaceC7116c mo6065k(List list);

    /* JADX INFO: renamed from: l */
    InterfaceC7116c mo6066l(String str, ArrayList arrayList);

    /* JADX INFO: renamed from: m */
    InterfaceC7116c<List<C6333b>> mo6067m(List<Integer> list);

    /* JADX INFO: renamed from: n */
    InterfaceC7116c<List<C6333b>> mo6068n(List<Integer> list);

    /* JADX INFO: renamed from: o */
    InterfaceC7116c<List<C6332a>> mo6069o(int i10);

    /* JADX INFO: renamed from: p */
    Object mo6070p(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: q */
    Object mo6071q(String str, int i10, Sort sort, List<String> list, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: r */
    InterfaceC7116c<C6332a> mo6072r(int i10);

    /* JADX INFO: renamed from: s */
    Object mo6073s(String str, String str2, InterfaceC9968c<? super LibraryShelf> interfaceC9968c);

    /* JADX INFO: renamed from: t */
    InterfaceC7116c mo6074t(String str, int i10, String str2, String str3);

    /* JADX INFO: renamed from: u */
    InterfaceC7116c<List<LibraryItemCounter>> mo6075u(List<Pair<Integer, String>> list);
}
