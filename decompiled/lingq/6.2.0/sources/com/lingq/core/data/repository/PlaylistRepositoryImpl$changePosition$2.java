package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1322j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bd7;
import p000.c32;
import p000.fd7;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$changePosition$2", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {718, 719, 721, 722, 725}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$changePosition$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f15912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15913c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1302r f15914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f15915e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f15916f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15917g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f15918h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ bd7 f15919i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$changePosition$2(int i, int i2, C1302r c1302r, int i3, String str, int i4, String str2, bd7 bd7Var, int i5, Continuation continuation) {
        super(1, continuation);
        this.f15912b = i;
        this.f15913c = i2;
        this.f15914d = c1302r;
        this.f15915e = i3;
        this.f15916f = str;
        this.f15917g = i4;
        this.f15918h = str2;
        this.f15919i = bd7Var;
        this.f15920j = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistRepositoryImpl$changePosition$2(this.f15912b, this.f15913c, this.f15914d, this.f15915e, this.f15916f, this.f15917g, this.f15918h, this.f15919i, this.f15920j, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistRepositoryImpl$changePosition$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2861d;
        Object objM2861d2;
        C1302r c1302r = this.f15914d;
        C1322j c1322j = c1302r.f16534c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15911a;
        int i2 = this.f15917g;
        xfa xfaVar = xfa.f68157a;
        String str = this.f15916f;
        int i3 = this.f15913c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC3193b.m15359b(obj);
                        this.f15911a = 4;
                        objM2861d2 = AbstractC0758a.m2861d(new fd7(i3, str, i2), c1322j.f17045K, this, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                        }
                    } else if (i != 4) {
                        if (i == 5) {
                            AbstractC3193b.m15359b(obj);
                            return xfaVar;
                        }
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                AbstractC3193b.m15359b(obj);
            } else {
                AbstractC3193b.m15359b(obj);
                this.f15911a = 2;
                objM2861d = AbstractC0758a.m2861d(new fd7(i3, str, i2), c1322j.f17045K, this, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                }
            }
            this.f15911a = 5;
            if (C1302r.m7339b(c1302r, this.f15918h, this.f15917g, this.f15919i.f8387e, i3 + 1, this.f15920j, this) != coroutineSingletons) {
                return xfaVar;
            }
        } else {
            AbstractC3193b.m15359b(obj);
            int i4 = this.f15915e;
            int i5 = this.f15912b;
            if (i5 > i3) {
                this.f15911a = 1;
                Object objM2861d3 = AbstractC0758a.m2861d(new fd7(i5, i4, 2, str), c1322j.f17045K, this, false, true);
                if (objM2861d3 != coroutineSingletons) {
                    objM2861d3 = xfaVar;
                }
                if (objM2861d3 != coroutineSingletons) {
                    this.f15911a = 2;
                    objM2861d = AbstractC0758a.m2861d(new fd7(i3, str, i2), c1322j.f17045K, this, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        this.f15911a = 5;
                        if (C1302r.m7339b(c1302r, this.f15918h, this.f15917g, this.f15919i.f8387e, i3 + 1, this.f15920j, this) != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
            } else {
                this.f15911a = 3;
                Object objM2861d4 = AbstractC0758a.m2861d(new fd7(i5, i4, 1, str), c1322j.f17045K, this, false, true);
                if (objM2861d4 != coroutineSingletons) {
                    objM2861d4 = xfaVar;
                }
                if (objM2861d4 != coroutineSingletons) {
                    this.f15911a = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new fd7(i3, str, i2), c1322j.f17045K, this, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        this.f15911a = 5;
                        if (C1302r.m7339b(c1302r, this.f15918h, this.f15917g, this.f15919i.f8387e, i3 + 1, this.f15920j, this) != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
