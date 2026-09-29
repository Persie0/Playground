package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.domain.model.language.DictionaryData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ld0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl$changePosition$2", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {81, 82, 86, 87}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryRepositoryImpl$changePosition$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public DictionaryData f15118a;

    /* JADX INFO: renamed from: b */
    public DictionaryData f15119b;

    /* JADX INFO: renamed from: c */
    public C1292h f15120c;

    /* JADX INFO: renamed from: d */
    public int f15121d;

    /* JADX INFO: renamed from: e */
    public int f15122e;

    /* JADX INFO: renamed from: f */
    public int f15123f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1292h f15124g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f15125h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f15126i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$changePosition$2(C1292h c1292h, String str, int i, int i2, Continuation continuation) {
        super(1, continuation);
        this.f15124g = c1292h;
        this.f15125h = str;
        this.f15126i = i;
        this.f15127j = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictionaryRepositoryImpl$changePosition$2(this.f15124g, this.f15125h, this.f15126i, this.f15127j, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictionaryRepositoryImpl$changePosition$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r0.m7476C0(r1, r7, r14) == r2) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        DictionaryData dictionaryData;
        DictionaryData dictionaryData2;
        int i;
        C1292h c1292h = this.f15124g;
        C1318f c1318f = c1292h.f16483b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f15123f;
        int i3 = 6;
        int i4 = this.f15127j;
        int i5 = this.f15126i;
        String str = this.f15125h;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            this.f15123f = 1;
            obj = AbstractC0758a.m2861d(new ld0(str, i5, i3), c1318f.f17021K, this, true, false);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                dictionaryData = this.f15118a;
                AbstractC3193b.m15359b(obj);
                DictionaryData dictionaryData3 = (DictionaryData) obj;
                if (dictionaryData != null || dictionaryData3 == null) {
                    return null;
                }
                int i6 = dictionaryData.f19008a;
                this.f15118a = null;
                this.f15119b = dictionaryData3;
                this.f15120c = c1292h;
                this.f15121d = i5;
                this.f15122e = 0;
                this.f15123f = 3;
                if (c1318f.m7476C0(i6, i4, this) != coroutineSingletons) {
                    dictionaryData2 = dictionaryData3;
                    i = 0;
                    C1318f c1318f2 = c1292h.f16483b;
                    int i7 = dictionaryData2.f19008a;
                    this.f15118a = null;
                    this.f15119b = null;
                    this.f15120c = null;
                    this.f15121d = i;
                    this.f15122e = 0;
                    this.f15123f = 4;
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                int i8 = this.f15122e;
                i5 = this.f15121d;
                C1292h c1292h2 = this.f15120c;
                dictionaryData2 = this.f15119b;
                AbstractC3193b.m15359b(obj);
                i = i8;
                c1292h = c1292h2;
                C1318f c1318f3 = c1292h.f16483b;
                int i9 = dictionaryData2.f19008a;
                this.f15118a = null;
                this.f15119b = null;
                this.f15120c = null;
                this.f15121d = i;
                this.f15122e = 0;
                this.f15123f = 4;
            } else {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        dictionaryData = (DictionaryData) obj;
        this.f15118a = dictionaryData;
        this.f15123f = 2;
        obj = AbstractC0758a.m2861d(new ld0(str, i4, i3), c1318f.f17021K, this, true, false);
        if (obj != coroutineSingletons) {
            DictionaryData dictionaryData4 = (DictionaryData) obj;
            if (dictionaryData != null) {
            }
            return null;
        }
        return coroutineSingletons;
    }
}
