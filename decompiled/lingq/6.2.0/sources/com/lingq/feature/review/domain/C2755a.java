package com.lingq.feature.review.domain;

import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.ig8;
import p000.lg8;
import p000.mg8;
import p000.ob8;
import p000.s7b;
import p000.u63;

/* JADX INFO: renamed from: com.lingq.feature.review.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2755a {

    /* JADX INFO: renamed from: a */
    public final Object f32467a;

    public C2755a(s7b s7bVar) {
        s7bVar.getClass();
        this.f32467a = s7bVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:77:0x0209  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x020e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0211  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX INFO: renamed from: a */
    public Object m9594a(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$activityAvailability$1 reviewSettingsProvider$activityAvailability$1;
        boolean z2;
        int i;
        Object objM15541t;
        boolean z3;
        int i2;
        int i3;
        Object objM15541t2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        Object objM15541t3;
        boolean z5;
        int i7;
        int i8;
        Object objM15541t4;
        int i9;
        int i10;
        int i11;
        boolean z6;
        int i12;
        boolean zBooleanValue;
        Object objM15541t5;
        boolean z7;
        boolean z8;
        boolean zBooleanValue2;
        Object objM15541t6;
        boolean z9;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean zBooleanValue3;
        Object objM15541t7;
        boolean z11;
        boolean z12;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ig8 ig8Var = (ig8) this.f32467a;
        if (continuationImpl instanceof ReviewSettingsProvider$activityAvailability$1) {
            reviewSettingsProvider$activityAvailability$1 = (ReviewSettingsProvider$activityAvailability$1) continuationImpl;
            int i22 = reviewSettingsProvider$activityAvailability$1.f32433k;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$activityAvailability$1.f32433k = i22 - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$activityAvailability$1 = new ReviewSettingsProvider$activityAvailability$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$activityAvailability$1 = new ReviewSettingsProvider$activityAvailability$1(this, continuationImpl);
        }
        Object objM15541t8 = reviewSettingsProvider$activityAvailability$1.f32431i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (reviewSettingsProvider$activityAvailability$1.f32433k) {
            case 0:
                AbstractC3193b.m15359b(objM15541t8);
                lg8 lg8Var = ((C1370c) ig8Var).f18502N;
                z2 = z;
                reviewSettingsProvider$activityAvailability$1.f32423a = z2;
                reviewSettingsProvider$activityAvailability$1.f32433k = 1;
                objM15541t8 = AbstractC3224d.m15541t(lg8Var, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t8 != coroutineSingletons) {
                    if (((Boolean) objM15541t8).booleanValue() || !z2) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    lg8 lg8Var2 = ((C1370c) ig8Var).f18503O;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z2;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 2;
                    objM15541t = AbstractC3224d.m15541t(lg8Var2, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t != coroutineSingletons) {
                        z3 = z2;
                        i2 = i;
                        objM15541t8 = objM15541t;
                        if (((Boolean) objM15541t8).booleanValue() || !z3) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        mg8 mg8Var = ((C1370c) ig8Var).f18506R;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z3;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i2;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i3;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 3;
                        objM15541t2 = AbstractC3224d.m15541t(mg8Var, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t2 != coroutineSingletons) {
                            i4 = i3;
                            objM15541t8 = objM15541t2;
                            boolean z18 = z3;
                            i5 = i2;
                            z4 = z18;
                            if (((Boolean) objM15541t8).booleanValue() || !z4) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            mg8 mg8Var2 = ((C1370c) ig8Var).f18505Q;
                            reviewSettingsProvider$activityAvailability$1.f32423a = z4;
                            reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                            reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                            reviewSettingsProvider$activityAvailability$1.f32429g = i6;
                            reviewSettingsProvider$activityAvailability$1.f32433k = 4;
                            objM15541t3 = AbstractC3224d.m15541t(mg8Var2, reviewSettingsProvider$activityAvailability$1);
                            if (objM15541t3 != coroutineSingletons) {
                                z5 = z4;
                                i7 = i6;
                                objM15541t8 = objM15541t3;
                                if (((Boolean) objM15541t8).booleanValue() || !z5) {
                                    i8 = 0;
                                } else {
                                    i8 = 1;
                                }
                                mg8 mg8Var3 = ((C1370c) ig8Var).f18504P;
                                reviewSettingsProvider$activityAvailability$1.f32423a = z5;
                                reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                                reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                                reviewSettingsProvider$activityAvailability$1.f32429g = i7;
                                reviewSettingsProvider$activityAvailability$1.f32430h = i8;
                                reviewSettingsProvider$activityAvailability$1.f32433k = 5;
                                objM15541t4 = AbstractC3224d.m15541t(mg8Var3, reviewSettingsProvider$activityAvailability$1);
                                if (objM15541t4 != coroutineSingletons) {
                                    int i23 = i4;
                                    i9 = i8;
                                    objM15541t8 = objM15541t4;
                                    i10 = i23;
                                    int i24 = i5;
                                    i11 = i7;
                                    z6 = z5;
                                    i12 = i24;
                                    zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                                    lg8 lg8Var3 = ((C1370c) ig8Var).f18550r0;
                                    reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                    reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                                    reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                                    reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                                    reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                                    reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                                    objM15541t5 = AbstractC3224d.m15541t(lg8Var3, reviewSettingsProvider$activityAvailability$1);
                                    if (objM15541t5 != coroutineSingletons) {
                                        z7 = z6;
                                        z8 = zBooleanValue;
                                        objM15541t8 = objM15541t5;
                                        zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                                        lg8 lg8Var4 = ((C1370c) ig8Var).f18548q0;
                                        reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                        reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                        reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                                        reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                                        reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                                        reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                                        reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                                        reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                                        objM15541t6 = AbstractC3224d.m15541t(lg8Var4, reviewSettingsProvider$activityAvailability$1);
                                        if (objM15541t6 != coroutineSingletons) {
                                            boolean z19 = z8;
                                            z9 = zBooleanValue2;
                                            objM15541t8 = objM15541t6;
                                            i13 = i10;
                                            i14 = i11;
                                            i15 = i9;
                                            z10 = z19;
                                            zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                                            lg8 lg8Var5 = ((C1370c) ig8Var).f18546p0;
                                            reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                            reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                            reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                                            reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                                            reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                                            reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                                            reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                                            reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                                            reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                                            objM15541t7 = AbstractC3224d.m15541t(lg8Var5, reviewSettingsProvider$activityAvailability$1);
                                            if (objM15541t7 != coroutineSingletons) {
                                                z11 = zBooleanValue3;
                                                objM15541t8 = objM15541t7;
                                                z12 = z9;
                                                z13 = z10;
                                                i16 = i15;
                                                i17 = i14;
                                                i18 = i12;
                                                i19 = i13;
                                                boolean zBooleanValue4 = ((Boolean) objM15541t8).booleanValue();
                                                i20 = i16;
                                                i21 = i17;
                                                if (i18 != 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (i19 != 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (i21 != 0) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (i20 != 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                z2 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                if (((Boolean) objM15541t8).booleanValue()) {
                    i = 0;
                } else {
                    i = 0;
                }
                lg8 lg8Var6 = ((C1370c) ig8Var).f18503O;
                reviewSettingsProvider$activityAvailability$1.f32423a = z2;
                reviewSettingsProvider$activityAvailability$1.f32427e = i;
                reviewSettingsProvider$activityAvailability$1.f32433k = 2;
                objM15541t = AbstractC3224d.m15541t(lg8Var6, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t != coroutineSingletons) {
                    z3 = z2;
                    i2 = i;
                    objM15541t8 = objM15541t;
                    if (((Boolean) objM15541t8).booleanValue()) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                    mg8 mg8Var4 = ((C1370c) ig8Var).f18506R;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z3;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i2;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i3;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 3;
                    objM15541t2 = AbstractC3224d.m15541t(mg8Var4, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t2 != coroutineSingletons) {
                        i4 = i3;
                        objM15541t8 = objM15541t2;
                        boolean z110 = z3;
                        i5 = i2;
                        z4 = z110;
                        if (((Boolean) objM15541t8).booleanValue()) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        mg8 mg8Var5 = ((C1370c) ig8Var).f18505Q;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z4;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                        reviewSettingsProvider$activityAvailability$1.f32429g = i6;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 4;
                        objM15541t3 = AbstractC3224d.m15541t(mg8Var5, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t3 != coroutineSingletons) {
                            z5 = z4;
                            i7 = i6;
                            objM15541t8 = objM15541t3;
                            if (((Boolean) objM15541t8).booleanValue()) {
                                i8 = 0;
                            } else {
                                i8 = 0;
                            }
                            mg8 mg8Var6 = ((C1370c) ig8Var).f18504P;
                            reviewSettingsProvider$activityAvailability$1.f32423a = z5;
                            reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                            reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                            reviewSettingsProvider$activityAvailability$1.f32429g = i7;
                            reviewSettingsProvider$activityAvailability$1.f32430h = i8;
                            reviewSettingsProvider$activityAvailability$1.f32433k = 5;
                            objM15541t4 = AbstractC3224d.m15541t(mg8Var6, reviewSettingsProvider$activityAvailability$1);
                            if (objM15541t4 != coroutineSingletons) {
                                int i25 = i4;
                                i9 = i8;
                                objM15541t8 = objM15541t4;
                                i10 = i25;
                                int i26 = i5;
                                i11 = i7;
                                z6 = z5;
                                i12 = i26;
                                zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                                lg8 lg8Var7 = ((C1370c) ig8Var).f18550r0;
                                reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                                reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                                reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                                reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                                reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                                objM15541t5 = AbstractC3224d.m15541t(lg8Var7, reviewSettingsProvider$activityAvailability$1);
                                if (objM15541t5 != coroutineSingletons) {
                                    z7 = z6;
                                    z8 = zBooleanValue;
                                    objM15541t8 = objM15541t5;
                                    zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                                    lg8 lg8Var8 = ((C1370c) ig8Var).f18548q0;
                                    reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                    reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                                    reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                                    reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                                    reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                                    reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                                    reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                                    objM15541t6 = AbstractC3224d.m15541t(lg8Var8, reviewSettingsProvider$activityAvailability$1);
                                    if (objM15541t6 != coroutineSingletons) {
                                        boolean z111 = z8;
                                        z9 = zBooleanValue2;
                                        objM15541t8 = objM15541t6;
                                        i13 = i10;
                                        i14 = i11;
                                        i15 = i9;
                                        z10 = z111;
                                        zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                                        lg8 lg8Var9 = ((C1370c) ig8Var).f18546p0;
                                        reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                        reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                        reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                                        reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                                        reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                                        reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                                        reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                                        reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                                        reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                                        objM15541t7 = AbstractC3224d.m15541t(lg8Var9, reviewSettingsProvider$activityAvailability$1);
                                        if (objM15541t7 != coroutineSingletons) {
                                            z11 = zBooleanValue3;
                                            objM15541t8 = objM15541t7;
                                            z12 = z9;
                                            z13 = z10;
                                            i16 = i15;
                                            i17 = i14;
                                            i18 = i12;
                                            i19 = i13;
                                            boolean zBooleanValue5 = ((Boolean) objM15541t8).booleanValue();
                                            i20 = i16;
                                            i21 = i17;
                                            if (i18 != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (i19 != 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (i21 != 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (i20 != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i2 = reviewSettingsProvider$activityAvailability$1.f32427e;
                boolean z20 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                z3 = z20;
                if (((Boolean) objM15541t8).booleanValue()) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
                mg8 mg8Var7 = ((C1370c) ig8Var).f18506R;
                reviewSettingsProvider$activityAvailability$1.f32423a = z3;
                reviewSettingsProvider$activityAvailability$1.f32427e = i2;
                reviewSettingsProvider$activityAvailability$1.f32428f = i3;
                reviewSettingsProvider$activityAvailability$1.f32433k = 3;
                objM15541t2 = AbstractC3224d.m15541t(mg8Var7, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t2 != coroutineSingletons) {
                    i4 = i3;
                    objM15541t8 = objM15541t2;
                    boolean z112 = z3;
                    i5 = i2;
                    z4 = z112;
                    if (((Boolean) objM15541t8).booleanValue()) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                    }
                    mg8 mg8Var8 = ((C1370c) ig8Var).f18505Q;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z4;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                    reviewSettingsProvider$activityAvailability$1.f32429g = i6;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 4;
                    objM15541t3 = AbstractC3224d.m15541t(mg8Var8, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z5 = z4;
                        i7 = i6;
                        objM15541t8 = objM15541t3;
                        if (((Boolean) objM15541t8).booleanValue()) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        mg8 mg8Var9 = ((C1370c) ig8Var).f18504P;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z5;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                        reviewSettingsProvider$activityAvailability$1.f32429g = i7;
                        reviewSettingsProvider$activityAvailability$1.f32430h = i8;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 5;
                        objM15541t4 = AbstractC3224d.m15541t(mg8Var9, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t4 != coroutineSingletons) {
                            int i27 = i4;
                            i9 = i8;
                            objM15541t8 = objM15541t4;
                            i10 = i27;
                            int i28 = i5;
                            i11 = i7;
                            z6 = z5;
                            i12 = i28;
                            zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                            lg8 lg8Var10 = ((C1370c) ig8Var).f18550r0;
                            reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                            reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                            reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                            reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                            reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                            reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                            reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                            objM15541t5 = AbstractC3224d.m15541t(lg8Var10, reviewSettingsProvider$activityAvailability$1);
                            if (objM15541t5 != coroutineSingletons) {
                                z7 = z6;
                                z8 = zBooleanValue;
                                objM15541t8 = objM15541t5;
                                zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                                lg8 lg8Var11 = ((C1370c) ig8Var).f18548q0;
                                reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                                reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                                reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                                reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                                reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                                reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                                objM15541t6 = AbstractC3224d.m15541t(lg8Var11, reviewSettingsProvider$activityAvailability$1);
                                if (objM15541t6 != coroutineSingletons) {
                                    boolean z113 = z8;
                                    z9 = zBooleanValue2;
                                    objM15541t8 = objM15541t6;
                                    i13 = i10;
                                    i14 = i11;
                                    i15 = i9;
                                    z10 = z113;
                                    zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                                    lg8 lg8Var12 = ((C1370c) ig8Var).f18546p0;
                                    reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                    reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                                    reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                                    reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                                    reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                                    reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                                    reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                                    reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                                    objM15541t7 = AbstractC3224d.m15541t(lg8Var12, reviewSettingsProvider$activityAvailability$1);
                                    if (objM15541t7 != coroutineSingletons) {
                                        z11 = zBooleanValue3;
                                        objM15541t8 = objM15541t7;
                                        z12 = z9;
                                        z13 = z10;
                                        i16 = i15;
                                        i17 = i14;
                                        i18 = i12;
                                        i19 = i13;
                                        boolean zBooleanValue6 = ((Boolean) objM15541t8).booleanValue();
                                        i20 = i16;
                                        i21 = i17;
                                        if (i18 != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (i19 != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (i21 != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (i20 != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue6);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                int i29 = reviewSettingsProvider$activityAvailability$1.f32428f;
                int i30 = reviewSettingsProvider$activityAvailability$1.f32427e;
                boolean z21 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                i4 = i29;
                z4 = z21;
                i5 = i30;
                if (((Boolean) objM15541t8).booleanValue()) {
                    i6 = 0;
                } else {
                    i6 = 0;
                }
                mg8 mg8Var10 = ((C1370c) ig8Var).f18505Q;
                reviewSettingsProvider$activityAvailability$1.f32423a = z4;
                reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                reviewSettingsProvider$activityAvailability$1.f32429g = i6;
                reviewSettingsProvider$activityAvailability$1.f32433k = 4;
                objM15541t3 = AbstractC3224d.m15541t(mg8Var10, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t3 != coroutineSingletons) {
                    z5 = z4;
                    i7 = i6;
                    objM15541t8 = objM15541t3;
                    if (((Boolean) objM15541t8).booleanValue()) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                    }
                    mg8 mg8Var11 = ((C1370c) ig8Var).f18504P;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z5;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                    reviewSettingsProvider$activityAvailability$1.f32429g = i7;
                    reviewSettingsProvider$activityAvailability$1.f32430h = i8;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 5;
                    objM15541t4 = AbstractC3224d.m15541t(mg8Var11, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t4 != coroutineSingletons) {
                        int i210 = i4;
                        i9 = i8;
                        objM15541t8 = objM15541t4;
                        i10 = i210;
                        int i211 = i5;
                        i11 = i7;
                        z6 = z5;
                        i12 = i211;
                        zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                        lg8 lg8Var13 = ((C1370c) ig8Var).f18550r0;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                        reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                        reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                        reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                        objM15541t5 = AbstractC3224d.m15541t(lg8Var13, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t5 != coroutineSingletons) {
                            z7 = z6;
                            z8 = zBooleanValue;
                            objM15541t8 = objM15541t5;
                            zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                            lg8 lg8Var14 = ((C1370c) ig8Var).f18548q0;
                            reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                            reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                            reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                            reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                            reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                            reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                            reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                            reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                            objM15541t6 = AbstractC3224d.m15541t(lg8Var14, reviewSettingsProvider$activityAvailability$1);
                            if (objM15541t6 != coroutineSingletons) {
                                boolean z114 = z8;
                                z9 = zBooleanValue2;
                                objM15541t8 = objM15541t6;
                                i13 = i10;
                                i14 = i11;
                                i15 = i9;
                                z10 = z114;
                                zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                                lg8 lg8Var15 = ((C1370c) ig8Var).f18546p0;
                                reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                                reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                                reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                                reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                                reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                                reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                                reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                                reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                                objM15541t7 = AbstractC3224d.m15541t(lg8Var15, reviewSettingsProvider$activityAvailability$1);
                                if (objM15541t7 != coroutineSingletons) {
                                    z11 = zBooleanValue3;
                                    objM15541t8 = objM15541t7;
                                    z12 = z9;
                                    z13 = z10;
                                    i16 = i15;
                                    i17 = i14;
                                    i18 = i12;
                                    i19 = i13;
                                    boolean zBooleanValue7 = ((Boolean) objM15541t8).booleanValue();
                                    i20 = i16;
                                    i21 = i17;
                                    if (i18 != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (i19 != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (i21 != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (i20 != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue7);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i7 = reviewSettingsProvider$activityAvailability$1.f32429g;
                i4 = reviewSettingsProvider$activityAvailability$1.f32428f;
                i5 = reviewSettingsProvider$activityAvailability$1.f32427e;
                boolean z22 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                z5 = z22;
                if (((Boolean) objM15541t8).booleanValue()) {
                    i8 = 0;
                } else {
                    i8 = 0;
                }
                mg8 mg8Var12 = ((C1370c) ig8Var).f18504P;
                reviewSettingsProvider$activityAvailability$1.f32423a = z5;
                reviewSettingsProvider$activityAvailability$1.f32427e = i5;
                reviewSettingsProvider$activityAvailability$1.f32428f = i4;
                reviewSettingsProvider$activityAvailability$1.f32429g = i7;
                reviewSettingsProvider$activityAvailability$1.f32430h = i8;
                reviewSettingsProvider$activityAvailability$1.f32433k = 5;
                objM15541t4 = AbstractC3224d.m15541t(mg8Var12, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t4 != coroutineSingletons) {
                    int i212 = i4;
                    i9 = i8;
                    objM15541t8 = objM15541t4;
                    i10 = i212;
                    int i213 = i5;
                    i11 = i7;
                    z6 = z5;
                    i12 = i213;
                    zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                    lg8 lg8Var16 = ((C1370c) ig8Var).f18550r0;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                    reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                    reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                    reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                    objM15541t5 = AbstractC3224d.m15541t(lg8Var16, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t5 != coroutineSingletons) {
                        z7 = z6;
                        z8 = zBooleanValue;
                        objM15541t8 = objM15541t5;
                        zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                        lg8 lg8Var17 = ((C1370c) ig8Var).f18548q0;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                        reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                        reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                        reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                        reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                        objM15541t6 = AbstractC3224d.m15541t(lg8Var17, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t6 != coroutineSingletons) {
                            boolean z115 = z8;
                            z9 = zBooleanValue2;
                            objM15541t8 = objM15541t6;
                            i13 = i10;
                            i14 = i11;
                            i15 = i9;
                            z10 = z115;
                            zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                            lg8 lg8Var18 = ((C1370c) ig8Var).f18546p0;
                            reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                            reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                            reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                            reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                            reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                            reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                            reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                            reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                            reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                            objM15541t7 = AbstractC3224d.m15541t(lg8Var18, reviewSettingsProvider$activityAvailability$1);
                            if (objM15541t7 != coroutineSingletons) {
                                z11 = zBooleanValue3;
                                objM15541t8 = objM15541t7;
                                z12 = z9;
                                z13 = z10;
                                i16 = i15;
                                i17 = i14;
                                i18 = i12;
                                i19 = i13;
                                boolean zBooleanValue8 = ((Boolean) objM15541t8).booleanValue();
                                i20 = i16;
                                i21 = i17;
                                if (i18 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i19 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (i21 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i20 != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue8);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                int i31 = reviewSettingsProvider$activityAvailability$1.f32430h;
                int i32 = reviewSettingsProvider$activityAvailability$1.f32429g;
                int i33 = reviewSettingsProvider$activityAvailability$1.f32428f;
                int i34 = reviewSettingsProvider$activityAvailability$1.f32427e;
                boolean z23 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                i9 = i31;
                z6 = z23;
                i12 = i34;
                i10 = i33;
                i11 = i32;
                zBooleanValue = ((Boolean) objM15541t8).booleanValue();
                lg8 lg8Var19 = ((C1370c) ig8Var).f18550r0;
                reviewSettingsProvider$activityAvailability$1.f32423a = z6;
                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                reviewSettingsProvider$activityAvailability$1.f32424b = zBooleanValue;
                reviewSettingsProvider$activityAvailability$1.f32433k = 6;
                objM15541t5 = AbstractC3224d.m15541t(lg8Var19, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t5 != coroutineSingletons) {
                    z7 = z6;
                    z8 = zBooleanValue;
                    objM15541t8 = objM15541t5;
                    zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                    lg8 lg8Var110 = ((C1370c) ig8Var).f18548q0;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                    reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                    reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                    reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                    reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                    objM15541t6 = AbstractC3224d.m15541t(lg8Var110, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t6 != coroutineSingletons) {
                        boolean z116 = z8;
                        z9 = zBooleanValue2;
                        objM15541t8 = objM15541t6;
                        i13 = i10;
                        i14 = i11;
                        i15 = i9;
                        z10 = z116;
                        zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                        lg8 lg8Var111 = ((C1370c) ig8Var).f18546p0;
                        reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                        reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                        reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                        reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                        reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                        reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                        reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                        reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                        reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                        objM15541t7 = AbstractC3224d.m15541t(lg8Var111, reviewSettingsProvider$activityAvailability$1);
                        if (objM15541t7 != coroutineSingletons) {
                            z11 = zBooleanValue3;
                            objM15541t8 = objM15541t7;
                            z12 = z9;
                            z13 = z10;
                            i16 = i15;
                            i17 = i14;
                            i18 = i12;
                            i19 = i13;
                            boolean zBooleanValue9 = ((Boolean) objM15541t8).booleanValue();
                            i20 = i16;
                            i21 = i17;
                            if (i18 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i19 != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (i21 != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (i20 != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue9);
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                z8 = reviewSettingsProvider$activityAvailability$1.f32424b;
                i9 = reviewSettingsProvider$activityAvailability$1.f32430h;
                i11 = reviewSettingsProvider$activityAvailability$1.f32429g;
                i10 = reviewSettingsProvider$activityAvailability$1.f32428f;
                i12 = reviewSettingsProvider$activityAvailability$1.f32427e;
                boolean z24 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                z7 = z24;
                zBooleanValue2 = ((Boolean) objM15541t8).booleanValue();
                lg8 lg8Var112 = ((C1370c) ig8Var).f18548q0;
                reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                reviewSettingsProvider$activityAvailability$1.f32428f = i10;
                reviewSettingsProvider$activityAvailability$1.f32429g = i11;
                reviewSettingsProvider$activityAvailability$1.f32430h = i9;
                reviewSettingsProvider$activityAvailability$1.f32424b = z8;
                reviewSettingsProvider$activityAvailability$1.f32425c = zBooleanValue2;
                reviewSettingsProvider$activityAvailability$1.f32433k = 7;
                objM15541t6 = AbstractC3224d.m15541t(lg8Var112, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t6 != coroutineSingletons) {
                    boolean z117 = z8;
                    z9 = zBooleanValue2;
                    objM15541t8 = objM15541t6;
                    i13 = i10;
                    i14 = i11;
                    i15 = i9;
                    z10 = z117;
                    zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                    lg8 lg8Var113 = ((C1370c) ig8Var).f18546p0;
                    reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                    reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                    reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                    reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                    reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                    reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                    reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                    reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                    reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                    objM15541t7 = AbstractC3224d.m15541t(lg8Var113, reviewSettingsProvider$activityAvailability$1);
                    if (objM15541t7 != coroutineSingletons) {
                        z11 = zBooleanValue3;
                        objM15541t8 = objM15541t7;
                        z12 = z9;
                        z13 = z10;
                        i16 = i15;
                        i17 = i14;
                        i18 = i12;
                        i19 = i13;
                        boolean zBooleanValue10 = ((Boolean) objM15541t8).booleanValue();
                        i20 = i16;
                        i21 = i17;
                        if (i18 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i20 != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue10);
                    }
                }
                return coroutineSingletons;
            case 7:
                z9 = reviewSettingsProvider$activityAvailability$1.f32425c;
                z10 = reviewSettingsProvider$activityAvailability$1.f32424b;
                i15 = reviewSettingsProvider$activityAvailability$1.f32430h;
                i14 = reviewSettingsProvider$activityAvailability$1.f32429g;
                int i35 = reviewSettingsProvider$activityAvailability$1.f32428f;
                int i36 = reviewSettingsProvider$activityAvailability$1.f32427e;
                z7 = reviewSettingsProvider$activityAvailability$1.f32423a;
                AbstractC3193b.m15359b(objM15541t8);
                i13 = i35;
                i12 = i36;
                zBooleanValue3 = ((Boolean) objM15541t8).booleanValue();
                lg8 lg8Var114 = ((C1370c) ig8Var).f18546p0;
                reviewSettingsProvider$activityAvailability$1.f32423a = z7;
                reviewSettingsProvider$activityAvailability$1.f32427e = i12;
                reviewSettingsProvider$activityAvailability$1.f32428f = i13;
                reviewSettingsProvider$activityAvailability$1.f32429g = i14;
                reviewSettingsProvider$activityAvailability$1.f32430h = i15;
                reviewSettingsProvider$activityAvailability$1.f32424b = z10;
                reviewSettingsProvider$activityAvailability$1.f32425c = z9;
                reviewSettingsProvider$activityAvailability$1.f32426d = zBooleanValue3;
                reviewSettingsProvider$activityAvailability$1.f32433k = 8;
                objM15541t7 = AbstractC3224d.m15541t(lg8Var114, reviewSettingsProvider$activityAvailability$1);
                if (objM15541t7 != coroutineSingletons) {
                    z11 = zBooleanValue3;
                    objM15541t8 = objM15541t7;
                    z12 = z9;
                    z13 = z10;
                    i16 = i15;
                    i17 = i14;
                    i18 = i12;
                    i19 = i13;
                    boolean zBooleanValue11 = ((Boolean) objM15541t8).booleanValue();
                    i20 = i16;
                    i21 = i17;
                    if (i18 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i20 != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue11);
                }
                return coroutineSingletons;
            case 8:
                boolean z25 = reviewSettingsProvider$activityAvailability$1.f32426d;
                boolean z26 = reviewSettingsProvider$activityAvailability$1.f32425c;
                boolean z27 = reviewSettingsProvider$activityAvailability$1.f32424b;
                i16 = reviewSettingsProvider$activityAvailability$1.f32430h;
                i17 = reviewSettingsProvider$activityAvailability$1.f32429g;
                i19 = reviewSettingsProvider$activityAvailability$1.f32428f;
                i18 = reviewSettingsProvider$activityAvailability$1.f32427e;
                AbstractC3193b.m15359b(objM15541t8);
                z11 = z25;
                z12 = z26;
                z13 = z27;
                boolean zBooleanValue12 = ((Boolean) objM15541t8).booleanValue();
                i20 = i16;
                i21 = i17;
                if (i18 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i19 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i21 != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i20 != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                return new ob8(z14, z15, z16, z17, z13, z12, z11, zBooleanValue12);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a A[PHI: r2 r9
      0x009a: PHI (r2v3 boolean) = (r2v2 boolean), (r2v4 boolean) binds: [B:22:0x0096, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:22:0x0096, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2 A[PHI: r2 r3 r4 r9
      0x00d2: PHI (r2v7 boolean) = (r2v5 boolean), (r2v9 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r4v5 boolean) = (r4v3 boolean), (r4v6 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r9v22 java.lang.Object) = (r9v21 java.lang.Object), (r9v1 java.lang.Object) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m9595b(ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$flashcardBackSettings$1 reviewSettingsProvider$flashcardBackSettings$1;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Object objM15541t;
        boolean z;
        boolean z2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        Object objM15541t2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zBooleanValue5;
        Object objM15541t3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ig8 ig8Var = (ig8) this.f32467a;
        if (continuationImpl instanceof ReviewSettingsProvider$flashcardBackSettings$1) {
            reviewSettingsProvider$flashcardBackSettings$1 = (ReviewSettingsProvider$flashcardBackSettings$1) continuationImpl;
            int i = reviewSettingsProvider$flashcardBackSettings$1.f32441h;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = i - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$flashcardBackSettings$1 = new ReviewSettingsProvider$flashcardBackSettings$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$flashcardBackSettings$1 = new ReviewSettingsProvider$flashcardBackSettings$1(this, continuationImpl);
        }
        Object objM15541t4 = reviewSettingsProvider$flashcardBackSettings$1.f32439f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (reviewSettingsProvider$flashcardBackSettings$1.f32441h) {
            case 0:
                AbstractC3193b.m15359b(objM15541t4);
                lg8 lg8Var = ((C1370c) ig8Var).f18511W;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 1;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var2 = ((C1370c) ig8Var).f18512X;
                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = zBooleanValue;
                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 2;
                    objM15541t4 = AbstractC3224d.m15541t(lg8Var2, reviewSettingsProvider$flashcardBackSettings$1);
                    if (objM15541t4 != coroutineSingletons) {
                        zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var3 = ((C1370c) ig8Var).f18514Z;
                        reviewSettingsProvider$flashcardBackSettings$1.f32434a = zBooleanValue;
                        reviewSettingsProvider$flashcardBackSettings$1.f32435b = zBooleanValue2;
                        reviewSettingsProvider$flashcardBackSettings$1.f32441h = 3;
                        objM15541t = AbstractC3224d.m15541t(lg8Var3, reviewSettingsProvider$flashcardBackSettings$1);
                        if (objM15541t != coroutineSingletons) {
                            z = zBooleanValue2;
                            objM15541t4 = objM15541t;
                            z2 = zBooleanValue;
                            zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var4 = ((C1370c) ig8Var).f18516a0;
                            reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                            reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                            reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                            reviewSettingsProvider$flashcardBackSettings$1.f32441h = 4;
                            objM15541t4 = AbstractC3224d.m15541t(lg8Var4, reviewSettingsProvider$flashcardBackSettings$1);
                            if (objM15541t4 != coroutineSingletons) {
                                zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                                lg8 lg8Var5 = ((C1370c) ig8Var).f18520c0;
                                reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                                reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                                reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                                reviewSettingsProvider$flashcardBackSettings$1.f32437d = zBooleanValue4;
                                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 5;
                                objM15541t2 = AbstractC3224d.m15541t(lg8Var5, reviewSettingsProvider$flashcardBackSettings$1);
                                if (objM15541t2 != coroutineSingletons) {
                                    boolean z10 = zBooleanValue3;
                                    z3 = zBooleanValue4;
                                    objM15541t4 = objM15541t2;
                                    z4 = z;
                                    z5 = z10;
                                    zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                                    lg8 lg8Var6 = ((C1370c) ig8Var).f18522d0;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                                    objM15541t3 = AbstractC3224d.m15541t(lg8Var6, reviewSettingsProvider$flashcardBackSettings$1);
                                    if (objM15541t3 != coroutineSingletons) {
                                        z6 = z2;
                                        z7 = z3;
                                        z8 = z4;
                                        z9 = zBooleanValue5;
                                        objM15541t4 = objM15541t3;
                                        return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var7 = ((C1370c) ig8Var).f18512X;
                reviewSettingsProvider$flashcardBackSettings$1.f32434a = zBooleanValue;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 2;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var7, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var8 = ((C1370c) ig8Var).f18514Z;
                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = zBooleanValue;
                    reviewSettingsProvider$flashcardBackSettings$1.f32435b = zBooleanValue2;
                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 3;
                    objM15541t = AbstractC3224d.m15541t(lg8Var8, reviewSettingsProvider$flashcardBackSettings$1);
                    if (objM15541t != coroutineSingletons) {
                        z = zBooleanValue2;
                        objM15541t4 = objM15541t;
                        z2 = zBooleanValue;
                        zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var9 = ((C1370c) ig8Var).f18516a0;
                        reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                        reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                        reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                        reviewSettingsProvider$flashcardBackSettings$1.f32441h = 4;
                        objM15541t4 = AbstractC3224d.m15541t(lg8Var9, reviewSettingsProvider$flashcardBackSettings$1);
                        if (objM15541t4 != coroutineSingletons) {
                            zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var10 = ((C1370c) ig8Var).f18520c0;
                            reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                            reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                            reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                            reviewSettingsProvider$flashcardBackSettings$1.f32437d = zBooleanValue4;
                            reviewSettingsProvider$flashcardBackSettings$1.f32441h = 5;
                            objM15541t2 = AbstractC3224d.m15541t(lg8Var10, reviewSettingsProvider$flashcardBackSettings$1);
                            if (objM15541t2 != coroutineSingletons) {
                                boolean z11 = zBooleanValue3;
                                z3 = zBooleanValue4;
                                objM15541t4 = objM15541t2;
                                z4 = z;
                                z5 = z11;
                                zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                                lg8 lg8Var11 = ((C1370c) ig8Var).f18522d0;
                                reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                                reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                                reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                                reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                                reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                                objM15541t3 = AbstractC3224d.m15541t(lg8Var11, reviewSettingsProvider$flashcardBackSettings$1);
                                if (objM15541t3 != coroutineSingletons) {
                                    z6 = z2;
                                    z7 = z3;
                                    z8 = z4;
                                    z9 = zBooleanValue5;
                                    objM15541t4 = objM15541t3;
                                    return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                zBooleanValue = reviewSettingsProvider$flashcardBackSettings$1.f32434a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var12 = ((C1370c) ig8Var).f18514Z;
                reviewSettingsProvider$flashcardBackSettings$1.f32434a = zBooleanValue;
                reviewSettingsProvider$flashcardBackSettings$1.f32435b = zBooleanValue2;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 3;
                objM15541t = AbstractC3224d.m15541t(lg8Var12, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t != coroutineSingletons) {
                    z = zBooleanValue2;
                    objM15541t4 = objM15541t;
                    z2 = zBooleanValue;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var13 = ((C1370c) ig8Var).f18516a0;
                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                    reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                    reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 4;
                    objM15541t4 = AbstractC3224d.m15541t(lg8Var13, reviewSettingsProvider$flashcardBackSettings$1);
                    if (objM15541t4 != coroutineSingletons) {
                        zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var14 = ((C1370c) ig8Var).f18520c0;
                        reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                        reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                        reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                        reviewSettingsProvider$flashcardBackSettings$1.f32437d = zBooleanValue4;
                        reviewSettingsProvider$flashcardBackSettings$1.f32441h = 5;
                        objM15541t2 = AbstractC3224d.m15541t(lg8Var14, reviewSettingsProvider$flashcardBackSettings$1);
                        if (objM15541t2 != coroutineSingletons) {
                            boolean z12 = zBooleanValue3;
                            z3 = zBooleanValue4;
                            objM15541t4 = objM15541t2;
                            z4 = z;
                            z5 = z12;
                            zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var15 = ((C1370c) ig8Var).f18522d0;
                            reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                            reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                            reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                            reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                            reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                            reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                            objM15541t3 = AbstractC3224d.m15541t(lg8Var15, reviewSettingsProvider$flashcardBackSettings$1);
                            if (objM15541t3 != coroutineSingletons) {
                                z6 = z2;
                                z7 = z3;
                                z8 = z4;
                                z9 = zBooleanValue5;
                                objM15541t4 = objM15541t3;
                                return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                boolean z13 = reviewSettingsProvider$flashcardBackSettings$1.f32435b;
                boolean z14 = reviewSettingsProvider$flashcardBackSettings$1.f32434a;
                AbstractC3193b.m15359b(objM15541t4);
                z2 = z14;
                z = z13;
                zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var16 = ((C1370c) ig8Var).f18516a0;
                reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 4;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var16, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var17 = ((C1370c) ig8Var).f18520c0;
                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                    reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                    reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                    reviewSettingsProvider$flashcardBackSettings$1.f32437d = zBooleanValue4;
                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 5;
                    objM15541t2 = AbstractC3224d.m15541t(lg8Var17, reviewSettingsProvider$flashcardBackSettings$1);
                    if (objM15541t2 != coroutineSingletons) {
                        boolean z15 = zBooleanValue3;
                        z3 = zBooleanValue4;
                        objM15541t4 = objM15541t2;
                        z4 = z;
                        z5 = z15;
                        zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var18 = ((C1370c) ig8Var).f18522d0;
                        reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                        reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                        reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                        reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                        reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                        reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                        objM15541t3 = AbstractC3224d.m15541t(lg8Var18, reviewSettingsProvider$flashcardBackSettings$1);
                        if (objM15541t3 != coroutineSingletons) {
                            z6 = z2;
                            z7 = z3;
                            z8 = z4;
                            z9 = zBooleanValue5;
                            objM15541t4 = objM15541t3;
                            return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                zBooleanValue3 = reviewSettingsProvider$flashcardBackSettings$1.f32436c;
                z = reviewSettingsProvider$flashcardBackSettings$1.f32435b;
                z2 = reviewSettingsProvider$flashcardBackSettings$1.f32434a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var19 = ((C1370c) ig8Var).f18520c0;
                reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                reviewSettingsProvider$flashcardBackSettings$1.f32435b = z;
                reviewSettingsProvider$flashcardBackSettings$1.f32436c = zBooleanValue3;
                reviewSettingsProvider$flashcardBackSettings$1.f32437d = zBooleanValue4;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 5;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var19, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z16 = zBooleanValue3;
                    z3 = zBooleanValue4;
                    objM15541t4 = objM15541t2;
                    z4 = z;
                    z5 = z16;
                    zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var110 = ((C1370c) ig8Var).f18522d0;
                    reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                    reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                    reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                    reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                    reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                    reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var110, reviewSettingsProvider$flashcardBackSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z2;
                        z7 = z3;
                        z8 = z4;
                        z9 = zBooleanValue5;
                        objM15541t4 = objM15541t3;
                        return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                    }
                }
                return coroutineSingletons;
            case 5:
                z3 = reviewSettingsProvider$flashcardBackSettings$1.f32437d;
                z5 = reviewSettingsProvider$flashcardBackSettings$1.f32436c;
                boolean z17 = reviewSettingsProvider$flashcardBackSettings$1.f32435b;
                boolean z18 = reviewSettingsProvider$flashcardBackSettings$1.f32434a;
                AbstractC3193b.m15359b(objM15541t4);
                z4 = z17;
                z2 = z18;
                zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var111 = ((C1370c) ig8Var).f18522d0;
                reviewSettingsProvider$flashcardBackSettings$1.f32434a = z2;
                reviewSettingsProvider$flashcardBackSettings$1.f32435b = z4;
                reviewSettingsProvider$flashcardBackSettings$1.f32436c = z5;
                reviewSettingsProvider$flashcardBackSettings$1.f32437d = z3;
                reviewSettingsProvider$flashcardBackSettings$1.f32438e = zBooleanValue5;
                reviewSettingsProvider$flashcardBackSettings$1.f32441h = 6;
                objM15541t3 = AbstractC3224d.m15541t(lg8Var111, reviewSettingsProvider$flashcardBackSettings$1);
                if (objM15541t3 != coroutineSingletons) {
                    z6 = z2;
                    z7 = z3;
                    z8 = z4;
                    z9 = zBooleanValue5;
                    objM15541t4 = objM15541t3;
                    return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                }
                return coroutineSingletons;
            case 6:
                boolean z19 = reviewSettingsProvider$flashcardBackSettings$1.f32438e;
                boolean z20 = reviewSettingsProvider$flashcardBackSettings$1.f32437d;
                boolean z21 = reviewSettingsProvider$flashcardBackSettings$1.f32436c;
                boolean z22 = reviewSettingsProvider$flashcardBackSettings$1.f32435b;
                z6 = reviewSettingsProvider$flashcardBackSettings$1.f32434a;
                AbstractC3193b.m15359b(objM15541t4);
                z5 = z21;
                z8 = z22;
                z9 = z19;
                z7 = z20;
                return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public Object m9596c(ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$flashcardFrontSettings$1 reviewSettingsProvider$flashcardFrontSettings$1;
        boolean z;
        boolean zBooleanValue;
        Object objM15541t;
        boolean z2;
        boolean z3;
        boolean zBooleanValue2;
        Object objM15541t2;
        boolean z4;
        boolean z5;
        boolean zBooleanValue3;
        Object objM15541t3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ig8 ig8Var = (ig8) this.f32467a;
        if (continuationImpl instanceof ReviewSettingsProvider$flashcardFrontSettings$1) {
            reviewSettingsProvider$flashcardFrontSettings$1 = (ReviewSettingsProvider$flashcardFrontSettings$1) continuationImpl;
            int i = reviewSettingsProvider$flashcardFrontSettings$1.f32448g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$flashcardFrontSettings$1.f32448g = i - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$flashcardFrontSettings$1 = new ReviewSettingsProvider$flashcardFrontSettings$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$flashcardFrontSettings$1 = new ReviewSettingsProvider$flashcardFrontSettings$1(this, continuationImpl);
        }
        Object objM15541t4 = reviewSettingsProvider$flashcardFrontSettings$1.f32446e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSettingsProvider$flashcardFrontSettings$1.f32448g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t4);
            mg8 mg8Var = ((C1370c) ig8Var).f18507S;
            reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 1;
            objM15541t4 = AbstractC3224d.m15541t(mg8Var, reviewSettingsProvider$flashcardFrontSettings$1);
            if (objM15541t4 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM15541t4);
        } else {
            if (i2 == 2) {
                z = reviewSettingsProvider$flashcardFrontSettings$1.f32442a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var = ((C1370c) ig8Var).f18509U;
                reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z;
                reviewSettingsProvider$flashcardFrontSettings$1.f32443b = zBooleanValue;
                reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 3;
                objM15541t = AbstractC3224d.m15541t(lg8Var, reviewSettingsProvider$flashcardFrontSettings$1);
                if (objM15541t != coroutineSingletons) {
                    boolean z10 = z;
                    z2 = zBooleanValue;
                    objM15541t4 = objM15541t;
                    z3 = z10;
                    zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var2 = ((C1370c) ig8Var).f18510V;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z2;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32444c = zBooleanValue2;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 4;
                    objM15541t2 = AbstractC3224d.m15541t(lg8Var2, reviewSettingsProvider$flashcardFrontSettings$1);
                    if (objM15541t2 != coroutineSingletons) {
                        boolean z11 = z2;
                        z4 = zBooleanValue2;
                        objM15541t4 = objM15541t2;
                        z5 = z11;
                        zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var3 = ((C1370c) ig8Var).f18518b0;
                        reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                        reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z5;
                        reviewSettingsProvider$flashcardFrontSettings$1.f32444c = z4;
                        reviewSettingsProvider$flashcardFrontSettings$1.f32445d = zBooleanValue3;
                        reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 5;
                        objM15541t3 = AbstractC3224d.m15541t(lg8Var3, reviewSettingsProvider$flashcardFrontSettings$1);
                        if (objM15541t3 != coroutineSingletons) {
                            z6 = z4;
                            z7 = z5;
                            z8 = z3;
                            z9 = zBooleanValue3;
                            objM15541t4 = objM15541t3;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                z2 = reviewSettingsProvider$flashcardFrontSettings$1.f32443b;
                z3 = reviewSettingsProvider$flashcardFrontSettings$1.f32442a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var4 = ((C1370c) ig8Var).f18510V;
                reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z2;
                reviewSettingsProvider$flashcardFrontSettings$1.f32444c = zBooleanValue2;
                reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 4;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var4, reviewSettingsProvider$flashcardFrontSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z12 = z2;
                    z4 = zBooleanValue2;
                    objM15541t4 = objM15541t2;
                    z5 = z12;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var5 = ((C1370c) ig8Var).f18518b0;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z5;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32444c = z4;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32445d = zBooleanValue3;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 5;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var5, reviewSettingsProvider$flashcardFrontSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z4;
                        z7 = z5;
                        z8 = z3;
                        z9 = zBooleanValue3;
                        objM15541t4 = objM15541t3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                z4 = reviewSettingsProvider$flashcardFrontSettings$1.f32444c;
                z5 = reviewSettingsProvider$flashcardFrontSettings$1.f32443b;
                z3 = reviewSettingsProvider$flashcardFrontSettings$1.f32442a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var6 = ((C1370c) ig8Var).f18518b0;
                reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z5;
                reviewSettingsProvider$flashcardFrontSettings$1.f32444c = z4;
                reviewSettingsProvider$flashcardFrontSettings$1.f32445d = zBooleanValue3;
                reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 5;
                objM15541t3 = AbstractC3224d.m15541t(lg8Var6, reviewSettingsProvider$flashcardFrontSettings$1);
                if (objM15541t3 != coroutineSingletons) {
                    z6 = z4;
                    z7 = z5;
                    z8 = z3;
                    z9 = zBooleanValue3;
                    objM15541t4 = objM15541t3;
                }
                return coroutineSingletons;
            }
            if (i2 != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z13 = reviewSettingsProvider$flashcardFrontSettings$1.f32445d;
            boolean z14 = reviewSettingsProvider$flashcardFrontSettings$1.f32444c;
            z7 = reviewSettingsProvider$flashcardFrontSettings$1.f32443b;
            z8 = reviewSettingsProvider$flashcardFrontSettings$1.f32442a;
            AbstractC3193b.m15359b(objM15541t4);
            z9 = z13;
            z6 = z14;
        }
        return new u63(z8, z7, z6, z9, ((Boolean) objM15541t4).booleanValue());
        boolean zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
        mg8 mg8Var2 = ((C1370c) ig8Var).f18508T;
        reviewSettingsProvider$flashcardFrontSettings$1.f32442a = zBooleanValue4;
        reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 2;
        Object objM15541t5 = AbstractC3224d.m15541t(mg8Var2, reviewSettingsProvider$flashcardFrontSettings$1);
        if (objM15541t5 != coroutineSingletons) {
            z = zBooleanValue4;
            objM15541t4 = objM15541t5;
            zBooleanValue = ((Boolean) objM15541t4).booleanValue();
            lg8 lg8Var7 = ((C1370c) ig8Var).f18509U;
            reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z;
            reviewSettingsProvider$flashcardFrontSettings$1.f32443b = zBooleanValue;
            reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 3;
            objM15541t = AbstractC3224d.m15541t(lg8Var7, reviewSettingsProvider$flashcardFrontSettings$1);
            if (objM15541t != coroutineSingletons) {
                boolean z15 = z;
                z2 = zBooleanValue;
                objM15541t4 = objM15541t;
                z3 = z15;
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var8 = ((C1370c) ig8Var).f18510V;
                reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z2;
                reviewSettingsProvider$flashcardFrontSettings$1.f32444c = zBooleanValue2;
                reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 4;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var8, reviewSettingsProvider$flashcardFrontSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z16 = z2;
                    z4 = zBooleanValue2;
                    objM15541t4 = objM15541t2;
                    z5 = z16;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var9 = ((C1370c) ig8Var).f18518b0;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32442a = z3;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32443b = z5;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32444c = z4;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32445d = zBooleanValue3;
                    reviewSettingsProvider$flashcardFrontSettings$1.f32448g = 5;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var9, reviewSettingsProvider$flashcardFrontSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z4;
                        z7 = z5;
                        z8 = z3;
                        z9 = zBooleanValue3;
                        objM15541t4 = objM15541t3;
                        return new u63(z8, z7, z6, z9, ((Boolean) objM15541t4).booleanValue());
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a A[PHI: r2 r9
      0x009a: PHI (r2v3 boolean) = (r2v2 boolean), (r2v4 boolean) binds: [B:22:0x0096, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:22:0x0096, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2 A[PHI: r2 r3 r4 r9
      0x00d2: PHI (r2v7 boolean) = (r2v5 boolean), (r2v9 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r4v5 boolean) = (r4v3 boolean), (r4v6 boolean) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r9v22 java.lang.Object) = (r9v21 java.lang.Object), (r9v1 java.lang.Object) binds: [B:29:0x00cf, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public Object m9597d(ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$flashcardReverseBackSettings$1 reviewSettingsProvider$flashcardReverseBackSettings$1;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Object objM15541t;
        boolean z;
        boolean z2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        Object objM15541t2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zBooleanValue5;
        Object objM15541t3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ig8 ig8Var = (ig8) this.f32467a;
        if (continuationImpl instanceof ReviewSettingsProvider$flashcardReverseBackSettings$1) {
            reviewSettingsProvider$flashcardReverseBackSettings$1 = (ReviewSettingsProvider$flashcardReverseBackSettings$1) continuationImpl;
            int i = reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = i - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$flashcardReverseBackSettings$1 = new ReviewSettingsProvider$flashcardReverseBackSettings$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$flashcardReverseBackSettings$1 = new ReviewSettingsProvider$flashcardReverseBackSettings$1(this, continuationImpl);
        }
        Object objM15541t4 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32454f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h) {
            case 0:
                AbstractC3193b.m15359b(objM15541t4);
                lg8 lg8Var = ((C1370c) ig8Var).f18532i0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 1;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var2 = ((C1370c) ig8Var).f18534j0;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = zBooleanValue;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 2;
                    objM15541t4 = AbstractC3224d.m15541t(lg8Var2, reviewSettingsProvider$flashcardReverseBackSettings$1);
                    if (objM15541t4 != coroutineSingletons) {
                        zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var3 = ((C1370c) ig8Var).f18536k0;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = zBooleanValue;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = zBooleanValue2;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 3;
                        objM15541t = AbstractC3224d.m15541t(lg8Var3, reviewSettingsProvider$flashcardReverseBackSettings$1);
                        if (objM15541t != coroutineSingletons) {
                            z = zBooleanValue2;
                            objM15541t4 = objM15541t;
                            z2 = zBooleanValue;
                            zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var4 = ((C1370c) ig8Var).f18538l0;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 4;
                            objM15541t4 = AbstractC3224d.m15541t(lg8Var4, reviewSettingsProvider$flashcardReverseBackSettings$1);
                            if (objM15541t4 != coroutineSingletons) {
                                zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                                lg8 lg8Var5 = ((C1370c) ig8Var).f18542n0;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = zBooleanValue4;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 5;
                                objM15541t2 = AbstractC3224d.m15541t(lg8Var5, reviewSettingsProvider$flashcardReverseBackSettings$1);
                                if (objM15541t2 != coroutineSingletons) {
                                    boolean z10 = zBooleanValue3;
                                    z3 = zBooleanValue4;
                                    objM15541t4 = objM15541t2;
                                    z4 = z;
                                    z5 = z10;
                                    zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                                    lg8 lg8Var6 = ((C1370c) ig8Var).f18544o0;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                                    objM15541t3 = AbstractC3224d.m15541t(lg8Var6, reviewSettingsProvider$flashcardReverseBackSettings$1);
                                    if (objM15541t3 != coroutineSingletons) {
                                        z6 = z2;
                                        z7 = z3;
                                        z8 = z4;
                                        z9 = zBooleanValue5;
                                        objM15541t4 = objM15541t3;
                                        return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var7 = ((C1370c) ig8Var).f18534j0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = zBooleanValue;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 2;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var7, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var8 = ((C1370c) ig8Var).f18536k0;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = zBooleanValue;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = zBooleanValue2;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 3;
                    objM15541t = AbstractC3224d.m15541t(lg8Var8, reviewSettingsProvider$flashcardReverseBackSettings$1);
                    if (objM15541t != coroutineSingletons) {
                        z = zBooleanValue2;
                        objM15541t4 = objM15541t;
                        z2 = zBooleanValue;
                        zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var9 = ((C1370c) ig8Var).f18538l0;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 4;
                        objM15541t4 = AbstractC3224d.m15541t(lg8Var9, reviewSettingsProvider$flashcardReverseBackSettings$1);
                        if (objM15541t4 != coroutineSingletons) {
                            zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var10 = ((C1370c) ig8Var).f18542n0;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = zBooleanValue4;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 5;
                            objM15541t2 = AbstractC3224d.m15541t(lg8Var10, reviewSettingsProvider$flashcardReverseBackSettings$1);
                            if (objM15541t2 != coroutineSingletons) {
                                boolean z11 = zBooleanValue3;
                                z3 = zBooleanValue4;
                                objM15541t4 = objM15541t2;
                                z4 = z;
                                z5 = z11;
                                zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                                lg8 lg8Var11 = ((C1370c) ig8Var).f18544o0;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                                objM15541t3 = AbstractC3224d.m15541t(lg8Var11, reviewSettingsProvider$flashcardReverseBackSettings$1);
                                if (objM15541t3 != coroutineSingletons) {
                                    z6 = z2;
                                    z7 = z3;
                                    z8 = z4;
                                    z9 = zBooleanValue5;
                                    objM15541t4 = objM15541t3;
                                    return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                zBooleanValue = reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var12 = ((C1370c) ig8Var).f18536k0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = zBooleanValue;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = zBooleanValue2;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 3;
                objM15541t = AbstractC3224d.m15541t(lg8Var12, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t != coroutineSingletons) {
                    z = zBooleanValue2;
                    objM15541t4 = objM15541t;
                    z2 = zBooleanValue;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var13 = ((C1370c) ig8Var).f18538l0;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 4;
                    objM15541t4 = AbstractC3224d.m15541t(lg8Var13, reviewSettingsProvider$flashcardReverseBackSettings$1);
                    if (objM15541t4 != coroutineSingletons) {
                        zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var14 = ((C1370c) ig8Var).f18542n0;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = zBooleanValue4;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 5;
                        objM15541t2 = AbstractC3224d.m15541t(lg8Var14, reviewSettingsProvider$flashcardReverseBackSettings$1);
                        if (objM15541t2 != coroutineSingletons) {
                            boolean z12 = zBooleanValue3;
                            z3 = zBooleanValue4;
                            objM15541t4 = objM15541t2;
                            z4 = z;
                            z5 = z12;
                            zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                            lg8 lg8Var15 = ((C1370c) ig8Var).f18544o0;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                            reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                            objM15541t3 = AbstractC3224d.m15541t(lg8Var15, reviewSettingsProvider$flashcardReverseBackSettings$1);
                            if (objM15541t3 != coroutineSingletons) {
                                z6 = z2;
                                z7 = z3;
                                z8 = z4;
                                z9 = zBooleanValue5;
                                objM15541t4 = objM15541t3;
                                return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                boolean z13 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b;
                boolean z14 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a;
                AbstractC3193b.m15359b(objM15541t4);
                z2 = z14;
                z = z13;
                zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var16 = ((C1370c) ig8Var).f18538l0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 4;
                objM15541t4 = AbstractC3224d.m15541t(lg8Var16, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t4 != coroutineSingletons) {
                    zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var17 = ((C1370c) ig8Var).f18542n0;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = zBooleanValue4;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 5;
                    objM15541t2 = AbstractC3224d.m15541t(lg8Var17, reviewSettingsProvider$flashcardReverseBackSettings$1);
                    if (objM15541t2 != coroutineSingletons) {
                        boolean z15 = zBooleanValue3;
                        z3 = zBooleanValue4;
                        objM15541t4 = objM15541t2;
                        z4 = z;
                        z5 = z15;
                        zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var18 = ((C1370c) ig8Var).f18544o0;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                        reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                        objM15541t3 = AbstractC3224d.m15541t(lg8Var18, reviewSettingsProvider$flashcardReverseBackSettings$1);
                        if (objM15541t3 != coroutineSingletons) {
                            z6 = z2;
                            z7 = z3;
                            z8 = z4;
                            z9 = zBooleanValue5;
                            objM15541t4 = objM15541t3;
                            return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                zBooleanValue3 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c;
                z = reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b;
                z2 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var19 = ((C1370c) ig8Var).f18542n0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = zBooleanValue3;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = zBooleanValue4;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 5;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var19, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z16 = zBooleanValue3;
                    z3 = zBooleanValue4;
                    objM15541t4 = objM15541t2;
                    z4 = z;
                    z5 = z16;
                    zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var110 = ((C1370c) ig8Var).f18544o0;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                    reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var110, reviewSettingsProvider$flashcardReverseBackSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z2;
                        z7 = z3;
                        z8 = z4;
                        z9 = zBooleanValue5;
                        objM15541t4 = objM15541t3;
                        return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                    }
                }
                return coroutineSingletons;
            case 5:
                z3 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d;
                z5 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c;
                boolean z17 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b;
                boolean z18 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a;
                AbstractC3193b.m15359b(objM15541t4);
                z4 = z17;
                z2 = z18;
                zBooleanValue5 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var111 = ((C1370c) ig8Var).f18544o0;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a = z2;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b = z4;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c = z5;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d = z3;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e = zBooleanValue5;
                reviewSettingsProvider$flashcardReverseBackSettings$1.f32456h = 6;
                objM15541t3 = AbstractC3224d.m15541t(lg8Var111, reviewSettingsProvider$flashcardReverseBackSettings$1);
                if (objM15541t3 != coroutineSingletons) {
                    z6 = z2;
                    z7 = z3;
                    z8 = z4;
                    z9 = zBooleanValue5;
                    objM15541t4 = objM15541t3;
                    return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
                }
                return coroutineSingletons;
            case 6:
                boolean z19 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32453e;
                boolean z20 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32452d;
                boolean z21 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32451c;
                boolean z22 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32450b;
                z6 = reviewSettingsProvider$flashcardReverseBackSettings$1.f32449a;
                AbstractC3193b.m15359b(objM15541t4);
                z5 = z21;
                z8 = z22;
                z9 = z19;
                z7 = z20;
                return new u63(z6, z8, z5, z7, z9, ((Boolean) objM15541t4).booleanValue(), true);
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public Object m9598e(ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$flashcardReverseFrontSettings$1 reviewSettingsProvider$flashcardReverseFrontSettings$1;
        boolean z;
        boolean zBooleanValue;
        Object objM15541t;
        boolean z2;
        boolean z3;
        boolean zBooleanValue2;
        Object objM15541t2;
        boolean z4;
        boolean z5;
        boolean zBooleanValue3;
        Object objM15541t3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ig8 ig8Var = (ig8) this.f32467a;
        if (continuationImpl instanceof ReviewSettingsProvider$flashcardReverseFrontSettings$1) {
            reviewSettingsProvider$flashcardReverseFrontSettings$1 = (ReviewSettingsProvider$flashcardReverseFrontSettings$1) continuationImpl;
            int i = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = i - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$flashcardReverseFrontSettings$1 = new ReviewSettingsProvider$flashcardReverseFrontSettings$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$flashcardReverseFrontSettings$1 = new ReviewSettingsProvider$flashcardReverseFrontSettings$1(this, continuationImpl);
        }
        Object objM15541t4 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32461e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t4);
            lg8 lg8Var = ((C1370c) ig8Var).f18524e0;
            reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 1;
            objM15541t4 = AbstractC3224d.m15541t(lg8Var, reviewSettingsProvider$flashcardReverseFrontSettings$1);
            if (objM15541t4 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM15541t4);
        } else {
            if (i2 == 2) {
                z = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var2 = ((C1370c) ig8Var).f18528g0;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = zBooleanValue;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 3;
                objM15541t = AbstractC3224d.m15541t(lg8Var2, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                if (objM15541t != coroutineSingletons) {
                    boolean z10 = z;
                    z2 = zBooleanValue;
                    objM15541t4 = objM15541t;
                    z3 = z10;
                    zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var3 = ((C1370c) ig8Var).f18530h0;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z2;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = zBooleanValue2;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 4;
                    objM15541t2 = AbstractC3224d.m15541t(lg8Var3, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                    if (objM15541t2 != coroutineSingletons) {
                        boolean z11 = z2;
                        z4 = zBooleanValue2;
                        objM15541t4 = objM15541t2;
                        z5 = z11;
                        zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                        lg8 lg8Var4 = ((C1370c) ig8Var).f18540m0;
                        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z5;
                        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = z4;
                        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32460d = zBooleanValue3;
                        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 5;
                        objM15541t3 = AbstractC3224d.m15541t(lg8Var4, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                        if (objM15541t3 != coroutineSingletons) {
                            z6 = z4;
                            z7 = z5;
                            z8 = z3;
                            z9 = zBooleanValue3;
                            objM15541t4 = objM15541t3;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                z2 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b;
                z3 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var5 = ((C1370c) ig8Var).f18530h0;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z2;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = zBooleanValue2;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 4;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var5, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z12 = z2;
                    z4 = zBooleanValue2;
                    objM15541t4 = objM15541t2;
                    z5 = z12;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var6 = ((C1370c) ig8Var).f18540m0;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z5;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = z4;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32460d = zBooleanValue3;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 5;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var6, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z4;
                        z7 = z5;
                        z8 = z3;
                        z9 = zBooleanValue3;
                        objM15541t4 = objM15541t3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                z4 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c;
                z5 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b;
                z3 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a;
                AbstractC3193b.m15359b(objM15541t4);
                zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var7 = ((C1370c) ig8Var).f18540m0;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z5;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = z4;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32460d = zBooleanValue3;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 5;
                objM15541t3 = AbstractC3224d.m15541t(lg8Var7, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                if (objM15541t3 != coroutineSingletons) {
                    z6 = z4;
                    z7 = z5;
                    z8 = z3;
                    z9 = zBooleanValue3;
                    objM15541t4 = objM15541t3;
                }
                return coroutineSingletons;
            }
            if (i2 != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z13 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32460d;
            boolean z14 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c;
            z7 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b;
            z8 = reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a;
            AbstractC3193b.m15359b(objM15541t4);
            z9 = z13;
            z6 = z14;
        }
        return new u63(z8, z7, z6, z9, ((Boolean) objM15541t4).booleanValue());
        boolean zBooleanValue4 = ((Boolean) objM15541t4).booleanValue();
        lg8 lg8Var8 = ((C1370c) ig8Var).f18526f0;
        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = zBooleanValue4;
        reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 2;
        Object objM15541t5 = AbstractC3224d.m15541t(lg8Var8, reviewSettingsProvider$flashcardReverseFrontSettings$1);
        if (objM15541t5 != coroutineSingletons) {
            z = zBooleanValue4;
            objM15541t4 = objM15541t5;
            zBooleanValue = ((Boolean) objM15541t4).booleanValue();
            lg8 lg8Var9 = ((C1370c) ig8Var).f18528g0;
            reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z;
            reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = zBooleanValue;
            reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 3;
            objM15541t = AbstractC3224d.m15541t(lg8Var9, reviewSettingsProvider$flashcardReverseFrontSettings$1);
            if (objM15541t != coroutineSingletons) {
                boolean z15 = z;
                z2 = zBooleanValue;
                objM15541t4 = objM15541t;
                z3 = z15;
                zBooleanValue2 = ((Boolean) objM15541t4).booleanValue();
                lg8 lg8Var10 = ((C1370c) ig8Var).f18530h0;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z2;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = zBooleanValue2;
                reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 4;
                objM15541t2 = AbstractC3224d.m15541t(lg8Var10, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                if (objM15541t2 != coroutineSingletons) {
                    boolean z16 = z2;
                    z4 = zBooleanValue2;
                    objM15541t4 = objM15541t2;
                    z5 = z16;
                    zBooleanValue3 = ((Boolean) objM15541t4).booleanValue();
                    lg8 lg8Var11 = ((C1370c) ig8Var).f18540m0;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32457a = z3;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32458b = z5;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32459c = z4;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32460d = zBooleanValue3;
                    reviewSettingsProvider$flashcardReverseFrontSettings$1.f32463g = 5;
                    objM15541t3 = AbstractC3224d.m15541t(lg8Var11, reviewSettingsProvider$flashcardReverseFrontSettings$1);
                    if (objM15541t3 != coroutineSingletons) {
                        z6 = z4;
                        z7 = z5;
                        z8 = z3;
                        z9 = zBooleanValue3;
                        objM15541t4 = objM15541t3;
                        return new u63(z8, z7, z6, z9, ((Boolean) objM15541t4).booleanValue());
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m9599f(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetWordTagsUseCase$invoke$1 getWordTagsUseCase$invoke$1;
        if (continuationImpl instanceof GetWordTagsUseCase$invoke$1) {
            getWordTagsUseCase$invoke$1 = (GetWordTagsUseCase$invoke$1) continuationImpl;
            int i = getWordTagsUseCase$invoke$1.f32418c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWordTagsUseCase$invoke$1.f32418c = i - Integer.MIN_VALUE;
            } else {
                getWordTagsUseCase$invoke$1 = new GetWordTagsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getWordTagsUseCase$invoke$1 = new GetWordTagsUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7425d = getWordTagsUseCase$invoke$1.f32416a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWordTagsUseCase$invoke$1.f32418c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7425d);
            s7b s7bVar = (s7b) this.f32467a;
            getWordTagsUseCase$invoke$1.f32418c = 1;
            objM7425d = ((C1310z) s7bVar).m7425d(str, str2, getWordTagsUseCase$invoke$1);
            if (objM7425d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7425d);
        }
        LessonWord lessonWord = (LessonWord) objM7425d;
        List list = lessonWord != null ? lessonWord.f19316c : null;
        return list == null ? EmptyList.f47638a : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m9600g(ContinuationImpl continuationImpl) throws Throwable {
        ReviewSettingsProvider$shouldShuffleCards$1 reviewSettingsProvider$shouldShuffleCards$1;
        if (continuationImpl instanceof ReviewSettingsProvider$shouldShuffleCards$1) {
            reviewSettingsProvider$shouldShuffleCards$1 = (ReviewSettingsProvider$shouldShuffleCards$1) continuationImpl;
            int i = reviewSettingsProvider$shouldShuffleCards$1.f32466c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSettingsProvider$shouldShuffleCards$1.f32466c = i - Integer.MIN_VALUE;
            } else {
                reviewSettingsProvider$shouldShuffleCards$1 = new ReviewSettingsProvider$shouldShuffleCards$1(this, continuationImpl);
            }
        } else {
            reviewSettingsProvider$shouldShuffleCards$1 = new ReviewSettingsProvider$shouldShuffleCards$1(this, continuationImpl);
        }
        Object objM15541t = reviewSettingsProvider$shouldShuffleCards$1.f32464a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSettingsProvider$shouldShuffleCards$1.f32466c;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1370c) ((ig8) this.f32467a)).f18500L;
            reviewSettingsProvider$shouldShuffleCards$1.f32466c = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, reviewSettingsProvider$shouldShuffleCards$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        Collection collectionValues = ((Map) objM15541t).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C2755a(ig8 ig8Var) {
        ig8Var.getClass();
        this.f32467a = ig8Var;
    }
}
