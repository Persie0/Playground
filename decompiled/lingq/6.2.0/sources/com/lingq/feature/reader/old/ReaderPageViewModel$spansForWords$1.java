package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dj3;
import p000.e83;
import p000.je9;
import p000.ox7;
import p000.vs3;
import p000.vz1;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$spansForWords$1", m4291f = "ReaderPageViewModel.kt", m4292l = {332}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$spansForWords$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public int f28741a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28742b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f28743c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ox7 f28744d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ vs3 f28745e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2411m f28746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$spansForWords$1(C2411m c2411m, Continuation continuation) {
        super(6, continuation);
        this.f28746f = c2411m;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReaderPageViewModel$spansForWords$1 readerPageViewModel$spansForWords$1 = new ReaderPageViewModel$spansForWords$1(this.f28746f, (Continuation) obj6);
        readerPageViewModel$spansForWords$1.f28742b = (e83) obj;
        readerPageViewModel$spansForWords$1.f28743c = (Map) obj2;
        readerPageViewModel$spansForWords$1.f28744d = (ox7) obj3;
        readerPageViewModel$spansForWords$1.f28745e = (vs3) obj5;
        return readerPageViewModel$spansForWords$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28742b;
        Map map = this.f28743c;
        ox7 ox7Var = this.f28744d;
        vs3 vs3Var = this.f28745e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28741a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List<xz7> list = ox7Var.f55132e;
            ArrayList arrayList = new ArrayList();
            for (xz7 xz7Var : list) {
                String str = xz7Var.f69008e;
                C2411m c2411m = this.f28746f;
                Locale locale = c2411m.f29253u;
                locale.getClass();
                LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(str, locale));
                je9 je9VarM9310e3 = lessonWord != null ? c2411m.m9310e3(vs3Var, xz7Var, lessonWord, false) : null;
                if (je9VarM9310e3 != null) {
                    arrayList.add(je9VarM9310e3);
                }
            }
            this.f28742b = null;
            this.f28743c = null;
            this.f28744d = null;
            this.f28745e = null;
            this.f28741a = 1;
            if (e83Var.emit(arrayList, this) == coroutineSingletons) {
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
