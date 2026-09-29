package com.lingq.core.domain.stats;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.ActivityLevel;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.language.StudyStatsScores;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Instant;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.UtcOffset;
import p000.C3386nv;
import p000.a84;
import p000.c32;
import p000.cgd;
import p000.dx1;
import p000.fj9;
import p000.g63;
import p000.g74;
import p000.g84;
import p000.h84;
import p000.kad;
import p000.kuc;
import p000.m22;
import p000.mj9;
import p000.q7d;
import p000.r22;
import p000.si7;
import p000.u91;
import p000.v0a;
import p000.v91;
import p000.vi7;
import p000.vz1;
import p000.xfa;
import p000.xh5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.stats.StreakWeekUseCase$invoke$2$1", m4291f = "StreakWeekUseCase.kt", m4292l = {68, 102}, m4293m = "invokeSuspend", m4294v = 2)
final class StreakWeekUseCase$invoke$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ArrayList f19977a;

    /* JADX INFO: renamed from: b */
    public dx1 f19978b;

    /* JADX INFO: renamed from: c */
    public ArrayList f19979c;

    /* JADX INFO: renamed from: d */
    public int f19980d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19981e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProfileAccount f19982f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1529d f19983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakWeekUseCase$invoke$2$1(ProfileAccount profileAccount, C1529d c1529d, Continuation continuation) {
        super(2, continuation);
        this.f19982f = profileAccount;
        this.f19983g = c1529d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StreakWeekUseCase$invoke$2$1 streakWeekUseCase$invoke$2$1 = new StreakWeekUseCase$invoke$2$1(this.f19982f, this.f19983g, continuation);
        streakWeekUseCase$invoke$2$1.f19981e = obj;
        return streakWeekUseCase$invoke$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StreakWeekUseCase$invoke$2$1) create((LanguageStudyStats) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:44:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0149 A[LOOP:3: B:49:0x0147->B:50:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        if (r0 == r3) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        ArrayList arrayList;
        int i;
        Object objM15541t;
        String str2;
        Object objM15541t2;
        dx1 dx1Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        List listM15050c;
        String str3;
        ArrayList arrayList4;
        int i2;
        int i3;
        ActivityLevel activityLevel;
        int i4;
        String str4;
        String str5;
        int size;
        String str6;
        si7 si7Var = this.f19983g.f19991c;
        LanguageStudyStats languageStudyStats = (LanguageStudyStats) this.f19981e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.f19980d;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            String str7 = this.f19982f.f19690n;
            if (str7 != null) {
                Instant instantMo3285e = g74.f40314a.mo3285e();
                r22.Companion.getClass();
                m22 m22Var = r22.f58514a;
                g63 g63Var = v0a.f64669b;
                instantMo3285e.getClass();
                m22Var.getClass();
                g63Var.getClass();
                try {
                    UtcOffset utcOffsetM19711b = q7d.m19711b(instantMo3285e, g63Var);
                    LocalDateTime localDateTimeM4647a = cgd.m4647a(instantMo3285e, utcOffsetM19711b);
                    str2 = "";
                    LocalDate localDateM24517a = xh5.m24517a(localDateTimeM4647a.m15603a(), 7L, m22Var);
                    LocalTime localTime = localDateTimeM4647a.f48189a.toLocalTime();
                    localTime.getClass();
                    Instant instantM19710a = q7d.m19710a(new LocalDateTime(localDateM24517a, new kotlinx.datetime.LocalTime(localTime)), g63Var, utcOffsetM19711b);
                    instantM19710a.getClass();
                    if (str7.compareTo(kuc.m15695a(instantM19710a)) > 0) {
                        StudyStatsScores studyStatsScores = (StudyStatsScores) u91.m22597O0(languageStudyStats.f19111f);
                        String str8 = studyStatsScores.f19127b;
                        String str9 = str8 == null ? str2 : str8;
                        int i6 = studyStatsScores.f19128c;
                        int i7 = languageStudyStats.f19107b;
                        ActivityLevel activityLevel2 = studyStatsScores.f19129d;
                        dx1 dx1Var2 = new dx1(i6, i7, activityLevel2 != null ? activityLevel2.f19003a : languageStudyStats.f19112g, str9, i6 >= i7);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(studyStatsScores);
                        List listM22610b1 = u91.m22610b1(languageStudyStats.f19111f);
                        for (int i8 = 1; i8 < listM22610b1.size() && ((StudyStatsScores) listM22610b1.get(i8)).f19128c >= languageStudyStats.f19107b; i8++) {
                            arrayList5.add(listM22610b1.get(i8));
                        }
                        Collections.reverse(arrayList5);
                        vi7 vi7Var = ((C1368a) si7Var).f18356L0;
                        this.f19981e = languageStudyStats;
                        this.f19977a = null;
                        this.f19978b = dx1Var2;
                        this.f19979c = arrayList5;
                        this.f19980d = 1;
                        objM15541t2 = AbstractC3224d.m15541t(vi7Var, this);
                        if (objM15541t2 != coroutineSingletons) {
                            dx1Var = dx1Var2;
                            arrayList2 = arrayList5;
                            String str10 = (String) objM15541t2;
                            arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                str6 = ((StudyStatsScores) it.next()).f19126a;
                                if (str6 == null) {
                                    str6 = str2;
                                }
                                arrayList3.add(str6);
                            }
                            listM15050c = kad.m15050c(str10, arrayList3);
                            if (arrayList2.size() < 7) {
                                for (size = arrayList2.size(); size < 7; size++) {
                                    String str11 = str2;
                                    arrayList2.add(new StudyStatsScores(str11, str11, 0, new ActivityLevel(0, 0)));
                                }
                            }
                            str3 = str2;
                            int i9 = languageStudyStats.f19108c;
                            arrayList4 = new ArrayList(v91.m23189q0(arrayList2, 10));
                            i2 = 0;
                            for (Object obj2 : arrayList2) {
                                i3 = i2 + 1;
                                if (i2 >= 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                StudyStatsScores studyStatsScores2 = (StudyStatsScores) obj2;
                                String str12 = (String) listM15050c.get(i2);
                                int i10 = studyStatsScores2.f19128c;
                                int i11 = languageStudyStats.f19107b;
                                activityLevel = studyStatsScores2.f19129d;
                                if (activityLevel != null) {
                                    i4 = activityLevel.f19003a;
                                } else {
                                    i4 = languageStudyStats.f19112g;
                                }
                                int i12 = i4;
                                str4 = studyStatsScores2.f19126a;
                                if (str4 == null) {
                                    str5 = str3;
                                } else {
                                    str5 = str4;
                                }
                                arrayList4.add(new mj9(str12, i10, str5, i11, i12));
                                i2 = i3;
                            }
                            return new fj9(i9, arrayList4, dx1Var, 0);
                        }
                    } else {
                        str = str2;
                    }
                    return coroutineSingletons;
                } catch (ArithmeticException e) {
                    throw new DateTimeArithmeticException("Arithmetic overflow when adding to an Instant", e);
                } catch (IllegalArgumentException e2) {
                    throw new DateTimeArithmeticException("Boundaries of Instant exceeded when adding a value", e2);
                }
            }
            str = "";
            List list = languageStudyStats.f19111f;
            java.time.LocalDate localDateNow = java.time.LocalDate.now();
            List list2 = list;
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj3 : list2) {
                linkedHashMap.put(((StudyStatsScores) obj3).f19126a, obj3);
            }
            g84 g84Var = new g84(6, 0, -1);
            arrayList = new ArrayList(v91.m23189q0(g84Var, 10));
            Iterator it2 = g84Var.iterator();
            while (((h84) it2).f41941c) {
                String string = localDateNow.minusDays(((a84) it2).nextInt()).toString();
                string.getClass();
                StudyStatsScores studyStatsScores3 = (StudyStatsScores) linkedHashMap.get(string);
                if (studyStatsScores3 == null) {
                    studyStatsScores3 = new StudyStatsScores(string, null, 0, new ActivityLevel(0, 0));
                }
                arrayList.add(studyStatsScores3);
            }
            i = 0;
            vi7 vi7Var2 = ((C1368a) si7Var).f18356L0;
            this.f19981e = languageStudyStats;
            this.f19977a = arrayList;
            this.f19980d = 2;
            objM15541t = AbstractC3224d.m15541t(vi7Var2, this);
        } else {
            if (i5 == 1) {
                arrayList2 = this.f19979c;
                dx1Var = this.f19978b;
                AbstractC3193b.m15359b(obj);
                objM15541t2 = obj;
                str2 = "";
                String str13 = (String) objM15541t2;
                arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    str6 = ((StudyStatsScores) it.next()).f19126a;
                    if (str6 == null) {
                        str6 = str2;
                    }
                    arrayList3.add(str6);
                }
                listM15050c = kad.m15050c(str13, arrayList3);
                if (arrayList2.size() < 7) {
                    while (size < 7) {
                        String str14 = str2;
                        arrayList2.add(new StudyStatsScores(str14, str14, 0, new ActivityLevel(0, 0)));
                    }
                }
                str3 = str2;
                int i13 = languageStudyStats.f19108c;
                arrayList4 = new ArrayList(v91.m23189q0(arrayList2, 10));
                i2 = 0;
                while (r1.hasNext()) {
                    i3 = i2 + 1;
                    if (i2 >= 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    StudyStatsScores studyStatsScores4 = (StudyStatsScores) obj2;
                    String str15 = (String) listM15050c.get(i2);
                    int i14 = studyStatsScores4.f19128c;
                    int i15 = languageStudyStats.f19107b;
                    activityLevel = studyStatsScores4.f19129d;
                    if (activityLevel != null) {
                        i4 = activityLevel.f19003a;
                    } else {
                        i4 = languageStudyStats.f19112g;
                    }
                    int i16 = i4;
                    str4 = studyStatsScores4.f19126a;
                    if (str4 == null) {
                        str5 = str3;
                    } else {
                        str5 = str4;
                    }
                    arrayList4.add(new mj9(str15, i14, str5, i15, i16));
                    i2 = i3;
                }
                return new fj9(i13, arrayList4, dx1Var, 0);
            }
            if (i5 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList6 = this.f19977a;
            AbstractC3193b.m15359b(obj);
            str = "";
            i = 0;
            arrayList = arrayList6;
            objM15541t = obj;
            String str16 = (String) objM15541t;
            ArrayList arrayList7 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str17 = ((StudyStatsScores) it3.next()).f19126a;
                if (str17 == null) {
                    str17 = str;
                }
                arrayList7.add(str17);
            }
            List listM15050c2 = kad.m15050c(str16, arrayList7);
            StudyStatsScores studyStatsScores5 = (StudyStatsScores) u91.m22597O0(arrayList);
            String str18 = (String) u91.m22598P0(listM15050c2);
            String str19 = (str18 == null && (str18 = studyStatsScores5.f19127b) == null) ? str : str18;
            int i17 = studyStatsScores5.f19128c;
            int i18 = languageStudyStats.f19107b;
            int i19 = languageStudyStats.f19112g;
            ActivityLevel activityLevel3 = studyStatsScores5.f19129d;
            dx1 dx1Var3 = new dx1(i17, i18, activityLevel3 != null ? activityLevel3.f19003a : i19, str19, i17 >= i18 ? 1 : i);
            int i20 = languageStudyStats.f19108c;
            ArrayList arrayList8 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (true) {
                int i21 = i;
                if (!it4.hasNext()) {
                    return new fj9(i20, arrayList8, dx1Var3, languageStudyStats.f19109d);
                }
                Object next = it4.next();
                i = i21 + 1;
                if (i21 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                StudyStatsScores studyStatsScores6 = (StudyStatsScores) next;
                String str20 = (String) listM15050c2.get(i21);
                int i22 = studyStatsScores6.f19128c;
                int i23 = languageStudyStats.f19107b;
                ActivityLevel activityLevel4 = studyStatsScores6.f19129d;
                int i24 = activityLevel4 != null ? activityLevel4.f19003a : i19;
                String str21 = studyStatsScores6.f19126a;
                arrayList8.add(new mj9(str20, i22, str21 == null ? str : str21, i23, i24));
            }
        }
    }
}
