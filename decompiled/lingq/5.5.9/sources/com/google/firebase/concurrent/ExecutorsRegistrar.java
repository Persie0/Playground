package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import cf.InterfaceC2005b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import ee.InterfaceC5398a;
import ee.InterfaceC5399b;
import ee.InterfaceC5400c;
import ee.InterfaceC5401d;
import ge.C5787k;
import ge.C5788l;
import ge.C5789m;
import ge.ScheduledExecutorServiceC5783g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p003a2.C0009a;
import p118fe.C5511c;
import p118fe.C5517i;
import p118fe.C5523o;
import p118fe.C5525q;
import p118fe.C5527s;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final C5523o<ScheduledExecutorService> f16187a = new C5523o<>(new C5525q(1));

    /* JADX INFO: renamed from: b */
    public static final C5523o<ScheduledExecutorService> f16188b = new C5523o<>(new InterfaceC2005b() { // from class: ge.i
        @Override // cf.InterfaceC2005b
        public final Object get() {
            C5523o<ScheduledExecutorService> c5523o = ExecutorsRegistrar.f16187a;
            return ExecutorsRegistrar.m9147a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC5777a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C5523o<ScheduledExecutorService> f16189c = new C5523o<>(new C5517i(1));

    /* JADX INFO: renamed from: d */
    public static final C5523o<ScheduledExecutorService> f16190d = new C5523o<>(new InterfaceC2005b() { // from class: ge.j
        @Override // cf.InterfaceC2005b
        public final Object get() {
            C5523o<ScheduledExecutorService> c5523o = ExecutorsRegistrar.f16187a;
            return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5777a("Firebase Scheduler", 0, null));
        }
    });

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorServiceC5783g m9147a(ExecutorService executorService) {
        return new ScheduledExecutorServiceC5783g(executorService, f16190d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C5511c<?>> getComponents() {
        C5511c[] c5511cArr = new C5511c[4];
        C5527s c5527s = new C5527s(InterfaceC5398a.class, ScheduledExecutorService.class);
        int i10 = 0;
        C5527s[] c5527sArr = {new C5527s(InterfaceC5398a.class, ExecutorService.class), new C5527s(InterfaceC5398a.class, Executor.class)};
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
        c5511cArr[0] = new C5511c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C5787k(i10), hashSet3);
        C5527s c5527s3 = new C5527s(InterfaceC5399b.class, ScheduledExecutorService.class);
        C5527s[] c5527sArr2 = {new C5527s(InterfaceC5399b.class, ExecutorService.class), new C5527s(InterfaceC5399b.class, Executor.class)};
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
        c5511cArr[1] = new C5511c(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C5788l(i10), hashSet6);
        C5527s c5527s5 = new C5527s(InterfaceC5400c.class, ScheduledExecutorService.class);
        C5527s[] c5527sArr3 = {new C5527s(InterfaceC5400c.class, ExecutorService.class), new C5527s(InterfaceC5400c.class, Executor.class)};
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
        c5511cArr[2] = new C5511c(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0009a(), hashSet9);
        C5527s c5527s7 = new C5527s(InterfaceC5401d.class, Executor.class);
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
        c5511cArr[3] = new C5511c(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new C5789m(i10), hashSet12);
        return Arrays.asList(c5511cArr);
    }
}
