package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p290o6.C7967l0;
import p338qd.C8527c;
import p338qd.C8530d;
import p338qd.C8533e;
import p338qd.C8536f;
import p338qd.C8539g;
import p338qd.C8542h;
import p338qd.C8544h1;
import p338qd.C8545i;
import p338qd.C8561n0;
import p338qd.InterfaceC8589w1;
import p457wd.C9907h;
import p457wd.C9910k;
import td.C9262j;
import td.C9264l;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3110a implements InterfaceC8589w1 {

    /* JADX INFO: renamed from: g */
    public static final C7967l0 f15888g = new C7967l0("AssetPackServiceImpl");

    /* JADX INFO: renamed from: h */
    public static final Intent f15889h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    public final String f15890a;

    /* JADX INFO: renamed from: b */
    public final C8561n0 f15891b;

    /* JADX INFO: renamed from: c */
    public final C8544h1 f15892c;

    /* JADX INFO: renamed from: d */
    public final C9262j f15893d;

    /* JADX INFO: renamed from: e */
    public final C9262j f15894e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f15895f = new AtomicBoolean();

    public C3110a(Context context, C8561n0 c8561n0, C8544h1 c8544h1) {
        this.f15890a = context.getPackageName();
        this.f15891b = c8561n0;
        this.f15892c = c8544h1;
        boolean zM17625b = C9264l.m17625b(context);
        C7967l0 c7967l0 = f15888g;
        if (zM17625b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            Intent intent = f15889h;
            this.f15893d = new C9262j(applicationContext, c7967l0, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.f15894e = new C9262j(applicationContext2 != null ? applicationContext2 : context, c7967l0, "AssetPackService-keepAlive", intent);
        }
        c7967l0.m15811l("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m8952h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static C9910k m8953i() {
        f15888g.m15812m("onError(%d)", -11);
        AssetPackException assetPackException = new AssetPackException(-11);
        C9910k c9910k = new C9910k();
        synchronized (c9910k.f50543a) {
            if (!(!c9910k.f50545c)) {
                throw new IllegalStateException("Task is already complete");
            }
            c9910k.f50545c = true;
            c9910k.f50547e = assetPackException;
        }
        c9910k.f50544b.m12895c(c9910k);
        return c9910k;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ Bundle m8954k(Map map) {
        Bundle bundleM8952h = m8952h();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleM8952h.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleM8952h;
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: a */
    public final C9910k mo8955a(HashMap map) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            return m8953i();
        }
        f15888g.m15814o("syncPacks", new Object[0]);
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8530d(this, c9907h, map, c9907h), c9907h);
        return c9907h.f50541a;
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: b */
    public final void mo8956b(String str, int i10) {
        m8962j(str, i10, 10);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: c */
    public final C9910k mo8957c(String str, int i10, int i11, String str2) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            return m8953i();
        }
        f15888g.m15814o("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8542h(this, c9907h, i10, str, str2, i11, c9907h), c9907h);
        return c9907h.f50541a;
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: d */
    public final void mo8958d(int i10) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f15888g.m15814o("notifySessionFailed", new Object[0]);
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8539g(this, c9907h, i10, c9907h), c9907h);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: e */
    public final void mo8959e(String str, int i10, int i11, String str2) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f15888g.m15814o("notifyChunkTransferred", new Object[0]);
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8533e(this, c9907h, i10, str, str2, i11, c9907h), c9907h);
    }

    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: f */
    public final void mo8960f(List list) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            return;
        }
        f15888g.m15814o("cancelDownloads(%s)", list);
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8527c(this, c9907h, list, c9907h), c9907h);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p338qd.InterfaceC8589w1
    /* JADX INFO: renamed from: g */
    public final synchronized void mo8961g() {
        try {
            if (this.f15894e == null) {
                f15888g.m15815p("Keep alive connection manager is not initialized.", new Object[0]);
                return;
            }
            C7967l0 c7967l0 = f15888g;
            c7967l0.m15814o("keepAlive", new Object[0]);
            if (!this.f15895f.compareAndSet(false, true)) {
                c7967l0.m15814o("Service is already kept alive.", new Object[0]);
            } else {
                C9907h c9907h = new C9907h();
                this.f15894e.m17620b(new C8545i(this, c9907h, c9907h), c9907h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8962j(String str, int i10, int i11) {
        C9262j c9262j = this.f15893d;
        if (c9262j == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f15888g.m15814o("notifyModuleCompleted", new Object[0]);
        C9907h c9907h = new C9907h();
        c9262j.m17620b(new C8536f(this, c9907h, i10, str, c9907h, i11), c9907h);
    }
}
