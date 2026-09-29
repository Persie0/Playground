package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.C0322j;
import com.google.android.play.core.assetpacks.C3111b;
import com.google.android.play.core.assetpacks.C3118i;
import dm.C5212l;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p081e0.C5298b1;
import p082e1.C5352b;
import p152hb.RunnableC5959c1;
import p289o5.RunnableC7933m;
import p290o6.C7967l0;
import p338qd.C8532d1;
import p338qd.C8534e0;
import p338qd.C8538f1;
import p338qd.C8543h0;
import p338qd.C8544h1;
import p338qd.C8550j1;
import p338qd.C8553k1;
import p338qd.C8561n0;
import p338qd.C8565o1;
import p338qd.C8594z;
import p338qd.InterfaceC8589w1;
import p413ud.AbstractC9520c;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3111b extends AbstractC9520c {

    /* JADX INFO: renamed from: g */
    public final C3118i f15896g;

    /* JADX INFO: renamed from: h */
    public final C3117h f15897h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC9268p f15898i;

    /* JADX INFO: renamed from: j */
    public final C8534e0 f15899j;

    /* JADX INFO: renamed from: k */
    public final C8561n0 f15900k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9268p f15901l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC9268p f15902m;

    /* JADX INFO: renamed from: n */
    public final C8544h1 f15903n;

    /* JADX INFO: renamed from: o */
    public final Handler f15904o;

    public C3111b(Context context, C3118i c3118i, C3117h c3117h, InterfaceC9268p interfaceC9268p, C8561n0 c8561n0, C8534e0 c8534e0, InterfaceC9268p interfaceC9268p2, InterfaceC9268p interfaceC9268p3, C8544h1 c8544h1) {
        super(new C7967l0("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f15904o = new Handler(Looper.getMainLooper());
        this.f15896g = c3118i;
        this.f15897h = c3117h;
        this.f15898i = interfaceC9268p;
        this.f15900k = c8561n0;
        this.f15899j = c8534e0;
        this.f15901l = interfaceC9268p2;
        this.f15902m = interfaceC9268p3;
        this.f15903n = c8544h1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p413ud.AbstractC9520c
    /* JADX INFO: renamed from: a */
    public final void mo8963a(Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        C7967l0 c7967l0 = this.f49023a;
        if (bundleExtra == null) {
            c7967l0.m15812m("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            c7967l0.m15812m("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final C8594z c8594zM8942i = AssetPackState.m8942i(bundleExtra, stringArrayList.get(0), this.f15900k, this.f15903n, C5212l.f33280I);
        c7967l0.m15811l("ListenerRegistryBroadcastReceiver.onReceive: %s", c8594zM8942i);
        if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
            this.f15899j.getClass();
        }
        ((Executor) this.f15902m.zza()).execute(new Runnable() { // from class: qd.r
            @Override // java.lang.Runnable
            public final void run() {
                C3111b c3111b = this.f45953a;
                C3118i c3118i = c3111b.f15896g;
                c3118i.getClass();
                if (((Boolean) c3118i.m8991d(new C0322j(c3118i, 6, bundleExtra))).booleanValue()) {
                    c3111b.f15904o.post(new RunnableC7933m(c3111b, 11, c8594zM8942i));
                    ((InterfaceC8589w1) c3111b.f15898i.zza()).mo8961g();
                }
            }
        });
        ((Executor) this.f15901l.zza()).execute(new RunnableC5959c1(this, 6, bundleExtra));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m8964c(Bundle bundle) {
        C5352b c5352bM8992a;
        C3118i c3118i = this.f15896g;
        c3118i.getClass();
        if (!((Boolean) c3118i.m8991d(new C5298b1(c3118i, bundle))).booleanValue()) {
            return;
        }
        C3117h c3117h = this.f15897h;
        InterfaceC9268p interfaceC9268p = c3117h.f15930h;
        C7967l0 c7967l0 = C3117h.f15922k;
        c7967l0.m15811l("Run extractor loop", new Object[0]);
        AtomicBoolean atomicBoolean = c3117h.f15932j;
        if (!atomicBoolean.compareAndSet(false, true)) {
            c7967l0.m15815p("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                c5352bM8992a = c3117h.f15931i.m8992a();
            } catch (zzck e10) {
                c7967l0.m15812m("Error while getting next extraction task: %s", e10.getMessage());
                int i10 = e10.f15973a;
                if (i10 >= 0) {
                    ((InterfaceC8589w1) interfaceC9268p.zza()).mo8958d(i10);
                    c3117h.m8986a(i10, e10);
                }
                c5352bM8992a = null;
            }
            if (c5352bM8992a == null) {
                atomicBoolean.set(false);
                return;
            }
            try {
                if (c5352bM8992a instanceof C8543h0) {
                    c3117h.f15924b.m8985a((C8543h0) c5352bM8992a);
                } else if (c5352bM8992a instanceof C8565o1) {
                    c3117h.f15925c.m9010a((C8565o1) c5352bM8992a);
                } else if (c5352bM8992a instanceof C8532d1) {
                    c3117h.f15926d.m8995a((C8532d1) c5352bM8992a);
                } else if (c5352bM8992a instanceof C8538f1) {
                    c3117h.f15927e.m8996a((C8538f1) c5352bM8992a);
                } else if (c5352bM8992a instanceof C8550j1) {
                    c3117h.f15928f.m8997a((C8550j1) c5352bM8992a);
                } else if (c5352bM8992a instanceof C8553k1) {
                    c3117h.f15929g.m8998a((C8553k1) c5352bM8992a);
                } else {
                    c7967l0.m15812m("Unknown task type: %s", c5352bM8992a.getClass().getName());
                }
            } catch (Exception e11) {
                c7967l0.m15812m("Error during extraction task: %s", e11.getMessage());
                ((InterfaceC8589w1) interfaceC9268p.zza()).mo8958d(c5352bM8992a.f33656a);
                c3117h.m8986a(c5352bM8992a.f33656a, e11);
            }
        }
    }
}
