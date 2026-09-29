package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.BlacklistClearWorker;
import com.lingq.core.data.workers.CourseUpdateBlacklistWorker;
import com.lingq.core.data.workers.LessonUpdateBlacklistSourceWorker;
import com.lingq.core.database.dao.C1314b;
import com.lingq.core.database.entity.CourseBlacklistEntity;
import com.lingq.core.network.api.requests.RequestBlacklist;
import com.lingq.core.network.api.result.CollectionBlacklist;
import com.lingq.core.network.api.result.LessonSourceBlacklist;
import com.lingq.core.network.api.result.ResultBlacklist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.hi8;
import p000.jd0;
import p000.kd0;
import p000.ld0;
import p000.md0;
import p000.od0;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.xj1;
import p000.zd9;

/* JADX INFO: renamed from: com.lingq.core.data.repository.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1286b {

    /* JADX INFO: renamed from: a */
    public final C1314b f16449a;

    /* JADX INFO: renamed from: b */
    public final od0 f16450b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16451c;

    public C1286b(C1314b c1314b, od0 od0Var, C0773b c0773b) {
        c1314b.getClass();
        od0Var.getClass();
        c0773b.getClass();
        this.f16449a = c1314b;
        this.f16450b = od0Var;
        this.f16451c = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7099a(int i, int i2, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$addCourseBlacklist$1 blacklistRepositoryImpl$addCourseBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$addCourseBlacklist$1) {
            blacklistRepositoryImpl$addCourseBlacklist$1 = (BlacklistRepositoryImpl$addCourseBlacklist$1) continuationImpl;
            int i3 = blacklistRepositoryImpl$addCourseBlacklist$1.f14602e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$addCourseBlacklist$1.f14602e = i3 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$addCourseBlacklist$1 = new BlacklistRepositoryImpl$addCourseBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$addCourseBlacklist$1 = new BlacklistRepositoryImpl$addCourseBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$addCourseBlacklist$1.f14600c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = blacklistRepositoryImpl$addCourseBlacklist$1.f14602e;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            List listM23604J = vz1.m23604J(new CourseBlacklistEntity(str, i2, str2));
            blacklistRepositoryImpl$addCourseBlacklist$1.f14598a = i;
            blacklistRepositoryImpl$addCourseBlacklist$1.f14599b = i2;
            blacklistRepositoryImpl$addCourseBlacklist$1.f14602e = 1;
            C1314b c1314b = this.f16449a;
            Object objM2861d = AbstractC0758a.m2861d(new kd0(c1314b, listM23604J, 0), c1314b.f16998a, blacklistRepositoryImpl$addCourseBlacklist$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = blacklistRepositoryImpl$addCourseBlacklist$1.f14599b;
            i = blacklistRepositoryImpl$addCourseBlacklist$1.f14598a;
            AbstractC3193b.m15359b(obj);
        }
        m7102d(i, "add", i2);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7100b(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$addSourceBlacklist$1 blacklistRepositoryImpl$addSourceBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$addSourceBlacklist$1) {
            blacklistRepositoryImpl$addSourceBlacklist$1 = (BlacklistRepositoryImpl$addSourceBlacklist$1) continuationImpl;
            int i2 = blacklistRepositoryImpl$addSourceBlacklist$1.f14607e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$addSourceBlacklist$1.f14607e = i2 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$addSourceBlacklist$1 = new BlacklistRepositoryImpl$addSourceBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$addSourceBlacklist$1 = new BlacklistRepositoryImpl$addSourceBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$addSourceBlacklist$1.f14605c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = blacklistRepositoryImpl$addSourceBlacklist$1.f14607e;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            List listM23604J = vz1.m23604J(new zd9(str2, str));
            blacklistRepositoryImpl$addSourceBlacklist$1.f14604b = str2;
            blacklistRepositoryImpl$addSourceBlacklist$1.f14603a = i;
            blacklistRepositoryImpl$addSourceBlacklist$1.f14607e = 1;
            C1314b c1314b = this.f16449a;
            Object objM2861d = AbstractC0758a.m2861d(new kd0(c1314b, listM23604J, i4), c1314b.f16998a, blacklistRepositoryImpl$addSourceBlacklist$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = blacklistRepositoryImpl$addSourceBlacklist$1.f14603a;
            str2 = blacklistRepositoryImpl$addSourceBlacklist$1.f14604b;
            AbstractC3193b.m15359b(obj);
        }
        m7103e(str2, i, "add");
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7101c(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$clearBlacklist$1 blacklistRepositoryImpl$clearBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$clearBlacklist$1) {
            blacklistRepositoryImpl$clearBlacklist$1 = (BlacklistRepositoryImpl$clearBlacklist$1) continuationImpl;
            int i2 = blacklistRepositoryImpl$clearBlacklist$1.f14611d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$clearBlacklist$1.f14611d = i2 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$clearBlacklist$1 = new BlacklistRepositoryImpl$clearBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$clearBlacklist$1 = new BlacklistRepositoryImpl$clearBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$clearBlacklist$1.f14609b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = blacklistRepositoryImpl$clearBlacklist$1.f14611d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            blacklistRepositoryImpl$clearBlacklist$1.f14608a = i;
            blacklistRepositoryImpl$clearBlacklist$1.f14611d = 1;
            if (this.f16449a.m7462a(str, blacklistRepositoryImpl$clearBlacklist$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = blacklistRepositoryImpl$clearBlacklist$1.f14608a;
            AbstractC3193b.m15359b(obj);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(BlacklistClearWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("contextId", Integer.valueOf(i))};
        hi8 hi8Var = new hi8(10);
        Pair pair = pairArr[0];
        hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        this.f16451c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public final void m7102d(int i, String str, int i2) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(CourseUpdateBlacklistWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("contextId", Integer.valueOf(i)), new Pair("courseId", Integer.valueOf(i2)), new Pair("action", str)};
        hi8 hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 3; i3++) {
            Pair pair = pairArr[i3];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16451c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX INFO: renamed from: e */
    public final void m7103e(String str, int i, String str2) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonUpdateBlacklistSourceWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("contextId", Integer.valueOf(i)), new Pair("source", str), new Pair("action", str2)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16451c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:14:0x003c, B:19:0x004d, B:51:0x00e4, B:53:0x00e8, B:54:0x00fb, B:56:0x0101, B:58:0x010f, B:60:0x0115, B:63:0x011c, B:64:0x0123, B:22:0x0058, B:36:0x0094, B:38:0x0098, B:39:0x00ab, B:41:0x00b1, B:44:0x00c0, B:45:0x00c8, B:25:0x0060, B:32:0x0080, B:28:0x0067), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:14:0x003c, B:19:0x004d, B:51:0x00e4, B:53:0x00e8, B:54:0x00fb, B:56:0x0101, B:58:0x010f, B:60:0x0115, B:63:0x011c, B:64:0x0123, B:22:0x0058, B:36:0x0094, B:38:0x0098, B:39:0x00ab, B:41:0x00b1, B:44:0x00c0, B:45:0x00c8, B:25:0x0060, B:32:0x0080, B:28:0x0067), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:14:0x003c, B:19:0x004d, B:51:0x00e4, B:53:0x00e8, B:54:0x00fb, B:56:0x0101, B:58:0x010f, B:60:0x0115, B:63:0x011c, B:64:0x0123, B:22:0x0058, B:36:0x0094, B:38:0x0098, B:39:0x00ab, B:41:0x00b1, B:44:0x00c0, B:45:0x00c8, B:25:0x0060, B:32:0x0080, B:28:0x0067), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:14:0x003c, B:19:0x004d, B:51:0x00e4, B:53:0x00e8, B:54:0x00fb, B:56:0x0101, B:58:0x010f, B:60:0x0115, B:63:0x011c, B:64:0x0123, B:22:0x0058, B:36:0x0094, B:38:0x0098, B:39:0x00ab, B:41:0x00b1, B:44:0x00c0, B:45:0x00c8, B:25:0x0060, B:32:0x0080, B:28:0x0067), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:14:0x003c, B:19:0x004d, B:51:0x00e4, B:53:0x00e8, B:54:0x00fb, B:56:0x0101, B:58:0x010f, B:60:0x0115, B:63:0x011c, B:64:0x0123, B:22:0x0058, B:36:0x0094, B:38:0x0098, B:39:0x00ab, B:41:0x00b1, B:44:0x00c0, B:45:0x00c8, B:25:0x0060, B:32:0x0080, B:28:0x0067), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public final Object m7104f(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$fetchBlacklists$1 blacklistRepositoryImpl$fetchBlacklists$1;
        int i2;
        String str2;
        String str3;
        ResultBlacklist resultBlacklist;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d;
        String strM8305a;
        List list2;
        ArrayList arrayList2;
        Object objM2861d2;
        Integer numM8281a;
        int iIntValue;
        String strM8282b;
        if (continuationImpl instanceof BlacklistRepositoryImpl$fetchBlacklists$1) {
            blacklistRepositoryImpl$fetchBlacklists$1 = (BlacklistRepositoryImpl$fetchBlacklists$1) continuationImpl;
            int i3 = blacklistRepositoryImpl$fetchBlacklists$1.f14617f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$fetchBlacklists$1.f14617f = i3 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$fetchBlacklists$1 = new BlacklistRepositoryImpl$fetchBlacklists$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$fetchBlacklists$1 = new BlacklistRepositoryImpl$fetchBlacklists$1(this, continuationImpl);
        }
        Object objM17932c = blacklistRepositoryImpl$fetchBlacklists$1.f14615d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = blacklistRepositoryImpl$fetchBlacklists$1.f14617f;
        xfa xfaVar = xfa.f68157a;
        int i5 = 1;
        int i6 = 0;
        C1314b c1314b = this.f16449a;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM17932c);
                od0 od0Var = this.f16450b;
                Integer num = new Integer(i);
                blacklistRepositoryImpl$fetchBlacklists$1.f14613b = str;
                blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i;
                blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 1;
                objM17932c = od0Var.m17932c(num, blacklistRepositoryImpl$fetchBlacklists$1);
                if (objM17932c != coroutineSingletons) {
                    i2 = i;
                    str2 = str;
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                i2 = blacklistRepositoryImpl$fetchBlacklists$1.f14612a;
                str2 = blacklistRepositoryImpl$fetchBlacklists$1.f14613b;
                AbstractC3193b.m15359b(objM17932c);
            } else if (i4 == 2) {
                i2 = blacklistRepositoryImpl$fetchBlacklists$1.f14612a;
                resultBlacklist = blacklistRepositoryImpl$fetchBlacklists$1.f14614c;
                str3 = blacklistRepositoryImpl$fetchBlacklists$1.f14613b;
                AbstractC3193b.m15359b(objM17932c);
                list = resultBlacklist.f20617b;
                if (list != null) {
                    ArrayList arrayListM22587E0 = u91.m22587E0(list);
                    arrayList = new ArrayList(v91.m23189q0(arrayListM22587E0, 10));
                    it = arrayListM22587E0.iterator();
                    while (it.hasNext()) {
                        strM8305a = ((LessonSourceBlacklist) it.next()).m8305a();
                        if (strM8305a == null) {
                            strM8305a = "";
                        }
                        arrayList.add(new zd9(strM8305a, str3));
                    }
                    blacklistRepositoryImpl$fetchBlacklists$1.f14613b = str3;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14614c = resultBlacklist;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 3;
                    objM2861d = AbstractC0758a.m2861d(new kd0(c1314b, arrayList, i5), c1314b.f16998a, blacklistRepositoryImpl$fetchBlacklists$1, false, true);
                    if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                list2 = resultBlacklist.f20616a;
                if (list2 != null) {
                    ArrayList<CollectionBlacklist> arrayListM22587E1 = u91.m22587E0(list2);
                    arrayList2 = new ArrayList(v91.m23189q0(arrayListM22587E1, 10));
                    for (CollectionBlacklist collectionBlacklist : arrayListM22587E1) {
                        numM8281a = collectionBlacklist.m8281a();
                        if (numM8281a != null) {
                            iIntValue = numM8281a.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        strM8282b = collectionBlacklist.m8282b();
                        if (strM8282b == null) {
                            strM8282b = "";
                        }
                        arrayList2.add(new CourseBlacklistEntity(str3, iIntValue, strM8282b));
                    }
                    blacklistRepositoryImpl$fetchBlacklists$1.f14613b = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14614c = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new kd0(c1314b, arrayList2, i6), c1314b.f16998a, blacklistRepositoryImpl$fetchBlacklists$1, false, true);
                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i4 == 3) {
                i2 = blacklistRepositoryImpl$fetchBlacklists$1.f14612a;
                resultBlacklist = blacklistRepositoryImpl$fetchBlacklists$1.f14614c;
                str3 = blacklistRepositoryImpl$fetchBlacklists$1.f14613b;
                AbstractC3193b.m15359b(objM17932c);
                list2 = resultBlacklist.f20616a;
                if (list2 != null) {
                    ArrayList<CollectionBlacklist> arrayListM22587E2 = u91.m22587E0(list2);
                    arrayList2 = new ArrayList(v91.m23189q0(arrayListM22587E2, 10));
                    while (r1.hasNext()) {
                        numM8281a = collectionBlacklist.m8281a();
                        if (numM8281a != null) {
                            iIntValue = numM8281a.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        strM8282b = collectionBlacklist.m8282b();
                        if (strM8282b == null) {
                            strM8282b = "";
                        }
                        arrayList2.add(new CourseBlacklistEntity(str3, iIntValue, strM8282b));
                    }
                    blacklistRepositoryImpl$fetchBlacklists$1.f14613b = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14614c = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new kd0(c1314b, arrayList2, i6), c1314b.f16998a, blacklistRepositoryImpl$fetchBlacklists$1, false, true);
                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i4 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM17932c);
            }
            return xfaVar;
            ResultBlacklist resultBlacklist2 = (ResultBlacklist) objM17932c;
            blacklistRepositoryImpl$fetchBlacklists$1.f14613b = str2;
            blacklistRepositoryImpl$fetchBlacklists$1.f14614c = resultBlacklist2;
            blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
            blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 2;
            if (c1314b.m7462a(str2, blacklistRepositoryImpl$fetchBlacklists$1) != coroutineSingletons) {
                str3 = str2;
                resultBlacklist = resultBlacklist2;
                list = resultBlacklist.f20617b;
                if (list != null) {
                    ArrayList arrayListM22587E3 = u91.m22587E0(list);
                    arrayList = new ArrayList(v91.m23189q0(arrayListM22587E3, 10));
                    it = arrayListM22587E3.iterator();
                    while (it.hasNext()) {
                        strM8305a = ((LessonSourceBlacklist) it.next()).m8305a();
                        if (strM8305a == null) {
                            strM8305a = "";
                        }
                        arrayList.add(new zd9(strM8305a, str3));
                    }
                    blacklistRepositoryImpl$fetchBlacklists$1.f14613b = str3;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14614c = resultBlacklist;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 3;
                    objM2861d = AbstractC0758a.m2861d(new kd0(c1314b, arrayList, i5), c1314b.f16998a, blacklistRepositoryImpl$fetchBlacklists$1, false, true);
                    if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                }
                list2 = resultBlacklist.f20616a;
                if (list2 != null) {
                    ArrayList<CollectionBlacklist> arrayListM22587E4 = u91.m22587E0(list2);
                    arrayList2 = new ArrayList(v91.m23189q0(arrayListM22587E4, 10));
                    while (r1.hasNext()) {
                        numM8281a = collectionBlacklist.m8281a();
                        if (numM8281a != null) {
                            iIntValue = numM8281a.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        strM8282b = collectionBlacklist.m8282b();
                        if (strM8282b == null) {
                            strM8282b = "";
                        }
                        arrayList2.add(new CourseBlacklistEntity(str3, iIntValue, strM8282b));
                    }
                    blacklistRepositoryImpl$fetchBlacklists$1.f14613b = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14614c = null;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14612a = i2;
                    blacklistRepositoryImpl$fetchBlacklists$1.f14617f = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new kd0(c1314b, arrayList2, i6), c1314b.f16998a, blacklistRepositoryImpl$fetchBlacklists$1, false, true);
                    if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final c83 m7105g(String str) {
        str.getClass();
        C1314b c1314b = this.f16449a;
        c1314b.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1314b.f16998a, false, new String[]{"CourseBlacklistEntity"}, new jd0(str, 3)));
    }

    /* JADX INFO: renamed from: h */
    public final c83 m7106h(String str) {
        str.getClass();
        C1314b c1314b = this.f16449a;
        c1314b.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1314b.f16998a, false, new String[]{"SourceBlacklistEntity"}, new jd0(str, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m7107i(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$removeCourseBlacklist$1 blacklistRepositoryImpl$removeCourseBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$removeCourseBlacklist$1) {
            blacklistRepositoryImpl$removeCourseBlacklist$1 = (BlacklistRepositoryImpl$removeCourseBlacklist$1) continuationImpl;
            int i3 = blacklistRepositoryImpl$removeCourseBlacklist$1.f14622e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$removeCourseBlacklist$1.f14622e = i3 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$removeCourseBlacklist$1 = new BlacklistRepositoryImpl$removeCourseBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$removeCourseBlacklist$1 = new BlacklistRepositoryImpl$removeCourseBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$removeCourseBlacklist$1.f14620c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = blacklistRepositoryImpl$removeCourseBlacklist$1.f14622e;
        xfa xfaVar = xfa.f68157a;
        int i5 = 1;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            blacklistRepositoryImpl$removeCourseBlacklist$1.f14618a = i;
            blacklistRepositoryImpl$removeCourseBlacklist$1.f14619b = i2;
            blacklistRepositoryImpl$removeCourseBlacklist$1.f14622e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ld0(i2, str, i5), this.f16449a.f16998a, blacklistRepositoryImpl$removeCourseBlacklist$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = blacklistRepositoryImpl$removeCourseBlacklist$1.f14619b;
            i = blacklistRepositoryImpl$removeCourseBlacklist$1.f14618a;
            AbstractC3193b.m15359b(obj);
        }
        m7102d(i, "del", i2);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m7108j(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$removeSourceBlacklist$1 blacklistRepositoryImpl$removeSourceBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$removeSourceBlacklist$1) {
            blacklistRepositoryImpl$removeSourceBlacklist$1 = (BlacklistRepositoryImpl$removeSourceBlacklist$1) continuationImpl;
            int i2 = blacklistRepositoryImpl$removeSourceBlacklist$1.f14627e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$removeSourceBlacklist$1.f14627e = i2 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$removeSourceBlacklist$1 = new BlacklistRepositoryImpl$removeSourceBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$removeSourceBlacklist$1 = new BlacklistRepositoryImpl$removeSourceBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$removeSourceBlacklist$1.f14625c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = blacklistRepositoryImpl$removeSourceBlacklist$1.f14627e;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            blacklistRepositoryImpl$removeSourceBlacklist$1.f14624b = str2;
            blacklistRepositoryImpl$removeSourceBlacklist$1.f14623a = i;
            blacklistRepositoryImpl$removeSourceBlacklist$1.f14627e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new md0(str2, 0, str), this.f16449a.f16998a, blacklistRepositoryImpl$removeSourceBlacklist$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = blacklistRepositoryImpl$removeSourceBlacklist$1.f14623a;
            str2 = blacklistRepositoryImpl$removeSourceBlacklist$1.f14624b;
            AbstractC3193b.m15359b(obj);
        }
        m7103e(str2, i, "del");
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m7109k(int i, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$syncClearBlacklist$1 blacklistRepositoryImpl$syncClearBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$syncClearBlacklist$1) {
            blacklistRepositoryImpl$syncClearBlacklist$1 = (BlacklistRepositoryImpl$syncClearBlacklist$1) continuationImpl;
            int i2 = blacklistRepositoryImpl$syncClearBlacklist$1.f14630c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$syncClearBlacklist$1.f14630c = i2 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$syncClearBlacklist$1 = new BlacklistRepositoryImpl$syncClearBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$syncClearBlacklist$1 = new BlacklistRepositoryImpl$syncClearBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$syncClearBlacklist$1.f14628a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = blacklistRepositoryImpl$syncClearBlacklist$1.f14630c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                od0 od0Var = this.f16450b;
                Integer num = new Integer(i);
                blacklistRepositoryImpl$syncClearBlacklist$1.f14630c = 1;
                if (od0Var.m17931b(num, blacklistRepositoryImpl$syncClearBlacklist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m7110l(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$syncCourseBlacklist$1 blacklistRepositoryImpl$syncCourseBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$syncCourseBlacklist$1) {
            blacklistRepositoryImpl$syncCourseBlacklist$1 = (BlacklistRepositoryImpl$syncCourseBlacklist$1) continuationImpl;
            int i3 = blacklistRepositoryImpl$syncCourseBlacklist$1.f14633c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$syncCourseBlacklist$1.f14633c = i3 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$syncCourseBlacklist$1 = new BlacklistRepositoryImpl$syncCourseBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$syncCourseBlacklist$1 = new BlacklistRepositoryImpl$syncCourseBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$syncCourseBlacklist$1.f14631a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = blacklistRepositoryImpl$syncCourseBlacklist$1.f14633c;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(obj);
                RequestBlacklist requestBlacklist = new RequestBlacklist("collection", str, String.valueOf(i2));
                od0 od0Var = this.f16450b;
                Integer num = new Integer(i);
                blacklistRepositoryImpl$syncCourseBlacklist$1.f14633c = 1;
                if (od0Var.m17930a(num, requestBlacklist, blacklistRepositoryImpl$syncCourseBlacklist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m7111m(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistRepositoryImpl$syncSourceBlacklist$1 blacklistRepositoryImpl$syncSourceBlacklist$1;
        if (continuationImpl instanceof BlacklistRepositoryImpl$syncSourceBlacklist$1) {
            blacklistRepositoryImpl$syncSourceBlacklist$1 = (BlacklistRepositoryImpl$syncSourceBlacklist$1) continuationImpl;
            int i2 = blacklistRepositoryImpl$syncSourceBlacklist$1.f14636c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blacklistRepositoryImpl$syncSourceBlacklist$1.f14636c = i2 - Integer.MIN_VALUE;
            } else {
                blacklistRepositoryImpl$syncSourceBlacklist$1 = new BlacklistRepositoryImpl$syncSourceBlacklist$1(this, continuationImpl);
            }
        } else {
            blacklistRepositoryImpl$syncSourceBlacklist$1 = new BlacklistRepositoryImpl$syncSourceBlacklist$1(this, continuationImpl);
        }
        Object obj = blacklistRepositoryImpl$syncSourceBlacklist$1.f14634a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = blacklistRepositoryImpl$syncSourceBlacklist$1.f14636c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                RequestBlacklist requestBlacklist = new RequestBlacklist("source", str2, str);
                od0 od0Var = this.f16450b;
                Integer num = new Integer(i);
                blacklistRepositoryImpl$syncSourceBlacklist$1.f14636c = 1;
                if (od0Var.m17930a(num, requestBlacklist, blacklistRepositoryImpl$syncSourceBlacklist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
