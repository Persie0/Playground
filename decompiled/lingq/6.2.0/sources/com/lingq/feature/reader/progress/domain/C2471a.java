package com.lingq.feature.reader.progress.domain;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.playlist.C1518a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3509qs;
import p000.bz5;
import p000.d65;
import p000.hm5;
import p000.s7b;
import p000.si7;
import p000.xfa;
import p000.y15;

/* JADX INFO: renamed from: com.lingq.feature.reader.progress.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2471a {

    /* JADX INFO: renamed from: a */
    public final d65 f29903a;

    /* JADX INFO: renamed from: b */
    public final s7b f29904b;

    /* JADX INFO: renamed from: c */
    public final C1518a f29905c;

    /* JADX INFO: renamed from: d */
    public final C3509qs f29906d;

    /* JADX INFO: renamed from: e */
    public final si7 f29907e;

    /* JADX INFO: renamed from: f */
    public final hm5 f29908f;

    /* JADX INFO: renamed from: g */
    public final bz5 f29909g;

    /* JADX INFO: renamed from: h */
    public final y15 f29910h;

    public C2471a(d65 d65Var, s7b s7bVar, C1518a c1518a, C3509qs c3509qs, si7 si7Var, hm5 hm5Var, bz5 bz5Var, y15 y15Var) {
        d65Var.getClass();
        s7bVar.getClass();
        c3509qs.getClass();
        si7Var.getClass();
        hm5Var.getClass();
        bz5Var.getClass();
        y15Var.getClass();
        this.f29903a = d65Var;
        this.f29904b = s7bVar;
        this.f29905c = c1518a;
        this.f29906d = c3509qs;
        this.f29907e = si7Var;
        this.f29908f = hm5Var;
        this.f29909g = bz5Var;
        this.f29910h = y15Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b A[PHI: r1 r2
      0x011b: PHI (r1v9 int) = (r1v8 int), (r1v15 int) binds: [B:41:0x0118, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r2v9 java.util.List) = (r2v8 java.util.List), (r2v20 java.util.List) binds: [B:41:0x0118, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public final Object m9376a(String str, int i, List list, ContinuationImpl continuationImpl) throws Throwable {
        CompleteLessonUseCase$invoke$1 completeLessonUseCase$invoke$1;
        String str2;
        int i2;
        List list2;
        String str3;
        int i3;
        List list3;
        String str4;
        String str5 = str;
        int i4 = i;
        List list4 = list;
        if (continuationImpl instanceof CompleteLessonUseCase$invoke$1) {
            completeLessonUseCase$invoke$1 = (CompleteLessonUseCase$invoke$1) continuationImpl;
            int i5 = completeLessonUseCase$invoke$1.f29872f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                completeLessonUseCase$invoke$1.f29872f = i5 - Integer.MIN_VALUE;
            } else {
                completeLessonUseCase$invoke$1 = new CompleteLessonUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            completeLessonUseCase$invoke$1 = new CompleteLessonUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = completeLessonUseCase$invoke$1.f29870d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = completeLessonUseCase$invoke$1.f29872f;
        xfa xfaVar = xfa.f68157a;
        C3509qs c3509qs = this.f29906d;
        if (i6 == 0) {
            AbstractC3193b.m15359b(obj);
            c3509qs.m20136j(c3509qs.f58118b.getInt("lessonsCompleted", 0) + 1);
            if (list4.isEmpty()) {
                completeLessonUseCase$invoke$1.f29867a = str5;
                completeLessonUseCase$invoke$1.f29868b = list4;
                completeLessonUseCase$invoke$1.f29869c = i4;
                completeLessonUseCase$invoke$1.f29872f = 3;
                if (this.f29905c.m8194a(i4, str5, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                    List list5 = list4;
                    str3 = str5;
                    i3 = i4;
                    list3 = list5;
                    str4 = null;
                    completeLessonUseCase$invoke$1.f29867a = str4;
                    completeLessonUseCase$invoke$1.f29868b = list3;
                    completeLessonUseCase$invoke$1.f29869c = i3;
                    completeLessonUseCase$invoke$1.f29872f = 4;
                    if (((C1295k) this.f29903a).m7272d0(i3, str3, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                        this.f29910h.mo50y(LqAnalyticsValues$LessonExitPath.LessonComplete);
                        if (!list3.isEmpty()) {
                            completeLessonUseCase$invoke$1.f29867a = null;
                            completeLessonUseCase$invoke$1.f29868b = null;
                            completeLessonUseCase$invoke$1.f29869c = i3;
                            completeLessonUseCase$invoke$1.f29872f = 5;
                            if (this.f29909g.mo4239l2(2000L, completeLessonUseCase$invoke$1) == coroutineSingletons) {
                            }
                        }
                        return xfaVar;
                    }
                }
            } else {
                completeLessonUseCase$invoke$1.f29867a = str5;
                completeLessonUseCase$invoke$1.f29868b = list4;
                completeLessonUseCase$invoke$1.f29869c = i4;
                completeLessonUseCase$invoke$1.f29872f = 1;
                if (((C1310z) this.f29904b).m7430i(str5, i4, list4, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            int i7 = completeLessonUseCase$invoke$1.f29869c;
            List list6 = completeLessonUseCase$invoke$1.f29868b;
            String str6 = completeLessonUseCase$invoke$1.f29867a;
            AbstractC3193b.m15359b(obj);
            i4 = i7;
            str5 = str6;
            list4 = list6;
        } else {
            if (i6 == 2) {
                i2 = completeLessonUseCase$invoke$1.f29869c;
                list2 = completeLessonUseCase$invoke$1.f29868b;
                str2 = completeLessonUseCase$invoke$1.f29867a;
                AbstractC3193b.m15359b(obj);
                List list7 = list2;
                i4 = i2;
                str5 = str2;
                list4 = list7;
                ((C1240a) this.f29908f).m7025f("Blue words remaining button click", null);
                completeLessonUseCase$invoke$1.f29867a = str5;
                completeLessonUseCase$invoke$1.f29868b = list4;
                completeLessonUseCase$invoke$1.f29869c = i4;
                completeLessonUseCase$invoke$1.f29872f = 3;
                if (this.f29905c.m8194a(i4, str5, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                    List list8 = list4;
                    str3 = str5;
                    i3 = i4;
                    list3 = list8;
                    str4 = null;
                    completeLessonUseCase$invoke$1.f29867a = str4;
                    completeLessonUseCase$invoke$1.f29868b = list3;
                    completeLessonUseCase$invoke$1.f29869c = i3;
                    completeLessonUseCase$invoke$1.f29872f = 4;
                    if (((C1295k) this.f29903a).m7272d0(i3, str3, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i6 == 3) {
                i3 = completeLessonUseCase$invoke$1.f29869c;
                list3 = completeLessonUseCase$invoke$1.f29868b;
                str3 = completeLessonUseCase$invoke$1.f29867a;
                AbstractC3193b.m15359b(obj);
                str4 = null;
                completeLessonUseCase$invoke$1.f29867a = str4;
                completeLessonUseCase$invoke$1.f29868b = list3;
                completeLessonUseCase$invoke$1.f29869c = i3;
                completeLessonUseCase$invoke$1.f29872f = 4;
                if (((C1295k) this.f29903a).m7272d0(i3, str3, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i6 != 4) {
                if (i6 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list9 = completeLessonUseCase$invoke$1.f29868b;
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            i3 = completeLessonUseCase$invoke$1.f29869c;
            list3 = completeLessonUseCase$invoke$1.f29868b;
            AbstractC3193b.m15359b(obj);
        }
        this.f29910h.mo50y(LqAnalyticsValues$LessonExitPath.LessonComplete);
        if (!list3.isEmpty()) {
            completeLessonUseCase$invoke$1.f29867a = null;
            completeLessonUseCase$invoke$1.f29868b = null;
            completeLessonUseCase$invoke$1.f29869c = i3;
            completeLessonUseCase$invoke$1.f29872f = 5;
            if (this.f29909g.mo4239l2(2000L, completeLessonUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        if (c3509qs.f58118b.getInt("lessonsCompleted", 0) == 1) {
            completeLessonUseCase$invoke$1.f29867a = str5;
            completeLessonUseCase$invoke$1.f29868b = list4;
            completeLessonUseCase$invoke$1.f29869c = i4;
            completeLessonUseCase$invoke$1.f29872f = 2;
            if (((C1368a) this.f29907e).m7852K(true, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                List list10 = list4;
                str2 = str5;
                i2 = i4;
                list2 = list10;
                List list11 = list2;
                i4 = i2;
                str5 = str2;
                list4 = list11;
                ((C1240a) this.f29908f).m7025f("Blue words remaining button click", null);
                completeLessonUseCase$invoke$1.f29867a = str5;
                completeLessonUseCase$invoke$1.f29868b = list4;
                completeLessonUseCase$invoke$1.f29869c = i4;
                completeLessonUseCase$invoke$1.f29872f = 3;
                if (this.f29905c.m8194a(i4, str5, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                    List list12 = list4;
                    str3 = str5;
                    i3 = i4;
                    list3 = list12;
                    str4 = null;
                    completeLessonUseCase$invoke$1.f29867a = str4;
                    completeLessonUseCase$invoke$1.f29868b = list3;
                    completeLessonUseCase$invoke$1.f29869c = i3;
                    completeLessonUseCase$invoke$1.f29872f = 4;
                    if (((C1295k) this.f29903a).m7272d0(i3, str3, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                        this.f29910h.mo50y(LqAnalyticsValues$LessonExitPath.LessonComplete);
                        if (!list3.isEmpty()) {
                            completeLessonUseCase$invoke$1.f29867a = null;
                            completeLessonUseCase$invoke$1.f29868b = null;
                            completeLessonUseCase$invoke$1.f29869c = i3;
                            completeLessonUseCase$invoke$1.f29872f = 5;
                            if (this.f29909g.mo4239l2(2000L, completeLessonUseCase$invoke$1) == coroutineSingletons) {
                            }
                        }
                        return xfaVar;
                    }
                }
            }
        } else {
            ((C1240a) this.f29908f).m7025f("Blue words remaining button click", null);
            completeLessonUseCase$invoke$1.f29867a = str5;
            completeLessonUseCase$invoke$1.f29868b = list4;
            completeLessonUseCase$invoke$1.f29869c = i4;
            completeLessonUseCase$invoke$1.f29872f = 3;
            if (this.f29905c.m8194a(i4, str5, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                List list13 = list4;
                str3 = str5;
                i3 = i4;
                list3 = list13;
                str4 = null;
                completeLessonUseCase$invoke$1.f29867a = str4;
                completeLessonUseCase$invoke$1.f29868b = list3;
                completeLessonUseCase$invoke$1.f29869c = i3;
                completeLessonUseCase$invoke$1.f29872f = 4;
                if (((C1295k) this.f29903a).m7272d0(i3, str3, completeLessonUseCase$invoke$1) != coroutineSingletons) {
                    this.f29910h.mo50y(LqAnalyticsValues$LessonExitPath.LessonComplete);
                    if (!list3.isEmpty()) {
                        completeLessonUseCase$invoke$1.f29867a = null;
                        completeLessonUseCase$invoke$1.f29868b = null;
                        completeLessonUseCase$invoke$1.f29869c = i3;
                        completeLessonUseCase$invoke$1.f29872f = 5;
                        if (this.f29909g.mo4239l2(2000L, completeLessonUseCase$invoke$1) == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
            }
        }
        return coroutineSingletons;
    }
}
