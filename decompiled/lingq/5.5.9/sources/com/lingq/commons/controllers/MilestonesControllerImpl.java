package com.lingq.commons.controllers;

import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2013f;
import ci.InterfaceC2016i;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.shared.util.GoalMetType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7142w;
import ni.C7794b;
import p015ak.InterfaceC0113j;
import p096ei.C5409b;
import p244lh.InterfaceC7366c;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class MilestonesControllerImpl implements InterfaceC7366c, InterfaceC0113j, InterfaceC7367d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2016i f16533a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2013f f16534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0113j f16535c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC7367d f16536d;

    public MilestonesControllerImpl(InterfaceC2016i interfaceC2016i, InterfaceC2013f interfaceC2013f, InterfaceC0113j interfaceC0113j, InterfaceC7367d interfaceC7367d) {
        C5207g.m11111f(interfaceC2016i, "milestoneRepository");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7367d, "milestonesControllerDelegate");
        this.f16533a = interfaceC2016i;
        this.f16534b = interfaceC2013f;
        this.f16535c = interfaceC0113j;
        this.f16536d = interfaceC7367d;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f16535c.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16535c.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: D1 */
    public final void mo9321D1(List<C7794b> list) {
        this.f16536d.mo9321D1(list);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f16535c.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16535c.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f16535c.mo500P();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7133n<Boolean> mo9322a() {
        return this.f16536d.mo9322a();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16535c.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f16535c;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16535c.mo503f1(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: h2 */
    public final void mo9324h2(C7794b c7794b) {
        this.f16536d.mo9324h2(c7794b);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f16535c.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16535c.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f16535c.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f16535c.mo507p1();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126 A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012e A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140 A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ff A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0202  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208 A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x023f A[Catch: Exception -> 0x028c, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0242  */
    /* JADX WARN: Code duplicated, block: B:90:0x0256 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x0272 A[Catch: Exception -> 0x028c, LOOP:0: B:93:0x026c->B:95:0x0272, LOOP_END, TryCatch #0 {Exception -> 0x028c, blocks: (B:13:0x0040, B:92:0x0259, B:93:0x026c, B:95:0x0272, B:96:0x0283, B:16:0x004f, B:56:0x010c, B:57:0x0120, B:59:0x0126, B:61:0x012e, B:64:0x0137, B:67:0x0140, B:69:0x0147, B:73:0x015a, B:75:0x01ff, B:77:0x0204, B:79:0x0208, B:81:0x0213, B:83:0x0224, B:82:0x021d, B:84:0x0233, B:86:0x023f, B:88:0x0244, B:19:0x005e, B:53:0x00f5, B:22:0x006b, B:47:0x00d2, B:49:0x00db, B:25:0x0077, B:39:0x00b1, B:41:0x00bb, B:43:0x00bf, B:28:0x007d, B:35:0x0097, B:31:0x0085), top: B:102:0x002f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    @Override // p244lh.InterfaceC7366c
    /* JADX INFO: renamed from: s */
    public final Object mo9326s(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        MilestonesControllerImpl$trackMilestones$1 milestonesControllerImpl$trackMilestones$1;
        MilestonesControllerImpl milestonesControllerImpl;
        String str;
        Object objMo6080a;
        String str2;
        C5409b c5409b;
        int i10;
        Object objMo6082c;
        MilestonesControllerImpl milestonesControllerImpl2;
        String str3;
        C5409b c5409b2;
        List list;
        String str4;
        C5409b c5409b3;
        List<UserMilestone> list2;
        InterfaceC2013f interfaceC2013f;
        String strMo498E1;
        UserLanguageStudyStats userLanguageStudyStats;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        List<C7794b> list3;
        MilestonesControllerImpl milestonesControllerImpl3;
        ?? r18;
        ?? r19;
        ?? r17;
        boolean zM14278X2;
        DailyGoalMet dailyGoalMet;
        ?? r20;
        int i12;
        C7794b c7794b;
        ArrayList arrayList4;
        Iterator it;
        if (interfaceC9968c instanceof MilestonesControllerImpl$trackMilestones$1) {
            milestonesControllerImpl$trackMilestones$1 = (MilestonesControllerImpl$trackMilestones$1) interfaceC9968c;
            int i13 = milestonesControllerImpl$trackMilestones$1.f16543j;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                milestonesControllerImpl$trackMilestones$1.f16543j = i13 - Integer.MIN_VALUE;
            } else {
                milestonesControllerImpl$trackMilestones$1 = new MilestonesControllerImpl$trackMilestones$1(this, interfaceC9968c);
            }
        } else {
            milestonesControllerImpl$trackMilestones$1 = new MilestonesControllerImpl$trackMilestones$1(this, interfaceC9968c);
        }
        Object objMo6083d = milestonesControllerImpl$trackMilestones$1.f16541h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        char c10 = 1;
        int i14 = 3;
        ?? r11 = 0;
        try {
            switch (milestonesControllerImpl$trackMilestones$1.f16543j) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(objMo6083d);
                    InterfaceC2016i interfaceC2016i = this.f16533a;
                    String strMo498E2 = mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = this;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 1;
                    objMo6083d = interfaceC2016i.mo6083d(strMo498E2, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    milestonesControllerImpl = this;
                    str = (String) objMo6083d;
                    InterfaceC2016i interfaceC2016i2 = milestonesControllerImpl.f16533a;
                    String strMo498E3 = milestonesControllerImpl.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 2;
                    objMo6080a = interfaceC2016i2.mo6080a(strMo498E3, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6080a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    objMo6083d = objMo6080a;
                    c5409b = (C5409b) objMo6083d;
                    InterfaceC2016i interfaceC2016i3 = milestonesControllerImpl.f16533a;
                    String strMo498E4 = milestonesControllerImpl.mo498E1();
                    if (c5409b != null) {
                        i10 = c5409b.f33831d;
                    } else {
                        i10 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str2;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 3;
                    objMo6082c = interfaceC2016i3.mo6082c(i10, strMo498E4, str2, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6082c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    milestonesControllerImpl2 = milestonesControllerImpl;
                    str3 = str2;
                    c5409b2 = c5409b;
                    objMo6083d = objMo6082c;
                    list = (List) objMo6083d;
                    if (!list.isEmpty()) {
                        interfaceC2013f = milestonesControllerImpl2.f16534b;
                        strMo498E1 = milestonesControllerImpl2.mo498E1();
                        milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                        milestonesControllerImpl$trackMilestones$1.f16538e = str3;
                        milestonesControllerImpl$trackMilestones$1.f16539f = c5409b2;
                        milestonesControllerImpl$trackMilestones$1.f16540g = list;
                        milestonesControllerImpl$trackMilestones$1.f16543j = 4;
                        if (interfaceC2013f.mo6054o(strMo498E1, milestonesControllerImpl$trackMilestones$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    str4 = str3;
                    c5409b3 = c5409b2;
                    list2 = list;
                    InterfaceC2013f interfaceC2013f2 = milestonesControllerImpl2.f16534b;
                    String strMo498E5 = milestonesControllerImpl2.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str4;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b3;
                    milestonesControllerImpl$trackMilestones$1.f16540g = list2;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 5;
                    objMo6083d = interfaceC2013f2.mo6041b(strMo498E5, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    for (UserMilestone userMilestone : list2) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str5 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList5 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str5, 0, 64, null);
                        Integer[] numArr = new Integer[12];
                        numArr[r11] = new Integer(i14);
                        numArr[c10] = new Integer(7);
                        numArr[2] = new Integer(14);
                        numArr[i14] = new Integer(30);
                        numArr[4] = new Integer(50);
                        numArr[5] = new Integer(100);
                        numArr[6] = new Integer(200);
                        numArr[7] = new Integer(300);
                        numArr[8] = new Integer(400);
                        numArr[9] = new Integer(500);
                        numArr[10] = new Integer(600);
                        numArr[11] = new Integer(700);
                        Set setM14973x0 = C7499b.m14973x0(numArr);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e && setM14973x0.contains(new Integer(i12))) {
                            dailyGoalMet.f22152g = i12;
                            c7794b = new C7794b(GoalMetType.StreakMilestone, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList5;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i4 = milestonesControllerImpl2.f16533a;
                    String strMo498E6 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i4.mo6084e(i11, strMo498E6, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list4 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case 1:
                    MilestonesControllerImpl milestonesControllerImpl4 = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    milestonesControllerImpl = milestonesControllerImpl4;
                    str = (String) objMo6083d;
                    InterfaceC2016i interfaceC2016i5 = milestonesControllerImpl.f16533a;
                    String strMo498E7 = milestonesControllerImpl.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 2;
                    objMo6080a = interfaceC2016i5.mo6080a(strMo498E7, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6080a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    objMo6083d = objMo6080a;
                    c5409b = (C5409b) objMo6083d;
                    InterfaceC2016i interfaceC2016i6 = milestonesControllerImpl.f16533a;
                    String strMo498E8 = milestonesControllerImpl.mo498E1();
                    if (c5409b != null) {
                        i10 = c5409b.f33831d;
                    } else {
                        i10 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str2;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 3;
                    objMo6082c = interfaceC2016i6.mo6082c(i10, strMo498E8, str2, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6082c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    milestonesControllerImpl2 = milestonesControllerImpl;
                    str3 = str2;
                    c5409b2 = c5409b;
                    objMo6083d = objMo6082c;
                    list = (List) objMo6083d;
                    if (!list.isEmpty()) {
                        interfaceC2013f = milestonesControllerImpl2.f16534b;
                        strMo498E1 = milestonesControllerImpl2.mo498E1();
                        milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                        milestonesControllerImpl$trackMilestones$1.f16538e = str3;
                        milestonesControllerImpl$trackMilestones$1.f16539f = c5409b2;
                        milestonesControllerImpl$trackMilestones$1.f16540g = list;
                        milestonesControllerImpl$trackMilestones$1.f16543j = 4;
                        if (interfaceC2013f.mo6054o(strMo498E1, milestonesControllerImpl$trackMilestones$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    str4 = str3;
                    c5409b3 = c5409b2;
                    list2 = list;
                    InterfaceC2013f interfaceC2013f3 = milestonesControllerImpl2.f16534b;
                    String strMo498E9 = milestonesControllerImpl2.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str4;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b3;
                    milestonesControllerImpl$trackMilestones$1.f16540g = list2;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 5;
                    objMo6083d = interfaceC2013f3.mo6041b(strMo498E9, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    while (r4.hasNext()) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str6 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList6 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str6, 0, 64, null);
                        Integer[] numArr2 = new Integer[12];
                        numArr2[r11] = new Integer(i14);
                        numArr2[c10] = new Integer(7);
                        numArr2[2] = new Integer(14);
                        numArr2[i14] = new Integer(30);
                        numArr2[4] = new Integer(50);
                        numArr2[5] = new Integer(100);
                        numArr2[6] = new Integer(200);
                        numArr2[7] = new Integer(300);
                        numArr2[8] = new Integer(400);
                        numArr2[9] = new Integer(500);
                        numArr2[10] = new Integer(600);
                        numArr2[11] = new Integer(700);
                        Set setM14973x1 = C7499b.m14973x0(numArr2);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e) {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList6;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i7 = milestonesControllerImpl2.f16533a;
                    String strMo498E10 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i7.mo6084e(i11, strMo498E10, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list5 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list5, 10));
                    it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case 2:
                    str2 = (String) milestonesControllerImpl$trackMilestones$1.f16538e;
                    milestonesControllerImpl = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    c5409b = (C5409b) objMo6083d;
                    InterfaceC2016i interfaceC2016i8 = milestonesControllerImpl.f16533a;
                    String strMo498E11 = milestonesControllerImpl.mo498E1();
                    if (c5409b != null) {
                        i10 = c5409b.f33831d;
                    } else {
                        i10 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str2;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 3;
                    objMo6082c = interfaceC2016i8.mo6082c(i10, strMo498E11, str2, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6082c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    milestonesControllerImpl2 = milestonesControllerImpl;
                    str3 = str2;
                    c5409b2 = c5409b;
                    objMo6083d = objMo6082c;
                    list = (List) objMo6083d;
                    if (!list.isEmpty()) {
                        interfaceC2013f = milestonesControllerImpl2.f16534b;
                        strMo498E1 = milestonesControllerImpl2.mo498E1();
                        milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                        milestonesControllerImpl$trackMilestones$1.f16538e = str3;
                        milestonesControllerImpl$trackMilestones$1.f16539f = c5409b2;
                        milestonesControllerImpl$trackMilestones$1.f16540g = list;
                        milestonesControllerImpl$trackMilestones$1.f16543j = 4;
                        if (interfaceC2013f.mo6054o(strMo498E1, milestonesControllerImpl$trackMilestones$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    str4 = str3;
                    c5409b3 = c5409b2;
                    list2 = list;
                    InterfaceC2013f interfaceC2013f4 = milestonesControllerImpl2.f16534b;
                    String strMo498E12 = milestonesControllerImpl2.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str4;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b3;
                    milestonesControllerImpl$trackMilestones$1.f16540g = list2;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 5;
                    objMo6083d = interfaceC2013f4.mo6041b(strMo498E12, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    while (r4.hasNext()) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str7 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList7 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str7, 0, 64, null);
                        Integer[] numArr3 = new Integer[12];
                        numArr3[r11] = new Integer(i14);
                        numArr3[c10] = new Integer(7);
                        numArr3[2] = new Integer(14);
                        numArr3[i14] = new Integer(30);
                        numArr3[4] = new Integer(50);
                        numArr3[5] = new Integer(100);
                        numArr3[6] = new Integer(200);
                        numArr3[7] = new Integer(300);
                        numArr3[8] = new Integer(400);
                        numArr3[9] = new Integer(500);
                        numArr3[10] = new Integer(600);
                        numArr3[11] = new Integer(700);
                        Set setM14973x2 = C7499b.m14973x0(numArr3);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e) {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList7;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i9 = milestonesControllerImpl2.f16533a;
                    String strMo498E13 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i9.mo6084e(i11, strMo498E13, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list6 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case 3:
                    c5409b2 = milestonesControllerImpl$trackMilestones$1.f16539f;
                    str3 = (String) milestonesControllerImpl$trackMilestones$1.f16538e;
                    MilestonesControllerImpl milestonesControllerImpl5 = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    milestonesControllerImpl2 = milestonesControllerImpl5;
                    list = (List) objMo6083d;
                    if (!list.isEmpty()) {
                        interfaceC2013f = milestonesControllerImpl2.f16534b;
                        strMo498E1 = milestonesControllerImpl2.mo498E1();
                        milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                        milestonesControllerImpl$trackMilestones$1.f16538e = str3;
                        milestonesControllerImpl$trackMilestones$1.f16539f = c5409b2;
                        milestonesControllerImpl$trackMilestones$1.f16540g = list;
                        milestonesControllerImpl$trackMilestones$1.f16543j = 4;
                        if (interfaceC2013f.mo6054o(strMo498E1, milestonesControllerImpl$trackMilestones$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    str4 = str3;
                    c5409b3 = c5409b2;
                    list2 = list;
                    InterfaceC2013f interfaceC2013f5 = milestonesControllerImpl2.f16534b;
                    String strMo498E14 = milestonesControllerImpl2.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str4;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b3;
                    milestonesControllerImpl$trackMilestones$1.f16540g = list2;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 5;
                    objMo6083d = interfaceC2013f5.mo6041b(strMo498E14, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    while (r4.hasNext()) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str8 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList8 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str8, 0, 64, null);
                        Integer[] numArr4 = new Integer[12];
                        numArr4[r11] = new Integer(i14);
                        numArr4[c10] = new Integer(7);
                        numArr4[2] = new Integer(14);
                        numArr4[i14] = new Integer(30);
                        numArr4[4] = new Integer(50);
                        numArr4[5] = new Integer(100);
                        numArr4[6] = new Integer(200);
                        numArr4[7] = new Integer(300);
                        numArr4[8] = new Integer(400);
                        numArr4[9] = new Integer(500);
                        numArr4[10] = new Integer(600);
                        numArr4[11] = new Integer(700);
                        Set setM14973x3 = C7499b.m14973x0(numArr4);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e) {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList8;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i10 = milestonesControllerImpl2.f16533a;
                    String strMo498E15 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i10.mo6084e(i11, strMo498E15, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list7 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case 4:
                    list2 = milestonesControllerImpl$trackMilestones$1.f16540g;
                    c5409b3 = milestonesControllerImpl$trackMilestones$1.f16539f;
                    str4 = (String) milestonesControllerImpl$trackMilestones$1.f16538e;
                    milestonesControllerImpl2 = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    InterfaceC2013f interfaceC2013f6 = milestonesControllerImpl2.f16534b;
                    String strMo498E16 = milestonesControllerImpl2.mo498E1();
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = str4;
                    milestonesControllerImpl$trackMilestones$1.f16539f = c5409b3;
                    milestonesControllerImpl$trackMilestones$1.f16540g = list2;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 5;
                    objMo6083d = interfaceC2013f6.mo6041b(strMo498E16, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    while (r4.hasNext()) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str9 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList9 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str9, 0, 64, null);
                        Integer[] numArr5 = new Integer[12];
                        numArr5[r11] = new Integer(i14);
                        numArr5[c10] = new Integer(7);
                        numArr5[2] = new Integer(14);
                        numArr5[i14] = new Integer(30);
                        numArr5[4] = new Integer(50);
                        numArr5[5] = new Integer(100);
                        numArr5[6] = new Integer(200);
                        numArr5[7] = new Integer(300);
                        numArr5[8] = new Integer(400);
                        numArr5[9] = new Integer(500);
                        numArr5[10] = new Integer(600);
                        numArr5[11] = new Integer(700);
                        Set setM14973x4 = C7499b.m14973x0(numArr5);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e) {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList9;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i11 = milestonesControllerImpl2.f16533a;
                    String strMo498E17 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i11.mo6084e(i11, strMo498E17, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list8 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list8, 10));
                    it = list8.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case 5:
                    list2 = milestonesControllerImpl$trackMilestones$1.f16540g;
                    c5409b3 = milestonesControllerImpl$trackMilestones$1.f16539f;
                    str4 = (String) milestonesControllerImpl$trackMilestones$1.f16538e;
                    milestonesControllerImpl2 = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    userLanguageStudyStats = (UserLanguageStudyStats) objMo6083d;
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                    while (r4.hasNext()) {
                        if (userLanguageStudyStats != null) {
                            r18 = userLanguageStudyStats.f21787b;
                        } else {
                            r18 = r11;
                        }
                        if (userLanguageStudyStats != null) {
                            r19 = userLanguageStudyStats.f21792g;
                        } else {
                            r19 = r11;
                        }
                        if (c5409b3 != null) {
                            r17 = c5409b3.f33831d;
                        } else {
                            r17 = r11;
                        }
                        zM14278X2 = C7076b.m14278X2(userMilestone.f21627b, "onfire", r11);
                        String str10 = userMilestone.f21627b;
                        if (zM14278X2) {
                            r20 = c10;
                        } else {
                            r20 = r11;
                        }
                        ArrayList arrayList10 = arrayList;
                        dailyGoalMet = new DailyGoalMet(str4, r17, r18, r19, r20, str10, 0, 64, null);
                        Integer[] numArr6 = new Integer[12];
                        numArr6[r11] = new Integer(i14);
                        numArr6[c10] = new Integer(7);
                        numArr6[2] = new Integer(14);
                        numArr6[i14] = new Integer(30);
                        numArr6[4] = new Integer(50);
                        numArr6[5] = new Integer(100);
                        numArr6[6] = new Integer(200);
                        numArr6[7] = new Integer(300);
                        numArr6[8] = new Integer(400);
                        numArr6[9] = new Integer(500);
                        numArr6[10] = new Integer(600);
                        numArr6[11] = new Integer(700);
                        Set setM14973x5 = C7499b.m14973x0(numArr6);
                        if (userLanguageStudyStats != null) {
                            i12 = userLanguageStudyStats.f21788c;
                        } else {
                            i12 = 0;
                        }
                        if (dailyGoalMet.f22150e) {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        } else {
                            c7794b = new C7794b(GoalMetType.DailyGoal, dailyGoalMet);
                        }
                        arrayList2.add(c7794b);
                        arrayList = arrayList10;
                        c10 = 1;
                        i14 = 3;
                        r11 = 0;
                    }
                    arrayList3 = arrayList;
                    arrayList3.addAll(arrayList2);
                    InterfaceC2016i interfaceC2016i12 = milestonesControllerImpl2.f16533a;
                    String strMo498E18 = milestonesControllerImpl2.mo498E1();
                    if (c5409b3 != null) {
                        i11 = c5409b3.f33829b;
                    } else {
                        i11 = 0;
                    }
                    milestonesControllerImpl$trackMilestones$1.f16537d = milestonesControllerImpl2;
                    milestonesControllerImpl$trackMilestones$1.f16538e = arrayList3;
                    milestonesControllerImpl$trackMilestones$1.f16539f = null;
                    milestonesControllerImpl$trackMilestones$1.f16540g = null;
                    milestonesControllerImpl$trackMilestones$1.f16543j = 6;
                    objMo6083d = interfaceC2016i12.mo6084e(i11, strMo498E18, milestonesControllerImpl$trackMilestones$1);
                    if (objMo6083d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList3;
                    milestonesControllerImpl3 = milestonesControllerImpl2;
                    List list9 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list9, 10));
                    it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    list3 = (List) milestonesControllerImpl$trackMilestones$1.f16538e;
                    milestonesControllerImpl3 = milestonesControllerImpl$trackMilestones$1.f16537d;
                    C7499b.m14977z0(objMo6083d);
                    List list10 = (List) objMo6083d;
                    arrayList4 = new ArrayList(C9325m.m17681z(list10, 10));
                    it = list10.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new C7794b(GoalMetType.Milestone, (UserMilestone) it.next()));
                    }
                    list3.addAll(arrayList4);
                    milestonesControllerImpl3.f16536d.mo9321D1(list3);
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f16535c.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f16535c.mo509w0();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: w1 */
    public final InterfaceC7116c<C7794b> mo9325w1() {
        return this.f16536d.mo9325w1();
    }
}
