package p000;

import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.Plugin$Type;
import com.amplitude.eventbridge.EventChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: lf */
/* JADX INFO: loaded from: classes.dex */
public final class C3296lf implements zf7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49576a;

    /* JADX INFO: renamed from: b */
    public final Plugin$Type f49577b;

    /* JADX INFO: renamed from: c */
    public Object f49578c;

    public C3296lf(int i) {
        this.f49576a = i;
        switch (i) {
            case 1:
                this.f49577b = Plugin$Type.Before;
                break;
            default:
                this.f49577b = Plugin$Type.Before;
                break;
        }
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        ArrayList arrayList;
        pt2 pt2Var;
        switch (this.f49576a) {
            case 0:
                String str = abstractC0903a.f11016a.f10792e;
                Object obj = C3073hf.f42287c;
                C3073hf c3073hfM24728A = xwc.m24728A(str);
                this.f49578c = c3073hfM24728A;
                bl2 bl2Var = c3073hfM24728A.f42290b;
                synchronized (bl2Var.f8655a) {
                    arrayList = new ArrayList();
                    ((ArrayBlockingQueue) bl2Var.f8656b).drainTo(arrayList);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw wq1.m24110f(it);
                }
                return;
            default:
                Object obj2 = pt2.f56779b;
                String str2 = abstractC0903a.f11016a.f10792e;
                str2.getClass();
                synchronized (pt2.f56779b) {
                    try {
                        LinkedHashMap linkedHashMap = pt2.f56780c;
                        Object pt2Var2 = linkedHashMap.get(str2);
                        if (pt2Var2 == null) {
                            pt2Var2 = new pt2();
                            linkedHashMap.put(str2, pt2Var2);
                        }
                        pt2Var = (pt2) pt2Var2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f49578c = pt2Var.f56781a;
                return;
        }
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: b */
    public final b90 mo5143b(b90 b90Var) {
        ot2 ot2Var;
        switch (this.f49576a) {
            case 0:
                LinkedHashMap linkedHashMap = b90Var.f8139N;
                if (linkedHashMap != null && !linkedHashMap.isEmpty() && !fa4.m11650l(b90Var.mo3490a(), "$exposure")) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Map) {
                            try {
                                map.put(str, (Map) value);
                            } catch (ClassCastException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    C3073hf c3073hf = (C3073hf) this.f49578c;
                    if (c3073hf == null) {
                        fa4.m11636J("connector");
                        throw null;
                    }
                    ny8 ny8Var = c3073hf.f42289a;
                    ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) ny8Var.f53414b).readLock();
                    lock.lock();
                    try {
                        hz3 hz3Var = (hz3) ny8Var.f53415c;
                        lock.unlock();
                        String str2 = hz3Var.f43237a;
                        String str3 = hz3Var.f43238b;
                        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y(hz3Var.f43239c);
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str4 = (String) entry2.getKey();
                            Map map2 = (Map) entry2.getValue();
                            int iHashCode = str4.hashCode();
                            if (iHashCode != 1186238) {
                                if (iHashCode != 146417720) {
                                    if (iHashCode == 1142092165 && str4.equals("$unset")) {
                                        Iterator it = map2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            linkedHashMapM15372Y.remove(((Map.Entry) it.next()).getKey());
                                        }
                                    }
                                } else if (str4.equals("$clearAll")) {
                                    linkedHashMapM15372Y.clear();
                                }
                            } else if (str4.equals("$set")) {
                                linkedHashMapM15372Y.putAll(map2);
                            }
                        }
                        ny8Var.m17685M(new hz3(str2, str3, linkedHashMapM15372Y));
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }
                return b90Var;
            default:
                if (b90Var.f8139N != null) {
                    bl2 bl2Var = (bl2) this.f49578c;
                    if (bl2Var == null) {
                        fa4.m11636J("eventBridge");
                        throw null;
                    }
                    EventChannel eventChannel = EventChannel.IDENTIFY;
                    String strMo3490a = b90Var.mo3490a();
                    LinkedHashMap linkedHashMap2 = b90Var.f8138M;
                    Map mapM15371X = linkedHashMap2 != null ? AbstractC3194a.m15371X(linkedHashMap2) : null;
                    LinkedHashMap linkedHashMap3 = b90Var.f8139N;
                    Map mapM15371X2 = linkedHashMap3 != null ? AbstractC3194a.m15371X(linkedHashMap3) : null;
                    LinkedHashMap linkedHashMap4 = b90Var.f8140O;
                    Map mapM15371X3 = linkedHashMap4 != null ? AbstractC3194a.m15371X(linkedHashMap4) : null;
                    LinkedHashMap linkedHashMap5 = b90Var.f8141P;
                    mt2 mt2Var = new mt2(strMo3490a, mapM15371X, mapM15371X2, mapM15371X3, linkedHashMap5 != null ? AbstractC3194a.m15371X(linkedHashMap5) : null);
                    eventChannel.getClass();
                    synchronized (bl2Var.f8655a) {
                        try {
                            LinkedHashMap linkedHashMap6 = (LinkedHashMap) bl2Var.f8656b;
                            Object ot2Var2 = linkedHashMap6.get(eventChannel);
                            if (ot2Var2 == null) {
                                ot2Var2 = new ot2(eventChannel);
                                linkedHashMap6.put(eventChannel, ot2Var2);
                            }
                            ot2Var = (ot2) ot2Var2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    synchronized (ot2Var.f54958a) {
                        ot2Var.f54959b.offer(mt2Var);
                    }
                }
                return b90Var;
        }
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        switch (this.f49576a) {
            case 0:
                break;
        }
        return this.f49577b;
    }
}
