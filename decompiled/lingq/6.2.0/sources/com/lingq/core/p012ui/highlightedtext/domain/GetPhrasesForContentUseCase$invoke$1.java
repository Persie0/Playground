package com.lingq.core.p012ui.highlightedtext.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TextTokenType;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.text.Regex;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cy9;
import p000.d87;
import p000.e83;
import p000.tm3;
import p000.u91;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.domain.GetPhrasesForContentUseCase$invoke$1", m4291f = "GetPhrasesForContentUseCase.kt", m4292l = {DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPhrasesForContentUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24145a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24146b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f24147c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f24148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Locale f24149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPhrasesForContentUseCase$invoke$1(Map map, Locale locale, Continuation continuation) {
        super(3, continuation);
        this.f24148d = map;
        this.f24149e = locale;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPhrasesForContentUseCase$invoke$1 getPhrasesForContentUseCase$invoke$1 = new GetPhrasesForContentUseCase$invoke$1(this.f24148d, this.f24149e, (Continuation) obj3);
        getPhrasesForContentUseCase$invoke$1.f24146b = (e83) obj;
        getPhrasesForContentUseCase$invoke$1.f24147c = (Map) obj2;
        return getPhrasesForContentUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i;
        String str2;
        e83 e83Var = this.f24146b;
        Map map = this.f24147c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f24145a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Map map2 = this.f24148d;
            List listM22622n1 = u91.m22622n1(map2.keySet());
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(listM22622n1, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            Iterator it = listM22622n1.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer num = new Integer(number.intValue());
                int iIntValue = number.intValue();
                Locale locale = this.f24149e;
                locale.getClass();
                cy9 cy9Var = (cy9) map2.get(new Integer(iIntValue));
                Iterable<xz7> iterable = cy9Var != null ? cy9Var.f34713b : EmptyList.f47638a;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add((LessonCard) ((Map.Entry) it2.next()).getValue());
                }
                Regex regex = tm3.f62525a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    LessonCard lessonCard = (LessonCard) it3.next();
                    List listM15429h = new Regex("[ \\-]").m15429h(lessonCard.f19178a);
                    Map map3 = map2;
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(listM15429h, 10));
                    Iterator it4 = listM15429h.iterator();
                    while (true) {
                        str = "";
                        if (!it4.hasNext()) {
                            break;
                        }
                        arrayList3.add(vk9.m23376L0(tm3.f62525a.m15428g(vz1.m23610P((String) it4.next(), locale), "")).toString());
                        it4 = it4;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (((String) obj2).length() > 0) {
                            arrayList4.add(obj2);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList();
                        Integer numValueOf = null;
                        int i3 = 0;
                        for (xz7 xz7Var : iterable) {
                            Iterator it5 = it;
                            String str3 = xz7Var.f69008e;
                            Iterable iterable2 = iterable;
                            int i4 = xz7Var.f69010g;
                            Iterator it6 = it3;
                            String string = vk9.m23376L0(tm3.f62525a.m15428g(vz1.m23610P(str3, locale), str)).toString();
                            if (numValueOf == null || i4 == numValueOf.intValue()) {
                                i = i3;
                            } else {
                                arrayList5.clear();
                                i = 0;
                            }
                            numValueOf = Integer.valueOf(i4);
                            if (string.length() > 0) {
                                str2 = str;
                                if (xz7Var.f69014k != TextTokenType.PUNCT) {
                                    if (string.equals(arrayList4.get(i))) {
                                        arrayList5.add(xz7Var);
                                        i++;
                                    } else {
                                        arrayList5.clear();
                                        if (string.equals(arrayList4.get(0))) {
                                            arrayList5.add(xz7Var);
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                    }
                                    if (i == arrayList4.size()) {
                                        arrayList2.add(new d87(((xz7) u91.m22589G0(arrayList5)).f69009f, ((xz7) u91.m22589G0(arrayList5)).f69004a, ((xz7) u91.m22597O0(arrayList5)).f69005b, vz1.m23610P(lessonCard.f19178a, locale), u91.m22622n1(arrayList5), lessonCard.f19188k, lessonCard.f19189l, false));
                                        arrayList5.clear();
                                        i = 0;
                                    }
                                }
                            } else {
                                str2 = str;
                            }
                            str = str2;
                            it = it5;
                            iterable = iterable2;
                            i3 = i;
                            it3 = it6;
                        }
                    }
                    map2 = map3;
                    it = it;
                    iterable = iterable;
                    it3 = it3;
                }
                linkedHashMap.put(num, arrayList2);
            }
            Pair pair = new Pair(linkedHashMap, map);
            this.f24146b = null;
            this.f24147c = null;
            this.f24145a = 1;
            if (e83Var.emit(pair, this) == coroutineSingletons) {
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
