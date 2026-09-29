package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.abd;
import p000.c32;
import p000.e83;
import p000.ej3;
import p000.iy7;
import p000.je9;
import p000.ox7;
import p000.ppc;
import p000.u91;
import p000.uk9;
import p000.v91;
import p000.vs3;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.y7d;
import p000.yd5;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$spansForCards$1", m4291f = "ReaderPageViewModel.kt", m4292l = {316}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$spansForCards$1 extends SuspendLambda implements ej3 {

    /* JADX INFO: renamed from: a */
    public int f28733a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28734b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28735c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f28736d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ ox7 f28737e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f28738f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ vs3 f28739g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2411m f28740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$spansForCards$1(C2411m c2411m, Continuation continuation) {
        super(7, continuation);
        this.f28740h = c2411m;
    }

    @Override // p000.ej3
    /* JADX INFO: renamed from: b */
    public final Object mo1286b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        ReaderPageViewModel$spansForCards$1 readerPageViewModel$spansForCards$1 = new ReaderPageViewModel$spansForCards$1(this.f28740h, (Continuation) serializable);
        readerPageViewModel$spansForCards$1.f28734b = (e83) obj;
        readerPageViewModel$spansForCards$1.f28735c = (Map) obj2;
        readerPageViewModel$spansForCards$1.f28736d = (Map) obj3;
        readerPageViewModel$spansForCards$1.f28737e = (ox7) obj4;
        readerPageViewModel$spansForCards$1.f28738f = (List) obj5;
        readerPageViewModel$spansForCards$1.f28739g = (vs3) obj6;
        return readerPageViewModel$spansForCards$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [e83, java.util.List, java.util.Map, ox7, vs3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        Iterator it;
        je9 je9Var;
        je9 je9VarM9308c3;
        int length;
        e83 e83Var = this.f28734b;
        Map map = this.f28735c;
        Map map2 = this.f28736d;
        ox7 ox7Var = this.f28737e;
        List list = this.f28738f;
        vs3 vs3Var = this.f28739g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28733a;
        je9 je9Var2 = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LinkedHashMap linkedHashMapM15367T = AbstractC3194a.m15367T(map, map2);
            List list2 = ox7Var.f55132e;
            C2411m c2411m = this.f28740h;
            Locale locale = c2411m.f29253u;
            List list3 = list2;
            List list4 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(((iy7) it2.next()).f44779a);
            }
            ArrayList arrayListM22603U0 = u91.m22603U0(arrayList, list3);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListM22603U0.iterator();
            while (it3.hasNext()) {
                xz7 xz7Var = (xz7) it3.next();
                String str = xz7Var.f69008e;
                locale.getClass();
                LessonCard lessonCard = (LessonCard) linkedHashMapM15367T.get(vz1.m23610P(str, locale));
                if (lessonCard == null) {
                    linkedHashMap = linkedHashMapM15367T;
                    it = it3;
                    je9Var = je9Var2;
                    je9VarM9308c3 = je9Var;
                } else if (lessonCard.f19182e) {
                    C3244l c3244l = c2411m.f29254v;
                    je9Var = je9Var2;
                    int i2 = lessonCard.f19188k;
                    Integer num = lessonCard.f19189l;
                    int iM19442a = ppc.m19442a(vs3Var, i2, num);
                    yd5 yd5Var = vs3Var.f65847c;
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            uk9.m22775i("Collection contains no element matching the predicate.");
                            return je9Var;
                        }
                        String str2 = ((iy7) it4.next()).f44779a.f69008e;
                        locale.getClass();
                        linkedHashMap = linkedHashMapM15367T;
                        if (vz1.m23610P(str2, locale).equals(vz1.m23610P(xz7Var.f69008e, locale))) {
                            yd5 yd5Var2 = yd5Var;
                            it = it3;
                            je9VarM9308c3 = new je9(0, 0, 0, null, xz7Var, 0, false, false, 2031);
                            je9VarM9308c3.f45480a = iM19442a;
                            je9VarM9308c3.f45482c = abd.m253i(yd5Var2.f69692f);
                            je9VarM9308c3.f45485f = true;
                            int i3 = xz7Var.f69005b;
                            ox7 ox7Var2 = (ox7) c3244l.getValue();
                            if (i3 >= (ox7Var2 != null ? ox7Var2.f55131d.length() : 0)) {
                                ox7 ox7Var3 = (ox7) c3244l.getValue();
                                length = ox7Var3 != null ? ox7Var3.f55131d.length() : 0;
                            } else {
                                length = xz7Var.f69005b;
                            }
                            int i4 = xz7Var.f69004a;
                            if (i4 > length) {
                                i4 = length;
                            }
                            xz7Var.f69004a = i4;
                            xz7Var.f69005b = length;
                            je9VarM9308c3.f45487h = y7d.m24983b(i2, num);
                            je9VarM9308c3.f45481b = ppc.m19443b(vs3Var, i2, num);
                            je9VarM9308c3.f45483d = (i2 == CardStatus.Known.getValue() || i2 == CardStatus.Ignored.getValue() || i2 == CardStatus.Learned.getValue()) ? je9Var : Integer.valueOf(abd.m253i(yd5Var2.f69693g));
                            break;
                        }
                        linkedHashMapM15367T = linkedHashMap;
                        yd5Var = yd5Var;
                        it3 = it3;
                    }
                } else {
                    linkedHashMap = linkedHashMapM15367T;
                    it = it3;
                    je9Var = je9Var2;
                    je9VarM9308c3 = c2411m.m9308c3(vs3Var, xz7Var, lessonCard, false);
                }
                if (je9VarM9308c3 != null) {
                    arrayList2.add(je9VarM9308c3);
                }
                je9Var2 = je9Var;
                linkedHashMapM15367T = linkedHashMap;
                it3 = it;
            }
            ?? r2 = je9Var2;
            this.f28734b = r2;
            this.f28735c = r2;
            this.f28736d = r2;
            this.f28737e = r2;
            this.f28738f = r2;
            this.f28739g = r2;
            this.f28733a = 1;
            if (e83Var.emit(arrayList2, this) == coroutineSingletons) {
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
