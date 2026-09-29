package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
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
import p000.C3386nv;
import p000.a84;
import p000.bj3;
import p000.c32;
import p000.cl9;
import p000.e83;
import p000.fa4;
import p000.h84;
import p000.ox7;
import p000.u91;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$_phrasesInPage$1", m4291f = "ReaderPageViewModel.kt", m4292l = {147}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$_phrasesInPage$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f28633a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28634b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ox7 f28635c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f28636d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2411m f28637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$_phrasesInPage$1(C2411m c2411m, Continuation continuation) {
        super(4, continuation);
        this.f28637e = c2411m;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ReaderPageViewModel$_phrasesInPage$1 readerPageViewModel$_phrasesInPage$1 = new ReaderPageViewModel$_phrasesInPage$1(this.f28637e, (Continuation) obj4);
        readerPageViewModel$_phrasesInPage$1.f28634b = (e83) obj;
        readerPageViewModel$_phrasesInPage$1.f28635c = (ox7) obj2;
        readerPageViewModel$_phrasesInPage$1.f28636d = (Map) obj3;
        return readerPageViewModel$_phrasesInPage$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection collectionM22615g1;
        int i;
        ArrayList arrayList;
        e83 e83Var = this.f28634b;
        ox7 ox7Var = this.f28635c;
        Map map = this.f28636d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f28633a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = ((LessonCard) entry.getValue()).f19178a;
                List list = ox7Var.f55132e;
                Locale locale = this.f28637e.f29253u;
                List listM15429h = new Regex("[ \\-]").m15429h(str);
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
                        collectionM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + i3);
                        break;
                    }
                }
                Object[] array = collectionM22615g1.toArray(new String[0]);
                ArrayList arrayList2 = new ArrayList(array.length);
                i3 = i3;
                for (Object obj2 : array) {
                    locale.getClass();
                    arrayList2.add(vz1.m23610P((String) obj2, locale));
                }
                ArrayList arrayList3 = new ArrayList();
                StringBuilder sb = new StringBuilder();
                Iterator it2 = vz1.m23601G(list).iterator();
                int i4 = 0;
                while (((h84) it2).f41941c) {
                    int iNextInt = ((a84) it2).nextInt();
                    ox7 ox7Var2 = ox7Var;
                    xz7 xz7Var = (xz7) list.get(iNextInt);
                    Iterator it3 = it;
                    String str2 = xz7Var.f69008e;
                    locale.getClass();
                    String strM23610P = vz1.m23610P(str2, locale);
                    Map.Entry entry2 = entry;
                    int i5 = (i4 >= arrayList2.size() || !strM23610P.equalsIgnoreCase((String) arrayList2.get(i4))) ? 0 : i3;
                    if (i5 != 0) {
                        arrayList3.add(xz7Var);
                        sb.append(strM23610P);
                        sb.append(" ");
                        i4++;
                    }
                    if (i5 == 0 || iNextInt == list.size() - 1) {
                        String string = sb.toString();
                        int length = string.length() - 1;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i = length;
                            if (i6 > length) {
                                arrayList = arrayList3;
                                break;
                            }
                            if (i7 == 0) {
                                length = i6;
                            }
                            arrayList = arrayList3;
                            int i8 = fa4.m11651m(string.charAt(length), 32) <= 0 ? i3 : 0;
                            if (i7 == 0) {
                                if (i8 == 0) {
                                    i7 = i3;
                                } else {
                                    i6++;
                                }
                                length = i;
                            } else {
                                if (i8 == 0) {
                                    break;
                                }
                                length = i - 1;
                            }
                            arrayList3 = arrayList;
                        }
                        if (fa4.m11650l(string.subSequence(i6, i + 1).toString(), vz1.m23610P(cl9.m4839V(str, "-", " "), locale))) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                            it = it3;
                            ox7Var = ox7Var2;
                            break;
                        }
                        sb.delete(0, sb.length());
                        arrayList.clear();
                        i4 = 0;
                    } else {
                        arrayList = arrayList3;
                    }
                    it = it3;
                    ox7Var = ox7Var2;
                    entry = entry2;
                    arrayList3 = arrayList;
                }
            }
            int i9 = i3;
            ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                arrayList4.add((LessonCard) ((Map.Entry) it4.next()).getValue());
            }
            this.f28634b = null;
            this.f28635c = null;
            this.f28636d = null;
            this.f28633a = i9;
            if (e83Var.emit(arrayList4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
