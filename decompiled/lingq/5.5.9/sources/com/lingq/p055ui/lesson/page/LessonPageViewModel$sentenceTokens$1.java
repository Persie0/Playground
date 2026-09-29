package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import jm.C6525h;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.InterfaceC7117d;
import mo.C7661i;
import ni.C7793a;
import p159hi.C6052c;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lhi/c;", "", "", "cards", "phrases", "Lmj/a;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$sentenceTokens$1", m19206f = "LessonPageViewModel.kt", m19207l = {107}, m19208m = "invokeSuspend")
final class LessonPageViewModel$sentenceTokens$1 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super List<? extends C6052c>>, Map<String, ? extends C6052c>, Map<String, ? extends C6052c>, C7567a, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28639e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28640f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Map f28641g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Map f28642h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ C7567a f28643i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LessonPageViewModel f28644j;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$sentenceTokens$1$a */
    public static final class C4378a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(((C6052c) t10).f35735a, ((C6052c) t11).f35735a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$sentenceTokens$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$sentenceTokens$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f28644j = lessonPageViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super List<? extends C6052c>> interfaceC7117d, Map<String, ? extends C6052c> map, Map<String, ? extends C6052c> map2, C7567a c7567a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonPageViewModel$sentenceTokens$1 lessonPageViewModel$sentenceTokens$1 = new LessonPageViewModel$sentenceTokens$1(this.f28644j, interfaceC9968c);
        lessonPageViewModel$sentenceTokens$1.f28640f = interfaceC7117d;
        lessonPageViewModel$sentenceTokens$1.f28641g = map;
        lessonPageViewModel$sentenceTokens$1.f28642h = map2;
        lessonPageViewModel$sentenceTokens$1.f28643i = c7567a;
        return lessonPageViewModel$sentenceTokens$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        Collection collectionM13448p0;
        String str;
        Locale locale;
        C7567a c7567a;
        boolean z11;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f28639e;
        int i12 = 1;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28640f;
            Map map = this.f28641g;
            Map map2 = this.f28642h;
            C7567a c7567a2 = this.f28643i;
            LinkedHashMap linkedHashMapM13463P0 = C6753d.m13463P0(map, map2);
            ArrayList arrayList = new ArrayList(linkedHashMapM13463P0.size());
            Iterator it = linkedHashMapM13463P0.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((C6052c) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                String str2 = ((C6052c) next).f35735a;
                List<C7570d> list = c7567a2.f41703c;
                LessonPageViewModel lessonPageViewModel = this.f28644j;
                lessonPageViewModel.getClass();
                List listM14273d = new Regex("[ \\-]").m14273d(str2);
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
                    if ((((String) listIterator.previous()).length() == 0 ? i12 : 0) == 0) {
                        collectionM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + i12);
                        break;
                    }
                }
                Object[] array = collectionM13448p0.toArray(new String[0]);
                ArrayList arrayList3 = new ArrayList(array.length);
                int length = array.length;
                int i13 = 0;
                while (true) {
                    str = "locale";
                    locale = lessonPageViewModel.f28530L;
                    if (i13 >= length) {
                        break;
                    }
                    Iterator it3 = it2;
                    String str3 = (String) array[i13];
                    C5207g.m11110e(locale, "locale");
                    arrayList3.add(C7793a.m15502f(str3, locale));
                    i13++;
                    it2 = it3;
                }
                Iterator it4 = it2;
                ArrayList arrayList4 = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                C6525h it5 = C9000b.m17248n(list).iterator();
                int i14 = 0;
                while (true) {
                    if (!it5.f37168c) {
                        c7567a = c7567a2;
                        z11 = false;
                        break;
                    }
                    int iMo13105a = it5.mo13105a();
                    c7567a = c7567a2;
                    C7570d c7570d = list.get(iMo13105a);
                    C6525h c6525h = it5;
                    String str4 = c7570d.f41725e;
                    C5207g.m11110e(locale, str);
                    String strM15502f = C7793a.m15502f(str4, locale);
                    String str5 = str;
                    boolean z12 = i14 < arrayList3.size() && C7661i.m15249O2(strM15502f, (String) arrayList3.get(i14));
                    if (z12) {
                        arrayList4.add(c7570d);
                        sb2.append(strM15502f);
                        sb2.append(" ");
                        i14++;
                    }
                    if (z12) {
                        i10 = 1;
                        if (iMo13105a != list.size() - 1) {
                            list = list;
                        }
                        it5 = c6525h;
                        c7567a2 = c7567a;
                        str = str5;
                        arrayList3 = arrayList3;
                        list = list;
                    } else {
                        i10 = 1;
                    }
                    String string = sb2.toString();
                    C5207g.m11110e(string, "sequenceString.toString()");
                    int length2 = string.length() - i10;
                    boolean z13 = false;
                    int i15 = 0;
                    while (true) {
                        if (i15 > length2) {
                            list = list;
                            break;
                        }
                        list = list;
                        boolean z14 = C5207g.m11113h(string.charAt(!z13 ? i15 : length2), 32) <= 0;
                        if (z13) {
                            if (!z14) {
                                break;
                            }
                            length2--;
                        } else if (z14) {
                            i15++;
                        } else {
                            z13 = true;
                        }
                    }
                    if (C5207g.m11106a(string.subSequence(i15, length2 + 1).toString(), C7793a.m15502f(C7661i.m15254T2(str2, "-", " "), locale))) {
                        z11 = true;
                        break;
                    }
                    sb2.delete(0, sb2.length());
                    arrayList4.clear();
                    i14 = 0;
                    it5 = c6525h;
                    c7567a2 = c7567a;
                    str = str5;
                    arrayList3 = arrayList3;
                    list = list;
                }
                if (z11) {
                    arrayList2.add(next);
                }
                it2 = it4;
                c7567a2 = c7567a;
                i12 = 1;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList2) {
                C6052c c6052c = (C6052c) obj2;
                if (c6052c.f35740f < CardStatus.New.getValue()) {
                    z10 = false;
                } else if (c6052c.f35740f <= CardStatus.Familiar.getValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList5.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (hashSet.add(((C6052c) obj3).f35735a)) {
                    arrayList6.add(obj3);
                }
            }
            ArrayList arrayListM13454v0 = C6752c.m13454v0(arrayList6);
            if (arrayListM13454v0.size() > 1) {
                C9326n.m17682B(arrayListM13454v0, new C4378a());
            }
            List listM13453u0 = C6752c.m13453u0(arrayListM13454v0);
            this.f28640f = null;
            this.f28641g = null;
            this.f28642h = null;
            this.f28639e = 1;
            if (interfaceC7117d.mo1339r(listM13453u0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
