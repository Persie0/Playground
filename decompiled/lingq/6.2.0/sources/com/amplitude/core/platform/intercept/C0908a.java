package com.amplitude.core.platform.intercept;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.events.IdentifyOperation;
import com.amplitude.core.utilities.C0913a;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import p000.C3386nv;
import p000.b34;
import p000.b90;
import p000.lda;
import p000.pj5;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.core.platform.intercept.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a {

    /* JADX INFO: renamed from: a */
    public final C0898b f11136a;

    /* JADX INFO: renamed from: b */
    public final pj5 f11137b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0903a f11138c;

    public C0908a(C0898b c0898b, pj5 pj5Var, AbstractC0903a abstractC0903a) {
        pj5Var.getClass();
        this.f11136a = c0898b;
        this.f11137b = pj5Var;
        this.f11138c = abstractC0903a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5137a(Continuation continuation) throws Throwable {
        IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1;
        if (continuation instanceof IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) {
            identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 = (IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) continuation;
            int i = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11110d;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11110d = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 = new IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1(this, (ContinuationImpl) continuation);
            }
        } else {
            identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 = new IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1(this, (ContinuationImpl) continuation);
        }
        Object obj = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11108b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11110d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                C0898b c0898b = this.f11136a;
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11107a = this;
                identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11110d = 1;
                if (c0898b.m5101f(identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = identifyInterceptFileStorageHandler$clearIdentifyIntercepts$1.f11107a;
                AbstractC3193b.m15359b(obj);
            }
            ArrayList arrayListM5097b = this.f11136a.m5097b();
            if (!arrayListM5097b.isEmpty()) {
                for (Object obj2 : arrayListM5097b) {
                    obj2.getClass();
                    this.m5139c((String) obj2);
                }
            }
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null) {
                this.f11137b.mo16257c("Event storage file not found: ".concat(message));
            }
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:45|87|46|(1:48)(1:51)|52|(4:55|(3:96|57|99)(1:98)|97|53)|95|58|93|59|60) */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r15.m5101f(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r15 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0093 -> B:38:0x0096). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5138b(Continuation continuation) throws Throwable {
        IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1;
        C0908a c0908a;
        Iterator it;
        Map map;
        b90 b90Var;
        Object next;
        LinkedHashMap linkedHashMap;
        List listSubList;
        if (continuation instanceof IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1) {
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 = (IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1) continuation;
            int i = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 = new IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 = new IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1(this, (ContinuationImpl) continuation);
        }
        Object objM5157e = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11116f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    this = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a;
                    AbstractC3193b.m15359b(objM5157e);
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    next = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11115e;
                    it = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11114d;
                    map = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11113c;
                    b90Var = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11112b;
                    c0908a = identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a;
                    try {
                        AbstractC3193b.m15359b(objM5157e);
                    } catch (Exception e) {
                        e = e;
                        c0908a.f11137b.mo16257c("Identify Merge error: " + e.getMessage());
                        next.getClass();
                        c0908a.m5139c((String) next);
                        if (!it.hasNext()) {
                            if (b90Var != null) {
                                linkedHashMap.put(IdentifyOperation.SET.getOperationType(), map);
                            }
                            return b90Var;
                        }
                        next = it.next();
                        C0898b c0898b = c0908a.f11136a;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a = c0908a;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11112b = b90Var;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11113c = map;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11114d = it;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11115e = next;
                        identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h = 2;
                        C0913a c0913a = c0898b.f10992d;
                        next.getClass();
                        objM5157e = c0913a.m5157e((String) next, identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1);
                    }
                }
                String str = (String) objM5157e;
                if (str.length() == 0) {
                    next.getClass();
                    c0908a.m5139c((String) next);
                } else {
                    ArrayList arrayListM3226W = b34.m3226W(new JSONArray(str));
                    if (arrayListM3226W.isEmpty()) {
                        listSubList = arrayListM3226W;
                        next.getClass();
                        c0908a.m5139c((String) next);
                    } else {
                        if (b90Var == null) {
                            b90 b90Var2 = (b90) arrayListM3226W.get(0);
                            LinkedHashMap linkedHashMap2 = b90Var2.f8139N;
                            Object obj = linkedHashMap2 != null ? linkedHashMap2.get(IdentifyOperation.SET.getOperationType()) : null;
                            obj.getClass();
                            Map mapM16118d = lda.m16118d(obj);
                            mapM16118d.getClass();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry : mapM16118d.entrySet()) {
                                if (entry.getValue() != null) {
                                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                                }
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                            map = linkedHashMap4;
                            b90Var = b90Var2;
                            listSubList = arrayListM3226W.subList(1, arrayListM3226W.size());
                        }
                        listSubList.getClass();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            LinkedHashMap linkedHashMap6 = ((b90) it2.next()).f8139N;
                            linkedHashMap6.getClass();
                            Object obj2 = linkedHashMap6.get(IdentifyOperation.SET.getOperationType());
                            obj2.getClass();
                            Map mapM16118d2 = lda.m16118d(obj2);
                            mapM16118d2.getClass();
                            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                            for (Map.Entry entry2 : mapM16118d2.entrySet()) {
                                if (entry2.getValue() != null) {
                                    linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            linkedHashMap5.putAll(new LinkedHashMap(linkedHashMap7));
                        }
                        if (map != null) {
                            map.putAll(linkedHashMap5);
                        }
                        next.getClass();
                        c0908a.m5139c((String) next);
                    }
                }
                if (!it.hasNext()) {
                    if (b90Var != null && (linkedHashMap = b90Var.f8139N) != null) {
                        linkedHashMap.put(IdentifyOperation.SET.getOperationType(), map);
                    }
                    return b90Var;
                }
                next = it.next();
                C0898b c0898b2 = c0908a.f11136a;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a = c0908a;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11112b = b90Var;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11113c = map;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11114d = it;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11115e = next;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h = 2;
                C0913a c0913a2 = c0898b2.f10992d;
                next.getClass();
                objM5157e = c0913a2.m5157e((String) next, identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1);
            } else {
                AbstractC3193b.m15359b(objM5157e);
                C0898b c0898b3 = this.f11136a;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a = this;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h = 1;
            }
            ArrayList arrayListM5097b = this.f11136a.m5097b();
            if (!arrayListM5097b.isEmpty()) {
                c0908a = this;
                it = arrayListM5097b.iterator();
                map = null;
                b90Var = null;
                if (!it.hasNext()) {
                    if (b90Var != null) {
                        linkedHashMap.put(IdentifyOperation.SET.getOperationType(), map);
                    }
                    return b90Var;
                }
                next = it.next();
                C0898b c0898b4 = c0908a.f11136a;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11111a = c0908a;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11112b = b90Var;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11113c = map;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11114d = it;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11115e = next;
                identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1.f11118h = 2;
                C0913a c0913a3 = c0898b4.f10992d;
                next.getClass();
                objM5157e = c0913a3.m5157e((String) next, identifyInterceptFileStorageHandler$getTransferIdentifyEvent$1);
            }
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null) {
                this.f11137b.mo16257c("Event storage file not found: ".concat(message));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5139c(String str) {
        AbstractC0903a abstractC0903a = this.f11138c;
        wfb.m23926u(abstractC0903a.f11018c, abstractC0903a.f11021f, null, new IdentifyInterceptFileStorageHandler$removeFile$1(this, str, null), 2);
    }
}
