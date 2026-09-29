package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.aj3;
import p000.c32;
import p000.cl9;
import p000.fa4;
import p000.iy7;
import p000.ox7;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_phrasesTokens$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$_phrasesTokens$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ox7 f28638a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f28639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2411m f28640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$_phrasesTokens$1(C2411m c2411m, Continuation continuation) {
        super(3, continuation);
        this.f28640c = c2411m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderPageViewModel$_phrasesTokens$1 readerPageViewModel$_phrasesTokens$1 = new ReaderPageViewModel$_phrasesTokens$1(this.f28640c, (Continuation) obj3);
        readerPageViewModel$_phrasesTokens$1.f28638a = (ox7) obj;
        readerPageViewModel$_phrasesTokens$1.f28639b = (Map) obj2;
        return readerPageViewModel$_phrasesTokens$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection collectionM22615g1;
        List list;
        ox7 ox7Var = this.f28638a;
        Map map = this.f28639b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list2 = ox7Var.f55132e;
        ArrayList<LessonCard> arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((LessonCard) ((Map.Entry) it.next()).getValue());
        }
        C2411m c2411m = this.f28640c;
        Locale locale = c2411m.f29253u;
        ArrayList<xz7> arrayList2 = new ArrayList();
        for (LessonCard lessonCard : arrayList) {
            String str = lessonCard.f19178a;
            String str2 = lessonCard.f19178a;
            List listM15429h = new Regex("[ \\-]").m15429h(str);
            int i = 1;
            if (listM15429h.isEmpty()) {
                collectionM22615g1 = EmptyList.f47638a;
                break;
            }
            ListIterator listIterator = listM15429h.listIterator(listM15429h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM22615g1 = EmptyList.f47638a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + 1);
                    break;
                }
            }
            int i2 = 0;
            Object[] array = collectionM22615g1.toArray(new String[0]);
            ArrayList arrayList3 = new ArrayList(array.length);
            for (Object obj2 : array) {
                locale.getClass();
                arrayList3.add(vz1.m23610P((String) obj2, locale));
            }
            ArrayList arrayList4 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            int i4 = 0;
            while (i3 < list2.size()) {
                xz7 xz7Var = (xz7) list2.get(i3);
                String str3 = xz7Var.f69008e;
                locale.getClass();
                String strM23610P = vz1.m23610P(str3, locale);
                int i5 = i;
                if (i4 < arrayList3.size()) {
                    if (strM23610P.equalsIgnoreCase((String) arrayList3.get(i4))) {
                        arrayList4.add(xz7Var);
                        sb.append(strM23610P);
                        sb.append(" ");
                        i4++;
                    } else {
                        sb.delete(i2, sb.length());
                        arrayList4.clear();
                        i4 = i2;
                    }
                }
                String string = sb.toString();
                int length = string.length() - 1;
                int i6 = i2;
                int i7 = i6;
                while (true) {
                    if (i6 > length) {
                        list = list2;
                        break;
                    }
                    list = list2;
                    int i8 = fa4.m11651m(string.charAt(i7 == 0 ? i6 : length), 32) <= 0 ? i5 : 0;
                    if (i7 != 0) {
                        if (i8 == 0) {
                            break;
                        }
                        length--;
                    } else if (i8 == 0) {
                        i7 = i5;
                    } else {
                        i6++;
                    }
                    list2 = list;
                }
                if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), vz1.m23610P(cl9.m4839V(str2, "-", " "), locale))) {
                    arrayList2.add(new xz7(((xz7) u91.m22589G0(arrayList4)).f69004a, ((xz7) u91.m22597O0(arrayList4)).f69005b, 0, 0, vz1.m23610P(str2, locale), ((xz7) u91.m22589G0(arrayList4)).f69009f, 0, 0, (String) null, (TokenTransliteration) null, TextTokenType.PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 261068));
                    i2 = 0;
                    sb.delete(0, sb.length());
                    arrayList4.clear();
                    i4 = 0;
                } else {
                    i2 = 0;
                }
                i3++;
                i = i5;
                list2 = list;
            }
        }
        ArrayList<iy7> arrayList5 = new ArrayList();
        for (xz7 xz7Var2 : arrayList2) {
            if (xz7Var2.m24798b()) {
                arrayList5.add(new iy7(xz7Var2, arrayList5.size()));
            }
        }
        for (iy7 iy7Var : arrayList5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList6 = new ArrayList();
            ox7 ox7Var2 = (ox7) c2411m.f29254v.getValue();
            if (ox7Var2 != null) {
                for (xz7 xz7Var3 : ox7Var2.f55132e) {
                    if (c2411m.m9306a3(iy7Var.f44779a, xz7Var3)) {
                        linkedHashMap.put(xz7Var3.f69008e, xz7Var3);
                        arrayList6.add(xz7Var3);
                    }
                }
            }
            iy7Var.getClass();
            iy7Var.f44782d = arrayList6;
            iy7Var.f44781c = linkedHashMap;
        }
        return arrayList5;
    }
}
