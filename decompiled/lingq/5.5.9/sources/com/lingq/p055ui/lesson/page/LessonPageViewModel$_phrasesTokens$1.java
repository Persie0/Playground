package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import jm.C6525h;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import ni.C7793a;
import p159hi.C6052c;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7568b;
import p265mj.C7570d;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, m13365d2 = {"Lmj/a;", "data", "", "", "Lhi/c;", "phrases", "", "Lmj/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$_phrasesTokens$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonPageViewModel$_phrasesTokens$1 extends SuspendLambda implements InterfaceC2057q<C7567a, Map<String, ? extends C6052c>, InterfaceC9968c<? super List<? extends C7568b>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C7567a f28587e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Map f28588f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonPageViewModel f28589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$_phrasesTokens$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$_phrasesTokens$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28589g = lessonPageViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(C7567a c7567a, Map<String, ? extends C6052c> map, InterfaceC9968c<? super List<? extends C7568b>> interfaceC9968c) {
        LessonPageViewModel$_phrasesTokens$1 lessonPageViewModel$_phrasesTokens$1 = new LessonPageViewModel$_phrasesTokens$1(this.f28589g, interfaceC9968c);
        lessonPageViewModel$_phrasesTokens$1.f28587e = c7567a;
        lessonPageViewModel$_phrasesTokens$1.f28588f = map;
        return lessonPageViewModel$_phrasesTokens$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<C7570d> list;
        Collection collectionM13448p0;
        Locale locale;
        int i10;
        List<C7570d> list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        C7567a c7567a = this.f28587e;
        Map map = this.f28588f;
        List<C7570d> list3 = c7567a.f41703c;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((C6052c) ((Map.Entry) it.next()).getValue());
        }
        LessonPageViewModel lessonPageViewModel = this.f28589g;
        lessonPageViewModel.getClass();
        ArrayList<C7570d> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6052c c6052c = (C6052c) it2.next();
            List listM14273d = new Regex("[ \\-]").m14273d(c6052c.f35735a);
            if (listM14273d.isEmpty()) {
                collectionM13448p0 = EmptyList.f38032a;
                break;
            }
            ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM13448p0 = EmptyList.f38032a;
                    break;
                }
                if (!(((String) listIterator.previous()).length() == 0)) {
                    collectionM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                    break;
                }
            }
            Object[] array = collectionM13448p0.toArray(new String[0]);
            ArrayList arrayList3 = new ArrayList(array.length);
            int length = array.length;
            int i11 = 0;
            while (true) {
                locale = lessonPageViewModel.f28530L;
                if (i11 >= length) {
                    break;
                }
                String str = (String) array[i11];
                C5207g.m11110e(locale, "locale");
                arrayList3.add(C7793a.m15502f(str, locale));
                i11++;
            }
            ArrayList arrayList4 = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            C6525h it3 = C9000b.m17248n(list3).iterator();
            int i12 = 0;
            while (it3.f37168c) {
                int iMo13105a = it3.mo13105a();
                C7570d c7570d = list3.get(iMo13105a);
                Iterator it4 = it2;
                String str2 = c7570d.f41725e;
                C5207g.m11110e(locale, "locale");
                String strM15502f = C7793a.m15502f(str2, locale);
                C6525h c6525h = it3;
                boolean z10 = i12 < arrayList3.size() && C7661i.m15249O2(strM15502f, (String) arrayList3.get(i12));
                if (z10) {
                    arrayList4.add(c7570d);
                    sb2.append(strM15502f);
                    sb2.append(" ");
                    i12++;
                }
                if (z10) {
                    i10 = 1;
                    if (iMo13105a != list3.size() - 1) {
                        list2 = list3;
                    }
                    it2 = it4;
                    it3 = c6525h;
                    list3 = list2;
                } else {
                    i10 = 1;
                }
                String string = sb2.toString();
                C5207g.m11110e(string, "sequenceString.toString()");
                int length2 = string.length() - i10;
                int i13 = 0;
                boolean z11 = false;
                while (true) {
                    if (i13 > length2) {
                        list2 = list3;
                        break;
                    }
                    list2 = list3;
                    boolean z12 = C5207g.m11113h(string.charAt(!z11 ? i13 : length2), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        length2--;
                    } else if (z12) {
                        i13++;
                    } else {
                        z11 = true;
                    }
                    list3 = list2;
                }
                String string2 = string.subSequence(i13, length2 + 1).toString();
                String str3 = c6052c.f35735a;
                if (C5207g.m11106a(string2, C7793a.m15502f(C7661i.m15254T2(str3, "-", " "), locale))) {
                    arrayList2.add(new C7570d(((C7570d) C6752c.m13423Q(arrayList4)).f41721a, ((C7570d) C6752c.m13432Z(arrayList4)).f41722b, 0, 0, C7793a.m15502f(str3, locale), ((C7570d) C6752c.m13423Q(arrayList4)).f41726f, 0, 0, null, null, TextTokenType.PHRASE, 0, 15308));
                }
                sb2.delete(0, sb2.length());
                arrayList4.clear();
                i12 = 0;
                it2 = it4;
                it3 = c6525h;
                list3 = list2;
            }
        }
        ArrayList<C7568b> arrayList5 = new ArrayList();
        for (C7570d c7570d2 : arrayList2) {
            String str4 = c7570d2.f41725e;
            if (C7076b.m14278X2(C7076b.m14277B3(str4).toString(), " ", false) || C7076b.m14278X2(C7076b.m14277B3(str4).toString(), "-", false)) {
                arrayList5.add(new C7568b(c7570d2, arrayList5.size()));
            }
        }
        for (C7568b c7568b : arrayList5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList6 = new ArrayList();
            C7567a c7567a2 = (C7567a) lessonPageViewModel.f28531M.getValue();
            if (c7567a2 != null && (list = c7567a2.f41703c) != null) {
                for (C7570d c7570d3 : list) {
                    if (lessonPageViewModel.m10201o2(c7568b.f41710a, c7570d3)) {
                        linkedHashMap.put(c7570d3.f41725e, c7570d3);
                        arrayList6.add(c7570d3);
                    }
                }
            }
            c7568b.getClass();
            c7568b.f41713d = arrayList6;
            c7568b.f41712c = linkedHashMap;
        }
        return arrayList5;
    }
}
