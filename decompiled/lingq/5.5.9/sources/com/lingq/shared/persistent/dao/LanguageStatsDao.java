package com.lingq.shared.persistent.dao;

import android.support.v4.media.AbstractC0140a;
import com.lingq.entity.Streak;
import com.lingq.entity.StudyStats;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7136q;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class LanguageStatsDao extends AbstractC0140a {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u0 */
    public static Object m9473u0(LanguageStatsDao languageStatsDao, String str, int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageStatsDao$repairStreak$1 languageStatsDao$repairStreak$1;
        if (interfaceC9968c instanceof LanguageStatsDao$repairStreak$1) {
            languageStatsDao$repairStreak$1 = (LanguageStatsDao$repairStreak$1) interfaceC9968c;
            int i11 = languageStatsDao$repairStreak$1.f19380i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageStatsDao$repairStreak$1.f19380i = i11 - Integer.MIN_VALUE;
            } else {
                languageStatsDao$repairStreak$1 = new LanguageStatsDao$repairStreak$1(languageStatsDao, interfaceC9968c);
            }
        } else {
            languageStatsDao$repairStreak$1 = new LanguageStatsDao$repairStreak$1(languageStatsDao, interfaceC9968c);
        }
        Object obj = languageStatsDao$repairStreak$1.f19378g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageStatsDao$repairStreak$1.f19380i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = languageStatsDao$repairStreak$1.f19377f;
                str = languageStatsDao$repairStreak$1.f19376e;
                languageStatsDao = languageStatsDao$repairStreak$1.f19375d;
                C7499b.m14977z0(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageStatsDao$repairStreak$1.f19375d = languageStatsDao;
        languageStatsDao$repairStreak$1.f19376e = str;
        languageStatsDao$repairStreak$1.f19377f = i10;
        languageStatsDao$repairStreak$1.f19380i = 1;
        if (languageStatsDao.mo5037y0(str, languageStatsDao$repairStreak$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageStatsDao$repairStreak$1.f19375d = null;
        languageStatsDao$repairStreak$1.f19376e = null;
        languageStatsDao$repairStreak$1.f19380i = 2;
        if (languageStatsDao.mo5038z0(i10, str, languageStatsDao$repairStreak$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract Object mo5023A0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: k0 */
    public abstract void mo5024k0(String str, String str2, String str3, ArrayList arrayList);

    /* JADX INFO: renamed from: l0 */
    public abstract C7136q mo5025l0(String str, String str2);

    /* JADX INFO: renamed from: m0 */
    public abstract C7136q mo5026m0(String str, String str2, String str3);

    /* JADX INFO: renamed from: n0 */
    public abstract C7136q mo5027n0(String str);

    /* JADX INFO: renamed from: o0 */
    public abstract C7136q mo5028o0(String str);

    /* JADX INFO: renamed from: p0 */
    public abstract Object mo5029p0(String str, InterfaceC9968c<? super UserLanguageStudyStats> interfaceC9968c);

    /* JADX INFO: renamed from: q0 */
    public abstract Object mo5030q0(ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: r0 */
    public abstract Object mo5031r0(StudyStats studyStats, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: s0 */
    public abstract Object mo5032s0(Streak streak, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: t0 */
    public Object mo5033t0(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return m9473u0(this, str, i10, interfaceC9968c);
    }

    /* JADX INFO: renamed from: v0 */
    public abstract Object mo5034v0(String str, String str2, double d10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: w0 */
    public abstract Object mo5035w0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: x0 */
    public abstract Object mo5036x0(String str, String str2, double d10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: y0 */
    public abstract Object mo5037y0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: z0 */
    public abstract Object mo5038z0(int i10, String str, InterfaceC9968c interfaceC9968c);
}
