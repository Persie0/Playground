package p000;

import com.lingq.core.datastore.DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1;
import com.lingq.core.domain.lesson.GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.core.domain.lesson.ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.feature.collections.domain.GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.playlist.C2250xdb411cf1;
import com.lingq.feature.reader.old.C2412n;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class ij2 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44183c;

    public /* synthetic */ ij2(Object obj, int i, int i2) {
        this.f44181a = i2;
        this.f44182b = obj;
        this.f44183c = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:80:0x0150  */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1 downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1;
        GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1 getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1;
        GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1 getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1;
        ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1 observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1;
        C2250xdb411cf1 c2250xdb411cf1;
        int i = this.f44181a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f44182b;
        int i2 = this.f44183c;
        Object obj3 = null;
        switch (i) {
            case 0:
                if (continuation instanceof DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1) {
                    downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1 = (DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1) continuation;
                    int i3 = downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1.f17506b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1.f17506b = i3 - Integer.MIN_VALUE;
                    } else {
                        downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1 = new DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1 = new DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1(this, continuation);
                }
                Object obj4 = downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1.f17505a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1.f17506b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj4);
                    Object objM10872d = e65.m10872d(i2, (Map) obj);
                    downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1.f17506b = 1;
                    return ((e83) obj2).emit(objM10872d, downloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
                }
                if (i4 == 1) {
                    AbstractC3193b.m15359b(obj4);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (continuation instanceof GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1) {
                    getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1 = (GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i5 = getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1.f25624b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1.f25624b = i5 - Integer.MIN_VALUE;
                    } else {
                        getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1 = new GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1 = new GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj5 = getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1.f25623a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1.f25624b;
                if (i6 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    Boolean boolValueOf = Boolean.valueOf(((Set) obj).contains(new Integer(i2)));
                    getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1.f25624b = 1;
                    return ((e83) obj2).emit(boolValueOf, getCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
                }
                if (i6 == 1) {
                    AbstractC3193b.m15359b(obj5);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (continuation instanceof GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1) {
                    getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1 = (GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i7 = getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1.f18693b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1.f18693b = i7 - Integer.MIN_VALUE;
                    } else {
                        getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1 = new GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1 = new GetLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj6 = getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1.f18692a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1.f18693b;
                if (i8 == 0) {
                    AbstractC3193b.m15359b(obj6);
                    Object objM10872d2 = e65.m10872d(i2, (Map) obj);
                    getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1.f18693b = 1;
                    return ((e83) obj2).emit(objM10872d2, getLessonSentenceTranslationUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
                }
                if (i8 == 1) {
                    AbstractC3193b.m15359b(obj6);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (continuation instanceof ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1) {
                    observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1 = (ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i9 = observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1.f18696b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1.f18696b = i9 - Integer.MIN_VALUE;
                    } else {
                        observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1 = new ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1 = new ObserveLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj7 = observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1.f18695a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1.f18696b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                e83 e83Var = (e83) obj2;
                eu7 eu7Var = ReaderBookmarkMode.Companion;
                String str = (String) e65.m10872d(i2, (Map) obj);
                eu7Var.getClass();
                if (str != null) {
                    for (Object obj8 : ReaderBookmarkMode.getEntries()) {
                        if (fa4.m11650l(((ReaderBookmarkMode) obj8).getWire(), str)) {
                            obj3 = obj8;
                            obj3 = (ReaderBookmarkMode) obj3;
                        }
                    }
                    obj3 = (ReaderBookmarkMode) obj3;
                }
                observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1.f18696b = 1;
                return e83Var.emit(obj3, observeLessonBookmarkReaderModeUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                if (continuation instanceof C2250xdb411cf1) {
                    c2250xdb411cf1 = (C2250xdb411cf1) continuation;
                    int i11 = c2250xdb411cf1.f27716b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2250xdb411cf1.f27716b = i11 - Integer.MIN_VALUE;
                    } else {
                        c2250xdb411cf1 = new C2250xdb411cf1(this, continuation);
                    }
                } else {
                    c2250xdb411cf1 = new C2250xdb411cf1(this, continuation);
                }
                Object obj9 = c2250xdb411cf1.f27715a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = c2250xdb411cf1.f27716b;
                if (i12 == 0) {
                    AbstractC3193b.m15359b(obj9);
                    Pair pair = new Pair(new Integer(i2), (InterfaceC3055gy) obj);
                    c2250xdb411cf1.f27716b = 1;
                    return ((e83) obj2).emit(pair, c2250xdb411cf1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
                }
                if (i12 == 1) {
                    AbstractC3193b.m15359b(obj9);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                vd7 vd7Var = (vd7) obj;
                C2412n c2412n = (C2412n) obj2;
                c2412n.f29362g1.m15571i(vd7Var);
                if (c2412n.f29338a1) {
                    if (vd7Var != null && vd7Var.f65237b && vd7Var.f65238c == 100 && c2412n.f29352e.mo8231E0(i2)) {
                        c2412n.f29338a1 = false;
                        c2412n.f29289K.m8446I(i2, true);
                        c2412n.f29332Y0.mo4677k(new Integer(i2));
                    } else if (fa4.m11650l(vd7Var != null ? vd7Var.f65239d : null, "error")) {
                        c2412n.f29338a1 = false;
                    }
                }
                return xfaVar;
        }
    }
}
