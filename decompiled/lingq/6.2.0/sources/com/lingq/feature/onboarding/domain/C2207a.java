package com.lingq.feature.onboarding.domain;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.data.repository.C1301q;
import com.lingq.core.domain.model.user.Profile;
import java.io.Serializable;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.aq6;
import p000.km7;
import p000.lm4;
import p000.ul7;
import p000.um5;
import p000.xf2;
import p000.xfa;
import p000.xm5;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.domain.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2207a {

    /* JADX INFO: renamed from: a */
    public final km7 f27225a;

    /* JADX INFO: renamed from: b */
    public final lm4 f27226b;

    /* JADX INFO: renamed from: c */
    public final xf2 f27227c;

    /* JADX INFO: renamed from: d */
    public final C1297m f27228d;

    /* JADX INFO: renamed from: e */
    public final aq6 f27229e;

    public C2207a(km7 km7Var, lm4 lm4Var, xf2 xf2Var, C1297m c1297m, aq6 aq6Var) {
        km7Var.getClass();
        lm4Var.getClass();
        xf2Var.getClass();
        c1297m.getClass();
        aq6Var.getClass();
        this.f27225a = km7Var;
        this.f27226b = lm4Var;
        this.f27227c = xf2Var;
        this.f27228d = c1297m;
        this.f27229e = aq6Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b3 A[PHI: r2 r9
      0x00b3: PHI (r2v3 ym5) = (r2v2 ym5), (r2v5 ym5) binds: [B:24:0x00af, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:24:0x00af, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122 A[PHI: r2 r3 r4 r5
      0x0122: PHI (r2v16 java.util.List) = (r2v13 java.util.List), (r2v18 java.util.List) binds: [B:39:0x011f, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r3v10 java.util.List) = (r3v7 java.util.List), (r3v12 java.util.List) binds: [B:39:0x011f, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r4v6 ym5) = (r4v4 ym5), (r4v7 ym5) binds: [B:39:0x011f, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r5v11 ym5) = (r5v9 ym5), (r5v12 ym5) binds: [B:39:0x011f, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x014f A[PHI: r2 r3 r4 r5
      0x014f: PHI (r2v19 java.util.List) = (r2v16 java.util.List), (r2v22 java.util.List) binds: [B:46:0x014c, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r3v13 java.util.List) = (r3v10 java.util.List), (r3v15 java.util.List) binds: [B:46:0x014c, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r4v8 ym5) = (r4v6 ym5), (r4v9 ym5) binds: [B:46:0x014c, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r5v13 ym5) = (r5v11 ym5), (r5v14 ym5) binds: [B:46:0x014c, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9136a(ContinuationImpl continuationImpl) throws Throwable {
        FetchUserDataUseCase$invoke$1 fetchUserDataUseCase$invoke$1;
        ym5 ym5Var;
        ym5 ym5Var2;
        Serializable serializableM7226w;
        ym5 ym5Var3;
        ym5 ym5Var4;
        List list;
        Object objM7204a;
        List list2;
        ym5 ym5Var5;
        List list3;
        ym5 ym5Var6;
        List list4;
        List list5;
        Profile profile;
        String str;
        List list6;
        List list7;
        ym5 ym5Var7;
        ym5 ym5Var8;
        if (continuationImpl instanceof FetchUserDataUseCase$invoke$1) {
            fetchUserDataUseCase$invoke$1 = (FetchUserDataUseCase$invoke$1) continuationImpl;
            int i = fetchUserDataUseCase$invoke$1.f27224g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchUserDataUseCase$invoke$1.f27224g = i - Integer.MIN_VALUE;
            } else {
                fetchUserDataUseCase$invoke$1 = new FetchUserDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchUserDataUseCase$invoke$1 = new FetchUserDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7070K = fetchUserDataUseCase$invoke$1.f27222e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchUserDataUseCase$invoke$1.f27224g;
        lm4 lm4Var = this.f27226b;
        km7 km7Var = this.f27225a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM7070K);
                fetchUserDataUseCase$invoke$1.f27224g = 1;
                objM7070K = ((C1267a) km7Var).m7070K(fetchUserDataUseCase$invoke$1);
                if (objM7070K != coroutineSingletons) {
                    ym5Var = (ym5) objM7070K;
                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var;
                    fetchUserDataUseCase$invoke$1.f27224g = 2;
                    objM7070K = ((C1267a) km7Var).m7069J(fetchUserDataUseCase$invoke$1);
                    if (objM7070K != coroutineSingletons) {
                        ym5Var2 = (ym5) objM7070K;
                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var;
                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var2;
                        fetchUserDataUseCase$invoke$1.f27224g = 3;
                        serializableM7226w = ((C1293i) lm4Var).m7226w(fetchUserDataUseCase$invoke$1);
                        if (serializableM7226w != coroutineSingletons) {
                            ym5 ym5Var9 = ym5Var;
                            ym5Var3 = ym5Var2;
                            objM7070K = serializableM7226w;
                            ym5Var4 = ym5Var9;
                            list = (List) objM7070K;
                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var3;
                            fetchUserDataUseCase$invoke$1.f27220c = list;
                            fetchUserDataUseCase$invoke$1.f27224g = 4;
                            objM7204a = ((C1293i) lm4Var).m7204a(fetchUserDataUseCase$invoke$1);
                            if (objM7204a != coroutineSingletons) {
                                ym5 ym5Var10 = ym5Var3;
                                list2 = list;
                                objM7070K = objM7204a;
                                ym5Var5 = ym5Var10;
                                list3 = (List) objM7070K;
                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var5;
                                fetchUserDataUseCase$invoke$1.f27220c = list2;
                                fetchUserDataUseCase$invoke$1.f27221d = list3;
                                fetchUserDataUseCase$invoke$1.f27224g = 5;
                                if (((C1267a) km7Var).m7065F(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                    ym5Var6 = ym5Var5;
                                    list4 = list2;
                                    list5 = list3;
                                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                    fetchUserDataUseCase$invoke$1.f27220c = list4;
                                    fetchUserDataUseCase$invoke$1.f27221d = list5;
                                    fetchUserDataUseCase$invoke$1.f27224g = 6;
                                    if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                        if (ym5Var4 instanceof xm5) {
                                            profile = (Profile) ((xm5) ym5Var4).f68348a;
                                            if (profile.f19652a != 0) {
                                                str = profile.f19666o;
                                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                                fetchUserDataUseCase$invoke$1.f27220c = list4;
                                                fetchUserDataUseCase$invoke$1.f27221d = list5;
                                                fetchUserDataUseCase$invoke$1.f27224g = 7;
                                                if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                                    fetchUserDataUseCase$invoke$1.f27220c = list4;
                                                    fetchUserDataUseCase$invoke$1.f27221d = list5;
                                                    fetchUserDataUseCase$invoke$1.f27224g = 8;
                                                    if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                                        list6 = list5;
                                                        list7 = list4;
                                                        ym5Var7 = ym5Var6;
                                                        ym5Var8 = ym5Var4;
                                                        ym5Var4 = ym5Var8;
                                                        list4 = list7;
                                                        ym5Var6 = ym5Var7;
                                                        list5 = list6;
                                                    }
                                                }
                                            }
                                        }
                                        return ((ym5Var4 instanceof xm5) || !(ym5Var6 instanceof xm5) || list4.isEmpty() || list5.isEmpty()) ? new um5(ul7.f64047a) : new xm5(xfa.f68157a);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(objM7070K);
                ym5Var = (ym5) objM7070K;
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var;
                fetchUserDataUseCase$invoke$1.f27224g = 2;
                objM7070K = ((C1267a) km7Var).m7069J(fetchUserDataUseCase$invoke$1);
                if (objM7070K != coroutineSingletons) {
                    ym5Var2 = (ym5) objM7070K;
                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var;
                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var2;
                    fetchUserDataUseCase$invoke$1.f27224g = 3;
                    serializableM7226w = ((C1293i) lm4Var).m7226w(fetchUserDataUseCase$invoke$1);
                    if (serializableM7226w != coroutineSingletons) {
                        ym5 ym5Var11 = ym5Var;
                        ym5Var3 = ym5Var2;
                        objM7070K = serializableM7226w;
                        ym5Var4 = ym5Var11;
                        list = (List) objM7070K;
                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var3;
                        fetchUserDataUseCase$invoke$1.f27220c = list;
                        fetchUserDataUseCase$invoke$1.f27224g = 4;
                        objM7204a = ((C1293i) lm4Var).m7204a(fetchUserDataUseCase$invoke$1);
                        if (objM7204a != coroutineSingletons) {
                            ym5 ym5Var12 = ym5Var3;
                            list2 = list;
                            objM7070K = objM7204a;
                            ym5Var5 = ym5Var12;
                            list3 = (List) objM7070K;
                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var5;
                            fetchUserDataUseCase$invoke$1.f27220c = list2;
                            fetchUserDataUseCase$invoke$1.f27221d = list3;
                            fetchUserDataUseCase$invoke$1.f27224g = 5;
                            if (((C1267a) km7Var).m7065F(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                ym5Var6 = ym5Var5;
                                list4 = list2;
                                list5 = list3;
                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                fetchUserDataUseCase$invoke$1.f27220c = list4;
                                fetchUserDataUseCase$invoke$1.f27221d = list5;
                                fetchUserDataUseCase$invoke$1.f27224g = 6;
                                if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                    if (ym5Var4 instanceof xm5) {
                                        profile = (Profile) ((xm5) ym5Var4).f68348a;
                                        if (profile.f19652a != 0) {
                                            str = profile.f19666o;
                                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                            fetchUserDataUseCase$invoke$1.f27220c = list4;
                                            fetchUserDataUseCase$invoke$1.f27221d = list5;
                                            fetchUserDataUseCase$invoke$1.f27224g = 7;
                                            if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                                fetchUserDataUseCase$invoke$1.f27220c = list4;
                                                fetchUserDataUseCase$invoke$1.f27221d = list5;
                                                fetchUserDataUseCase$invoke$1.f27224g = 8;
                                                if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                                    list6 = list5;
                                                    list7 = list4;
                                                    ym5Var7 = ym5Var6;
                                                    ym5Var8 = ym5Var4;
                                                    ym5Var4 = ym5Var8;
                                                    list4 = list7;
                                                    ym5Var6 = ym5Var7;
                                                    list5 = list6;
                                                }
                                            }
                                        }
                                    }
                                    if (ym5Var4 instanceof xm5) {
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                ym5Var = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                ym5Var2 = (ym5) objM7070K;
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var;
                fetchUserDataUseCase$invoke$1.f27219b = ym5Var2;
                fetchUserDataUseCase$invoke$1.f27224g = 3;
                serializableM7226w = ((C1293i) lm4Var).m7226w(fetchUserDataUseCase$invoke$1);
                if (serializableM7226w != coroutineSingletons) {
                    ym5 ym5Var13 = ym5Var;
                    ym5Var3 = ym5Var2;
                    objM7070K = serializableM7226w;
                    ym5Var4 = ym5Var13;
                    list = (List) objM7070K;
                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var3;
                    fetchUserDataUseCase$invoke$1.f27220c = list;
                    fetchUserDataUseCase$invoke$1.f27224g = 4;
                    objM7204a = ((C1293i) lm4Var).m7204a(fetchUserDataUseCase$invoke$1);
                    if (objM7204a != coroutineSingletons) {
                        ym5 ym5Var14 = ym5Var3;
                        list2 = list;
                        objM7070K = objM7204a;
                        ym5Var5 = ym5Var14;
                        list3 = (List) objM7070K;
                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var5;
                        fetchUserDataUseCase$invoke$1.f27220c = list2;
                        fetchUserDataUseCase$invoke$1.f27221d = list3;
                        fetchUserDataUseCase$invoke$1.f27224g = 5;
                        if (((C1267a) km7Var).m7065F(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                            ym5Var6 = ym5Var5;
                            list4 = list2;
                            list5 = list3;
                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                            fetchUserDataUseCase$invoke$1.f27220c = list4;
                            fetchUserDataUseCase$invoke$1.f27221d = list5;
                            fetchUserDataUseCase$invoke$1.f27224g = 6;
                            if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                if (ym5Var4 instanceof xm5) {
                                    profile = (Profile) ((xm5) ym5Var4).f68348a;
                                    if (profile.f19652a != 0) {
                                        str = profile.f19666o;
                                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                        fetchUserDataUseCase$invoke$1.f27220c = list4;
                                        fetchUserDataUseCase$invoke$1.f27221d = list5;
                                        fetchUserDataUseCase$invoke$1.f27224g = 7;
                                        if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                            fetchUserDataUseCase$invoke$1.f27220c = list4;
                                            fetchUserDataUseCase$invoke$1.f27221d = list5;
                                            fetchUserDataUseCase$invoke$1.f27224g = 8;
                                            if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                                list6 = list5;
                                                list7 = list4;
                                                ym5Var7 = ym5Var6;
                                                ym5Var8 = ym5Var4;
                                                ym5Var4 = ym5Var8;
                                                list4 = list7;
                                                ym5Var6 = ym5Var7;
                                                list5 = list6;
                                            }
                                        }
                                    }
                                }
                                if (ym5Var4 instanceof xm5) {
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                ym5Var3 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var4 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                list = (List) objM7070K;
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                fetchUserDataUseCase$invoke$1.f27219b = ym5Var3;
                fetchUserDataUseCase$invoke$1.f27220c = list;
                fetchUserDataUseCase$invoke$1.f27224g = 4;
                objM7204a = ((C1293i) lm4Var).m7204a(fetchUserDataUseCase$invoke$1);
                if (objM7204a != coroutineSingletons) {
                    ym5 ym5Var15 = ym5Var3;
                    list2 = list;
                    objM7070K = objM7204a;
                    ym5Var5 = ym5Var15;
                    list3 = (List) objM7070K;
                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var5;
                    fetchUserDataUseCase$invoke$1.f27220c = list2;
                    fetchUserDataUseCase$invoke$1.f27221d = list3;
                    fetchUserDataUseCase$invoke$1.f27224g = 5;
                    if (((C1267a) km7Var).m7065F(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                        ym5Var6 = ym5Var5;
                        list4 = list2;
                        list5 = list3;
                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                        fetchUserDataUseCase$invoke$1.f27220c = list4;
                        fetchUserDataUseCase$invoke$1.f27221d = list5;
                        fetchUserDataUseCase$invoke$1.f27224g = 6;
                        if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                            if (ym5Var4 instanceof xm5) {
                                profile = (Profile) ((xm5) ym5Var4).f68348a;
                                if (profile.f19652a != 0) {
                                    str = profile.f19666o;
                                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                    fetchUserDataUseCase$invoke$1.f27220c = list4;
                                    fetchUserDataUseCase$invoke$1.f27221d = list5;
                                    fetchUserDataUseCase$invoke$1.f27224g = 7;
                                    if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                        fetchUserDataUseCase$invoke$1.f27220c = list4;
                                        fetchUserDataUseCase$invoke$1.f27221d = list5;
                                        fetchUserDataUseCase$invoke$1.f27224g = 8;
                                        if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                            list6 = list5;
                                            list7 = list4;
                                            ym5Var7 = ym5Var6;
                                            ym5Var8 = ym5Var4;
                                            ym5Var4 = ym5Var8;
                                            list4 = list7;
                                            ym5Var6 = ym5Var7;
                                            list5 = list6;
                                        }
                                    }
                                }
                            }
                            if (ym5Var4 instanceof xm5) {
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                list2 = fetchUserDataUseCase$invoke$1.f27220c;
                ym5Var5 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var4 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                list3 = (List) objM7070K;
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                fetchUserDataUseCase$invoke$1.f27219b = ym5Var5;
                fetchUserDataUseCase$invoke$1.f27220c = list2;
                fetchUserDataUseCase$invoke$1.f27221d = list3;
                fetchUserDataUseCase$invoke$1.f27224g = 5;
                if (((C1267a) km7Var).m7065F(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                    ym5Var6 = ym5Var5;
                    list4 = list2;
                    list5 = list3;
                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                    fetchUserDataUseCase$invoke$1.f27220c = list4;
                    fetchUserDataUseCase$invoke$1.f27221d = list5;
                    fetchUserDataUseCase$invoke$1.f27224g = 6;
                    if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                        if (ym5Var4 instanceof xm5) {
                            profile = (Profile) ((xm5) ym5Var4).f68348a;
                            if (profile.f19652a != 0) {
                                str = profile.f19666o;
                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                fetchUserDataUseCase$invoke$1.f27220c = list4;
                                fetchUserDataUseCase$invoke$1.f27221d = list5;
                                fetchUserDataUseCase$invoke$1.f27224g = 7;
                                if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                    fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                    fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                    fetchUserDataUseCase$invoke$1.f27220c = list4;
                                    fetchUserDataUseCase$invoke$1.f27221d = list5;
                                    fetchUserDataUseCase$invoke$1.f27224g = 8;
                                    if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                        list6 = list5;
                                        list7 = list4;
                                        ym5Var7 = ym5Var6;
                                        ym5Var8 = ym5Var4;
                                        ym5Var4 = ym5Var8;
                                        list4 = list7;
                                        ym5Var6 = ym5Var7;
                                        list5 = list6;
                                    }
                                }
                            }
                        }
                        if (ym5Var4 instanceof xm5) {
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 5:
                list5 = fetchUserDataUseCase$invoke$1.f27221d;
                list4 = fetchUserDataUseCase$invoke$1.f27220c;
                ym5Var6 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var4 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                fetchUserDataUseCase$invoke$1.f27220c = list4;
                fetchUserDataUseCase$invoke$1.f27221d = list5;
                fetchUserDataUseCase$invoke$1.f27224g = 6;
                if (((C1301q) this.f27229e).m7338a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                    if (ym5Var4 instanceof xm5) {
                        profile = (Profile) ((xm5) ym5Var4).f68348a;
                        if (profile.f19652a != 0) {
                            str = profile.f19666o;
                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                            fetchUserDataUseCase$invoke$1.f27220c = list4;
                            fetchUserDataUseCase$invoke$1.f27221d = list5;
                            fetchUserDataUseCase$invoke$1.f27224g = 7;
                            if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                                fetchUserDataUseCase$invoke$1.f27220c = list4;
                                fetchUserDataUseCase$invoke$1.f27221d = list5;
                                fetchUserDataUseCase$invoke$1.f27224g = 8;
                                if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                    list6 = list5;
                                    list7 = list4;
                                    ym5Var7 = ym5Var6;
                                    ym5Var8 = ym5Var4;
                                    ym5Var4 = ym5Var8;
                                    list4 = list7;
                                    ym5Var6 = ym5Var7;
                                    list5 = list6;
                                }
                            }
                        }
                    }
                    if (ym5Var4 instanceof xm5) {
                    }
                    break;
                }
                return coroutineSingletons;
            case 6:
                list5 = fetchUserDataUseCase$invoke$1.f27221d;
                list4 = fetchUserDataUseCase$invoke$1.f27220c;
                ym5Var6 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var4 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                if (ym5Var4 instanceof xm5) {
                    profile = (Profile) ((xm5) ym5Var4).f68348a;
                    if (profile.f19652a != 0) {
                        str = profile.f19666o;
                        fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                        fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                        fetchUserDataUseCase$invoke$1.f27220c = list4;
                        fetchUserDataUseCase$invoke$1.f27221d = list5;
                        fetchUserDataUseCase$invoke$1.f27224g = 7;
                        if (((C1292h) this.f27227c).m7195a(str, fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                            fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                            fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                            fetchUserDataUseCase$invoke$1.f27220c = list4;
                            fetchUserDataUseCase$invoke$1.f27221d = list5;
                            fetchUserDataUseCase$invoke$1.f27224g = 8;
                            if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                                list6 = list5;
                                list7 = list4;
                                ym5Var7 = ym5Var6;
                                ym5Var8 = ym5Var4;
                                ym5Var4 = ym5Var8;
                                list4 = list7;
                                ym5Var6 = ym5Var7;
                                list5 = list6;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                if (ym5Var4 instanceof xm5) {
                }
                break;
            case 7:
                list5 = fetchUserDataUseCase$invoke$1.f27221d;
                list4 = fetchUserDataUseCase$invoke$1.f27220c;
                ym5Var6 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var4 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                fetchUserDataUseCase$invoke$1.f27218a = ym5Var4;
                fetchUserDataUseCase$invoke$1.f27219b = ym5Var6;
                fetchUserDataUseCase$invoke$1.f27220c = list4;
                fetchUserDataUseCase$invoke$1.f27221d = list5;
                fetchUserDataUseCase$invoke$1.f27224g = 8;
                if (this.f27228d.m7327a(fetchUserDataUseCase$invoke$1) != coroutineSingletons) {
                    list6 = list5;
                    list7 = list4;
                    ym5Var7 = ym5Var6;
                    ym5Var8 = ym5Var4;
                    ym5Var4 = ym5Var8;
                    list4 = list7;
                    ym5Var6 = ym5Var7;
                    list5 = list6;
                    if (ym5Var4 instanceof xm5) {
                    }
                    break;
                }
                return coroutineSingletons;
            case 8:
                list6 = fetchUserDataUseCase$invoke$1.f27221d;
                list7 = fetchUserDataUseCase$invoke$1.f27220c;
                ym5Var7 = fetchUserDataUseCase$invoke$1.f27219b;
                ym5Var8 = fetchUserDataUseCase$invoke$1.f27218a;
                AbstractC3193b.m15359b(objM7070K);
                ym5Var4 = ym5Var8;
                list4 = list7;
                ym5Var6 = ym5Var7;
                list5 = list6;
                if (ym5Var4 instanceof xm5) {
                }
                break;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
