package com.lingq.feature.reader.milestones;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.domain.model.milestones.AbstractC1479h;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.LessonAchievement;
import com.lingq.core.domain.model.milestones.LessonAchievementData$DailyGoal;
import com.lingq.core.domain.model.milestones.LessonAchievementData$KnownWords;
import com.lingq.core.domain.model.milestones.LessonAchievementData$Level;
import com.lingq.core.domain.model.milestones.LessonAchievementData$StreakMilestone;
import com.lingq.core.domain.model.milestones.LessonAchievementType;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.feature.reader.milestones.domain.C2270b;
import com.lingq.feature.reader.milestones.state.C2272a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.cz5;
import p000.dl8;
import p000.e83;
import p000.fa4;
import p000.gm5;
import p000.go3;
import p000.h24;
import p000.hi8;
import p000.ho3;
import p000.hx4;
import p000.io3;
import p000.jo3;
import p000.jx4;
import p000.ke2;
import p000.ko3;
import p000.lx4;
import p000.nx7;
import p000.u66;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.yf4;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2267a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2268b f28165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f28166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28167c;

    public C2267a(C2268b c2268b, int i, String str) {
        this.f28165a = c2268b;
        this.f28166b = i;
        this.f28167c = str;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(go3 go3Var, Continuation continuation) throws Throwable {
        ReaderMilestonesManager$start$1$1$emit$1 readerMilestonesManager$start$1$1$emit$1;
        String str;
        Object objM2861d;
        String strM10322b;
        Object next;
        Milestone milestone;
        Milestone milestone2;
        Milestone milestone3;
        Milestone milestone4;
        Object next2;
        Milestone milestone5;
        int i;
        Milestone milestone6;
        Milestone milestone7;
        Milestone milestone8;
        Milestone milestone9;
        Milestone milestone10;
        Object next3;
        DailyGoalMet dailyGoalMet;
        int i2;
        DailyGoalMet dailyGoalMet2;
        DailyGoalMet dailyGoalMet3;
        DailyGoalMet dailyGoalMet4;
        DailyGoalMet dailyGoalMet5;
        Integer num;
        Integer numValueOf;
        DailyGoalMet dailyGoalMet6;
        Object next4;
        DailyGoalMet dailyGoalMet7;
        char c;
        DailyGoalMet dailyGoalMet8;
        char c2;
        DailyGoalMet dailyGoalMet9;
        DailyGoalMet dailyGoalMet10;
        DailyGoalMet dailyGoalMet11;
        DailyGoalMet dailyGoalMet12;
        char c3;
        Milestone milestone11;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        Milestone milestone12;
        go3 go3Var2 = go3Var;
        C2268b c2268b = this.f28165a;
        cz5 cz5Var = c2268b.f28168a;
        if (continuation instanceof ReaderMilestonesManager$start$1$1$emit$1) {
            readerMilestonesManager$start$1$1$emit$1 = (ReaderMilestonesManager$start$1$1$emit$1) continuation;
            int i3 = readerMilestonesManager$start$1$1$emit$1.f28161d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                readerMilestonesManager$start$1$1$emit$1.f28161d = i3 - Integer.MIN_VALUE;
            } else {
                readerMilestonesManager$start$1$1$emit$1 = new ReaderMilestonesManager$start$1$1$emit$1(this, continuation);
            }
        } else {
            readerMilestonesManager$start$1$1$emit$1 = new ReaderMilestonesManager$start$1$1$emit$1(this, continuation);
        }
        Object objM9281a = readerMilestonesManager$start$1$1$emit$1.f28159b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = readerMilestonesManager$start$1$1$emit$1.f28161d;
        xfa xfaVar = xfa.f68157a;
        int i5 = 1;
        String str4 = null;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM9281a);
            u66 u66VarMo7010a = cz5Var.mo7010a();
            Boolean bool = Boolean.TRUE;
            C3244l c3244l = (C3244l) u66VarMo7010a;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C2270b c2270b = c2268b.f28169b;
            readerMilestonesManager$start$1$1$emit$1.f28158a = go3Var2;
            readerMilestonesManager$start$1$1$emit$1.f28161d = 1;
            objM9281a = c2270b.m9281a(go3Var2, readerMilestonesManager$start$1$1$emit$1);
            if (objM9281a != coroutineSingletons) {
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                AbstractC3193b.m15359b(objM9281a);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        go3Var2 = readerMilestonesManager$start$1$1$emit$1.f28158a;
        AbstractC3193b.m15359b(objM9281a);
        ko3 ko3Var = (ko3) objM9281a;
        if (!(ko3Var instanceof io3)) {
            if (fa4.m11650l(ko3Var, jo3.f45909a)) {
                C3244l c3244l2 = c2268b.f28174g;
                Boolean bool2 = Boolean.TRUE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool2);
                return xfaVar;
            }
            if (fa4.m11650l(ko3Var, ho3.f42685a)) {
                cz5Var.mo7016z1(go3Var2);
                return xfaVar;
            }
            gm5.m12750e();
            return null;
        }
        C2272a c2272a = c2268b.f28172e;
        io3 io3Var = (io3) ko3Var;
        go3 go3Var3 = io3Var.f44354b;
        h24 h24Var = io3Var.f44353a;
        go3Var3.getClass();
        ArrayList arrayList = c2272a.f28214c;
        if (arrayList != null && arrayList.isEmpty()) {
            arrayList.add(new nx7(h24Var, go3Var3));
            c2272a.m9284b();
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                arrayList.add(new nx7(h24Var, go3Var3));
                c2272a.m9284b();
                break;
            }
        } while (((nx7) it.next()).f53363a.f41695a != h24Var.f41695a);
        hi8 hi8Var = c2268b.f28171d;
        List listM23604J = vz1.m23604J(go3Var3);
        readerMilestonesManager$start$1$1$emit$1.f28158a = null;
        readerMilestonesManager$start$1$1$emit$1.f28161d = 2;
        ArrayList<LessonAchievement> arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = listM23604J.iterator();
        while (true) {
            String str5 = "daily_goal";
            str = str4;
            if (!it2.hasNext()) {
                break;
            }
            Object next5 = it2.next();
            go3 go3Var4 = (go3) next5;
            int i6 = dl8.f35795a[go3Var4.f41066a.ordinal()];
            if (i6 != i5) {
                c3 = 2;
                if (i6 == 2) {
                    str5 = "streak_milestone";
                } else if (i6 != 3) {
                    str5 = str;
                } else {
                    Object obj = go3Var4.f41067b;
                    if (obj instanceof Milestone) {
                        milestone12 = (Milestone) obj;
                    } else {
                        milestone11 = str;
                    }
                    if (milestone11 == 0 || (str3 = milestone11.f19533b) == null) {
                        milestone11 = milestone12;
                        milestone11 = milestone12;
                        z = false;
                        z2 = true;
                    } else {
                        z = false;
                        z2 = true;
                        if (vk9.m23380c0(str3, "known_words", false)) {
                            milestone11 = milestone12;
                            str5 = "known_words";
                        }
                    }
                    if (milestone11 == 0 || (str2 = milestone11.f19533b) == null || vk9.m23380c0(str2, "level", z) != z2) {
                        str5 = str;
                    } else {
                        str5 = "level";
                    }
                }
            } else {
                c3 = 2;
            }
            Object arrayList3 = linkedHashMap.get(str5);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str5, arrayList3);
            }
            ((List) arrayList3).add(next5);
            str4 = str;
            i5 = 1;
        }
        List list = (List) linkedHashMap.get("daily_goal");
        int i7 = this.f28166b;
        String str6 = this.f28167c;
        if (list != null) {
            Iterator it3 = list.iterator();
            if (it3.hasNext()) {
                next4 = it3.next();
                if (it3.hasNext()) {
                    Object obj2 = ((go3) next4).f41067b;
                    if (obj2 instanceof DailyGoalMet) {
                        dailyGoalMet10 = (DailyGoalMet) obj2;
                    } else {
                        dailyGoalMet7 = str;
                    }
                    if (dailyGoalMet7 == 0 || !dailyGoalMet7.f19518e) {
                        dailyGoalMet7 = dailyGoalMet10;
                        dailyGoalMet7 = dailyGoalMet10;
                        c = 0;
                    } else {
                        dailyGoalMet7 = dailyGoalMet10;
                        c = 1;
                    }
                    while (true) {
                        Object next6 = it3.next();
                        Object obj3 = ((go3) next6).f41067b;
                        Iterator it4 = it3;
                        if (obj3 instanceof DailyGoalMet) {
                            dailyGoalMet9 = (DailyGoalMet) obj3;
                        } else {
                            dailyGoalMet8 = str;
                        }
                        if (dailyGoalMet8 == 0 || !dailyGoalMet8.f19518e) {
                            dailyGoalMet8 = dailyGoalMet9;
                            dailyGoalMet8 = dailyGoalMet9;
                            c2 = 0;
                        } else {
                            c2 = 1;
                        }
                        if (c < c2) {
                            dailyGoalMet8 = dailyGoalMet9;
                            next4 = next6;
                            c = c2;
                        }
                        dailyGoalMet8 = dailyGoalMet9;
                        if (!it4.hasNext()) {
                            break;
                        }
                        it3 = it4;
                    }
                }
            } else {
                next4 = str;
            }
            go3 go3Var5 = (go3) next4;
            Object obj4 = go3Var5 != null ? go3Var5.f41067b : str;
            if (obj4 instanceof DailyGoalMet) {
                dailyGoalMet12 = (DailyGoalMet) obj4;
            } else {
                dailyGoalMet11 = str;
            }
            if (dailyGoalMet11 != 0) {
                dailyGoalMet11 = dailyGoalMet12;
                arrayList2.add(new LessonAchievement(i7, str6, LessonAchievementType.DailyGoal, new LessonAchievementData$DailyGoal(dailyGoalMet11)));
            }
        }
        dailyGoalMet11 = dailyGoalMet12;
        List list2 = (List) linkedHashMap.get("streak_milestone");
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            if (it5.hasNext()) {
                next3 = it5.next();
                if (it5.hasNext()) {
                    Object obj5 = ((go3) next3).f41067b;
                    if (obj5 instanceof DailyGoalMet) {
                        dailyGoalMet4 = (DailyGoalMet) obj5;
                    } else {
                        dailyGoalMet = str;
                    }
                    if (dailyGoalMet != 0) {
                        dailyGoalMet = dailyGoalMet4;
                        i2 = dailyGoalMet.f19520g;
                    } else {
                        dailyGoalMet = dailyGoalMet4;
                        i2 = 0;
                    }
                    do {
                        Object next7 = it5.next();
                        Object obj6 = ((go3) next7).f41067b;
                        if (obj6 instanceof DailyGoalMet) {
                            dailyGoalMet3 = (DailyGoalMet) obj6;
                        } else {
                            dailyGoalMet2 = str;
                        }
                        int i8 = dailyGoalMet2 != 0 ? dailyGoalMet2.f19520g : 0;
                        if (i2 < i8) {
                            dailyGoalMet2 = dailyGoalMet3;
                            dailyGoalMet2 = dailyGoalMet3;
                            next3 = next7;
                            i2 = i8;
                        }
                        dailyGoalMet2 = dailyGoalMet3;
                        dailyGoalMet2 = dailyGoalMet3;
                    } while (it5.hasNext());
                }
            } else {
                next3 = str;
            }
            go3 go3Var6 = (go3) next3;
            Object obj7 = go3Var6 != null ? go3Var6.f41067b : str;
            if (obj7 instanceof DailyGoalMet) {
                dailyGoalMet6 = (DailyGoalMet) obj7;
            } else {
                dailyGoalMet5 = str;
            }
            if (dailyGoalMet5 != 0) {
                numValueOf = Integer.valueOf(dailyGoalMet5.f19520g);
            } else {
                num = str;
            }
            if (num != 0) {
                dailyGoalMet5 = dailyGoalMet6;
                if (num.intValue() > 0) {
                    dailyGoalMet5 = dailyGoalMet6;
                    num = numValueOf;
                    arrayList2.add(new LessonAchievement(i7, str6, LessonAchievementType.StreakMilestone, new LessonAchievementData$StreakMilestone(num.intValue())));
                }
            }
        }
        dailyGoalMet5 = dailyGoalMet6;
        dailyGoalMet5 = dailyGoalMet6;
        num = numValueOf;
        dailyGoalMet5 = dailyGoalMet6;
        num = numValueOf;
        List list3 = (List) linkedHashMap.get("known_words");
        if (list3 != null) {
            Iterator it6 = list3.iterator();
            if (it6.hasNext()) {
                next2 = it6.next();
                if (it6.hasNext()) {
                    Object obj8 = ((go3) next2).f41067b;
                    if (obj8 instanceof Milestone) {
                        milestone8 = (Milestone) obj8;
                    } else {
                        milestone5 = str;
                    }
                    if (milestone5 != 0) {
                        milestone5 = milestone8;
                        i = milestone5.f19534c;
                    } else {
                        milestone5 = milestone8;
                        i = 0;
                    }
                    do {
                        Object next8 = it6.next();
                        Object obj9 = ((go3) next8).f41067b;
                        if (obj9 instanceof Milestone) {
                            milestone7 = (Milestone) obj9;
                        } else {
                            milestone6 = str;
                        }
                        int i9 = milestone6 != 0 ? milestone6.f19534c : 0;
                        if (i < i9) {
                            milestone6 = milestone7;
                            milestone6 = milestone7;
                            next2 = next8;
                            i = i9;
                        }
                        milestone6 = milestone7;
                        milestone6 = milestone7;
                    } while (it6.hasNext());
                }
            } else {
                next2 = str;
            }
            go3 go3Var7 = (go3) next2;
            Object obj10 = go3Var7 != null ? go3Var7.f41067b : str;
            if (obj10 instanceof Milestone) {
                milestone10 = (Milestone) obj10;
            } else {
                milestone9 = str;
            }
            if (milestone9 != 0) {
                milestone9 = milestone10;
                arrayList2.add(new LessonAchievement(i7, str6, LessonAchievementType.KnownWords, new LessonAchievementData$KnownWords(milestone9.f19534c, str6)));
            }
        }
        milestone9 = milestone10;
        List list4 = (List) linkedHashMap.get("level");
        if (list4 != null) {
            Iterator it7 = list4.iterator();
            if (it7.hasNext()) {
                next = it7.next();
                if (it7.hasNext()) {
                    Object obj11 = ((go3) next).f41067b;
                    Milestone milestone13 = obj11 instanceof Milestone ? (Milestone) obj11 : str;
                    int i10 = milestone13 != 0 ? milestone13.f19534c : -1;
                    do {
                        Object next9 = it7.next();
                        Object obj12 = ((go3) next9).f41067b;
                        if (obj12 instanceof Milestone) {
                            milestone2 = (Milestone) obj12;
                        } else {
                            milestone = str;
                        }
                        int i11 = milestone != 0 ? milestone.f19534c : -1;
                        if (i10 < i11) {
                            milestone = milestone2;
                            milestone = milestone2;
                            next = next9;
                            i10 = i11;
                        }
                        milestone = milestone2;
                        milestone = milestone2;
                    } while (it7.hasNext());
                }
            } else {
                next = str;
            }
            go3 go3Var8 = (go3) next;
            Object obj13 = go3Var8 != null ? go3Var8.f41067b : str;
            if (obj13 instanceof Milestone) {
                milestone4 = (Milestone) obj13;
            } else {
                milestone3 = str;
            }
            if (milestone3 != 0) {
                milestone3 = milestone4;
                arrayList2.add(new LessonAchievement(i7, str6, LessonAchievementType.Level, new LessonAchievementData$Level(milestone3.f19536e, milestone3.f19533b)));
            }
        }
        milestone3 = milestone4;
        if (arrayList2.isEmpty()) {
            objM2861d = xfaVar;
        } else {
            lx4 lx4Var = (lx4) hi8Var.f42410b;
            hx4 hx4Var = lx4Var.f50239a;
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList2, 10));
            for (LessonAchievement lessonAchievement : arrayList2) {
                yf4 yf4Var = lx4Var.f50240b;
                AbstractC1479h abstractC1479h = lessonAchievement.f19525d;
                if (abstractC1479h instanceof LessonAchievementData$DailyGoal) {
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(AbstractC1479h.Companion.serializer(), abstractC1479h);
                } else if (abstractC1479h instanceof LessonAchievementData$StreakMilestone) {
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(AbstractC1479h.Companion.serializer(), abstractC1479h);
                } else if (abstractC1479h instanceof LessonAchievementData$KnownWords) {
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(AbstractC1479h.Companion.serializer(), abstractC1479h);
                } else {
                    if (!(abstractC1479h instanceof LessonAchievementData$Level)) {
                        gm5.m12750e();
                        return str;
                    }
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(AbstractC1479h.Companion.serializer(), abstractC1479h);
                }
                arrayList4.add(new jx4(lessonAchievement.f19523b, lessonAchievement.f19522a, lessonAchievement.f19524c.getKey(), strM10322b));
            }
            objM2861d = AbstractC0758a.m2861d(new ke2(17, hx4Var, arrayList4), hx4Var.f43096a, readerMilestonesManager$start$1$1$emit$1, false, true);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM2861d != coroutineSingletons2) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons2) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons2) {
                objM2861d = xfaVar;
            }
        }
        return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
