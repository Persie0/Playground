package com.amplitude.core.remoteconfig;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.Storage$Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d58;
import p000.nn1;
import p000.s50;
import p000.u91;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.remoteconfig.RemoteConfigClientImpl$updateConfigs$1", m4291f = "RemoteConfigClient.kt", m4292l = {173, 182}, m4293m = "invokeSuspend")
final class RemoteConfigClientImpl$updateConfigs$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public MapBuilder f11169a;

    /* JADX INFO: renamed from: b */
    public long f11170b;

    /* JADX INFO: renamed from: c */
    public int f11171c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0912a f11172d;

    /* JADX INFO: renamed from: com.amplitude.core.remoteconfig.RemoteConfigClientImpl$updateConfigs$1$1 */
    @c32(m4290c = "com.amplitude.core.remoteconfig.RemoteConfigClientImpl$updateConfigs$1$1", m4291f = "RemoteConfigClient.kt", m4292l = {183, 184}, m4293m = "invokeSuspend")
    final class C09111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f11173a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0912a f11174b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MapBuilder f11175c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f11176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09111(C0912a c0912a, MapBuilder mapBuilder, long j, Continuation continuation) {
            super(2, continuation);
            this.f11174b = c0912a;
            this.f11175c = mapBuilder;
            this.f11176d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C09111(this.f11174b, this.f11175c, this.f11176d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C09111) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r6 == r2) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C0912a c0912a = this.f11174b;
            C0898b c0898b = c0912a.f11183f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f11173a;
            xfa xfaVar = xfa.f68157a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Storage$Constants storage$Constants = Storage$Constants.REMOTE_CONFIG;
                String strValueOf = String.valueOf(vz1.m23632g0(this.f11175c));
                this.f11173a = 1;
                c0898b.m5102g(storage$Constants, strValueOf);
                if (xfaVar != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            c0912a.f11185h.mo16256b("Successfully stored remote configs to storage");
            return xfaVar;
            Storage$Constants storage$Constants2 = Storage$Constants.REMOTE_CONFIG_TIMESTAMP;
            String strValueOf2 = String.valueOf(this.f11176d);
            this.f11173a = 2;
            c0898b.m5102g(storage$Constants2, strValueOf2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClientImpl$updateConfigs$1(C0912a c0912a, Continuation continuation) {
        super(2, continuation);
        this.f11172d = c0912a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfigClientImpl$updateConfigs$1(this.f11172d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigClientImpl$updateConfigs$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[Catch: all -> 0x0017, Exception -> 0x001b, Merged into TryCatch #1 {all -> 0x0017, Exception -> 0x001b, blocks: (B:7:0x0012, B:37:0x0085, B:38:0x008f, B:40:0x0095, B:41:0x00a9, B:50:0x00c3, B:51:0x00c4, B:52:0x00ca, B:54:0x00d0, B:55:0x00df, B:56:0x00e0, B:58:0x00e6, B:15:0x0025, B:26:0x0049, B:29:0x0053, B:30:0x005d, B:32:0x0065, B:33:0x0068, B:18:0x002c, B:20:0x0032, B:23:0x0040), top: B:64:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:42:0x00aa, B:44:0x00b4, B:49:0x00c1), top: B:65:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:42:0x00aa, B:44:0x00b4, B:49:0x00c1), top: B:65:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[Catch: all -> 0x0017, Exception -> 0x001b, LOOP:1: B:52:0x00ca->B:54:0x00d0, LOOP_END, Merged into TryCatch #1 {all -> 0x0017, Exception -> 0x001b, blocks: (B:7:0x0012, B:37:0x0085, B:38:0x008f, B:40:0x0095, B:41:0x00a9, B:50:0x00c3, B:51:0x00c4, B:52:0x00ca, B:54:0x00d0, B:55:0x00df, B:56:0x00e0, B:58:0x00e6, B:15:0x0025, B:26:0x0049, B:29:0x0053, B:30:0x005d, B:32:0x0065, B:33:0x0068, B:18:0x002c, B:20:0x0032, B:23:0x0040), top: B:64:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xfa xfaVar;
        MapBuilder mapBuilder;
        final long j;
        C0912a c0912a;
        Iterator it;
        String str;
        final Map map;
        List list;
        List listM22622n1;
        Iterator it2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11171c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0912a c0912a2 = this.f11172d;
                if (!c0912a2.f11188k) {
                    this.f11171c = 1;
                    obj = C0912a.m5148b(c0912a2, this);
                    if (obj == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                c0912a2.f11185h.mo16256b("RemoteConfig update skipped: fetch already in progress");
                xfaVar = xfa.f68157a;
                this.f11172d.f11188k = false;
                return xfaVar;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.f11170b;
                mapBuilder = this.f11169a;
                AbstractC3193b.m15359b(obj);
            }
            c0912a = this.f11172d;
            it = mapBuilder.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                str = (String) entry.getKey();
                map = (Map) entry.getValue();
                synchronized (c0912a.f11186i) {
                    try {
                        list = (List) c0912a.f11187j.get(str);
                        if (list != null) {
                            listM22622n1 = u91.m22622n1(list);
                        } else {
                            listM22622n1 = null;
                        }
                        if (listM22622n1 == null) {
                            listM22622n1 = EmptyList.f47638a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                it2 = listM22622n1.iterator();
                while (it2.hasNext()) {
                    ((d58) it2.next()).m10109a(new vi3(map, j) { // from class: com.amplitude.core.remoteconfig.RemoteConfigClientImpl$updateConfigs$1$2$1$1

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ Map f11177b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj2) {
                            s50 s50Var = (s50) obj2;
                            s50Var.getClass();
                            s50Var.m21080a(this.f11177b, RemoteConfigClient$Source.REMOTE);
                            return xfa.f68157a;
                        }
                    });
                }
            }
            return xfa.f68157a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C0912a c0912a3 = this.f11172d;
            if (zBooleanValue) {
                c0912a3.f11185h.mo16256b("RemoteConfig update skipped: within 5-minute window");
                xfaVar = xfa.f68157a;
            } else {
                c0912a3.f11188k = true;
                MapBuilder mapBuilderM5147a = C0912a.m5147a(c0912a3);
                if (mapBuilderM5147a != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0912a c0912a4 = this.f11172d;
                    nn1 nn1Var = c0912a4.f11182e;
                    C09111 c09111 = new C09111(c0912a4, mapBuilderM5147a, jCurrentTimeMillis, null);
                    this.f11169a = mapBuilderM5147a;
                    this.f11170b = jCurrentTimeMillis;
                    this.f11171c = 2;
                    if (wfb.m23905G(c09111, nn1Var, this) != coroutineSingletons) {
                        mapBuilder = mapBuilderM5147a;
                        j = jCurrentTimeMillis;
                        c0912a = this.f11172d;
                        it = mapBuilder.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            str = (String) entry2.getKey();
                            map = (Map) entry2.getValue();
                            synchronized (c0912a.f11186i) {
                                list = (List) c0912a.f11187j.get(str);
                                if (list != null) {
                                    listM22622n1 = u91.m22622n1(list);
                                } else {
                                    listM22622n1 = null;
                                }
                                if (listM22622n1 == null) {
                                    listM22622n1 = EmptyList.f47638a;
                                }
                                it2 = listM22622n1.iterator();
                                while (it2.hasNext()) {
                                    ((d58) it2.next()).m10109a(new vi3(map, j) { // from class: com.amplitude.core.remoteconfig.RemoteConfigClientImpl$updateConfigs$1$2$1$1

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ Map f11177b;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // p000.vi3
                                        public final Object invoke(Object obj2) {
                                            s50 s50Var = (s50) obj2;
                                            s50Var.getClass();
                                            s50Var.m21080a(this.f11177b, RemoteConfigClient$Source.REMOTE);
                                            return xfa.f68157a;
                                        }
                                    });
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                }
                xfaVar = xfa.f68157a;
            }
            this.f11172d.f11188k = false;
            return xfaVar;
        } catch (Exception e) {
            this.f11172d.f11185h.mo16255a("Error updating remote configs: " + e.getMessage());
        } finally {
            this.f11172d.f11188k = false;
        }
    }
}
