package com.amplitude.core.platform.intercept;

import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.events.IdentifyOperation;
import com.amplitude.core.platform.C0907a;
import com.amplitude.core.platform.WriteQueueMessageType;
import com.amplitude.core.platform.plugins.C0910a;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.b90;
import p000.fa4;
import p000.o9b;
import p000.pj5;
import p000.smb;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.core.platform.intercept.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0909b {

    /* JADX INFO: renamed from: a */
    public final C0898b f11139a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0903a f11140b;

    /* JADX INFO: renamed from: c */
    public final pj5 f11141c;

    /* JADX INFO: renamed from: d */
    public final C0880b f11142d;

    /* JADX INFO: renamed from: e */
    public final C0910a f11143e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f11144f;

    /* JADX INFO: renamed from: g */
    public String f11145g;

    /* JADX INFO: renamed from: h */
    public String f11146h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f11147i;

    /* JADX INFO: renamed from: j */
    public final C0908a f11148j;

    public C0909b(C0898b c0898b, AbstractC0903a abstractC0903a, pj5 pj5Var, C0880b c0880b, C0910a c0910a) {
        C0908a c0908a;
        pj5Var.getClass();
        this.f11139a = c0898b;
        this.f11140b = abstractC0903a;
        this.f11141c = pj5Var;
        this.f11142d = c0880b;
        this.f11143e = c0910a;
        this.f11144f = new AtomicBoolean(false);
        this.f11147i = new AtomicBoolean(false);
        if (c0898b instanceof C0898b) {
            c0908a = new C0908a(c0898b, pj5Var, abstractC0903a);
        } else {
            pj5Var.mo16257c("Custom storage, identify intercept not started");
            c0908a = null;
        }
        this.f11148j = c0908a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00eb, code lost:
    
        if (r10.m5141b(r11, r0) == r1) goto L92;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5140a(b90 b90Var, ContinuationImpl continuationImpl) throws Throwable {
        IdentifyInterceptor$intercept$1 identifyInterceptor$intercept$1;
        boolean z;
        LinkedHashMap linkedHashMap;
        if (continuationImpl instanceof IdentifyInterceptor$intercept$1) {
            identifyInterceptor$intercept$1 = (IdentifyInterceptor$intercept$1) continuationImpl;
            int i = identifyInterceptor$intercept$1.f11125e;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$intercept$1.f11125e = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$intercept$1 = new IdentifyInterceptor$intercept$1(this, continuationImpl);
            }
        } else {
            identifyInterceptor$intercept$1 = new IdentifyInterceptor$intercept$1(this, continuationImpl);
        }
        Object obj = identifyInterceptor$intercept$1.f11123c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = identifyInterceptor$intercept$1.f11125e;
        if (i2 != 0) {
            if (i2 == 1) {
                b90Var = identifyInterceptor$intercept$1.f11122b;
                this = (C0909b) identifyInterceptor$intercept$1.f11121a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4 && i2 != 5) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b90 b90Var2 = (b90) identifyInterceptor$intercept$1.f11121a;
                    AbstractC3193b.m15359b(obj);
                    return b90Var2;
                }
                this = (C0909b) identifyInterceptor$intercept$1.f11121a;
                AbstractC3193b.m15359b(obj);
            }
            AbstractC0903a abstractC0903a = this.f11140b;
            wfb.m23926u(abstractC0903a.f11018c, abstractC0903a.f11021f, null, new IdentifyInterceptor$scheduleTransfer$1(this, null), 2);
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (this.f11148j == null) {
            return b90Var;
        }
        if (this.f11147i.getAndSet(true)) {
            String str = this.f11145g;
            String str2 = b90Var.f8142a;
            if (!(str == null && str2 == null) && (str == null || str2 == null || !str.equals(str2))) {
                this.f11145g = b90Var.f8142a;
                z = true;
            } else {
                z = false;
            }
            String str3 = this.f11146h;
            String str4 = b90Var.f8143b;
            if (!(str3 == null && str4 == null) && (str3 == null || str4 == null || !str3.equals(str4))) {
                this.f11146h = b90Var.f8143b;
            } else if (z) {
                identifyInterceptor$intercept$1.f11121a = this;
                identifyInterceptor$intercept$1.f11122b = b90Var;
                identifyInterceptor$intercept$1.f11125e = 1;
                if (m5142c(identifyInterceptor$intercept$1) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        this.f11145g = b90Var.f8142a;
        this.f11146h = b90Var.f8143b;
        z = true;
        if (z) {
            identifyInterceptor$intercept$1.f11121a = this;
            identifyInterceptor$intercept$1.f11122b = b90Var;
            identifyInterceptor$intercept$1.f11125e = 1;
            if (m5142c(identifyInterceptor$intercept$1) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
        String strMo3490a = b90Var.mo3490a();
        if (!fa4.m11650l(strMo3490a, "$identify")) {
            if (!fa4.m11650l(strMo3490a, "$groupidentify")) {
                identifyInterceptor$intercept$1.f11121a = b90Var;
                identifyInterceptor$intercept$1.f11122b = null;
                identifyInterceptor$intercept$1.f11125e = 5;
                if (this.m5142c(identifyInterceptor$intercept$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return b90Var;
        }
        this.getClass();
        IdentifyOperation identifyOperation = IdentifyOperation.SET;
        LinkedHashMap linkedHashMap2 = b90Var.f8139N;
        if (linkedHashMap2 != null && linkedHashMap2.size() == 1 && linkedHashMap2.containsKey(identifyOperation.getOperationType()) && ((linkedHashMap = b90Var.f8140O) == null || linkedHashMap.isEmpty())) {
            identifyInterceptor$intercept$1.f11121a = this;
            identifyInterceptor$intercept$1.f11122b = null;
            identifyInterceptor$intercept$1.f11125e = 2;
        } else {
            IdentifyOperation identifyOperation2 = IdentifyOperation.CLEAR_ALL;
            LinkedHashMap linkedHashMap3 = b90Var.f8139N;
            if (linkedHashMap3 != null && linkedHashMap3.size() == 1 && linkedHashMap3.containsKey(identifyOperation2.getOperationType())) {
                identifyInterceptor$intercept$1.f11121a = b90Var;
                identifyInterceptor$intercept$1.f11122b = null;
                identifyInterceptor$intercept$1.f11125e = 3;
                C0908a c0908a = this.f11148j;
                c0908a.getClass();
                Object objM5137a = c0908a.m5137a(identifyInterceptor$intercept$1);
                if (objM5137a != coroutineSingletons) {
                    objM5137a = xfa.f68157a;
                }
                if (objM5137a != coroutineSingletons) {
                    return b90Var;
                }
            } else {
                identifyInterceptor$intercept$1.f11121a = b90Var;
                identifyInterceptor$intercept$1.f11122b = null;
                identifyInterceptor$intercept$1.f11125e = 4;
                if (this.m5142c(identifyInterceptor$intercept$1) != coroutineSingletons) {
                    return b90Var;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m5141b(b90 b90Var, ContinuationImpl continuationImpl) throws Throwable {
        IdentifyInterceptor$saveIdentifyProperties$1 identifyInterceptor$saveIdentifyProperties$1;
        if (continuationImpl instanceof IdentifyInterceptor$saveIdentifyProperties$1) {
            identifyInterceptor$saveIdentifyProperties$1 = (IdentifyInterceptor$saveIdentifyProperties$1) continuationImpl;
            int i = identifyInterceptor$saveIdentifyProperties$1.f11129d;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$saveIdentifyProperties$1.f11129d = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$saveIdentifyProperties$1 = new IdentifyInterceptor$saveIdentifyProperties$1(this, continuationImpl);
            }
        } else {
            identifyInterceptor$saveIdentifyProperties$1 = new IdentifyInterceptor$saveIdentifyProperties$1(this, continuationImpl);
        }
        Object obj = identifyInterceptor$saveIdentifyProperties$1.f11127b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = identifyInterceptor$saveIdentifyProperties$1.f11129d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                C0898b c0898b = this.f11139a;
                identifyInterceptor$saveIdentifyProperties$1.f11126a = this;
                identifyInterceptor$saveIdentifyProperties$1.f11129d = 1;
                Object objM5103h = c0898b.m5103h(b90Var, identifyInterceptor$saveIdentifyProperties$1);
                this = objM5103h;
                if (objM5103h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C0909b c0909b = identifyInterceptor$saveIdentifyProperties$1.f11126a;
                AbstractC3193b.m15359b(obj);
                this = c0909b;
            }
        } catch (Exception e) {
            smb.m21484a(e, this.f11141c, "Error when intercepting identifies");
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m5142c(ContinuationImpl continuationImpl) throws Throwable {
        IdentifyInterceptor$transferInterceptedIdentify$1 identifyInterceptor$transferInterceptedIdentify$1;
        if (continuationImpl instanceof IdentifyInterceptor$transferInterceptedIdentify$1) {
            identifyInterceptor$transferInterceptedIdentify$1 = (IdentifyInterceptor$transferInterceptedIdentify$1) continuationImpl;
            int i = identifyInterceptor$transferInterceptedIdentify$1.f11135d;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$transferInterceptedIdentify$1.f11135d = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$transferInterceptedIdentify$1 = new IdentifyInterceptor$transferInterceptedIdentify$1(this, continuationImpl);
            }
        } else {
            identifyInterceptor$transferInterceptedIdentify$1 = new IdentifyInterceptor$transferInterceptedIdentify$1(this, continuationImpl);
        }
        Object objM5138b = identifyInterceptor$transferInterceptedIdentify$1.f11133b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = identifyInterceptor$transferInterceptedIdentify$1.f11135d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM5138b);
            identifyInterceptor$transferInterceptedIdentify$1.f11132a = this;
            identifyInterceptor$transferInterceptedIdentify$1.f11135d = 1;
            C0908a c0908a = this.f11148j;
            c0908a.getClass();
            objM5138b = c0908a.m5138b(identifyInterceptor$transferInterceptedIdentify$1);
            if (objM5138b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = identifyInterceptor$transferInterceptedIdentify$1.f11132a;
            AbstractC3193b.m15359b(objM5138b);
        }
        b90 b90Var = (b90) objM5138b;
        if (b90Var != null) {
            C0907a c0907a = this.f11143e.f11158e;
            if (c0907a == null) {
                fa4.m11636J("pipeline");
                throw null;
            }
            c0907a.f11101g.mo4677k(new o9b(WriteQueueMessageType.EVENT, b90Var));
        }
        return xfa.f68157a;
    }
}
