package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.ExecutorC3014fu;
import p000.RunnableC3725wk;
import p000.ck6;
import p000.g7b;
import p000.ny8;
import p000.o76;
import p000.tld;
import p000.vg1;
import p000.vxc;
import p000.web;
import p000.wj8;
import p000.wr9;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends Service {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f13730g = new ArrayDeque(10);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f13731a;

    /* JADX INFO: renamed from: b */
    public g7b f13732b;

    /* JADX INFO: renamed from: c */
    public final Object f13733c;

    /* JADX INFO: renamed from: d */
    public int f13734d;

    /* JADX INFO: renamed from: e */
    public int f13735e;

    /* JADX INFO: renamed from: f */
    public wj8 f13736f;

    public FirebaseMessagingService() {
        o76 o76Var = new o76("Firebase-Messaging-Intent-Handle");
        ThreadPriority threadPriority = ThreadPriority.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), o76Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13731a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13733c = new Object();
        this.f13735e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6713a(Intent intent) {
        if (intent != null) {
            vxc.m23590b(intent);
        }
        synchronized (this.f13733c) {
            try {
                int i = this.f13735e - 1;
                this.f13735e = i;
                if (i == 0) {
                    stopSelfResult(this.f13734d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX INFO: renamed from: c */
    public final void m6714c(Intent intent) {
        String stringExtra;
        Bundle extras;
        web webVar;
        ExecutorService executorServiceNewSingleThreadExecutor;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo6716e(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                    }
                    break;
                case 102161:
                    if (stringExtra.equals("gcm")) {
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.m6714c(android.content.Intent):void");
        }

        /* JADX INFO: renamed from: d */
        public void mo6715d(RemoteMessage remoteMessage) {
        }

        /* JADX INFO: renamed from: e */
        public void mo6716e(String str) {
        }

        @Override // android.app.Service
        public final synchronized IBinder onBind(Intent intent) {
            try {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "Service received bind request");
                }
                if (this.f13732b == null) {
                    this.f13732b = new g7b(new ck6(this, 11));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f13732b;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            this.f13731a.shutdown();
            super.onDestroy();
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            synchronized (this.f13733c) {
                this.f13734d = i2;
                this.f13735e++;
            }
            Intent intent2 = (Intent) ((ArrayDeque) ny8.m17672A().f53417e).poll();
            if (intent2 == null) {
                m6713a(intent);
                return 2;
            }
            wr9 wr9Var = new wr9();
            this.f13731a.execute(new RunnableC3725wk(this, intent2, wr9Var, 9));
            tld tldVar = wr9Var.f67208a;
            if (tldVar.mo5970l()) {
                m6713a(intent);
                return 2;
            }
            tldVar.mo5960b(new ExecutorC3014fu(1), new vg1(10, this, intent));
            return 3;
        }
    }
