package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.hy3;
import p000.t22;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$bookmarkLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {1622, 1631, 1632}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$bookmarkLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f28899a;

    /* JADX INFO: renamed from: b */
    public int f28900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28901c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$bookmarkLesson$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f28901c = c2412n;
        this.f28902d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$bookmarkLesson$1(this.f28901c, this.f28902d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$bookmarkLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r1).m7271c0(r2, r0, r16.f28902d, r4, null, r16) == r7) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM14766a;
        Object objM15541t;
        String str;
        C2412n c2412n = this.f28901c;
        vma vmaVar = c2412n.f29277G;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28900b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            DateTimeZone dateTimeZone = DateTimeZone.f54829a;
            if (dateTimeZone == null) {
                C3386nv.m17635v("Zone must not be null");
                return null;
            }
            AtomicReference atomicReference = t22.f61763a;
            strM14766a = hy3.f43148E.m14766a(new DateTime(System.currentTimeMillis(), ISOChronology.m18438R(dateTimeZone)));
            c83 c83Var = ((C1371d) vmaVar).f18583t;
            this.f28899a = strM14766a;
            this.f28900b = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, this);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            strM14766a = this.f28899a;
            AbstractC3193b.m15359b(obj);
            objM15541t = obj;
        } else if (i == 2) {
            String str2 = this.f28899a;
            AbstractC3193b.m15359b(obj);
            str = str2;
            d65 d65Var = c2412n.f29394p;
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            int iM9332l3 = c2412n.m9332l3();
            this.f28899a = null;
            this.f28900b = 3;
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        String str3 = strM14766a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(new Integer(c2412n.m9332l3()), new LessonBookmark(c2412n.m9332l3(), new Integer(this.f28902d), str3, str3, 68));
        this.f28899a = str3;
        this.f28900b = 2;
        if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, this) != coroutineSingletons) {
            str = str3;
            d65 d65Var2 = c2412n.f29394p;
            String strMo4589b3 = c2412n.f29340b.mo4589b2();
            int iM9332l4 = c2412n.m9332l3();
            this.f28899a = null;
            this.f28900b = 3;
        }
        return coroutineSingletons;
    }
}
