package com.lingq.feature.reader.video.state;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.oe5;
import p000.pk9;
import p000.un1;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoLippManager$fetchIfNeeded$1", m4291f = "VideoLippManager.kt", m4292l = {137}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoLippManager$fetchIfNeeded$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2596b f31512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31513c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLippManager$fetchIfNeeded$1(C2596b c2596b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f31512b = c2596b;
        this.f31513c = i;
        this.f31514d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoLippManager$fetchIfNeeded$1(this.f31512b, this.f31513c, this.f31514d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoLippManager$fetchIfNeeded$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2596b c2596b = this.f31512b;
        C3244l c3244l = c2596b.f31544d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31511a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3139j9 c3139j9 = c2596b.f31541a;
            String str = c2596b.f31546f;
            int i2 = c2596b.f31547g;
            this.f31511a = 1;
            obj = ((C1295k) c3139j9.f45229a).m7305y(str, i2, this.f31513c, this.f31514d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        oe5 oe5Var = (oe5) pk9.m19381x((ym5) obj);
        xfa xfaVar = xfa.f68157a;
        if (oe5Var != null) {
            Map map = oe5Var.f54242a;
            if (!map.isEmpty()) {
                LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    for (LessonTextToken lessonTextToken : (List) ((Map.Entry) it.next()).getValue()) {
                        if (!lessonTextToken.f19290n.isEmpty()) {
                            linkedHashMapM15372Y.put(new Integer(lessonTextToken.f19283g), lessonTextToken.f19290n);
                        }
                    }
                }
                c3244l.getClass();
                c3244l.m15572j(null, linkedHashMapM15372Y);
            }
        }
        return xfaVar;
    }
}
