package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.network.api.result.ResultTtsVoice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.eh0;
import p000.kl4;
import p000.r3a;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.wca;
import p000.xfa;
import p000.zca;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl$observableTtsVoices$2", m4291f = "TtsRepositoryImpl.kt", m4292l = {70, 71, 78, 79}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsRepositoryImpl$observableTtsVoices$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f16271a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1307w f16273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16274d;

    /* JADX INFO: renamed from: com.lingq.core.data.repository.TtsRepositoryImpl$observableTtsVoices$2$1 */
    @c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl$observableTtsVoices$2$1", m4291f = "TtsRepositoryImpl.kt", m4292l = {72, 73}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12841 extends SuspendLambda implements vi3 {

        /* JADX INFO: renamed from: a */
        public int f16275a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1307w f16276b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f16277c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f16278d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12841(C1307w c1307w, List list, String str, Continuation continuation) {
            super(1, continuation);
            this.f16276b = c1307w;
            this.f16277c = list;
            this.f16278d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C12841(this.f16276b, this.f16277c, this.f16278d, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            return ((C12841) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            zca zcaVar = this.f16276b.f16564b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f16275a;
            xfa xfaVar = xfa.f68157a;
            List list = this.f16277c;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
            }
            AbstractC3193b.m15359b(obj);
            List list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(eh0.m11119P((ResultTtsVoice) it.next()));
            }
            this.f16275a = 1;
            if (zcaVar.mo4096w0(arrayList, this) != coroutineSingletons) {
            }
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                arrayList2.add(new kl4(this.f16278d, i3, ((ResultTtsVoice) obj2).f21651a));
                i3 = i4;
            }
            this.f16275a = 2;
            Object objM2861d = AbstractC0758a.m2861d(new wca(zcaVar, arrayList2, i2), zcaVar.f71369K, this, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$observableTtsVoices$2(C1307w c1307w, String str, Continuation continuation) {
        super(2, continuation);
        this.f16273c = c1307w;
        this.f16274d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TtsRepositoryImpl$observableTtsVoices$2 ttsRepositoryImpl$observableTtsVoices$2 = new TtsRepositoryImpl$observableTtsVoices$2(this.f16273c, this.f16274d, continuation);
        ttsRepositoryImpl$observableTtsVoices$2.f16272b = obj;
        return ttsRepositoryImpl$observableTtsVoices$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsRepositoryImpl$observableTtsVoices$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[PHI: r12
      0x0058: PHI (r12v3 java.lang.Object) = (r12v2 java.lang.Object), (r12v0 java.lang.Object) binds: [B:18:0x0055, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r0.emit((java.util.List) r12, r11) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f16272b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16271a;
        String str = this.f16274d;
        C1307w c1307w = this.f16273c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC3193b.m15359b(obj);
                        this.f16272b = null;
                        this.f16271a = 4;
                    } else {
                        if (i != 4) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            LingQDatabase lingQDatabase = c1307w.f16563a;
            C12841 c12841 = new C12841(c1307w, (List) obj, str, null);
            this.f16272b = e83Var;
            this.f16271a = 2;
            if (AbstractC0747e.m2849b(lingQDatabase, c12841, this) != coroutineSingletons) {
                zca zcaVar = c1307w.f16564b;
                this.f16272b = e83Var;
                this.f16271a = 3;
                obj = AbstractC0758a.m2861d(new r3a(7, str, zcaVar), zcaVar.f71369K, this, true, true);
                if (obj != coroutineSingletons) {
                    this.f16272b = null;
                    this.f16271a = 4;
                }
            }
            return coroutineSingletons;
        }
        AbstractC3193b.m15359b(obj);
        zca zcaVar2 = c1307w.f16564b;
        this.f16272b = e83Var;
        this.f16271a = 3;
        obj = AbstractC0758a.m2861d(new r3a(7, str, zcaVar2), zcaVar2.f71369K, this, true, true);
        if (obj != coroutineSingletons) {
            this.f16272b = null;
            this.f16271a = 4;
        }
        return coroutineSingletons;
    }
}
