package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p000.AbstractC3122is;
import p000.C3487q7;
import p000.InterfaceC3036gf;
import p000.ec5;
import p000.gc1;
import p000.h70;
import p000.hc1;
import p000.lb2;
import p000.m53;
import p000.q43;
import p000.r43;
import p000.rp7;
import p000.t53;
import p000.td0;
import p000.up1;
import p000.x43;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f13643d = 0;

    /* JADX INFO: renamed from: a */
    public final rp7 f13644a = new rp7(h70.class, ExecutorService.class);

    /* JADX INFO: renamed from: b */
    public final rp7 f13645b = new rp7(td0.class, ExecutorService.class);

    /* JADX INFO: renamed from: c */
    public final rp7 f13646c = new rp7(ec5.class, ExecutorService.class);

    static {
        SessionSubscriber$Name sessionSubscriber$Name = SessionSubscriber$Name.CRASHLYTICS;
        C1165a c1165a = C1165a.f13849a;
        sessionSubscriber$Name.getClass();
        Map map = C1165a.f13850b;
        if (map.containsKey(sessionSubscriber$Name)) {
            Log.d("FirebaseSessions", "Dependency " + sessionSubscriber$Name + " already added.");
            return;
        }
        map.put(sessionSubscriber$Name, new t53(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + sessionSubscriber$Name + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(r43.class);
        gc1VarM13189b.f40515a = "fire-cls";
        gc1VarM13189b.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b.m12471a(lb2.m16059c(x43.class));
        gc1VarM13189b.m12471a(new lb2(this.f13644a, 1, 0));
        gc1VarM13189b.m12471a(new lb2(this.f13645b, 1, 0));
        gc1VarM13189b.m12471a(new lb2(this.f13646c, 1, 0));
        gc1VarM13189b.m12471a(new lb2(0, 2, up1.class));
        gc1VarM13189b.m12471a(new lb2(0, 2, InterfaceC3036gf.class));
        gc1VarM13189b.m12471a(new lb2(0, 2, m53.class));
        gc1VarM13189b.f40520f = new C3487q7(this, 7);
        gc1VarM13189b.m12473c(2);
        return Arrays.asList(gc1VarM13189b.m12472b(), AbstractC3122is.m14099m("fire-cls", "20.0.6"));
    }
}
