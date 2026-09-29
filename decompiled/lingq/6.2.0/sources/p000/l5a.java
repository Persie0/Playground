package p000;

import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenUpdateViewModel$special$$inlined$filterNot$1$2$1;
import com.lingq.core.token.TokenUpdateViewModel$special$$inlined$map$1$2$1;
import com.lingq.core.token.TokenUpdateViewModel$special$$inlined$map$2$2$1;
import com.lingq.core.user.UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1;
import com.lingq.feature.reader.video.state.VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1;
import com.lingq.feature.reader.video.state.VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1;
import com.lingq.feature.reader.video.state.VideoContentStateHolder$special$$inlined$map$1$2$1;
import com.lingq.feature.reader.video.state.VideoContentStateHolder$special$$inlined$map$2$2$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class l5a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f49097b;

    public l5a(e83 e83Var, C1909e c1909e) {
        this.f49096a = 2;
        this.f49097b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x023f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0249  */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x0281  */
    /* JADX WARN: Code duplicated, block: B:153:0x0294  */
    /* JADX WARN: Code duplicated, block: B:168:0x02de  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0258 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        TokenUpdateViewModel$special$$inlined$filterNot$1$2$1 tokenUpdateViewModel$special$$inlined$filterNot$1$2$1;
        TokenUpdateViewModel$special$$inlined$map$1$2$1 tokenUpdateViewModel$special$$inlined$map$1$2$1;
        TokenUpdateViewModel$special$$inlined$map$2$2$1 tokenUpdateViewModel$special$$inlined$map$2$2$1;
        int i;
        int size;
        List list;
        Iterator it;
        int i2;
        boolean z;
        TokenPopupData tokenPopupData;
        i5a i5aVar;
        List list2;
        UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1 userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1;
        VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1 videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1;
        VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1 videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1;
        VideoContentStateHolder$special$$inlined$map$1$2$1 videoContentStateHolder$special$$inlined$map$1$2$1;
        VideoContentStateHolder$special$$inlined$map$2$2$1 videoContentStateHolder$special$$inlined$map$2$2$1;
        WorkSpecDaoKt$dedup$$inlined$map$1$2$1 workSpecDaoKt$dedup$$inlined$map$1$2$1;
        int i3 = this.f49096a;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f49097b;
        switch (i3) {
            case 0:
                if (continuation instanceof TokenUpdateViewModel$special$$inlined$filterNot$1$2$1) {
                    tokenUpdateViewModel$special$$inlined$filterNot$1$2$1 = (TokenUpdateViewModel$special$$inlined$filterNot$1$2$1) continuation;
                    int i4 = tokenUpdateViewModel$special$$inlined$filterNot$1$2$1.f23683b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        tokenUpdateViewModel$special$$inlined$filterNot$1$2$1.f23683b = i4 - Integer.MIN_VALUE;
                    } else {
                        tokenUpdateViewModel$special$$inlined$filterNot$1$2$1 = new TokenUpdateViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                    }
                } else {
                    tokenUpdateViewModel$special$$inlined$filterNot$1$2$1 = new TokenUpdateViewModel$special$$inlined$filterNot$1$2$1(this, continuation);
                }
                Object obj2 = tokenUpdateViewModel$special$$inlined$filterNot$1$2$1.f23682a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = tokenUpdateViewModel$special$$inlined$filterNot$1$2$1.f23683b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                if (((List) obj).isEmpty()) {
                    return xfaVar;
                }
                tokenUpdateViewModel$special$$inlined$filterNot$1$2$1.f23683b = 1;
                return e83Var.emit(obj, tokenUpdateViewModel$special$$inlined$filterNot$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof TokenUpdateViewModel$special$$inlined$map$1$2$1) {
                    tokenUpdateViewModel$special$$inlined$map$1$2$1 = (TokenUpdateViewModel$special$$inlined$map$1$2$1) continuation;
                    int i6 = tokenUpdateViewModel$special$$inlined$map$1$2$1.f23686b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tokenUpdateViewModel$special$$inlined$map$1$2$1.f23686b = i6 - Integer.MIN_VALUE;
                    } else {
                        tokenUpdateViewModel$special$$inlined$map$1$2$1 = new TokenUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    tokenUpdateViewModel$special$$inlined$map$1$2$1 = new TokenUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj3 = tokenUpdateViewModel$special$$inlined$map$1$2$1.f23685a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = tokenUpdateViewModel$special$$inlined$map$1$2$1.f23686b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                f5a f5aVar = (f5a) obj;
                Triple triple = new Triple(f5aVar.f38484p, f5aVar.f38485q, Boolean.valueOf(f5aVar.f38474f instanceof LessonCard));
                tokenUpdateViewModel$special$$inlined$map$1$2$1.f23686b = 1;
                return e83Var.emit(triple, tokenUpdateViewModel$special$$inlined$map$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof TokenUpdateViewModel$special$$inlined$map$2$2$1) {
                    tokenUpdateViewModel$special$$inlined$map$2$2$1 = (TokenUpdateViewModel$special$$inlined$map$2$2$1) continuation;
                    int i8 = tokenUpdateViewModel$special$$inlined$map$2$2$1.f23689b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        tokenUpdateViewModel$special$$inlined$map$2$2$1.f23689b = i8 - Integer.MIN_VALUE;
                    } else {
                        tokenUpdateViewModel$special$$inlined$map$2$2$1 = new TokenUpdateViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    tokenUpdateViewModel$special$$inlined$map$2$2$1 = new TokenUpdateViewModel$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj4 = tokenUpdateViewModel$special$$inlined$map$2$2$1.f23688a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = tokenUpdateViewModel$special$$inlined$map$2$2$1.f23689b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                f5a f5aVar2 = (f5a) obj;
                w65 w65Var = f5aVar2.f38474f;
                List list3 = f5aVar2.f38487s;
                String name = w65Var != null ? w65Var.getClass().getName() : "none";
                w65 w65Var2 = f5aVar2.f38474f;
                int size2 = 0;
                if (!(w65Var2 instanceof LessonWord)) {
                    if (w65Var2 instanceof LessonCard) {
                        size = ((LessonCard) w65Var2).f19183f.size();
                    } else {
                        i = 0;
                    }
                    int size3 = f5aVar2.f38486r.size();
                    int size4 = list3.size();
                    list = list3;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i2 = ((TokenMeaning) it.next()).f19594a;
                                if (i2 != -33 || i2 == -1) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    boolean zM8732e3 = C1909e.m8732e3(f5aVar2);
                    tokenPopupData = f5aVar2.f38475g;
                    if (tokenPopupData != null && (list2 = tokenPopupData.f23453i) != null) {
                        size2 = list2.size();
                    }
                    i5aVar = new i5a(name, i, size3, size4, z, zM8732e3, size2, f5aVar2.f38452J, f5aVar2.f38493y);
                    tokenUpdateViewModel$special$$inlined$map$2$2$1.f23689b = 1;
                    if (e83Var.emit(i5aVar, tokenUpdateViewModel$special$$inlined$map$2$2$1) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    return xfaVar;
                }
                size = ((LessonWord) w65Var2).f19319f.size();
                i = size;
                int size5 = f5aVar2.f38486r.size();
                int size6 = list3.size();
                list = list3;
                if (list instanceof Collection) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i2 = ((TokenMeaning) it.next()).f19594a;
                            if (i2 != -33) {
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i2 = ((TokenMeaning) it.next()).f19594a;
                            if (i2 != -33) {
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                boolean zM8732e4 = C1909e.m8732e3(f5aVar2);
                tokenPopupData = f5aVar2.f38475g;
                if (tokenPopupData != null) {
                    size2 = list2.size();
                }
                i5aVar = new i5a(name, i, size5, size6, z, zM8732e4, size2, f5aVar2.f38452J, f5aVar2.f38493y);
                tokenUpdateViewModel$special$$inlined$map$2$2$1.f23689b = 1;
                if (e83Var.emit(i5aVar, tokenUpdateViewModel$special$$inlined$map$2$2$1) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                return xfaVar;
            case 3:
                if (continuation instanceof UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1) {
                    userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1 = (UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1) continuation;
                    int i10 = userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1.f24252b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1.f24252b = i10 - Integer.MIN_VALUE;
                    } else {
                        userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1 = new UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1 = new UserSessionViewModelDelegateImpl$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj5 = userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1.f24251a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1.f24252b;
                if (i11 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    Integer num = new Integer(((Language) obj).f19025b);
                    userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1.f24252b = 1;
                    return e83Var.emit(num, userSessionViewModelDelegateImpl$special$$inlined$map$2$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
                }
                if (i11 == 1) {
                    AbstractC3193b.m15359b(obj5);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (continuation instanceof VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1) {
                    videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1 = (VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1) continuation;
                    int i12 = videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1.f31469b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1.f31469b = i12 - Integer.MIN_VALUE;
                    } else {
                        videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1 = new VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1 = new VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1(this, continuation);
                }
                Object obj6 = videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1.f31468a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1.f31469b;
                if (i13 == 0) {
                    AbstractC3193b.m15359b(obj6);
                    List list4 = ((yz4) obj).f70668b;
                    videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1.f31469b = 1;
                    return e83Var.emit(list4, videoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
                }
                if (i13 == 1) {
                    AbstractC3193b.m15359b(obj6);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (continuation instanceof VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1) {
                    videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1 = (VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1) continuation;
                    int i14 = videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1.f31474b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1.f31474b = i14 - Integer.MIN_VALUE;
                    } else {
                        videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1 = new VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1 = new VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1(this, continuation);
                }
                Object obj7 = videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1.f31473a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1.f31474b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC3193b.m15359b(obj7);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj7);
                List list5 = ((yz4) obj).f70668b;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    AbstractC3393o1.m17749x(((LessonSentence) it2.next()).f19256d, arrayList);
                }
                videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1.f31474b = 1;
                return e83Var.emit(arrayList, videoContentStateHolder$observeTimestamps$$inlined$map$1$2$1) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
            case 6:
                if (continuation instanceof VideoContentStateHolder$special$$inlined$map$1$2$1) {
                    videoContentStateHolder$special$$inlined$map$1$2$1 = (VideoContentStateHolder$special$$inlined$map$1$2$1) continuation;
                    int i16 = videoContentStateHolder$special$$inlined$map$1$2$1.f31500b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        videoContentStateHolder$special$$inlined$map$1$2$1.f31500b = i16 - Integer.MIN_VALUE;
                    } else {
                        videoContentStateHolder$special$$inlined$map$1$2$1 = new VideoContentStateHolder$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    videoContentStateHolder$special$$inlined$map$1$2$1 = new VideoContentStateHolder$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj8 = videoContentStateHolder$special$$inlined$map$1$2$1.f31499a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = videoContentStateHolder$special$$inlined$map$1$2$1.f31500b;
                if (i17 == 0) {
                    AbstractC3193b.m15359b(obj8);
                    List list6 = ((yz4) obj).f70668b;
                    videoContentStateHolder$special$$inlined$map$1$2$1.f31500b = 1;
                    return e83Var.emit(list6, videoContentStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
                }
                if (i17 == 1) {
                    AbstractC3193b.m15359b(obj8);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (continuation instanceof VideoContentStateHolder$special$$inlined$map$2$2$1) {
                    videoContentStateHolder$special$$inlined$map$2$2$1 = (VideoContentStateHolder$special$$inlined$map$2$2$1) continuation;
                    int i18 = videoContentStateHolder$special$$inlined$map$2$2$1.f31503b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        videoContentStateHolder$special$$inlined$map$2$2$1.f31503b = i18 - Integer.MIN_VALUE;
                    } else {
                        videoContentStateHolder$special$$inlined$map$2$2$1 = new VideoContentStateHolder$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    videoContentStateHolder$special$$inlined$map$2$2$1 = new VideoContentStateHolder$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj9 = videoContentStateHolder$special$$inlined$map$2$2$1.f31502a;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = videoContentStateHolder$special$$inlined$map$2$2$1.f31503b;
                if (i19 == 0) {
                    AbstractC3193b.m15359b(obj9);
                    Object obj10 = ((Pair) obj).f47623a;
                    videoContentStateHolder$special$$inlined$map$2$2$1.f31503b = 1;
                    return e83Var.emit(obj10, videoContentStateHolder$special$$inlined$map$2$2$1) == coroutineSingletons8 ? coroutineSingletons8 : xfaVar;
                }
                if (i19 == 1) {
                    AbstractC3193b.m15359b(obj9);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (continuation instanceof WorkSpecDaoKt$dedup$$inlined$map$1$2$1) {
                    workSpecDaoKt$dedup$$inlined$map$1$2$1 = (WorkSpecDaoKt$dedup$$inlined$map$1$2$1) continuation;
                    int i20 = workSpecDaoKt$dedup$$inlined$map$1$2$1.f7260b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        workSpecDaoKt$dedup$$inlined$map$1$2$1.f7260b = i20 - Integer.MIN_VALUE;
                    } else {
                        workSpecDaoKt$dedup$$inlined$map$1$2$1 = new WorkSpecDaoKt$dedup$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    workSpecDaoKt$dedup$$inlined$map$1$2$1 = new WorkSpecDaoKt$dedup$$inlined$map$1$2$1(this, continuation);
                }
                Object obj11 = workSpecDaoKt$dedup$$inlined$map$1$2$1.f7259a;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = workSpecDaoKt$dedup$$inlined$map$1$2$1.f7260b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC3193b.m15359b(obj11);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj11);
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((o8b) it3.next()).m17856a());
                }
                workSpecDaoKt$dedup$$inlined$map$1$2$1.f7260b = 1;
                return e83Var.emit(arrayList2, workSpecDaoKt$dedup$$inlined$map$1$2$1) == coroutineSingletons9 ? coroutineSingletons9 : xfaVar;
        }
    }

    public /* synthetic */ l5a(e83 e83Var, int i) {
        this.f49096a = i;
        this.f49097b = e83Var;
    }
}
