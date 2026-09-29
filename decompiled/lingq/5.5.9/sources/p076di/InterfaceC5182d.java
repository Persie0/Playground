package p076di;

import com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: di.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5182d {
    /* JADX INFO: renamed from: a */
    InterfaceC7116c<Map<String, String>> mo9677a();

    /* JADX INFO: renamed from: b */
    InterfaceC7116c<Map<String, Integer>> mo9678b();

    /* JADX INFO: renamed from: c */
    UtilStoreImpl$special$$inlined$map$6 mo9679c();

    /* JADX INFO: renamed from: d */
    Object mo9680d(Map<String, String> map, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: e */
    Object mo9681e(Map<Integer, Integer> map, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    InterfaceC7116c<Map<Integer, Integer>> mo9682f();

    /* JADX INFO: renamed from: g */
    Object mo9683g(InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo9684h(Map map, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: i */
    InterfaceC7116c<Map<String, VocabularySearchQuery>> mo9685i();

    /* JADX INFO: renamed from: j */
    InterfaceC7116c<Map<String, Integer>> mo9686j();

    /* JADX INFO: renamed from: k */
    Object mo9687k(Map map, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: l */
    InterfaceC7116c<Map<String, LibrarySearchQuery>> mo9688l();

    /* JADX INFO: renamed from: m */
    InterfaceC7116c<Map<Integer, LessonStudyBookmark>> mo9689m();

    /* JADX INFO: renamed from: n */
    InterfaceC7116c<Map<String, String>> mo9690n();

    /* JADX INFO: renamed from: o */
    Object mo9691o(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: p */
    InterfaceC7116c<Map<String, String>> mo9692p();

    /* JADX INFO: renamed from: q */
    Object mo9693q(Map<String, String> map, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: r */
    Object mo9694r(LinkedHashMap linkedHashMap, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: s */
    Object mo9695s(Map<Integer, LessonStudyBookmark> map, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: t */
    Object mo9696t(Map<String, LibrarySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: u */
    Object mo9697u(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);
}
