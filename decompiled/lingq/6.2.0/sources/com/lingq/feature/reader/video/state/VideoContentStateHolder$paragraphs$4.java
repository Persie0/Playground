package com.lingq.feature.reader.video.state;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.review.ReviewType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.afd;
import p000.c32;
import p000.cj3;
import p000.e37;
import p000.lw8;
import p000.lx8;
import p000.u91;
import p000.upa;
import p000.v91;
import p000.vpa;
import p000.vz1;
import p000.wbd;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$paragraphs$4", m4291f = "VideoContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$paragraphs$4 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ upa f31488a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ vpa f31489b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f31490c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f31491d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2595a f31492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$paragraphs$4(C2595a c2595a, Continuation continuation) {
        super(5, continuation);
        this.f31492e = c2595a;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        VideoContentStateHolder$paragraphs$4 videoContentStateHolder$paragraphs$4 = new VideoContentStateHolder$paragraphs$4(this.f31492e, (Continuation) obj5);
        videoContentStateHolder$paragraphs$4.f31488a = (upa) obj;
        videoContentStateHolder$paragraphs$4.f31489b = (vpa) obj2;
        videoContentStateHolder$paragraphs$4.f31490c = (Map) obj3;
        videoContentStateHolder$paragraphs$4.f31491d = zBooleanValue;
        return videoContentStateHolder$paragraphs$4.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:108:0x0210  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map;
        ArrayList arrayList;
        Float f;
        Float f2;
        Double dValueOf;
        List list;
        Float f3;
        double d;
        double dDoubleValue;
        double d2;
        double d3;
        Integer numValueOf;
        Integer numValueOf2;
        Set setM22627s1;
        ReviewType reviewType;
        Double d4;
        Double d5;
        upa upaVar = this.f31488a;
        vpa vpaVar = this.f31489b;
        Map map2 = this.f31490c;
        boolean z = this.f31491d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list2 = upaVar.f64195a;
        List list3 = upaVar.f64196b;
        if (!list2.isEmpty() && !list3.isEmpty()) {
            List list4 = upaVar.f64195a;
            List list5 = upaVar.f64197c;
            Map map3 = vpaVar.f65769a;
            Map map4 = vpaVar.f65770b;
            Map map5 = vpaVar.f65771c;
            Locale localeM9521c = this.f31492e.m9521c();
            if (!list4.isEmpty()) {
                List list6 = list5;
                int i = 10;
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list6, 10));
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
                for (Object obj2 : list6) {
                    linkedHashMap.put(Integer.valueOf(((LessonTranslationSentence) obj2).f19292a), obj2);
                }
                List list7 = list3;
                int iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(list7, 10));
                if (iM15363P2 < 16) {
                    iM15363P2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM15363P2);
                for (Object obj3 : list7) {
                    linkedHashMap2.put(Integer.valueOf(((LessonSentence) obj3).f19256d), obj3);
                }
                List list8 = list4;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list8, 10));
                Iterator it = list8.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    lx8 lx8Var = (lx8) next;
                    if (map2.isEmpty()) {
                        map = map2;
                        arrayList = lx8Var.f50257c;
                    } else {
                        ArrayList<xz7> arrayList3 = lx8Var.f50257c;
                        arrayList = new ArrayList(v91.m23189q0(arrayList3, i));
                        for (xz7 xz7VarM24797a : arrayList3) {
                            Map map6 = (Map) map2.get(Integer.valueOf(xz7VarM24797a.f69009f));
                            if (map6 != null) {
                                xz7VarM24797a = xz7.m24797a(xz7VarM24797a, 0, 0, 0, 0, 0, AbstractC3194a.m15367T(xz7VarM24797a.f69017n, map6), null, 245759);
                            }
                            arrayList.add(xz7VarM24797a);
                            map2 = map2;
                        }
                        map = map2;
                    }
                    LessonSentence lessonSentence = lx8Var.f50258d;
                    String str = lx8Var.f50256b;
                    int i4 = lessonSentence.f19256d;
                    List list9 = lessonSentence.f19257e;
                    LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) linkedHashMap.get(Integer.valueOf(i4));
                    Iterator it2 = it;
                    double dFloatValue = (lessonTranslationSentence == null || (d5 = lessonTranslationSentence.f19294c) == null) ? (list9 == null || (f = (Float) u91.m22592J0(0, list9)) == null) ? 0.0d : f.floatValue() : d5.doubleValue();
                    int i5 = i4 + 1;
                    double dFloatValue2 = (lessonTranslationSentence == null || (d4 = lessonTranslationSentence.f19295d) == null) ? (list9 == null || (f2 = (Float) u91.m22592J0(1, list9)) == null) ? 0.0d : f2.floatValue() : d4.doubleValue();
                    LessonTranslationSentence lessonTranslationSentence2 = (LessonTranslationSentence) linkedHashMap.get(Integer.valueOf(i5));
                    if (lessonTranslationSentence2 == null || (dValueOf = lessonTranslationSentence2.f19294c) == null) {
                        LessonSentence lessonSentence2 = (LessonSentence) linkedHashMap2.get(Integer.valueOf(i5));
                        dValueOf = (lessonSentence2 == null || (list = lessonSentence2.f19257e) == null || (f3 = (Float) u91.m22592J0(0, list)) == null) ? null : Double.valueOf(f3.floatValue());
                    }
                    if (lessonTranslationSentence == null) {
                        if (list9 != null) {
                            List list10 = list9;
                            if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                Iterator it3 = list10.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((Number) it3.next()).floatValue() != 0.0f) {
                                            if (dFloatValue < 0.0d) {
                                                d = 0.0d;
                                            } else {
                                                d = dFloatValue;
                                            }
                                            if (dFloatValue2 > dFloatValue) {
                                                dDoubleValue = dFloatValue2;
                                            } else {
                                                dDoubleValue = dValueOf.doubleValue();
                                            }
                                            d2 = d;
                                            d3 = dDoubleValue >= 0.0d ? dDoubleValue : 0.0d;
                                        }
                                    }
                                }
                            }
                        }
                        d2 = -1.0d;
                        d3 = -1.0d;
                    } else if (dFloatValue == 0.0d && dFloatValue2 == 0.0d) {
                        d2 = -1.0d;
                        d3 = -1.0d;
                    } else {
                        if (dFloatValue < 0.0d) {
                            d = 0.0d;
                        } else {
                            d = dFloatValue;
                        }
                        if (dFloatValue2 > dFloatValue && dValueOf != null && dValueOf.doubleValue() > dFloatValue) {
                            dDoubleValue = dValueOf.doubleValue();
                        } else {
                            dDoubleValue = dFloatValue2;
                        }
                        d2 = d;
                        d3 = dDoubleValue >= 0.0d ? dDoubleValue : 0.0d;
                    }
                    Iterator it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                        numValueOf = Integer.valueOf(((xz7) it4.next()).f69004a);
                        while (it4.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((xz7) it4.next()).f69004a);
                            if (numValueOf.compareTo(numValueOf3) > 0) {
                                numValueOf = numValueOf3;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    Iterator it5 = arrayList.iterator();
                    if (it5.hasNext()) {
                        numValueOf2 = Integer.valueOf(((xz7) it5.next()).f69005b);
                        while (it5.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(((xz7) it5.next()).f69005b);
                            if (numValueOf2.compareTo(numValueOf4) < 0) {
                                numValueOf2 = numValueOf4;
                            }
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        LessonCard lessonCard = (LessonCard) map4.get(vz1.m23610P(((xz7) it6.next()).f69008e, localeM9521c));
                        if (lessonCard != null) {
                            arrayList4.add(lessonCard);
                        }
                    }
                    int iM15363P3 = AbstractC3194a.m15363P(v91.m23189q0(arrayList4, 10));
                    if (iM15363P3 < 16) {
                        iM15363P3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM15363P3);
                    for (Object obj4 : arrayList4) {
                        linkedHashMap3.put(vz1.m23610P(((LessonCard) obj4).f19178a, localeM9521c), obj4);
                    }
                    Collection collectionValues = linkedHashMap3.values();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : collectionValues) {
                        if (((LessonCard) obj5).m8040h()) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(vz1.m23610P(((LessonCard) it7.next()).f19178a, localeM9521c));
                    }
                    List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList6));
                    if (listM22622n1.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList(v91.m23189q0(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(vz1.m23610P(((xz7) it8.next()).f69008e, localeM9521c));
                        }
                        setM22627s1 = u91.m22627s1(u91.m22622n1(u91.m22626r1(arrayList7)));
                        reviewType = ReviewType.IntegratedWord;
                    } else {
                        setM22627s1 = u91.m22627s1(listM22622n1);
                        reviewType = ReviewType.Integrated;
                    }
                    Set set = setM22627s1;
                    ReviewType reviewType2 = reviewType;
                    int i6 = lessonSentence.f19256d;
                    String str2 = lessonSentence.f19254b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    lw8 lw8Var = new lw8(i6, d2, d3, str2, iIntValue, iIntValue2, set, reviewType2);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        Map map7 = map3;
                        LessonWord lessonWord = (LessonWord) map7.get(vz1.m23610P(((xz7) it9.next()).f69008e, localeM9521c));
                        if (lessonWord != null) {
                            arrayList8.add(lessonWord);
                        }
                        map3 = map7;
                    }
                    Map map8 = map3;
                    int iM15363P4 = AbstractC3194a.m15363P(v91.m23189q0(arrayList8, 10));
                    if (iM15363P4 < 16) {
                        iM15363P4 = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM15363P4);
                    for (Object obj6 : arrayList8) {
                        linkedHashMap4.put(vz1.m23610P(((LessonWord) obj6).f19314a, localeM9521c), obj6);
                    }
                    arrayList2.add(new e37(i2, str, vz1.m23604J(lw8Var), wbd.m23840a(arrayList, linkedHashMap3, linkedHashMap4, localeM9521c, z), afd.m361a(arrayList, map5, localeM9521c, str.length(), null), afd.m362b(arrayList, map5, localeM9521c, null)));
                    map3 = map8;
                    i2 = i3;
                    it = it2;
                    map2 = map;
                    i = 10;
                }
                return arrayList2;
            }
        }
        return EmptyList.f47638a;
    }
}
