package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ValueOnOrNot;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.user.ProfileSettings;
import com.lingq.core.settings.ViewKeys;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.hm5;
import p000.kha;
import p000.km7;
import p000.si7;
import p000.xfa;
import p000.yi7;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1871j {

    /* JADX INFO: renamed from: a */
    public final si7 f22951a;

    /* JADX INFO: renamed from: b */
    public final km7 f22952b;

    /* JADX INFO: renamed from: c */
    public final hm5 f22953c;

    /* JADX INFO: renamed from: d */
    public final C1869h f22954d;

    /* JADX INFO: renamed from: e */
    public final C1869h f22955e;

    /* JADX INFO: renamed from: f */
    public final C1869h f22956f;

    /* JADX INFO: renamed from: g */
    public final C1869h f22957g;

    public C1871j(si7 si7Var, km7 km7Var, hm5 hm5Var, C1869h c1869h, C1869h c1869h2, C1869h c1869h3, C1869h c1869h4) {
        si7Var.getClass();
        km7Var.getClass();
        hm5Var.getClass();
        this.f22951a = si7Var;
        this.f22952b = km7Var;
        this.f22953c = hm5Var;
        this.f22954d = c1869h;
        this.f22955e = c1869h2;
        this.f22956f = c1869h3;
        this.f22957g = c1869h4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:157:0x0633 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:177:0x0784 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f A[PHI: r0 r2
      0x015f: PHI (r0v94 boolean) = (r0v92 boolean), (r0v95 boolean) binds: [B:79:0x015b, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r2v10 java.lang.Object) = (r2v9 java.lang.Object), (r2v1 java.lang.Object) binds: [B:79:0x015b, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0180  */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x06cb, code lost:
    
        if (r12 == r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0782, code lost:
    
        if (r12 == r4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r11).m7856O(1.15d, r3) == r4) goto L177;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8639a(ViewKeys viewKeys, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        UpdateReaderSettingUseCase$invoke$1 updateReaderSettingUseCase$invoke$1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (continuationImpl instanceof UpdateReaderSettingUseCase$invoke$1) {
            updateReaderSettingUseCase$invoke$1 = (UpdateReaderSettingUseCase$invoke$1) continuationImpl;
            int i = updateReaderSettingUseCase$invoke$1.f22895d;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateReaderSettingUseCase$invoke$1.f22895d = i - Integer.MIN_VALUE;
            } else {
                updateReaderSettingUseCase$invoke$1 = new UpdateReaderSettingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateReaderSettingUseCase$invoke$1 = new UpdateReaderSettingUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = updateReaderSettingUseCase$invoke$1.f22893b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateReaderSettingUseCase$invoke$1.f22895d;
        hm5 hm5Var = this.f22953c;
        km7 km7Var = this.f22952b;
        si7 si7Var = this.f22951a;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                switch (kha.f47306a[viewKeys.ordinal()]) {
                    case 1:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 1;
                        if (((C1368a) si7Var).m7852K(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z2 = z;
                            ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16777215);
                            updateReaderSettingUseCase$invoke$1.f22892a = z2;
                            updateReaderSettingUseCase$invoke$1.f22895d = 2;
                            ((C1267a) km7Var).m7061B(profileSettings);
                            break;
                        }
                        return coroutineSingletons;
                    case 2:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 3;
                        if (((C1368a) si7Var).m7877f(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z3 = z;
                            ProfileSettings profileSettings2 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -524289, 16777215);
                            updateReaderSettingUseCase$invoke$1.f22892a = z3;
                            updateReaderSettingUseCase$invoke$1.f22895d = 4;
                            ((C1267a) km7Var).m7061B(profileSettings2);
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 5;
                        if (this.f22954d.m8634c(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 4:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 6;
                        if (((C1368a) si7Var).m7860S(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z4 = z;
                            ProfileSettings profileSettings3 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z4), null, null, null, -1, -1, 16252927);
                            updateReaderSettingUseCase$invoke$1.f22892a = z4;
                            updateReaderSettingUseCase$invoke$1.f22895d = 7;
                            ((C1267a) km7Var).m7061B(profileSettings3);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 5:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 8;
                        if (((C1368a) si7Var).m7905t(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z5 = z;
                            ProfileSettings profileSettings4 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z5), null, null, -1, -1, 15728639);
                            updateReaderSettingUseCase$invoke$1.f22892a = z5;
                            updateReaderSettingUseCase$invoke$1.f22895d = 9;
                            ((C1267a) km7Var).m7061B(profileSettings4);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 6:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 10;
                        if (((C1368a) si7Var).m7881h(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z6 = z;
                            ProfileSettings profileSettings5 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z6), null, null, null, null, null, null, null, -1, -1, 16776191);
                            updateReaderSettingUseCase$invoke$1.f22892a = z6;
                            updateReaderSettingUseCase$invoke$1.f22895d = 11;
                            ((C1267a) km7Var).m7061B(profileSettings5);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 7:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 12;
                        if (((C1368a) si7Var).m7874d0(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z7 = z;
                            ProfileSettings profileSettings6 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z7), null, -1, -1, 14680063);
                            updateReaderSettingUseCase$invoke$1.f22892a = z7;
                            updateReaderSettingUseCase$invoke$1.f22895d = 13;
                            ((C1267a) km7Var).m7061B(profileSettings6);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 8:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 14;
                        if (((C1368a) si7Var).m7904s0(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 9:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 15;
                        if (this.f22956f.m8634c(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 10:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 16;
                        if (((C1368a) si7Var).m7876e0(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 11:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 17;
                        if (((C1368a) si7Var).m7867Z(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z8 = z;
                            ProfileSettings profileSettings7 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1048577, 16777215);
                            updateReaderSettingUseCase$invoke$1.f22892a = z8;
                            updateReaderSettingUseCase$invoke$1.f22895d = 18;
                            ((C1267a) km7Var).m7061B(profileSettings7);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 12:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 19;
                        if (this.f22955e.m8634c(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 13:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 20;
                        if (((C1368a) si7Var).m7875e(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z9 = z;
                            ProfileSettings profileSettings8 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z9), -1, -1, 12582911);
                            updateReaderSettingUseCase$invoke$1.f22892a = z9;
                            updateReaderSettingUseCase$invoke$1.f22895d = 21;
                            ((C1267a) km7Var).m7061B(profileSettings8);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 14:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 22;
                        if (((C1368a) si7Var).m7865X(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z10 = z;
                            ProfileSettings profileSettings9 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z10), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777183);
                            updateReaderSettingUseCase$invoke$1.f22892a = z10;
                            updateReaderSettingUseCase$invoke$1.f22895d = 23;
                            ((C1267a) km7Var).m7061B(profileSettings9);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 15:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 24;
                        if (this.f22957g.m8634c(z, updateReaderSettingUseCase$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 16:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 25;
                        if (((C1368a) si7Var).m7857P(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z11 = z;
                            if (z11) {
                                yi7 yi7Var = ((C1368a) si7Var).f18329C0;
                                updateReaderSettingUseCase$invoke$1.f22892a = z11;
                                updateReaderSettingUseCase$invoke$1.f22895d = 26;
                                objM15541t = AbstractC3224d.m15541t(yi7Var, updateReaderSettingUseCase$invoke$1);
                                if (objM15541t != coroutineSingletons) {
                                    if (((Number) objM15541t).doubleValue() < 1.15d) {
                                        updateReaderSettingUseCase$invoke$1.f22892a = z11;
                                        updateReaderSettingUseCase$invoke$1.f22895d = 27;
                                    }
                                }
                                break;
                            }
                            C1240a c1240a = (C1240a) hm5Var;
                            c1240a.m7025f("Reader setting changed", c1240a.m7022c("full lesson sentence translations", z11 ? "On" : "Off"));
                            return xfaVar;
                        }
                        return coroutineSingletons;
                    case 17:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 28;
                        if (((C1368a) si7Var).m7861T(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z12 = z;
                            C1240a c1240a2 = (C1240a) hm5Var;
                            c1240a2.m7025f("Reader setting changed", c1240a2.m7022c("automatic sentence audio play", z12 ? "On" : "Off"));
                            return xfaVar;
                        }
                        return coroutineSingletons;
                    case 18:
                        updateReaderSettingUseCase$invoke$1.f22892a = z;
                        updateReaderSettingUseCase$invoke$1.f22895d = 29;
                        if (((C1368a) si7Var).m7862U(z, updateReaderSettingUseCase$invoke$1) != coroutineSingletons) {
                            z13 = z;
                            C1240a c1240a3 = (C1240a) hm5Var;
                            c1240a3.m7025f("Reader setting changed", c1240a3.m7022c("automatic sentence mode sentence translations", z13 ? "On" : "Off"));
                            return xfaVar;
                        }
                        return coroutineSingletons;
                    default:
                        return xfaVar;
                }
            case 1:
                z2 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings10 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16777215);
                updateReaderSettingUseCase$invoke$1.f22892a = z2;
                updateReaderSettingUseCase$invoke$1.f22895d = 2;
                ((C1267a) km7Var).m7061B(profileSettings10);
                break;
            case 2:
                z2 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                C1240a c1240a4 = (C1240a) hm5Var;
                c1240a4.m7025f("Reader setting changed", c1240a4.m7022c("paging_moves_to_known", (z2 ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue()));
                return xfaVar;
            case 3:
                z3 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings11 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -524289, 16777215);
                updateReaderSettingUseCase$invoke$1.f22892a = z3;
                updateReaderSettingUseCase$invoke$1.f22895d = 4;
                ((C1267a) km7Var).m7061B(profileSettings11);
                break;
            case 4:
                z3 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                C1240a c1240a5 = (C1240a) hm5Var;
                c1240a5.m7025f("Reader setting changed", c1240a5.m7022c("auto_lingq_creation", (z3 ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue()));
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 6:
                z4 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings12 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z4), null, null, null, -1, -1, 16252927);
                updateReaderSettingUseCase$invoke$1.f22892a = z4;
                updateReaderSettingUseCase$invoke$1.f22895d = 7;
                ((C1267a) km7Var).m7061B(profileSettings12);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 7:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 8:
                z5 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings13 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z5), null, null, -1, -1, 15728639);
                updateReaderSettingUseCase$invoke$1.f22892a = z5;
                updateReaderSettingUseCase$invoke$1.f22895d = 9;
                ((C1267a) km7Var).m7061B(profileSettings13);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 9:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 10:
                z6 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings14 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z6), null, null, null, null, null, null, null, -1, -1, 16776191);
                updateReaderSettingUseCase$invoke$1.f22892a = z6;
                updateReaderSettingUseCase$invoke$1.f22895d = 11;
                ((C1267a) km7Var).m7061B(profileSettings14);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 11:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 12:
                z7 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings15 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z7), null, -1, -1, 14680063);
                updateReaderSettingUseCase$invoke$1.f22892a = z7;
                updateReaderSettingUseCase$invoke$1.f22895d = 13;
                ((C1267a) km7Var).m7061B(profileSettings15);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 13:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 14:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 15:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 16:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 17:
                z8 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings16 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1048577, 16777215);
                updateReaderSettingUseCase$invoke$1.f22892a = z8;
                updateReaderSettingUseCase$invoke$1.f22895d = 18;
                ((C1267a) km7Var).m7061B(profileSettings16);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 18:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 19:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 20:
                z9 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings17 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z9), -1, -1, 12582911);
                updateReaderSettingUseCase$invoke$1.f22892a = z9;
                updateReaderSettingUseCase$invoke$1.f22895d = 21;
                ((C1267a) km7Var).m7061B(profileSettings17);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 21:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 22:
                z10 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                ProfileSettings profileSettings18 = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z10), null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777183);
                updateReaderSettingUseCase$invoke$1.f22892a = z10;
                updateReaderSettingUseCase$invoke$1.f22895d = 23;
                ((C1267a) km7Var).m7061B(profileSettings18);
                if (xfaVar != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 24:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 25:
                z11 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                if (z11) {
                    yi7 yi7Var2 = ((C1368a) si7Var).f18329C0;
                    updateReaderSettingUseCase$invoke$1.f22892a = z11;
                    updateReaderSettingUseCase$invoke$1.f22895d = 26;
                    objM15541t = AbstractC3224d.m15541t(yi7Var2, updateReaderSettingUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        if (((Number) objM15541t).doubleValue() < 1.15d) {
                            updateReaderSettingUseCase$invoke$1.f22892a = z11;
                            updateReaderSettingUseCase$invoke$1.f22895d = 27;
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                C1240a c1240a6 = (C1240a) hm5Var;
                c1240a6.m7025f("Reader setting changed", c1240a6.m7022c("full lesson sentence translations", z11 ? "On" : "Off"));
                return xfaVar;
            case 26:
                z11 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                if (((Number) objM15541t).doubleValue() < 1.15d) {
                    updateReaderSettingUseCase$invoke$1.f22892a = z11;
                    updateReaderSettingUseCase$invoke$1.f22895d = 27;
                    break;
                }
                C1240a c1240a7 = (C1240a) hm5Var;
                c1240a7.m7025f("Reader setting changed", c1240a7.m7022c("full lesson sentence translations", z11 ? "On" : "Off"));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                z11 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                C1240a c1240a8 = (C1240a) hm5Var;
                c1240a8.m7025f("Reader setting changed", c1240a8.m7022c("full lesson sentence translations", z11 ? "On" : "Off"));
                return xfaVar;
            case 28:
                z12 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                C1240a c1240a9 = (C1240a) hm5Var;
                c1240a9.m7025f("Reader setting changed", c1240a9.m7022c("automatic sentence audio play", z12 ? "On" : "Off"));
                return xfaVar;
            case 29:
                z13 = updateReaderSettingUseCase$invoke$1.f22892a;
                AbstractC3193b.m15359b(objM15541t);
                C1240a c1240a10 = (C1240a) hm5Var;
                c1240a10.m7025f("Reader setting changed", c1240a10.m7022c("automatic sentence mode sentence translations", z13 ? "On" : "Off"));
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
