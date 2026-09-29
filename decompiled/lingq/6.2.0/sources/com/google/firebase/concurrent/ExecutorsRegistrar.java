package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000.cd1;
import p000.ds4;
import p000.ec5;
import p000.gc1;
import p000.h70;
import p000.hc1;
import p000.ho2;
import p000.kfa;
import p000.rp7;
import p000.td0;
import p000.wfb;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final ds4 f13631a = new ds4(new cd1(1));

    /* JADX INFO: renamed from: b */
    public static final ds4 f13632b = new ds4(new cd1(2));

    /* JADX INFO: renamed from: c */
    public static final ds4 f13633c = new ds4(new cd1(3));

    /* JADX INFO: renamed from: d */
    public static final ds4 f13634d = new ds4(new cd1(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        rp7 rp7Var = new rp7(h70.class, ScheduledExecutorService.class);
        rp7[] rp7VarArr = {new rp7(h70.class, ExecutorService.class), new rp7(h70.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rp7Var);
        for (rp7 rp7Var2 : rp7VarArr) {
            wfb.m23913h(rp7Var2, "Null interface");
        }
        Collections.addAll(hashSet, rp7VarArr);
        hc1 hc1Var = new hc1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ho2(3), hashSet3);
        rp7 rp7Var3 = new rp7(td0.class, ScheduledExecutorService.class);
        rp7[] rp7VarArr2 = {new rp7(td0.class, ExecutorService.class), new rp7(td0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rp7Var3);
        for (rp7 rp7Var4 : rp7VarArr2) {
            wfb.m23913h(rp7Var4, "Null interface");
        }
        Collections.addAll(hashSet4, rp7VarArr2);
        hc1 hc1Var2 = new hc1(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ho2(4), hashSet6);
        rp7 rp7Var5 = new rp7(ec5.class, ScheduledExecutorService.class);
        rp7[] rp7VarArr3 = {new rp7(ec5.class, ExecutorService.class), new rp7(ec5.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rp7Var5);
        for (rp7 rp7Var6 : rp7VarArr3) {
            wfb.m23913h(rp7Var6, "Null interface");
        }
        Collections.addAll(hashSet7, rp7VarArr3);
        hc1 hc1Var3 = new hc1(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new ho2(5), hashSet9);
        gc1 gc1VarM13188a = hc1.m13188a(new rp7(kfa.class, Executor.class));
        gc1VarM13188a.f40520f = new ho2(6);
        return Arrays.asList(hc1Var, hc1Var2, hc1Var3, gc1VarM13188a.m12472b());
    }
}
