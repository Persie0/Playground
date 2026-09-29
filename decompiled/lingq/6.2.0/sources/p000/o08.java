package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1281x5e1a1aec;
import com.lingq.core.data.repository.C1282x6bbe854a;
import com.lingq.core.data.repository.C1283xee533789;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LibraryFastSearchEntity;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryFastSearch;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.settings.review.ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1;
import com.lingq.core.settings.review.ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1;
import com.lingq.core.settings.theme.ThemeSettingsViewModel$special$$inlined$filter$1$2$1;
import com.lingq.core.token.TokenUpdateViewModel$special$$inlined$filter$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filter$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filterNot$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filterNot$2$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filterNot$3$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$filterNot$4$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$map$3$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$4$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$5$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$6$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$7$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$8$2$1;
import com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$9$2$1;
import com.lingq.feature.review.ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1;
import com.lingq.feature.review.ReviewViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.review.activities.C2655x9a0f653b;
import com.lingq.feature.review.activities.C2716xcea316ee;
import com.lingq.feature.review.activities.C2717xceb12e6f;
import com.lingq.feature.review.activities.C2723x7c269491;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class o08 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f53561b;

    public /* synthetic */ o08(e83 e83Var, int i) {
        this.f53560a = i;
        this.f53561b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0357  */
    /* JADX WARN: Code duplicated, block: B:154:0x039c  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:190:0x042b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0471  */
    /* JADX WARN: Code duplicated, block: B:227:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:246:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:264:0x0541  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:295:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:322:0x068a  */
    /* JADX WARN: Code duplicated, block: B:340:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:358:0x0714  */
    /* JADX WARN: Code duplicated, block: B:376:0x0759  */
    /* JADX WARN: Code duplicated, block: B:394:0x079e  */
    /* JADX WARN: Code duplicated, block: B:412:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:430:0x082a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:448:0x086f  */
    /* JADX WARN: Code duplicated, block: B:466:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:484:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:500:0x093a  */
    /* JADX WARN: Code duplicated, block: B:520:0x0985  */
    /* JADX WARN: Code duplicated, block: B:536:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:63:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0285  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ReaderVideoComposeViewModel$special$$inlined$map$4$2$1 readerVideoComposeViewModel$special$$inlined$map$4$2$1;
        Integer num;
        ReaderVideoComposeViewModel$special$$inlined$map$5$2$1 readerVideoComposeViewModel$special$$inlined$map$5$2$1;
        ReaderVideoComposeViewModel$special$$inlined$map$6$2$1 readerVideoComposeViewModel$special$$inlined$map$6$2$1;
        ReaderVideoComposeViewModel$special$$inlined$map$7$2$1 readerVideoComposeViewModel$special$$inlined$map$7$2$1;
        ReaderVideoComposeViewModel$special$$inlined$map$8$2$1 readerVideoComposeViewModel$special$$inlined$map$8$2$1;
        ReaderVideoComposeViewModel$special$$inlined$map$9$2$1 readerVideoComposeViewModel$special$$inlined$map$9$2$1;
        ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1 readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1;
        ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1 readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1;
        ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1 readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1;
        ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1 readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1;
        ReaderViewModel$special$$inlined$filter$1$2$1 readerViewModel$special$$inlined$filter$1$2$1;
        ReaderViewModel$special$$inlined$filterNot$1$2$1 readerViewModel$special$$inlined$filterNot$1$2$1;
        ReaderViewModel$special$$inlined$filterNot$2$2$1 readerViewModel$special$$inlined$filterNot$2$2$1;
        ReaderViewModel$special$$inlined$filterNot$3$2$1 readerViewModel$special$$inlined$filterNot$3$2$1;
        ReaderViewModel$special$$inlined$filterNot$4$2$1 readerViewModel$special$$inlined$filterNot$4$2$1;
        ReaderViewModel$special$$inlined$map$1$2$1 readerViewModel$special$$inlined$map$1$2$1;
        ReaderViewModel$special$$inlined$map$3$2$1 readerViewModel$special$$inlined$map$3$2$1;
        C2655x9a0f653b c2655x9a0f653b;
        C2716xcea316ee c2716xcea316ee;
        C2717xceb12e6f c2717xceb12e6f;
        C2723x7c269491 c2723x7c269491;
        ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1 reviewSettingsProvider$observeActivities$$inlined$map$1$2$1;
        ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1 reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1;
        ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1 reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1;
        ReviewViewModel$special$$inlined$map$1$2$1 reviewViewModel$special$$inlined$map$1$2$1;
        C1281x5e1a1aec c1281x5e1a1aec;
        C1282x6bbe854a c1282x6bbe854a;
        C1283xee533789 c1283xee533789;
        xfa xfaVar;
        ThemeSettingsViewModel$special$$inlined$filter$1$2$1 themeSettingsViewModel$special$$inlined$filter$1$2$1;
        TokenUpdateViewModel$special$$inlined$filter$1$2$1 tokenUpdateViewModel$special$$inlined$filter$1$2$1;
        int i = this.f53560a;
        boolean z = false;
        xfa xfaVar2 = xfa.f68157a;
        e83 e83Var = this.f53561b;
        int i2 = 1;
        switch (i) {
            case 0:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$4$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$4$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$4$2$1) continuation;
                    int i3 = readerVideoComposeViewModel$special$$inlined$map$4$2$1.f31295b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$4$2$1.f31295b = i3 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$4$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$4$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$4$2$1(this, continuation);
                }
                Object obj2 = readerVideoComposeViewModel$special$$inlined$map$4$2$1.f31294a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = readerVideoComposeViewModel$special$$inlined$map$4$2$1.f31295b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    LessonBookmark lessonBookmark = (LessonBookmark) obj;
                    num = lessonBookmark != null ? lessonBookmark.f19169b : null;
                    readerVideoComposeViewModel$special$$inlined$map$4$2$1.f31295b = 1;
                    if (e83Var.emit(num, readerVideoComposeViewModel$special$$inlined$map$4$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj2);
                }
                return xfaVar2;
            case 1:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$5$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$5$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$5$2$1) continuation;
                    int i5 = readerVideoComposeViewModel$special$$inlined$map$5$2$1.f31298b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$5$2$1.f31298b = i5 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$5$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$5$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$5$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$5$2$1(this, continuation);
                }
                Object obj3 = readerVideoComposeViewModel$special$$inlined$map$5$2$1.f31297a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = readerVideoComposeViewModel$special$$inlined$map$5$2$1.f31298b;
                if (i6 == 0) {
                    AbstractC3193b.m15359b(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((hqa) obj).f42795c);
                    readerVideoComposeViewModel$special$$inlined$map$5$2$1.f31298b = 1;
                    if (e83Var.emit(boolValueOf, readerVideoComposeViewModel$special$$inlined$map$5$2$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj3);
                }
                return xfaVar2;
            case 2:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$6$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$6$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$6$2$1) continuation;
                    int i7 = readerVideoComposeViewModel$special$$inlined$map$6$2$1.f31301b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$6$2$1.f31301b = i7 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$6$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$6$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$6$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$6$2$1(this, continuation);
                }
                Object obj4 = readerVideoComposeViewModel$special$$inlined$map$6$2$1.f31300a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = readerVideoComposeViewModel$special$$inlined$map$6$2$1.f31301b;
                if (i8 == 0) {
                    AbstractC3193b.m15359b(obj4);
                    Map map = ((yz4) obj).f70674h;
                    readerVideoComposeViewModel$special$$inlined$map$6$2$1.f31301b = 1;
                    if (e83Var.emit(map, readerVideoComposeViewModel$special$$inlined$map$6$2$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj4);
                }
                return xfaVar2;
            case 3:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$7$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$7$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$7$2$1) continuation;
                    int i9 = readerVideoComposeViewModel$special$$inlined$map$7$2$1.f31304b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$7$2$1.f31304b = i9 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$7$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$7$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$7$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$7$2$1(this, continuation);
                }
                Object obj5 = readerVideoComposeViewModel$special$$inlined$map$7$2$1.f31303a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = readerVideoComposeViewModel$special$$inlined$map$7$2$1.f31304b;
                if (i10 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(((nz9) obj).f53466l);
                    readerVideoComposeViewModel$special$$inlined$map$7$2$1.f31304b = 1;
                    if (e83Var.emit(boolValueOf2, readerVideoComposeViewModel$special$$inlined$map$7$2$1) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i10 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj5);
                }
                return xfaVar2;
            case 4:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$8$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$8$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$8$2$1) continuation;
                    int i11 = readerVideoComposeViewModel$special$$inlined$map$8$2$1.f31307b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$8$2$1.f31307b = i11 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$8$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$8$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$8$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$8$2$1(this, continuation);
                }
                Object obj6 = readerVideoComposeViewModel$special$$inlined$map$8$2$1.f31306a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = readerVideoComposeViewModel$special$$inlined$map$8$2$1.f31307b;
                if (i12 == 0) {
                    AbstractC3193b.m15359b(obj6);
                    Lesson lesson = ((yz4) obj).f70667a;
                    num = lesson != null ? new Integer(lesson.f19149h) : null;
                    readerVideoComposeViewModel$special$$inlined$map$8$2$1.f31307b = 1;
                    if (e83Var.emit(num, readerVideoComposeViewModel$special$$inlined$map$8$2$1) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i12 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj6);
                }
                return xfaVar2;
            case 5:
                if (continuation instanceof ReaderVideoComposeViewModel$special$$inlined$map$9$2$1) {
                    readerVideoComposeViewModel$special$$inlined$map$9$2$1 = (ReaderVideoComposeViewModel$special$$inlined$map$9$2$1) continuation;
                    int i13 = readerVideoComposeViewModel$special$$inlined$map$9$2$1.f31310b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        readerVideoComposeViewModel$special$$inlined$map$9$2$1.f31310b = i13 - Integer.MIN_VALUE;
                    } else {
                        readerVideoComposeViewModel$special$$inlined$map$9$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$9$2$1(this, continuation);
                    }
                } else {
                    readerVideoComposeViewModel$special$$inlined$map$9$2$1 = new ReaderVideoComposeViewModel$special$$inlined$map$9$2$1(this, continuation);
                }
                Object obj7 = readerVideoComposeViewModel$special$$inlined$map$9$2$1.f31309a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = readerVideoComposeViewModel$special$$inlined$map$9$2$1.f31310b;
                if (i14 == 0) {
                    AbstractC3193b.m15359b(obj7);
                    Lesson lesson2 = ((yz4) obj).f70667a;
                    readerVideoComposeViewModel$special$$inlined$map$9$2$1.f31310b = 1;
                    if (e83Var.emit(lesson2, readerVideoComposeViewModel$special$$inlined$map$9$2$1) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i14 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj7);
                }
                return xfaVar2;
            case 6:
                if (continuation instanceof ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1) {
                    readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1 = (ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                    int i15 = readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1.f28809b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1.f28809b = i15 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj8 = readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1.f28808a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1.f28809b;
                if (i16 == 0) {
                    AbstractC3193b.m15359b(obj8);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1.f28809b = 1;
                        if (e83Var.emit(obj, readerViewModel$12$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj8);
                }
                return xfaVar2;
            case 7:
                if (continuation instanceof ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1) {
                    readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1 = (ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                    int i17 = readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1.f28842b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1.f28842b = i17 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj9 = readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1.f28841a;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1.f28842b;
                if (i18 == 0) {
                    AbstractC3193b.m15359b(obj9);
                    if (!((Map) obj).isEmpty()) {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1.f28842b = 1;
                        if (e83Var.emit(obj, readerViewModel$18$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj9);
                }
                return xfaVar2;
            case 8:
                if (continuation instanceof ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1) {
                    readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1 = (ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1) continuation;
                    int i19 = readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1.f28845b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1.f28845b = i19 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1 = new ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1 = new ReaderViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1(this, continuation);
                }
                Object obj10 = readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1.f28844a;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1.f28845b;
                if (i20 == 0) {
                    AbstractC3193b.m15359b(obj10);
                    if (!((Map) obj).isEmpty()) {
                        readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1.f28845b = 1;
                        if (e83Var.emit(obj, readerViewModel$18$invokeSuspend$$inlined$filterNot$2$2$1) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj10);
                }
                return xfaVar2;
            case 9:
                if (continuation instanceof ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1) {
                    readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1 = (ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                    int i21 = readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1.f28872b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1.f28872b = i21 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1 = new ReaderViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj11 = readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1.f28871a;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1.f28872b;
                if (i22 == 0) {
                    AbstractC3193b.m15359b(obj11);
                    if (!((Map) obj).isEmpty()) {
                        readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1.f28872b = 1;
                        if (e83Var.emit(obj, readerViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj11);
                }
                return xfaVar2;
            case 10:
                if (continuation instanceof ReaderViewModel$special$$inlined$filter$1$2$1) {
                    readerViewModel$special$$inlined$filter$1$2$1 = (ReaderViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i23 = readerViewModel$special$$inlined$filter$1$2$1.f29095b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$filter$1$2$1.f29095b = i23 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$filter$1$2$1 = new ReaderViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$filter$1$2$1 = new ReaderViewModel$special$$inlined$filter$1$2$1(this, continuation);
                }
                Object obj12 = readerViewModel$special$$inlined$filter$1$2$1.f29094a;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = readerViewModel$special$$inlined$filter$1$2$1.f29095b;
                if (i24 == 0) {
                    AbstractC3193b.m15359b(obj12);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$special$$inlined$filter$1$2$1.f29095b = 1;
                        if (e83Var.emit(obj, readerViewModel$special$$inlined$filter$1$2$1) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj12);
                }
                return xfaVar2;
            case 11:
                if (continuation instanceof ReaderViewModel$special$$inlined$filterNot$1$2$1) {
                    readerViewModel$special$$inlined$filterNot$1$2$1 = (ReaderViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i25 = readerViewModel$special$$inlined$filterNot$1$2$1.f29098b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$filterNot$1$2$1.f29098b = i25 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$filterNot$1$2$1 = new ReaderViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$filterNot$1$2$1 = new ReaderViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj13 = readerViewModel$special$$inlined$filterNot$1$2$1.f29097a;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = readerViewModel$special$$inlined$filterNot$1$2$1.f29098b;
                if (i26 == 0) {
                    AbstractC3193b.m15359b(obj13);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$special$$inlined$filterNot$1$2$1.f29098b = 1;
                        if (e83Var.emit(obj, readerViewModel$special$$inlined$filterNot$1$2$1) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj13);
                }
                return xfaVar2;
            case 12:
                if (continuation instanceof ReaderViewModel$special$$inlined$filterNot$2$2$1) {
                    readerViewModel$special$$inlined$filterNot$2$2$1 = (ReaderViewModel$special$$inlined$filterNot$2$2$1) continuation;
                    int i27 = readerViewModel$special$$inlined$filterNot$2$2$1.f29101b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$filterNot$2$2$1.f29101b = i27 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$filterNot$2$2$1 = new ReaderViewModel$special$$inlined$filterNot$2$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$filterNot$2$2$1 = new ReaderViewModel$special$$inlined$filterNot$2$2$1(this, continuation);
                }
                Object obj14 = readerViewModel$special$$inlined$filterNot$2$2$1.f29100a;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = readerViewModel$special$$inlined$filterNot$2$2$1.f29101b;
                if (i28 == 0) {
                    AbstractC3193b.m15359b(obj14);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$special$$inlined$filterNot$2$2$1.f29101b = 1;
                        if (e83Var.emit(obj, readerViewModel$special$$inlined$filterNot$2$2$1) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj14);
                }
                return xfaVar2;
            case 13:
                if (continuation instanceof ReaderViewModel$special$$inlined$filterNot$3$2$1) {
                    readerViewModel$special$$inlined$filterNot$3$2$1 = (ReaderViewModel$special$$inlined$filterNot$3$2$1) continuation;
                    int i29 = readerViewModel$special$$inlined$filterNot$3$2$1.f29104b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$filterNot$3$2$1.f29104b = i29 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$filterNot$3$2$1 = new ReaderViewModel$special$$inlined$filterNot$3$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$filterNot$3$2$1 = new ReaderViewModel$special$$inlined$filterNot$3$2$1(this, continuation);
                }
                Object obj15 = readerViewModel$special$$inlined$filterNot$3$2$1.f29103a;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = readerViewModel$special$$inlined$filterNot$3$2$1.f29104b;
                if (i30 == 0) {
                    AbstractC3193b.m15359b(obj15);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$special$$inlined$filterNot$3$2$1.f29104b = 1;
                        if (e83Var.emit(obj, readerViewModel$special$$inlined$filterNot$3$2$1) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj15);
                }
                return xfaVar2;
            case 14:
                if (continuation instanceof ReaderViewModel$special$$inlined$filterNot$4$2$1) {
                    readerViewModel$special$$inlined$filterNot$4$2$1 = (ReaderViewModel$special$$inlined$filterNot$4$2$1) continuation;
                    int i31 = readerViewModel$special$$inlined$filterNot$4$2$1.f29107b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$filterNot$4$2$1.f29107b = i31 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$filterNot$4$2$1 = new ReaderViewModel$special$$inlined$filterNot$4$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$filterNot$4$2$1 = new ReaderViewModel$special$$inlined$filterNot$4$2$1(this, continuation);
                }
                Object obj16 = readerViewModel$special$$inlined$filterNot$4$2$1.f29106a;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = readerViewModel$special$$inlined$filterNot$4$2$1.f29107b;
                if (i32 == 0) {
                    AbstractC3193b.m15359b(obj16);
                    if (!((List) obj).isEmpty()) {
                        readerViewModel$special$$inlined$filterNot$4$2$1.f29107b = 1;
                        if (e83Var.emit(obj, readerViewModel$special$$inlined$filterNot$4$2$1) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj16);
                }
                return xfaVar2;
            case 15:
                if (continuation instanceof ReaderViewModel$special$$inlined$map$1$2$1) {
                    readerViewModel$special$$inlined$map$1$2$1 = (ReaderViewModel$special$$inlined$map$1$2$1) continuation;
                    int i33 = readerViewModel$special$$inlined$map$1$2$1.f29134b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$map$1$2$1.f29134b = i33 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$map$1$2$1 = new ReaderViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$map$1$2$1 = new ReaderViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj17 = readerViewModel$special$$inlined$map$1$2$1.f29133a;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = readerViewModel$special$$inlined$map$1$2$1.f29134b;
                if (i34 == 0) {
                    AbstractC3193b.m15359b(obj17);
                    Map map2 = (Map) obj;
                    ArrayList arrayList = new ArrayList(map2.size());
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((LessonWord) ((Map.Entry) it.next()).getValue());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj18 : arrayList) {
                        if (fa4.m11650l(((LessonWord) obj18).f19322i, WordStatus.New.getValue())) {
                            arrayList2.add(obj18);
                        }
                    }
                    Integer num2 = new Integer(arrayList2.size());
                    readerViewModel$special$$inlined$map$1$2$1.f29134b = 1;
                    if (e83Var.emit(num2, readerViewModel$special$$inlined$map$1$2$1) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i34 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj17);
                }
                return xfaVar2;
            case 16:
                if (continuation instanceof ReaderViewModel$special$$inlined$map$3$2$1) {
                    readerViewModel$special$$inlined$map$3$2$1 = (ReaderViewModel$special$$inlined$map$3$2$1) continuation;
                    int i35 = readerViewModel$special$$inlined$map$3$2$1.f29140b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$map$3$2$1.f29140b = i35 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$map$3$2$1 = new ReaderViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$map$3$2$1 = new ReaderViewModel$special$$inlined$map$3$2$1(this, continuation);
                }
                Object obj19 = readerViewModel$special$$inlined$map$3$2$1.f29139a;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = readerViewModel$special$$inlined$map$3$2$1.f29140b;
                if (i36 == 0) {
                    AbstractC3193b.m15359b(obj19);
                    Map map3 = (Map) obj;
                    ArrayList arrayList3 = new ArrayList(map3.size());
                    Iterator it2 = map3.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((LessonWord) ((Map.Entry) it2.next()).getValue());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj20 : arrayList3) {
                        if (fa4.m11650l(((LessonWord) obj20).f19322i, WordStatus.New.getValue())) {
                            arrayList4.add(obj20);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(v91.m23189q0(arrayList4, 10));
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((LessonWord) it3.next()).f19314a);
                    }
                    readerViewModel$special$$inlined$map$3$2$1.f29140b = 1;
                    if (e83Var.emit(arrayList5, readerViewModel$special$$inlined$map$3$2$1) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i36 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj19);
                }
                return xfaVar2;
            case 17:
                if (continuation instanceof C2655x9a0f653b) {
                    c2655x9a0f653b = (C2655x9a0f653b) continuation;
                    int i37 = c2655x9a0f653b.f31987b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c2655x9a0f653b.f31987b = i37 - Integer.MIN_VALUE;
                    } else {
                        c2655x9a0f653b = new C2655x9a0f653b(this, continuation);
                    }
                } else {
                    c2655x9a0f653b = new C2655x9a0f653b(this, continuation);
                }
                Object obj21 = c2655x9a0f653b.f31986a;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = c2655x9a0f653b.f31987b;
                if (i38 == 0) {
                    AbstractC3193b.m15359b(obj21);
                    if (!((List) obj).isEmpty()) {
                        c2655x9a0f653b.f31987b = 1;
                        if (e83Var.emit(obj, c2655x9a0f653b) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj21);
                }
                return xfaVar2;
            case 18:
                if (continuation instanceof C2716xcea316ee) {
                    c2716xcea316ee = (C2716xcea316ee) continuation;
                    int i39 = c2716xcea316ee.f32187b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        c2716xcea316ee.f32187b = i39 - Integer.MIN_VALUE;
                    } else {
                        c2716xcea316ee = new C2716xcea316ee(this, continuation);
                    }
                } else {
                    c2716xcea316ee = new C2716xcea316ee(this, continuation);
                }
                Object obj22 = c2716xcea316ee.f32186a;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = c2716xcea316ee.f32187b;
                if (i40 == 0) {
                    AbstractC3193b.m15359b(obj22);
                    if (((String) obj).length() != 0) {
                        c2716xcea316ee.f32187b = 1;
                        if (e83Var.emit(obj, c2716xcea316ee) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj22);
                }
                return xfaVar2;
            case 19:
                if (continuation instanceof C2717xceb12e6f) {
                    c2717xceb12e6f = (C2717xceb12e6f) continuation;
                    int i41 = c2717xceb12e6f.f32190b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        c2717xceb12e6f.f32190b = i41 - Integer.MIN_VALUE;
                    } else {
                        c2717xceb12e6f = new C2717xceb12e6f(this, continuation);
                    }
                } else {
                    c2717xceb12e6f = new C2717xceb12e6f(this, continuation);
                }
                Object obj23 = c2717xceb12e6f.f32189a;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = c2717xceb12e6f.f32190b;
                if (i42 == 0) {
                    AbstractC3193b.m15359b(obj23);
                    if (!((List) obj).isEmpty()) {
                        c2717xceb12e6f.f32190b = 1;
                        if (e83Var.emit(obj, c2717xceb12e6f) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj23);
                }
                return xfaVar2;
            case 20:
                if (continuation instanceof C2723x7c269491) {
                    c2723x7c269491 = (C2723x7c269491) continuation;
                    int i43 = c2723x7c269491.f32231b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        c2723x7c269491.f32231b = i43 - Integer.MIN_VALUE;
                    } else {
                        c2723x7c269491 = new C2723x7c269491(this, continuation);
                    }
                } else {
                    c2723x7c269491 = new C2723x7c269491(this, continuation);
                }
                Object obj24 = c2723x7c269491.f32230a;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i44 = c2723x7c269491.f32231b;
                if (i44 == 0) {
                    AbstractC3193b.m15359b(obj24);
                    if (((String) obj).length() != 0) {
                        c2723x7c269491.f32231b = 1;
                        if (e83Var.emit(obj, c2723x7c269491) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj24);
                }
                return xfaVar2;
            case 21:
                if (continuation instanceof ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1) {
                    reviewSettingsProvider$observeActivities$$inlined$map$1$2$1 = (ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1) continuation;
                    int i45 = reviewSettingsProvider$observeActivities$$inlined$map$1$2$1.f23086b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsProvider$observeActivities$$inlined$map$1$2$1.f23086b = i45 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsProvider$observeActivities$$inlined$map$1$2$1 = new ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsProvider$observeActivities$$inlined$map$1$2$1 = new ReviewSettingsProvider$observeActivities$$inlined$map$1$2$1(this, continuation);
                }
                Object obj25 = reviewSettingsProvider$observeActivities$$inlined$map$1$2$1.f23085a;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i46 = reviewSettingsProvider$observeActivities$$inlined$map$1$2$1.f23086b;
                if (i46 == 0) {
                    AbstractC3193b.m15359b(obj25);
                    Boolean boolValueOf3 = Boolean.valueOf(((Number) obj).intValue() > 0);
                    reviewSettingsProvider$observeActivities$$inlined$map$1$2$1.f23086b = 1;
                    if (e83Var.emit(boolValueOf3, reviewSettingsProvider$observeActivities$$inlined$map$1$2$1) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i46 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj25);
                }
                return xfaVar2;
            case 22:
                if (continuation instanceof ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1) {
                    reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1 = (ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1) continuation;
                    int i47 = reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1.f23139b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1.f23139b = i47 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1 = new ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1 = new ReviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1(this, continuation);
                }
                Object obj26 = reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1.f23138a;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i48 = reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1.f23139b;
                if (i48 == 0) {
                    AbstractC3193b.m15359b(obj26);
                    ue9 ue9Var = new ue9((Map) obj);
                    reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1.f23139b = 1;
                    if (e83Var.emit(ue9Var, reviewSettingsProvider$observeSpeaking$$inlined$map$1$2$1) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i48 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj26);
                }
                return xfaVar2;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                if (continuation instanceof ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1) {
                    reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1 = (ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                    int i49 = reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1.f31855b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1.f31855b = i49 - Integer.MIN_VALUE;
                    } else {
                        reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1 = new ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1 = new ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj27 = reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1.f31854a;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i50 = reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1.f31855b;
                if (i50 == 0) {
                    AbstractC3193b.m15359b(obj27);
                    if (!((List) obj).isEmpty()) {
                        reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1.f31855b = 1;
                        if (e83Var.emit(obj, reviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj27);
                }
                return xfaVar2;
            case 24:
                if (continuation instanceof ReviewViewModel$special$$inlined$map$1$2$1) {
                    reviewViewModel$special$$inlined$map$1$2$1 = (ReviewViewModel$special$$inlined$map$1$2$1) continuation;
                    int i51 = reviewViewModel$special$$inlined$map$1$2$1.f31898b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        reviewViewModel$special$$inlined$map$1$2$1.f31898b = i51 - Integer.MIN_VALUE;
                    } else {
                        reviewViewModel$special$$inlined$map$1$2$1 = new ReviewViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    reviewViewModel$special$$inlined$map$1$2$1 = new ReviewViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj28 = reviewViewModel$special$$inlined$map$1$2$1.f31897a;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i52 = reviewViewModel$special$$inlined$map$1$2$1.f31898b;
                if (i52 == 0) {
                    AbstractC3193b.m15359b(obj28);
                    Collection collectionValues = ((Map) obj).values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it4 = collectionValues.iterator();
                        while (it4.hasNext()) {
                            if (((Boolean) it4.next()).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    reviewViewModel$special$$inlined$map$1$2$1.f31898b = 1;
                    if (e83Var.emit(boolValueOf4, reviewViewModel$special$$inlined$map$1$2$1) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i52 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj28);
                }
                return xfaVar2;
            case 25:
                if (continuation instanceof C1281x5e1a1aec) {
                    c1281x5e1a1aec = (C1281x5e1a1aec) continuation;
                    int i53 = c1281x5e1a1aec.f16144b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        c1281x5e1a1aec.f16144b = i53 - Integer.MIN_VALUE;
                    } else {
                        c1281x5e1a1aec = new C1281x5e1a1aec(this, continuation);
                    }
                } else {
                    c1281x5e1a1aec = new C1281x5e1a1aec(this, continuation);
                }
                Object obj29 = c1281x5e1a1aec.f16143a;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i54 = c1281x5e1a1aec.f16144b;
                if (i54 == 0) {
                    AbstractC3193b.m15359b(obj29);
                    List list = (List) obj;
                    ArrayList arrayList6 = new ArrayList(v91.m23189q0(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(AbstractC3423or.m18273p0((u85) it5.next()));
                    }
                    c1281x5e1a1aec.f16144b = 1;
                    if (e83Var.emit(arrayList6, c1281x5e1a1aec) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i54 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj29);
                }
                return xfaVar2;
            case 26:
                if (continuation instanceof C1282x6bbe854a) {
                    c1282x6bbe854a = (C1282x6bbe854a) continuation;
                    int i55 = c1282x6bbe854a.f16147b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        c1282x6bbe854a.f16147b = i55 - Integer.MIN_VALUE;
                    } else {
                        c1282x6bbe854a = new C1282x6bbe854a(this, continuation);
                    }
                } else {
                    c1282x6bbe854a = new C1282x6bbe854a(this, continuation);
                }
                Object obj30 = c1282x6bbe854a.f16146a;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i56 = c1282x6bbe854a.f16147b;
                if (i56 == 0) {
                    AbstractC3193b.m15359b(obj30);
                    List<LibraryFastSearchEntity> list2 = (List) obj;
                    ArrayList arrayList7 = new ArrayList(v91.m23189q0(list2, 10));
                    for (LibraryFastSearchEntity libraryFastSearchEntity : list2) {
                        libraryFastSearchEntity.getClass();
                        String str = libraryFastSearchEntity.f17375a;
                        String str2 = libraryFastSearchEntity.f17376b;
                        String str3 = libraryFastSearchEntity.f17378d;
                        String str4 = libraryFastSearchEntity.f17379e;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList7.add(new LibraryFastSearch(str, str2, str3, str4));
                    }
                    c1282x6bbe854a.f16147b = 1;
                    if (e83Var.emit(arrayList7, c1282x6bbe854a) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i56 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj30);
                }
                return xfaVar2;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (continuation instanceof C1283xee533789) {
                    c1283xee533789 = (C1283xee533789) continuation;
                    int i57 = c1283xee533789.f16150b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        c1283xee533789.f16150b = i57 - Integer.MIN_VALUE;
                    } else {
                        c1283xee533789 = new C1283xee533789(this, continuation);
                    }
                } else {
                    c1283xee533789 = new C1283xee533789(this, continuation);
                }
                Object obj31 = c1283xee533789.f16149a;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i58 = c1283xee533789.f16150b;
                if (i58 == 0) {
                    AbstractC3193b.m15359b(obj31);
                    List list3 = (List) obj;
                    ArrayList arrayList8 = new ArrayList(v91.m23189q0(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        LessonEntity lessonEntity = (LessonEntity) it6.next();
                        lessonEntity.getClass();
                        arrayList8.add(new LibraryItem(lessonEntity.f17274a, lessonEntity.f17276b, lessonEntity.f17278c, Integer.valueOf(lessonEntity.f17280d), lessonEntity.f17282e, lessonEntity.f17284f, lessonEntity.f17294k, lessonEntity.f17288h, Integer.valueOf(lessonEntity.f17292j), Integer.valueOf(lessonEntity.f17300n), Integer.valueOf(lessonEntity.f17302o), Integer.valueOf(lessonEntity.f17304p), Integer.valueOf(lessonEntity.f17310s), lessonEntity.f17312t, Double.valueOf(lessonEntity.f17254H), Double.valueOf(lessonEntity.f17256I), Boolean.valueOf(lessonEntity.f17257J), lessonEntity.f17240A, lessonEntity.f17242B, lessonEntity.f17244C, Integer.valueOf(lessonEntity.f17258K), Integer.valueOf(lessonEntity.f17259L), Boolean.valueOf(lessonEntity.f17260M), Boolean.valueOf(lessonEntity.f17263P), Double.valueOf(lessonEntity.f17264Q), Boolean.valueOf(lessonEntity.f17266S), lessonEntity.f17301n0, Integer.valueOf(lessonEntity.f17305p0), lessonEntity.f17311s0, lessonEntity.f17313t0, lessonEntity.f17317v0, Integer.valueOf(lessonEntity.f17321x0), lessonEntity.f17272Y, lessonEntity.f17273Z, lessonEntity.f17275a0, lessonEntity.f17277b0, lessonEntity.f17279c0, lessonEntity.f17281d0, lessonEntity.f17283e0, lessonEntity.f17285f0, lessonEntity.f17287g0, false, lessonEntity.f17319w0, lessonEntity.f17307q0, lessonEntity.f17325z0, null, null, lessonEntity.f17303o0, lessonEntity.f17262O, lessonEntity.f17268U, lessonEntity.f17290i, lessonEntity.f17247D0, null, null, 0, 6349312));
                        it6 = it6;
                        xfaVar2 = xfaVar2;
                        i2 = 1;
                    }
                    xfaVar = xfaVar2;
                    c1283xee533789.f16150b = i2;
                    if (e83Var.emit(arrayList8, c1283xee533789) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i58 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj31);
                    xfaVar = xfaVar2;
                }
                return xfaVar;
            case 28:
                if (continuation instanceof ThemeSettingsViewModel$special$$inlined$filter$1$2$1) {
                    themeSettingsViewModel$special$$inlined$filter$1$2$1 = (ThemeSettingsViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i59 = themeSettingsViewModel$special$$inlined$filter$1$2$1.f23291b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        themeSettingsViewModel$special$$inlined$filter$1$2$1.f23291b = i59 - Integer.MIN_VALUE;
                    } else {
                        themeSettingsViewModel$special$$inlined$filter$1$2$1 = new ThemeSettingsViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                } else {
                    themeSettingsViewModel$special$$inlined$filter$1$2$1 = new ThemeSettingsViewModel$special$$inlined$filter$1$2$1(this, continuation);
                }
                Object obj32 = themeSettingsViewModel$special$$inlined$filter$1$2$1.f23290a;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i60 = themeSettingsViewModel$special$$inlined$filter$1$2$1.f23291b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        AbstractC3193b.m15359b(obj32);
                        return xfaVar2;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj32);
                if (((String) obj).length() <= 0) {
                    return xfaVar2;
                }
                themeSettingsViewModel$special$$inlined$filter$1$2$1.f23291b = 1;
                return e83Var.emit(obj, themeSettingsViewModel$special$$inlined$filter$1$2$1) == coroutineSingletons29 ? coroutineSingletons29 : xfaVar2;
            default:
                if (continuation instanceof TokenUpdateViewModel$special$$inlined$filter$1$2$1) {
                    tokenUpdateViewModel$special$$inlined$filter$1$2$1 = (TokenUpdateViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i61 = tokenUpdateViewModel$special$$inlined$filter$1$2$1.f23680b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        tokenUpdateViewModel$special$$inlined$filter$1$2$1.f23680b = i61 - Integer.MIN_VALUE;
                    } else {
                        tokenUpdateViewModel$special$$inlined$filter$1$2$1 = new TokenUpdateViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                } else {
                    tokenUpdateViewModel$special$$inlined$filter$1$2$1 = new TokenUpdateViewModel$special$$inlined$filter$1$2$1(this, continuation);
                }
                Object obj33 = tokenUpdateViewModel$special$$inlined$filter$1$2$1.f23679a;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i62 = tokenUpdateViewModel$special$$inlined$filter$1$2$1.f23680b;
                if (i62 != 0) {
                    if (i62 == 1) {
                        AbstractC3193b.m15359b(obj33);
                        return xfaVar2;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj33);
                if (((List) ((Pair) obj).f47624b).isEmpty()) {
                    return xfaVar2;
                }
                tokenUpdateViewModel$special$$inlined$filter$1$2$1.f23680b = 1;
                return e83Var.emit(obj, tokenUpdateViewModel$special$$inlined$filter$1$2$1) == coroutineSingletons30 ? coroutineSingletons30 : xfaVar2;
        }
    }
}
