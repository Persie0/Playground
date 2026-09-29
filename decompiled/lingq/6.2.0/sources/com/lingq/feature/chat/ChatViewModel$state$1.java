package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.core.domain.model.chat.ChatMessageTranslation;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.chat.ChatPhraseCard;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.a7d;
import p000.c32;
import p000.cma;
import p000.d87;
import p000.e65;
import p000.fa4;
import p000.iv0;
import p000.jw0;
import p000.kv0;
import p000.kw0;
import p000.n54;
import p000.nn5;
import p000.nz9;
import p000.qn5;
import p000.tx0;
import p000.tz0;
import p000.u91;
import p000.ufd;
import p000.v91;
import p000.v94;
import p000.vz1;
import p000.xfa;
import p000.yx0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$state$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$state$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$state$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f25056b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$state$1 chatViewModel$state$1 = new ChatViewModel$state$1(this.f25056b, continuation);
        chatViewModel$state$1.f25055a = obj;
        return chatViewModel$state$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$state$1) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Object objPrevious;
        Object objPrevious2;
        ArrayList arrayListM22604V0;
        qn5 qn5Var;
        Object objPrevious3;
        String str3;
        List list;
        List list2;
        List list3;
        String str4;
        int i;
        Collection collection;
        v94 v94Var = (v94) this.f25055a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str5 = v94Var.f65073u;
        int i2 = v94Var.f65059g;
        Pair pair = v94Var.f65071s;
        Pair pair2 = v94Var.f65070r;
        Pair pair3 = v94Var.f65069q;
        Map map = v94Var.f65065m;
        Locale localeForLanguageTag = Locale.forLanguageTag(str5);
        String str6 = v94Var.f65073u;
        iv0 iv0Var = v94Var.f65057e;
        List list4 = iv0Var.f44629a;
        String str7 = iv0Var.f44642n;
        String str8 = iv0Var.f44635g;
        yx0 yx0Var = v94Var.f65058f;
        List list5 = v94Var.f65053a;
        List list6 = v94Var.f65054b;
        boolean z = v94Var.f65055c;
        boolean z2 = iv0Var.f44641m;
        int i3 = 1;
        boolean z3 = z2 || v94Var.f65056d;
        boolean z4 = str7 != null;
        ListIterator listIterator = list4.listIterator(list4.size());
        while (true) {
            boolean zHasPrevious = listIterator.hasPrevious();
            ListIterator listIterator2 = listIterator;
            str = "user";
            if (!zHasPrevious) {
                str2 = str7;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator2.previous();
            str2 = str7;
            if (fa4.m11650l(((ChatMessage) objPrevious).f18921b, "user")) {
                break;
            }
            listIterator = listIterator2;
            str7 = str2;
        }
        ChatMessage chatMessage = (ChatMessage) objPrevious;
        Integer num = chatMessage != null ? new Integer(chatMessage.f18920a) : null;
        Integer num2 = num != null ? new Integer(num.intValue() + 1) : null;
        ListIterator listIterator3 = list4.listIterator(list4.size());
        do {
            if (!listIterator3.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator3.previous();
        } while (!((ChatMessage) objPrevious2).m8014b());
        ChatMessage chatMessage2 = (ChatMessage) objPrevious2;
        Integer num3 = chatMessage2 != null ? new Integer(chatMessage2.f18920a) : null;
        List list7 = list4;
        Integer num4 = num3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list7.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            Object next = it2.next();
            Integer num5 = num2;
            ChatMessage chatMessage3 = (ChatMessage) next;
            yx0 yx0Var2 = yx0Var;
            int i4 = chatMessage3.f18920a;
            if (z4 && chatMessage3.m8014b() && num5 != null) {
                if (i4 == num5.intValue()) {
                    i = i3;
                }
                i3 = i;
                it = it2;
                num2 = num5;
                yx0Var = yx0Var2;
            }
            if (chatMessage3.m8014b() && num4 != null && i4 == num4.intValue()) {
                i = i3;
            } else {
                i = i3;
                if (i4 <= i || !chatMessage3.m8014b() || ((collection = (Collection) e65.m10872d(i4, map)) != null && !collection.isEmpty())) {
                }
                i3 = i;
                it = it2;
                num2 = num5;
                yx0Var = yx0Var2;
            }
            arrayList.add(next);
            i3 = i;
            it = it2;
            num2 = num5;
            yx0Var = yx0Var2;
        }
        yx0 yx0Var3 = yx0Var;
        cma cmaVar = this.f25056b.f25273M;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        int i5 = 0;
        while (true) {
            boolean zHasNext = it3.hasNext();
            List listM23604J = EmptyList.f47638a;
            if (!zHasNext) {
                iv0 iv0Var2 = iv0Var;
                String str9 = str;
                ArrayList arrayList3 = arrayList2;
                List list8 = list5;
                List list9 = list6;
                boolean z5 = z2;
                String str10 = str8;
                List list10 = list4;
                yx0 yx0Var4 = yx0Var3;
                boolean z6 = z;
                if (str2 != null) {
                    ListIterator listIterator4 = list10.listIterator(list10.size());
                    do {
                        if (!listIterator4.hasPrevious()) {
                            objPrevious3 = null;
                            break;
                        }
                        objPrevious3 = listIterator4.previous();
                    } while (!fa4.m11650l(((ChatMessage) objPrevious3).f18921b, str9));
                    ChatMessage chatMessage4 = (ChatMessage) objPrevious3;
                    Integer num6 = chatMessage4 != null ? new Integer(chatMessage4.f18920a) : null;
                    arrayListM22604V0 = u91.m22604V0(arrayList3, new jw0(new ChatMessage((num6 != null ? num6.intValue() : 0) + 1, 496, "tutor", "tutor", n54.m17228a(str2), (String) null, (String) null, (String) null, (List) null), null, null, null, null, null, null, null, null, false, true, false, str6, 5118));
                } else {
                    arrayListM22604V0 = arrayList3;
                }
                if (z5 && str2 == null) {
                    listM23604J = vz1.m23604J(kw0.f48490a);
                }
                ArrayList arrayListM22603U0 = u91.m22603U0(listM23604J, arrayListM22604V0);
                ChatStats chatStats = v94Var.f65060h;
                if (chatStats == null) {
                    chatStats = new ChatStats(0.0d, 0, 63);
                }
                ChatStats chatStats2 = chatStats;
                boolean z7 = iv0Var2.f44641m;
                ufd ufdVar = v94Var.f65061i;
                int i6 = v94Var.f65059g;
                boolean z8 = v94Var.f65064l;
                nz9 nz9Var = v94Var.f65072t;
                boolean z9 = v94Var.f65078z;
                tx0 tx0Var = new tx0(list8, list9, z6, z3, arrayListM22603U0, i6, chatStats2, z7, ufdVar, z8, nz9Var, z9, z9, v94Var.f65049M, v94Var.f65042F, v94Var.f65043G);
                a7d a7dVar = v94Var.f65075w;
                ChatMode chatMode = v94Var.f65044H;
                kv0 kv0Var = v94Var.f65045I;
                String str11 = v94Var.f65046J;
                if (v94Var.f65047K) {
                    nn5 nn5Var = v94Var.f65048L;
                    qn5Var = new qn5(nn5Var.f52997a, nn5Var.f52998b);
                } else {
                    qn5Var = null;
                }
                return new tz0(str6, str10, yx0Var4, tx0Var, a7dVar, chatMode, kv0Var, str11, qn5Var);
            }
            Object next2 = it3.next();
            int i7 = i5 + 1;
            if (i5 < 0) {
                vz1.m23628e0();
                throw null;
            }
            ChatMessage chatMessage5 = (ChatMessage) next2;
            String str12 = chatMessage5.f18921b;
            cma cmaVar2 = cmaVar;
            List list11 = chatMessage5.f18924e;
            String str13 = chatMessage5.f18925f;
            int i8 = chatMessage5.f18920a;
            boolean zM11650l = fa4.m11650l(str12, str);
            String str14 = str;
            String str15 = (String) e65.m10872d(i8, v94Var.f65039C);
            if (str15 == null || str15.length() == 0) {
                str15 = null;
            }
            if (str13.length() == 0) {
                str3 = str15;
                ChatMessageTranslation chatMessageTranslation = (ChatMessageTranslation) e65.m10872d(i8, v94Var.f65040D);
                if (chatMessageTranslation != null && (str4 = chatMessageTranslation.f18935c) != null) {
                    str13 = str4;
                }
            } else {
                str3 = str15;
            }
            String str16 = str13;
            List list12 = list11;
            if (list12.isEmpty()) {
                ChatMessagePhrases chatMessagePhrases = (ChatMessagePhrases) e65.m10872d(i8, v94Var.f65041E);
                if (chatMessagePhrases != null && (list3 = chatMessagePhrases.f18932c) != null) {
                    list11 = list3;
                }
                list12 = list11;
            }
            List list13 = list12;
            String str17 = str8;
            boolean z10 = str3 != null;
            String strM17228a = str3 == null ? n54.m17228a(chatMessage5.f18923d) : str3;
            List list14 = list13;
            ArrayList arrayList4 = arrayList2;
            List list15 = list5;
            ArrayList arrayList5 = new ArrayList(v91.m23189q0(list14, 10));
            Iterator it4 = list14.iterator();
            while (it4.hasNext()) {
                ChatPhrase chatPhrase = (ChatPhrase) it4.next();
                String str18 = chatPhrase.f18937a;
                Iterator it5 = it4;
                String str19 = chatPhrase.f18938b;
                localeForLanguageTag.getClass();
                List list16 = list6;
                LessonCard lessonCard = (LessonCard) v94Var.f65068p.get(vz1.m23610P(str18, localeForLanguageTag));
                ChatPhraseCard chatPhraseCard = lessonCard != null ? new ChatPhraseCard(0, lessonCard.f19188k, lessonCard.f19189l) : null;
                List listM23604J2 = chatPhrase.f18942f;
                if (listM23604J2.isEmpty()) {
                    if (str19.length() > 0) {
                        listM23604J2 = vz1.m23604J(new TokenMeaning(0, cmaVar2.mo4580K1(), chatPhrase.f18938b, 0, false, cmaVar2.mo4580K1(), false, 0, 953));
                    } else {
                        String str20 = (String) v94Var.f65038B.get(vz1.m23610P(str18, localeForLanguageTag));
                        listM23604J2 = str20 != null ? vz1.m23604J(new TokenMeaning(0, cmaVar2.mo4580K1(), str20, 0, false, cmaVar2.mo4580K1(), false, 0, 953)) : listM23604J;
                    }
                }
                List list17 = listM23604J2;
                int i9 = chatPhrase.f18939c;
                String str21 = chatPhrase.f18940d;
                str18.getClass();
                str19.getClass();
                str21.getClass();
                arrayList5.add(new ChatPhrase(str18, str19, i9, str21, chatPhraseCard, list17));
                it4 = it5;
                list6 = list16;
                i5 = i5;
                i2 = i2;
            }
            int i10 = i2;
            int i11 = i5;
            List list18 = list6;
            int i12 = chatMessage5.f18920a;
            String str22 = chatMessage5.f18921b;
            String str23 = chatMessage5.f18922c;
            String str24 = chatMessage5.f18926g;
            String str25 = chatMessage5.f18927h;
            boolean z11 = chatMessage5.f18928i;
            str22.getClass();
            str23.getClass();
            str24.getClass();
            str25.getClass();
            ChatMessage chatMessage6 = new ChatMessage(i12, str22, str23, strM17228a, arrayList5, str16, str24, str25, z11);
            List list19 = (zM11650l || (list = (List) e65.m10872d(i8, map)) == null) ? listM23604J : list;
            List list20 = (zM11650l || (list2 = (List) e65.m10872d(i8, v94Var.f65066n)) == null) ? listM23604J : list2;
            d87 d87Var = i8 == ((Number) pair3.f47623a).intValue() ? (d87) pair3.f47624b : null;
            Integer num7 = i8 == ((Number) pair2.f47623a).intValue() ? (Integer) pair2.f47624b : null;
            Integer num8 = i8 == ((Number) pair.f47623a).intValue() ? (Integer) pair.f47624b : null;
            TranslationState translationState = (TranslationState) e65.m10872d(i8, iv0Var.f44639k);
            if (translationState == null) {
                translationState = (zM11650l || !v94Var.f65052P.f65661b) ? TranslationState.Hidden : TranslationState.Showing;
            }
            TranslationState translationState2 = translationState;
            PhrasesState phrasesState = (PhrasesState) e65.m10872d(i8, iv0Var.f44640l);
            if (phrasesState == null) {
                phrasesState = PhrasesState.Hidden;
            }
            Locale locale = localeForLanguageTag;
            d87 d87Var2 = d87Var;
            Map map2 = (Map) e65.m10872d(i10, v94Var.f65050N);
            Pair pair4 = pair;
            iv0 iv0Var3 = iv0Var;
            arrayList4.add(new jw0(chatMessage6, list19, list20, d87Var2, num7, num8, translationState2, phrasesState, map2 != null ? (ChatMessageRating) e65.m10872d(i8, map2) : null, v94Var.f65051O.contains(new Pair(new Integer(i10), new Integer(i8))), v94Var.f65063k && str2 == null && i11 == vz1.m23602H(list4) && chatMessage5.m8014b(), z10, str6, 2048));
            arrayList2 = arrayList4;
            iv0Var = iv0Var3;
            str = str14;
            list4 = list4;
            i5 = i7;
            z = z;
            cmaVar = cmaVar2;
            z2 = z2;
            str8 = str17;
            localeForLanguageTag = locale;
            yx0Var3 = yx0Var3;
            pair = pair4;
            list5 = list15;
            list6 = list18;
            i2 = i10;
        }
    }
}
