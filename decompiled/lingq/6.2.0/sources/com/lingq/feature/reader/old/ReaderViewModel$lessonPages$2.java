package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.token.TokenFurigana;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.ImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.aj3;
import p000.c27;
import p000.c32;
import p000.cl9;
import p000.cma;
import p000.fa4;
import p000.jfa;
import p000.ox7;
import p000.v91;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$lessonPages$2", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$lessonPages$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Lesson f28979a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f28980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$lessonPages$2(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f28981c = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$lessonPages$2 readerViewModel$lessonPages$2 = new ReaderViewModel$lessonPages$2(this.f28981c, (Continuation) obj3);
        readerViewModel$lessonPages$2.f28979a = (Lesson) obj;
        readerViewModel$lessonPages$2.f28980b = (List) obj2;
        return readerViewModel$lessonPages$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n;
        TokenTransliteration tokenTransliteration;
        String strM4839V;
        TokenTransliteration tokenTransliteration2;
        TokenTransliteration tokenTransliteration3;
        TokenTransliteration tokenTransliteration4;
        TokenTransliteration tokenTransliteration5;
        String str;
        TokenTransliteration tokenTransliteration6;
        TokenFurigana tokenFurigana;
        TokenTransliteration tokenTransliteration7;
        TokenTransliteration tokenTransliteration8;
        TokenTransliteration tokenTransliteration9;
        TokenTransliteration tokenTransliteration10;
        Lesson lesson = this.f28979a;
        List list = this.f28980b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<ox7> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (ox7 ox7Var : list2) {
            Iterator it = ox7Var.f55132e.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2412n = this.f28981c;
                if (!zHasNext) {
                    break;
                }
                xz7 xz7Var = (xz7) it.next();
                cma cmaVar = c2412n.f29340b;
                if (AbstractC3184kh.m15231z(cmaVar.mo4589b2())) {
                    String strMo4589b2 = cmaVar.mo4589b2();
                    if (fa4.m11650l(strMo4589b2, LanguageLearn.Mandarin.getCode())) {
                        String str2 = (String) ((C3244l) c2412n.f29361g0.f9311a).getValue();
                        if (!fa4.m11650l(str2, "Pinyin") ? !fa4.m11650l(str2, "Traditional") || (tokenTransliteration9 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration9.f19622d) == null : (tokenTransliteration10 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration10.f19621c) == null) {
                            strM4839V = "";
                        }
                    } else if (fa4.m11650l(strMo4589b2, LanguageLearn.ChineseTraditional.getCode())) {
                        String str3 = (String) ((C3244l) c2412n.f29365h0.f9311a).getValue();
                        if (!fa4.m11650l(str3, "Pinyin") ? !fa4.m11650l(str3, "Simplified") || (tokenTransliteration7 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration7.f19623e) == null : (tokenTransliteration8 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration8.f19621c) == null) {
                            strM4839V = "";
                        }
                    } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Japanese.getCode())) {
                        String str4 = (String) ((C3244l) c2412n.f29369i0.f9311a).getValue();
                        int iHashCode = str4.hashCode();
                        if (iHashCode != -1841522256) {
                            if (iHashCode != -1311598819) {
                                if (iHashCode == 1565245555 && str4.equals("Furigana") && (tokenTransliteration6 = xz7Var.f69013j) != null && (tokenFurigana = tokenTransliteration6.f19625g) != null) {
                                    String str5 = tokenFurigana.f19592a;
                                    String str6 = tokenFurigana.f19593b;
                                    if (str5 == null || str6 == null) {
                                        strM4839V = "";
                                    } else {
                                        strM4839V = AbstractC3393o1.m17735j(str5, "***", str6);
                                    }
                                } else {
                                    strM4839V = "";
                                }
                            } else if (!str4.equals("Hiragana") || (tokenTransliteration5 = xz7Var.f69013j) == null || (str = tokenTransliteration5.f19619a) == null) {
                                strM4839V = "";
                            } else {
                                strM4839V = cl9.m4839V(str, " ", "");
                            }
                        } else if (!str4.equals("Romaji") || (tokenTransliteration4 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration4.f19620b) == null) {
                            strM4839V = "";
                        }
                    } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Cantonese.getCode())) {
                        String str7 = (String) ((C3244l) c2412n.f29373j0.f9311a).getValue();
                        if (!fa4.m11650l(str7, "Jyutping") ? !fa4.m11650l(str7, "Simplified") || (tokenTransliteration2 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration2.f19623e) == null : (tokenTransliteration3 = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration3.f19624f) == null) {
                            strM4839V = "";
                        }
                    } else if (!AbstractC3184kh.m15230y(cmaVar.mo4589b2()) || !fa4.m11650l(((C3244l) c2412n.f29377k0.f9311a).getValue(), "Latin") || (tokenTransliteration = xz7Var.f69013j) == null || (strM4839V = tokenTransliteration.f19626h) == null) {
                        strM4839V = "";
                    }
                    if (strM4839V.equalsIgnoreCase(xz7Var.f69008e)) {
                        strM4839V = null;
                    }
                    xz7Var.f69012i = strM4839V != null ? strM4839V : "";
                }
            }
            String str8 = "";
            String str9 = lesson.f19143b;
            String str10 = lesson.f19150i;
            if (str10 != null) {
                str8 = str10;
            }
            arrayList.add(new c27(ox7Var, str9, str8, jfa.m14422e(lesson.f19145d, lesson.f19146e, ImageSize.Medium), c2412n.m9331k3(), lesson.f19142a));
        }
        return arrayList;
    }
}
