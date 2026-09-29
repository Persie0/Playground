package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.fa4;
import p000.lda;
import p000.ox7;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$updateCwts$1", m4291f = "ReaderPageViewModel.kt", m4292l = {282}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$updateCwts$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Map f28771a;

    /* JADX INFO: renamed from: b */
    public C2411m f28772b;

    /* JADX INFO: renamed from: c */
    public Map f28773c;

    /* JADX INFO: renamed from: d */
    public Iterator f28774d;

    /* JADX INFO: renamed from: e */
    public int f28775e;

    /* JADX INFO: renamed from: f */
    public int f28776f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ox7 f28777g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Map f28778h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2411m f28779i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Map f28780j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$updateCwts$1(ox7 ox7Var, Map map, C2411m c2411m, Map map2, Continuation continuation) {
        super(2, continuation);
        this.f28777g = ox7Var;
        this.f28778h = map;
        this.f28779i = c2411m;
        this.f28780j = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$updateCwts$1(this.f28777g, this.f28778h, this.f28779i, this.f28780j, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$updateCwts$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d1 -> B:28:0x00d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2411m c2411m;
        Iterator it;
        int i;
        Map map;
        Map map2;
        C2411m c2411m2;
        LessonWord lessonWord;
        Map map3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f28776f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Iterator it2 = this.f28777g.f55132e.iterator();
            Map map4 = this.f28778h;
            c2411m = this.f28779i;
            it = it2;
            i = 0;
            map = map4;
            map2 = this.f28780j;
            c2411m2 = c2411m;
            while (it.hasNext()) {
                xz7 xz7Var = (xz7) it.next();
                String str = xz7Var.f69008e;
                Locale locale = c2411m2.f29253u;
                locale.getClass();
                lessonWord = (LessonWord) map.get(vz1.m23610P(str, locale));
                if (lessonWord == null && fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) {
                    locale.getClass();
                    if (map2.get(vz1.m23610P(str, locale)) == null) {
                        String strM23610P = vz1.m23610P(str, locale);
                        int i3 = xz7Var.f69010g;
                        int i4 = xz7Var.f69011h;
                        String str2 = i3 + ":" + i4;
                        LinkedHashMap linkedHashMap = c2411m2.f29257y;
                        if (!linkedHashMap.containsKey(str2)) {
                            cd4 cd4Var = (cd4) linkedHashMap.get(str2);
                            if (cd4Var != null) {
                                AbstractC1263a.m7046a(cd4Var);
                            }
                            linkedHashMap.put(str2, wfb.m23926u(lda.m16103C(c2411m2), null, null, new ReaderPageViewModel$updateTokenCwt$1(c2411m2, strM23610P, i3, i4, str2, null), 3));
                        }
                        this.f28771a = map;
                        this.f28772b = c2411m2;
                        this.f28773c = map2;
                        this.f28774d = it;
                        this.f28775e = i;
                        this.f28776f = 1;
                        if (AbstractC3208a.m15437d(200L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c2411m = c2411m2;
                        map3 = map;
                    }
                }
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.f28775e;
        it = this.f28774d;
        map2 = this.f28773c;
        c2411m = this.f28772b;
        map3 = this.f28771a;
        AbstractC3193b.m15359b(obj);
        map = map3;
        c2411m2 = c2411m;
        while (it.hasNext()) {
            xz7 xz7Var2 = (xz7) it.next();
            String str3 = xz7Var2.f69008e;
            Locale locale2 = c2411m2.f29253u;
            locale2.getClass();
            lessonWord = (LessonWord) map.get(vz1.m23610P(str3, locale2));
            if (lessonWord == null) {
            }
        }
        return xfa.f68157a;
    }
}
