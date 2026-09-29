package com.lingq.feature.library.preview;

import android.os.Bundle;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ImportSource;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.q05;
import p000.ql4;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.library.preview.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2154a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2155b f26762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26764c;

    public C2154a(C2155b c2155b, String str, int i) {
        this.f26762a = c2155b;
        this.f26763b = str;
        this.f26764c = i;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193 A[Catch: Exception -> 0x004a, PHI: r0 r1 r5
      0x0193: PHI (r0v7 int) = (r0v6 int), (r0v16 int) binds: [B:47:0x0190, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:47:0x0190, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r5v10 com.lingq.feature.library.preview.b) = (r5v9 com.lingq.feature.library.preview.b), (r5v24 com.lingq.feature.library.preview.b) binds: [B:47:0x0190, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:16:0x0045, B:49:0x0193), top: B:58:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b9, code lost:
    
        if (r0 == r4) goto L54;
     */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Lesson lesson, Continuation continuation) throws Throwable {
        LessonPreviewViewModel$importLesson$1$4$emit$1 lessonPreviewViewModel$importLesson$1$4$emit$1;
        C2155b c2155b;
        String str;
        int i;
        Object obj;
        int i2;
        Lesson lesson2;
        String str2;
        C2155b c2155b2;
        Lesson lesson3;
        int i3;
        Object objM2861d;
        Lesson lesson4;
        C2155b c2155b3;
        Lesson lesson5;
        C3211a c3211a;
        Object objM14898b;
        Lesson lesson6 = lesson;
        if (continuation instanceof LessonPreviewViewModel$importLesson$1$4$emit$1) {
            lessonPreviewViewModel$importLesson$1$4$emit$1 = (LessonPreviewViewModel$importLesson$1$4$emit$1) continuation;
            int i4 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = i4 - Integer.MIN_VALUE;
            } else {
                lessonPreviewViewModel$importLesson$1$4$emit$1 = new LessonPreviewViewModel$importLesson$1$4$emit$1(this, continuation);
            }
        } else {
            lessonPreviewViewModel$importLesson$1$4$emit$1 = new LessonPreviewViewModel$importLesson$1$4$emit$1(this, continuation);
        }
        Object obj2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26755g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i;
        int i6 = 3;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i5 == 0) {
                AbstractC3193b.m15359b(obj2);
                C2155b c2155b4 = this.f26762a;
                C3244l c3244l = c2155b4.f26773j;
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                if (lesson6 != null) {
                    c83 c83VarMo4583O1 = c2155b4.f26765b.mo4583O1();
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = lesson6;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b4;
                    String str3 = this.f26763b;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = str3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = lesson6;
                    int i7 = this.f26764c;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i7;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = 0;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 1;
                    Object objM15541t = AbstractC3224d.m15541t(c83VarMo4583O1, lessonPreviewViewModel$importLesson$1$4$emit$1);
                    if (objM15541t != coroutineSingletons) {
                        c2155b = c2155b4;
                        str = str3;
                        i = i7;
                        obj = objM15541t;
                        i2 = 0;
                        lesson2 = lesson6;
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            }
            if (i5 == 1) {
                i2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f;
                int i8 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e;
                lesson2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d;
                str = (String) lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c;
                c2155b = lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b;
                Lesson lesson7 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a;
                AbstractC3193b.m15359b(obj2);
                i = i8;
                lesson6 = lesson7;
                obj = obj2;
            } else {
                if (i5 == 2) {
                    i2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f;
                    i3 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e;
                    lesson2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d;
                    str2 = (String) lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c;
                    c2155b2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b;
                    lesson3 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a;
                    AbstractC3193b.m15359b(obj2);
                    d65 d65Var = c2155b2.f26768e;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = lesson3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = lesson2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 3;
                    objM2861d = AbstractC0758a.m2861d(new ql4(str2, i6), ((q05) ((C1295k) d65Var).f16498b).f57071K, lessonPreviewViewModel$importLesson$1$4$emit$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        lesson4 = lesson2;
                        c2155b3 = c2155b2;
                        lesson5 = lesson3;
                        Bundle bundle = new Bundle();
                        bundle.putInt("Lesson ID", lesson5.f19142a);
                        bundle.putString("Lesson name", lesson5.f19143b);
                        bundle.putString("Lesson language", AbstractC3184kh.m15223q(c2155b3.f26765b.mo4589b2()));
                        bundle.putString("Lesson level", lesson5.f19159r);
                        bundle.putString("Import Method", LqAnalyticsValues$ImportSource.External.getValue());
                        ((C1240a) c2155b3.f26769f).m7025f("Lesson imported", bundle);
                        c3211a = c2155b3.f26775l;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b3;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i3;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 4;
                        if (c3211a.mo4678m(lesson4, lessonPreviewViewModel$importLesson$1$4$emit$1) != coroutineSingletons) {
                            d65 d65Var2 = c2155b3.f26768e;
                            String strMo4589b2 = c2155b3.f26765b.mo4589b2();
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = null;
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i2;
                            lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 5;
                            objM14898b = ((C1295k) d65Var2).f16502f.m14898b(strMo4589b2, new Integer(i3), lessonPreviewViewModel$importLesson$1$4$emit$1);
                            if (objM14898b != coroutineSingletons) {
                                objM14898b = xfaVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i5 == 3) {
                    i2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f;
                    i3 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e;
                    Lesson lesson8 = (Lesson) lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c;
                    C2155b c2155b5 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b;
                    lesson5 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a;
                    AbstractC3193b.m15359b(obj2);
                    lesson4 = lesson8;
                    c2155b3 = c2155b5;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("Lesson ID", lesson5.f19142a);
                    bundle2.putString("Lesson name", lesson5.f19143b);
                    bundle2.putString("Lesson language", AbstractC3184kh.m15223q(c2155b3.f26765b.mo4589b2()));
                    bundle2.putString("Lesson level", lesson5.f19159r);
                    bundle2.putString("Import Method", LqAnalyticsValues$ImportSource.External.getValue());
                    ((C1240a) c2155b3.f26769f).m7025f("Lesson imported", bundle2);
                    c3211a = c2155b3.f26775l;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 4;
                    if (c3211a.mo4678m(lesson4, lessonPreviewViewModel$importLesson$1$4$emit$1) != coroutineSingletons) {
                        d65 d65Var3 = c2155b3.f26768e;
                        String strMo4589b3 = c2155b3.f26765b.mo4589b2();
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i2;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 5;
                        objM14898b = ((C1295k) d65Var3).f16502f.m14898b(strMo4589b3, new Integer(i3), lessonPreviewViewModel$importLesson$1$4$emit$1);
                        if (objM14898b != coroutineSingletons) {
                            objM14898b = xfaVar;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i5 == 4) {
                    i2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f;
                    i3 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e;
                    c2155b3 = lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b;
                    AbstractC3193b.m15359b(obj2);
                    d65 d65Var4 = c2155b3.f26768e;
                    String strMo4589b4 = c2155b3.f26765b.mo4589b2();
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 5;
                    objM14898b = ((C1295k) d65Var4).f16502f.m14898b(strMo4589b4, new Integer(i3), lessonPreviewViewModel$importLesson$1$4$emit$1);
                    if (objM14898b != coroutineSingletons) {
                        objM14898b = xfaVar;
                    }
                } else {
                    if (i5 != 5) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj2);
                }
            }
            return xfaVar;
            ProfileAccount profileAccount = (ProfileAccount) obj;
            profileAccount.f19687k++;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = lesson6;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = str;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = lesson2;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
            lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 2;
            if (c2155b.f26765b.mo4591h0(profileAccount, lessonPreviewViewModel$importLesson$1$4$emit$1) != coroutineSingletons) {
                str2 = str;
                c2155b2 = c2155b;
                lesson3 = lesson6;
                i3 = i;
                d65 d65Var5 = c2155b2.f26768e;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = lesson3;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b2;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = lesson2;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i3;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 3;
                objM2861d = AbstractC0758a.m2861d(new ql4(str2, i6), ((q05) ((C1295k) d65Var5).f16498b).f57071K, lessonPreviewViewModel$importLesson$1$4$emit$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    lesson4 = lesson2;
                    c2155b3 = c2155b2;
                    lesson5 = lesson3;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("Lesson ID", lesson5.f19142a);
                    bundle3.putString("Lesson name", lesson5.f19143b);
                    bundle3.putString("Lesson language", AbstractC3184kh.m15223q(c2155b3.f26765b.mo4589b2()));
                    bundle3.putString("Lesson level", lesson5.f19159r);
                    bundle3.putString("Import Method", LqAnalyticsValues$ImportSource.External.getValue());
                    ((C1240a) c2155b3.f26769f).m7025f("Lesson imported", bundle3);
                    c3211a = c2155b3.f26775l;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = c2155b3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i3;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26754f = i2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 4;
                    if (c3211a.mo4678m(lesson4, lessonPreviewViewModel$importLesson$1$4$emit$1) != coroutineSingletons) {
                        d65 d65Var6 = c2155b3.f26768e;
                        String strMo4589b5 = c2155b3.f26765b.mo4589b2();
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26749a = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26750b = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26751c = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26752d = null;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26753e = i2;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f26757i = 5;
                        objM14898b = ((C1295k) d65Var6).f16502f.m14898b(strMo4589b5, new Integer(i3), lessonPreviewViewModel$importLesson$1$4$emit$1);
                        if (objM14898b != coroutineSingletons) {
                            objM14898b = xfaVar;
                        }
                    }
                }
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
