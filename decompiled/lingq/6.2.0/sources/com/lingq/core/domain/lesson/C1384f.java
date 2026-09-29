package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Instant;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.d65;
import p000.g74;
import p000.kuc;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1384f {

    /* JADX INFO: renamed from: a */
    public final vma f18731a;

    /* JADX INFO: renamed from: b */
    public final d65 f18732b;

    /* JADX INFO: renamed from: c */
    public final C1382d f18733c;

    public C1384f(vma vmaVar, d65 d65Var, C1382d c1382d) {
        vmaVar.getClass();
        d65Var.getClass();
        this.f18731a = vmaVar;
        this.f18732b = d65Var;
        this.f18733c = c1382d;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        if (r18.f18733c.m7993b(r4, r5, r9) == r2) goto L35;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7995a(String str, int i, int i2, ReaderBookmarkMode readerBookmarkMode, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        SaveLessonBookmarkUseCase$invoke$1 saveLessonBookmarkUseCase$invoke$1;
        String strM15695a;
        ReaderBookmarkMode readerBookmarkMode2;
        Integer num2;
        int i3;
        int i4;
        String str2;
        int i5;
        String str3;
        Integer num3;
        int i6;
        int i7;
        int i8;
        int i9;
        ReaderBookmarkMode readerBookmarkMode3;
        if (continuationImpl instanceof SaveLessonBookmarkUseCase$invoke$1) {
            saveLessonBookmarkUseCase$invoke$1 = (SaveLessonBookmarkUseCase$invoke$1) continuationImpl;
            int i10 = saveLessonBookmarkUseCase$invoke$1.f18706i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                saveLessonBookmarkUseCase$invoke$1.f18706i = i10 - Integer.MIN_VALUE;
            } else {
                saveLessonBookmarkUseCase$invoke$1 = new SaveLessonBookmarkUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            saveLessonBookmarkUseCase$invoke$1 = new SaveLessonBookmarkUseCase$invoke$1(this, continuationImpl);
        }
        SaveLessonBookmarkUseCase$invoke$1 saveLessonBookmarkUseCase$invoke$2 = saveLessonBookmarkUseCase$invoke$1;
        Object objM15541t = saveLessonBookmarkUseCase$invoke$2.f18704g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = saveLessonBookmarkUseCase$invoke$2.f18706i;
        vma vmaVar = this.f18731a;
        if (i11 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            Instant instantMo3285e = g74.f40314a.mo3285e();
            instantMo3285e.getClass();
            strM15695a = kuc.m15695a(instantMo3285e);
            c83 c83Var = ((C1371d) vmaVar).f18583t;
            saveLessonBookmarkUseCase$invoke$2.f18698a = str;
            readerBookmarkMode2 = readerBookmarkMode;
            saveLessonBookmarkUseCase$invoke$2.f18699b = readerBookmarkMode2;
            num2 = num;
            saveLessonBookmarkUseCase$invoke$2.f18700c = num2;
            saveLessonBookmarkUseCase$invoke$2.f18701d = strM15695a;
            saveLessonBookmarkUseCase$invoke$2.f18702e = i;
            i3 = i2;
            saveLessonBookmarkUseCase$invoke$2.f18703f = i3;
            saveLessonBookmarkUseCase$invoke$2.f18706i = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, saveLessonBookmarkUseCase$invoke$2);
            if (objM15541t != coroutineSingletons) {
                i4 = i;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i11 == 1) {
            int i12 = saveLessonBookmarkUseCase$invoke$2.f18703f;
            i4 = saveLessonBookmarkUseCase$invoke$2.f18702e;
            strM15695a = saveLessonBookmarkUseCase$invoke$2.f18701d;
            Integer num4 = saveLessonBookmarkUseCase$invoke$2.f18700c;
            ReaderBookmarkMode readerBookmarkMode4 = saveLessonBookmarkUseCase$invoke$2.f18699b;
            str2 = saveLessonBookmarkUseCase$invoke$2.f18698a;
            AbstractC3193b.m15359b(objM15541t);
            num2 = num4;
            readerBookmarkMode2 = readerBookmarkMode4;
            i3 = i12;
        } else {
            if (i11 == 2) {
                int i13 = saveLessonBookmarkUseCase$invoke$2.f18703f;
                i5 = saveLessonBookmarkUseCase$invoke$2.f18702e;
                String str4 = saveLessonBookmarkUseCase$invoke$2.f18701d;
                Integer num5 = saveLessonBookmarkUseCase$invoke$2.f18700c;
                ReaderBookmarkMode readerBookmarkMode5 = saveLessonBookmarkUseCase$invoke$2.f18699b;
                String str5 = saveLessonBookmarkUseCase$invoke$2.f18698a;
                AbstractC3193b.m15359b(objM15541t);
                str2 = str5;
                readerBookmarkMode2 = readerBookmarkMode5;
                num3 = num5;
                str3 = str4;
                i6 = i13;
                saveLessonBookmarkUseCase$invoke$2.f18698a = null;
                saveLessonBookmarkUseCase$invoke$2.f18699b = readerBookmarkMode2;
                saveLessonBookmarkUseCase$invoke$2.f18700c = null;
                saveLessonBookmarkUseCase$invoke$2.f18701d = null;
                saveLessonBookmarkUseCase$invoke$2.f18702e = i5;
                saveLessonBookmarkUseCase$invoke$2.f18703f = i6;
                saveLessonBookmarkUseCase$invoke$2.f18706i = 3;
                i7 = i5;
                if (((C1295k) this.f18732b).m7271c0(str2, i7, i6, str3, num3, saveLessonBookmarkUseCase$invoke$2) != coroutineSingletons) {
                    i8 = i7;
                    i9 = i6;
                    readerBookmarkMode3 = readerBookmarkMode2;
                    saveLessonBookmarkUseCase$invoke$2.f18698a = null;
                    saveLessonBookmarkUseCase$invoke$2.f18699b = null;
                    saveLessonBookmarkUseCase$invoke$2.f18700c = null;
                    saveLessonBookmarkUseCase$invoke$2.f18701d = null;
                    saveLessonBookmarkUseCase$invoke$2.f18702e = i8;
                    saveLessonBookmarkUseCase$invoke$2.f18703f = i9;
                    saveLessonBookmarkUseCase$invoke$2.f18706i = 4;
                }
                return coroutineSingletons;
            }
            if (i11 == 3) {
                i9 = saveLessonBookmarkUseCase$invoke$2.f18703f;
                i8 = saveLessonBookmarkUseCase$invoke$2.f18702e;
                readerBookmarkMode3 = saveLessonBookmarkUseCase$invoke$2.f18699b;
                AbstractC3193b.m15359b(objM15541t);
                saveLessonBookmarkUseCase$invoke$2.f18698a = null;
                saveLessonBookmarkUseCase$invoke$2.f18699b = null;
                saveLessonBookmarkUseCase$invoke$2.f18700c = null;
                saveLessonBookmarkUseCase$invoke$2.f18701d = null;
                saveLessonBookmarkUseCase$invoke$2.f18702e = i8;
                saveLessonBookmarkUseCase$invoke$2.f18703f = i9;
                saveLessonBookmarkUseCase$invoke$2.f18706i = 4;
            } else {
                if (i11 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM15541t);
            }
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(new Integer(i4), new LessonBookmark(i4, new Integer(i3), strM15695a, strM15695a, 68));
        saveLessonBookmarkUseCase$invoke$2.f18698a = str2;
        saveLessonBookmarkUseCase$invoke$2.f18699b = readerBookmarkMode2;
        saveLessonBookmarkUseCase$invoke$2.f18700c = num2;
        saveLessonBookmarkUseCase$invoke$2.f18701d = strM15695a;
        saveLessonBookmarkUseCase$invoke$2.f18702e = i4;
        saveLessonBookmarkUseCase$invoke$2.f18703f = i3;
        saveLessonBookmarkUseCase$invoke$2.f18706i = 2;
        if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, saveLessonBookmarkUseCase$invoke$2) != coroutineSingletons) {
            i5 = i4;
            str3 = strM15695a;
            num3 = num2;
            i6 = i3;
            saveLessonBookmarkUseCase$invoke$2.f18698a = null;
            saveLessonBookmarkUseCase$invoke$2.f18699b = readerBookmarkMode2;
            saveLessonBookmarkUseCase$invoke$2.f18700c = null;
            saveLessonBookmarkUseCase$invoke$2.f18701d = null;
            saveLessonBookmarkUseCase$invoke$2.f18702e = i5;
            saveLessonBookmarkUseCase$invoke$2.f18703f = i6;
            saveLessonBookmarkUseCase$invoke$2.f18706i = 3;
            i7 = i5;
            if (((C1295k) this.f18732b).m7271c0(str2, i7, i6, str3, num3, saveLessonBookmarkUseCase$invoke$2) != coroutineSingletons) {
                i8 = i7;
                i9 = i6;
                readerBookmarkMode3 = readerBookmarkMode2;
                saveLessonBookmarkUseCase$invoke$2.f18698a = null;
                saveLessonBookmarkUseCase$invoke$2.f18699b = null;
                saveLessonBookmarkUseCase$invoke$2.f18700c = null;
                saveLessonBookmarkUseCase$invoke$2.f18701d = null;
                saveLessonBookmarkUseCase$invoke$2.f18702e = i8;
                saveLessonBookmarkUseCase$invoke$2.f18703f = i9;
                saveLessonBookmarkUseCase$invoke$2.f18706i = 4;
            }
        }
        return coroutineSingletons;
    }
}
