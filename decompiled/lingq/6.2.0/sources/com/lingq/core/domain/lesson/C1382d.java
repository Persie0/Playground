package com.lingq.core.domain.lesson;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.core.domain.util.AbstractC1543a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.e65;
import p000.fa4;
import p000.vma;
import p000.xfa;
import p000.y95;
import p000.yl3;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1382d {

    /* JADX INFO: renamed from: a */
    public final Object f18728a;

    public C1382d(y95 y95Var) {
        y95Var.getClass();
        this.f18728a = y95Var;
    }

    /* JADX INFO: renamed from: a */
    public c83 m7992a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new yl3(this, i, 2), new GetLessonCountersUseCase$invoke$2(this, str, i, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m7993b(int i, ReaderBookmarkMode readerBookmarkMode, Continuation continuation) throws Throwable {
        SetLessonBookmarkReaderModeUseCase$invoke$1 setLessonBookmarkReaderModeUseCase$invoke$1;
        vma vmaVar = (vma) this.f18728a;
        if (continuation instanceof SetLessonBookmarkReaderModeUseCase$invoke$1) {
            setLessonBookmarkReaderModeUseCase$invoke$1 = (SetLessonBookmarkReaderModeUseCase$invoke$1) continuation;
            int i2 = setLessonBookmarkReaderModeUseCase$invoke$1.f18711e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setLessonBookmarkReaderModeUseCase$invoke$1.f18711e = i2 - Integer.MIN_VALUE;
            } else {
                setLessonBookmarkReaderModeUseCase$invoke$1 = new SetLessonBookmarkReaderModeUseCase$invoke$1(this, continuation);
            }
        } else {
            setLessonBookmarkReaderModeUseCase$invoke$1 = new SetLessonBookmarkReaderModeUseCase$invoke$1(this, continuation);
        }
        Object objM15541t = setLessonBookmarkReaderModeUseCase$invoke$1.f18709c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setLessonBookmarkReaderModeUseCase$invoke$1.f18711e;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18584u;
            setLessonBookmarkReaderModeUseCase$invoke$1.f18708b = readerBookmarkMode;
            setLessonBookmarkReaderModeUseCase$invoke$1.f18707a = i;
            setLessonBookmarkReaderModeUseCase$invoke$1.f18711e = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, setLessonBookmarkReaderModeUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = setLessonBookmarkReaderModeUseCase$invoke$1.f18707a;
        readerBookmarkMode = setLessonBookmarkReaderModeUseCase$invoke$1.f18708b;
        AbstractC3193b.m15359b(objM15541t);
        Map map = (Map) objM15541t;
        if (!fa4.m11650l(e65.m10872d(i, map), readerBookmarkMode.getWire())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(new Integer(i), readerBookmarkMode.getWire());
            setLessonBookmarkReaderModeUseCase$invoke$1.f18708b = null;
            setLessonBookmarkReaderModeUseCase$invoke$1.f18707a = i;
            setLessonBookmarkReaderModeUseCase$invoke$1.f18711e = 2;
            if (((C1371d) vmaVar).m7964d(linkedHashMap, setLessonBookmarkReaderModeUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    public C1382d(vma vmaVar) {
        vmaVar.getClass();
        this.f18728a = vmaVar;
    }
}
