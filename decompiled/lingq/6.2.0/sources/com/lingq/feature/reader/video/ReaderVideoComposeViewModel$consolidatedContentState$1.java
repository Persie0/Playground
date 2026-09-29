package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.lesson.Lesson;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.e37;
import p000.lw8;
import p000.tpa;
import p000.xfa;
import p000.yz4;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$consolidatedContentState$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$consolidatedContentState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31187a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yz4 f31188b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f31189c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Integer f31190d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2583a f31191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$consolidatedContentState$1(C2583a c2583a, Continuation continuation) {
        super(6, continuation);
        this.f31191e = c2583a;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ((Boolean) obj4).getClass();
        ReaderVideoComposeViewModel$consolidatedContentState$1 readerVideoComposeViewModel$consolidatedContentState$1 = new ReaderVideoComposeViewModel$consolidatedContentState$1(this.f31191e, (Continuation) obj6);
        readerVideoComposeViewModel$consolidatedContentState$1.f31187a = (List) obj;
        readerVideoComposeViewModel$consolidatedContentState$1.f31188b = (yz4) obj2;
        readerVideoComposeViewModel$consolidatedContentState$1.f31189c = zBooleanValue;
        readerVideoComposeViewModel$consolidatedContentState$1.f31190d = (Integer) obj5;
        return readerVideoComposeViewModel$consolidatedContentState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        List list = this.f31187a;
        yz4 yz4Var = this.f31188b;
        boolean z = this.f31189c;
        Integer num = this.f31190d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2583a c2583a = this.f31191e;
        Integer num2 = null;
        if (num != null) {
            Integer numM9522d = c2583a.f31372e.m9522d(num.intValue());
            if (numM9522d != null) {
                Iterator it = list.iterator();
                int i = 0;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    List list2 = ((e37) it.next()).f36654c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((lw8) it2.next()).f50212a == numM9522d.intValue()) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                Integer num3 = new Integer(i);
                if (num3.intValue() >= 0) {
                    num2 = num3;
                }
            }
        }
        Integer num4 = num2;
        Lesson lesson = yz4Var.f70667a;
        String str5 = "";
        if (lesson == null || (str = lesson.f19162u) == null) {
            str = "";
        }
        if (lesson == null || (str2 = lesson.f19143b) == null) {
            str2 = "";
        }
        if (lesson == null || (str3 = lesson.f19150i) == null) {
            str3 = "";
        }
        if (lesson != null && (str4 = lesson.f19146e) != null) {
            str5 = str4;
        }
        return new tpa(list, str, str2, str3, str5, c2583a.f31369b.mo4589b2(), yz4Var.f70675i, yz4Var.f70676j, z, num4);
    }
}
