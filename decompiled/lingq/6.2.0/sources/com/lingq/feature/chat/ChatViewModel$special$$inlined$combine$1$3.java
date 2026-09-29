package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cy9;
import p000.e65;
import p000.e83;
import p000.iv0;
import p000.v91;
import p000.v94;
import p000.wbd;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$special$$inlined$combine$1$3", m4291f = "ChatViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class ChatViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f25019a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f25020b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f25021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2009m f25022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$combine$1$3(C2009m c2009m, Continuation continuation) {
        super(3, continuation);
        this.f25022d = c2009m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatViewModel$special$$inlined$combine$1$3 chatViewModel$special$$inlined$combine$1$3 = new ChatViewModel$special$$inlined$combine$1$3(this.f25022d, (Continuation) obj3);
        chatViewModel$special$$inlined$combine$1$3.f25020b = (e83) obj;
        chatViewModel$special$$inlined$combine$1$3.f25021c = (Object[]) obj2;
        return chatViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x01db  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapM15370W;
        Pair pair;
        Map mapM15370W2;
        Pair pair2;
        Map mapM15370W3;
        Pair pair3;
        Map mapM15370W4;
        Pair pair4;
        Map mapM15370W5;
        Pair pair5;
        e83 e83Var = this.f25020b;
        Object[] objArr = this.f25021c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25019a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Object obj2 = objArr[0];
        obj2.getClass();
        List list = ((iv0) obj2).f44629a;
        Object obj3 = objArr[1];
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = objArr[2];
        obj4.getClass();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        Object obj5 = objArr[3];
        Map map = obj5 instanceof Map ? (Map) obj5 : null;
        if (map == null) {
            mapM15370W = AbstractC3194a.m15360M();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!(key instanceof Integer)) {
                    key = null;
                }
                Integer num = (Integer) key;
                if (num != null) {
                    if (!(value instanceof cy9)) {
                        value = null;
                    }
                    cy9 cy9Var = (cy9) value;
                    if (cy9Var == null) {
                        pair = null;
                    } else {
                        pair = new Pair(num, cy9Var);
                    }
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            mapM15370W = AbstractC3194a.m15370W(arrayList);
        }
        Object obj6 = objArr[4];
        Map map2 = obj6 instanceof Map ? (Map) obj6 : null;
        if (map2 == null) {
            mapM15370W2 = AbstractC3194a.m15360M();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (!(key2 instanceof String)) {
                    key2 = null;
                }
                String str2 = (String) key2;
                if (str2 != null) {
                    if (!(value2 instanceof LessonCard)) {
                        value2 = null;
                    }
                    LessonCard lessonCard = (LessonCard) value2;
                    if (lessonCard == null) {
                        pair2 = null;
                    } else {
                        pair2 = new Pair(str2, lessonCard);
                    }
                } else {
                    pair2 = null;
                }
                if (pair2 != null) {
                    arrayList2.add(pair2);
                }
            }
            mapM15370W2 = AbstractC3194a.m15370W(arrayList2);
        }
        Object obj7 = objArr[5];
        Map map3 = obj7 instanceof Map ? (Map) obj7 : null;
        if (map3 == null) {
            mapM15370W3 = AbstractC3194a.m15360M();
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : map3.entrySet()) {
                Object key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (!(key3 instanceof String)) {
                    key3 = null;
                }
                String str3 = (String) key3;
                if (str3 != null) {
                    if (!(value3 instanceof LessonWord)) {
                        value3 = null;
                    }
                    LessonWord lessonWord = (LessonWord) value3;
                    if (lessonWord == null) {
                        pair3 = null;
                    } else {
                        pair3 = new Pair(str3, lessonWord);
                    }
                } else {
                    pair3 = null;
                }
                if (pair3 != null) {
                    arrayList3.add(pair3);
                }
            }
            mapM15370W3 = AbstractC3194a.m15370W(arrayList3);
        }
        Object obj8 = objArr[6];
        Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
        if (map4 == null) {
            mapM15370W4 = AbstractC3194a.m15360M();
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : map4.entrySet()) {
                Object key4 = entry4.getKey();
                Object value4 = entry4.getValue();
                if (!(key4 instanceof String)) {
                    key4 = null;
                }
                String str4 = (String) key4;
                if (str4 != null) {
                    if (!(value4 instanceof LessonCard)) {
                        value4 = null;
                    }
                    LessonCard lessonCard2 = (LessonCard) value4;
                    if (lessonCard2 == null) {
                        pair4 = null;
                    } else {
                        pair4 = new Pair(str4, lessonCard2);
                    }
                } else {
                    pair4 = null;
                }
                if (pair4 != null) {
                    arrayList4.add(pair4);
                }
            }
            mapM15370W4 = AbstractC3194a.m15370W(arrayList4);
        }
        Map map5 = mapM15370W4;
        Object obj9 = objArr[7];
        Map map6 = obj9 instanceof Map ? (Map) obj9 : null;
        if (map6 == null) {
            mapM15370W5 = AbstractC3194a.m15360M();
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Map.Entry entry5 : map6.entrySet()) {
                Object key5 = entry5.getKey();
                Object value5 = entry5.getValue();
                if (!(key5 instanceof String)) {
                    key5 = null;
                }
                String str5 = (String) key5;
                if (str5 != null) {
                    if (!(value5 instanceof LessonCard)) {
                        value5 = null;
                    }
                    LessonCard lessonCard3 = (LessonCard) value5;
                    if (lessonCard3 == null) {
                        pair5 = null;
                    } else {
                        pair5 = new Pair(str5, lessonCard3);
                    }
                } else {
                    pair5 = null;
                }
                if (pair5 != null) {
                    arrayList5.add(pair5);
                }
            }
            mapM15370W5 = AbstractC3194a.m15370W(arrayList5);
        }
        Map map7 = mapM15370W5;
        Locale localeForLanguageTag = str.length() > 0 ? Locale.forLanguageTag(str) : Locale.getDefault();
        List<ChatMessage> list2 = list;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (ChatMessage chatMessage : list2) {
            Integer num2 = new Integer(chatMessage.f18920a);
            cy9 cy9Var2 = (cy9) e65.m10872d(chatMessage.f18920a, mapM15370W);
            List list3 = cy9Var2 != null ? cy9Var2.f34713b : EmptyList.f47638a;
            localeForLanguageTag.getClass();
            linkedHashMap.put(num2, wbd.m23841b(wbd.m23840a(list3, mapM15370W2, mapM15370W3, localeForLanguageTag, zBooleanValue)));
        }
        C3244l c3244l = this.f25022d.f25281U;
        while (true) {
            Object value6 = c3244l.getValue();
            v94 v94Var = (v94) value6;
            int iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
            if (iM15363P2 < 16) {
                iM15363P2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM15363P2);
            for (ChatMessage chatMessage2 : list2) {
                Integer num3 = new Integer(chatMessage2.f18920a);
                cy9 cy9Var3 = (cy9) e65.m10872d(chatMessage2.f18920a, mapM15370W);
                linkedHashMap2.put(num3, cy9Var3 != null ? cy9Var3.f34712a : chatMessage2.f18923d);
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            if (c3244l.m15570h(value6, v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, linkedHashMap3, null, map5, map7, null, null, null, null, null, null, null, null, false, null, null, linkedHashMap2, null, null, false, false, null, null, null, false, null, false, null, null, null, -268488705, 1023))) {
                break;
            }
            linkedHashMap = linkedHashMap3;
        }
        this.f25020b = null;
        this.f25021c = null;
        this.f25019a = 1;
        return e83Var.emit(xfaVar, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
