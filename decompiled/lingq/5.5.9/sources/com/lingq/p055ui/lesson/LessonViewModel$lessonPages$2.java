package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenTransliteration;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.lingq.util.ImageSize;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import p096ei.C5408a;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "", "Lmj/a;", "pages", "Lcom/lingq/ui/lesson/d$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$lessonPages$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$lessonPages$2 extends SuspendLambda implements InterfaceC2057q<LessonStudy, List<? extends C7567a>, InterfaceC9968c<? super List<? extends C4270d.a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ LessonStudy f27693e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f27694f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$lessonPages$2(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$lessonPages$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f27695g = lessonViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(LessonStudy lessonStudy, List<? extends C7567a> list, InterfaceC9968c<? super List<? extends C4270d.a>> interfaceC9968c) {
        LessonViewModel$lessonPages$2 lessonViewModel$lessonPages$2 = new LessonViewModel$lessonPages$2(this.f27695g, interfaceC9968c);
        lessonViewModel$lessonPages$2.f27693e = lessonStudy;
        lessonViewModel$lessonPages$2.f27694f = list;
        return lessonViewModel$lessonPages$2.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015f A[ADDED_TO_REGION, REMOVE] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        LessonViewModel lessonViewModel;
        String str2;
        TokenTransliteration tokenTransliteration;
        TokenTransliteration tokenTransliteration2;
        TokenTransliteration tokenTransliteration3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LessonStudy lessonStudy = this.f27693e;
        List<C7567a> list = this.f27694f;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (C7567a c7567a : list) {
            Iterator<T> it = c7567a.f41703c.iterator();
            while (true) {
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = "";
                    lessonViewModel = this.f27695g;
                    if (!zHasNext) {
                        break;
                    }
                    C7570d c7570d = (C7570d) it.next();
                    if (C5408a.m11571d(lessonViewModel.mo498E1())) {
                        String strMo498E1 = lessonViewModel.mo498E1();
                        if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Mandarin))) {
                            String str3 = (String) lessonViewModel.f27507s0.getValue();
                            if (C5207g.m11106a(str3, "Pinyin")) {
                                TokenTransliteration tokenTransliteration4 = c7570d.f41730j;
                                if (tokenTransliteration4 != null) {
                                    str2 = tokenTransliteration4.f31394c;
                                    if (str2 == null) {
                                    }
                                }
                                str2 = str;
                            } else if (!C5207g.m11106a(str3, "Traditional") || (tokenTransliteration3 = c7570d.f41730j) == null || (str2 = tokenTransliteration3.f31395d) == null) {
                                str2 = str;
                            }
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                            String str4 = (String) lessonViewModel.f27509t0.getValue();
                            if (C5207g.m11106a(str4, "Pinyin")) {
                                TokenTransliteration tokenTransliteration5 = c7570d.f41730j;
                                if (tokenTransliteration5 == null || (str2 = tokenTransliteration5.f31394c) == null) {
                                    str2 = str;
                                }
                            } else if (!C5207g.m11106a(str4, "Simplified") || (tokenTransliteration2 = c7570d.f41730j) == null || (str2 = tokenTransliteration2.f31396e) == null) {
                                str2 = str;
                            }
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Japanese))) {
                            String str5 = (String) lessonViewModel.f27511u0.getValue();
                            if (C5207g.m11106a(str5, "Romaji")) {
                                TokenTransliteration tokenTransliteration6 = c7570d.f41730j;
                                if (tokenTransliteration6 == null || (str2 = tokenTransliteration6.f31393b) == null) {
                                    str2 = str;
                                }
                            } else if (!C5207g.m11106a(str5, "Hiragana") || (tokenTransliteration = c7570d.f41730j) == null || (str2 = tokenTransliteration.f31392a) == null) {
                                str2 = str;
                            }
                        } else if (C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                            String str6 = (String) lessonViewModel.f27513v0.getValue();
                            if (C5207g.m11106a(str6, "Jyutping")) {
                                TokenTransliteration tokenTransliteration7 = c7570d.f41730j;
                                if (tokenTransliteration7 != null) {
                                    str2 = tokenTransliteration7.f31397f;
                                    if (str2 == null) {
                                    }
                                }
                                str2 = str;
                            } else {
                                if (C5207g.m11106a(str6, "Simplified")) {
                                    TokenTransliteration tokenTransliteration8 = c7570d.f41730j;
                                    if (tokenTransliteration8 != null) {
                                        str2 = tokenTransliteration8.f31396e;
                                        if (str2 == null) {
                                        }
                                    }
                                }
                                str2 = str;
                            }
                        } else {
                            str2 = str;
                        }
                        if (!(!C7661i.m15249O2(str2, c7570d.f41725e))) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                        c7570d.f41729i = str;
                    }
                }
            }
            String str7 = lessonStudy.f21816b;
            String str8 = lessonStudy.f21823i;
            arrayList.add(new C4270d.a(c7567a, str7, str8 == null ? str : str8, C4924a.m10423B(lessonStudy.f21818d, lessonStudy.f21819e, ImageSize.Medium), lessonViewModel.m10151x2(), lessonStudy.f21815a));
        }
        return arrayList;
    }
}
