package com.google.firebase.ktx;

import ae.C0062b;
import androidx.annotation.Keep;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.firebase.components.ComponentRegistrar;
import dm.C5207g;
import ee.InterfaceC5398a;
import ee.InterfaceC5399b;
import ee.InterfaceC5400c;
import ee.InterfaceC5401d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.C5527s;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p200jf.C6474f;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, m13365d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lfe/c;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$a */
    public static final class C3225a<T> implements InterfaceC5514f {

        /* JADX INFO: renamed from: a */
        public static final C3225a<T> f16299a = new C3225a<>();

        @Override // p118fe.InterfaceC5514f
        /* JADX INFO: renamed from: k */
        public final Object mo35k(C5528t c5528t) {
            Object objMo11749b = c5528t.mo11749b(new C5527s<>(InterfaceC5398a.class, Executor.class));
            C5207g.m11110e(objMo11749b, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0062b.m313U0((Executor) objMo11749b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$b */
    public static final class C3226b<T> implements InterfaceC5514f {

        /* JADX INFO: renamed from: a */
        public static final C3226b<T> f16300a = new C3226b<>();

        @Override // p118fe.InterfaceC5514f
        /* JADX INFO: renamed from: k */
        public final Object mo35k(C5528t c5528t) {
            Object objMo11749b = c5528t.mo11749b(new C5527s<>(InterfaceC5400c.class, Executor.class));
            C5207g.m11110e(objMo11749b, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0062b.m313U0((Executor) objMo11749b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$c */
    public static final class C3227c<T> implements InterfaceC5514f {

        /* JADX INFO: renamed from: a */
        public static final C3227c<T> f16301a = new C3227c<>();

        @Override // p118fe.InterfaceC5514f
        /* JADX INFO: renamed from: k */
        public final Object mo35k(C5528t c5528t) {
            Object objMo11749b = c5528t.mo11749b(new C5527s<>(InterfaceC5399b.class, Executor.class));
            C5207g.m11110e(objMo11749b, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0062b.m313U0((Executor) objMo11749b);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$d */
    public static final class C3228d<T> implements InterfaceC5514f {

        /* JADX INFO: renamed from: a */
        public static final C3228d<T> f16302a = new C3228d<>();

        @Override // p118fe.InterfaceC5514f
        /* JADX INFO: renamed from: k */
        public final Object mo35k(C5528t c5528t) {
            Object objMo11749b = c5528t.mo11749b(new C5527s<>(InterfaceC5401d.class, Executor.class));
            C5207g.m11110e(objMo11749b, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0062b.m313U0((Executor) objMo11749b);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5511c<?>> getComponents() {
        C5511c[] c5511cArr = new C5511c[5];
        c5511cArr[0] = C6474f.m13081a("fire-core-ktx", "20.3.2");
        C5527s c5527s = new C5527s(InterfaceC5398a.class, CoroutineDispatcher.class);
        C5527s[] c5527sArr = new C5527s[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c5527s);
        for (C5527s c5527s2 : c5527sArr) {
            if (c5527s2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, c5527sArr);
        C5521m c5521m = new C5521m((C5527s<?>) new C5527s(InterfaceC5398a.class, Executor.class), 1, 0);
        if (!(!hashSet.contains(c5521m.f34182a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(c5521m);
        c5511cArr[1] = new C5511c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, C3225a.f16299a, hashSet3);
        C5527s c5527s3 = new C5527s(InterfaceC5400c.class, CoroutineDispatcher.class);
        C5527s[] c5527sArr2 = new C5527s[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c5527s3);
        for (C5527s c5527s4 : c5527sArr2) {
            if (c5527s4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, c5527sArr2);
        C5521m c5521m2 = new C5521m((C5527s<?>) new C5527s(InterfaceC5400c.class, Executor.class), 1, 0);
        if (!(!hashSet4.contains(c5521m2.f34182a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet5.add(c5521m2);
        c5511cArr[2] = new C5511c(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, C3226b.f16300a, hashSet6);
        C5527s c5527s5 = new C5527s(InterfaceC5399b.class, CoroutineDispatcher.class);
        C5527s[] c5527sArr3 = new C5527s[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c5527s5);
        for (C5527s c5527s6 : c5527sArr3) {
            if (c5527s6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, c5527sArr3);
        C5521m c5521m3 = new C5521m((C5527s<?>) new C5527s(InterfaceC5399b.class, Executor.class), 1, 0);
        if (!(!hashSet7.contains(c5521m3.f34182a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet8.add(c5521m3);
        c5511cArr[3] = new C5511c(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, C3227c.f16301a, hashSet9);
        C5527s c5527s7 = new C5527s(InterfaceC5401d.class, CoroutineDispatcher.class);
        C5527s[] c5527sArr4 = new C5527s[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(c5527s7);
        for (C5527s c5527s8 : c5527sArr4) {
            if (c5527s8 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet10, c5527sArr4);
        C5521m c5521m4 = new C5521m((C5527s<?>) new C5527s(InterfaceC5401d.class, Executor.class), 1, 0);
        if (!(!hashSet10.contains(c5521m4.f34182a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet11.add(c5521m4);
        c5511cArr[4] = new C5511c(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, C3228d.f16302a, hashSet12);
        return C9000b.m17252r(c5511cArr);
    }
}
