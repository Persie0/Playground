package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1;
import com.lingq.core.domain.model.audio.AudioFetchErrorType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.feature.reader.buylesson.ReaderBuyLessonManager$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$1$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$2$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$3$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$filterNot$4$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$map$2$2$1;
import com.lingq.feature.reader.reader.C2477x69e45dad;
import com.lingq.feature.reader.reader.C2480xe6468731;
import com.lingq.feature.reader.reader.C2482xd7645b0c;
import com.lingq.feature.reader.reader.C2483xb4c39f3e;
import com.lingq.feature.reader.reader.C2484xf65b12ca;
import com.lingq.feature.reader.reader.C2485xf6692a4b;
import com.lingq.feature.reader.reader.C2486xfcb3b56d;
import com.lingq.feature.reader.reader.C2490x656e72fe;
import com.lingq.feature.reader.reader.C2491x36f5cfc2;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$2$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$4$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$5$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$6$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$7$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$8$2$1;
import com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$9$2$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class zd7 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f71390b;

    public /* synthetic */ zd7(e83 e83Var, int i) {
        this.f71389a = i;
        this.f71390b = e83Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206  */
    /* JADX WARN: Code duplicated, block: B:152:0x0254  */
    /* JADX WARN: Code duplicated, block: B:167:0x0298  */
    /* JADX WARN: Code duplicated, block: B:182:0x02da  */
    /* JADX WARN: Code duplicated, block: B:197:0x0315  */
    /* JADX WARN: Code duplicated, block: B:212:0x035b  */
    /* JADX WARN: Code duplicated, block: B:230:0x039f  */
    /* JADX WARN: Code duplicated, block: B:248:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:268:0x0429  */
    /* JADX WARN: Code duplicated, block: B:292:0x0494  */
    /* JADX WARN: Code duplicated, block: B:307:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:339:0x056f  */
    /* JADX WARN: Code duplicated, block: B:354:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:369:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:384:0x0629  */
    /* JADX WARN: Code duplicated, block: B:399:0x0664  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:420:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:435:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:450:0x0731  */
    /* JADX WARN: Code duplicated, block: B:476:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:491:0x0812  */
    /* JADX WARN: Code duplicated, block: B:516:0x088e  */
    /* JADX WARN: Code duplicated, block: B:531:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:546:0x0904  */
    /* JADX WARN: Code duplicated, block: B:561:0x0945  */
    /* JADX WARN: Code duplicated, block: B:590:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:598:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1 playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1;
        Object c3018fy;
        AudioFetchErrorType audioFetchErrorType;
        ReaderBuyLessonManager$special$$inlined$map$1$2$1 readerBuyLessonManager$special$$inlined$map$1$2$1;
        ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1 readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1;
        ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1 readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1;
        ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1 readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1;
        Object objM22622n1;
        C2477x69e45dad c2477x69e45dad;
        C2480xe6468731 c2480xe6468731;
        C2482xd7645b0c c2482xd7645b0c;
        ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1 readerComposeViewModel$observePageChanges$$inlined$map$1$2$1;
        C2483xb4c39f3e c2483xb4c39f3e;
        C2484xf65b12ca c2484xf65b12ca;
        C2485xf6692a4b c2485xf6692a4b;
        C2486xfcb3b56d c2486xfcb3b56d;
        ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1 readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1;
        C2490x656e72fe c2490x656e72fe;
        xz7 xz7Var;
        xz7 xz7Var2;
        xz7 xz7Var3;
        C2491x36f5cfc2 c2491x36f5cfc2;
        ReaderComposeViewModel$special$$inlined$map$1$2$1 readerComposeViewModel$special$$inlined$map$1$2$1;
        ReaderComposeViewModel$special$$inlined$map$2$2$1 readerComposeViewModel$special$$inlined$map$2$2$1;
        ReaderComposeViewModel$special$$inlined$map$4$2$1 readerComposeViewModel$special$$inlined$map$4$2$1;
        ReaderComposeViewModel$special$$inlined$map$5$2$1 readerComposeViewModel$special$$inlined$map$5$2$1;
        ReaderComposeViewModel$special$$inlined$map$6$2$1 readerComposeViewModel$special$$inlined$map$6$2$1;
        ReaderComposeViewModel$special$$inlined$map$7$2$1 readerComposeViewModel$special$$inlined$map$7$2$1;
        ReaderComposeViewModel$special$$inlined$map$8$2$1 readerComposeViewModel$special$$inlined$map$8$2$1;
        ReaderComposeViewModel$special$$inlined$map$9$2$1 readerComposeViewModel$special$$inlined$map$9$2$1;
        ReaderContentStateHolder$special$$inlined$filterNot$1$2$1 readerContentStateHolder$special$$inlined$filterNot$1$2$1;
        ReaderContentStateHolder$special$$inlined$filterNot$2$2$1 readerContentStateHolder$special$$inlined$filterNot$2$2$1;
        ReaderContentStateHolder$special$$inlined$filterNot$3$2$1 readerContentStateHolder$special$$inlined$filterNot$3$2$1;
        ReaderContentStateHolder$special$$inlined$filterNot$4$2$1 readerContentStateHolder$special$$inlined$filterNot$4$2$1;
        ReaderContentStateHolder$special$$inlined$map$1$2$1 readerContentStateHolder$special$$inlined$map$1$2$1;
        ReaderContentStateHolder$special$$inlined$map$2$2$1 readerContentStateHolder$special$$inlined$map$2$2$1;
        int i = this.f71389a;
        int size = 0;
        i = 0;
        int i2 = 0;
        i = 0;
        int i3 = 0;
        z = false;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f71390b;
        Object c2907cy = null;
        num = null;
        Integer num = null;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (continuation instanceof PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1) {
                    playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1 = (PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1) continuation;
                    int i4 = playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1.f15998b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1.f15998b = i4 - Integer.MIN_VALUE;
                    } else {
                        playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1 = new PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1 = new PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1(this, continuation);
                }
                Object obj3 = playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1.f15997a;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1.f15998b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                sx4 sx4Var = (sx4) obj;
                if (sx4Var != null) {
                    String str = sx4Var.f61543b;
                    int i6 = sx4Var.f61542a;
                    switch (sx4Var.f61546e) {
                        case "completed":
                            c3018fy = new C0790ay(i6, str);
                        case "downloading":
                            c2907cy = new C2907cy(i6, str, sx4Var.f61545d);
                            break;
                        case "error":
                            String str2 = sx4Var.f61547f;
                            if (str2 != null) {
                                for (Object obj5 : AudioFetchErrorType.getEntries()) {
                                    if (fa4.m11650l(((AudioFetchErrorType) obj5).name(), str2)) {
                                        obj2 = obj5;
                                        audioFetchErrorType = (AudioFetchErrorType) obj2;
                                        if (audioFetchErrorType == null) {
                                            audioFetchErrorType = AudioFetchErrorType.NetworkError;
                                        }
                                    }
                                }
                                audioFetchErrorType = (AudioFetchErrorType) obj2;
                                if (audioFetchErrorType == null) {
                                    audioFetchErrorType = AudioFetchErrorType.NetworkError;
                                }
                            } else {
                                audioFetchErrorType = AudioFetchErrorType.NetworkError;
                            }
                            c3018fy = new C2944dy(i6, str, audioFetchErrorType);
                        case "generating":
                            c3018fy = new C2981ey(i6, str);
                        default:
                            c3018fy = new C3018fy(i6, str);
                    }
                }
                playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1.f15998b = 1;
                return e83Var.emit(c2907cy, playlistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1) == obj4 ? obj4 : xfaVar;
            case 1:
                if (continuation instanceof ReaderBuyLessonManager$special$$inlined$map$1$2$1) {
                    readerBuyLessonManager$special$$inlined$map$1$2$1 = (ReaderBuyLessonManager$special$$inlined$map$1$2$1) continuation;
                    int i7 = readerBuyLessonManager$special$$inlined$map$1$2$1.f27856b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        readerBuyLessonManager$special$$inlined$map$1$2$1.f27856b = i7 - Integer.MIN_VALUE;
                    } else {
                        readerBuyLessonManager$special$$inlined$map$1$2$1 = new ReaderBuyLessonManager$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerBuyLessonManager$special$$inlined$map$1$2$1 = new ReaderBuyLessonManager$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj6 = readerBuyLessonManager$special$$inlined$map$1$2$1.f27855a;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = readerBuyLessonManager$special$$inlined$map$1$2$1.f27856b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                yx4 yx4Var = (yx4) obj;
                Object kk0Var = new kk0(!(yx4Var instanceof xx4), yx4Var);
                readerBuyLessonManager$special$$inlined$map$1$2$1.f27856b = 1;
                return e83Var.emit(kk0Var, readerBuyLessonManager$special$$inlined$map$1$2$1) == obj7 ? obj7 : xfaVar;
            case 2:
                if (continuation instanceof ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1) {
                    readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1 = (ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1) continuation;
                    int i9 = readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1.f29974b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1.f29974b = i9 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeAnalytics$$inlined$map$1$2$1(this, continuation);
                }
                Object obj8 = readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1.f29973a;
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1.f29974b;
                if (i10 == 0) {
                    AbstractC3193b.m15359b(obj8);
                    Object obj10 = ((yz4) obj).f70667a;
                    readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1.f29974b = 1;
                    return e83Var.emit(obj10, readerComposeViewModel$observeAnalytics$$inlined$map$1$2$1) == obj9 ? obj9 : xfaVar;
                }
                if (i10 == 1) {
                    AbstractC3193b.m15359b(obj8);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (continuation instanceof ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1) {
                    readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1 = (ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1) continuation;
                    int i11 = readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1.f29977b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1.f29977b = i11 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1 = new ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1 = new ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1(this, continuation);
                }
                Object obj11 = readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1.f29976a;
                Object obj12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1.f29977b;
                if (i12 == 0) {
                    AbstractC3193b.m15359b(obj11);
                    Object obj13 = ((yz4) obj).f70670d;
                    readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1.f29977b = 1;
                    return e83Var.emit(obj13, readerComposeViewModel$observeAnalytics$$inlined$map$2$2$1) == obj12 ? obj12 : xfaVar;
                }
                if (i12 == 1) {
                    AbstractC3193b.m15359b(obj11);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (continuation instanceof ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1) {
                    readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1 = (ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1) continuation;
                    int i13 = readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1.f29986b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1.f29986b = i13 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1(this, continuation);
                }
                Object obj14 = readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1.f29985a;
                Object obj15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1.f29986b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC3193b.m15359b(obj14);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj14);
                yz4 yz4Var = (yz4) obj;
                int i15 = yz4Var.f70680n;
                List list = yz4Var.f70670d;
                if (i15 < 0 || i15 >= list.size()) {
                    objM22622n1 = EmptyList.f47638a;
                } else {
                    List list2 = ((ox7) list.get(i15)).f55132e;
                    ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((xz7) it.next()).f69010g, arrayList);
                    }
                    objM22622n1 = u91.m22622n1(u91.m22626r1(arrayList));
                }
                readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1.f29986b = 1;
                return e83Var.emit(objM22622n1, readerComposeViewModel$observeAudioWave$$inlined$map$1$2$1) == obj15 ? obj15 : xfaVar;
            case 5:
                if (continuation instanceof C2477x69e45dad) {
                    c2477x69e45dad = (C2477x69e45dad) continuation;
                    int i16 = c2477x69e45dad.f29991b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c2477x69e45dad.f29991b = i16 - Integer.MIN_VALUE;
                    } else {
                        c2477x69e45dad = new C2477x69e45dad(this, continuation);
                    }
                } else {
                    c2477x69e45dad = new C2477x69e45dad(this, continuation);
                }
                Object obj16 = c2477x69e45dad.f29990a;
                Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = c2477x69e45dad.f29991b;
                if (i17 == 0) {
                    AbstractC3193b.m15359b(obj16);
                    Object objValueOf = Boolean.valueOf(((yz4) obj).m25388b());
                    c2477x69e45dad.f29991b = 1;
                    return e83Var.emit(objValueOf, c2477x69e45dad) == obj17 ? obj17 : xfaVar;
                }
                if (i17 == 1) {
                    AbstractC3193b.m15359b(obj16);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (continuation instanceof C2480xe6468731) {
                    c2480xe6468731 = (C2480xe6468731) continuation;
                    int i18 = c2480xe6468731.f30003b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c2480xe6468731.f30003b = i18 - Integer.MIN_VALUE;
                    } else {
                        c2480xe6468731 = new C2480xe6468731(this, continuation);
                    }
                } else {
                    c2480xe6468731 = new C2480xe6468731(this, continuation);
                }
                Object obj18 = c2480xe6468731.f30002a;
                Object obj19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = c2480xe6468731.f30003b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC3193b.m15359b(obj18);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj18);
                yz4 yz4Var2 = (yz4) obj;
                List list3 = yz4Var2.f70670d;
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    size += ((ox7) it2.next()).f55132e.size();
                }
                List<ox7> list4 = list3;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list4, 10));
                for (ox7 ox7Var : list4) {
                    arrayList2.add(new c65(ux5.m22988k(ox7Var.f55128a, "page:"), ox7Var.f55132e.size(), size));
                }
                ox7 ox7Var2 = (ox7) u91.m22592J0(yz4Var2.f70680n, list3);
                Object pair = new Pair(arrayList2, ox7Var2 != null ? ux5.m22988k(ox7Var2.f55128a, "page:") : null);
                c2480xe6468731.f30003b = 1;
                return e83Var.emit(pair, c2480xe6468731) == obj19 ? obj19 : xfaVar;
            case 7:
                if (continuation instanceof C2482xd7645b0c) {
                    c2482xd7645b0c = (C2482xd7645b0c) continuation;
                    int i20 = c2482xd7645b0c.f30015b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        c2482xd7645b0c.f30015b = i20 - Integer.MIN_VALUE;
                    } else {
                        c2482xd7645b0c = new C2482xd7645b0c(this, continuation);
                    }
                } else {
                    c2482xd7645b0c = new C2482xd7645b0c(this, continuation);
                }
                Object obj20 = c2482xd7645b0c.f30014a;
                Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = c2482xd7645b0c.f30015b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC3193b.m15359b(obj20);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj20);
                jy7 jy7Var = (jy7) obj;
                Object k55Var = new k55(jy7Var.f46393a, jy7Var.f46395c, jy7Var.f46396d, 8);
                c2482xd7645b0c.f30015b = 1;
                return e83Var.emit(k55Var, c2482xd7645b0c) == obj21 ? obj21 : xfaVar;
            case 8:
                if (continuation instanceof ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1) {
                    readerComposeViewModel$observePageChanges$$inlined$map$1$2$1 = (ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1) continuation;
                    int i22 = readerComposeViewModel$observePageChanges$$inlined$map$1$2$1.f30018b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$observePageChanges$$inlined$map$1$2$1.f30018b = i22 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$observePageChanges$$inlined$map$1$2$1 = new ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$observePageChanges$$inlined$map$1$2$1 = new ReaderComposeViewModel$observePageChanges$$inlined$map$1$2$1(this, continuation);
                }
                Object obj22 = readerComposeViewModel$observePageChanges$$inlined$map$1$2$1.f30017a;
                Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = readerComposeViewModel$observePageChanges$$inlined$map$1$2$1.f30018b;
                if (i23 == 0) {
                    AbstractC3193b.m15359b(obj22);
                    Object obj24 = ((yz4) obj).f70670d;
                    readerComposeViewModel$observePageChanges$$inlined$map$1$2$1.f30018b = 1;
                    return e83Var.emit(obj24, readerComposeViewModel$observePageChanges$$inlined$map$1$2$1) == obj23 ? obj23 : xfaVar;
                }
                if (i23 == 1) {
                    AbstractC3193b.m15359b(obj22);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (continuation instanceof C2483xb4c39f3e) {
                    c2483xb4c39f3e = (C2483xb4c39f3e) continuation;
                    int i24 = c2483xb4c39f3e.f30023b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c2483xb4c39f3e.f30023b = i24 - Integer.MIN_VALUE;
                    } else {
                        c2483xb4c39f3e = new C2483xb4c39f3e(this, continuation);
                    }
                } else {
                    c2483xb4c39f3e = new C2483xb4c39f3e(this, continuation);
                }
                Object obj25 = c2483xb4c39f3e.f30022a;
                Object obj26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = c2483xb4c39f3e.f30023b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        AbstractC3193b.m15359b(obj25);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj25);
                LibraryItemCounter libraryItemCounter = (LibraryItemCounter) obj;
                l97 l97Var = m97.Companion;
                Double d = libraryItemCounter != null ? libraryItemCounter.f19470p : null;
                Double d2 = libraryItemCounter != null ? libraryItemCounter.f19471q : null;
                l97Var.getClass();
                Object objM16033a = l97.m16033a(d, d2);
                c2483xb4c39f3e.f30023b = 1;
                return e83Var.emit(objM16033a, c2483xb4c39f3e) == obj26 ? obj26 : xfaVar;
            case 10:
                if (continuation instanceof C2484xf65b12ca) {
                    c2484xf65b12ca = (C2484xf65b12ca) continuation;
                    int i26 = c2484xf65b12ca.f30028b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        c2484xf65b12ca.f30028b = i26 - Integer.MIN_VALUE;
                    } else {
                        c2484xf65b12ca = new C2484xf65b12ca(this, continuation);
                    }
                } else {
                    c2484xf65b12ca = new C2484xf65b12ca(this, continuation);
                }
                Object obj27 = c2484xf65b12ca.f30027a;
                Object obj28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = c2484xf65b12ca.f30028b;
                if (i27 == 0) {
                    AbstractC3193b.m15359b(obj27);
                    Object obj29 = ((jy7) obj).f46407o;
                    c2484xf65b12ca.f30028b = 1;
                    return e83Var.emit(obj29, c2484xf65b12ca) == obj28 ? obj28 : xfaVar;
                }
                if (i27 == 1) {
                    AbstractC3193b.m15359b(obj27);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (continuation instanceof C2485xf6692a4b) {
                    c2485xf6692a4b = (C2485xf6692a4b) continuation;
                    int i28 = c2485xf6692a4b.f30031b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c2485xf6692a4b.f30031b = i28 - Integer.MIN_VALUE;
                    } else {
                        c2485xf6692a4b = new C2485xf6692a4b(this, continuation);
                    }
                } else {
                    c2485xf6692a4b = new C2485xf6692a4b(this, continuation);
                }
                Object obj30 = c2485xf6692a4b.f30030a;
                Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = c2485xf6692a4b.f30031b;
                if (i29 == 0) {
                    AbstractC3193b.m15359b(obj30);
                    Object num2 = new Integer(((f00) obj).f38127a);
                    c2485xf6692a4b.f30031b = 1;
                    return e83Var.emit(num2, c2485xf6692a4b) == obj31 ? obj31 : xfaVar;
                }
                if (i29 == 1) {
                    AbstractC3193b.m15359b(obj30);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (continuation instanceof C2486xfcb3b56d) {
                    c2486xfcb3b56d = (C2486xfcb3b56d) continuation;
                    int i30 = c2486xfcb3b56d.f30036b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        c2486xfcb3b56d.f30036b = i30 - Integer.MIN_VALUE;
                    } else {
                        c2486xfcb3b56d = new C2486xfcb3b56d(this, continuation);
                    }
                } else {
                    c2486xfcb3b56d = new C2486xfcb3b56d(this, continuation);
                }
                Object obj32 = c2486xfcb3b56d.f30035a;
                Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = c2486xfcb3b56d.f30036b;
                if (i31 == 0) {
                    AbstractC3193b.m15359b(obj32);
                    Object objValueOf2 = Boolean.valueOf(((jy7) obj).f46406n);
                    c2486xfcb3b56d.f30036b = 1;
                    return e83Var.emit(objValueOf2, c2486xfcb3b56d) == obj33 ? obj33 : xfaVar;
                }
                if (i31 == 1) {
                    AbstractC3193b.m15359b(obj32);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (continuation instanceof ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1) {
                    readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1 = (ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1) continuation;
                    int i32 = readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1.f30056b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1.f30056b = i32 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1 = new ReaderComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1(this, continuation);
                }
                Object obj34 = readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1.f30055a;
                Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1.f30056b;
                if (i33 == 0) {
                    AbstractC3193b.m15359b(obj34);
                    Object obj36 = ((yz4) obj).f70670d;
                    readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1.f30056b = 1;
                    return e83Var.emit(obj36, readerComposeViewModel$observeSentenceNotes$$inlined$map$1$2$1) == obj35 ? obj35 : xfaVar;
                }
                if (i33 == 1) {
                    AbstractC3193b.m15359b(obj34);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (continuation instanceof C2490x656e72fe) {
                    c2490x656e72fe = (C2490x656e72fe) continuation;
                    int i34 = c2490x656e72fe.f30061b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c2490x656e72fe.f30061b = i34 - Integer.MIN_VALUE;
                    } else {
                        c2490x656e72fe = new C2490x656e72fe(this, continuation);
                    }
                } else {
                    c2490x656e72fe = new C2490x656e72fe(this, continuation);
                }
                Object obj37 = c2490x656e72fe.f30060a;
                Object obj38 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = c2490x656e72fe.f30061b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        AbstractC3193b.m15359b(obj37);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj37);
                yz4 yz4Var3 = (yz4) obj;
                int i36 = yz4Var3.f70680n;
                List list5 = yz4Var3.f70670d;
                ox7 ox7Var3 = (ox7) u91.m22592J0(i36 - 1, list5);
                Integer num3 = (ox7Var3 == null || (xz7Var3 = (xz7) u91.m22591I0(ox7Var3.f55132e)) == null) ? null : new Integer(xz7Var3.f69010g);
                ox7 ox7Var4 = (ox7) u91.m22592J0(i36, list5);
                Integer num4 = (ox7Var4 == null || (xz7Var2 = (xz7) u91.m22591I0(ox7Var4.f55132e)) == null) ? null : new Integer(xz7Var2.f69010g);
                ox7 ox7Var5 = (ox7) u91.m22592J0(i36 + 1, list5);
                if (ox7Var5 != null && (xz7Var = (xz7) u91.m22591I0(ox7Var5.f55132e)) != null) {
                    num = new Integer(xz7Var.f69010g);
                }
                Object objM20837e0 = AbstractC3550rv.m20837e0(new Integer[]{num3, num4, num});
                c2490x656e72fe.f30061b = 1;
                return e83Var.emit(objM20837e0, c2490x656e72fe) == obj38 ? obj38 : xfaVar;
            case 15:
                if (continuation instanceof C2491x36f5cfc2) {
                    c2491x36f5cfc2 = (C2491x36f5cfc2) continuation;
                    int i37 = c2491x36f5cfc2.f30068b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c2491x36f5cfc2.f30068b = i37 - Integer.MIN_VALUE;
                    } else {
                        c2491x36f5cfc2 = new C2491x36f5cfc2(this, continuation);
                    }
                } else {
                    c2491x36f5cfc2 = new C2491x36f5cfc2(this, continuation);
                }
                Object obj39 = c2491x36f5cfc2.f30067a;
                Object obj40 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = c2491x36f5cfc2.f30068b;
                if (i38 == 0) {
                    AbstractC3193b.m15359b(obj39);
                    Object num5 = new Integer(((Map) obj).size());
                    c2491x36f5cfc2.f30068b = 1;
                    return e83Var.emit(num5, c2491x36f5cfc2) == obj40 ? obj40 : xfaVar;
                }
                if (i38 == 1) {
                    AbstractC3193b.m15359b(obj39);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$1$2$1) {
                    readerComposeViewModel$special$$inlined$map$1$2$1 = (ReaderComposeViewModel$special$$inlined$map$1$2$1) continuation;
                    int i39 = readerComposeViewModel$special$$inlined$map$1$2$1.f30096b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$1$2$1.f30096b = i39 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$1$2$1 = new ReaderComposeViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$1$2$1 = new ReaderComposeViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj41 = readerComposeViewModel$special$$inlined$map$1$2$1.f30095a;
                Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = readerComposeViewModel$special$$inlined$map$1$2$1.f30096b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        AbstractC3193b.m15359b(obj41);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj41);
                List list6 = ((yz4) obj).f70670d;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    xz7 xz7Var4 = (xz7) u91.m22591I0(((ox7) it3.next()).f55132e);
                    Integer num6 = xz7Var4 != null ? new Integer(xz7Var4.f69010g) : null;
                    if (num6 != null) {
                        arrayList3.add(num6);
                    }
                }
                readerComposeViewModel$special$$inlined$map$1$2$1.f30096b = 1;
                return e83Var.emit(arrayList3, readerComposeViewModel$special$$inlined$map$1$2$1) == obj42 ? obj42 : xfaVar;
            case 17:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$2$2$1) {
                    readerComposeViewModel$special$$inlined$map$2$2$1 = (ReaderComposeViewModel$special$$inlined$map$2$2$1) continuation;
                    int i41 = readerComposeViewModel$special$$inlined$map$2$2$1.f30099b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$2$2$1.f30099b = i41 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$2$2$1 = new ReaderComposeViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$2$2$1 = new ReaderComposeViewModel$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj43 = readerComposeViewModel$special$$inlined$map$2$2$1.f30098a;
                Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = readerComposeViewModel$special$$inlined$map$2$2$1.f30099b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        AbstractC3193b.m15359b(obj43);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj43);
                Lesson lesson = ((yz4) obj).f70667a;
                if (lesson != null && lesson.f19154m) {
                    z = true;
                }
                Object objValueOf3 = Boolean.valueOf(z);
                readerComposeViewModel$special$$inlined$map$2$2$1.f30099b = 1;
                return e83Var.emit(objValueOf3, readerComposeViewModel$special$$inlined$map$2$2$1) == obj44 ? obj44 : xfaVar;
            case 18:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$4$2$1) {
                    readerComposeViewModel$special$$inlined$map$4$2$1 = (ReaderComposeViewModel$special$$inlined$map$4$2$1) continuation;
                    int i43 = readerComposeViewModel$special$$inlined$map$4$2$1.f30105b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$4$2$1.f30105b = i43 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$4$2$1 = new ReaderComposeViewModel$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$4$2$1 = new ReaderComposeViewModel$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj45 = readerComposeViewModel$special$$inlined$map$4$2$1.f30104a;
                Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i44 = readerComposeViewModel$special$$inlined$map$4$2$1.f30105b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        AbstractC3193b.m15359b(obj45);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj45);
                Lesson lesson2 = ((yz4) obj).f70667a;
                Object num7 = lesson2 != null ? new Integer(lesson2.f19149h) : null;
                readerComposeViewModel$special$$inlined$map$4$2$1.f30105b = 1;
                return e83Var.emit(num7, readerComposeViewModel$special$$inlined$map$4$2$1) == obj46 ? obj46 : xfaVar;
            case 19:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$5$2$1) {
                    readerComposeViewModel$special$$inlined$map$5$2$1 = (ReaderComposeViewModel$special$$inlined$map$5$2$1) continuation;
                    int i45 = readerComposeViewModel$special$$inlined$map$5$2$1.f30108b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$5$2$1.f30108b = i45 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$5$2$1 = new ReaderComposeViewModel$special$$inlined$map$5$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$5$2$1 = new ReaderComposeViewModel$special$$inlined$map$5$2$1(this, continuation);
                }
                Object obj47 = readerComposeViewModel$special$$inlined$map$5$2$1.f30107a;
                Object obj48 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i46 = readerComposeViewModel$special$$inlined$map$5$2$1.f30108b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        AbstractC3193b.m15359b(obj47);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj47);
                Lesson lesson3 = ((yz4) obj).f70667a;
                Object num8 = lesson3 != null ? new Integer(lesson3.f19149h) : null;
                readerComposeViewModel$special$$inlined$map$5$2$1.f30108b = 1;
                return e83Var.emit(num8, readerComposeViewModel$special$$inlined$map$5$2$1) == obj48 ? obj48 : xfaVar;
            case 20:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$6$2$1) {
                    readerComposeViewModel$special$$inlined$map$6$2$1 = (ReaderComposeViewModel$special$$inlined$map$6$2$1) continuation;
                    int i47 = readerComposeViewModel$special$$inlined$map$6$2$1.f30111b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$6$2$1.f30111b = i47 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$6$2$1 = new ReaderComposeViewModel$special$$inlined$map$6$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$6$2$1 = new ReaderComposeViewModel$special$$inlined$map$6$2$1(this, continuation);
                }
                Object obj49 = readerComposeViewModel$special$$inlined$map$6$2$1.f30110a;
                Object obj50 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i48 = readerComposeViewModel$special$$inlined$map$6$2$1.f30111b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        AbstractC3193b.m15359b(obj49);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj49);
                yz4 yz4Var4 = (yz4) obj;
                Object pair2 = new Pair(yz4Var4.f70667a, Boolean.valueOf(yz4Var4.f70685s));
                readerComposeViewModel$special$$inlined$map$6$2$1.f30111b = 1;
                return e83Var.emit(pair2, readerComposeViewModel$special$$inlined$map$6$2$1) == obj50 ? obj50 : xfaVar;
            case 21:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$7$2$1) {
                    readerComposeViewModel$special$$inlined$map$7$2$1 = (ReaderComposeViewModel$special$$inlined$map$7$2$1) continuation;
                    int i49 = readerComposeViewModel$special$$inlined$map$7$2$1.f30114b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$7$2$1.f30114b = i49 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$7$2$1 = new ReaderComposeViewModel$special$$inlined$map$7$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$7$2$1 = new ReaderComposeViewModel$special$$inlined$map$7$2$1(this, continuation);
                }
                Object obj51 = readerComposeViewModel$special$$inlined$map$7$2$1.f30113a;
                Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i50 = readerComposeViewModel$special$$inlined$map$7$2$1.f30114b;
                if (i50 == 0) {
                    AbstractC3193b.m15359b(obj51);
                    Object obj53 = ((yz4) obj).f70667a;
                    readerComposeViewModel$special$$inlined$map$7$2$1.f30114b = 1;
                    return e83Var.emit(obj53, readerComposeViewModel$special$$inlined$map$7$2$1) == obj52 ? obj52 : xfaVar;
                }
                if (i50 == 1) {
                    AbstractC3193b.m15359b(obj51);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$8$2$1) {
                    readerComposeViewModel$special$$inlined$map$8$2$1 = (ReaderComposeViewModel$special$$inlined$map$8$2$1) continuation;
                    int i51 = readerComposeViewModel$special$$inlined$map$8$2$1.f30117b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$8$2$1.f30117b = i51 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$8$2$1 = new ReaderComposeViewModel$special$$inlined$map$8$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$8$2$1 = new ReaderComposeViewModel$special$$inlined$map$8$2$1(this, continuation);
                }
                Object obj54 = readerComposeViewModel$special$$inlined$map$8$2$1.f30116a;
                Object obj55 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i52 = readerComposeViewModel$special$$inlined$map$8$2$1.f30117b;
                if (i52 == 0) {
                    AbstractC3193b.m15359b(obj54);
                    Object num9 = new Integer(((Map) obj).size());
                    readerComposeViewModel$special$$inlined$map$8$2$1.f30117b = 1;
                    return e83Var.emit(num9, readerComposeViewModel$special$$inlined$map$8$2$1) == obj55 ? obj55 : xfaVar;
                }
                if (i52 == 1) {
                    AbstractC3193b.m15359b(obj54);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                if (continuation instanceof ReaderComposeViewModel$special$$inlined$map$9$2$1) {
                    readerComposeViewModel$special$$inlined$map$9$2$1 = (ReaderComposeViewModel$special$$inlined$map$9$2$1) continuation;
                    int i53 = readerComposeViewModel$special$$inlined$map$9$2$1.f30120b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        readerComposeViewModel$special$$inlined$map$9$2$1.f30120b = i53 - Integer.MIN_VALUE;
                    } else {
                        readerComposeViewModel$special$$inlined$map$9$2$1 = new ReaderComposeViewModel$special$$inlined$map$9$2$1(this, continuation);
                    }
                } else {
                    readerComposeViewModel$special$$inlined$map$9$2$1 = new ReaderComposeViewModel$special$$inlined$map$9$2$1(this, continuation);
                }
                Object obj56 = readerComposeViewModel$special$$inlined$map$9$2$1.f30119a;
                Object obj57 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i54 = readerComposeViewModel$special$$inlined$map$9$2$1.f30120b;
                if (i54 == 0) {
                    AbstractC3193b.m15359b(obj56);
                    Object num10 = new Integer(((yz4) obj).f70670d.size());
                    readerComposeViewModel$special$$inlined$map$9$2$1.f30120b = 1;
                    return e83Var.emit(num10, readerComposeViewModel$special$$inlined$map$9$2$1) == obj57 ? obj57 : xfaVar;
                }
                if (i54 == 1) {
                    AbstractC3193b.m15359b(obj56);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$filterNot$1$2$1) {
                    readerContentStateHolder$special$$inlined$filterNot$1$2$1 = (ReaderContentStateHolder$special$$inlined$filterNot$1$2$1) continuation;
                    int i55 = readerContentStateHolder$special$$inlined$filterNot$1$2$1.f28017b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$filterNot$1$2$1.f28017b = i55 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$filterNot$1$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$filterNot$1$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj58 = readerContentStateHolder$special$$inlined$filterNot$1$2$1.f28016a;
                Object obj59 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i56 = readerContentStateHolder$special$$inlined$filterNot$1$2$1.f28017b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        AbstractC3193b.m15359b(obj58);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj58);
                Pair pair3 = (Pair) obj;
                if (((List) pair3.f47623a).isEmpty() || ((CharSequence) pair3.f47624b).length() == 0) {
                    return xfaVar;
                }
                readerContentStateHolder$special$$inlined$filterNot$1$2$1.f28017b = 1;
                return e83Var.emit(obj, readerContentStateHolder$special$$inlined$filterNot$1$2$1) == obj59 ? obj59 : xfaVar;
            case 25:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$filterNot$2$2$1) {
                    readerContentStateHolder$special$$inlined$filterNot$2$2$1 = (ReaderContentStateHolder$special$$inlined$filterNot$2$2$1) continuation;
                    int i57 = readerContentStateHolder$special$$inlined$filterNot$2$2$1.f28020b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$filterNot$2$2$1.f28020b = i57 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$filterNot$2$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$2$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$filterNot$2$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$2$2$1(this, continuation);
                }
                Object obj60 = readerContentStateHolder$special$$inlined$filterNot$2$2$1.f28019a;
                Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i58 = readerContentStateHolder$special$$inlined$filterNot$2$2$1.f28020b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        AbstractC3193b.m15359b(obj60);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj60);
                Pair pair4 = (Pair) obj;
                if (((List) pair4.f47623a).isEmpty() || ((CharSequence) pair4.f47624b).length() == 0) {
                    return xfaVar;
                }
                readerContentStateHolder$special$$inlined$filterNot$2$2$1.f28020b = 1;
                return e83Var.emit(obj, readerContentStateHolder$special$$inlined$filterNot$2$2$1) == obj61 ? obj61 : xfaVar;
            case 26:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$filterNot$3$2$1) {
                    readerContentStateHolder$special$$inlined$filterNot$3$2$1 = (ReaderContentStateHolder$special$$inlined$filterNot$3$2$1) continuation;
                    int i59 = readerContentStateHolder$special$$inlined$filterNot$3$2$1.f28023b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$filterNot$3$2$1.f28023b = i59 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$filterNot$3$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$3$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$filterNot$3$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$3$2$1(this, continuation);
                }
                Object obj62 = readerContentStateHolder$special$$inlined$filterNot$3$2$1.f28022a;
                Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i60 = readerContentStateHolder$special$$inlined$filterNot$3$2$1.f28023b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        AbstractC3193b.m15359b(obj62);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj62);
                Pair pair5 = (Pair) obj;
                if (((CharSequence) pair5.f47623a).length() == 0 || ((Number) pair5.f47624b).intValue() == 0) {
                    return xfaVar;
                }
                readerContentStateHolder$special$$inlined$filterNot$3$2$1.f28023b = 1;
                return e83Var.emit(obj, readerContentStateHolder$special$$inlined$filterNot$3$2$1) == obj63 ? obj63 : xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$filterNot$4$2$1) {
                    readerContentStateHolder$special$$inlined$filterNot$4$2$1 = (ReaderContentStateHolder$special$$inlined$filterNot$4$2$1) continuation;
                    int i61 = readerContentStateHolder$special$$inlined$filterNot$4$2$1.f28026b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$filterNot$4$2$1.f28026b = i61 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$filterNot$4$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$4$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$filterNot$4$2$1 = new ReaderContentStateHolder$special$$inlined$filterNot$4$2$1(this, continuation);
                }
                Object obj64 = readerContentStateHolder$special$$inlined$filterNot$4$2$1.f28025a;
                Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i62 = readerContentStateHolder$special$$inlined$filterNot$4$2$1.f28026b;
                if (i62 != 0) {
                    if (i62 == 1) {
                        AbstractC3193b.m15359b(obj64);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj64);
                Pair pair6 = (Pair) obj;
                if (((Number) pair6.f47623a).intValue() == 0 || ((CharSequence) pair6.f47624b).length() == 0) {
                    return xfaVar;
                }
                readerContentStateHolder$special$$inlined$filterNot$4$2$1.f28026b = 1;
                return e83Var.emit(obj, readerContentStateHolder$special$$inlined$filterNot$4$2$1) == obj65 ? obj65 : xfaVar;
            case 28:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$map$1$2$1) {
                    readerContentStateHolder$special$$inlined$map$1$2$1 = (ReaderContentStateHolder$special$$inlined$map$1$2$1) continuation;
                    int i63 = readerContentStateHolder$special$$inlined$map$1$2$1.f28037b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$map$1$2$1.f28037b = i63 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$map$1$2$1 = new ReaderContentStateHolder$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$map$1$2$1 = new ReaderContentStateHolder$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj66 = readerContentStateHolder$special$$inlined$map$1$2$1.f28036a;
                Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i64 = readerContentStateHolder$special$$inlined$map$1$2$1.f28037b;
                if (i64 != 0) {
                    if (i64 == 1) {
                        AbstractC3193b.m15359b(obj66);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj66);
                Collection<LessonCard> collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    for (LessonCard lessonCard : collectionValues) {
                        if (!y7d.m24985d(lessonCard.f19178a) && lessonCard.m8042j() && (i3 = i3 + 1) < 0) {
                            vz1.m23626d0();
                            throw null;
                        }
                    }
                }
                Object num11 = new Integer(i3);
                readerContentStateHolder$special$$inlined$map$1$2$1.f28037b = 1;
                return e83Var.emit(num11, readerContentStateHolder$special$$inlined$map$1$2$1) == obj67 ? obj67 : xfaVar;
            default:
                if (continuation instanceof ReaderContentStateHolder$special$$inlined$map$2$2$1) {
                    readerContentStateHolder$special$$inlined$map$2$2$1 = (ReaderContentStateHolder$special$$inlined$map$2$2$1) continuation;
                    int i65 = readerContentStateHolder$special$$inlined$map$2$2$1.f28040b;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        readerContentStateHolder$special$$inlined$map$2$2$1.f28040b = i65 - Integer.MIN_VALUE;
                    } else {
                        readerContentStateHolder$special$$inlined$map$2$2$1 = new ReaderContentStateHolder$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    readerContentStateHolder$special$$inlined$map$2$2$1 = new ReaderContentStateHolder$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj68 = readerContentStateHolder$special$$inlined$map$2$2$1.f28039a;
                Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i66 = readerContentStateHolder$special$$inlined$map$2$2$1.f28040b;
                if (i66 != 0) {
                    if (i66 == 1) {
                        AbstractC3193b.m15359b(obj68);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj68);
                Collection collectionValues2 = ((Map) obj).values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    Iterator it4 = collectionValues2.iterator();
                    while (it4.hasNext()) {
                        if (fa4.m11650l(((LessonWord) it4.next()).f19322i, WordStatus.New.getValue()) && (i2 = i2 + 1) < 0) {
                            vz1.m23626d0();
                            throw null;
                        }
                    }
                }
                Object num12 = new Integer(i2);
                readerContentStateHolder$special$$inlined$map$2$2$1.f28040b = 1;
                return e83Var.emit(num12, readerContentStateHolder$special$$inlined$map$2$2$1) == obj69 ? obj69 : xfaVar;
        }
    }

    public /* synthetic */ zd7(e83 e83Var, Object obj, int i) {
        this.f71389a = i;
        this.f71390b = e83Var;
    }
}
