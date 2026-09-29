package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenCwt;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bo0;
import p000.c32;
import p000.e83;
import p000.ej3;
import p000.fa4;
import p000.ox7;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$sentenceTokens$1", m4291f = "ReaderPageViewModel.kt", m4292l = {259}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$sentenceTokens$1 extends SuspendLambda implements ej3 {

    /* JADX INFO: renamed from: a */
    public int f28696a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28697b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28698c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f28699d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f28700e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ ox7 f28701f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Map f28702g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2411m f28703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$sentenceTokens$1(C2411m c2411m, Continuation continuation) {
        super(7, continuation);
        this.f28703h = c2411m;
    }

    @Override // p000.ej3
    /* JADX INFO: renamed from: b */
    public final Object mo1286b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        ReaderPageViewModel$sentenceTokens$1 readerPageViewModel$sentenceTokens$1 = new ReaderPageViewModel$sentenceTokens$1(this.f28703h, (Continuation) serializable);
        readerPageViewModel$sentenceTokens$1.f28697b = (e83) obj;
        readerPageViewModel$sentenceTokens$1.f28698c = (Map) obj2;
        readerPageViewModel$sentenceTokens$1.f28699d = (Map) obj3;
        readerPageViewModel$sentenceTokens$1.f28700e = (List) obj4;
        readerPageViewModel$sentenceTokens$1.f28701f = (ox7) obj5;
        readerPageViewModel$sentenceTokens$1.f28702g = (Map) obj6;
        return readerPageViewModel$sentenceTokens$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2411m c2411m = this.f28703h;
        Locale locale = c2411m.f29253u;
        e83 e83Var = this.f28697b;
        Map map = this.f28698c;
        Map map2 = this.f28699d;
        List list = this.f28700e;
        ox7 ox7Var = this.f28701f;
        Map map3 = this.f28702g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28696a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list2 = ox7Var.f55132e;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str = ((xz7) it.next()).f69008e;
                locale.getClass();
                arrayList.add(vz1.m23610P(str, locale));
            }
            Set setM22627s1 = u91.m22627s1(arrayList);
            ArrayList arrayList2 = new ArrayList(map2.size());
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((LessonCard) ((Map.Entry) it2.next()).getValue());
            }
            ArrayList arrayListM22603U0 = u91.m22603U0(list, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListM22603U0) {
                LessonCard lessonCard = (LessonCard) obj2;
                if (lessonCard.f19188k >= CardStatus.New.getValue() && lessonCard.f19188k <= CardStatus.Familiar.getValue()) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet.add(((LessonCard) obj3).f19178a)) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(map.size());
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList5.add((LessonWord) ((Map.Entry) it3.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList5) {
                if (fa4.m11650l(((LessonWord) obj4).f19322i, WordStatus.New.getValue())) {
                    arrayList6.add(obj4);
                }
            }
            HashSet hashSet2 = new HashSet();
            ArrayList<LessonWord> arrayList7 = new ArrayList();
            for (Object obj5 : arrayList6) {
                if (hashSet2.add(((LessonWord) obj5).f19314a)) {
                    arrayList7.add(obj5);
                }
            }
            if (!map3.isEmpty()) {
                ArrayList arrayList8 = new ArrayList(v91.m23189q0(arrayList7, 10));
                for (LessonWord lessonWord : arrayList7) {
                    String str2 = lessonWord.f19314a;
                    locale.getClass();
                    TokenCwt tokenCwt = (TokenCwt) map3.get(vz1.m23610P(str2, locale));
                    if (tokenCwt != null) {
                        String str3 = lessonWord.f19314a;
                        String strMo4580K1 = c2411m.f29223b.mo4580K1();
                        strMo4580K1.getClass();
                        ArrayList arrayListM22603U1 = u91.m22603U0(lessonWord.f19319f, vz1.m23604J(new TokenMeaning(-33, strMo4580K1, tokenCwt.f19587e, 0, false, strMo4580K1, true, 0, 136)));
                        int i2 = lessonWord.f19321h;
                        String str4 = lessonWord.f19322i;
                        lessonWord = new LessonWord(str3, lessonWord.f19315b, lessonWord.f19316c, lessonWord.f19317d, arrayListM22603U1, i2, str4, lessonWord.f19323j, lessonWord.f19324k, lessonWord.f19325l, lessonWord.f19326m, lessonWord.f19327n, lessonWord.f19328o, 80);
                    }
                    arrayList8.add(lessonWord);
                    locale = locale;
                }
                arrayList7 = arrayList8;
            }
            List listM22622n1 = u91.m22622n1(u91.m22614f1(u91.m22603U0(arrayList7, arrayList4), new bo0(1, setM22627s1, c2411m)));
            this.f28697b = null;
            this.f28698c = null;
            this.f28699d = null;
            this.f28700e = null;
            this.f28701f = null;
            this.f28702g = null;
            this.f28696a = 1;
            if (e83Var.emit(listM22622n1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
